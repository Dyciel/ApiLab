package cl.dycier.apilab

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

private lateinit var getRequestButton : Button
private  var URL : String = "https://reqres.in/api/users"

class MainActivity : AppCompatActivity(), ApiCallback {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        getRequestButton = findViewById(R.id.getRequest)
        getRequestButton.setOnClickListener{
            val apiRequestTask = ApiTask(this)
            apiRequestTask.execute(URL)
        }

    }

    override fun onRequestComplete(result: String) {
        Toast.makeText(this,result,Toast.LENGTH_SHORT).show()
    }
}