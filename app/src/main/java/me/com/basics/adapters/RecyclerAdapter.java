package me.com.basics.adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.Toast;

import java.util.ArrayList;

import me.com.basics.Interface;
import me.com.basics.R;
import me.com.basics.ViewHolder;
import me.com.basics.databinding.DataBinding;
import me.com.basics.model.SampleData;

/**
 * Created by gh on 12/3/2017.
 */

public class RecyclerAdapter extends RecyclerView.Adapter<ViewHolder> {

    private Context context;
    private ArrayList<SampleData> dataArrayList;
    private LayoutInflater inflater;

    public RecyclerAdapter(Context context, ArrayList<SampleData> dataArrayList) {
        this.context = context;
        this.dataArrayList = dataArrayList;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        if (inflater == null) {
            inflater = LayoutInflater.from(parent.getContext());
        }
        DataBinding dataBinding = DataBinding.inflate(inflater, parent, false);
        return new ViewHolder(dataBinding);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        final SampleData sampleData = dataArrayList.get(position);
        holder.bind(sampleData);

        DataBinding dataBinding = holder.getDataBinding();
        dataBinding.setHandler(new Interface() {
            @Override
            public void onIconClicked() {
                if(sampleData.id.get()== android.R.drawable.star_on){
                    sampleData.id.set(android.R.drawable.star_off);

                    Toast.makeText(context, "post removed from favourites ", Toast.LENGTH_SHORT).show();
                }else{
                    sampleData.id.set(android.R.drawable.star_on );

                    Toast.makeText(context, "post added to favourites ", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    @Override
    public int getItemCount() {
        return dataArrayList.size();
    }
}
