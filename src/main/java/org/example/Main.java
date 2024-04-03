package org.example;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    // Methods for calculating the areas of walls, doors and windows
    public static int rectangularArea(int n1, int n2) {
        return n1 * n2;
    }
    public static float circularArea(float r) {
        return (float)Math.PI * r * r;
    }

    public static void main(String[] args) {

        System.out.println("\nWelcome to The Paint Calculator, we will calculate the amount of paint needed for your next job!");

        // Ask the user for the number of walls and dimensions, catching any input errors
        int walls;
        Scanner reader = new Scanner(System.in);

        while (true) {
            try {

                System.out.println("What is the total number of walls that need to be painted?");
                walls = reader.nextInt();
                System.out.println("Thank you.");
                break;

            } catch (InputMismatchException e) {
                System.out.println("Something went wrong, let's try that again.");
                reader.nextLine();
            }
        }

        int wallHeight;

        while (true) {
            try {

                System.out.println("What is the height of the walls in mm?");
                wallHeight = reader.nextInt();
                System.out.println("Thank you.");
                break;

            } catch (InputMismatchException e) {
                System.out.println("Something went wrong, let's try that again.");
                reader.nextLine();
            }
        }

        int wallWidth;

        while (true) {
            try {

                System.out.println("What is the width of the walls in mm?");
                wallWidth = reader.nextInt();
                System.out.println("Thank you.");
                break;

            } catch (InputMismatchException e) {
                System.out.println("Something went wrong, let's try that again.");
                reader.nextLine();
            }
        }

        //Ask the user for the number of doors and dimensions, catching any input errors
        int doors;

        while (true) {
            try {

                System.out.println("What is the total number of doors in the rooms that need to be painted?");
                doors = reader.nextInt();
                System.out.println("Thank you.");
                break;

            } catch (InputMismatchException e) {
                System.out.println("Something went wrong, let's try that again.");
                reader.nextLine();
            }
        }

        int doorHeight;

        while (true) {
            try {

                System.out.println("What is the height of the doors in mm?");
                doorHeight = reader.nextInt();
                System.out.println("Thank you.");
                break;

            } catch (InputMismatchException e) {
                System.out.println("Something went wrong, let's try that again.");
                reader.nextLine();
            }
        }

        int doorWidth;

        while (true) {
            try {

                System.out.println("What is the width of the doors in mm?");
                doorWidth = reader.nextInt();
                System.out.println("Thank you.");
                break;

            } catch (InputMismatchException e) {
                System.out.println("Something went wrong, let's try that again.");
                reader.nextLine();
            }
        }

        //Ask the user for the number of rectangular windows and dimensions, catching any input errors
        int rectangularWindows;

        while (true) {
            try {

                System.out.println("What is the total number of rectangular windows in the rooms that need to be painted?");
                rectangularWindows = reader.nextInt();
                System.out.println("Thank you.");
                break;

            } catch (InputMismatchException e) {
                System.out.println("Something went wrong, let's try that again.");
                reader.nextLine();
            }
        }

        int rectangularWindowHeight;

        while (true) {
            try {

                System.out.println("What is the height of the rectangular windows in mm?");
                rectangularWindowHeight = reader.nextInt();
                System.out.println("Thank you.");
                break;

            } catch (InputMismatchException e) {
                System.out.println("Something went wrong, let's try that again.");
                reader.nextLine();
            }
        }

        int rectangularWindowWidth;

        while (true) {
            try {

                System.out.println("What is the width of the rectangular windows in mm?");
                rectangularWindowWidth = reader.nextInt();
                System.out.println("Thank you.");
                break;

            } catch (InputMismatchException e) {
                System.out.println("Something went wrong, let's try that again.");
                reader.nextLine();
            }
        }

        //Ask the user for the number of circular windows and dimensions, catching any input errors
        int circularWindows;

        while (true) {
            try {

                System.out.println("What is the total number of circular windows in the rooms that need to be painted?");
                circularWindows = reader.nextInt();
                System.out.println("Thank you.");
                break;

            } catch (InputMismatchException e) {
                System.out.println("Something went wrong, let's try that again.");
                reader.nextLine();
            }
        }

        int circularWindowDiameter;

        while (true) {
            try {

                System.out.println("What is the diameter of the circular windows in mm?");
                circularWindowDiameter = reader.nextInt();
                System.out.println("Thank you.");
                break;

            } catch (InputMismatchException e) {
                System.out.println("Something went wrong, let's try that again.");
                reader.nextLine();
            }
        }


        // Convert the diameter of the window to the radius
        float circularWindowRadius = (float) circularWindowDiameter / 2;

        // Calculate the total area to paint
        int totalWallArea = rectangularArea(wallHeight, wallWidth) * walls;
        int totalDoorArea = rectangularArea(doorHeight, doorWidth) * doors;
        int totalRectangularWindowArea = rectangularArea(rectangularWindowHeight, rectangularWindowWidth) * rectangularWindows;
        float totalCircularWindowArea = circularArea(circularWindowRadius) * circularWindows;

        float totalPaintArea = totalWallArea - totalDoorArea - totalRectangularWindowArea - totalCircularWindowArea;


        // Calculate total number of cans of paint needed based on average coverage of paint per litre
        int paintCoveragePerLitre = 10000000; // 10m^2 per litre so converted to mm^2
        float paintCans = totalPaintArea / (float) paintCoveragePerLitre;

        // Print the total area and cans of paint needed to the user
        System.out.println("The total area of walls to be painted is " + totalPaintArea + "mm squared.");
        System.out.println("Therefore, you will need " + (Math.ceil(paintCans)) + " tins of paint.");




//        for (int i = 1; i <= 31; i++) {
//            String weekday = "";
//            switch (i % 7) {
//                case 1:
//                    weekday = "Monday";
//                    break;
//                case 2:
//                    weekday = "Tuesday";
//                    break;
//                case 3:
//                    weekday = "Wednesday";
//                    break;
//                case 4:
//                    weekday = "Thursday";
//                    break;
//                case 5:
//                    weekday = "Friday";
//                    break;
//                case 6:
//                    weekday = "Saturday";
//                    break;
//                case 0:
//                    weekday = "Sunday";
//                    break;
//            }
//            if (i%3 == 0) {
//                System.out.println("Day " + i + ", " + weekday);
//            }
//        }

//        int i = 1;
//        while (i < 6) {
//            System.out.println(i);
//            i++;
//        }

//        int i = 6;
//        do {
//            System.out.println(i);
//            i++;
//        } while (i < 6);

//        int x = 50;
//        int y = 10;
//
//        if (x>y) {
//          System.out.println("Greater");
//        } else {
//            System.out.println("Not Greater");
//        }

//        int x = 5;
//        int y = 50;
//
//        if(x==y) {
//            System.out.println("1");
//        } else if (x>y) {
//            System.out.println("2");
//        } else {
//            System.out.println("3");
//        }

//        String thanks = "Thank you,";
//        String name = "miguel!";
//        String order = "Your order number is #";
//        int previousOrder = 715;
//
//        String upperName = name.toUpperCase();
//
//        System.out.println(thanks + " " + upperName);
//        System.out.println(order + (++previousOrder));
//
//
//        System.out.println("Hello world!");
    }
}