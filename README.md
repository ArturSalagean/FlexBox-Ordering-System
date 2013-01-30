FlexBox-Ordering-System
=======================

Basic Ordering System with GUI written in JAVA

##Brief description

The FlexBox ordering system was designed using OOP to support the company’s main activity which is the selling of boxes.<br> 
The application allows the customers to enter the details of a type of box such as: width, height, length, grade of card, whether they want any colour printing, whether they want any bottom and/or corner reinforcement, whether the box has a sealable top and the quantity of boxes.<br>
The system will then check if the ordered box corresponds to any type of boxes that can be supplied by the company and if positive it will quote the total cost of the order, otherwise it will display an error message.<br> 
If the customer wants to order different quantities of different types of boxes, the system will quote the total cost of the boxes.<br> 
I’ve added an extra feature to the application which enables the user to remove an order from the orders list and the system will display the total cost after the removal of the order.<br>

##Assumptions

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

##Limitations

<table>
<tr>
<th>Input</th>
<th>Minimum</th>
<th>Maximum</th>
<th>Type</th>
</tr>
<tr><td>Width</td><td>0.5 m</td><td>10 m</td><td>Double</td></tr>
<tr><td>Height</td><td>0.5 m</td><td>10 m</td><td>Double</td></tr>
<tr><td>Length</td><td>0.5 m</td><td>10 m</td><td>Double</td></tr>
<tr><td>Grade of card</td><td>1</td><td>5</td><td>Natural number (can be selected from drop-down list)</td></tr>
<tr><td>Colour Printing</td><td>0</td><td>2</td><td>Natural number(select button - at least one selected)</td></tr>
<tr><td>Reinforced Bottom</td><td>Unchecked</td><td>Checked</td><td>Boolean (checkbox)</td></tr>
<tr><td>Reinforced Corners</td><td>Unchecked</td><td>Checked</td><td>Boolean (checkbox)</td></tr>
<tr><td>Sealable Tops</td><td>Unchecked</td><td>Checked</td><td>Boolean (checkbox)</td></tr>
<tr><td>Quantity</td><td>1</td><td>100</td><td>Natural number</td></tr>
</table>

##Marks

These are the marks that I've got for this project:

* Demonstration: 82%
* Report: NYA
