package objects;

import java.util.ArrayList;
import java.util.Random;

public class PlayingSet {

    private ArrayList<Card> game;

    public PlayingSet() {
    }

    public PlayingSet(ArrayList<Card> game) {
        this.game = game;
    }

    /*
    to initialize a set of 52 playing cards
    */
    public ArrayList<Card> getGame() {
        Card a = new Card();
        ArrayList<Card> game = new ArrayList();

        for (int i = 0; i < a.getColor().size(); i++) {
            for (String rank : a.getRank()) {
                Card c = new Card();
                c.setCardValue(rank);
                c.setSuite(a.getColor().get(i));
                game.add(c);
            }
        }
        return game;
    }

    public void setGame(ArrayList<Card> game) {
        this.game = game;
    }
    
    /*
    to pseudo-randomly re-arrange a set of 52 playing cards
    */
    public void initShuffle(ArrayList<Card> newGame) {
        ArrayList<Card> game = new ArrayList();
        for (Card c : newGame) {
            game.add(c);
        }

        for (int i = 0; i < newGame.size(); i++) {
            Random rand = new Random();
            int randNber = rand.nextInt(game.size());
            System.out.println(game.get(randNber));
            game.remove(randNber);
        }
    }

    public void layOut(ArrayList<Card> game) {
        for (int i = 0; i < game.size(); i++) {
            System.out.println(game.get(i));
            if ((i + 1) % 13 == 0) {
                System.out.println("...");
            }
        }
    }

    @Override
    public String toString() {
        return "Set : " + game;
    }
}
