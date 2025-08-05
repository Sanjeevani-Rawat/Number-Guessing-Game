# Number-Guessing-Game

Number Guessing Game (JAVA GUI) <br>

A simple number guessing game built using Java Swing. The user tries to guess a randomly generated number betweeon a given range (1-50) in a limited number of attempts. <br>

⚫ FEATURES - <br>
-> Graphical User Interface (GUI) using Java Swing <br>
-> Random number generation within a specified range <br>
-> User-friendly layout with text field, buttons, and result display <br>
-> Feedback after each guess (too high, too low, correct) <br>
-> Attempt counter with a maximum of 10 tries <br>
-> Game over and congratulatory messages <br>
-> Input validation for non-integer entries <br>

⚫ PREVIEW -  <br>
-> My Number Guessing Game look like this: <br>
<img width="735" height="742" alt="Screenshot 2025-08-05 114131" src="https://github.com/user-attachments/assets/21e25400-18b2-48e2-88e7-17727648c563" /> <br>

-> It will take input between range 1 to 50: <br>
<img width="740" height="746" alt="Screenshot 2025-08-05 114328" src="https://github.com/user-attachments/assets/3efca5c1-a8f1-4968-8c69-170189be642e" /> <br>

-> When you click 'Guess' button then it will show the message as per your gugessed number. <br>
~ 🔽 Too low! Try again. If you guessed number smaller than the actual number. <br>
<img width="736" height="746" alt="Screenshot 2025-08-05 114652" src="https://github.com/user-attachments/assets/b3da4afb-d05a-471d-af5f-32f8eb8439f5" /> <br>

~ 🔼 Too high! Try again. If you guessed number larger than the actual number. <br>
<img width="738" height="743" alt="Screenshot 2025-08-05 114713" src="https://github.com/user-attachments/assets/fe9584d8-fe3b-4913-8d61-e55ea1976f73" /> <br>

~ 🌟 Congratulations! You guessed it in 7 attempts. If you guessed the correct number. <br>
<img width="742" height="751" alt="Screenshot 2025-08-05 114817" src="https://github.com/user-attachments/assets/cf84dc6b-20fa-42a5-88b6-b519310e5b62" /> <br>

~ Invalid input. Please enter a number. If you guessed the other character than the number. <br>
<img width="741" height="749" alt="Screenshot 2025-08-05 114936" src="https://github.com/user-attachments/assets/11e7c81b-98a9-418f-911b-b466ca837b1c" /> <br>

~ ❌ GAME OVER. No attempts left. Correct number was:  If you are not able to guessed the correct number and the remaining attempts are no more. <br>
<img width="741" height="745" alt="Screenshot 2025-08-05 114915" src="https://github.com/user-attachments/assets/d95936c5-2c60-4274-99f7-bc1684051036" /> <br>


⚫ HOW THE GAME WORKS -  <br>
1. The program generates a random number between 1 and 50. <br>
2. The player has 10 attempts to guess the number. <br>
3. After each guess: <br>
-> It shows if the guess is too low 🔽 or too high 🔼. <br>
-> It updates the number of remaining attempts. <br>
4. If the player guesses correctly 🎉, the game congratulates the player. <br>
5. If all attempts are used up, it shows a Game Over message along with the correct answer. <br>

⚫ TECHNOLOGIES USED - <br>
-> Java <br>
-> Swing (javax.swing) — GUI components like JFrame, JLabel, JButton, JTextField, JTextArea <br>
-> AWT (java.awt) — Fonts, Layout, Colors <br>
-> Random (java.util.Random) — Random number generation <br>

⚫ TO RUN- <br>
-> Prerequisites <br>
Java JDK installed (version 8 or above) <br>
Java IDE (like IntelliJ, Eclipse) or simple text editor + terminal <br>
-> Steps <br>
1. Clone or Download this Repository <br>
2. Compile: <br>
javac NumberGuessing.java <br>
3. Run: <br>
java NumberGuessing <br>

⚫ LIMITATIONS - <br>
-> The game resets only after restarting the program. <br>
-> No sound or animations. <br>
-> Limited to 1–50 range (fixed, unless modified manually in code). <br>

⚫ IMPROVEMENTS TO DO - <br>
-> Add a restart or play again button. <br>
-> Allow the user to choose difficulty or range. <br>
-> Add sound or popup dialog for results. <br>
-> Store high scores or number of wins. <br>
-> Create a dark mode or multiple themes. <br>

⚫ LICENSE - <br>
-> This project is open-source and free to use. <br>
