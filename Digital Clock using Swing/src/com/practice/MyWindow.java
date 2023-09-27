package com.practice;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.SimpleTimeZone;

public class MyWindow extends JFrame {

    private JLabel heading;
    private JLabel clockLabel;

    private Font font = new Font("", Font.BOLD, 35);

    MyWindow() {
        super.setTitle("Meri Ghadee");
        super.setSize(400,400);
        super.setLocation(600, 200);
        this.createGUI();
        super.setVisible(true);
    }

    public void createGUI() {
        // Making GUI for my clock

        heading = new JLabel("Meri Ghadee");

        clockLabel = new JLabel("Ghadee");

        heading.setFont(font);
        clockLabel.setFont(font);

        this.setLayout(new GridLayout(2,1));

        this.add(heading);
        this.add(clockLabel);
        
        this.startClock();
    }


    public void startClock() {
        Timer timer = new Timer(1000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
//                String dateTime = new Date().toString();

//                String dateTime = new Date().toLocaleString();

                Date date = new Date();

                SimpleDateFormat sfd = new SimpleDateFormat("hh : mm : ss  a");

                String dateTime = sfd.format(date);
                clockLabel.setText(dateTime);

            }
        });
        timer.start();
    }
}
