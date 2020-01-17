#!/usr/bin/env python
# coding: utf-8


import pandas as pd
import sqlite3


con = sqlite3.connect("chinook.db")
cur = con.cursor()
query = """ Select name from sqlite_master where type = "table" """


res = cur.execute(query)
list_tables = res.fetchall()


table_name_columns = {}
for t_name in list_tables:
    q1 = 'SELECT * FROM {}'.format(str(t_name[0]))
    cursor = con.execute(q1)
    temp1 = []
    for i in range(len(cursor.description)):
        temp1.append(cursor.description[i][0])
    table_name_columns[str(t_name[0])] = temp1


name_col = table_name_columns['playlists'][0]
for key in table_name_columns.keys():
    if name_col in table_name_columns[key]:
        new_table = key


q2 = "select * from {}".format(new_table)
cur2 = con.execute(q2)
playlist_track = cur2.fetchall()

id = [1,3,5,8]
track_id = {}
for j in id:
    counter = 0
    temp = []
    for i in range(len(playlist_track)):
        if playlist_track[i][0] == j:
            if(counter!=10):
                counter+=1
                temp.append(playlist_track[i][1])
            else:
                break
    track_id[j] = temp


name_col1 = table_name_columns['playlist_track'][1]
for key in table_name_columns.keys():
    if name_col1 in table_name_columns[key] and key != 'playlist_track':
        new_table1 = key


q3 = "select * from {}".format(new_table1)
cur3 = con.execute(q3)


tracks = cur3.fetchall()


track_name = {}
for id in track_id.keys():
    for i in track_id[id]:
        for j in range(len(tracks)):
            if tracks[j][0] == i:
                track_name[i]=[tracks[j][1],tracks[j][2]]

name_col2 = table_name_columns['tracks'][2]
for key in table_name_columns.keys():
    if name_col2 in table_name_columns[key] and key != 'tracks':
        new_table2 = key

q4 = "select * from {}".format(new_table2)
cur4 = con.execute(q4)

albums = cur4.fetchall()


for id in track_name.keys():
        for j in range(len(albums)):
            if albums[j][0] == track_name[id][1]:
                track_name[id].append(albums[j][1])
                track_name[id].append(albums[j][2])


name_col3 = table_name_columns['albums'][2]
for key in table_name_columns.keys():
    if name_col3 in table_name_columns[key] and key != 'albums':
        new_table3 = key


q5 = "select * from {}".format(new_table3)
cur5 = con.execute(q5)

artists = cur5.fetchall()

for id in track_name.keys():
        for j in range(len(artists)):
            if artists[j][0] == track_name[id][3]:
                track_name[id].append(artists[j][1])

print(track_name)
