import java.text.DecimalFormat;
import java.util.Scanner;


public class App {
    public App() {
       DecimalFormat df = new DecimalFormat("0.000");
       float n = 16.333333333f;
       System.out.println(df.format(n));
    }


    public static void main(String[] args) {
        new App();
    }
}