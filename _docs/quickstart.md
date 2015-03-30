---
layout: docs
title: Quick start
permalink: /docs/quickstart/
---

Here you can find the enought required information to have running a Gradle project with EnForce, if you are interested on develop new features or just compile and package the source code, you will have helpful information at [Development](/docs/development) page

1. Create build.gradle file on your source code project, below you have an example

{% highlight groovy %}
   buildscript {
       repositories {
           mavenLocal()
           mavenCentral()
       }
       dependencies {
           classpath 'com.jalasoft.sfdc.devtool:SFDC-Dev-Tool:1.0.0'
       }
   }
   
   apply plugin: 'force'
{% endhighlight %}

2. Register a Salesforce credential to be used
{% highlight bash %}
   $> gradle addCredential -Pid=<identifier> -Puser=<USER NAME> -Ppassword=<PASSWORD> -Ptoken=<SECURITY TOKEN>
{% endhighlight %}

3. Start executing available commands, for example, retrieve all the classes from the Salesforce Organization
{% highlight bash %}
   $> gradle retrieve -Pfiles=classes
{% endhighlight %}

Now you can start using all the EnForce features.