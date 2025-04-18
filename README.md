# Parallel-Project

A Java application that reads student grades from multiple files using multi-threading for efficient parallel processing. The system demonstrates concurrent file processing and thread management. 

# Features

Multi-threaded file processing

Concurrent grade data extraction

Thread-safe operations

Configurable thread pool size

Error handling for file operations

# Prerequisites

Java JDK 8 or later

# Project Structure Copy

student-grades-processor/ ├── src/ │ ├── main/ │ │ ├── java/ │ │ 
│ ├── model/ │ │ │ │ └── Student.java │ │ 
│ ├── service/ │ │ │ │ └── GradeProcessor.java │ │
│ └── Main.java │ │ └── resources/ │ │ ├── grades1.txt │ │ ├── grades2.txt │ │ └── grades3.txt ├── target/ (generated after build) ├── pom.xml └── README.md

# Configuration

Modify these settings in Main.java:

numberOfThreads: Controls thread pool size

gradeFiles array: Specify input file paths

# File Format Example

Example grade file (grades1.txt): Copy

1, Ahmed Mohamed, 85.5 

2, Sara Ali, 92.0 

3, Mohamed Hassan, 78.5

# Expected Output

The program will display:

Processing status for each file

Number of students processed per file

Detailed student information

# Performance Considerations

Optimal thread count depends on your CPU cores
Larger files benefit more from parallel processing
Disk I/O may become bottleneck with many threads

