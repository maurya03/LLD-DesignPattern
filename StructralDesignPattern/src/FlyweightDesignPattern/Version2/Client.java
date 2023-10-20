package FlyweightDesignPattern.Version2;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class Client {
    /*
    100 enemies :
            90 dumb enemies
            7 bomber
            2 small tanks
            1 Machine
     */
    public static void main(String[] args) {
        Image Image = null;
        PlayerFlyweight dumbEnemyFw = new PlayerFlyweight(10, 10, Image);
        PlayerFlyweight bomberEnemyFw = new PlayerFlyweight(20, 20, Image);
        PlayerFlyweight smallTanksEnemyFw = new PlayerFlyweight(30, 30, Image);
        PlayerFlyweight machineEnemyFw = new PlayerFlyweight(40, 40, Image);

        /*
        Note: We can't create static data members for playerFlyweight class data members, since we need
              4 types not a single.
         */
        // creating 90 dumb  enemies
        List<Player> playerList = new ArrayList<>();
        for(int i=0;i<90;i++)
        {
            Player p = new Player();
            p.pf = dumbEnemyFw;
            //four more properties
            playerList.add(p);
        }
        // creating 7 bomber
        for(int i=0;i<7;i++)
        {
            Player p = new Player();
            p.pf = bomberEnemyFw;
            // Four more properties
            playerList.add(p);
        }
        // 2 small tanks
        for(int i=0;i<2;i++)
        {
            Player p = new Player();
            p.pf = smallTanksEnemyFw;
            // Four more properties
            playerList.add(p);
        }
        // 1 machine
        for(int i=0;i<2;i++)
        {
            Player p = new Player();
            p.pf = machineEnemyFw;
            // Four more properties.
            playerList.add(p);
        }
    }
}

/*
    PlayerFlyweight size = 4B + 4B + 1Mb ~= 1Mb
    for 4 types = 4 * 1Mb ~= 1Mb.
    Player size = 12B + 4B + 4B + 12B + 4B = 36B.
    For 100 players = 100 * 36B = 3KB

    So Total size will be = 1Mb + 3KB ~= 1Mb
    and RAM size is 256MB

    -------------------------------------------------------------------------
    So mainly there will arise two questions
    1. Why could we not keep intrinsic properties in player itself?
       Since some of the player properties are not changing.
    2. Why are intrinsic properties not static inside player?
       Static will give only 1 copy, but we need number of copy == number of types.
 */