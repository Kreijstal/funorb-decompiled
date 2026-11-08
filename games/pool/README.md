# Reading Pool

This directory is the single published Java tree. The scripts and reviewed rules live in dekobloko-work/readable; the reverse dictionary is ../../decompilation/pool-naming.json.

Resolved declarations: 431/431 classes and 3199/3530 methods have readable names; 339 constructors follow their class names.
Remaining: 0 opaque class names and 331 opaque method names. The complete naming goal is still in progress.
Audit with `node readable/naming-coverage.mjs pool` in dekobloko-work; it exits unsuccessfully while opaque names remain.

Start at `Pool` and `PoolMatchController`; `PoolGameModel`, `Ball`, `Pocket`, `CushionSegment`, `ShotRecord` and the `GameRules` implementations describe gameplay. `TableScene`, the table themes and `BallSkin` implementations handle its presentation.

The obfuscator moved independent static helpers between owners. Class names describe their retained role; each method name describes its own behavior without relocating code.

Regeneration compiles the raw and named sources and checks resolved bindings, override contracts, labels and class-name literals. Full gameplay and multiplayer behavior have not been verified by this naming workflow.

Decompiler source commit: 00c1c12fb58cdbd6be065e604ee5e9acbcebeff7.
