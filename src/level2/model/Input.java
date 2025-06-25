package level2.model;

import java.util.Scanner;

public class Input {
    private static final Scanner sc = new Scanner(System.in);


    private static String readNonEmptyLine(String message) {
        while (true) {
            System.out.print(message + ": ");
            String input = sc.nextLine();
            if (input.trim().isEmpty()) {
                System.out.println("Error: This field cannot be empty.");
            } else {
                return input;
            }
        }
    }

    public static byte readByte(String message) {
        while (true) {
            try {
                String input = readNonEmptyLine(message);
                return Byte.parseByte(input);
            } catch (NumberFormatException e) {
                System.out.println("Invalid format. Please enter a valid byte number.");
            }
        }
    }

    public static int readInt(String message) {
        while (true) {
            try {
                String input = readNonEmptyLine(message);
                return Integer.parseInt(input);
            } catch (NumberFormatException e) {
                System.out.println("Invalid format. Please enter a valid integer.");
            }
        }
    }

    public static float readFloat(String message) {
        while (true) {
            try {
                String input = readNonEmptyLine(message);

                input = input.replace(',', '.');
                return Float.parseFloat(input);
            } catch (NumberFormatException e) {
                System.out.println("Invalid format. Use a comma instead of a dot (e.g. 3,14).");
            }
        }
    }

    public static double readDouble(String message) {
        while (true) {
            try {
                String input = readNonEmptyLine(message);
                input = input.replace(',', '.');
                return Double.parseDouble(input);
            } catch (NumberFormatException e) {
                System.out.println("Invalid format. Use a comma instead of a dot (e.g. 3,14).");
            }
        }
    }

    public static char readChar(String message) {
        while (true) {
            System.out.print(message + ": ");
            String input = sc.nextLine();
            try {
                if (input.length() != 1) {
                    throw new Exception("You must need to enter a single character.");
                }
                return input.charAt(0);
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
    }

    public static String readString(String message) {
        while (true) {
            System.out.print(message + ": ");
            String input = sc.nextLine();
            try {
                if (input.trim().isEmpty()) {
                    throw new Exception("Input cannot be empty.");
                }
                return input;
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
    }

    public static boolean readYesNo(String message) {
        while (true) {
            System.out.print(message + " (y/n): ");
            String input = sc.nextLine().trim().toLowerCase();
            try {
                if (input.equals("y")) {
                    return true;
                } else if (input.equals("n")) {
                    return false;
                } else {
                    throw new Exception("Please enter 'y' for yes or 'n' for no only.");
                }
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
    }

}

