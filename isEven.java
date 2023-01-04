public class isEven {

    public static void main(String[] args) {
        int number = 0;
        try {
            number = Integer.parseInt(args[0]);
        }
        catch (NumberFormatException e) {
            System.out.println("Argument is not a number");
            System.exit(1);
        }
        finally {
            if(isEven(number)) {
                System.out.println("Number is even");
            }
            else {
                System.out.println("Number is odd");
            }
        }
    }

    public static boolean isEven(int number) {
        if(number % 2 != 0) {
            return false;
        }
        else {
            return true;
        }
    }
}
