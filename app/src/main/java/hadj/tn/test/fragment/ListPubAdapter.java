package hadj.tn.test.fragment;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import de.hdodenhof.circleimageview.CircleImageView;
import hadj.tn.test.R;


public class ListPubAdapter extends RecyclerView.Adapter<ListPubAdapter.MyViewHolder> {

    List<String> listNames = new ArrayList<>(), listPubContenu= new ArrayList<>();
    List<Bitmap> listImages=new ArrayList<>();
    //ConstraintLayout constraintLayout;
    //  String[] listNames,listPubContenu;
    // int[] listImages;

    public ListPubAdapter(List<String>  list, List<Bitmap> listImages, List<String>  listPubContenu) {
        this.listNames = list;
        this.listImages = listImages;
        this.listPubContenu = listPubContenu;
    }

    @NonNull
    @Override
    public ListPubAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new MyViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_list_pub,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.textView.setText(listNames.get(position));


        holder.imageView.setImageBitmap(listImages.get(position));
        holder.textView8.setText(listPubContenu.get(position));
    }

    @Override
    public int getItemCount() {
        return listNames.size();
    }
    static class MyViewHolder extends RecyclerView.ViewHolder{

        TextView textView,textView8;

        de.hdodenhof.circleimageview.CircleImageView imageView;


        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            textView = itemView.findViewById(R.id.textView7);
            textView8 = itemView.findViewById(R.id.textView8);

            imageView = itemView.findViewById(R.id.imagePub);

        }
    }
}

