###############################################
# Spotify 에서 플레이 리스트 검색 하는 코드
###############################################

import spotipy
from spotipy.oauth2 import SpotifyClientCredentials

# Replace these with your own client ID and client secret
client_id = 'YOUR_CLIENT_ID'
client_secret = 'YOUR_CLIENT_SECRET'

# Initialize the Spotify client
sp = spotipy.Spotify(client_credentials_manager=SpotifyClientCredentials(client_id=client_id, client_secret=client_secret))

# Search for playlists
query = 'rock classics'  # Your search query
playlists = sp.search(q=query, type='playlist', limit=10)  # Adjust the limit as needed

# Print the playlist names and URLs
for playlist in playlists['playlists']['items']:
    playlist_name = playlist['name']
    playlist_url = playlist['external_urls']['spotify']
    print(f"Playlist Name: {playlist_name}")
    print(f"Playlist URL: {playlist_url}\n")
