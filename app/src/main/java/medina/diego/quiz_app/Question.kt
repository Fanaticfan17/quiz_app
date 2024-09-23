package medina.diego.quiz_app

import androidx.annotation.StringRes

data class Question(@StringRes val textResId: Int, val answer: Boolean)
