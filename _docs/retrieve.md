---
layout: gradle
title: Retrieve code
permalink: /docs/retrieve/
---
## Retrieve group has the next task:
## Retrieve task

#### **Objective**
This task download files from your organization, based in your package xml, if there isn't this file, it downloads files by default:

* objects
* staticresources
* classes
* pages
* triggers
* components

If you don't have a package xml and you want to download only classes and triggers you should use the next task property into your build.gradle:

	foldersToDownload = "classes,triggers"

#### **Parameters**

This task have two parameters called ***files*** and ***destination*** , where the first parameter is used to download an specifics files it supports files and folders, another one is used to indicate destination of files that will download.

## Executing Retrieve task

### Without parameters

Once retrieve task is executed without parameters It uses package xml to retrieve files from your organization.

	$ gradle retrieve

### Without package xml file

Once retrieve task is executed and there isn't a package xml it retrieve files by default:

* objects
* staticresources
* classes
* pages
* triggers
* components

We can set those values for ONLY THE FOLDERS that we want to retrieve.
The only thing that we have to do is:

* change in the build.gradle file, the line with the next content
```text
        //foldersToDownload = "classes,pages"
```
 * currently it is commented, quit the comment and leave only
```text
        foldersToDownload = "classes,pages"
```
 * this means that folders which will be retrieved are classes and pages, yo can add folders as you want to recover them
```text
        foldersToDownload = classes,triggers,pages...
```

### Using files parameter
This task retrieve the files that we want retrieve, that means that we can recover a file o many specific files from the organization. This parameter support files and folders.

      $ gradle retrieve -Pfiles=classes/Class1.cls
      $ gradle retrieve -Pfiles=classes/Class1.cls,objects/Account.object
      $ gradle retrieve -Pfiles=objects
      $ gradle retrieve -Pfiles=objects,triggers

You can add many files or folders as we want.

### Using destination parameter

This task retrieve the files that we want retrieve and download in specific folder, that means that we can recover a file, folders o many specific files from the organization in specific folder.

    $ gradle retrieve -Pfiles=classes,objects -Pdestination=relative/path
    $ gradle retrieve -Pfiles=classes/Class.cls -Pdestination=absolute/path

When you use a destination parameter you are able to use relative or absolute path.


>***Notes:***
>Once that task is executed successfully all the files are copied inside the source folder replacing the existing files.
>If we want recover only the files retrieved we can find them on build folder as a zip file with the name zipRecovered.zip

##. Examples


### Without parameters
command:

	$ gradle retrieve

output:

```bash
    :retrieve
    ___________________________________________
            Username: juan.perez@mail.com
            Login type: login
    ___________________________________________

    Warning: your files will be replaced
    Do you want continue? (y/n):
    > Building 0% > :retrieve y
    Starting retrieve...
    Waiting for retrieve result...
    Retrieve result completed

    BUILD SUCCESSFUL
```

### Using files parameter

command:

	$ gradle retrieve -Pfiles=classes/Class1.cls,triggers/trigger1.trigger
output:

```bash
    :retrieve
    ___________________________________________
            Username: juan.perez@mail.com
            Login type: login
    ___________________________________________

    Starting retrieve...
    Waiting for retrieve result...
    Retrieve result completed

    BUILD SUCCESSFUL
```


### Using destination parameter

command:

	 $ gradle retrieve -Pfiles=pages,components,classes/Class1.cls,
	                   triggers/trigger1.trigger -Pdestination=relative/path

output:

```bash
    :retrieve
    ___________________________________________
            Username: juan.perez@mail.com
            Login type: login
    ___________________________________________

    Starting retrieve...
    Waiting for retrieve result...
    Retrieve result completed

	BUILD SUCCESSFUL
```

command:

	$ gradle retrieve -Pfiles=classes/class1.cls

output:

```bash
    :retrieve
    ___________________________________________
            Username: juan.perez@mail.com
            Login type: login
    ___________________________________________

    Starting retrieve...
    Waiting for retrieve result...
    Retrieve result completed
    WARNING: Entity of type 'ApexClass' named 'class1' cannot be found

    BUILD SUCCESSFUL
```

>***Note:***
> If some file has not been founded console will show WARNINGS MESSAGES, for example we can change the name Class1.cls to class1.cls (lowercase).