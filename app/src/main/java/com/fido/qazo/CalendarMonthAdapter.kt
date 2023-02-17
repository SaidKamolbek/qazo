package com.fido.qazo

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.fido.qazo.databinding.MonthItemBinding

class CalendarMonthAdapter() :
    ListAdapter<String, CalendarMonthAdapter.MonthViewHolder>(Obj) {
    object Obj : DiffUtil.ItemCallback<String>() {
        override fun areItemsTheSame(
            oldItem: String, newItem: String
        ): Boolean = oldItem == newItem

        override fun areContentsTheSame(
            oldItem: String, newItem: String
        ): Boolean = oldItem == newItem
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MonthViewHolder {
        return MonthViewHolder(
            MonthItemBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: MonthViewHolder, position: Int) {
        holder.bind()
    }


    inner class MonthViewHolder(private val binding: MonthItemBinding) : ViewHolder(binding.root) {
        fun bind() {
            binding.monthDay.text = getItem(adapterPosition)
        }
    }
}