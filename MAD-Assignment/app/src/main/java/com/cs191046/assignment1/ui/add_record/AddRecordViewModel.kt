package com.cs191046.assignment1.ui.add_record

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class AddRecordViewModel : ViewModel() {
    var name: String = ""
    var description: String = ""
    var image: String? = null
}