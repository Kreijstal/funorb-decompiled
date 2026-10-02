# Readable source exports

GeoBlox pass 19 retains 972 reviewed naming rules: 21 classes, 358 fields,
163 methods, 175 parameters and 255 guarded local declarations. It preserves strings and numeric IDs; typed XOR-minus-one expressions and
comparisons now use equivalent signed integer/long conditions. The new decompiler renders proven
single-entry branches as ordinary Java bodies and keeps verified exception-region
loop fanouts structured. Nested exception cycles are recovered with bounded
copies. Named text resources, loader flow and decoder variables now make
interface loading easier to follow. Confirmed names have no opaque suffixes;
unknown identifiers remain unchanged. The oversized initializer uses three bounded structured helpers,
sharing mutable locals and preserving catch scopes. Builder chains with unknown
receiver contents retain their operations and failure context. The reverse map
keeps original JVM identities and exact edit information.

See [exception-continuation readability](EXCEPTION-CONTINUATION-READABILITY.md)
for the latest source correction and reviewed declaration audit. See [result-helper readability](RESULT-HELPER-READABILITY.md) for the latest
selector, popup, music and PCM names with native verification. See
[parallel-loop readability](PARALLEL-LOOP-READABILITY.md) for the last two
dispatchers, source-edge checks and native verification. The
[border and validation report](BORDER-VALIDATION-READABILITY.md) records pass 16's
85 additions and the four complete validation override families. The
[comparison report](COMPARISON-READABILITY.md) records pass 14. Start with [GameplaySession.java](geoblox/src/GameplaySession.java),
[GameplayEntity.java](geoblox/src/GameplayEntity.java),
[ScorePopup.java](geoblox/src/ScorePopup.java),
[AccountWelcomePanel.java](geoblox/src/AccountWelcomePanel.java) and the
[gameplay reading guide](GEOBLOX-READING-GUIDE.md).

## Export and tool pins

- [geoblox/src](geoblox/src): all 303 readable Java files.
- [geoblox-rules.json](geoblox-rules.json): the complete frozen naming manifest.
- [geoblox/mapping.json](geoblox/mapping.json): original/renamed declarations,
  filenames, per-file hashes and reversible edits in UTF-16 source offsets.
- [geoblox/SYMBOLS.md](geoblox/SYMBOLS.md): reviewed rules and evidence.
- [geoblox/provenance.json](geoblox/provenance.json): source, rules, generator,
  dependency and output hashes, JDK identity and binding checks.
- [geoblox-source-pin.json](geoblox-source-pin.json): the exact source commit
  and dependency pin. The input is `games/geoblox` at commit
  `3bb6b88261536a18275d003c19c6cdbdbb25996e`.
- [tools/PIN.json](tools/PIN.json): exact bundled naming-tool file digests.
- [rules](rules): the retained 491-rule manifest, 151 gameplay additions,
  complete pass-6 through pass-18 manifests, reviewed input migrations,
  pass-13 text additions, the pass-14 comparison migration and the pass-15
  local-identity migration, pass-16 border/validation additions and pass-17
  numeric-negation input migration, pass-18 result-helper additions and pass-19
  exception-continuation input migration.
  Every previous manifest and the changed input are guarded by SHA-256.
- `funorb-stubs.jar`: the frozen compilation dependency, included byte for byte.

The decompilation's tool revisions are separate from game-source hashes:

| Tool | Git commit |
| --- | --- |
| Deko | `a572c4dd0f0174bfcd7777be53d7ceba2f970f18` |
| java-tools | `38a83d19e58776bbc4dd1b794811aa1a5963996a` |
| Upstream naming tool in Deko | `d41315508e071f6bd672d65eb2f5a8d428648d6f` |
| Adapted naming tool | `a0bc835957148b9b1e1f8221c59b79d899d22738` in `geoblox-readable-text-tools.bundle` |

The decompiler repository source archive has SHA-256
`f3b5719d7471940e6a586228fa8b59161cfd64ab14ca1786a3f8f4470ec11304`.
Recreate that identity in the java-tools checkout with:

```sh
git archive --format=tar 38a83d19e58776bbc4dd1b794811aa1a5963996a | sha256sum
```

This hashes the tracked **decompiler repository source**, including its commit
archive metadata. The game-source tree hashes at the end of this document are
separate identities. The local revision is available in
`java-tools-safe-exception-cleanup.bundle` pending remote publication.

The generic naming tool belongs to Deko. `tools/` is a frozen publication copy,
so this checkout can reproduce the export without depending on a mutable sibling
checkout. Its resolver uses javac Trees and preserves binding and override
relationships. The bundled adaptation captures subprocess output in temporary
regular files for restricted environments; the recorded generator digest covers
that helper too. Pass 13 adds guarded constructor-parameter support in the
JavaScript validator; constructor method names still require a class rule. The
Java resolver and binding/override checks are unchanged. The wrapper checks all
three frozen tool digests before use.

