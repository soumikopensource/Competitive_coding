import java.util.Scanner;

public class start3 {
    public static void main(String_compe[] args) {

        System.out.println("let's learn loops");

        //for loop example: flipkart products

        for (int i = 0; i < 10; ++i) {
            System.out.println(i);
        }

        //while loops basically for condition types

        int j = 11;
        while (j != 11) {
            System.out.println(j);
            j++;
        }


        System.out.println("Let's learn about break and continue");
        // break linear search, continue facebook block friend
        for (int r = 2; r < 9; ++r) {
            if (r == 7)
                break;
            System.out.println(r);
        }
        for (int r = 2; r < 9; ++r) {
            if (r == 5)
                continue;
            System.out.println(r);
        }


        System.out.println("let's learn about type casting");
        //implicit
        byte small_container = 3;
        int big_container = small_container + 6;
        System.out.println(big_container);
        //explicit
        double number = 3.1;
        int newNumber = (int) number + 3;
        System.out.println(number);

        //wrapper class
        String getNumber = "345";
        int result = Integer.parseInt(getNumber) + 5;
        System.out.println(result);

        // Math package
        int percentage_result = (int) (Math.random() * 100);
        System.out.println(percentage_result);
        //Let us build a guessing Game

        System.out.println("Kolkata Bumper Jackpot");

            int number_to_guessed = (int) (Math.random() * 100);
            System.out.println(number_to_guessed);
            int attempt=0;
            while(true){

            Scanner sc = new Scanner(System.in);
            System.out.println("Hey! enter your guess between 1 to 100");
            int guess = sc.nextInt();
            attempt+=1;
            //guess=Math.abs(guess);
            if (guess > 100) {
                System.out.println("you entered greater than 100, try again");
            }
            else if(guess==number_to_guessed){
                System.out.println("Bravo! you won the Jackpot!!!!! at attempt "+attempt);
                break;
            }
            else if(guess<number_to_guessed){

                System.out.println("Guess higher");
            }
            else if(guess>number_to_guessed){
                System.out.println("Guess Lower");
            }
                System.out.println("Want to exit type yes otherwise type no ");
            sc.nextLine();
            String Response=sc.nextLine();
            if(Response.equals("yes")){
                break;
            }
            else{
                continue;
            }





        }
    }
}