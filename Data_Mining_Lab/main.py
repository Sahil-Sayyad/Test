import panads as pd
info = { "gender"=['male','female','male','female'],
        "Position"=['Head','Ass_Prof',"Head"]
        }

df = pd.DataFormat(info)
print(df)

from sklearn.preprocessing import LabelEncoder

li = LabelEncoder()

gender_encoded = li.fit_transform(df['gender'])

encoded_position = li.fit_transform(df['position'])

df['Encoded_gender'] = gender_encoded

df['Encoded_position'] = encoded_position

printf(df)

