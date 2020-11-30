
//201130

package com.yedam.generic;

class Tv {

}

class Audio {

}

public class PairExample {
	public static void main(String[] args) {

		// pair라는 클래스를 선언한 시점에 T와 M의 타입을 String, Integer로 지정하겠다
		Pair<String, Integer> pair = new Pair<String, Integer>();
		pair.setKind("펭하"); 
		pair.setModel(1000);
		System.out.println(pair.getKind() + pair.getModel());

		// Tv, Audio 클래스 활용
		Pair<Tv, String> tv = new Pair<Tv, String>();
		tv.setKind(new Tv());
		tv.setModel("평면TV");

		Pair<Audio, String> audio = new Pair<Audio, String>();
		audio.setKind(new Audio());
		audio.setModel("AD303");

	}

}
