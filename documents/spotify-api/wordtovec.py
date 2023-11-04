############################################
# 텍스트로 부터  word2vec 모델 만드는 코드
############################################

from gensim.models import Word2Vec

# Replace 'movie_descriptions.txt' with the path to your dataset of movie descriptions
with open('movie_descriptions.txt', 'r') as file:
    movie_descriptions = file.read().splitlines()

# Tokenize and preprocess the movie descriptions
movie_descriptions = [description.lower().split() for description in movie_descriptions]

# Train a Word2Vec model
model = Word2Vec(sentences=movie_descriptions, vector_size=100, window=5, min_count=1, sg=0)

# Save the trained model to a file
model.save("movie_descriptions_word2vec.model")


#############################################
# 텍스트로 부터  wordtovec 모델 만드는 코드 + 이미 학습된 모델을 활용
#############################################

from gensim.models import Word2Vec
import gensim.downloader as api

# Load a pre-trained Word2Vec model (for initialization)
word2vec_model = api.load("word2vec-google-news-300")

# Replace 'movie_descriptions.txt' with the path to your dataset of movie descriptions
with open('movie_descriptions.txt', 'r') as file:
    movie_descriptions = file.read().splitlines()

# Tokenize the movie descriptions
movie_descriptions = [description.lower().split() for description in movie_descriptions]

# Train a Word2Vec model
model = Word2Vec(sentences=movie_descriptions, vector_size=100, window=5, min_count=1, sg=0)

# Save the trained model to a file
model.save("movie_descriptions_word2vec.model")
