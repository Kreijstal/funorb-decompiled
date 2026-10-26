# Reading Ace of Skies

This directory is the single published Java tree. The scripts and reviewed rules live in dekobloko-work/readable; the current reverse dictionary is ../../decompilation/aceofskies-naming.json.

This pass names 43 reviewed classes in 545 source files. Unresolved roles keep their original names; renamed names have no opaque suffix.

Start at `AceOfSkies.advanceGame` → `FlightSession.advanceSession`. `startGame` creates the player and pools; its flag selects the literal arcade mode. `renderSession` draws through `GraphicsRenderer`. `Aircraft` retains its definition, target, pursuing aircraft, firing request and temporary weapon. `FlightBody` and `Vector2` expose the flight arithmetic. `Bullet`, `Pickup`, `SmokeParticle` and `ScreenParticle` are distinct pools.

`GameAppletShell` calls `initializeClient`, `updateClient`, `renderGame`, `shutdownClient` and `releaseClientStatics`. Ace opens its game archives in `initializeGameResources`; `advanceResourceLoading` first waits for archives, builds sound caches, decodes the three music tracks, prepares patches, decodes image/font data, creates renderer resources and finally allocates the session. `initializeAfterDownload` controls whether the archive-ready poll proceeds into initialization. The inter-stage `resetFrameTiming` calls reset the clock/history and pending tick count, rather than requesting garbage collection. `loadingPercent` and `loadingMessage` expose reported progress.

`MenuScreen.open`, `advanceMenu`, `handleNavigationKey`, `handleAction`, `findItemAt` and `drawMenu` expose menu flow. `MenuInputState` distinguishes keyboard selection, pointer selection, press edges, held buttons and countdown state. The registered slots are 0 main menu, 1 pause, 2 highscores, 3 instructions, 4 achievements, 5 achievements this game, 6 logged-out result notice, and 7 settings. Menu action codes remain their original integers; action 0 starts classic play, 19 starts arcade play, 1 resumes, 3 opens instructions, 14 opens achievements, 2 opens highscores, 22 opens settings and 7 ends the game.

`updatePlayerControls` exposes left/right press edges, double-tap braking and the overheat fire latch. The tick counter advances even in attract mode; a second turn press must be strictly fewer than 50 control ticks after the previous press. Releasing fire clears the latch without setting a new fire request. `lifecyclePhase` rises to 92 on living aircraft and falls toward 2 while destroyed aircraft animate; it is distinct from weapon heat.

`startClassicWave` uses `classicWaveIndex` and `classicWaveCompositions`; `startArcadeWave` partitions a doubled wave budget using aircraft costs. Their type order differs, and the early classic type-3 definition changes after wave 10. `purchaseUpgrade` spends baseCost + upgradeCode only after acceptance. A fire-rate upgrade can increment its level and still return false when its fire interval is already 1; that edge behavior remains. `HudMessage` owns the queued text fade/hold/expiry phases.

`ScorchMark` replaces the earlier inaccurate TimedSpriteEffect name: the asset is literally scorch, the stored value is its diameter, and no timer advances it. Marks are removed by viewport culling. `SmokeParticle.ageTicks` starts at 10 and increases by five until its lifetime limit; a negative colourOrBlastRadius selects the explosion path. Screen particles expose Q8 position/radius, velocity, acceleration, previous endpoints, render mode, age, duration and opacity scale.

HUD state separates displayed/target credits and countdowns, sampled affordability, smoothed health/heat/weapon ticks, and the last displayed weapon icon during opacity fades. Background tile coordinates, tint interpolation, lightning timing and camera look-ahead are independent from aircraft coordinates. Spatial volume and Doppler pitch helpers retain reference-identity shortcuts and the original distance/zoom clamps.

`HighscoreQuery`, `ScoreSubmission` and `HighscoreNameEntry` share established roles with GeoBlox. `requestHighscores` deduplicates pending queries by queryId. `writeHighscoreQuery` and `writeScoreSubmission` preserve the original packet framing, context values and CRC32. `decodeHighscoreResponse` builds all/my/best-player views, completes and unlinks queries, and matches submission acknowledgements by a wrapping 16-bit ID. `findSubmittedScoreRow` checks the player name, server token and every score value. Ace packs its game score and accuracy as 100 * finalScore + finalAccuracyPercent; the four opaque context integers retain positional names rather than unsupported meanings.

