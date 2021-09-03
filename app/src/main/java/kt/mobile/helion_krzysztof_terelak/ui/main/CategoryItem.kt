package kt.mobile.helion_krzysztof_terelak.ui.main

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import kt.mobile.helion_krzysztof_terelak.R
import kt.mobile.helion_krzysztof_terelak.data.entities.Category

@Composable
fun CategoryItem(
    category: Category,
) {
    val openDialog = remember { mutableStateOf(false) }

    Column(
        modifier = Modifier
            .clickable { openDialog.value = true }
            .padding(12.dp)
            .fillMaxWidth()
            .clip(RoundedCornerShape(4.dp))
            .background(MaterialTheme.colors.primary)
    ) {

        Text(
            modifier = Modifier.padding(8.dp),
            text = category.name ?: stringResource(R.string.name_not_found),
            fontSize = 20.sp,
            color = MaterialTheme.colors.onPrimary
        )
    }


    //AlertDialog
    if (openDialog.value) {
        AlertDialog(
            backgroundColor = MaterialTheme.colors.primary,
            contentColor = MaterialTheme.colors.onPrimary,
            onDismissRequest = { openDialog.value = false },
            text = {
                Column(modifier = Modifier.padding(4.dp)) {
                    Text(
                        text = "Kategoria: ${category.name}",
                        fontSize = 16.sp,
                        color = MaterialTheme.colors.onPrimary
                    )

                    Spacer(modifier = Modifier.padding(4.dp))

                    Text(
                        text = "ID: ${category.id}",
                        fontSize = 16.sp,
                        color = MaterialTheme.colors.onPrimary
                    )

                    Spacer(modifier = Modifier.padding(4.dp))

                    Text(
                        text = "Ilość książek: ${category.books}",
                        fontSize = 16.sp,
                        color = MaterialTheme.colors.onPrimary
                    )
                }

            },
            confirmButton = {
                Button(
                    onClick = { openDialog.value = false },
                    Modifier.background(MaterialTheme.colors.primary)
                ) {
                    Text(text = "OK", color = MaterialTheme.colors.onPrimary)
                }
            }
        )
    }
}
