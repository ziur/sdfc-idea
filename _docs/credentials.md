---
layout: docs
title: Credentials management
permalink: /docs/credentials/
---
## 1.1.1 Management credential profile

To deploy code into an organization you need a credential, for so you should create an account in SalesForce.

To management your credentials there are two files called credentials.dat located one in your project directory another one in user home directory where your credentials are saved as json format with the next fields:

***id*** is necessary to management your credential.
***username*** is a SalesForce account.
***password*** is your SalesForce password
***token*** is your SalesForce token
***sfdcType *** is a login type.
***type*** is define if your credential is encrypted or no.

### credentials.dat file
```json
{
 "default": {
        "username": "user@org.com",
        "password": "mypassword",
        "token": "2B9UvHKK2E1ky1EkkYBPFvbLM",
        "sfdcType" : "login",
        "type": "ecrypted"
    }
}
```

## 1.1.2 AddCredential task

This task adds a new credential into credentials.dat located in user home directory. There are two ways to add credentials one is by console another one is by parameters.

###  By console
You are able to add credentials encrypted and credentials decrypted. If you want to add a credential encrypted you should put option ***y*** in option: ***Encrypt credential(y/n, by default is encrypted):***

To add a new credential you should write the next command:

	gradle addCredential

### By parameters
When you add credential by parameters it is encrypted by default. To add a new credential by parameter you should use the next parameters:

	 -Pid is id of credential
	 -Pusername is your account
	 -Ppassword is your password
	 -Ptoken is your token

The command to add is:

	gradle addCredential -Pid=myidLZ -Pusername=juana@gmail.com
	                     -Ppassword=123456 -Ptoken=as:addCredential



## 1.1.2 UpdateCredential  task
This task update a credential from credentials.dat file located in user home directory.

### By console

To update a credential by console you should write  the next command and filling credentials fields.

	gradle updateCredential


### By parameters
If you want to update credential by parameters you should use the next parameters:

	 -Pid is id of credential.
	 -Pusername is your account.
	 -Ppassword is your password.
	 -Ptoken is your token.

This is a command:

	gradle updateCredential -Pid=myId -Pusername=user@organization.com
	                        -Ppassword=myPassword -Ptoken=myToken


## 1.1.3 Examples

### Add credential by console:

<h5> Output of:  <strong> gradle addCredential </strong></h5>

```bash
> Building 0% > :addCredential
Id:myId
UserName(example@email.com):john@email.com
Password:myPassword
Token:myToken
Login type (login/test/instance, by default login):login
Encrypt credential(y/n, by default is encrypted):y
:addCredential
	Credential was added successfully
BUILD SUCCESSFUL
```

### Add credential by parameters:

<h5> Output of:  <strong> gradle addCredential -Pid=myidLZ -Pusername=juana@gmail.com -Ppassword=123456 -Ptoken=as:addCredential </strong></h5>

```bash
:addCredential

BUILD SUCCESSFUL
```
### Update credential by console:

<h5> Output of:  <strong> gradle updateCredential </strong></h5>

```bash
:updateCredential
id:mine
UserName(example@email.com):david@email.com
Password:myPassword
Token:MyToken
Login type (login/test/instance, by default login):login
:updateCredential
Credential was updated successfully
BUILD SUCCESSFUL
```

### Update credential by parameters:

<h5> Output of:  <strong> gradle updateCredential -Pid=myId -Pusername=user@organization.com -Ppassword=myPassword -Ptoken=myToken </strong></h5>

```bash
:updateCredential

BUILD SUCCESSFUL
```

> **Note:** These credentials are added and updated in *credentials.dat* file that is located in user HOME directory.