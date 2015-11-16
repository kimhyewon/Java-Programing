package exercise_7_1_2;
class SutdaDeck {
	final int CARD_NUM = 20;
	SutdaCard[] cards = new SutdaCard[CARD_NUM];
	
	SutdaDeck() {
		for(int i=0;i < cards.length;i++) { 
			int num = i%10+1;
			boolean isKwang = (i < 10)&&(num==1||num==3||num==8);
			cards[i] = new SutdaCard(num,isKwang); 
		}
	}
	
	void shuffle() {
		for(int x=0; x< cards.length*2;x++) {
		
		int i = (int)(Math.random()*cards.length); 
		int j = (int)(Math.random()*cards.length);
		
		SutdaCard tmp = cards[i];
		cards[i] = cards[j];
		cards[j] = tmp;
		}
	}
		
	SutdaCard pick(int index) {
		if(index < 0 || index >= CARD_NUM) 
			return null; 
		return cards[index];
	}
	
	SutdaCard pick() {
		int index = (int)(Math.random()*cards.length); 
		return pick(index); 
	}
}

class SutdaCard { 
	int num;
	boolean isKwang;
	SutdaCard() { 
		this(1, true);
	}
	SutdaCard(int num, boolean isKwang) { 
		this.num = num;
		this.isKwang = isKwang; 
	}
	// info()대신 Object클래스의 toString()을 오버라이딩했다. 
	public String toString() {
		return num + ( isKwang ? "K":""); 
	}
}

public class Exercise_7_1_2 {
	public static void main(String args[]) {
		SutdaDeck deck = new SutdaDeck();
		
		for(int i=0; i < deck.cards.length;i++) {
			System.out.print(deck.cards[i]+",");
		}
	}
}
