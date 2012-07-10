Boilerplate-Android
===================

A template project for developing Android games with OpenAphid 

## Usage

- Import the project into your eclipse workspace

- - Open a terminal window, navigate to the project directory, and start the tiny web server for the "Developer Mode" of OpenAphid

```bash
./start_dev_server.sh
````

- Build and run the app on your Android device. NOTES: the current release only supports devicevices with ARMv7 CPUs. Please run the app on Android emulator v4.0+ configured with ARMv7 CPU if you don't have a suitable device.

- Edit game.bundle/main.js with the game logics and put graphic resources inside game.bundle

- Press the Back button to exit the app and re-open it to see any changes you made instantly. There is no need to reinstall the app.

## Copyright and License

```
Copyright 2012 Aphid Mobile

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at
 
   http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
````