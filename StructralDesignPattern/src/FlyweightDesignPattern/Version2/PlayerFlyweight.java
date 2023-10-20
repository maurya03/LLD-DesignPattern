package FlyweightDesignPattern.Version2;

import java.awt.*;

public class PlayerFlyweight {
    int offencePower; // 4 Bytes
    int initialHealth; // 4 Bytes
    Image avatar; // 1Mb

    PlayerFlyweight(int offencePower, int initialHealth, Image avatar)
    {
        this.avatar = avatar;
        this.initialHealth = initialHealth;
        this.offencePower = offencePower;
    }
}
