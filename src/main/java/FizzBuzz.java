import java.io.File;
import java.util.Arrays;
import java.io.FileWriter;
import java.io.IOException;
import com.jamesmurty.utils.XMLBuilder2;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

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

        String range = num1 + " - " + num2;
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
        writeRangeReportToJSON(range, fizz, buzz, fizzBuzz);
        System.out.println("Report written to JSON 'FizzBuzz/range_report.json'");
    }

    public void writeRangeReportToJSON(String range, int fizzCount, int buzzCount, int fizzBuzzCount) {

        JSONObject rangeReport = new JSONObject();
        rangeReport.put("Fizz", fizzCount);
        rangeReport.put("Buzz", buzzCount);
        rangeReport.put("FizzBuzz", fizzBuzzCount);

        JSONObject reportOne = new JSONObject();
        reportOne.put("Range " + range, rangeReport);

        JSONArray reports = new JSONArray();
        reports.add(reportOne);

        try (FileWriter file = new FileWriter("range_report.json")) {
            file.write(reports.toJSONString());
            file.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}