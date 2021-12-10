package com.example.mylauncher

import android.content.Intent
import android.content.pm.ApplicationInfo
import android.hardware.lights.LightState
import android.net.Uri
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ListView
import android.content.pm.PackageManager

import android.graphics.drawable.Drawable
import android.widget.GridView
import com.example.mylauncher.databinding.ActivityMainBinding.inflate
import com.example.mylauncher.databinding.FragmentBlank2Binding
import com.example.mylauncher.databinding.FragmentBlankBinding


class BlankFragment : Fragment() {


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_blank, container, false)


    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        val apps: List<ApplicationInfo> =
            requireActivity().packageManager.getInstalledApplications(PackageManager.GET_META_DATA)

        val list = ArrayList<String>()

        apps.forEach {
            val info = requireActivity().packageManager.getApplicationInfo(it.packageName, PackageManager.GET_META_DATA)
            val appName = requireActivity().packageManager.getApplicationLabel(info)
            list.add(appName.toString())
            println("fuck $appName")
            println("fuck ${info.icon}")
        }

        val adapter = AppAdapter(
            requireContext(),

            arrayListOf(CustomApp(1 ,"Baver"))
        )
        val list_view = requireView().findViewById<GridView>(R.id.list_view)
        list_view.adapter = adapter
    }
}



