package State;

public class State2 implements State{
    @Override
    public void doAction(boolean isNext,  MyContext context) {
        if (isNext){
            context.setState(new State3());
            context.nextStateOff();
            context.doAction();
        }else System.out.println("Выполнено в состоянии 2");
    }
}
