# Compilation

- what is compilation?

# Machine Language

- Computer understand instructions
- Program: set of instructions
- Instruction: 0s & 1s - binary format
- Machine Language / Machine code / Native code
  - Language which Machine can understand

# Assembly Language

- easy to read / write

```
Add $s0, $s1, $s2
```

- `Assembler` compile Assembly Language to Machine Language

# Low-Level Language

- Machine Language & Assembly Language
- Use Low-level details. E.G. memory location

# High-Level Language

- Fortran, C, C++, Java, C#
- English like words, math notations, punctuations(;)
- hide low-level details
- Source code

# Compilation

- source code - compiler - target language
- target language
  - machine code / C, C++
  - byte code / Java
  - programming language / TypeScript to JavaScript
    - source-to-source compiler / trans-compiler

# Core Compilation Operations

- verify syntax / semantics of source code
  ```
    System.out.print("Hello");
  ```
- code optimization
- generate machine code
