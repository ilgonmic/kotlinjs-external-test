# kotlinjs-external-test

https://youtrack.jetbrains.com/issue/KT-31126

`gradlew clean build`

## Valid

### ES5 constructor

```
function X(arg) {
  X.call(this, arg)
}
```

### ES5 prototype inheritance

```
var X = $module$mymodule.X;
Y.prototype = Object.create(X.prototype);
Y.prototype.constructor = Y;
```

## Kotlin/JS compiler problem

If external class has primary constructor, everything is OK
But if hasn't, and has only usual contructor (or many), it produce invalid case

### Constructor

```
function X(arg) {
  X_init(arg, this) // not .call(this, ...)
}
```

### Prototype inheritance

```
var X_init = $module$mymodule.X;
X.prototype = Object.create(X.prototype); // X - undefined
X.prototype.constructor = X;
```
