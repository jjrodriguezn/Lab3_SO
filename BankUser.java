import java.util.ArrayList;

import akka.actor.UntypedActor;
import akka.event.Logging;
import akka.event.LoggingAdapter;

class BankUser extends UntypedActor
{

	LoggingAdapter log = Logging.getLogger(getContext().system(), this);

	@Override
	public void onReceive(Object message) throws Exception 
	{
		int total = 0;
		ArrayList<Integer> orders = (ArrayList<Integer>)message;
        for(int variableInFor = 0; variableInFor < orders.size(); variableInFor++)
        {
        	total+=(orders.get(variableInFor));
//        	int temp = Banco.bankBalance;
//        	temp = temp + operations.get(variableInFor);
//        	Banco.bankBalance = temp;
//        	Banco.signal();
        }
        UserListener.addStuff(total);
	}	
}
