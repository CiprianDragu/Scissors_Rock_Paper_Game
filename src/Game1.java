import java.util.Scanner;

public class Game1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Player 1 input a character, this must be: P,H,F");
        char player1 = sc.next().charAt(0);
        player1 = Character.toUpperCase(player1);
        System.out.println("Player 2 input a character, this must be: P,H,F");
        char player2 = sc.next().charAt(0);
        player2 = Character.toUpperCase(player2);

        if (player1 != 'P' && player1 != 'F' && player1 != 'H') {
            System.out.println("Invalid Character at Player 1");
        } else if (player2 != 'P' && player2 != 'F' && player2 != 'H') {
            System.out.println("Invalid Character at Player 2");
        } else if (player1 == 'P' && player2 == 'F') {
            System.out.println("Player1 won!  Rock beats scissors ");
        } else if (player1 == 'P' && player2 == 'H') {
            System.out.println("Player 1 won! Rock beats scissors");
        } else if (player1 == 'P' && player2 == 'P') {
            System.out.println("Draw!");
        } else if (player1 == 'F' && player2 == 'P') {
            System.out.println("Player 2 won! Rock beats scissors");
        } else if (player1 == 'F' && player2 == 'H') {
            System.out.println("Player 1 won! Scissors cut the paper");
        } else if (player1 == 'F' && player2 == 'F') {
            System.out.println("Draw!");
        } else if (player1 == 'H' && player2 == 'P') {
            System.out.println("player1 won! paper covers the stone");
        } else if (player1 == 'H' && player2 == 'F') {
            System.out.println("player2 won! Scissors cut the paper");
        } else if (player1 == 'H' && player2 == 'H') {
            System.out.println("Draw!");
        } else {
            System.out.println("Invalid character !");
        }
    }
}
