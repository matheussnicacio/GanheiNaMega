package co.tiagoaguiar.ganheinamega

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // aqui onde voce decide o que app vai fazer...
        setContentView(R.layout.activity_main)

        // buscar os objetos e ter referencia deles
        val editText : EditText = findViewById(R.id.edit_number)
        val txtResult : TextView = findViewById(R.id.txt_result)
        val btnGenerate : Button = findViewById(R.id.btn_generate)

        // opção 1 : XML

        // opção 2 : variavel que seja do tipo (objeto anonimo) view.OnClickListener (interface)

        // !! opção 3 : mais simples possivel - bloco de codigo que sera disparado pelo onClickListener

        btnGenerate.setOnClickListener{
            // aqui podemos colocar nossa logica de programação. Porque será disparado depois do
            // evento touch do usuario
            val text = editText.text.toString()

            numberGenerator(text, txtResult)

        }
    }
private fun numberGenerator(text : String, txtResult : TextView){

    // validar quando o campo é vazio
    if (text.isNotEmpty()){

        val qtd = text.toInt() //Convert to String

        if (qtd >= 6 && qtd <= 15){

        }else {
            Toast.makeText(this, "informe um numero entre 6 e 15", Toast.LENGTH_LONG).show()
        }

    }else{
Toast.makeText(this, "informe um numero entre 6 e 15", Toast.LENGTH_LONG).show()
    }


    // validar se ocampo informado é entre 6 a 15

}

    // opção 2 :  variavel que seja do tipo (objeto anonimo) view.OnClickListener (interface)
//    val buttonClickListener = View.OnClickListener{
//            Log.i("Teste","Botao clicado!!!")
//    }

    // opção 2 :  variavel que seja do tipo (objeto anonimo) view.OnClickListener (interface)
//    val buttonClickListener = object : View.OnClickListener{
//        // quem chama o onclick é o proprio SDK do Android que dispara apos eventos de touch
//        override fun onClick(v: View?) {
//        Log.i("Teste","Botao clicado!!!")
//        }
    }

    // opção 1 : XML
//    fun buttonClicked (view : View){
//        Log.i("Teste","Botao clicado!!!")
//    }
//}