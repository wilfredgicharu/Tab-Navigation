package com.example.tabnavigation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TableLayout
import androidx.viewpager.widget.ViewPager
import com.google.android.material.tabs.TabLayout

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(findViewById(R.id.toolbar)) //setting up the app bar so that it uses the toolbar

        val viewPager = findViewById<ViewPager>(R.id.viewpager) //Set up the data to be displayed in the swipeable ViewPager so that it comes
                                                               // from MovieGenresPagerAdapter

        val tabs = findViewById<TabLayout>(R.id.tabs)        //setting the tablayout so that it displays the configured viewpager.

        viewPager.adapter = MovieGenrePagerAdapter(this,
            supportFragmentManager)
        tabs.tabMode = TabLayout.MODE_SCROLLABLE
        tabs?.setupWithViewPager(viewPager)
    }
}