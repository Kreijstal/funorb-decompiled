# Reading Hold the Line

This directory is the single published Java tree. The scripts and reviewed rules live in dekobloko-work/readable.

Resolved declarations: 227/357 classes and 1050/2503 methods have readable names; 286 constructors follow their class names.
Remaining: 130 opaque classes and 1453 opaque methods. The complete naming goal is still in progress.

Start at `HoldTheLine`, a `NetworkGameClient` and `GameAppletShell`. Its `initializeGame`, `loadGameResources`, `updateGameTick`, `renderGameFrame` and `shutdownGame` methods expose the client lifecycle.

`RaceWorld` owns the course, vehicles and world collections. `RaceVehicle` and `VehicleDefinition` describe vehicle state and tuning; `MovingEntity` supplies shared motion. `RoadSegment`, `StraightRoadSegment`, `CurvedRoadSegment`, `TrackBoundary`, `Point2i` and `Vector2f` expose the course geometry.

Shared components include named UI widgets, account forms and validators, archive/cache transport, PCM/MIDI/Vorbis audio, sprites, rasterization and fonts. Unrelated static helpers remain in their original containing classes; for example, `EntitySound` also holds the shared exception wrapper.

Reproduce in dekobloko-work:

```sh
env -u JAVA_TOOL_OPTIONS node readable/build-holdtheline-rules.mjs --check
env -u JAVA_TOOL_OPTIONS node readable/reproduce-holdtheline.mjs --check
node readable/naming-coverage.mjs holdtheline
```

Names and evidence are keyed by original declarations in `holdtheline-names.json`. Reproduction verifies compilation, symbol bindings and exact source restoration. Full gameplay has not been runtime-tested. Fields and local variables are outside the complete class/method naming claim.
