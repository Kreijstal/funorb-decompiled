# Reading Shattered Plans

This directory is the single published Java tree. Reproducible rules live in dekobloko-work/readable; the reverse dictionary is ../../decompilation/shatteredplans-naming.json.

Resolved declarations: 307/459 classes and 1726/3231 methods have readable names; 363 constructors follow their class names.
Remaining: 152 opaque class names and 1505 opaque method names. The complete naming goal is still in progress.

Audit with `node readable/naming-coverage.mjs shatteredplans` in dekobloko-work; it exits unsuccessfully while opaque names remain.

Start at `ShatteredPlansClient`, `GameSession` and `GameState`. `Player`, `Star`, `Territory`, fleet orders, map generators and victory checkers describe gameplay; `TaskAi` allocates fleets to attack, defense and garrison tasks.

The obfuscator moved unrelated static helpers between owners. Class names describe retained instance roles; static helper names describe their own behavior without relocating code.

Regeneration compiles the complete raw and renamed sources and verifies resolved bindings, overrides, labels and class-name literals. Full gameplay, native interfaces and multiplayer behavior have not been verified by this naming workflow.

Decompiler source commit: 00c1c12fb58cdbd6be065e604ee5e9acbcebeff7.
