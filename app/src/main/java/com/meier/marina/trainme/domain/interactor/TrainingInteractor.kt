package com.meier.marina.trainme.domain.interactor

import com.meier.marina.trainme.data.repository.TrainingRepository
import io.reactivex.Single
import javax.inject.Inject

class TrainingInteractor @Inject constructor(val trainingRepository: TrainingRepository) {

    fun addTraining(): Single<Boolean> {
        return trainingRepository.addTraining()
    }
}
