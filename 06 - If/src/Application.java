public class Application {
	public static void main(String[] args) {

	/*	int myInt = 25;

		if (myInt < 10) {
			System.out.println("Yes, it's true");
		}
		else if(myInt > 20 ) {
			System.out.println("No, it's false");
		}
		else {
			System.out.println("MyInt is beetween 10 and 20");*/
		//}
		int loop = 0;
		while(true){
			System.out.println("Looping: " + loop);
			if(loop==5){
				break;
			}
			loop++;
			System.out.println("Running");
		}
	}
}
