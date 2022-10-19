package hello.arief.katacalc

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val txtNumber1 = findViewById<EditText>(R.id.txtNumber1)
        val txtNumber2 = findViewById<EditText>(R.id.txtNumber2)
        val txtHasil = findViewById<EditText>(R.id.txtHasil)

        val btnTambah = findViewById<Button>(R.id.btnTambah)
        val btnKali = findViewById<Button>(R.id.btnKali)

        btnTambah.setOnClickListener {
            if (txtNumber1.text.toString().isEmpty() || txtNumber2.text.toString().isEmpty()) {
                txtNumber1.error = "Semua input harus diisi!"
            } else {
                val a = txtNumber1.text.toString().toDouble()
                val b = txtNumber2.text.toString().toDouble()
                val c = this.tambah(a, b)
                txtHasil.setText(c.toString())
            }
        }

        btnKali.setOnClickListener {
            if (txtNumber1.text.toString().isEmpty() || txtNumber2.text.toString().isEmpty()) {
                txtNumber1.error = "Semua input harus diisi!"
            } else {
                val a = txtNumber1.text.toString().toDouble()
                val b = txtNumber2.text.toString().toDouble()
                val c = this.kali(a, b)
                txtHasil.setText(c.toString())
            }
        }

    }

    fun tambah(a: Double, b: Double): Double {
        return a + b
    }

    fun kali(a: Double, b: Double): Double {
        return a * b
    }

}