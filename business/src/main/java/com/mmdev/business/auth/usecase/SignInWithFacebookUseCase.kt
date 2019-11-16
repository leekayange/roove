package com.mmdev.business.auth.usecase

import com.mmdev.business.auth.repository.AuthRepository
import com.mmdev.business.core.usecase.SingleWithParamUseCase
import com.mmdev.business.user.model.UserItem
import io.reactivex.Single

/* Created by A on 29.08.2019.*/

/**
 * This is the documentation block about the class
 */

class SignInWithFacebookUseCase (private val repository: AuthRepository):
		SingleWithParamUseCase<String, UserItem> {

	override fun execute(t: String): Single<UserItem> = repository.signInWithFacebook(t)

}