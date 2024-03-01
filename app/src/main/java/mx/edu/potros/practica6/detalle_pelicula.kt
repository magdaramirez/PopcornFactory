package mx.edu.potros.practica6

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class detalle_pelicula : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detalle_pelicula)

        val ivPeliculaImage: ImageView = findViewById(R.id.ivPeliculaImagen)
        val tvNombrePelicula: TextView = findViewById(R.id.tvNombrePelicula)
        val tvPeliculaDesc: TextView = findViewById(R.id.tvPeliculaDesc)

        val bundle=intent.extras
        if(bundle != null){
            ivPeliculaImage.setImageResource(bundle.getInt("header"))
            tvNombrePelicula.setText(bundle.getString("titulo"))
            tvPeliculaDesc.setText(bundle.getString("sinopsis"))
        }
    }
}