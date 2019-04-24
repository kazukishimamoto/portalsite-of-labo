package Model

import java.util.concurrent.atomic.AtomicInteger

class UserDao {

    val users = hashMapOf(
            0 to User("Alice", "alice@alice.kt", 0),
            1 to User("Bob", "bob@bob.kt", 1),
            2 to User("Carol", "carol@carol.kt", 2),
            3 to User("Dave", "dave@dave.kt", 3)
    )

    val lastId: AtomicInteger = AtomicInteger(users.size - 1)

    fun save(name: String, email: String) {
        val id = lastId.incrementAndGet()
        users.put(id, User(name = name, email = email, id = id))
    }

    fun findById(id: Int): User? {
        return users[id]
    }

    fun findByEmail(email: String): User? {
        return users.values.find { it.email == email }
    }

    fun update(id: Int, name: String, email: String) {
        users.put(id, User(name = name, email = email, id = id))
    }

    fun delete(id: Int) {
        users.remove(id)
    }
}