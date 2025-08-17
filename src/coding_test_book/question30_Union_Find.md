k=3 opertion =  [[0,0,1],[0,1,2],[1,1,2]] result = true 인데, 
[0,1,2]는 노드1과 노드2에 대한 union 연산 수행, 
[1,1,3] 노드1과 3이 같은 집합에 속해 잇으면 true 아니면 false를 반화하는 equals연산 


[문제]초기의 노드는 부모 노드를 자신의 값으로 설정 했다고 가정하여 여기서는 각 집합의 루트 노드를 기준으로 루트 노드가 작은 노드를 더 큰 노드의 자식으로 연결하는 방법을 사용합니다 oprations에 있는 연산에 대한 결과를 연산 순선대로 담은 Boolean  배열을 반환하는 solutino() 메서드를 구현해주세요

<table>
<tr>
    <th>k</th>
    <th>operations</th>
    <th>result</th>
</tr>
<tr>
    <td>3</td>
    <td>[[0,0,1],[0,1,2],[1,1,2]]</td>
    <td>[ture]</td>
</tr>
<tr>
    <td>4</td>
    <td>[[0,0,1],[1,1,2],[0,1,2],[1,0,2]]</td>
    <td>[ture,fales]</td>
</tr>
</table>