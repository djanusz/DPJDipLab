
package dip.lab2.solution2;

/**
 *
 * @author djanusz
 */
public class TipService {
    
    private TipCalculatorStrategy tipType;
    
    public TipService (TipCalculatorStrategy t) {
        tipType = t;
    }
    
//    public TipService() {
//        
//    }
    
    public double getGratuity() {
        return tipType.getTip();
    }
    
}
