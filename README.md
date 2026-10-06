# Spring Core Learning

This repository contains beginner-friendly examples to understand the fundamental concepts of **Spring Core** using plain Java programs before moving to the actual Spring Framework.

## Concepts Covered

* IS-A Relationship
* HAS-A Relationship
* Interface and Implementation
* Composition
* Tight Coupling
* Loose Coupling
* Dependency Injection (Constructor Injection)

## Project Structure

```text
src/
└── Composition/
    ├── Engine.java
    ├── DieselEngine.java
    ├── PetrolEngine.java
    ├── Car.java
    └── Test.java
```

## Explanation

### Engine Interface

The `Engine` interface defines the common behavior for different engine types.

```java
public interface Engine {
    void Start();
}
```

### Implementations

* `DieselEngine` implements `Engine`
* `PetrolEngine` implements `Engine`

This represents an **IS-A relationship**.

```text
DieselEngine IS-A Engine
PetrolEngine IS-A Engine
```

### Car Class

The `Car` class contains an `Engine` object.

```java
private Engine engine;
```

This represents a **HAS-A relationship**.

```text
Car HAS-A Engine
```

### Constructor Injection

The `Engine` object is provided through the constructor.

```java
public Car(Engine engine) {
    this.engine = engine;
}
```

This demonstrates **Dependency Injection**, which helps achieve **Loose Coupling**.

## Learning Outcome

Through this project, the following concepts are understood:

* Object-Oriented Programming relationships
* Composition
* Tight Coupling vs Loose Coupling
* Dependency Injection
* Basic foundation of Spring Core

## Technologies Used

* Java
* OOP Concepts
* Interfaces
* Constructor Injection

This project serves as a foundational step for learning Spring Framework and Spring Core.
