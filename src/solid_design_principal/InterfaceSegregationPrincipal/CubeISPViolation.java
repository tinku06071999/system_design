package solid_design_principal.InterfaceSegregationPrincipal;

public class CubeISPViolation implements Shape{
    private double side;

    public CubeISPViolation(double side){
        this.side = side;
    }
    @Override
    public double area() {
        return 6 * this.side * this.side;
    }
    @Override
    public double volume() {
        return this.side * this.side * this.side;
    }

}
