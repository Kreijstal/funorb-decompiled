# Reading Sumo Blitz

This directory is the single published Java tree. Reproducible naming rules live in dekobloko-work/readable; the reverse dictionary is ../../decompilation/sumoblitz-naming.json.

Resolved declarations: 180/587 classes and 1267/3927 methods have readable names; 472 constructors follow their class names.
Remaining: 407 opaque class names and 2660 opaque method names. The complete naming goal is still in progress.

Audit with `node readable/naming-coverage.mjs sumoblitz` in dekobloko-work; it exits unsuccessfully while opaque names remain.

Start at `Sumoblitz`; the shared engine (nodes, deques, packet buffer, sockets, widgets, sprites) uses the same role names as other FunOrb games.

The obfuscator moved unrelated static helpers between classes. Class names describe retained instance roles; method names describe their own behavior without relocating code.

Regeneration compiles the complete raw and renamed sources and verifies resolved bindings, overrides, labels and class-name literals. Full gameplay, native graphics and multiplayer behavior have not been verified by this naming workflow.

Decompiler source commit: 00c1c12fb58cdbd6be065e604ee5e9acbcebeff7.
