package dip.lab2.solution2;

// An useful import if you need it.
import dip.lab2.*;
import java.text.NumberFormat;
// Another useful import if you need it.
import javax.swing.JOptionPane;

/**
 * Just a test class for input and output.
 *
 * 1. Create instances of low-level classes using Liskov Substitution principle.
 * 2. Create an instance of your high-level class. 3. Pass one of your
 * calculator instances to the high-level class and check the results. 4. Now
 * switch to a different calculator instance and pass that to the high-level
 * class. Did it work? Are the low-level instances interchangeable? The DIP
 * requires this.
 *
 * @author David Janusz
 */
public class Startup {

//    public static enum ServiceQuality {
//        GOOD, FAIR, POOR
//    };

    public static void main(String[] args) {
        TipCalculatorStrategy tip1 = new BaggageTipStrategy(
                BaggageTipStrategy.ServiceQuality.GOOD, 5);
        TipCalculatorStrategy tip2 = new BaggageTipStrategy(
              BaggageTipStrategy.ServiceQuality.GOOD, 4);
        TipCalculatorStrategy tip3 = new RestaurantTipStrategy(
                RestaurantTipStrategy.ServiceQuality.POOR, 10.00);

        TipService ts = new TipService(tip1);

        NumberFormat nf = NumberFormat.getCurrencyInstance();

        //Shouldn't have magic numbers
        System.out.println("Tip1 = " + nf.format(ts.getGratuity()));
//        System.out.println("Tip2 = " + nf.format(ts.getGratuity(tip2)));
//        System.out.println("Tip3 = " + nf.format(ts.getGratuity(tip3)));
    }
}
