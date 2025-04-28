import java.util.*;

public class StepTracker{
  private int track;
  private int min;
  private int numberOfSteps;
  private int days;
  public StepTracker(int min){
    track = 0;
    this.min = min;
    numberOfSteps = 0;
    days = 0;
  }
  public int activeDays(){
    return track;
  }
  public Double averageSteps(){
    if (days == 0) return 0.0;
    return 1.0* numberOfSteps /days;
  }
  public void addDailySteps(int steps){
    numberOfSteps+=steps;
    days++;
    if (min <= steps){
      track++;
    }
  }
}
