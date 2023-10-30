import java.util.Scanner;

public class ticTacToe {


  public static String player = "X";
  public static int amountOfTurns = 0;
  static boolean gameOver = false;
  public static Scanner s = new Scanner(System.in);

  public static String[][] gameBoard = {
    {
      "1","2","3"
    },
    {
      "4","5","6"
    },
    {
      "7","8","9"
    }


  };

  public static void main(String[] args){

    initializeGame();
    board();
    choosingSpot();


  }



  public static void board() {

    System.out.println("Here is the current status of the board\n");

    System.out.println("  " +  gameBoard[0][0] + "  |  " + gameBoard[0][1] + "  |  " + gameBoard[0][2] + "  ");
    System.out.println("-----------------");
    System.out.println("  " +  gameBoard[1][0] + "  |  " + gameBoard[1][1] + "  |  " + gameBoard[1][2] + "  ");
    System.out.println("-----------------");
    System.out.println("  " +  gameBoard[2][0] + "  |  " + gameBoard[2][1] + "  |  " + gameBoard[2][2] + "  ");


  }

  public static void checkForWinner() {
    //we have to figure out how to finish the game

    if (amountOfTurns == 9){
      System.out.println("It's a draw!");
      gameOver = true;
      newGame();
    }

    if (
      (gameBoard[0][0].equals("X") && gameBoard[0][1].equals("X") && gameBoard[0][2].equals("X")) ||
        (gameBoard[1][0].equals("X") && gameBoard[1][1].equals("X") && gameBoard[1][2].equals("X")) ||
        (gameBoard[2][0].equals("X") && gameBoard[2][1].equals("X") && gameBoard[2][2].equals("X")) ||
        (gameBoard[0][0].equals("X") && gameBoard[1][0].equals("X") && gameBoard[2][0].equals("X")) ||
        (gameBoard[0][1].equals("X") && gameBoard[1][1].equals("X") && gameBoard[2][1].equals("X")) ||
        (gameBoard[0][2].equals("X") && gameBoard[1][2].equals("X") && gameBoard[2][2].equals("X")) ||
        (gameBoard[0][0].equals("X") && gameBoard[1][1].equals("X") && gameBoard[2][2].equals("X")) ||
        (gameBoard[0][2].equals("X") && gameBoard[1][1].equals("X") && gameBoard[2][0].equals("X"))

    )
    {

      System.out.println("Player X is the winner of this game!\nThanks for playing!");
      gameOver = true;
      newGame();
    }

    if (
      (gameBoard[0][0].equals("O") && gameBoard[0][1].equals("O") && gameBoard[0][2].equals("O")) ||
        (gameBoard[1][0].equals("O") && gameBoard[1][1].equals("O") && gameBoard[1][2].equals("O")) ||
        (gameBoard[2][0].equals("O") && gameBoard[2][1].equals("O") && gameBoard[2][2].equals("O")) ||
        (gameBoard[0][0].equals("O") && gameBoard[1][0].equals("O") && gameBoard[2][0].equals("O")) ||
        (gameBoard[0][1].equals("O") && gameBoard[1][1].equals("O") && gameBoard[2][1].equals("O")) ||
        (gameBoard[0][2].equals("O") && gameBoard[1][2].equals("O") && gameBoard[2][2].equals("O")) ||
        (gameBoard[0][0].equals("O") && gameBoard[1][1].equals("O") && gameBoard[2][2].equals("O")) ||
        (gameBoard[0][2].equals("O") && gameBoard[1][1].equals("O") && gameBoard[2][0].equals("O"))
    )
    {

      System.out.println("Player O is the winner of this game!\nThanks for playing!");
      gameOver = true;
      newGame();


    }
  }

  public static void initializeGame() {
    System.out.println("Hello, welcome to my tic tac toe game that I just created! The numbers on the board represent the spots that are not take yet\n");
    System.out.println("We will have player X go first\n");
  }

