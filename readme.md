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
