package FingerPackage;

import java.util.Arrays;

import static FingerPackage.PublicFingerMethods.*;

public class MainFingerClass{
    public static void main(String[] args) {
        //Variations of command line input to use
        String cmd = cmdToString(args);
        System.out.println(cmd);
        char[] ch = cmdToChArr(args);
        System.out.println(ch);
        int[] ints = cmdToInts(args);
        System.out.println(Arrays.toString(ints));
    }
}
