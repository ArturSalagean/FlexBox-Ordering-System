package flexbox;

/**
 * The BoxType Class represents the types of boxes
 * @author UP616167
 */
public abstract class BoxType {
    
    protected int[] cardGrade;
    protected int colourPrint = 0;
    protected boolean reinforcedBottom = false;
    protected boolean reinforcedCorners = false;    
    
    public BoxType()
    {
    }
    
    public BoxType(int[] cardGrade)
    {
        this.cardGrade = cardGrade;
    }
    
    public BoxType(int[] cardGrade, int colourPrint)
    {
        this.cardGrade = cardGrade;
        this.colourPrint = colourPrint;
    }
       
   
    public BoxType(int[] cardGrade, int colourPrint, boolean reinforcedBottom, boolean reinforcedCorners) {
        this.cardGrade = cardGrade;
        this.colourPrint = colourPrint;
        this.reinforcedBottom = reinforcedBottom;
        this.reinforcedCorners = reinforcedCorners;
    }
    
    
    /**
     * Accessor method for card grade
     * @return card grade value
     */
    protected int[] getCardGrade() {
        return cardGrade;
    }
    
    /**
     * Accessor method for colour print
     * @return colour print value
     */
    
    protected int getColourPrint() {
        return colourPrint;
    }

    /**
     * Accessor method for reinforced bottom
     * @return true if the box type has reinforced bottom, false otherwise
     */
    
    protected boolean getReinforcedBottom() {
        return reinforcedBottom;
    }
    
    /**
     * Accessor method for reinforced corners
     * @return true if the box type has reinforced corners, false otherwise
     */
    
    protected boolean getReinforcedCorners() {
        return reinforcedCorners;
    }
    
    /**
     * Sets the card grade of the found box type to an array formed of a single value which was inputted by the user.
     * @param cardGrade the card grade of the box
     */
    protected void setCardGrade(int newCardGrade) {
        cardGrade = new int[] {newCardGrade};

    }
    
    
    /**
     * Checks if the card grade introduced by the user is contained in the box type's card grade range
     * @param userValue the card grade of the box
     * @return true if found, false otherwise
     */
    protected boolean containsGrade(int userValue)
    {
        for(int i=0; i<cardGrade.length; i++)
        {
            if(cardGrade[i] == userValue)
            {
            return true;
            }
        }
    return false;
    }
    

    
    /**
     * Calculates the additional cost that needs to be added to the Box's price for certain features
     * @param price the basic cost of the box
     * @return the additional cost
     */
    protected abstract double additionalCost();

}

