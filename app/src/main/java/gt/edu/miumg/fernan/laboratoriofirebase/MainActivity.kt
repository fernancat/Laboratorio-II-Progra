package gt.edu.miumg.fernan.laboratoriofirebase

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.activity.viewModels
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import gt.edu.miumg.luis.laboratoriofirebase.navigation.NavManager
import gt.edu.miumg.luis.laboratoriofirebase.ui.theme.LaboratorioFirebaseTheme
import gt.edu.miumg.luis.laboratoriofirebase.view.login.TabView
import gt.edu.miumg.luis.laboratoriofirebase.viewmodel.LoginViewModel
import gt.edu.miumg.luis.laboratoriofirebase.viewmodel.NotesViewModel

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        val loginViewModel: LoginViewModel by viewModels()
        val notesViewModel: NotesViewModel by viewModels()
        setContent {
            LaboratorioFirebaseTheme {
                NavManager(loginViewModel = loginViewModel, viewModel = notesViewModel)
            }
            }
        }
    }
}
