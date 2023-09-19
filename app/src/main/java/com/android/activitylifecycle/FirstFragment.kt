package com.android.activitylifecycle

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast

class FirstFragment : Fragment() {
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        toast("firstCreate", Toast.LENGTH_SHORT)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        toast("firstCreateView", Toast.LENGTH_SHORT)
        return inflater.inflate(R.layout.fragment_first, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        toast("firstViewCreate", Toast.LENGTH_SHORT)
    }

    override fun onViewStateRestored(savedInstanceState: Bundle?) {
        super.onViewStateRestored(savedInstanceState)
        toast("firstViewStateRestoredCreate", Toast.LENGTH_SHORT)
    }

    override fun onStart() {
        super.onStart()
        toast("firstStart", Toast.LENGTH_SHORT)
    }

    override fun onResume() {
        super.onResume()
        toast("firstResume", Toast.LENGTH_SHORT)
    }

    override fun onPause() {
        super.onPause()
        toast("firstPause", Toast.LENGTH_SHORT)
    }

    override fun onStop() {
        super.onStop()
        toast("firstStop", Toast.LENGTH_SHORT)
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        toast("firstSaveInstanceState", Toast.LENGTH_SHORT)
    }

    override fun onDestroyView() {
        super.onDestroyView()
        toast("firstDestroyView", Toast.LENGTH_SHORT)
    }

    override fun onDestroy() {
        super.onDestroy()
        toast("firstDestroy", Toast.LENGTH_SHORT)
    }

    companion object {

        fun newInstance() = FirstFragment()
    }
    private fun toast(message: String, length: Int) {
        Toast.makeText(requireContext(), message, length).show()
    }
}