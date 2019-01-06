#!/bin/bash

find . -name '*.class' | xargs rm

CLASSPATH="WEB-INF/classes;WEB-INF/lib/org.json.jar;WEB-INF/lib/sqlite-jdbc-3.23.1.jar;WEB-INF/lib/winstone.jar;."
JAVA_FILES="  WEB-INF\classes\se\itu\web\DatabaseArtist.java   WEB-INF/classes/se/itu/web/StatisticsArtist.java
  WEB-INF/classes/se/itu/web/ServletArtist.java WEB-INF\classes\se\itu\web\StatisticsSong.java
  WEB-INF\classes\se\itu\web\DatabaseSong.java  WEB-INF/classes/se/itu/web/ServletSong.java"

javac -cp "$CLASSPATH" ${JAVA_FILES}
