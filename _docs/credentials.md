---
layout: docs
title: Credentials management
permalink: /docs/credentials/
---
## 1.1.1 Add credential by console
* You are able to add a credentials encrypted and credentials decrypted.
* If you want to add a credential encrypted you should put option yes in Encrypt credential
<h5> Output of:  <strong> gradle addCredential </strong></h5>

```bash
:addCredential
        Press enter to add a credential!!
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

## 1.1.2 Add credential by parameters
 * When you add credential by parameters it is encrypted.
 * If you want to add credential by parameters you should use the next parameters:
* -Pid is id of credential
* -Pusername is your account
* -Ppassword is your password
* -Ptoken is your token
<h5> Output of:  <strong> gradle addCredential -Pid=myidLZ -Pusername=juana@gmail.com -Ppassword=123456 -Ptoken=as:addCredential </strong></h5>

```bash
:addCredential

BUILD SUCCESSFUL
```

## 1.1.3 Update credential by console
* You are be able to update a credential you should put id credential to update.
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

BUILD SUCCESSFUL
```

## 1.1.4 Update credential by parameters
 * If you want to update credential by parameters you should use the next parameters:
* -Pid is id of credential
* -Pusername is your account
* -Ppassword is your password
* -Ptoken is your token
<h5> Output of:  <strong> gradle updateCredential -Pid=myId -Pusername=user@organization.com -Ppassword=myPassword -Ptoken=myToken </strong></h5>

```bash
:updateCredential

BUILD SUCCESSFUL
```

> **Note:** These credentials are added and updated in *credentials.dat* file that is located in user HOME directory.