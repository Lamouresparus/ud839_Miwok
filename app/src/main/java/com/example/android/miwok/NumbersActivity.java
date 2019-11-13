/*
 * Copyright (C) 2016 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);

        ArrayList<Word> Words = new ArrayList<Word>();
        Words.add(new Word("lutti", "one"));
        Words.add(new Word("otiiko", "two"));
        Words.add(new Word("tolookosu", "three"));
        Words.add(new Word("oyyisa", "four"));
        Words.add(new Word("massokka", "five"));
        Words.add(new Word("temmokka", "six"));
        Words.add(new Word("kenekaku", "seven"));
        Words.add(new Word("kawinta", "eight"));
        Words.add(new Word("wo'e", "nine"));
        Words.add(new Word("na'aacha", "ten"));


        WordAdapter adapter = new WordAdapter (this, Words);

        ListView numbersListView = (ListView) findViewById(R.id.list);

        numbersListView.setAdapter(adapter);
    }
}
