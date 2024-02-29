package com.nyp.sit.movierater

import android.os.Bundle
import android.support.v7.app.AppCompatActivity

class AddMovieActivity : AppCompatActivity() {


    var mrApp: MovieRaterApplication? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add_movie)


        mrApp = MovieRaterApplication.getInstance()


    }

}
