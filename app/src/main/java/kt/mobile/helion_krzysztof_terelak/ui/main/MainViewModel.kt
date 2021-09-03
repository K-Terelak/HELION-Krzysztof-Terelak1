package kt.mobile.helion_krzysztof_terelak.ui.main

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch
import kt.mobile.helion_krzysztof_terelak.usecases.GetAllCategoriesUseCase
import kt.mobile.helion_krzysztof_terelak.util.ViewState
import java.lang.Exception
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(
    private val getAllCategoriesUseCase: GetAllCategoriesUseCase,
) : ViewModel() {

    private val _categoryList = MutableStateFlow<ViewState>(ViewState.Loading)
    val categoryList: StateFlow<ViewState> = _categoryList


    init {
        getAllCategories()
    }

    private fun getAllCategories() {
        viewModelScope.launch {
            try {
                _categoryList.value = ViewState.Success(getAllCategoriesUseCase())
            } catch (e: Exception) {
                _categoryList.value = ViewState.Error(e)
            }
        }
    }

}