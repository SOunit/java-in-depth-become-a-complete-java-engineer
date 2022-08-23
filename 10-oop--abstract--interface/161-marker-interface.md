# marker interfaces

- No methods
- Merely `marks` a class as having some property

# marker interface example

- `java.util.RandomAccess`

  - fast random access
    - list has this interface

- `java.io.Serializable`
  - serializability
    - object can be serialized

# example

- Collections.shuffle(List)
  - list instanceof RandomAccess
    - if true:
      - apply shuffle directly
    - if false:
      - copy elements to array
      - shuffle array
      - dump array back into list
