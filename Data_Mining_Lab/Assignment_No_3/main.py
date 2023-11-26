from sklearn.naive_bayes import GaussianNB

from sklearn import preprocessing

wheather = ['sunny', 'sunny', 'overcast', 'rainy', 'rainy', 'rainy', 'overcast',
            'sunny', 'sunny', 'rainy', 'sunny', 'overcast', 'overcast', 'rainy']
temp = ['hot', 'hot', 'hot', 'mild', 'cool', 'cool', 'cool', 'mild', 'cool', 'mild', 'mild',
        'mild', 'hot', 'mild']
play = ['no', 'no', 'yes', 'yes', 'yes', 'no', 'yes', 'no', 'yes', 'yes', 'yes', 'yes', 'yes',
        'no']
le = preprocessing.LabelEncoder()

wheather_encoded = le.fit_transform(wheather)
print("wheather", wheather_encoded)

temp_encoded = le.fit_transform(temp)
print("temp", temp_encoded)

play_encoded = le.fit_transform(play)
print("play", play_encoded)

features = zip(wheather_encoded, temp_encoded,play_encoded)
print(features)

model = GaussianNB()
model.fit(features.labels)

predicted = model.predict([0, 2])
print("predicted value:", predicted)