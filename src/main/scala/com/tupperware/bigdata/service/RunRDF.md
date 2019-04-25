```
/usr/java/jdk1.8.0_201-amd64/bin/java -Dspark.master=local[*] -javaagent:/opt/idea-IU-183.5153.38/lib/idea_rt.jar=43416:/opt/idea-IU-183.5153.38/bin -Dfile.encoding=UTF-8 -classpath /usr/java/jdk1.8.0_201-amd64/jre/lib/charsets.jar:/usr/java/jdk1.8.0_201-amd64/jre/lib/deploy.jar:/usr/java/jdk1.8.0_201-amd64/jre/lib/ext/cldrdata.jar:/usr/java/jdk1.8.0_201-amd64/jre/lib/ext/dnsns.jar:/usr/java/jdk1.8.0_201-amd64/jre/lib/ext/jaccess.jar:/usr/java/jdk1.8.0_201-amd64/jre/lib/ext/jfxrt.jar:/usr/java/jdk1.8.0_201-amd64/jre/lib/ext/localedata.jar:/usr/java/jdk1.8.0_201-amd64/jre/lib/ext/nashorn.jar:/usr/java/jdk1.8.0_201-amd64/jre/lib/ext/sunec.jar:/usr/java/jdk1.8.0_201-amd64/jre/lib/ext/sunjce_provider.jar:/usr/java/jdk1.8.0_201-amd64/jre/lib/ext/sunpkcs11.jar:/usr/java/jdk1.8.0_201-amd64/jre/lib/ext/zipfs.jar:/usr/java/jdk1.8.0_201-amd64/jre/lib/javaws.jar:/usr/java/jdk1.8.0_201-amd64/jre/lib/jce.jar:/usr/java/jdk1.8.0_201-amd64/jre/lib/jfr.jar:/usr/java/jdk1.8.0_201-amd64/jre/lib/jfxswt.jar:/usr/java/jdk1.8.0_201-amd64/jre/lib/jsse.jar:/usr/java/jdk1.8.0_201-amd64/jre/lib/management-agent.jar:/usr/java/jdk1.8.0_201-amd64/jre/lib/plugin.jar:/usr/java/jdk1.8.0_201-amd64/jre/lib/resources.jar:/usr/java/jdk1.8.0_201-amd64/jre/lib/rt.jar:/root/scala/bigdata/target/classes:/root/.ivy2/cache/org.scala-lang/scala-library/jars/scala-library-2.11.8.jar:/root/.ivy2/cache/org.scala-lang/scala-reflect/jars/scala-reflect-2.11.8.jar:/root/.ivy2/cache/org.scala-lang/scala-library/srcs/scala-library-2.11.8-sources.jar:/root/.ivy2/cache/org.scala-lang/scala-reflect/srcs/scala-reflect-2.11.8-sources.jar:/root/.m2/repository/org/scala-lang/scala-library/2.11.8/scala-library-2.11.8.jar:/usr/java/jdk1.8.0_201-amd64/lib/tools.jar:/root/.m2/repository/org/scala-lang/scala-compiler/2.11.8/scala-compiler-2.11.8.jar:/root/.m2/repository/org/scala-lang/modules/scala-xml_2.11/1.0.4/scala-xml_2.11-1.0.4.jar:/root/.m2/repository/org/scala-lang/modules/scala-parser-combinators_2.11/1.0.4/scala-parser-combinators_2.11-1.0.4.jar:/root/.m2/repository/org/scala-lang/scala-reflect/2.11.8/scala-reflect-2.11.8.jar:/root/Downloads/2.6.4.0-91/hadoop-yarn/lib/xz-1.0.jar:/root/Downloads/2.6.4.0-91/hadoop-yarn/lib/asm-3.2.jar:/root/Downloads/2.6.4.0-91/hadoop-yarn/lib/fst-2.24.jar:/root/Downloads/2.6.4.0-91/hadoop-yarn/lib/guice-3.0.jar:/root/Downloads/2.6.4.0-91/hadoop-yarn/lib/avro-1.7.4.jar:/root/Downloads/2.6.4.0-91/hadoop-yarn/lib/gson-2.2.4.jar:/root/Downloads/2.6.4.0-91/hadoop-yarn/lib/jsch-0.1.54.jar:/root/Downloads/2.6.4.0-91/hadoop-yarn/lib/jsp-api-2.1.jar:/root/Downloads/2.6.4.0-91/hadoop-yarn/lib/xmlenc-0.52.jar:/root/Downloads/2.6.4.0-91/hadoop-yarn/lib/guava-11.0.2.jar:/root/Downloads/2.6.4.0-91/hadoop-yarn/lib/jets3t-0.9.0.jar:/root/Downloads/2.6.4.0-91/hadoop-yarn/lib/jettison-1.1.jar:/root/Downloads/2.6.4.0-91/hadoop-yarn/lib/jsr305-3.0.0.jar:/root/Downloads/2.6.4.0-91/hadoop-yarn/lib/log4j-1.2.17.jar:/root/Downloads/2.6.4.0-91/hadoop-yarn/lib/objenesis-2.1.jar:/root/Downloads/2.6.4.0-91/hadoop-yarn/lib/paranamer-2.3.jar:/root/Downloads/2.6.4.0-91/hadoop-yarn/lib/activation-1.1.jar:/root/Downloads/2.6.4.0-91/hadoop-yarn/lib/commons-io-2.4.jar:/root/Downloads/2.6.4.0-91/hadoop-yarn/lib/httpcore-4.4.4.jar:/root/Downloads/2.6.4.0-91/hadoop-yarn/lib/javax.inject-1.jar:/root/Downloads/2.6.4.0-91/hadoop-yarn/lib/jaxb-api-2.2.2.jar:/root/Downloads/2.6.4.0-91/hadoop-yarn/lib/stax-api-1.0-2.jar:/root/Downloads/2.6.4.0-91/hadoop-yarn/lib/aopalliance-1.0.jar:/root/Downloads/2.6.4.0-91/hadoop-yarn/lib/commons-cli-1.2.jar:/root/Downloads/2.6.4.0-91/hadoop-yarn/lib/commons-net-3.1.jar:/root/Downloads/2.6.4.0-91/hadoop-yarn/lib/jersey-core-1.9.jar:/root/Downloads/2.6.4.0-91/hadoop-yarn/lib/jersey-json-1.9.jar:/root/Downloads/2.6.4.0-91/hadoop-yarn/lib/servlet-api-2.5.jar:/root/Downloads/2.6.4.0-91/hadoop-yarn/lib/commons-lang-2.6.jar:/root/Downloads/2.6.4.0-91/hadoop-yarn/lib/httpclient-4.5.2.jar:/root/Downloads/2.6.4.0-91/hadoop-yarn/lib/jersey-guice-1.9.jar:/root/Downloads/2.6.4.0-91/hadoop-yarn/lib/jetty-6.1.26.hwx.jar:/root/Downloads/2.6.4.0-91/hadoop-yarn/lib/json-smart-1.1.1.jar:/root/Downloads/2.6.4.0-91/hadoop-yarn/lib/commons-codec-1.4.jar:/root/Downloads/2.6.4.0-91/hadoop-yarn/lib/commons-lang3-3.4.jar:/root/Downloads/2.6.4.0-91/hadoop-yarn/lib/guice-servlet-3.0.jar:/root/Downloads/2.6.4.0-91/hadoop-yarn/lib/jaxb-impl-2.2.3-1.jar:/root/Downloads/2.6.4.0-91/hadoop-yarn/lib/jersey-client-1.9.jar:/root/Downloads/2.6.4.0-91/hadoop-yarn/lib/jersey-server-1.9.jar:/root/Downloads/2.6.4.0-91/hadoop-yarn/lib/netty-3.6.2.Final.jar:/root/Downloads/2.6.4.0-91/hadoop-yarn/lib/api-util-1.0.0-M20.jar:/root/Downloads/2.6.4.0-91/hadoop-yarn/lib/leveldbjni-all-1.8.jar:/root/Downloads/2.6.4.0-91/hadoop-yarn/lib/metrics-core-3.0.1.jar:/root/Downloads/2.6.4.0-91/hadoop-yarn/lib/azure-storage-5.4.0.jar:/root/Downloads/2.6.4.0-91/hadoop-yarn/lib/commons-math3-3.1.1.jar:/root/Downloads/2.6.4.0-91/hadoop-yarn/lib/java-xmlbuilder-0.4.jar:/root/Downloads/2.6.4.0-91/hadoop-yarn/lib/javassist-3.18.1-GA.jar:/root/Downloads/2.6.4.0-91/hadoop-yarn/lib/nimbus-jose-jwt-3.9.jar:/root/Downloads/2.6.4.0-91/hadoop-yarn/lib/protobuf-java-2.5.0.jar:/root/Downloads/2.6.4.0-91/hadoop-yarn/lib/snappy-java-1.0.4.1.jar:/root/Downloads/2.6.4.0-91/hadoop-yarn/lib/commons-digester-1.8.jar:/root/Downloads/2.6.4.0-91/hadoop-yarn/lib/curator-client-2.7.1.jar:/root/Downloads/2.6.4.0-91/hadoop-yarn/lib/jcip-annotations-1.0.jar:/root/Downloads/2.6.4.0-91/hadoop-yarn/lib/commons-logging-1.1.3.jar:/root/Downloads/2.6.4.0-91/hadoop-yarn/lib/curator-recipes-2.7.1.jar:/root/Downloads/2.6.4.0-91/hadoop-yarn/lib/jetty-util-6.1.26.hwx.jar:/root/Downloads/2.6.4.0-91/hadoop-yarn/lib/api-asn1-api-1.0.0-M20.jar:/root/Downloads/2.6.4.0-91/hadoop-yarn/lib/commons-compress-1.4.1.jar:/root/Downloads/2.6.4.0-91/hadoop-yarn/lib/apacheds-i18n-2.0.0-M15.jar:/root/Downloads/2.6.4.0-91/hadoop-yarn/lib/commons-beanutils-1.7.0.jar:/root/Downloads/2.6.4.0-91/hadoop-yarn/lib/curator-framework-2.7.1.jar:/root/Downloads/2.6.4.0-91/hadoop-yarn/lib/azure-keyvault-core-0.8.0.jar:/root/Downloads/2.6.4.0-91/hadoop-yarn/lib/commons-collections-3.2.2.jar:/root/Downloads/2.6.4.0-91/hadoop-yarn/lib/commons-configuration-1.6.jar:/root/Downloads/2.6.4.0-91/hadoop-yarn/lib/jetty-sslengine-6.1.26.hwx.jar:/root/Downloads/2.6.4.0-91/hadoop-yarn/lib/zookeeper-3.4.6.2.6.4.0-91.jar:/root/Downloads/2.6.4.0-91/hadoop-yarn/lib/commons-beanutils-core-1.8.0.jar:/root/Downloads/2.6.4.0-91/hadoop-yarn/lib/htrace-core-3.1.0-incubating.jar:/root/Downloads/2.6.4.0-91/hadoop-yarn/lib/zookeeper-3.4.6.2.6.4.0-91-tests.jar:/root/Downloads/2.6.4.0-91/hadoop-yarn/lib/apacheds-kerberos-codec-2.0.0-M15.jar:/root/Downloads/2.6.4.0-91/hive/lib/ojdbc6.jar:/root/Downloads/2.6.4.0-91/hive/lib/xz-1.0.jar:/root/Downloads/2.6.4.0-91/hive/lib/jta-1.1.jar:/root/Downloads/2.6.4.0-91/hive/lib/hive-ant.jar:/root/Downloads/2.6.4.0-91/hive/lib/hive-cli.jar:/root/Downloads/2.6.4.0-91/hive/lib/hive-hwi.jar:/root/Downloads/2.6.4.0-91/hive/lib/jpam-1.1.jar:/root/Downloads/2.6.4.0-91/hive/lib/ST4-4.0.4.jar:/root/Downloads/2.6.4.0-91/hive/lib/ant-1.9.1.jar:/root/Downloads/2.6.4.0-91/hive/lib/hive-exec.jar:/root/Downloads/2.6.4.0-91/hive/lib/hive-jdbc.jar:/root/Downloads/2.6.4.0-91/hive/lib/ivy-2.4.0.jar:/root/Downloads/2.6.4.0-91/hive/lib/oro-2.0.8.jar:/root/Downloads/2.6.4.0-91/hive/lib/avro-1.7.5.jar:/root/Downloads/2.6.4.0-91/hive/lib/hive-serde.jar:/root/Downloads/2.6.4.0-91/hive/lib/hive-shims.jar:/root/Downloads/2.6.4.0-91/hive/lib/jline-2.12.jar:/root/Downloads/2.6.4.0-91/hive/lib/mail-1.4.1.jar:/root/Downloads/2.6.4.0-91/hive/lib/regexp-1.3.jar:/root/Downloads/2.6.4.0-91/hive/lib/antlr-2.7.7.jar:/root/Downloads/2.6.4.0-91/hive/lib/hive-common.jar:/root/Downloads/2.6.4.0-91/hive/lib/opencsv-2.3.jar:/root/Downloads/2.6.4.0-91/hive/lib/asm-tree-3.1.jar:/root/Downloads/2.6.4.0-91/hive/lib/guava-14.0.1.jar:/root/Downloads/2.6.4.0-91/hive/lib/hive-beeline.jar:/root/Downloads/2.6.4.0-91/hive/lib/hive-contrib.jar:/root/Downloads/2.6.4.0-91/hive/lib/hive-service.jar:/root/Downloads/2.6.4.0-91/hive/lib/httpcore-4.4.jar:/root/Downloads/2.6.4.0-91/hive/lib/janino-2.7.6.jar:/root/Downloads/2.6.4.0-91/hive/lib/jsr305-3.0.0.jar:/root/Downloads/2.6.4.0-91/hive/lib/log4j-1.2.16.jar:/root/Downloads/2.6.4.0-91/hive/lib/velocity-1.5.jar:/root/Downloads/2.6.4.0-91/hive/lib/jdo-api-3.0.1.jar:/root/Downloads/2.6.4.0-91/hive/lib/json-20090211.jar:/root/Downloads/2.6.4.0-91/hive/lib/paranamer-2.3.jar:/root/Downloads/2.6.4.0-91/hive/lib/HikariCP-2.5.1.jar:/root/Downloads/2.6.4.0-91/hive/lib/activation-1.1.jar:/root/Downloads/2.6.4.0-91/hive/lib/commons-io-2.4.jar:/root/Downloads/2.6.4.0-91/hive/lib/hive-metastore.jar:/root/Downloads/2.6.4.0-91/hive/lib/httpclient-4.4.jar:/root/Downloads/2.6.4.0-91/hive/lib/libfb303-0.9.3.jar:/root/Downloads/2.6.4.0-91/hive/lib/stax-api-1.0.1.jar:/root/Downloads/2.6.4.0-91/hive/lib/asm-commons-3.1.jar:/root/Downloads/2.6.4.0-91/hive/lib/commons-cli-1.2.jar:/root/Downloads/2.6.4.0-91/hive/lib/derby-10.10.2.0.jar:/root/Downloads/2.6.4.0-91/hive/lib/jcommander-1.32.jar:/root/Downloads/2.6.4.0-91/hive/lib/joda-time-2.8.1.jar:/root/Downloads/2.6.4.0-91/hive/lib/libthrift-0.9.3.jar:/root/Downloads/2.6.4.0-91/hive/lib/servlet-api-2.5.jar:/root/Downloads/2.6.4.0-91/hive/lib/super-csv-2.2.0.jar:/root/Downloads/2.6.4.0-91/hive/lib/commons-dbcp-1.4.jar:/root/Downloads/2.6.4.0-91/hive/lib/commons-lang-2.6.jar:/root/Downloads/2.6.4.0-91/hive/lib/commons-math-2.1.jar:/root/Downloads/2.6.4.0-91/hive/lib/commons-vfs2-2.0.jar:/root/Downloads/2.6.4.0-91/hive/lib/antlr-runtime-3.4.jar:/root/Downloads/2.6.4.0-91/hive/lib/commons-codec-1.4.jar:/root/Downloads/2.6.4.0-91/hive/lib/groovy-all-2.4.11.jar:/root/Downloads/2.6.4.0-91/hive/lib/hive-shims-common.jar:/root/Downloads/2.6.4.0-91/hive/lib/maven-scm-api-1.4.jar:/root/Downloads/2.6.4.0-91/hive/lib/metrics-jvm-3.1.0.jar:/root/Downloads/2.6.4.0-91/hive/lib/netty-3.7.0.Final.jar:/root/Downloads/2.6.4.0-91/hive/lib/snappy-java-1.0.5.jar:/root/Downloads/2.6.4.0-91/hive/lib/ant-launcher-1.9.1.jar:/root/Downloads/2.6.4.0-91/hive/lib/commons-pool-1.5.4.jar:/root/Downloads/2.6.4.0-91/hive/lib/hive-hbase-handler.jar:/root/Downloads/2.6.4.0-91/hive/lib/javax.jdo-3.2.0-m3.jar:/root/Downloads/2.6.4.0-91/hive/lib/metrics-core-3.1.0.jar:/root/Downloads/2.6.4.0-91/hive/lib/metrics-json-3.1.0.jar:/root/Downloads/2.6.4.0-91/hive/lib/plexus-utils-1.5.6.jar:/root/Downloads/2.6.4.0-91/hive/lib/protobuf-java-2.5.0.jar:/root/Downloads/2.6.4.0-91/hive/lib/transaction-api-1.1.jar:/root/Downloads/2.6.4.0-91/hive/lib/bonecp-0.8.0.RELEASE.jar:/root/Downloads/2.6.4.0-91/hive/lib/curator-client-2.6.0.jar:/root/Downloads/2.6.4.0-91/hive/lib/hive-shims-scheduler.jar:/root/Downloads/2.6.4.0-91/hive/lib/stringtemplate-3.2.1.jar:/root/Downloads/2.6.4.0-91/hive/lib/commons-logging-1.1.3.jar:/root/Downloads/2.6.4.0-91/hive/lib/curator-recipes-2.6.0.jar:/root/Downloads/2.6.4.0-91/hive/lib/hive-accumulo-handler.jar:/root/Downloads/2.6.4.0-91/hive/lib/commons-compiler-2.7.6.jar:/root/Downloads/2.6.4.0-91/hive/lib/commons-compress-1.4.1.jar:/root/Downloads/2.6.4.0-91/hive/lib/datanucleus-core-4.1.6.jar:/root/Downloads/2.6.4.0-91/hive/lib/curator-framework-2.6.0.jar:/root/Downloads/2.6.4.0-91/hive/lib/datanucleus-rdbms-4.1.7.jar:/root/Downloads/2.6.4.0-91/hive/lib/avatica-1.8.0.2.6.4.0-91.jar:/root/Downloads/2.6.4.0-91/hive/lib/commons-httpclient-3.0.1.jar:/root/Downloads/2.6.4.0-91/hive/lib/commons-collections-3.2.2.jar:/root/Downloads/2.6.4.0-91/hive/lib/datanucleus-api-jdo-4.2.1.jar:/root/Downloads/2.6.4.0-91/hive/lib/jetty-all-7.6.0.v20120127.jar:/root/Downloads/2.6.4.0-91/hive/lib/apache-log4j-extras-1.2.17.jar:/root/Downloads/2.6.4.0-91/hive/lib/eigenbase-properties-1.1.5.jar:/root/Downloads/2.6.4.0-91/hive/lib/zookeeper-3.4.6.2.6.4.0-91.jar:/root/Downloads/2.6.4.0-91/hive/lib/geronimo-jta_1.1_spec-1.1.1.jar:/root/Downloads/2.6.4.0-91/hive/lib/parquet-hadoop-bundle-1.8.1.jar:/root/Downloads/2.6.4.0-91/hive/lib/geronimo-jaspic_1.0_spec-1.0.jar:/root/Downloads/2.6.4.0-91/hive/lib/hive-ant-1.2.1000.2.6.4.0-91.jar:/root/Downloads/2.6.4.0-91/hive/lib/hive-cli-1.2.1000.2.6.4.0-91.jar:/root/Downloads/2.6.4.0-91/hive/lib/hive-hwi-1.2.1000.2.6.4.0-91.jar:/root/Downloads/2.6.4.0-91/hive/lib/htrace-core-3.1.0-incubating.jar:/root/Downloads/2.6.4.0-91/hive/lib/calcite-core-1.2.0.2.6.4.0-91.jar:/root/Downloads/2.6.4.0-91/hive/lib/hive-exec-1.2.1000.2.6.4.0-91.jar:/root/Downloads/2.6.4.0-91/hive/lib/hive-jdbc-1.2.1000.2.6.4.0-91.jar:/root/Downloads/2.6.4.0-91/hive/lib/maven-scm-provider-svnexe-1.4.jar:/root/Downloads/2.6.4.0-91/hive/lib/accumulo-core-1.7.0.2.6.4.0-91.jar:/root/Downloads/2.6.4.0-91/hive/lib/accumulo-fate-1.7.0.2.6.4.0-91.jar:/root/Downloads/2.6.4.0-91/hive/lib/hive-serde-1.2.1000.2.6.4.0-91.jar:/root/Downloads/2.6.4.0-91/hive/lib/hive-shims-1.2.1000.2.6.4.0-91.jar:/root/Downloads/2.6.4.0-91/hive/lib/accumulo-start-1.7.0.2.6.4.0-91.jar:/root/Downloads/2.6.4.0-91/hive/lib/accumulo-trace-1.7.0.2.6.4.0-91.jar:/root/Downloads/2.6.4.0-91/hive/lib/calcite-linq4j-1.2.0.2.6.4.0-91.jar:/root/Downloads/2.6.4.0-91/hive/lib/hive-common-1.2.1000.2.6.4.0-91.jar:/root/Downloads/2.6.4.0-91/hive/lib/avatica-metrics-1.8.0.2.6.4.0-91.jar:/root/Downloads/2.6.4.0-91/hive/lib/hive-beeline-1.2.1000.2.6.4.0-91.jar:/root/Downloads/2.6.4.0-91/hive/lib/hive-contrib-1.2.1000.2.6.4.0-91.jar:/root/Downloads/2.6.4.0-91/hive/lib/hive-service-1.2.1000.2.6.4.0-91.jar:/root/Downloads/2.6.4.0-91/hive/lib/jetty-all-server-7.6.0.v20120127.jar:/root/Downloads/2.6.4.0-91/hive/lib/geronimo-annotation_1.0_spec-1.1.1.jar:/root/Downloads/2.6.4.0-91/hive/lib/hive-metastore-1.2.1000.2.6.4.0-91.jar:/root/Downloads/2.6.4.0-91/hive/lib/maven-scm-provider-svn-commons-1.4.jar:/root/Downloads/2.6.4.0-91/hive/lib/hive-shims-0.23-1.2.1000.2.6.4.0-91.jar:/root/Downloads/2.6.4.0-91/hive/lib/hive-shims-0.20S-1.2.1000.2.6.4.0-91.jar:/root/Downloads/2.6.4.0-91/hive/lib/hive-shims-common-1.2.1000.2.6.4.0-91.jar:/root/Downloads/2.6.4.0-91/hive/lib/hive-hbase-handler-1.2.1000.2.6.4.0-91.jar:/root/Downloads/2.6.4.0-91/hive/lib/hive-shims-scheduler-1.2.1000.2.6.4.0-91.jar:/root/Downloads/2.6.4.0-91/hive/lib/ranger-hive-plugin-shim-0.7.0.2.6.4.0-91.jar:/root/Downloads/2.6.4.0-91/hive/lib/hive-accumulo-handler-1.2.1000.2.6.4.0-91.jar:/root/Downloads/2.6.4.0-91/hive/lib/pentaho-aggdesigner-algorithm-5.1.5-jhyde.jar:/root/Downloads/2.6.4.0-91/hive/lib/ranger-plugin-classloader-0.7.0.2.6.4.0-91.jar:/root/Downloads/2.6.4.0-91/hive/lib/dropwizard-metrics-hadoop-metrics2-reporter-0.1.2.jar:/root/Downloads/2.6.4.0-91/spark2/jars/xz-1.0.jar:/root/Downloads/2.6.4.0-91/spark2/jars/jta-1.1.jar:/root/Downloads/2.6.4.0-91/spark2/jars/jpam-1.1.jar:/root/Downloads/2.6.4.0-91/spark2/jars/ST4-4.0.4.jar:/root/Downloads/2.6.4.0-91/spark2/jars/guice-3.0.jar:/root/Downloads/2.6.4.0-91/spark2/jars/ivy-2.4.0.jar:/root/Downloads/2.6.4.0-91/spark2/jars/lz4-1.3.0.jar:/root/Downloads/2.6.4.0-91/spark2/jars/oro-2.0.8.jar:/root/Downloads/2.6.4.0-91/spark2/jars/avro-1.7.7.jar:/root/Downloads/2.6.4.0-91/spark2/jars/core-1.1.2.jar:/root/Downloads/2.6.4.0-91/spark2/jars/gson-2.2.4.jar:/root/Downloads/2.6.4.0-91/spark2/jars/mail-1.4.7.jar:/root/Downloads/2.6.4.0-91/spark2/jars/mx4j-3.0.2.jar:/root/Downloads/2.6.4.0-91/spark2/jars/okio-1.4.0.jar:/root/Downloads/2.6.4.0-91/spark2/jars/snappy-0.2.jar:/root/Downloads/2.6.4.0-91/spark2/jars/antlr-2.7.7.jar:/root/Downloads/2.6.4.0-91/spark2/jars/jsp-api-2.1.jar:/root/Downloads/2.6.4.0-91/spark2/jars/opencsv-2.3.jar:/root/Downloads/2.6.4.0-91/spark2/jars/py4j-0.10.4.jar:/root/Downloads/2.6.4.0-91/spark2/jars/xmlenc-0.52.jar:/root/Downloads/2.6.4.0-91/spark2/jars/base64-2.3.8.jar:/root/Downloads/2.6.4.0-91/spark2/jars/guava-14.0.1.jar:/root/Downloads/2.6.4.0-91/spark2/jars/janino-3.0.0.jar:/root/Downloads/2.6.4.0-91/spark2/jars/jets3t-0.9.3.jar:/root/Downloads/2.6.4.0-91/spark2/jars/jline-2.12.1.jar:/root/Downloads/2.6.4.0-91/spark2/jars/jsr305-1.3.9.jar:/root/Downloads/2.6.4.0-91/spark2/jars/log4j-1.2.17.jar:/root/Downloads/2.6.4.0-91/spark2/jars/minlog-1.3.0.jar:/root/Downloads/2.6.4.0-91/spark2/jars/okhttp-2.4.0.jar:/root/Downloads/2.6.4.0-91/spark2/jars/stream-2.7.0.jar:/root/Downloads/2.6.4.0-91/spark2/jars/jdo-api-3.0.1.jar:/root/Downloads/2.6.4.0-91/spark2/jars/objenesis-2.1.jar:/root/Downloads/2.6.4.0-91/spark2/jars/paranamer-2.6.jar:/root/Downloads/2.6.4.0-91/spark2/jars/pyrolite-4.13.jar:/root/Downloads/2.6.4.0-91/spark2/jars/scalap-2.11.8.jar:/root/Downloads/2.6.4.0-91/spark2/jars/JavaEWAH-0.3.2.jar:/root/Downloads/2.6.4.0-91/spark2/jars/avro-ipc-1.7.7.jar:/root/Downloads/2.6.4.0-91/spark2/jars/commons-io-2.4.jar:/root/Downloads/2.6.4.0-91/spark2/jars/httpcore-4.4.4.jar:/root/Downloads/2.6.4.0-91/spark2/jars/javax.inject-1.jar:/root/Downloads/2.6.4.0-91/spark2/jars/jaxb-api-2.2.2.jar:/root/Downloads/2.6.4.0-91/spark2/jars/libfb303-0.9.3.jar:/root/Downloads/2.6.4.0-91/spark2/jars/stax-api-1.0-2.jar:/root/Downloads/2.6.4.0-91/spark2/jars/stax-api-1.0.1.jar:/root/Downloads/2.6.4.0-91/spark2/jars/aopalliance-1.0.jar:/root/Downloads/2.6.4.0-91/spark2/jars/commons-cli-1.2.jar:/root/Downloads/2.6.4.0-91/spark2/jars/commons-net-2.2.jar:/root/Downloads/2.6.4.0-91/spark2/jars/derby-10.12.1.1.jar:/root/Downloads/2.6.4.0-91/spark2/jars/joda-time-2.9.3.jar:/root/Downloads/2.6.4.0-91/spark2/jars/jodd-core-3.5.2.jar:/root/Downloads/2.6.4.0-91/spark2/jars/libthrift-0.9.3.jar:/root/Downloads/2.6.4.0-91/spark2/jars/super-csv-2.2.0.jar:/root/Downloads/2.6.4.0-91/spark2/jars/activation-1.1.1.jar:/root/Downloads/2.6.4.0-91/spark2/jars/chill-java-0.8.0.jar:/root/Downloads/2.6.4.0-91/spark2/jars/chill_2.11-0.8.0.jar:/root/Downloads/2.6.4.0-91/spark2/jars/commons-dbcp-1.4.jar:/root/Downloads/2.6.4.0-91/spark2/jars/commons-lang-2.6.jar:/root/Downloads/2.6.4.0-91/spark2/jars/httpclient-4.5.2.jar:/root/Downloads/2.6.4.0-91/spark2/jars/javolution-5.5.1.jar:/root/Downloads/2.6.4.0-91/spark2/jars/jetty-6.1.26.hwx.jar:/root/Downloads/2.6.4.0-91/spark2/jars/json-smart-1.1.1.jar:/root/Downloads/2.6.4.0-91/spark2/jars/slf4j-api-1.7.16.jar:/root/Downloads/2.6.4.0-91/spark2/jars/xercesImpl-2.9.1.jar:/root/Downloads/2.6.4.0-91/spark2/jars/aircompressor-0.8.jar:/root/Downloads/2.6.4.0-91/spark2/jars/antlr-runtime-3.4.jar:/root/Downloads/2.6.4.0-91/spark2/jars/commons-lang3-3.5.jar:/root/Downloads/2.6.4.0-91/spark2/jars/guice-servlet-3.0.jar:/root/Downloads/2.6.4.0-91/spark2/jars/hk2-api-2.4.0-b34.jar:/root/Downloads/2.6.4.0-91/spark2/jars/jackson-xc-1.9.13.jar:/root/Downloads/2.6.4.0-91/spark2/jars/jtransforms-2.4.0.jar:/root/Downloads/2.6.4.0-91/spark2/jars/kryo-shaded-3.0.3.jar:/root/Downloads/2.6.4.0-91/spark2/jars/metrics-jvm-3.1.2.jar:/root/Downloads/2.6.4.0-91/spark2/jars/netty-3.9.9.Final.jar:/root/Downloads/2.6.4.0-91/spark2/jars/pmml-model-1.2.15.jar:/root/Downloads/2.6.4.0-91/spark2/jars/spire_2.11-0.13.0.jar:/root/Downloads/2.6.4.0-91/spark2/jars/api-util-1.0.0-M20.jar:/root/Downloads/2.6.4.0-91/spark2/jars/breeze_2.11-0.13.2.jar:/root/Downloads/2.6.4.0-91/spark2/jars/commons-codec-1.10.jar:/root/Downloads/2.6.4.0-91/spark2/jars/commons-pool-1.5.4.jar:/root/Downloads/2.6.4.0-91/spark2/jars/compress-lzf-1.0.3.jar:/root/Downloads/2.6.4.0-91/spark2/jars/jackson-core-2.6.5.jar:/root/Downloads/2.6.4.0-91/spark2/jars/leveldbjni-all-1.8.jar:/root/Downloads/2.6.4.0-91/spark2/jars/metrics-core-3.1.2.jar:/root/Downloads/2.6.4.0-91/spark2/jars/metrics-json-3.1.2.jar:/root/Downloads/2.6.4.0-91/spark2/jars/pmml-schema-1.2.15.jar:/root/Downloads/2.6.4.0-91/spark2/jars/azure-storage-5.4.0.jar:/root/Downloads/2.6.4.0-91/spark2/jars/bcprov-jdk15on-1.51.jar:/root/Downloads/2.6.4.0-91/spark2/jars/commons-math3-3.4.1.jar:/root/Downloads/2.6.4.0-91/spark2/jars/hk2-utils-2.4.0-b34.jar:/root/Downloads/2.6.4.0-91/spark2/jars/java-xmlbuilder-1.0.jar:/root/Downloads/2.6.4.0-91/spark2/jars/javassist-3.18.1-GA.jar:/root/Downloads/2.6.4.0-91/spark2/jars/jersey-guava-2.22.2.jar:/root/Downloads/2.6.4.0-91/spark2/jars/jul-to-slf4j-1.7.16.jar:/root/Downloads/2.6.4.0-91/spark2/jars/nimbus-jose-jwt-3.9.jar:/root/Downloads/2.6.4.0-91/spark2/jars/protobuf-java-2.5.0.jar:/root/Downloads/2.6.4.0-91/spark2/jars/snappy-java-1.1.2.6.jar:/root/Downloads/2.6.4.0-91/spark2/jars/RoaringBitmap-0.5.11.jar:/root/Downloads/2.6.4.0-91/spark2/jars/antlr4-runtime-4.5.3.jar:/root/Downloads/2.6.4.0-91/spark2/jars/bonecp-0.8.0.RELEASE.jar:/root/Downloads/2.6.4.0-91/spark2/jars/commons-crypto-1.0.0.jar:/root/Downloads/2.6.4.0-91/spark2/jars/commons-digester-1.8.jar:/root/Downloads/2.6.4.0-91/spark2/jars/curator-client-2.6.0.jar:/root/Downloads/2.6.4.0-91/spark2/jars/jackson-jaxrs-1.9.13.jar:/root/Downloads/2.6.4.0-91/spark2/jars/jcip-annotations-1.0.jar:/root/Downloads/2.6.4.0-91/spark2/jars/jersey-client-2.22.2.jar:/root/Downloads/2.6.4.0-91/spark2/jars/jersey-common-2.22.2.jar:/root/Downloads/2.6.4.0-91/spark2/jars/jersey-server-2.22.2.jar:/root/Downloads/2.6.4.0-91/spark2/jars/machinist_2.11-0.6.1.jar:/root/Downloads/2.6.4.0-91/spark2/jars/parquet-column-1.8.2.jar:/root/Downloads/2.6.4.0-91/spark2/jars/parquet-common-1.8.2.jar:/root/Downloads/2.6.4.0-91/spark2/jars/parquet-format-2.3.1.jar:/root/Downloads/2.6.4.0-91/spark2/jars/parquet-hadoop-1.8.2.jar:/root/Downloads/2.6.4.0-91/spark2/jars/scala-library-2.11.8.jar:/root/Downloads/2.6.4.0-91/spark2/jars/scala-reflect-2.11.8.jar:/root/Downloads/2.6.4.0-91/spark2/jars/scala-xml_2.11-1.0.2.jar:/root/Downloads/2.6.4.0-91/spark2/jars/shapeless_2.11-2.3.2.jar:/root/Downloads/2.6.4.0-91/spark2/jars/slf4j-log4j12-1.7.16.jar:/root/Downloads/2.6.4.0-91/spark2/jars/stringtemplate-3.2.1.jar:/root/Downloads/2.6.4.0-91/spark2/jars/commons-logging-1.1.3.jar:/root/Downloads/2.6.4.0-91/spark2/jars/curator-recipes-2.6.0.jar:/root/Downloads/2.6.4.0-91/spark2/jars/hk2-locator-2.4.0-b34.jar:/root/Downloads/2.6.4.0-91/spark2/jars/javax.ws.rs-api-2.0.1.jar:/root/Downloads/2.6.4.0-91/spark2/jars/jcl-over-slf4j-1.7.16.jar:/root/Downloads/2.6.4.0-91/spark2/jars/jetty-util-6.1.26.hwx.jar:/root/Downloads/2.6.4.0-91/spark2/jars/orc-core-1.4.1-nohive.jar:/root/Downloads/2.6.4.0-91/spark2/jars/parquet-jackson-1.8.2.jar:/root/Downloads/2.6.4.0-91/spark2/jars/scala-compiler-2.11.8.jar:/root/Downloads/2.6.4.0-91/spark2/jars/xbean-asm5-shaded-4.4.jar:/root/Downloads/2.6.4.0-91/spark2/jars/api-asn1-api-1.0.0-M20.jar:/root/Downloads/2.6.4.0-91/spark2/jars/aws-java-sdk-s3-1.10.6.jar:/root/Downloads/2.6.4.0-91/spark2/jars/commons-compiler-3.0.0.jar:/root/Downloads/2.6.4.0-91/spark2/jars/commons-compress-1.4.1.jar:/root/Downloads/2.6.4.0-91/spark2/jars/commons-httpclient-3.1.jar:/root/Downloads/2.6.4.0-91/spark2/jars/jackson-databind-2.6.5.jar:/root/Downloads/2.6.4.0-91/spark2/jars/javax.inject-2.4.0-b34.jar:/root/Downloads/2.6.4.0-91/spark2/jars/json4s-ast_2.11-3.2.11.jar:/root/Downloads/2.6.4.0-91/spark2/jars/metrics-graphite-3.1.2.jar:/root/Downloads/2.6.4.0-91/spark2/jars/netty-all-4.0.43.Final.jar:/root/Downloads/2.6.4.0-91/spark2/jars/parquet-encoding-1.8.2.jar:/root/Downloads/2.6.4.0-91/spark2/jars/apacheds-i18n-2.0.0-M15.jar:/root/Downloads/2.6.4.0-91/spark2/jars/arpack_combined_all-0.1.jar:/root/Downloads/2.6.4.0-91/spark2/jars/aws-java-sdk-kms-1.10.6.jar:/root/Downloads/2.6.4.0-91/spark2/jars/commons-beanutils-1.7.0.jar:/root/Downloads/2.6.4.0-91/spark2/jars/curator-framework-2.6.0.jar:/root/Downloads/2.6.4.0-91/spark2/jars/datanucleus-core-3.2.10.jar:/root/Downloads/2.6.4.0-91/spark2/jars/datanucleus-rdbms-3.2.9.jar:/root/Downloads/2.6.4.0-91/spark2/jars/jackson-core-asl-1.9.13.jar:/root/Downloads/2.6.4.0-91/spark2/jars/javax.servlet-api-3.1.0.jar:/root/Downloads/2.6.4.0-91/spark2/jars/json4s-core_2.11-3.2.11.jar:/root/Downloads/2.6.4.0-91/spark2/jars/macro-compat_2.11-1.1.1.jar:/root/Downloads/2.6.4.0-91/spark2/jars/univocity-parsers-2.2.1.jar:/root/Downloads/2.6.4.0-91/spark2/jars/aws-java-sdk-core-1.10.6.jar:/root/Downloads/2.6.4.0-91/spark2/jars/javax.annotation-api-1.2.jar:/root/Downloads/2.6.4.0-91/spark2/jars/jersey-media-jaxb-2.22.2.jar:/root/Downloads/2.6.4.0-91/spark2/jars/spire-macros_2.11-0.13.0.jar:/root/Downloads/2.6.4.0-91/spark2/jars/avro-mapred-1.7.7-hadoop2.jar:/root/Downloads/2.6.4.0-91/spark2/jars/azure-keyvault-core-0.8.0.jar:/root/Downloads/2.6.4.0-91/spark2/jars/breeze-macros_2.11-0.13.2.jar:/root/Downloads/2.6.4.0-91/spark2/jars/commons-collections-3.2.2.jar:/root/Downloads/2.6.4.0-91/spark2/jars/commons-configuration-1.6.jar:/root/Downloads/2.6.4.0-91/spark2/jars/datanucleus-api-jdo-3.2.6.jar:/root/Downloads/2.6.4.0-91/spark2/jars/jackson-annotations-2.6.5.jar:/root/Downloads/2.6.4.0-91/spark2/jars/jackson-mapper-asl-1.9.13.jar:/root/Downloads/2.6.4.0-91/spark2/jars/apache-log4j-extras-1.2.17.jar:/root/Downloads/2.6.4.0-91/spark2/jars/eigenbase-properties-1.1.5.jar:/root/Downloads/2.6.4.0-91/spark2/jars/hive-cli-1.21.2.2.6.4.0-91.jar:/root/Downloads/2.6.4.0-91/spark2/jars/jetty-sslengine-6.1.26.hwx.jar:/root/Downloads/2.6.4.0-91/spark2/jars/json4s-jackson_2.11-3.2.11.jar:/root/Downloads/2.6.4.0-91/spark2/jars/orc-mapreduce-1.4.1-nohive.jar:/root/Downloads/2.6.4.0-91/spark2/jars/validation-api-1.1.0.Final.jar:/root/Downloads/2.6.4.0-91/spark2/jars/zookeeper-3.4.6.2.6.4.0-91.jar:/root/Downloads/2.6.4.0-91/spark2/jars/hadoop-aws-2.7.3.2.6.4.0-91.jar:/root/Downloads/2.6.4.0-91/spark2/jars/hive-exec-1.21.2.2.6.4.0-91.jar:/root/Downloads/2.6.4.0-91/spark2/jars/hive-jdbc-1.21.2.2.6.4.0-91.jar:/root/Downloads/2.6.4.0-91/spark2/jars/osgi-resource-locator-1.0.1.jar:/root/Downloads/2.6.4.0-91/spark2/jars/parquet-hadoop-bundle-1.6.0.jar:/root/Downloads/2.6.4.0-91/spark2/jars/commons-beanutils-core-1.8.0.jar:/root/Downloads/2.6.4.0-91/spark2/jars/hadoop-auth-2.7.3.2.6.4.0-91.jar:/root/Downloads/2.6.4.0-91/spark2/jars/hadoop-hdfs-2.7.3.2.6.4.0-91.jar:/root/Downloads/2.6.4.0-91/spark2/jars/htrace-core-3.1.0-incubating.jar:/root/Downloads/2.6.4.0-91/spark2/jars/calcite-core-1.2.0-incubating.jar:/root/Downloads/2.6.4.0-91/spark2/jars/hadoop-azure-2.7.3.2.6.4.0-91.jar:/root/Downloads/2.6.4.0-91/spark2/jars/jackson-dataformat-cbor-2.6.5.jar:/root/Downloads/2.6.4.0-91/spark2/jars/hadoop-client-2.7.3.2.6.4.0-91.jar:/root/Downloads/2.6.4.0-91/spark2/jars/hadoop-common-2.7.3.2.6.4.0-91.jar:/root/Downloads/2.6.4.0-91/spark2/jars/hive-beeline-1.21.2.2.6.4.0-91.jar:/root/Downloads/2.6.4.0-91/spark2/jars/jackson-module-paranamer-2.6.5.jar:/root/Downloads/2.6.4.0-91/spark2/jars/azure-data-lake-store-sdk-2.1.4.jar:/root/Downloads/2.6.4.0-91/spark2/jars/calcite-linq4j-1.2.0-incubating.jar:/root/Downloads/2.6.4.0-91/spark2/jars/jackson-module-scala_2.11-2.6.5.jar:/root/Downloads/2.6.4.0-91/spark2/jars/jersey-container-servlet-2.22.2.jar:/root/Downloads/2.6.4.0-91/spark2/jars/spark-sql_2.11-2.2.0.2.6.4.0-91.jar:/root/Downloads/2.6.4.0-91/spark2/jars/aopalliance-repackaged-2.4.0-b34.jar:/root/Downloads/2.6.4.0-91/spark2/jars/calcite-avatica-1.2.0-incubating.jar:/root/Downloads/2.6.4.0-91/spark2/jars/hadoop-yarn-api-2.7.3.2.6.4.0-91.jar:/root/Downloads/2.6.4.0-91/spark2/jars/hive-metastore-1.21.2.2.6.4.0-91.jar:/root/Downloads/2.6.4.0-91/spark2/jars/spark-core_2.11-2.2.0.2.6.4.0-91.jar:/root/Downloads/2.6.4.0-91/spark2/jars/spark-hive_2.11-2.2.0.2.6.4.0-91.jar:/root/Downloads/2.6.4.0-91/spark2/jars/spark-repl_2.11-2.2.0.2.6.4.0-91.jar:/root/Downloads/2.6.4.0-91/spark2/jars/spark-tags_2.11-2.2.0.2.6.4.0-91.jar:/root/Downloads/2.6.4.0-91/spark2/jars/spark-yarn_2.11-2.2.0.2.6.4.0-91.jar:/root/Downloads/2.6.4.0-91/spark2/jars/apacheds-kerberos-codec-2.0.0-M15.jar:/root/Downloads/2.6.4.0-91/spark2/jars/hadoop-openstack-2.7.3.2.6.4.0-91.jar:/root/Downloads/2.6.4.0-91/spark2/jars/spark-cloud_2.11-2.2.0.2.6.4.0-91.jar:/root/Downloads/2.6.4.0-91/spark2/jars/spark-mllib_2.11-2.2.0.2.6.4.0-91.jar:/root/Downloads/2.6.4.0-91/spark2/jars/spark-graphx_2.11-2.2.0.2.6.4.0-91.jar:/root/Downloads/2.6.4.0-91/spark2/jars/spark-sketch_2.11-2.2.0.2.6.4.0-91.jar:/root/Downloads/2.6.4.0-91/spark2/jars/spark-unsafe_2.11-2.2.0.2.6.4.0-91.jar:/root/Downloads/2.6.4.0-91/spark2/jars/hadoop-annotations-2.7.3.2.6.4.0-91.jar:/root/Downloads/2.6.4.0-91/spark2/jars/hadoop-yarn-client-2.7.3.2.6.4.0-91.jar:/root/Downloads/2.6.4.0-91/spark2/jars/hadoop-yarn-common-2.7.3.2.6.4.0-91.jar:/root/Downloads/2.6.4.0-91/spark2/jars/scala-parser-combinators_2.11-1.0.4.jar:/root/Downloads/2.6.4.0-91/spark2/jars/jersey-container-servlet-core-2.22.2.jar:/root/Downloads/2.6.4.0-91/spark2/jars/spark-catalyst_2.11-2.2.0.2.6.4.0-91.jar:/root/Downloads/2.6.4.0-91/spark2/jars/spark-launcher_2.11-2.2.0.2.6.4.0-91.jar:/root/Downloads/2.6.4.0-91/spark2/jars/hadoop-yarn-registry-2.7.3.2.6.4.0-91.jar:/root/Downloads/2.6.4.0-91/spark2/jars/spark-streaming_2.11-2.2.0.2.6.4.0-91.jar:/root/Downloads/2.6.4.0-91/spark2/jars/hadoop-azure-datalake-2.7.3.2.6.4.0-91.jar:/root/Downloads/2.6.4.0-91/spark2/jars/spark-mllib-local_2.11-2.2.0.2.6.4.0-91.jar:/root/Downloads/2.6.4.0-91/spark2/jars/hadoop-yarn-server-common-2.7.3.2.6.4.0-91.jar:/root/Downloads/2.6.4.0-91/spark2/jars/spark-network-common_2.11-2.2.0.2.6.4.0-91.jar:/root/Downloads/2.6.4.0-91/spark2/jars/spark-network-shuffle_2.11-2.2.0.2.6.4.0-91.jar:/root/Downloads/2.6.4.0-91/spark2/jars/hadoop-mapreduce-client-app-2.7.3.2.6.4.0-91.jar:/root/Downloads/2.6.4.0-91/spark2/jars/hadoop-mapreduce-client-core-2.7.3.2.6.4.0-91.jar:/root/Downloads/2.6.4.0-91/spark2/jars/hadoop-yarn-server-web-proxy-2.7.3.2.6.4.0-91.jar:/root/Downloads/2.6.4.0-91/spark2/jars/spark-hive-thriftserver_2.11-2.2.0.2.6.4.0-91.jar:/root/Downloads/2.6.4.0-91/spark2/jars/hadoop-mapreduce-client-common-2.7.3.2.6.4.0-91.jar:/root/Downloads/2.6.4.0-91/spark2/jars/hadoop-mapreduce-client-shuffle-2.7.3.2.6.4.0-91.jar:/root/Downloads/2.6.4.0-91/spark2/jars/hadoop-mapreduce-client-jobclient-2.7.3.2.6.4.0-91.jar com.tupperware.bigdata.service.RunRDF
properties spark-conf.properties loaded 
the value of spark.jars is hdfs://hdp01.bigdata:8020/apps/spark/bigdata-1.0-SNAPSHOT.jar,hdfs://hdp01.bigdata:8020/apps/scala/scala-library-2.11.8.jar,hdfs://hdp01.bigdata:8020/apps/scala/scala-reflect-2.11.8.jar,hdfs://hdp01.bigdata:8020/apps/scala/scala-compiler-2.11.8.jar
the value of spark.sql.warehouse.dir is hdfs://hdp01.bigdata:8020/apps/hive/warehouse
19/04/25 10:37:58 WARN NativeCodeLoader: Unable to load native-hadoop library for your platform... using builtin-java classes where applicable
19/04/25 10:38:06 WARN DomainSocketFactory: The short-circuit local reads feature cannot be used because libhadoop cannot be loaded.
19/04/25 10:38:23 WARN Utils: Truncated the string representation of a plan since it was too large. This behavior can be adjusted by setting 'spark.debug.maxToStringFields' in SparkEnv.conf.
+---------+------+-----+--------------------------------+------------------------------+-------------------------------+-------------+--------------+-------------+----------------------------------+-----------------+-----------------+-----------------+-----------------+-----------+-----------+-----------+-----------+-----------+-----------+-----------+-----------+-----------+-----------+------------+------------+------------+------------+------------+------------+------------+------------+------------+------------+------------+------------+------------+------------+------------+------------+------------+------------+------------+------------+------------+------------+------------+------------+------------+------------+------------+------------+------------+------------+----------+
|Elevation|Aspect|Slope|Horizontal_Distance_To_Hydrology|Vertical_Distance_To_Hydrology|Horizontal_Distance_To_Roadways|Hillshade_9am|Hillshade_Noon|Hillshade_3pm|Horizontal_Distance_To_Fire_Points|Wilderness_Area_0|Wilderness_Area_1|Wilderness_Area_2|Wilderness_Area_3|Soil_Type_0|Soil_Type_1|Soil_Type_2|Soil_Type_3|Soil_Type_4|Soil_Type_5|Soil_Type_6|Soil_Type_7|Soil_Type_8|Soil_Type_9|Soil_Type_10|Soil_Type_11|Soil_Type_12|Soil_Type_13|Soil_Type_14|Soil_Type_15|Soil_Type_16|Soil_Type_17|Soil_Type_18|Soil_Type_19|Soil_Type_20|Soil_Type_21|Soil_Type_22|Soil_Type_23|Soil_Type_24|Soil_Type_25|Soil_Type_26|Soil_Type_27|Soil_Type_28|Soil_Type_29|Soil_Type_30|Soil_Type_31|Soil_Type_32|Soil_Type_33|Soil_Type_34|Soil_Type_35|Soil_Type_36|Soil_Type_37|Soil_Type_38|Soil_Type_39|Cover_Type|
+---------+------+-----+--------------------------------+------------------------------+-------------------------------+-------------+--------------+-------------+----------------------------------+-----------------+-----------------+-----------------+-----------------+-----------+-----------+-----------+-----------+-----------+-----------+-----------+-----------+-----------+-----------+------------+------------+------------+------------+------------+------------+------------+------------+------------+------------+------------+------------+------------+------------+------------+------------+------------+------------+------------+------------+------------+------------+------------+------------+------------+------------+------------+------------+------------+------------+----------+
|     2596|    51|    3|                             258|                             0|                            510|          221|           232|          148|                              6279|                1|                0|                0|                0|          0|          0|          0|          0|          0|          0|          0|          0|          0|          0|           0|           0|           0|           0|           0|           0|           0|           0|           0|           0|           0|           0|           0|           0|           0|           0|           0|           0|           1|           0|           0|           0|           0|           0|           0|           0|           0|           0|           0|           0|       5.0|
|     2590|    56|    2|                             212|                            -6|                            390|          220|           235|          151|                              6225|                1|                0|                0|                0|          0|          0|          0|          0|          0|          0|          0|          0|          0|          0|           0|           0|           0|           0|           0|           0|           0|           0|           0|           0|           0|           0|           0|           0|           0|           0|           0|           0|           1|           0|           0|           0|           0|           0|           0|           0|           0|           0|           0|           0|       5.0|
|     2804|   139|    9|                             268|                            65|                           3180|          234|           238|          135|                              6121|                1|                0|                0|                0|          0|          0|          0|          0|          0|          0|          0|          0|          0|          0|           0|           1|           0|           0|           0|           0|           0|           0|           0|           0|           0|           0|           0|           0|           0|           0|           0|           0|           0|           0|           0|           0|           0|           0|           0|           0|           0|           0|           0|           0|       2.0|
|     2785|   155|   18|                             242|                           118|                           3090|          238|           238|          122|                              6211|                1|                0|                0|                0|          0|          0|          0|          0|          0|          0|          0|          0|          0|          0|           0|           0|           0|           0|           0|           0|           0|           0|           0|           0|           0|           0|           0|           0|           0|           0|           0|           0|           0|           1|           0|           0|           0|           0|           0|           0|           0|           0|           0|           0|       2.0|
|     2595|    45|    2|                             153|                            -1|                            391|          220|           234|          150|                              6172|                1|                0|                0|                0|          0|          0|          0|          0|          0|          0|          0|          0|          0|          0|           0|           0|           0|           0|           0|           0|           0|           0|           0|           0|           0|           0|           0|           0|           0|           0|           0|           0|           1|           0|           0|           0|           0|           0|           0|           0|           0|           0|           0|           0|       5.0|
|     2579|   132|    6|                             300|                           -15|                             67|          230|           237|          140|                              6031|                1|                0|                0|                0|          0|          0|          0|          0|          0|          0|          0|          0|          0|          0|           0|           0|           0|           0|           0|           0|           0|           0|           0|           0|           0|           0|           0|           0|           0|           0|           0|           0|           1|           0|           0|           0|           0|           0|           0|           0|           0|           0|           0|           0|       2.0|
|     2606|    45|    7|                             270|                             5|                            633|          222|           225|          138|                              6256|                1|                0|                0|                0|          0|          0|          0|          0|          0|          0|          0|          0|          0|          0|           0|           0|           0|           0|           0|           0|           0|           0|           0|           0|           0|           0|           0|           0|           0|           0|           0|           0|           1|           0|           0|           0|           0|           0|           0|           0|           0|           0|           0|           0|       5.0|
|     2605|    49|    4|                             234|                             7|                            573|          222|           230|          144|                              6228|                1|                0|                0|                0|          0|          0|          0|          0|          0|          0|          0|          0|          0|          0|           0|           0|           0|           0|           0|           0|           0|           0|           0|           0|           0|           0|           0|           0|           0|           0|           0|           0|           1|           0|           0|           0|           0|           0|           0|           0|           0|           0|           0|           0|       5.0|
|     2617|    45|    9|                             240|                            56|                            666|          223|           221|          133|                              6244|                1|                0|                0|                0|          0|          0|          0|          0|          0|          0|          0|          0|          0|          0|           0|           0|           0|           0|           0|           0|           0|           0|           0|           0|           0|           0|           0|           0|           0|           0|           0|           0|           1|           0|           0|           0|           0|           0|           0|           0|           0|           0|           0|           0|       5.0|
|     2612|    59|   10|                             247|                            11|                            636|          228|           219|          124|                              6230|                1|                0|                0|                0|          0|          0|          0|          0|          0|          0|          0|          0|          0|          0|           0|           0|           0|           0|           0|           0|           0|           0|           0|           0|           0|           0|           0|           0|           0|           0|           0|           0|           1|           0|           0|           0|           0|           0|           0|           0|           0|           0|           0|           0|       5.0|
|     2612|   201|    4|                             180|                            51|                            735|          218|           243|          161|                              6222|                1|                0|                0|                0|          0|          0|          0|          0|          0|          0|          0|          0|          0|          0|           0|           0|           0|           0|           0|           0|           0|           1|           0|           0|           0|           0|           0|           0|           0|           0|           0|           0|           0|           0|           0|           0|           0|           0|           0|           0|           0|           0|           0|           0|       5.0|
|     2886|   151|   11|                             371|                            26|                           5253|          234|           240|          136|                              4051|                1|                0|                0|                0|          0|          0|          0|          0|          0|          0|          0|          0|          0|          0|           0|           0|           0|           0|           0|           0|           0|           0|           0|           0|           0|           0|           0|           0|           0|           0|           0|           0|           0|           1|           0|           0|           0|           0|           0|           0|           0|           0|           0|           0|       2.0|
|     2742|   134|   22|                             150|                            69|                           3215|          248|           224|           92|                              6091|                1|                0|                0|                0|          0|          0|          0|          0|          0|          0|          0|          0|          0|          0|           0|           0|           0|           0|           0|           0|           0|           0|           0|           0|           0|           0|           0|           0|           0|           0|           0|           0|           0|           1|           0|           0|           0|           0|           0|           0|           0|           0|           0|           0|       2.0|
|     2609|   214|    7|                             150|                            46|                            771|          213|           247|          170|                              6211|                1|                0|                0|                0|          0|          0|          0|          0|          0|          0|          0|          0|          0|          0|           0|           0|           0|           0|           0|           0|           0|           1|           0|           0|           0|           0|           0|           0|           0|           0|           0|           0|           0|           0|           0|           0|           0|           0|           0|           0|           0|           0|           0|           0|       5.0|
|     2503|   157|    4|                              67|                             4|                            674|          224|           240|          151|                              5600|                1|                0|                0|                0|          0|          0|          0|          0|          0|          0|          0|          0|          0|          0|           0|           0|           0|           0|           0|           0|           0|           1|           0|           0|           0|           0|           0|           0|           0|           0|           0|           0|           0|           0|           0|           0|           0|           0|           0|           0|           0|           0|           0|           0|       5.0|
|     2495|    51|    7|                              42|                             2|                            752|          224|           225|          137|                              5576|                1|                0|                0|                0|          0|          0|          0|          0|          0|          0|          0|          0|          0|          0|           0|           0|           0|           0|           0|           1|           0|           0|           0|           0|           0|           0|           0|           0|           0|           0|           0|           0|           0|           0|           0|           0|           0|           0|           0|           0|           0|           0|           0|           0|       5.0|
|     2610|   259|    1|                             120|                            -1|                            607|          216|           239|          161|                              6096|                1|                0|                0|                0|          0|          0|          0|          0|          0|          0|          0|          0|          0|          0|           0|           0|           0|           0|           0|           0|           0|           0|           0|           0|           0|           0|           0|           0|           0|           0|           0|           0|           1|           0|           0|           0|           0|           0|           0|           0|           0|           0|           0|           0|       5.0|
|     2517|    72|    7|                              85|                             6|                            595|          228|           227|          133|                              5607|                1|                0|                0|                0|          0|          0|          0|          0|          0|          0|          0|          0|          0|          0|           0|           0|           0|           0|           0|           0|           0|           1|           0|           0|           0|           0|           0|           0|           0|           0|           0|           0|           0|           0|           0|           0|           0|           0|           0|           0|           0|           0|           0|           0|       5.0|
|     2504|     0|    4|                              95|                             5|                            691|          214|           232|          156|                              5572|                1|                0|                0|                0|          0|          0|          0|          0|          0|          0|          0|          0|          0|          0|           0|           0|           0|           0|           0|           0|           0|           1|           0|           0|           0|           0|           0|           0|           0|           0|           0|           0|           0|           0|           0|           0|           0|           0|           0|           0|           0|           0|           0|           0|       5.0|
|     2503|    38|    5|                              85|                            10|                            741|          220|           228|          144|                              5555|                1|                0|                0|                0|          0|          0|          0|          0|          0|          0|          0|          0|          0|          0|           0|           0|           0|           0|           0|           0|           0|           1|           0|           0|           0|           0|           0|           0|           0|           0|           0|           0|           0|           0|           0|           0|           0|           0|           0|           0|           0|           0|           0|           0|       5.0|
+---------+------+-----+--------------------------------+------------------------------+-------------------------------+-------------+--------------+-------------+----------------------------------+-----------------+-----------------+-----------------+-----------------+-----------+-----------+-----------+-----------+-----------+-----------+-----------+-----------+-----------+-----------+------------+------------+------------+------------+------------+------------+------------+------------+------------+------------+------------+------------+------------+------------+------------+------------+------------+------------+------------+------------+------------+------------+------------+------------+------------+------------+------------+------------+------------+------------+----------+
only showing top 20 rows

                                                                                +-----------------------------------------------------------------------------------------------------+
|featureVector                                                                                        |
+-----------------------------------------------------------------------------------------------------+
|(54,[0,1,2,3,4,5,6,7,8,9,13,15],[1863.0,37.0,17.0,120.0,18.0,90.0,217.0,202.0,115.0,769.0,1.0,1.0])  |
|(54,[0,1,2,5,6,7,8,9,13,18],[1874.0,18.0,14.0,90.0,208.0,209.0,135.0,793.0,1.0,1.0])                 |
|(54,[0,1,2,3,4,5,6,7,8,9,13,18],[1879.0,28.0,19.0,30.0,12.0,95.0,209.0,196.0,117.0,778.0,1.0,1.0])   |
|(54,[0,1,2,3,4,5,6,7,8,9,13,15],[1888.0,33.0,22.0,150.0,46.0,108.0,209.0,185.0,103.0,735.0,1.0,1.0]) |
|(54,[0,1,2,3,4,5,6,7,8,9,13,18],[1889.0,353.0,30.0,95.0,39.0,67.0,153.0,172.0,146.0,600.0,1.0,1.0])  |
|(54,[0,1,2,3,4,5,6,7,8,9,13,18],[1896.0,337.0,12.0,30.0,6.0,175.0,195.0,224.0,168.0,732.0,1.0,1.0])  |
|(54,[0,1,2,3,4,5,6,7,8,9,13,15],[1898.0,34.0,23.0,175.0,56.0,134.0,210.0,184.0,99.0,765.0,1.0,1.0])  |
|(54,[0,1,2,3,4,5,6,7,8,9,13,14],[1901.0,311.0,9.0,30.0,2.0,190.0,195.0,234.0,179.0,726.0,1.0,1.0])   |
|(54,[0,1,2,3,4,5,6,7,8,9,13,14],[1903.0,5.0,13.0,42.0,4.0,201.0,203.0,214.0,148.0,708.0,1.0,1.0])    |
|(54,[0,1,2,3,4,5,6,7,8,9,13,16],[1903.0,67.0,16.0,108.0,36.0,120.0,234.0,207.0,100.0,969.0,1.0,1.0]) |
|(54,[0,1,2,3,4,5,6,7,8,9,13,14],[1904.0,51.0,26.0,67.0,30.0,162.0,222.0,175.0,72.0,711.0,1.0,1.0])   |
|(54,[0,1,2,3,4,5,6,7,8,9,13,18],[1905.0,19.0,27.0,134.0,58.0,120.0,188.0,171.0,108.0,636.0,1.0,1.0]) |
|(54,[0,1,2,3,4,5,6,7,8,9,13,14],[1905.0,33.0,27.0,90.0,46.0,150.0,204.0,171.0,89.0,725.0,1.0,1.0])   |
|(54,[0,1,2,3,4,5,6,7,8,9,13,15],[1906.0,356.0,20.0,150.0,55.0,120.0,184.0,201.0,151.0,726.0,1.0,1.0])|
|(54,[0,1,2,3,4,5,6,7,8,9,13,18],[1908.0,323.0,32.0,150.0,52.0,120.0,125.0,190.0,196.0,765.0,1.0,1.0])|
|(54,[0,1,2,3,4,5,6,7,8,9,13,15],[1916.0,24.0,25.0,212.0,74.0,175.0,197.0,177.0,105.0,789.0,1.0,1.0]) |
|(54,[0,1,2,3,4,5,6,7,8,9,13,23],[1918.0,321.0,28.0,42.0,17.0,85.0,139.0,201.0,196.0,402.0,1.0,1.0])  |
|(54,[0,1,2,3,4,5,6,7,8,9,13,14],[1927.0,54.0,25.0,190.0,76.0,175.0,225.0,177.0,71.0,735.0,1.0,1.0])  |
|(54,[0,1,2,3,4,5,6,7,8,9,13,18],[1927.0,333.0,27.0,218.0,72.0,190.0,149.0,195.0,180.0,859.0,1.0,1.0])|
|(54,[0,1,2,3,4,5,6,7,8,9,13,14],[1928.0,252.0,31.0,30.0,14.0,180.0,138.0,243.0,233.0,765.0,1.0,1.0]) |
+-----------------------------------------------------------------------------------------------------+
only showing top 20 rows

DecisionTreeClassificationModel (uid=dtc_38452f0ea833) of depth 5 with 63 nodes
  If (feature 0 <= 2629.0)
   If (feature 3 <= 30.0)
    If (feature 13 <= 0.0)
     If (feature 10 <= 0.0)
      If (feature 5 <= 953.0)
       Predict: 6.0
      Else (feature 5 > 953.0)
       Predict: 6.0
     Else (feature 10 > 0.0)
      If (feature 8 <= 106.0)
       Predict: 5.0
      Else (feature 8 > 106.0)
       Predict: 2.0
    Else (feature 13 > 0.0)
     If (feature 3 <= 0.0)
      If (feature 0 <= 2375.0)
       Predict: 4.0
      Else (feature 0 > 2375.0)
       Predict: 4.0
     Else (feature 3 > 0.0)
      If (feature 23 <= 0.0)
       Predict: 4.0
      Else (feature 23 > 0.0)
       Predict: 6.0
   Else (feature 3 > 30.0)
    If (feature 16 <= 0.0)
     If (feature 10 <= 0.0)
      If (feature 6 <= 223.0)
       Predict: 6.0
      Else (feature 6 > 223.0)
       Predict: 3.0
     Else (feature 10 > 0.0)
      If (feature 9 <= 4269.0)
       Predict: 2.0
      Else (feature 9 > 4269.0)
       Predict: 5.0
    Else (feature 16 > 0.0)
     If (feature 0 <= 2340.0)
      If (feature 0 <= 2068.0)
       Predict: 3.0
      Else (feature 0 > 2068.0)
       Predict: 4.0
     Else (feature 0 > 2340.0)
      If (feature 9 <= 1208.0)
       Predict: 3.0
      Else (feature 9 > 1208.0)
       Predict: 4.0
  Else (feature 0 > 2629.0)
   If (feature 0 <= 3190.0)
    If (feature 0 <= 2925.0)
     If (feature 9 <= 2696.0)
      If (feature 5 <= 437.0)
       Predict: 5.0
      Else (feature 5 > 437.0)
       Predict: 5.0
     Else (feature 9 > 2696.0)
      If (feature 17 <= 0.0)
       Predict: 2.0
      Else (feature 17 > 0.0)
       Predict: 5.0
    Else (feature 0 > 2925.0)
     If (feature 0 <= 3018.0)
      If (feature 3 <= 67.0)
       Predict: 1.0
      Else (feature 3 > 67.0)
       Predict: 2.0
     Else (feature 0 > 3018.0)
      If (feature 3 <= 417.0)
       Predict: 1.0
      Else (feature 3 > 417.0)
       Predict: 2.0
   Else (feature 0 > 3190.0)
    If (feature 0 <= 3276.0)
     If (feature 3 <= 95.0)
      If (feature 5 <= 4500.0)
       Predict: 7.0
      Else (feature 5 > 4500.0)
       Predict: 1.0
     Else (feature 3 > 95.0)
      If (feature 52 <= 0.0)
       Predict: 1.0
      Else (feature 52 > 0.0)
       Predict: 7.0
    Else (feature 0 > 3276.0)
     If (feature 45 <= 0.0)
      If (feature 12 <= 0.0)
       Predict: 7.0
      Else (feature 12 > 0.0)
       Predict: 7.0
     Else (feature 45 > 0.0)
      If (feature 2 <= 7.0)
       Predict: 7.0
      Else (feature 2 > 7.0)
       Predict: 1.0

(0.6616075034983581,Elevation)
(0.10067722714727352,Horizontal_Distance_To_Hydrology)
(0.09207415456833401,Soil_Type_2)
(0.03679849941633023,Horizontal_Distance_To_Fire_Points)
(0.02411555099224168,Wilderness_Area_3)
(0.021490469096677185,Horizontal_Distance_To_Roadways)
(0.021031782689513504,Wilderness_Area_0)
(0.008992480054801275,Hillshade_9am)
(0.006576172300083529,Soil_Type_31)
(0.006523400348877611,Soil_Type_9)
(0.006167062001769794,Soil_Type_38)
(0.005384581953153685,Wilderness_Area_2)
(0.004536765212812873,Slope)
(0.003294154219790385,Soil_Type_3)
(7.301964999825077E-4,Hillshade_3pm)
(0.0,Wilderness_Area_1)
(0.0,Vertical_Distance_To_Hydrology)
(0.0,Soil_Type_8)
(0.0,Soil_Type_7)
(0.0,Soil_Type_6)
(0.0,Soil_Type_5)
(0.0,Soil_Type_4)
(0.0,Soil_Type_39)
(0.0,Soil_Type_37)
(0.0,Soil_Type_36)
(0.0,Soil_Type_35)
(0.0,Soil_Type_34)
(0.0,Soil_Type_33)
(0.0,Soil_Type_32)
(0.0,Soil_Type_30)
(0.0,Soil_Type_29)
(0.0,Soil_Type_28)
(0.0,Soil_Type_27)
(0.0,Soil_Type_26)
(0.0,Soil_Type_25)
(0.0,Soil_Type_24)
(0.0,Soil_Type_23)
(0.0,Soil_Type_22)
(0.0,Soil_Type_21)
(0.0,Soil_Type_20)
(0.0,Soil_Type_19)
(0.0,Soil_Type_18)
(0.0,Soil_Type_17)
(0.0,Soil_Type_16)
(0.0,Soil_Type_15)
(0.0,Soil_Type_14)
(0.0,Soil_Type_13)
(0.0,Soil_Type_12)
(0.0,Soil_Type_11)
(0.0,Soil_Type_10)
(0.0,Soil_Type_1)
(0.0,Soil_Type_0)
(0.0,Hillshade_Noon)
(0.0,Aspect)
+----------+----------+-----------------------------------------------------------------------------------------------------------------+
|Cover_Type|prediction|probability                                                                                                      |
+----------+----------+-----------------------------------------------------------------------------------------------------------------+
|6.0       |6.0       |[0.0,0.0,0.006882312456985547,0.4301445285615967,0.06331727460426703,0.017894012388162423,0.4817618719889883,0.0]|
|6.0       |4.0       |[0.0,0.0,0.0,0.0297029702970297,0.9455445544554455,0.0,0.024752475247524754,0.0]                                 |
|6.0       |4.0       |[0.0,0.0,0.0,0.11026615969581749,0.7262357414448669,0.0,0.1634980988593156,0.0]                                  |
|6.0       |6.0       |[0.0,0.0,0.006882312456985547,0.4301445285615967,0.06331727460426703,0.017894012388162423,0.4817618719889883,0.0]|
|6.0       |6.0       |[0.0,0.0,0.006882312456985547,0.4301445285615967,0.06331727460426703,0.017894012388162423,0.4817618719889883,0.0]|
|6.0       |4.0       |[0.0,0.0,0.0,0.11026615969581749,0.7262357414448669,0.0,0.1634980988593156,0.0]                                  |
|6.0       |6.0       |[0.0,0.0,0.006882312456985547,0.4301445285615967,0.06331727460426703,0.017894012388162423,0.4817618719889883,0.0]|
|6.0       |4.0       |[0.0,0.0,0.0,0.11026615969581749,0.7262357414448669,0.0,0.1634980988593156,0.0]                                  |
|6.0       |6.0       |[0.0,0.0,0.006882312456985547,0.4301445285615967,0.06331727460426703,0.017894012388162423,0.4817618719889883,0.0]|
|3.0       |3.0       |[0.0,0.0,0.0,0.8181818181818182,0.18181818181818182,0.0,0.0,0.0]                                                 |
|6.0       |6.0       |[0.0,0.0,0.006882312456985547,0.4301445285615967,0.06331727460426703,0.017894012388162423,0.4817618719889883,0.0]|
|6.0       |6.0       |[0.0,0.0,0.006882312456985547,0.4301445285615967,0.06331727460426703,0.017894012388162423,0.4817618719889883,0.0]|
|6.0       |6.0       |[0.0,0.0,0.006882312456985547,0.4301445285615967,0.06331727460426703,0.017894012388162423,0.4817618719889883,0.0]|
|6.0       |6.0       |[0.0,0.0,0.006882312456985547,0.4301445285615967,0.06331727460426703,0.017894012388162423,0.4817618719889883,0.0]|
|6.0       |6.0       |[0.0,0.0,0.006882312456985547,0.4301445285615967,0.06331727460426703,0.017894012388162423,0.4817618719889883,0.0]|
|6.0       |6.0       |[0.0,0.0,0.006882312456985547,0.4301445285615967,0.06331727460426703,0.017894012388162423,0.4817618719889883,0.0]|
|3.0       |6.0       |[0.0,0.0,0.006882312456985547,0.4301445285615967,0.06331727460426703,0.017894012388162423,0.4817618719889883,0.0]|
|6.0       |3.0       |[0.0,0.0,0.007366482504604052,0.4585635359116022,0.24493554327808473,0.03130755064456722,0.2578268876611418,0.0] |
|6.0       |6.0       |[0.0,0.0,0.006882312456985547,0.4301445285615967,0.06331727460426703,0.017894012388162423,0.4817618719889883,0.0]|
|6.0       |4.0       |[0.0,0.0,0.0,0.11026615969581749,0.7262357414448669,0.0,0.1634980988593156,0.0]                                  |
+----------+----------+-----------------------------------------------------------------------------------------------------------------+
only showing top 20 rows

0.6661092530657748
0.6530434817981792
747.0  228.0  0.0    0.0     82.0    1.0    162.0   
269.0  576.0  4.0    0.0     429.0   13.0   19.0    
0.0    0.0    283.0  71.0    126.0   655.0  0.0     
0.0    0.0    137.0  1224.0  0.0     103.0  0.0     
22.0   79.0   17.0   0.0     1263.0  36.0   0.0     
0.0    2.0    142.0  68.0    201.0   796.0  0.0     
123.0  3.0    0.0    0.0     3.0     0.0    1086.0  
+----------+---+---+---+----+----+---+----+
|Cover_Type|  1|  2|  3|   4|   5|  6|   7|
+----------+---+---+---+----+----+---+----+
|       1.0|747|228|  0|   0|  82|  1| 162|
|       2.0|269|576|  4|   0| 429| 13|  19|
|       3.0|  0|  0|283|  71| 126|655|   0|
|       4.0|  0|  0|137|1224|   0|103|   0|
|       5.0| 22| 79| 17|   0|1263| 36|   0|
|       6.0|  0|  2|142|  68| 201|796|   0|
|       7.0|123|  3|  0|   0|   3|  0|1086|
+----------+---+---+---+----+----+---+----+

                                                                                0.14374138173631631
0.7896405919661733
{
	dtc_2deb7c7ac720-impurity: entropy,
	dtc_2deb7c7ac720-maxBins: 40,
	dtc_2deb7c7ac720-maxDepth: 20,
	dtc_2deb7c7ac720-minInfoGain: 0.0
}

0.7780126849894292
{
	dtc_2deb7c7ac720-impurity: gini,
	dtc_2deb7c7ac720-maxBins: 40,
	dtc_2deb7c7ac720-maxDepth: 20,
	dtc_2deb7c7ac720-minInfoGain: 0.0
}

0.7748414376321353
{
	dtc_2deb7c7ac720-impurity: entropy,
	dtc_2deb7c7ac720-maxBins: 40,
	dtc_2deb7c7ac720-maxDepth: 20,
	dtc_2deb7c7ac720-minInfoGain: 0.05
}

0.7684989429175476
{
	dtc_2deb7c7ac720-impurity: entropy,
	dtc_2deb7c7ac720-maxBins: 300,
	dtc_2deb7c7ac720-maxDepth: 20,
	dtc_2deb7c7ac720-minInfoGain: 0.0
}

0.7653276955602537
{
	dtc_2deb7c7ac720-impurity: entropy,
	dtc_2deb7c7ac720-maxBins: 300,
	dtc_2deb7c7ac720-maxDepth: 20,
	dtc_2deb7c7ac720-minInfoGain: 0.05
}

0.7610993657505285
{
	dtc_2deb7c7ac720-impurity: gini,
	dtc_2deb7c7ac720-maxBins: 300,
	dtc_2deb7c7ac720-maxDepth: 20,
	dtc_2deb7c7ac720-minInfoGain: 0.0
}

0.6099365750528541
{
	dtc_2deb7c7ac720-impurity: gini,
	dtc_2deb7c7ac720-maxBins: 40,
	dtc_2deb7c7ac720-maxDepth: 20,
	dtc_2deb7c7ac720-minInfoGain: 0.05
}

0.580338266384778
{
	dtc_2deb7c7ac720-impurity: gini,
	dtc_2deb7c7ac720-maxBins: 300,
	dtc_2deb7c7ac720-maxDepth: 20,
	dtc_2deb7c7ac720-minInfoGain: 0.05
}

0.3023255813953488
{
	dtc_2deb7c7ac720-impurity: gini,
	dtc_2deb7c7ac720-maxBins: 300,
	dtc_2deb7c7ac720-maxDepth: 1,
	dtc_2deb7c7ac720-minInfoGain: 0.0
}

0.3023255813953488
{
	dtc_2deb7c7ac720-impurity: gini,
	dtc_2deb7c7ac720-maxBins: 300,
	dtc_2deb7c7ac720-maxDepth: 1,
	dtc_2deb7c7ac720-minInfoGain: 0.05
}

0.3023255813953488
{
	dtc_2deb7c7ac720-impurity: entropy,
	dtc_2deb7c7ac720-maxBins: 300,
	dtc_2deb7c7ac720-maxDepth: 1,
	dtc_2deb7c7ac720-minInfoGain: 0.0
}

0.3023255813953488
{
	dtc_2deb7c7ac720-impurity: entropy,
	dtc_2deb7c7ac720-maxBins: 300,
	dtc_2deb7c7ac720-maxDepth: 1,
	dtc_2deb7c7ac720-minInfoGain: 0.05
}

0.3012684989429176
{
	dtc_2deb7c7ac720-impurity: gini,
	dtc_2deb7c7ac720-maxBins: 40,
	dtc_2deb7c7ac720-maxDepth: 1,
	dtc_2deb7c7ac720-minInfoGain: 0.0
}

0.3012684989429176
{
	dtc_2deb7c7ac720-impurity: gini,
	dtc_2deb7c7ac720-maxBins: 40,
	dtc_2deb7c7ac720-maxDepth: 1,
	dtc_2deb7c7ac720-minInfoGain: 0.05
}

0.3012684989429176
{
	dtc_2deb7c7ac720-impurity: entropy,
	dtc_2deb7c7ac720-maxBins: 40,
	dtc_2deb7c7ac720-maxDepth: 1,
	dtc_2deb7c7ac720-minInfoGain: 0.0
}

0.3012684989429176
{
	dtc_2deb7c7ac720-impurity: entropy,
	dtc_2deb7c7ac720-maxBins: 40,
	dtc_2deb7c7ac720-maxDepth: 1,
	dtc_2deb7c7ac720-minInfoGain: 0.05
}

{
	dtc_2deb7c7ac720-cacheNodeIds: false,
	dtc_2deb7c7ac720-checkpointInterval: 10,
	dtc_2deb7c7ac720-featuresCol: featureVector,
	dtc_2deb7c7ac720-impurity: entropy,
	dtc_2deb7c7ac720-labelCol: Cover_Type,
	dtc_2deb7c7ac720-maxBins: 40,
	dtc_2deb7c7ac720-maxDepth: 20,
	dtc_2deb7c7ac720-maxMemoryInMB: 256,
	dtc_2deb7c7ac720-minInfoGain: 0.0,
	dtc_2deb7c7ac720-minInstancesPerNode: 1,
	dtc_2deb7c7ac720-predictionCol: prediction,
	dtc_2deb7c7ac720-probabilityCol: probability,
	dtc_2deb7c7ac720-rawPredictionCol: rawPrediction,
	dtc_2deb7c7ac720-seed: 3209307937965257594
}
0.7896405919661733
0.7592233009708738
0.9969899665551839
{
	dtc_cffa81af0641-cacheNodeIds: false,
	dtc_cffa81af0641-checkpointInterval: 10,
	dtc_cffa81af0641-featuresCol: indexedVector,
	dtc_cffa81af0641-impurity: entropy,
	dtc_cffa81af0641-labelCol: Cover_Type,
	dtc_cffa81af0641-maxBins: 40,
	dtc_cffa81af0641-maxDepth: 20,
	dtc_cffa81af0641-maxMemoryInMB: 256,
	dtc_cffa81af0641-minInfoGain: 0.0,
	dtc_cffa81af0641-minInstancesPerNode: 1,
	dtc_cffa81af0641-predictionCol: prediction,
	dtc_cffa81af0641-probabilityCol: probability,
	dtc_cffa81af0641-rawPredictionCol: rawPrediction,
	dtc_cffa81af0641-seed: 8047672768821135007
}
0.7640776699029126
{
	rfc_e8bc9ea4d43d-cacheNodeIds: false,
	rfc_e8bc9ea4d43d-checkpointInterval: 10,
	rfc_e8bc9ea4d43d-featureSubsetStrategy: auto,
	rfc_e8bc9ea4d43d-featuresCol: indexedVector,
	rfc_e8bc9ea4d43d-impurity: entropy,
	rfc_e8bc9ea4d43d-labelCol: Cover_Type,
	rfc_e8bc9ea4d43d-maxBins: 300,
	rfc_e8bc9ea4d43d-maxDepth: 20,
	rfc_e8bc9ea4d43d-maxMemoryInMB: 256,
	rfc_e8bc9ea4d43d-minInfoGain: 0.0,
	rfc_e8bc9ea4d43d-minInstancesPerNode: 1,
	rfc_e8bc9ea4d43d-numTrees: 10,
	rfc_e8bc9ea4d43d-predictionCol: prediction,
	rfc_e8bc9ea4d43d-probabilityCol: probability,
	rfc_e8bc9ea4d43d-rawPredictionCol: rawPrediction,
	rfc_e8bc9ea4d43d-seed: -8436012926410260487,
	rfc_e8bc9ea4d43d-subsamplingRate: 1.0
}
10
(0.32005646818871936,Elevation)
(0.1616739188725525,wilderness)
(0.10479550464265983,Horizontal_Distance_To_Roadways)
(0.09944204298990124,soil)
(0.06491735390084415,Horizontal_Distance_To_Fire_Points)
(0.0505751486569617,Horizontal_Distance_To_Hydrology)
(0.040892766861586674,Hillshade_9am)
(0.0382629262035812,Vertical_Distance_To_Hydrology)
(0.03714587679346833,Aspect)
(0.03315642598783853,Hillshade_Noon)
(0.02839955257676014,Hillshade_3pm)
(0.020682014325126286,Slope)
0.8058252427184466
+----------+
|prediction|
+----------+
|       6.0|
|       6.0|
|       6.0|
|       4.0|
|       3.0|
|       3.0|
|       6.0|
|       3.0|
|       4.0|
|       4.0|
|       3.0|
|       3.0|
|       6.0|
|       6.0|
|       4.0|
|       4.0|
|       3.0|
|       4.0|
|       4.0|
|       4.0|
+----------+
only showing top 20 rows


Process finished with exit code 0

```