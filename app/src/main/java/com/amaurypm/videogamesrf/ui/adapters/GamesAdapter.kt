package com.amaurypm.videogamesrf.ui.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.amaurypm.videogamesrf.data.remote.model.BookDto
import com.amaurypm.videogamesrf.databinding.GameElementBinding
import com.squareup.picasso.Picasso

/**
 * Creado por Amaury Perea Matsumura el 02/09/23
 */
class GamesAdapter(
    private val games: List<BookDto>,
    private val onGameClicked: (BookDto) -> Unit
): RecyclerView.Adapter<GamesAdapter.ViewHolder>() {

    class ViewHolder(private val binding: GameElementBinding): RecyclerView.ViewHolder(binding.root){

        val ivThumbnail = binding.ivThumbnail

        fun bind(game: BookDto){
            binding.tvTitle.text = game.titulo
            binding.tvAutor.text = game.autor // Agregar el autor
            binding.tvPieDeImprenta.text = game.pie_de_imprenta // Agregar el pie de imprenta
            binding.tvClasificacion.text = game.clasificación // Agregar la clasificación

            // Cargar la imagen utilizando Picasso (Puedes usar Glide de manera similar)
            Picasso.get()
                .load(game.thumbnail)
                .into(ivThumbnail)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding = GameElementBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(binding)
    }

    override fun getItemCount(): Int = games.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val game = games[position]

        holder.bind(game)

        // Procesamiento del clic al elemento
        holder.itemView.setOnClickListener {
            onGameClicked(game)
        }
    }
}
