package State;

public class State1 implements State{

    @Override
    public void doAction(boolean isNext, MyContext context) {
        if (isNext){
            context.setState(new State2());
            context.nextStateOff();
            context.doAction();
        }else System.out.println("Выполнено в состоянии 1");
    }
}
