FlexBox-Ordering-System
=======================

Basic Ordering System with GUI written in JAVA

1. **Brief description**

The FlexBox ordering system was designed using OOP to support the company’s main activity which is the selling of boxes. The application allows the customers to enter the details of a type of box such as: width, height, length, grade of card, whether they want any colour printing, whether they want any bottom and/or corner reinforcement, whether the box has a sealable top and the quantity of boxes. The system will then check if the ordered box corresponds to any type of boxes that can be supplied by the company and if positive it will quote the total cost of the order, otherwise it will display an error message. If the customer wants to order different quantities of different types of boxes, the system will quote the total cost of the boxes. I’ve added an extra feature to the application which enables the user to remove an order from the orders list and the system will display the total cost after the removal of the order.

2. **Assumptions**

I assumed that:
* The user has to enter the values for width, height, length in meters.
* The input boxes cannot be empty when submitting the order.
* The colour printing value can be selected as a radio button because there are only 3 possible values (0,1,2)
* The grade of card can be selected from a drop-down list since there are 5 values to choose from.
* The user must select a grade of card before getting a quote.
* The reinforced bottom, reinforced corners and sealable top values can be selected as a checkbox because they are optional
* The user wants to see the details of the placed orders, so I implemented a JList in the GUI.
* The user wants to remove an order from the list, so I implemented a remove button.
* The user wants to exit the ordering system, so I implemented an exit button.
* The user wants to have cleared fields after he added an order, so that he can input the details of the new order.
* The user needs to know when he entered invalid values, so the application will give corresponding error messages. 
* The total cost value has to be formatted with a maximum of 2 decimals and half up rounding.

3.	**Limitations**

Input	Minimum	Maximum	Type
Width	0.5 m	10 m	Double
Height	0.5 m	10 m	Double
Length	0.5 m	10 m	Double
Grade of card	1	5	Natural number (can be selected from drop-down list)
Colour Printing	0	2	Natural number(select button - at least one selected)
Reinforced Bottom	Unchecked	Checked	Boolean (checkbox)
Reinforced Corners	Unchecked	Checked	Boolean (checkbox)
Sealable Tops	Unchecked	Checked	Boolean (checkbox)
Quantity	1	100	Natural number
