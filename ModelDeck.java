/**
 * Created by Rahul Patni on 2/22/2016.
 */
public class ModelDeck {
    private static final int TOTAL_CARDS = 52;
    private static final char[] SUITS = {'H', 'S', 'D', 'C'};
    private static final char[] CARDS = {'A', '2', '3', '4', '5', '6', '7', '8', '9', 'T', 'J', 'Q', 'K'};

    int[] deck;
    public ModelDeck() {
        this.deck = new int[TOTAL_CARDS];
    }
    public void initializeDeck() {
        int i;
        for (i = 0; i < TOTAL_CARDS; i++) {
            deck[i] = i;
        }
    }
    public void printDeck() {
        int i;
        for (i = 0; i < TOTAL_CARDS; i++) {
            System.out.printf("%c%c\n", CARDS[i%13], SUITS[deck[i]/13]);
        }
    }
}
