# Spring boot and GraalVM
### Install GraalVM (macOS M1)

- Follow this instruction [Installation on Linux ARM64 systems
  ](https://www.graalvm.org/docs/getting-started/linux-aarch64/).
- Download the Java 17 GraalVM from [here](https://github.com/graalvm/graalvm-ce-builds/releases)
- macOS: 

[HomeBrew graalvm](https://github.com/graalvm/homebrew-tap)
```
brew search graalvm
brew install --cask graalvm/tap/graalvm-ce-java17`
```

### Setup JAVA_HOME
```shell
export JAVA_HOME=/Library/Java/JavaVirtualMachine/graalvm-ce-java17-21.3.0/Contents/Home/
```

### exec command
```
xattr -r -d com.apple.quarantine "/Library/Java/JavaVirtualMachines/graalvm-ce-java17-21.3.0"
```

### Build by Maven
When you run this command ``mvn --version``, the version of Java has to be exactly what is set for JAVA_HOME.  
Run this command to build a **native java**
```shell
mvn clean -U package -P native -DskipTests=true 
```


### Run by Native!
Go to the `target` folder and run this command
```shell
./springboot-graalvm 
```

