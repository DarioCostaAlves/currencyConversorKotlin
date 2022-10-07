package pt.ipmaia.exercise01

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import java.math.RoundingMode

class MainActivity : AppCompatActivity() {
    lateinit var oBotao: Button
    lateinit var oBotao2: Button
    lateinit var oEuro: EditText
    lateinit var oEuro2: EditText
    lateinit var aLibra: EditText
    lateinit var oDolar: EditText

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //LIRBA-EURO
        oBotao = findViewById(R.id.botaoConverter)
        oEuro = findViewById(R.id.campoEuro)
        aLibra = findViewById(R.id.campoLibra)

        //DOLAR-EURO
        oBotao2 = findViewById(R.id.botaoConverter2)
        oDolar = findViewById(R.id.campoDolar)
        oEuro2 = findViewById(R.id.campoEuro2)

        //BOTAO 1 - CONVERSÃO 1 - LIBRA-EURO
        oBotao.setOnClickListener {

            val libra = aLibra.text.toString().toDouble()

            val convertedEuro1 = (libra * 1.143061).toBigDecimal().setScale(2, RoundingMode.UP).toDouble()
            oEuro.setText(convertedEuro1.toString())
        }

        //BOTAO 2 - CONVERSÃO 2 DOLAR-EURO
        oBotao2.setOnClickListener {

            val dolar = oDolar.text.toString().toDouble()

            val convertedEuro2 = (dolar * 1.020144).toBigDecimal().setScale(2, RoundingMode.UP).toDouble()
            oEuro2.setText(convertedEuro2.toString())
        }

    }
}