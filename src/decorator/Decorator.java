package decorator;

/**
 * @ClassName Decorator
 * @Date 2022/2/18 11:50
 * @Author allen
 * @Description TODO
 */
public abstract class Decorator extends Component {

    protected Component component;

    public void setComponent(Component component) {
        this.component = component;
    }

    @Override
    public void operation() {
        if (component != null) {
            component.operation();
        }
    }
}
