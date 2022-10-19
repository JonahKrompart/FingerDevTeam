package FingerPackage;
import java.util.Arrays;
import static FingerPackage.PublicFingerMethods.*;

public class MainFingerClass{
    public static void main(String[] args) {
        //Variations of command line input to use
        String[] arg = {"ldfj3239j ", " 32i  ii23 oi23i 4", "3ipj2 92-"};
        String cmd = cmdToString(arg);
        char[] ch = cmdToChArr(arg);
        int[] ints = cmdToInts(arg);
        System.out.println(Arrays.toString(ints));
    }
}
