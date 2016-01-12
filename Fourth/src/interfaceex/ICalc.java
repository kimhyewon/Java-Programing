package interfaceex;

public interface ICalc {
	double PI = 3.14; //public abstract static double PI와 같은 의미. 즉 상수다. new하지 않아도 쓸 수 있다.  
	
	int add(int num1, int num2); //public abstract int add(int num1, int num2);와 동일 
	int substract(int num1, int num2);
	int times(int num1, int num2);
	int divide(int num1, int num2);
}
