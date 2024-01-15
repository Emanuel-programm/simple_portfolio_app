package com.example.portfolioapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnSkills=findViewById<Button>(R.id.btnSkills)

       btnSkills.setOnClickListener{
           intent= Intent(this,SkillsActiviy::class.java)
           startActivity(intent)
       }

        val btnEducation=findViewById<Button>(R.id.btnEducation)
        btnEducation.setOnClickListener{
            intent=Intent(this,EducationActivity::class.java)
            startActivity(intent)
        }

        val btnWork=findViewById<Button>(R.id.btnWork)
        btnWork.setOnClickListener{
            intent=Intent(this,WorkActivity::class.java)
            startActivity(intent)
        }

        val btnAchievement=findViewById<Button>(R.id.btnAchivement)

        btnAchievement.setOnClickListener{
            intent=Intent(this,AchivementActivity::class.java)
            startActivity(intent)
        }


    }
}