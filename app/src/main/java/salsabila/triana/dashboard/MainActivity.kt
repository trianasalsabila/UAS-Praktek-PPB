package salsabila.triana.dashboard

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity(), View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        val btn_grip: Button = findViewById(R.id.btn_grip)
        btn_grip.setOnClickListener(this)

        val btn_blow: Button = findViewById(R.id.btn_blow)
        btn_blow.setOnClickListener(this)

        val btn_service: Button = findViewById(R.id.btn_service)
        btn_service.setOnClickListener(this)

        val btn_equipment: Button = findViewById(R.id.btn_equipment)
        btn_equipment.setOnClickListener(this)
    }

    override fun onClick(v: View) {
        when(v.id) {
            R.id.btn_grip -> {
                val moveActivity = Intent(this, GripSkill::class.java)
                startActivity(moveActivity)
            }

            R.id.btn_blow -> {
                val moveActivity = Intent(this, blowskill::class.java)
                startActivity(moveActivity)
            }

            R.id.btn_service -> {
                val moveActivity = Intent(this, serviceskill::class.java)
                startActivity(moveActivity)
            }

            R.id.btn_equipment -> {
                val moveActivity = Intent(this, equipmentskill::class.java)
                startActivity(moveActivity)
            }
                }
            }
        }