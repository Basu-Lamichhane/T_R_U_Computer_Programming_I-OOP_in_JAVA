
/**
 * This Java program "DeckOfCardsTest" simulates a deck of playing cards with two classes: "Card" and "DeckOfCards",
 * and a test class "DeckOfCardsTest". The Card class represents a single playing card with a face
 * value and a suit, and the DeckOfCards class represents a deck of 52 cards. The DeckOfCards class
 * has methods to shuffle the deck, deal cards, and count the remaining cards. The DeckOfCardsTest
 * class tests the DeckOfCards class by printing out the initial deck, shuffling it, and then dealing
 * all the cards.
 *
 * name [Basu Lamichhane]
 * class/semester :
 * date : 2023-02-08
 * files : DeckOfCardsTest.java
 * email :
 */

import java.util.Random;

//Previously created class "card" in assignment-4
class Card {
    private int face;
    private int suit;
    //Initializing the card face and suit values in two String arrays
    private static final String[] face_text = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};
    private static final String[] suit_text = {"Spades", "Hearts", "Diamonds", "Clubs"};

    //First Constructor with parameters
    public Card(int face, int suit) {
        setFace(face);
        setSuit(suit);
    }
    //Second Constructor which generates random values of face and suit of cards
    public Card() {
        Random random = new Random();
        setFace(random.nextInt(13) + 1);
        setSuit(random.nextInt(4) + 1);
    }
    //Getters and Setters
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
    //method to combine the face and suit value strings
    public String toString() {
        return getFaceText() + " of " + getSuitText();
    }
}


class DeckOfCards {
    private Card[] deck;
    private int current_card;
    private static final int number_of_cards = 52;
    private static final Random random = new Random();

    //Constructor which initializes the deck with cards
    public DeckOfCards() {
        deck = new Card[number_of_cards];
        current_card = 0;

        // Initialize deck with cards
        int index = 0;
        for (int suit = 1; suit <= 4; suit++) {
            for (int face = 1; face <= 13; face++) {
                deck[index++] = new Card(face, suit);
            }
        }
    }

    //Method which shuffles the cards in deck
    public void shuffle() {
        for (int i = 0; i < deck.length; i++) {
            int j = random.nextInt(number_of_cards);
            Card temp = deck[i];
            deck[i] = deck[j];
            deck[j] = temp;
        }
        current_card = 0;
    }

    //Method which deals the card from deck
    public Card dealCard() {
        if (current_card >= deck.length) {
            return null;
        }
        return deck[current_card++];
    }

    //method which returns the number of cards left
    public int cardsLeft() {

        return deck.length - current_card;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Card card : deck) {
            sb.append(card).append("\n");
        }
        return sb.toString();
    }
}

//Test driver class for "DeckOfCards" class
public class DeckOfCardsTest {
    public static void main(String[] args) {
        DeckOfCards deck = new DeckOfCards();

        //Prints out the initial sequence of cards
        System.out.println("Initial Deck:");
        System.out.println(deck);


        deck.shuffle();

        //Prints out the shuffled cards
        System.out.println("Shuffled Deck:");
        System.out.println(deck);

        //Prints out the dealing card
        System.out.println("Dealing Cards:");
        while (deck.cardsLeft() > 0) {
            Card card = deck.dealCard();
            System.out.printf("%s (%d cards left)\n", card, deck.cardsLeft());
        }
    }
}


