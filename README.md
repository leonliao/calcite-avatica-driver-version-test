# calcite-avatica-driver-version-test
This project demonstrates  the memory leak of Avatica's DriverVersion.load

1. Run mvn package
2. Upload target/calcite-avatica-driver-version-test-0.1-SNAPSHOT-bin.zip to a Linux CentOS 6.9 machine
3. Unzip the zip to a folder, cd the folder
4. Run the run.sh. 
5. Then using the jeprof util to monitor the heap, following the instruction at https://github.com/jeffgriffith/native-jvm-leaks



