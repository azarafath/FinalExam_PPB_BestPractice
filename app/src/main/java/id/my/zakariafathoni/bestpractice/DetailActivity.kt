package id.my.zakariafathoni.bestpractice

import android.content.Intent
import android.media.Image
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class DetailActivity : AppCompatActivity() {
    var titlevalue = ""
    var imagevalue = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        val backButton : ImageView = findViewById(R.id.backButton)
        backButton.setOnClickListener{
            startActivity(Intent(this, MainActivity::class.java))
        }

        val banner : ImageView = findViewById(R.id.banner)
        val title : TextView = findViewById(R.id.title)
        val bundle = intent.extras
        if (bundle != null) {
            imagevalue = bundle.getInt("image")
            titlevalue = bundle.getString("title").toString()
        }

        banner.setImageResource(imagevalue)
        title.text = titlevalue
    }
}

