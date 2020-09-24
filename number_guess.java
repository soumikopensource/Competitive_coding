import java.util.Scanner;

public class number_guess {
    public static void main(String_compe[] args) {
        System.out.println("Kolkata Bumper Jackpot");

        int number_to_guessed = (int) (Math.random() * 100);
        //This line you can comment when you give it to user This is for admin to check
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
