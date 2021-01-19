package software.whatsapp.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

import software.whatsapp.Models.Chat;
import software.whatsapp.R;

public class AdapterChatsRecycle extends RecyclerView.Adapter<AdapterChatsRecycle.ViewHolder>{

    private LayoutInflater Inflador;
    private  ArrayList<Chat> Lista_chats;

    public AdapterChatsRecycle(Context contexto, ArrayList<Chat> lista_chats){
        this.Inflador = LayoutInflater.from(contexto);
        this.Lista_chats = lista_chats;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = Inflador.inflate(R.layout.chat, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        String nombreChat = this.Lista_chats.get(position).getNombreChat();
        String mensajeChat = this.Lista_chats.get(position).getMensaje();
        String fechaChat = this.Lista_chats.get(position).getFecha();

        holder.txtNombreChat.setText(nombreChat);
        holder.txtMensajeChat.setText(mensajeChat);
        holder.txtFechaChat.setText(fechaChat);
    }

    @Override
    public int getItemCount() {
        return Lista_chats.size();
    }


    public class ViewHolder extends RecyclerView.ViewHolder {

        TextView txtNombreChat;
        TextView txtMensajeChat;
        TextView txtFechaChat;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            txtNombreChat = itemView.findViewById(R.id.nombre_chat);
            txtMensajeChat = itemView.findViewById(R.id.descripcion_chat);
            txtFechaChat = itemView.findViewById(R.id.fecha_chat);
        }
    }
}
