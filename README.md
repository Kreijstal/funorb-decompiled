# funorb-decompiled

Decompiled Java source for **FunOrb / AlterOrb** games.

This repository contains the reconstructed Java for 44 FunOrb/AlterOrb game
gamepacks, produced by a custom, **owned JavaScript decompiler** — not CFR,
Vineflower, or any other off-the-shelf tool. The decompiler is part of the
[java-tools](https://github.com/Kreijstal/java-tools) toolkit and was driven
over the obfuscated gamepacks by the pipeline in
[dekobloko-work](https://github.com/Kreijstal/dekobloko-work).

## Readable GeoBlox export

This repository owns the generated Java exports. The cloner repository owns
loading and diagnostics scripts and does not track `.java` files. The
readability generator, rules and proof fixtures belong in `dekobloko-work`; this
repository publishes their matching Java export, dictionary and provenance.

[`readable/geoblox/src`](readable/geoblox/src) contains the reproducible readable
mirror. The current [manifest](https://github.com/Kreijstal/dekobloko-work/blob/c66ee0af3d13865ac6cbf482d198de689e64e450/readable/geoblox-rules.json) records its exact
input, guarded names and evidence; the [reproduction procedure](readable/README.md)
and [gameplay reading guide](readable/GEOBLOX-READING-GUIDE.md) describe the
current export. Names omit opaque suffixes and the dictionary preserves original
identities. Both 303-file Java corpora compile and compare 136,607 bindings,
preserving 388 override relationships.

Pass 133 recovers 21 ordinary guarded loops across 14 methods and 12 files.
Previously, `while (true)` put its guard in a first `if` and buried the complete
continuation inside the loop. The generic decompiler now proves that neither
arm nor continuation can fall through, that the arm cannot exit this loop,
and that the continuation cannot transfer back to it. Transfers consumed by
inner loops, switches and labels are distinguished from exits of the arm;
catches are conservative and finally overrides keep their original meaning.
The exact guard becomes the loop condition and the complete continuation follows.

Bzip2 selector-rank and Huffman-table decoding now use
`while (index < selectorCount)` and
`while (huffmanTableIndex < huffmanTableCount)`, with their following work outside
the loops. Music packed-event counting similarly uses its track-count guard.
Board reconciliation, menu/input helpers and pixel/triangle routines also gain
ordinary loop conditions. Every old break/continue target and label remains.
Condition evaluation order, partial effects, numeric states, overflow,
exception/finally/monitor ownership, scopes and diagnostics are unchanged.
No client-control flag value is assumed. Potentially constant headers, consumed
inner-loop exits, repeating continuations, ambiguous labels and unknown syntax
refuse reconstruction. Direct continuation declarations keep separate braces.

The raw tree loses 42 scaffolding lines: 76,230 lines remain, with the same
188 block labels and 58 loop labels. Bzip2 block decoding falls from 385 to 381
lines, the music constructor from 519 to 517, board reconciliation from 333 to
331, and sorted RGB triangle rendering from 364 to 362. Eight bodies of at least
300 lines still retain labels; all their 51 labels are named. Across the tree,
192 labels and other unmapped members remain opaque. All 11,635 complete naming
rules survive, with the same 88,331 identifier, eleven class-literal and 184
label edits. This improves loop structure without adding or altering naming rules.

Four focused groups pass, including six native variants with 13,392 comparisons
against 13,392 independent loop-model oracle cases. Coverage includes nullable
and effectful guards, catch priority and exception identity, enclosing transfers,
finally overrides and return-value snapshot timing, declaration scopes and
monitor release. The relevant suite passes 113 tests with one existing skip.
Fresh decompilation from a clean tracked source archive reproduces all 303 Java
files and diagnostics byte for byte. The shared source proof independently
replays all 303 complete token streams and preserves 136,607 ordered Java
bindings, 388 overrides and 813 lexical label records without ordinal migrations.
Reproduction, byte-exact reversal, 27 publication checks and all eight fixed
native game probes pass within their stated scopes. Full-game/assets/server/
browser/phone and heap/FPS acceptance remain unverified.

Pass 132 adds 244 guarded names across eight intrusive collection/node classes
and the Bzip2/music labels: 23 fields, 30 methods, 69 parameters, 112 locals
and ten labels. Hash tables now expose `findByKey`, `put`, `bucketSentinels`,
`bucketCount`, `lookupCursor` and iteration cursors; iterators expose their
own table/deque, next node and last returned node. Primary and secondary links
remain independent. Callers in caches, MIDI and gameplay use the same names.
All parameters and locals in these eight classes are named. The packed ranking
count array in `NodeHashTableIterator` stays opaque because its semantic meaning
is not established; Java Iterator/Iterable method names stay unchanged.

The unrelated helpers now identify login initiation, the one-byte pending login
Boolean reply, archive-loading completion, tooltip anchor X, integer power,
partially filled sprites and session-text read/hash. Names describe the inspected
implementations and callers without guessing protocol meanings. Guard failures,
partial cleanup/link effects, sentinel/null exhaustion, arithmetic/overflow,
exception scopes and original diagnostic strings remain. No raw bodies change.

All ten labels in `Bzip2Decoder` and `MusicScore` now identify block/selector/
Huffman/run decoding, state commit, packed-event counting, MIDI track output
and earliest-tick collection. All labels in the eight bodies of at least 300
lines now have guarded descriptive names. Those bodies retain their lengths and
structure; naming does not reconstruct their loops. Across all 303 sources,
192 labels remain opaque: 145 block labels and 47 loop labels.

All 11,391 previous complete rules survive. The export has 11,635 guarded rules,
88,331 Java identifier edits, eleven class-literal edits and 184 label edits:
88,526 edits in total. Both 303-file trees compile and preserve 136,607 ordered
bindings, 388 overrides and 813 lexical label records. The raw source, tracked
decompiler-source tar, naming/workflow sources, stubs and source/native/text
proof pins stay unchanged. Reproduction, byte-exact reversal of all 303 files,
27 publication checks, all eight fixed native probes and the existing deque
fixture pass within their stated scopes. Unknown members and large shared joins
remain; full-game/assets/server/browser/phone and FPS/heap targets are unverified.

Pass 131 recovers three guarded jumps while retaining their shared exit labels:
`GameplaySession.renderSession`,
`BoardReconciliationSupport.reconcileBoardEntities` and
`AchievementSubmission.projectMeshAndQueueFaces` now use inverse conditionals
for their entry-arm suffixes. All other references must lie in the complete
fallback, which becomes `else` inside the original labeled block. Its nested
loops, scopes, finally/monitor boundaries and exit destinations stay intact.
Prefix/arm references to the shared label still refuse this reconstruction.

In debug rendering, position/gray calculations still precede the control-flag
test. The draw/advance/continue sequence runs under the inverse condition;
the fallback's queue traversal and final shared exit remain. Nonzero values keep
their original partial-effect path. This does not assume the client flag is zero.

All 11,391 previous complete naming rules and label ordinals remain. Two named
break references disappear, reducing label edits to 155; all 44 labels in the
six tracked gameplay/menu/triangle bodies retain their names. The raw tree still
has 76,272 lines, 188 block labels and 58 loop labels. All 136,607 ordered Java
bindings and 388 overrides match. Label records fall from 816 to 813: the source
proof identifies exactly the first guarded break to each of the three retained
labels and verifies every remaining destination. The complete inventory still
has eight bodies of at least 300 lines with labels; 202 labels elsewhere and
unmapped members remain opaque.

Six focused groups pass 725,760 native comparisons and 48 independent oracles,
covering skipped/executed suffixes and fallbacks, nested loop/switch transfers,
finally overrides, throwing effects, local scopes, nullable guards and monitors.
The relevant decompiler suite passes 109 tests with one existing skip. A clean
tracked decompiler archive reproduces all 303 sources and diagnostics byte for
byte. Full reproduction, reversible dictionaries, 27 publication checks and
the eight fixed native game probes pass within their documented scopes.
Full debug rendering/session update, full mesh execution, assets/servers,
browser/phone and heap/FPS acceptance remain unverified.

Earlier guarded suffix recovery (pass 130):

Pass 130 extends guarded-exit recovery to complete multi-statement suffixes.
Ten labeled exits become ordinary conditional alternatives across eight methods:
highscore rendering, Windows-shell URL validation, the gameplay keyboard loop,
both mesh face-queue entry points, domain-label validation, three board
reconciliation loops and nine-slice construction. The suffix stays together
under the inverse guard, including nested scopes and cleanup; the complete
fallback becomes `else`. Prefix evaluation, nonzero control-flag paths, numeric
states, effect order, original diagnostics and exception/monitor boundaries remain.
The debug renderer retains its frame because another fallback path also exits it.

The raw tree loses twenty lines and ten block labels: 76,272 lines,
188 block labels and 58 loop labels remain. All ordered 136,607 Java bindings
and 388 override relationships match. Fifteen surviving label ordinals migrate,
including eight named rules; four consumed label names retire. Every unaffected
complete rule remains. There are 11,391 naming rules and 157 label edits;
all 44 surviving labels in the six tracked gameplay/menu/triangle bodies are named.
Across all 303 sources, eight bodies of at least 300 lines retain labels, including
`Bzip2Decoder.decodeBlocks` and the `MusicScore` constructor. There are 202 opaque
labels elsewhere and unmapped members; readability remains unfinished.

Five focused groups pass 514,080 native comparisons and 31 independent oracles,
including executed/skipped suffixes, scoped locals, throwing cleanup, monitors,
switch fallthrough, nullable unboxing and loop transfers. The relevant decompiler
suite passes 108 tests with one existing skip. The source proof checks all 303
expected token streams, complete ordered bindings and surviving label targets;
a clean tracked decompiler archive reproduces all source and diagnostics bytes.
Publication checks and the eight fixed game probes retain their stated scopes.
Full session/menu rendering/update, real mesh queueing and shell launch, assets,
servers, browser/phone and heap/FPS acceptance remain unverified.

Earlier guarded abrupt recovery (pass 129):

Pass 129 replaces eight labeled exits with ordinary conditional alternatives
across six bodies. Three disappear from `GameplaySession.renderSession` and one
from `GameScreen.updateScreen`; the applet update loop, disk-cache write path,
ranked-list helper and entity cleanup lose one each. A branch retains its work,
then performs its existing return/throw/loop transfer under the inverse guard.
Its complete fallback becomes an `else`. Guards still evaluate once after the
prefix; nonzero client-control paths, exception coverage, finally effects and
monitor ownership remain. Equality inversion preserves NaNs and unboxing;
other predicates keep exact logical negation. Prefix locals and single-statement
if/loop positions retain their required braces.

The raw tree loses sixteen lines and eight block labels: 76,292 lines,
198 block labels and 58 loop labels remain. All ordered 136,607 Java bindings
and 388 override relationships remain. Eleven surviving label ordinals migrate,
including nine named rules; four consumed label names retire. All other complete
rules are preserved. There are 11,395 naming rules and 165 label edits; all
48 surviving labels in the six large bodies remain named. Six large bodies,
208 opaque labels elsewhere and unmapped members still need work.

Four focused groups pass 347,760 native comparisons and fifteen independent
oracles, including effects, transferred values, field/local shadowing, dangling
else, NaNs, nullable unboxing, throwing cleanup and monitors. The emitter and
exception/integer-argument suite passes 107 tests with one skip. The source proof
checks all 303 expected token streams, complete ordered Java bindings and
surviving label destinations; a clean tracked decompiler archive reproduces
all source and diagnostics bytes. Publication checks and the eight fixed game
probes retain their stated scopes. Full applet/renderer/menu execution, real disk
cache I/O and ranked sorting, assets/server/browser/phone and heap/FPS acceptance
remain unverified.

Pass 128 removes a whole-method refusal in the generic decompiler: an ordinary
colon switch no longer prevents recovery of proven captured-local guards.
`GameplaySession.renderSession` loses four redundant comparisons before loop
continues, and `GameScreen.activateMenuItem` replaces one labeled conditional exit
with an `if/else`. The switch selector, nonzero control-flag paths, evaluation
order and exception/finally/monitor boundaries remain. The raw tree loses twelve
lines and one opaque block label: 76,308 lines, 206 block labels and 58 loop
labels remain. Six large labeled bodies and unmapped members still need work;
all 52 labels in those six bodies retain their descriptive names.

All 11,399 previous complete naming rules and guarded ordinals are preserved.
The export has 87,406 Java identifier edits, eleven class-literal edits and
173 label edits, comparing 136,607 Java bindings and 852 label records across
303 compiling sources. Four new generic test groups pass, including 15,120 native
comparisons and ten independent oracles for case entry, fallthrough, selectors,
transfers, cleanup and monitors. The emitter suite passes 93 tests with one skip;
ten exception-loop/integer-argument checks and 27 publication tests pass. The
new source proof checks all 303 expected token streams, unchanged declarations
and overrides, and ordered surviving references/label targets. A clean tracked
decompiler archive reproduces all source and diagnostics bytes. The eight fixed
game probes retain their documented scopes; full renderer/menu action, assets,
servers, browser/phone and heap/FPS acceptance remain unverified.

Pass 127 adds 52 guarded label rules, covering every label in the six large
bodies: menu render/update, gameplay render/update, board reconciliation and
sorted RGB triangle rendering. Fifty describe plain-block exit scopes; two name
component-traversal loops. The export has 11,399 rules, the same 87,411 Java
identifier edits and eleven reflected class-name edits, plus 173 separate label
edits. All 11,347 previous complete rules survive. Class coverage stays 302
renamed plus `Geoblox`; the six large bodies retain their structure and length.
There are still 213 opaque labels elsewhere and unmapped members.

The frozen naming dependency now supports `B:owner.method(descriptor)#ordinal`
identities and the explicit `labels` policy `lexical-targets`. It audits 265
label declarations and 854 declaration/break/continue records separately from
136,612 Java bindings. Each transfer retains its original kind and exact lexical
AST target, even when a spelling is reused in disjoint scopes. Names describe
existing regions; they do not infer that the client control flag is zero, replace
numeric state or relax exception-region reconstruction. Dictionary reversal
recovers all 303 raw sources exactly.

Fifteen generic naming tests plus four subprocess tests pass, including runtime
loop/finally/monitor traces, guard/count refusals and exact reversal. The default
five-path audit remains byte-identical to the previous frozen helper on all303
sources; extra label and class-literal records are opt-in. The 27 publication
tests and all eight fixed native probes pass within their scopes. Compiling the
previous pass126 and current exports with the same JDK and release8 options gives
304 byte-identical class files. Clean committed checkouts reproduce the export.
Raw source, decompiler/bytecode and all native source/trace pins remain; explicit
source migration pins the new naming dependency, workflow and label policy.
Full-game/assets/server/browser/phone and heap/FPS acceptance remain unverified.

Pass 126 added 153 guarded names: fourteen classes, 32 fields, 28 methods,
52 parameters and 27 locals. All 11,194 previous complete rules survive.
The export has 11,347 rules and 87,411 identifier edits plus the same eleven
separately recorded reflected class-name edits. All 303 top-level classes have
meaningful names: 302 renamed and the original `Geoblox`. All parameters and
locals in the fourteen audited owners have guarded names. Unmapped members,
six large labeled bodies and 207 plain-block labels remain.

The named paths cover session socket task polling, packet buffers/header and
opcode history, bootstrap stages/localized loading text, generated-entity quota,
validation scratch and raster restoration/copy/outline helpers. Shared statics
stay on their original owners. The option mask has no fixed-source nonzero
producer; a received session-access byte is not assigned undocumented server
privileges. The power-of-two helper retains overflow and wrong-guard return,
and outline expansion retains its signed pixel>1 and zero-neighbor conditions.

The prior manifest exceeds the generic subprocess capture limit of 8 MiB.
Only the workflow's historical-manifest read now allows a bounded 32 MiB;
compiler and frozen generic naming limits stay unchanged. An explicit
`sourceChange` records the builder hash, and a regression fixture commits a
padded historical manifest above 8 MiB and verifies its exact Git-byte hash.
Raw source, decompiler, bytecode, frozen naming tool and eight native fixture
pins stay unchanged. The 26 publication tests and all eight native probes pass
within their existing scopes. All 303 sources reproduce and reverse exactly;
clean committed checkouts reproduce the export. This pass does not add live
socket/header/login/bootstrap service, assets/server/browser/phone or performance
coverage.

Pass 125 added 292 guarded names: thirteen classes, 40 fields, 34 methods,
78 parameters and 127 locals. All 10,902 previous complete rules and source,
naming-tool, decompiler, bytecode and native fixture pins remain. The current
export has 11,194 rules and 86,300 identifier edits, with the same 11 separately
recorded class-name literal edits. All parameters and locals in the thirteen
audited owners have semantic names. Both 303-file corpora compile and compare
136,612 bindings, 388 override relationships and 11 reflected class-literal
records. Dictionary reversal recovers all 303 pinned raw files byte-for-byte.
Class coverage is 288 renamed, one meaningful original name and 14 opaque
top-level names; six large labeled bodies and 207 plain-block labels remain.

The named paths connect session bootstrap/packet buffers, FIFO and CRC
acknowledgements, account/username flow tokens and form values, username result
handling, login UI/archive progress and fullscreen task completion. The three
flow markers remain distinct identity objects with throwing `toString`; no enum,
state numbers or wire values replace them. Mixed-purpose statics stay on their
owners. Guards, aliasing, partial writes, recursive failure paths, byte counts,
signed arithmetic and exception/monitor boundaries remain. The 25 publication
checks and all eight fixed native probes pass within their existing scopes; the
committed export reproduces from clean checkouts. No new live acknowledgement,
account/network/server, seed-file write, hardware fullscreen, browser/phone or
full-game/performance coverage is added by this naming pass.

Pass 124 added 306 guarded names: ten classes, 23 fields, 32 methods,
63 parameters and 178 locals. All 10,596 previous complete rules and source,
naming-tool, decompiler, bytecode and native fixture pins remain. The export now
has 10,902 rules and 84,798 identifier edits, with the same 11 separately recorded
class-name literal edits. All parameters and locals in the ten audited owners,
plus the selected cross-owner text primitives, have guarded semantic names.
Both 303-file corpora compile and compare 136,612 bindings, 388 override
relationships and 11 reflected class-literal records. Dictionary reversal recovers
all 303 pinned raw files byte-for-byte. Class coverage is 275 renamed, one meaningful
original name and 27 opaque top-level names; six large labeled bodies and 207
plain-block labels remain.

The named chains cover exact-size byte-array pool acquisition/storage, corrected
wall-clock sampling and session elapsed time, shared GMT cookie timestamps,
settings-cookie writing, UTF-16 reversal, ASCII letter/digit predicates, signed
radix parsing, selected-range concatenation, character replacement and sprite
loading. Shared statics remain on their original owners. The calendar remains
mutable/shared; wrong guards, recursion, partial writes, numeric flags, arithmetic
overflow, strings and exception/monitor boundaries remain unchanged. No new live
clock/cookie/archive/platform/game/browser/phone performance coverage is added.
The 25 publication checks and all eight fixed native probes pass within their
existing scopes; all sources reproduce from clean committed checkouts.

Pass 123 named the five previously held reflective implementations:
`AwtMouseWheelListener`, `BufferedImageRasterBuffer`, `AwtFullscreenBridge`,
`AwtCursorBridge` and `LegacyDirectSoundBridge`. It adds 58 guarded naming rules:
five classes, six fields, two methods, 18 parameters and 27 locals. All 10,538
previous complete rules and raw/decompiler/bytecode inputs remain. The export
has 10,596 rules and 83,103 identifier edits, plus 11 separately recorded class-name
literal edits. All 303 sources compile, compare 136,612 Java bindings and
388 override relationships; 11 literal target/position records are checked
separately. Class coverage is 265 renamed, one meaningful original name and
37 opaque names. Six large labeled bodies and 207 block labels remain.

The generic naming dependency now supports an explicit, count-guarded policy
for direct `java.lang.Class.forName` literals targeting owned classes. It proves
the called Java method through javac, leaves ordinary strings/comments and
public reflective member spellings unchanged, refuses escaped renamed targets,
and reverses the new literal edits through the same dictionary. Dynamic strings,
concatenation, `ClassLoader.loadClass` and reflective member-name rewriting are
outside this policy. Twelve generic tests and 25 publication tests pass. All
eight native probes retain fixed hashes, including 122 new headless checks for
five class loads/member contracts, wheel factory/event/guard/drain behavior and
preferred buffered-raster factory/shared pixel/draw behavior. Hardware fullscreen,
Robot, COM audio, full assets/game/server/browser/phone and heap/FPS remain
unverified. The raw decompiler source/archive and prior seven probe pins do not
change; the naming dependency and its new literal policy have an explicit
source-change record.

Pass 122 added 214 guarded names: 13 classes, 17 fields, 32 methods,
49 parameters and 103 locals. The logo loading path now reads through
`LogoPreparationSupport.prepareLogoAnimation`, `EntityMotionSupport.decodeLogoAudio`,
`FullscreenSupport.prepareMeshSpecularResponse`, `MidiNoteMixer.prepareLogoGlowRaster`
and `LogoCompositor.drawLogoAnimation`. The shared owners also expose snapshot
retention, fullscreen exit, username-query reuse, common UI fonts, cache handles,
name separators and configured timer rate. All parameters and locals in the
13 audited owners have names. The top/bottom final-frame slices, scene/glow
rasters, packet buffer and encrypted scratch have source-supported roles.
All 10,324 previous complete rules, raw bodies, local ordinals, bytecode and
source/tool/native trace pins remain. The export has 10,538 rules and 82,881
identifier edits. All 303 raw/readable sources compile, compare 136,612 bindings
and preserve 388 override relationships. Class coverage is 260 renamed, one
meaningful original name and 42 opaque names. Six large labeled bodies and
207 block labels remain. Configured update rate is a timer setting, not measured
presented FPS. Mixed-purpose statics stay on their owners. This naming pass adds
no whole-game, successful asset/audio/AWT fullscreen, live server, browser/phone
or heap/FPS equivalence claim.

Pass 121 added 286 guarded names: 14 classes, 19 fields, 24 methods,
44 parameters and 185 locals. The game now reads through `MatchCandidateSupport`,
`MatchScoringSupport`, `PlayfieldRules`, `ScorePopupSupport`,
`AttachedEntityRenderer`, `EndingAnimationSupport`, `DebugOverviewCompositor`,
`MeshDepthSupport`, `MeshPrioritySupport`, `GameplaySetupSupport`,
`BoardEntityState` and `GameSoundResources`. Session calls expose
`LoginProtocolSupport.advanceLoginHandshake` and `AchievementProtocolSupport`.
All parameters and locals in the 14 audited owners now have guarded names.
Shared login phases expose request readiness, initial reply, result, details,
failure text and connected-session identity. The reflection decoder names its
operation/class/member/argument data, reused argument-count/integer-write slot,
serialized buffers and per-operation failures. Its generated increment state
keeps the original zero/one values and control flow. Class names describe helper
families; unrelated static functions and globals stay on each owner.
All 10,038 previous complete rules, raw bodies, local ordinals, bytecode and
source/tool/native trace pins remain. The export has 10,324 rules and 81,351
identifier edits. All 303 raw/readable sources compile, compare 136,612 bindings
and preserve 388 override relationships. Class coverage is 247 renamed, one
meaningful original name and 55 opaque names. Six large labeled bodies and
207 block labels remain. New naming does not establish full login/reflection/
server, asset/audio/AWT/browser/phone or heap/FPS equivalence.

Pass 120 added 149 guarded names: seven classes, four fields, 15 methods,
28 parameters and 95 locals. The main gameplay helper owners now read as
`EntityMotionSupport`, `EntityCollisionSupport`, `EntitySpawnSupport`,
`BoardReconciliationSupport`, `EntityContactSupport`, `EntityLinkSupport` and
`AvatarFeedbackSupport`. These describe their gameplay helper families; unrelated
static functions and globals remain on their original owners. The contact-mask
scan now names its crop bounds, pixel indices, row skips, kind-two mismatch,
pooled conversion entity, avatar sentinel handling and exception context.
The remaining link-operation diagnostics, canvas listener cleanup, ranked-list
index sorting, applet quit navigation and widget gradient-border parameters
also have source-supported names. Raw sources, local ordinals, bytecode,
decompiler/naming-tool pins and native probe source/trace pins are unchanged;
all 9,889 previous complete rules survive. The export has 10,038 rules and
79,782 identifier edits. All 303 raw/readable files compile, compare 136,612
bindings and preserve 388 override relationships. Class coverage is 233 renamed,
one meaningful original name and 69 opaque names. The six large labeled bodies
and 207 block labels remain. Whole-game/assets, applet navigation, live network,
browser/phone and heap/FPS acceptance remain unverified.

Pass 119 replaced 67 capture temporaries with proven postfix array reads in
26 methods across seven files, including font glyph-mask conditions. The raw
source shrinks by 201 lines to 76,320. The dictionary retires 47 deleted capture
names and migrates 220 guarded local identities among 260 surviving local ordinal
changes; every surviving semantic name, original spelling and evidence remains.
There are 9,889 rules and 78,860 identifier edits. All 303 raw/readable files
compile, compare 136,612 bindings and preserve 388 override relationships.
A source proof checks complete expected token streams, predicted bindings and
local migrations. The six focused generic groups pass, including 12,096 new
native read comparisons and eight independent oracles; the existing 244,944
store comparisons also pass. Clean tracked decompiler source reproduces every
Java and diagnostics byte. Null/bounds/unboxing failures, counter overflow,
short-circuit and later condition effects, and cleanup/monitor order remain.
Repeated conditions, earlier effects, field/getter arrays, compound assignments
and escaping captures retain their statements. Bytecode is unchanged. There
are still 76 opaque class names, six large labeled bodies and 207 block labels;
whole-game, assets, browser/phone and memory/FPS acceptance remain unverified.

Pass 118 added 120 rules for shared array/cache/JavaScript helpers and the
archive byte-storage chain. `ArrayOperations`, `CacheFileLocator` and
`AppletJavaScriptBridge` replace three opaque class names. The complete
`ByteStorage`/`DirectByteStorage` override families and archive storage wrappers
now name their copy, alias, buffer and failure roles. There are 9,936 rules and
79,048 identifier edits, retaining all 9,816 prior complete rules. Class coverage
is 226 renames, one meaningful original name and 76 opaque names. Raw bodies,
bytecode and decompiler/naming-tool pins stay unchanged. The source/probe paths
move into Deko; existing native trace hashes remain fixed. Whole-game and
browser/device performance are still unverified.

Pass 117 recovers ordinary postfix array indexing in 15 bodies across five files.
It removes 271 capture temporaries and 813 lines; the array-copy helper `sf.java`
falls from 943 to 268 lines. The map explicitly retires 46 deleted capture names
and migrates 55 surviving local identities, retaining every other complete rule.
There are 9,816 rules and 78,050 identifier edits; class coverage remains 223
renames, one meaningful original name and 79 opaque filenames. All 303 raw and
readable sources compile, compare 136,880 bindings and preserve 388 overrides.
A historical source proof checks every expected token stream, declaration
migration and predicted binding; 244,944 native comparisons and five independent
oracles cover array exceptions, partial writes, aliasing, overlap, overflow and
cleanup. A clean tracked decompiler-source archive reproduces all Java and
diagnostics bytes. Fields, calls, escaping captures and ambiguous bindings retain
their original statements. The six large labeled bodies remain; this does not
establish whole-game or device/performance equivalence.

The current decompiler-source SHA-256 is
`41a301061aa8015aa57f55e59599d32fe8ee923ad5af6157c959475b67cd5e68`.

Pass 116 names 33 fields, 26 methods, 69 parameters and 198 local declarations
along theme audio preparation, sample caching and PCM resampling. Session calls
now expose `selectThemeAudio`, `getThemeForProgress` and `recycleAllScorePopups`.
There are 9,862 guarded rules and 78,234 identifier edits, preserving every
complete prior rule and all raw/tool/native-probe pins. Class coverage remains
223 renames, one meaningful `Geoblox` name and 79 opaque names. Preparation flags,
ignored instrument-preparation results, budgets and sample-slot limits retain
their original behavior. This adds no live audio/assets/device coverage.

Pass 115 names 11 classes and 145 fields, methods and parameters. The score path
now reads through `createAndSubmitScore`, `ScoreSubmission` and
`writeScoreSubmission`. Typed query records, shared social entries, canvas resize
controls and visual-property overrides describe their source-supported roles.
There are 223 class renames, one meaningful `Geoblox` name and 79 opaque names,
with 9,536 guarded rules and 76,813 identifier edits. All 9,380 prior naming
objects, raw bodies and tool/probe pins remain unchanged. Unknown wire values
keep neutral names; this pass adds no live network, UI or device coverage.

Pass 114 names 23 record/helper classes and 205 fields, methods and parameters.
The additions cover staged archive loading, raster snapshots, display modes,
tracked audio streams, highscore views, queued reflection checks, delayed incoming
packets, typed text templates and legacy platform controls. Class coverage is
212 renames, one already meaningful `Geoblox` name and 90 opaque names; there are
9,380 guarded rules and 75,701 identifier edits. All 9,152 prior naming objects,
raw sources and decompiler/tool/native-probe pins stay unchanged. Public native
callback names and literal reflection spellings remain. This source-audited
naming pass adds no live platform/archive/highscore/reflection/network coverage.

Pass 113 names 20 account/widget classes and 234 fields, methods and parameters.
`LoginPanel`, `AccountCreationForm`, `DisplayNamePanel` and
`AccountCreationDialog` expose the account flow; `HotspotTextWidget` parses
clickable text and `ProgressBarWidget` renders Q16 progress. Suggestion selection,
more-suggestions requests and hotspot activation have complete named callback
families. There are 9,152 guarded rules, 73,820 identifier edits, 189 renamed
classes, one already meaningful `Geoblox` name and 113 opaque names. All 8,898
previous rule objects, raw source and tool/probe pins stay unchanged. The existing
seven native probes retain their original scopes; this naming pass adds no live
account/UI or whole-game coverage.

Pass 112 revisits proven exits after final guard/frame cleanup. Nine bodies in
eight files lose 13 generated block labels and 20 lines, leaving 207 labels.
Board reconciliation falls from 345 to 339 lines and 11 to 9 labels; the sorted
half-blend triangle falls from 372 to 364 lines and 11 to 7 labels. All 8,898
complete naming rules, local ordinals, 137,964 bindings and 388 override pairs
remain unchanged. Every regenerated token stream matches the expected recovery;
a clean tracked decompiler-source archive reproduces all Java and diagnostics
bytes. Six large labeled spans remain, and full game/device equivalence is still
unverified. The decompiler-source SHA-256 is
`f931fad10ba711145115262619cc04e5c81e13450de01a56d1c7c350f6c465b5`.

Pass 111 adds 26 class roles and 265 field/method/parameter names, including
`VorbisCodebook`, `VorbisResidue`, `SynthesizedSoundInstrument`, `LoginPayload`,
`CheckboxWidget`, `DialWidget` and `MultiHandleSliderWidget`. The backing
`GrowableIntList` supports several slider handles; login subclasses describe
their byte layout without guessing the meaning of base38 text. The complete
drawing-strategy and validation-provider-source override families are named.
Class coverage is 169 renamed classes, one already meaningful `Geoblox` name
and 133 opaque names. There are 8,898 guarded rules and 71,946 identifier edits.
All 8,607 prior rule objects, raw source and tool/probe pins remain unchanged.
The single preview is `readable/geoblox/src`; update it with
`node readable/reproduce-geoblox.mjs --update`. Earlier exports live in Git.

Pass 110 names 51 additional class roles, including `GameApplet`,
`TextInputWidget`, `PcmStream`, `MidiPcmStream`, `IntrusiveNodeHashTable`,
`FrameTimer` and `ProxySocketConnector`. Class coverage at that pass is 143 renamed
classes, one already meaningful `Geoblox` name and 159 opaque names. The total
is 8,607 guarded rules and 69,721 identifier edits; raw source, decompiler/tool
pins and previous rule objects remain unchanged. Class names describe instance
roles, with unrelated static helpers still on their original owners. Literal
reflection spellings remain unchanged. Update the single preview in place using
`node readable/reproduce-geoblox.mjs --update`; earlier versions live in Git.

Pass 109 names `AchievementQuery`, `cf.requestAchievementState`,
`re.writeAchievementStateRequest`, `AchievementProtocolSupport.handleAchievementResponse`,
`AchievementProtocolSupport.resendAchievementMessages` and the singleton query/queue/result fields.
It adds 53 guarded names, bringing the total to 8,556 and 66,611 edits, while
retaining every previous rule and the raw/decompiler pins. The existing
achievement probe adds a separate 284-case native/raw/readable trace covering
response types/counts, ordered acknowledgements, two-round retries, request
failure after enqueue, and received-mask import. In-memory packets verify partial
effects and overflow consumption; real sockets, unknown-type logging and complete
login/reconnect/server/game/device behavior remain unverified.

Pass 108 names the achievement path from gameplay to notification and submission:
`ra.recordAchievement`, `AchievementSubmission`,
`je.updateAchievementSubmissions`, `sj.submitAchievementRecord`,
`ol.writeAchievementSubmissionPacket` and `lh.updatePendingActionPanel`.
The 64 additional guarded identities bring the total to 8,503 names and 66,358
identifier edits, preserving all 8,439 previous rules and the raw/tool pins.
A new 864-case native/raw/readable probe checks tutorial, duplicate and blocked
submissions, earned/new/tracking masks, queue identity/order, guard side effects,
shift/byte wrapping and signed overflow. Its 108 independent packet checks verify
the version, ID/check bytes, four big-endian tracking integers, CRC and length.
The tracking integers keep neutral client-side names; server validation semantics
are unknown. Empty-panel font preparation, login/retry/ack execution, live
networking and whole-game/device acceptance remain unverified.

Pass 107 removes 97 path-implied guards in 24 bodies across ten files. Only
comparisons of captured int locals are specialized; later/cyclic writes invalidate
facts, and no global flag or field is assumed constant. Selected scopes and
transfer targets remain, with loop/label completion and finally overrides proven
before unreachable suffixes are removed. Thirteen labels and 384 lines disappear.
Board reconciliation falls from 494 to 345 lines. All 8,439 complete names remain.
Four new groups pass 16,560 native comparisons and twelve independent checks;
clean-source reproduction, all six game probes, publication tests and dictionary
reversal pass. There remain 220 block labels and six large labeled spans. Shared
names, further reconstruction and whole-game/browser/phone acceptance remain open.

Pass 106 replaces the menu-action and loading-theme label ladders with
ordinary switches, preserving original actions, guards and fallthrough for every
control-flag partition. Nineteen plain block labels and 65 lines disappear.
Menu action dispatch falls from 322 to 277 lines and 17 to four labels; gameplay
rendering falls from 377 to 357 lines and 17 to eleven labels. All 8,439 complete
names remain. Four new test groups include 61,152 native before/after comparisons
and ten independent behavior checks. Clean decompiler-source reproduction, all
six game probes, publication checks and dictionary reversal pass. There remain
233 plain block labels and 20 overlapping spans of at least 300 lines, six with
block labels. Unknown shared names, further reconstruction and whole-game/
browser/phone acceptance remain unfinished or unverified.

Pass 105 removes 525 proven local-reference identity casts from 423 bodies
across 170 files. For example, assigning a RuntimeException local no longer
casts it back to RuntimeException. Exact static types and local scopes are
preserved; necessary casts and primitive conversions remain. All 8,439 naming
objects remain. The 515 removed cast-type class references reduce binding
comparisons to 138,257 and naming edits by 32 to 66,191. All surviving bindings
retain their ordered identities. Five new test groups include 2,880 native
comparisons, seven independent checks, and 24 identical compiled instruction/
exception-table pairs. Clean decompiler-source reproduction, all six game
probes, publication checks and dictionary reversal pass. The seven large
labeled bodies remain; this pass reduces cast noise without changing their
control flow or claiming whole-game/browser/phone equivalence.

Pass 104 reconstructs 25 effectful plain-block exits as ordinary `if/else`
arms across 17 files. The original predicate and effects remain in order, and
the skipped remainder becomes the else arm. Fifteen unused labels disappear,
saving 30 lines. Avatar animation and music decoding lose their final labels;
252 generated plain block labels remain, with seven of 21 overlapping large
spans labeled. All 8,439 naming objects and 66,223 edits remain unchanged. The
emitter passes 66 tests with one historical optional skip, including 24,192 new
native comparisons and six independent behavior checks. Clean decompiler-source
reproduction, ordered bindings, all six game probes, dictionary reversal and
publication checks pass. Unknown shared names, larger continuations and full
game/browser/phone acceptance remain open.

Pass 103 turns fourteen newly exposed leading loop exits into ordinary while
conditions across eleven files, saving 42 lines. Original predicates remain
under logical negation; nonconstant proof protects Java reachability, while
scopes, exception coverage, cleanup and continue targets stay intact. All 8,439
complete naming objects and 66,223 edits remain. Both 303-file corpora compile;
ordered bindings and all expected rewrite token streams match. A clean decompiler
archive reproduces sources/diagnostics byte-for-byte. The emitter passes 63 tests
with one historical optional skip, including 96,768 new native comparisons and
six loop-entry/NaN/cleanup oracles. All six existing game probes, reproduction
and dictionary reversal pass. Sprite nearest rotation is 526 lines; session
update is 638 and the sorted half-blend triangle is 385. At that pass, 267 generated
plain block labels and 21 overlapping large spans, nine labeled, remained. Further joins,
unknown names and full game/browser/phone acceptance remain open.

Pass 102 reconstructs 78 terminal labeled exits as ordinary loop breaks and
removes 38 unused plain labels/blocks across 28 files, saving 76 lines. The loop
must reach the same block end without intervening work or protected regions;
inner cleanup, scopes, loop-update/condition bypass and exceptions remain.
All 8,439 complete naming rules and 66,223 edits are preserved. All 303 expected
rewrite token streams and ordered bindings match; a clean decompiler archive
reproduces the output byte-for-byte. The emitter passes 59 tests with one existing
optional skip, including 11,520 new native comparisons and five loop oracles.
All six existing game probes, full reproduction and dictionary reversal pass.
Sprite nearest rotation loses its final label; gameplay render/update and board
reconciliation each lose one. There remain 267 generated plain block labels and
21 overlapping large method spans, nine labeled. Further continuation/state
reconstruction and full game/browser/phone acceptance remain open.

Pass 101 adds 409 guarded names for pointer frames, dragging/dropping, wheel input,
button activation and complete shared event contracts. `DraggableWidget`,
`DropTargetWidget` and readable callback interfaces expose source-traced event
availability, coordinate order and partial callback effects. All 8,030 prior
complete rules and raw/decompiler/native pins remain; the 8,439 rules apply 66,223
edits. Both corpora compile and compare bindings/overrides; all six existing native
probes, reproduction and dictionary reversal pass. The reflectively loaded wheel
class remains `gl`. Duplicated continuations, shared opaque code, larger control-
flow reconstruction and whole-game/browser/phone acceptance remain open.

Pass 100 adds 228 guarded names for widget ownership, layout, focus and independent
deque traversal. The preview includes readable widget/container/dialog-layer,
button, renderer/listener and cursor classes. Complete connected bounds and focus
contracts retain their original order and guard behavior. All 7,802 prior complete
rules and raw/decompiler/native pins remain; the 8,030 rules apply 64,011 edits.
Compilation/binding/override checks, all six existing native probes, full
reproduction and dictionary reversal pass. Pointer/drag dispatch, shared opaque
utilities, larger reconstruction and whole-game/browser/phone acceptance remain
open; runtime control flow and allocations are unchanged.

Pass 99 adds 205 guarded names for dialog fade/resize/content transitions,
widget geometry and complete shared rendering/transition contracts. The preview
includes `FadingDialog`, `ResizableDialog`, `ContentTransitionDialog` and
`OpacityWidget`. All 7,597 previous complete rules and raw/decompiler/native pins
remain; the 7,802 rules apply 61,845 edits. Compilation/binding/override checks,
all six existing native probes, full reproduction and dictionary reversal pass.
Opacity rendering retains its intermediate sprite allocations; this pass does
not change runtime memory or performance. Shared opaque code, larger control-flow
reconstruction and whole-game/browser/phone acceptance remain open.

Pass 98 adds 115 guarded names, completing MessageDialog's own declarations and
two shared UI override families (11 button callbacks and 13 key-input methods).
Dialog error/dismissal/restored content and colocated static utilities follow
source-proven guards and partial effects. All 7,482 previous complete rules and
raw/decompiler/native pins remain. The 7,597 rules apply 60,415 edits.
Compilation/binding checks, native gameplay traces, full reproduction and dictionary
reversal pass. Two structural prototypes were discarded after finding zero loop-
entry candidates and one alternate-guard exception helper, with no large-body
candidates. Larger dispatch/continuation reconstruction, shared opaque code and
whole-game/browser/phone acceptance remain unfinished or unverified.

Pass 97 adds 91 guarded avatar/ending/shared-input identities, completing the
parameters/locals of both avatar updaters and board reconciliation. Cry phases,
frame cursor, ending scan result and session-start attempt counter follow exact
source reads/writes and partial effects. All 7,391 previous complete rules and
raw/decompiler/native pins remain. The 7,482 rules apply 59,943 edits. The existing
native/raw/readable gameplay probe retains its traces, including active-session
animation oracles; it does not establish the complete crying/ending lifecycle.
Compilation/binding checks, full reproduction and dictionary reversal pass.
Repeated animation tails, shared opaque classes, large control bodies and
whole-game/browser/phone acceptance remain unfinished or unverified.

Pass 96 adds 77 guarded identities, completing GameplaySession declarations and
Geoblox's fields/parameters/locals/nonlifecycle methods. Already semantic client
lifecycle names remain original. Canvas timing, message dialog and login payload
kind are traced; the shared control-flow flag is named across 325 bound occurrences
in 141 files without assuming zero or application meaning. All 7,314 previous
complete rules and raw/decompiler/native evidence pins remain. The 7,391 rules
apply 59,581 edits. All six existing native/raw/readable probes retain their traces;
compilation/binding checks, full reproduction and dictionary reversal pass.
Related shared classes, large labeled bodies and whole-game/browser/phone
acceptance remain; existing fixtures do not establish new full client/platform/
asset/login/server execution.

Pass 95 adds 65 guarded base-menu and direct-helper names, completing every
MenuScreen field, nonconstructor method, parameter and local. Shared dispatcher,
applet stop deadline and intro tint state have independently traced roles.
Pointer-repeat fields/configuration and the indexed-frame loader chain are named
without changing guards, integer formulas, file/group order or null/failure paths.
All 7,249 previous complete rules and raw/decompiler/native evidence pins remain.
The 7,314 rules apply 58,939 edits. Compilation/binding checks, full reproduction
and dictionary reversal pass. Other shared code, large control bodies and whole-
game/browser/phone acceptance remain; this pass adds no dynamic menu/repeat,
asset, applet lifecycle or thread coverage.

Pass 94 adds 173 guarded identities, completing names for every GameScreen field,
nonconstructor method, parameter and local. It covers screen input, fullscreen
state, menu press animation, tutorial demonstrations, hit tests, volume controls,
highscores and related static utilities. It also corrects two misleading pass93
panel-axis names after tracing the panel helper's Y-before-X signature. All
7,074 unaffected previous complete rules and raw/decompiler/native evidence pins
remain. The 7,249 rules apply 58,741 edits. Compilation/binding checks, full
reproduction and dictionary reversal pass. Shared helpers, necessary block labels,
larger gameplay reconstruction and whole-game/browser/phone acceptance remain;
this source-audited pass adds no dynamic screen/asset/device coverage.

Pass 93 adds 61 guarded menu/background/tutorial names: 11 fields, three methods,
five parameters and 42 locals. Every parameter/local in the menu renderer,
scrolling background renderer, tutorial page renderer and curtain updater has a
name, including explicit combined roles for reused slots. Tutorial page/curtain
state and layer offsets are named without changing guards or sentinel values.
The 7,076 rules apply 57,788 edits; all 7,015 previous complete rules and raw/
decompiler/native evidence pins remain. Full reproduction and dictionary
reversal pass. This source-audited naming pass adds no dynamic menu/tutorial
coverage; other opaque locals, large control bodies and browser/phone acceptance
remain unfinished or unverified.

Pass 92 reconstructs 41 nested skip frames, consuming 82 breaks and guarding
42 remainders over 97 predicates. It saves 219 lines across 19 files. Menu
rendering shrinks from 372 to 304 lines and ten to four block labels; gameplay
rendering and board reconciliation also lose labels. Predicate/effect order,
scopes, every ordered binding and all 7,015 complete naming rules remain.
The clean committed decompiler archive reproduces all 303 raw files and unchanged
diagnostics; all six native/raw/readable probes retain their traces. Full
reproduction/dictionary reversal passes. There remain 21 large method spans,
ten with block labels; opaque locals, mixed-effect exits and whole-game/browser/
phone acceptance remain unfinished or unverified.

Pass 91 reconstructs 27 multi-exit frames, consuming 75 breaks and saving 126
lines across 24 files. Music controller decoding becomes an ordered alternative
chain; the music-score constructor and Bzip2 block decoder now have no block
labels. Gameplay rendering and menu action handling also lose labels. Every
ordered binding and all 7,015 complete naming objects remain. The clean
committed decompiler Git-source tar reproduces raw sources and unchanged
diagnostics; all six native/raw/readable probes retain their traces. Full
reproduction and dictionary reversal pass. There remain 21 large method spans,
10 with block labels; larger reconstructions and whole-game/browser/phone
acceptance remain unfinished or unverified.

Pass 90 reconstructs 64 labeled exits as 47 conditional alternatives and 17
ordinary guards, saving 145 lines across 45 files. Gameplay rendering loses two
labels; board reconciliation loses one. The instrument-patch constructor now
has no labels. All 7,015 complete naming objects and ordered bindings remain.
The clean decompiler Git-source tar reproduces all 303 raw files and unchanged
diagnostics; all six recorded native probes retain their traces. Full readable
reproduction/dictionary reversal passes. That pass left 21 large method spans,
12 with block labels; multi-exit decision trees and whole-game/browser/phone
acceptance remain unfinished or unverified.

Pass 89 removes 102 redundant breaks and 73 labels/block frames across 50 files,
saving 248 lines. The instrument-patch constructor shrinks from 492 to 468 lines
and nine block labels to one. All 7,015 complete naming rules, 57,278 edits and
ordered source bindings remain. Independent JDK body positions account for all
303 regenerated token streams; a clean decompiler Git-source tar reproduces raw
files and unchanged diagnostics byte-for-byte. The six recorded native probes
retain their traces, and full readable reproduction/dictionary reversal pass.
That pass left 21 large method spans, 13 with block labels. Whole-game/browser/phone
acceptance remains unverified.

Pass 88 names `InstrumentPatch` and `InstrumentEnvelope`, including all 77
locals in the 492-line patch constructor. Its 144 guarded additions bring the
export to 7,015 rules and 57,278 edits, preserving all previous rules and source
pins. A separately pinned 1,759-case native/raw/readable trace checks decoded
patch arrays/envelope identity, rounded/clamped curves, selective cached sample
installation, ID/pitch cleanup, floor division, exception context and truncated
inputs. Actual archived patches, uncached samples and synthesized audio remain
unverified; large control-flow bodies and browser/phone acceptance remain.

Pass 87 names `MusicScore`, `MidiTrackReader` and `InstrumentNoteMask`, including
all 96 locals in the 541-line compact-to-MIDI constructor. It adds 188 guarded
identities, bringing the export to 6,871 rules and 54,798 edits; every previous
rule and source/decompiler pin remains. A separately pinned 1,671-case native
trace includes independent exact-MIDI/instrument-note oracles and reader
meta/system/running-status/tempo checks. Native, raw and readable variants
match. Full regeneration and dictionary reversal remain reproducible. Actual
archive music loading, audio synthesis and browser/phone acceptance are unverified.

Pass 86 removes 57 labeled skip blocks and 66 guard breaks across 25 files,
reconstructing ordinary conditional guards without moving declarations, effects
or protected boundaries. It removes 197 lines; `updateSession` shrinks from
660 to 643 lines and loses five labels. All ordered declarations/references,
local ordinals, 388 overrides and 6,683 complete naming objects remain.
Independent JDK body positions prove all 303 token streams contain only the
documented skip/nested-guard transforms. Generic fixtures add 4,032 native
comparisons; the clean decompiler archive reproduces all raw files and unchanged
diagnostics. The six recorded native probes retain their hashes. Reproduction
and dictionary reversal are byte-exact. Large bodies and whole-game/browser/phone
acceptance remain unfinished or unverified.

Pass 85 names the animated logo scene, adding 134 guarded identities for its
clock, rotations, materials, loader, rendering and integer-guard face collector.
The 6,683 rules apply 53,607 edits and preserve every previous naming object.
A new 56,862-case native logo trace exposed 120 cleanup mismatches caused by
narrowing a full JVM integer to a Java byte. The generic decompiler now preserves
that integer through an additional owned static entry point. The original
collector signature/body remain; only two raw files change. Native/raw/readable
logo traces now match the fixed native hash. Trig/matrix/clock/material and limited
draw-order/depth oracles retain their documented scope; real archive decoding,
whole-game rendering and browser/phone performance remain unverified.

The previous structural pass replaces 710 nested braced guard chains with ordered
short-circuit checks, merging 913 conditions across 131 files and removing 913
lines. Predicate bytes/order and the innermost declaration scope stay intact;
intervening statements and protected boundaries are not crossed. The generic
fixtures add 17,280 native comparisons. An independent JDK body inventory proves
that only the documented guard/frame transforms account for all 303 regenerated
token streams. Every ordered binding and all 6,549 guarded naming rules remain.
Clean committed decompiler source reproduces raw Java and unchanged diagnostics;
raw/readable corpora compile and reproduce/reverse byte-for-byte. All seven native
probes retain their traces. This changes source readability; it does not establish
whole-game behavior or browser/phone performance targets.

Pass 83 added 142 guarded identities for mesh projection and
face collection: camera/model bases, perspective coordinates, normal transforms,
optional coordinate triples, backface rejection, depth buckets and priority counts.
Every parameter/local in the five selected methods has a name. Original shifts,
overflow, guard/control paths, aliases, partial writes and diagnostics remain.
That naming pass kept its raw/decompiler pins unchanged.

The existing drawing probe adds 5,992 native/raw/readable cases, including limited
identity-projection, bit-length and buffer-clearing oracles, general geometry and
fault traces, and direct face collection with bucket spill. All earlier drawing
traces retain their pins. Rule-builder/source-migration/text-resource tests pass
9/8/6 groups. All 303 sources compile, reproduce and reverse byte-for-byte.
The 6,549 rules apply 52,854 edits, preserving 138,502 bindings and 388 overrides;
all 6,407 prior complete rules remain. The single current manifest records names
and probe pins; Git stores history. General camera/model geometry has no complete
independent oracle here. Remaining model loading, opaque helpers, reused scratch
phases, large control bodies, real assets/platform/server/gameplay and browser/phone
memory/startup/FPS targets remain unfinished or unverified.

Pass 82 named flat triangle sorting, Q16 edges, solid spans, depth-bucket
compaction and priority grouping, adding 80 identities and 8,775 native cases.

Pass 81 named mesh lighting, materials, render buffers, transforms and bounds,
adding 130 guarded identities and 10,592 native trace comparisons.

Pass 80 named the triangle clip state, vertex sorting, RGB interpolation and
scanline blending, adding 116 guarded identities and 5,266 native comparisons.

The preceding structural pass converts 95 jumps in 38 exit blocks to direct void
returns, removing 81 lines across 25 files. Its generic tests add 46,080 native
comparisons of cleanup and failure behavior. These structural proofs retain their
documented scope alongside the current naming/probe evidence.

Pass 77 removed 508 redundant labels, simplified 450 labeled continues and
removed 588 lines across 153 files. Its independent Java AST corpus comparison
preserved all 303 files' syntax events, 1,129 loop/switch destinations and 1,762
jumps. Pass 78 reconstructed 17 short-circuit boolean decisions, removing 156
lines across 12 files. Those historical proofs and the current return-rewrite
checks have their separate scopes recorded in the reproduction procedure.

Pass 76 shared a duplicate Bzip2 output-state publication/return tail through an
existing plain exit block, removing thirteen lines while retaining its native
40-case block matrix and eight other helper traces.

Pass 75 named Bzip2 block/table/run decoding and all decoder state fields. Its
40-case native fixture checks varied blocks, two-block input, partial output,
malformed input and recovery. Every decoder field/API/parameter/local has a name;
unrelated static helpers on the state owner remain opaque.

Pass 74 named archive decompression, `GzipInflater`, Bzip2 entry/bit-reader
contracts and selected state. Its 74-case native fixture confirms controlled
payloads, length limits, type routing and gzip partial/error/reset behavior.

Pass 73 named `DiskArchiveCache` and the shared sector scratch buffer, including
the two retained header-EOF states. Its 138-case native fixture confirms controlled
sector chains, malformed reads, EOF success exits and large-ID boundary behavior.

Pass 72 named `LimitedRandomAccessFile` and `BufferedRandomAccessFile` instance
state/APIs/constructors/locals. Virtual/underlying positions, physical/logical
lengths, pending writes, cached reads and overlap updates retain original behavior.

Pass 71 named `ArchiveCatalog`, service initialization, connection headers,
handshake stages/retries and archive creation. The archive client identifier is
supplied as 1; applet/cache initialization separately uses 11. Catalog records,
verification, provider memoization and file/socket ownership remain explicit.

Pass 70 named `ArchiveNetworkClient`, `SocketArchiveNetworkClient`, the shared
secondary key and direct XOR/sleep helpers. Every network-client instance
field/API, constructor contract and local has a name. Pending/sent queues,
response parsing, attachment, requeueing and failure state expose their roles.

Pass 69 named `DiskCacheWorker` and the remaining `SecondaryDeque` instance
locals. Queue operations, synchronous queued-write reuse, thread startup,
shutdown and both retained worker continuation selectors expose their roles.

Pass 68 named `CachedArchiveSource` and the three-class archive-request
hierarchy. Every instance field/API, constructor contract and local has a name.
Request modes, disk validation, background scans, cleanup markers, volatile
pending state and network response storage retain the original behavior.

Pass 67 named `ArchiveIndex`, `IntKeyLookup`, `ArchiveSource`, matching provider
contracts and checksum/digest helpers. Counts, sparse slots, revisions, CRCs,
optional Whirlpool digests and name hashes retain the original format/ordering.

Pass 66 named `ResourceArchive` instance fields/APIs, constructor contracts and
locals, exposing index/group loading, file/name lookup, unpacking, progress and
retention. Original monitors, byte order, chunk tables and partial effects remain.

Pass 65 named `PrefixCodeDecoder`, its decode tree/shared decoder and compressed
text reader. Its fixed source has no tree/shared-decoder initialization; names
describe the retained routine without establishing live compressed-text support.

Pass 64 named text-byte encoders, signed encoded-byte archive-name hashing and
decoder return/failure locals. Fonts retain unsigned glyph indices while name
hashing keeps signed byte contributions; mapping, guards and diagnostics remain.

Pass 63 named the remaining buffer crypto APIs, `WhirlpoolHash`, its shared
tables and five bitwise helpers. Every buffer and hash instance declaration now
has a name; original cycles, signed payloads, guards and partial effects remain.

Pass 62 named `PacketBuffer` and `PacketByteCipher` instance fields/APIs,
bit masks, seeded mixing, batch generation and reverse result consumption.
Original cursor/cipher consumption order, guards and partial effects remain.

Pass 61 named ordinary buffer writes, bulk copies, length backpatches, padding,
packed base38 text and CRC32. Original byte order, partial writes, aliases,
character start offsets, guard effects and exception scopes remain explicit.

Pass 60 named `ByteArrayBuffer`, its shared `bytes`/`position`, both constructors
and thirteen integer, smart and text readers. Consumers now expose the storage,
mutable cursor and reads while retaining their original guard effects.

Pass 59 named decoded sprite count, canvas, offsets, dimensions, palette,
indices and alpha state, plus the sheet decoder, archive acquisition, partial
cleanup, font factories/loaders and five sprite builders. Original RGB/ARGB/
indexed choices, retained alpha arrays and failure cleanup remain unchanged.

Pass 58 completed guarded names for the four-class font hierarchy, including
palette selection, nearest-color search, grayscale conversion, glyph indices,
packed blending and captured increments. Shared glyph contracts stay unchanged.

Pass 57 named `BitmapFont` and `MonochromeBitmapFont`, including metrics,
kerning, markup wrapping, paragraph layout, shared text style, inline images and
mask/alpha blitting. The shared glyph contracts match all three renderers.

Pass 56 named 168 raster drawing locals and two scanline-mask arrays. Every
field, method, parameter and local in `SoftwareRasterizer` has a guarded name.
Circle geometry, clipped spans, alpha weights, gradients, line stepping and
unrolled clearing have explicit roles; large labeled bodies remain.

Pass 55 named 61 blur-kernel locals and three reusable channel-sum
caches. Growing, full and shrinking windows, Q14 reciprocal scaling, edge sample
counts, captured indices and shared cache aliases are explicit. Reads and writes
still share the original pixels. Existing native probes do not execute blur.

Pass 54 added 193 guarded identities for the main session renderer
and its draw pipeline. Every `renderSession` local now has a role. Moving and
transient entities, avatar faces, the spawn highlight, pending-action panels,
archive-progress formatting and debug compositing have named contracts. Two
older names were corrected for a reused tutorial-height local and an RGB gray
level previously described as alpha.

Pass 53 added 118 guarded identities for raster presentation and
nine-slice panels. `AwtRasterBuffer` and `ImageProducerRasterBuffer` describe the
pixel/image ownership; the three-class `initialize`/`drawImage` virtual family
keeps matching contracts. Gameplay now restores
`sh.mainRasterBuffer.setAsRasterTarget(...)`. Tutorial prompts and overlays call
`ma.drawNineSlicePanel` with named clipping, border and tile coordinates.

All 2,994 previous complete rules and raw source/generator pins are unchanged.
That pass used 3,112 rules and 30,922 edits. All 303 sources compile, preserving
138,558 bindings and 388 override relationships. The factory's reflective
`Class.forName("ve")` and `ve` class spelling stay unchanged; its methods and
parameters are named. Existing native probes cover their documented scopes;
real AWT presentation, panel drawing and full-game/device behavior remain
unverified. One manifest holds current rules and evidence, with Git for history.

The previous structural pass simplifies 12 primitive value selections and an
existing URL-validation loop, removing 50 lines across eight files. Pointer
spawning now selects its variant in one conditional assignment. All 19,558
declarations and 388 overrides remain; 14 guarded local ordinals migrate in the
dispatcher. That pass used 2,994 naming rules and 30,216 edits without changing any
surviving semantic name, spelling or evidence.

The decompiler also fixes demonstrated diagnostic-string corruption during
carrier substitution. Complete lexical/scope checks restrict edits to identifier
tokens, and qualified generic calls retain explicit type arguments. The generic
emitter passes 36 groups and 54,549 native comparisons. All six existing GeoBlox
native probes preserve their recorded scopes and traces. A clean decompiler
source archive reproduces all 303 raw files and diagnostics byte-exact.

The previous equivalent-join pass removed 1,075 generated carriers and 5,071
lines across 176 files. Its partition-budget fix and scope proofs remain.
Current source pins, decompiler-source archive SHA-256, naming migrations and
verification limits live in the single manifest. Full gameplay, assets and
browser/phone targets remain unverified. Git preserves previous passes.

The previous naming pass added 114 rules for `BufferedSocket`, `PlatformTask`
and `PlatformTaskDispatcher`, including every socket parameter/nonselector
local. Its 308 constructor/read/ring/drain/failure cases remain unchanged,
alongside the earlier shutdown/cache/helper traces.

Difficulty and spawning now name the step flags, sprite-variant/category
bounds, special-kind probability, release interval and queue geometry.
The previous naming pass added 38 rules. The Boolean-carrier pass removed
14 obsolete names and migrated 61 local ordinals plus one generated field type.
The preceding integral-guard pass preserved all 1,194 guarded rules unchanged.
The previous naming pass covered all 23 private static sprite kernels. The
preceding naming pass added 171 rules and completed every parameter/local name in
`Sprite`, `ArgbSprite` and `IndexedSprite`, including ARGB rotation, bilinear
weights, reductions and sprite mutations. All 2,233 prior rules and the raw
input remained unchanged in that naming pass. The preceding structural refresh
preserved every one of the 2,404 rules, applying 27,172 identifier edits. An
expanded existing native drawing probe adds 33,168 transform cases, including
23,340 independent pixel/geometry oracles, while preserving its previous
traces. Original shifts, transparency, inherited smooth rotation and RGB copy
return types remain intact. AWT image loading is supported by source evidence.
Independent native fixtures verify 84,661 additional difficulty/reset/selection cases,
including floating-point casts, recursive failures, partial writes and seeded
random draw consumption. The current input and decompiler revisions are pinned
in the manifest.

The boundary scan now has guarded semantic names for every local and parameter.
An independent geometric oracle verifies 425,042 pixel cases at two framebuffer
strides, plus guard arithmetic and invalid-raster read ordering, against native
bytecode and both source mirrors. Its direct true/false returns are explained
in the reading guide; other opaque names and shared control-flow joins remain.

`node readable/reproduce-geoblox.mjs --check` verifies deterministic regeneration
from the pinned input and bundled naming tool. All original dispatcher methods
use structured control flow, but opaque names, generated carriers and shared
joins remain. Earlier structural and native-behavior investigations are recorded
in the readable reports; they describe their individual historical passes. The
single current manifest holds current naming pins and verification limits, with
prior snapshots in Git. `node readable/reproduce-geoblox.mjs --update` refreshes
the same current export after staging and verification; keep the one current
manifest rather than creating dated JSON files.

## GeoBlox source refresh

The preceding structural refresh shares terminal work inside existing plain blocks, removing
189 lines across seven files. Shutdown in `ba.b(int)` now clears its task once
after the status/join paths. The close/notification monitor, volatile task wait
and interruption catch retain their scope; the redundant selector disappears.
Ten retained selectors become nine. All 2,404 guarded rules and 388 override
relationships are preserved. One declaration and 409 references disappear, with
no named ordinal migration or added reference occurrences.

The generic emitter passes 31 groups, including 432 new native scoped-tail
comparisons. Existing loop, label, try and monitor bodies remain opaque. Exact
terminal clones can skip intact prefixes without assuming loop completion;
retained new labels have a 512-token prefix cap. No new label remains in GeoBlox.
The existing result-helper probe adds 84 controlled native shutdown cases for
interrupt consumption, task release/retention, notification and monitor release,
while retaining its previous helper and cache traces. Real network/device I/O
and guard-triggered `run()` remain unverified. No source bodies are edited by
hand and no new JSON snapshots are created.

The earlier integral-guard pass reused cached JVM integral-predicate evidence to
simplify relational inversions during nested-tail reconstruction. It removes
18 lines across four files and reduces `PlayfieldRules.advanceDifficulty` from 56 lines to
38. Variant, recursive-advance and category updates now each have one path;
category flags are still read after the recursive call, preserving partial
updates and array failures. The earlier local and nested passes reduced this
method from 220 lines to 69 and then 56.

Only integral predicates with unambiguous evidence can use relational
complements. Floating, unknown and conflicting predicates keep logical
negation. Cached operands are never rendered again. Operand order, declaration
scopes and handler/monitor boundaries stay intact; scope or completion
uncertainty still refuses reconstruction. GeoBlox needs no generated block
labels. The preceding Boolean pass eliminates 221 integer locals, including
all 17 difficulty and 13 boundary result carriers.

In that structural pass, all 303 sources compiled with 20,710 unchanged
declaration identities and 388 override edges. Exactly 26 references disappeared with the two category-update
clones and two recursive-advance clones; none were added. All 1,194 guarded names
and evidence remained unchanged, with no ordinal migrations. That mirror
checked 150,801 bindings and made 18,611 identifier edits. That emitter revision passed
23 groups and 40,129 native comparisons, including 35,280 new integral-guard
checks. All six game probes retain their native traces. Clean committed
decompiler source reproduces all raw Java and diagnostics; dictionary reversal
restores all 303 raw files byte-for-byte. Whole-game behavior, other shared joins
and unknown names remain unverified.

The previous terminal-return reconstruction removed 254 selectors and the
boundary scan's 13-arm post-try ladder. Shared joins and throwing continuations
retain their routing; the forced dispatcher still refuses explicit monitors.
Earlier numeric cleanup remains. Transformed class inputs are unchanged.

A clean decompiler Git source archive reproduces all 303 Java files and current
diagnostics byte-for-byte. Every source compiles and the export has no hard
failures or dispatchers. The [GeoBlox provenance](decompilation/geoblox-provenance.json)
records the exact generator source commit and SHA-256, unchanged class inputs
and verification scope. The readable mirror's explicit input pin is maintained
through its guarded update procedure. The other 43 games retain the prior
full-catalog export. Whole-game behavior, FPS, heap and phone targets are not
established by these source checks.

## Previous full-catalog regeneration

The 2026-08-17 regeneration updates all 44 games from tracked-clean generator
commits. Every game has a complete source set and passed the transformed-bytecode
verifier and a whole-game `javac` compilation: 18,481 Java sources for 18,481
input classes, with zero pipeline, verifier, decompiler, or `javac` failures.
The exact generator commits, arguments, gates, destination base, and
synchronized game list are recorded in
[`decompilation-provenance.json`](decompilation-provenance.json).

Unlike the previous rerun, this one changes source content. The file set is
unchanged — no source was added or removed — but **389 of the 18,481 files have
different contents**, concentrated in each gamepack's largest and most
control-flow-heavy classes. Two causes account for the churn:

- Three decompiler defects that silently corrupted output were fixed. A
  short-circuit `||` reconstruction merged branch predecessors without checking
  that the last branch actually fell through, which dropped a call that sat
  between them; `dup` duplicated the *expression* rather than the value, so
  a chained assignment re-evaluated its operand after the first store had
  already overwritten it; and an array literal held on the operand stack kept
  its already-collected elements as lazily rendered local reads, so an element
  whose local a later store overwrote reported the value at render time instead
  of the value at its own position in the sequence. All three change emitted
  behaviour, not just formatting.

  The first two were localized by bisecting a recompiled gamepack against the
  original. The third surfaced only by booting the recompiled tree on a native
  JRE, and is a good illustration of why compiling is not evidence of
  correctness: it left one game's generated config geometry a single entry
  short, so a later index ran one past the end of an array sized from that
  length. The `ArrayIndexOutOfBoundsException` was swallowed by the game's own
  top-level handler, which killed the loading thread without printing a trace —
  the applet did not crash, it simply sat at a blank loading screen forever.
- Methods with a high conditional fan-in (six or more conditional edges sharing
  one target — the shape obfuscated boolean guards produce) now prefer the owned
  CFG structurer over the legacy range recognizer, which restructures those
  methods in a single pass. This reshapes the affected method bodies.

This publication uses the verifier-safe bytecode profile plus the closed-world
fixed-point proof for mutually guarded default-false static fields. It does not
enable the broader experimental interclass constant-argument, signature
compaction, or checked-catch cleanup gates. Consequently, this snapshot retains
the original method descriptors and contains no `signature-map.json` files.

The owned decompiler normalizes duplicate JVM-slot declarations in static
initializers using parsed Java declaration nodes, which is what lets the
865-class Bachelor Fridge gamepack decompile without class or method-name
special cases.

Compilation is not correctness: these gates prove every game recompiles, not
that every game still behaves identically. To check behaviour rather than
compilability, every game in this tree was booted on a native JRE (HotSpot) as
both the original gamepack and the recompiled class tree, and timed from the
moment the Jagex logo finishes to the moment its main menu is on screen. All 44
games reach their main menu in both variants, giving 44 paired measurements and
no timeouts; the paired median difference is +1.4% (median 5.73 s original
versus 6.28 s recompiled). Reaching the menu at all is the substantive result —
it is a whole-startup behavioural check, and it is what the array-literal defect
above used to fail.

The per-game percentages are not: the same sweep run twice moves an individual
game's figure by 33 percentage points at the median, and the original gamepack
alone — identical bytes both times — drifts 14% between runs. Startup is
dominated by disk and cache state, and one run per variant cannot resolve
anything smaller than that. Treat only the aggregate as meaningful.

## What "obfuscated" means here

The original gamepacks were shipped obfuscated. Class, field, and method names
are single/short meaningless identifiers (`a`, `b`, `bl`, `client`, …). The
decompiler recovers **structure** (control flow, expressions, method bodies),
**not names**. So the code is readable as logic, but the identifiers carry no
semantic meaning. This is expected and is not something the decompiler tries to
"fix".

## Constant-expression cleanup

This snapshot enables
`PIPELINE_ALLOW_MUTUALLY_GUARDED_FALSE_CYCLES=1`. The pipeline analyzes each
complete gamepack as a closed world and removes only static zero/false sentinel
cycles whose writes cannot make any member true. The proof reaches a fixed point
across the complete class corpus; partial-corpus use is deliberately not
enabled by default.

The broader `--experimental-interclass-dce` mode is available but was not used
for this publication. It uses CFG stack analysis to specialize a read-only
integer-like parameter when every reachable direct call supplies the same
constant, then repeats specialization, constant folding, branch DCE, and
unreachable-code removal to a bounded fixed point. Parameters written with
either a store or `iinc` are excluded. A separate signature gate can remove a
contiguous trailing run of specialized parameters from private or internal
static method descriptors and every proven direct call. When enabled and
accepted, each game's `signature-map.json` records old and new signatures,
removed parameter indexes and values, analysis iterations, and inherited
call-site owner aliases resolved against the complete hierarchy. Virtual and
interface method families are not compacted. An
internal interface would need a family-wide proof that the parameter is dead in
the interface declaration and every implementation, followed by a coordinated
rewrite of every implementation and every `invokeinterface`/`invokevirtual`
call. If one implementation uses it, or the family is reachable through a
public, platform, or callback API, its signatures must remain unchanged.
The local evaluator also folds side-effect-free `int` and `long` literal
arithmetic, conversions, comparisons, and JVM-masked shift counts. It removes neutral operations
such as `x + 0`, `x ^ 0`, and `x * 1`, combines adjacent additive constants,
and deletes branches whose conditions become literal constants. In the emitted
source, the bytecode idiom `x ^ -1` is written as the equivalent `~x`; when it
is compared with a constant, the bound is complemented and a signed inequality
is reversed as required.

The evaluator deliberately does not reassociate floating-point or string
expressions, suppress integer division/remainder by zero, or fold across an
alternate control-flow entry. Integer overflow and shift distances follow JVM
semantics. Interclass argument specialization is limited to gamepack-internal
methods for which every direct caller supplies the same literal; public applet,
platform callback, networking, OS, reflection/native, and otherwise external
entry points remain open. The feature is gated in the generating pipeline so a
runtime A/B build can disable it if later experimentation finds a bad
closed-world assumption.

The independently gated checked-catch cleanup
(`PIPELINE_EXPERIMENTAL_UNTHROWABLE_CATCH_DCE=1`) was also not enabled for this
snapshot. When enabled, after control-flow
reconstruction, a catch of a specific checked type is retained only when the
emitted try contains a call whose Java declaration throws that type. Otherwise
both the catch and the decompiler's synthetic `if (false)` reachability throw
are removed. Broad `Throwable`, `Exception`,
`RuntimeException`, and `Error` catches remain conservative because ordinary
JVM instructions can produce them. This is a source-readability policy: it does
not preserve a specific checked exception propagated by bytecode when no
source-visible `throws` declaration supports it, and is gated so runtime A/B
testing can disable it if that closed-world choice proves wrong.

## Deobfuscation guide

The pipeline works primarily on classfile instructions before Java is printed.
The examples below use Krakatau-style `.j` notation; constant-pool spelling can
vary, but the stack operations and descriptors are the same. “Implemented”
means the transform was available to the pipeline that generated this
repository. Stronger experimental transforms remain gated as noted.

| Area | Snapshot status | Main safety condition |
| --- | --- | --- |
| Literal constant evaluation | Implemented | JVM integer/long semantics; do not remove observable exceptions |
| Constant-branch and unreachable-code DCE | Implemented | CFG reachability and incoming-edge checks |
| Interclass constant-argument specialization | Implemented, gated; not enabled for this snapshot | Complete gamepack; every resolved direct caller agrees |
| Private/internal-static signature compaction | Implemented and gated; not enabled for this snapshot | Trailing dead parameters; all owner aliases rewritten; complete staged gamepack verifies |
| Virtual/interface family compaction | Not implemented | Would require one proof and rewrite across the whole family |
| Checked-catch cleanup | Implemented, separately gated; not enabled for this snapshot | Specific checked type is not declared throwable by the emitted try |
| Control-flow and stack-shape normalization | Implemented | Stack effects, labels, exception ranges, and verifier guards agree |

### Literal evaluation and branch DCE

The local evaluator folds side-effect-free literal expressions using JVM
overflow, signed division, and masked shift-distance rules. For example:

```java
if (((6 * 7) ^ 0) != 42) {
    throw new IllegalStateException();
}
render();
```

has this representative `.j` shape:

```text
bipush 6
bipush 7
imul
iconst_0
ixor
bipush 42
if_icmpeq Lok
new java/lang/IllegalStateException
dup
invokespecial Method java/lang/IllegalStateException <init> ()V
athrow
Lok:
invokestatic Method Game render ()V
return
```

After constant evaluation, the comparison is known true. The branch and its
literal producers are simplified, then CFG reachability removes the trap:

```java
render();
```

```text
invokestatic Method Game render ()V
return
```

This is not textual replacement. A fold is rejected when another branch can
enter the middle of the producer sequence, when the instruction is an
exception-handler entry, or when evaluation can throw. Thus `1 / 0` remains an
`idiv`, and floating-point reassociation is not attempted.

Neutral integer operations are removed (`x + 0`, `x ^ 0`, `x * 1`), adjacent
additive constants are combined with 32/64-bit wraparound, and JVM shift counts
are normalized (`x << 35` is `x << 3` for an `int`). The idiom `x ^ -1` is
printed as `~x`; comparisons are complemented and direction-flipped when
necessary to preserve signed ordering.

### Constant arguments across classes

Dummy guard parameters are common in these gamepacks:

```java
private void c(ce value, int guard) {
    if (guard != 18580) {
        throw new IllegalStateException();
    }
    consume(value);
}

// Every reachable direct caller:
this.c(value, 18580);
```

```text
; callee a.c(Lce;I)V
iload_2
sipush 18580
if_icmpeq Lok
aconst_null
athrow
Lok:
aload_0
aload_1
invokespecial Method a consume (Lce;)V
return

; caller
aload_0
aload_1
sipush 18580
invokespecial Method a c (Lce;I)V
```

CFG stack analysis associates argument stack values with descriptor
parameters, including calls containing category-two `long`/`double` values. A
parameter is specialized only when every reachable direct call to the resolved
declaration supplies the same integer-like constant. A constant-pool reference
whose owner is a subclass is resolved through the full hierarchy and counted
against the inherited declaration; `Child.m(...)` is not ignored when `m` is
declared on `Parent`.

The body first becomes:

```java
private void c(ce value, int guard) {
    consume(value);
}
```

Specialization, branch folding, and unreachable removal repeat to a bounded
fixed point. Deleting a dead caller in iteration one can reveal that all
remaining calls to another method use the same value in iteration two.
Parameters written by `istore` or `iinc` are never read-only facts.

### Signature compaction and its dictionary

The separately gated signature pass can remove a contiguous trailing run of
specialized, unused integer-like parameters from a private or internal static
method. The following describes the feature when its atomic verifier guard
accepts a gamepack; the current snapshot retained the original signatures and
does not contain these maps.

```java
// Before
private void c(ce value, int guard) { consume(value); }

// After
private void c(ce value) { consume(value); }
```

Conceptually, bytecode rewriting first preserves argument evaluation:

```text
aload_0
aload_1
sipush 18580
pop
invokespecial Method a c (Lce;)V
```

The peephole pass can then remove a side-effect-free literal producer followed
by `pop`. If an argument expression had side effects, its evaluation would
remain and only its result would be discarded. A branch label on the old
invocation moves to the first inserted `pop`, so an incoming edge still sees
the same operand-stack consumption.

Each `games/<game>/signature-map.json` preserves identity for mapping tools:

```json
{
  "formatVersion": 1,
  "signatures": {
    "a.c(Lce;I)V": {
      "newSignature": "a.c(Lce;)V",
      "oldDescriptor": "(Lce;I)V",
      "newDescriptor": "(Lce;)V",
      "callSiteSignatures": ["a.c(Lce;I)V"],
      "removedParameters": [
        { "index": 1, "descriptor": "I", "value": 18580, "discoveredIteration": 2 }
      ]
    }
  }
}
```

Java overload identity ignores return type, unlike a JVM descriptor. The pass
rejects a proposal that collides with another source method in the same class
or an ancestor/descendant. It also records and rewrites inherited call-site
owner aliases. Constructors, open APIs, virtual dispatch, and interface
families are currently excluded.

### Branch matching versus textual matching

Cleanup rules match semantic bytecode/CFG shapes, not source text or fixed
instruction offsets. A candidate normally has to satisfy all applicable
conditions:

- opcode and operand descriptors match the rule;
- stack consumption/production is known at rewritten instructions;
- no alternate edge enters a producer sequence;
- labels and `tableswitch`/`lookupswitch` targets remain valid;
- exception-handler entry stacks and protected ranges are preserved;
- local writes, including parsed `iinc varnum`, invalidate read-only facts;
- method references resolve to the same declaration through inheritance;
- the emitted class passes orphan-local and ASM verifier guards.

For example, these instructions look locally constant but cannot be folded
because `Lrhs` has another incoming edge:

```text
iconst_1
Lrhs:
iconst_1
if_icmpne Lbad
goto Lrhs
```

A raw three-instruction matcher would delete a stack producer needed by the
backedge. The implemented branch folder collects incoming CFG labels first and
rejects the candidate.

### Guarded pattern patching

Some obfuscator shapes need a narrow structural patch before a general
decompiler can print them cleanly. Implemented passes cover families including
shared goto tails, duplicated loop suffixes, stack-carrying joins,
boolean/null comparisons, and verifier-sensitive local splitting. A typical
duplicated loop-tail shape is:

```text
ifeq Lother
iinc 4 1
goto Lhead
Lother:
; ...
iinc 4 1
goto Lhead
```

When the suffix instructions, local, increment direction, and destination
match exactly, the duplicate can target one canonical tail. The Java then has
a normal `continue` rather than a raw state-machine edge:

```java
if (condition) {
    ++index;
    continue;
}
// ...
++index;
```

These patches include method/descriptor, CFG, dominance, exception-range,
local-slot, and stack-shape guards as appropriate. Mutating passes save and
reload the class. A pass that creates a new uninitialized local read or fails
ASM verification is reverted for that class. A final failed class is never
synced into this repository.

### Control-flow reconstruction and fallbacks

The owned decompiler reconstructs `if`/`else`, loops, `switch`, short-circuit
booleans, `break`, and `continue` from CFG regions. Stack values crossing joins
are materialized as typed Java locals when they cannot safely remain inline.
The goal is compilable structured Java, not line-for-line bytecode.

When a region cannot yet be structured, a state-machine fallback may be
emitted. Fallback counts are recorded separately from verification and Java
compilation. They are readability debt: complete source parity and successful
`javac` are still required before sync, although a compile-clean game can
contain a small number of fallback methods.

### Checked catches and synthetic `if (false)` throws

Java rejects a catch of a checked exception when the source-visible try body
cannot throw it. A decompiler can use an unreachable anchor solely to make such
source compile:

```java
try {
    work();
    if (false) throw (MyCheckedException) null;
} catch (MyCheckedException ex) {
    recover(ex);
}
```

Under the checked-catch cleanup gate, declaration analysis removes both the
specific catch and its anchor when no call in the emitted try declares that
checked type. Broad `Throwable`, `Exception`, `RuntimeException`, and `Error`
catches remain conservative because ordinary instructions can produce
unchecked failures. Removing a genuinely unreachable throw has no runtime
effect; removing its catch changes the source exception contract, so this
policy remains independently gated.

### Possible next deobfuscations

The following extensions are useful but are not claimed by this snapshot:

- **Internal interface-family compaction:** prove a parameter dead in the
  declaration and every implementation, then rewrite the family and all
  virtual/interface calls atomically.
- **Semantic names and types:** infer names such as `render`, `packet`, or
  `sprite` from behavior. Current short obfuscated identifiers are retained.
- **Broader interprocedural propagation:** propagate finite enums, strings, or
  immutable objects. Current cross-class facts are integer-like constants.
- **More fallback elimination:** structure remaining irreducible/state-machine
  CFGs after equivalence and verifier proofs are available.

Every stronger transform needs the same escape hatch used here: a separate
gate, deterministic diagnostics and mapping output, full-game bytecode
verification, full source recompilation, and representative runtime A/B tests.

## Source repositories

- **[Kreijstal/dekobloko-work](https://github.com/Kreijstal/dekobloko-work)** —
  the FunOrb/AlterOrb harness: gamepack retrieval scripts, the decompile
  pipeline, the launcher, and the `scripts/decompile-all-games.sh` workflow that
  produced everything in this repo.
- **[Kreijstal/java-tools](https://github.com/Kreijstal/java-tools)** — the
  JVM/decompiler toolkit: a JavaScript implementation of the JVM, a Jasmin
  assembler/disassembler, and the decompiler under `src/decompiler` that
  actually generated the Java source here.

## Compilation stubs

The games reference native/platform classes that are **not** part of the
standard JDK — Microsoft J++ runtime (`com.ms.*`), DirectX/Direct3D bindings
(`com.ms.directX`, `jagdx`), OpenGL (`jaggl`), Jagex native peers (`jaclib`,
`jagex3`), the AlterOrb launcher hook, and the browser `netscape.javascript.JSObject`.
Minimal source **stubs** for these live under [`stubs/src/`](stubs/src) (49 `.java`
files) so the decompiled sources have something to compile against.

Build them into a jar with:

```sh
cd stubs && ./build-stubs.sh   # produces stubs/funorb-stubs.jar
```

These stubs mirror `scripts/build-stubs.sh` in
[dekobloko-work](https://github.com/Kreijstal/dekobloko-work). They provide
signatures only (no real behavior) — enough to satisfy the compiler, not to run
the games.

## Field renaming and the ABI-restore dictionary

The obfuscator reuses single letters for **both class names and field names** —
a game can have a class literally named `a` *and* fields named `a`, `b`, `c`.
In Java **source** the expression `a.b` is then ambiguous (static field `b` of
class `a`, vs. member `b` of a local variable `a`). To keep the emitted source
unambiguous, the decompiler prefixes every game-class field with `field_`
(`a` → `field_a`, `h` → `field_h`). Methods, classes, and local variables are
**not** part of this rename.

### How the decompiler "knows" what it renamed

There is no per-name lookup table. The rename is a **deterministic global rule**,
computed purely from each reference `(owner, name)` in
`src/decompiler/cfr.js` (`sourceFieldName`):

- **field of a game class** — owner is an obfuscated single-segment internal
  name (no `/`, e.g. `hd`, `oj`) → prefix `field_`. Applied **uniformly**: the
  same field is prefixed at its declaration *and* at every
  `getfield/putfield/getstatic/putstatic` in every class.
- **field of a JRE/library class** — owner contains `/` (e.g.
  `java/lang/System`) → left untouched.

Because the decision is a pure function of the reference, the map is currently
just the invertible rule **"strip `field_` from game-class fields"** — the
decompiler and any consumer can recompute it without storing anything. An
explicit dictionary is only required once a name *collision* forces a
**non-uniform** rename (then the mapping is no longer a plain prefix and must be
recorded per member). Emitting that dictionary is tracked in
[dekobloko-work#11](https://github.com/Kreijstal/dekobloko-work/issues/11).

### Why it matters (ABI compatibility)

The `field_` prefix is a **source-only** concern — in bytecode a field
reference already carries `owner + name + descriptor`, so it is fully
reversible. But if you recompile the emitted source as-is, the resulting
classes declare `field_h` while the *original* peers still reference `h`, so a
recompiled class dropped into the otherwise-original jar fails at link time with
`NoSuchFieldError: h`. That blocks **differential bisection** (swapping one
recompiled class into the original jar to localize a codegen bug).

### Restoring the original ABI

The [dekobloko-work](https://github.com/Kreijstal/dekobloko-work) harness ships
an ASM-based restore pass that rewrites recompiled classes back to the original
field names (declarations *and* references), producing **ABI-identical** output
that links against the originals. Field-name-only edits leave stack-map frames
and operand sizes untouched, so no `StackMapTable` recomputation is involved:

```sh
# in dekobloko-work
scripts/restore-abi.sh <recompiledClassesDir> <outDir> \
  --verify-against <originalClassesDir>
```

`--verify-against` asserts, per class, that the restored field
`{name, descriptor}` set equals the original's — i.e. the recompiled class is a
drop-in ABI match. The companion `AbiTools link` mode statically resolves every
field reference across a class set and reports any latent `NoSuchFieldError`,
which is the server-free oracle used to confirm a mixed (original + one
recompiled) jar actually links.

## Work in progress — known bugs being ironed out

This is decompiler output under **active correction**. The reconstructed
*structure* is faithful, but some methods still have **runtime-behaviour** bugs
where the emitted Java, though it compiles, does not branch identically to the
original bytecode. Known open classes of bug (tracked in dekobloko-work):

- **ABI dictionary emission** — see above
  ([#11](https://github.com/Kreijstal/dekobloko-work/issues/11)).

These are being localized via the ABI-restore + bisection workflow above and
fixed in the decompiler; the sources here are regenerated as fixes land.

## Caveats

- This is **decompiler output**. The current 44-game snapshot was verified to
  recompile cleanly with `javac`, but it is not intended to be a drop-in
  runnable distribution.
- The goal is faithful reconstruction of program structure for research and
  preservation, not pristine source.
- Some methods still carry runtime-behaviour bugs (see *Work in progress*
  above); recompiled output may not yet behave identically to the original.
- Names are obfuscated (see above).

## Games included

All **44** games are included — this is the full canonical roster, and every
one produced decompiled Java. Total: **18,481** `.java` files across 44 games.

| Game | `.java` files |
| --- | --- |
| 36cardtrick | 295 |
| aceofskies | 545 |
| arcanistsmulti | 363 |
| armiesofgielinor | 542 |
| bachelorfridge | 865 |
| bouncedown | 289 |
| brickabrac | 420 |
| chess | 346 |
| confined | 341 |
| crazycrystals | 394 |
| dekobloko | 343 |
| drphlogistonsavestheearth | 306 |
| dungeonassault | 387 |
| escapevector | 348 |
| fleacircus | 306 |
| geoblox | 303 |
| holdtheline | 356 |
| hostilespawn_vengeance | 335 |
| kickabout | 543 |
| lexicominos | 297 |
| minerdisturbance | 341 |
| monkeypuzzle2 | 303 |
| orbdefence | 311 |
| pixelate | 397 |
| pool | 429 |
| shatteredplans | 457 |
| solknight | 294 |
| starcannon | 287 |
| steelsentinels | 347 |
| stellarshard | 301 |
| sumoblitz | 586 |
| terraphoenix | 311 |
| tetralink | 355 |
| tombracer | 1090 |
| torchallenge | 300 |
| torquing | 396 |
| trackcontroller | 298 |
| transmogrify | 299 |
| vertigo2 | 437 |
| virogrid | 347 |
| voidhunters | 1570 |
| wizardrun | 298 |
| zombiedawn | 386 |
| zombiedawnmulti | 417 |

## Legal

These are **decompiled third-party game assets**, reconstructed from publicly
retrievable FunOrb/AlterOrb gamepacks and published here for **research and
preservation** purposes. No ownership of the underlying games is claimed, and no
license is granted over the original games or their assets. All rights to the
original games remain with their respective rights holders. The decompilation
tooling itself lives in the linked repositories.
