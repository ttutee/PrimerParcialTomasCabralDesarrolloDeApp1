package edu.uade.primerparcial

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import edu.uade.primerparcial.ui.screens.PokemonListScreenFinal
import edu.uade.primerparcial.ui.theme.PrimerParcialTheme

/**
 * Punto de entrada de la aplicación.
 * Se encarga únicamente de inicializar el contenido y aplicar el Theme.
 * No contiene lógica de negocio ni UI compleja, respetando separación de responsabilidades.
 */

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        setContent {
            PrimerParcialTheme {
                PokemonListScreenFinal()
            }
        }
    }
}