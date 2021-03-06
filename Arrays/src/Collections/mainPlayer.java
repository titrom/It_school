package Collections;

import java.util.ArrayList;

public class mainPlayer {
    public static void main(String[] args) {
        ArrayList<Player> playerList=new ArrayList<Player>();
        playerList.add(new Player("Vasia",289));
        playerList.get(0).setScore(34);
        for (Player i:playerList) {
            System.out.println(i.getName()+" "+i.getName());

        }
    }
}
