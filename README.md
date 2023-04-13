# NOAA Weather Analysis Application

### Introduction

  First and foremost, the main target of this project is **algorithm analysis**. This application has functionality built into it that allows a given user to choose a sorting algorithm along with parameters. Once set, the program will sort the data and return detailed information about how the algorithm performed.

  Secondly, this application functions as a historical weather data analysis tool. Once a user parses a NOAA weather file, the data will be displayed in a table (see bellow).
  <p align="center">
  <img src="https://user-images.githubusercontent.com/63986603/231632857-7a5afe31-3420-4eef-ac97-487e5d003904.png" />
</p>
<p align="center">
  <img src="https://user-images.githubusercontent.com/63986603/231632897-2be113d6-2716-4d75-8b97-856c5137af69.png" />
</p>

### Navigating the Project

- `Application Core`

  This is the "engine" of the application. All file parsing, database handling, and algorithm analysis happens within here.

- `Datatypes` 

  This package contains all the custom Objects for handling the interpretation of the data.

- `Development`

  This package is used for development of algorithms primarily. It also can be used to launch the application in the terminal instead of using the GUI.

- `GUI Pack`

  This package contains everything that pertains to the GUI.
  
### Build and Compile

For the release verison of the program, you will need Java JDK >= 17. To compile the project yourself, clone the repo, select a JDK >= 17, and set the main class to guipack.GUI.


<p align="center">
  <img src="https://user-images.githubusercontent.com/63986603/227383412-c24b4ecb-da21-4d97-a495-e580836d344f.png" />
</p>

*GPL-3.0-or-later*
