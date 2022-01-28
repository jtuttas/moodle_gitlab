# Klassen Code und Diagramm

![bild](./images/img.png)

## untereinander3

![Class Diagram](./images/test.svg)


```java
public class Tier {
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
```
## nebeneinander

 Code | Diagramm 
| - | -
| 
```java
public class Tier {
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
 |![Class Diagram](./images/tier.uxf.svg)
