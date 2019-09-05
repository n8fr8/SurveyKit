package com.quickbirdstudios.survey_kit.result

import android.os.Parcelable
import com.quickbirdstudios.survey_kit.StepIdentifier
import kotlinx.android.parcel.Parcelize
import java.util.*

@Parcelize
data class StepResult(
    override val id: StepIdentifier,
    override val startDate: Date,
    override var endDate: Date = Date(),
    var results: MutableList<QuestionResult> = mutableListOf()
) : Result, Parcelable