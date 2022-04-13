# mongodb 설치
 - https://www.mongodb.com/try/download/community  
 - -> 오른쪽 아래에 download -> 다운로드폴더에서 우클릭 -> 호환성문제해결 -> 프로그램테스트 -> next -> next -> complete -> next-> back
 - -> install mongodb as a service 체크해제 -> next-> next -> install -> 예 -> ignore -> finish
 - mongodb compass 광고창같은거 x클릭 -> start using compass클릭 

 - 환경변수 -> 시스템 변수 -> path -> 편집 -> 새로만들기 -> C:\Program Files\MongoDB\Server\5.0\bin ->확인 -> 확인

  - c드라이브 파일생성(파일명 : mongodb)
  - 관리자 cmd -> mongod -dbpath c:/mongodb(c드라이브 파일생성명)
  - ctrl +f -> localhost


# mongodb compass
  - mongodb compass -> mongodb://localhost/ -> connection
  - (연결 안될시 cmd 다끄고 다시 실행)
  - 관리자 cmd -> mongod -dbpath c:/mongodb(c드라이브 파일생성명)
  - (관리자권한)cmd -> mongo



참고 사이트
https://javacpro.tistory.com/64
