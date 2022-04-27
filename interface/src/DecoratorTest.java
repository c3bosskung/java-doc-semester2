public class DecoratorTest {
    public static void main(String[] args) {
        RedShape redShape = new RedShape(new Circle());
        RedShape redShape1 = new RedShape(new Rectangle());
        redShape1.draw();
    }
}
