package android.prateekj.com.basics;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
  }

  public void launchActivity(View view) {
    Intent intent;
    switch (view.getId()){
      case R.id.expandable_list_activity:
        intent = new Intent(this, ExpandableListViewActivity.class);
        break;
      case R.id.async_task_activity:
        intent = new Intent(this, AsyncTaskProgressActivity.class);
        break;
      default:
        intent = new Intent(this, MainActivity.class);
        break;
    }
    startActivity(intent);
  }
}
