package com.example.tabnavigation

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView


class MoviesFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
         val root = inflater.inflate(R.layout.fragment_movies, container, false)
        root.findViewById<TextView>(R.id.movie_genre)?.text= arguments?.getString(MOVIE_GENRE)
            ?:"Undefined Genre"

        return root
    }
    companion object{
        private const val MOVIE_GENRE= "MOVIE_GENRE"

        @JvmStatic
        fun newInstance(movieGenre: String): MoviesFragment{
            return MoviesFragment().apply {
                arguments= Bundle().apply {
                    putString(MOVIE_GENRE, movieGenre)
                }
            }
        }
    }


}