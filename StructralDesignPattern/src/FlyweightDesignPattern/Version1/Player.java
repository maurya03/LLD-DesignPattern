package FlyweightDesignPattern.Version1;
/*
    Intent is to save memory.
 */

import FlyweightDesignPattern.Common.Point;

import java.awt.*;

public class Player {
    FlyweightDesignPattern.Common.Point currentPosition; // 12 Bytes
    int currentHealth; // 4 Bytes
    int offencePower; // 4 Bytes
    int initialHealth; // 4 Bytes
    Image avatar; // 1Mb
    int score; // 4 Bytes
    Point direction; // 12 Bytes
}
/*
    Problem:
        What if 10k players are playing then
            1. Total Size required for 1 player : 12B + 4B + 4B + 4B + 1Mb + 4B + 12B ~= 1Mb;
            2. 10k players = 10k * 1Mb = 10Gb;
            3. our ram is of RAM 256 MB (Old days);

            So we can not play the game, since game size if higher than RAM Size.

            Extrinsic Properties                        Intrinsic Properties
            (properties that will                       (Properties that will same
             change for every player)                       for most of the players)
             currentPosition                                    offencePower
                currentHealth                                   avatar
                score                                           initialHealth
                direction

         1. Number of players are huge.
         2. But number of players type are limited.
         3. 100 enemies : 90 dumb enemies / 7 bomber / 2 small tanks / 1 Machine.
 */
