# Reading Steel Sentinels

Java here is the single published version. Rebuild from pinned raw Git input with Deko’s `readable/reproduce-steelsentinels.mjs`. The current reverse dictionary is `../../decompilation/steelsentinels-naming.json`.

This gameplay naming pass names 28 reviewed classes across 347 compiled classes. Unknown class/member purposes remain unresolved. Profile and charge names describe observed roles; finer encodings remain open. Renamed identifiers have no opaque suffixes; the dictionary preserves original identities.

| Start here | Follow |
| --- | --- |
| [GameplayController](GameplayController.java) → [CombatWorld](CombatWorld.java) | Player control, game display, world updates and synchronization checksum. |
| [Sentinel](Sentinel.java) | Sentinel position/velocity, player/team, chassis, modules, armour, charge, command queues and combat updates. |
| [SentinelCommand](SentinelCommand.java) | Action type/variant, scheduling, activation, target coordinates, aiming and start/end simulation ticks. |
| [Projectile](Projectile.java) / [Explosion](Explosion.java) / [ParticleEffect](ParticleEffect.java) | Projectiles, explosions and visual effects. |
| [BattleTerrain](BattleTerrain.java) | Terrain layout, ground/secondary/surface profiles and spawn positions. |
| [SentinelDesigner](SentinelDesigner.java) → [ArticulatedPart](ArticulatedPart.java) / [PartInstruction](PartInstruction.java) | Engineering UI and sprite-backed articulated part configuration. |
| [PacketBuffer](PacketBuffer.java) / [CipherPacketBuffer](CipherPacketBuffer.java) / [IsaacRandom](IsaacRandom.java) | Big-endian primitive/slice data, MSB-first bit fields, ciphered opcodes and deterministic seeded random generation. |
| [NodeHashTable](NodeHashTable.java) | Long-key intrusive buckets, collision lookup and traversal. |

Start with `Sentinel.scheduleCommand`, `advanceCommandQueues`, `executeCommand`, `CombatWorld.advanceSimulation`, `Sentinel.advanceCombatState`, `configureDesign`, `hasModuleType`, `reduceArmour` and `consumeCharge`. Positions retain their fixed-point scale: ground contacts index `worldX >> 4`, and terrain heights convert to inverted world Y with `-(height << 4)`. Physics velocities are distinct from armour; the sentinel constructor starts vertical velocity at 1000.

`computeSyncChecksum` retains Java integer wrapping and the original state fields. Module aliases, noncanonical dummy-guard behaviour, negative armour and unusual charge values are preserved. `ArticulatedPart.getTotalArmour` recursively aggregates attachment contributions.

`CipherPacketBuffer.beginBitReading`, `readBits` and `endBitReading` use a separate read bit cursor: bits are consumed most-significant first, then the byte cursor rounds up. `writeCipheredOpcode`, `readCipheredOpcode` and `readCipheredBytes` add/subtract successive ISAAC words modulo 256. `IsaacRandom.nextInt` consumes each 256-word block backwards; `nextIntBounded` rejects a tail of the 32-bit population before returning a nonnegative remainder. These names expose the existing wire/random behaviour without changing it. Dummy guards remain part of the original signatures.

`NodeHashTable` uses power-of-two bucket counts and intrusive nodes. `put` moves an already linked node; it does not replace a distinct node with the same key. `get` returns the first matching node and iteration visits buckets in ascending order. The packet/random/table classes retain unrelated static UI helpers from the original class layout.

Compilation and symbol/override checks cover the complete game. The raw/named core probe independently checks module aliases/bonuses, armour and charge mutations, terrain boundaries, part aggregation, synchronization checksums, command timing, queue routing, ordering and equal-tick replacement. Packet fixtures cover every bit alignment/width, primitive byte order, slice offsets, cipher consumption across block boundaries, bounded-random rejection and hash collisions/duplicate keys. Ciphertext traces must also match the raw export; round trips alone are insufficient. It allocates controlled world/sentinel/terrain fixtures without game construction and replaces only the client branch-control flag at runtime. It does not prove whole-game playability, projectile simulation, rendering or live server compatibility. Dictionary reversal recovers every original source byte.

This is a naming pass. Three files still contain compiler dispatcher fallbacks, and large methods remain. Further work should explain weapon/projectile variants, command dispatch, physics/collision, tutorial flow and multiplayer packets.
