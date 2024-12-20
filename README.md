# Kotlin Collection removeIf() Gotchas

This repository demonstrates unexpected behavior and potential pitfalls when using the `removeIf()` function on different Kotlin collection types (List, Set, Map).  The behavior is consistent, but the methods for achieving the desired results can be confusing.

The key issue lies in the way `removeIf()` interacts with `Map` entries.  While straightforward for `List` and `Set`, maps require a different approach.

## Usage

The `bug.kt` file shows the different behaviors with Lists, Sets, and Maps.  The `bugSolution.kt` file provides a clear and efficient solution.

## Contributing

Contributions are welcome!
