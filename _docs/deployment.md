---
layout: docs
title: Deployment tasks
permalink: /docs/deployment/
---
## Deployment group has the next task:
* All code will be deployed to organization using a smart deploy that mean when execute the task deploy.

	a) The first process is truncate the next elements:    
<ul>
    <li> Classes</li>
    <li> Objects</li>
    <li> Triggers</li>
    <li> Components</li>
    <li> Pages</li>
    <li> WorkFlows</li>
</ul>
b) The second process is deploy code truncate in organization and the last process is deploy all code in organization 


## 3.1.1 Execute task deploy
Once this task is executed without ***folders*** parameter it deploys all code into an organization.
<h5> Output of:  <strong> gradle deploy</strong></h5>

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

## 3.1.2 Task deploy using folders parameter
Once deploy task is executed you are able to choose that folders you want to deploy.
<h5> Output of:  <strong> gradle deploy -Pfolders=classes,triggers</strong></h5>

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

## 3.1.3 Task deploy using turnOffTruncate parameter

You are able to disable to truncate file using the next values:
    
* deprecate .- if select this value then comment all notation "deprecate" in classes.
* sourceCode.- if select this value then process truncate files is deactivated

###**Examples:**

<h5> Output of:  <strong> gradle deploy -PturnOffTruncate=deprecate</strong></h5>

```bash    
    :deploy
    ___________________________________________
            Username: juan.perez@mail.com
            Login type: login
    ___________________________________________

     truncate deprecate statement has been deactivated     
     Deploying truncated code
     [==================================================]   100%
     Truncated code were successfully deployed
           
     Starting deploy
     [==================================================]   100%
     Code were successfully deployed
     
     BUILD SUCCESSFUL
```

<h5> Output of:  <strong> gradle deploy -PturnOffTruncate=sourceCode</strong></h5>

```bash    
    :deploy
    ___________________________________________
            Username: juan.perez@mail.com
            Login type: login
    ___________________________________________
     
    truncate code has been deactivated          
    Starting deploy
    [==================================================]   100%
    Code were successfully deployed
    
    
    BUILD SUCCESSFUL
```

## 3.1.4 Task deploy using excludes parameter

This parameter can exclude files by:

* ***folder*** if you want to exclude a folder or folders, You should write the next parameter:
	* -Pexcludes=classes
    * -Pexcludes=classes,objects.
* ***file*** if you want to exclude a file or files, You should write the next parameter:
	* -Pexcludes=classes/Class1.cls
    * -Pexcludes=classes/Class1.cls, classes/Class2.cls.
* ***wildcard*** if you want to exclude using wildcard, You should write the next parameter:
	* -Pexcludes=classes/**
    * -Pexcludes=objects/\*.object
    * -Pexcludes=\*\*/\*Account\*/**
    * -Pexcludes=\*\*/*.cls
    
###**Examples:**

<h5> Output of:  <strong> gradle deploy -Pexcludes=classes</strong></h5>

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

<h5> Output of:  <strong> gradle deploy -Pexcludes=classes/Class1.cls</strong></h5>

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

<h5> Output of:  <strong> gradle deploy -Pexcludes=classes/*</strong></h5>

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

</br>
#### Task upload let's user upload code to salesForce organization directly as it is.
</br>
## 3.2.1 Executing task upload
User can upload all source code to organization, to do this you should execute to ***upload task*** without parameters.

<h5> Output of:  <strong>gradle upload</strong></h5>

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

## 3.2.2 Executing task upload using files parameter
User can upload source code using ***files*** parameter, it supports folders, files and wildcards.

* To upload files you should write the next command:
	* gradle upload -Pfiles=classes/Class1.cls
    * gradle upload -Pfiles=classes/Class1.cls,objects/Account.object
* To upload folders you should write the next command:
	* gradle upload -Pfiles=classes
    * gradle upload -Pfiles=classes,objects,triggers
* To upload files using wildcards you should wirte the next command:
	* gradle upload -Pfiles=\*\*/*.cls
    * gradle upload -Pfiles=classes/**
    * gradle upload -Pfiles=\*\*/\*Account\*/\*\*

###**Examples:**

<h5> Output of:  <strong>gradle upload -Pfiles=classes,triggers</strong></h5>

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



<h5> Output of:  <strong>gradle upload -Pfiles=classes/class1.cls,triggers/trigger1.trigger</strong></h5>

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


<h5> Output of:  <strong>gradle upload -Pfiles=classes/Class1.cls,triggers,objects</strong></h5>

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

<h5> Output of:  <strong>gradle upload -Pfiles=classes/**,triggers,objects</strong></h5>

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


## 3.2.3 Executing upload task with excludes parameter

This parameter can exclude files by:

* ***folder*** if you want to exclude a folder or folders, You should write the next parameter:
	* -Pexcludes=classes
    * -Pexcludes=classes,objects.
* ***file*** if you want to exclude a file or files, You should write the next parameter:
	* -Pexcludes=classes/Class1.cls
    * -Pexcludes=classes/Class1.cls, classes/Class2.cls.
* ***wildcard*** if you want to exclude using wildcard, You should write the next parameter:
	* -Pexcludes=classes/**
    * -Pexcludes=objects/\*.object
    * -Pexcludes=\*\*/\*Account\*/**
    * -Pexcludes=\*\*/*.cls
    
###**Examples:**
    
<h5> Output of:  <strong> gradle upload -Pexcludes=classes</strong></h5>

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

<h5> Output of:  <strong> gradle upload -Pexcludes=classes/Class1.cls</strong></h5>

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

