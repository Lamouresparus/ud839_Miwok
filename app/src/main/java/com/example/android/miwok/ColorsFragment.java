package com.example.android.miwok;


import android.content.Context;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class ColorsFragment extends Fragment {

    private AudioManager mAudioManager;
    AudioManager.OnAudioFocusChangeListener afChangeListener = new AudioManager.OnAudioFocusChangeListener() {
        @Override
        public void onAudioFocusChange(int focusChange) {
            if (focusChange == AudioManager.AUDIOFOCUS_LOSS_TRANSIENT || focusChange == AudioManager.AUDIOFOCUS_LOSS_TRANSIENT_CAN_DUCK){
                mediaPlayer.pause();
                mediaPlayer.seekTo(0);
            }
            else if (focusChange==AudioManager.AUDIOFOCUS_GAIN){
                mediaPlayer.start();
            }
            else if (focusChange==AudioManager.AUDIOFOCUS_LOSS){
                releaseMediaPlayer();
            }
        }
    };


    MediaPlayer mediaPlayer;
    private MediaPlayer.OnCompletionListener onCompletionListener = new MediaPlayer.OnCompletionListener() {
        @Override
        public void onCompletion(MediaPlayer mp) {
            releaseMediaPlayer();
        }
    };


    public ColorsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.word_list, container, false);

        mAudioManager = (AudioManager) getActivity().getSystemService(Context.AUDIO_SERVICE);

        final ArrayList<Word> Words = new ArrayList<Word>();
        Words.add(new Word("wetetti", "red", R.drawable.color_red, R.raw.color_red));
        Words.add(new Word("chiwiite", "mustard yellow", R.drawable.color_mustard_yellow, R.raw.color_mustard_yellow));
        Words.add(new Word("topiise", "dusty yellow", R.drawable.color_dusty_yellow, R.raw.color_dusty_yellow));
        Words.add(new Word("chokokki", "green", R.drawable.color_green, R.raw.color_green));
        Words.add(new Word("takaakki", "brown", R.drawable.color_brown, R.raw.color_brown));
        Words.add(new Word("topoppi", "gray", R.drawable.color_gray, R.raw.color_gray));
        Words.add(new Word("kululli", "black", R.drawable.color_black, R.raw.color_black));
        Words.add(new Word("kelelli", "white", R.drawable.color_white, R.raw.color_white));


        WordAdapter adapter = new WordAdapter (getActivity(), Words, R.color.category_colors);

        ListView numbersListView = rootView.findViewById(R.id.list);

        numbersListView.setAdapter(adapter);


        numbersListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Word wordPosition = Words.get(position);

                releaseMediaPlayer();

                int result = mAudioManager.requestAudioFocus(afChangeListener, AudioManager.STREAM_MUSIC, AudioManager.AUDIOFOCUS_GAIN_TRANSIENT);
                if (result == AudioManager.AUDIOFOCUS_REQUEST_GRANTED) {


                    mediaPlayer = MediaPlayer.create(getActivity(), wordPosition.getmAudioFileResource());
                    mediaPlayer.start();

                    mediaPlayer.setOnCompletionListener(onCompletionListener);
                }
            }
        });


        return rootView;
    }

    @Override
    public void onStop() {
        super.onStop();
        releaseMediaPlayer();
    }

    private void releaseMediaPlayer(){
        if (mediaPlayer!= null){
            mediaPlayer.release();
            mediaPlayer = null;
            mAudioManager.abandonAudioFocus(afChangeListener);
        }
    }

}
