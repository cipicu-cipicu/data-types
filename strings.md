# Java Strings (String data type)

Key Points:

##1. How to create a new string

Using string literals:

```
String str = "Hello";
```

Using the constructor (new keyword):

```
String str = new String("Hello");
```

Creating a string using string literal assignment is generally preferred over using a constructor. It is syntactically
simpler and cleaner, making the code easier to read and write.


##2. The String class

The String class provides numerous methods for string manipulation, such as `equals()`, `length()`, `substring()`,
`contains()`, `toLowerCase()`, `toUpperCase()`, and many more. These methods are essential for string processing tasks.  

When checking that two strings have the same content we do not use == instead we use the method `equals()`

##3. String concatenation

When concatenating strings you can use the + operator (internally a `StringBuilder` is used). For a single statement
concatenation, using + is fine, but in a loop, it's better to use StringBuilder or StringBuffer.

##4. Regular Expressions

The String class supports regular expressions through methods like `matches()`, `split()`, `replaceAll()`, and
`replaceFirst()`, which are powerful tools for pattern matching and text processing.
  
.
