package me.com.basics;

import android.support.v7.widget.RecyclerView;
import android.view.View;

import me.com.basics.databinding.DataBinding;
import me.com.basics.model.SampleData;

/**
 * Created by gh on 12/3/2017.
 */

public class ViewHolder extends RecyclerView.ViewHolder {
    private DataBinding dataBinding;
    public ViewHolder(DataBinding dataBinding) {
        super(dataBinding.getRoot());
        this.dataBinding = dataBinding;
    }
    public void bind(SampleData data){
        dataBinding.setModel(data);
    }

    public DataBinding getDataBinding() {
        return dataBinding;
    }
}
