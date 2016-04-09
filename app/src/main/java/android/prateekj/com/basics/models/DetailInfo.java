package android.prateekj.com.basics.models;

public class DetailInfo {

  private String sequence = "";
  private String name = "";

  public DetailInfo(String sequence, String name) {
    this.sequence = sequence;
    this.name = name;
  }

  public String getSequence() {
    return sequence;
  }
  public void setSequence(String sequence) {
    this.sequence = sequence;
  }
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

}