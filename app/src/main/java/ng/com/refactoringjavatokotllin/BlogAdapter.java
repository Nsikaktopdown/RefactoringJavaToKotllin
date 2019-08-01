package ng.com.refactoringjavatokotllin;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

// TODO 2 (" Convert this Adapter class to koltin")
public class BlogAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

        private List<Blog> values;

        public BlogAdapter (List<Blog>  values) {
            this.values = values;
        }

        @Override
        public int getItemViewType(int position) {
            return position;

        }

        @Override
        public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            return new BlogViewHolder(LayoutInflater.from(parent.getContext())
                                    .inflate(R.layout.blog_item_layout, null));
        }

        @Override
        public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
         Blog  value = values.get(position);
         BlogViewHolder blogViewHolder = (BlogViewHolder) holder;
         blogViewHolder.title.setText(value.getTitle());
         blogViewHolder.description.setText(value.getDescription());
         blogViewHolder.image.setImageResource(value.getImage());
            // TODO 6 ("Create an extention function to append Naira sign to an Int")
         blogViewHolder.price.setText("₦" + value.getPrice());

        }

        @Override
        public int getItemCount() {
            return values.size();
        }

        class BlogViewHolder extends RecyclerView.ViewHolder {
            TextView title, description, price;
            ImageView image;

            public BlogViewHolder(View itemView) {
                super(itemView);
                title = itemView.findViewById(R.id.blog_title);
                description = itemView.findViewById(R.id.blog_description);
                image = itemView.findViewById(R.id.blog_image);
                price = itemView.findViewById(R.id.blog_price);
            }
        }

}
