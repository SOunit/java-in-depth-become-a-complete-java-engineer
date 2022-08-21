# Minimize Accessibility

- avoid tight couping
  - classes
  - methods

# Item13: Accessibility for class members

- design minimum `public` API of your class
- make all other members `private`
- make a member `default` / `package private`, only if really need

# Accessibility for classes / interfaces

- if possible let it be `private` = `package private`
- if only one class uses it, make it `private nested`

# information hiding = encapsulation
