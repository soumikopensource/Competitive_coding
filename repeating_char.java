import java.util.HashSet;
import java.util.Iterator;

public class repeating_char {

    static char first_repeating(char[] s){

        //create an empty Hashset
        HashSet<Character> h=new HashSet<>();
        for(int i=0;i<s.length;++i){
            char c=s[i];
            if(h.contains(c)){

                return c;
            }
            else {
                h.add(c);
            }
        }
        Iterator<Character> m=h.iterator();
        while (m.hasNext()){
            System.out.println(m.next());
    }
    return '\0';

    }

    public static void main(String[] args) {
        String s="geeksforgeeks";
        char[] arr=s.toCharArray();
        System.out.println(first_repeating(arr));
    }


}
