public class function {

    public static void main(String[] args) {
        int number = 0;
        int res = 0;
        try {
            number = Integer.parseInt(args[0]);
        }
        catch (NumberFormatException e) {
            System.out.println("Argument is not a number");
            System.exit(1);
        }
        finally {
            for(int i = 0; i < 5; i++) {
                res += Math.pow(-1, i) + number;
            }
            isNegative(res);
        }
    }

    public static boolean isNegative(int res) {
        if(res > 0) return false;
        else return true;
    }
}
