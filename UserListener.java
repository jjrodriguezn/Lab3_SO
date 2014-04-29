import java.util.ArrayList;

import akka.actor.UntypedActor;
import akka.event.Logging;
import akka.event.LoggingAdapter;

class UserListener extends UntypedActor
{

	LoggingAdapter log = Logging.getLogger(getContext().system(), this);

	@Override
	public void onReceive(Object message) throws Exception 
	{
		sumStuff = (boolean)message; 
		while(sumStuff)
		{
			if(modify.size() > 0)
			{
				System.out.println("Hey "+modify.get(0));
				Banco.modifyBalance(modify.get(0));
				modify.remove(0);
			}
		}
	}	
	
	public static void addStuff(Integer i)
	{
		modify.add(i);
	}
	
	boolean sumStuff = false;
	private static ArrayList<Integer> modify = new ArrayList<>();
}
