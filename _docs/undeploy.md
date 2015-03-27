---
layout: docs
title: Undeploy
permalink: /docs/undeploy/
---
## 3.4.1 Undeploy task
#### **Objective**

This task is able to undeploy code from SalesForce organization. To avoid dependency problems It truncates code and it deploys code truncated as first step, after that It deploys code from local repository to SalesForce organization.

#### **Parameters**

This class only have a parameter called ***excludes*** it can be used in as task property or into your build script.

#### **Interceptors by default**

All code will be undeployed from SalesForce organization, truncating dependencies of next elements with its respective interceptors:
<ol>
    <li>
         <strong>Classes </strong>
        <ul>
            <li> truncateClasses</li>
            <li> removeDeprecateAnnotation</li>
        </ul>
    </li>
    <li>
        <strong>Objects</strong>
        <ul>
            <li> truncateFieldSets</li>
            <li> truncateActionOverrides</li>
            <li> truncateFormulas</li>
            <li> truncateWebLinks</li>
        </ul>
    </li>
    <li>
        <strong>Triggers</strong>
        <ul>
            <li> truncateTriggers</li>
        </ul>
    </li>
    <li>
        <strong>Components</strong>
        <ul>
            <li> truncateComponents</li>
        </ul>
    </li>
    <li>
        <strong>Pages</strong>
        <ul>
            <li> truncatePages</li>
        </ul>
    </li>
    <li>
        <strong>Tabs</strong>
        <ul>
            <li> truncateTabs</li>
        </ul>
    </li>
    <li>
        <strong>WorkFlows</strong>
        <ul>
            <li> truncateWorkflows</li>
        </ul>
    </li>
</ol>
> **Note:**
>  - You are able to create your custom interceptors using ***globalInterceptor*** or ***interceptor***.
> - To create your custom interceptors you can see examples in 3.4.2

## 3.4.2 Undeploy task using interceptors
When the undeploy task is executed all interceptors by default will be executed.



#### **Adding global interceptors**
 To add a new global interceptor you can use ***globalInterceptor*** method in the plugin extension "force", it will be visible for all tasks that using the truncated process

```bash

force {
    globalInterceptor('classes','printClassName', { class->
        println file.name
    })
}


undeploy {
    interceptors = ['printClassName']
}

update {
    interceptors = ['printClassName']
}

```

#### **Adding custom interceptor**
To add a new ***interceptor*** you can use interceptor or firstInterceptor methods for each task
where you want to add a new custom interceptor.

##### Adding a new anonymous interceptor
```bash
undeploy {
    interceptor('classes', { file ->
        println file.path
    })
}

```

##### Adding a new custom interceptor that will execute after than all interceptors on the classes
```bash
undeploy {
    interceptor('classes','doLast', { file ->
        println file.path
    })
}

```

##### Adding a new custom interceptor that will execute before than all interceptors on the objects
```bash
undeploy {
    firstInterceptor('objects', 'printFilePath', { file ->
        println file.name + " " + file.size()
    })
}

```

>**Note:** Those interceptors have to be into build.gradle file.

## 3.4.3 Undeploy task using excludes parameter
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

### **Examples:**
####  **Using excludes parameter:**
To exclude all classes.

	gradle undeploy -Pexcludes=classes
	gradle undeploy -Pexcludes=classes/**
	gradle undeploy -Pexcludes=classes/*.cls

To exclude all classes all objects and all triggers.

	gradle undeploy -Pexcludes=classes,objects,triggers

To exclude the Class1.cls

	gradle undeploy -Pexcludes=classes/Class1.cls

To exclude Class1.cls and Trigger1.cls

	gradle undeploy -Pexcludes=classes/Class1.cls,triggers/Trigger1.trigger

To exclude all files that contain Account word with any extension and any folders.

	gradle undeploy -Pexcludes=**\*Account*/**

To exclude all files with  **.cls** extension.

	gradle undeploy -Pexcludes=**/*.cls


####  **Using interceptors by default:**

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

