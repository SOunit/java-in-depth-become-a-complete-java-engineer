# conceptual view

- when to use interfaces
  - abstract class?
  - interface?

# classification of interfaces

- representative interfaces
- mixins

# representative interfaces

- define `representative behavior` of subclass
- include one or more implementations
- public API
  - rarely sub-classed outside API

# example1: public API

- List<Interface> : `ordered` is the key
  - ArrayList
  - LinkedList
  - Vector

# external implementation

- List<Interface>
  - ImmutableList / Guava API
  - TreeList / Apache Commons API

# Example2: internal usage

- BookDataIntegrator<Interface>

  - GoodReadsIntegrator
  - AmazonIntegrator
  - GoodBooksIntegrator

- benefit
  - having `common protocol`
    - future developer can implement 2 methods

# Mixins

- define additional capability of subclass

  - core identities come from abstract class

- Sharable<Interface>: Mixin
  - Book
  - WebLink

# multiple capabilities

```
public class Book extends Bookmark implements Sharable, Comparable, Cloneable{

}
```
