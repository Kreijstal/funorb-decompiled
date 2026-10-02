# Readable GeoBlox

The current export has 1,170 guarded naming rules: 22 classes, 382 fields,
175 methods, 209 parameters and 382 local declarations. Both 303-file corpora
compile, preserving 152,600 bindings and 388 override relationships. Unknown
names, generated carriers, guards and shared joins remain.

## One current manifest

[geoblox-rules.json](geoblox-rules.json) is the single maintained source for
names, source/decompiler pins, source and native-probe evidence, text-resource
assignments and verification limits. Previous snapshots live in Git rather than
versioned JSON files in the working tree. Its `publication.previousRules` records
a reviewed Git commit, path and SHA-256; explicit `ruleChanges` protect every
unaffected name. A changed input uses an explicit `sourceChange` in this same file.

The generated [source](geoblox/src), [dictionary](geoblox/mapping.json),
[symbol reference](geoblox/SYMBOLS.md) and [provenance](geoblox/provenance.json)
are current outputs. [tools/PIN.json](tools/PIN.json) pins the bundled naming
tool bytes; `funorb-stubs.jar` is the frozen compilation dependency. The
[reading guide](GEOBLOX-READING-GUIDE.md) explains the named gameplay flow.

The raw input is `games/geoblox` at
`a298f846c1824a1e88dd6c63674bbe81e67152e1`. It comes from java-tools
`2f75cefb09f32e164f77b7f4adc6fd011d922f43` and Deko
`a572c4dd0f0174bfcd7777be53d7ceba2f970f18`. The adapted naming tool is
`a0bc835957148b9b1e1f8221c59b79d899d22738`; its source archive SHA-256 is
`cb10756aa3ecb28159c9b81f2fb78bf559b4111d9ad203819458b30d0d84cf8c`.

The **decompiler repository source** SHA-256 is
`8e6ff3d4a6c5439128cbbad964491358c73c92c2e6e0a0ff82edadda478a612e`:

```sh
git archive --format=tar 2f75cefb09f32e164f77b7f4adc6fd011d922f43 | sha256sum
```

This identifies tracked decompiler source and its Git archive metadata. It is
separate from a game JAR or the Java source-tree hashes below.

## Reproduce and check

Use a full Git checkout, Node.js and a JDK with javac. The recorded environment
is Node 22.23.2 and OpenJDK 11.0.32.1+1; compilation targets Java 8.

```sh
node readable/build-geoblox-rules.mjs --check
node readable/tests/test-geoblox-rule-builder.mjs
node readable/tests/test-geoblox-migration-source.mjs
node readable/tests/test-geoblox-text-rules.mjs
node readable/reproduce-geoblox.mjs --check
node readable/tools/restore-original.mjs readable/geoblox /tmp/geoblox-restored
```

The wrapper extracts the pinned input from Git, verifies source/probe/dependency
bytes and the actual text-resource assignments, then compiles and rebinds both
corpora. The dictionary reverses all identifier edits without requiring the
original source. Generate a replacement in a fresh output directory with
`node readable/reproduce-geoblox.mjs OUTPUT`; review it before copying its
completed outputs into `readable/geoblox`. Generated Java is never edited by hand.

For native behavior checks, supply the verified 303-class directory recorded in
`decompilation/geoblox-provenance.json`:

```sh
JAVA_TOOL_OPTIONS=-XX:-UsePerfData node readable/tests/test-geoblox-match-scoring.mjs /path/to/verified-geoblox-classes
JAVA_TOOL_OPTIONS=-XX:-UsePerfData node readable/tests/test-geoblox-text-write.mjs /path/to/verified-geoblox-classes
JAVA_TOOL_OPTIONS=-XX:-UsePerfData node readable/tests/test-geoblox-gameplay.mjs /path/to/verified-geoblox-classes
JAVA_TOOL_OPTIONS=-XX:-UsePerfData node readable/tests/test-geoblox-result-sequence.mjs /path/to/verified-geoblox-classes
JAVA_TOOL_OPTIONS=-XX:-UsePerfData node readable/tests/test-geoblox-result-helpers.mjs /path/to/verified-geoblox-classes
```

Matching/scoring covers 708 controlled scenarios and 55,728 ticks per variant.
The text writer covers 152 cases, including retained suffixes, empty/growing
writes, UTF-16, live aliasing, offsets, partial writes and throwable identity.
`writeTextAtOffset` grows the builder when needed and preserves old trailing
characters after shorter writes. Result probes cover 27 scenarios/26,043 ticks,
120 selector cases, 4,801 PCM factory cases, 9,000 bounds checks and six music
returns. Native, raw and readable traces match within those controlled scopes.
The gameplay probe checks 144 contact cases across kinds 0/1/2, equality keys,
force flags and client guards; 32 neighbor removals; two forced neighborhood
detachments; and the existing boundary, popup, cooldown and settling checks.
Ordinary contacts use independent neighbor-order/count oracles. Duplicate
contacts preserve state even when forced detachment is requested. One-pixel
sprites and controlled palettes exercise actual constructors and conversions.

The same probe now checks 320 secondary-deque operations against independent
list models and 2,048 conversion cases covering every undirected graph of four
entities, two roots, two template keys, four flag combinations and two client
guards. Reachability, final properties, edge counters, cooldowns and primary
link independence have separate oracles. The 472 direct mixed-flag failures
preserve native exception context and partial mutations. The contact caller
uses mutually exclusive conversion flags. These controlled fixtures do not
simulate collision-mask production or real asset loading.

