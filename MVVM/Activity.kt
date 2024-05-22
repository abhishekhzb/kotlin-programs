class MainActivity : AppCompatActivity() {
    
    private lateinit var userViewModel: UserViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Get the UserDao from the database
        val userDao = AppDatabase.getDatabase(application).userDao()
        
        // Create an instance of the Retrofit API service
        val apiService = RetrofitInstance.apiService
        
        // Create the UserRepository
        val repository = UserRepository(userDao, apiService)
        
        // Create the ViewModelFactory
        val viewModelFactory = UserViewModelFactory(repository)
        
        // Obtain the ViewModel
        userViewModel = ViewModelProvider(this, viewModelFactory).get(UserViewModel::class.java)

        // Observe the LiveData from the ViewModel
        userViewModel.allUsers.observe(this, Observer { users ->
            // Update UI
        })

        findViewById<Button>(R.id.button_add_user).setOnClickListener {
            userViewModel.fetchUserFromApi()
        }
    }
}

