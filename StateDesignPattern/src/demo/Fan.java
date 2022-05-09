package demo;

import java.util.HashMap;
import java.util.Map;

public class Fan {
    private Map<State,State> fanStateMap=new HashMap<>();

    State currentState;

    public Fan(){
        State onState=new OnState(this);
        State offState=new OffState(this);
        this.fanStateMap.put(onState,offState);
        this.fanStateMap.put(offState,onState);
        //set to default state
        currentState=offState;
    }

    public void setCurrentState(State nextState) {
        this.currentState=nextState;
    }
    public void displayState(){
        this.currentState.displayState();
    }
    public void toggle(){
        this.currentState.transitionTo(fanStateMap.get(currentState));
    }
}