The pinned raw input was freshly decompiled in pass 19 from the unchanged
verified transformed bytecode: 303 sources, zero hard failures and zero dispatchers.
Pass 15 changes ten source files through parallel operand-copy fixes and loop
reconstruction, retaining all 841 reviewed names. Ten result-sequence local
ordinals move; their spellings, types and semantic evidence are preserved.
Pass 16 keeps that raw input and the decompiler/tool pins unchanged. It retains
every pass-15 rule and adds names for the nine-slice sprite geometry, the matching
text validator and its complete state/message override families. No source body
or local identity is migrated in this naming pass.
Pass 17 corrects six numeric-negation expressions in two sprite files through
the generic renderer. Every declaration and naming rule remains unchanged.
The full controlled result-sequence probe now matches native bytecode through
completion. See [the numeric-negation report](NUMERIC-NEGATION-READABILITY.md).
Pass 18 retains all 926 names and adds 46 guarded names for outermost-entity
selection, points popups, result music, PCM data and playback-rate creation.
No raw source or declaration identity changes. The wrapper also verifies the
ten reviewed source-file hashes against the extracted input; the new helper
probe matches native selection, sample metadata, position bounds and music
early-return behavior. See [the result-helper report](RESULT-HELPER-READABILITY.md).
Pass 19 integrates the exception-continuation correction in `oc.java`, retaining
every pass-18 name. One generated selector is added and five unnamed local
ordinals shift; all named local identities remain unchanged. The migration and
wrapper guard both before/after source hashes. See
[the exception-continuation report](EXCEPTION-CONTINUATION-READABILITY.md).
The complete pass-14 rules remain frozen, and pass 15 binds the new source and
decompiler identities. The previous ASM check covered
2,427 methods with zero failures; those bytes have not changed. See
[GeoBlox decompilation provenance](../decompilation/geoblox-provenance.json)
for generator commits, input identities, reused pipeline proof and exact verifier
dependencies. This refresh covers GeoBlox; the other 43 game exports retain their
previous revisions.

## Reproduce and verify

From a full Git checkout of this repository, using Node.js and a JDK with javac:

```sh
node readable/build-geoblox-rules.mjs --check
node readable/tests/test-geoblox-rule-builder.mjs
node readable/tests/test-geoblox-migration-source.mjs
node readable/tests/test-geoblox-text-rules.mjs
node readable/reproduce-geoblox.mjs --check
node readable/tools/test-readable-java.mjs
node readable/tools/test-capture-process.mjs
node readable/tests/test-geoblox-deque.mjs
node readable/tests/test-geoblox-gameplay.mjs
node readable/tests/test-geoblox-text.mjs
node readable/tests/test-geoblox-nine-slice.mjs
node readable/tests/test-geoblox-result-sequence.mjs
node readable/tests/test-geoblox-result-helpers.mjs
```

The recorded environment is OpenJDK `11.0.32.1+1`, Node `22.23.2`, with Java
compilation targeting release 8. Use the recorded JDK and dependency bytes for a
byte-identical check of provenance as well as source.

`reproduce-geoblox.mjs` extracts the pinned source commit with `git archive`,
then invokes the same bundled `readable-java.mjs` used for publication. Later
changes in the working `games/geoblox` directory cannot silently change this
export's input. The pinned commit must be available locally; a shallow clone may
need to fetch it. The wrapper verifies the source pin, tool files, stub JAR, additions-manifest
digest and reviewed source-file hashes.
The generator verifies the input tree, compiles both corpora, compares every
binding and override edge, then compares every generated byte in check mode.

Generate into an unused directory for inspection:

```sh
node readable/reproduce-geoblox.mjs /tmp/geoblox-readable-new
```

Restore the exact original Java using only the readable files and dictionary:

```sh
node readable/tools/restore-original.mjs readable/geoblox /tmp/geoblox-original-restored
```

The restoration checks readable file hashes, reverses the identifier edits and
filenames, and checks every recovered original file and its complete tree digest.
It does not read `games/geoblox` or extract an original input commit.

## Procedure for the next publication

1. Use the authoritative `dekobloko-work/scripts/decompile-all-games.sh`
   procedure with tracked-clean, pinned Deko and java-tools commits, the fixed
   original gamepacks and the documented verification/compilation gates. Save
   each game's report and decompilation provenance. The exact command and gates
   are documented in Deko's `docs/decompilation.md`.
2. Update `games/geoblox` only from a successful complete GeoBlox result and
   record that source refresh in Git. Keep full-catalog and per-game provenance
   distinct when only one game changes.
