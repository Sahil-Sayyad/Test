# Consider following dataset
# weather = ['sunny', 'sunny', 'overcast', 'rainy', 'rainy', 'rainy', 'overcast',
#             'sunny', 'sunny', 'rainy', 'sunny', 'overcast', 'overcast', 'rainy']
# temp = ['hot', 'hot', 'hot', 'mild', 'cool', 'cool', 'cool', 'mild', 'cool', 'mild', 'mild',
#         'mild', 'hot', 'mild']
# play = ['no', 'no', 'yes', 'yes', 'yes', 'no', 'yes', 'no', 'yes', 'yes', 'yes', 'yes', 'yes',
#         'no']
# Use Naive Bayes algorithm to predict[0:Overcast,2:Mild] tuple belongs to which class whether to play the 
# sports or not.

from sklearn.naive_bayes import GaussianNB

from sklearn import preprocessing

weather = ['sunny', 'sunny', 'overcast', 'rainy', 'rainy', 'rainy', 'overcast',
            'sunny', 'sunny', 'rainy', 'sunny', 'overcast', 'overcast', 'rainy']
temp = ['hot', 'hot', 'hot', 'mild', 'cool', 'cool', 'cool', 'mild', 'cool', 'mild', 'mild',
        'mild', 'hot', 'mild']
play = ['no', 'no', 'yes', 'yes', 'yes', 'no', 'yes', 'no', 'yes', 'yes', 'yes', 'yes', 'yes',
        'no']
le = preprocessing.LabelEncoder()

weather_encoded = le.fit_transform(weather)
print("wheather", weather_encoded)

temp_encoded = le.fit_transform(temp)
print("temp", temp_encoded)

play_encoded = le.fit_transform(play)
print("play", play_encoded)

features = zip(weather_encoded, temp_encoded,play_encoded)
print(features)

model = GaussianNB()
model.fit(features.labels)

predicted = model.predict([0, 2])
print("predicted value:", predicted)