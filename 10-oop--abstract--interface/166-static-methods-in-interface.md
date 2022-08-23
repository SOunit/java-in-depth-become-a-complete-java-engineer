# static methods in interface

# why NOT static methods in pre-Java 8 world?

- interfaces are `stateless`
- static methods are `stateless` too

- interface are `contract`, no implementation

- interface can be associated with `utility` methods

  - e.g. List nCopies(n, element)
    - List implementation with n copies of element

- interface -> companion class
  - e.g. java.util.Collections
