# Reading Hold the Line

This directory is the single published Java tree. The scripts and reviewed rules live in dekobloko-work/readable.

Resolved declarations: 357/357 classes and 2503/2503 methods have readable names; 286 constructors follow their class names.
Remaining: 0 opaque classes and 0 opaque methods. All class and method declarations have readable names.

Start at `HoldTheLine`, a `NetworkGameClient` and `GameAppletShell`. Its `initializeGame`, `loadGameResources`, `updateGameTick`, `renderGameFrame` and `shutdownGame` methods expose the client lifecycle.

`RaceWorld` owns the course, vehicles and world collections. `RaceVehicle` and `VehicleDefinition` describe vehicle state and tuning; `MovingEntity` supplies shared motion. `RoadSegment`, `StraightRoadSegment`, `CurvedRoadSegment`, `TrackBoundary`, `Point2i` and `Vector2f` expose the course geometry.

`RaceWorld` names course decoding, layered rendering, vehicle/object collisions, blasts, rain and lighting, tutorial actions and transitions, achievements and HUD updates. `RaceVehicle` names path planning, driving controls, damage, powerups and the distinct car, snowcat and snowmobile physics implementations. `TrackObject`, `ZombiePedestrian`, `Particle` and `PointLight` expose the other world entities.

Road geometry distinguishes the left/right visible-road edges from the left/right collision edges. Edge orientation follows increasing curve parameter; it does not assume that every `directionAt` implementation has the same tangent convention. Each segment also retains its separate control path. The original interpolation, rounding and guard behavior remain intact.

`MenuList` provides shared mouse and keyboard selection. `GameMenu` handles the main/options menus, championship carousel, help, achievements and race results; `RaceSetupMenu` handles cascading course and car choices. `CourseDefinition` owns decoded course data and previews, while `TrackObjectDefinition` supplies object collision shapes and graphics.

`Sprite` and `ArgbSprite` distinguish scaled, rotated, masked, tinted, additive and alpha drawing. `SoftwareRasterizer` exposes clipping, shape drawing and blur; `BitmapFont` exposes text measurement, alignment, wrapping and markup. `UiTheme`, `LayeredWidgetStyle`, `StripedProgressBar`, `LoadProgressDialog` and `OpacityWidget` describe the shared presentation controls.

`RoadFillRenderer` joins sampled road edges into polygons. `OutlinedRoadFillRenderer`, `TexturedRoadFillRenderer` and `RoadLayerMaskRenderer` draw their solid, textured and indexed-mask forms through `PolygonScanConverter`. `MenuSelectionController` exposes the menu selection state, while `WidgetContainer` and `SingleChildWidget` name child layout and focus traversal.

`MidiPcmStream` names note on/off, controllers, pitch bend, patch loading and envelope updates. `MidiNote`, `MusicPatch` and `MusicPatchPcmStream` expose voice state, patch samples and retriggering. `AudioOutput` names stream scheduling and device buffering; `JavaSoundAudioOutput` implements its device hooks.

`NetworkGameClient` names applet parameters, account-screen processing and server-packet dispatch. `PlatformTaskDispatcher` names asynchronous socket, thread, reflection, URL and fullscreen tasks. `ArchiveKeyRequest`, `BlobReadRequest`, `BlobWriteRequest` and `ReflectionCheck` identify queued protocol state; `WhirlpoolHasher` exposes bit updates, block processing and digest finalization.

`AccountCreationForm`, `DisplayNameForm`, `LoginForm` and `EditableTextField` expose validation, submission, suggested names, selection and clipboard operations. `TextLayout`, `TextLineLayout` and `TextHotspotRange` name text positions and hotspot geometry; `DialogLayer`, `FadingDialog`, `ResizableDialog` and `ContentTransitionDialog` expose stacking, fades and resize transitions.

`BoundedRandomAccessFile`, `BufferedRandomAccessFile`, `DiskCacheStore`, `DiskCacheWorker` and `WeightedLruCache` expose storage and cache behavior. `SavedRasterState` records pixel targets and clipping bounds. `Bzip2Decoder` names bit reads, Huffman tables, block decoding and output-run expansion; `MusicCrossfadeStream` exposes track selection and crossfade gain.

`ChatMessage`, `LeaderboardRequest`, `LeaderboardPlayer`, `ScoreSubmission` and `AchievementStatusRequest` identify protocol data and results. Leaderboard entry identifiers are separate from the integer score payload. `JavaScriptBridge` names applet-window calls and script evaluation.

`VehicleEngineSounds` pairs acceleration and deceleration audio. `VorbisFloor` names floor decoding, neighboring points and spectrum application. `TriangleMesh` exposes translation, scaling and cached bounds; `MeshMaterial` supplies face colors, while `RoadShadowRenderer` fills offset road shadows.

`MeshLighting.drawLitMesh` shades projected mesh faces. The triangle rasterizers expose flat blended and Gouraud fills; `BoundaryLoopClipper` and `BoundaryLoopTracer` assemble clipped boundary loops, while `LeaderboardRequest.drawBoundaryStrip` samples their joined strip edges. Static helpers retain their original owners.

`InheritedWidgetStyle` and its `WidgetStyleNode` base retain the original style inheritance used by `SocialListEntry`. `PlayerProgressEncoder` and `ByteArrayPool` expose packed saves and reusable byte buffers. `RoadShadowRenderer.isGuestMode` names the guest-session flag: authenticated sessions write progress to blob storage, while guest progress remains pending for later login.

Shared components include named UI widgets, account forms and validators, archive/cache transport, PCM/MIDI/Vorbis audio, sprites, rasterization and fonts. Unrelated static helpers remain in their original containing classes; for example, `EntitySound` also holds the shared exception wrapper.

Reproduce in dekobloko-work:

```sh
env -u JAVA_TOOL_OPTIONS node readable/build-holdtheline-rules.mjs --check
env -u JAVA_TOOL_OPTIONS node readable/reproduce-holdtheline.mjs --check
node readable/naming-coverage.mjs holdtheline
```

Names and evidence are keyed by original declarations in `holdtheline-names.json`. Reproduction verifies compilation, symbol bindings and exact source restoration. Full gameplay has not been runtime-tested. Fields and local variables are outside the complete class/method naming claim.
