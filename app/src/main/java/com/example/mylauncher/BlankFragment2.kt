package com.example.mylauncher

import android.content.Intent
import android.net.Uri
import android.os.Binder
import android.os.Bundle
import android.renderscript.ScriptGroup
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.databinding.DataBindingUtil
import androidx.databinding.DataBindingUtil.setContentView
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.RecyclerView
import com.example.mylauncher.databinding.ActivityMainBinding
import com.example.mylauncher.databinding.FragmentBlank2Binding


class BlankFragment2 : Fragment() {

    private  lateinit var binding: FragmentBlank2Binding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        binding = FragmentBlank2Binding.inflate(LayoutInflater.from(requireContext()), container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        binding.buttonapps.setOnClickListener{

            val action = R.id.action_blankFragment22_to_blankFragment
            navigateSafe(action)
        }

        binding.buttonyoutube.setOnClickListener {
            val videoId = "uees6i-8JD4"
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse("vnd.youtube://$videoId"))
            startActivity(intent)
            Log.i("click", "click")
        }
        binding.imageworldtv.setOnClickListener {
            val intent = requireContext().packageManager.getLaunchIntentForPackage("com.rednetapp.worldiptv")
            startActivity(intent)
            Log.i("click", "click")
        }
        binding.imagenetflix.setOnClickListener {
            val intent = requireContext().packageManager.getLaunchIntentForPackage("com.netflix.mediaclient")
            val uri = Uri.parse("http://movies.netflix.com/WiPlayer?movieid=70266228&trkid=13462049&ctx=0%2C1%2Ce2bd7b74-6743-4d5e-864f-1cc2568ba0da-61921755")
            intent!!.data = uri
            startActivity(intent)
            Log.i("click", "click")
        }
        binding.buttonred.setOnClickListener {
            val intent = requireContext().packageManager.getLaunchIntentForPackage("com.redroid.iptv")
            startActivity(intent)
            Log.i("click", "click")
        }
        binding.buttoncineflix.setOnClickListener {
            val intent = requireContext().packageManager.getLaunchIntentForPackage("net.rednetapp.cineflix")
            startActivity(intent)
            Log.i("click", "click")
        }
    }
}