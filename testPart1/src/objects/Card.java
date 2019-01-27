
package objects;

import java.util.ArrayList;
import java.util.Arrays;
import static java.util.Arrays.asList;
import java.util.List;

public class Card {
    
    private String suite;
    private String cardValue;
    private ArrayList<String> color;
    private ArrayList<String> rank;
    
    public Card(){
    }

    public Card(String suite, String cardValue) {
        this.suite = suite;
        this.cardValue = cardValue;
    }

    public String getSuite() {
        return suite;
    }

    public void setSuite(String suite) {
        this.suite = suite;
    }

    public String getCardValue() {
        return cardValue;
    }

    public void setCardValue(String value) {
        this.cardValue = value;
    }

    public ArrayList<String> getColor() {
        ArrayList<String> colorList = new ArrayList<String>(asList("Coeur", 
                "Carreau", "Trèfle", "Pique"));
        color = colorList;
        return color;
    }

    public ArrayList<String> getRank() {
        ArrayList<String> rankList = new ArrayList<String>(asList("As", "2", "3",
                "4", "5", "6", "7", "8", "9", "10", "Valet", "Reine", "Roi"));
        rank = rankList;
        return rank;
    }

    public void setRank(ArrayList<String> rank) {
        this.rank = rank;
    }
    
    @Override
    public String toString() {
        return cardValue + " de " + suite;
    }
    
    
    
    
}
