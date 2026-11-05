# Reading Flea Circus

This directory is the single published Java tree. The scripts and reviewed rules live in dekobloko-work/readable; the current reverse dictionary is ../../decompilation/fleacircus-naming.json.

This pass names 12 reviewed classes in 306 source files. Unresolved roles keep their original names.

Start at `fleas` (the applet class, kept under its launch name), which extends `NetworkGameClient` and `GameAppletShell`. Shared engine roles are matched to other games by reviewed behavior, not by obfuscated spelling.

Reproduce with `node readable/build-fleacircus-rules.mjs --check`, `node readable/reproduce-fleacircus.mjs --update`, and `node readable/reproduce-fleacircus.mjs --check` from dekobloko-work.
