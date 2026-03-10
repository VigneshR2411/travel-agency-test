package VigneshR;

interface AmountValidator{
	boolean validator(int amount);
}
public class Checklambda {
public static void main(String[] args) {
	int amount1=1000;
	AmountValidator check = amount -> amount >1000;
	System.out.println(check.validator(amount1));
}
}
