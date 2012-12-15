package flexbox;

/**
 * The Box Class represents the boxes which have the details entered by the user
 * @author UP616167
 */
public class Box {
    protected BoxType boxType;
    protected double boxWidth;
    protected double boxHeight;
    protected double boxLength;
    protected boolean sealableTops;
    
   
    public Box() {    
    }
    
    public Box(BoxType boxType, double boxWidth, double boxHeight, double boxLength, boolean sealableTops) {
        
       this.boxType = boxType;
       this.boxWidth = boxWidth;
       this.boxHeight = boxHeight;
       this.boxLength = boxLength;
       this.sealableTops = sealableTops;
       
    }
    
    
    /**
     * Calculates the basic cost of a box
     * @return the basic cost of a box 
     */
    protected double basicPrice() {
    
        double boxArea;
        double price;
        double cost;
        int cardGrade;
        
        boxArea = 2*(boxWidth*boxHeight) + 2*(boxWidth*boxLength) + 2*(boxHeight*boxLength);
        cardGrade = boxType.getCardGrade()[0];
        cost = FlexBoxGUI.basicCost[cardGrade-1];
        price = boxArea * cost;
        return price;
        
    }
    
    
    
    /**
     * Calculates the total cost of the box, including additional cost
     * @return the total cost of the box, including additional cost
     */
    protected double cost() {
        double price;
        double additionalPrice;
        
        price = basicPrice();
  
        additionalPrice = boxType.additionalCost();
        if(sealableTops) {
            additionalPrice = additionalPrice + FlexBoxGUI.sealableTopsCost;
        }
        //calculate the final price including additional price;
        price = price + additionalPrice*price/100;
        return price;
    }
    
}
