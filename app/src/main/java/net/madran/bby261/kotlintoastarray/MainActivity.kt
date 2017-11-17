package net.madran.bby261.kotlintoastarray

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import android.view.Gravity



class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    val mesajlar = arrayOf("Mesaj 1", "mesaj 2", "mesaj 3")
    var mesajNo = 0

    fun mesajiOlustur(){
        val toast = Toast.makeText(applicationContext, mesajlar[mesajNo], Toast.LENGTH_SHORT)
        toast.setGravity(Gravity.CENTER_VERTICAL or Gravity.CENTER_HORIZONTAL, 0, 0)
        toast.show()
    }

    fun mesajiGoruntule(view: View){
        if(mesajNo < mesajlar.size) {
            mesajiOlustur()
            mesajNo++
        }
        else {
            mesajNo = 0
            mesajiOlustur()
        }
    }
}
