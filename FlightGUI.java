import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Form1 extends JPanel implements ActionListener {
    private Flight[] flight;
    private JButton jb;
    private TextArea taFlightNum, taAirlineName, taFlightOriginNDestiny;
    private JLabel jlFlightNum, jlAirlineName, jlFlightOriginNDestiny;

    public Form1(Flight[] flight) 
    {
        this.flight = flight;
        // set layout as a absolute layout
        this.setLayout(null);

        JPanel panel = new JPanel();
        panel.setSize(570,400);
        add(panel); // add panel to frame
        panel.setLayout(null); //set panel as absolute

// create button and add it to JForm
        jb = new JButton("Display Flights");
        panel.add(jb); // add button to panel
        // set location (x and y coordinates) and width and height
        jb.setBounds(0,20,200,25);
        jb.addActionListener(this); // do the action

// create labels and add it to JForm
        jlFlightNum = new JLabel("Flight Number");
        jlFlightNum.setBounds(10,80,130,30);
        panel.add(jlFlightNum);

        jlAirlineName = new JLabel("Airline Name");
        jlAirlineName.setBounds(190,80,130,30);
        panel.add(jlAirlineName);

        jlFlightOriginNDestiny = new JLabel("Flight Origin and Destination");
        jlFlightOriginNDestiny.setBounds(340,80,200,30);
        panel.add(jlFlightOriginNDestiny);

// create text areas and add it to JForm
        taFlightNum = new TextArea();
        taFlightNum.setBounds(10,110,130,200);
        taFlightNum.setBackground(Color.white); // set a color
        panel.add(taFlightNum);
        taFlightNum.setEditable(false); // cannot edit text in text area

        taAirlineName = new TextArea();
        taAirlineName.setBounds(190,110,130,200);
        taAirlineName.setBackground(Color.white);
        panel.add(taAirlineName);
        taAirlineName.setEditable(false);

        taFlightOriginNDestiny = new TextArea();
        taFlightOriginNDestiny.setBounds(340,110,200,200);
        taFlightOriginNDestiny.setBackground(Color.white );
        panel.add(taFlightOriginNDestiny);
        taFlightOriginNDestiny.setEditable(false);
    } // end Form1 constructor

    // create action for button
    @Override // from ActionListener interface
    public void actionPerformed(ActionEvent e) 
    {
        taFlightNum.setText(null);
        taAirlineName.setText(null);
        taFlightOriginNDestiny.setText(null);
            for (int i = 0; i < flight.length; i++) 
            {
                // set Flight numbers to text area
                taFlightNum.setText(taFlightNum.getText() + flight[i].getFlightNumber()+"\n");
                // set Airline name to text area
                taAirlineName.setText(taAirlineName.getText() + flight[i].getAirline_name() + "\n");
                // set Flight origin and destination to text area
                taFlightOriginNDestiny.setText(taFlightOriginNDestiny.getText() +
                                                flight[i].getFlight_origin()+" TO " +
                                                flight[i].getDestination_cities() + "\n");
            }
    }
} // end Form1 class
