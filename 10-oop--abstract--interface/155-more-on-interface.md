# extending interface

- more specialize interface

```
public interface List extends Collection {}
```

# extends multiple interfaces

```
public interface BlockingDeque extends BlockingQueue, Deque{}
```

# why variables are static & final in interface?

- static
  - interfaces are `non-instantiable`
- final
  - interfaces represent `pure contracts`
    - like an agreement set in stone

# variable name crash

```
public interface A {
    int VAL = 42;
}
```

```
public interface B {
    int VAL = 50;
}
```

```
class X implements A, B {
    void foo(){
        int i = VAL; // compile error
        int i = B.VAL; // ok
    }
}
```
