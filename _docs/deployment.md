---
layout: docs
title: Deployment tasks
permalink: /docs/deployment/
---
## 3.1.1 Deploy task

#### **Objective**
This task deploys all code from your local directory to SalesForce organization, for this as a first step It truncates your code from local repository and deploys those files truncated as second step It deploys your code to SatesForce organization.


#### **The idea behind deployment process**
All code will be deployed to organization using a smart deploy that mean when execute the task deploy.

	a) First step is truncate the next elements and deploy it.

	    - Classes
	    - Objects
	    - Triggers
	    - Components
	    - Pages
	    - WorkFlows

	b) Second step is deploy all code in organization

#### **Parameters**
This task has two parameters called **excludes** and **folders**. You can choose folder o folders to deploy it. Also you are able to exclude files by name by folder and using wildcards.

Those parameters can be used as console commands or into your build script.

## 3.1.2 Executing deploy task

### Without parameters
Once this task is executed without parameters it deploys all code to SalesForce organization.

	gradle deploy

### Using folders parameter
You can choose the folders that you want to deploy.

	gradle deploy -Pfolders=classes
	gradle deploy -Pfolders=classes,triggers,objects

### Using excludes parameter:

User can deploy code excluding some files using **excludes** parameter.


 ***by folders*** if you want to exclude a folder or folders, You should write the next parameter:

    gradle deploy -Pexcludes=classes
    gradle deploy -Pexcludes=classes,objects.

 ***by files*** if you want to exclude a file or files, You should write the next parameter:

    gradle deploy -Pexcludes=classes/Class1.cls

 ***using wildcard*** if you want to exclude using wildcard, You should write the next parameter:

    gradle deploy  -Pexcludes=classes/**
    gradle deploy  -Pexcludes=objects/*.object
    gradle deploy  -Pexcludes=**/*Account*/**
    gradle deploy  -Pexcludes=**/*.cls

## 3.1.3 Examples:

### Without parameters

Once this task is executed without ***folders*** parameter it deploys all code into an organization.
***Output of:***  gradle deploy

```bash
    :deploy
    ___________________________________________
            Username: juan.perez@mail.com
            Login type: login
    ___________________________________________

    Deploying truncated code
    [==================================================]   100%
    Truncated code were successfully deployed

    Starting deploy
    [==================================================]   100%
    Code were successfully deployed

    BUILD SUCCESSFUL
```

### Using folders parameters

You can choose folders that will be deployed.
***Output of:***  gradle deploy -Pfolders=classes,triggers

```bash
    :deploy
    ___________________________________________
            Username: juan.perez@mail.com
            Login type: login
    ___________________________________________

    Starting deploy...
    [==================================================]   100%
    The files were successfully deployed

    BUILD SUCCESSFUL
```

### Using excludes parameters
This command deploys all files from your local respository excluding classes.
***Output of:***  gradle deploy -Pexcludes=classes

```bash
    :deploy
    ___________________________________________
            Username: juan.perez@mail.com
            Login type: login
    ___________________________________________

     Deploying truncated code
     [==================================================]   100%
     Truncated code were successfully deployed

     Starting deploy
     [==================================================]   100%
     Code were successfully deployed

     BUILD SUCCESSFUL
```

This command deploys all code excluding Class1.cls
***Output of:***  gradle deploy -Pexcludes=classes/Class1.cls

