package com.android.activitylifecycle

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter

class ViewPagerAdapter(
    fragmentActivity: FragmentActivity,
) : FragmentStateAdapter(fragmentActivity){

    private val fragments = ArrayList<MainTabs>()
    private val contactFragment = ContactFragment.newInstance()

    init {
        fragments.add(MainTabs(contactFragment, "Contact"))
        fragments.add(MainTabs(SecondFragment.newInstance(), "Second Page"))
    }
    fun getTitle(position: Int): String{
        return fragments[position].title
    }

    override fun getItemCount(): Int {
        return fragments.size
    }
    fun getFragment(position: Int): Fragment = fragments[position].fragment

    override fun createFragment(position: Int): Fragment {
        return getFragment(position)
    }
}