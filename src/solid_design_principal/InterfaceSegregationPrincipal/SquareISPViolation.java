package solid_design_principal.InterfaceSegregationPrincipal;

public class Square implements Shape {
   private double side;

   public Square(double side){
    this.side = side;
  }
  @Override
  public double area(){
    return this.side* this.side;
 }
 // ISP states that a class should not be forced to implement interfaces it does not use.
 // Since a square is a 2D shape, it does not have a volume. Therefore, we throw an UnsupportedOperationException
 // for the volume method.
 @Override
    public double volume(){
        throw new UnsupportedOperationException("Volume is not supported for Square");
    }
}
