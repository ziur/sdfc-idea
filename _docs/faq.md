---
layout: gradle
title: FAQ
permalink: /docs/faq/
---


### How can I use my credentials?

To use several credentials you should use 'credentialId' parameter for any task for more information see <a href="/sdfc-idea/docs/auth/" target="_blank">authentications</a>

    $ gradle <TASK NAME> -PcredentialId=<CREDENTIAL ID>

With the last command line you are able to deploy your code to differents accounts if you want.

    $ gradle <TASK NAME ONE> -PcredentialId=<CREDENTIAL ONE>
    $ gradle <TASK NAME TWO> -PcredentialId=<CREDENTIAL TWO>

### How can I upload my local code to my organization without a class called 'Class1.cls'?

To upload your code you should execute Upload task using excludes parameter as:

    $ gradle upload -Pexcludes=**/Class1.cls -PcredentialId=myId

This command line is using a wildcard, also it supports folders name and files name. This parameter is available to all task less to Retrieve task. Others uses:

To exclude classes:

    $ gradle upload -Pexcludes=classes,triggers -PcredentialId=myId

To exclude Account.object file:

    $ gradle upload -Pexcludes=objects/Account.object -PcredentialId=myId

Also you should use Deploy task for more information see <a href="/sdfc-idea/docs/deployment/" target="_blank">deployment tasks</a>