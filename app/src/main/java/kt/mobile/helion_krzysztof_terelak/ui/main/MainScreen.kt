package kt.mobile.helion_krzysztof_terelak.ui.main

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Modifier
import androidx.hilt.navigation.compose.hiltViewModel
import kt.mobile.helion_krzysztof_terelak.ui.components.ShowError
import kt.mobile.helion_krzysztof_terelak.ui.components.ShowProgress
import kt.mobile.helion_krzysztof_terelak.util.ViewState

@Composable
fun MainScreen(mainViewModel: MainViewModel = hiltViewModel()) {

    when (val categoryListState = mainViewModel.categoryList.collectAsState().value) {
        is ViewState.Loading -> {
            ShowProgress()
        }
        is ViewState.Success -> {

            LazyColumn(
                modifier = Modifier
                    .fillMaxSize()
                    .background(MaterialTheme.colors.background)
            ) {
                items(categoryListState.data.categories.orEmpty()) { category ->
                    CategoryItem(category = category)
                }
            }
        }
        is ViewState.Error -> {
            ShowError()
        }
    }


}