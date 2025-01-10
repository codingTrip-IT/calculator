# 사칙연산(Calculator) 개인과제

#### Java 문법을 활용하여 계산기 기능을 구현했습니다.

#### 작성자 : 조예인
___ 
**목차**

##### 1. 레벨별 과제 설명
1. Lv1 (calculator 패키지 참고)
2. Lv2 (calculator2 패키지 참고)
3. Lv3 (calculator3 패키지 참고)
##### 2. 한계점
1. 0으로 나누면 Infinity가 되는 원인 파악하기
2. 메서드 반환타입 제네릭을 사용해보기
3. 람다&스트림 더 활용하기

___ 
****1. 레벨별 과제 설명****  
**i. Lv1 (calculator 패키지 참고)**  
**1. Lv1 클래스 없이 기본적인 연산을 수행할 수 있는 계산기 만들기**

**App 클래스**   </br>
**1) 계산기는 양의 정수(0 포함) 2개의 숫자를 받을 수 있고 사칙연산 기호를 받을 수 있다.**
- Scanner를 사용해서 입력값을 받아온다.
- 조건에 맞지 않는 값을 입력한 경우 다시 처음으로 되돌아간다.
  - 조건문 if문 사용
- "나눗셈 연산에서 분모(두번째 정수)에 0이 입력될 수 없습니다."

**2) 입력 받은 사칙연산 기호에 맞는 사칙연산을 수행한다.**
- switch문 사용

**3) 계산기는 exit을 입력할 때까지 계속해서 값을 받고 연산 결과를 반환한다.**
- 반복문 while문 사용
- exit 입력 시 종료

**실행 결과**</br>
- **정상결과**</br>
<img width="250" alt="스크린샷 2025-01-09 오후 5 46 57" src="https://github.com/user-attachments/assets/abd144af-46b4-4bf9-a42f-461ad3e074a2" />
<img width="250" alt="스크린샷 2025-01-09 오후 5 47 03" src="https://github.com/user-attachments/assets/727c9f41-2054-4a26-9b28-ccd213b78343" />
<img width="250" alt="스크린샷 2025-01-09 오후 5 47 34" src="https://github.com/user-attachments/assets/374420dd-cb4c-4f63-ab2c-5b0d0c1fecc3" />
<img width="250" alt="스크린샷 2025-01-09 오후 5 46 57" src="https://github.com/user-attachments/assets/abd144af-46b4-4bf9-a42f-461ad3e074a2" />
- **비정상결과**</br>
<img width="300" alt="스크린샷 2025-01-09 오후 5 55 56" src="https://github.com/user-attachments/assets/2235b147-48aa-4099-8fdd-1906ec1a49f7" />  
</br>
**ii. Lv2 (calculator2 패키지 참고)**</br>
**2. Lv2 클래스를 적용해 기본적인 연산을 수행할 수 있는 계산기 만들기**

**App 클래스**</br>
**1) 양의 정수(0 포함) 2개의 숫자를 받을 수 있고 사칙연산 기호를 받을 수 있다.**
- Scanner를 사용해서 입력값을 받아온다.
- 조건에 맞지 않는 값을 입력한 경우 다시 처음으로 되돌아간다.
  - 조건문 if문 사용
- "사칙연산 기호만 입력해야 합니다."
- "나눗셈 연산에서 분모(두번째 정수)에 0이 입력될 수 없습니다."

**2) 입력 받은 사칙연산 기호에 맞는 사칙연산을 수행한다.**
- switch문 사용

**3) 계산기는 exit을 입력할 때까지 계속해서 값을 받고 연산 결과를 반환한다.**
- 반복문 while문 사용
- exit 입력 시 종료

**4) exit을 입력한 경우, 가장 먼저 저장된 데이터를 삭제할지 여부를 확인 후 y이면 삭제한다.**
- Calculator 클래스에 저장된 결과값 리스트의 값 중 가장 먼저 저장된 데이터를 삭제한다.
- Calculator 클래스의 removeResult 메서드 활용

**5) 결과값을 저장한 리스트의 값을 가져온다.**
- Calculator 클래스에 저장된 결과값 리스트의 값을 가져온다.
  - Calculator 클래스의 getter 사용

**Calculator 클래스**</br>
**1) 사칙연산을 수행한다.**
- calculate : App 클래스에서 매개변수를 받아서 사칙연산을 계산하는 메서드

**2) 계산된 결과 값들을 기록하는 컬렉션을 만든다.**
- ArrayList(컬렉션)인 resultList에 값을 저장한다.
- addResult : 결과값을 리스트에 저장하는 메서드

**3) 컬렉션의 가장 먼저 저장된 데이터를 삭제하는 기능을 만든다.**
- removeResult : 결과값을 저장한 리스트 중 가장 먼저 저장된 데이터를 삭제하는 메서드

**실행 결과**</br>
- **정상결과**</br>
<img width="250" alt="스크린샷 2025-01-09 오후 5 49 47" src="https://github.com/user-attachments/assets/39baa7ef-206d-447d-8510-000a2a03333d" />
<img width="250" alt="스크린샷 2025-01-09 오후 5 50 04" src="https://github.com/user-attachments/assets/b9dd5cfd-24e6-41b8-a0d8-0abe7243f61c" />

- **비정상결과**</br>
<img width="350" alt="스크린샷 2025-01-09 오후 5 55 34" src="https://github.com/user-attachments/assets/c79b055c-c66c-4fb2-a471-8386fb33da12" />  
</br></br>
**iii. Lv3 (calculator3 패키지 참고)**</br>
**3. Lv3 Enum, 제네릭, 람다 & 스트림을 이해한 계산기 만들기**

