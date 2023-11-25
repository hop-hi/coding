################################################################
# librarys / Modules
################################################################
import requests


################################################################
# play_list_recommend_modeler 
# description : 영화정보 URL과  음악정보  URL 에서 정보를 수집하여, 4가지 모델을 생성하는 클래스
# input : 영화정보 URL, 음악정보 URL
# output : 감정유사도 모델들
# process : 추천 모델 호출시, 이미 수집한 영화 정보와 음악 정보의 텍스트를 비교하여, 
#           유사한 감정모델을 만들어 줌.
################################################################
class play_list_recommend_modeler:
    
    movie_url = ""
    movie_key = ""
    music_url = ""
    music_key = ""

    # 영화와 음악의 단어 유사도 점수 모델
    # 이 모델은 이미 학습된 word2vec 모델을 준비 해야 함.
    # {"movie" : "" , "music" : "" , "score" : "" }
    word_similarity_model = []

    # 영화와 음악의 감정 유사도 점수 모델
    # {"movie" : "" , "music" : "" , "score" : "" }
    sentiment_similarity_model = []
    
    # 영화의 감정 점수 모델
    # {"movie" : "" , "compound" : "" , "positive" : "" , "negative" : "" , "neutral" : "" }
    movie_sentiment_score_model = []

    # 음악의 감정 점수 모델
    # {"music" : "" , "compound" : "" , "positive" : "" , "negative" : "" , "neutral" : "" }
    music_sentiment_score_model = []
    
    # 생성자
    def __init__(self, movie_url, movie_key, music_url, music_key ):
        self.movie_key = movie_key
        self.movie_url = movie_url
        self.music_key = music_key
        self.music_url = music_url
    
    # 소멸자
    def __del__(self):    
        pass

    # 음악 추천
    def recommend(movie):
        pass
    
    # 학습 프로세스
    def get_word_similarity_model():
        pass

    # 학습 프로세스
    def get_sentiment_similarity_model():
        pass

    # 학습 프로세스
    def get_movie_sentiment_score_model():
        pass

    # 학습 프로세스
    def get_music_sentiment_score_model():
        pass


################################################################
# play_list_recommender 
# input : 영화제목, 나이, 국적, 성별
# output : [
    {"music","http://.... spotipy.../......"}
    {"music","http://.... spotipy.../......"}
    {"music","http://.... spotipy.../......"}
    .....
]
################################################################

class play_list_recommender:
    pass