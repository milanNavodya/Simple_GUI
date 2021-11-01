public class Flight
{
    private String airline_name, flight_origin, destination_cities;
    private int flight_number;
    public Flight(String airline_name, int flight_number,
                  String flight_origin, String destination_cities)
    {
        // assign sent values to local variables
        this.airline_name = airline_name;
        this.flight_number = flight_number;
        this.flight_origin = flight_origin;
        this.destination_cities = destination_cities;
    } // end Flight costructor

// getters and setters
    public void setAirline_name(String airline_name)
    {
        this.airline_name = airline_name;
    }
    public String getAirline_name()
    {
        return airline_name;
    }
    
    public void setFlight_origin(String flight_origin)
    {
        this.flight_origin = flight_origin;
    }
    public String getFlight_origin()
    {
        return flight_origin;
    }
    
    public void setDestination_cities(String destination_cities)
    {
        this.destination_cities = destination_cities;
    }
    public String getDestination_cities()
    {
        return destination_cities;
    }

    public void setFlightNumber(int flight_number)
    {
        this.flight_number = flight_number;
    }
    public int getFlightNumber(){
        return flight_number;
    }

// return expected output using toString method
    public String toString()
    {
        return (getAirline_name()+" "+getFlightNumber()+
                " -- From: "+getFlight_origin()+
                ", To: "+getDestination_cities());
    } // toString method end
} //Flight class end
