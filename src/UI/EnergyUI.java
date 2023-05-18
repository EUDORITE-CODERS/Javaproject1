package UI;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import PHYSICS.Energy;
public class EnergyUI {
    JFrame frame = new JFrame("PhysicsUI Calc");
    JButton potentialEnergyBtn = new JButton("Potential Energy");

    public void MainUI() {
        potentialEnergyBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                drawPotentialEnergyUI();
            }
        });

        frame.add(potentialEnergyBtn);
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



