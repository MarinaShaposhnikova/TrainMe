package com.meier.marina.trainme.ui.home

import com.meier.marina.trainme.domain.interactor.TrainingInteractor
import com.meier.marina.trainme.ui.base.BaseViewModel
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.rxkotlin.subscribeBy
import javax.inject.Inject

class HomeViewModel @Inject constructor(
        val trainingInteractor: TrainingInteractor) : BaseViewModel() {

    init {
    }

    fun addMock() {
        trainingInteractor.addTraining()
                .observeOn(AndroidSchedulers.mainThread())
                .subscribeBy(  // named arguments for lambda Subscribers
                        onSuccess = { println(it) },
                        onError = { it.printStackTrace() }
                )
    }
}
