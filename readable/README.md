# Readable GeoBlox

The current export has 2,795 guarded naming rules: 27 classes, 501 fields,
293 methods, 821 parameters and 1,153 local declarations. Both 303-file corpora
compile, preserving 150,124 bindings and 388 override relationships. Unknown
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
`69542d632410cae4013a331e9a940ced1d7bd1bd`. It comes from java-tools
`049d323ff4d63b141315dba1fbf573abd4f5f735` and Deko
`a572c4dd0f0174bfcd7777be53d7ceba2f970f18`. The adapted naming tool is
`a0bc835957148b9b1e1f8221c59b79d899d22738`; its source archive SHA-256 is
`cb10756aa3ecb28159c9b81f2fb78bf559b4111d9ad203819458b30d0d84cf8c`.

The **decompiler repository source** SHA-256 is
`6d0fdd923685d9ede67052a8a1c826a5082ef6c7a961d9ce1cd727a805a2bc2e`:

```sh
git archive --format=tar 049d323ff4d63b141315dba1fbf573abd4f5f735 | sha256sum
```

This identifies tracked decompiler source and its Git archive metadata. It is
separate from a game JAR or the Java source-tree hashes below.

The preceding naming pass added 171 guarded identities: two image-constructor
parameters and 169 locals. Every parameter and local declaration in `Sprite`,
`ArgbSprite` and `IndexedSprite` now has a guarded semantic name. This completes
the ARGB nearest-rotation geometry, bilinear weight/channel arithmetic,
half/quarter reductions, copying, outlining, cropping and image-loading names.
That naming pass preserved its raw source and generator pins along with all
2,233 prior rules. The previous structural refresh retained all 2,404 rules and
27,172 identifier edits, comparing 150,387 bindings and 388 override edges.

The existing drawing probe retains its previous nine-slice and pixel traces.
A separate 33,168-case transform trace adds 23,340 independent oracle cases for
cardinal rotations, bilinear interpolation, reductions and sprite mutations.
Another 9,828 cases preserve native general-angle/extreme-scale traces. ARGB
smooth rotation inherits the RGB bilinear routine; inherited copies return RGB
sprites. AWT image loading/interruption, arbitrary malformed geometry,
real-asset rendering and whole-game equivalence remain unverified.

## Current unread receiver cleanup

The generic decompiler now removes allocator-owned Object slots whose only
stores are `this` or `null` and whose complete parsed body contains no reads.
Calls, casts, field access, shadowing, Unicode escapes and unsupported syntax
refuse removal. Exception handlers, finally blocks, monitors and live Boolean
snapshots retain their scopes and behavior. The fixed transformed bytecode
and the frozen naming tool are unchanged; no raw source body is edited by hand.

This removes 75 locals and 188 lines across 19 raw/readable files, including
45 lines in `GameplaySession`. The binding audit attributes 113 removed local
store references and 75 Object declaration-type references. After 293 explicit
local ordinal migrations, every surviving binding and all 388 override rows
match. Twenty guarded names disappear with their dead declarations; 28 surviving
named locals change ordinal, preserving their original spellings, names and
evidence. The current 2,795 rules apply 29,076 identifier edits.

The generic emitter suite passes 33 groups, including 96 new native comparisons
for effects, exceptions, finally priority and lock release. The exception-loop
suite passes eight groups and the additional-feature checks pass 77 assertions.
A clean archive of the pinned decompiler reproduces all 303 raw files and the
diagnostics byte for byte. The six existing game probes compare fixed native
bytecode with raw and readable Java; their trace hashes remain unchanged.
These checks cover the documented fixture scopes, not full-session execution
or whole-game equivalence. Other opaque names and shared joins remain.

## Previous gameplay tick and motion naming

This pass adds 152 guarded identities: one method, 47 parameters and 104 locals.
It preserves all 2,663 previous complete rules and the existing raw/generator
pins. The export applies 29,126 identifier edits while retaining 150,387 bindings
and 388 override relationships. Every parameter/local in the session update,
moving-contact producer, attached update and entity constructor/motion initializer
now has a guarded semantic name. Other methods and classes remain partly opaque.
Combined names preserve reused-slot roles; generated unused owner snapshots
remain explicit, with no handler or control-flow rewrite in this naming pass.

The existing gameplay probe adds a separate 4,500-case native motion matrix:
50 actual constructors, 100 velocity integrations, 600 valid-guard board rotations
and 3,750 initializations. Independent arithmetic/state oracles cover signed zero,
near-center/extreme coordinates, zero/extreme velocity, negative/zero/NaN/infinite
speeds, ordinary/amorphous kinds, unused float inputs and partial writes before
division failures. Its trace is
`002e562320b82c572202b5df57ea645a7f71630b6f78e379d60fac1a41de1dd4`.
The original gameplay, boundary, difficulty and comparator traces remain pinned.
Moving/attached contact producers, the full session tick, recursive invalid
rotation guards, live assets and whole-game behavior remain unverified.

