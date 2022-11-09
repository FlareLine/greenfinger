package com.flareline.greenfinger

import net.fabricmc.api.ModInitializer

const val MOD_ID: String = "greenfinger"

@Suppress("unused")
object Greenfinger: ModInitializer {
	override fun onInitialize() {
		println("Initializing.")
	}
}
