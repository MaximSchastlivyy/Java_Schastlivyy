package lesson3;

import java.util.Random;
import java.util.Scanner;

public class Homework3 {

    public static char[][] pole;
    public static int sizePoX;
    public static int sizePoY;

    public static char humanChar = 'X';
    public static char aiChar = 'O';
    public static char emptyChar = '*';

    public static Scanner scanner = new Scanner(System.in);
    public static Random random = new Random();

    public static void createPole() {
        sizePoX = 5;
        sizePoY = 5;
        pole = new char[sizePoY][sizePoX];

        for (int y = 0; y < sizePoY; y++) {
            for (int x = 0; x < sizePoX; x++) {
                pole[y][x] = emptyChar;
            }
        }
    }

    public static void printPole() {
        for (int y = 0; y < sizePoY; y++) {
            for (int x = 0; x < sizePoX; x++) {
                System.out.print(pole[y][x] + " | ");
            }
            System.out.println();
        }
        System.out.println("_____________");
        System.out.println();
    }

    public static void humanTurn() {
        int x;
        int y;

        do {
            System.out.println("Введите координаты:");
            x = scanner.nextInt() - 1;
            y = scanner.nextInt() - 1;
        } while (!isValid(y, x) || !isEmpty(y, x));

        pole[y][x] = humanChar;

    }

    public static void aiTurn() {
        int x;
        int y;

        do {
            x = random.nextInt(sizePoX);
            y = random.nextInt(sizePoY);
        } while (!isEmpty(y, x));

        pole[y][x] = aiChar;
    }

    public static boolean isValid(int y, int x) {
        return x >= 0 && x < sizePoX && y >= 0 && y < sizePoY;
    }

    public static boolean isEmpty(int y, int x) {
        return pole[y][x] == emptyChar;
    }

    public static boolean checkWin(char PlayerChar) {
        for (int y = 0; y < 4; y++) {
            if ((pole[y][0] == PlayerChar && pole[y][1] == PlayerChar && pole[y][2] == PlayerChar && pole[y][3] == PlayerChar) ||
                    (pole[0][y] == PlayerChar && pole[1][y] == PlayerChar && pole[2][y] == PlayerChar && pole[3][y] == PlayerChar) ||
                        (pole[y][1] == PlayerChar && pole[y][2] == PlayerChar && pole[y][3] == PlayerChar && pole[y][4] == PlayerChar) ||
                            (pole[1][y] == PlayerChar && pole[2][y] == PlayerChar && pole[3][y] == PlayerChar && pole[4][y] == PlayerChar))
                return true;
            if ((pole[0][0] == PlayerChar && pole[1][1] == PlayerChar && pole[2][2] == PlayerChar && pole[3][3] == PlayerChar) ||
                    (pole[1][1] == PlayerChar && pole[2][2] == PlayerChar && pole[3][3] == PlayerChar && pole[4][4] == PlayerChar) ||
                        (pole[4][0] == PlayerChar && pole[3][1] == PlayerChar && pole[2][2] == PlayerChar && pole[1][3] == PlayerChar) ||
                            (pole[0][4] == PlayerChar && pole[1][3] == PlayerChar && pole[2][2] == PlayerChar && pole[3][1] == PlayerChar) ||
                                (pole[3][0] == PlayerChar && pole[2][1] == PlayerChar && pole[1][2] == PlayerChar && pole[0][3] == PlayerChar) ||
                                    (pole[4][1] == PlayerChar && pole[3][2] == PlayerChar && pole[2][2] == PlayerChar && pole[1][4] == PlayerChar) ||
                                        (pole[0][1] == PlayerChar && pole[1][2] == PlayerChar && pole[2][3] == PlayerChar && pole[3][4] == PlayerChar) ||
                                             (pole[1][0] == PlayerChar && pole[2][1] == PlayerChar && pole[3][2] == PlayerChar && pole[4][3] == PlayerChar))
                return true;
        }
            return false;

    }

    public static boolean isPoleFull() {
        for (int y = 0; y < sizePoY; y++) {
            for (int x = 0; x < sizePoX; x++) {
                if (pole[y][x] == emptyChar) {
                    return false;
                }
            }
        }
        return true;
    }


    public static void main(String[] args) {
        createPole();
        printPole();

        while (true) {

            humanTurn();
            printPole();
            if (checkWin(humanChar)) {
                System.out.println("You win!");
                break;
            }

            if (isPoleFull()) {
                System.out.println("It is a draw!");
                break;
            }

            aiTurn();
            printPole();
            if (checkWin(aiChar)) {
                System.out.println("You lose");
                break;
            }

            if (isPoleFull()) {
                System.out.println("It is a draw!");
                break;
            }
        }
    }

}
