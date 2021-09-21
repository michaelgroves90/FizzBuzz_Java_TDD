import java.util.Arrays;

public class FizzBuzz {

    public String runSingle(int number) {

        if (number % 3 == 0 && number % 5 == 0) {
            return "FizzBuzz";
        } else if (number % 3 == 0) {
            return "Fizz";
        } else if (number % 5 == 0) {
            return "Buzz";
        } else {
            return String.valueOf(number);
        }

    }

    public void reportRange(int num1, int num2) {

        int fizz = 0;
        int buzz = 0;
        int fizzBuzz = 0;

        for (int i = num1; i <= num2; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                fizzBuzz++;
            } else if (i % 3 == 0) {
                fizz++;
            } else if (i % 5 == 0) {
                buzz++;
            }
        }
        System.out.println("There are " + fizz + " Fizz, " + buzz + " Buzz, and " + fizzBuzz + " FizzBuzz.");
    }

//    public String report() {
//        return;
//    }

}