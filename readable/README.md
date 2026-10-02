# Readable GeoBlox

The current export has 1,194 guarded naming rules: 22 classes, 389 fields,
181 methods, 217 parameters and 385 local declarations. Both 303-file corpora
compile, preserving 151,774 bindings and 388 override relationships. Unknown
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
`c311d5adc1fe86b3d917967adc56c71803bcb77d`. It comes from java-tools
`dc899ebfaed78111257c7cd7c9c647428a8207e9` and Deko
`a572c4dd0f0174bfcd7777be53d7ceba2f970f18`. The adapted naming tool is
`a0bc835957148b9b1e1f8221c59b79d899d22738`; its source archive SHA-256 is
`cb10756aa3ecb28159c9b81f2fb78bf559b4111d9ad203819458b30d0d84cf8c`.

The **decompiler repository source** SHA-256 is
`ca1ac1f6748b27b17cbda6141556ee9b08faabb28cd68073f44a48c2ace8992e`:

```sh
git archive --format=tar dc899ebfaed78111257c7cd7c9c647428a8207e9 | sha256sum
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
JAVA_TOOL_OPTIONS=-XX:-UsePerfData node readable/tests/test-geoblox-nine-slice.mjs /path/to/verified-geoblox-classes
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
The current early-exit pass also turns its deeply nested pixel checks into
sequential guards, retaining pixel-read order, division guards and exceptions.
An independent closed-form lattice oracle checks every pixel in the 461-by-461
bounding square at strides 640 and 641: 425,042 pixel checks and all 1,300
perimeter pixels per variant. Negative nonzero pixels, read-only buffer behavior,
18 guard cases and five invalid/short-raster cases are verified. Guard division
still precedes framebuffer access, and an occupied left cardinal pixel can
return before an invalid right pixel index. The prior 52,164 gameplay trace
remains byte-identical; boundary matrix counts are verified separately.

Difficulty and spawning add 38 guarded names for the flag table, selection
bounds, probabilities, interval settings, reset/quota helpers, guard parameters
and spawn-queue locals. Independent native oracles check 82,944 flag cases,
56 array/index cases, 60 real-table progression ticks, 112 float/cast interval
cases, 150 bounded quota adjustments, seven reset guards and 1,332 selection
cases. The category/variant selectors use seeded Random instances; bounds,
guard outcomes and the number of consumed draws are independently checked.
Special-kind checks cover closed probability gates and invalid guards.

The additional 84,661-case trace has its own pin:
`8c66899b5955eac3380cc3aefd3cbe17a5063cc68f98cd507ff406cea4ae587b`.
A further 32,768-case comparator matrix verifies `ig.a(ZIBI)Z` in both order
modes with every byte guard, ties and integer overflow. Its independent oracle
checks priority and arithmetic failures; its trace SHA-256 is
`9be228f7421970f2214c74e8890327f8592f706dc90ccd0d0933e6f2fbe0a604`.
The original 52,164-case gameplay trace remains unchanged. The single manifest
binds all three trace constants and the full probe source hash. All variants verify
actual resulting state, including recursive guard failures and partial writes.
Spawn-queue angle/position locals and live special-kind thresholds also have
source evidence; these tests do not execute full spawning with real assets or
verify the live Math.random distribution. Quota tests use bounded inputs and
do not cover extreme overflow-driven loops.

Contact-physics producers, actual asset loading, new unlock delivery, device
audio and whole-game equivalence remain unverified. Text-writer guards <=23
retain a PCM side effect outside the direct writer probe. These source checks
do not establish FPS, heap or phone acceptance.

The preceding terminal-return pass reconstructs forward, nonthrowing terminal
returns inside the try when every normal predecessor belongs to that body.
Shared joins, throwing continuations, handler entries, retreating edges and
synchronized-region boundaries retain their external routing. This removes
254 generated selectors (265 to 11) and 3,125 raw source lines across 181 files.
All original CFG flow and exception-binding contracts remain checked.

The current generic emitter flattens conditionals when one arm provably exits,
using the shorter arm as a guard when both exit. It parses complete arms rather
than guessing from the last line, renders children in their original CFG order,
and retains a plain block when moving declarations would widen their scopes.
Condition inversion preserves Boolean and NaN semantics. Shared labels, catches
and synchronized bodies retain their destinations and scopes.

The previous early-exit pass removed 2,128 generated else wrappers (3,481 to 1,353) and 2,213 raw source
lines across 208 files. That pass preserved all 20,931
declaration identities and 388 override edges. The only duplicate-name method,
`wg.finalize`, is byte-identical. Current raw/readable comparison checks 151,774
bindings. The structural update migrated 35 named local ordinals. The following
naming pass added 38 guarded identities with the raw input unchanged, retaining all
1,170 prior semantic names. Reference inventory changes comprise 86 merged
unit increments, one assignment moved into an initializer and one unreachable
checked-catch sentinel. This inventory audit does not establish whole-program
equivalence.

The previous pass folded 77 literal assignment branches into conditional
assignments, removing 308 lines across 36 files. That pass made the 17 repeated integer Boolean
assignments in `ld.advanceDifficulty` compact expressions. Folding requires
complete single-assignment arms, the same primitive literal type and a proven
local of that exact type. Reference values, effects, boxing and narrow constant
assignments retain their branches. Integer carriers and shared tails remain.

That pass retained all 20,931 declarations and 388 override relationships,
with all 1,208 naming rules unchanged and zero ordinal migrations. The 77
removed references are duplicate assignment targets: 76 locals and one existing
initializer carrier lifted into a generated helper field. One enclosing return
guard in `ig.a(ZIBI)Z` also becomes shorter and is inverted by the existing
early-exit pass. Those fixtures cover 14 groups and 700 native comparisons; the
comparator matrix above checks the actual game method in all three variants.

The current pass proves every occurrence of a generated integer stack carrier
before changing it to a primitive Boolean value. Stores must be literal 0/1 values or a conditional
with literal bit arms, and all reads must compare with zero. It rejects unknown
syntax, shadowing, numeric uses and ambiguous offsets. Effectful and nullable
conditions retain snapshots at their original evaluation point. A single adjacent
use can inline a nonthrowing primitive condition if that statement does not
change any condition input. Integer and floating comparisons keep their original
NaN semantics and signed minimum literals.

This removes 221 generated locals and 442 lines across 75 files. Seventy locals
retain Boolean snapshots; one existing generated initializer field changes from
`int` to primitive `boolean`. All 17 difficulty carriers disappear, giving calls such as
`sa.recomputeSpawnReleaseInterval(!recursiveAdvanceGuard)`. The boundary scan's
13 result carriers become direct true/false returns. Fourteen obsolete named
carrier rules are removed, 61 surviving local rules migrate by method/original
spelling, and the named helper field has an explicit I-to-Z migration. All other
semantic names are retained. Both corpora compile with 20,710 declarations,
151,774 compared bindings and 388 override relationships. Normalizing those
identity migrations attributes every removed reference to one store/read pair
for an eliminated carrier; no other normalized references change.

The emitter passes 17 groups and 1,510 native comparisons, including 810 checks
for safe inlining, snapshot order, receiver/argument failures, nullable unboxing,
mutation, short-circuiting, loops, NaNs and signed minima. All six GeoBlox probes
retain their native traces. Unknown names and duplicated difficulty tails remain.

In the pinned java-tools checkout, run the focused checks:

```sh
node test/javaAstEmitterLoopExits.test.js
node test/structurer.test.js
node test/cfrFloatingComparisons.test.js
node test/cfrNestedLoopSplitting.test.js
node test/cfrExceptionLoopExits.test.js
node test/cfrCatchSemanticsRegressions.test.js
```

The retained early-exit fixtures cover 11 groups and 556 native comparisons of effect order,
NaNs, labels, early returns, exceptions, variable/local-class scopes and lock
release, including a retained scope block that previously acquired an
unreachable default return. Structurer, floating-comparison and nested-cycle
checks pass 13, four and three groups respectively. Exception exits and catch
regressions pass six groups and 18 assertions. Return-tail fixtures compare
1,560 int/long/float/double/
reference/void cases across normal and forced output, including boundaries,
NaN payloads, identity, effects, shared joins and outside failures. Another
15 cases verify normal synchronized reconstruction, lock state and release.
The forced dispatcher still refuses explicit monitors. A pre-existing default
return bug after an all-paths-return synchronized body is also fixed.
The retained loop-exit fixtures cover 7,200 native comparisons.

A clean Git source archive regenerates all 303 raw files and current diagnostics
byte-for-byte. Previous integral-sign and literal-shift cleanup remains, with
its historical proof recorded in the raw provenance. Current source/decompiler
identity and naming migrations live in the single manifest. `ruleChanges`
records naming changes; `sourceChange` is recorded when input identity changes.
This structural pass changes the input with explicit migrations for surviving
identities and explicit removals for obsolete carrier names. All six native probe sources and their traces are pinned in
the same manifest; no JSON snapshots are added.

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
| Raw | `54a54b0e7576a6af94adb3b69987428f011658f7b2513f6de27ba0dd45fdd331` |
| Readable | `86cd82c4001ce914e72bfad23ada9d45483937f9f7b13bbf5e15baede74b4901` |

Tree digests use `sourceIdentity(sourceInventory(root))` from the bundled tool.