```bash
    :deploy
    ___________________________________________
            Username: juan.perez@mail.com
            Login type: login
    ___________________________________________

    Deploying truncated code
    [==================================================]   100%
    Truncated code were successfully deployed

    Starting deploy
    [==================================================]   100%
    Code were successfully deployed

    BUILD SUCCESSFUL
```
This command deploys all code excluding a folder class.
***Output of:***  gradle deploy -Pexcludes=classes/**

```bash
    :deploy
    ___________________________________________
            Username: juan.perez@mail.com
            Login type: login
    ___________________________________________

    Deploying truncated code
    [==================================================]   100%
    Truncated code were successfully deployed

    Starting deploy
    [==================================================]   100%
    Code were successfully deployed

    BUILD SUCCESSFUL
```

## 3.2.1 Upload task

#### **Objective**
This task uploads your code from your local repository to SalesForce organization  directly as it is.

#### **Parameters**
This task has two parameters called **files** and **excludes**. If you want to upload a file or more files you should use files parameters it uploads code by file by folder and using wildcards.
If you want to exclude some files you should use excludes parameter.

## 3.2.2 Executing upload task

### Without parameters
User can upload all source code to organization, to do this you should execute to ***upload task*** without parameters.

	gradle upload

### Using files parameter

User can upload source code using ***files*** parameter, it supports folders, files and wildcards.

* To upload files you should write the next command:

		gradle upload -Pfiles=classes/Class1.cls
	    gradle upload -Pfiles=classes/Class1.cls,objects/Account.object

* To upload folders you should write the next command:

		gradle upload -Pfiles=classes
	    gradle upload -Pfiles=classes,objects,triggers
* To upload files using wildcards you should wirte the next command:

		gradle upload -Pfiles=**/*.cls
	    gradle upload -Pfiles=classes/**
	    gradle upload -Pfiles=**/*Account*/**

### Using excludes parameter

User can deploy code excluding some files using **excludes** parameter.


 ***by folders*** if you want to exclude a folder or folders, You should write the next parameter:

        gradle upload -Pexcludes=classes
        gradle upload -Pexcludes=classes,objects.

 ***by files*** if you want to exclude a file or files, You should write the next parameter:

        gradle upload -Pexcludes=classes/Class1.cls

 ***using wildcard*** if you want to exclude using wildcard, You should write the next parameter:

        gradle upload  -Pexcludes=classes/**
        gradle upload  -Pexcludes=objects/*.object
        gradle upload  -Pexcludes=**/*Account*/**
        gradle upload  -Pexcludes=**/*.cls

##  3.2.3 Examples:

### Without parameters
When you run this command all files are uploaded to organization.

***Output of:*** gradle upload

```bash
    :upload
    ___________________________________________
            Username: juan.perez@mail.com
            Login type: login
    ___________________________________________

    Starting deploy...
    [==================================================]   100%
    The files were successfully deployed

    BUILD SUCCESSFUL
```

### Using files parameter

This command just uploads classes and triggers files.
***Output of:***  gradle upload -Pfiles=classes,triggers

```bash
    :upload
    ___________________________________________
            Username: juan.perez@mail.com
            Login type: login
    ___________________________________________


    Starting deploy...
    [==================================================]   100%
    The files were successfully deployed

    BUILD SUCCESSFUL
```
> **Note:** Many Folders can be added


This command uploads class1.cls and trigger1.trigger
***Output of:***  gradle upload -Pfiles=classes/class1.cls,triggers/trigger1.trigger

```bash
    :upload
    ___________________________________________
            Username: juan.perez@mail.com
            Login type: login
    ___________________________________________


    Starting deploy...
    [==================================================]   100%
    The files were successfully deployed

    BUILD SUCCESSFUL
```
> **Note:** Many Files can be added

This command uploads Class1.cls and all triggers and all obejcts.

***Output of:***  gradle upload -Pfiles=classes/Class1.cls,triggers,objects

```bash
    :upload
    ___________________________________________
            Username: juan.perez@mail.com
            Login type: login
    ___________________________________________


    Starting deploy...
    [==================================================]   100%
    The files were successfully deployed

    BUILD SUCCESSFUL
```

This command uploads all classes all triggers and all obejcts.
***Output of:***  gradle upload -Pfiles=classes/**,triggers,objects

```bash
    :upload
    ___________________________________________
            Username: juan.perez@mail.com
            Login type: login
    ___________________________________________


    Starting deploy...
    [==================================================]   100%
    The files were successfully deployed

    BUILD SUCCESSFUL
```

### Using excludes parameter

This commando uploads all files excluding all classes.
***Output of:***  gradle upload -Pexcludes=classes

```bash
    > gradle upload
    :upload
    ___________________________________________
            Username: juan.perez@mail.com
            Login type: login
    ___________________________________________

     Starting deploy...
     [==================================================]   100%
     The files were successfully deployed

     BUILD SUCCESSFUL
```
This command uploads all files excluding Class1.cls
***Output of:***   gradle upload -Pexcludes=classes/Class1.cls

```bash
    > gradle upload
    :upload
    ___________________________________________
            Username: juan.perez@mail.com
            Login type: login
    ___________________________________________

   Starting deploy...
   [==================================================]   100%
   The files were successfully deployed

    BUILD SUCCESSFUL
```
This command uploads all files excluding all classes.
***Output of:***  gradle upload -Pexcludes=classes/**

```bash
    > gradle upload
    :upload
    ___________________________________________
            Username: juan.perez@mail.com
            Login type: login
    ___________________________________________

    Starting deploy...
    [==================================================]   100%
    The files were successfully deployed

    BUILD SUCCESSFUL
```

## 3.2.4 Limitations of Upload task

*	***files*** parameter doesn't support absolute paths.
