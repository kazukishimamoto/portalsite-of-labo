package Test

import ModelTest.User

interface UserRepository{
    fun findAll(): List<User>
    fun findById(id: Int): User?
}