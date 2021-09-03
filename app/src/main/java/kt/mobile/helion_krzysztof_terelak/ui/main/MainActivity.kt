package kt.mobile.helion_krzysztof_terelak.ui.main

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import dagger.hilt.android.AndroidEntryPoint
import kt.mobile.helion_krzysztof_terelak.ui.navigation.HelionNavGraph
import kt.mobile.helion_krzysztof_terelak.ui.theme.HELIONKrzysztofTerelakTheme

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            HELIONKrzysztofTerelakTheme {
                HelionNavGraph()
            }
        }
    }
}
