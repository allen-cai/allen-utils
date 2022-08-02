package decorator;

/**
 * @ClassName ConcreteDecoratorB
 * @Date 2022/2/18 11:56
 * @Author allen
 * @Description TODO
 */
public class ConcreteDecoratorB extends Decorator {

    @Override
    public void operation() {
        super.operation();

        this.addedBehavior();
        System.out.println("具体装饰对象B的操作");
    }

    private void addedBehavior() {

    }
}
