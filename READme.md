# Expanded Message System with Kotlin and Redis

This library intends to build additional functionality on the top of Redis and its publish-subscribe feature.
First of all, it provides users with a DSL to build uniformly formatted and organized messages which are
reasonably designed to contain important information. Then it will do things based on the consumption of
these messages, for example, the message receiver can automatically log a warning when the message is delivered
too late because a message carries related time information. Secondly, it makes all servers talking with the
same redis both subscribers and publishers by allocating one thread to work as the listener. And of course,
we can do many more things based on this as well. 

In general, you should not consider this library as a highly usable or even production-ready one, because the 
fact that the server needs to allocate one thread to do this blocking listening makes it unfit for servers
with a low number of cores, and it has no advantage over established softwares (kafka, rabbit mq); however, 
it does bring many interesting capabilities. And of course, as a side project, it serves the purpose of 
helping me explore topics like server-to-server communication, event driving etc.

## Features

* Uniformly formatted and organized messages with DSL to build them
* Persist message histories to files on disk
* Message-Event exclusiveness (only the first server get the message can trigger the related event)
* Group based message consumption
* Monitoring communication time (record averagely used time between the sending and receiving of messages)

## Author

* **Jiacheng Yang**

## Licence

This project is licensed under the MIT License