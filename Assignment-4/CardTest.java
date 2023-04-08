
/**
* The program implements a class called Card that represents a standard playing card with a face value and a suit.
* The class includes two constructors, one that takes face and suit values as parameters, and one that generates
* random values for these attributes. The class also includes getter and setter methods for the face and suit values,
*  as well as methods for getting the textual representations of the face and suit values.

* The Card class also overrides the toString method to return a nicely formatted string representation of the card,
*  such as "Ace of Spades" or "Nine of Hearts".

* The program includes a test driver that creates 10 Card objects, five using the default constructor to generate
* random cards, and five using the constructor that takes specific face and suit values. Two of the specific cards
* have "boundary" values (face 1, suit 1 and face 13, suit 4), and two cards have invalid face and suit values
* (15 and 5),(0 and 0).
 *
 * The program outputs the string representation of each Card object, including error messages for
* the invalid cards.
 *
 * name [Basu Lamichhane]
 * class/semester :
 * date : 2023-02-28
 * files : CardTest.java
 * email :
* */

import java.util.Random;

class Card {
    private int face;
    private int suit;
    // Initializing the card face and suit values in two String arrays
    private static final String[] face_text = { "Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen",
            "King" };
    private static final String[] suit_text = { "Spades", "Hearts", "Diamonds", "Clubs" };

    // First Constructor with parameters
    public Card(int face, int suit) {
        setFace(face);
        setSuit(suit);
    }

    // Second Constructor which generates random values of face and suit of cards
    public Card() {
        Random random = new Random();
        setFace(random.nextInt(13) + 1);
        setSuit(random.nextInt(4) + 1);
    }

    // Getters and Setters
    public int getFace() {
        return face;
    }

    public void setFace(int face) {
        if (face < 1 || face > 13) {
            throw new IllegalArgumentException("Invalid face value: " + face);
        }
        this.face = face;
    }

    public int getSuit() {
        return suit;
    }

    public void setSuit(int suit) {
        if (suit < 1 || suit > 4) {
            throw new IllegalArgumentException("Invalid suit value: " + suit);
        }
        this.suit = suit;
    }

    public String getFaceText() {
        return face_text[face - 1];
    }

    public String getSuitText() {
        return suit_text[suit - 1];
    }

    // method to combine the face and suit value strings
    public String toString() {
        return getFaceText() + " of " + getSuitText();
    }
}

// Test Driver for "Card" class
public class CardTest {
    public static void main(String[] args) {
        Card[] cards = new Card[10];

        for (int i = 0; i < 5; i++) {
            cards[i] = new Card();
            System.out.println(cards[i]);// Printing random four cards
        }

        cards[5] = new Card(1, 1);
        System.out.println(cards[5]);// Ace of Spades

        cards[6] = new Card(13, 4);
        System.out.println(cards[6]);// King of Clubs

        try {
            cards[7] = new Card(15, 5);// Invalid Input of face and suit
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid card: " + e.getMessage());
        }

        try {
            cards[8] = new Card(0, 0);// Invalid Input of face and suit
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid card: " + e.getMessage());
        }

        cards[9] = new Card(10, 3);
        System.out.println(cards[9]);// 10 of Diamonds
    }
}
