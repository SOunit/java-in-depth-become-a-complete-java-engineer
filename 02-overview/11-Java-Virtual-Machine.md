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
