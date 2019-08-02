package ng.com.refactoringjavatokotllin

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView

// TODO 2 (" Convert this Adapter class to koltin")
class BlogAdapter(private val values : List<Blog>) :
		RecyclerView.Adapter<RecyclerView.ViewHolder>() {

	override fun getItemViewType(position : Int) : Int {
		return position
	}

	override fun onCreateViewHolder(parent : ViewGroup, viewType : Int) : RecyclerView.ViewHolder {
		return BlogViewHolder(
			LayoutInflater.from(parent.context)
				.inflate(R.layout.blog_item_layout, null)
		)
	}

	override fun onBindViewHolder(holder : RecyclerView.ViewHolder, position : Int) {
		val value = values[position]
		val blogViewHolder = holder as BlogViewHolder
		blogViewHolder.title.text = value.title
		blogViewHolder.description.text = value.description
		blogViewHolder.image.setImageResource(value.image)
		// TODO 6 ("Create an extention function to append Naira sign to an Int")
		blogViewHolder.price.text =  value.price.asCurrency()
	}

	override fun getItemCount() : Int {
		return values.size
	}

	internal inner class BlogViewHolder(itemView : View) : RecyclerView.ViewHolder(itemView) {
		var title : TextView
		var description : TextView
		var price : TextView
		var image : ImageView

		init {
			title = itemView.findViewById(R.id.blog_title)
			description = itemView.findViewById(R.id.blog_description)
			image = itemView.findViewById(R.id.blog_image)
			price = itemView.findViewById(R.id.blog_price)
		}
	}
	
	
}
