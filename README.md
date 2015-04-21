# BSidesSF 2015

Introduction to Reverse Engineering Android Applications
--------------------------------------------------------

**Pre-Requirements**: 

  - Clone this repository to your local machine
  - Be comfortable using ADB to push, pull, and install files
  - Have your environment setup, configured and working (Android SDK, Genymotion, Tools). Some of the these tools only work in 32-bit mode; x86_64 users will need to have ia32 support.

Building the Environment
------------------------

*The environment will be targeting NIX operating systems*

*Download and install Java if you don't already have it*

1. Download and install [Android Studio](https://developer.android.com/sdk/index.html) or the standlone SDK
1. Download and install [VirtualBox](https://www.virtualbox.org)
1. Download and install [Genymotion](https://www.genymotion.com)
1. Download [ARM Translation](https://github.com/VerSprite/BSidesSF-2015/blob/master/Genymotion-ARM-Translation_v1.1.zip) support for Genymotion
1. In Genymotion, create a new virtual device: Add -> Samsung Galaxy S4 - 4.3 - API 18
1. Point Genymotion to the Android SDK: Settings -> ADB -> 'Use custom Android SDK tools' -> Android SDK
1. Power on virtual device
1. Drag-and-drop ZIP into booted virtual device - *This will require you to restart the virtual device*
1. Download [CrackME!](https://github.com/VerSprite/BSidesSF-2015/tree/master/app/crackme.apk) Android application
1. Install CrackME! application -> adb install app-release.apk
1. Download and install [apktool](https://ibotpeaches.github.io/Apktool/), [dex2jar](https://github.com/pxb1988/dex2jar), [androguard](https://github.com/androguard/androguard), [jd-gui](http://jd.benow.ca/)

If Genymotion's easy deployment for images and apps is not working, it is possible to manually install. Examine the terminal output and look for a line similar to ``OpenGL connected to 192.168.56.101:25000`` - this will tell you the IP of the device emulator. Then:

    $ adb kill-server
    $ adb connect 192.168.56.101
    $ adb shell mkdir /sdcard/Download
    $ adb push Genymotion-ARM-Translation_v1.1.zip /sdcard/download
    $ adb shell
    root@vbox86p:/ # /system/bin/flash-archive.sh /sdcard/Download/Genymotion-ARM-Translation_v1.1.zip
    root@vbox86p:/ # reboot
    $ adb connect 192.168.56.101
    $ adb install app/crackme.apk
