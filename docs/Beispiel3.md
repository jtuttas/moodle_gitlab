# Klassen Code und Diagramm

## untereinander
<<<<<<< HEAD
![Class Diagram](./tier.uxf.svg)
=======

![Test Demo](./images/tier.uxf.svg)
>>>>>>> 73dd6436e0eca266dad4913e35abdf898fe9a200


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
<<<<<<< HEAD
## nebeneinander

 Code | Diagramm 
| - | -
|<pre>public class Tier { <br>    private String name;<br>    private double gewicht;<br>    public Tier(String name) <br>    { <br>      this.name=name; <br>    } <br>    public String getName(){ <br>        return name; <br>    } <br>    public double getGewicht(){ <br>      return gewicht; <br>    } <br>    public void setGewicht(double gewicht){ <br>        this.gewicht=gewicht; <br>    } <br>} <br></pre> |![Class Diagram](./imgages/tier.uxf.svg)