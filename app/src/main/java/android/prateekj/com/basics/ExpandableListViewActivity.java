package android.prateekj.com.basics;

import android.prateekj.com.basics.models.DetailInfo;
import android.prateekj.com.basics.models.HeaderInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ExpandableListView;

import java.util.Arrays;
import java.util.List;

public class ExpandableListViewActivity extends AppCompatActivity {


  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.expanable_list_layout);
  }

  @Override
  protected void onStart() {
    super.onStart();
    MyListAdapter myListAdapter = new MyListAdapter(this, prepareData());
    ExpandableListView listView = (ExpandableListView) findViewById(R.id.myList);
    listView.setAdapter(myListAdapter);
  }

  private List<HeaderInfo> prepareData() {
    DetailInfo detailInfo = new DetailInfo("1", "ActiveWear");
    DetailInfo detailInfo2 = new DetailInfo("2", "Jackets");
    HeaderInfo headerInfo = new HeaderInfo("Apparel", Arrays.asList(detailInfo, detailInfo2));

    DetailInfo detailInfo3 = new DetailInfo("1", "Fragrances");
    DetailInfo detailInfo4 = new DetailInfo("2", "Makeup");
    HeaderInfo headerInfo2 = new HeaderInfo("Beauty", Arrays.asList(detailInfo3, detailInfo4));
    return Arrays.asList(headerInfo, headerInfo2);
  }

}
