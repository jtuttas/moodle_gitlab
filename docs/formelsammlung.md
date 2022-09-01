# Mengenlehre

## Darstellungsmöglichkeiten

$ M = \{1,2,3,4\} $


## UML (Meramaid)

```mermaid
graph TD;
    A-->B;
    A-->C;
    B-->D;
    C-->D;
```

## UML (Plant UML)

@startuml
Object <|-- ArrayList

Object : equals()
ArrayList : Object[] elementData
ArrayList : size()

@enduml

