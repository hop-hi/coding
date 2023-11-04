######################################################
# 음악과 영화의 감정적 유사도
######################################################

from textblob import TextBlob
from sklearn.metrics.pairwise import cosine_similarity

# Sample movie description and music lyrics
movie_description = "A heartwarming story of love and friendship."
music_lyrics = "I'm feeling so happy and alive today."

# Create TextBlob objects for sentiment analysis
movie_blob = TextBlob(movie_description)
music_blob = TextBlob(music_lyrics)

# Get sentiment polarity for movie and music
movie_sentiment_polarity = movie_blob.sentiment.polarity
music_sentiment_polarity = music_blob.sentiment.polarity

# Rescale sentiment polarity to the range [0, 1]
movie_sentiment_normalized = (movie_sentiment_polarity + 1) / 2
music_sentiment_normalized = (music_sentiment_polarity + 1) / 2

# Calculate similarity using cosine similarity
similarity_score = cosine_similarity([[movie_sentiment_normalized, music_sentiment_normalized]])[0][0]

print("Movie Sentiment Similarity:", similarity_score)
