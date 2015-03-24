---
layout: docs
title: Deployment tasks
permalink: /docs/deployment/
---
## Deployment group has the next task:
#### All code will be deployed to organization using a smart deploy that mean when execute the task deploy 
#### the first process is truncate the next elements:    
<ul>
    <li> Classes</li>
    <li> Objects</li>
    <li> Triggers</li>
    <li> Components</li>
    <li> Pages</li>
    <li> WorkFlows</li>
</ul>
#### the second process is deploy code truncate in organization and the last process is deploy all code in organization 

## 3.1.1 Execute task deploy
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

## 3.1.2 Task deploy using folder parameter
#### When the task deploy execute can decide which folder are required
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

#### Can be disabled to truncate file using the next values:
    
<ul>
    <li> deprecate .- if select this value then comment all notation "deprecate" in classes</li>
    <li> sourceCode.- if select this value then process truncate files is deactivated</li>    
</ul>

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

## 3.1.4 Task deploy using exclude parameter

#### This parameter can exclude files by:

<ul>
    <li> folder .- if you want to exclude folder or folders, You should write the parameter -Pexcludes=classes or -Pexcludes=classes,objects</li>
    <li> name file.- if you want to exclude a file or files, You should write the parameter -Pexcludes=classes/Class1.cls or -Pexcludes=classes/Class1.cls, classes/Class2.cls</li>
    <li> wildcard.- if you want to exclude using wildcard, You should write the parameter -Pexcludes=classes/*</li>
</ul>

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
#### User can upload all source code to organization
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

## 3.2.2 Executing task upload using folder's parameter
#### User can upload source code of folders
<h5> Output of:  <strong>gradle upload -Pfolders=classes,triggers</strong></h5>
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

## 3.2.3 Executing task upload using file's parameter
#### User can upload source code by files
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

## 3.2.4 Executing task upload with parameters files and folders
#### User can upload source code by files and folders
<h5> Output of:  <strong>gradle upload -Pfiles=classes/class1.cls,triggers/trigger1.trigger -Pfolders=objects,pages</strong></h5>
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
> **Note:** It doesn't matter the order of parameters

## 3.2.5 Executing task upload with exclude parameter
#### This parameter can exclude files by:

<ul>
    <li> folder .- if you want to exclude folder, You should write the parameter -Pexcludes=classes</li>
    <li> name file.- if you want to exclude a file, You should write the parameter -Pexcludes=classes/Class1.cls</li>
    <li> wildcard.- if you want to exclude using wildcard, You should write the parameter -Pexcludes=classes/*</li>
</ul>
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

<h5> Output of:  <strong> gradle upload -Pexcludes=classes/*</strong></h5>
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

</br>
#### Task update let's user updates the code according file tracker
</br>

## 3.3.1 Executing task update
#### User can update all files that are listed on file tracker like file changed, deleted or new one
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

## 3.3.2 Executing task update using folder's parameter
#### User can update files that are within the folder user wants and listed on file tracker like file changed, deleted or new one
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

## 3.3.3 Executing task update using exclude parameter
#### This parameter can exclude files by:

<ul>
    <li> folder .- if you want to exclude folder, You should write the parameter -Pexcludes=classes</li>
    <li> name file.- if you want to exclude a file, You should write the parameter -Pexcludes=classes/Class1.cls</li>
    <li> wildcard.- if you want to exclude using wildcard, You should write the parameter -Pexcludes=classes/*</li>
</ul>
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
     Class2.cls - Changed file
     *********************************************
     Starting deploy...
     [==================================================]   100%
     The files were successfully deployed


     BUILD SUCCESSFUL
```

<h5> Output of:  <strong> gradle update -Pexcludes=classes/Class1.cls</strong></h5>
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
   Starting deploy...
   [==================================================]   100%
   The files were successfully deployed


    BUILD SUCCESSFUL
```

<h5> Output of:  <strong> gradle update -Pexcludes=classes/*</strong></h5>
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
    Starting deploy...
    [==================================================]   100%
    The files were successfully deployed


    BUILD SUCCESSFUL
```
#### All code will be undeployed from the organization, truncating dependencies of next elements with its respective commands:
<ol>
    <li>
         <strong>Classes </strong>
        <ul>
            <li> classContent</li>
            <li> deprecate</li>
        </ul>
    </li>
    <li>
        <strong>Objects</strong>
        <ul>
            <li> fieldSet</li>
            <li> actionOverride</li>
            <li> formula</li>
            <li> webLink</li>
        </ul>    
    </li>
    <li>
        <strong>Triggers</strong>            
        <ul>
            <li> triggerContent</li>
        </ul>        
    </li>
    <li>
        <strong>Components</strong>            
        <ul>
            <li> componentContent</li>
        </ul>        
    </li>
    <li>
        <strong>Pages</strong>            
        <ul>
            <li> pageContent</li>
        </ul>        
    </li>
    <li>
        <strong>Tabs</strong>            
        <ul>
            <li> tabContent</li>
        </ul>        
    </li>
    <li>
        <strong>WorkFlows</strong>            
        <ul>
            <li> workflowContent</li>
        </ul>        
    </li>    
</ol> 

## 3.4.1 Execute the undeploy task using commands
#### When the undeploy task is executed, you can choose commands to execute 
#### using the command names array if it is empty all commands will be executed

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
#### To add a new global command you can use registerCommand method in the plugin extention "force",
#### it will be visible for all tasks that using the truncated process

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
####  To add a new command you can use command or commandFirst methods for each task 
#### where you want to add a new custom command

#### Adding a new anonymous command
```bash
undeploy {

    command('classes', { file-> 
        println file.path
    })
}

```

#### Adding a new custom command that will execute after than all commands on the classes
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
#### This parameter can exclude files by:

<ul>
    <li> folder .- if you want to exclude folder, You should write the parameter -Pexcludes=classes</li>
    <li> name file.- if you want to exclude a file, You should write the parameter -Pexcludes=classes/Class1.cls</li>
    <li> wildcard.- if you want to exclude using wildcard, You should write the parameter -Pexcludes=classes/*</li>
</ul>
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

<h5> Output of:  <strong> gradle undeploy -Pexcludes=classes/*</strong></h5>
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