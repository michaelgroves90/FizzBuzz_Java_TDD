public class Main {

    public static void main(String[] args) {
        FizzBuzz fizzbuzz = new FizzBuzz();
        System.out.println(fizzbuzz.runSingle(3));
        System.out.println(fizzbuzz.runSingle(5));
        System.out.println(fizzbuzz.runSingle(15));
        fizzbuzz.reportRange(15, 150);
    }
}
