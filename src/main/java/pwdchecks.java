import org.jetbrains.annotations.NotNull;

public class pwdchecks {
    //private boolean test;

    /*public static void main(String[] args) {
    }*/

    /*public boolean checkPassword(String pwd){
        return true;//bigstyle?!?
    }*/

    //prob not null
    //@NotNull
    public static boolean checkLength(String pwd){  //try String p, jff
        if(pwd != null)
            return pwd.matches(".{8,25}");
        else return false;
        /*if(8 <= pwd.length() && pwd.length() <= 25)
            return true;
        else return false;*/
    }

    //klein&groß
    public static boolean checkSmallBig(String pwd){

        //matcher //matches
        //if ascii //ascii: großbuchstabn(65-90) ; kleinbuchstabn(97-12)

        //auftrennen: [a-z][A-Z]
        //&& pwd.matches("[A-Z]+");
        return pwd.matches(".*[a-z]+.*")  && pwd.matches(".*[A-Z]+.*");

        //miss:
        //return pwd.contains("a-zA-Z");
        //if (pwd.matches("[a-zA-Z]+"));
        //    return true;
    }

    //zahlen
    public static boolean checkForNumbers(String pwd){
        return pwd.matches(".*[0-9]+[0-9]+.*"); //[wh0-n]*=>+[wh1-n]
    }

    //min1: ()#?!%/@
    public static boolean checkMustContain(String pwd){
        return pwd.matches(".*[()#$?!%/@]+.*");
    }

    //-----------------------------erweiterungen:

    // !123
    public static boolean checkN123(String pwd){
        return !pwd.matches(".*(012|123|234|345|456|567|678|789|890)+.*");
    }

    // !1111
    public static boolean checkN1111(String pwd) {
        return !pwd.matches(".*(0000|1111|2222|3333|4444|5555|6666|7777|8888|9999)+.*");
    }
}