**App 클래스**</br>
**1) 2개의 숫자를 받을 수 있고 사칙연산 기호를 받을 수 있다.**
- Scanner를 사용해서 입력값을 받아온다.
- 조건에 맞지 않는 값을 입력한 경우 다시 처음으로 되돌아간다.
  - try-catch문으로 예외처리 구현
- InputMismatchException
  - NullPointerException
- "사칙연산 기호만 입력해야 합니다."
- "나눗셈 연산에서 분모(두번째 정수)에 0이 입력될 수 없습니다."

**2) 입력 받은 사칙연산 기호에 맞는 사칙연산을 수행한다.**
- switch문 사용

**3) 계산기는 exit을 입력할 때까지 계속해서 값을 받고 연산 결과를 반환한다.**
- 반복문 while문 사용
- exit 입력 시 종료

**4) exit을 입력한 경우, 가장 먼저 저장된 데이터를 삭제할지 여부를 확인 후 y이면 삭제한다.**
- Calculator 클래스에 저장된 결과값 리스트의 값 중 가장 먼저 저장된 데이터를 삭제한다.
- Calculator 클래스의 removeResult 메서드 활용

**5) 저장된 연산 결과들 중 Scanner로 입력받은 값보다 큰 결과값 들을 출력하기 위해 값을 받는다.**
- Calculator 클래스의 compareResult 메서드 활용

**6) 결과값을 저장한 리스트의 값을 가져온다.**
- Calculator 클래스에 저장된 결과값 리스트의 값을 가져온다.
  - Calculator 클래스의 getter 사용

**ArithmeticCalculator 클래스**</br>
**1) 사칙연산을 수행한다.**
- calculate : App 클래스에서 매개변수를 받아서 사칙연산을 계산하는 메서드
- 제네릭을 활용해서 실수도 매개변수로 받을 수 있게 수정한다.

**2) 계산된 결과 값들을 기록하는 컬렉션을 만든다.**
- ArrayList(컬렉션)인 resultList에 값을 저장한다.
- addResult : 결과값을 리스트에 저장하는 메서드

**3) 컬렉션의 가장 먼저 저장된 데이터를 삭제하는 기능을 만든다.**
- removeResult : 결과값을 저장한 리스트 중 가장 먼저 저장된 데이터를 삭제하는 메서드

**4) 저장된 연산 결과 컬렉션에서 Scanner로 입력받은 값보다 큰 결과값 들을 출력하게 한다.**
- compareResult : 저장된 연산 결과들 중 Scanner로 입력받은 값보다 큰 결과값 들을 출력하는 메서드

**OperatorType(Enum)**
- 사칙연산자가 아니면 받아올 수 없도록 enum으로 만듭니다.
- enum의 값이 매개변수와 같으면 enum의 값을 리턴합니다.

**실행 결과**</br>
- **정상 결과**</br>
<img width="250" alt="스크린샷 2025-01-09 오후 5 53 30" src="https://github.com/user-attachments/assets/8cb8f0a6-0876-4ecc-8fc3-4a448eb9c903" />
<img width="400" alt="스크린샷 2025-01-09 오후 5 53 47" src="https://github.com/user-attachments/assets/da88d06c-cea3-4715-8c62-4c75702d2178" />
<img width="400" alt="스크린샷 2025-01-09 오후 5 54 00" src="https://github.com/user-attachments/assets/af263ce8-d4f7-47ff-810b-95ec7053cb5b" />
- **비정상 결과**</br>
<img width="200" alt="스크린샷 2025-01-09 오후 5 54 41" src="https://github.com/user-attachments/assets/e40950c6-da09-459a-954f-d5ad026b5bf1" />
<img width="400" alt="스크린샷 2025-01-09 오후 5 55 11" src="https://github.com/user-attachments/assets/dc17ec6e-ef89-41d6-8c12-6fec3fca45b1" />
 ___   
**2. 한계점**</br>
**i. 0으로 나누면 Infinity가 되는 원인 파악하기**</br>
if문을 사용해서 0으로 나누지 못하도록 처리했으나,    
사실은 try-catch문 ArithmeticException을 사용하고 싶었습니다.  
그러나 0으로 나눌 경우, Exception이 아닌 Infinity로 받아져서 예외처리가 안되므로 if문으로 처리했습니다.

<img width="250" alt="스크린샷 2025-01-09 오후 5 41 00" src="https://github.com/user-attachments/assets/7a712966-c124-4b2f-8e71-66f39bf9b9d6" />    

**ii. 메서드 반환타입 제네릭을 사용해보기**</br>  
calculator 메서드에서 반환타입을 제네릭으로 받고 싶었으나,  
return result 부분에서 형변환을 하는 방법을 찾지 못해서 double타입으로 두었습니다.  

<img width="518" alt="스크린샷 2025-01-09 오후 5 43 26" src="https://github.com/user-attachments/assets/18612356-2e4b-4e2a-91e9-2e7bf94247a2" />

**iii.람다&스트림 더 활용하기**</br>
Scanner로 입력받은 값보다 결과값 리스트 값이 더 큰 경우 그 값을 출력하도록 구현했습니다.   
추후 입력값이 결과값보다 작은 경우 작다는 메시지 출력을 스트림을 사용해서 구현하고 싶습니다. 

<img width="743" alt="스크린샷 2025-01-09 오후 5 44 01" src="https://github.com/user-attachments/assets/65c880b4-7c7f-4645-91c1-a87461b33094" />
___ 
지금까지 읽어주셔서 감사합니다.

**contact :** https://codingtrip.tistory.com/