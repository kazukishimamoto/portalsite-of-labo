package Test

import ModelTest.User
import org.springframework.stereotype.Repository

@Repository
class UserRepositoryDomaImpl(
        private val userDomaDao: UserDomaDao
) : UserRepository {
    override fun findAll(): List<User> {
        return userDomaDao.selectAll().map { _mapToModel(it) }
    }

    override fun findById(id: Int): User? {
        return userDomaDao.selectById(id)?.let { _mapToModel(it) }
    }

    // ここでDomaのEntity(Java)をドメインのModel(Kotlin)に詰め替える
    private fun _mapToModel(domaEntity: UserDomaEntity): User {
        return User(
                id = domaEntity.id,
                name = domaEntity.name,
                tag = domaEntity.tag,
                year = domaEntity.year,
                description = domaEntity.description,
                url = domaEntity.url
        )
    }
}