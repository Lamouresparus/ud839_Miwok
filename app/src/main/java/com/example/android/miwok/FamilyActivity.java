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

public class FamilyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        ArrayList<Word> Words = new ArrayList<Word>();
        Words.add(new Word("epe", "father", R.drawable.family_father));
        Words.add(new Word("eta", "mother", R.drawable.family_mother));
        Words.add(new Word("angsi", "son", R.drawable.family_son));
        Words.add(new Word("tune", "daughter", R.drawable.family_daughter));
        Words.add(new Word("taachi", "older brother", R.drawable.family_older_brother));
        Words.add(new Word("chalitti", "younger brother", R.drawable.family_younger_brother));
        Words.add(new Word("tete", "older sister", R.drawable.family_older_sister));
        Words.add(new Word("kolliti", "younger sister", R.drawable.family_younger_sister));
        Words.add(new Word("ama", "grandmother", R.drawable.family_grandmother));
        Words.add(new Word("paapa", "grandfather", R.drawable.family_grandfather));



        WordAdapter adapter = new WordAdapter (this, Words);

        ListView numbersListView = (ListView) findViewById(R.id.list);

        numbersListView.setAdapter(adapter);
    }
}

