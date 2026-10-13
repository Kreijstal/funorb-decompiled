# Reading Brick-a-brac

Java here is the single published version. Rebuild with Deko’s `readable/reproduce-brickabrac.mjs`. The reverse dictionary is `../../decompilation/brickabrac-naming.json`.

This pass reviews 47 class identities across 420 compiled classes. Other names remain unresolved. Numbered state masks/words identify observed storage without guessing server semantics. Identifiers have no opaque suffixes; reversal recovers original bytes.

| Start here | Follow |
| --- | --- |
| [GameplayScreen](GameplayScreen.java) → [MultiplayerMatch](MultiplayerMatch.java) → [PlayerBoard](PlayerBoard.java) | Gameplay screen, multiplayer match and per-player boards. |
| [MovingBody](MovingBody.java) / [RectangleBody](RectangleBody.java) / [CircleBody](CircleBody.java) | Fixed8 body coordinates/velocities, rectangle/circle geometry, snapshots and checksums. |
| [Paddle](Paddle.java) / [Ball](Ball.java) / [Brick](Brick.java) | Paddle size stages, balls and bricks. |
| [IntrusiveNode](IntrusiveNode.java) / [NodeDeque](NodeDeque.java) | Intrusive ownership and deque traversal/transfer. |
| [IntHistoryBuffer](IntHistoryBuffer.java) / [ObjectHistoryBuffer](ObjectHistoryBuffer.java) | Absolute indices, circular retention and future/erased history boundaries. |
| [PowerUp](PowerUp.java) / [ScorePopup](ScorePopup.java) | Falling/scheduled power-ups and score-popup lifetime. |
| [BrickMotionPath](BrickMotionPath.java) / [MotionWaypoint](MotionWaypoint.java) | Cyclic waypoint order, destination duration and integer position/velocity interpolation. |
| [PacketBuffer](PacketBuffer.java) / [BitPacketBuffer](BitPacketBuffer.java) / [LegacyUtf8Decoder](LegacyUtf8Decoder.java) | Big-endian bytes, compact integers, strings, bit streams, cipher arithmetic and body snapshots. |
| [IsaacGenerator](IsaacGenerator.java) / [GameplayAudioEvent](GameplayAudioEvent.java) | Deterministic board/cipher random state and queued gameplay audio codes/details. |
| [LevelSequence](LevelSequence.java) → [LevelPack](LevelPack.java) / [LevelMetadata](LevelMetadata.java) / [LevelPackLoader](LevelPackLoader.java) | Level order, pack payloads, metadata and archive loading. |
| [LevelDecoder](LevelDecoder.java) / [IntNode](IntNode.java) | Level versions0–5, brick groups, paths and retained integer state. |
| [Rasterizer2D](Rasterizer2D.java) / [SpriteGeometry](SpriteGeometry.java) / [RgbSprite](RgbSprite.java) / [ArgbSprite](ArgbSprite.java) | Pixel targets, clipping, cropped RGB/ARGB sprites and transforms. |
| [DualLinkNode](DualLinkNode.java) | Secondary cache links/key independent of primary intrusive ownership. |
| [MenuScreen](MenuScreen.java) / [MenuButton](MenuButton.java) / [MenuSelection](MenuSelection.java) | Button geometry, selected index, input codes and menu hooks. |
| [MainMenuScreen](MainMenuScreen.java) / [LevelSelectScreen](LevelSelectScreen.java) / [MembershipBenefitsScreen](MembershipBenefitsScreen.java) / [TimedSplashScreen](TimedSplashScreen.java) / [BlankScreen](BlankScreen.java) | Main menu, level selection, membership benefits, timed splash and blank screens. |
| [GameCanvas](GameCanvas.java) | Canvas focus boundary and screen registry helper. |
| [LevelList](LevelList.java) / [MouseInput](MouseInput.java) / [MouseWheelSource](MouseWheelSource.java) / [MouseWheelInput](MouseWheelInput.java) | Level-number scrolling/selection, mouse snapshots and accumulated wheel input. |

Focused raw/named probes check body geometry, paddle sizes, player masks, deque ownership, histories, power-ups, waypoint motion, selected contacts, packet operations and body/path snapshots. ISAAC fixtures use an independent unsigned-word model anchored to [Bob Jenkins’s published vectors](https://burtleburtle.net/bob/rand/randvect.txt), then compare seeded words/state, refill/counter boundaries, bounded rejection, shuffling, board random-call accounting and opcode bytes. Audio fixtures check event construction; playback remains unverified. The client flag uses a headless Applet-compatible shim and board/match construction is bypassed. Full board snapshots, swept collision detection, gameplay, score accounting, live multiplayer and browser/phone behavior remain unverified.

Level fixtures check sequence order/repeats and caller-owned arrays, metadata labels/fields, payload-only pack appends, empty pack loading, all versions0–5, legacy regrouping, generated borders, path counts, wrapper delegation and early rejection. They retain negative-version default bricks and unchanged metadata after payload append. Metadata attribute byte/word and pack completion word remain qualified. Nonempty archive retrieval, full board initialization and rendered level selection remain unverified.

Pixel fixtures check clipped solid/alpha fills and lines, darkening/grayscale, clip save/restore/reset, clear bounds, RGB copy/zero transparency and ARGB per-pixel rounding. Sprite fixtures check crop placement, copies, mirrors, quarter-turns, hit testing and raster binding. Secondary-link fixtures keep primary ownership intact. Gradients, arbitrary lines, transparent-border trimming, image decoding and full browser presentation remain unverified.

Menu fixtures check a real base-menu subclass, button rectangles/lookup/markers, entry selection, key-code predicates, horizontal wrap/held suppression, direct selection and registry bounds. Blank/benefits/splash constructors retain their IDs; canvas focus-loss callbacks retain their latch. Other screen roles come from registration and inspected callers. Level-list fixtures preserve row geometry, unclamped/direct and clamped/delta scrolling, first/last selection, numeric key navigation and pointer-selection sentinels. Mouse fixtures exercise AWT callbacks, frame latches, wheel polling and the reflective wheel factory (including its owned class-name literal). Preview fixtures bypass screen construction and check decoding/path attachment, fixed8 bounds, excluded/border bricks, stationary preview velocity and repeated clearing. Font metrics are controlled; OS event dispatch, list rendering, full menu startup, action dispatch, transition installation and rendered menu flows remain unverified.

Decompiler source commit: 1d183d3ba75fc0a8cd3af1544591b8c463c0e1ff. Tracked-source Git tar SHA-256: 7230d95fc7b957c8c56c76ed8203e42c1808e0084711cfd0495f47d8a692e8cd. This identifies decompiler source, not a gamepack JAR.
