Java > 11 
  ---------

Installing Maven
  ----------------

  1) Unpack the archive where you would like to store the binaries, e.g.:

    Unix-based operating systems (Linux, Solaris and Mac OS X)
      tar zxvf apache-maven-4.x.y.tar.gz
    Windows
      unzip apache-maven-4.x.y.zip

  2) A directory called "apache-maven-4.x.y" will be created.

  3) Add the bin directory to your PATH, e.g.:

    Unix-based operating systems (Linux, Solaris and Mac OS X)
      export PATH=/usr/local/apache-maven-4.x.y/bin:$PATH
    Windows
      set PATH="c:\program files\apache-maven-4.x.y\bin";%PATH%

  4) Make sure JAVA_HOME is set to the location of your JDK

  5) Run "mvn --version" to verify that it is correctly installed.

  For complete documentation, see https://maven.apache.org/download.html#Installation
  
  
  
  Test Execution command
  --------------------------------  
    mvn clean install
       
       
       Microsoft Windows [Version 10.0.18363.1082]
       (c) 2019 Microsoft Corporation. All rights reserved.
       
       C:\code\reward-service>mvn clean install
       [INFO] Scanning for projects...
       [WARNING]
       [WARNING] Some problems were encountered while building the effective model for org.mycompany:reward-service:jar:1.0-SNAPSHOT
       [WARNING] 'build.plugins.plugin.version' for org.apache.maven.plugins:maven-compiler-plugin is missing. @ line 12, column 21
       [WARNING]
       [WARNING] It is highly recommended to fix these problems because they threaten the stability of your build.
       [WARNING]
       [WARNING] For this reason, future Maven versions might no longer support building such malformed projects.
       [WARNING]
       [INFO]
       [INFO] --------------------< org.mycompany:reward-service >--------------------
       [INFO] Building reward-service 1.0-SNAPSHOT
       [INFO] --------------------------------[ jar ]---------------------------------
       [INFO]
       [INFO] --- maven-clean-plugin:2.5:clean (default-clean) @ reward-service ---
       [INFO] Deleting C:\dmf\reward-service\target
       [INFO]
       [INFO] --- maven-resources-plugin:2.6:resources (default-resources) @ reward-service ---
       [WARNING] Using platform encoding (Cp1252 actually) to copy filtered resources, i.e. build is platform dependent!
       [INFO] Copying 0 resource
       [INFO]
       [INFO] --- maven-compiler-plugin:3.1:compile (default-compile) @ reward-service ---
       [INFO] Changes detected - recompiling the module!
       [WARNING] File encoding has not been set, using platform encoding Cp1252, i.e. build is platform dependent!
       [INFO] Compiling 12 source files to C:\dmf\reward-service\target\classes
       [INFO]
       [INFO] --- maven-resources-plugin:2.6:testResources (default-testResources) @ reward-service ---
       [WARNING] Using platform encoding (Cp1252 actually) to copy filtered resources, i.e. build is platform dependent!
       [INFO] skip non existing resourceDirectory C:\dmf\reward-service\src\test\resources
       [INFO]
       [INFO] --- maven-compiler-plugin:3.1:testCompile (default-testCompile) @ reward-service ---
       [INFO] Changes detected - recompiling the module!
       [WARNING] File encoding has not been set, using platform encoding Cp1252, i.e. build is platform dependent!
       [INFO] Compiling 1 source file to C:\dmf\reward-service\target\test-classes
       [INFO]
       [INFO] --- maven-surefire-plugin:2.22.1:test (default-test) @ reward-service ---
       [INFO]
       [INFO] -------------------------------------------------------
       [INFO]  T E S T S
       [INFO] -------------------------------------------------------
       [INFO] Running RewardsServiceTest
       May 03, 2021 12:25:17 AM RewardsServiceTest shouldThrowErrorForInvalidAccountFormat
       INFO: Executing Test-1 -> shouldThrowErrorForInvalidAccountFormat
       May 03, 2021 12:25:17 AM RewardsServiceTest shouldThrowErrorForInvalidAccountFormat
       INFO: Output::validation_error
       May 03, 2021 12:25:17 AM RewardsServiceTest shouldReturnNoRewardForNonPlatinumAccount
       INFO: Executing Test-4 -> shouldReturnNoRewardForNonPlatinumAccount
       May 03, 2021 12:25:17 AM RewardsServiceTest shouldReturnNoRewardForNonPlatinumAccount
       INFO: Output::RewardsServiceStatus{statusCode='CUSTOMER_INELIGIBLE', statusDescription='Customer is not eligible'}
       May 03, 2021 12:25:17 AM RewardsServiceTest shouldThrowErrorForAccountNotExist
       INFO: Executing Test-2 -> shouldThrowErrorForAccountNotExist
       May 03, 2021 12:25:17 AM RewardsServiceTest shouldThrowErrorForAccountNotExist
       INFO: Output::INVALID_ACCOUNT_NUMBER
       May 03, 2021 12:25:17 AM RewardsServiceTest shouldReturnRewardForPlatinumAccount
       INFO: Executing Test-3 -> shouldReturnRewardForPlatinumAccount
       May 03, 2021 12:25:17 AM RewardsServiceTest shouldReturnRewardForPlatinumAccount
       INFO: Output::RewardsServiceStatus{statusCode='CUSTOMER_ELIGIBLE', statusDescription='CHAMPIONS_LEAGUE_FINAL_TICKET'}
       [INFO] Tests run: 4, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.187 s - in RewardsServiceTest
       [INFO]
       [INFO] Results:
       [INFO]
       [INFO] Tests run: 4, Failures: 0, Errors: 0, Skipped: 0
       [INFO]
       [INFO]
       [INFO] --- maven-jar-plugin:2.4:jar (default-jar) @ reward-service ---
       [INFO] Building jar: C:\dmf\reward-service\target\reward-service-1.0-SNAPSHOT.jar
       [INFO]
       [INFO] --- maven-install-plugin:2.4:install (default-install) @ reward-service ---
       [INFO] Installing C:\dmf\reward-service\target\reward-service-1.0-SNAPSHOT.jar to C:\Users\eknnthm\.m2\repository\org\mycompany\reward-service\1.0-SNAPSHOT\reward-service-1.0-SNAPSHOT.jar
       [INFO] Installing C:\dmf\reward-service\pom.xml to C:\Users\eknnthm\.m2\repository\org\mycompany\reward-service\1.0-SNAPSHOT\reward-service-1.0-SNAPSHOT.pom
       [INFO] ------------------------------------------------------------------------
       [INFO] BUILD SUCCESS
       [INFO] ------------------------------------------------------------------------
       [INFO] Total time:  6.758 s
       [INFO] Finished at: 2021-05-03T00:25:18+05:30
       [INFO] ------------------------------------------------------------------------
       
    