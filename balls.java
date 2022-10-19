import java.util.ArrayList;

public class balls {
    public static String cmdToString(String[] args){
        return String.join(" ", args);
    }
    //char[]
    public static char[] cmdToChArr(String[] args){
        return cmdToString(args).toCharArray();
    }
    //int[] from input string[]
    public static int[] cmdToInts(String[] args){
        String cmd = String.join(" ", args);
        ArrayList<Integer> i1 = new ArrayList<>();
        char[] ch = cmd.toCharArray();
        int num=0;
        for(char c : ch){
            try{
                num = Integer.parseInt(String.valueOf(c));
            }catch (Exception e){
                continue;
            }
            i1.add(num);
        }

        return i1.stream().mapToInt(i->i).toArray();
    }

    public static void main(String[] args) {

    }
}
