package com.example.trabalhovacina;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import androidx.viewpager2.widget.ViewPager2;

import com.example.trabalhovacina.R;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;

public class NewsActivity extends AppCompatActivity {

    private TabLayout tabLayout;
    private ViewPager2 viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_news);

        // Inicializando o TabLayout e o ViewPager2
        tabLayout = findViewById(R.id.tabLayout);

        // Configurar o adaptador do ViewPager2
        viewPager.setAdapter(new ViewPagerAdapter(getSupportFragmentManager(), getLifecycle()));

        // Integrando o TabLayout com o ViewPager2
        new TabLayoutMediator(tabLayout, viewPager, new TabLayoutMediator.TabConfigurationStrategy() {
            @Override
            public void onConfigureTab(@NonNull TabLayout.Tab tab, int position) {
                if (position == 0) {
                    tab.setText("NOTÍCIAS");
                } else if (position == 1) {
                    tab.setText("CARTEIRAS");
                }
            }
        }).attach();
    }

    // Adaptador para trocar entre os fragmentos de Notícias e Carteiras
    private class ViewPagerAdapter extends FragmentStateAdapter {

        public ViewPagerAdapter(@NonNull FragmentManager fragmentManager, @NonNull Lifecycle lifecycle) {
            super(fragmentManager, lifecycle);
        }

        @NonNull
        @Override
        public Fragment createFragment(int position) {
            if (position == 0) {
                return new NewsFragment();  // Fragmento de Notícias
            } else {
                return new WalletsFragment();  // Fragmento de Carteiras
            }
        }

        @Override
        public int getItemCount() {
            return 2;  // Número de abas (Notícias e Carteiras)
        }
    }
}
