
import java.util.ArrayList;
import java.util.Scanner;

public class  inputs {


        //Multi line input in different lines
        public static void main(String[] args)
        {
            //make an array to take the inputs
            ArrayList<String> multi_inputs = new ArrayList<String>();
            System.out.println("give inputs");
            Scanner scanner = new Scanner(System.in);
            //put a condition
           while(scanner.hasNextLine()){
                String read=scanner.nextLine();

                if(read==null|| read.isEmpty())
                    break;
               multi_inputs.add(read);

            }

            System.out.println(multi_inputs);


           //multiple inputs in single line

            int[] arr=new int[20];
            System.out.println("give inputs");
            Scanner sc= new Scanner(System.in);
            System.out.println("enter the size of the list");
            Scanner sc1=new Scanner(System.in);
            int size=sc1.nextInt();
            System.out.println(size);
            System.out.println("inputs are");
            for(int i=0;i<size;++i){
                arr[i]=sc.nextInt();
                System.out.print(arr[i]+" ");


            }





        }
    }

