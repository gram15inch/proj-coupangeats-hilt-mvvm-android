# proj-coupangeats-hilt-mvvm-android

### 💻 기간    
23.01.28 ~ 02.10 <br>
### 🔧 리팩토링 
23.02.12 ~ 진행중 <br>
### 🗿 인원     
클라이언트 1, 서버 2 

## 스크린샷
<div>
<img src="https://user-images.githubusercontent.com/94951889/218974234-8c3f455b-5cbc-4570-bc43-58202203ad97.png"  width="195" height="390">
   <img src="https://user-images.githubusercontent.com/94951889/218974252-3ea16604-51c9-48a9-8a6d-da3596a789bc.png"  width="195" height="390">
   <img src="https://user-images.githubusercontent.com/94951889/218974255-8cbfa4be-0b69-47c4-9b1e-af3a240b9bd0.png"  width="195" height="390">
   <img src="https://user-images.githubusercontent.com/94951889/218974257-4fdf5eaa-a755-4a3c-865f-501ed5fda3a1.png"  width="195" height="390">
   <img src="https://user-images.githubusercontent.com/94951889/218974266-5c0af7c0-a802-4645-b651-f4692dfa891a.png"  width="195" height="390">
   <img src="https://user-images.githubusercontent.com/94951889/218974271-a8afb3b3-1445-474f-9daa-5e6fb1021bea.png"  width="195" height="390">
   <img src="https://user-images.githubusercontent.com/94951889/218974275-4266aac5-d471-49ea-9014-b34592c5f8bb.png"  width="195" height="390">
   <img src="https://user-images.githubusercontent.com/94951889/218974279-2286a0ca-7d9d-48d6-8195-3e1f573cff3c.png"  width="195" height="390">
 </div>

## 구현 영상
https://drive.google.com/file/d/1c3oUIk6y5szbaey2DMie-__O0hhCHht-/view?usp=share_link

## 개발 기술
- Mvvm, Clean Architecture
- Hilt, Dagger
- Databinding, Viewbinding
- Retrofit2
- Junit5
- Gradle, BuildSrc

## 서버 api 
* 로그인 
* 회원가입
* 가게 카테고리
* 가게 목록 
* 가게 상세 
* 메뉴 상세 
* 주소 
* 결제수단
* 주문 추가
* 주문 내역
* 이벤트 배너

## 리팩토링 일지

### 앱을 3개의 계층으로 나눠 각각의 모듈로 생성 (presentaion, domain, data)
    이유) 리팩토링을 위해 앱을 변경시킬때 빌드속도를 높이고 계층별로 필요한 추가/수정할 부분에 그곳에만 집중하기위해
 ### Groovy DSL to Kotlin DSL
    이유) 컴파일 타임 오류확인, BuildSrc를 사용하기 위해
### 모듈별 버전을 한번에 관리할 BuildSrc를 
    이유) 버전을 변경할때 앱의 한곳에서 변경하기위함과 사용하는 라이브러리를 한번에 파악하기 위해
### presentation, data가 domain 한곳에만 의존하도록 변경
    이유) domain로직, 즉 앱의 개발방향이 변경되지 않는한 presentation, data가 변경의 영향을 받지 않기 위해


## 개발 일지

### 23-01-28 (토)
<details>
<summary> 접기/펼치기 </summary>

### 1. 기획서 변경사항
    - 화면별 기능 기획서 보드 초안 작성
    - 1주차 작업 계획 초안 작성
### 2. 진행도(P1 기준) : 5%
### 3. 현재 기능/화면 구현
    - 스플래쉬 화면
    - 앱 아이콘 설정
### 4. 개발 회의록
    - 화면별 데이터 구조 파악
    - 화면별 필요 api 파악
    - 서버측 중첩 Json의 가능 유/무로 위 파악이 달라져 공부한 후 1/29(일) 1시에 다시 파악하기로함
### 5. 피드백
    - 필수 기능을 위주로 화면구성의 우선순위를 변경해 개발할것
### 6. 이슈
    - 
</details>

### 23-01-29 (일)
<details>
<summary> 접기/펼치기 </summary>

### 1. 기획서 변경사항
    - 결제결과 화면 -> 배송현황 화면 변경
### 2. 진행도(P1 기준) : 8%
### 3. 현재 기/화면 구현
    - 로그인 화면 (뷰)
    - 회원가입 화면 (뷰)
### 4. 개발 회의록
    - 화면별 데이터구조 파악 (1,2순위)
    - 화면별 api 파악 (1,2순위)
### 5. 피드백
    - 
### 6. 이슈
    - 아이콘을 png로 넣을시 크기 조절 힘듬 -> svg로 넣음 
    - <inclue>를 ConstraintLayout 안에서 사용시 마진값 무시됨 -> width, height를 재정의 해줘야함
    - <include>를 data binding시에 값이 안들어감 -> 값을 전역번수로 생성해 넣음 
