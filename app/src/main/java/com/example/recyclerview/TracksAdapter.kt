package com.example.recyclerview

import android.content.Context
import android.content.res.Resources
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.cardview.widget.CardView
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.snackbar.Snackbar

class TracksAdapter(
    var trackNameList: ArrayList<String>,
    var albumList: ArrayList<String>,
    var context: Context) : RecyclerView.Adapter<TracksAdapter.MusicViewHolder>() {

        class MusicViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){

            var tvMusic : TextView = itemView.findViewById(R.id.tvAudio)
            var tvAlbum : TextView = itemView.findViewById(R.id.tvAlbum)
            var cardView : CardView = itemView.findViewById(R.id.cvTracks)
            var layout : ConstraintLayout = itemView.findViewById((R.id.myLayout))
        }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MusicViewHolder {
        val view : View = LayoutInflater.from(parent.context)
            .inflate(R.layout.cardview, parent, false)
        return MusicViewHolder(view)
    }

    override fun getItemCount(): Int {
        return trackNameList.size
    }

    override fun onBindViewHolder(holder: MusicViewHolder, position: Int) {
        holder.tvMusic.text = trackNameList[position]
        holder.tvAlbum.text = albumList[position]
        holder.cardView.setOnClickListener {
            Toast.makeText(context, "You've selected the ${trackNameList.get(position)}"
            , Toast.LENGTH_LONG).show()
        }
    }

}

