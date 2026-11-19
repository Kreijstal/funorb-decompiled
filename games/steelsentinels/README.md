# Reading Steel Sentinels

Java here is the single published version. Rebuild from pinned raw Git input with Deko’s `readable/reproduce-steelsentinels.mjs`. The current reverse dictionary is `../../decompilation/steelsentinels-naming.json`.

Resolved declarations: 350/350 classes and 2761/2761 methods have readable names; 283 constructors follow their class names. There are no opaque class or method names, including local loader classes and catalogue dispatcher methods. Fields and local variables are outside this complete class/method naming claim. Profile and charge names describe observed roles; finer encodings remain open. The dictionary preserves original identities.

Reproduce and validate in dekobloko-work:

```sh
env -u JAVA_TOOL_OPTIONS node readable/build-steelsentinels-rules.mjs --check
env -u JAVA_TOOL_OPTIONS node readable/reproduce-steelsentinels.mjs --check
node readable/naming-coverage.mjs steelsentinels
node --test readable/tests/test-steelsentinels-naming.mjs readable/tests/test-naming-coverage.mjs
```

`ContextMenu.loadInterfaceText` uses a local `ClientInterfaceTextLoader` for shared client text. `SectorCacheStore.loadLocalizedText` uses `SteelGameTextLoader` for campaign, equipment, tutorial, controls, designer and statistics text. Their loading stages have names based on the resource keys they read. `BattleTerrain.buildPartCatalogue` uses `PartCatalogueBuilder` to allocate sprite storage, build sentinel bodies and equipment, and index the resulting catalogue. The regeneration check rejects opaque declarations and numbered dispatcher helpers.

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
| [ResourceArchive](ResourceArchive.java) → [ArchiveProvider](ArchiveProvider.java) / [CachedArchiveProvider](CachedArchiveProvider.java) / [ArchiveIndex](ArchiveIndex.java) / [IntKeyLookup](IntKeyLookup.java) | Resource loading, versioned archive indexes and group/file name lookup. |

Start with `Sentinel.scheduleCommand`, `advanceCommandQueues`, `executeCommand`, `CombatWorld.advanceSimulation`, `Sentinel.advanceCombatState`, `configureDesign`, `hasModuleType`, `reduceArmour` and `consumeCharge`. Positions retain their fixed-point scale: ground contacts index `worldX >> 4`, and terrain heights convert to inverted world Y with `-(height << 4)`. Physics velocities are distinct from armour; the sentinel constructor starts vertical velocity at 1000.

`computeSyncChecksum` retains Java integer wrapping and the original state fields. Module aliases, noncanonical dummy-guard behaviour, negative armour and unusual charge values are preserved. `ArticulatedPart.getTotalArmour` recursively aggregates attachment contributions.

`CipherPacketBuffer.beginBitReading`, `readBits` and `endBitReading` use a separate read bit cursor: bits are consumed most-significant first, then the byte cursor rounds up. `writeCipheredOpcode`, `readCipheredOpcode` and `readCipheredBytes` add/subtract successive ISAAC words modulo 256. `IsaacRandom.nextInt` consumes each 256-word block backwards; `nextIntBounded` rejects a tail of the 32-bit population before returning a nonnegative remainder. These names expose the existing wire/random behaviour without changing it. Dummy guards remain part of the original signatures.

`NodeHashTable` uses power-of-two bucket counts and intrusive nodes. `put` moves an already linked node; it does not replace a distinct node with the same key. `get` returns the first matching node and iteration visits buckets in ascending order. The packet/random/table classes retain unrelated static UI helpers from the original class layout.

ArchiveIndex decodes formats 5–7: versions 6/7 carry a revision, version 7 uses large-smart integers, and IDs are delta-coded. Names and 64-byte group digests are separate flag-controlled tables. Arrays are indexed by actual group/file IDs, with null fileIds rows representing contiguous IDs. IntKeyLookup linear-probes interleaved key/index slots and returns the first matching input index, including negative and duplicate keys. ResourceArchive lowercases names, exposes index availability, separates packed groups from unpacked files and retains the three existing file-retention modes. CachedArchiveProvider supplies validated indexes and encoded groups from cache/network requests. Independent fixtures cover raw and gzip containers, every version/flag combination, sparse/contiguous/large IDs, checksum and digest-length rejection, name lookup and returned-file retention. This does not establish cache/network end-to-end loading or server compatibility.

Compilation and symbol/override checks cover the complete game. The raw/named core probe independently checks module aliases/bonuses, armour and charge mutations, terrain boundaries, part aggregation, synchronization checksums, command timing, queue routing, ordering and equal-tick replacement. Packet fixtures cover every bit alignment/width, primitive byte order, slice offsets, cipher consumption across block boundaries, bounded-random rejection and hash collisions/duplicate keys. Ciphertext traces must also match the raw export; round trips alone are insufficient. It allocates controlled world/sentinel/terrain fixtures without game construction and replaces only the client branch-control flag at runtime. It does not prove whole-game playability, projectile simulation, rendering or live server compatibility. Dictionary reversal recovers every original source byte.

ParticleEffect now names duration, age, effect type and its choice of terrain profile. Age gains a random 0–3 increment below 200, followed by the ordinary increment; duration is not a guaranteed count of updates. Fixtures check damping with Java truncation, terrain contact/exceptions, gravity and strict age > duration expiry. Type 10 emits a type-9 child. createParticle initializes an object from a 10,000-entry cyclic reuse buffer, not a free list: acquisition neither checks liveness nor unlinks existing membership. pendingRemovals uses DualNodeDeque secondary links until world simulation unlinks the primary links. Probes preserve those boundaries and restore the global buffer/cursor afterward.

Projectile.advanceGuidedMotion exposes launch acceleration, target steering and the gravity gate. Its target and initial-direction fields and phase-dependent locals now have reviewed names. Independent launch/coasting fixtures cover zero vectors, signed motion and ages 0, 1, 19, 128 and 129 with transient visual emission suppressed. Steering helpers now expose 8192-unit angles and 16.16 sine/cosine. Fixtures cover full-turn trig values, axis/quadrant angles, bounded turning at ages 20–127, target updates/removal and the coasting boundary. The initial-direction reversal branch, rendered effects and complete projectile collisions remain unverified.

The pinned raw input reconstructs Explosion.advanceExplosion with the generic compiler’s bounded node splitting, copy certificate and original-edge proof. Native bytecode/old/new Java fixtures cover 790 scenarios and 2,288 checks with visual emission suppressed. BattleTerrain.java and PacketLoopHelpers.java retain dispatcher fallbacks; large methods and full collision/rendering work remain.
