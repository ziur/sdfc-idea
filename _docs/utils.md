---
layout: gradle
title: Utils
permalink: /docs/utils/
---
## Execute group has the next task:

#### **Objective**

This task is able to execute code apex.

#### **Parameters**

This task has two parameters called ***input*** and ***output*** where the first is used to set a file that you want to execute, another one is used to set a file path and get results in this file.

## Execute task

This task executes a code block of Apex using input parameter to set file path of source code

	$ gradle execute -Pinput="src/classes/Class1.cls"

output:

```bash
:execute
___________________________________________
        Username: juan.perez@mail.com
        Login type: login
___________________________________________

Executing Apex code at: src/classes/Class1.cls
Output result:
29.0 ALL,ERROR;APEX_CODE,ERROR;DB,INFO
Execute Anonymous: public with sharing class Class1 {
Execute Anonymous:
Execute Anonymous:   public Object1__c o = new Object1__c();
Execute Anonymous:   public Object1__c other = new Object1__c();
Execute Anonymous:   public Object1__c demo7 = new Object1__c();
Execute Anonymous:
Execute Anonymous:
Execute Anonymous:   public Class1()
Execute Anonymous:   {
Execute Anonymous:
Execute Anonymous:     o.Field1__c = 'field1';
Execute Anonymous:     insert o;
Execute Anonymous:
Execute Anonymous:   }
Execute Anonymous:
Execute Anonymous:  public void testCoverage(Integer num)
Execute Anonymous:   {
Execute Anonymous:       if(num > 0)
Execute Anonymous:       {
Execute Anonymous:           other.Field1__c = 'field1';
Execute Anonymous:       }
Execute Anonymous:       else
Execute Anonymous:       {
Execute Anonymous:           other.Field1__c = 'field0';
Execute Anonymous:       }
Execute Anonymous:
Execute Anonymous:
Execute Anonymous:   }
Execute Anonymous:
Execute Anonymous:   public void compareCoverages(Integer num)
Execute Anonymous:   {
Execute Anonymous:         if(num > 0)
Execute Anonymous:         {
Execute Anonymous:             other.Field1__c = 'field10';
Execute Anonymous:         }
Execute Anonymous:         else
Execute Anonymous:         {
Execute Anonymous:             other.Field1__c = 'field0';
Execute Anonymous:         }
Execute Anonymous:   }
Execute Anonymous: }
18:46:33.046 (46811716)|EXECUTION_STARTED
18:46:33.046 (46819740)|CODE_UNIT_STARTED|[EXTERNAL]|execute_anonymous_apex
18:46:33.047 (47049936)|CODE_UNIT_FINISHED|execute_anonymous_apex
18:46:33.048 (48084935)|EXECUTION_FINISHED


BUILD SUCCESSFUL
```

### Task execute with inline code and output parameter

This task executes a code block of Apex using input parameter to set inline code and output parameter to set a file path and get results in this file.

	$ gradle execute -Pinput="system.debug('hello world');"
				     -Poutput=build/hello.txt

output:

```bash
:execute
___________________________________________
        Username: juan.perez@mail.com
        Login type: login
___________________________________________

Apex output available at:build/hello.txt

BUILD SUCCESSFUL
```