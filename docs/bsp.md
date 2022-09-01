#  Beispiel!
Wir schwitzen im Raum **2.13** !!

![bild](./images/img.png)

![Class Diagram](http://www.plantuml.com/plantuml/proxy?src=https://raw.githubusercontent.com/jtuttas/moodle_gitlab/master/docs/Instance.puml)

## Code einbauen!!
 

@startuml
Object <|-- ArrayList

Object : equals()
ArrayList : Object[] elementData
ArrayList : size()

@enduml


```java
/**
 * Main
 */
public class Main {

    public static void main(String[] args) {
        System.out.println("Hallo Welt!");
    }
}
```