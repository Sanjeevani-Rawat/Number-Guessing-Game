import javax.swing.*; // allows gui commands like JFrame, JButton, JLable, JTextField, JTextArea etc.
import javax.swing.border.Border; // to use custom borders

import java.awt.*; // let us use to layout managers, colors, fonts etc.
import java.awt.event.*; // let us use to handle events like button click, key press etc.

import java.util.Random; // for generating random numbers

// creating a class name NumberGuessing and extending it with JFrame to make it a GUI window
public class NumberGuessing extends JFrame {

    private Random random = new Random(); // this obj will generate random no.
    private int minRange = 1;
    private int maxRange = 50;
    private int maxAttempts = 10;
    private int randomNumber = random.nextInt(maxRange - minRange + 1) + minRange;
    private int attempts = 0;

    private JLabel titleLabel = new JLabel("NUMBER GUESSING GAME");
    private JLabel instructionLabel = new JLabel("Guess the number between " + minRange + " and " + maxRange + ".");
    private JLabel attemptsLabel = new JLabel("Attempts Remaining: " + (maxAttempts - attempts));
    private JTextField guessField = new JTextField(10);
    private JButton guessButton = new JButton("Guess");
    private JTextArea resultArea = new JTextArea(7, 30);

    // constructor to initialize the GUI components
    public NumberGuessing() {
        setTitle("NUMBER GUESSING GAME");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(500, 100, 500, 500);
        setResizable(false);

        // getting content pane (frame body)
        Container c = getContentPane();
        c.setLayout(null);
        c.setBackground(new Color(245, 255, 250)); // light bg

        // title label
        titleLabel.setBounds(130, 10, 300, 30);
        titleLabel.setFont(new Font("Arial", Font.BOLD, 18));
        c.add(titleLabel);

        // instruction label
        instructionLabel.setBounds(130, 50, 300, 20);
        instructionLabel.setFont(new Font("SansSerif", Font.PLAIN, 14));
        c.add(instructionLabel);

        // attempts label
        attemptsLabel.setBounds(160, 80, 200, 20);
        c.add(attemptsLabel);

        // guess input field
        guessField.setBounds(180, 110, 120, 30);
        c.add(guessField);

        // guess button
        guessButton.setBounds(200, 150, 80, 30);
        guessButton.setBackground(new Color(100, 149, 237));
        guessButton.setForeground(Color.WHITE);
        guessButton.setFocusPainted(false);
        c.add(guessButton);

        // result area
        resultArea.setBounds(50, 200, 400, 220);
        resultArea.setEditable(false);
        resultArea.setFont(new Font("Monospaced", Font.PLAIN, 13));
        resultArea.setBackground(new Color(255, 248, 220));
        resultArea.setBorder(BorderFactory.createLineBorder(Color.GRAY));
        c.add(resultArea);

        // guessButton.addActionListener(new ActionListener() {
        //     public void actionPerformed(ActionEvent e) {
        //         takeGuess();
        //     }
        // });

        // when guess button is clicked it will call the method takeGuess()
        guessButton.addActionListener(e -> takeGuess());    

        setVisible(true);
    }

    // takeGuess method
    public void takeGuess() {
        if (attempts >= maxAttempts) {
            resultArea.append("❌ GAME OVER. No attempts left.\n");
            resultArea.append("Correct number was: " + randomNumber + "\n");
            guessField.setEnabled(false);
            guessButton.setEnabled(false);
        } else {
            int guess;
            try {
                guess = Integer.parseInt(guessField.getText());
            } catch (NumberFormatException e) {
                resultArea.append("Invalid input. Please enter a number.\n");
                return;
            }

            attempts++;

            if (guess == randomNumber) {
                resultArea.append("🌟 Congratulations! You guessed it in " + attempts + " attempts.\n");
                guessField.setEnabled(false);
                guessButton.setEnabled(false);
            } else if (guess < randomNumber) {
                resultArea.append("Attempt ->" + attempts + ": 🔽 Too low! Try again.\n");
                attemptsLabel.setText("Attempts Remaining: " + (maxAttempts - attempts));
            } else {
                resultArea.append("Attempt ->" + attempts + ": 🔼 Too high! Try again.\n");
                attemptsLabel.setText("Attempts Remaining: " + (maxAttempts - attempts));
            }
        }
       
        guessField.setText(""); // clear the guess field
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new NumberGuessing();
            }
        });
    }
}