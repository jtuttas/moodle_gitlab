# Klassen Code und Diagramm

![bild](./images/img.png)

## untereinander
![Class Diagram](./test.svg)
![Class Diagram](./docs/test.svg)
![Class Diagram](test.svg)
![Class Diagram](/docs/test.svg)


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
|<pre>public class Tier { <br>    private String name;<br>    private double gewicht;<br>    public Tier(String name) <br>    { <br>      this.name=name; <br>    } <br>    public String getName(){ <br>        return name; <br>    } <br>    public double getGewicht(){ <br>      return gewicht; <br>    } <br>    public void setGewicht(double gewicht){ <br>        this.gewicht=gewicht; <br>    } <br>} <br></pre> |![Class Diagram](./docs/tier.uxf.svg)
