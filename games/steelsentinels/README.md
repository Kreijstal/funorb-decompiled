# Reading Steel Sentinels

Java here is the single published version. Rebuild from pinned raw Git input with Deko’s `readable/reproduce-steelsentinels.mjs`. The current reverse dictionary is `../../decompilation/steelsentinels-naming.json`.

This first gameplay pass names 27 reviewed classes across 347 compiled classes. Unknown class/member purposes remain unresolved. Profile and charge names describe observed roles; finer encodings remain open. Renamed identifiers have no opaque suffixes; the dictionary preserves original identities.

| Start here | Follow |
| --- | --- |
| [GameplayController](GameplayController.java) → [CombatWorld](CombatWorld.java) | Player control, game display, world updates and synchronization checksum. |
| [Sentinel](Sentinel.java) | Sentinel position/velocity, player/team, chassis, modules, armour, charge, command queues and combat updates. |
| [SentinelCommand](SentinelCommand.java) | Action type/variant, activation and start/end simulation ticks. |
| [Projectile](Projectile.java) / [Explosion](Explosion.java) / [ParticleEffect](ParticleEffect.java) | Projectiles, explosions and visual effects. |
| [BattleTerrain](BattleTerrain.java) | Terrain layout, ground/secondary/surface profiles and spawn positions. |
| [SentinelDesigner](SentinelDesigner.java) → [ArticulatedPart](ArticulatedPart.java) / [PartInstruction](PartInstruction.java) | Engineering UI and sprite-backed articulated part configuration. |
| [PacketBuffer](PacketBuffer.java) / [CipherPacketBuffer](CipherPacketBuffer.java) / [IsaacRandom](IsaacRandom.java) | Packet data, ciphered opcodes and deterministic seeded random generation. |

Start with `CombatWorld.advanceSimulation`, `Sentinel.advanceCombatState`, `configureDesign`, `hasModuleType`, `reduceArmour` and `consumeCharge`. Positions retain their fixed-point scale: ground contacts index `worldX >> 4`, and terrain heights convert to inverted world Y with `-(height << 4)`. Physics velocities are distinct from armour; the sentinel constructor starts vertical velocity at 1000.

`computeSyncChecksum` retains Java integer wrapping and the original state fields. Module aliases, noncanonical dummy-guard behaviour, negative armour and unusual charge values are preserved. `ArticulatedPart.getTotalArmour` recursively aggregates attachment contributions.

Compilation and symbol/override checks cover the complete game. The raw/named core probe independently checks module aliases/bonuses, armour and charge mutations, terrain boundaries, part aggregation and synchronization checksums. It allocates controlled world/sentinel/terrain fixtures without game construction and replaces only the client branch-control flag at runtime. It does not prove whole-game playability, projectile simulation, rendering or server compatibility. Dictionary reversal recovers every original source byte.

This is a naming pass. Three files still contain compiler dispatcher fallbacks, and large methods remain. Further work should explain weapon/projectile variants, command dispatch, physics/collision, tutorial flow and multiplayer packets.
