@echo off
set JAVA_EXE=D:\jdk-21.0.13+9\bin\java.exe

echo ========================================================
echo       Java Lab Manual Experiments Test Suite
echo ========================================================

echo.
echo [1/7] Testing Experiment-1...
cd /d "D:\java program\Experiment-1"
"%JAVA_EXE%" test1 Wipro Bangalore
"%JAVA_EXE%" test5

echo.
echo [2/7] Testing Experiment-2...
cd /d "D:\java program\Experiment-2"
"%JAVA_EXE%" test1
"%JAVA_EXE%" test5 10 20 30 40

echo.
echo [3/7] Testing Experiment-3...
cd /d "D:\java program\Experiment-3"
"%JAVA_EXE%" test1
"%JAVA_EXE%" test2
"%JAVA_EXE%" test4

echo.
echo [4/7] Testing Experiment-4...
cd /d "D:\java program\Experiment-4"
"%JAVA_EXE%" test1
"%JAVA_EXE%" test2
"%JAVA_EXE%" test4
"%JAVA_EXE%" test5

echo.
echo [5/7] Testing Experiment-5...
cd /d "D:\java program\Experiment-5"
"%JAVA_EXE%" test1
"%JAVA_EXE%" test2
"%JAVA_EXE%" test3
"%JAVA_EXE%" test5
"%JAVA_EXE%" test6

echo.
echo [6/7] Testing Experiment-6...
cd /d "D:\java program\Experiment-6"
echo Wipro | "%JAVA_EXE%" test3
echo Bangalore | "%JAVA_EXE%" test4

echo.
echo [7/7] Testing Experiment-7...
cd /d "D:\java program\Experiment-7"
"%JAVA_EXE%" mypack.test1
"%JAVA_EXE%" test2
"%JAVA_EXE%" test3
"%JAVA_EXE%" test4
"%JAVA_EXE%" test5
"%JAVA_EXE%" test6

echo.
echo ========================================================
echo       All Experiments Tested Successfully!
echo ========================================================
cd /d "D:\java program"
pause
