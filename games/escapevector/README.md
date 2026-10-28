# Reading Escape Vector

This is the only published Java tree. Reviewed rules and the reproducer live in dekobloko-work/readable. The current reverse dictionary is ../../decompilation/escapevector-naming.json.

This pass names 76 reviewed classes and 1000 symbols across all 348 sources. Unresolved roles keep their existing names; reviewed names have no opaque suffix.

Coverage: 78/349 class declarations and 312/2781 methods have readable names; 277 constructors follow their owning class. 271 classes and 2469 methods remain opaque. Full naming is incomplete. The coverage command exits nonzero until every owned class and method is named; constructors and existing Java callbacks retain their required spellings.

## Entry points

`EscapeVector.updateClient` services input, audio, menus and the active session. `renderClient` calls `renderFrame`, which chooses dialogue, gameplay or another screen. `IntValueNode.startSelectedLevel` constructs `BoundedRandomAccessFile.activeSession` and calls `GameplaySession.startSession`. These unrelated static helpers remain on their original owners because the original client scatters globals across classes.

`GameplaySession.updateSession` contains ship physics, terrain collision, object interactions, mission state and effects. `renderSession` draws the world, HUD and `Minimap`. Ship position/velocity and spawn coordinates have Q16 names: divide by 65536 for pixels. The world wraps horizontally. `levelIndex < 0` selects tutorial behavior. Mission IDs and type codes remain their original integers.

## Level format and mission state

`decodeLevelStream` reads formatVersion, then calls `readObjectiveType`, `readCountdown`, `loadTerrain`, `readLevelObjects`, `readSeekerMines`, `readSpawnAndFuel`, `readShieldEnergy`, `readInitialPowerups` and `readGravity` in that exact order. `decodeLevelBytes`, `installLevelBytes`, `loadCurrentLevel` and `selectLevel` distinguish decoding from installing render/ship state. The original handling of IOException and guard side effects remains.

Objective type is present from version five (zero retrieves cargo; one destroys targets). Version six adds countdown trigger/ticks; `activateCountdown` and `updateCountdown` retain the trigger conditions and fatal expiry. Version three adds Q16 spawn coordinates and initial fuel; version four adds shield energy; version seven adds initial powerup IDs; version eight adds whitelisted Q16 gravity. Default fuel is 2500, shield energy 150 and gravity 512. Unrecognized gravity values retain the supplied default.

`readLevelObject` reads type and unsigned-short pixel coordinates, including the pre-version-two type migration. Version five adds missionTarget, version six adds triggersCountdown and version nine adds an integer spriteFrame. missionTargets and pendingTargetEffects must both empty before a destruction objective is complete; finishing a target also waits for its effect. `recordInfrastructureDestroyed` tracks a separate completion count.

`resetShipState` restores fuel/shield, position and velocity, clears cargo and combat state, and creates fresh projectile queues. shipAngle256 wraps at 256; thrustAccelerationQ16 uses fixed-point acceleration. tetheredObjectType, tetheredXQ16 and pickupAnimationTicks describe cargo/powerup handling. `destroyShip`, `hasShipReachedExit` and `isMissionComplete` distinguish death, leaving the world and meeting the objective.

## Terrain and level objects

`loadTerrain` reads `TerrainMap`, installs dimensions/themes/masks and calls `snapshotTerrain`. Each tile is 32 by 32 pixels. Null is empty; `QuickChatPhraseDefinition.fullTileMask` is the shared all-solid identity sentinel, whose array is empty. Partial masks are independently mutable arrays of 32 integer row masks. Four two-bit tile codes occupy each packed byte. `AccountRegistrationPanel.decodeTerrainQuadrants` and `TerrainMaskSupport.decodeTerrainQuadrant` recursively decode partial tiles; their unrelated account/UI globals are retained. Version ten adds a separate secondary theme byte.

