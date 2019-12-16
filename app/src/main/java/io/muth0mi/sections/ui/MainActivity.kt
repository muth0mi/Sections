package io.muth0mi.sections.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import io.muth0mi.sections.R
import io.muth0mi.sections.data.Section
import io.muth0mi.sections.ui.adapters.SectionAdapter

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recyclerView: RecyclerView = findViewById(R.id.sectioned_recycler_view);
        val linearLayoutManager = LinearLayoutManager(this)
        recyclerView.layoutManager = linearLayoutManager;

        val sections: ArrayList<Section> = arrayListOf()
        //add sections
        for (i in 0..1) {
            //add items to a section
            val itemArrayList = ArrayList<String>()
            for (j in 0..4) itemArrayList.add("Item $j Section $i")

            //add the section and items to array list
            sections.add(Section("Section $i", itemArrayList))
        }

        recyclerView.adapter = SectionAdapter(sections, this)

    }
}