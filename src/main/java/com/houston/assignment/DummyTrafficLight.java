package com.houston.assignment;

/**
 * Dummy implementation of traffic light 
 * 
 * @author niko
 */
public class DummyTrafficLight implements TrafficLight {

    private TrafficLightState state;

    public DummyTrafficLight() {
        this.state = TrafficLightState.RED;
    }
    
    public TrafficLightState getState() {
        return state;
    }

    public void setState(TrafficLightState newState) {
        this.state = newState;
    }
    
}
