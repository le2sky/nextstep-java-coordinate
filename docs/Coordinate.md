## 기능 요구사항

- 사용자가 점에 대한 좌표 정보를 입력하는 메뉴를 구성한다.
- 좌표 정보는 괄호"(", ")"로 둘러쌓여 있으며 쉼표(,)로 x값과 y값을 구분한다.
- X, Y좌표 모두 최대 24까지만 입력할 수 있다.
- 입력 범위를 초과할 경우 에러 문구를 출력하고 다시 입력을 받는다.
- 정상적인 좌표값을 입력한 경우, 해당 좌표에 특수문자를 표시한다.
- 좌표값을 두 개 입력한 경우, 두 점을 있는 직선으로 가정한다. 좌표값과 좌표값 사이는 '-' 문자로 구분한다.
- 직선인 경우는 두 점 사이 거리를 계산해서 출력한다.
- 좌표값을 네 개 입력한 경우, 네 점을 연결하는 사각형으로 가정한다.
    - 네 점이 뒤틀어진 사다리꼴이나 마름모는 제외하고 직사각형만 허용하도록 검사한다.
    - 사각형인 경우 사각형의 넓이를 계산해서 출력한다.
- 좌표값을 세 개 입력한 경우, 세 점을 연결하는 삼각형으로 가정한다.
    - 삼각형인 경우 삼각형의 넓이를 계산해서 출력한다.

## 기능 목록

- 좌표값 입력 기능
    - X,Y 좌표 검증 ✓
    - 재시도 ✓
- 선 길이 계산 기능 ✓
- 사각형 넓이 계산 기능
    - 직사각형만 허용함 ✓
- 삼각형 넓이 계산 기능 ✓
- 좌표값 출력 기능
    - 직선인 경우, 두 점 사이의 거리를 계산해서 출력 ✓
    - 직선이 아닌 경우, 선 길이 출력 x ✓
    - 모든 정상 좌표에 특수문자 표시 ✓
