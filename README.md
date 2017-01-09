# Android Examples
This App is a "sandbox" app for playing around with some features of the Android platform. It's a work in progress and more features will be added periodically.

![Show an address on a map](http://www.coronite.net/assets/img/github/AndroidExamples.png)

## Android Features Implemented:
- [RecyclerView](https://developer.android.com/reference/android/support/v7/recyclerview/package-summary.html)
- [Implicit Intents (Show an address on a map)](https://developer.android.com/guide/components/intents-common.html#Maps)
- [Master-Detail UI](https://developer.android.com/training/implementing-navigation/descendant.html)

## Specifications
- `compileSdkVersion 25`
- `buildToolsVersion "25.0.1"`

## Dependencies
```
dependencies {
    compile fileTree(dir: 'libs', include: ['*.jar'])
    androidTestCompile('com.android.support.test.espresso:espresso-core:2.2.2', {
        exclude group: 'com.android.support', module: 'support-annotations'
    })
    compile 'com.android.support:appcompat-v7:25.1.0'
    compile 'com.android.support:support-v4:25.1.0'
    compile 'com.android.support:recyclerview-v7:25.1.0'
    compile 'com.android.support:design:25.1.0'
    testCompile 'junit:junit:4.12'
    compile 'com.google.android.gms:play-services-appindexing:8.4.0'
}
```


## Implementation

This sample uses the Gradle build system. To build this project, use the "gradlew build" command or use "Import Project" in Android Studio.

If you have any questions I'd be happy to try and help. Please contact me at: john@coronite.net.

# License
This is a public domain work under [CC0 1.0](https://creativecommons.org/publicdomain/zero/1.0/). Feel free to use it as you see fit.
