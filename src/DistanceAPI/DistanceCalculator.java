package DistanceAPI;

import Common.Position;

public class DistanceCalculator {
    //Tijdelijke code tot we de API code krijgen bij opdracht 4
    public double getDistance(Position p1, Position p2){
        return Math.abs(p1.getLattitude() - p2.getLattitude())
                + Math.abs(p1.getLongitude() - p2.getLongitude());
    }
}
