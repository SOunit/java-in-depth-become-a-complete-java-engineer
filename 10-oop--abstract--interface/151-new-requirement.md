# Sharing bookmarks

- alternative1

  - add `getItemData()` to `Bookmark`
    - cons
      - force to add `getItemData()` to `Movie`

- alternative2
  - add `getItemData()` to `Book`, `WebLink`
    - cons
      - no common protocol
      - no polymorphism

# Technical Requirement

- Common protocol for defining `optional capability`

  - define `getItemData()` in only `Book` & `WebLink`
  - common protocol

- multiple inheritance
