package fr.isen.chieze.androiderestaurant


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class CategoryActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_category)

        val intent = intent;
        val textView: TextView = findViewById(R.id.categoryTitle)
        val str = intent.getStringExtra(HomeActivity.CATEGORY_KEY)

    }
}