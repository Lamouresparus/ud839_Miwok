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

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class ColorsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        ArrayList<Word> Words = new ArrayList<Word>();
        Words.add(new Word("wetetti", "red", R.drawable.color_red));
        Words.add(new Word("chiwiite", "mustard yellow", R.drawable.color_mustard_yellow));
        Words.add(new Word("topiise", "dusty yellow", R.drawable.color_dusty_yellow));
        Words.add(new Word("chokokki", "green", R.drawable.color_green));
        Words.add(new Word("takaakki", "brown", R.drawable.color_brown));
        Words.add(new Word("topoppi", "gray", R.drawable.color_gray));
        Words.add(new Word("kululli", "black", R.drawable.color_black));
        Words.add(new Word("kelelli", "white", R.drawable.color_white));


        WordAdapter adapter = new WordAdapter (this, Words);

        ListView numbersListView = (ListView) findViewById(R.id.list);

        numbersListView.setAdapter(adapter);
    }
}
