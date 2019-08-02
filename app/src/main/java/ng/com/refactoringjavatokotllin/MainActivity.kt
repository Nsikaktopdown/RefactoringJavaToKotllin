package ng.com.refactoringjavatokotllin

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.widget.LinearLayout

import java.util.ArrayList

class MainActivity : AppCompatActivity() {

	// TODO 3 ("Replace ArrayList with mutableList in kotlin")
	internal var values : MutableList<Blog> = ArrayList()

	override fun onCreate(savedInstanceState : Bundle?) {
		super.onCreate(savedInstanceState)
		setContentView(R.layout.activity_main)

		// setup Dummy
		var blog = Blog(
			resources.getString(R.string.title_1),
			resources.getString(R.string.description),
			R.drawable.image_1,
			12000
		)
		values.add(blog)
		blog = Blog(
			resources.getString(R.string.title_1),
			resources.getString(R.string.description),
			R.drawable.image_2,
			14000
		)
		values.add(blog)
		blog = Blog(
			resources.getString(R.string.title_1),
			resources.getString(R.string.description),
			R.drawable.image_3,
			20000
		)
		values.add(blog)
		val adapter = BlogAdapter(values)

		// TODO 4 ("pass recyclerView Properties using apply{}")
		// TODO 5 ("Replace findViewById using kotlin extention function reference")
		val blogRecyclerView = findViewById<RecyclerView>(R.id.blogItemRecyclerViewHome)
		blogRecyclerView.layoutManager = LinearLayoutManager(this)
		blogRecyclerView.setHasFixedSize(true)
		blogRecyclerView.adapter = adapter
		blogRecyclerView.isNestedScrollingEnabled = false
	}
}
