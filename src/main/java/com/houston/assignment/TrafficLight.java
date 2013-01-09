package com.houston.assignment;

/**
 * Traffic light
 * 
 * @author niko
 */
public interface TrafficLight {

    TrafficLightState getState();
    
    void setState(TrafficLightState state);
    
}
