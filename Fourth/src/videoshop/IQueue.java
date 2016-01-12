package videoshop;

public interface IQueue {
	
	void enQueue(String title);
	String deQueue();
}

// create student
//cretecate session 
//이런식으로 테스트에 메소드 만들고 넣으면 된다. 
//gradereport라는 클래스로 점수 꺼내는거 구현. 스튜던트 리스트돌면서 학점 뽑는데, 정책 두가지 있다. 
//정책 두개는 각각 클래스고, 인터페이스 상속함. 
//즉 정리하면 학생, srore 수업(session) 각각 클래스 만들어서 관계 정리해보기 