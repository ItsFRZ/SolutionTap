package com.pandorax.solutiontap;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.firebase.ui.database.FirebaseRecyclerAdapter;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.HashMap;

public class QA extends AppCompatActivity {

    EditText sendchat;
    RecyclerView recyclerView;
    Button Send;
    DatabaseReference databaseReference;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_q);




        recyclerView = (RecyclerView) findViewById(R.id.chatrecycler);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        sendchat = (EditText) findViewById(R.id.sendchat);
        databaseReference = FirebaseDatabase.getInstance().getReference().child("Chat");
        Send = (Button) findViewById(R.id.Send);
        Send.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                HashMap<String,String>  map = new HashMap<>();
                map.put("chat",sendchat.getText().toString());
                databaseReference.push().setValue(map);
                sendchat.setText("");

            }
        });
    }


    @Override
    protected void onStart() {
        super.onStart();


        FirebaseRecyclerAdapter<ChatItem,ChatItemViewHolder> adapter=
                new FirebaseRecyclerAdapter<ChatItem, ChatItemViewHolder>(

                        ChatItem.class,
                        R.layout.chatbox,
                        ChatItemViewHolder.class,
                        databaseReference


                ) {
                    @Override
                    protected void populateViewHolder(ChatItemViewHolder chatItemViewHolder, ChatItem chatItem, int i) {

                        chatItemViewHolder.setChat(chatItem.getChat());

                    }
                };
        recyclerView.setAdapter(adapter);


    }


    public static class ChatItemViewHolder extends RecyclerView.ViewHolder {

        View view;

        public ChatItemViewHolder(@NonNull View itemView) {
            super(itemView);


            view = itemView;
        }

        public void setChat(String chat) {

            TextView chatText = (TextView) view.findViewById(R.id.textchat);
            chatText.setText(chat);

        }
    }

}
