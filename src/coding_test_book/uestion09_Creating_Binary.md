[문제 09] 10진수를 2진수로 변환하기
- 10진수를 입력받아 2진수로 변환해 반환하는 solution() 함수를 구현하세요

int num = 10;
String binary = Integer.toBinaryString(num);
System.out.println(binary) // 출력 : 1010
 
위와 같이 하지말고,  Sack을 사용해서 구현할것

[입출력의 예]
 decimal        반환값 
   10     ->     1010
   27     ->     11011
  12345   ->     11000000111001

