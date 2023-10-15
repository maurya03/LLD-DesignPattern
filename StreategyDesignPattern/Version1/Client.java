package StreategyDesignPattern.Version1;

import StreategyDesignPattern.Common.Mode;
import StreategyDesignPattern.Version1.GoogleMapsV1;

public class Client {
    public static void main(String[] args) {
        GoogleMapsV1 gm1 = new GoogleMapsV1("Delhi", "Varanasi", Mode.Bike);
        gm1.findPath();
    }
}
