package com.tuwaiq.projectone.registerFragment

import androidx.lifecycle.ViewModel
import androidx.navigation.NavController
import com.tuwaiq.projectone.repo.Repo

class RegisterViewModel : ViewModel() {

    private val repo: Repo = Repo.getInstance()

    fun register(name: String, username: String, email: String, password: String, findNavController: NavController) {
        repo.register(name, username, email, password, findNavController)
    }
}