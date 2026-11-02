# Reading Bachelor Fridge

This directory is the single published Java tree. The scripts and reviewed rules live in dekobloko-work/readable; the current reverse dictionary is ../../decompilation/bachelorfridge-naming.json.

This pass names 298 reviewed classes in 865 source files. Unresolved roles keep their original names; renamed names have no opaque suffix.

Start at `BachelorFridge`, which extends the client shell chain `NetworkGameClient` / `GameAppletShell`. Shared engine names reflect role matches with other FunOrb games by reviewed behavior, not by obfuscated spelling. No gameplay fixtures or reconstructions accompany this pass.

Reproduce with `node readable/build-bachelorfridge-rules.mjs --check`, `node readable/reproduce-bachelorfridge.mjs --update`, and `node readable/reproduce-bachelorfridge.mjs --check` from dekobloko-work.
