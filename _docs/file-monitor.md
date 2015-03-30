---
layout: docs
title: Monitoring local changes
permalink: /docs/watch/
---
## 4.1.1 File monitor tasks
***Task status*** let's user see what files has been changed as (new file, deleted file and updated file).

	gradle status

***Task reset*** let's user restarted the file monitor.

	gradle reset

## 4.1.2 Status task
### Changed file
Task status shows files which have been added, modified or deleted. In the point above the file Force_com.app was modified but not updated to the Organization so the status of that file still on Changed file.

<h5> Output of:  <strong>gradle status</strong></h5>

```bash
    *********************************************
                  Status Files Changed
    *********************************************
    Force_com.app - Changed file
    *********************************************

    BUILD SUCCESSFUL
```

### Added, changed and deleted files
We have the same results if we deleted a file or we created a file, just the status of each file is different.

<h5> Output of:  <strong>gradle status</strong></h5>

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

### No change on the files
If there isn't file modified the result should be like this:

<h5> Output of:  <strong>gradle status</strong></h5>

```bash
    > gradle status
    :status

    BUILD SUCCESSFUL
```

## 4.1.5 Reset task
File monitor tracker will be reset.
<h5> Output of:  <strong>gradle reset</strong></h5>
```bash
   :reset

    BUILD SUCCESSFUL
```
