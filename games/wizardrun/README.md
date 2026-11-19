# Reading Wizard Run

Resolved declarations: 299/299 classes and 1865/1865 methods have readable names; 221 constructors follow their class names.
Remaining: 0 opaque classes and 0 opaque methods. All class and method declarations have readable names.

Start at `wizardrun`: `initializeGame`, `updateGameTick`, `updateGameState` and `renderGameFrame` connect resource loading, the game state machine and drawing.

- `PlatformActor` handles wizard/enemy updates, attacks, capture, defeat, pickups and contact damage; `GridActor` supplies terrain movement and gravity.
- `LevelActorSpawner.spawnLevelEnemies` translates level enemy markers into actors. `LevelData` and `LevelDecodingHelpers` describe the level grid and decoding.
- `GameApplet` owns the applet lifecycle; `GameShell` handles shared account workflows, packets and reconnects. `ThreePieceFrameHelpers.isGuestMode` distinguishes guest play from account play.
- `FullscreenController` handles fullscreen canvas sizing and responsive layout. `GameMenu` and `MenuController` handle game menu input and volume.
- Shared engine code includes audio synthesis, Vorbis, PCM mixing, rasterization, sprites, archive transport and cache storage.

Reproduce in dekobloko-work:

```sh
env -u JAVA_TOOL_OPTIONS node readable/build-wizardrun-rules.mjs --check
env -u JAVA_TOOL_OPTIONS node readable/reproduce-wizardrun.mjs --check
node readable/naming-coverage.mjs wizardrun
```

Names and behavioral evidence are keyed by original declaration identities in `wizardrun-names.json` and `build-wizardrun-rules.mjs`. Generate the published Java through this workflow rather than editing it directly.

Coverage checks all resolved classes, nested classes and methods. It exits unsuccessfully while opaque names remain. Reproduction verifies bindings and reversal to the pinned original source; it does not prove gameplay correctness. Fields and local variables are outside the complete class/method naming claim.
