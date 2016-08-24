package zhan.myapplication;

import android.content.Context;
import android.text.Layout;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

/**
 * Created by zhan414 on 2016/8/2.
 */
public class LoginView extends LinearLayout implements View.OnClickListener{
    private Button btn,btn2;
    public LoginView(Context context) {
        super(context);
        initView(context);
    }



    public LoginView(Context context, AttributeSet attrs) {
        super(context, attrs);
        initView(context);
    }
    private void initView(Context context) {
        LayoutInflater inflater= (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        inflater.inflate(R.layout.loginview,this);
        btn= (Button) findViewById(R.id.button);
        btn2= (Button) findViewById(R.id.button1);
        btn2.setOnClickListener(this);
        btn.setOnClickListener(this);

    }


    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.button1:
            case R.id.button:
                onLoginAction.onLogin();
                break;
        }

    }

    private onLoginActionListener onLoginAction;
    public void setOnLoginActionListener(onLoginActionListener onLoginAction){
        this.onLoginAction =onLoginAction;
    }

    public interface onLoginActionListener{
        public void onLogin();
    }
}
