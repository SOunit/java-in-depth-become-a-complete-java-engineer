# item18: prefer interfaces to abstract classes

# when to prefer interfaces?

- mixins
- representative behavior with no state
  - java not support multiple inheritance

# when to use abstract classes?

- core identity of subclasses
  - representative behavior with state
- skelton implementation

# abstract sample

- RandomAccess<Interface>
- Cloneable<Interface>
- Serializable<Interface>
- List<Interface>
  - AbstractList<Abstract>
    - ArrayList

# use utmost care when designing interfaces
