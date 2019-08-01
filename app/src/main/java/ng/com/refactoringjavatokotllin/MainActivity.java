package ng.com.refactoringjavatokotllin;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.LinearLayout;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    // TODO 3 ("Replace ArrayList with mutableList in kotlin")
    List<Blog> values = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // setup Dummy
        Blog blog = new Blog(getResources().getString(R.string.title_1), getResources().getString(R.string.description), R.drawable.image_1, 12000);
        values.add(blog);
        blog = new Blog(getResources().getString(R.string.title_1), getResources().getString(R.string.description), R.drawable.image_2, 14000);
        values.add(blog);
        blog = new Blog(getResources().getString(R.string.title_1), getResources().getString(R.string.description), R.drawable.image_3, 20000);
        values.add(blog);
        BlogAdapter adapter = new BlogAdapter(values);


        // TODO 4 ("pass recyclerView Properties using apply{}")
        // TODO 5 ("Replace findViewById using kotlin extention function reference")
        RecyclerView blogRecyclerView = findViewById(R.id.blogItemRecyclerViewHome);
        blogRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        blogRecyclerView.setHasFixedSize(true);
        blogRecyclerView.setAdapter(adapter);
        blogRecyclerView.setNestedScrollingEnabled(false);

    }
}
