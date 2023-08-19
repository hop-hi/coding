2가지 정보
 - 영화 정보
  - 엔티티 설계
  - 정규화(Normalization)
  
  1) 요구사항 정보를 잘 정리하는게 첫번째 일
     - 산출물(결과물/실제작업결과...)
      * 비전문서(Vision document) : 왜 이 프로젝트를 하는가? / 목표/목적은 무엇인가? / 범위는 무엇인가?
      * 요구사항 정의 문서 / SRS(Software Requirement Specification) / BRD(Business Requirement Document)
        / FRD(Functional Requirement Document)...
        - 기능의 정의(요구사항을 잘 정리한 항목들..)
          : 기능이 어떻게 흘러 가는지? (프로세스/플로우...) , 참여하는 (엔티티, 객제, 클래스.......)
          
  2) 두번째일은... 분석 과정...(Deep Dive 하게 파고드는거...)
     - 영화를 조회/검색한다.
       (1)사용자는 검색어를 입력한다.(입력시 항목은 제목/???? 를 선택하고 입력 한다.)
       (2)시스템은 검색어를 검증하고, 검증된 검색어를 IMDB에 REST로 요청한다...
       .......
     - 사용자 / 검색어 / IMDB / REST.......
  
  3) 세번째 ... 설계 과정..
     - 앞에서 설명한 프로세스/객체/.... Conceptual (개념적)
     - 구체화
     - Logical Model --> Physical Model
     - Abstract Model ...-> Design Model...  
 

     * 유지 보수 비용
       - 유지 보수 : 수정/변경/삭제/신규추가 (목적어 : 자원(resource : File(java, jsp, html, .....) , DB Table(스키마), H/W , S/W....))
       - 변경후 적용 : 영향을 받게 됨 
       (멜론에 인기차트를 보여 주는 데이터에 지역정보를 추가함. : table , sql, Java(DAO), Java(Service), Java(Controller)
                                                     React.js (javascript....))
       - 변경한 영역(인기 차트 화면), 기존에 다른 화면들도 확인(Regression Test : 회귀 테스트)
       
     
 
 - 영화와 관련하여 음악 검색 한 결과 정보

 표준... 
 create table movie_info
 (
 	movie_key varchar(50) not null,
 	movie_open_year varchar(4) not null,
 	movie_title varchar(255) not null,
 	movie_director varchar(100) not null,
 	movie_country varchar(100) not null,
 )
 
 
 create table movie_actor_info
 (
    movie_actor_key varchar(50) not null,
    movie_key varchar(50) not null,
    actor_key varchar(50) not null
 )
 
 create table actor_info
 (
 	actor_key varchar(50) not null,
 	actor_name varchar(255) not null,
 	actor_gneder char(1) not null
 )
  
 
 create table music_info
 (
 	music_key varchar(50) not null,
 	?????
 )
 
 
 영화키 2001 타이타닉 ??? 디카프리오 남
 영화키 2001 타이타닉 ??? 여배우이름 여
 영화키 2001 매트릭스 ??? 여배우이름 여
 영화키 2001 매트릭스 ??? 여배우이름 여
 영화키 2001 매트릭스 ??? 여배우이름 여
 
  
 영화키 2001 타이타닉 
 
 관계키 영화키 배우키(남)
 관계키 영화키 배우키(여)
 
 배우키 디카프리오 남
 배우키 여배우    여
 
 Redundancy
 
 
 
 -- 관계 테이블
 create table movie_actor_info
 (
    movie_actor_key varchar(50) not null,
    movie_key varchar(50) not null,
    actor_key varchar(50) not null
 )
 
 create table actor_info
 (
 	actor_key varchar(50) not null,
 	actor_name varchar(255) not null
 )
 
 
 
 
 영화와 배우의관계 (N:N의 관계 관계 테이블을 만들어야 함.)
   - 영화측면 : 여러 배우 N 
   - 배우측면 : 여러 영화 N
 
 다대다 관계  N:N 
 1:1 
 1:N
 N:N
 
 
 