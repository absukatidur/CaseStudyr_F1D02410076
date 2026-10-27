# Game Character System

## 1. Project Description

Game Character System is a simple Java console-based program that demonstrates Object-Oriented Programming (OOP) concepts through a role-playing game (RPG) character system.

The program consists of three types of characters: Warrior, Mage, and Archer. Each character has different attributes and attack abilities.

This project demonstrates abstract classes, abstract methods, interfaces, inheritance, polymorphism, method overriding, and encapsulation in Java.

## 2. Object-Oriented Programming Concepts

### 2.1 Abstract Class

The `Character` class is an abstract class that serves as the parent class for Warrior, Mage, and Archer.

It contains common attributes:
- `name`: the character's name.
- `level`: the character's level.
- `health`: the character's health points.

The class also defines the abstract method `attack()`, which must be implemented by its subclasses.

### 2.2 Abstract Method

The `attack()` method in `Character` is declared abstract:

```java
public abstract void attack(Character target);
```

This means that `Character` does not provide a specific attack implementation. Each subclass defines its own attack behavior.

### 2.3 Interface

The project uses two interfaces.

**Attackable**

Defines the methods:
- `attack(Character target)`
- `getAttackPower()`

Warrior, Mage, and Archer implement this interface because all three characters can attack.

**MagicUsable**

Defines the methods:
- `useMagic(Character target)`
- `getManaCost()`

Mage implements this interface because it can use magic attacks that consume mana.

### 2.4 Inheritance

Inheritance is implemented using the `extends` keyword.

```java
public class Warrior extends Character
```

Mage and Archer also extend `Character`. These subclasses inherit common attributes and methods while adding their own specific attributes and behaviors.

### 2.5 Polymorphism

Polymorphism allows objects of different subclasses to be treated as objects of the same parent type.

Example from `Main.java`:

```java
Character[] characters = {warrior, mage, archer};

for (Character character : characters) {
    character.attack(target);
}
```

Each character responds differently when `attack()` is called. Warrior attacks with a weapon, Mage uses magic, and Archer shoots arrows.

This demonstrates runtime polymorphism through method overriding.

### 2.6 Method Overriding

The `@Override` annotation is used when subclasses provide their own implementations of inherited abstract methods.

Warrior, Mage, and Archer each implement `attack()` differently according to their abilities.

### 2.7 Encapsulation

Encapsulation is demonstrated through access modifiers such as `private` and `protected`.

For example, the `weapon` attribute in Warrior is private and can be accessed through the `getWeapon()` method. This helps control access to an object's internal data.

## 3. Class Diagram

The class diagram consists of three levels:

1. **Abstract class:** `Character`
2. **Concrete classes:** `Warrior`, `Mage`, and `Archer`
3. **Interfaces:** `Attackable` and `MagicUsable`

Relationships:
- Warrior, Mage, and Archer extend Character.
- Warrior, Mage, and Archer implement Attackable.
- Mage implements MagicUsable.

The diagram illustrates inheritance, interface implementation, and polymorphism in the character system.

## 4. Conclusion

The Game Character System demonstrates how Java supports object-oriented programming through abstract classes, interfaces, inheritance, and polymorphism.

These concepts make the program easier to organize, maintain, and extend. New character types can be added by extending `Character` and implementing the required interfaces.

## 5. Author

- **Name:** Muhammad Andika Azkiya
- **Student ID:** F1D02410076
- **Class:** A
- **Course:** Object-Oriented Programming (OOP)