import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Calculator{
    // Components
    private JTextField displayField;
    private JButton[] numberButtons;
    private JButton[] operatorButtons;
    private JButton equalsButton;
    private JButton clearButton;

    // Variables to store calculation state
    private String currentNumber;
    private String previousOperator;
    private double result;

    // Constructor
    public Calculator() {
        if (GraphicsEnvironment.isHeadless()) {
            System.err.println("Cannot create GUI in headless environment");
            return;
        }

        setTitle("Calculator");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 400);
        setLocationRelativeTo(null); // Center the frame

        // Initialize components
        displayField = new JTextField();
        displayField.setEditable(false);

        // Rest of the code remains the same...
        // (omitted for brevity)
    }

    // Rest of the code remains the same...
    // (omitted for brevity)

    // Main method to start the application
    public static void main(String[] args) {
        new Calculator();
    }
}
