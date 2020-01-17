#!/usr/bin/env python
# coding: utf-8


#Importing pandas pacakge to carry out operations with excel
import pandas as pd

#Reading the excel files, old and new
df1= pd.read_excel('Excel_old.xlsx')
df2= pd.read_excel('Excel_new.xlsx')


#Combining the first two columns of the DataFrames to create a new column containing the unique id for each row
df1['id']=df1['Unique ID']+df1['Data Point']
df2['Id']=df1['Unique ID']+df1['Data Point']

#Here we are writing a function create a dictionary of the contents of the DataFrames
def create_dict(cid,c,df):
    dict_temp = {}
    df_temp = df
    colid=cid
    col=c
    for row in range(0,df_temp.shape[0]):
        dict_temp[df_temp.iloc[row,colid]]=df_temp.iloc[row,col]
    return dict_temp

#Here we are creating a list of dictionaries for old excel file
list_old = []
for i in range(2,len(df1.columns)-1):
    list_old.append(create_dict(6,i,df1))

#Here we are creating a list of dictionaries for new excel file
list_new = []
for i in range(2,len(df2.columns)-1):
    list_new.append(create_dict(6,i,df2))

#Define a list of dictionaries which contains Key as ID &  difference as Valsues
list_diff = []
# The list creation method
def diff_dict():
    for i in range(len(list_new)):
        temp = {}
        for key in list_new[i].keys():
            if key not in list_old[i].keys():
                temp[key] = list_new[i][key]
            else:
                temp[key] = list_new[i][key] - list_old[i][key]
        list_diff.append(temp)

# creating new DataFrame for the result
df_name1=pd.DataFrame({'Unique ID':df2['Unique ID'],'Data Point':df2['Data Point']})
def create_df():
    col_name = df2.columns[2:len(df2.columns)-1]
    for i in range(len(list_diff)):
        df_name1[str(col_name[i])] = list_diff[i].values()


#Calling the function to calculate the difference and put in another DataFrame
create_df()

#Forming the new DataFrame to highlight the changed values in red
def color_red(value):
    color = 'red' if (value!=0 and type(value)!=str) else 'black'
    return 'color: %s' %color
df=df_name1.style.applymap(color_red)

#Exporting the final DataFrame to a new Excel File
df.to_excel("Final.xlsx",index =False)
