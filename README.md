# teavm-wasm-test

## local example

Erstellung WASM / WASI aus Java-Code. `targetType` ist entweder `WEBASSEMBLY_GC` oder `WEBASSEMBLY_WASI`. 

```
mvn package
```

Die WASM-Datei kann im Node-Beispiel referenziert werden und ausgeführt werden. Die WASI-Datei kann z.B. mit `wasmtimer` ausgeführt werden:

```
~/.wasmtime/bin/wasmtime run target/generated/wasm/teavm/ili2c.wasm
```

- Woher stammt bei mir wasmtime?
- Wenn die 0.13-Version released ist, probieren, ob es auch mit Gradle geht. Das Plugin fehlt m.E. für die dev-Version.
- https://teavm.org/docs/tooling/maven.html

## node example


## web example

```
jwebserver
```

```
npx http-server -p 8000 -c-1
```

## python example


## links


- https://github.com/konsoletyper/teavm-javac/blob/master/compiler/src/main/java/org/teavm/javac/Compiler.java
- https://www.reddit.com/r/java/comments/1lc3q98/i_made_a_java_to_webassembly_compile_in/
- https://hexed.it/