</details>

### 23-01-30 (월)

<details>
<summary> 접기/펼치기 </summary>

### 1. 기획서 변경사항
    - 
### 2. 진행도(P1 기준) : 18%
### 3. 현재 기능/화면 구현
    - 회원가입 - 약관 세부사항 다이얼로그 화면
    - 회원가입 화면 (뷰로직)
    - 메인 화면 - 뼈대 레이아웃 
### 4. 개발 회의록
    - api 응답 구조 확인
### 5. 피드백
    - 
### 6. 이슈
    - dialog에 ConstraintLayout안에서 세로 0dp로 채우기가 미리보기상에서는 반영되는데 실제 앱상에서는 반영안됨 
        ->  세로값을 절대값으로 변경
    - 바텀 네비게이션 선택 색상 변경시 drawble 폴더에서 생성한 selector는 itemIconTint속성에 적용할수 없음
        -> color 폴더에서 생성후 사용
</details>

### 23-01-31 (화)

<details>
<summary> 접기/펼치기 </summary>

### 1. 기획서 변경사항
    - 
### 2. 진행도(P1 기준) : 25%
### 3. 현재 기능/화면 구현
    - 메인 화면 - 뼈대 로직 작성
    - 홈 화면 (뷰)
    - 로그인 화면 (비즈니스로직)
    - 로그인 화면 (오류처리)
    - 로그인/ 회원가입 api 연동
### 4. 개발 회의록
    - api 개발 우선순위 안내
    - 메뉴 옵션 리스폰스 구조 정의
    - api 명세서에 요청url, body 추가
### 5. 피드백
    - 
### 6. 이슈
    - navController로 리소스 아이디넣어 화면변경시 뒤로가기 버튼으로 탭이 변경됨
        -> 이동시마다 백스택 제거 
    - 코들린 1.8.0 에서 moshi가 json 변환을 못시킴
        -> 1.7.0 으로 변경
    - 코들린 버전을 1.8.0 에서 1.7.0으로 낮추니 모듈 종속성 중복 문제로 빌드가 안됨
        -> 종속성 분석기로 중복을 제거
    - http로 접근하니 네트워크 보안을 준수하지 않아 오류발생
        -> 네트워크 보안 규칙을 새로만들어 menifest에 추가

</details>

### 23-02-01 (수)

<details>
<summary> 접기/펼치기 </summary>


### 1. 기획서 변경사항
    -
### 2. 진행도(P1 기준) : 28%
### 3. 현재 기능/화면 구현
    - 회원가입 화면 (오류처리)
    - 홈 화면 (뷰)
### 4. 개발 회의록
    - 서버 가동시간 변경
### 5. 피드백
    - 뷰의 디테일에 중점을 두고 만들것
    - 작업속도를 더 빨리 할것
### 6. 이슈
    - 엑티비티에서 힐트 뷰모델사용시 oncreate에서 초기화 오류 발생
        -> viewModel 에서 필요한 값들만 엑티비티에 할당해서 사용
    - 이미지뷰에 사진 할당시 사진이 가진 높이보다 너 넓게 표시됨
        -> adjustViewBounds 속성을 true로 변경함

</details>



### 23-02-02 (목)

<details>
<summary> 접기/펼치기 </summary>

### 1. 기획서 변경사항
    -
### 2. 진행도(P1 기준) : 30%
### 3. 현재 기능/화면 구현
    - 로그인 화면 (뷰 디테일)
    - 회원가입 화면 (뷰 디테일) 
    - 홈 화면 (뷰)
    - 다이얼로그 화면 (뷰 디테일)
### 4. 개발 회의록
    - 
### 5. 피드백
    - 
### 6. 이슈
    - 로그인 화면의 에딧 텍스트가 클릭시 힌트가 위로가는 문제로 디테일을 맞추기 힘듬
        -> 커스텀 뷰로 직접 구현
    - 회원가입 화면 패스워드 숨김 토글 클릭시 피드백이 보임 
        -> 이미지 크기를 키워서 피드백을 가림
    - 회원가입 화면 텍스트 필드 기본 밑줄 색변경이안됨
        -> 셀렉터를 이용해 상태마다 다르게 색을 할당함
    - 홈 화면 위로 드래그시 일정 순간에 윗부분이 전부 하얗게 되는문제 
        -> 배경을 투명으로 바꿈

</details>


### 23-02-03 (금)

<details>
<summary> 접기/펼치기 </summary>

### 1. 기획서 변경사항
    - 결제 비밀번호 페이지를 2순위로 내림
### 2. 진행도(P1 기준) : 35%
### 3. 현재 기능/화면 구현
    - 홈 화면 (뷰)  
    - 가게 상세 화면 (뷰)
### 4. 개발 회의록
    - 
