오리 프로그램을 만들어달라는 주문을 받았고 이렇게 구현을 생각해냈다
<img src="https://user-images.githubusercontent.com/54605549/120076313-e361a780-c0df-11eb-91b2-a0272e1e402e.jpg">

하지만 두 가지의 오리를 추가해달라는 주문이 들어오고
<img src="https://user-images.githubusercontent.com/54605549/120076314-e3fa3e00-c0df-11eb-9624-fe44985b460c.jpg">

이런식의 구조가 짜여졌고 이를 앞으로 지속적으로 추가가 될거라는 소식을 받고 최종적으로 나온 구조가
<img src="https://user-images.githubusercontent.com/54605549/120076312-e2c91100-c0df-11eb-9cea-731a985e92a6.png">
이렇게 나왔으나 이런 구조는 Duck이 한번 바뀌면 원치않은 변경이 일어나므로 좋지않다

이런 문제점을 보안하여 달라지는 부분과 아닌 부분을 나누어 구현을 한 구조가
<img src="https://user-images.githubusercontent.com/54605549/120076315-e3fa3e00-c0df-11eb-898c-c215d98eff57.jpg">
달라지는 부분을 인터페이스로 표현하고 행동을 구현한 클래스를 나누어 행동 클래스에 구현
