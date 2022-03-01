# GIT 이란?


- GIT 이란 소스코드 관리를 위한 형상 관리 도구
- 코드를 작업한 걸 보관하는 방법
- 코드를 같이 작업했을 때, 자동으로 합쳐주는 기능
- 협업 기술



## SVN ?

- SVN 은 원격 저장소가 필요 
- GIT 은 로컬 저장소를 지원
- 로컬 저장소를 지원하기 때문에 원격 저장소 없이도 사용 가능 (고장나더라도)

## GIT 의 장점

- 로컬 저장소를 이용한 빠른 퍼포먼스
- 브랜치를 이용한 효율적인 협업 (later)


## 원격 저장소의 종류

- git 서버 구축
- github (Web User Interface 환경으로 쉽게볼 수있음)
- gitlab


## TEST 전체 옵션 

- git config --global user.email "<이메일>"
- git config --global user.name "<깃에서 표시될 닉네임>"



## Git Upload 로직 

- 처음에 한번은 각 프로젝트마다 처음에 한번씩




1. git init (처음에 한번)
- GIT 프로그램이 현재 경로를 기억하게 하겠다.
- 현재 경로에 GIt 정보를 저장할 수 있도록 하겠다.

2. git add <파일 이름.확장자>
- 현재 경로의 파일을 GIT 에다가 등록하겠다.
- ( git add . ) 시 전체 파일 add

3. git commit -m "<메시지>"
- GIT 에 등록한 파일들을 로컬 저장소에 저장하겠다. <메시지>라는 내용으로

4. git remote add <변수>(origin) <경로> (처음에 한번)
- 원격 저장소의 경로를 설정하겠다.
- 변수에 이 경로를 설정하겠다.

5. git push origin master
- 로컬 저장소의 저장을 변수에 있는 원격 저장소의 경로로 저장하겠다.


## Git Download 로직


- git pull origin master
  - 수정된 부분만 로컬로 다운받겠다.
+ git clone <경로>
  - 프로젝트를 통째로 복사해서 다운받겠다.




## GIT 명령어 추가

git remote -v = 원격 저장소의 경로를 파악하겠다.
git remote set-url <변수>(origin) <경로> = 원격 저장소의 경로를 변경하곘다.
git remote remove <변수>(origin) = 원격 저장소 설정을 삭제하겠다.


git status = 현재 add 상태 파악