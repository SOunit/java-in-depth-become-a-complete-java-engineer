# platform-independence

- compilation
  - fast
  - no platform independent
- interpreter
  - slow
  - platform independent

# Java compile / execute by interpreter

- src code
- Java Compiler
- Java byte code
- Java interpreter - JVM - Java Virtual Machine
- results

# Java Execution steps

- Hello.java
- compilation
  - `javac Hello.java`
- Hello.class / Java byte code
- `java Hello`
- JVM handle platform dependency and runs code
- CPU create an instance of JVM

# Execution speed

- byte code interpretation is much faster
  - Java byte code is compact, compiled and optimized
- JIM(Just in Time) compilation
  - by JVM. not by compiler