`LevelObject` identifies a placed object by objectId/objectType and pixel x/y. Its collision sprite, display sprite and animation frame are distinct. `stampTerrain` ORs nontransparent sprite pixels into collision masks; `removeFromTerrain` clears them, copying a full sentinel before mutation. `initializeLevelObjects` stamps these objects, links gates and constructs the minimap. `buildTutorialTerrain` constructs the tutorial arena directly.

`SeekerMine` owns current/home positions, velocity and two sound handles. `RockBuster` owns Q16 motion, angle, remaining flight ticks, exhaust and flight sound. `LaserGateSpan` stores pixel leftX/rightX/y; rendering wraps the horizontal span. Destroying a LevelObject, SeekerMine, RockBuster or laser span has a distinct session method. HudMessage/hudMessageQueue retain text and display duration; pointCloudEffects is a separate effect queue.

`DynamicTerrainRenderer` is selected for terrain theme four; other themes use the session terrain path. `invalidateTileNeighborhood` marks a 3x3 region dirty following edits. `PointCloudEffect` owns per-point fixed-point motion, masks and drawing. These names do not claim that every effect or object type has been identified.

## Dialogue and shared engine

`PcmStream` defines process/mixInto/skip, firstSubstream/nextSubstream, activity and priority for all concrete audio streams. PcmStreamMixer owns its substreams and timed PcmMixerListener queue. PcmSample/PcmSampleStream/PcmResampler expose PCM bytes, loops, interpolation and resampling. AudioOutput and JavaSoundAudioOutput distinguish device lifecycle hooks from stream mixing. ReverbPcmStream uses separate ReverbCombFilter and ReverbAllPassFilter rings.

`ResourceArchive` consumes ArchiveProvider; CachedArchiveProvider combines Js5Transport with SectorCacheStore, BufferedRandomAccessFile and DiskCacheWorker. ArchiveIndex holds reference metadata; ArchiveRequest has separate network/disk implementations. SystemTaskService owns operating-system work represented by SystemTask. CipherPacketBuffer/IsaacRandom distinguish opcode encryption from ordinary PacketBuffer byte encodings; WhirlpoolHasher and Bzip2Decoder/Bzip2State identify archive digest and decompression work.

`DialogueScreen.advanceDialogue` handles reveal timing, input and scene changes; `drawDialogue` draws the current image/text. IntrusiveNode/IntrusiveDeque expose primary ownership and traversal; DualLinkNode has independent secondary links. Sprite/SpriteState separate RGB pixels, trimmed dimensions and offsets. SoftwareRasterizer holds the shared framebuffer and clipping. PacketBuffer and SoundEnvelope expose byte decoding and envelope interpolation.

## Reproduce and verify

From dekobloko-work:

```sh
node readable/build-escapevector-rules.mjs --check
node readable/reproduce-escapevector.mjs --update
node readable/reproduce-escapevector.mjs --check
node scripts/check-source-catalog.mjs ../funorb-decompiled
node readable/naming-coverage.mjs escapevector
node readable/tests/test-escapevector-core.mjs /path/to/original/escapevector.jar
```

The exact raw input is pinned to Git. Existing generic java-tools declaration and decision proofs run across every file from a verified compiler-source archive, without game assumptions or compiler flags. Each stage is checked for determinism and idempotence, and its hashes/counts are retained in the current dictionary. Naming binds declarations/references/overrides, compiles the complete raw/named corpus and retains reversible edits. No generated sources or binary dependencies are stored in Deko.

Native fixtures compare historical, prepared and named implementations against independent expectations for versioned terrain headers, empty/full/partial masks, sprite collision stamping/removal and deque transfers. Independently authored complete level streams cover versions zero through eleven, exact byte consumption, target/countdown/frame boundaries, seeker positions, powerup filtering, fuel/shield defaults and objective/gravity whitelists. The fixed original gamepack passes these fixtures too. These focused checks do not prove whole-game behavior, multiplayer compatibility or frame rate. The original mutable obfuscationControl and guard branches remain; unsupported structural recovery and unresolved local names still need review.
