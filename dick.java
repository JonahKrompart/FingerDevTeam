import java.util.Arrays;
//Importing from package works from main folder (default package(?)), but not in package?????
import static FingerPackage.PublicFingerMethods.*;

public class dick {
    public static void main(String[] args) {
        //Variations of command line input to use
        String cmd = cmdToString(args);
        char[] ch = cmdToChArr(args);
        int[] ints = cmdToInts(args);
        System.out.println(Arrays.toString(ints));
    }
}
