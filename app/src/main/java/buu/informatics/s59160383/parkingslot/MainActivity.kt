package buu.informatics.s59160383.parkingslot

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    val book: ArrayList<Booking> = ArrayList<Booking>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        book.add(0, Booking("", "", ""))
        book.add(1, Booking("", "", ""))
        book.add(2, Booking("", "", ""))

        findViewById<Button>(R.id.empty_slot1).setOnClickListener {
            emptyButton1()
        }
        findViewById<Button>(R.id.empty_slot2).setOnClickListener {
            emptyButton2()
        }
        findViewById<Button>(R.id.empty_slot3).setOnClickListener {
            emptyButton3()
        }

    }
    private fun emptyButton1(){
        val empty1 = findViewById<Button>(R.id.empty_slot1)
        val plate = findViewById<EditText>(R.id.plate_edit)
        val brand = findViewById<EditText>(R.id.brand_edit)
        val owner = findViewById<EditText>(R.id.owner_edit)

            plate.setText(book.get(0).plate).toString()
            brand.setText(book.get(0).brand).toString()
            owner.setText(book.get(0).owner).toString()

        var platenum = plate.text
        var brandname = brand.text
        var name = owner.text
        findViewById<Button>(R.id.button_update).setOnClickListener {
            book.removeAt(0)
            book.add(0, Booking(platenum.toString(), brandname.toString(), name.toString()))
            empty1.setText(book.get(0).plate).toString()
        }
        findViewById<Button>(R.id.button_delete).setOnClickListener {
            book.removeAt(0)
            book.add(0, Booking("", "", ""))
            empty1.setText("EMPTY").toString()
            plate.setText("")
            brand.setText("")
            owner.setText("")
        }
    }
    private fun emptyButton2(){
        val empty2 = findViewById<Button>(R.id.empty_slot2)
        val plate = findViewById<EditText>(R.id.plate_edit)
        val brand = findViewById<EditText>(R.id.brand_edit)
        val owner = findViewById<EditText>(R.id.owner_edit)

        plate.setText(book.get(1).plate).toString()
        brand.setText(book.get(1).brand).toString()
        owner.setText(book.get(1).owner).toString()

        var platenum = plate.text
        var brandname = brand.text
        var name = owner.text
        findViewById<Button>(R.id.button_update).setOnClickListener {
            book.removeAt(1)
            book.add(1, Booking(platenum.toString(), brandname.toString(), name.toString()))
            empty2.setText(book.get(1).plate).toString()

        }
        findViewById<Button>(R.id.button_delete).setOnClickListener {
            book.removeAt(1)
            book.add(1, Booking("", "", ""))
            empty2.setText("EMPTY").toString()
            plate.setText("")
            brand.setText("")
            owner.setText("")
        }
    }
    private fun emptyButton3(){
        val empty3 = findViewById<Button>(R.id.empty_slot3)
        val plate = findViewById<EditText>(R.id.plate_edit)
        val brand = findViewById<EditText>(R.id.brand_edit)
        val owner = findViewById<EditText>(R.id.owner_edit)

        plate.setText(book.get(2).plate).toString()
        brand.setText(book.get(2).brand).toString()
        owner.setText(book.get(2).owner).toString()

        var platenum = plate.text
        var brandname = brand.text
        var name = owner.text
        findViewById<Button>(R.id.button_update).setOnClickListener {
            book.removeAt(2)
            book.add(2, Booking(platenum.toString(), brandname.toString(), name.toString()))
            empty3.setText(book.get(2).plate).toString()
        }
        findViewById<Button>(R.id.button_delete).setOnClickListener {
            book.removeAt(2)
            book.add(2, Booking("", "", ""))
            empty3.setText("EMPTY").toString()
            plate.setText("")
            brand.setText("")
            owner.setText("")
        }
    }
}
