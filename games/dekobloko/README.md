# Reading Deko Bloko

The Java in this directory is the single published version. Deko’s naming script rebuilds it from pinned Git input; the reverse dictionary is in `decompilation/dekobloko-naming.json`.

All 343 classes have stable names. 58 class names are reviewed semantic anchors; other class names describe the structural category and explicitly retain an unresolved finer purpose. Type-based member names are also provisional. Numbers are deterministic labels, not original obfuscated suffixes.

| Follow | Purpose |
| --- | --- |
| [DekoBlokoClient](DekoBlokoClient.java) → [GameSession](GameSession.java) | Loading, screens and active game-session coordination. |
| [BucketBoard](BucketBoard.java) | Bucket cells, active domino, controls, gravity, locking and multiplayer snapshots. |
| [ReturnedShape](ReturnedShape.java) / [ReturnedShapeCache](ReturnedShapeCache.java) | Returned cooked-shape bitmaps and their cache. |
| [AnimatedTileRegion](AnimatedTileRegion.java) | Animated tile-region splitting. |
| [RichTextLayout](RichTextLayout.java) / [TextLineMetrics](TextLineMetrics.java) / [TextLayout](TextLayout.java) | Styled text layout and per-line character metrics, also used by tutorial UI. |
| [LoginCredentials](LoginCredentials.java) / [ThemeTips](ThemeTips.java) | Login credentials; static tutorial and theme-tip text. |
| [GameAssets](GameAssets.java) / [TranslatedUiText](TranslatedUiText.java) | Game assets and translated UI strings. |
| [SceneWidget](SceneWidget.java) / [UiComponent](UiComponent.java) | Scene and reusable component hierarchies. |
| [PacketBuffer](PacketBuffer.java) / [CipherPacketBuffer](CipherPacketBuffer.java) / [BufferedSocket](BufferedSocket.java) | Packet serialization, cipher buffer and socket transport. |
| [SoftwareRaster](SoftwareRaster.java) / [RgbSprite](RgbSprite.java) / [IndexedSprite](IndexedSprite.java) | Software pixels and sprites. |

`BucketBoard.decodeMultiplayerSnapshot`, `applyControls`, `finalizePiecePlacement` and `buildCookedFeedbackShape` follow identities exercised by the existing original-bytecode differential. Follow `moveLeft`, `moveRight`, both rotation methods, `pieceCollides`, `advanceDropCountdown` and `tryDropAndReportCollision` for active-piece movement. Board dimensions, piece coordinates, countdowns, controls, lives and cell arrays have semantic names.

Compilation and symbol/override verification cover the complete game. Exact dictionary reversal verifies all input bytes. These checks do not establish whole-game runtime equivalence.
