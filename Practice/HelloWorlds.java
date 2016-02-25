public class HelloWorlds{
	public static void main(String[] args){
		if(args.length != 0){
			int greetings = Integer.parseInt(args[0]);
			for(int i=0; i<greetings; i++){
				System.out.println("Hello, World!");
			}
		}
		else{
			System.out.println("Request an integer number of greetings");
		}
		
	}
}