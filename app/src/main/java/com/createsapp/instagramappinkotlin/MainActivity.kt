package com.createsapp.instagramappinkotlin

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.createsapp.instagramappinkotlin.fragments.HomeFragment
import com.createsapp.instagramappinkotlin.fragments.NotificationFragment
import com.createsapp.instagramappinkotlin.fragments.ProfileFragment
import com.createsapp.instagramappinkotlin.fragments.SearchFragment
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val navView: BottomNavigationView = findViewById(R.id.nav_view)
        navView.setOnNavigationItemSelectedListener(onNavigationItemSelectedListener)

        moveToFragment(HomeFragment())

//        supportFragmentManager.beginTransaction().replace(
//            R.id.fragment_container, HomeFragment()
//        ).commit()
    }

    private val onNavigationItemSelectedListener =
        BottomNavigationView.OnNavigationItemSelectedListener {
            it
            when (it.itemId) {

                R.id.nav_home -> {
                    moveToFragment(HomeFragment())
                    return@OnNavigationItemSelectedListener true
                }

                R.id.nav_search -> {
                    moveToFragment(SearchFragment())
                    return@OnNavigationItemSelectedListener true
                }

                R.id.nav_add -> {
                    return@OnNavigationItemSelectedListener true
                }

                R.id.nav_heart -> {
                    moveToFragment(NotificationFragment())
                    return@OnNavigationItemSelectedListener true
                }

                R.id.nav_profile -> {
                    moveToFragment(ProfileFragment())
                    return@OnNavigationItemSelectedListener true
                }

            }

//            if (selectedFragment != null) {
//                supportFragmentManager.beginTransaction().replace(
//                    R.id.fragment_container, selectedFragment!!
//                ).commit()
//            }

            false
        }

    private fun moveToFragment(fragment: Fragment) {
        val fragmentTrans = supportFragmentManager.beginTransaction()
        fragmentTrans.replace(R.id.fragment_container, fragment)
        fragmentTrans.commit()
    }
}
