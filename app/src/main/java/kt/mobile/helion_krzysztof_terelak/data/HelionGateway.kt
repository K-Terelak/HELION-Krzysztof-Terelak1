package kt.mobile.helion_krzysztof_terelak.data

import kt.mobile.helion_krzysztof_terelak.data.entities.Categories

interface HelionGateway {

    suspend fun getAllCategories(): Categories

}