public class Calculator {

 private double result;
 
 public void add(double x, double y) {
	 this.result = x+y;
 }
 
 public void sub(double x, double y) {
	 this.result = x-y;
 }
 
 public void mult(double x, double y) {
	 this.result = x * y;
 }
 
 public void div(double x, double y) {
	 this.result = x/y;
 }
 
 public double getResult(){
	 return this.result;
 }
 
 public void cleanResult(){
	 this.result = 0;
 }

}