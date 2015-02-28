package com.gxy.carddemo;






import java.util.ArrayList;

import com.fima.cardsui.objects.CardStack;
import com.fima.cardsui.views.CardUI;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class CardActivity extends Activity {

	private CardUI mCardView;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		mCardView = (CardUI) findViewById(R.id.cardsview);
		mCardView.setSwipeable(true);

		CardStack stack = new CardStack(this);
		stack.setTitle("请支持大苞米的博客");
		
        for (int i = 0; i < 5; i++) {
        	MyCard card = null ;
            switch (i) {
                case 0:
                	card = new MyCard("#FFBB33");
                    break;
                case 1:
                	card = new MyCard("#98CC00");
                    break;
                case 2:
                	card = new MyCard("#A966CC");
                    break;
                case 3:
                	card = new MyCard("#33B4E4");
                    break;
                case 4:
                	card = new MyCard("#FF4343");
                    break;
            }
            stack.add(card);
        }
        mCardView.addStack(stack);
		// draw cards
		mCardView.refresh();
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.card, menu);
		return true;
	}

}