`drawRollingDigits` names settled/target values, animation countdown, leading-zero suppression and glyph banks. Displayed score/multiplier and their pending targets remain separate until their countdown reaches zero. The number formatter uses the retained separator and preserves ungrouped negative values.

Angles in forward/polar motion use 256 units per full turn. `Vector2.angle255` preserves the separate original atan2 scaling by 255 / pi and its zero-vector value 255. `FlightBody.moveForward` subtracts sine/cosine motion and also decays headingOffset. `wrapWorld` retains its single-period boundary adjustments, including out-of-range results for positions multiple periods away. All guard parameters and unusual edge behavior remain.

The shared engine roles match other games by reviewed behavior, not by short obfuscated spelling:

| Ace | Existing counterpart | Evidence |
| --- | --- | --- |
| IntrusiveNode / IntrusiveDeque | GeoBlox IntrusiveNode / IntrusiveDeque | Independent node ownership, circular sentinel and forward/reverse links. |
| DualLinkNode / IntrusiveNodeHashTable | GeoBlox equivalents | Secondary links detach independently; hash buckets have circular sentinels, masked keys, duplicate-key lookup and bucket-order traversal. |
| PacketBuffer / CipherPacketBuffer | Steel Sentinels PacketBuffer / CipherPacketBuffer | Byte payload/cursor, big-endian widths, ISAAC and bit cursor. |
| ResourceArchive / ArchiveIndex / ArchiveProvider | Steel Sentinels equivalents | Packed/unpacked groups, versioned indexes, names/digests and provider progress. |
| HighscoreQuery / ScoreSubmission / HighscoreNameEntry | GeoBlox equivalents | Query dimensions, three views, wrapping submission IDs, context words and unique-player name markers; Ace adds acknowledgement tokens. |
| PcmSample / PcmSampleStream / MidiPcmStream | GeoBlox equivalents | Signed PCM storage, loop bounds, interpolation and MIDI channel/voice state. |

`SoundCache` separates synthesized and Vorbis archives, pending Vorbis samples and decoded PCM samples. Cache hits precede the byte-budget check; a completed sample remains reusable when the caller budget is exhausted. The shared collection fixtures check collisions, duplicate keys, bucket-order traversal, transfers and independence of primary versus secondary links.

Shared role names do not assert byte-for-byte implementation equality. Different guards, signatures, static helper placement and graphics generations remain. Core fixtures exercise actual raw and named flight/vector, packet, collection and menu implementations, compare their traces and check independent expected results. Complete source compilation and resolved declaration/reference/override comparison cover every file. Reversal recovers the reconstructed raw source bytes.

The replay reconstructs all 51 region-proved ordinary FlightSession methods directly from the fixed original bytecode. It preserves initialization and three methods handled by specialized emitters at the base source. Generic catch-copy cleanup removes the intermediate exception carrier only when every use is a copy inside the owning handler, while preserving the destination local and its written type. The current dictionary records every selected body hash and original-edge certificate checks.

The current generic compiler also removes unread typed reference stack snapshots. This drops null placeholders from final-score construction without discarding live references, moving allocations or suppressing argument effects. The full native core trace matches both the historical source and reconstructed source before naming.

The animated HUD number renderer now uses structured loops. This comes from the pinned generic decompiler: it includes a proven nonthrowing boundary latch inside the protected loop, retains throwing-PC exception routing and checks original control-flow edges. The dictionary records base input, transformed input and both method-body hashes. Reversal recovers the reconstructed raw source; the base input remains available at its pinned Git commit.

The HUD probe compares original bytecode, historical dispatcher Java and reconstructed Java drawing-call traces, including runtime-exception and Error injection. It uses controlled abstract renderer/sprite implementations with the same original final wrappers in every variant, isolating historical diagnostic-wrapper removal. Physical pixels, whole-game playability and server compatibility are not established by these focused fixtures. Account/network internals and unresolved engine names still need work. Local packet fixtures do not establish compatibility with a live server.

Reproduce with `node readable/build-aceofskies-rules.mjs --check`, `node readable/reproduce-aceofskies.mjs --update`, and `node readable/reproduce-aceofskies.mjs --check` from dekobloko-work. Each command uses pinned raw Git input and temporary compilation only. No binary dependency or second readable tree is published.
