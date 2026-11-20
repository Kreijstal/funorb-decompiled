# Reading Void Hunters

Resolved declarations: 1099/1572 classes and 5352/8215 methods have readable names; 1359 constructors follow their class names.
Remaining: 473 opaque classes and 2863 opaque methods. The complete naming goal is still in progress.

Start at `VoidHunters`; `World`, `Ship`, `ShipBody`, `ShipComponent`, `MissionControl` and `GameSnapshot` expose the simulation and mission state. The console command classes retain the names of their registered commands.

`GameApplet` drives `initializeGame`, `updateGameTick`, `renderGameFrame`, `shutdownGame` and `clearClientResources`. `NetworkGameClient` parses launch parameters and coordinates shared login/reconnection work; `VoidHunters.handleServerPacket` dispatches the game-specific replies.

`GameSession.updateSession` processes input and advances the current state; `renderSession` draws the world and HUD. Radial-menu geometry, objective markers, player names/chat, scoreboard and debug overlays have separate entrypoints. `MissionState` exposes phase changes, next-round data, custom variables and round results; `MissionBuilder` passes the voted objective through to `World.objectiveType`.

`Widget` owns clipped mouse processing, styled sprite/text drawing, child layout and selection. `IntrusiveDequeIterator` provides independent forward/backward traversal. `NativeSoftwareRenderContext` binds rendering to a thread; `NativeSoftwareSurface` separates canvas resizing and presentation. Native toolkit wrappers name texture uploads, render targets, heaps and context selection.

`SerializableGameState` names `readState`, `writeState`, `copyTo` and `differsFrom` across the simulation. `CompactGameState` exposes its additional packed representation. `PacketBuffer`, `IsaacPacketBuffer` and `IsaacCipher` separate byte codecs, bit codecs and encoded protocol bytes.

`CarouselCommongameInfo` retains the history ring and event deque, names replay/catch-up and current/history serialization, and selects recorded client states for diagnostics. `CarouselEvent.applyTo` dispatches system events or custom player actions; slots expose `prepareTick` and `advanceSimulation`. `SoftLruCache` separates weighted capacity, strong/soft references, aging and hit promotion from its `IntrusiveNodeHashTable` index.

`QuickChatPhraseLoader` caches `QuickChatPhraseDefinition` records from primary and alternate archives. Definitions expose text previews, placeholder segments, linked phrases and `QuickChatDynamicCommand` configuration. `QuickChatMenuWidget` separates layout, shortcut handling, submenu activation and click updates. The standalone `OpenGlToolkit` vertex path uses `OpenGlVertexBufferBinding` with buffer-object and client-memory implementations.

`ScrollBarWidget` names thumb geometry, position conversion, dragging and repeated arrow/page input. `ScrollPaneWidget` coordinates content layout, clipping and scrolling; `SelectableIconLabelWidget` and `ScrollableActionPanel` expose their child layout. `OpenGlFramebufferBinding` separates combined/read/draw targets, while `OpenGlFramebufferAttachment` names image detachment. `OpenGlTexture` exposes filtering, mipmap generation and allocation accounting; `OpenGlToolkit` names native state application, framebuffer stacks and deferred disposal queues.

`ShipBody` names force accumulation, motion integration, mass properties, bounds and controls. `ShipComponent` exposes its tree, transforms, aiming, health, attachment and collision operations. `ComponentAttachmentPlan` records the chosen `HardpointMatch` and obstructions; `ComponentCollision` and `ComponentContact` separate polygon overlaps from contact points. `ProjectileHit` resolves impact effects and damage, while `ProjectileTraceResult` retains the nearest intersection.

`MissionEvent.evaluateAndExecute` evaluates each condition, applies its negation flag, collects target body ids and executes actions. Conditions and actions expose descriptions, editable parameters and world marker positions. `GameStateFactory` names default-instance and typed-array creation; each named concrete factory identifies its product type.

`GraphicsToolkit` has software, native software, OpenGL and Direct3D implementations. `GpuToolkit` shares the hardware path between `OpenGlGpuToolkit` and `Direct3DToolkit`. `ProceduralTexture` connects `TextureOperation` inputs; `ColorRowCache` and `MonochromeRowCache` retain their computed rows. The native-memory and Direct3D Java wrappers have names matching the operations they dispatch.

