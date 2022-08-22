# conclusion

- inheritance
- polymorphism
- method overriding
- object class
- constructor chaining

# inheritance benefit

- avoid duplicate code
- better design
  - hierarchy of superclass and subclass
- redefine behavior
  - redefine superclass functionalities
  - super()
- establish contract
- polymorphism

- flexible code
- clean code

# IS-A test

- to check if inherit from other class

# Extends only one class

# method invocation

- compile use `reference type` to check method can be invoked
- JVM use `object type` to decide which method to invoke

# static method

- not overridden
  - compile-time bounded

# method overriding rule

- Rule1: same parameters & compatible return types

  - return type must be same or subclass type

- Rule2: Can't be less accessible
  - access level must be same or friendlier

# object class

- root of all class
- all class extends `object class` directly or indirectly
- used for polymorphism in core Java library

# Constructor chaining

- super class must be initialized first
  - methods may rely on state of super class
  - supper class have to be initialized
- super()
- this() or super()
  - never both
- with `overloaded` constructors, last invoked will call super

# prevent inheritance

- final class
- private constructor
