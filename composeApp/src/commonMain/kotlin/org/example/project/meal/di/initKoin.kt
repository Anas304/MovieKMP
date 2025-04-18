package org.example.project.meal.di

import org.koin.core.context.startKoin
import org.koin.dsl.KoinAppDeclaration

fun initKoin(config: KoinAppDeclaration = {}){
    startKoin {
        config.invoke(this)
        modules(sharedModule, platformModule)
    }
}