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
import android.widget.ListView;

import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        ArrayList<Word> Words = new ArrayList<Word>();
        Words.add(new Word("lutti", "one", R.drawable.number_one));
        Words.add(new Word("otiiko", "two", R.drawable.number_two));
        Words.add(new Word("tolookosu", "three", R.drawable.number_three));
        Words.add(new Word("oyyisa", "four", R.drawable.number_four));
        Words.add(new Word("massokka", "five", R.drawable.number_five));
        Words.add(new Word("temmokka", "six", R.drawable.number_six));
        Words.add(new Word("kenekaku", "seven", R.drawable.number_seven));
        Words.add(new Word("kawinta", "eight", R.drawable.number_eight));
        Words.add(new Word("wo'e", "nine", R.drawable.number_nine));
        Words.add(new Word("na'aacha", "ten", R.drawable.number_ten));


        WordAdapter adapter = new WordAdapter (this, Words);

        ListView numbersListView = (ListView) findViewById(R.id.list);

        numbersListView.setAdapter(adapter);
    }
}
