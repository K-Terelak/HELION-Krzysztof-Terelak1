package kt.mobile.helion_krzysztof_terelak.data.remote.response


import com.google.gson.annotations.SerializedName

data class CategoriesResponse(
    @SerializedName("categories")
    val categories: List<CategoryResponse>?
)