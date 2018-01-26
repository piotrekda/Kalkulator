package com.example.piotr.bmicalc

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import java.lang.Math.pow

public class MainActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Result.setText("")
        Evaluation.setText("")
    }
    public fun Gogo(view: View){
        val height: String = height.text.toString()
        val weight: String = weight.text.toString()
        var pow: Double = pow(height.toDouble(),2.0)
        val BMI = weight.toDouble() / pow
        Result.setText("Your BMI is: $BMI")
        if(BMI <= 15){
            Evaluation.setText("very severely underweight")
        }else if(BMI >15 && BMI <=16){
            Evaluation.setText("severely underweight")
        }else if(BMI >15 && BMI <=16){
            Evaluation.setText("severely underweight")
        }else if(BMI >16 && BMI <=18.5){
            Evaluation.setText("underweight")
        }else if(BMI >18.5 && BMI <=25){
            Evaluation.setText("normal")
        }else if(BMI >25 && BMI <=30){
            Evaluation.setText("overweight")
        }else if(BMI >30 && BMI <=35){
            Evaluation.setText("obese class I")
        }else if(BMI >35 && BMI <=40){
            Evaluation.setText("obese class I")
        }else if(BMI >40){
            Evaluation.setText("obese class I")
        }
    }
}



