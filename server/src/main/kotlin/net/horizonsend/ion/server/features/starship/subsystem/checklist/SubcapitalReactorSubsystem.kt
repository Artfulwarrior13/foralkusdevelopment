package net.horizonsend.ion.server.features.starship.subsystem.checklist

import net.horizonsend.ion.server.core.registration.IonRegistryKey
import net.horizonsend.ion.server.features.custom.items.CustomItem
import net.horizonsend.ion.server.features.custom.items.type.GasCanister
import net.horizonsend.ion.server.features.multiblock.type.starship.weapon.heavy.checklist.AbstractMiniReactorCore
import net.horizonsend.ion.server.features.starship.active.ActiveStarship
import net.horizonsend.ion.server.features.starship.subsystem.AbstractMultiblockSubsystem
import org.bukkit.block.Sign

abstract class SubcapitalReactorSubsystem<T : AbstractMiniReactorCore>(
	starship: ActiveStarship,
	sign: Sign,
	multiblock: T,
) : AbstractMultiblockSubsystem<T>(starship, sign, multiblock) {
	abstract val fuelKey: IonRegistryKey<CustomItem, GasCanister>
}
