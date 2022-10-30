#  Beispiele!!

## Ein Bild einfügen

![bild](./images/img.png)

## PlantUML einfügen

![Class Diagram](http://www.plantuml.com/plantuml/proxy?src=https://raw.githubusercontent.com/jtuttas/moodle_gitlab/master/docs/Instance.puml)

## Code einbauen!!

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

## LaTex Formeln verwenden


|Beschreibung| |
------ | -----
$A \sim B$   bedeutet $\vert  A \vert =  \vert  B \vert$ | Äquivalenz von Mengen
$A = B$   bedeutet $x \in A \leftrightarrow x \in B$ | Gleichheit von Mengen
$A \subseteq B$   bedeutet $x \in A \rightarrow x \in B$ | Differenzmenge

## Meramaid Grafiken verwenden

``` mermaid
graph LR
  A[Start] --> B{Error?};
  B -->|Yes| C[Hmm...];
  C --> D[Debug];
  D --> B;
  B ---->|No| E[Yay!];
```
