import java.util.Scanner;

public class DiceJack {
    public static void main(String[] args) {
      
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter three numbers between 1 and 6");

        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        int num3 = scan.nextInt();

        if (num1 < 1 || num2 < 1 || num3 < 1) {
            System.out.println("Numbers can not be less than 1. Shutting down!");
            System.exit(0);
        }

        if (num1 > 6 || num2 > 6 || num3 > 6) {
            System.out.println("Numbers can not be greater than 6. Shutting down!");
            System.exit(0);
        }
        scan.close();
  
        int roll1 =rollDice();
        int roll2 =rollDice();
        int roll3 =rollDice();

        int sumOfNumbers = num1 + num2 + num3;
        int sumOfDicerolls = roll1 + roll2 + roll3;
        System.out.println("Dice sum is = " + sumOfDicerolls + ". Number sum = " + sumOfNumbers);;

        if (checkWin(sumOfDicerolls, sumOfNumbers)) {
            System.out.println("Congrats, you win!");
        } else {
            System.out.println("Sorry, you loose.");
        };
    }

    public static int rollDice () {
        double random =Math.random() * 6;
        random += 1;
        return (int)random;
    }

    public static boolean checkWin(int sumOfDicerolls, int sumOfNumbers) {
        return (sumOfNumbers > sumOfDicerolls && (sumOfNumbers - sumOfDicerolls) < 3);
    }
}
