package com.houston.assignment;

/**
 * Traffic light controller state
 * 
 * @author niko
 */
public enum TrafficLightControllerState {
    INITIALLY_ALL_RED, 
    TRANSITION_TO_NORTH_SOUTH_GREEN, 
    TRANSITION_TO_EAST_WEST_GREEN, 
    NORTH_SOUTH_GREEN, 
    EAST_WEST_GREEN
}
