package android.prateekj.com.expandablelistview_spike;

import android.os.AsyncTask;
import android.prateekj.com.expandablelistview_spike.models.AsyncTaskProgressActions;
import android.util.Log;

public class ProgressAysncTask extends AsyncTask<Void, Integer, Void> {

  private final static String TAG = ProgressAysncTask.class.getName();

  private AsyncTaskProgressActions asyncTaskProgressActions;

  public ProgressAysncTask(AsyncTaskProgressActions asyncTaskProgressActions) {
    this.asyncTaskProgressActions = asyncTaskProgressActions;
  }

  @Override
  protected void onPreExecute() {
    Log.println(Log.INFO, TAG, "Pre execute");
  }

  @Override
  protected Void doInBackground(Void... params) {

    for (int i = 1 ; i <= 10 ; i++) {
      try {
        Thread.sleep(500);
        publishProgress(i);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    }
    Log.println(Log.INFO, TAG, "Done Processing");
    return null;
  }

  @Override
  protected void onProgressUpdate(Integer... values) {
    Log.println(Log.INFO, TAG, "Updating Progress");
    Integer percentage = values[0] * 10;
    this.asyncTaskProgressActions.updateProgress(percentage);
  }

  @Override
  protected void onPostExecute(Void aVoid) {
    Log.println(Log.INFO, TAG, "Post execute");
  }
}
