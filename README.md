# CHANEL PROJECT
✍The project consists of improving his skills in writing specifications and implementing a design💪

#	Communication framework
**Exercise :** Individually, write down the specification for the following
communication framework, as seen in the lecture. 
In this case, the specification is what a developer needs to know in order to be
able to use this framework.
Also write a sample code that illustrate the basics: create a channel and send 
and receive something, like a string "Hello World" for example.
Once it is done, before the next lecture (21/09/2022),
do a git-add/git-commit, with the commit message "Channel Specification".

### Specification

 - Utiliser les octects pour le transfert des messages
 - Génération des éxceptions en cas de transfert sur un canal indisponible.
 - Transfert synchrone
 - Technologie utilisée JAVA et système d'exploitation tous confondus

### Conception

 - Deux objets Type Thread pour le transfert du message
 - un objet type Broker et un objet statique type Channel
 - éxecution synchrone
 - pas de parallélisme

#### Preuve de fonctionnement : [![sequence diagram communication framework](https://github.com/monthebrice2000/channel-project/blob/master/sequence-diagram-Communication-Framework%20.jpg)](https://github.com/monthebrice2000/channel-project/blob/master/sequence-diagram-Communication-Framework%20.jpg)

J'ai écrit un exemple du code qui se trouve dans le fichier [src/Main.java](https://github.com/monthebrice2000/channel-project/blob/master/src/Main.java)

Le commit 'Channel Specification' se trouve dans [Channel Specification](https://github.com/monthebrice2000/channel-project/commit/636a5516c4f7a2eefc12b188f45eb8be1dea6286)
