public class RedShape extends ShapeDecorator {
    RedShape(Shape shape) {
        super(shape);
    }

    @Override
    public void draw() {
        shape.draw();
        System.out.println("Border Color: Red");
    }
}
