

public class Tier {
	 // Attribute
    private String name;
    private double gewicht;

    public Tier(String name)
    {
        this.name=name;
    }
    public String getName(){
        return name;
    }
    public double getGewicht(){
        return gewicht;
    }
    public void setGewicht(double gewicht){
        this.gewicht=gewicht;
    }
}
