
//201201
//15장 확인문제 9

package Practice;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapExample {
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("blue", 96);
		map.put("hong", 86);
		map.put("white", 92);

		String name = null; // 최고점수 받을 아이디 저장
		int maxScore = 0; // 최고 점수 저장
		int totalScore = 0; // 점수 합계 저장

//		Set<Entry<String, Integer>> entrySet = map.entrySet();
//		for (Entry<String, Integer> entry : entrySet) {
//			if (entry.getValue() > maxScore) {
//				name = entry.getKey();
//				maxScore = entry.getValue();
//
//			}
//			totalScore += entry.getValue();
//		}
//		System.out.println("최고점수 아이디: " + name);
//		System.out.println("최고 점수: " + maxScore);
//		System.out.println("평균 점수: " + totalScore/map.size());
//		System.out.println();
		
		for(String key : map.keySet()) { 
			Integer value = map.get(key);
			if(value > maxScore) {
				name = value.toString();
				maxScore = value;
			}
			totalScore += value;
		}
		System.out.println("최고점수 아이디: " + name);
		System.out.println("최고점수: " + maxScore);
		System.out.println("평균 점수: " + totalScore/map.size());
		

	}

}
