import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

import akka.actor.ActorRef;
import akka.actor.ActorSystem;
import akka.actor.Props;

public class Banco {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) 
	{

		while(true){		do{			baransuu = 0;			if(tryed %50000 == 0)				System.out.println("Apple!");
		try 
	        {
			tryed++;
		/*	BufferedReader bufferRead = new BufferedReader(new FileReader("C:\\Users\\Angel\\Downloads\\SO.txt"));
			StringBuilder sb = new StringBuilder();
	        String line = bufferRead.readLine();
	        ArrayList<String> lines = new ArrayList<String>();
	        while (line != null) 
	        {
	            lines.add(line);
	            sb.append(line);
	            sb.append(System.lineSeparator());
	            line = bufferRead.readLine();
	        }
	        String everything = sb.toString();
	        //System.out.println(everything);
			Integer numAnt = Integer.parseInt(lines.get(0));
			Integer numBla = Integer.parseInt(lines.get(1));
			lines.remove(0);
			lines.remove(0);
			ArrayList<Integer> transAnt = new ArrayList<>();
			ArrayList<Integer> transBla = new ArrayList<>();
			while(numAnt>0)
			{
				Integer aux = Integer.parseInt(lines.get(0));
				lines.remove(0);
				transAnt.add(aux);
				numAnt--;
			}
			while(numBla>0)
			{
				Integer aux = Integer.parseInt(lines.get(0));
				lines.remove(0);
				transBla.add(aux);
				numBla--;
			}
			*/
//			System.out.print("EEben mooooaaar Staaaaaaf");
			
			Scanner scan = new Scanner(System.in);
			Integer numAnt = scan.nextInt();
			Integer numBla = scan.nextInt();
			ArrayList<Integer> transAnt = new ArrayList<>();
			ArrayList<Integer> transBla = new ArrayList<>();
			while(numAnt>0)
			{
				int aux = scan.nextInt();
				transAnt.add(aux);
				numAnt--;
			}
			while(numBla>0)
			{
				int aux = scan.nextInt();
				transBla.add(aux);
				numBla--;
			}
//			System.out.println("Zaaa baransuuuu " + bankBalance);

			ActorSystem system=ActorSystem.create("Hola");
			//ActorSystem listen =ActorSystem.create("Jou");
			//Props p1 = Props.create(HelloActor.class);
			ActorRef ant = system.actorOf(Props.create(BankUser.class), "Antonio");
			ActorRef blak = system.actorOf(Props.create(BankUser.class), "Blanca");
			//ActorRef helloListener = listen.actorOf(Props.create(UserListener.class), "Listener");
		
			ant.tell(transAnt,null);
			blak.tell(transBla,null);
//			System.out.print("Moaaaar Staaaaaaf");
//			
//			while(!ant.isTerminated() && !blak.isTerminated())
//				System.out.print("Staaaaaaf");
//			helloListener.tell("FORWARD WITH THE GOAT!(a.k.a. \"Vooruit met de geit\" in Dutch)", null);
		//	Thread.sleep(2000);
			system.shutdown();
			system.awaitTermination();//JOIN
			UserListener.sumEverything();
			//System.out.println(baransuu);
		} 
		catch (Exception e) 
		{
			System.out.println("Stuf happened, baaaad stuff");
			e.printStackTrace();
		}
		}while(baransuu == 42);		catched++;System.out.println("Kukuku, an error happenedest to thy sum "+baransuu+"\n"+catched+" out of "+tryed);}
	}

	public static void modifyBalance(Integer i)
	{
		baransuu+=i;
	}
	
	public static Object getUserListener() 
	{
		return helloListener;
	}

	private static int baransuu = 0;
	private static int catched = 0;
	private static int tryed = 0;
	static ActorRef helloListener;
	
}
