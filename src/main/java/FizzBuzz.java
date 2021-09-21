public class FizzBuzz {

    private final int number;

    public FizzBuzz(int number) {
        this.number = number;
    }

    public String run() {
        if ( this.number % 3 == 0 ) {
            return "Fizz";
        } else if ( this.number % 5 == 0 ){
            return "Buzz";
        } else {
            String result = String.valueOf(this.number);
            return result;
        }
    }
}
