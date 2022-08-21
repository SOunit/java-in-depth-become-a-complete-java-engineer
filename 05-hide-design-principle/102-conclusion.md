# summary

- package
- Strings
- Access Levels
- information hiding = encapsulation
  - loosely coupled software components

# access class

- import
  - explicit import is preferred over implicit using `*`
  - import doesn't make classes bigger
  - no effect for runtime performance
  - saves from typing fully-qualified class names
  - `java.lang` package is imported by default

# create package

- ensure `matching directory structure` exists
- use `package` statement

# avoid package name conflict

- use reverse organization domain
  - `com.amazon.math.geometry`

# Strings

- Object of `java.lang.String`
- String object is `immutable`
- uses character array to store text
- Java uses UTF-16 for characters
- String object = `immutable` sequence of `unicode` characters

# String pool

- stores string literals as string objects
- resides on heap
- stores single copy of each string literal
  - saves memory
- string interring
  - process of building string pool

# String concatenation

- `+`
- StringBuilder
  - recommended
  - allow mutate string
  - 300x faster than `+`
  - 2x faster than StringBuffer
- StringBuffer
  - allow mutate string

# Access Modifiers

- inside class: private
- inside package: (blank) default
- inside package + any subclass: protected
- inside & outside package: public

# information hiding

- to get `loose coupling`
- item14: in public classes, use `accessor methods`, not public fields
- item13: minimize the accessibility of classes and members
