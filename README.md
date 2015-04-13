# BSidesSF 2015 
Introduction to Reverse Engineering Android Applications
--------------------------------------------------------

**Pre-Requirements**: 

  - Be comfortable with using ADB (pushing, pulling, installing)
  - Have your environment setup, configured and working (Android SDK, Genymotion, Tools)

**Download:** 

  1. CrackME! Android application -> https://github.com/VerSprite/BSidesSF-2015/tree/master/app/crackme.apk
  2. ARM Translation for Genymotion -> https://github.com/VerSprite/BSidesSF-2015/blob/master/Genymotion-ARM-Translation_v1.1.zip

Building the Environment
------------------------

*The environment will be targeting NIX operating systems*

*Download and install Java if you don't already have it*

1. Download and install AndroidStudio or the standlone Android SDK
2. Download and install Genymotion -> https://www.genymotion.com
3. If you don't already have VirtualBox you will need to also download and install -> https://www.virtualbox.org
4. Create a new virtual device -> Add -> Samsung Galaxy S4 - 4.3 - API 18
5. Point Genymotion to the Android SDK -> Settings -> ADB -> 'Use custom Andorid SDK tools' -> Android SDK
6. Power on virtual device
7. Download ARM Translation support
8. Drag-and-drop ZIP into booted virtual device - *This will require you to restart the virtual device*
9. Download CrackME! Android application - https://github.com/VerSprite/BSidesSF-2015/tree/master/app/crackme.apk
10. Install CrackME! application -> adb install app-release.apk
11. Download and install apktool, dex2jar, androguard, jd-gui
12. http://ibotpeaches.github.io/Apktool/ - https://code.google.com/p/dex2jar/ - https://github.com/androguard/androguard - http://jd.benow.ca/
