# summary

- finished 70% of Java basics
- core building block of method
  - operators
  - control flow statement
  - variable scoping rules

# Arithmetic Operators

- Operands
  - primitive `numeric` types
- Rules
  - Operator precedence
    - `*` has high priority than `+`, etc.
    - left to right
  - Operand promotion
  - Same-type operand
  - Mixed-type operand

# Comparison & logical operators

- comparison
  - compare one operand with another
  - `==` and `!=` can compare object references
    - good for `null` check
- logical
  - test multiple conditions
  - `&&` and `||` are short-circuited
    - stop process first part is `false`

# Bitwise & Bit Shift

- useful to `resource constrained` applications
- Bitwise operands
  - `integer` & `boolean` primitives
- Bit Shift operands
  - `integer` primitives
    - `Left-shift`: multiplication by powers of 2
    - `Unsigned-right-shift`: division by powers of 2
- Application samples
  - compilers
  - hashing
  - embedded & games programming

# Switch statement

- switch expression
  - integer
  - string
  - enum
- when to prefer `switch` over `if`
  - Readability
  - Intent
  - Speed

# Item46: Prefer for-each loops to traditional for loops

- efficient
- less detail, less error

# prefer for loops to while loops

-
