class UserViewModel(private val repository: UserRepository) : ViewModel() {
    
    val allUsers: LiveData<List<User>> = repository.allUsers

    fun insert(user: User) = viewModelScope.launch(Dispatchers.IO) {
        repository.insert(user)
    }

    fun delete(user: User) = viewModelScope.launch(Dispatchers.IO) {
        repository.delete(user)
    }

    fun fetchUserFromApi() = viewModelScope.launch(Dispatchers.IO) {
        val user = repository.fetchUserFromApi()
        insert(user)
    }
}
