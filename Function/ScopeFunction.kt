data class Person(var name: String, var age: Int)

fun main() {
    // Using the 'apply' scope function
    val person1 = Person("Alice", 30).apply {
        name = "Bob"
        age = 35
    }
    println(person1) // Output: Person(name=Bob, age=35)

    // Using the 'let' scope function
    val person2 = Person("Charlie", 25)
    val modifiedPerson = person2.let { p ->
        p.age += 5
        "Modified $p"
    }
    println(modifiedPerson) // Output: Modified Person(name=Charlie, age=30)

    // Using the 'run' scope function
    val person3 = Person("David", 40)
    val result = person3.run {
        name = "Emily"
        age -= 10
        "Name: $name, Age: $age"
    }
    println(result) // Output: Name: Emily, Age: 30

    // Using the 'with' scope function
    val person4 = Person("Frank", 50)
    val message = with(person4) {
        age += 20
        "Updated age to $age"
    }
    println(message) // Output: Updated age to 70

    // Using the 'also' scope function
    val person5 = Person("Grace", 60)
    val updatedPerson = person5.also { p ->
        p.name = p.name.toUpperCase()
    }
    println(updatedPerson) // Output: Person(name=GRACE, age=60)
}

