---
layout: docs
title: Authentication
permalink: /docs/auth/
---
# Authentication to run tasks:
## 2.1.1 Authentication using credential by default
 You need to authenticate to run tasks using a Sales force account, so you are be able to run task with default credential when you don't write your credential. To do this You should add a new credential with *default* id.

For example when you run the next task you are using a default credential,  You don't need write *'credentialId'* parameter.
<h5> Output of:  <strong> gradle deploy </strong></h5>

```bash
    :deploy
    ___________________________________________
    __________________________________________
            Username: juan.perez@jalasoft.com
            Login type: login
    ___________________________________________


    Starting deploy...
    [==================================================]   100%
    The files were successfully deployed

    BUILD SUCCESSFUL
```

## 2.2.1 Authentication using a specific credential
You need to authenticate to run tasks using a Sales force account, so you are be able to run task using its id of credential, in this case I have a credential in *'credentials.dat'* file with an id called *'myId'*.

For example when you run the next task you are using a credential: *myId*
<h5> Output of:  <strong> gradle deploy -PcredentialId=myId </strong></h5>

```bash
    :deploy
    ___________________________________________
    __________________________________________
            Username: juan.perez@jalasoft.com
            Login type: login
    ___________________________________________


    Starting deploy...
    [==================================================]   100%
    The files were successfully deployed

    BUILD SUCCESSFUL
```
## 2.3.1 Authentication using parameters
You need to authenticate to run tasks using a Sales force account, so you are be able to run task using parameters of credential, to do this you should send the next parameter: *username, password and token*.

For example when you run the next task you are using parameters of credential.

<h5> Output of:  <strong> gradle deploy -Pusername=juan.perez@jalasoft.com -Ppassword=123qweJuan -Ptoken=qweyh65fd43789sw </strong></h5>

```bash
    :deploy
    ___________________________________________
    __________________________________________
            Username: juan.perez@jalasoft.com
            Login type: login
    ___________________________________________


    Starting deploy...
    [==================================================]   100%
    The files were successfully deployed

    BUILD SUCCESSFUL
```