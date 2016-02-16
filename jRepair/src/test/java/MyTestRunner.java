import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

import ece.utexas.edu.repair.examples.findMax.TestMax;

public class MyTestRunner {
  public static void main(String[] args) {
    Result result = JUnitCore.runClasses(TestMax.class);
    for (Failure failure : result.getFailures()) {
      System.out.println(failure.toString());
    }
  }
} 