import java.lang.instrument.Instrumentation;

public class TestJavaAgent {
	public static void main(String agentArgument,
                   Instrumentation instrumentation){
		System.out.println("Test Java Agent");
	}
}