### 5. 피드백
    - ui 완성도에 집중해서 할것
    - 작업속도 더 올릴 것
### 6. 이슈
    - 콜스 레이아웃을 중첩해서 사용시 부모 뷰에 스크롤을 입력을 전달하지 못함
        -> 붙여주는 외부 모듈 사용

</details>


### 23-02-04 (토)

<details>
<summary> 접기/펼치기 </summary>


### 1. 기획서 변경사항
    -
### 2. 진행도(P1 기준) : 40%
### 3. 현재 기능/화면 구현
    - 가게 상세 화면 (뷰)
    - 메뉴 상세 화면 (뷰)
### 4. 개발 회의록
    - 
### 5. 피드백
    - 
### 6. 이슈
    - 
</details>


### 23-02-05 (일)

<details>
<summary> 접기/펼치기 </summary>


### 1. 기획서 변경사항
    -
### 2. 진행도(P1 기준) : 47%
### 3. 현재 기능/화면 구현
    - 메뉴 상세 화면 (뷰)
    - 카트 화면 (뷰)
### 4. 개발 회의록
    - 
### 5. 피드백
    - 마감 전날 디테일 수정
    - 화요일 오전까지 뷰 모두 끝내기
### 6. 이슈
    - 코디레이아웃을 다른 레이아웃으로 감싸면 fitsSystemWindows 속성이 작동 안됨
    - 리사이클러뷰에서 싱글 라디오 작동안됨
        -> stateflow를 이용해 클릭이 감지되면 다른 라디오 버튼을 false 시켜서 해결

</details>



### 23-02-06 (월)

<details>
<summary> 접기/펼치기 </summary>


### 1. 기획서 변경사항
    - 

### 2. 진행도(P1 기준) : 65%
### 3. 현재 기능/화면 구현
    - 메뉴 상세 화면 (뷰 로직)
    - 배달 현황 (뷰) 
    - 카트 화면 (뷰)
    - 홈 화면 (네트워크)
    - 가게 상세 화면(네트워크)
### 4. 개발 회의록
    - 서버 합치는 날짜 최대한 빠르게
    - api 주소 변경 알림
    - 서버 가동시간 변경
### 5. 피드백
    - 
### 6. 이슈
    -  

</details>

### 23-02-07 (화)


<details>
<summary> 접기/펼치기 </summary>

### 1. 기획서 변경사항
    - 
### 2. 진행도(P1 기준) :71%
### 3. 현재 기능/화면 구현
    - 메뉴상세 화면 (네트워크)
    - 메뉴상세 화면 (뷰 로직)
### 4. 개발 회의록
    -
### 5. 피드백
    - 
### 6. 이슈
    - 리사이클러뷰 어답터에서 각각에 아이템의 라디오 버튼을 그룹화 문제
        -> 라디오 상태를 추적하는 플로우 리스트를 생성해 해결

</details>

### 23-02-07 (수)

<details>
<summary> 접기/펼치기 </summary>


### 1. 기획서 변경사항
    - 
### 2. 진행도(P1 기준) : 84%
### 3. 현재 기능/화면 구현
    - 메뉴상세 화면 (뷰 로직)
    - 로직 (카트 담기) 
    - 홈 화면 (이벤트,가게 카테고리 api 연동)

### 4. 개발 회의록
    -
### 5. 피드백
    - 
### 6. 이슈
    - 메뉴 상세에서 생성한 어답터 안에 체크박스들의 상태추적 문제 
        -> 추적을 사용하지 않고 어답터에 콜백 메서드를 넣어 해결

</details>

### 23-02-07 (목)

<details>
<summary> 접기/펼치기 </summary>

### 1. 기획서 변경사항
    - 
### 2. 진행도(P1 기준) : 93%
### 3. 현재 기능/화면 구현
    - 카트 화면 (카트, 가게연결)
    - 가게 카테고리 이벤트 api 연결
    - 배달 현황 화면 (뷰 로직)
    - 홈 - 가게 - 메뉴 연결
    - 카트화면 (주문 추가 로직, 결제수단 api 연결)
### 4. 개발 회의록
    -
### 5. 피드백
    - 
### 6. 이슈
    - 

</details>

### 23-02-08 (금)


<details>
<summary> 접기/펼치기 </summary>


### 1. 기획서 변경사항
    - 
### 2. 진행도(P1 기준) : 100%
### 3. 현재 기능/화면 구현
    - 가게 상세 화면 (카트 업데이트 안되는 문제 수정)
    - 홈 화면 (배너, 카테고리 연결)
    - 각 화면 디테일 추가
### 4. 개발 회의록
    -
### 5. 피드백
    - 
### 6. 이슈
    - List타입에 MutableList 를 넣을경우 flow에서 바뀜을 감지를 못함
        - > toList로 바꿔서 해결
        
        
</details>
