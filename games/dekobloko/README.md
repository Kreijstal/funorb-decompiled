# Reading Deko Bloko

The Java in this directory is the single published version. Deko’s naming script rebuilds it from pinned Git input; the reverse dictionary is in `decompilation/dekobloko-naming.json`.

Resolved declarations: 165/344 classes and 1216/2468 methods have readable names; 250 constructors follow their owning class. Remaining: 179 classes and 1252 methods still need names. Numbered structural categories and type-based member labels count as unresolved; the complete naming goal remains in progress.

`MouseWheelInput`, `MouseWheelHandler` and `KeyboardInputHandler` name component registration, wheel polling and key event ownership. `NodeHashTableIterator`, `SecondaryNodeDequeIterator` and `SecondaryNodeHashTable` distinguish primary buckets from independent secondary links and duplicate-key continuation.

`AbstractAudioSample`, `PcmMixerListener`, `PcmPlayerService`, `AudioFilter` and `PcmResampler` expose sample scheduling, listener ownership, mixer input/output, filter coefficients and rational sample conversion. PCM stream contracts name filling, skipping, priority and child traversal. Original loop/ramp boundaries, ordering, signed arithmetic and guards remain intact.

Supplemental names and review evidence are keyed by original declarations in `dekobloko-reviewed-names.json`. Unresolved labels remain provisional; fields and locals are outside the class/method completion claim.

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
