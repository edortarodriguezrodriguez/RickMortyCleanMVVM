package com.example.rickmortycleanmvvm.model

import com.example.domain.model.Character
import com.example.rickmortycleanmvvm.model.base.BaseState

class FavoritesCharactersState(
    isLoading: Boolean = false,
    characters: List<Character>? = null,
    error: ErrorType? = null
) : BaseState<List<Character>>(isLoading, characters, error)