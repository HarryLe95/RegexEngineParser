import org.junit.Test;
import src.BackEnd.ENonDeterministicAutomata;

import static org.junit.Assert.*;

public class RegexEngine_Test {
    @Test
    public void test1(){
        RegexEngine model = new RegexEngine("(ab)*|c+",false);
        model.parse("abab");
        ENonDeterministicAutomata backEnd = model.backEnd;
        assertTrue(backEnd.isAcceptedState(backEnd.getCurrentState()));
    }

    @Test
    public void test2(){
        RegexEngine model = new RegexEngine("(ab)*|c+",false);
        model.parse("cccc");
        ENonDeterministicAutomata backEnd = model.backEnd;
        assertTrue(backEnd.isAcceptedState(backEnd.getCurrentState()));
    }

    @Test
    public void test3(){
        RegexEngine model = new RegexEngine("(ab)*|c+",false);
        model.parse("ababb");
        ENonDeterministicAutomata backEnd = model.backEnd;
        assertFalse(backEnd.isAcceptedState(backEnd.getCurrentState()));
    }

    @Test
    public void test4(){
        RegexEngine model = new RegexEngine("(ab)*|c+",false);
        model.parse("abcabb");
        ENonDeterministicAutomata backEnd = model.backEnd;
        assertFalse(backEnd.isAcceptedState(backEnd.getCurrentState()));
    }

    @Test()
    public void test5(){
        RegexEngine model = new RegexEngine("(ab)*|c+",false);
        model.parse("abc");
        ENonDeterministicAutomata backEnd = model.backEnd;
        assertFalse(backEnd.isAcceptedState(backEnd.getCurrentState()));
    }

    @Test()
    public void test6(){
        RegexEngine model = new RegexEngine("(ab)*|c+",false);
        model.parse("abcadbb");
        ENonDeterministicAutomata backEnd = model.backEnd;
        assertFalse(backEnd.isAcceptedState(backEnd.getCurrentState()));
    }

    @Test()
    public void test7(){
        RegexEngine model = new RegexEngine("(ab)*|c+",false);
        model.parse("cccaaa");
        ENonDeterministicAutomata backEnd = model.backEnd;
        assertFalse(backEnd.isAcceptedState(backEnd.getCurrentState()));
    }

    @Test()
    public void test8(){
        RegexEngine model = new RegexEngine(" *",false);
        model.parse(" ");
        ENonDeterministicAutomata backEnd = model.backEnd;
        assertTrue(backEnd.isAcceptedState(backEnd.getCurrentState()));
    }

    @Test
    public void test9(){
        RegexEngine model = new RegexEngine(" *",false);
        model.parse("");
        ENonDeterministicAutomata backEnd = model.backEnd;
        assertTrue(backEnd.isAcceptedState(backEnd.getCurrentState()));
    }

    @Test
    public void test10(){
        RegexEngine model = new RegexEngine(" *",false);
        model.parse("   ");
        ENonDeterministicAutomata backEnd = model.backEnd;
        assertTrue(backEnd.isAcceptedState(backEnd.getCurrentState()));
    }
}
