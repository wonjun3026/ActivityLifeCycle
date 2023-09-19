package com.android.activitylifecycle

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.android.activitylifecycle.databinding.FragmentContactBinding


class ContactFragment : Fragment() {

    private val binding by lazy { FragmentContactBinding.inflate(layoutInflater) }
    private val firstFragment = FirstFragment.newInstance()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        toast("contactCreate", Toast.LENGTH_SHORT)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        toast("contactCreateView", Toast.LENGTH_SHORT)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val transaction = childFragmentManager.beginTransaction()
        transaction.replace(R.id.frame_contract, firstFragment)
        transaction.commit()
        toast("contactOnViewCreated", Toast.LENGTH_SHORT)
    }
    override fun onViewStateRestored(savedInstanceState: Bundle?) {
        super.onViewStateRestored(savedInstanceState)
        toast("contactViewStateRestoredCreate", Toast.LENGTH_SHORT)
    }

    override fun onStart() {
        super.onStart()
        toast("contactStart", Toast.LENGTH_SHORT)
    }

    override fun onResume() {
        super.onResume()
        toast("contactResume", Toast.LENGTH_SHORT)
    }

    override fun onPause() {
        super.onPause()
        toast("contactPause", Toast.LENGTH_SHORT)
    }

    override fun onStop() {
        super.onStop()
        toast("contactStop", Toast.LENGTH_SHORT)
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        toast("contactSaveInstanceState", Toast.LENGTH_SHORT)
    }

    override fun onDestroyView() {
        super.onDestroyView()
        toast("contactDestroyView", Toast.LENGTH_SHORT)
    }

    override fun onDestroy() {
        super.onDestroy()
        toast("contactDestroy", Toast.LENGTH_SHORT)
    }

    companion object{
        fun newInstance() = ContactFragment()
    }
    private fun toast(message: String, length: Int) {
        Toast.makeText(requireContext(), message, length).show()
    }
}