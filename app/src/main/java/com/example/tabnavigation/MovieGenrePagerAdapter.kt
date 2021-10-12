package com.example.tabnavigation

import android.content.Context
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import java.security.AccessControlContext

private val TAB_GENRE_SCROLLABLE= listOf (
    R.string.action,
    R.string.comedy,
    R.string.drama,
    R.string.sci_fi,
    R.string.family,
    R.string.crime,
    R.string.history

)
private val TAB_GENRE_FIXED = listOf(
    R.string.action,
    R.string.comedy,
    R.string.drama
)

class MovieGenrePagerAdapter(private val context: Context, fm: FragmentManager)
    :FragmentPagerAdapter(fm, BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT){

    //FragmentPagerAdapter is used
    //when you have a defined number of fragments that isn't too large.

    //The
    //BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT flag only keeps the current
    //fragment in a state where it's available for the user to interact with (RESUMED).

    override fun getItem(position: Int): Fragment {
        return MoviesFragment.newInstance(context.resources.getString(TAB_GENRE_SCROLLABLE[position]))
    }
    //The above function gets MoviesFragment
    //at this position in the list (or creates a new MoviesFragment if it's being
    //accessed for the first time) by passing in the genre title you want to display in the
    //fragment. Once created, MoviesFragment will be kept in memory



    override fun getPageTitle(position: Int): CharSequence? {
        return context.resources
            .getString(TAB_GENRE_SCROLLABLE[position])
    }// This retrieves the
    //genre title at the specified position in the list by using a specific position.

    override fun getCount(): Int {
        return TAB_GENRE_SCROLLABLE.size
    } // This method returns the total number of items to be displayed


    }
