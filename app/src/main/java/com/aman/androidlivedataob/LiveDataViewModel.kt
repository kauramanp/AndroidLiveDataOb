package com.aman.androidlivedataob

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class LiveDataViewModel: ViewModel() {
    var color: MutableLiveData<Int> = MutableLiveData(0)

}