package android.prateekj.com.expandablelistview_spike.models;

import java.util.ArrayList;
import java.util.List;

public class HeaderInfo {

  private String name;
  private List<DetailInfo> productList;

  public HeaderInfo(String name, List<DetailInfo> productList) {
    this.name = name;
    this.productList = productList;
  }

  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }
  public List<DetailInfo> getProductList() {
    return productList;
  }
  public void setProductList(ArrayList<DetailInfo> productList) {
    this.productList = productList;
  }

}
