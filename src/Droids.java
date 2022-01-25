
public class Droids {
	int batteryLevel = 100; 
	String name; 

	public String toString(){ 
		return "Hello, I am the droid " + name + "!"; 
	} 

		 
	//Droids constructor 
	public Droids(String droidName){
		name = droidName; 
	} 

	//performTask method 
	public void performTask(String task){
		System.out.println(name + " is performing task:" + task + "."); 
		batteryLevel -= 10; 
	} 

	//energy report method 
	public void energyReport(){
		System.out.println("Here is my battery level: " + batteryLevel); 
	} 

	//energy transfer method from one droid to another 
	public void energyTransfer(int amount, Droids transferTo){
		if(this.batteryLevel >= amount && transferTo.batteryLevel <= 100 - amount){
			this.batteryLevel -= amount; 
			transferTo.batteryLevel += amount; 

		    System.out.println("Transfer of " + amount + " successful from " + this.name + " to " + transferTo.name); 
		} 
		else{
			System.out.println("I am sorry but the transfer is not elligible."); 
		} 
	} 

		 
	//main
	public static void main(String[] args){
		Droids a = new Droids("Codey"); 
		Droids b = new Droids("Bobby"); 

		System.out.println(a); 
		a.performTask(" walking"); 
		a.energyReport(); 

		System.out.println(b); 
		b.performTask(" beeping"); 
		b.energyReport(); 

		a.energyTransfer(10, b); 
		a.energyReport(); 
		b.energyReport(); 
	} 

}