## Previous dispatcher naming and export refresh workflow

This naming pass adds 104 guarded identities: 13 fields, nine service methods,
29 parameters and 53 locals. Every previous rule remains unchanged, as do the
raw source and generator pins. The export applies 28,446 identifier edits and
preserves all 150,387 bindings and 388 override relationships. Dispatcher fields,
request APIs and worker/constructor variables now describe their roles; numeric
task IDs, guards, bit packing, catch boundaries and reused local roles remain.
Generated sneakyThrow identifiers already describe their role and stay unchanged.

`node readable/reproduce-geoblox.mjs --update` regenerates the existing export.
It verifies a temporary staged tree before replacing the current output, cleans
staging afterward, and retains the previous output when validation fails.
Unmanaged files and symlinks refuse replacement. `--update` targets only the
current export and cannot be combined with `--check` or another output path.
Maintain one current rules manifest and one current generated export; use Git
for history, with no dated rule files or additional maintained JSON reports.
The existing migration/refusal tests check preservation after bad evidence,
stale spelling guards and unmanaged entries, plus refresh argument restrictions.

New service names are audited against dispatcher and adapter source. Existing
native helper/cache/socket/shutdown traces cover their documented scopes; live
worker service execution, constructor platform effects, networking and desktop
operations remain unverified.

## Previous protected-counter recovery

A native shutdown fixture exposed a correctness bug in the previous Java export:
a for-header update was inferred from the null-entry continue while explicit
success/catch updates remained. A five-entry cache array closed only indices
0, 2 and 4; native bytecode closes all five. Preferences search has the same
continue/caught-failure shape. Recovery now requires exactly one selected update
on every normal/own-continue backedge and zero on other exits. Other counter
writes, shadowing, unsupported syntax/Unicode and protected/monitor/nested-loop
update movement refuse conversion. Eligible ordinary counting loops still
become for loops; uncertain bodies retain explicit while paths.

The raw refresh changes only d.java and qc.java, adding eight lines. All 20,708
declarations, 129,679 reference occurrences and 388 override rows remain after
normalizing 24 unguarded local-order changes. No existing guarded identity needs
migration. Compilation and unchanged reference counts alone did not reveal
the bug; native visitation checks do.

This pass adds 41 guarded names for dispatcher shutdown, cache handles and
preferences search. It retains every previous spelling/name and corrects one
evidence note: URL-stream task type is 4; reverse DNS is 3. Its 2,559 rules
apply 27,995 identifier edits and preserve all 150,387 bindings.

The generic exception-loop suite passes eight groups, including 600 native
protected-counter cases compared with both structured and forced-dispatcher
Java (1,200 comparisons); additional-feature assertions pass 77/77 and nested
exception-cycle groups pass 3/3. The existing game helper probe adds 96 shutdown
cases with independent complete cache-close order and failure/null-entry checks:
`86554dba87ac6740912bf88fcd328c871758629250b6277e4223e4955bfcfb29`.
Previous helper/cache/socket traces remain unchanged. The decompiler source
archive reproduces all 303 Java files and diagnostics byte for byte.
Preferences filesystem search, Windows URL launch, invalid shutdown guards,
live worker joining and real-device cache concurrency remain unverified.

## Previous socket/task naming

This naming pass adds 114 guarded identities: three classes, 24 fields,
11 methods, 29 parameters and 47 locals. It preserves all 2,404 prior rules,
the raw input and generator pins. The export applies 27,837 identifier edits
and preserves all 150,387 bindings and 388 override relationships.

`BufferedSocket` replaces `ba`, `PlatformTask` replaces `cb`, and
`PlatformTaskDispatcher` replaces `d`. Socket reads, enqueue, shutdown and
failure checks now have distinct API names; stream, ring, task and exception
roles are named. Every BufferedSocket parameter and nonselector local is named.
`Runnable.run`, `finalize`, numeric guards, the live routing selector and
original diagnostic string literals retain their identities/behavior.

The existing result-helper probe adds 308 cases with independent byte/state
and effect checks: constructor configuration with fake sockets, synchronous
reads and partial failures, pending write failure consumption, lazy buffer
allocation, enqueue wrap/reserve limits, and deterministic writer drain with
write/flush/close failures. Native bytecode, raw Java and readable Java match
`ed8f7d5f5438f4fb39cb3bceca82a861d01f4e08502ca73ba7af8ca475b6292b`.
The previous 84 shutdown, 140 cache and 13,927 helper cases remain unchanged.
Dispatcher service execution, normal open-writer waiting/concurrency, browser
navigation and actual network/device I/O remain unverified. Static helpers on
this owner are named from source evidence separately from its socket role.

