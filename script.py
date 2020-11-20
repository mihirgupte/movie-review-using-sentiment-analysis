import sys
from textblob import TextBlob
args = sys.argv
args.pop(0)
inp = " ".join(args)
analysis=TextBlob(inp)
print(analysis.sentiment.polarity)

# print your output here so that java can read
