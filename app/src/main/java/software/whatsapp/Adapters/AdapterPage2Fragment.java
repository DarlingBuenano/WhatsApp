package software.whatsapp.Adapters;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import software.whatsapp.ChatsFragment;
import software.whatsapp.EstadosFragment;
import software.whatsapp.LlamadasFragment;

public class AdapterPage2Fragment extends FragmentStateAdapter {

    private int numeroTabs = 3;

    public AdapterPage2Fragment(@NonNull FragmentManager fragmentManager, @NonNull Lifecycle lifecycle) {
        super(fragmentManager, lifecycle);
    }


    @NonNull
    @Override
    public Fragment createFragment(int position) {
        switch (position){
            case 0:
                return new ChatsFragment();
            case 1:
                return new EstadosFragment();
            case 2:
                return new LlamadasFragment();
        }
        return null;
    }

    @Override
    public int getItemCount() {
        return numeroTabs;
    }
}
