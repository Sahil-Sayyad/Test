import pandas as pd

info = {'gender': ['male', 'female', 'male', 'female', 'male'],
        'position': ['Head', 'Asst_Prof', 'Ass_Prof', 'Head', 'Unknown']}  # Added a placeholder value for the missing position

df = pd.DataFrame(info)
print(df)

from sklearn.preprocessing import LabelEncoder

le = LabelEncoder()

df['Encoded_gender'] = le.fit_transform(df['gender'])
df['Encoded_position'] = le.fit_transform(df['position'])
print(df)