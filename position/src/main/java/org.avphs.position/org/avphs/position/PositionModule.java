package org.avphs.position;

import org.avphs.core.CarCommand;
import org.avphs.core.CarModule;

import java.util.Collection;

public class PositionModule implements CarModule {

    @Override
    public Class[] getDependencies() {
        return null;
    }

    @Override
    public void init(CarModule... dependencies) {

    }

    @Override
    public CarCommand[] commands() {
        return null;
    }

    @Override
    public void run() {
        System.out.println("Position");
    }
    
    public int[] getPosition(){ //returns the (x,y) of the car in the map
        return [0,0];
    }
    
    public double getDirection(){ //returns the direction of the car in degrees
        return 0.0;
    }
}
