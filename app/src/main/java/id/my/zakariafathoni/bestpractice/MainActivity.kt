package id.my.zakariafathoni.bestpractice

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.cardview.widget.CardView
import com.denzcoskun.imageslider.ImageSlider
import com.denzcoskun.imageslider.constants.ScaleTypes
import com.denzcoskun.imageslider.models.SlideModel

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val imageSlider = findViewById<ImageSlider>(R.id.image_slider)
        val imageList = ArrayList<SlideModel>()

        imageList.add(SlideModel(R.drawable.carousel1,))
        imageList.add(SlideModel(R.drawable.carousel2,))
        imageList.add(SlideModel(R.drawable.carousel3,))

        imageSlider.setImageList(imageList, ScaleTypes.FIT)

        var container1 : CardView = findViewById(R.id.container1)
        var container2 : CardView = findViewById(R.id.container2)
        var container3 : CardView = findViewById(R.id.container3)
        var container4 : CardView = findViewById(R.id.container4)

        container1.setOnClickListener{
            val intent= Intent(this, DetailActivity::class.java)
            intent.putExtra("image", R.drawable.food_drink)
            intent.putExtra("title", "Makanan & Minuman")
            startActivity(intent)
        }
        container2.setOnClickListener{
            val intent= Intent(this, DetailActivity::class.java)
            intent.putExtra("image", R.drawable.home_kitchen)
            intent.putExtra("title", "Rumah & Dapur")
            startActivity(intent)
        }
        container3.setOnClickListener{
            val intent= Intent(this, DetailActivity::class.java)
            intent.putExtra("image", R.drawable.mom_baby)
            intent.putExtra("title", "Ibu & Anak")
            startActivity(intent)
        }
        container4.setOnClickListener{
            val intent= Intent(this, DetailActivity::class.java)
            intent.putExtra("image", R.drawable.health_beauty)
            intent.putExtra("title", "Kesehatan & kecantikan")
            startActivity(intent)
        }

    }

}