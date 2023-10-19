package StreategyDesignPattern.Version2;

import StreategyDesignPattern.Common.Mode;

public class Client {
    public static void main(String[] args) {
        String from = "Delhi";
        String to = "Agra";
        Mode mode = Mode.Bike;
        GoogleMap gm = new GoogleMap();
        gm.findPath(from, to, mode);
    }
}
