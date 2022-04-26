# 하둡설치
- wget http://mirror.apache-kr.org/hadoop/common/hadoop-3.2.3/hadoop-3.2.3.tar.gz
- sudo tar xvf ./hadoop-3.2.3.tar.gz -C /usr/sbin/
- vi ~/.bashrc
- export HADOOP_HOME=/usr/sbin/hadoop-3.2.3
- export PATH=$PATH$JAVA_HOME/bin:$HADOOP_HOME/bin/:$HADOOP_HOME/sbin
- source ~/.bashrc

- sudo -i
- vi ~/.bashrc
- export HADOOP_HOME=/usr/sbin/hadoop-3.2.3
- export PATH=$PATH$JAVA_HOME/bin:$HADOOP_HOME/bin/:$HADOOP_HOME/sbin
- source ~/.bashrc

- cd /usr/sbin/hadoop-3.2.3/etc/hadoop
- vi haddop-env.sh

# ssh 설치 및 설정 및 HDFS포맷
- sudo apt install ssh
- ssh-keygen -t rsa -p '' -f ~/.ssh/id_rsa
- cat ~/.ssh/id_rsa.pub >> ~/.ssh/authorized_keys
- ssh localhost
- hdfs namenode -format
 
# HDFS 및 yarn실행 
- start-dfs.sh
- start-yarn.sh
- mapred --daemon start historyserver

# HDFS 및 yarn stop
- stop-dfs.sh
- stop-yarn.sh
- mapred --daemon stop historyserver

# user추가
adduser user01
usermod -aG sudo user01

# HDFS 및 yarn실행 UI확인
네임노드
http://localhost:50070

리소스매니저
http://localhost:8088

히스토리 서버
http://localhost:19888
