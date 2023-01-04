public class isHoliday {

    public static void main(String[] args) {
        String day = args[0];
        isHoliday(day);
    }

    public static boolean isHoliday(String day) {
        switch(day) {
            case "Sunday":
            case "Monday":
            case "Tuesday":
            case "Wednesday":
            case "Thursday": {
                System.out.println("Workday");
                return false;
            }
            case "Friday": case "Saturday": {
                System.out.println("Holiday");
                return true;
            }
            default: {
                System.out.println("This is not day of week");
                return false;
            }
        }
    }
}


