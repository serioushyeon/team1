package com.sopt.at.sopkathon.team1.presentation.dummyscreens.home

import androidx.lifecycle.ViewModel
import com.sopt.at.sopkathon.team1.data.repositoryimpl.Team1RepositoryImpl
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import javax.inject.Inject

@HiltViewModel
class HomeViewModel @Inject constructor(
    private val team1RepositoryImpl: Team1RepositoryImpl
) : ViewModel() {
    private val _userId = MutableStateFlow(0L)
    val userId = _userId.asStateFlow()

    fun updateUserId(id: Long) {
        _userId.value = id
    }
}