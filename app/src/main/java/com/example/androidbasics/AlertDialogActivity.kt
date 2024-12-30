package com.example.androidbasics

import android.app.AlertDialog
import android.content.DialogInterface
import android.os.Bundle
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.androidbasics.databinding.ActivityAlertDialogBinding
import kotlin.math.sin

class AlertDialogActivity : AppCompatActivity() {
    private lateinit var binding: ActivityAlertDialogBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAlertDialogBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Add Contact AlertDialog
        val addContactDialog = AlertDialog.Builder(this)
        addContactDialog.setTitle("Add Contact")
        addContactDialog.setMessage("Do you want to add Mr. Maaz to Your Contact List?")
        addContactDialog.setIcon(R.drawable.ic_contact_foreground)
        // if we don't want to use lambda expression arguments for that variables then we will do _ (underscore) on that place.
        addContactDialog.setPositiveButton("YES", DialogInterface.OnClickListener { _, _ ->
            Toast.makeText(this, "You Added MR. Maaz to Your Contact List", Toast.LENGTH_LONG).show()
        })
        addContactDialog.setNegativeButton("NO", DialogInterface.OnClickListener { _, _ ->
            Toast.makeText(this, "You Didn't Add MR. Maaz to Your Contact List", Toast.LENGTH_LONG).show()
        })
        addContactDialog.create()

        // Show Dialog 1
        binding.btnDialog1.setOnClickListener {
            addContactDialog.show()
        }

        // Dialog button 2
        val arrOptions = arrayOf("First Item", "Second Item", "Third Item")
        val singleChoiceDialog = AlertDialog.Builder(this)
        singleChoiceDialog.setTitle("Choose One of these Options")
        singleChoiceDialog.setSingleChoiceItems(arrOptions, 0, DialogInterface.OnClickListener { dialogInterface, i ->
            Toast.makeText(this, "You Clicked On ${arrOptions[i]}", Toast.LENGTH_LONG).show()
        })
        singleChoiceDialog.setPositiveButton("Accept", DialogInterface.OnClickListener { _, _ ->
            Toast.makeText(this, "You accepted to Single Choice Dialog", Toast.LENGTH_LONG).show()
        })
        singleChoiceDialog.setNegativeButton("Decline", DialogInterface.OnClickListener { _, _ ->
            Toast.makeText(this, "You Declined the Single Choice Dialog", Toast.LENGTH_LONG).show()
        })
        singleChoiceDialog.create()

        // Show Dialog 2
        binding.btnDialog2.setOnClickListener {
            singleChoiceDialog.show()
        }

        // Dialog button 3
        val multiChoiceDialog = AlertDialog.Builder(this)
        multiChoiceDialog.setTitle("Choose One of these Options")
        // 1. array, 2. boolean array for first time check.
        multiChoiceDialog.setMultiChoiceItems(arrOptions, booleanArrayOf(true, false, true)) { _, i, isChecked ->
            if (isChecked) {
                Toast.makeText(this, "You Checked ${arrOptions[i]}", Toast.LENGTH_LONG).show()
            } else {
                Toast.makeText(this, "You unChecked ${arrOptions[i]}", Toast.LENGTH_LONG).show()
            }
        }
        multiChoiceDialog.setPositiveButton("Accept", DialogInterface.OnClickListener { _, _ ->
            Toast.makeText(this, "You accepted to Multi Choice Dialog", Toast.LENGTH_LONG).show()
        })
        multiChoiceDialog.setNegativeButton("Decline", DialogInterface.OnClickListener { _, _ ->
            Toast.makeText(this, "You Declined the Multi Choice Dialog", Toast.LENGTH_LONG).show()
        })
        multiChoiceDialog.create()

        binding.btnDialog3.setOnClickListener {
            multiChoiceDialog.show()
        }

    }
}