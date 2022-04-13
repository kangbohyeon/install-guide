# java + mysql연결
  - https://dev.mysql.com/downloads/connector/j/ 접속
  - select operation system 옵션을 platform independent로 선택
  - 둘 중 하나를 골라 다운로드
  - No thanks, just start my download 를 눌러 다운
  - 압축해제후 mysql-connector-java-8.0.28.jar파일을 복사
  - Finder -> macientosh Hd -> 라이브러리 -> java ->javavirtualMachines -> jdk-16.0.2.jdk(버전폴더) -> contents -> Home -> lib ->  mysql-connector-java-8.0.28.jar파일을 붙여넣기

(이클립스에서)
- project explorer 폴더 우클릭 -> properties -> java build path -> classpath -> add external jars.. -> 
macientosh Hd -> 라이브러리 -> java ->javavirtualMachines -> jdk-16.0.2.jdk(버전폴더) -> contents -> Home -> lib ->  mysql-connector-java-8.0.28.jar파일을 선택 -> open 
-> (order and export에서) JRE와 mysql-connector체크하기 -> apply and close 



참고사이트
https://dev-ku.tistory.com/212