## Previous scoped-tail cleanup

The decompiler coalesces terminal work inside existing plain blocks, removing
189 lines across seven files. Each block retains its braces and declaration
scope. Loop, label, try and monitor bodies remain intact. If ordinary factoring
cannot prove a continuation past an opaque prefix, an exact terminal clone can
skip that prefix through a new plain-block label. Only a terminal break to that
new block can disappear; conditions still evaluate. Retained new labels are
bounded to 512-token prefixes. No new exit label remains in this game export.

`ba.b(I)V` now clears its task reference once after the null-task/status/join
paths. The synchronized close/notification, volatile wait and InterruptedException
handler remain in place. The resulting dead selector and empty test disappear,
reducing selectors from ten to nine. One declaration and 409 references vanish;
no references are added. Five unguarded shutdown local ordinals shift down, with
no guarded migration. All 2,404 naming rules and 388 overrides are retained.
Duplicate coalescing reduces identifier edits by 50, to 27,172.

The generic emitter passes 31 groups, including 432 new native plain-block
comparisons of scopes, loop skips, nullable conditions, checked/fatal failures,
finally effects and monitor release. The existing result-helper probe adds an
84-case shutdown trace with independent state/interrupt/task/monitor checks:
`2fec6ee86681993c79d39ef1e57026f31fd9b0a87b7d7f94a5bddf5af83d6335`.
The previous result-helper and 140-case cache traces are unchanged. Shutdown
holders bypass constructors; valid close guards below -117 are exercised.
Guard-triggered `run()`, stream I/O, ordinary live blocking joins and real
network/device behavior remain unverified, as does whole-game equivalence.

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
original source. Refresh the current export with
`node readable/reproduce-geoblox.mjs --update`; it validates the staged output
before replacing `readable/geoblox`. Review the resulting Git diff. Generated
Java is never edited by hand.

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

The drawing probe retains its 2,592 nine-slice cases and separate original trace.
Its additional 45,074 sprite cases use four crop/canvas layouts, three pixel
patterns, five clips, five placements and alpha boundaries. The independent
oracles compute channels separately from the packed kernels and map destination
coordinates back to the logical source canvas. They check RGB/ARGB copies,
blends, gray tint/modulation, additive saturation, RGB multiply/silhouette,
nearest scaling and palette indexing. Palette zero transparency depends on the
index, including nonzero indexes whose palette color is zero; signed byte
indexes are converted to unsigned values. Reductions, run-marker clipping and
invalid alpha values have fixed native traces without independent oracles.
The additional trace SHA-256 is
`c986ff493508bf516e6bd33e187ee51ed478a012dfebf467a8b76e00f78a1f09`.

The separate transform matrix independently checks 18,144 nearest cardinal
rotations with negative/zero/positive power-of-two scales, fractional Q4
centers, alternate pivots, cropped layouts and clipping. Its oracle maps each
destination pixel directly to source coordinates instead of reproducing the
nine clipping branches. Another 4,860 private bilinear cases check source-edge
neighbors, fractional masks, truncated weights, the half-coverage threshold and
forced nonzero output. The 216 reduction cases compute channel averages
separately; 120 copy/mirror/quarter-turn/outline/crop cases check pixels,
canvas/crop geometry, return class and buffer independence. The 9,828
remaining rotations compare fixed native traces, recording exception kinds and
resulting pixel buffers, and have no independent semantic oracle. The transform trace SHA-256 is
`dd7445f0f6dc8c030467f58606545b95ee42afc9846ccaeebc79107f353583c1`.

Matching/scoring covers 708 controlled scenarios and 55,728 ticks per variant.
The text writer covers 152 cases, including retained suffixes, empty/growing
writes, UTF-16, live aliasing, offsets, partial writes and throwable identity.
`writeTextAtOffset` grows the builder when needed and preserves old trailing
characters after shorter writes. Result probes cover 27 scenarios/26,043 ticks,
120 selector cases, 4,801 PCM factory cases, 9,000 bounds checks and six music
returns. The same result-helper probe also covers 140 cache-write cases with
independent file-byte, offset and guard checks, plus 84 controlled shutdown
and 308 controlled socket I/O cases, plus 96 dispatcher shutdown cases.
Native, raw and readable traces
match within those controlled scopes.
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
The boundary scan names all 14 remaining local declarations and its method
guard, including four row-center cursors. Its obsolete selector and thirteen
result carriers are removed; direct true/false returns remain on their original
paths inside the try. The 13-arm post-try ladder is gone.
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
`wg.finalize`, is byte-identical. Current raw/readable comparison checks 150,124
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

The previous pass proves every occurrence of a generated integer stack carrier
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

