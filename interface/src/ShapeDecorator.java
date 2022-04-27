public abstract class ShapeDecorator implements Shape {
    public Shape shape;

    ShapeDecorator(Shape shape) {
        this.shape = shape;
    }

    @Override
    public void draw() {
        shape.draw();
    }

}
