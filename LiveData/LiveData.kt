// Activity Class

class MainActivity : AppCompatActivity() {
   
  private lateinit var viewModel: MyViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        viewModel = ViewModelProvider(this).get(MyViewModel::class.java)

        viewModel.message.observe(this, Observer { message ->
            textView.text = message
        })

        button.setOnClickListener {
            viewModel.updateMessage("LiveData is awesome!")
        }
        
    }
}

//................................................................
// ViewModel Class

class MyViewModel : ViewModel() {

    private val _message = MutableLiveData<String>()

    val message: LiveData<String>
        get() = _message

    init {
        _message.value = "Hello, LiveData!"
    }

    fun updateMessage(newMessage: String) {
        _message.value = newMessage
    }
}

