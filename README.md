# NOAA Weather Analysis Application

### Introduction

  First and foremost, the main target of this project is **algorithm analysis**. This application has functionality built into it that allows a given user to choose a sorting algorithm along with parameters. Once set, the program will sort the data and return detailed information about how the algorithm performed.

  Secondly, this application functions as a historical weather data analysis tool. Once a user parses a NOAA weather file, the data will be displayed in a table (see bellow).
  
  <p align="center">
  <img src="https://user-images.githubusercontent.com/63986603/227383377-b1d5f36d-ce56-45bc-aa1f-71b1c74ad24a.png" />
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


<p align="center">
  <img src="https://user-images.githubusercontent.com/63986603/227383412-c24b4ecb-da21-4d97-a495-e580836d344f.png" />
</p>

### Build and Compile

For the release verison of the program, you will need Java JDK >= 18.0.1. To compile the project yourself, clone the repo, select a JDK >= 18.0.1, and set the main class to guipack.GUI.

Update


*GPL-3.0-or-later*
