# polymorphism

# Defining Contract

- class defines `contract`
  - I have these kinds of methods

# Defining common protocol

- Supertype defines `common protocol`
  - Myself & subtypes have these kinds of methods

# polymorphism

- supertype = subtype

  - superclass = subclass

- sample

  - polymorphic reference
  - can assign them via polymorphism

  ```
    void updateProfile(User user){}
  ```

      - new User
      - new Staff
      - new Editor
      - new ChiefEditor

# benefit of polymorphism

- flexible code
  - if user get new subtype, still function can be same
  - fewer change, fewer bug
- clean code
  - without polymorphism, updateProfile will be 4 different functions

# polymorphism

- `Reference type` & actual `object type` can be different
  ```
    User user = new Staff();
  ```
  - `User` is `reference type`
  - `Staff` is `object type`

# Method invocation

- Compiler uses `reference type` to decide whether a method can be invoked

  ```
    User user = new Editor();
    user.approveReview(); // compile error
  ```

- JVM uses `object type` to decide which method is invoked
  - invoke most specific version
