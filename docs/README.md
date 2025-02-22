# 체스 - 웹, DB

## 1단계 - 체스판 초기화

### 입력
- [x] start를 입력하면 게임을 시작한다.
- [x] end를 입력하면 게임을 종료한다.

### 출력
- [x] 게임이 시작되면 체스판을 출력한다.

### 체스 
- [x] 체스판의 공간을 생성한다.
    - [x] 체스말은 32개로 생성되는지 검증한다.
- [x] 체스말을 초기 위치로 생성한다.
- [x] 체스말의 위치를 반환한다.
    - [x] 체스말의 위치는 (0, 0), (7, 7) 사이로 생성되는지 검증한다.

## 2단계 - 말 이동

### 입력
- [x] 말이 이동할 위치를 입력받는다.

### 출력
- [x] 말이 이동할때마다 체스판을 출력한다.

### 체스
- [x] 현재 위치와 이동할 위치로 체스말을 움직인다.
  - [x] 현재 위치와 이동할 위치가 같은지 검증한다.
  - [x] 현재 위치에 말이 존재하는지 검증한다.
  - [x] 체스말이 도달할 수 있는 위치인지 검증한다.
    - [x] 이동할 곳에 아군의 말이 존재하는지 검증한다.
  - [x] 이동 경로에 체스말이 존재하는지 검증한다.
    - [x] 나이트일 경우 검증하지 않는다.
- [x] 도달한 위치가 적군의 말일 경우 대체한다.
- [x] 각 진영이 번갈아가면서 말을 움직인다.

### 유닛
- [x] 킹은 모든 방향으로 한칸 움직인다.
- [x] 퀸은 모든 방향으로 움직인다.
- [x] 비숍은 대각선 방향으로 움직인다.
- [x] 나이트는 사방중 한 방향으로 한 칸, 그리고 그 방향의 양 대각선 방향 중 한 방향으로 움직인다.
- [x] 룩은 사방으로 움직인다.
- [x] 폰은 전진만 가능하다.
  - [x] 첫회 한정으로 2칸 이동이 가능하다.
  - [x] 공격은 대각선 방향으로 가능하다.
  - [x] 대각선 이동 시, 상대말이 없다면 도달할 수 없다.
  
## 3단계 - 승패 및 점수
- [x] King이 잡히는 경우 게임이 종료된다.
- [x] 현재 남아 있는 말에 대한 점수를 구할 수 있어야 한다.
- [x] "status" 명령을 입력하면 각 진영의 점수를 출력하고 어느 진영이 이겼는지 결과를 볼 수 있어야 한다.
- [x] 각 말의 점수는 queen은 9점, rook은 5점, bishop은 3점, knight는 2.5점이다.
- [x] pawn의 기본 점수는 1점이지만 같은 세로줄에 같은 색의 폰이 있는 경우 1점이 아닌 0.5점을 준다.
- [x] 한 번에 한 쪽의 점수만을 계산해야 한다.
