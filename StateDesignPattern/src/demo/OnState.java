package demo;

public class OnState implements State{
    Fan fan;

    public OnState(Fan fan) {
        this.fan = fan;
    }


    @Override
    public void transitionTo(State nextState) {
        this.fan.setCurrentState(nextState);
    }

    @Override
    public void displayState() {
        System.out.println("Fan is turned On");
    }
}