The previous local pass factors identical whole tails after the carrier cleanup,
including clones left after proven early-return guards. It verifies the complete
known syntax and balanced token extents, and retains original expression bytes.
Moving an if tail changes no handler, monitor or label boundary. Branch-local
declarations refuse factoring. Nested try, monitor, loop and labeled bodies
remain whole; tails are not extracted from inside them. Empty prefixes retain
condition evaluation, and floating relational complements use logical negation.
Sharing only a bare return keeps existing guard ladders.

This removes 451 lines across 16 files (86,455 to 86,004). The difficulty method
shrinks from 220 lines to 69, with one nested tail then remaining. All 20,710 declaration
identities, 388 override rows and 1,194 guarded rules are unchanged. No naming
migrations occur. Exactly 890 reference occurrences disappear, with none added;
that mirror checked 150,884 bindings and made 18,657 identifier edits.
The emitter passes 19 groups and 2,329 native comparisons, including 819 new
checks of effects, throwing conditions, nullable unboxing, input mutations,
nested arms, NaNs and whole handler/monitor tails. Whole-program equivalence
remains unverified. All six native game probes retain their pinned traces.

The previous pass also reconstructs nested terminal continuations, discarding a
virtual continuation on an existing return/throw/jump path. Every crossed
if/block scope must remain free of declarations. No condition is evaluated
again. Final straight factoring refuses repeated source statements and identifier
occurrences; an exact return/throw clone can instead break from a deterministic
plain block. Generated labels avoid every existing identifier. Native fixtures
exercise those labels, but GeoBlox needs none. Loop/switch/old-label completion
is not assumed, and no search enters a raw try, monitor, loop or labeled body.
Bare transfer guards remain intact. AST children are deep-copied by createNode,
so the duplication check uses exact source spelling rather than object identity.

This removes another 21 lines across seven files (86,004 to 85,983). The difficulty
method then reached 56 lines, down from 69, with one probability/rotation/interval tail.
Four unnamed v.a(B)V snapshots reorder their declaration ordinals. Matching all
20,710 declarations by method and original spelling preserves the full inventory,
all 388 override rows and every one of the 1,194 guarded rules. Exactly 57 reference
occurrences disappear and none are added after this normalization. That
mirror checked 150,827 bindings and made 18,625 identifier edits. The emitter
passes 21 groups and 4,849 native comparisons, including 2,520 new checks of
multiple enclosing exits, skipped effects, partial writes, nullable conditions,
signed zero/NaNs, sentinel throwable identity and label collision avoidance.
All six game probes retain their native traces within their recorded scopes.

The previous structural pass uses integral-predicate evidence from the already-rendered
JVM operand cache. An exact source spelling is usable only when all matching
predicates and their complements have integral evidence; conflicting or unknown
evidence invalidates both sides. No block is rendered again. Floating and
untyped relational conditions keep logical negation, preserving NaNs and
unboxing failure. Original operand bytes and evaluation order remain intact.

This removes 18 lines across four files (85,983 to 85,965). The difficulty method
shrinks from 56 to 38 lines, coalescing its category-update and recursive-advance
clones. The category flag table is still re-read after recursion. Every one of
20,710 declaration keys and original spellings, all 388 override rows and all
1,194 guarded rules are unchanged. No ordinal migrations occur. Exactly 26
reference occurrences disappear and none are added: two category-update clones
and two recursive-advance clones. That mirror checked 150,801 bindings and
made 18,611 identifier edits. The emitter passes 23 groups and 40,129 native
comparisons, including 35,280 new checks of all integral relational complements,
signed long/int boundaries, throwing operands and effect order, plus unknown
floating and nullable comparisons. Cache immutability and conflicting evidence
have focused checks. All six game probes retain their recorded native traces;
whole-game equivalence remains unverified.

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
The latest structural pass records its source migration in Git. The current
naming-only pass retains those source pins and records its 152 additions in
`ruleChanges`; every prior guarded rule is retained.
All six native probe sources and their traces are pinned in
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
   program. Run `node readable/build-geoblox-rules.mjs --check`, then
   `node readable/reproduce-geoblox.mjs --update` to refresh the current output.
4. Review the diff, run the relevant behavior probes and full binding check,
   reverse the dictionary, and verify the refreshed generated outputs. Keep verification
   results current in the manifest; use Git for history instead of new snapshots.

| Java source tree | SHA-256 |
| --- | --- |
| Raw | `b18afdee6bf7d59ae30800e398696f8f0319943a75296c5608fe7708968c7bf1` |
| Readable | `e6094e53b4baf24e17942cde8ea05d4d109af8f4b777e6cffdd9a20244f569c3` |

Tree digests use `sourceIdentity(sourceInventory(root))` from the bundled tool.
