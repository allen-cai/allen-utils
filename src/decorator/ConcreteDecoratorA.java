package decorator;

/**
 * @ClassName ConcreteDecoratorA
 * @Date 2022/2/18 11:54
 * @Author allen
 * @Description TODO
 */
public class ConcreteDecoratorA extends Decorator {

    private String addedState;

    @Override
    public void operation() {
        super.operation();
        addedState = "New State";
        System.out.println("具体装饰对象A的操作");
    }
}
