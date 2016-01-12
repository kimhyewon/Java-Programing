package ticketing;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

import pollicy.Policy;
import dataIO.Client;

public class Allocator {
	Policy policy;
	int numberOfBooth;
	ArrayList<TicketingBooth> Booth;	//티켓팅 부스 
	Queue<Client> trainQueue;			//티켓팅을 한 후 기차를 기다리는 대기열 
	Queue<Client> finalClientInfo;  //다익스트라 알고리즘을 통한 도착시간을 제외한 다른 정보들을 모두 저장한 상태의 고객정보 
	int curTime;
	
	public Allocator(Policy policy, int numberOfBooth){
		this.policy = policy;
		this.numberOfBooth = numberOfBooth;
		this.curTime = 0;
		
		trainQueue = new LinkedList<Client>();
		finalClientInfo = new LinkedList<Client>();
		Booth = new ArrayList<TicketingBooth>(numberOfBooth);
		makeBooth();
	}
	
	public void makeBooth(){   //numberOfBooth의 크기 만큼 Booth 인스턴스 생성 
		for(int i= 0 ; i < numberOfBooth; i++){
			Booth.add(i, new TicketingBooth(trainQueue));
		}
	}
	
	public void allocation(){
		policy.setBooth(Booth);
		policy.setTrainQueue(trainQueue);
		
		for(curTime = 0 ; curTime<200 ; curTime++){
			policy.setCurTime(curTime);
			policy.policyTemplate();                 // 매 시간마다 체크하여 enqueue, dequeue, 할당여부 결정
			if(curTime % 3 == 0) trainDeparture();     // 매 3분마다 기차 출발 
		}		
	}
	
	public void trainDeparture(){	
		for(int i  = 0 ; i < trainQueue.size() ; i++){
			Client buffer = trainQueue.poll();
			buffer.setTrainDepartureTime(curTime);
			finalClientInfo.offer(buffer);
		}
	}
	
	public Queue<Client> getfinalClientInfo(){
		return finalClientInfo;
	}
	
}
