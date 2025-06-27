package eu.tutorials.countermvvm

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider

class CounterViewModelFactory : ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(CounterViewModel::class.java)) {
            return CounterViewModel(CounterRepository()) as T
        }
        throw IllegalArgumentException("Unknown ViewModel class")
    }
}
