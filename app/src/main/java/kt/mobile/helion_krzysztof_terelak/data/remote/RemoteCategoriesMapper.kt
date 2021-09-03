package kt.mobile.helion_krzysztof_terelak.data.remote

import kt.mobile.helion_krzysztof_terelak.data.entities.Categories
import kt.mobile.helion_krzysztof_terelak.data.entities.Category
import kt.mobile.helion_krzysztof_terelak.data.entities.Children
import kt.mobile.helion_krzysztof_terelak.data.remote.response.CategoriesResponse
import kt.mobile.helion_krzysztof_terelak.data.remote.response.CategoryResponse
import kt.mobile.helion_krzysztof_terelak.data.remote.response.ChildrenResponse

fun CategoriesResponse.asCategories() = Categories(
    categories = categories?.map { it.asCategory() }
)

fun CategoryResponse.asCategory() = Category(
    books = books,
    children = children?.map { it.asChildren() },
    id = id,
    name = name,
)

fun ChildrenResponse.asChildren() = Children(
    books = books,
    id = id,
    name = name

)