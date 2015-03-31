---
layout: gradle
title: Authentication
permalink: /docs/auth/
---
## Authentication to run tasks

#### **Objective**
To run deployment tasks you need login into your organization for so you have three options to authentication:
<ul>
	<li>Using a credential by default, for so you should add a credential with default id.</li>
	<li>Using an specific credential for so you should use credential id.</li>
	<li>Using parameters as username, password and token.</li>
</ul>

#### **Parameter**

To use a credential you should use parameter called ***credentialId*** and send your credential id to run a deployment task.

## Forms of authentication

### Using credential by default
You are able to run task with a credential by default when you don't write your credential. To do this You should have a credential with ***default*** id.

For example when you run the next task you are using a credential default,  You don't need write *'credentialId'* parameter.

	$ gradle deploy
	$ gradle undeploy

### Using a specific credential
You are able to run tasks using credential id, in this case I have a credential in *'credentials.dat'* file with an id called *'myId'*

	$ gradle deploy -PcredentialId=myId
	$ gradle undeploy -PcredentialId=myId

### Using parameters
You are able to run task using parameters of credential, to do this you should send the next parameter: *username, password and token*.

	$ gradle deploy -Pusername=juan.perez@jalasoft.com
					-Ppassword=123qweJuan
					-Ptoken=qweyh65fd43789sw

## Examples:

### Using a credential by default

command:

	$ gradle deploy

output:

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

### Using an specific credential

command:

	$ gradle deploy -PcredentialId=myId

output:

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

### Using parameters

command:

	$ gradle deploy -Pusername=juan.perez@jalasoft.com
					-Ppassword=123qweJuan
					-Ptoken=qweyh65fd43789sw

output:

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