3. Review the new source against every affected naming rule. Local declaration
   ordinals can move after control-flow changes: migrate identities and guard
   the original spelling. A changed input needs a reviewed manifest migration;
   the rule builder refuses to accept a replacement input digest alone. Pass 10
   retains all 642 names after reviewing both javac declaration audits; thirteen
   board-reconciliation local ordinals move after dispatcher carriers disappear.
   Their original spellings, types, full method identities and evidence remain
   unchanged. Pass 11 reviews the removal of six unused exception locals; all
   642 naming guards and 227 named-local identities remain unchanged. Earlier
   migrations remain frozen. Pass 12 outlines the initializer and fixes builder
   prefixes across joins; all 642 guards and 227 named-local identities still
   match both javac audits. Pass 13 retains those rules and adds 199 guarded
   names from direct text-resource assignments, inspected loader/decoder flow
   and the welcome panel. Its 19 carrier-related names describe generated source
   identities rather than original gamepack methods or fields. Pass 14 reviews the
   typed complement export against all 841 guards and all 238 named-local
   identities, retaining every name unchanged. Pass 15 reviews all 841 guards and
   migrates ten result-sequence local ordinals after removing the last two
   dispatchers, preserving each declaration type and reviewed role. Future input
   or identity changes require another reviewed migration.
   Pass 16 retains all 841 rules and adds 85 guarded names on the unchanged input;
   its manifest guards the frozen pass-15 rules, tool identities and the borrowed
   pass-15 text-resource evidence. It checks all four validation override families
   as complete sets. Pass 17 reviews the two sprite source corrections against
   all 926 guards and unchanged declaration identities, then pins the corrected
   input and decompiler without adding or changing names.
   Pass 18 retains all 926 names and adds 46 guarded rules on that same input,
   including constructor parameters. Its additions manifest binds the frozen
   pass-17 rules, generators, text evidence and reviewed source-file hashes.
   Pass 19 freezes the complete pass-18 manifest and reviews the single source
   correction, new selector and five unnamed ordinal shifts. All 972 names and
   255 named local identities remain unchanged. Its migration and wrapper check
   both source versions; the decompiler source SHA-256 identifies the generator
   repository, separately from the game-source input and output tree digests.
4. Pin the new source commit in `geoblox-source-pin.json`, retain the reviewed
   rule lineage and rebuild `geoblox-rules.json`. If updating the naming tool,
   import the reviewed tool and update `tools/PIN.json` deliberately.
5. Generate into a fresh directory with `reproduce-geoblox.mjs`, review its diff
   and replace `readable/geoblox` with the generated export. Run the commands
   above, verify exact dictionary-only reversal, and update documentation and
   validation results before committing the publication.

The reproduction command and underlying tool are the publication workflow.
There is no second naming algorithm for exports and no manual edit of generated
readable Java. Changing rules, input or tools deliberately changes their pins;
unknown symbols are never renamed by guessing during reproduction.

## Checks and limits

Both complete 303-file corpora compile. All 154,113 bindings and 388 override
relationships are preserved; generation applies 16,605 identifier edits.
Rebuilding the rules and regenerating the export is byte-identical, and
map-only reversal recovers all 303 original files byte for byte.

The actual game helper checks pass for original and renamed sources. They cover
deque order/traversal/splicing, independent node links, boundary pixel probes,
popup initialization/progress/draining, cooldown-blocked match batches and
queue settling. The text probe covers four decoder inputs (including all 256 byte values) and
slice boundaries, decoder guard side effects and the nested context of a
null-archive failure. Its expected digest was measured
on the fixed transformed bytecode. An optional path argument to the text test
repeats that native comparison after verifying the class-tree pin. Successful
archive loading remains untested. The nine-slice probe checks every sprite
buffer, dimensions and cleanup effects over 2,592 cases against the recorded
native-bytecode output. It accepts the same optional verified-class-tree path.
The result-sequence probe covers 27 controlled scenarios through completion,
including every tick of phase timing, bonus points, sprite pixels, audio
registration and completion popups. Asset-dependent constructors are bypassed;
boundary-loss detection, new unlock delivery and audible playback are not covered.
The result-helper probe checks 120 selector cases, 4,801 PCM factory cases,
9,000 position queries and six music early returns against a recorded native
digest, including guards, ties, NaNs, empty data, rate overflow and null inputs.
It accepts the same optional verified-class-tree path. It does not advance PCM
samples or activate a new MIDI track.
The earlier gameplay harness does not cover popup crediting, successful
match scoring, full contact physics or asset-dependent session transitions.

The export reduces dispatcher cases from 3,051 to zero. All original methods
now use structured control flow; labeled loops and opaque shared joins remain.
The [parallel-loop report](PARALLEL-LOOP-READABILITY.md) records the last two
recoveries and their limits; the [earlier renderer report](STATE-MACHINE-READABILITY.md)
records the preceding work. [The text-naming report](TEXT-READABILITY.md)
records direct resource assignments, new roles, tool changes and limits. It does not claim whole-game
runtime equivalence, a multiplayer
protocol reconstruction, or JVM memory/FPS/phone acceptance. Runtime names,
reflection, serialization and native/external contracts need separate checks
before treating the renamed export as a runnable replacement.

| Java source tree | SHA-256 |
| --- | --- |
| Original GeoBlox | `150473b4ea210996502edd77710c501590753e2b4a563df34cbea6f772a522f7` |
| Readable GeoBlox | `a97ba213dbba4cf4f603a1b8869abb4c0e3479c6e6f71c7d90d4eb76fb23d578` |

These tree digests use `sourceIdentity(sourceInventory(root))` from the naming
tool. They identify source bytes; the decompiler Git commits are listed above.
