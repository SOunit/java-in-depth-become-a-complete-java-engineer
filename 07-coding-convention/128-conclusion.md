# conclusion

# final keywords

- cannot be changed
- means `constant`
  - primitive
    - value is constant
  - reference
    - reference is constant, not object content
- don't get `default` value
- used with `instance`, `local`, or `static` variables

# constant variables

- part of final variables
- called compile-time constants
- compiler optimize
  - no assignment
  - faster

# constant variable restriction

- use `final` keyword
- `primitive` or `String`
- initialized in declaration statement
  - no initialization inside constructor / initializer
- initialized with compile-time constant expression

# Item49: Prefer primitive types to boxed primitives

- auto boxing exists, but primitive is better in performance
- keep primitive, simple is better
- use boxed primitives if necessary

# Item56: Adhere to generally accepted naming conventions

- naming recommendations
  - typographical
  - grammatical

# Conventions: Classes & Methods

- Classes
  - The Single Responsibility Principle
- Methods
  - Small & focused
  - Should do only one thing

# Item45: Minimize the scope of local variables

# comment

- code overview
- `non-obvious` design decisions
- frequent comment -> poor code quality
- use `descriptive` method & variable names
