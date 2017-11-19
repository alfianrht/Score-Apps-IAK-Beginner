package com.example.al.iakbeginner

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

/**
 * Created by al on 19/11/17.
 */

class MainActivity : AppCompatActivity() {


//    deklarasi variable untuk score

    var scoreTeamA: Int = 0
    var scoreTeamB: Int = 0


    // ctrl O untuk override

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        teamA()
        teamB()

        btn_reset.setOnClickListener({
            nli_a.text = "0"
            nli_b.text = "0"
            scoreTeamA = 0
            scoreTeamB = 0
        })

    }

    fun teamA() {
        btn_3_a.setOnClickListener({
            scoreTeamA = scoreTeamA + 3
            nli_a.text = "$scoreTeamA"
        })

        btn_2_a.setOnClickListener({
            scoreTeamA = scoreTeamA + 2
            nli_a.text = "$scoreTeamA"
        })

        btn_1_a.setOnClickListener({
            scoreTeamA = scoreTeamA + 1
            nli_a.text = "$scoreTeamA"
        })
    }

    fun teamB() {
        btn_3_b.setOnClickListener({
            scoreTeamB = scoreTeamB + 3
            nli_b.text = "$scoreTeamB"
        })

        btn_2_b.setOnClickListener({
            scoreTeamB = scoreTeamB + 2
            nli_b.text = "$scoreTeamB"
        })

        btn_1_b.setOnClickListener({
            scoreTeamB = scoreTeamB + 1
            nli_b.text = "$scoreTeamB"
        })
    }
}
