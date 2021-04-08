import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;

public class tests {

    @Test
    @DisplayName("zukurz")
    void tcheckLength1(){
        //System.out.println("lengtht1-zukurz");
        boolean t = pwdchecks.checkLength("asdfgh7");
        assertFalse(t);
    }

    @Test
    @DisplayName("zulang")
    void tcheckLength2(){
        //System.out.println("lengtht2-zulang");
        boolean t = pwdchecks.checkLength("abcdefghijklmnopqrstuvwx26");
        assertFalse(t);
    }

    @Test
    @DisplayName("minerfüllt")
    void tcheckLength3(){
        //System.out.println("length3-minerfüllt");
        boolean t = pwdchecks.checkLength("passwort");
        assertTrue(t);
    }

    @Test
    @DisplayName("null")
    void tcheckLength4(){
        boolean t = pwdchecks.checkLength(null);
        assertFalse(t);
    }

    @Test
    @DisplayName("onlysmall")
    void tcheckSmallBig1(){
        //System.out.println("smallbig1-onlysmall");
        boolean t = pwdchecks.checkSmallBig("a");
        assertFalse(t);
    }

    @Test
    @DisplayName("onlybig")
    void tcheckSmallBig2(){
        //System.out.println("smallbig2-onlybig");
        boolean t = pwdchecks.checkSmallBig("Z");
        assertFalse(t);
    }

    @Test
    @DisplayName("BIGperfect")
    void tcheckSmallBig3(){
        //System.out.println("smallbig3-BIGperfect");
        boolean t = pwdchecks.checkSmallBig("Az");
        assertTrue(t);
    }

    @Test
    @DisplayName("1number")
    void tcheckForNumbers1(){
        boolean t = pwdchecks.checkForNumbers("1");
        assertFalse(t);
    }

    @Test
    @DisplayName("2numbers")
    void tcheckForNumbers2(){
        boolean t = pwdchecks.checkForNumbers("12");
        assertTrue(t);
    }

    //min1: ()#?!%/@
    @Test
    @DisplayName("sonderzeichnfehlt")
    void tcheckMustContain1(){
        boolean t = pwdchecks.checkMustContain("asdf");
        assertFalse(t);
    }

    @Test
    @DisplayName("sonderzeichenenthaltn")
    void tcheckMustContain2(){
        boolean t = pwdchecks.checkMustContain("(");
        assertTrue(t);
    }

    @Test
    @DisplayName("12")
    void tcheckN1231(){
        boolean t = pwdchecks.checkN123("12");
        assertTrue(t);
    }

    @Test
    @DisplayName("123")
    void tcheckN1232(){
        boolean t = pwdchecks.checkN123("123");
        assertFalse(t);
    }

    @Test
    @DisplayName("111")
    void tcheckN11111(){
        boolean t = pwdchecks.checkN1111("111");
        assertTrue(t);
    }

    @Test
    @DisplayName("1111")
    void tcheckN11112(){
        boolean t = pwdchecks.checkN1111("1111");
        assertFalse(t);
    }

    //bigstyle?!?
}
