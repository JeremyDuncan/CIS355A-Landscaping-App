
import java.text.DecimalFormat;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Jeremy Duncan
 */
public class Customer {
    private int customerID;
    private String name;
    private String address;
    private String yardType;
    private double length;
    private double width;
    private double totalCost;

    // Constructors
    public Customer() {
        customerID = 0;
        name = "N/A";
        address = "N/A";
        yardType = "N/A";
        length = 0.0;
        width = 0.0;
        totalCost = 0.0;
    }

    public Customer(int customerID, String name, String address, String yardType, double length, double width, double totalCost) {
        this.customerID = customerID;
        this.name = name;
        this.address = address;
        this.yardType = yardType;
        this.length = length;
        this.width = width;
        this.totalCost = totalCost;
    }

    // Behaviors
    @Override
    public String toString() {
        return name; // Only show customer's name
    }
    
    public String getDetails() {
        DecimalFormat fmt = new DecimalFormat( "$#,##0.00" );
        String output = name + "\n";
        output += address + "\n";
        output += "Type: " + yardType + "\n";
        output += "Width: " + width + "\n";
        output += "Length: " + length + "\n";
        output += "Total Cost: " + fmt.format(totalCost); //currency

        return output;
    }
   
}
