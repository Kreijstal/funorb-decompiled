# Readable GeoBlox

The single named export is [`geoblox/src`](geoblox/src). The
[reading guide](GEOBLOX-READING-GUIDE.md) links its gameplay, tutorial, menu,
transition, rendering and shared-service code.

The current named export remains the reviewed pass 272 snapshot: 303 classes,
2,105 fields, 1,859 methods, 5,014 parameters, 10,824 locals and 28 labels have
20,133 guarded naming rules. [`geoblox/mapping.json`](geoblox/mapping.json)
preserves 20,440 original identities. Readable names omit opaque suffixes;
uncertain member purposes are recorded honestly.

Both pinned raw and named corpora compile. Naming verification preserves
138,149 bindings, 388 override relationships and 4,757 protected transfers.
The reviewed snapshot has no plain block labels or large framed methods; long
ordinary methods and 41 finer field purposes remain. The instructions/gameplay
HotSpot smoke test passed. Whole-game equivalence and browser/phone memory and
presented-FPS acceptance remain unverified.

## Reproduce

The generator, current manifest and proof fixtures belong in
[dekobloko-work](https://github.com/Kreijstal/dekobloko-work/tree/master/readable).
From that checkout:

```sh
FUNORB_DECOMPILED_DIR=/absolute/path/to/funorb-decompiled \
  node readable/reproduce-geoblox.mjs --check
```

The command loads the exact historical raw source from its pinned Git commit,
checks its SHA-256 and evidence, runs the frozen naming tool, compiles and
rebinds the result, and checks the generated reading guide. `--update` stages
the Java export and guide before replacing the current named output.

[`geoblox/provenance.json`](geoblox/provenance.json) records the named output's
identity. Deko's `readable/geoblox-rules.json` records the input commit and the
tracked compiler-source archive SHA-256. The proof record in
`../decompilation/geoblox-provenance.json` describes that pinned historical raw
snapshot. The latest bulk `games/` export has its own current catalog manifest
at `../decompilation-provenance.json`; its compiler output is not substituted
for the naming workflow's pinned source.

Generic readability recovery now runs by default in java-tools. Historical
`CFR_JS_*` opt-in settings belong to the older compiler versions that produced
this reviewed snapshot. Their exact source/checksum records and prior pass
narratives remain in Git history. Game naming maps and specific relocations
remain explicit application inputs.
