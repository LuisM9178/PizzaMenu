import java.util.ArrayList;

public class Pizza
{
  private String crust;
  private String shape;
  private ArrayList<String> toppings;

  public Pizza(String crust, String shape, ArrayList<String> toppings){
    this.crust = crust;
    this.shape = shape;
    this.toppings = toppings;
  }
  public String getCrust()
  {
    return crust;
  }
  public void setCrust(String tmpCrust)
  {
    crust = tmpCrust;
  }

  public String getShape()
  {
    return shape;
  }
  public void setShape(String tmpShape)
  {
    shape = tmpShape;
  }

  public ArrayList<String> getToppings()
  {
    return toppings;
  }
  public void setToppings(ArrayList<String> tmpToppings)
  {
    toppings = tmpToppings;
  }
}
