---
layout: docs
title: Unit tests and Reporting
permalink: /docs/unittest/
---
## Test group has has the next task:
</br>
#### This task execute all unit test classes in your organization but it is also possible execute some unit test using wildcards
</br>
## 7.1.1 Run Test synchronously
### The default configuration is run tests synchronously
## 7.1.1.1 Run all unit test
### You run a gradle task from plugin using the gradle command runTest.
<h5> Output of:  <strong>gradle runTest</strong></h5>

```bash
:runTest
___________________________________________
        Username: juan.perez@mail.com
        Login type: login
___________________________________________


BUILD SUCCESSFUL
```
##  7.1.1.2 Task runs test using a wildcard
#### This task run only unit test classes according to wildcard and generates XML reports of results obtained from server 
#### in a build/report
<h5> Output of:  <strong> gradle runTest -Pcls=Test* </strong></h5>

```bash
:runTest
___________________________________________  
        Username: juan.perez@mail.com           
        Login type: login
___________________________________________  
                        
Waiting reply from server: https://na17.salesforce.com
Unit Test Results:      
        TestClass.test1 
                Test Fail - System.AssertException: Assertion Failed: true | Class.TestClass.test1: line 26, column 1
        TestClass.test2 
                Test Fail - System.AssertException: Assertion Failed: true | Class.TestClass.test2: line 33, column 1
        TestClass.test3 
                Test Fail - System.AssertException: Assertion Failed: true | Class.TestClass.test3: line 39, column 1
        TestClass2.test3
                Test Fail - System.AssertException: Assertion Failed: true | Class.TestClass2.test3: line 39, column 1
        TestClass1.test3
                Test Fail - System.AssertException: Assertion Failed: true | Class.TestClass1.test3: line 39, column 1
Total time: 00:00:05:5315
                        
BUILD SUCCESSFUL
```


## 7.1.2 Run Test asynchronously
### If you can need run test asynchronously set true in 'async' property 
## 7.1.2.1 Run all unit test
### You run a gradle task from plugin using the gradle command runTest.
<h5> Output of:  <strong>gradle runTest -Pasync=true</strong></h5>

```bash
:runTest
___________________________________________
        Username: juan.perez@mail.com
        Login type: login
___________________________________________


BUILD SUCCESSFUL
```
##  7.1.2.2 Task runs test using a wildcard
#### This task run only unit test classes according to wildcard and generates XML reports of results obtained from server 
#### in a build/report
<h5> Output of:  <strong> gradle runTest -Pcls=Test* -Pasync=true</strong></h5>

```bash
:runTest
___________________________________________  
        Username: juan.perez@mail.com           
        Login type: login
___________________________________________  
                        
Waiting reply from server: https://na17.salesforce.com
Unit Test Results:      
        TestClass.test1 
                Test Fail - System.AssertException: Assertion Failed: true | Class.TestClass.test1: line 26, column 1
        TestClass.test2 
                Test Fail - System.AssertException: Assertion Failed: true | Class.TestClass.test2: line 33, column 1
        TestClass.test3 
                Test Fail - System.AssertException: Assertion Failed: true | Class.TestClass.test3: line 39, column 1
        TestClass2.test3
                Test Fail - System.AssertException: Assertion Failed: true | Class.TestClass2.test3: line 39, column 1
        TestClass1.test3
                Test Fail - System.AssertException: Assertion Failed: true | Class.TestClass1.test3: line 39, column 1
Total time: 00:00:05:5315
                        
BUILD SUCCESSFUL
```