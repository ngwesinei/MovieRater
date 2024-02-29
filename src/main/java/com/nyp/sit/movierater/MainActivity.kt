package com.nyp.sit.movierater

import android.os.Bundle
import android.support.annotation.IntegerRes
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.*

import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {


    var mrApp: MovieRaterApplication? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mrApp = MovieRaterApplication.getInstance()



        btnAddMovie.setOnClickListener{


                var id: Int = radLanguage.checkedRadioButtonId
                val radio:RadioGroup = findViewById(id)

                var strMessage:String="Title= ${editName.text}\nOverview=${editDesc.text}" +
                        "\nRelease date=${edtDate.text}\nLanguage=${radio.text}" +
                        "\nSuitable for all ages=${chkNotSuitable.isChecked}\n"

                        if(chkViolence.isChecked || chkLanguage.isChecked){
                            strMessage += "Reason :\n"
                            if(chkViolence.isChecked){
                                strMessage += "${chkViolence.text}\n"
                            }else if(chkLanguage.isChecked){
                                strMessage +="${chkLanguage.text}"
                            }
                        }else{

                        }

                displayAddMovieToast(strMessage)


        }
        chkNotSuitable.setOnClickListener{
            if(chkNotSuitable.isChecked){
                chkLanguage.setVisibility(View.VISIBLE)
                chkViolence.setVisibility(View.VISIBLE)
            }else{
                chkLanguage.setVisibility(View.INVISIBLE)
                chkViolence.setVisibility(View.INVISIBLE)
            }
        }

    }
    fun displayAddMovieToast(message:String){
        Toast.makeText(this,message,Toast.LENGTH_LONG).show()

    }

}
