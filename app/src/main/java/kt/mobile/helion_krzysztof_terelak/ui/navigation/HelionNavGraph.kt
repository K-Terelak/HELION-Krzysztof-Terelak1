package kt.mobile.helion_krzysztof_terelak.ui.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import kt.mobile.helion_krzysztof_terelak.ui.main.MainScreen

@Composable
fun HelionNavGraph() {

    val navController = rememberNavController()

    NavHost(
        navController = navController, startDestination = Screens.Main.route
    ) {

        //main
        addMain()

    }
}


private fun NavGraphBuilder.addMain(){
    composable(
        route = Screens.Main.route
    ){
        MainScreen()
    }
}