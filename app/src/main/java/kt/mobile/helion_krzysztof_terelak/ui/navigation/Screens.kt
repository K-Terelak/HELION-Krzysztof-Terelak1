package kt.mobile.helion_krzysztof_terelak.ui.navigation

import kt.mobile.helion_krzysztof_terelak.util.Constants.SCREEN_MAIN

sealed class Screens(val route:String) {
    object Main:Screens(route = SCREEN_MAIN)
}