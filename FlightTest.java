import javax.swing.*;
import java.awt.*;

public class FlightTest
{
    public static Flight[] main1()
    {
        Flight f1 = new Flight("Delta", 374, "Philadelphia", "London");
        Flight f2 = new Flight("US air", 212, "Boston", "Los Angeles");
        Flight f3 = new Flight("Continental", 822, "Atlanta", "Chicago");
        return new Flight[]{f1, f2, f3}; // return Flight objects as array
    } // main1 method end

    public static Flight[] sortFlight(Flight[] flightList)
    {
        System.out.println("This flight information is sorted based on Flight Numbers:-");
        // sort Flight objects based on Flight numbers
        for (int i = 0; i < flightList.length; i++)
        {
            for (int j = 0; j < flightList.length; j++)
            {
                int myFlightNum1 = flightList[i].getFlightNumber();
                int myFlightNum2 = flightList[j].getFlightNumber();
                if (myFlightNum1 < myFlightNum2)
                {
                    int temp = flightList[i].getFlightNumber();
                    flightList[i].setFlightNumber(myFlightNum2);
                    flightList[j].setFlightNumber(temp);
                    
                    String tempName = flightList[i].getAirline_name();
                    flightList[i].setAirline_name(flightList[j].getAirline_name());
                    flightList[j].setAirline_name(tempName);
                    
                    String tempOrigin = flightList[i].getFlight_origin();
                    flightList[i].setFlight_origin(flightList[j].getFlight_origin());
                    flightList[j].setFlight_origin(tempOrigin);
                    
                    String tempDes = flightList[i].getDestination_cities();
                    flightList[i].setDestination_cities(flightList[j].getDestination_cities());
                    flightList[j].setDestination_cities(tempDes);
                }
            }
        }
        return (flightList); // return sorted Flight object array
    } //sortFlight method end
    
    public static void main(String[] args)
    {
        /* we need to call Flight constructors to get output
        *  need a Flight object array to call all constructors
        *  A for loop for display sorted information
        ****************************************************************
        *  we need to send main1() method returned value to sortFlight() method for sort objects.
        *  flights variable contain sorted Flight objects */
        Flight[] flights = sortFlight(main1());
        for (int i = 0; i < flights.length; i++)
        {
            System.out.println(flights[i]);
        }
        
        // send sorted Flight objects to Form1 constructor
        Form1 form1 = new Form1(flights);

        // create a JFrame, add created component using Flight constructor
        JFrame jframe = new JFrame("Flight Information System");
        jframe.add(form1);

        // set size and enable JFrame
        jframe.setSize(570, 400);
        jframe.setVisible(true);
        // program will execute if JFrame was closed
        jframe.setDefaultCloseOperation(jframe.EXIT_ON_CLOSE);

    } // main method end
} //FlightTest class end
