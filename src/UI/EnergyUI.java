package UI;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import PHYSICS.Energy;
public class EnergyUI {
    JFrame frame = new JFrame("PhysicsUI Calc");
    JButton potentialEnergyBtn = new JButton("Potential Energy");
    JButton kineticEnergyBtn = new JButton("Kinetic Energy");
    JButton ForceBtn = new JButton("Force");
    JButton powerBtn = new JButton("Power");
    JButton WorkDoneBtn = new JButton("WorkDone");
    
    public void MainUI() {
        potentialEnergyBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                drawPotentialEnergyUI();
            }
        });

        frame.add(potentialEnergyBtn);
        frame.add(kineticEnergyBtn);
        frame.add(ForceBtn);
        frame.add(powerBtn);
        frame.add(WorkDoneBtn);
        frame.setSize(400, 300);
        frame.setLayout(new GridLayout(5, 1));
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    JFrame potentialEnergyFrame = new JFrame("Potential Energy");
    JLabel massLabel = new JLabel("Enter mass (kg):");
    JLabel heightLabel = new JLabel("Enter height (m):");
    JTextField massTextField = new JTextField();
    JTextField heightTextField = new JTextField();
    JButton calculatePotentialEnergyBtn = new JButton("Calculate");

    public void drawPotentialEnergyUI() {
        Energy myObj = new Energy();
        potentialEnergyFrame.setLayout(new GridLayout(3, 2));
        potentialEnergyFrame.setSize(300, 200);

        potentialEnergyFrame.add(massLabel);
        potentialEnergyFrame.add(massTextField);
        potentialEnergyFrame.add(heightLabel);
        potentialEnergyFrame.add(heightTextField);
        potentialEnergyFrame.add(calculatePotentialEnergyBtn);

        calculatePotentialEnergyBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    float mass = Float.parseFloat(massTextField.getText());
                    float height = Float.parseFloat(heightTextField.getText());
                    float result = myObj.calculatePotentialEnergy(mass, height);
                    JOptionPane.showMessageDialog(null, "Potential Energy = " + result + " J");
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "Invalid input. Please enter valid numbers.");
                }
            }
        });

        potentialEnergyFrame.setVisible(true);
    }

}
JFrame kineticEnergyFrame = new JFrame("Kinetic Energy");
JLabel massLabel3 = new JLabel("Enter mass (kg):");
JLabel velocityLabel = new JLabel("Enter velocity (m/s):");
JTextField massTextField3 = new JTextField();
JTextField velocityTextField = new JTextField();
JButton calculateKineticEnergyBtn = new JButton("Calculate");

public void drawKineticEnergyUI() {
    Energy myObj = new Energy();
    kineticEnergyFrame.setLayout(new GridLayout(3, 2));
    kineticEnergyFrame.setSize(300, 150);
    kineticEnergyFrame.add(massLabel3);
    kineticEnergyFrame.add(massTextField3);
    kineticEnergyFrame.add(velocityLabel);
    kineticEnergyFrame.add(velocityTextField);
    kineticEnergyFrame.add(calculateKineticEnergyBtn);

    calculateKineticEnergyBtn.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            try{
                float mass = Float.parseFloat(massTextField3.getText());
                float velocity = Float.parseFloat(velocityTextField.getText());
                float result = myObj.calculateKineticEnergy(mass, velocity);
                JOptionPane.showMessageDialog(null, "Kinetic Energy = " + result + "kgm/s");
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(null, "Invalid input. Please enter valid numbers.");
            }
        }
    });

    kineticEnergyFrame.setVisible(true);
}


JFrame ForceFrame = new JFrame("Force!");
JLabel mass1Label = new JLabel("Enter mass1 (kg):");
JLabel distanceLabel = new JLabel("Enter Distance (m):");
JTextField mass1TextField = new JTextField();
JTextField distanceTextField = new JTextField();
JButton calculateForceBtn = new JButton("Calculate");

public void drawForceUI() {
    Energy myObj = new Energy();
    ForceFrame.setLayout(new GridLayout(3, 2));
    ForceFrame.setSize(300, 200);
    ForceFrame.add(mass1Label);
    ForceFrame.add(mass1TextField);
    ForceFrame.add(distanceLabel);
    ForceFrame.add(distanceTextField);
    ForceFrame.add(calculateForceBtn);

    calculateForceBtn.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            try {
                 float mass1 = Float.parseFloat(mass1TextField.getText());
                 float distance = Float.parseFloat(distanceTextField.getText());
                 float result = myObj.calculateForce(mass1, distance);
                 JOptionPane.showMessageDialog(null, "Force = " + result + "N");
             } catch (NumberFormatException ex) {
                 JOptionPane.showMessageDialog(null, "Invalid input. Please enter valid numbers.");
             }
        }
     });

     ForceFrame.setVisible(true);
}
JFrame powerFrame = new JFrame("Power");
JLabel workLabel = new JLabel("Enter work(J):");
JLabel timeLabel = new JLabel("Enter time(s)");
JTextField workTextField = new JTextField();
JTextField timeTextField = new JTextField();
JButton calculatePowerBtn = new JButton("Calculate");

public void drawPowerUI() {
    Energy myObj = new Energy();
    powerFrame.setLayout(new GridLayout(3, 2));
    powerFrame.setSize(300, 200);
    
    powerFrame.add(workLabel);
    powerFrame.add(workTextField);
    powerFrame.add(timeLabel);
    powerFrame.add(timeTextField);
    powerFrame.add(calculatePowerBtn);

    calculatePowerBtn.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            try {
                 float work = Float.parseFloat(workTextField.getText());
                 float time = Float.parseFloat(timeTextField.getText());
                 float result = myObj.calculatePower(work, time);
                 JOptionPane.showMessageDialog(null, "Power = " + result + " W");
             } catch (NumberFormatException ex) {
                 JOptionPane.showMessageDialog(null, "Invalid input. Please enter valid numbers.");
             }
        }
    });

    powerFrame.setVisible(true);
}

JFrame WorkDoneFrame = new JFrame("WorkDone");
JLabel forceLabel = new JLabel("Enter force:");
JLabel distance1Label = new JLabel("Enter distance");
JTextField forceTextField = new JTextField();
JTextField distance1TextField = new JTextField();
JButton calculateWorkDoneBtn = new JButton("Calculate");


public void drawWorkDoneUI() {
    Energy myObj = new Energy();
    WorkDoneFrame.setLayout(new GridLayout(4, 3));
    WorkDoneFrame.setSize(300, 200);

    WorkDoneFrame.add(forceLabel);
    WorkDoneFrame.add(forceTextField);
    WorkDoneFrame.add(distance1Label);
    WorkDoneFrame.add(distance1TextField);
    WorkDoneFrame.add(calculateWorkDoneBtn);

    calculateWorkDoneBtn.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            try {
                 float force = Float.parseFloat(forceTextField.getText());
                 float distance1 = Float.parseFloat(distance1TextField.getText());
                 float result = myObj.calculateWorkDone(force, distance1);
                 JOptionPane.showMessageDialog(null, "WorkDone = " + result + "J");
             } catch (NumberFormatException ex) {
                 JOptionPane.showMessageDialog(null, "Invalid input. Please enter valid numbers.");
             }
        }
    });

    WorkDoneFrame.setVisible(true);
}


}



