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

public class PhrasesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        ArrayList<Word> Words = new ArrayList<Word>();
        Words.add(new Word("minto wuksus", "Where are you going?"));
        Words.add(new Word("tinna oyaase'na", "What is your name?"));
        Words.add(new Word("oyaaset", "My name is..."));
        Words.add(new Word("michaksas", "How are you feeling?"));
        Words.add(new Word("kuchi achit", "I'm feeling good."));
        Words.add(new Word("aanas'aa", "Are you coming?"));
        Words.add(new Word("haa'aanam", "Yes, I'm coming."));
        Words.add(new Word("aanam", "I'm coming."));
        Words.add(new Word("yoowutis", "Let's go"));
        Words.add(new Word("anni'nem", "Come here"));



        WordAdapter adapter = new WordAdapter (this, Words);

        ListView numbersListView = (ListView) findViewById(R.id.list);

        numbersListView.setAdapter(adapter);
    }
}
