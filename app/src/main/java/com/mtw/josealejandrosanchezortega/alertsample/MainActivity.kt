package com.mtw.josealejandrosanchezortega.alertsample

import android.content.DialogInterface
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.app.AlertDialog
import android.view.View
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


    }

    fun onClickShowAlert(view: View) {
        // SE CREA EL OBJETO DE ALERT
        var myAlertBuilder = AlertDialog.Builder(this@MainActivity)

        // SE ESTABLECE EL TITILO DEL DIALOGO
        myAlertBuilder.setTitle(getString(R.string.alert_title))

        // SE ESTABLECE EL MENSAJE PRINCIPAL DEL DIALOGO
        myAlertBuilder.setMessage(getString(R.string.alert_message))

        // SE AGREGA EL BOTON "OK" AL DIALOGO
        // REFERENCIA DE EJEMPLO: https://android--code.blogspot.com/2018/02/android-kotlin-alertdialog-example.html
        myAlertBuilder.setPositiveButton(getString(R.string.ok)) { dialog, which ->
            Toast.makeText(applicationContext, getString(R.string.pressed_ok), Toast.LENGTH_LONG).show()
        }

        // SE AGREGA EL BOTON "CANCEL" AL DIALOGO
        // REFERENCIA DE EJEMPLO: https://android--code.blogspot.com/2018/02/android-kotlin-alertdialog-example.html
        myAlertBuilder.setNegativeButton(getString(R.string.cancel)) { dialog, which ->
            Toast.makeText(applicationContext, getString(R.string.pressed_cancel), Toast.LENGTH_LONG).show()
        }

        // REFERENCIA DE EJEMPLO, UN PASO PREVIO: https://android--code.blogspot.com/2018/02/android-kotlin-alertdialog-example.html
        val dialog = myAlertBuilder.create()

        // SE MUESTRA EL ALERT DEL DIALOGO
        dialog.show()
    }
}
