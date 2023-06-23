from flask import Flask, jsonify, request
import requests

app = Flask(__name__)
app.config['JSON_AS_ASCII'] = False
@app.route('/movie')
def search_movie():
   search = request.args.get('search', '')
   api_url = f'http://api.koreafilm.or.kr/openapi-data2/wisenut/search_api/search_json2.jsp?ServiceKey=6TM92DE2N8JUA38LAE38&collection=kmdb_new2&query={search}'
   # api_url = f'https://www.kmdb.or.kr/info/api/apiDetail/6?key=6TM92DE2N8JUA38LAE38&title={search}'
   response = requests.get(api_url)
   response.encoding = 'utf8'
   # print(response.text)
   result = response.json()
   
   movie_list = result['Data'][0]['Result']
   
   json = []
   
   for movie in movie_list:
       print('#####################')
       # 제작년도, 제목, 감독, 배우, 나라
       print('#####################')
       print(f'제작년도 : {movie["prodYear"]}')
       print(f'제목 : {movie["title"]}')
       print(f'감독 : {movie["directors"]["director"]}')
       print(f'배우 : {movie["actors"]["actor"]}')
       print(f'나라 : {movie["nation"]}')
       print('#####################')
       element = {}
       element['prodYear'] = movie["prodYear"]
       element['title'] = movie["title"]
       element['actors'] = movie["actors"]["actor"]
       element['directors'] = movie["directors"]["director"]
       element['nation'] = movie["nation"]
       json.append(element)
   
   
   return json

if __name__ == '__main__':
   app.run(host='0.0.0.0', port=8080)