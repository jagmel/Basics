package me.com.basics;

import android.databinding.BindingAdapter;
import android.view.View;
import android.widget.ImageButton;

/**
 * Created by gh on 12/3/2017.
 */

public class ImageSetter {
    @BindingAdapter("imgSrc")
    public static void setImage(ImageButton view, int id) {
        view.setImageDrawable(view.getResources().getDrawable(id));
    }
}
