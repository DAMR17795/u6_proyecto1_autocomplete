package www.iesmurgi.u6_proyecto1_autocomplete

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.AutoCompleteTextView
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    private lateinit var  miPoblacion:AutoCompleteTextView
    private lateinit var miDescripcion:TextView
    private lateinit var miDistancia:TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        miPoblacion=findViewById(R.id.actPoblacion)

        //1.-Poblar desde <String-array>
        setOpcionArrays()

        //2.-Poblar desde Listener
        //setOpcionList()
    }

    private fun setOpcionList() {

    }

    private fun setOpcionArrays(){
        val poblaciones=resources.getStringArray(R.array.muchaspoblaciones)
        ArrayAdapter(this, android.R.layout.simple_list_item_1, poblaciones).also {arrayAdapter -> miPoblacion.setAdapter(arrayAdapter)}
    }
}