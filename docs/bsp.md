#  Beispiel
Hier eine Beispielseite mit einem eingebetteten Bild.

![bild](./images/img.png)

@startuml
Alice -> Bob: Authentication Request
Bob --> Alice: Authentication Response

Alice -> Bob: Another authentication Request
Alice <-- Bob: another authentication Response
@enduml

## Code einbauen!

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