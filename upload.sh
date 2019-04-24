source /etc/profile
mvn scala:compile compile package -Dmaven.test.skip=true
HADOOP_USER_NAME=hdfs hdfs dfs -put -f  ./target/bigdata-1.0-SNAPSHOT.jar /apps/spark/