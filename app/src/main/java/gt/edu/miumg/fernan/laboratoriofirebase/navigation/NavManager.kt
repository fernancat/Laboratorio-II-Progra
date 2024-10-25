package gt.edu.miumg.fernan.laboratoriofirebase.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import gt.edu.miumg.fernan.laboratoriofirebase.view.login.BlankView
import gt.edu.miumg.fernan.laboratoriofirebase.view.login.RegisterView
import gt.edu.miumg.fernan.laboratoriofirebase.view.login.TabView
import gt.edu.miumg.fernan.laboratoriofirebase.view.notas.HomeView
import gt.edu.miumg.fernan.laboratoriofirebase.viewmodel.LoginViewModel
import gt.edu.miumg.fernan.laboratoriofirebase.viewmodel.NotesViewModel

@Composable
fun NavManager(
    loginViewModel: LoginViewModel,
    viewModel: NotesViewModel
){
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = "blank"){
        composable("login"){
            TabView(navController =  navController, loginViewModel = loginViewModel)
        }
        composable("register"){
            RegisterView(navController = navController, loginViewModel = loginViewModel)
        }
        composable("home"){
            HomeView(navController =  navController, viewModel = viewModel)
        }
        composable("blank"){
            BlankView(navController = navController)
        }
    }
}