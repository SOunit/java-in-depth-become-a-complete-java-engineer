# Item20: Prefer class hierarchies to tagged class

- tag class

  ```
    public class Bookmark{
        private final String bookmarkType; // TagField

        public Bookmark(){
            this.bookmarkType = "book";
        }

        public Bookmark(String director){
            this.bookmarkType = "movie";
        }

        public someFunc(){
            if(bookMarkType == "book"){

            }
            if(bookMarkType == "movie"){

            }
        }
    }
  ```

  - verbose
  - error prone
    - against `single responsible principle`
  - inefficient

# tagged class hierarchy

- better design
- flexible code
  - add new class as subclass
