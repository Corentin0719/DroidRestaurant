package fr.isen.chieze.androiderestaurant

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button


class HomeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)


        // get reference to button
        val btn_click_entrees = findViewById<Button>(R.id.entrees)
        val btn_click_plats = findViewById(R.id.plats) as Button
        val btn_click_desserts = findViewById(R.id.desserts) as Button

        // set on-click listener
        btn_click_entrees.setOnClickListener {
            startCategory(getString(R.string.entrees))

        }

        btn_click_plats.setOnClickListener {
            startCategory(getString(R.string.plats))

        }

        btn_click_desserts.setOnClickListener {
            startCategory(getString(R.string.desserts))
        }


    }

    override fun onStop(){
        super.onStop()
        Log.d("HomeActivity","L'activité est arrêtée")
    }
    override fun onDestroy() {
        super.onDestroy()
        Log.d("HomeActivity","L'activité est dértuite")
    }

    private fun startCategory( string :String) {
        val intent = Intent(this, CategoryActivity::class.java)
        intent.putExtra(CATEGORY_KEY, string)
        startActivity(intent)
    }

    companion object{
        const val CATEGORY_KEY="category"
    }
}