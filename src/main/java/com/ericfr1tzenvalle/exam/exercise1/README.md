# Exercício 1 – Ar-Condicionado Residencial

Crie um conjunto de classes para um **ar-condicionado residencial**. Considere que o aparelho só precisa **acionar a condensadora** quando a **temperatura do ambiente** é diferente daquela **indicada pelo usuário (via controle remoto)**, caso contrário deve **entrar em stand-by**.  
Considere que o **sensor de temperatura do ambiente está instalado na evaporadora**. 

> ⚠️ Observação: Sugere-se a criação das classes conforme o **diagrama UML** abaixo (se preferir, você pode adotar outra composição de classes).  
*(que foi o meu caso, já que meu UML está levemente diferente).*

## Diagrama UML 

```mermaid
---
config:
  layout: elk
  theme: redux-dark
---
classDiagram
class ArCondicionado{
  - Evaporadora evaporadora
  - Condesadora condesadora
  + exec() void
}
class Evaporadora{
  - List<Observer> observers
  - SensorTemperatura sensor
  - ControleRemoto controle
  - double EPISILON = 0.01$
  + controleSetTemperatura(double temp) void
  + sensorSetTemperatura(double temp) void
  + getTemperaturaControle() double
  + getTemperaturaSensor() double
  + verificarTemperatura() void
}
class Condesadora{
  - Subject subject
  - Modo status
}
class Modo{
  <<enumeration>>
  STAND_BY
  RESFRIANDO
  ESQUENTANDO
  DESLIGADA
}
class ControleRemoto{
  - double temperatura
  + setTemperatura(double t) void
  + getTemperatura() double
}
class SensorTemperatura{
  - double temperatura
  + setTemperatura(double t) void
  + getTemperatura() double
}
class Subject{
  <<Subject, interface>>
  + addObserver(Observer o) void 
  + removeObserver(Observer o) void
  + getUpdate() Object
  + notifyObservers() void
}
class Observer{
  <<interface>>
  + setSubject(Subject s) void
  + update() void
}
class App
App ..> ArCondicionado: usa
Condesadora ..|> Observer: implements
Evaporadora ..|> Subject: implements
Evaporadora *-- SensorTemperatura: é parte
Evaporadora o-- ControleRemoto: agrega
Evaporadora ..> SensorTemperatura: usa
Evaporadora ..> ControleRemoto: usa
ArCondicionado *-- Evaporadora: é parte
ArCondicionado *-- Condesadora: é parte
```
Condesadora *-- Modo: é parte
Evaporadora -- Condesadora: notifica
