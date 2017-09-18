package com.meier.marina.trainme.ui.home

import com.meier.marina.trainme.domain.interactor.TrainingInteractor
import com.meier.marina.trainme.ui.base.BaseViewModel
import javax.inject.Inject

class HomeViewModel @Inject constructor(
        val trainingInteractor: TrainingInteractor)
    : BaseViewModel() {

    init {

    }

}
