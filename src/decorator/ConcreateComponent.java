package decorator;

/**
 * @ClassName ConcreateComponent
 * @Date 2022/2/18 11:49
 * @Author allen
 * @Description TODO
 */
public class ConcreateComponent extends Component{

    @Override
    public void operation() {
        System.out.println("具体操作的对象");
    }
}
