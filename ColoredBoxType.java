package flexbox;

/**
 * The ColoredBoxType Class represents the types of boxes which have 1 or 2 colour printing
 * @author UP616167
 */
public class ColoredBoxType extends BoxType {
    
    public ColoredBoxType()
    {
        super();
    }
       
    public ColoredBoxType(int[] cardGrade, int colourPrint) {
        super(cardGrade, colourPrint);
    }
    

    @Override
    protected double additionalCost() {
        return FlexBoxGUI.colourCost[colourPrint-1];
    }
    
}
