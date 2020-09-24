import java.util.Date;
import java.util.Scanner;

public class start2 {

    public static void main(String_compe[] args){
        //variables
        int age=12;
        //compile time mem initialization

        //objects runtime mem initialization
        Date now= new Date();

        //constants
        final int AGE_FINAL=34; // cannot change them



        //user input
        System.out.println("enter weight");
        Scanner sc=new Scanner(System.in);
        byte weight=sc.nextByte();
        System.out.println("my weight is "+weight);

        String name=sc.nextLine();
        System.out.println("my name is "+name);

/*
        byte age4=sc.nextByte();
        //problem in java
        sc.nextLine();
        String name3=sc.nextLine();

*/
        // operators in java

        //pta h sayyad he! he! he!



        //post increment and pre increment



        // if-else

        String passwd="1234";
        System.out.println("enter password");
        String pass=sc.nextLine();
        if(pass.equals(passwd)){
            System.out.println(" login successful");
        }
        else{
            System.out.println("invalid password");
        }


        System.out.println("how may I help you"+
                "1. Login"+
                "Enter"+
                "Exit");
        int userinput=sc.nextInt();
        switch (userinput){
            case 1:
                System.out.println("Login");
                break;
            case 2:
                System.out.println("Enter");
                break;
            case 3:
                System.out.println("Exit");
                break;
            default:
                System.out.println("kuch nhi  bhaag");



        }









    }
}
