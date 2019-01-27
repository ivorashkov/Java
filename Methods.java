import java.util.Arrays;

public class Methods {

    public static void main(String[] args) {

    }
    //Barking Dog
    public static boolean bark (boolean barking, int hourOfDay){

        if(barking && (hourOfDay >= 0 && hourOfDay < 8 ) || (hourOfDay > 22 && hourOfDay <= 23)){
            return true;
        }else{
            return false;
        }

    }

    // Leap Year calculator
    public static boolean isLeapYear(int year) {
        boolean tru = false;
        if (year < 1 || year > 9999) {
            return tru;
        } else if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0)) {
            tru = true;
            return tru;
        }else{
            tru = false;
            return tru;
        }

    }

    //Decimal Comperator
    public static boolean areEqualByThreeDecimalPlaces(double a, double b){
        int a1 = (int)(a * 1000);
        int b1 = (int)(b * 1000);
        return a1 == b1;
    }

    //Equal Sum Checker
    public static boolean hasEqualSum(int num1, int num2, int result){
        boolean suc = false;
        int sum = 0;
        sum = num1 + num2;

        if(result == sum){
            suc = true;

        }else if(result != sum){
            suc = false;

        }
        System.out.println(suc);
        return suc;

    }

    //Teen Number Checker
    public static boolean hasTeen(int a, int b, int c){
        return (a >=13 && a <= 19) || (b >=13 && b <= 19) || (c >=13 && c <= 19);
    }


    //Simple Method Overloading
    private static String getDurationString(long minutes, long seconds){
        if ((minutes < 0) || (seconds < 0) || (seconds > 59)){
           // OR  System.out.println("Invalid value");
            return "Invalid value";
        }
        long hours = minutes / 60;
        long remainingMinutes = minutes % 60;
        // System.out.println(hours + "h " + remainingMinutes + "m " + seconds + "s");
        return hours + "h " + remainingMinutes + "m " + seconds + "s";
    }
    private  static String getDurationString(long seconds){
        if(seconds < 0){
            return  "Invalid value";
        }
        long minutes = seconds / 60;
        long remainingSeconds = seconds % 60;

        return getDurationString(minutes, remainingSeconds);
    }

    //variable parameters in Method
    private  static void VariableMethod(int x, double d, String ... str){
        System.out.printf("Integer = i%, Double =d%, String = s% ", x, d, Arrays.toString(str));
    }
}
