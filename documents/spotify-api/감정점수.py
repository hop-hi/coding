##################################################
# 감정 점수를 추출 하는 코드
##################################################

import nltk
from nltk.sentiment.vader import SentimentIntensityAnalyzer

# Download the VADER lexicon (do this only once)
nltk.download('vader_lexicon')

# Initialize the VADER sentiment analyzer
analyzer = SentimentIntensityAnalyzer()

# Sample text for sentiment analysis
text = "I love this product! It's amazing."

# Get sentiment scores
sentiment_scores = analyzer.polarity_scores(text)

# Extract individual sentiment scores
compound_score = sentiment_scores['compound']
positive_score = sentiment_scores['pos']
negative_score = sentiment_scores['neg']
neutral_score = sentiment_scores['neu']

# Print sentiment scores
print("Compound Score:", compound_score)
print("Positive Score:", positive_score)
print("Negative Score:", negative_score)
print("Neutral Score:", neutral_score)

# Determine sentiment label based on compound score
if compound_score >= 0.05:
    sentiment = "Positive"
elif compound_score <= -0.05:
    sentiment = "Negative"
else:
    sentiment = "Neutral"

print("Sentiment:", sentiment)





#########################################################
# 긍정/부정 감정 
#########################################################

from textblob import TextBlob

# Sample text for sentiment analysis
text = "I love this product! It's amazing."

# Create a TextBlob object
blob = TextBlob(text)

# Get the sentiment polarity and subjectivity
sentiment_polarity = blob.sentiment.polarity
sentiment_subjectivity = blob.sentiment.subjectivity

# Determine sentiment label based on polarity
if sentiment_polarity > 0:
    sentiment = "Positive"
elif sentiment_polarity < 0:
    sentiment = "Negative"
else:
    sentiment = "Neutral"

# Print sentiment information
print("Sentiment Polarity:", sentiment_polarity)
print("Sentiment Subjectivity:", sentiment_subjectivity)
print("Sentiment:", sentiment)
