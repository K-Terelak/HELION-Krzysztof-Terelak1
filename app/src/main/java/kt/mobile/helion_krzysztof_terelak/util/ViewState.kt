package kt.mobile.helion_krzysztof_terelak.util

import kt.mobile.helion_krzysztof_terelak.data.entities.Categories

sealed class ViewState {
    object Loading : ViewState()
    data class Success(val data: Categories) : ViewState()
    data class Error(val exception: Throwable) : ViewState()
}
