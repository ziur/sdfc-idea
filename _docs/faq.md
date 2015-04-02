---
layout: gradle
title: FAQ
permalink: /docs/faq/
---


### How can I use my credentials?

To use several credentials you should use 'credentialId' parameter for any task for more information see <a href="/docs/auth/" target="_blank">authentications</a>

    $ gradle <TASK NAME> -PcredentialId=<CREDENTIAL ID>

With the last command line you are able to deploy your code to differents accounts if you want.

    $ gradle <TASK NAME ONE> -PcredentialId=<CREDENTIAL ONE>
    $ gradle <TASK NAME TWO> -PcredentialId=<CREDENTIAL TWO>





