
![NumbersEnum.png](https://i.imgur.com/7zaUCzD.png)


# 대략적인 설명

## client
    1.Player: 사용자가 하는 활동을 수행하는 객체(숫자 입력, 재시작 여부 체크 등)

## controller
    1. Computer: 상대방에 해당하는 객체로 자신의 숫자들을 랜덤을 생성하고 
                플레이어게서 입력한 숫자들을 받아 자신의 숫자와 비교하여 BallCount를 반환

## view
    1.InputView: Player의 요청에 대한 ui로 입력을 받아 플레이어에게 전달
    2.OutputView: 플레이어에게서 받은 볼카운트를 출력

## domain
    1.BallCount: 스트라이크, 아웃 볼카운트를 저장하는 일급컬렉션
    2.ComputerNumbers: 컴퓨터가 랜덤으로 생성하는 숫자들을 저장하는 일급컬렉션
    3.PlayerNumbers: 플레이어가 입력한 숫자를 가지는 일급컬렉션
    4.Number: Numbers의 각 자리 숫자에 대한 Wrapping 클래스

## exception
### input
    1.FormatException: 숫자 Input이 잘못된 형식일 때 나타나는 에러
    2.RetryFormatException: retry시 1이나 2 이외의 다른 입력이 들어왔을 경우 발생하는 에러

### Number
    1.RangeException: 숫자가 1 미만 9 초과일 경우 발생하는 에러

### Numbers
    1.DuplicationException: PlayerNumbers에 중복된 숫자가 있을 경우 발생하는 에러
    2.WrongSizeException: PlayerNumbers의 길이가 3이 아닌 경우 발생하는 에러

## enums
    1. NumberEnum: 코드 전반에서 사용되는 상수를 모아두는 곳
## service
    1.NumbersService: Computer의 ComputerNumbers와 관련된 로직 수행

## utils
    Utils: 코드 전반에서 사용할 수 있는 유틸리티 제공




