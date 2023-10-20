package FlyweightDesignPattern.Version2;
import FlyweightDesignPattern.Common.Point;

public class Player {
    Point currentPosition; // 12 Bytes
    int currentHealth; // 4 Bytes
    int score; // 4 Bytes
    Point direction; // 12 Bytes
    PlayerFlyweight pf; // 4 Bytes
}