`GraphicsToolkit` names clipping, projection, drawing, pixel transfer, sprite/font creation, framebuffer selection and heap management. `ToolkitSprite` exposes dimensions, padding, scaled/rotated/affine drawing and tiling across backends; `SoftwareRenderContext` owns the software triangle rasterizer. `Transform3D` names camera setup; the OpenGL and GPU transforms expose matrix export and rigid inversion. `NativeDisposalQueue` manages deferred `NativeResource` cleanup. `OpenGlPostProcessor` runs `OpenGlPostEffect` passes; `OpenGlBloomEffect` implements luminance thresholding, blur and compositing.

`ToolkitFont` exposes ordinary and masked glyph drawing. Its software palette, monochrome and alpha variants name their pixel blitters; `GlyphMask` names the software span mask and OpenGL texture mask. Renderer capability names follow the original diagnostic messages for memory pools, backbuffers, shadows, bloom, environment maps, anti-aliasing, threads, particles, underwater effects, clipping and point lights.

`GpuVertexBuffer` and `GpuIndexBuffer` expose allocation, locking, unlocking and disposal in the OpenGL and Direct3D backends. `VertexStreamLayout`, `VertexAttribute`, `GpuDataType` and `GpuVertexDeclaration` describe the input streams bound by `GpuToolkit`. The separate legacy 2D path uses `BitmapFont`, `SoftwareMonochromeBitmapFont`, `SoftwareAlphaBitmapFont`, `Sprite`, `ArgbSprite` and `SoftwareRasterizer2D` for markup, kerning, wrapping, glyphs, pixel operations and sprite transforms.

`GpuTexture` has 2D, rectangle, 3D and cube implementations for OpenGL and Direct3D. Texture APIs name coordinate conversion, repeat/filter settings, pixel uploads, mipmap generation, format conversion and binding. `GpuToolkit` names render-state application, shared quad/line/circle geometry, perspective/orthographic/screen projections, model-view transforms and `PointLight` uploads. `GpuMaterialEffect` names material activation, parameters and callbacks for matrix and depth-range changes; `TextureCombineSource`, `TextureCombineOperation`, `TextureTransformMode` and `TextureCoordinateMode` describe the shared fixed-function texture state.

`AudioPump` services `AudioOutput`; `JavaSoundAudioOutput` submits mixed PCM through Java Sound. `PcmStreamMixer` combines child streams and scheduled listeners. `MidiPcmStream` reads `MusicTrack` events with `MidiFileReader`, manages patch notes and controllers, and mixes them through `MusicPatchPcmStream`. `PcmSampleStream` names its forward/reverse, mono/stereo, interpolated/aligned and gain-ramped mixing kernels. `SoundCache` loads music samples and synthesized `SoundEffect` samples. `SoundInstrument`, `SoundEnvelope` and `SoundFilter` expose synthesis; `VorbisSample` decodes compressed music through its codebooks, floors, residues and mappings.

`TextureProvider` supplies RGB, ARGB and floating-point RGBA generation through `ArchiveTextureProvider` and `ProceduralTexture`. `ArchiveIndexLoader` verifies the master archive index and creates cached archive providers. `ResourceArchive` resolves named groups/files and unpacks optional XTEA-encrypted containers; `ArchiveIndex` describes their ids, checksums, versions and name lookups. `CachedArchiveProvider` validates disk/network requests and schedules prefetches. `NetworkArchiveClient` separates queued and in-flight priority/background requests; `SocketNetworkArchiveClient` handles framed responses over `BufferedSocket`. `ArchiveDiskWorker`, `ArchiveDisk`, `BufferedFile` and `BoundedRandomAccessFile` expose queued IO, sector chains, buffering and file-size bounds. `ByteStorage` separates heap arrays from `DirectByteStorage`.

Names and review evidence are keyed by original declarations in `voidhunters-names.json` and `voidhunters-diff-names.mjs`. Reproduction verifies compilation, symbol bindings, inheritance relationships and exact source restoration. Fields and locals are outside the complete class/method naming claim. Full gameplay has not been runtime-tested.

Reproduce in dekobloko-work:

```sh
env -u JAVA_TOOL_OPTIONS node readable/build-voidhunters-rules.mjs --check
env -u JAVA_TOOL_OPTIONS node readable/reproduce-voidhunters.mjs --check
node readable/voidhunters-coverage.mjs
```
