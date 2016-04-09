package android.prateekj.com.basics;

import android.os.Bundle;
import android.prateekj.com.basics.models.AsyncTaskProgressActions;
import android.support.v7.app.AppCompatActivity;
import android.widget.ProgressBar;
import android.widget.TextView;

public class AsyncTaskProgressActivity extends AppCompatActivity implements AsyncTaskProgressActions{

  private ProgressBar progressBar;
  private TextView percentageTextView;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_async_task_progress);
    progressBar = (ProgressBar) findViewById(R.id.progress);
    percentageTextView = (TextView) findViewById(R.id.percentage);
    new ProgressAysncTask(this).execute();
  }

  @Override
  public void updateProgress(Integer percentage) {
    this.percentageTextView.setText(percentage + " %");
    this.progressBar.setProgress(percentage);
  }
}
