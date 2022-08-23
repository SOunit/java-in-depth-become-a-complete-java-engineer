# Use Interfaces as Type

- Item52: Refer to objects by their interfaces

- using actual class / limited

```
void foo(ArrayList list){}
```

- interface / open

```
void foo(List list){}
```

- can use all of them
  - ArrayList
  - LinkedList
  - TreeList

# Benefits

- use implementations with better performance
- polymorphism benefits
  - maximum flexible code
  - clean code

# exceptions

- No interfaces. Use least specific class
- Specific subclass functionality is needed