  public static void choosingSpot() {
    //Ask the user to input where they want to put the X/O

    while (!gameOver) {

      if (player.equals("X")) {
        System.out.println("Please choose the number of the spot you want to place your X");
        //Take input
        String input = s.nextLine();
        //Put the input into the gameBoard
        if (input.equals("1") && (gameBoard[0][0] != "X" && gameBoard[0][0] != "O")) {

          gameBoard[0][0] = "X";
          player = "O";
          amountOfTurns++;

        } else if (input.equals("2") && (gameBoard[0][1] != "X" && gameBoard[0][1] != "O")) {

          gameBoard[0][1] = "X";
          player = "O";
          amountOfTurns++;

        } else if (input.equals("3") && (gameBoard[0][2] != "X" && gameBoard[0][2] != "O")) {

          gameBoard[0][2] = "X";
          player = "O";
          amountOfTurns++;

        } else if (input.equals("4") && (gameBoard[1][0] != "X" && gameBoard[1][0] != "O")) {

          gameBoard[1][0] = "X";
          player = "O";
          amountOfTurns++;

        } else if (input.equals("5") && (gameBoard[1][1] != "X" && gameBoard[1][1] != "O")) {

          gameBoard[1][1] = "X";
          player = "O";
          amountOfTurns++;

        } else if (input.equals("6") && (gameBoard[1][2] != "X" && gameBoard[1][2] != "O")) {

          gameBoard[1][2] = "X";
          player = "O";
          amountOfTurns++;

        } else if (input.equals("7") && (gameBoard[2][0] != "X" && gameBoard[2][0] != "O")) {

          gameBoard[2][0] = "X";
          player = "O";
          amountOfTurns++;

        } else if (input.equals("8") && (gameBoard[2][1] != "X" && gameBoard[2][1] != "O")) {

          gameBoard[2][1] = "X";
          player = "O";
          amountOfTurns++;

        } else if (input.equals("9") && (gameBoard[2][2] != "X" && gameBoard[2][2] != "O")) {

          gameBoard[2][2] = "X";
          player = "O";
          amountOfTurns++;

        } else {
          System.out.println("Invalid move please try again!");
        }

        ///return new board
        board();
        //check for winner
        checkForWinner();
      }

      if (player.equals("O")) {
        System.out.println("Please choose the number of the spot you want to place your O");
        //Take input
        String input = s.nextLine();
        //Put the input into the gameBoard
        if (input.equals("1") && (gameBoard[0][0] != "X" && gameBoard[0][0] != "O")) {

          gameBoard[0][0] = "O";
          player = "X";
          amountOfTurns++;

        } else if (input.equals("2") && (gameBoard[0][1] != "X" && gameBoard[0][1] != "O")) {

          gameBoard[0][1] = "O";
          player = "X";
          amountOfTurns++;

        } else if (input.equals("3") && (gameBoard[0][2] != "X" && gameBoard[0][2] != "O")) {

          gameBoard[0][2] = "O";
          player = "X";
          amountOfTurns++;

        } else if (input.equals("4") && (gameBoard[1][0] != "X" && gameBoard[1][0] != "O")) {

          gameBoard[1][0] = "O";
          player = "X";
          amountOfTurns++;

        } else if (input.equals("5") && (gameBoard[1][1] != "X" && gameBoard[1][1] != "O")) {

          gameBoard[1][1] = "O";
          player = "X";
          amountOfTurns++;

        } else if (input.equals("6") && (gameBoard[1][2] != "X" && gameBoard[1][2] != "O")) {

          gameBoard[1][2] = "O";
          player = "X";
          amountOfTurns++;

        } else if (input.equals("7") && (gameBoard[2][0] != "X" && gameBoard[2][0] != "O")) {

          gameBoard[2][0] = "O";
          player = "X";
          amountOfTurns++;

        } else if (input.equals("8") && (gameBoard[2][1] != "X" && gameBoard[2][1] != "O")) {

          gameBoard[2][1] = "O";
          player = "X";
          amountOfTurns++;

        } else if (input.equals("9") && (gameBoard[2][2] != "X" && gameBoard[2][2] != "O")) {

          gameBoard[2][2] = "O";
          player = "X";
          amountOfTurns++;

        } else {
          System.out.println("Invalid move please try again!");
        }

        ///return new board
        board();
        //check for winner
        checkForWinner();
      }
    }
  }

  public static void newGame() {
    System.out.println("Do you want to play a new game? (y/n)");
    String newGame = s.nextLine();

    if (newGame.equalsIgnoreCase("Y")){
      resetBoard();
    } else {
      System.out.println("Thanks for being apart of this, have a great day!");
      System.exit(0);
    }
  }

  public static void resetBoard() {
    gameBoard = new String[][] {
      {
        "1","2","3"
      },
      {
        "4","5","6"
      },
      {
        "7","8","9"
      }
    };
    amountOfTurns = 0;
    gameOver = false;
    player = "X";
    initializeGame();
    board();
    choosingSpot();


  }



}



