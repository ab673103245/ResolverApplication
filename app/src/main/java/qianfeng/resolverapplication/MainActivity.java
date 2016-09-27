package qianfeng.resolverapplication;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    private ContentResolver resolver;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        resolver = getContentResolver();
    }

    public void click(View view) {  // 点击

        ContentValues values = new ContentValues();
        values.put("username","张三");
        values.put("password","232323");
        values.put("nickname","zhangsan");

        values.put("username","李四");
        values.put("password","111111");
        values.put("nickname","lisi");

         resolver.insert(Uri.parse("content://qianfeng.provider_application.mycontentprovider/user"), values);// 这里要通过uri锁定到服务端，这是 Resolver（客户端）和 Provider（服务端）连接的桥梁


    }
}
