# Reading Wizard Run

Resolved declarations: 227/299 classes and 1227/1865 methods have readable names; 221 constructors follow their class names.
Remaining: 72 opaque classes and 638 opaque methods. The complete naming goal is still in progress.

Start at `wizardrun`. Shared engine code includes named audio synthesis, Vorbis, PCM mixing, rasterization, sprites, archive transport and cache storage.

Reproduce in dekobloko-work:

```sh
env -u JAVA_TOOL_OPTIONS node readable/build-wizardrun-rules.mjs --check
env -u JAVA_TOOL_OPTIONS node readable/reproduce-wizardrun.mjs --check
node readable/naming-coverage.mjs wizardrun
```

Coverage checks all resolved classes, nested classes and methods. It exits unsuccessfully while opaque names remain. Reproduction verifies bindings and reversal to the pinned original source; it does not prove gameplay correctness.
