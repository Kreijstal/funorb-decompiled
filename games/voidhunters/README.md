# Reading Void Hunters

Resolved declarations: 751/1572 classes and 1708/8215 methods have readable names; 1359 constructors follow their class names.
Remaining: 821 opaque classes and 6507 opaque methods. The complete naming goal is still in progress.

Start at `VoidHunters`; `World`, `Ship`, `ShipBody`, `ShipComponent`, `MissionControl` and `GameSnapshot` expose the simulation and mission state. The console command classes retain the names of their registered commands.

Names and review evidence are keyed by original declarations in `voidhunters-names.json` and `voidhunters-diff-names.mjs`. Reproduction verifies compilation, symbol bindings, inheritance relationships and exact source restoration. Fields and locals are outside the complete class/method naming claim. Full gameplay has not been runtime-tested.

Reproduce in dekobloko-work:

```sh
env -u JAVA_TOOL_OPTIONS node readable/build-voidhunters-rules.mjs --check
env -u JAVA_TOOL_OPTIONS node readable/reproduce-voidhunters.mjs --check
node readable/voidhunters-coverage.mjs
```
