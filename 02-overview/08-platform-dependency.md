# Platform Dependency

# Compile

- Windows

  - Hello.c
  - `gcc -o Hello Hello.c`
  - compilation / compile & link
  - machine code
  - Hello.exe
    - 00011101001001
  - execute by `Hello`

- Linux

  - Hello.c
  - `gcc -o Hello Hello.c`
  - compilation / compile & link
  - machine code
  - Hello.out
    - 00011101001001
  - execute by `./Hello`

# Platform dependency

- Machine code is different so Executable file from Windows can not run on Linux

# Platform Dependency Reason

- Operating System

  - Executable File Format
    - Windows: PE / Portable Executable
    - Linux: ELF / Executable and Linkable Format
  - System Calls
    - file open

- Hardware
  - Processor
