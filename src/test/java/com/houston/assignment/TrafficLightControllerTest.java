package com.houston.assignment;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TrafficLightControllerTest {

    
    private TrafficLightController controller;

    @Before
    public void setUp() {
        controller = new TrafficLightController();
        
    }
    
    @Test
    public void initiallyAllLightsAreRed() {
        assertEquals(TrafficLightState.RED, controller.getNorthLight().getState());
        assertEquals(TrafficLightState.RED, controller.getEastLight().getState());
        assertEquals(TrafficLightState.RED, controller.getSouthLight().getState());
        assertEquals(TrafficLightState.RED, controller.getWestLight().getState());
    }

    @Test
    public void givesGreenToNorthAndSouthAfterTransitionFromAllRed() {
        controller.switchToNextState(); // from initial to transition state        
        controller.switchToNextState(); // from transition state onwards
        assertEquals(TrafficLightState.GREEN, controller.getNorthLight().getState());
        assertEquals(TrafficLightState.RED, controller.getEastLight().getState());
        assertEquals(TrafficLightState.GREEN, controller.getSouthLight().getState());
        assertEquals(TrafficLightState.RED, controller.getWestLight().getState());
    }
    
    @Test
    public void givesGreenToEastAndWestAfterNorthAndSouthGreen() {
        controller.switchToNextState(); // from initial to transition state
        controller.switchToNextState();
        controller.switchToNextState(); 
        controller.switchToNextState();
        assertEquals(TrafficLightState.RED, controller.getNorthLight().getState());
        assertEquals(TrafficLightState.GREEN, controller.getEastLight().getState());
        assertEquals(TrafficLightState.RED, controller.getSouthLight().getState());
        assertEquals(TrafficLightState.GREEN, controller.getWestLight().getState());
    }
    
}
