# initializer

- static
- instance

# static initializer

- good use cases

  - populate data structure
  - initialization with error handling

- sample1

  ```
  static HashMap map = new HashMap();

  static {
      map.put("John", "111-222-3333");
      map.put("Anita", "222-333-4444");
  }
  ```

- sample2

  ```
  static Staff staff;

  static{
      try{
          stuff = new Stuff();
      }catch(Exception e){
          ...
      }
  }
  ```

# private static method

- sample1

  ```
    static Stuff stuff = initializeStaff();

    private static Stuff initializeStaff(){
        try{
            return getStaff();
        }catch(Exception e){
            ...
        }
        return null;
    }
  ```

# instance initializer

- initialize instance variables
- why instance initializer?
  - reuse initialize logic in multiple constructor
  - instance initializer always run before constructor

```
{
    ...
}
```
