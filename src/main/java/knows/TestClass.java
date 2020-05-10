package knows;

/**
 * @Author: likang
 * @Date: 2020/5/10 22:10
 */
public class TestClass {

    public static void main(String[] args) {
        new Thread(()->{
            System.out.println();
        },"").start();
    }

}
