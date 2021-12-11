import java.util.Scanner;

public class assingment {

            public static void main(String[] args) {
                String compchoice = "";
                String mechoice = "";

                // Determine the rock , paper and scissor and chosing (Score table).
                int myscore=0;
                int computerscore=0;
                System.out.println("Press 0 for chose rock");
                System.out.println("Press 1 for chose paper");
                System.out.println("Press 2 for chose scissor");
                Scanner scan = new Scanner(System.in);
                while (true) {
                    System.out.print("-Computer's Score= " + computerscore + "              ");
                    System.out.println("-Your Score= " + myscore);
                    System.out.print("Enter your pick: ");
                    int computerschoice = (int) (Math.random() * 3);
                    int mychoice = scan.nextInt();
                    if (mychoice < 0 || mychoice > 2)
                        System.out.println("You entered invalid data. If you want to play You need to rerun game.");
                    if (mychoice < 0 || mychoice > 2)
                        break;

                    switch (mychoice) {
                        case 0:
                            mechoice = "Rock";
                            break;
                        case 1:
                            mechoice = "Paper";
                            break;
                        case 2:
                            mechoice = "Scissor";
                    }
                    switch (computerschoice) {
                        case 0:
                            compchoice = "Rock";
                            break;
                        case 1:
                            compchoice = "Paper";
                            break;
                        case 2:
                            compchoice = "Scissor";
                    }
                    //Printing the choices
                    System.out.println("You chose " + mechoice);
                    System.out.println("Computer chose " + compchoice);
                    //Checking Results
                    if (compchoice.equals("Rock"))
                        if (mechoice.equals("Rock"))
                            System.out.println("We both chose Rock. Draw!");
                        else if (mechoice.equals("Paper"))
                            System.out.println("You Won!");
                        else
                            System.out.println("You Lost!");

                    if (compchoice.equals("Paper"))
                        if (mechoice.equals("Rock"))
                            System.out.println("You Lost!");
                        else if (mechoice.equals("Paper"))
                            System.out.println("We both chose Paper. Draw!");
                        else
                            System.out.println("You Won!");

                    if (compchoice.equals("Scissor"))
                        if (mechoice.equals("Rock"))
                            System.out.println("You Won!");
                        else if (mechoice.equals("Paper"))
                            System.out.println("You Lost!");
                        else
                            System.out.println("We both chose Scissor. Draw!");
                    if (compchoice.equals("Rock")&&mechoice.equals("Scissor"))
                        computerscore++;
                    if (compchoice.equals("Rock")&&mechoice.equals("Paper"))
                        myscore++;
                    if (compchoice.equals("Paper")&&mechoice.equals("Scissor"))
                        myscore++;
                    if (compchoice.equals("Paper")&&mechoice.equals("Rock"))
                        computerscore++;
                    if (compchoice.equals("Scissor")&&mechoice.equals("Rock"))
                        myscore++;
                    if (compchoice.equals("Scissor")&&mechoice.equals("Paper"))
                        computerscore++;
                    if (myscore==5)
                        System.out.println("You won the game. You reached 5 first. Game Over!");
                    if (computerscore==5)
                        System.out.println("You lost the game. Computers reached 5 first. Game Over!");
                    if(myscore==5||computerscore==5)
                        break;

                }
            }
        }



