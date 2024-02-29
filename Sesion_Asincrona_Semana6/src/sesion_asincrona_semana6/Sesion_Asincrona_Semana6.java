/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sesion_asincrona_semana6;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import java.awt.Font;

/**
 *
 * @author david
 */

public class Sesion_Asincrona_Semana6 {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Mi Primer JFrame");

        JPanel panel = new JPanel();

        JLabel nameLabel = new JLabel("David Steward Sibrian Gomez");
        nameLabel.setFont(new Font("Arial", Font.PLAIN, 20));
        panel.add(nameLabel);

        JButton button = new JButton("Progra 3");
        button.setFont(new Font("Arial", Font.BOLD, 16));
        panel.add(button);

        frame.setSize(400, 300);
        frame.add(panel, BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
