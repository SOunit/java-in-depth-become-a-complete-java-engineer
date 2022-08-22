# class organization

- variables section

  - static followed by instances
  - static first, instances later

- statics section

  - static initializers
  - static nested classes
  - static methods

- instance section
  - instance initializers
  - constructors
  - instance nested classes
  - methods

# Class Size

- `single responsibility principle`

  - helps create better `abstractions`
    - to have `loosely coupled` classes
  - helps in having fewer lines of code

- less than 2000 lines

# Methods

- small & focused
  - should do only one thing
  - `Clean Code: A Handbook of Agile Software Craftsmanship by Robert C. Martin`
- refactor long methods
  - software reuse
  - clean and readable code
- group methods with similar functionality

# Local variables

- Item45: minimize the scope of local variables
- declare where first used

  ```
  void go(){
    // 50 lines

    double d = 3.14;
    foo(d);
  }
  ```

- prefer `for` to `while` loop
