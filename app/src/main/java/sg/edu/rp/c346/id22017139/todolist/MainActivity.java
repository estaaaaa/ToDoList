package sg.edu.rp.c346.id22017139.todolist;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Calendar;

public class MainActivity extends AppCompatActivity {

    ListView lvToDo;
    CustomAdapter adapter;
    ArrayList<ToDoList> alToDo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvToDo = findViewById(R.id.lvToDoList);
        alToDo = new ArrayList<>();

        Calendar date1 = Calendar.getInstance();
        date1.set(2020, 8, 1);

        Calendar date2 = Calendar.getInstance();
        date2.set(2020, 8, 2);

        alToDo.add(new ToDoList("Go for movie", date1));
        alToDo.add(new ToDoList("Go for haircut", date2));

        adapter = new CustomAdapter(this, R.layout.row, alToDo);
        lvToDo.setAdapter(adapter);
    }
}