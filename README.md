# Android_Gradle_DSL_3.2
gradle android dsl 3.2 源码分析

# Gradle 源码所在路径
**MAC**
```java
/Users/用户名/.gradle/wrapper/dists
```
**Win**
```java
C:/Users/用户名/.gradle/wrapper/dists
```

`dists`目录下, 会记录本机所有已经下载好的版本.
比如我的:
```java
gradle-2.10-all   gradle-2.2.1-all  gradle-3.3-all    gradle-4.4-all    gradle-4.6-all
gradle-2.14.1-all gradle-2.4-all    gradle-4.1-all    gradle-4.4-bin
```
打开对应目录, 会有一个`16进制文件名`的路径, 继续打开, 知道找到 `gradle-4.6` 这样的文件夹. 打开, 里面的 `src` 目录, 就是对应的源码. 


# Android Build Gradle插件 源码所在路径
```
    classpath 'com.android.tools.build:gradle:3.2.1'
```
这样代码就是Android构建插件的核心.
```
只有使用的:
apply plugin: 'com.android.application'
apply plugin: 'com.android.library'
这2个插件, 都是基于上面那个实现的.
```

**MAC**
```java
/Users/用户/.gradle/caches/modules-2/files-2.1/com.android.tools.build
```
**Win**
```java
C:/Users/用户/.gradle/caches/modules-2/files-2.1/com.android.tools.build
```

