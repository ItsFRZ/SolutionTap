package com.pandorax.solutiontap;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.Toast;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.Volley;
import com.firebase.ui.database.FirebaseRecyclerAdapter;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.HashMap;

public class AllData extends AppCompatActivity {

    ArrayList<AllDataItems> arrayList;
    RequestQueue requestQueue;
    AllDataAdapter adapter;
    RecyclerView recyclerView;
    String api = "https://api.covid19api.com/summary";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_all_data);

        recyclerView = (RecyclerView) findViewById(R.id.alldatarecycler);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        requestQueue = Volley.newRequestQueue(this);
        arrayList= new ArrayList<>();
        readData();

    }

    private void readData() {

        JsonObjectRequest request = new JsonObjectRequest(Request.Method.GET, api, null,
                new Response.Listener<JSONObject>() {
                    @Override
                    public void onResponse(JSONObject response) {

                        try {
                            JSONArray array = response.getJSONArray("Countries");

                            for (int i=0;i<array.length();i++){

                                JSONObject object = array.getJSONObject(i);
                                String country = object.getString("Country");
                                String nconfirm = object.getString("NewConfirmed");
                                String tconfirm = object.getString("TotalConfirmed");
                                String ndeath = object.getString("NewDeaths");
                                String tdeath = object.getString("TotalDeaths");
                                String nrecover = object.getString("NewRecovered");
                                String trecover = object.getString("TotalRecovered");
                                String date = object.getString("Date");
                                arrayList.add(new AllDataItems(country,nconfirm,tconfirm,ndeath,tdeath,nrecover,trecover,date));


                            }
                            adapter = new AllDataAdapter(arrayList, getApplicationContext());
                            recyclerView.setAdapter(adapter);
                        } catch (JSONException e) {
                            e.printStackTrace();
                        }
                    }
                }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {

                Toast.makeText(AllData.this, error.getMessage(), Toast.LENGTH_SHORT).show();

            }
        });
        requestQueue.add(request);


    }
}
