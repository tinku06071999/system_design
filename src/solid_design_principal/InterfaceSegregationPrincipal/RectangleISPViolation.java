package solid_design_principal.InterfaceSegregationPrincipal;

public class RectangleISPViolation implements Shape{
    private double length;
    private double width;

    public RectangleISPViolation(double length, double widht){
        this.length = length;
        this.width = widht;
    }
    @Override
    public double area() {
        return this.length * this.width;
    }

    //ISP states that a class should not be forced to implement interfaces it does not use.
    // Since a rectangle is a 2D shape, it does not have a volume. Therefore, we throw an UnsupportedOperationException
    // for the volume method.
    @Override
    public double volume() {
        throw new UnsupportedOperationException("Volume is not supported for Rectangle");
    }
}
