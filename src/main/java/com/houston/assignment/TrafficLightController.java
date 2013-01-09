package com.houston.assignment;

/**
 * Controls set of traffic lights
 * 
 * @author niko
 */
public class TrafficLightController {

    private TrafficLightControllerState state;
    
    private TrafficLight northLight;
    private TrafficLight eastLight;
    private TrafficLight southLight;
    private TrafficLight westLight;

    public TrafficLightController() {
        this.state = TrafficLightControllerState.INITIALLY_ALL_RED;
        this.northLight = new DummyTrafficLight();
        this.eastLight = new DummyTrafficLight();
        this.southLight = new DummyTrafficLight();
        this.westLight = new DummyTrafficLight();
    }
    
    public TrafficLight getNorthLight() {
        return northLight;
    }

    public TrafficLight getEastLight() {
        return eastLight;
    }

    public TrafficLight getSouthLight() {
        return southLight;
    }

    public TrafficLight getWestLight() {
        return westLight;
    }

    public void switchToNextState() {
        state = getNextState();

        if(TrafficLightControllerState.INITIALLY_ALL_RED.equals(state)) {
        } else if(TrafficLightControllerState.TRANSITION_TO_NORTH_SOUTH_GREEN.equals(state)) {

        } else if(TrafficLightControllerState.NORTH_SOUTH_GREEN.equals(state)) {
            northLight.setState(TrafficLightState.GREEN);
            westLight.setState(TrafficLightState.RED);
            southLight.setState(TrafficLightState.GREEN);
            eastLight.setState(TrafficLightState.RED);
        } else if(TrafficLightControllerState.TRANSITION_TO_EAST_WEST_GREEN.equals(state)) {

        } else if(TrafficLightControllerState.EAST_WEST_GREEN.equals(state)) {
            northLight.setState(TrafficLightState.RED);
            westLight.setState(TrafficLightState.GREEN);
            southLight.setState(TrafficLightState.RED);
            eastLight.setState(TrafficLightState.GREEN);
        }
    
    }

    private TrafficLightControllerState getNextState() {
        if(TrafficLightControllerState.INITIALLY_ALL_RED.equals(state)) {
            return TrafficLightControllerState.TRANSITION_TO_NORTH_SOUTH_GREEN;
        } else if(TrafficLightControllerState.TRANSITION_TO_NORTH_SOUTH_GREEN.equals(state)) {
            return TrafficLightControllerState.NORTH_SOUTH_GREEN;
        } else if(TrafficLightControllerState.NORTH_SOUTH_GREEN.equals(state)) {
            return TrafficLightControllerState.TRANSITION_TO_EAST_WEST_GREEN;
        } else if(TrafficLightControllerState.TRANSITION_TO_EAST_WEST_GREEN.equals(state)) {
            return TrafficLightControllerState.EAST_WEST_GREEN;
        } else if(TrafficLightControllerState.EAST_WEST_GREEN.equals(state)) {
            return TrafficLightControllerState.TRANSITION_TO_NORTH_SOUTH_GREEN;
        }
        return TrafficLightControllerState.INITIALLY_ALL_RED;
    }
    
}

