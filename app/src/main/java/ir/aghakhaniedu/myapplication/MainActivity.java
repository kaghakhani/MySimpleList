package ir.aghakhaniedu.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import java.util.ArrayList;
import java.util.HashMap;

public class MainActivity extends AppCompatActivity {
    String fruitNames[] = {"Banana", "Grape", "Guava", "Mango", "Orange", "Watermelon"};
    String fruitMessage[] = {"Banana is very Good", "Grape is very Good", "Guava is very Good", "Mango is very Good", "Orange is very Good", "Watermelon is very Good"};

    int fruitImageIds[] = {R.drawable.banana,
            R.drawable.grape,
            R.drawable.guava,
            R.drawable.mango,
            R.drawable.orange,
            R.drawable.watermelon};
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.listView);
        ArrayList list = new ArrayList();
        for (int i = 0; i < fruitImageIds.length; i++) {

            HashMap<String, Object> map = new HashMap<>();
            map.put("fruitName", fruitNames[i]);
            map.put("fruitImage", fruitImageIds[i]);
            map.put("fruitMessage", fruitMessage[i]);
            list.add(map);
        }
        String[] from = {"fruitName","fruitMessage", "fruitImage"};
        int to[] = {R.id.textViewTitle,R.id.textViewMessage, R.id.imageView};

        SimpleAdapter simpleAdapter = new SimpleAdapter(this, list, R.layout.listview_items,from,to);
        listView.setAdapter(simpleAdapter);

    }
}