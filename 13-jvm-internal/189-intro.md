# intro

- JVM internal

# motivation

- why lean VJM internal

# sample

- Superclass
  - constructor
    - sysout
- Subclass
  - static final / const
  - static initializer
  - constructor
- ClassInitializationDemo
  - static initializer
  - instance initializer
  - main

# question

- what is the order of sysout?
- `lifetime of type` is key to understand

# order

- ClassInitializationDemo
  - 1. static initializer
  - 2. main: sysout
- Subclass
  - 3. static initializer
  - 4. main: sysout
- Superclass
  - 5. constructor
- Subclass
  - 6. constructor

# agenda

- `lifetime of a type` inside JVM
- runtime data area
- class file anatomy
