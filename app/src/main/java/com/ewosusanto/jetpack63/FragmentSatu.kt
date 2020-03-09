package com.ewosusanto.jetpack63


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.NavController
import androidx.navigation.Navigation
import kotlinx.android.synthetic.main.fragment_fragment_dua.*
import kotlinx.android.synthetic.main.fragment_fragment_satu.*

/**
 * A simple [Fragment] subclass.
 */
class FragmentSatu : Fragment() {

    lateinit var nav : NavController

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_fragment_satu, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

            nav = Navigation.findNavController(view)

            button6.setOnClickListener {
            nav.navigate(R.id.action_fragmentSatu_to_fragmentDua)
        }
    }
}
