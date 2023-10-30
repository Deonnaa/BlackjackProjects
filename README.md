# BlackjackProjects

## About the Author
Hi, I'm Deonna, a passionate coding student and the creator of this Java program. I'm on an exciting journey to learn and explore the world of programming!

- **Location:** United States of America
- **Learning:** Java Programming
- **GitHub:** [Deonna's GitHub Profile](https://github.com/Deonnaa)
- **LinkedIn:** [Deonna's LinkedIn Profile](https://www.linkedin.com/in/deonna-aponte-506a3318b/)

This Blackjack game was developed as a fun project to apply my knowledge of Java and to provide a classic card game experience to users. I hope this project will be both entertaining and educational for others on their programming journey. Feel free to reach out to me with any questions, feedback, or if you just want to talk code!

## Description
The Blackjack Application is a Java-based program designed to simulate the classic casino card game. This project was developed to demonstrate my grasp of fundamental Java concepts, such as object-oriented design, event-driven programming, and the use of standard Java libraries.

With this application, users can enjoy playing Blackjack against an automated dealer, following standard rules of the game. The program includes features like hand decisions (hit or stand), and automatic win/loss determination.

## How to Use
1. Download the Java files from the repository.
2. Compile and run the BlackJackApp.java file.
3. The program will deal two cards to the player and the dealer, with one of the dealer's cards hidden.
4. The user will be prompted to choose whether to "Hit" or "Stand":
	- Hit: The player is dealt another card.
 	- Stand: The player ends their turn.
5. The dealer will then play their hand according to Blackjack rules.
6. The program will determine the outcome (win, lose, or tie) and prompt the user to play again.

## Technologies Used
- The program uses Java's `java.util.Scanner` class for user input.
- Java 1.8
- Eclipse IDE
- JUnit 5

## Lessons Learned
- Game Logic: Implementing the rules of Blackjack and handling different game scenarios.
- Object Creation: Create cards using of different card enum types, as well as player-dealer, hand-blackjackhand relationships.
- Object Polymorphism: Use polymorphism to call methods specific to each player type, abstract methods enforcing implementation in subclasses.
- User Input Handling: Utilize `Scanner` to process user input and guide program flow.
- Updating Object Properties: Update the value of cards within the hand as you add.

## Usage Examples
- 1
	- Player: 10 of Hearts, Ace of Spades (Total: 21)
	- Dealer: Queen of Diamonds, [Face Down Card]
	- BlackJack! Player wins.
- 2
	- Player: 10 of Hearts, 6 of Spades (Total: 16)
	- Dealer: Queen of Diamonds, 6 of Clubs, 9 of Hearts (Total: 25)
	- Player wins, dealer busts!
- 3
	- Player: 10 of Hearts, 6 of Spades (Total: 16)
	- Dealer: 10 of Diamonds, 7 of Diamonds (Total: 17)
	- Dealer wins!
- 4
	- Player: 10 of Hearts, 6 of Spades (Total: 16)
	- Dealer: 10 of Spades, 6 of Diamonds (Total: 16)
	- It's a tie!

