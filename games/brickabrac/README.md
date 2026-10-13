# Reading Brick-a-brac

Java here is the single published version. Rebuild with Deko’s `readable/reproduce-brickabrac.mjs`. The reverse dictionary is `../../decompilation/brickabrac-naming.json`.

This pass reviews 12 class identities across 420 compiled classes. Other names remain unresolved. Numbered state masks/words identify observed storage without guessing server semantics. Identifiers have no opaque suffixes; reversal recovers original bytes.

| Start here | Follow |
| --- | --- |
| [GameplayScreen](GameplayScreen.java) → [MultiplayerMatch](MultiplayerMatch.java) → [PlayerBoard](PlayerBoard.java) | Gameplay screen, multiplayer match and per-player boards. |
| [MovingBody](MovingBody.java) / [RectangleBody](RectangleBody.java) / [CircleBody](CircleBody.java) | Fixed8 body coordinates/velocities, rectangle/circle geometry, snapshots and checksums. |
| [Paddle](Paddle.java) / [Ball](Ball.java) / [Brick](Brick.java) | Paddle size stages, balls and bricks. |
| [IntrusiveNode](IntrusiveNode.java) / [NodeDeque](NodeDeque.java) | Intrusive ownership and deque traversal/transfer. |

Focused raw/named probes check body constructors/checksums, circle overlap boundaries, paddle growth/shrink/reset, player-state mask getters and deque ownership/order. The client branch flag is supplied by a headless Applet-compatible shim; player-board/match construction is bypassed for mask fixtures. Full ball/brick collision response, snapshots, gameplay input/rendering, live multiplayer and browser/phone behavior remain unverified.

Decompiler source commit: 1d183d3ba75fc0a8cd3af1544591b8c463c0e1ff. Tracked-source Git tar SHA-256: 7230d95fc7b957c8c56c76ed8203e42c1808e0084711cfd0495f47d8a692e8cd. This identifies decompiler source, not a gamepack JAR.
