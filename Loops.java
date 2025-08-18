public class Loops {
	 // loops execute until certain Iterations
	static void forloop(int n){
		// no. of iterations are fixed[For Loop]
        for(int i=0;i<n; i++){
            System.out.println(i);
        }
    }

    
	static void whileloop(int i){
		// no. of iterations are not fixed[while loop]
		while (i<=15) {
			System.out.println(i);
			i++;
		}
	}
// First excute and then check the condition[Do While]
	public static void main(String[] args) {
        forloop(10);
		whileloop(1);
    }
}
	


       

       