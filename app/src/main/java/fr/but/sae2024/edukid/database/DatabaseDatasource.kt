package fr.but.sae2024.edukid.database

import fr.but.sae2024.edukid.models.app.User

object DatabaseDatasource {


    suspend fun insertUser(user: User) {
        return EdukidDatabase.getInstance().userDao().insertUser(user)
    }

    suspend fun deleteUser(user: User) {
        return EdukidDatabase.getInstance().userDao().deleteUser(user)
    }

    suspend fun getAllUsers(): List<User> {
        return EdukidDatabase.getInstance().userDao().getAllUsers()
    }
}