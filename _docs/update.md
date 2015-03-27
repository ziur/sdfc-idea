---
layout: docs
title: Undeploy
permalink: /docs/update/
---
## 3.3.1 Update task
#### **Objective**
This task just deploys changed code (deleted code, added code and updated code), when you have changed class and a deleted trigger It deletes that trigger and updating the class changed according file tracker.

#### **Parameters**
This task has two parameters called **excludes** and **folders**. You can choose folder o folders to update it. Also you are able to exclude files by name by folder and using wildcards.

Those parameters can be used as task property or into your build script.

## 3.3.2 Executing update task

#### **Without parameters:**

User can update all files that are listed on file tracker like file changed, deleted or new one. If you want to run this task, you should write the next command:

	gradle update

> **Note:** To know more about file tracker see Chapter 4 File Monitor

#### **Using folders parameter:**

User can update files that are within the folder user wants and listed on file tracker like file changed, deleted or new one.

	gradle update -Pfolders=classes
	gradle update -Pfolders=classes,objects,triggers

> **Note:** Many Folders can be added

#### **Using excludes parameter**

User can update all files that are listed on file tracker like file changed, deleted or new one, excluding files, or folders.

This parameter can exclude files by:

 ***folder*** if you want to exclude a folder or folders, You should write the next parameter:

			gradle update -Pexcludes=classes
		    gradle update -Pexcludes=classes,objects.

 ***file*** if you want to exclude a file or files, You should write the next parameter:

			gradle update -Pexcludes=classes/Class1.cls

 ***wildcard*** if you want to exclude using wildcard, You should write the next parameter:

			gradle update  -Pexcludes=classes/**
		    gradle update  -Pexcludes=objects/*.object
		    gradle update  -Pexcludes=**/*Account*/**
		    gradle update  -Pexcludes=**/*.cls

##	3.3.3 Examples:

### without parameters:

In this case four files was changed how to see the next output.

<h5> Output of:  <strong>gradle update</strong></h5>

```bash
    :update
    ___________________________________________
            Username: juan.perez.f@gmail.com
            Login type: login
    ___________________________________________

    *********************************************
                  Status Files Changed
    *********************************************
    object1.object - Changed file
    page1.page - Changed file
    trigger1.trigger - Changed file
    Class1.cls - Changed file
    *********************************************

    Starting deploy...
    [==================================================]   100%
    The files were successfully deployed

    BUILD SUCCESSFUL
```

### Using folders parameter:

In this example Class1.cls and trigger1.trigger was updated.

<h5> Output of:  <strong>gradle update -Pfolders=classes,triggers</strong></h5>

```bash
    :update
    ___________________________________________
            Username: juan.perez.f@gmail.com
            Login type: login
    ___________________________________________

    *********************************************
                  Status Files Changed
    *********************************************
    trigger1.trigger - Changed file
    Class1.cls - Changed file
    *********************************************

    Starting deploy...
    [==================================================]   100%
    The files were successfully deployed

    BUILD SUCCESSFUL
```

### Using excludes parameter:
In this case Class1.cls and Class2.cls were updated and Class1.cls was excluded.
<h5> Output of:  <strong>gradle update -Pexcludes=**/Class1.cls</strong></h5>

```bash
    > gradle update
    :update
    ___________________________________________
            Username: juan.perez@mail.com
            Login type: login
    ___________________________________________

    *********************************************
              Status Files Changed
    *********************************************
    Class2.cls - Changed file
    *********************************************
    *********************************************
                  Files excluded
    *********************************************
    Class1.cls -  excluded
    *********************************************
    Starting deploy...
    [==================================================]   100%
    The files were successfully deployed

    BUILD SUCCESSFUL

```
In this example files were updated from classes and objects folders and classes folder was excluded.
<h5> Output of:  <strong> gradle update -Pexcludes=classes</strong></h5>

```bash
    > gradle update
    :update
    ___________________________________________
            Username: juan.perez@mail.com
            Login type: login
    ___________________________________________

   *********************************************
              Status Files Changed
    *********************************************
    Account.object - Changed file
    *********************************************
    *********************************************
                  Files excluded
    *********************************************
    Class1.cls -  excluded
    Class2.cls -  excluded
    *********************************************
    Starting deploy...
    [==================================================]   100%
    The files were successfully deployed

BUILD SUCCESSFUL

```