오리 프로그램을 만들어달라는 주문을 받아 이런식의 구조를 생각해냈습니다

<img src="https://user-images.githubusercontent.com/54605549/120076313-e361a780-c0df-11eb-91b2-a0272e1e402e.jpg">

하지만 두 가지의 오리를 추가해달라는 주문이 들어와 아래의 그림과 같은 구조를 생각했습니다

<img src="https://user-images.githubusercontent.com/54605549/120076314-e3fa3e00-c0df-11eb-9624-fe44985b460c.jpg">

하지만 앞으로 주기적으로 추가가 될거라는 소식을 받아 최종적으로 생각해낸 구조가 아래의 그림과 같습니다

<img src="https://user-images.githubusercontent.com/54605549/120076312-e2c91100-c0df-11eb-9cea-731a985e92a6.png">

이런식의 구조는 Duck이 한번 바뀌면 원치않은 변경이 일어나므로 좋지않다고 생각되어 문제를 해결할 방안을 생각해봅니다

문제점을 보안하려면 달라지는 부분과 아닌 부분을 나누어 구현한다면 해결될거라 생각해낸 구조가 아래의 그림과 같습니다

<img src="https://user-images.githubusercontent.com/54605549/120076315-e3fa3e00-c0df-11eb-898c-c215d98eff57.jpg">

달라지는 부분은 인터페이스로 표현하며 행동을 구현한 클래스를 나누어 행동 클래스에 구현하므로 Duck이 바뀌어도 더이상 다른 오리들은 변경되지 않을 수 있습니다
