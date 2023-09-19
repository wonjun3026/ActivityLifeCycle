package com.android.activitylifecycle

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [SecondFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class SecondFragment : Fragment() {
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_second, container, false)
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        toast("secondViewCreate", Toast.LENGTH_SHORT)
    }

    override fun onViewStateRestored(savedInstanceState: Bundle?) {
        super.onViewStateRestored(savedInstanceState)
        toast("secondViewStateRestoredCreate", Toast.LENGTH_SHORT)
    }

    override fun onStart() {
        super.onStart()
        toast("secondStart", Toast.LENGTH_SHORT)
    }

    override fun onResume() {
        super.onResume()
        toast("secondResume", Toast.LENGTH_SHORT)
    }

    override fun onPause() {
        super.onPause()
        toast("secondPause", Toast.LENGTH_SHORT)
    }

    override fun onStop() {
        super.onStop()
        toast("secondStop", Toast.LENGTH_SHORT)
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        toast("secondSaveInstanceState", Toast.LENGTH_SHORT)
    }

    override fun onDestroyView() {
        super.onDestroyView()
        toast("secondDestroyView", Toast.LENGTH_SHORT)
    }

    override fun onDestroy() {
        super.onDestroy()
        toast("secondDestroy", Toast.LENGTH_SHORT)
    }

    companion object {

        fun newInstance() = SecondFragment()

    }
    private fun toast(message: String, length: Int) {
        Toast.makeText(requireContext(), message, length).show()
    }
}