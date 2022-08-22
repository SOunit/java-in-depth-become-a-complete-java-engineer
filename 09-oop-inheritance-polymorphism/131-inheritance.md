# inheritance

- fundamental feature of OOP / Object Oriented Programming
- inheritance / extends only one class

# motivation

- `duplicate code` leads to maintenance nightmare
- use `inheritance` to avoid `duplicate code`

# subclass

- specialized version of super class
  - `inherit` members
  - `add` new members
  - `override` superclass methods

# terminology

- superclass
  - supertype
  - base class
- subclass
  - subtype
  - sub class

# inheritance hierarchy

## pattern1 / less duplicate

- user
  - EmailAdmin
  - Editor
  - ChiefEditor

## pattern2 / no duplicate

- user
  - staff
    - EmailAdmin
    - Editor
      - ChiefEditor
