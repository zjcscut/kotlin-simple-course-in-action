# 人生苦短，我用Kotlin

## 前言
本文主要参考下面的资料：
- 《Kotlin极简教程》
- Kotlin官方文档
- 《Kotlin实战》

在前段时间项目比较忙的时候，发现了几个比较小但是繁琐的问题，一个是java的NPE先验问题(见下面的代码)。
```java
//返回不确定是否存在的一个person的名字
Person person = ...
return null != person ? person.getName() : null;
```
有很多时候，为了避免NPE，要写很多冗长的三元表达式，这并不是一个优雅的做法。另一个问题就是java里面的lambda表达式以及JavaBean的写法不够简洁，最明显的就是一个JavaBean总是挂着一大堆属性的setter和getter方法，虽然
后来`lombok`的出现缓解了这个问题，但是又要在每个JavaBean打上lombok的注解。我是JetBrains的忠实粉丝，经常上去JetBrains官网看下IDEA有没有更新。后来留意到JetBrains团队开发了一门编程语言Kotlin。起初Kotlin以便于
安卓开发而出名，后来了解到其实它充分借鉴汲取了Java、Scala、Groovy、C#、Gosu、JavaScript、Swift等多门杰出语言的优秀特性，可以编译成Java字节码运行在JVM平台和Android平台，也可以编译成JavaScript运行在浏览器
环境，而且还可以直接编译成机器码的系统级程序，直接运行在嵌入式、iOS、MacOS/Linux/Windows等没有JVM环境的平台。更重要的是，SpringBoot-2.0对Kotlin提供了支持，也就是可以完美使用Spring的生态圈的组件，于是我入坑了。
下面引一段《Kotlin极简教程》序言里面的一段Kotlin代码：
```kotlin
package com.easy.kotlin

fun isOdd(value: Int) = value % 2 != 0

fun length(value: String) = value.length

fun <X, Y, Z> compose(f: (Y) -> Z, g: (X) -> Y): (X) -> Z {
    return { p -> f(g(p)) }
}

fun main(array: Array<String>){
    val oddLength = compose(::isOdd,:: length)
    val strings = listOf("a","ab","abc")
    println(strings.filter(oddLength))
}
```
这段代码的功能很简单，就是**从一个字符串List里面过滤出长度为奇数的字符串并且打印出来**，如果要用java实现完全相同的语义，代码大致如下：
```java
import java.util.ArrayList;
import java.util.List;

interface G<A, B> {
   B apply(A a);
}
interface F<B, C> {
   C apply(B b);
}
interface FG<A, B, C> {
   C apply(A a);
}
public class ComposeFunInJava<A, B, C> {

public static void main(String[] args) {
  G<String, Integer> g = (s) -> s.length();
  F<Integer, Boolean> f = (x) -> x % 2 != 0;
  FG<String, Integer, Boolean> fg = (x) -> f.apply(g.apply(x));
  List<String> strings = new ArrayList();
  strings.add("a");
  strings.add("ab");
  strings.add("abc");
  List<String> result = new ArrayList();
  for (String s : strings) {
     if (fg.apply(s)) {
      result.add(s);
     }
  }
  System.out.println(result);
}
}
```

