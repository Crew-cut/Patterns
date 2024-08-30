package State;

public class MyContext {
    boolean isNext;
    private State state;

    public MyContext(State state) {
        this.state = state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public void doAction(){
        state.doAction(isNext,this);
    }
    public void nextState(){
        isNext = true;
        doAction();
    }
    public void nextStateOff(){
        isNext = false;
    }
}
