---
layout: docs
title: Retrieve code
permalink: /docs/retrieve/
---
## Retrieve group has the next task:
## 6.1 Task retrieve
### 6.1.1 gradle retrieve -Pfiles=...
#### This task retrieve the files that we want retrieve, that means that we can recover a file o many specific files from the organization
#### This task must have the parameter "files" following the next format
        gradle retrieve -Pfiles=(files to recover)
#### the files to recover has to follow the a format
* first: the folder which content the file such us classes,triggers,etc.
* second: the name of the file. see the example
        gradle retrieve -Pfiles=classes/Class1.cls,triggers/trigger1.trigger
#### we can add many files as we want
#### So let's execute the command: gradle retrieve -Pfiles=classes/Class1.cls,triggers/trigger1.trigger
<h5> Output of:  <strong> gradle retrieve -Pfiles=classes/Class1.cls,triggers/trigger1.trigger </strong></h5>

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
#### If some file has not been founded console will show WARNINGS MESSAGES, for example we can change the name Class1.cls to class1.cls (lowercase).
#### the result will be like this:
<h5> Output of:  <strong> gradle retrieve -Pfiles=classes/class1.cls </strong></h5>

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
### 6.1.2 Retrieve files without package xml file
#### This task retrieves all the content into 'src' directory if there isn't a package xml file
#### If there are files into 'src' directory they are overwrite.
#### by default the folders selected are:
* objects
* staticresources
* classes
* pages
* triggers
* components
#### we can set those values for ONLY THE FOLDERS that we want to retrieve.
#### The only thing that we have to do is:

* change in the build.gradle file, the line with the next content
```text
        //foldersToDownload = "classes,pages"
```
  currently it is commented, quit the comment and leave only
```text
        foldersToDownload = "classes,pages"
```
  this means that folders which will be retrieved are classes and pages, yo can add folders as you want to recover them
```text
        foldersToDownload = classes,triggers,pages...
```
#### So let's execute the command: gradle retrieve
<h5> Output of:  <strong> gradle retrieve </strong></h5>

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

#### Once that task is executed successfully all the files are copied inside the source folder replacing the existing files.
#### If we want recover only the files retrieved we can find them on build folder as a zip file with the name zipRecovered.zip