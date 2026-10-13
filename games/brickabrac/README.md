# Reading Brick-a-brac

Java here is the single published version. Rebuild with Deko’s `readable/reproduce-brickabrac.mjs`. The reverse dictionary is `../../decompilation/brickabrac-naming.json`.

This pass reviews 21 class identities across 420 compiled classes. Other names remain unresolved. Numbered state masks/words identify observed storage without guessing server semantics. Identifiers have no opaque suffixes; reversal recovers original bytes.

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

Focused raw/named probes check body checksums/overlaps, paddle sizes, player masks, deque ownership, histories, popup expiry, scheduled power-up routing, ball effects, waypoint motion, selected brick contacts, packet primitives/strings/bits, CRC and block operations, and body/paddle/ball/brick/path snapshot decoding. Opcode fixtures check cipher arithmetic against a separate instance of the existing generator; the generator itself is not independently verified. The client branch flag is supplied by a headless Applet-compatible shim; board/match construction is bypassed. Contact fixtures supply scratch coordinates and cover two brick types. Full board snapshots, swept collision detection, gameplay, score accounting, live multiplayer and browser/phone behavior remain unverified.

Decompiler source commit: 1d183d3ba75fc0a8cd3af1544591b8c463c0e1ff. Tracked-source Git tar SHA-256: 7230d95fc7b957c8c56c76ed8203e42c1808e0084711cfd0495f47d8a692e8cd. This identifies decompiler source, not a gamepack JAR.
