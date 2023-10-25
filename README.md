# 깃허브 파일 업로드 순서
## 저장소 생성 및 연결
## 1.로컬저장소 생성
### git init
## 2.원격 저장소와 연결
### git remote add origin [원격저장소 주소]
## 3.연결된 원격 저장소 확인
### git remote -v
## 3-1. 기존 원격 저장소와의 연결 삭제 (원격 저장소를 잘못 연결했거나, 기존에 연결했던 것을 삭제하고 싶다면 아래명령어)
### git remote rm origin
## 4.파일 업로드 준비
### git branch -m master main
## 4-1.현재 파일 브랜치 이름 확인
### git branch
## 4-2.브랜치 기본(default)이름 설정
### git config --global init.defaultBranch [브랜치 이름]
## 5. 원격 저장소 파일을 로컬 저장소로 가져오기
### ●(README.md가 있다면) 원격 저장소의 파일 가져오기

### git pull origin [브랜치 이름]

### ●또는: 아래처럼 끌어오는 곳 생략 가능 (현재 작업중인 브랜치에서 pull됨)

### git pull


## 파일 업로드

## 순서 (add → commit → push)

## 1. add
### ●모든 변경사항을 올리는 경우

### git add .

### ●특정한 파일만 올리는경우

### git add [파일/디렉토리]

## 1-1.현재 버전 상태 확인
### gitstatus

## 1-2.add한 파일 빼내기
### add한 파일 모두 취소

### ●git rm --cached -r .


### 특정 파일만 add 취소

### git rm --cached [파일]

## 2.COMMIT
## 2-1.커밋하기(메세지 같이 작성)

### git commit -m "commit message"

## 3.PUSH
### ● 로컬 저장소에서 원격 저장소로 올리기

### git push origin [브랜치 이름]

### ● 아래처럼 목적지 생략 가능 (현재 작업중인 브랜치로 push됨)

### git push


