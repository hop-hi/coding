##########################################################
# 영화와 음악의 유사도를 측정하는 코드
##########################################################

import gensim
from sklearn.metrics.pairwise import cosine_similarity

# Pre-trained Word2Vec model (download and load the model)
word2vec_model = gensim.models.KeyedVectors.load_word2vec_format('path/to/word2vec.bin', binary=True)

# Movie description
movie_description = "A gripping psychological thriller with unexpected twists."

# Music lyrics
music_lyrics = "I see a red door and I want it painted black."

# Tokenize and preprocess the text
movie_tokens = movie_description.lower().split()
lyrics_tokens = music_lyrics.lower().split()

# Convert text to vectors using Word2Vec
def text_to_vector(tokens, model):
    vector = []
    for token in tokens:
        if token in model:
            vector.append(model[token])
    return vector

movie_vector = text_to_vector(movie_tokens, word2vec_model)
lyrics_vector = text_to_vector(lyrics_tokens, word2vec_model)

# Calculate cosine similarity between the two vectors
if movie_vector and lyrics_vector:
    similarity_score = cosine_similarity([sum(movie_vector)], [sum(lyrics_vector)])
else:
    similarity_score = 0.0  # Default similarity if no words are in the Word2Vec model

print("Similarity Score:", similarity_score[0][0])
