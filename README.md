# NOAA Weather Analysis Application

### Introduction

  First and foremost, the main target of this project is **algorithm analysis**. This application has functionality built into it that allows a given user to choose a sorting algorithm along with parameters. Once set, the program will sort the data and return detailed information about how the algorithm performed (for more information about the algorithms used, please see <u>algorithms</u>).

  Secondly, this application functions as a historical weather data analysis tool. Once a user parses a NOAA weather file, the data will be displayed in a table (see bellow).
  
  <p align="center">
  <img src="https://raw.githubusercontent.com/isiahzzzz/NOAAWeatherApp/master/screenshots/table.png?token=GHSAT0AAAAAAB6S3ZTGMXC3HCRH6TEMMKFQZA43BQA" />
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
  <img src="https://raw.githubusercontent.com/isiahzzzz/NOAAWeatherApp/master/icons/draft_nwa.png?token=GHSAT0AAAAAAB6S3ZTGBE4CKDIZPICRVYJ2ZA43B6Q" />
</p>


*GPL-3.0-or-later*
