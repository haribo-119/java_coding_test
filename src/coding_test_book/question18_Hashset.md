[문제 18] 두 개의 수로 특정값 만들기
n 개의 양의 정수로 이루어진 배열 arr와 정수 target이 주어졌을때 이 중에서 합이 target인 
두수가 arr에 있는지 찾고, 있으면 true, 없으면 false를 반환하는 solution() 함수를 
작성하세요

[제약조건]
- n은 2 이상 10,000 이하의 자연수입니다.
- arr의 원소는 1이상 10,000 이하의 자연수입니다.
- arr의 원소 중 중복되는 원소는 없습니다.
- target은 1 이상 20,000 이하의 자연수입니다.

[입출력의 예]
<table>
<tr>
<th>arr</th>
<th>target</th>
<th>return</th>
</tr>
<tr>
<td>[1,2,3,4,8]</td>
<td>6</td>
<td>true</td>
</tr>
<tr>
<td>[2,3,5,9]</td>
<td>10</td>
<td>false</td>
</tr>
</table>