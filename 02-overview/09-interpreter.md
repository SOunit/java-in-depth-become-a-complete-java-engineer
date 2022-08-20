# Interpreter

# compile language

- source code
- compiler
- machine code
- CPU
- results

# Interpreter

- source code
- interpreter
- results

# Interpreter is Virtual Machine simulate CPU

- fetch-and-execute cycle

# CPU fetch and execute cycle

- CPU
- Memory
- `Hard Disk` / Program

- program go from `Hard Disk` to `CPU`
- fetch instr / data from memory to CPU
- CPU execute logic
- CPU return results / data to memory

# Interpreter fetch and execute cycle

- compiler does
  - `fetch` next program statement
    - understand the statement
- `execute` precompiled machine code in its library

# execute step example

- library has code
- interpreter just execute the code following src code
- interpreter not generate machine code!

# platform independent

- machine code is platform dependent
- interpreter read src code and run machine code in library

# pros & cons of interpreter

- props
  - platform independent
  - no compile step
  - easier to update
- cons
  - slow
    - costly memory access operation
    - src code is re-interpreted every time
  - Interpreter is load into memory
