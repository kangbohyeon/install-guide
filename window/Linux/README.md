# vm virtualbox
- https://www.virtualbox.org/wiki/Downloads에서 
- VirtualBox 6.1.32 platform packages ->windows hosts , VirtualBox 6.1.32 Oracle VM VirtualBox Extension Pack ->  All supported platforms
- 다운로드

 - 환경설정 ->기본머신폴더  -> E:\VirtualBox VMs(여유잇는 드라이브로 이름재설정)  ->입력 -> 가상머신 -> 호스트키조합(단축키) : ctrl+alt ->  언어 : 한국어 -> 확장 :추가(VirtualBox 6.1.32 Oracle VM VirtualBox Extension Pack)
추가 -> 이름 : hyperion -> 종류 : 리눅스 -> : 버젼 : 우분트(64bit) -> 다음 ->다음 -> 지금새가상하드디스크만들기 -> 다음 -> vDI(virtualbox 디스크 이미지) -> 다음 -> 동적할당 -> 다음 -> 60gb -> 만들기 
(hyperion)설정 -> 시스템 -> 마더보드 -> 플로피체크해제 -> 디스플레이 -> 비디오메모리(4k기준 128mb올리기) -> 그래픽 컨트롤러 : VBoxVGA로변경 -> 오디오 -> 오디오 사용하기(체크해제) -> 확인
(hyperion)설정 -> 저장소 -> 컨트롤러 :ide -> ubuntu-20.04.4-desktop-amd64추가


# 우분트 설치 
- https://ubuntu.com/download에서 
- ubuntu desktop -> 오른쪽에 download 

# pycharm download
- cd Downloads -> sudo tar zxvf pycharm-coummity-2022.1.tar.gz -C /opt

# pycharm 실행
- cd /opt
- cd pycharm-community-2022.1/
- cd bin
- ./pycharm.sh &
