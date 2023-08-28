package com.example.unscramble.ui
import kotlinx.coroutines.flow.MutableStateFlow

data class GameUiState(
    val currentScrambledWord: String = "",
    var isGuessedWordWrong: Boolean = false,
    val score: Int = 0,
    val currentWordCount: Int= 1,
    val isGameOver: Boolean = false
)