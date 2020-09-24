
//To get all permutations of  a string

//import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Lexistring {

    public static Set<String> permu(String str){
        //create a set to avoid duplicate permutation
        Set<String> permutations=new HashSet<String>();
        //checking it's null or not
        if(str==null){
            return null;
        }
        //boundary condition and stopping the recursion
        else if(str.length()==0){
            permutations.add("");
            return permutations;
        }
        //let's grab the first character
        char first=str.charAt(0);
        //remaining substring
        String rest=str.substring(1);
        //recursive call
        Set<String> words=permu(rest);
        //System.out.println(Arrays.toString(words));
        //now the main task insert permutation to the set
        for( String str_New: words){
            for(int i=0;i<=str_New.length();++i){
                permutations.add(str_New.substring(0,i)+first+str_New.substring(i));
            }
        }

        return permutations;



    }

    public static void main(String[] args) {

        // create an object of scanner class
        Scanner input = new Scanner(System.in);

        // take input from users
        System.out.print("Enter the string: ");
        String data = input.nextLine();
        System.out.println("Permutations of " + data + ": \n"+ permu(data));

    }


}
