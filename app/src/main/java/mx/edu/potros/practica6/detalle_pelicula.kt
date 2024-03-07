package mx.edu.potros.practica6

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class detalle_pelicula : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detalle_pelicula)

        val ivPeliculaImage: ImageView = findViewById(R.id.ivPeliculaImagen)
        val tvNombrePelicula: TextView = findViewById(R.id.tvNombrePelicula)
        val tvPeliculaDesc: TextView = findViewById(R.id.tvPeliculaDesc)
        val btnBuyTickets: Button = (findViewById(R.id.btnBuyTickets))

        val bundle=intent.extras
        if(bundle != null){
            ivPeliculaImage.setImageResource(bundle.getInt("header"))
            tvNombrePelicula.setText(bundle.getString("titulo"))
            tvPeliculaDesc.setText(bundle.getString("sinopsis"))
        }

        btnBuyTickets.setOnClickListener{
                var intent: Intent = Intent(this, seatSelection::class.java)
                this.startActivity(intent)
        }
    }
}