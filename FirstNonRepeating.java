import java.util.Arrays;

public class FirstNonRepeating {



    //But It requires two traversal
    // Time complexity=o(n)
    static char non_repeat(char s[]){
        int[] count=new int[256];
        //temp array
        char[] temp=new char[30];
        Arrays.fill(count,-1);
        for(int i=0;i<s.length;++i){
            count[s[i]]++;


        }
        for(int i=0;i< s.length;++i){
            if(count[s[i]]==0){
                System.out.println(s[i]);
                break;

            }
        }
        return '\0';

    }

    public static void main(String[] args) {

        String s="google";
        char[] arr=s.toCharArray();
        non_repeat(arr);
        //answer should be 'l'
    }





}
