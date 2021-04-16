import java.util.Scanner;
import java.util.Random;

//rock paper scissors 
public class RPSgame {

    public static void main(String[] args) {

        try {
            Scanner scan = new Scanner(System.in);

            if (scan.hasNext()) {

                String userInput = flexibleInput(scan.next());
                scan.close();

                if (isValid(userInput)) {
                    game(userInput);

                } else {
                    displayInputs();
                }
            } else {
                displayInputs();
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public static void displayInputs() {

        print("Invalid player input!\nWrite rock, paper or scissors!");
    }
   
    public static String flexibleInput(String input) {

        String output = input;

        switch (input.toLowerCase()) {

            case "r":
                output = "rock";
                break;

            case "p":
                output = "paper";
                break;

            case "s":
                output = "scissors";
                break;

            case "scissor":
                output = "scissors";
                break;
        }

        return output;
    }
    public static void print(String text) {

        System.out.println(text);
    }
    
    public static String computerResults() {

        String types[] = { "rock", "paper", "scissors" };

        Random rand = new Random();
        int compChoice = rand.nextInt(3);

        return types[compChoice];
    }

    public static boolean checkResult(String player, String computer) {

        if ((!isValid(player)) || (!isValid(computer))) {
            return false;
        }

        String rock = "rock", paper = "paper", scissors = "scissors";

        if ((player.equalsIgnoreCase(rock)) && (computer.equalsIgnoreCase(scissors))) {
            return true;
        }

        if ((player.equalsIgnoreCase(scissors)) && (computer.equalsIgnoreCase(paper))) {
            return true;
        }

        if ((player.equalsIgnoreCase(paper)) && (computer.equalsIgnoreCase(rock))) {
            return true;
        }

        return false;
    }

    public static boolean isValid(String input) {

        switch (input.toLowerCase()) {

            case "rock":
                return true;

            case "paper":
                return true;

            case "scissors":
                return true;

            default:
                return false;
        }
    }
    
    public static void game(String player) {
        String computer = computerResults();

        print(player + " vs " + computer + "\n");

        if (player.equalsIgnoreCase(computer)) {
            print("Stalemate! No winners.");
        } else {

            if (checkResult(player, computer)) {
                print("You won against the computer!");
            } else {
                print("You lost against the computer!");
            }
        }
    }
    
}
