# BSidesSF 2015 
**Introduction to Reverse Engineering Android Applications**

Download: 

  1. CrackME! Android application
  2. ARM Translation for Genymotion

  git clone 
  git clone 

Building the Environment
------------------------

*The environment will be targeting NIX operating systems*

1. Download and install Genymotion -> https://www.genymotion.com
2. If you don't already have VirtualBox you will need to also download and install -> https://www.virtualbox.org
3. Create a new virtual device -> Add -> Samsung Galaxy S4 - 4.3 - API 18
4. Power on virtual device
5. Download ARM Translation support -> https://github.com/VerSprite/BSidesSF-2015/blob/master/Genymotion-ARM-Translation_v1.1.zip
6. Drag-and-drop ZIP into booted virtual device - *This will require you to restart the virtual device*
7. Download CrackME! Android application
8. Install CrackME! application -> adb install /path/to/apk
9. Download and install apktool, dex2jar, androguard, jd-gui
10. http://ibotpeaches.github.io/Apktool/ - https://code.google.com/p/dex2jar/ - https://github.com/androguard/androguard - http://jd.benow.ca/
