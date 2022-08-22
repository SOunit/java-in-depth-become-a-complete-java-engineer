# Item56: Adhere to generally accepted naming conventions

- typographical
  - appearance
    - uppercase, etc.
- grammatical
  - part of speech

# Typographical - Package

- lowercase alphabet
- generally, short(< 8) and single word
- meaningful abbreviations
  - e.g. util for utilities
- acronyms are fine
  - e.g. `awt` for `Abstract Window Toolkit`
- never start with `java` or `javax`
- use organization's reverse internet domain name

# Typographical - Case

- Class / Interfaces

  - Capitalize first letters
    - e.g. `BufferedWriter`

- methods/ variables

  - camel-case
    - e.g. `getArea`, `studentCount`

- static final variables
  - ALL CAPS with underscore
    - e.g. `static final int COPY_THRESHOLD = 10;`

# Typographical - abbreviations

- Class / Methods / Fields

  - avoid abbreviations
  - exception
    - `min`
    - `max`
  - Acronyms are fine
    - e.g. `HttpUrl`

- Local Variables
  - Abbreviation & acronyms are fine
  - Meaningful individual characters are fine
    - `x`,`y`,`z` for co-ordinates / position info
    - `i` for index

# Grammatical Classes

- Singular noun or noun phrase
  - e.g. `User`, `BufferedWriter`
  - simple & descriptive

# Grammatical methods

- Performing action

  - Verb or verb phrase
    - e.g. `append` or `calculateDistance`
  - use descriptive name
  - don't hesitate to use longer names

- boolean return type

  - is followed by noun or noun phrase

    - e.g. noun - `isDigit`
    - e.g. adjective - `isEmpty`
    - e.g. `isActive` & `setActive`

  - Sometimes, has is used
    - e.g. `hasLicense`

- non-boolean attribute of object
  - noun or noun phrase
    - e.g. `gender`, `hashCode`
  - getAttribute
    - e.g. `setGender`, `getGender`

# special methods

- Object type conversion
  - toType - e.g. `toString`, `toArray`
- static factory methods
  - `valueOf`, `of`, `getInstance`, `newInstance`, `getType`, `newType`

# Grammatical - fields

- boolean
  - usually, adjectives
  - `active` instead of `isActive`
- non-boolean
  - noun or noun phrase
- singular & plural nouns
  - `item`, `list`
- name object of same class by purpose
  - `void sendMessage(User sender, User receiver){}`
