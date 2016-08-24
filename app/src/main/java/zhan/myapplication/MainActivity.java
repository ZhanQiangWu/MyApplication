package zhan.myapplication;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

public class MainActivity extends Activity {
    private LoginView loginView,loginView2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    private void initView() {
        loginView = (LoginView) findViewById(R.id.loginview);
        loginView2= (LoginView) findViewById(R.id.loginview2);
        loginView2.setOnLoginActionListener(new LoginView.onLoginActionListener() {
            @Override
            public void onLogin() {
                Toast.makeText(MainActivity.this, "嘻嘻，接收到点击监听了", Toast.LENGTH_SHORT).show();
            }
        });
        loginView.setOnLoginActionListener(new LoginView.onLoginActionListener() {
            @Override
            public void onLogin() {
                Toast.makeText(MainActivity.this, "哈哈，接收到点击监听了", Toast.LENGTH_SHORT).show();
                Log.i("nihao", "jieshoudaojiatingle");
            }
        });
    }
}
