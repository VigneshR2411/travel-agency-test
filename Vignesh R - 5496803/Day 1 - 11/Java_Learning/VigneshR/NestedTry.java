package VigneshR;

public class NestedTry {
public static void main(String[] args) {
	try {
		try													
		{
		}
		catch (ArithmeticException e)
		{
			System.out.println("Inner catch: Divide by zero");
		}
		int arr[]= {1, 2, 3};
		System.out.println(arr[5]);
	}
	catch(ArrayIndexOutOfBoundsException e)
	{
		System.out.println("Outer Catch : Array index error");
	}
}
}

