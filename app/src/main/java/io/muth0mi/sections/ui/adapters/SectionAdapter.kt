package io.muth0mi.sections.ui.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import io.muth0mi.sections.R
import io.muth0mi.sections.data.Section


class SectionAdapter(private val sections: ArrayList<Section>, private val context: Context) :
    RecyclerView.Adapter<SectionAdapter.SectionHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SectionHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.list_section, parent, false)
        return SectionHolder(context, view)
    }

    override fun getItemCount(): Int {
        return sections.size
    }

    override fun onBindViewHolder(holder: SectionHolder, position: Int) {
        holder.bind(sections[position])
    }


    class SectionHolder(private val context: Context, view: View) : RecyclerView.ViewHolder(view) {
        private val title: TextView = itemView.findViewById(R.id.section_item_text_view)
        private val recyclerView: RecyclerView = itemView.findViewById(R.id.item_recycler_view)

        fun bind(section: Section) {
            title.text = section.title

            val linearLayoutManager =
                LinearLayoutManager(context, LinearLayoutManager.VERTICAL, false)
            recyclerView.layoutManager = linearLayoutManager
            recyclerView.adapter = ItemAdapter(section.items as ArrayList<String>)

        }
    }
}