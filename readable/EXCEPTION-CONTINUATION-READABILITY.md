# GeoBlox pass 19: preserve exception boundaries around handler exits

Pass 19 retains all 972 reviewed names and integrates safer exception-region
reconstruction into the same reproducible publication workflow. The only source
change is `oc.a(I)V`, the reflective maximum-heap query. Its arithmetic guard
after a swallowed reflection failure now remains outside the enclosing
`Exception` handler, matching the bytecode's protected ranges.

The generic regression found that handler dominance could absorb an unprotected
`finally` cleanup copy. When cleanup threw after a catch-arm `continue`, the
reconstructed method ran cleanup twice: `1:0,CF1,F2,` instead of native
`1:0,CF1,`. The decompiler now retains original throwing instruction PCs across
region collapse, stops handler carving at a change in enclosing protected-range
coverage, and represents the excluded continuation with an explicit exit sink.
Proven nonthrowing glue remains supported. Incompatible retained regions refuse
reconstruction and keep the CFG fallback.

The structural boundary regression and native finally fixture fail on the
previous decompiler commit. The corrected generator passes 31 structural checks
and 3,216 native loop-exit comparisons, including 924 finally scenarios in both
ordinary structured and forced-dispatcher output. The fixtures cover inner and
outer breaks/continues, preserved return values, cleanup failures overriding
pending transfers, catch priority and escaped throwable identity. These are
generic decompiler checks, rather than tests of every GeoBlox exception path.

## Source and naming identities

The pinned raw-source commit is
`3bb6b88261536a18275d003c19c6cdbdbb25996e`. It reuses the unchanged 303 verified
transformed classes. All source bytes except `oc.java` remain unchanged;
diagnostics remain byte-identical, with zero hard failures and zero dispatchers.
A clean archive of the decompiler source reproduces the full raw export.

The javac audits record 21,181 declarations before and 21,182 after the change.
A new generated selector occupies `L:oc.a(I)V#7`; five unnamed catch carriers and
parameters move one declaration ordinal. No reviewed name targets those locals.
All 972 spelling guards, all 255 named local identities, all class/field/method/
parameter identities and all 388 override relationships remain unchanged.
The raw/readable binding comparison covers 154,113 declarations and references.

The complete pass-18 manifest remains frozen. The pass-19 migration binds it,
both source inputs, the decompiler commit and source-archive digest, the generated
local changes, declaration-audit digests, and the unchanged text/result evidence.
The builder reconstructs every retained pass through 18 before producing 19.
The wrapper verifies migration bytes against the rules, checks `oc.java` in the
current pinned input and previous pinned input, and retains the ten pass-18
source-evidence checks. Neither publication nor reproduction edits Java by hand.

## Decompiler source SHA-256

The tracked java-tools source archive has SHA-256
`f3b5719d7471940e6a586228fa8b59161cfd64ab14ca1786a3f8f4470ec11304`.
Reproduce it in the java-tools repository with:

```sh
git archive --format=tar 38a83d19e58776bbc4dd1b794811aa1a5963996a | sha256sum
```

This identifies the **decompiler repository source**, including Git archive
metadata. It is separate from the raw game-source tree
`150473b4ea210996502edd77710c501590753e2b4a563df34cbea6f772a522f7` and readable
tree `a97ba213dbba4cf4f603a1b8869abb4c0e3479c6e6f71c7d90d4eb76fb23d578`.

## Validation and limits

`node readable/build-geoblox-rules.mjs --check` reproduces all 972 rules.
`node readable/tests/test-geoblox-rule-builder.mjs` passes 33 checks;
`node readable/tests/test-geoblox-migration-source.mjs` passes four groups with
seven actual-wrapper refusal scenarios. Those refusal checks use isolated local
Git clones and require that no partial export is produced.
`node readable/tests/test-geoblox-text-rules.mjs` passes all eight evidence checks.

`node readable/reproduce-geoblox.mjs --check` compiles both full 303-file corpora,
checks all bindings and overrides, and reproduces every readable artifact.
Dictionary-only reversal recovers all 303 corrected raw files byte for byte.
The actual result-sequence probe matches verified native bytecode through 27
controlled scenarios and 26,043 ticks per variant; the result-helper probe retains
its native selector, PCM metadata, position-bound and music early-return checks.

The result probes do not inject reflection failures into `oc.a(I)V`. Their
controlled asset/audio assumptions remain documented in the earlier reports.
Unknown names, shared joins and guard arguments remain. Successful archive
loading, whole-game equivalence, FPS, heap and phone acceptance remain unverified.
