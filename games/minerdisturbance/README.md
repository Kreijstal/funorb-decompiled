# Reading Miner Disturbance

This directory is the single published Java tree. The scripts and reviewed rules live in dekobloko-work/readable; the reverse dictionary is ../../decompilation/minerdisturbance-naming.json.

This pass names 18 reviewed shared-engine classes in 341 source files. Unresolved roles keep their original names.

The applet chain is `GameAppletShell` (m) extended by an unnamed client class (ob) extended by `MinerDisturbance`. Roles follow behavior and match counterparts in other FunOrb games, not their obfuscated spelling.

Reproduce with `node readable/build-minerdisturbance-rules.mjs --check`, `node readable/reproduce-minerdisturbance.mjs --update`, and `node readable/reproduce-minerdisturbance.mjs --check` from dekobloko-work.
