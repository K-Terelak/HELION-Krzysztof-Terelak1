package kt.mobile.helion_krzysztof_terelak.data.remote

import kt.mobile.helion_krzysztof_terelak.data.remote.response.CategoriesResponse
import kt.mobile.helion_krzysztof_terelak.util.Constants.ENDPOINT_CATEGORIES
import retrofit2.http.GET

interface HelionService {

    @GET(ENDPOINT_CATEGORIES)
    suspend fun getAllCategories(): CategoriesResponse
}