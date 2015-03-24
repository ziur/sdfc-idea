---
title: "quickstart"
id: "quickstart"
bg: orange
color: black
fa-icon: toggle-on
---

## Setup a `gradle` script file

- Create `build.gradle` file on your source code project, below you have an example

{% highlight groovy linenos=table%}
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

- Register a Salesforce credential to be used
{% highlight bash linenos=table%}
   $ gradle addCredential -Pid=<identifier> -Puser=<USER NAME> 
                          -Ppassword=<PASSWORD> -Ptoken=<SECURITY TOKEN>
   #=> Creates an entry on the credentials store
{% endhighlight %}

- Start executing available commands, for example:
{% highlight bash linenos=table%}
   $ gradle retrieve -Pfiles=classes
   #=> Retrieves all the classes from a Salesforce organization
{% endhighlight %}

Now you can start using all the Iterum features reviwing the [Documentation](/docs/home).

