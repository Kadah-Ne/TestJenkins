package epsi;

import java.util.Arrays;

/**
 * Hello world!
 *
 */
public class App {
    public static void main( String[] args )
    {
        int resultAdd = compute(args);
        int resultMulti = multiply(args);
        System.out.println("The result is : " + resultAdd +"\n The multiplication is : "+ resultMulti);
    }

    public static int compute( String[] args) {
        return new CalculatorService().add(Arrays.asList(Integer.valueOf(args[0]), Integer.valueOf(args[1])));
    }

    public static int multiply(String[] args)
    {
        return new CalculatorService().multi(Arrays.asList(Integer.valueOf(args[0]), Integer.valueOf(args[1])));
    }
}
