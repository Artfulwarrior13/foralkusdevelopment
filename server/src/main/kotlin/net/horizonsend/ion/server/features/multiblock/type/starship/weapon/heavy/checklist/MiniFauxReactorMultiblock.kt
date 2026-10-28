package net.horizonsend.ion.server.features.multiblock.type.starship.weapon.heavy.checklist

import net.horizonsend.ion.server.core.registration.keys.CustomBlockKeys
import net.kyori.adventure.text.Component
import net.kyori.adventure.text.Component.text

object MiniFauxReactorMultiblock : AbstractMiniReactorCore({ customBlock(CustomBlockKeys.SCORDITE_BLOCK.getValue())}) {
	override val displayName: Component get() = text("AI Reactor")
	override val description: Component get() = text("Reactor core used for a AI Sub-capital functionality.")

	override val name: String = "AIGunshipReactor"

	override val signText = createSignText(
		"&7-=[&c==&a==&b==&7]=-",
		"&0AI",
		"&7&cFusion Reactor&7",
		"&7-=[&c==&a==&b==&7]=-"
	)
}
