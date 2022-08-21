# information hiding

- use access modifier
  - package access is default
- to avoid tight coupling, keep loose coupling

  - check state value
  - easy type change

- class / interfaces
  - make all to private
  - public for public use
  - only one class uses, `private nested`
    - a class definition inside another class

# initializer

- static initializer
- instance initializer
  - run the logic before constructor
  - to reuse code
