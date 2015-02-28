package com.gxy.carddemo;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;

import com.fima.cardsui.objects.Card;
import com.fima.cardsui.objects.RecyclableCard;

public class MyCard extends Card {
	
	public MyCard (String color) {
		super("", color);
	}
	
	@Override
	public View getCardContent(Context context) {
		LayoutInflater inflater = (LayoutInflater)context.getSystemService (Context.LAYOUT_INFLATER_SERVICE);
		View v = inflater.inflate(R.layout.card_ex, null);
		v.setBackgroundColor(Color.parseColor(getColor()));
		return v;
	}

	@Override
	public boolean convert(View convertCardView) {
		// TODO Auto-generated method stub
		return false;
	}

	
}
