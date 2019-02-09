package ir.terminal724.www.terminal724.MyView;

import android.content.Context;
import android.graphics.Typeface;
import android.support.v7.widget.AppCompatRadioButton;
import android.util.AttributeSet;

public class My_RadioButton extends AppCompatRadioButton {
    public My_RadioButton(Context context) {
        super(context);
        setFont(context);
    }

    public My_RadioButton(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public My_RadioButton(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }
    private void setFont(Context context) {
        Typeface face=Typeface.createFromAsset(context.getAssets(),"IRANSans.ttf");
        this.setTypeface(face);
    }
}
