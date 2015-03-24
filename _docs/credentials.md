---
layout: docs
title: Credentials management
permalink: /docs/credentials/
---
## 1.1.1 Add credential by console
* You are able to add a credentials encrypted and credentials decrypted also
* If you want to add a credential encrypted you should put option yes in Encrypt credential
<h5> Output of:  <strong> gradle addCredential </strong></h5>

```bash
:addCredential
        Press enter to add a credential!!
> Building 0% > :addCredential
Id:newId
UserName(example@email.com):juan@gmail.com
Password:123qwe
Token:123qwe456rtyuyihh
Login type (login/test):login
Encrypt credential(y/n):y
        Credential was added successfully!!!!

BUILD SUCCESSFUL
```

## 1.1.2 Add credential by parameters
#### * When you add credential by parameters it is encrypted
#### * If you want to add credential by parameters you should use the next parameters:
* -Pid is id of credential
* -Pusername is your account
* -Ppassword is your password
* -Ptoken is your token
<h5> Output of:  <strong> gradle addCredential -Pid=myidLZ -Pusername=juana@gmail.com -Ppassword=123456 -Ptoken=as:addCredential </strong></h5>

```bash
:addCredential

BUILD SUCCESSFUL
```

## 1.2.1 Update credential by console
* You are be able to update a credential you should put id credential to update
<h5> Output of:  <strong> gradle updateCredential </strong></h5>

```bash
:updateCredential
        Press enter to update credential!!
> Building 0% > :updateCredential
Id credential to update:id
User typeName:ana@gmail.com
password: 123456
toke: qwe345ert123sdsf
login(dev/test):dev
        Id credential was updated successfully!!

BUILD SUCCESSFUL
```

## 1.2.2 Update credential by parameters
#### * If you want to update credential by parameters you should use the next parameters:
* -Pid is id of credential
* -Pusername is your account
* -Ppassword is your password
* -Ptoken is your token
<h5> Output of:  <strong> gradle updateCredential -Pid=myId -Pusername=user@organization.com -Ppassword=myPassword -Ptoken=myToken </strong></h5>

```bash
:updateCredential

BUILD SUCCESSFUL
```