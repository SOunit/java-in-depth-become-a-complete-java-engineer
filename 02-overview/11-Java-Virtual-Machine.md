# Java Virtual Machine

- strong point of Java
  - platform independent by interpreter
  - fast execution by compiler

# Java Virtual Machine

- Abstract Computing Machine

  - instruction set = Java Byte code
  - manipulates memory at runtime

- Cornerstone of Java Platform
  - Core responsibility
    - loading & interpreting Java byte code
    - security
    - automatic memory management

# JVM instance

- `java Hello`
- instance of JVM is crated in memory
- JVM load `Hello.class` to memory

# JVM architecture

- Hello.java
- compile
- Hello.class / Java byte code
- `java Hello`
- create instance of `JVM`
- `JVM` create `runtime data areas` / `JVM memory` in memory
  - `Heap`
  - `Method area`
- `JVM` load `Hello.class` using `Class Loader`
- `JVM` call `Byte code Verifier` to verify java byte code
- `JVM` execute code using `Execute Engine`
  - `JIT compiler`
  - `Interpreter`
- `JVM` use `Garbage collector` to automatic memory management
- `Security Manager` in `JVM`

# JIT Compiler

- identify frequently executed byte code - `Hot spot`
- JIT Compiler converts `Hot Spot` to machine code
- cache machine code
- faster execution
- also called dynamic compilation

# JIT compilation Example

- foo(){}
- bar(){}
  - Java Interpreter read and run machine code in library
  - after 1000 times run, it is recognized as `hot spot`
  - JIT compilation compile the function to machine code for faster execution
  - after 2000 times, another optimization
