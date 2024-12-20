```kotlin
fun main() {
    val list = mutableListOf(1, 2, 3, 4, 5)
    list.removeIf { it > 2 }
    println(list) // Output: [1, 2]

    val set = mutableSetOf(1, 2, 3, 4, 5)
    set.removeIf { it > 2 }
    println(set) // Output: [1, 2]

    val map = mutableMapOf(1 to "one", 2 to "two", 3 to "three", 4 to "four", 5 to "five")
    map.removeIf { it.key > 2 }
    println(map) // Output: {1=one, 2=two}

    val map2 = mutableMapOf(1 to "one", 2 to "two", 3 to "three", 4 to "four", 5 to "five")
    //map2.entries.removeIf { it.key > 2 } //This will not compile
    map2.entries.removeIf { it.value.length > 3 }
    println(map2) // Output: {1=one, 2=two}
}
```