package ticketing;

import java.io.IOException;
import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

import pollicy.FCFS;
import pollicy.Policy;
import pollicy.Priority;
import pollicy.RoundRobin;
import searchpath.Define;
import searchpath.NoRegionException;
import searchpath.ShortPath;
import dataIO.Client;
import dataIO.ReadData;
import dataIO.WriteData;


public class TicketingMain {
	public static void main(String[] args) throws IOException, NoRegionException {
		
		Scanner scanner = new Scanner(System.in);	
		Policy policy;  //정책을 담는 인터페이스 변수 
		Allocator allocator; // 고객을 시간에 따라 역에 도착시키고 티켓팅 후 열차대기열로 보내고 기차로 태우는 모든 역할을 하는 클래스 
	
		ReadData readData = ReadData.getInstance("ClientData.csv"); //고객 데이터를 읽어옴 
		readData.getClientData();  //읽어온 데이터를 고객 데이터에 넣어줌 
		Queue<Client> clientInfo = readData.getClientInfo(); //고객 테이터를 클라이언트 큐에 넣어줌 
		
		System.out.println("어떤 티켓팅 알고리즘을 사용할까요?");
		System.out.println("1. FCFS");
		System.out.println("2. RoundRobin");
		System.out.println("3. PriorityQueue");
		
		while(true){
			int input = scanner.nextInt();
			
			switch(input){	// 사용자 입력에 따른 각각의 방식에 넣어줌 
			case 1 : policy = new FCFS(clientInfo); break;
			case 2 : policy = new RoundRobin(clientInfo); break;
			case 3 : policy = new Priority(clientInfo); break;
			default : System.out.println("다시 입력해 주세요."); continue;	
			}
			break;
		}
		
		int numberOfBooth = 3;
		allocator = new Allocator(policy, numberOfBooth);
		
		allocator.allocation();   
		
		Queue<Client> finalClientInfo = allocator.getfinalClientInfo();	//도착 시간을 제외한 모든 고객 정보를 큐에 할당 
		Iterator<Client> finalClientInfoIR = finalClientInfo.iterator();	
		ShortPath searchPath = new ShortPath();	//다익스트라 알고리즘을 이용해 최단 경로를 알려주는 클래스 
		
		while(finalClientInfoIR.hasNext()){	//반복자를 통해서 다익스트라 알고리즘을 통해 구현된 정보들을 넣어줌 
			Client buffer = finalClientInfoIR.next();
			String departure = buffer.getDeparture();
			String destination = buffer.getDestination();

			buffer.setTrainTurnaroundTime(searchPath.shortestPath(Define.parseString(departure), Define.parseString(destination), 7));
			buffer.calculateWaitingTime();
		}
		
		Iterator<Client> clientInfoIR = clientInfo.iterator();
		
		while(clientInfoIR.hasNext()){	//원래의 클라이언트인포를 업데이트
			finalClientInfoIR = finalClientInfo.iterator();
			Client buffer1 = clientInfoIR.next();
			while(finalClientInfoIR.hasNext()){
				Client buffer2 = finalClientInfoIR.next();
				if(buffer1.getiDNumber() == buffer2.getiDNumber()){
					buffer1 = buffer2;
				}
			}
		}	
				
		WriteData writeData = new WriteData("finalData.csv", clientInfo);
		writeData.writeClientData();

	}

}
