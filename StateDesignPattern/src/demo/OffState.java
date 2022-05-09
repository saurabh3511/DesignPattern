package demo;
public class OffState implements State{
    Fan fan;

    public OffState(Fan fan) {
        this.fan = fan;
    }


    @Override
    public void transitionTo(State nextState) {
        this.fan.setCurrentState(nextState);
    }

    @Override
    public void displayState() {
        System.out.println("Fan is turned Off");
    }
}