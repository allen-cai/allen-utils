/**
 * @ClassName Chinese
 * @Date 2021/8/31 17:14
 * @Author allen
 * @Description TODO
 */
public class Chinese {

    private static Chinese objref =new Chinese();
    private Chinese(){}
    public static Chinese getInstance() { return objref; }



        public static void main(String[] args) {
            String s = "java";
            String a = "java";

            System.out.println(s == a);
        }

}
