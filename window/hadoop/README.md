# 하둡설치
- wget http://mirror.apache-kr.org/hadoop/common/hadoop-3.2.3/hadoop-3.2.3.tar.gz
- sudo tar xvf ./hadoop-3.2.3.tar.gz -C /usr/sbin/
- vi ~/.bashrc
  - export HADOOP_HOME=/usr/sbin/hadoop-3.2.3
  - export PATH=$PATH$JAVA_HOME/bin:$HADOOP_HOME/bin/:$HADOOP_HOME/sbin
- source ~/.bashrc


# 하둡java환경변수연결
- cd /usr/sbin/hadoop-3.2.3/etc/hadoop
- vi haddop-env.sh
  - export JAVA_HOME=/usr/lib/jvm/java-8-openjdk-amd64


# 하둡 dfs single.node 설정
## vi core-site.xml:
   <configuration>
 
      <property>
       
          <name>fs.defaultFS</name>
       
          <value>hdfs://localhost:9000</value>
       
      </property>
 
   </configuration>


## vi hdfs-site.xml:
<configuration>
 
    <property>
     
        <name>dfs.replication</name>
     
        <value>1</value>
     
    </property>
 
</configuration>


## vi mapred-site.xml:
<configuration>
 
    <property>
     
        <name>mapreduce.framework.name</name>
     
        <value>yarn</value>
     
    </property>
 
    <property>
     
        <name>mapreduce.application.classpath</name>
     
        <value>$HADOOP_MAPRED_HOME/share/hadoop/mapreduce/*:$HADOOP_MAPRED_HOME/share/hadoop/mapreduce/lib/*</value>
     
    </property>
 
</configuration>


## 하둡 yarn single.node 설정
- vi yarn-site.xml:

<configuration>
 
    <property>
     
        <name>yarn.nodemanager.aux-services</name>
     
        <value>mapreduce_shuffle</value>
     
    </property>
 
    <property>
     
        <name>yarn.nodemanager.env-whitelist</name>
        <value>JAVA_HOME,HADOOP_COMMON_HOME,HADOOP_HDFS_HOME,HADOOP_CONF_DIR,CLASSPATH_PREPEND_DISTCACHE,HADOOP_YARN_HOME,HADOOP_HOME,PATH,LANG,TZ,HADOOP_MAPRED_HOME</value>
    
 </property>
 
</configuration>

# apache install
sudo apt update
sudo ufw allow 'Apache'
sudo ufw status
sudo systemctl status apache2



# ssh 설치 및 설정 및 HDFS포맷
- sudo apt install ssh
- ssh-keygen -t rsa -p '' -f ~/.ssh/id_rsa
- cat ~/.ssh/id_rsa.pub >> ~/.ssh/authorized_keys
- chmod 0600 ~/.ssh/authorized_keys
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

# user생성
/usr/sbin/hadoop-3.2.3/bin/hdfs dfs -mkdir /user

# hadoop 파일시스템 확인
hadoop fs -ls /
# user추가
adduser user01
usermod -aG sudo user01

# HDFS 및 yarn실행 UI확인
네임노드
http://localhost:9870

리소스매니저
http://localhost:8088

히스토리 서버
http://localhost:19888
