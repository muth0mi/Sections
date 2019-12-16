package io.muth0mi.sections.ui.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import io.muth0mi.sections.R
import io.muth0mi.sections.ui.adapters.ItemAdapter.ItemHolder

class ItemAdapter(private val items: ArrayList<String>) : RecyclerView.Adapter<ItemHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.list_item, parent, false)
        return ItemHolder(view)
    }

    override fun getItemCount(): Int {
        return items.size
    }

    override fun onBindViewHolder(holder: ItemHolder, position: Int) {
        holder.bind(items[position])
    }


    class ItemHolder(view: View) : RecyclerView.ViewHolder(view) {
        private val itemName: TextView = itemView.findViewById(R.id.list_item_text_view)

        fun bind(item: String?) {
            itemName.text = item
        }
    }

}