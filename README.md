Master: [![Build Status](https://travis-ci.com/AutonomousCarProject/auto_racer.svg?branch=master)](https://travis-ci.com/AutonomousCarProject/auto_racer)

### How to set up Run Configs (Intellij IDEA)
* Add new Gradle config
    * Target the auto_racer gradle project
    * Paste `clean build` into tasks (if `build` doesnt work for you try `jar`)
* Java Application config
    * Main class: `autoracer.yourclient.YourMainClass`
    * Classpath of module: `org.avphs.yourclient.main`
    * Under VM options, paste this line:
        * `--module-path mods -m org.avphs.yourclient/org.avphs.yourclient.YourMainClass`
    * Included clients are `carclient` and `traksim`
    
### Module System
* Extend `CarModule` and implement its method to crete a new runnable module
* List your modules dependencies in the `getDependencies()` method
    * example: 
    
            @Override
             public Class[] getDependencies() {
                 return new Class[] {
                     ImageModule.class
                 };
             }
 * Your module will be given its dependencies in `init()`
 * `Run()` will be called once per frame
 * Submit this frames `CarCommands` to the Core by returning them from `commands()`
 
 ### Core
 *
 
 ### Clients
 * 
 
 ## Contributing
 * Create a feature branch off of master
 * When ready, make a pull request to merge/rebase your branch into master
 * If you branch passes CI tests and gets approved by one reviewer it can be merged
 
 # About
 
 This project was created and is maintained by a group of highschool students in Portland, Oregon.
 
 __Bugs and requests__: submit them through the project's issues tracker.<br>
 
 [![Issues](http://img.shields.io/github/issues/AutonomousCarProject/auto_racer.svg?logo=github)]( https://github.com/AutonomousCarProject/auto_racer/issues )
 
 __Questions__: ask them at StackOverflow with the tag *REPO*.<br>
 
 [![StackOverflow](http://img.shields.io/badge/stackoverflow-AVP_HS-blue.svg?logo=stackoverflow)]( http://stackoverflow.com/questions/tagged/AVP_HS )
 
 **Website**: [AVP_HS](http://www.avp-hs.org) 
 
 [![Website](https://img.shields.io/badge/website-up-magenta.svg?longCache=true&style=flat)](http://www.avp-hs.org)
 
 # CI
 
 [Travis](https://travis-ci.org).
 
 # License
 [![Apache license](http://img.shields.io/badge/license-Apache-brightgreen.svg)](http://opensource.org/licenses/Apache-2.0)

 