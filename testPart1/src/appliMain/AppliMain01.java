package appliMain;

import objects.PlayingSet;

public class AppliMain01 {

    public static void main(String[] args) {
        PlayingSet test01 = new PlayingSet(); 
        // Set of 52 playing cards ordered by shapes
        test01.layOut(test01.getGame());      
        // Set of disordered 52 playing cards
        test01.initShuffle(test01.getGame());
        
        
    }
}
