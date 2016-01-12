package pollicy;

import java.util.ArrayList;
import java.util.Queue;

import ticketing.TicketingBooth;
import dataIO.Client;

public interface Policy {

	public void stationArriving();
	public void allocation();
	
	public void policyTemplate();
	public void setBooth(ArrayList<TicketingBooth> booth);
	public void setTrainQueue(Queue<Client> trainQueue);
	public void setCurTime(int curTime);
}
