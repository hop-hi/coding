#############################################
# 영화 검색 코드
#############################################

import requests

# Replace 'YOUR_API_KEY' with your TMDb API key
api_key = 'YOUR_API_KEY'

# Movie title you want to search for
movie_title = 'The Shawshank Redemption'

# Construct the API URL
base_url = 'https://api.themoviedb.org/3/search/movie'
params = {
    'api_key': api_key,
    'query': movie_title,
}

response = requests.get(base_url, params=params)

if response.status_code == 200:
    data = response.json()
    if data['results']:
        # Extract the movie description from the first search result
        movie_description = data['results'][0]['overview']
        print("Movie Description:", movie_description)
    else:
        print("No results found for the given movie title.")
else:
    print("Failed to retrieve data. Status code:", response.status_code)
