package software.whatsapp;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

import software.whatsapp.Adapters.AdapterChatsRecycle;
import software.whatsapp.Models.Chat;

public class ChatsFragment extends Fragment {

    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    private String mParam1;
    private String mParam2;

    private AdapterChatsRecycle adapterChatsRecycle;
    private RecyclerView chats_recyclerView;
    private ArrayList<Chat> lista_chats;

    public ChatsFragment() {
        // Required empty public constructor
    }

    public static ChatsFragment newInstance(String param1, String param2) {
        ChatsFragment fragment = new ChatsFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_chats, container, false);

        this.chats_recyclerView = view.findViewById(R.id.recycle_chats);
        this.chats_recyclerView.setHasFixedSize(true);
        this.chats_recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));

        this.lista_chats = new ArrayList<>();
        this.lista_chats.add(new Chat());
        this.lista_chats.add(new Chat());
        this.lista_chats.add(new Chat());
        this.lista_chats.add(new Chat());
        this.lista_chats.add(new Chat());

        this.adapterChatsRecycle = new AdapterChatsRecycle(getContext(), lista_chats);

        this.chats_recyclerView.setAdapter( this.adapterChatsRecycle );
        return view;
    }
}