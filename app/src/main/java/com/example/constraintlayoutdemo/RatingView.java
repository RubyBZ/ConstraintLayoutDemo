package com.example.constraintlayoutdemo;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class RatingView extends FrameLayout {

	public RatingView(@NonNull Context context) {
		super(context);
	}

	public RatingView(@NonNull Context context, @Nullable AttributeSet attrs) {
		super(context, attrs);
	}

	public RatingView(@NonNull Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
		super(context, attrs, defStyleAttr);
	}

	public RatingView(@NonNull Context context, @Nullable AttributeSet attrs, int defStyleAttr, int defStyleRes) {
		super(context, attrs, defStyleAttr, defStyleRes);
	}
}
