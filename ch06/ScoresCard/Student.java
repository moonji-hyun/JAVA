package ch06.ScoresCard;

public class Student { // 학생용 객체를 담당
   // 필드(값을 담는 변수들) -> 맴버 변수
   String name ;    // 학생명
   int num ;        // 학번
   String sex ;     // 성별
   int grade ;      // 학년
   int classroom ;  // 반
   Score score;     // 점수 객체
   
   // 생성자 -> new Student(???????) (객체 생성시 활용)
   // 생성자 생략시 기본 생성자가 자동으로 만들어 짐 Student st = new Student();
   
   
   // 메서드 -> 동작 (crud)
   // c -> 학생 등록
   // r -> 학생 리스트 출력
   // u -> 학생 정보 수정
   // d -> 학생 삭제

}