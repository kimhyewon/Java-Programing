package dataIO;

public class Client implements Comparable{	
	private int iDNumber;	//고객 아이디 
	private String name;	//고객 이름 
	private int stationArrivingTime;	//역 도착시간 
	private int ticketingTurnaroundTime;	//티켓팅 소요 시간 
	private String departure;	//출발지 
	private String destination;	//도착지 
	private int trainDepartureTime;	//기차 출발 시간 
	private int trainArrivingTime;	//기차 도착 시간 
	private int endOfTicketingTime;	//티켓팅 끝나는 시간 
	private int startOfTicketingTime;	//티켓팅 시작하는 시간 
	private int trainTurnaroundTime;	//기차 타는 소요시간 
	
	private int ticketingWaitingTime;	//티켓팅 대기 시간 
	private int trainWaitingTime;	//기차 대기 시간 
	
	
	public Client(int iDNumber, String name, int stationArrivingTime,
				int ticketingTurnaroundTime, String departure, String destination){
		this.iDNumber = iDNumber;
		this.name = name;
		this.stationArrivingTime = stationArrivingTime;
		this.ticketingTurnaroundTime = ticketingTurnaroundTime;
		this.departure = departure;
		this.destination = destination;
	}

	public int getTrainTurnaroundTime() {
		return trainTurnaroundTime;
	}
	public void setTrainTurnaroundTime(int trainTurnaroundTime) {
		this.trainTurnaroundTime = trainTurnaroundTime;
	}
	public int getDestinationArrivingTime() {
		return trainArrivingTime;
	}
	public int getTrainDepartureTime(){
		return trainDepartureTime;
	}
	public void setTrainDepartureTime(int trainDepartureTime){
		this.trainDepartureTime = trainDepartureTime;
	}
	public int getEndOfTicketingTime(){
		return endOfTicketingTime;
	}
	public void setEndOfTicketingTime(int endOfTicketingTime){
		this.endOfTicketingTime = endOfTicketingTime;
	}
	public void calculateWaitingTime(){
		ticketingWaitingTime = startOfTicketingTime - stationArrivingTime;
		trainWaitingTime = trainDepartureTime - endOfTicketingTime;
		trainArrivingTime = trainDepartureTime + trainTurnaroundTime;
		
	}
	public int getStartOfTicketingTime(){
		return startOfTicketingTime;
	}
	public void setStartOfTicketingTime(int startOfTicketingTime){
		this.startOfTicketingTime = startOfTicketingTime;
	}
	

	public int getiDNumber() {
		return iDNumber;
	}
	public String getName() {
		return name;
	}
	public int getStationArrivingTime() {
		return stationArrivingTime;
	}
	public int getTicketingTurnaroundTime() {
		return ticketingTurnaroundTime;
	}
	public String getDeparture() {
		return departure;
	}
	public String getDestination() {
		return destination;
	}
	
	public String toString(){
		return iDNumber+", "+name+", "+stationArrivingTime+", "+ ticketingTurnaroundTime+", "+ departure + ", " + destination+", "+trainDepartureTime+", "+ticketingWaitingTime+", "+trainWaitingTime+", "+ trainArrivingTime;
	}

	public int compareTo(Object o) {
		return this.getTicketingTurnaroundTime() - ((Client)o).getTicketingTurnaroundTime();
	}
 
	public String getInfo(){
		return iDNumber+", "+name+", "+stationArrivingTime+", "+ ticketingTurnaroundTime+", "+ departure + ", " + destination+", "+trainDepartureTime+", "+ticketingWaitingTime+", "+trainWaitingTime+", "+ trainArrivingTime;
	}

	
}