<h5> Output of:  <strong> gradle upload -Pexcludes=classes/**</strong></h5>

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

</br>
#### Task update let's user updates the code according file tracker
</br>

## 3.3.1 Executing task update
User can update all files that are listed on file tracker like file changed, deleted or new one. If you want to run this task, you should write the next command:
* gradle update

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
> **Note:** To know more about file tracker see Chapter 4 File Monitor

## 3.3.2 Executing task update using folders parameter

User can update files that are within the folder user wants and listed on file tracker like file changed, deleted or new one.

* gradle update -Pfolders=classes
* gradle update -Pfolders=classes,objects,triggers

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
> **Note:** Many Folders can be added

## 3.3.3 Executing task update using excludes parameter
This parameter can exclude files by:

* ***folder*** if you want to exclude a folder or folders, You should write the next parameter:
	* -Pexcludes=classes
    * -Pexcludes=classes,objects.
* ***file*** if you want to exclude a file or files, You should write the next parameter:
	* -Pexcludes=classes/Class1.cls
    * -Pexcludes=classes/Class1.cls, classes/Class2.cls.
* ***wildcard*** if you want to exclude using wildcard, You should write the next parameter:
	* -Pexcludes=classes/**
    * -Pexcludes=objects/\*.object
    * -Pexcludes=\*\*/\*Account\*/**
    * -Pexcludes=\*\*/*.cls
    
###**Examples:**
In this case Class1.cls and Class2.cls were updated and Class1.cls was excluded.
<h5> Output of:  <strong>gradle update -Pexcludes=\*\*/Class1.cls</strong></h5>

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

### All code will be undeployed from the organization, truncating dependencies of next elements with its respective commands:

***1.  classes***
- classContent
- deprecate

***2.  objects***
- fieldSet
- actionOverride
- formula
-  webLink

***3.  Triggers***
- triggerContent

***4.  Components***
- componentContent
 
***5.  Pages***
- pageContent

***6.  Tabs***
- tabContent

***7.  WorkFlows***
- workflowContent

## 3.4.1 Execute the undeploy task using commands
Once Undeploy task is executed, you can choose commands to execute.
Using the command names array if it is empty all commands will be executed.

```bash
undeploy {
    commands = ['classContent','webLink', 'formula','workflowContent'] 
}

```

<h5> Output of:  <strong> gradle undeploy</strong></h5>

```bash
    > gradle undeploy
    :undeploy                                                                        
    ___________________________________________
          Username: john.doe@email.com                    
          Login type: login                
    ___________________________________________
                           
      [zip] Building zip: /user/build/deploy.zip
Starting undeploy...     
[==================================================]   100%     
All components truncated were successfully uploaded
                         
      [zip] Building zip: /user/build/deploy.zip
                         
[==================================================]   100%     
The files were successfully deleted

    BUILD SUCCESSFUL
```

## 3.4.2 Add global commands
To add a new global command you can use registerCommand method in the plugin extention "force",
 it will be visible for all tasks that using the truncated process.

```bash

force {
    registerCommand('classes','printClassName', { class->
        println file.name
    })
}


undeploy {
    commands = ['printClassName']
}

update {
    commands = ['printClassName']
}

```

## 3.4.3 Add custom commands
To add a new command you can use command or commandFirst methods for each task 
where you want to add a new custom command.

### Adding a new anonymous command
```bash
undeploy {

    command('classes', { file-> 
        println file.path
    })
}

```

### Adding a new custom command that will execute after than all commands on the classes
```bash
undeploy {


    command('classes','doLast', { file-> 
        println file.path
    })

}

```

#### Adding a new custom command that will execute before than all commands on the objects
```bash
undeploy {

    commandFirst('objects', 'printFilePath', { file-> 
        println file.name + " " + file.size()
    })
}

```

## 3.4.4 Executing task undeploy using exclude parameter
This parameter can exclude files by:

* ***folder*** if you want to exclude a folder or folders, You should write the next parameter:
	* -Pexcludes=classes
    * -Pexcludes=classes,objects.
* ***file*** if you want to exclude a file or files, You should write the next parameter:
	* -Pexcludes=classes/Class1.cls
    * -Pexcludes=classes/Class1.cls, classes/Class2.cls.
* ***wildcard*** if you want to exclude using wildcard, You should write the next parameter:
	* -Pexcludes=classes/**
    * -Pexcludes=objects/\*.object
    * -Pexcludes=\*\*/\*Account\*/**
    * -Pexcludes=\*\*/*.cls
    
###**Examples:**
<h5> Output of:  <strong> gradle undeploy -Pexcludes=classes</strong></h5>
```bash
    > gradle undeploy
    :undeploy
    ___________________________________________
            Username: juan.perez@mail.com
            Login type: login
    ___________________________________________

     Starting undeploy...
     [==================================================]   100%
     All components truncated were successfully uploaded


     [==================================================]   100%
     The files were successfully deleted

     BUILD SUCCESSFUL
```

<h5> Output of:  <strong> gradle undeploy -Pexcludes=classes/Class1.cls</strong></h5>
```bash
    > gradle undeploy
    :undeploy
    ___________________________________________
            Username: juan.perez@mail.com
            Login type: login
    ___________________________________________

   Starting undeploy...
   [==================================================]   100%
   All components truncated were successfully uploaded


   [==================================================]   100%
   The files were successfully deleted


    BUILD SUCCESSFUL
```

<h5> Output of:  <strong> gradle undeploy -Pexcludes=classes/\*\*</strong></h5>
```bash
    > gradle undeploy
    :undeploy
    ___________________________________________
            Username: juan.perez@mail.com
            Login type: login
    ___________________________________________

    Starting undeploy...
    [==================================================]   100%
    All components truncated were successfully uploaded


    [==================================================]   100%
    The files were successfully deleted


    BUILD SUCCESSFUL
```