# interface

- pure contract / contact is to have certain members
- for optional property
- without compromising(give up) polymorphism

# defining common protocol

- supertype define `common protocol`

  - Myself & my subtypes have these kinds of methods
  - supertype specifies `contract`

  - supertype = class
  - contract = public / protected methods

  - interface
    - implement features
      - mostly only `public abstract methods`
      - no state, no-instantiable
    - benefit
      - pure contract
      - flexible design

# defining the interface

-

```
public interface InterfaceName{
    static final fields
    abstract methods

    // from Java8
    default methods
    static methods
    nested types
}
```

# Object met!

- Only WebLink & Book are shareable
- Common protocol via Sharable
- Polymorphic benefits of multiple inheritance
  ```
    Sharable obj = new Book();
    Bookmark obj = new Book();
  ```

# type

- refers to

  - class
  - interface

- keywords
  - Reference type
  - object type

# sample

```
void go(Sharable s){
    String data = s.getItemData();
}

// they are good, they are sharable
go(new Book());
go(new WebLink());

// not good, movie is not sharable
go(new Movie());
```
