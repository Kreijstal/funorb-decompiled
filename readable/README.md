# Readable GeoBlox

The current export has 1,146 guarded naming rules: 22 classes, 382 fields,
175 methods, 208 parameters and 359 local declarations. Both 303-file corpora
compile, preserving 154,117 bindings and 388 override relationships. Unknown
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
`588ff14becf7fd429d53e929e85e073814c20259`. It comes from java-tools
`67f22895e4161b3e81a7ceb93273b6680be7d2f0` and Deko
`a572c4dd0f0174bfcd7777be53d7ceba2f970f18`. The adapted naming tool is
`a0bc835957148b9b1e1f8221c59b79d899d22738`; its source archive SHA-256 is
`cb10756aa3ecb28159c9b81f2fb78bf559b4111d9ad203819458b30d0d84cf8c`.

The **decompiler repository source** SHA-256 is
`ac8734ac19b0447c2aad49c20af07562f4e9d22c862c97c465b465b6e858a86f`:

```sh
git archive --format=tar 67f22895e4161b3e81a7ceb93273b6680be7d2f0 | sha256sum
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
Contact-physics producers, actual asset loading, new unlock delivery, device
audio and whole-game equivalence remain unverified. Text-writer guards <=23
retain a PCM side effect outside the direct writer probe. These source checks
do not establish FPS, heap or phone acceptance.

The current generic decompiler removes 745 integral sign nodes across 132
files: `x + (-y)` becomes `x - y`, and `x - (-y)` becomes `x + y`.
Opcode width, narrowing boundaries, operand order, floating arithmetic and
string operations remain intact. A complete attributed Java-tree audit matches
all 303 files modulo only integral right-hand sign normalization and redundant
parentheses. All 21,185 declarations, 1,146 naming guards, 359 named local
identities and 388 override edges are unchanged. The source/decompiler identity
is recorded by `publication.sourceChange` in the same current manifest.
The prior cleanup of 972 literal shift counts remains, using five bits for int
and six for long; dynamic distances retain their computations.

In the pinned java-tools checkout, the focused regression command is:

```sh
node test/cfrNumericNegation.test.js
```

Its six groups include 20,350 native signed-term comparisons, 24,324 native
shift comparisons and eight AST-audit acceptance/refusal fixtures. Normal and
forced-dispatcher output cover boundaries, narrowing, side effects and failures.
The source audit can be reproduced with the maintained helper:

```sh
javac -d /tmp/geoblox-audit test/helpers/IntegralTermAudit.java
java -cp /tmp/geoblox-audit IntegralTermAudit PREVIOUS_RAW CURRENT_RAW FROZEN_STUBS_JAR
```

Complement checks and the 7,200 native exception-loop comparisons also pass.
A clean Git source archive regenerates all 303 raw files and current diagnostics
byte-for-byte. These checks establish the numeric rewrite's scope; they do not
prove whole-game behavior.

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
| Raw | `cdf74421a73a784554ef7946c2647fa0380f8a458a21e30e96ba951f4e650a97` |
| Readable | `03470bae645cb1b9006d1d1bc6e395c20102677e5287184fb7639a4fae9a1974` |

Tree digests use `sourceIdentity(sourceInventory(root))` from the bundled tool.
