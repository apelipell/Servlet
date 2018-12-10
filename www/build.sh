#!/bin/bash

CLASSPATH="WEB-INF/classes;WEB-INF/lib/org.json.jar;WEB-INF/lib/sqlite-jdbc-3.23.1.jar;WEB-INF/lib/winstone.jar;."
JAVA_FILES="  WEB-INF/classes/se/itu/web/Database.java   WEB-INF/classes/se/itu/web/Statistics.java   WEB-INF/classes/se/itu/web/Servlet.java"

javac -cp "$CLASSPATH" ${JAVA_FILES}