Board reconciliation adds 16,384 cases across all four-entity graphs, all
avatar-contact masks, centred/radial positions, connectivity/contact dirty
flags and client guards zero/one. The normal guard path has independent
connected-component, queue-order, neighbor-count, velocity, flag and visited
range oracles. The alternate client guard is checked against its native trace.
Real entity constructors and contact linking run; a constructor-free session
holder and blank rasters isolate connectivity.

Another 1,080 routing cases use minimal opaque sprites, an actual ownership
raster, controlled audio buffers and the same session holder. They check
moving-to-attached drawing, moving/transient transfer, shock popups and pool
returns, with zero or one reciprocal neighbor. The normal path has separate
queue, kind, lifetime, counter, ownership-pixel and popup-coordinate oracles.
The 3,024 avatar-feedback cases independently check hold timers, frame bases,
Java remainders, mode/effect fields, sprite guards and actual sound-sample
identity. Sound-device playback and new unlock delivery remain unverified;
routing fixtures set existing unlock bits rather than deliver new unlocks.

Avatar animation adds 21,600 frame/timer cases, 2,880 shock/tint cases, five
menu guard boundaries and six 720-tick sequences. Independent state oracles
check both menu and gameplay updates with ending messages disabled. Another
324 tint requests verify palette channels, active-fade bypass, NaN narrowing,
invalid indices and division-guard partial writes. The combined gameplay probe
now covers 52,164 cases per variant. Ending-message selection remains outside
these animation checks.
The boundary scan names all 27 remaining local declarations and its method
guard, including four row-center cursors and thirteen retained result carriers.
Its obsolete selector is removed; the result carriers now return on their
original paths inside the try. The 13-arm post-try ladder is gone.
An independent closed-form lattice oracle checks every pixel in the 461-by-461
bounding square at strides 640 and 641: 425,042 pixel checks and all 1,300
perimeter pixels per variant. Negative nonzero pixels, read-only buffer behavior,
18 guard cases and five invalid/short-raster cases are verified. Guard division
still precedes framebuffer access, and an occupied left cardinal pixel can
return before an invalid right pixel index. The prior 52,164 gameplay trace
remains byte-identical; boundary matrix counts are verified separately.

Contact-physics producers, actual asset loading, new unlock delivery, device
audio and whole-game equivalence remain unverified. Text-writer guards <=23
retain a PCM side effect outside the direct writer probe. These source checks
do not establish FPS, heap or phone acceptance.

The pinned generic decompiler reconstructs forward, nonthrowing terminal
returns inside the try when every normal predecessor belongs to that body.
Shared joins, throwing continuations, handler entries, retreating edges and
synchronized-region boundaries retain their external routing. This removes
254 generated selectors (265 to 11) and 3,125 raw source lines across 181 files.
All original CFG flow and exception-binding contracts remain checked.

The fresh javac inventory preserves all 20,920 nonselector declarations,
152,549 nonselector declaration/reference occurrences and 388 override edges.
Changed files have unique method/original-spelling local identities; duplicate
names only occur in the byte-identical `wg.finalize`, which retains exact keys.
The readable update explicitly migrates 46 local ordinals and removes only the
obsolete `boundaryResultArmId` rule. All remaining semantic names are retained.
This source inventory audit does not establish whole-program equivalence.

In the pinned java-tools checkout, run the focused checks:

```sh
node test/exceptionStructurer.test.js
node test/cfrExceptionLoopExits.test.js
node test/cfrCatchSemanticsRegressions.test.js
```

These pass 36 region-contract groups, six native exit groups and 18 catch
regression assertions. Return-tail fixtures compare 1,560 int/long/float/double/
reference/void cases across normal and forced output, including boundaries,
NaN payloads, identity, effects, shared joins and outside failures. Another
15 cases verify normal synchronized reconstruction, lock state and release.
The forced dispatcher still refuses explicit monitors. A pre-existing default
return bug after an all-paths-return synchronized body is also fixed.
The retained loop-exit fixtures cover 7,200 native comparisons.

A clean Git source archive regenerates all 303 raw files and current diagnostics
byte-for-byte. Previous integral-sign and literal-shift cleanup remains, with
its historical proof recorded in the raw provenance. Current source/decompiler
identity and naming migrations live in the same `publication.sourceChange` and
`ruleChanges` records; no JSON snapshots are added.

## Update this export

1. Commit and verify the new raw source when changing the decompiler. For a
   naming-only change, retain the existing input and generator pins.
2. Point `publication.previousRules` to the last reviewed Git version of the
   single manifest. Record additions, replacements or removals as exact
   `{symbol, before, after}` entries in `ruleChanges`; use null for absent rules.
   If source identity changes, record its exact `before`/`after` identities in
   `sourceChange` and review affected local ordinals and spelling guards.
3. Update the current source/native evidence and resource assignments in the
   same manifest. Preserve metadata, strings and guards needed by the original
   program. Run the canonical builder and generate into a fresh directory.
4. Review the diff, run the relevant behavior probes and full binding check,
   reverse the dictionary, and replace the generated outputs. Keep verification
   results current in the manifest; use Git for history instead of new snapshots.

| Java source tree | SHA-256 |
| --- | --- |
| Raw | `0ce7d77ce24b5c74be0439d9d363ac7fb407bf949c9385ecc5f7e4cbcfe48f0f` |
| Readable | `80ca753ee13941a47819f1178975f880e33f48ba1d0a6891bf6b58c3cf1d0874` |

Tree digests use `sourceIdentity(sourceInventory(root))` from the bundled tool.
