---
layout: docs
title: Monitoring local changes
permalink: /docs/watch/
---
## File monitor group has the next task:
#### Task status let's user see what files has been changed

## 4.1.1 Changed file
#### Task status shows files which have been added, modified or deleted. In the point above the file Force_com.app was modified but not updated to the Organization so the status of that file still on Changed file.

<h5> Output of:  <strong>gradle status</strong></h5>

```bash                                                                              
    *********************************************
                  Status Files Changed              
    *********************************************
    Force_com.app - Changed file
    *********************************************
                           
    BUILD SUCCESSFUL
```

## 4.1.2 Added, changed and deleted files
#### We have the same results if we deleted a file or we created a file, just the status of each file is different
```bash
    > gradle status
    :status                                                                          
    *********************************************
                  Status Files Changed             
    *********************************************
    My-Layout.layout - New file
    TestClass.cls - Deleted file
    TestClass.cls-meta.xml - Deleted file
    *********************************************
                           
    BUILD SUCCESSFUL
```

## 4.1.3 No change on the files
#### If there isn't file modified the result should be like this
```bash
    > gradle status
    :status                                                                          
                   
    BUILD SUCCESSFUL
```

#### Task reset let's user restarted the file monitor

## 4.2.1 Executing task reset
#### File monitor tracker will be restarted
<h5> Output of:  <strong>gradle reset</strong></h5>
```bash
   :reset

    BUILD SUCCESSFUL
```