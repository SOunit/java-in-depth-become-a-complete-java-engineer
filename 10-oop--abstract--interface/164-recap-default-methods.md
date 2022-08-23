# Recap

- `default` modifier
  - only in `interface`
- instance methods
  ```
  // this is how to access default method.
  // use instance name (= test) to access
  ITest test = new TestClass();
  test.defaultMethod();
  ```
- Conflict resolution strategy

  - to avoid `diamond problem`

  1. Classes win over interfaces
     - `default methods` cannot override `Object's methods`
  2. Sub-interfaces win over super interfaces
  3. Manual resolution
     - case where interface `A`, `B` both has `go` methods
     - very rare though

- `super` keyword

  - o: parent.super
  - x: grandparent.super
  - x: only super

- Can re-abstract default methods
- cannot use `final` & `synchronized` modifiers
