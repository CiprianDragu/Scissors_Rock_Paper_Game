import java.util.Scanner;

public class Game2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Player 1 input a character, this must be: P,H,F");
        char p1 = sc.next().charAt(0);
        p1 = Character.toUpperCase(p1);
        System.out.println("Player 2 input a character, this must be: P,H,F");
        char p2 = sc.next().charAt(0);
        p2 = Character.toUpperCase(p2);

        if (p1 == 'P') {
            if (p2 == 'P') {
                System.out.println("Draw");
            } else if (p2 == 'F') {
                System.out.println("Player 2 won! Scissors cut paper");
            } else if (p2 == 'H') {
                System.out.println("Player 1 won! Paper covers rock");
            } else {
                System.out.println("Invalid Character at player 2");
            }
        } else if (p1 == 'F') {
            if (p2 == 'F') {
                System.out.println("Draw");
            } else if (p2 == 'P') {
                System.out.println("Player 1 won! Scissors cut paper");
            } else if (p2 == 'H') {
                System.out.println("Player 2 won! Rock beats scissors");
            } else {
                System.out.println("Invalid Character at player 2");
            }
        } else if (p1 == 'H') {
            if (p2 == 'H') {
                System.out.println("Draw");
            } else if (p2 == 'F') {
                System.out.println("Player 1 won! Rock beats scissors");
            } else if (p2 == 'P') {
                System.out.println("Player 2 won! Paper covers rock");
            } else {
                System.out.println("Invalid Character at player 2");
            }
        } else {
            System.out.println("Invalid Character at player 1");
        }
    }
}
