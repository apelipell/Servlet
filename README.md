# Servlet

Statisfy is an Android application showing Spotify statistics (almost). Super cool!

The application is made for spotify users to be able to get their own top artist, songs and genres that has been played during long, medium or short term periods. The application is however only in making, the first version is only a test using placeholders taken from premade users.
This is the servlet that will connect the application to the information currently provided via the database statistics.db. In a future version this will be replaced by the actual Spotify API.

## For developers

This application is created in Java and are made to provide information to the Android application which you can find here: https://github.com/10773n/Spotifystatistics

Currently it uses a database with information about two users, apelipell and 10773n, but the idea is to replace this with the API provided by Spotify for up to date information. 

The json is constructed after the formula:
  
 Songs:
 
    "song_rank": "",
    
    "song_artist": "",
    
    "song_name": "",
    
    "song_picture": ""

 Artist:
 
    "artist_name": "",
    
    "artist_picture": "",
    
    "artist_rank": ""
  

The servlet uses Winstone Servlet Engine v0.9.10 which is provided. To run the servlet you can use the commando: 

    java -jar winstone.jar --webroot=www
  
There's also a script provided for compilation and to run the program:

    ./build.sh
