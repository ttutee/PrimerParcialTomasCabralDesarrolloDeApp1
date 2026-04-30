package edu.uade.primerparcial.viewmodel

import androidx.lifecycle.ViewModel
import edu.uade.primerparcial.data.PokemonRepository
import edu.uade.primerparcial.model.Pokemon
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow

/**
 * ViewModel encargado de gestionar el estado de la UI.
 * Obtiene los datos desde el Repository y los expone como StateFlow.
 * Permite separar la lógica de negocio de la capa de presentación.
 */

class PokemonViewModel(
    private val repository: PokemonRepository = PokemonRepository()
) : ViewModel() {

    private val _pokemons = MutableStateFlow<List<Pokemon>>(emptyList())
    val pokemons: StateFlow<List<Pokemon>> = _pokemons.asStateFlow()

    init {
        loadPokemons()
    }

    private fun loadPokemons() {
        _pokemons.value = repository.getPokemons()
    }
}