package workshopoops;

import java.util.ArrayList;
import java.util.Scanner;

import static java.util.Scanner.*;

public class DeckOfCards {
    public static ArrayList<String> deckofCards = new ArrayList<>();


    public void deckOfCards() {
        String[] suit = {"Clubs", "Diamonds", "Hearts", "Spades"};
        String[] rank = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "King", "Queen", "Ace", "Jack"};
        int numOfCards = suit.length * rank.length;
        System.out.println("Number Of Cards In the Deck :" + numOfCards);
        for (int i = 0; i < rank.length; i++)
            for (int j = 0; j < suit.length; j++) {
                deckofCards.add(rank[i] + ":" + suit[j]);
            }
        toDisplay(deckofCards);
    }


    public void toDisplay(ArrayList<String> cardsDeck) {
        System.out.println("Cards in Deck :");
        for (String element : cardsDeck) {
            System.out.println(element);
        }
    }


public void noOfPlayers() {
    System.out.println("Enter number of Players minimun 2, maximum 4 :");
    Scanner sc = new Scanner(System.in);
    int  player = sc.nextInt();
    if (player >= 2 && player <= 4) {
        System.out.println(+player + "Player will play the match");
    }
        else {
        System.out.println("Please enter valid number of player within range");
        this.noOfPlayers();
        sc.close();
    }
    }

    public static void main (String[]args){
        DeckOfCards deck1 = new DeckOfCards();
        deck1.deckOfCards();
        deck1.noOfPlayers();

    }
}