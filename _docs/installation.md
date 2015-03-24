---
layout: docs
title: Installation
permalink: /docs/installation/
---


### Requirements
 * [Java JDK or JRE, version 7 or higher](http://java.com/en/)
 * [Gradle version 2.0 or higher](https://gradle.org/docs/current/userguide/installation.html)
 * Internet access ([configure Gradle if you are using a Proxy](https://gradle.org/docs/current/userguide/build_environment.html))
 * Valid user account in a Salesforce Organization and the related [Security Token](https://help.salesforce.com/apex/HTViewHelpDoc?id=user_security_token.htm)

## Create a build.gradle file for your project
Iterum is a Gradle plugin, so it is required to have build.gradle file where is defined the dependency to the Iterum plugin, and makes possible to start using Iterum features. Below you can find an example for a basic build.gradle file:

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

## Just a file, where is the program?
Gradle provides a dependency mechanism which allows download Gradle plugins and its dependencies from a Maven Repository, the first time that a tasks from the build.gradle is executed, Gradle will automatically download the Iterum plugin and its dependecies, which will be stored in a cache in your machine, this mechanism avoids to download several times the same files.

You can try executing the next command:

{% highlight bash %}
   $ gradle tasks
{% endhighlight %}


## Setup Salesforce organization credentials
Iterum requires access to a Salesforce Organization, so you need to provide the credentials and [Security Token](https://help.salesforce.com/apex/HTViewHelpDoc?id=user_security_token.htm) for an user with System Administrator rights.

Iterum provides a task for create credentials, which are stored on your home folder and can be encrypted also.

{% highlight bash %}
   $ gradle addCredentials
{% endhighlight %}

The task will ask for the credential values to be introduced, the _Id_ represents the key that is used to identify the credential, in this way it is possible to store credentials for several organizations but you need to keep in mind that the _Id_ must be unique. You can find [here](/docs/credentials/) more information about Credential Management.


## Integrate your Salesforce project with Iterum
The easy way to integrate Iterum with your Salesforce project source code is making the build.gradle file part of your source code, that means move the build.gradle file to your project folder. 
Now, you can configure on Iterum the path of your project code, open your build.gradle file and add the next lines at the end: 

{% highlight groovy %}

  force {
    src = 'src'
  }
{% endhighlight %}

In this case we are assuming the next folder structure for your project:
{% highlight text %}
MySalesforceProject
|- source
   |- classes
   |- pages
   |- package.xml
|- build.gradle
  
{% endhighlight %}

In this case, the _src_ property is pointing to the _source_ folder, which contains the Salesforce project. 

<div class="note info">
  <p>Remember that a Salesforce project is the one that contains at least a _package.xml_, and valid Salesforce folders like: classes, objects, etc.</p>
</div>


By default, the _src_ property points to the build.gradle folder.

You can list the available tasks provided by Iterum executing:
{% highlight bash %}
   $ gradle tasks
{% endhighlight %}

Now you have a basic Gradle project (build.gradle) and you can start using all the features!