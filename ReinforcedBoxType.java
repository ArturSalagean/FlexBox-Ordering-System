package flexbox;

/**
 * The ReinforcedBoxType Class represents the types of boxes which have reinforced bottom or reinforced corners
 * These types of boxes also have 2 colour printings
 * @author UP616167
 */
public class ReinforcedBoxType extends BoxType {
    
    
    public ReinforcedBoxType()
    {
        super();
    }
    
    public ReinforcedBoxType(int[] cardGrade, int colourPrint, boolean reinforcedBottom, boolean reinforcedCorners) {
        super(cardGrade, colourPrint, reinforcedBottom, reinforcedCorners);
        
    }
    
    @Override
    protected double additionalCost() {
        
        double cost;
        //we know for sure that this type of boxes have 2 colour printings so we calculate the additional cost for these
        cost = FlexBoxGUI.colourCost[1];
                
        if(reinforcedBottom)
        {
            cost = cost + FlexBoxGUI.reinforcedBottomCost;
        }
        if(reinforcedCorners)
        {
            cost = cost + FlexBoxGUI.reinforcedCornersCost;
        }
        
        return cost;
    }
        
}
