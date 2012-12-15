package flexbox;

/**
 * The SimpleBoxType Class represents the types of boxes that don't have any colour printing or reinforced bottom or corners.
 * @author UP616167
 */
public class SimpleBoxType extends BoxType {
    
    public SimpleBoxType()
    {
        super();
    }
       
    /**
     *
     * @param cardGrade the card grade of the box
     */
    public SimpleBoxType(int[] cardGrade) {
        super(cardGrade);
    }
    
    @Override
    protected double additionalCost() {
        return 0;
    }
    
}
