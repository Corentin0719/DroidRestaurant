package fr.isen.chieze.androiderestaurant

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        // get reference to button
        val btn_click_entrees = findViewById(R.id.entree) as TextView
        val btn_click_plats = findViewById(R.id.plat) as TextView
        val btn_click_desserts = findViewById(R.id.dessert) as TextView

        // set on-click listener
        btn_click_entrees.setOnClickListener {
            Toast.makeText(this, "You clicked entree.", Toast.LENGTH_SHORT).show()
        }

        btn_click_plats.setOnClickListener {
            Toast.makeText(this, "You clicked plats.", Toast.LENGTH_SHORT).show()
        }

        btn_click_desserts.setOnClickListener {
            Toast.makeText(this, "You clicked dessert.", Toast.LENGTH_SHORT).show()
        }

    }
}