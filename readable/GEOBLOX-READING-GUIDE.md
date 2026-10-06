# Reading GeoBlox

The readable tree uses semantic names without opaque suffixes. The symbol map
keeps the original spelling and JVM identity of every declaration, so
`GameplaySession` maps back to `gh`. Methods use full JVM descriptors in the
rules: two `a` overloads can have different roles. The map records original and
renamed identities, input/output files and every edit offset. Source offsets are
UTF-16 code units, not byte offsets.

The [generator and current rules](https://github.com/Kreijstal/dekobloko-work/blob/45ce33ec941a41afc75b721cceb67b7a3b5603ac/readable/README.md) now live in
`dekobloko-work`; the only maintained readable Java export is here.

## Current readability (pass 204)

The export has 18,357 guarded names and 117,393 Java identifier edits, plus 11
class-name literal edits and 570 separately recorded label edits. All 303 top-level names are meaningful: 302 semantic
renames and the original `Geoblox`. Unmapped members and large labeled bodies remain.
The total naming-rule count mostly measures members and local declarations. All 303 sources
compile and compare 136,410 bindings, reproduce and
reverse to the pinned raw Git input. Forty-one nested skip frames now use
short-circuit guards for their original remainders, consuming 82 breaks and
saving 219 lines. Menu hit-test trees preserve every strict boundary and
predicate order while placing the highlight update under one explicit guard.
Menu rendering falls from 372 to 296 lines and ten to three block labels.
Prefix/branch scopes and protected regions remain intact.

## Current shared primitive-store fallbacks (pass 204)

Five guarded fallback assignments across four gameplay-session methods now use
exclusive if/else arms. Every other exit retains its original frame name, braces
and destination. Conditions, prefixes, guard evaluation and store order remain
once on the original paths. The generic decompiler requires scoped integral or
boolean destination/operand evidence and a terminal plain-block/if corridor;
unknown/boxed/floating/computed stores and crossed protected/loop/monitor
corridors refuse reconstruction. No control-flag value is assumed.

Independent javac attribution certifies all selected stores, continuations,
original/copied bindings and 5,032 remaining transfers/protected scopes.
All 18,357 complete naming objects remain exact; no label retires
or ordinal migrates. There are 18,357 rules, 19,403 dictionary identities,
117,393 identifier, 11 literal and 570 label edits
(117,974 total).

From java-tools,
`JAVA_TOOL_OPTIONS=-XX:-UsePerfData NODE_PATH=/home/kreijstal/git/java-tools/node_modules node --test --experimental-test-isolation=none test/sharedStoreFallbackRecovery.test.js test/guardedStoreFallbackRecovery.test.js test/sharedGuardedFallbackRecovery.test.js test/terminalGuardedFrameRecovery.test.js test/terminalFrameLoopRecovery.test.js test/javaAstEmitterGuardedAbruptExits.test.js`
passes all 36 groups. The shared-store fixture compares 174,960 native cases
across 24 models with independent oracles, including original/shared/subsequently
structured forms, nullable conditions and guards, early exits, mutations, partial
writes, overflow, volatile fields, aliases, finally priority and monitor release.

From Deko,
`JAVA_TOOL_OPTIONS=-XX:-UsePerfData NODE_PATH=/home/kreijstal/git/java-tools/node_modules node readable/tests/test-geoblox-guarded-abrupt-source.mjs ../java-tools`
checks all 303 exact CLI/source bytes, independently attributed primitive stores
and corridors, all bindings, five consumed exits, complete naming objects and
compilation. All 303 readable files reverse byte exactly; all 27 publication
checks, 17 scoped native trace groups and current/fresh sibling reproductions
pass. Older proof records and frozen input/naming/native pins remain intact.
Five large labeled methods and 41 unsupported fields remain. Whole-game/browser/
phone equivalence and heap/presented-FPS acceptance remain unverified.

The tracked **decompiler-source** Git tar SHA-256 is
`39d4fb6149ae4129dcc270c0e0fc12935b8b8fa29a4339edb65208716ba6b0dd`.

## Previous late shared-frame conditions (pass 203)

Shared-callback recovery exposed two early exits with complete terminal suffixes.
Menu-action dispatch and gameplay rendering now guard those whole suffixes under
their original inverse conditions. The gameplay-overlay frame retires after its
last exit disappears. Other menu exits retain their frame. Original conditions,
prefixes, callbacks and guard order remain once on the original paths. No new
selector, name, assumed control-flag value or arithmetic reassociation is added.

The actual shared-stage source is independently reattributed with javac. Each
selected exit reaches the frame end through a terminal plain-block/if corridor;
intervening work and crossed loops/protected/monitor regions refuse. Every
original binding and remaining destination/protected scope retains its exact
identity. One label retires and 0 surviving ordinals migrate. All
18,357 unaffected complete naming objects remain exact.
There are 18,357 rules, 19,403 dictionary identities,
117,388 identifier, 11 literal and 575 label edits
(117,974 total).

From java-tools,
`JAVA_TOOL_OPTIONS=-XX:-UsePerfData NODE_PATH=/home/kreijstal/git/java-tools/node_modules node --test --experimental-test-isolation=none test/sharedGuardedFallbackRecovery.test.js test/terminalGuardedFrameRecovery.test.js test/smallGuardedFallbackRecovery.test.js`
passes all nineteen tests. The shared-callback fixture's 174,960 native cases
compare original, shared and final structured forms with independent models,
covering early exits, nullable conditions/guards/payloads, mutations, overloads,
aliases, partial failures, overflow, finally priority and monitor release.

From Deko,
`JAVA_TOOL_OPTIONS=-XX:-UsePerfData NODE_PATH=/home/kreijstal/git/java-tools/node_modules node readable/tests/test-geoblox-guarded-abrupt-source.mjs ../java-tools`
checks all 303 exact CLI/source bytes, independently reattributed continuation
facts, every binding, two consumed exits, all 5,037 surviving transfer/protected
scope facts, complete naming objects, retirement/ordinal migrations and compilation.
All 303 readable files reverse byte exactly. All 27 publication tests, 17 scoped
native trace groups and current/fresh sibling reproduction checks pass. Older
proof records and frozen input/naming/native pins remain. Five large labeled
bodies and 41 unsupported fields remain; whole-game/browser/phone and heap/
presented-FPS acceptance are unverified.

The tracked **decompiler-source** Git tar SHA-256 is
`8bad2651674bf730eac82c00891be01ac59a732ddd32ae909c350240eb04a1e1`.

## Previous shared bounded fallbacks (pass 202)

Three final guarded callback skips in menu-action dispatch and gameplay rendering
now use bounded callbacks in exclusive source arms. Each callback still executes
once on its original fallback paths. Original conditions, prefixes and guards
are not reevaluated. Other exits retain their original frame names and targets.
Terminal plain-block/if/label corridors permit nested dispatch without crossing
work, loops, protected regions or monitors. No new selector, name, assumed
control-flag value or arithmetic reassociation is introduced.

Callbacks require simple operands, at most 32 tokens/512 bytes and one source
line. Computed arithmetic, casts, array/call operands, poly expressions and
prefix-owned direct declarations refuse. Independent javac certifies the exact
callback, copy scope, corridor and each selected exit. Every original binding
and six copied bindings resolve to their exact original targets. All 18,358
complete naming objects and 19,404 dictionary identities remain unchanged.
There are 117,388 identifier, 11 literal and 578 label
edits (117,977 total).

From java-tools,
`JAVA_TOOL_OPTIONS=-XX:-UsePerfData NODE_PATH=/home/kreijstal/git/java-tools/node_modules node --test --experimental-test-isolation=none test/sharedGuardedFallbackRecovery.test.js`
passes six focused groups. Independent native models compare 174,960 cases
across twelve direct/nested/protected contexts, including original, shared and
follow-on structured forms. Early exits, nullable conditions/guards/payloads,
mutations, overloads, aliases, partial failures, overflow, finally priority and
monitor release retain their traces. All 47 selected regression tests pass.

From Deko,
`JAVA_TOOL_OPTIONS=-XX:-UsePerfData NODE_PATH=/home/kreijstal/git/java-tools/node_modules node readable/tests/test-geoblox-guarded-abrupt-source.mjs ../java-tools`
checks all 303 exact CLI/source bytes, independent callback/corridor/scope facts,
every original/copied binding, three consumed exits, all 5,039 surviving
transfer/protected-scope facts, unchanged complete naming objects and compilation.
All 303 readable files reverse byte exactly. All 27 publication tests, 17 scoped
native trace groups and current/fresh sibling reproduction checks pass. Older
proof records and frozen input/naming/native pins remain. The remaining exits
can now be checked for terminal conditional reconstruction in the next pass.
Five large labeled bodies and 41 unsupported fields remain; whole-game/browser/
phone and heap/presented-FPS acceptance are unverified.

The tracked **decompiler-source** Git tar SHA-256 is
`24f090f659ca01b85983a0a228106fdc72104b1b85588b5d224c7ca3e2e9eba8`.

## Previous terminal frame loops (pass 201)

Board connectivity traversal now uses two ordinary breaks of its existing
queue-processing loop. Its enclosing block label and unnecessary scope disappear.
Independent javac proves that every old frame reference is inside that loop,
that each bare destination is the loop itself, and that the loop ends the frame
through an action-free terminal block/if corridor. Prefix allocations, iterator
work, loop headers and updates, aliases and protected loop bodies stay once.

The generic recovery also handles while/for/enhanced-for/do loops. Nonlocal exits
reuse the existing frame name on the loop or merge into its existing name.
Declaration and scalar-statement scopes retain braces. Prefix references,
nonterminal work, crossed loops or protected corridors, nested execution and
unsupported structure refuse. No new label, selector, condition, action or
control-flag assumption is introduced. The old connectivity-frame rule retires;
3 surviving ordinals migrate. All 18,355 unaffected complete
naming objects remain exact. There are 18,358 rules,
19,404 dictionary identities, 117,382 identifier,
11 literal and 581 label edits (117,974 total).

From java-tools,
`JAVA_TOOL_OPTIONS=-XX:-UsePerfData NODE_PATH=/home/kreijstal/git/java-tools/node_modules node --test --experimental-test-isolation=none test/terminalFrameLoopRecovery.test.js`
passes six focused groups. Independent native models compare 69,120 cases across
96 loop/protected/merge/exit contexts, covering nullable headers, suppressed
updates, iterator work, aliases, overflow, partial failures, nested exits,
pending returns/throws, finally priority and monitor release. The selected
regression command passes 106 tests, with one optional skip.

From Deko,
`JAVA_TOOL_OPTIONS=-XX:-UsePerfData NODE_PATH=/home/kreijstal/git/java-tools/node_modules node readable/tests/test-geoblox-guarded-abrupt-source.mjs ../java-tools`
checks all 303 exact CLI/source bytes, independent loop/corridor/bare-destination
evidence, every original binding, all 5,042 transfers and protected scopes,
complete naming objects, the retired label and ordinal migrations, and compilation.
All 303 readable files reverse byte exactly. All 27 publication tests, 17 scoped
native trace groups and current/fresh sibling reproduction checks pass. Older
proof records and frozen input/naming/native pins remain. Five large labeled
bodies and 41 unsupported fields remain; whole-game/browser/phone and heap/
presented-FPS acceptance are unverified.

The tracked **decompiler-source** Git tar SHA-256 is
`8ea7bde8e790b43a20c1912d6d05fab29c07d8b20a12c8cf33d8d031499b5029`.

## Previous terminal guarded remainders (pass 200)

Fifteen guarded frame exits across eight methods become inverse guards around
their complete original suffixes. Board reconciliation, menu rendering, mesh-depth queueing, applet execution
and MIDI event/audio updates benefit. Every original condition and action
keeps one source occurrence and its original evaluation order. Whole protected
suffixes stay together. Terminal plain-block/if corridors are independently
certified; intervening work and corridors crossing loops, try/catch/finally or
monitors refuse. No predicate or action copy, selector, new name, arithmetic
reassociation or control-flag assumption is introduced.

The last eligible guard recovers first. Other exits keep their frame name;
three last references retire their labels. Declaration and scalar-statement
scopes retain braces. Independent javac proves each consumed exit and complete
terminal corridor. All original binding occurrences and surviving targets/
protected scopes remain exact. 2 surviving label ordinals migrate; all
18,357 unaffected complete naming objects remain exact.
There are 18,359 rules, 19,405 dictionary identities,
117,382 identifier, 11 literal and 584 label edits
(117,977 total).

From java-tools,
`JAVA_TOOL_OPTIONS=-XX:-UsePerfData NODE_PATH=/home/kreijstal/git/java-tools/node_modules node --test --experimental-test-isolation=none test/terminalGuardedFrameRecovery.test.js`
passes six focused groups. Independent native models compare 77,760 cases
across 24 direct/nested/chained/protected contexts. Nullable/effectful guards,
partial writes, aliases, overflow, nested loop exits, finally priority and
monitor release retain their traces. Selected regression commands pass 106
tests, with one optional skip.

From Deko,
`JAVA_TOOL_OPTIONS=-XX:-UsePerfData NODE_PATH=/home/kreijstal/git/java-tools/node_modules node readable/tests/test-geoblox-guarded-abrupt-source.mjs ../java-tools`
checks all 303 exact CLI/source bytes, independent continuation evidence,
every original binding, 15 consumed exits, all 5,042 surviving transfer/protected
scope facts, complete naming objects, label migrations and compilation.
All 303 readable files reverse byte exactly. All 27 publication tests, 17 scoped
native trace groups and current/fresh sibling reproduction checks pass. Older
proof records and frozen input/naming/native pins remain. Five large labeled
bodies and 41 unsupported fields remain; whole-game/browser/phone and heap/
presented-FPS acceptance are unverified.

The tracked **decompiler-source** Git tar SHA-256 is
`d1eba2a03c51fad0009b1f7b039da230ba8253d074033abb32b712ee2baccf8b`.

## Previous guarded primitive-store fallbacks (pass 199)

Five sole-exit labels across four methods become ordinary exclusive `if/else`
continuations. Gameplay rendering, gameplay update, session-end initialization
and UI-widget pointer handling benefit. The eight original integral/boolean
fallback assignments occupy exclusive source sites; each still executes once on
its original paths and in its original order. Original conditions, prefixes and
guards are never reevaluated. Floating prefix arithmetic stays at its one
original site. No selector, new name or control-flag assumption is introduced.

A terminal plain-block/if corridor can connect the selected branch to the frame
exit. Extra work, loops and protected corridors refuse. Scoped primitive
local/formal bindings or exact owned-field metadata prove store types. Boxing,
floating stores, computed/cast/call/array operands, unknown receivers and shadowed
class qualifiers refuse. Prefix-owned declarations refuse; outer declaration
scopes retain their braces. Independent javac certifies the corridor, exact
continuation and every primitive store; all original and eight copied bindings
retain their targets. Five labels retire and 6 surviving ordinals migrate.
All 18,356 unaffected complete naming objects remain exact.
There are 18,362 rules, 19,408 dictionary identities,
117,382 identifier, 11 literal and 602 label edits
(117,995 total).

From java-tools,
`JAVA_TOOL_OPTIONS=-XX:-UsePerfData NODE_PATH=/home/kreijstal/git/java-tools/node_modules node --test --experimental-test-isolation=none test/guardedStoreFallbackRecovery.test.js`
passes six focused groups. Native independent models compare 77,760 cases
across 24 direct/nested/protected/store contexts, covering nullable conditions
and guards, volatile stores, partial failures, overflow, finally priority,
monitor release and alias identity. The selected regression command passes
110 tests, with one optional skip.

From Deko,
`JAVA_TOOL_OPTIONS=-XX:-UsePerfData NODE_PATH=/home/kreijstal/git/java-tools/node_modules node readable/tests/test-geoblox-guarded-abrupt-source.mjs ../java-tools`
checks all 303 exact CLI/source bytes, independent primitive-store/corridor
evidence, every original/copied binding, five consumed exits, all 5,057 surviving
transfer/protected-scope facts, complete naming objects, label migrations and
compilation. All 303 readable files reverse byte exactly. All 27 publication
tests, 17 scoped native trace groups and current/fresh sibling reproduction
checks pass. Older proof records and frozen input/naming/native pins remain.
Five large labeled bodies and 41 unsupported fields remain; whole-game/browser/
phone and heap/presented-FPS acceptance are unverified.

The tracked **decompiler-source** Git tar SHA-256 is
`446ca7880602a3d8e2e01a44c7f30cc06a8d243d9c325a518fb72437eecb24fd`.

## Previous terminal loop frames (pass 198)

Twenty-one terminal labeled blocks across fourteen methods now share the name
of their actual loop exit: fifteen existing labels move onto loops, and six
merge into existing loop labels. All thirty-two selected breaks exit the same
loop, with no intervening action or protected boundary. Declaration-free bodies
lose an unnecessary nesting level; declaration scopes retain their braces.
Loading/rendering, board reconciliation, nine-slice generation and entropy
copying benefit. Loop headers and updates, nested exits, outer continues,
finally overrides and monitor scopes remain. No new condition or action is added.

Independent javac certifies every frame, adjacent bare loop exit and resolved
jump destination. Every original ordinary binding, label reference, transfer
and protected scope is checked by exact token origin. Six label rules retire;
3 surviving ordinals migrate. All 18,364 unaffected
complete naming objects remain exact. There are 18,367 rules,
19,413 dictionary identities, 117,374 identifier,
11 literal and 612 label edits (117,997 total).

From java-tools,
`JAVA_TOOL_OPTIONS=-XX:-UsePerfData NODE_PATH=/home/kreijstal/git/java-tools/node_modules node --test --experimental-test-isolation=none test/terminalLoopFrameRecovery.test.js`
passes six focused groups. Native independent models compare 11,520 cases
across 48 loop/protected/merge models, covering callback order, update suppression,
aliases, overflow, partial failures, finally priority and monitor release.
The selected regression command passes 142 tests, with one optional skip.

From Deko,
`JAVA_TOOL_OPTIONS=-XX:-UsePerfData NODE_PATH=/home/kreijstal/git/java-tools/node_modules node readable/tests/test-geoblox-guarded-abrupt-source.mjs ../java-tools`
checks all 303 exact CLI/source bytes, independently certified loop exits,
every original binding, moved and merged label identities, all 5,062 transfers
and protected-scope facts, complete naming objects, migrations and compilation.
All 303 readable files reverse byte exactly. Publication tests, scoped native
probes and current/fresh sibling reproduction checks pass. Older proof records
and frozen input/naming/native pins remain. Five large labeled bodies and 41
unsupported fields remain; whole-game/browser/phone and heap/presented-FPS
acceptance are unverified.

The tracked **decompiler-source** Git tar SHA-256 is
`8207f4543e3261edc2a8b23b324c7c0cd6ccb33f78cb745b930fc2b225b7c00b`.

## Previous exclusive guarded fallbacks (pass 197)

Gameplay rendering, scene-transition update and entropy copying now use ordinary
`if/else` continuations in place of three single-exit labels. Each original
condition, prefix and keep guard retains one source occurrence. One small
fallback callback occupies two exclusive source sites; only one runs on any
original fallback path. Conditions can mutate, unbox or throw, and are never
reevaluated. No selector, new name or assumed control-flag value is introduced.

A copied fallback must be one call with simple operands, including signed
integral literals, at most 32 tokens/512 characters and one source line.
Computed arithmetic, casts, poly expressions, prefix-owned direct declarations,
extra frame exits and protected guarded-jump boundaries refuse. Outer declaration
and statement-slot scopes retain their braces. Independent javac evidence checks
the shape and copy scope, every original binding and all five added callback/
operand bindings. The three consumed exits retire exactly their label rules;
13 surviving ordinals migrate. All 18,360 unaffected
complete naming objects remain exact. There are 18,373 rules,
19,419 dictionary identities, 117,374 identifier,
11 literal and 618 label edits (118,003 total).

From java-tools,
`JAVA_TOOL_OPTIONS=-XX:-UsePerfData NODE_PATH=/home/kreijstal/git/java-tools/node_modules node --test --experimental-test-isolation=none test/smallGuardedFallbackRecovery.test.js`
passes seven focused groups. Native independent models compare 12,960 cases
across six contexts, covering condition mutation, nullable guards, overloads,
aliases, partial failures, overflow, finally priority and monitor release.
The selected regression command passes all 69 tests.

From Deko,
`JAVA_TOOL_OPTIONS=-XX:-UsePerfData NODE_PATH=/home/kreijstal/git/java-tools/node_modules node readable/tests/test-geoblox-guarded-abrupt-source.mjs ../java-tools`
checks all 303 exact CLI/source bytes, independently certified copy scopes, every
original and copied binding, the consumed labels, all 5,062 surviving transfer
and protected-scope facts, complete naming objects, migrations and compilation.
All 303 readable files reverse byte exactly. Publication tests, scoped native
probes and current/fresh sibling reproduction checks pass. Older proof records
and frozen input/naming/native pins remain. Five large labeled bodies and 41
unsupported fields remain; whole-game/browser/phone and heap/presented-FPS
acceptance are unverified.

The tracked **decompiler-source** Git tar SHA-256 is
`9189badf6664d1447e2d4b41c12c254cc174a075293aa81b5d49f220bf4aba40`.

## Previous single-pass inner loops (pass 196)

The generic decompiler removes artificial inner loops in board reconciliation
and nine-slice generation. Their bodies execute at most once; two bare breaks
now continue the immediately enclosing traversal at exactly the original next
update/test point. Both declaration-free bodies flatten, removing a nesting
level. All actions, condition evaluations, aliases and arithmetic stay once and
in order. No selector, new name, duplicated predicate or flag value is added.

Recovery requires independent evidence that the inner body cannot fall through
or continue to its own header, and that its terminal corridor contains no
intervening action. Whole blocks, branches, labels, catches, try bodies and
monitors may remain on that corridor. An enclosing finally refuses: changing
its normal completion to a continue could override a pending return/throw.
Protected inner constructs stay whole; an inner finally's own break can override
a pending completion at the same outer iteration boundary. Inner labels, own
backedges, switch fallthrough, suffix actions and unsupported syntax refuse.

From java-tools,
`JAVA_TOOL_OPTIONS=-XX:-UsePerfData NODE_PATH=/home/kreijstal/git/java-tools/node_modules node --test --experimental-test-isolation=none test/singlePassInnerLoopRecovery.test.js`
passes eight focused groups. Native models compare 31,104 cases across 48
outer-loop/protected contexts, plus 50 inner-finally override cases. They cover
outer updates and condition effects, nullable guards, aliases, overflow, partial
writes, returns, throws, close callbacks, finally priority and monitor release.
The selected regression command passes 129 tests with one existing optional skip.

From Deko,
`JAVA_TOOL_OPTIONS=-XX:-UsePerfData NODE_PATH=/home/kreijstal/git/java-tools/node_modules node readable/tests/test-geoblox-guarded-abrupt-source.mjs ../java-tools`
checks independently parsed completion, corridors and destinations; all 303
exact CLI/source bytes; every original binding; all 5,065 protected transfer
facts with only the two certified kind/target redirects; complete naming objects
and compilation. All 18,376 rules and 19,422 dictionary identities remain exact.
All 303 readable files reverse byte exactly. Publication tests, scoped native
probes and current/fresh sibling reproduction checks pass. Earlier proofs and
frozen input/naming/native pins remain exact. Five large labeled bodies and
41 unsupported fields remain; browser/phone and heap/presented-FPS acceptance
are unverified.

The tracked **decompiler-source** Git tar SHA-256 is
`3376de75585aad84c1b49cfa0085dc22e25131c058a124af31819bb77158ecb0`.

## Previous exact self-cast cleanup (pass 195)

The generic decompiler removes 103 redundant self casts in 48 methods across
30 files, including seven in gameplay update. For example,
`((GameplaySession) (this)).field` becomes `this.field`.
Only casts from bare `this` to its exact nongeneric source class are removed.
The emitter supplies its actual erased class and method type context; direct
API callers must supply every in-scope type parameter. Different receiver types,
nullable/ordinary receivers, boxing, enclosing `this`, hierarchy checks and
casts selecting another overload retain their source. No value, alias or
control-flag assumption is introduced, and no action moves or repeats.

Independent javac evidence certifies each exact self type. All 303 complete ASTs
match after ignoring only grouping and these certified self casts. Only 103
cast-type class references disappear; all surviving field, method, local,
parameter and type occurrences retain their bindings. All 5,065 transfer targets
and protected scopes remain exact. All 18,376 complete naming objects,
19,422 dictionary identities and 624 label edits remain;
identifier edits fall to 117,369 (118,004 total edits).
Five large labeled bodies and 41 unsupported opaque fields remain.

From java-tools,
`JAVA_TOOL_OPTIONS=-XX:-UsePerfData NODE_PATH=/home/kreijstal/git/java-tools/node_modules node --test --experimental-test-isolation=none test/selfCastRecovery.test.js test/javaAstEmitterIdentityCasts.test.js`
passes 11 focused groups. The self-cast native fixture compares 810 cases across
six contexts, covering overloads, hidden fields, aliases, constructors, retained
runtime checks, partial effects, finally priority and monitor release. Existing
local identity-cast tests and their 2,880 native cases remain unchanged. The
selected receiver-cast regression command passes 17 Node checks and 35 Tape
assertions. The broader metadata CLI test cannot start its child Node through
restricted sandbox pipes (`spawnSync node EPERM`); exported member/type/value
bindings are instead independently verified across all 303 files by javac.

From Deko,
`JAVA_TOOL_OPTIONS=-XX:-UsePerfData NODE_PATH=/home/kreijstal/git/java-tools/node_modules node readable/tests/test-geoblox-guarded-abrupt-source.mjs ../java-tools`
checks exact CLI/source bytes, self types, complete ASTs, surviving bindings,
all control/protected targets, complete naming objects and compilation.
All 303 readable files reverse byte exactly. Publication tests, scoped native
probes and current/fresh sibling reproduction checks pass. Earlier proof records
and frozen input/naming/native pins remain exact. Whole-game/browser/phone
and heap/presented-FPS acceptance remain unverified.

The tracked **decompiler-source** Git tar SHA-256 is
`ac3994e9f4e2561e9e484adfc3318de85475155495041876dae1d1a1ae4a1a04`.

## Previous guarded assignment sequences (pass 194)

The generic decompiler reconstructs rotation-key selection in
`GameplaySession.updateSession` as an ordinary `if/else`. The original
condition and captured keep-value guard each occur once. Both assignment
sequences retain their statement order and assignment conversions. All selected
destinations are primitive locals or parameters, both arms overwrite the same
set, and every value/guard is total. The guard and fallback cannot read any
selected destination. Effectful conditions still execute once before stores.
No predicate copy, selector, assumed flag value or arithmetic reassociation is
introduced. The rule applies to arbitrary Java; only naming is game-specific.

One label rule retires and 4 surviving ordinals migrate;
18,372 unaffected complete naming objects remain exact.
There are 18,376 rules, 19,422 dictionary identities,
117,471 identifier edits, 11 literal edits and
624 label edits (118,106 total). The raw corpus
loses 4 lines. Session update is 556 lines with
7 labels. Five bodies still have labels and at least 300 lines;
41 unsupported opaque fields remain.

From java-tools,
`JAVA_TOOL_OPTIONS=-XX:-UsePerfData NODE_PATH=/home/kreijstal/git/java-tools/node_modules node --test --experimental-test-isolation=none test/guardedAssignmentSequenceRecovery.test.js test/guardedLocalAssignmentRecovery.test.js`
passes 17 groups, including nine sequence groups, 10,800 independent sequence
completion cases across six contexts and 294 sequence primitive cases across
seven models. They cover partial writes, null unboxing, overflow, finally
priority, monitor release, narrowing, signed zero, NaN and long precision.
The selected regression command passes 197 groups with one existing optional skip.

From Deko,
`JAVA_TOOL_OPTIONS=-XX:-UsePerfData NODE_PATH=/home/kreijstal/git/java-tools/node_modules node readable/tests/test-geoblox-guarded-abrupt-source.mjs ../java-tools`
checks all 303 exact raw bytes, independently typed destinations and dependencies,
every original binding occurrence, the consumed exit, all
5,065 surviving transfer targets/protected scopes,
complete naming objects, migrations and compilation. The readable dictionary
reverses all 303 files byte exactly. Publication tests, scoped native probes
and current/fresh sibling reproduction checks pass. Older proof objects and
frozen input/naming/native pins remain exact. Whole-game/browser/phone equivalence
and heap/presented-FPS acceptance remain unverified.

The tracked **decompiler-source** Git tar SHA-256 is
`5f50584da8d550da35a19b1288e65f7fde5c190f80eb022f67ccd65a54dbe874`.

## Previous stable guarded fallbacks (pass 193)

The generic decompiler replaces 23 single-exit labeled fallback blocks with
ordinary conditions in 11 methods across three files: screen rendering, PCM
audio bounds and triangle rasterization. Each prefix, guard and fallback action stays in one place. A repeated predicate reads only proven
primitive locals/formals that the complete prefix cannot change; no field value
or client control-flag value is assumed. Effectful guards retain their original
evaluation order. Empty prefixes need one condition evaluation. Floating
arithmetic is repeated only in an actual FP-strict source context. No selector
variable, callback copy or reassociated arithmetic is introduced.

Java declarations remain exact. The 26 additional primitive read occurrences
are independently attributed by javac; all 5,066 surviving transfer targets and
protected scopes retain their identities. Twenty-three label rules retire and
two surviving ordinals migrate; all 18,375 unaffected complete naming objects
remain exact. There are 18,377 rules, 19,423 dictionary identities, 117,471
identifier edits, 11 literal edits and 626 label edits (118,108 total). All 303
sources compile, comparing 136,494 ordinary bindings and preserving 388 overrides.
The raw corpus loses 66 lines. The large triangle rasterizer is 357 lines with
six labels; five bodies still have labels and at least 300 lines. Forty-one
unsupported opaque fields remain.

From java-tools,
`JAVA_TOOL_OPTIONS=-XX:-UsePerfData NODE_PATH=/home/kreijstal/git/java-tools/node_modules node --test --experimental-test-isolation=none --test-reporter=tap test/stableGuardedFallbackRecovery.test.js`
passes nine groups, including 207,360 independent native completion cases
across 12 models/six contexts and 55 FP-strict arithmetic cases. The selected
regression suite passes 189 tests with one existing optional corpus skip.
Callback order, partial writes, nullable unboxing, NaNs, overflow, guard mutations,
finally overrides, monitor release and declaration scopes are covered.

From Deko,
`JAVA_TOOL_OPTIONS=-XX:-UsePerfData NODE_PATH=/home/kreijstal/git/java-tools/node_modules node readable/tests/test-geoblox-guarded-abrupt-source.mjs ../java-tools`
checks all 303 exact raw source bytes, independently proven predicate invariants
and copies, every original binding, sole consumed exits, surviving targets/scopes,
complete naming objects, label migrations and compilation. All 303 readable files
reverse byte exactly. Publication tests, scoped native gameplay/result probes
and current/fresh sibling reproduction checks pass. Older proof objects, fixed
bytecode inputs and frozen naming/native pins remain. Whole-game/browser/phone
equivalence and heap/presented-FPS acceptance are unverified.

The tracked **decompiler-source** Git tar SHA-256 is
`657bdbd19ffd0658856fe4021d70dffe76b1405292c586823a125745b88f0ec3`.

## Previous guarded value selection (pass 192)

Two screen-render blocks now assign their values directly with conditional
expressions. The generic java-tools rule retains each condition's evaluation
and effects, then reads the original captured primitive keep-value guard.
Both values must be total primitive expressions with the same Java type;
neither the guard nor the fallback may read the destination. Calls, fields,
arrays, unboxing, division, mutations and protected boundaries refuse this
proof. No client control-flag value is assumed, and no game names are hardcoded.

Only `c.java` changes: two methods lose two labels, six wrapper blocks,
two duplicate local stores and 16 lines. `GameScreen.renderScreen` falls from
304 to 296 body lines and four to three labels. Seven surviving label ordinals
migrate explicitly. All 18,393 unaffected complete naming objects remain exact.
There are 18,400 rules and 19,446 dictionary identities, with 117,445 identifier,
11 literal and 672 label edits (118,128 total). The 303 sources compile and
compare 136,468 ordinary bindings, preserving all 388 overrides.

From java-tools,
`JAVA_TOOL_OPTIONS=-XX:-UsePerfData NODE_PATH=/home/kreijstal/git/java-tools/node_modules node --test test/guardedLocalAssignmentRecovery.test.js`
passes eight focused groups, including 30,240 independent native completion
cases across six contexts and 378 primitive-type cases across nine models.
They cover partial callback effects, null unboxing, overflow, finally overrides,
monitor release, narrowing, NaN, signed zero and large integer precision.
The selected regression suite passes 174 tests with one existing optional skip.

From Deko,
`JAVA_TOOL_OPTIONS=-XX:-UsePerfData NODE_PATH=/home/kreijstal/git/java-tools/node_modules node readable/tests/test-geoblox-guarded-abrupt-source.mjs ../java-tools`
checks exact expected bytes for all 303 raw files, independently attributed
primitive guards/values/local stores, the two consumed exits, all 5,089 surviving
transfer destinations and protected scopes, every surviving occurrence binding,
retired/migrated labels, complete naming objects and compilation.
The dictionary reverses all 303 files byte exactly. Publication tests, scoped
native gameplay/result probes and current/fresh sibling reproduction checks pass.
Earlier proof objects, fixed bytecode inputs and frozen naming/native pins remain.

Five bodies still have labels and at least 300 lines; screen rendering remains
labeled below that threshold. Forty-one unsupported field names remain.
Whole-game/browser/phone equivalence and heap/presented-FPS targets are unverified.
The tracked **decompiler-source** Git tar SHA-256 is
`6fcfc89be07a6ea93b391b2cf5b847061f47b963a35d66088f5bba5350978fef`.

## Previous late switch completion (pass 191)

Late nested dispatch recovery can create a terminal switch after switch-frame
cleanup has already run. The emitter now applies the existing destination and
scope proof once more at the end. This removes the rotation-update label in
`GameplaySession.updateSession` and changes its five outward breaks to local
switch breaks. Every case, conditional fallthrough, callback, predicate and
protected construct stays in place. No client control-flag value is assumed.

The method falls from 562 to 560 body lines and nine to eight labels. The source
change is confined to one method in one file. One obsolete label rule retires;
four surviving label ordinals migrate explicitly. All other 18,398 complete
naming objects remain intact. There are 18,402 rules and 19,448 dictionary
identities, with 117,447 identifier edits, 11 literal edits and 676 label edits:
118,134 edits total. All 136,470 ordinary bindings and 388 overrides are retained.

From java-tools,
`JAVA_TOOL_OPTIONS=-XX:-UsePerfData NODE_PATH=/home/kreijstal/git/java-tools/node_modules node --test test/cfrLateSwitchFrames.test.js`
passes three focused groups, including 66,528 independent native comparisons
across four completion contexts. The fixture exercises the actual emitter
pipeline, tests work/protection boundaries and retained declaration scopes,
and covers negative/zero/positive flags, callback failures, overflow, return
snapshots, finally overrides and nullable monitors.
The regression command
`JAVA_TOOL_OPTIONS=-XX:-UsePerfData NODE_PATH=/home/kreijstal/git/java-tools/node_modules node --test test/cfrLateSwitchFrames.test.js test/terminalControlCleanup.test.js test/naturalLoopExitRecovery.test.js test/booleanLocalAssignmentRecovery.test.js test/scalarIfDispatchRecovery.test.js test/predicateGroupingRecovery.test.js test/predicateNegationRecovery.test.js test/javaAstEmitterLoopExits.test.js test/javaAstEmitterTrailingLoops.test.js test/cfrBranchMergeRegressions.test.js`
passes 166 tests with one existing optional corpus skip.

From Deko,
`JAVA_TOOL_OPTIONS=-XX:-UsePerfData NODE_PATH=/home/kreijstal/git/java-tools/node_modules node readable/tests/test-geoblox-guarded-abrupt-source.mjs ../java-tools`
verifies exact expected bytes/tokens for all 303 raw files. Independent javac
certificates prove all five nearest-switch destinations and the transparent
continuation to the old frame. The full 5,091 transfer records preserve their
protected scopes and retain their destinations except for those five certified
retargets. All ordinary and surviving label bindings, the label retirement,
four ordinal migrations, complete rules, overrides and compilation are checked.

All 303 readable files reverse byte exactly. The 27 publication tests, all 17
scoped gameplay/result-helper native trace groups and current/fresh sibling
reproduction checks pass. Six large labeled bodies and 41 unsupported opaque
fields remain. Whole game/renderer/assets/server/browser/phone,
heap/presented-FPS acceptance and catalog-wide effects remain unverified.
Earlier proofs, frozen inputs, naming dependency and native pins are unchanged.

The tracked **decompiler-source** Git tar SHA-256 is
`d84e6bc8f57ec3c46a8fc88ca992fa3333e41abf57cf7a7bfbfde58a9abb15a1`.

## Previous natural loop exits (pass 190)

The generic decompiler now removes a continue at the end of its own loop body,
where normal completion already takes the same update/header. When an inner
loop is the outer body's final statement, a proven outer continue becomes a
local inner break. Headers, updates, callbacks and complete exception/finally/
monitor groups stay in place. Intervening statements, protected wrappers or
switch/loop destinations refuse this rule. No control-flag value is assumed.

For example, the music constructor now finishes a packed track locally:

```java
if (eventCodeOrControllerCursor == 7) {
  trackIndexOrDeltaStart++;
  break;
}
```

The inner loop is the outer track loop's final statement, so this break reaches
the same next track iteration as the former labeled continue. Across 83 methods
in 50 files, 114 redundant terminal continues disappear and 36 outer continues
become local breaks. The pass retires 42 loop labels and removes 114 corpus lines.
`MusicScore.<init>` falls from 517 to 515 lines with no labels; the Bzip2 block
decoder falls from 376 to 373 lines with no labels. Board reconciliation falls
from 328 to 321 lines and seven to six labels. Six large labeled bodies remain,
down from eight; session update has 562 lines and the half-blend triangle 360.

Nine surviving label ordinals migrate explicitly. All other 18,394 complete
naming rule objects remain intact; the 42 retired label rules leave 18,403 rules
and 19,449 dictionary identities. The export records 117,447 ordinary identifier
edits, 11 class-name literal edits and 682 label edits: 118,140 edits total.
It compares 136,470 ordinary bindings and preserves 388 override relationships.

From java-tools,
`JAVA_TOOL_OPTIONS=-XX:-UsePerfData NODE_PATH=/home/kreijstal/git/java-tools/node_modules node --test test/naturalLoopExitRecovery.test.js`
passes six focused groups, including 20,160 independent native cases across
eight loop models. They cover effectful headers/updates, overflow, negative/
zero/positive flags, partial failures, finally overrides and monitor release.
The regression command
`JAVA_TOOL_OPTIONS=-XX:-UsePerfData NODE_PATH=/home/kreijstal/git/java-tools/node_modules node --test test/naturalLoopExitRecovery.test.js test/booleanLocalAssignmentRecovery.test.js test/scalarIfDispatchRecovery.test.js test/predicateGroupingRecovery.test.js test/predicateNegationRecovery.test.js test/javaAstEmitterLoopExits.test.js test/javaAstEmitterTrailingLoops.test.js test/cfrBranchMergeRegressions.test.js`
passes 147 tests with one existing optional corpus skip.

From Deko,
`JAVA_TOOL_OPTIONS=-XX:-UsePerfData NODE_PATH=/home/kreijstal/git/java-tools/node_modules node readable/tests/test-geoblox-guarded-abrupt-source.mjs ../java-tools`
checks exact expected bytes/tokens for all 303 raw files. Independent javac
certificates prove all 150 selected continues and any already-consumed terminal
suffix, the 42 label retirements, nine ordinal migrations and all 5,091 surviving
transfer destinations and protected scopes. All ordinary bindings, surviving
lexical label records and overrides remain exact; both complete corpora compile.
The proof maps untouched literal Unicode escapes back to raw javac offsets;
escapes affecting grammar or reconstructed bodies remain unsupported.

All 303 readable files reverse byte exactly. The 27 publication tests, all 17
scoped gameplay/result-helper native trace groups and current/fresh sibling
reproduction checks pass. Forty-one unsupported opaque fields remain, along
with the six large labeled bodies. Whole game/renderer/assets/server/browser/
phone, heap/presented-FPS acceptance and catalog-wide effects remain unverified.
Earlier reviewed proofs, frozen inputs and native/naming pins remain unchanged.

The tracked **decompiler-source** Git tar SHA-256 is
`8e194dd1b49d674ba09b4f8001737b663543ecace605caceab0cbe8197baa47e`.

## Previous Boolean local assignment recovery (pass 189)

Thirty-four opposite Boolean-literal branch pairs now assign the condition's
value or its logical negation directly to the same primitive local. The generic
decompiler evaluates and unboxes the original condition once, retaining all
short-circuit order, callbacks, partial local writes, declaration scopes and
exception/finally/monitor behavior. Effectful field/array destinations and
boxed or ambiguous locals refuse this rule. No control-flag value is assumed.

For example, a gameplay toggle becomes:

```java
toggledRotationControlsSwapped = !(this.rotationControlsSwapped);
```

The subsequent field assignment and feedback call remain in place. All six
such gameplay toggles are clearer; `GameplaySession.updateSession` falls from
587 to 563 body lines. Across 24 methods in 20 files, 68 branch blocks and 136
corpus lines disappear. All 18,445 complete naming rules and 19,491 dictionary
identities remain unchanged. The export has 118,227 edits and compares 136,470
bindings.

From java-tools,
`JAVA_TOOL_OPTIONS=-XX:-UsePerfData NODE_PATH=/home/kreijstal/git/java-tools/node_modules node --test test/booleanLocalAssignmentRecovery.test.js`
passes six focused groups, including 124,416 independent native cases across
six control/completion contexts. The regression command
`JAVA_TOOL_OPTIONS=-XX:-UsePerfData NODE_PATH=/home/kreijstal/git/java-tools/node_modules node --test test/booleanLocalAssignmentRecovery.test.js test/scalarIfDispatchRecovery.test.js test/predicateGroupingRecovery.test.js test/predicateNegationRecovery.test.js test/javaAstEmitterLoopExits.test.js test/javaAstEmitterTrailingLoops.test.js test/cfrBranchMergeRegressions.test.js`
passes 141 tests with one existing optional corpus skip.

From Deko,
`JAVA_TOOL_OPTIONS=-XX:-UsePerfData NODE_PATH=/home/kreijstal/git/java-tools/node_modules node readable/tests/test-geoblox-guarded-abrupt-source.mjs ../java-tools`
checks exact expected bytes/tokens for all 303 raw files. Independent JDK
attribution proves each pair writes opposite literals to the same primitive
Boolean local and verifies its exact JVM identity. All retained per-occurrence
bindings, 5,205 original transfer targets/protected scopes, 388 overrides and
769 lexical label records survive. Both complete corpora compile.

All 303 readable files reverse byte exactly. The 27 publication tests, existing
scoped gameplay/result-helper native traces and current/fresh sibling
reproduction checks pass. Eight large labeled bodies and 41 unsupported opaque
fields remain. Whole game/renderer/assets/server/browser/phone,
heap/presented-FPS acceptance and catalog-wide effects remain unverified.
Earlier reviewed proofs, frozen inputs and native/naming pins remain unchanged.

The tracked **decompiler-source** Git tar SHA-256 is
`c1f607dda4e58dbba0889ebd50c9cbf42647b6bc9b6ed1dda87790b023bf8871`.

## Previous encoder switch recovery (pass 188)

The two text encoders now express all 27 special character cases in one switch
per method. The generic decompiler joins 11 terminating equality arms into each
existing 16-case switch. The original switch body, fallback, action order,
label targets and protected scopes remain intact. Its selector is a captured
primitive int local; no control-flag value is assumed.

| Method | Body lines before → after | Comparisons removed |
| --- | ---: | ---: |
| `DisplayNamePanel.encodeTextSlice` | 149 → 138 | 11 |
| `MultiHandleSliderRenderer.encodeTextBytes` | 145 → 134 | 11 |

This removes 22 repeated comparisons, 22 declaration-free outer arm blocks and
22 corpus lines. All 18,445 complete naming rules and 19,491 dictionary identities
remain unchanged. The export has 118,257 edits and compares 136,504 bindings.

From java-tools,
`JAVA_TOOL_OPTIONS=-XX:-UsePerfData NODE_PATH=/home/kreijstal/git/java-tools/node_modules node --test test/scalarIfDispatchRecovery.test.js`
passes 16 focused groups. Six new independent native models check 13,824 cases,
including overflow, nullable guards/monitors, declaration scopes and
break/continue/return/exception/finally completion. The existing 119,325 scalar
dispatch cases also pass. The regression command
`JAVA_TOOL_OPTIONS=-XX:-UsePerfData NODE_PATH=/home/kreijstal/git/java-tools/node_modules node --test test/scalarIfDispatchRecovery.test.js test/predicateGroupingRecovery.test.js test/predicateNegationRecovery.test.js test/javaAstEmitterLoopExits.test.js test/javaAstEmitterTrailingLoops.test.js test/cfrBranchMergeRegressions.test.js`
passes 135 tests with one existing optional corpus skip.

From Deko,
`JAVA_TOOL_OPTIONS=-XX:-UsePerfData NODE_PATH=/home/kreijstal/git/java-tools/node_modules node readable/tests/test-geoblox-guarded-abrupt-source.mjs ../java-tools`
proves the exact expected bytes and tokens for all 303 raw files. Independent JDK
attribution checks all 22 removed comparisons and the moved switch selector
bindings. All 5,205 original transfer targets and protected scopes, 388 overrides
and 769 lexical label records survive. Both encoders match the JDK charset
oracle for 393,216 UTF-16-unit cases under negative, zero and positive control
flags, including slice padding.

All 303 readable files reverse byte exactly. The 27 publication tests, existing
scoped gameplay/result-helper native traces and current/fresh sibling
reproduction checks pass. Eight large labeled bodies and 41 unsupported opaque
fields remain. Whole game/renderer/assets/server/browser/phone,
heap/presented-FPS acceptance and catalog-wide effects remain unverified.
Earlier reviewed proofs, frozen inputs and native/naming pins remain unchanged.

The tracked **decompiler-source** Git tar SHA-256 is
`1ad9bbf4a13ec874a49344bfae65af930733c38c4acb6b4594026e89a8817e24`.

## Previous nested dispatch recovery (pass 187)

Three nested integer ladders are now explicit ordered switches. The generic
recovery keeps the complete preceding code outside each new switch, including
earlier switches, selector calculations/writes and protected constructs. It
classifies only a unique primitive int local that stays unmodified throughout
the chosen suffix. All effectful actions, flag guards and existing transfers
retain their original order. No control-flag value is assumed.

| Method | Comparisons replaced | Result |
| --- | ---: | --- |
| `GameplaySession.updateSession` | 5 | Positive-rotation dispatch with its original guarded fallthrough |
| `DisplayNamePanel.encodeTextSlice` | 16 | Explicit character-encoding cases and fallback |
| `MultiHandleSliderRenderer.encodeTextBytes` | 16 | Explicit character-encoding cases and fallback |

The raw corpus is 27 lines shorter. Gameplay update is 587 lines; its remaining
labels still express the original control-flow flag paths. Repeated classifier
reads fall by 34, while every action, ordinary declaration, label and override
survives. All 18,445 complete naming rules and 19,491 dictionary identities remain
unchanged. The readable export has 118,279 edits and compares 136,526 bindings.

From java-tools,
`JAVA_TOOL_OPTIONS=-XX:-UsePerfData NODE_PATH=/home/kreijstal/git/java-tools/node_modules node --test test/scalarIfDispatchRecovery.test.js`
passes ten focused groups. Six new independent native models check 99,144 cases
through opaque prefixes, signed overflow, nullable guards/monitors and
break/continue/return/exception/finally completion. The existing 20,181 scalar
dispatch cases also pass. The regression command
`JAVA_TOOL_OPTIONS=-XX:-UsePerfData NODE_PATH=/home/kreijstal/git/java-tools/node_modules node --test test/scalarIfDispatchRecovery.test.js test/predicateGroupingRecovery.test.js test/predicateNegationRecovery.test.js test/javaAstEmitterLoopExits.test.js test/javaAstEmitterTrailingLoops.test.js test/cfrBranchMergeRegressions.test.js`
passes 129 tests with one existing optional corpus skip.

From Deko,
`JAVA_TOOL_OPTIONS=-XX:-UsePerfData NODE_PATH=/home/kreijstal/git/java-tools/node_modules node readable/tests/test-geoblox-guarded-abrupt-source.mjs ../java-tools`
proves the exact expected source bytes/tokens for all 303 raw files. Independent
JDK attribution checks all 37 local/literal classifiers and proves no selected
local is written inside its suffix. Every original transfer destination and
enclosing try/catch/finally/monitor scope survives; one new bare switch exit is
accounted for. Both complete corpora compile and retain all 388 overrides and
769 lexical label records. The actual changed encoders also match the JDK
charset oracle for 393,216 UTF-16-unit cases, with slice padding and negative,
zero and positive control flags preserved.

All 303 readable files reverse byte exactly. All 27 publication tests, existing
scoped gameplay/result-helper native traces, and current/fresh sibling
reproduction checks pass. Eight large labeled bodies and 41 unsupported opaque
fields remain. Whole game/renderer/assets/server/browser/phone,
heap/presented-FPS acceptance and catalog-wide effects remain unverified.
Earlier reviewed proofs, frozen inputs and native/naming pins remain unchanged.

The tracked **decompiler-source** Git tar SHA-256 is
`2a0e6bff0eb83796d474716e426d9cdcf840592e6e2991c62948ead7348ccb57`.

## Previous predicate grouping (pass 186)

The generic decompiler removes 2,009 redundant parentheses pairs from 874
control conditions in 387 methods across 162 files. Logical precedence is
visible without deeply nested grouping. For example,

```java
if (((((settled()) && (!processed))) || (!(preserve))) && (canAdvance()))
```

becomes

```java
if ((settled() && !processed || !preserve) && canAdvance())
```

The outer OR group remains necessary under AND. Right-associated expressions,
arithmetic operands, casts, boxed comparisons and call arguments retain their
grouping. Every operator, operand, statement and callback stays in its original
order and association. Unsupported syntax, comments, Unicode translation and
nested executables refuse the transformation. No GeoBlox names or assumed
control-flag values enter the generic implementation.

From java-tools,
`JAVA_TOOL_OPTIONS=-XX:-UsePerfData NODE_PATH=/home/kreijstal/git/java-tools/node_modules node --test test/predicateGroupingRecovery.test.js`
passes seven focused groups, including six independent native control/event
models matching 466,560 cases. These cover short-circuit effects, nullable
unboxing, boxed reference identity, signed overflow, floating NaNs, loops,
injected failures and finally/monitor completion. The selected regression command
`JAVA_TOOL_OPTIONS=-XX:-UsePerfData NODE_PATH=/home/kreijstal/git/java-tools/node_modules node --test test/predicateGroupingRecovery.test.js test/predicateNegationRecovery.test.js test/javaAstEmitterLoopExits.test.js test/javaAstEmitterTrailingLoops.test.js test/cfrBranchMergeRegressions.test.js`
passes 119 tests, with one existing optional corpus skip.

From Deko,
`JAVA_TOOL_OPTIONS=-XX:-UsePerfData NODE_PATH=/home/kreijstal/git/java-tools/node_modules node readable/tests/test-geoblox-guarded-abrupt-source.mjs ../java-tools`
proves the exact expected character/token edits and source bytes for all 303 raw
files. Independent JDK trees compare each complete compilation unit with only
parenthesis nodes omitted; operator association and every other node remain
unchanged. All 5,204 lexical transfers, their destinations and enclosing
try/catch/finally/monitor scopes survive, alongside every ordinary/label binding
and all 388 overrides. Both complete corpora compile.

All eight remaining large labeled bodies have clearer conditions:

| Method | Conditions simplified | Parentheses pairs removed |
| --- | ---: | ---: |
| `GameScreen.renderScreen` | 11 | 34 |
| `GameScreen.updateScreen` | 13 | 33 |
| `GameplaySession.renderSession` | 9 | 23 |
| `GameplaySession.updateSession` | 18 | 50 |
| `BoardReconciliationSupport.reconcileBoardEntities` | 11 | 19 |
| `MusicScore.<init>` | 2 | 7 |
| `Bzip2Decoder.decodeBlocks` | 4 | 7 |
| `SpriteState.drawSortedHalfBlendRgbTriangle` | 6 | 13 |

All 18,445 complete naming rules and 19,491 dictionary identities survive.
The export retains 118,313 edits and reverses all 303 files byte exactly. All
27 publication tests and existing scoped gameplay/result-helper traces pass;
current and fresh sibling checkouts reproduce the same export. Body and corpus
line counts remain unchanged. Eight large labeled bodies and 41 unsupported
opaque fields still need work. Whole game/renderer/assets/server/browser/phone,
heap/presented-FPS acceptance and catalog-wide effects remain unverified.
Frozen inputs, naming/native evidence and earlier reviewed proofs stay pinned.

The tracked **decompiler-source** Git tar SHA-256 is
`4a7b03592eeaf71ddf2b0735b3806c28726a560c9edf853ea496e77c2a57c458`.

## Previous declared-field predicates (pass 185)

The generic decompiler now uses current-class field descriptors to clarify
22 negated integral comparisons in eleven methods across seven files. For
example, `!(this.pointsPanelX < 640)` becomes `this.pointsPanelX >= 640`
with the existing grouping retained. Menu selection, points-panel movement,
cache/list bounds and audio-ramp predicates now state their comparison directly.
Every operand, field/array read, increment and callback stays in its original
order. No value or purity assumption is made. Unknown, arbitrary-receiver,
inherited, unqualified and boxed/floating fields retain their old comparisons;
class-qualified access requires unshadowed fields across every superclass and
interface. Unknown ancestors and field/member-type/local/formal shadowing refuse. Generated nested
executable helpers receive no outer-class field evidence.

From java-tools,
`JAVA_TOOL_OPTIONS=-XX:-UsePerfData NODE_PATH=/home/kreijstal/git/java-tools/node_modules node --test test/predicateNegationRecovery.test.js`
passes all fifteen focused groups, including six new groups and nine
independent native models matching 52,502 cases. These check signed overflow,
volatile reads/writes, callback ordering, array/null/bounds failures, nullable
unboxing, class-qualifier shadowing by fields/inherited member types, floating NaNs and protected/monitor completion. The selected regression
command
`JAVA_TOOL_OPTIONS=-XX:-UsePerfData NODE_PATH=/home/kreijstal/git/java-tools/node_modules node --test test/predicateNegationRecovery.test.js test/javaAstEmitterLoopExits.test.js test/javaAstEmitterTrailingLoops.test.js test/cfrBranchMergeRegressions.test.js`
passes 112 tests, with one existing optional corpus skip.

From Deko,
`JAVA_TOOL_OPTIONS=-XX:-UsePerfData NODE_PATH=/home/kreijstal/git/java-tools/node_modules node readable/tests/test-geoblox-guarded-abrupt-source.mjs ../java-tools`
proves exact expected operator edits and bytes/tokens for all 303 raw sources.
Independent JDK attribution resolves the enclosing class's declarations and both
operands of all 22 comparisons. It also compares all 5,204 lexical transfers,
their destinations and enclosing try/catch/finally/monitor scopes, every retained
ordinary/label occurrence and all 388 overrides. Both complete corpora compile.
All 18,445 complete naming rules and 19,491 dictionary identities survive;
19,253 declarations, 117,307 references, 238 label declarations and 769 lexical
label records remain. No label or local ordinal migrates. The readable export
retains 118,313 edits, reverses all 303 files byte exactly and reproduces from
both current and fresh sibling checkouts. All 27 publication tests and the
existing scoped gameplay/result-helper trace checks pass.

| Method | Comparisons clarified |
| --- | ---: |
| `GameScreen.renderScreen` | 4 |
| `GameScreen.handleMenuKey` | 2 |
| `GameScreen.activateMenuItem` | 2 |
| `GameplaySession.updateSession` | 2 |
| `GameplaySession.requestSessionExitScreen` | 2 |
| `WeightedObjectCache.putWeighted` | 1 |
| `MidiPcmStream.computeNoteSampleStep` | 1 |
| `PcmSampleStream.finishOrContinueVolumeRamp` | 3 |
| `GrowableIntList.get` | 2 |
| `GrowableIntList.set` | 2 |
| `HotspotTextWidget.setHotspotHoverText` | 1 |

The corpus and body line counts stay unchanged. Eight large labeled bodies and
41 unsupported opaque fields remain. Whole renderer/game/assets/server/browser/
phone and heap/presented-FPS acceptance, and catalog-wide effects, remain
unverified. Original/transformed input trees, frozen naming/native evidence and
all earlier reviewed proof objects stay pinned.

The tracked **decompiler-source** Git tar SHA-256 is
`fba5c41afb5e3487c5bccc6550849a56a6865d017fdad16d54d46152299811d0`.

## Previous loop finishing tails (pass 184)

Six one-time finishing tails now follow their repeatable loops. The original
final bare break moves before the finishing work; every other own transfer must
remain a continue in the prefix. No guard, callback or action is duplicated or
reevaluated. Earlier own breaks refuse recovery because they would skip the old
tail. Direct prefix declarations refuse; tail declarations and scalar/case
parents retain explicit scopes. Try/catch/finally/monitor constructs stay whole.

Seven new generic groups include eight independent native completion/event
models matching 69,120 cases: callbacks and nullable guards, partial effects,
signed overflow, return/finally overrides, monitor ownership, declaration
shadowing and refusal of early breaks. From java-tools,
`JAVA_TOOL_OPTIONS=-XX:-UsePerfData NODE_PATH=/home/kreijstal/git/java-tools/node_modules node --test test/terminalControlCleanup.test.js test/javaAstEmitterLoopExits.test.js test/javaAstEmitterTrailingLoops.test.js test/cfrBranchMergeRegressions.test.js`
passes 113 tests with one existing optional corpus skip. The focused command
`JAVA_TOOL_OPTIONS=-XX:-UsePerfData NODE_PATH=/home/kreijstal/git/java-tools/node_modules node --test test/javaAstEmitterTrailingLoops.test.js`
passes all 30 groups.

From Deko,
`JAVA_TOOL_OPTIONS=-XX:-UsePerfData NODE_PATH=/home/kreijstal/git/java-tools/node_modules node readable/tests/test-geoblox-guarded-abrupt-source.mjs ../java-tools`
proves exact expected bytes/tokens for all 303 raw files. Independent JDK trees
check each selected boundary and declaration scope, all 5,204 bare/named
break/continue/return/throw targets and enclosing exception/monitor identities.
The complete ordinary/label binding, override and compilation checks pass.
All 18,445 complete naming rules, 19,253 ordinary declarations, 117,307
references, 388 overrides, 238 label declarations and 769 lexical label records
survive. No declaration retires or ordinal migrates. The dictionary retains
19,491 identities and 118,313 edits; all 303 files reverse byte exactly.
All 27 publication tests and the existing scoped gameplay/result-helper native,
raw and readable trace checks pass. Whole renderer/game/assets/server/browser/
phone and heap/presented-FPS acceptance remain unverified.

The change places 83 lines of finishing code one loop level outward, including
47 lines of Vorbis transform/window finishing work. Method and corpus line
counts stay unchanged. The selected methods and line counts are independently
resolved against compiler JVM identities and the naming manifest:

| Method | Finishing lines moved |
| --- | ---: |
| `SynthesizedSoundInstrument.synthesize` | 12 |
| `GameplaySession.renderSession` | 1 |
| `AudioOutput.mixBlock` | 12 |
| `Bzip2Decoder.emitBlockRuns` | 7 |
| `MusicDecoder.decodePacket` | 47 |
| `SpriteState.writeCachedRandomSeedBytes` | 4 |

Eight large labeled bodies and 41 unsupported opaque fields remain. Source
inputs and frozen naming/native evidence stay pinned; catalog-wide effects
remain unverified.

The tracked **decompiler-source** Git tar SHA-256 is
`8b88237589e77f755bb086d86ad39a27f94375d914853819816be2a6868c4dcb`.

## Previous redundant exit guards (pass 183)

The generic decompiler removes 14 effect-free guards whose outcomes reach the
same lexical exit: two in screen update and twelve in session update. It proves
primitive local/parameter operands and identical transfer kind, spelling and
destination. Captured declarations and initializers stay intact; no flag is
assumed zero. Case ordering/fallthrough, actions and protected completion stay
in place. Calls, fields, arrays, casts, unboxing, mutation and division/remainder
refuse cleanup, as do unknown or shadowed operands.

Seven new focused groups include ten independent native completion/event
models matching 192,000 cases: callbacks and failures, mutable/overflowing
locals, negative/nonzero flags, NaNs/signed zero, finally overrides, monitor
ownership and retained division/unboxing failures. From java-tools,
`JAVA_TOOL_OPTIONS=-XX:-UsePerfData NODE_PATH=/home/kreijstal/git/java-tools/node_modules node --test test/terminalControlCleanup.test.js test/javaAstEmitterLoopExits.test.js test/javaAstEmitterTrailingLoops.test.js test/cfrBranchMergeRegressions.test.js`
passes 106 tests with one existing optional corpus skip. The diagnostic-only
follow-up passes all 16 groups with
`JAVA_TOOL_OPTIONS=-XX:-UsePerfData NODE_PATH=/home/kreijstal/git/java-tools/node_modules node --test test/terminalControlCleanup.test.js`.

From Deko,
`JAVA_TOOL_OPTIONS=-XX:-UsePerfData NODE_PATH=/home/kreijstal/git/java-tools/node_modules node readable/tests/test-geoblox-guarded-abrupt-source.mjs ../java-tools`
checks all 303 raw files against exact original character deletions. Independent
JDK attribution proves every removed primitive read and identical exit targets;
both corpora compile. All 19,253 ordinary declarations, 388 overrides, 238 label
declarations and 769 lexical label records survive. Exactly 14 pure reference
occurrences disappear; every surviving per-occurrence binding/position remains.
All 18,445 complete naming rules stay byte-equivalent as objects: no renames,
retirements or ordinal migrations. The dictionary retains 19,491 identities,
117,533 identifier, eleven literal and 769 label edits: 118,313 total. Raw/readable
comparison checks 136,560 ordinary bindings. All 303 files reverse byte exactly;
all 27 publication tests and scoped gameplay/result-helper trace checks pass.

Screen update is 312 lines/four labels, down from 318/four. Session update is
588 lines/nine labels, down from 624/nine. The complete raw tree loses 42 lines.
Eight large labeled bodies and 41 unsupported opaque fields remain. Whole game,
renderer/assets/server/browser/phone and heap/presented-FPS acceptance remain
unverified; catalog-wide effects remain unverified.

The tracked **decompiler-source** Git tar SHA-256 is
`43cea09a37a0b45081df835a143b29114b2b055615f6109e93d106078ad962b2`.

| Method | Body lines | Labels |
| --- | ---: | ---: |
| `GameScreen.renderScreen` | 304 | 4 |
| `GameScreen.updateScreen` | 312 | 4 |
| `GameplaySession.renderSession` | 335 | 7 |
| `GameplaySession.updateSession` | 588 | 9 |
| `BoardReconciliationSupport.reconcileBoardEntities` | 328 | 7 |
| `MusicScore.<init>` | 517 | 2 |
| `Bzip2Decoder.decodeBlocks` | 376 | 5 |
| `SpriteState.drawSortedHalfBlendRgbTriangle` | 362 | 7 |

## Previous terminal switch frames (pass 182)

The generic decompiler localizes 29 labeled breaks to their nearest switch in
the screen and gameplay-session update methods. Each switch is terminal on
the transparent continuation to its plain frame, so both exits reach the same
place. Four declaration-free wrappers disappear. Guards, case ordering and
fallthrough, callbacks, statements and protected completion remain unchanged.
Work, loops or protected constructs between the two destinations refuse the
rewrite; protection inside and around the switch stays intact.

Five new generic groups include six independent native event/completion models
matching 49,920 cases. They cover negative/zero/nonzero flags, switch fallthrough,
signed overflow, injected failures, partial effects, pending return/failure
overrides in finally and monitor ownership. From java-tools,
`JAVA_TOOL_OPTIONS=-XX:-UsePerfData NODE_PATH=/home/kreijstal/git/java-tools/node_modules node --test test/terminalControlCleanup.test.js test/javaAstEmitterLoopExits.test.js test/javaAstEmitterTrailingLoops.test.js test/cfrBranchMergeRegressions.test.js`
passes 99 tests, with one existing optional corpus check skipped.

From Deko, `JAVA_TOOL_OPTIONS=-XX:-UsePerfData NODE_PATH=/home/kreijstal/git/java-tools/node_modules node readable/tests/test-geoblox-guarded-abrupt-source.mjs ../java-tools`
passes the independent JDK destination/scope and complete 303-source expected
byte/token proof. Both raw/readable corpora compile, preserving all 19,253
ordinary declarations, 117,321 references, 388 overrides and every surviving
per-occurrence binding/label destination. Four label rules retire and five
ordinals explicitly migrate; all 18,440 unaffected complete rules stay exact.

There are 18,445 rules, 238 named labels and 769 lexical label records. The
dictionary retains all 19,491 surviving identities and 117,547 identifier,
eleven literal and 769 label edits: 118,327 total. All 303 files reverse byte
exactly. All 27 publication tests pass; scoped gameplay/result-helper native,
raw and readable trace hashes remain unchanged. No game body is hand edited.

Screen update is 318 lines/four labels, down from 320/five. Session update is
624 lines/nine labels, down from 630/twelve. Eight large labeled bodies and
41 unsupported opaque fields remain; all labels and single-letter methods
are named. Whole game/renderer/assets/server/browser/phone and heap/presented-FPS
acceptance remain unverified. Catalog-wide effects remain unverified.

The current JDK-verified inventory is:

| Body | Lines | Labels |
| --- | ---: | ---: |
| `GameScreen.renderScreen` | 304 | 4 |
| `GameScreen.updateScreen` | 318 | 4 |
| `GameplaySession.renderSession` | 335 | 7 |
| `GameplaySession.updateSession` | 624 | 9 |
| `BoardReconciliationSupport.reconcileBoardEntities` | 328 | 7 |
| `MusicScore.<init>` | 517 | 2 |
| `Bzip2Decoder.decodeBlocks` | 376 | 5 |
| `SpriteState.drawSortedHalfBlendRgbTriangle` | 362 | 7 |

The tracked **decompiler-source** Git tar SHA-256 is
`762aae42f52f28bbc9b52c93591d89b3b18dce408f6ec2b33ed786bc8b1b97af`.

## Previous final control-frame cleanup (pass 181)

The generic decompiler now finishes control-frame cleanup after loop and
predicate recovery. Those later passes can expose breaks whose destinations
are also reached by normal completion. Four such breaks disappear across
four bodies in three files. Three unused labels retire, two continues keep
their nearest loop without a label, and one declaration-free rendering frame
unwraps. No GeoBlox-specific class/name checks are added to java-tools.

The independent JDK proof checks every removed break's completion path without
crossing loops, switches, try/catch/finally or monitor boundaries. It resolves
both localized continues and verifies the unwrapped frame's declarations.
All 303 exact raw source bytes/token streams are reproduced from the tracked
decompiler archive. Both corpora compile; every surviving per-occurrence binding,
label destination and override follows its original source position.

There are 18,449 guarded rules: three obsolete label rules retire and nine
surviving label ordinals explicitly migrate. All 18,440 unaffected complete
rules remain exact. There are 19,253 ordinary declarations, 117,321 references,
388 override pairs, 242 named labels and 802 lexical label records. The export
records 117,547 identifier, eleven literal and 802 label edits: 118,360 total.
All 19,495 surviving dictionary identities retain their names; all 303 files
reverse byte exactly to the new raw input.

`JAVA_TOOL_OPTIONS=-XX:-UsePerfData NODE_PATH=/home/kreijstal/git/java-tools/node_modules node --test test/terminalControlCleanup.test.js test/javaAstEmitterLoopExits.test.js test/javaAstEmitterTrailingLoops.test.js test/cfrBranchMergeRegressions.test.js`
passes 94 generic tests, with one existing optional corpus check skipped.
From Deko, `JAVA_TOOL_OPTIONS=-XX:-UsePerfData NODE_PATH=/home/kreijstal/git/java-tools/node_modules node readable/tests/test-geoblox-guarded-abrupt-source.mjs ../java-tools`
passes the complete JDK/source/rule migration proof. All 27 publication tests
pass; scoped gameplay and result-helper native/raw/readable traces remain exact.
The four new focused groups add no native runtime cases.

Rendering is now 335 lines/seven labels; board reconciliation is 328 lines/
seven labels. Eight large labeled bodies and 41 unsupported opaque fields
remain. All labels and single-letter methods are named. Whole game/renderer/
assets/server/browser/phone and heap/presented-FPS acceptance remain unverified.

Pass181's JDK-verified inventory was:

| Body | Lines | Labels |
| --- | ---: | ---: |
| `GameScreen.renderScreen` | 304 | 4 |
| `GameScreen.updateScreen` | 320 | 5 |
| `GameplaySession.renderSession` | 335 | 7 |
| `GameplaySession.updateSession` | 630 | 12 |
| `BoardReconciliationSupport.reconcileBoardEntities` | 328 | 7 |
| `MusicScore.<init>` | 517 | 2 |
| `Bzip2Decoder.decodeBlocks` | 376 | 5 |
| `SpriteState.drawSortedHalfBlendRgbTriangle` | 362 | 7 |

The tracked **decompiler-source** Git tar SHA-256 is
`47259c4ff5afa476d4b6f5bfe605de2ef2471c2492477be4daa54d2e8c1710db`.

## Previous gameplay and protocol field naming (pass 180)

Sixteen formerly opaque fields now describe their verified roles. They include
`fiveMatchChainAchievementId`, `sixMatchChainAchievementId`,
`specialMatchAchievementId`, `fiveKindFourRemovalsAchievementId`,
`loginMembershipGateValue`, `awaitingUsernameSuggestionsStage`,
`lockBootstrapLoginPanelActions`, `highUpdateRateModeActive` and the
fullscreen focus-loss/timeout reason identities. The membership value is an
unsigned 16-bit login value used as a positive membership gate; this name does
not assume days or expiry semantics. The update-rate flag selects the original
150/50 update scheduling requests, without claiming a rendering frame rate.

Five optional mesh short-array streams have names indicating their decoded wire
order. Their lengths use 16 bits, their payloads retain the original signed-base/
variable-width delta decoding, and the discarded section value stays discarded.
The source supplies no consumer proving UV, texture or other attribute semantics.
The stored, unconsumed `kg.C(` diagnostic prefix is also named and preserved.

The compiler-backed naming driver makes exactly 77 additional identifier edits:
16 declarations and 61 references across 20 files. An independent whole-corpus
comparison matches those field replacements and every other source character.
All 18,436 previous complete rules remain unchanged; there are 18,452 rules.
All 303 raw/readable sources compile, comparing 136,574 ordinary bindings,
388 override pairs and 811 lexical label records. All 245 labels remain named.
The output has 117,547 identifier, eleven literal and 811 label edits: 118,369 total.
Raw input, decompiler/naming/workflow/stub/native pins, guards, numeric IDs/rates,
conditions, statements, diagnostics and operation order remain unchanged.
Deterministic reproduction and dictionary reversal are byte exact.

`JAVA_TOOL_OPTIONS=-XX:-UsePerfData node --test readable/tests/test-geoblox-rule-builder.mjs readable/tests/test-geoblox-migration-source.mjs readable/tests/test-geoblox-text-rules.mjs`
passes all 27 publication tests. Existing scoped gameplay and nine-slice/UI/mesh
probes also retain their native/raw/readable trace hashes. Their existing scopes
are unchanged; this naming pass adds no native runtime cases or fixtures.

Eight large labeled bodies and 41 opaque fields remain. The fields comprise
six public GameApplet fields with no source references and 35 private
VisualPropertyOverrides fields used only for default initialization and merge
retention. Their source does not establish more specific UI meanings.
Whole game/renderer/server/browser/phone and heap/presented-FPS acceptance
remain unverified; the large bodies still need structural recovery.

## Previous helper-label naming (pass 179)

All 73 remaining opaque labels now describe their original lexical scope:
37 plain blocks and 36 loops across 34 files. Names include
`contactConversionQueue`, `cascadeNeighborTraversal`,
`archiveResponseRequestLookup`, `taskDequeueWait`,
`existingSectorHeaderValidation` and the sprite/font row scans.
All 245 labels are named, including all 811 declarations and break/continue
records. These names describe existing scopes; they do not invent states or
assume the client control flag is zero.

The frozen compiler-backed naming driver performs 228 additional label edits:
73 declarations and 155 transfers. An independent whole-corpus comparison
matches exactly those label replacements and no other source characters.
All 18,363 previous complete naming rules survive unchanged; there are now
18,436 rules. The raw input, tracked decompiler source archive, naming tool,
workflow, stubs, diagnostic literals and native evidence stay fixed.
Both 303-file corpora compile, comparing 136,574 ordinary bindings,
388 override pairs and 811 lexical label records. The readable output has
117,470 identifier, eleven literal and 811 label edits: 118,292 total.
Reproduction and dictionary reversal are byte exact.

`JAVA_TOOL_OPTIONS=-XX:-UsePerfData node --test readable/tests/test-geoblox-rule-builder.mjs readable/tests/test-geoblox-migration-source.mjs readable/tests/test-geoblox-text-rules.mjs`
passes all 27 publication tests. No native fixture changes, runtime cases or
probes are added or claimed by this label-only naming pass.

Eight large labeled bodies and 57 opaque fields remain. Naming every exit
does not finish structural recovery. Whole game, renderer, server, browser,
phone and heap/presented-FPS acceptance remain unverified.

## Previous dominated predicate cleanup (pass 178)

Inside a branch that tests a stable local snapshot, repeated neutral comparisons
are now omitted. For example, inside `if (flag == 0)`,
`if (alreadyVisited && flag == 0)` becomes `if (alreadyVisited)`.
The generic rule also understands short-circuit and while/for-entry facts.
It never assumes that the global client flag or an initializer is zero.
Fields, boxed/floating values, shadowing and later/cyclic writes remain opaque.
Every unknown operand stays exactly once and in order; absorbing expressions
and wholly known conditions remain for separate completion-aware work.

Eight comparisons disappear from eight conditions in four bodies across three
files: UiWidget state handling, MeshDepthSupport face queuing (including its
int-argument bridge), and BoardReconciliationSupport's component search.
Reconciliation's large body falls from 331 to 329 lines; the raw corpus falls
from 76,187 to 76,179 lines. No statement, declaration, scope, label, transfer,
callback, snapshot, diagnostic or bytecode is moved or removed. All 18,363 full
naming rules and every declaration/label ordinal remain exact.

The JDK independently verifies the exact local binding, primitive int type,
control-path fact and absence of later/cyclic writes for all eight deleted
reads. The complete source-character audit matches all 303 expected files,
19,253 ordinary declarations, 117,321 surviving references, 388 override pairs,
245 labels and 811 label records. Both corpora compile, comparing 136,574
bindings; the readable export has 117,470 identifier, eleven literal and 583
label edits: 118,064 total. Reproduction and dictionary reversal are byte exact.

`JAVA_TOOL_OPTIONS=-XX:-UsePerfData NODE_PATH=/home/kreijstal/git/java-tools/node_modules node --test test/dominatedPredicateRecovery.test.js test/javaAstEmitterPathGuards.test.js test/javaAstEmitterPathGuardSwitches.test.js test/javaAstEmitterPostGuardExits.test.js test/cfrBranchMergeRegressions.test.js test/predicateNegationRecovery.test.js`
passes 27 tests. Five new focused groups include 262,500 independent native
ordered-oracle cases across ten variants, including nonzero/min/max flags,
nullable/noncached Booleans, reference identity, NaN/signed zeros/infinities,
callbacks mutating a volatile global while the local snapshot stays stable,
throwing callbacks, loops, abrupt exits, finally overrides and monitors.
Earlier Boolean/integral predicate oracles also pass. All 27 publication tests
pass; scoped gameplay/result-helper trace pins remain exact.

Pass178’s independently verified inventory was:

| Body | Lines | Labels |
| --- | ---: | ---: |
| `GameScreen.renderScreen` | 304 | 4 |
| `GameScreen.updateScreen` | 320 | 5 |
| `GameplaySession.renderSession` | 338 | 8 |
| `GameplaySession.updateSession` | 630 | 12 |
| `BoardReconciliationSupport.reconcileBoardEntities` | 329 | 8 |
| `MusicScore.<init>` | 517 | 2 |
| `Bzip2Decoder.decodeBlocks` | 376 | 5 |
| `SpriteState.drawSortedHalfBlendRgbTriangle` | 362 | 7 |

Eight large labeled bodies, 73 opaque labels and 57 opaque fields remain.
The remaining bodies still need structural work. Whole renderer/game/server/
browser/phone and heap/presented-FPS acceptance remain unverified.

## Previous integral predicate cleanup (pass 177)

The generic decompiler can now turn `!(row < limit)` into `row >= limit`
when both operands are proven primitive integers. Scoped unique declarations,
actual method parameter types, casts, integer/character literals, integral
arithmetic and known array access/length supply that proof. Unknown fields,
call results and boxed values stay opaque; mixed floating comparisons keep
their negation and NaN behavior. Every operand remains byte exact, preserving
reads, writes, overflow, exceptions and short-circuit order.

This simplifies 56 comparisons in 32 bodies across 25 files, including board
reconciliation, sprite/raster helpers, fonts, archives and client utilities.
No game-specific names or states are hardcoded. An independent JDK attribution
checks both primitive operand types of every changed relational operator.
The source-character and compiler-binding audit verifies all 303 expected raw
files, 19,253 ordinary declarations, 117,329 references, 388 override pairs,
245 labels and 811 label records. All 18,363 complete naming rules survive.
The committed source archive reproduces all sources and unchanged diagnostics;
the readable export and dictionary reversal are byte exact.

`JAVA_TOOL_OPTIONS=-XX:-UsePerfData NODE_PATH=/home/kreijstal/git/java-tools/node_modules node --test test/predicateNegationRecovery.test.js test/cfrBranchMergeRegressions.test.js test/javaAstEmitterLoopExits.test.js test/javaAstEmitterTrailingLoops.test.js test/scalarIfDispatchRecovery.test.js`
passes 105 tests with one existing optional skip. Nine focused groups include
708,750 Boolean-context and 453,600 integral native ordered-oracle cases. They
cover int overflow/division, long shifts, NaN/infinity casts, array null/bounds
failures, narrowing casts, throwing callbacks, finally overrides and monitors.
All 27 publication tests pass; scoped gameplay/result-helper trace pins remain.

Eight large labeled bodies, 73 opaque labels and 57 opaque fields remain.
This pass clarifies predicates; it does not finish their structural recovery.
Whole-game/server/browser/phone and heap/presented-FPS acceptance are unverified.

## Previous Boolean predicate cleanup (pass 176)

A generic java-tools pass now simplifies conditions introduced by control-flow
recovery. For example, !((5 != screenId) && (7 != screenId)) becomes
((5 == screenId) || (7 == screenId)), preserving operand and short-circuit order.
It cancels double negation, complements equality tests and applies De Morgan to
Boolean control conditions. Unknown relational tests keep their logical
negation, including NaN outcomes. Call arguments, boxed-Boolean identity
operands and noncondition values remain opaque. Statements, scopes, labels,
protected groups, monitors and every client-control path stay in place.

This cleans 268 predicates in 167 bodies across 103 files: 56 double negations,
255 equality complements and 132 De Morgan operators. Menu/session rendering,
update and helpers, reconciliation, sprite/raster/text, archive/audio and client
helpers benefit from the same language-level rule. No game names or states are
hardcoded. All 18,363 previous complete naming rules and declaration/label
ordinals remain exact. No callback, read/unused snapshot, diagnostic, reference,
arithmetic operation, source line or bytecode is removed or reordered.

The committed decompiler-source archive reproduces all 303 raw files and
unchanged zero-failure/fallback/panic diagnostics. An independent operator-edit
and source-character audit verifies every expected byte, all 19,253 ordinary
declarations, 117,329 references, 388 overrides, 245 labels and 811 label records.
Both 303-source corpora compile; the readable export keeps 117,478 identifier,
eleven literal and 583 label edits: 118,072 total. Reproduction and dictionary
reversal remain byte exact. Six focused groups match 708,750 independent native
ordered-oracle cases for primitive/boxed/reference values, NaN/signed zeros/
infinities, overflow, nullable/throwing callbacks, finally overrides and monitors.
The 96 existing branch/loop/switch groups pass with one existing optional skip;
all 27 publication tests pass. Existing gameplay/result-helper probes retain
native/raw/readable trace pins and scoped oracle results.

Eight large labeled bodies, 73 opaque labels elsewhere, 57 opaque fields and
zero single-letter methods remain. This improves predicates without claiming
complete large-body reconstruction. Whole renderer/game/assets/server/browser/
phone and heap/presented-FPS acceptance remain unverified.

## Previous menu and session exit names (pass 175)

All labels in GameScreen and GameplaySession now have meaningful names. This
pass adds 59 guarded lexical names: 56 plain exit regions and three loops.
Menu helpers expose key/action dispatch, volume slider handling, hit tests,
button geometry, highscore status, tutorial diagrams and slide selection.
Session helpers expose tutorial prompt placement/buttons, score and popup text,
score-context counters, scene-transition preparation, preceding-theme lookup,
theme achievement entry points, result sprite scanning, result phase selection
and exit-screen routing. Examples include tutorialPromptPlacement,
menuActionDispatch, endingSpriteColumnScan and sessionExitScreenSelection.
Achievement-entry names describe the destination after a labeled break; they
do not assert exclusive execution when the client-control flag is nonzero.

Exactly 59 definitions and 175 break/continue references change spelling in
two Java files. Every other Java byte remains unchanged, including all guards,
snapshots, partial effects, callbacks, overflow/floating order, exception scopes,
nonzero-control fallthrough and diagnostics. All 18,304 previous complete rules
remain exact. Raw source, decompiler, naming/workflow sources, bytecode, stubs
and native evidence pins remain unchanged. This pass changes no state-machine
structure and adds/runs no native runtime probes.

The export has 18,363 rules, 117,478 identifier edits, eleven class-name literal
edits and 583 label edits: 118,072 total. Both 303-source corpora compile and
compare 136,582 bindings, 388 overrides, 245 label declarations and 811 label
records. All 27 publication tests pass; reproduction and dictionary reversal
recover every raw file byte exactly. Eight large labeled bodies, 73 opaque
labels elsewhere (37 plain/36 loop), 57 opaque fields and zero single-letter
methods remain. Whole-game/assets/server/browser/phone and heap/presented-FPS
acceptance remain unverified.

## Previous captured-integer switches (pass 174)

Four deeply nested integer classifiers now read as switches: the menu's
inputDerivedStateUpdate and gameplay's negativeRotationAndStateUpdate,
negativeRotationAchievementTracking and positiveRotationTrackingUpdate.
Their selector calculations remain before dispatch. Case actions appear once,
in their original order; control-flag guards and unusual nonzero-flag fallthrough
remain explicit. Cases are deliberately not sorted numerically: changing their
order would change the original shared continuation. Negative/unmatched values
keep their original default exits. No screen/session phase or server meaning is
inferred from these tracking-counter branches.

The generic java-tools pass requires a unique captured primitive integer that
is not written during dispatch. It partitions all integers by their mentioned
constants and an exhaustive Other class, then proves that each selected path
is a contiguous action run or exits the existing plain frame. It refuses shared
work that would need duplication, mutable/boxed/unknown classifiers, declarations,
inner control frames, ambiguous transfers and oversized trees. Complete protected
and monitor actions remain whole. There are no GeoBlox class/name branches.

The committed decompiler source reproduces all 303 raw files and unchanged
zero-failure/fallback/panic diagnostics. Exactly the two update bodies change;
GameScreen.updateScreen is 320 lines and GameplaySession.updateSession remains
630. Twenty-nine pure comparisons become four selector reads; their 25 redundant
primitive reads are the only removed reference occurrences. All selector writes,
read/unused snapshots, other actions, callbacks, arithmetic, flag reads, exception
scopes and transfer targets remain. The independent token-origin proof verifies
19,253 declarations, 117,329 remaining references, 388 overrides, 245 labels and
811 label records, with no declaration/label ordinal migration.

All 18,304 previous complete naming rules remain exact. The readable export has
117,478 identifier edits, eleven class-name literal edits and 349 label edits;
both 303-file corpora compile, reproduce and reverse byte exactly. Six focused
groups and four existing scalar-dispatch groups pass. Eight native fixtures
match 20,181 independent cases covering every flag class, case/default selection,
integer extremes/overflow, nullable and throwing callbacks, return snapshots,
finally overrides, monitors and ancestor transfers. Loop/emitter regressions
retain 89 passes and one existing optional skip. All 27 publication tests pass;
existing gameplay/result-helper probes retain their native/raw/readable trace
pins within their documented scopes.

Among 2,080 method/constructor bodies, twenty have at least 300 lines; eight
contain labels and six contain plain block labels. Eight large labeled bodies,
132 opaque labels and 57 opaque fields remain; no single-letter methods remain.
Full screen/session update, renderer, audio playback, game/server/browser/phone
and heap/presented-FPS acceptance remain unverified.

## Previous terminal early-exit loops (pass 173)

Ten loops across nine methods in eight classes now use explicit `do…while`
conditions: menu keyboard processing, gameplay debug queue drawing, applet
frame catch-up, ranked-index and spawn-queue traversal, MIDI note mixing,
MIDI frame skipping and PCM sample mixing/skipping. Early-exit effects remain
inside the loop and still skip the repeat test. Normal completion evaluates
that test exactly once. Nonzero control flags retain their original exit;
no flag value, callback order, return snapshot or arithmetic is assumed away.

The generic reconstruction lives in java-tools and applies to supported control-
flow patterns in arbitrary Java. Complete try/catch/finally, monitor, switch,
label and local scopes stay intact. Earlier own continues refuse this trailing
rewrite because they skipped the old test. Own breaks also remain refused for
nonterminal continuations, which would otherwise run after an early exit.
The ordinary cleanup path repeats terminal recovery after making else exits
explicit; this is necessary for the menu and debug-drawing loops.

The tracked decompiler source reproduces all 303 raw files and unchanged zero-
failure/fallback/panic diagnostics. Exactly eight files and nine bodies change,
removing 40 lines (76,230 to 76,190). The independent source proof verifies
complete token streams and every reference destination: 19,253 declarations,
117,354 references, 388 overrides, 245 label definitions and 811 label records.
All 18,304 previous complete naming rules and declaration ordinals remain exact.
The export still has 117,503 identifier, eleven literal and 349 label edits.
Both 303-file corpora compile, reproduce and reverse byte exactly.

The generic suites pass 89 tests with one existing optional skip. Three new
focused groups include seven native variants and 8,064 independent event cases,
covering nullable/effectful tests, short-circuit order, early exits, exceptions,
finally overrides, monitor release, nested destinations and return snapshots.
All 27 publication tests pass. The existing gameplay and result-helper probes
also match their retained native/raw/readable trace pins; their scope exclusions
remain. No whole renderer, audio playback, server, browser or device run is added.

`GameScreen.updateScreen` is now 323 lines and `GameplaySession.renderSession`
338. Among 2,080 method/constructor bodies, twenty have at least 300 lines;
eight contain labels and six contain plain block labels. Those eight large
labeled bodies, 132 opaque labels and 57 opaque fields remain; there are no
single-letter methods. This pass improves control flow without
establishing complete semantic readability or whole-game/browser/phone and
heap/presented-FPS acceptance.

## Previous startup, archives, audio and mesh naming (pass 172)

Pass 172 adds 413 guarded names: two fields, all 30 remaining single-letter
methods, 106 parameters and 275 locals. Four older alignment rules are explicitly
corrected: the only fixed-corpus caller supplies a payload BYTE COUNT for XTEA,
not a bit offset. The helper, value and locals now describe rounding to a
multiple of eight. Its guard, return89, signed arithmetic and overflow remain.
All 17,887 unaffected previous complete rules remain exact; full before/after
objects for the four corrections are recorded in the manifest.

Startup names expose loading/logo/account/prepared-frame selection, redraw-flag
consumption, AWT progress drawing and pointer-listener removal. Progress image
and font caches, partial image-fill return, direct draw/repaint fallbacks,
unclamped percentages, recursive wrong-guard path and original catch boundaries
remain. The applet username helper inspects/encodes its parameter without storing
a login identity. Keyboard-idle and canvas-container helpers retain their guard
effects. Account login/creation wrappers, logging-in dialog and button appending
retain field writes, construction/callback order, the diagnostic-only message
argument and unused guard-helper argument.

Cookie writing, marker creation, page-link updates and reload/server-list/support/
relative-URL navigation expose their original attempted actions. Cookiehost,
Discard/Expires/Max-Age arithmetic, raw script text, URL session overrides,
window targets, late guard work, printed failures and Throwable catches remain.
Neither the marker flag nor these names guarantee browser/storage success.

Common UI loading exposes sprite/font/GIF groups and palette-state preparation.
The first two screen-options frame sets follow the existing third-frame name
without guessing their actions. Indexed-sprite copying retains shared palette
and index arrays, allocation before its guard and partial dimensions. Button
splitting keeps aliases, grayscale work and successful-tail raster restoration.
The game archive factory flag explicitly selects discarding decoded files after
read for policy1; it does not claim retention. RGB sprite loading and gray-tinted
strip drawing retain short circuits, guard writes, shared clip storage, reused
X parameter, zero-center-width behavior and non-finally clip restoration.

Audio setup and delayed playback retain output/rate/volume arguments, stream
tracking before early return, mixer/root/volume ordering and partial state.
Packed short/mesh decoding keeps exact-length reuse, null sentinel, signed base,
delta widths, optional-section reads and unclassified array meanings, priority
nulling/narrowing and guards. Encrypted payload writing retains SecureRandom key
generation, buffer/key aliases, byte padding, XTEA/modPow order, optional early
return and partial destination appends. Fullscreen construction and display-mode
waiting retain parameters, focus/bounds order, task polling and original sleeps.
No timeout, renderer/audio policy, encryption or runtime behavior is repaired.

The export has 18,304 rules, 117,503 identifier edits, eleven class-name literal
edits and 349 label edits: 117,863 total. Raw/decompiler/naming/workflow/stub/
native/text and label pins remain unchanged. Both 303-file corpora compile,
reproduce and reverse byte exactly, preserving 19,498 dictionary identities,
136,607 bindings, 388 overrides, 245 label definitions and 811 label records.
All 27 publication tests pass. No native probes or new runtime cases are added
or run by this naming pass.

No single-letter methods remain in the current compiler dictionary. Eight large
labeled bodies, 132 opaque labels (93 plain blocks and 39 loops) and 57 opaque
fields remain. Zero single-letter methods does not establish complete semantic
readability. Full startup/login/crypto/cookies/UI/network/input/audio/assets/game/
server/browser/phone and heap/presented-FPS acceptance remain unverified.

## Previous shared validation, cookie, encoding and rendering naming (pass 171)

Pass 171 adds 429 guarded names: two fields, 38 methods, 82 parameters,
302 locals and five lexical labels. Email helpers expose syntax/local-part
validation, completed-query replacement and username-suggestion publication.
The first-at-sign split and explicit domain offset, quoted escape/dot checks,
64-character limit, original failure identities, null behavior, pending-query
reuse, wrong-guard recursion and partial callback effects remain. Account-name
validation keeps display-name checks before its optional character scan.
Password/name comparisons keep underscore removal, UTF16 reversal and existing
case/empty-text behavior. Login identifier fallback and active password/lookup
selection retain their original identity tests and ordering.

Base-37 helpers now expose encoding, display decoding and canonicalization.
Alphabet/range thresholds, trailing-zero removal, capitalization, nonbreaking
spaces, invalid-value results and late guard arithmetic remain. Integer helpers
expose signed decimal parsing, radix/sign/digit/overflow validation and the
original packed bit-count algorithm, including its minimum-two negative path.
Literal replacement keeps its original search-resumption and empty-target
behavior. Error printing retains its guard division, System.out target and
literal percent-zero-a replacement.

Packet helpers expose one-bit booleans, byte-equals-one replies, CRC/FIFO
acknowledgement emission and opcode/payload diagnostic formatting. The
byte-equals-one reader has no inferred compression meaning. Cipher writes,
reserved/backpatched lengths, CRC readback distance, buffer aliases, queue
iteration without unlinking, partial writes and guard side effects remain.
Cookie/settings readers keep raw values, semicolon/equals splitting, trimming,
first-match selection, script/catch boundaries and cached/parameter fallbacks.
They do not add decoding or guarantee browser/script success.

The achievement details renderer exposes masks, hover/selection, grid layout,
description spacing, displayed orb points and repeated coin-icon counts.
These arrays are named by display consumers without assigning server reward
semantics. Dotted focus rectangles, menu initialization, terms-link markup,
account background/dialog rendering, fullscreen/reconnect checks and UI polling
are named. Original palette/clip/guard effects and unused wheel/render arguments
remain. Heap-capacity estimation still reflects Runtime.maxMemory, retains its
cast/rounding/catches and does not alter a heap limit.

The cached random-seed writer retains the absent-file zero buffer, all-zero-file
failure, minus-one fallback bytes, exact comparison operands and partial fill.
Its nonzero client-control catch continuation can skip the payload write; all
three plain seed blocks and their breaks preserve those destinations. Neither
that flag nor any other client-control value is assumed zero. No runtime RNG or
determinism policy changes.

All 17,462 previous complete rules and raw/decompiler/naming/workflow/stub/
native/text pins remain exact. The export has 17,891 rules, 115,962 identifier
edits, eleven class-name literal edits and 349 label edits: 116,322 total.
Both 303-file corpora compile, reproduce and reverse byte exactly, preserving
19,498 dictionary identities, 136,607 bindings, 388 overrides, 245 label
definitions and 811 label records. All 27 publication tests pass. No native
probes or new runtime cases are added or run by this naming pass.

Eight large labeled bodies, 132 opaque labels (93 plain blocks and 39 loops),
59 opaque fields and 30 single-letter methods remain. Full validation/login/
bootstrap/cookies/UI/network/input/audio/assets/game/server/browser/phone and
heap/presented-FPS acceptance remain unverified.

## Previous bootstrap, tooltip and shared cleanup naming (pass 170)

Pass 170 adds 339 guarded names: 36 fields, 95 methods, 112 parameters,
95 locals and one lexical label. Seventy-three cleanup methods now describe
their release of retained static references. Guarded partial clears, duplicated
clears, recursive invalid calls, unrelated writes, arithmetic exceptions and
diagnostic strings retain their original order. The names do not promise full
cleanup or disposal for every argument.

Bootstrap names distinguish initial sprite/font/button-and-logo archives from
their retained graphics/font aliases and the game-text archive. Load helpers
retain sprite/commonui, font/commonui and button.gif ordering, retention flags,
short circuits and partial effects. Cache-index file aliases and shutdown
consumers are explicit. The game-text loader preserves every original read,
discarded string, fallback/null check and successful-tail root-archive clear.
Its type-nine clear and conditional client-control increment remain; the
corresponding flag toggle is not assumed absent.

Login names expose the server seed and four cipher-seed words, including the
original add-50 mutation between outgoing and incoming cipher initialization.
The accepted response long and its successful-login error-report copy are
named by their wire/consumer roles, without assigning account-ID/token meaning.
Retry flag, guest mode, reconnect-message state, cookie-marker flag, singleton
login method names and pending navigation are explicit. The cookie flag is set
before script execution and does not prove storage succeeded.

Tooltip text, anchors, suppression and reset age expose the existing delay/
duration logic. Its null/equality joins, overflowing duration addition, pointer
snapshots and guarded calls remain. One age-adjustment block and its two breaks
retain their exact targets. Shared UI names expose theme aliases, viewport and
pointer origins, progress color, frame-bottom sprites and horizontal strip
tiling. The tiler retains zero-width behavior, parameter reuse and its existing
non-finally clip restoration. Connected-session checks, fullscreen frame work,
reflection queue/replies, account panels and audio servicing are named without
adding safety checks. RNG names retain the original signed rejection threshold,
unsigned multiply, adjusted remainder and wrong-guard results; no runtime
randomness or determinism policy changes.

The ten previously named unused fields were reviewed across the complete
fixed-source corpus. Their references remain within initialization, cleanup,
storage or capacity checks; no hidden element or execution consumer was found.
These claims retain their precise scopes, rather than asserting no reads.

All 17,123 previous complete rules and raw/decompiler/naming/workflow/stub/
native/text pins remain. The export has 17,462 rules, 114,334 identifier edits,
eleven class-name literal edits and 338 label edits: 114,683 total. Both 303-file
corpora compile, reproduce and reverse byte exactly, preserving 19,498 dictionary
identities, 136,607 bindings, 388 overrides, 245 label definitions and 811 records.
All 27 publication tests pass. No native probes or new runtime cases are added
or run by this naming pass.

Eight large labeled bodies, 137 opaque labels, 61 opaque fields and 68
single-letter methods remain. Full bootstrap/login/tooltip/UI/network/input/
audio/assets/game/server/browser/phone and heap/presented-FPS acceptance remain
unverified.

## Previous intro, ranked-list and input naming (pass 169)

Pass 169 adds 213 guarded names: 31 fields, 27 methods, 44 parameters,
101 locals and ten lexical labels. The intro sequence now exposes its animation
tick, face-frame start tick, blue tint delta, second geometry sound flag,
update/draw helpers and tint/music preparation. Sound samples 25/26/7/8, key 13, 40-tick
frame changes, completion at 494, the squared fall displacement and original red
mask 16735942 remain. Mixed counters, floating operation order and nonzero
client-control paths are preserved.

Ranked-list helpers expose packed decoding, component arrays, the unused
response-index array, array preparation and entry insertion.
The previous `unusedGuardScratch` field rule is corrected to
`decodedRankedKeyTwo`: the fourth packed value is passed into the key-two array.
The old no-reads claim was incorrect. Guard writes -11/78/67 still remain.
Names follow numerator/second/third
component positions; their server-side interpretation is not inferred. Packed
reads, partial stores, numerator*1000/sum overflow, zero sums and mixed key-two/
ratio sort bounds remain. The packed byte reader keeps signed-byte bases,
three-bit delta widths, exact-length destination reuse and zero-length nulls.

All declarations in ScorePopup, KeyboardInputListener and MouseWheelInput now
have meaningful names. Shared helpers expose audio-output disposal, entity
queue/contact reset, created-account email login and account-result polling.
Cleanup still preserves guarded partial clears, recursion and arithmetic
failures. Display-name validation keeps normalized edge checks separate from
the original-text separator scan. Domain validation and character splitting
keep their original policy, empty segments, numeric-final-component marker,
failure identities and callback order. Login reply flags are named by bits
four/eight without assigning server meaning. Initial score/Vorbis archives,
common button sprites, session override, pumpkin/loading resource texts and
template type IDs zero/two/seven/nine/ten/twelve/fifteen are explicit.

Nine-slice loops/counter joins and entity contact resolution receive lexical
names. All ten original definitions and their eleven transfers retain their
targets; no state machine is reconstructed in this naming pass. All 16,909
other previous complete rules, raw source and decompiler/naming/workflow/stub/
native/text pins remain; one full field rule is explicitly corrected.
The export has 17,123 rules and 112,993 identifier edits,
eleven class-name literal edits and 335 label edits: 113,339 total. Both 303-file
corpora compile, reproduce and reverse byte exactly, preserving 19,498 dictionary
identities, 136,607 bindings, 388 overrides, 245 label definitions and 811 records.
All 27 publication tests pass. No native probes or new runtime cases are added
or run by this naming pass.

Eight large labeled bodies, 138 opaque labels, 97 opaque fields and 163
single-letter methods remain. Full intro/ranking/network/input/audio/assets/
game/server/browser/phone and heap/presented-FPS acceptance remain unverified.

## Previous display-name and shared gameplay naming (pass 168)

Pass 168 adds 144 guarded names: 36 fields, twelve methods, 33 parameters,
62 locals and one lexical label. DisplayNamePanel now exposes every remaining
opaque declaration: validated input layout, accepted-provider checks, confirm/
cancel callbacks, focus routing, suggestion snapshots and login submission.
The labeled row keeps its original dimensions and validation-message height35.
A missing provider still passes; other providers require the original valid
state. Wrong guards still clear buttons or write retry-deadline55. Partial
widget insertion, callback order, aliases and exception contexts remain.

Shared gameplay names expose the three-character fog/brk debug window, the
received debug-permission byte and the original score-context fields. Counter
names follow their four submission positions; their server-side meaning is
not inferred. Seeds4703/1385/275/5997, modulo dispatch, overflow, nonzero control
flags and packet layout remain. HUD names follow gameName, clearBonus, level,
score, fetchingHS and youAreNotLoggedIn resource keys. Menu action text slots,
post-decrement pointer debounce, fullscreen dialog/canvas state, active login/
display-name panels, applet dispatcher, mixers, payload CRC and login modulus
are explicit. The shared mixer reference is not assumed to be initialized.

The domain-label alphanumeric alphabet and achievement IDs one/two/fifteen are
named from their exact consumers. Ranked-sort upper-bound names preserve the
original mixed key/ratio assignments and MIN_VALUE reset. Guarded cleanup,
client-option reset and account-flow helpers keep recursion, partial clears,
wrong-guard calls and diagnostic strings. The encoder's per-character handled
label names its original definition and 28 breaks; byte mapping is unchanged.

All 16,766 previous complete rules, raw source and decompiler/naming/workflow/
stub/native/text pins remain. The export has 16,910 rules and 112,136 identifier
edits, eleven class-name literal edits and 314 label edits: 112,461 total.
Both 303-file corpora compile, reproduce and reverse byte exactly, preserving
19,498 dictionary identities, 136,607 bindings, 388 overrides, 245 label
definitions and 811 label records. All 27 publication tests pass.
This naming pass adds/runs no native probes or new runtime cases.

Eight large labeled bodies, 148 opaque labels, 128 opaque fields and 190
single-letter methods remain. Full display-name UI/network, live input/audio/
fullscreen/assets/game/server/browser/phone and heap/presented-FPS acceptance
remain unverified.

## Previous explicit loop exit guards (pass 167)

Pass 167 flattens twelve loop arms across ten methods in six classes:
GameScreen, GameApplet, GameplaySession, MeshDepthSupport,
BoardReconciliationSupport and HighscoreNameEntry. This includes gameplay
keyboard-event processing, board connectivity traversal and debug queue drawing.
An original `if (predicate) { mainPath } else { exitEffects }` followed by a
bare own-loop break becomes `if (!(predicate)) { exitEffects; break; }`, then
the original main path and original break, all inside the same loop. The main
path loses one nesting level; source lines and label counts stay unchanged.

Keeping exit effects in the loop preserves both exit reasons. A main path that
falls through still skips exit effects; an own continue still reevaluates the
predicate. In particular, a nonzero client-control flag is not assumed away.
Predicate bytes, return snapshots, callback/evaluation order, numeric behavior,
partial effects and original own/nonlocal transfer targets remain. Nested
scopes and complete try/catch/finally/monitor groups stay intact. Direct main-arm
declarations and exit arms with declarations/control/protected groups refuse
this reconstruction, as do unsupported syntax and ambiguous transfers.

The generic decompiler changes live in java-tools. Its tracked source archive
reproduces all 303 raw Java files and unchanged diagnostics: no hard failures,
fallbacks or panics. The Deko source proof independently reconstructs all token
streams, tags the exact arm permutation and verifies every ordinary reference
at its resulting location. It preserves 19,253 ordinary declarations, 117,354
reference occurrences, 388 overrides, 245 label definitions and 811 label
records, with no local/label ordinal migration. Unchanged files remain byte
identical. Six native variants match 5,184 independent event cases, including
nullable guards, nonzero flags, exceptions, finally overrides and monitor release.
The focused generic suite passes 20 groups; loop regressions pass 66 with one
existing optional skip.

All 16,766 complete naming rules and 111,674 edits remain: 111,378 identifier,
eleven class-name literal and 285 label edits. Both 303-file corpora compile,
and the dictionary reverses the readable export byte exactly. Eight large labeled
bodies, 149 opaque labels, 164 opaque fields and 202 single-letter methods remain.
The 27 publication tests pass. Existing gameplay and result-helper probes also
match their unchanged native/raw/readable traces, including the controlled board
reconciliation and 741 applet-loop cases. Their documented scope exclusions
remain; no complete gameplay renderer, URL execution or live device run is added.
Full game/server/assets/browser/phone and heap/presented-FPS acceptance remain
unverified.

## Previous downloader, query and password naming (pass 166)

Pass 166 adds 177 guarded names: twenty-five fields, fifteen methods,
thirty parameters and 107 locals. The remaining opaque declarations in
AsyncResourceDownloader, UsernameAvailabilityQuery, PasswordValidator,
DropTargetWidget and ArchiveCatalog are named. Original API methods `run` and
`finalize`, and the generic sneaky-throw helper/throwable parameter, retain their
existing meaningful names. Constructors follow their class rules.

Downloader names expose URL/dispatcher/buffer, URL-stream and JAGGRAB socket
tasks, reader thread and attempt stage. Stage zero selects URL loading, stage
one selects the original port-443 JAGGRAB request, stage two ends the attempts,
and stage three exposes the buffer. A short EOF sets stage three; exactly
filling the buffer throws the original `HG1` exception and advances the stage.
Zero-byte reads still repeat. Independent close attempts, swallowed failures,
monitor targets, thread-start statuses and duplicated setup continuations stay
as written. `getDownloadedBuffer` does not assert a valid country-list payload.

Query names expose accepted/under-thirteen flags, suggested usernames, response
code and candidate-or-failure text. The record also serves account-creation
results; the text can be a localized failure, and its original null/pending
checks remain. The shared reflection-check deque is named from its producers
and consumers. Password-packet normalization still processes at most twenty
UTF-16 units, lowercases ASCII capitals, retains lowercase/digits and replaces
other units with underscores. Its wrong guard still invokes the null-canvas
listener path after allocation.

PasswordValidator exposes its username/email input references, validation
message/state snapshots and the original last-@ local-part/domain substring
checks. Default-locale lowercasing, empty-input behavior, original check order,
wrong-guard reference clears and shared cleanup remain. The length helper uses
the current minimum/maximum fields (defaults five/twenty); the unrelated guard
write of maximum61 remains. This naming pass does not change password policy.

Canvas keyboard/mouse/focus/wheel attachment order and fullscreen detachment
are named without changing partial effects. Shared names expose game music
volume, tooltip delay/duration, duplicate applet-start count, replay tutorial
text and numeric template types four/eleven. Volume keeps its original integer
then floating scale, wrong-renderer write68 and recursive invalid-guard call;
there is no new clamping or recursion fix. Tooltip additive overflow, listener
exceptions, archive guards, aliases and all diagnostic strings remain.

The export has 16,766 rules and 111,378 identifier edits, plus eleven class-name
literal and 285 label edits: 111,674 total. All 16,589 previous complete rules,
19,498 dictionary identities, 136,607 bindings, 388 overrides and 811 label
records remain. Twenty-nine generated Java files change only in names. Both
303-file corpora compile, reproduce and reverse byte exactly. All raw/tool/
workflow/stub/class-literal/label-policy/native pins remain. All 27 publication
tests pass; this pass adds/runs no native probes or new runtime cases.

Eight large labeled bodies, 149 opaque labels, 164 opaque fields and 202
single-letter methods remain. Full downloader/network/reflection/input/volume/
account/password/game/server/assets/browser/phone behavior and
heap/presented-FPS acceptance remain unverified.

## Previous socket, proxy and theme achievement naming (pass 165)

Pass 165 adds 158 guarded names: sixteen fields, nine methods, fifteen
parameters, 117 locals and one lexical label. SocketConnector and
ProxySocketConnector now expose direct connection, system proxy selection,
SOCKS connection and HTTP CONNECT response handling. Both declarations of the
proxy-selection override use the same name. All remaining opaque fields,
single-letter methods, generated temporaries and labels in these classes and
ProxyAuthenticationRequiredException are named. The generic sneaky-throw helper
retains its original name and meaningful throwable parameter.

Source quirks remain: proxy lists are combined in their original order and
iteration begins at the caller-supplied index. URI syntax failure falls back to
a direct connection; IO failures are swallowed, authentication failures are
retained, and a retained authentication failure is rethrown after all candidates.
HTTP authentication reflection failures are swallowed. The CONNECT writer keeps
its original line endings, encoding, timeout, guard arithmetic and partial
resource cleanup. Status 200 returns the open socket; status 407 scans at most
fifty header lines and throws the existing scheme exception. This is readable
source, not a repaired or validated proxy implementation.

Shared names expose the instrument-patch archive, bootstrap login message,
discard-results warning, numeric template types eight/thirteen, ranked key-two
upper-bound seed and seven theme-completion achievement fields. Theme names
follow the existing dispatch and asset IDs; original alternate guard writes,
sun fallback and nonzero-control fallthrough remain. The ranked seed is not a
computed maximum: its MIN_VALUE reset and original comparison/write quirks
remain. Theme color sorting locals describe the selected channel values and
derived hue/lightness/saturation; original masks, ties, floating divisions,
shift expressions, aliases and insertion order remain.

The export has 16,589 rules and 110,717 identifier edits, plus eleven class-name
literal and 285 label edits: 111,013 total. All 16,431 previous complete rules,
19,498 dictionary identities, 136,607 bindings, 388 overrides and 811 label
records remain. Twenty-one generated Java files change only in names. Both
303-file corpora compile, reproduce and reverse byte exactly. The label-policy
count increases by two, with an explicit sourceChange for the existing response
label declaration and its single break. All raw/tool/workflow/stub/native pins
stay fixed. All 27 publication tests pass; no native probes or new runtime cases
are added or run in this pass.

Eight large labeled bodies, 149 opaque labels, 189 opaque fields and 217
single-letter methods remain. Whole-game, live proxy/network/server/assets,
browser/phone and heap/presented-FPS acceptance remain unverified.

A control-flow audit considered moving the else branch of
`while (true) { if (P) { A } else { B } break; }` after a guarded loop.
Using compiler method-body extents (the scanner in the existing guarded-abrupt
source fixture) and the pinned recovery module's lexical transfer/completion
analysis, it inspected 2,335 method/initializer bodies; two bodies were refused
by the existing cleanup parser. Twelve loops matched the shape, and zero passed
the no-normal-completion requirement for A. Every matching A can fall through
under the original control guards. Hoisting B would then run it after A, although
the original skipped it. No decompiler change was made.

Matches occur in BoardReconciliationSupport (three), GameApplet (one),
GameScreen (one), GameplaySession (four), HighscoreNameEntry (one) and
MeshDepthSupport (two). Several are inside the large remaining gameplay methods.
A future reconstruction must preserve the two distinct exit reasons and all
exception/finally/monitor scopes; treating the client control flag as zero is
not a valid recovery proof. The existing twelve loops remain unchanged.

## Previous hotspot, opacity and shared UI naming (pass 164)

Pass 164 adds 164 guarded names: five fields, nine methods, sixteen parameters
and 134 locals. All 142 HotspotTextWidget and 84 OpacityWidget declarations now
have readable names; constructors follow their class rules. Multiline hotspot
construction, pointer-relative hit testing, hover text, hover borders, focus and
button callbacks retain their exact order and boundaries. Shared helpers expose
identifier payload selection, pending login replies, session packet text,
1000-entity pool setup, indexed text substitution and event-queue polling/posting.

The two-pass <%digits> substitution retains its capacity calculation, original
scan progress, indexed replacement failures, wrong-guard null result and
discarded append-return snapshots. Queue polling still peeks/sleeps up to fifty
times before optionally posting the original dummy ActionEvent; post exceptions
are swallowed and outer runtime failures retain their wrappers. Entity-pool
setup still appends without clearing old entries and overwrites each ID slot.
Hotspot X ends are exclusive and Y ends inclusive; hit testing returns the
original segment head. All aliases, client-control/unused snapshots, arithmetic
and guard effects, exception scopes and diagnostic literals remain.

Shared fields identify synthesizedSoundArchive, encryptedPayloadKeyScratchBuffer,
throwOnInvalidArchiveIds, continueText and showLoginOnMessageDismiss. The last
flag also selects the generic retry message. VisualPropertyOverrides cleanup
and exception locals are named; its private default/copy slots retain their
original names because their rendering meanings are unsupported by the source.

The export has 16,431 rules and 110,064 identifier edits, plus eleven class-name
literal and 283 label edits: 110,358 total. All 16,267 previous complete rules,
19,498 dictionary identities, 136,607 bindings, 388 overrides and 811 label
records remain. Twenty generated Java files change only in names. Both 303-file
corpora compile, reproduce and reverse byte exactly. Raw source and all tool,
workflow, stub, class-literal, label-policy and native pins stay fixed. All 27
publication tests pass. This pass adds/runs no native probes or runtime cases
and makes no new performance claim.

Eight large labeled bodies, 150 opaque labels, 205 opaque fields and 226
single-letter methods remain. Live UI/font/archive loading, entity-pool setup,
login/crypto/event-queue/network behavior, full game/browser/phone and
heap/presented-FPS acceptance remain unverified.

## Previous Vorbis setup and residue naming (pass 163)

Pass 163 adds 75 guarded names: one method, three parameters, 69 locals and
two lexical labels. All 53 VorbisCodebook, 39 VorbisResidue and seven VorbisMapping
declarations now have readable names; constructors follow their class rules.
The seeded reverseLowBitsIntoAccumulator helper and all its parameters/locals
are named. Codebook construction exposes length runs, sparse entries, codeword
carry resolution, flattened Huffman nodes and lattice/dense vector expansion.
Residue names expose cascade masks, eight passes, classword decomposition,
partition groups and strided/contiguous vector writes.

Names follow source data flow; codebook/residue roles align with sections 3 and
8 of [Xiph's Vorbis I specification](https://xiph.org/vorbis/doc/Vorbis_I_spec.html).
This does not prove full codec compliance. The existing positive non1 lookup
branch, nonzero residue-type branch, discarded mapping fields, clear-before-silent
behavior, aliases, unused snapshots, shifts/overflow, floating evaluation and
partial writes remain. Reused locals retain their phase roles. The named block
and loop preserve three existing breaks and one continue. The bit helper keeps
its seed, mutated diagnostic arguments, caught aliases and original string literal.

The export has 16,267 rules and 109,443 identifier edits, plus eleven class-name
literal and 283 label edits: 109,737 total. All 16,192 previous complete rules,
19,498 dictionary identities, 136,607 bindings, 388 overrides and 811 label
records remain. Five generated Java files change only in names. Both 303-file
corpora compile, reproduce and reverse byte exactly. Label-edit accounting grows
by six; raw source and all tool, workflow, stub, class-literal and native pins
stay fixed. All 27 publication tests pass. This pass adds/runs no native probes
or runtime cases and makes no new performance claim.

Eight large labeled bodies, 150 opaque labels, 210 opaque fields and 235
single-letter methods remain. Live setup/archive/audio playback, malformed
input handling, full codec/game/browser/phone behavior and heap/presented-FPS
acceptance remain unverified.

## Previous music floor and decoder naming (pass 162)

Pass 162 adds 277 guarded names: 33 fields, fourteen methods, 29 parameters
and 201 locals. All 123 MusicDecodeStage and 195 MusicDecoder declarations now
have readable names; constructors follow the existing class rules. Floor setup,
neighbor prediction, residual reconstruction, paired point sorting and spectrum
multiplication are explicit. Decoder names expose codebooks, mode mappings,
short/long MDCT tables, window bounds, overlap buffers, loop metadata and PCM writes.

The floor/helper roles are inferred from matching source layouts and formulas
with [Xiph's Vorbis I specification](https://xiph.org/vorbis/doc/Vorbis_I_spec.html),
sections 7 and 9. This does not establish full codec compliance. The custom
packet container, validation omissions, shared floor scratch, first floor-line
write before end clamping, absent-floor path and all floating arithmetic remain.
Decoder cleanup still leaves setupLoaded unchanged. Budgeted decoding can still
exceed its remaining sample budget by the samples produced by one packet.
Reused locals retain every supported phase, including unused snapshots; buffer
swaps, aliases, partial effects, exception scopes and diagnostic literals stay intact.

The export has 16,192 rules and 109,015 identifier edits, plus eleven class-name
literal and 277 label edits: 109,303 total. All 15,915 previous complete rules,
19,498 dictionary identities, 136,607 bindings, 388 overrides and 811 label
records remain. Seven generated Java files change only in names. Both 303-file
corpora compile, reproduce and reverse byte exactly. Raw source and all tool,
workflow, stub, class-literal, label-policy and native pins stay fixed. All 27
publication tests pass. This pass adds/runs no native probes or runtime cases
and makes no new performance claim.

Eight large labeled bodies, 152 opaque labels, 210 opaque fields and 236
single-letter methods remain. Live setup/archive loading, music playback,
malformed-packet handling, full codec/game/browser/phone behavior and
heap/presented-FPS acceptance remain unverified.

## Previous account validator naming (pass 161)

Pass 161 adds 204 guarded names: twelve fields, fifteen methods, 33 parameters
and 144 locals. All 57 AgeValidator, 79 EmailValidator, 53 EmailAvailabilityValidator
and 103 UsernameAvailabilityValidator declarations now have readable names;
constructors follow class rules. Shared fields expose gameArchiveRequestPending,
reconnectingLoginMode, restartTutorialText, countryListDownloader, release-text
colors, email/username availability caches and optional error-report identity.
The private unusedCrc64Table retains its exact initialization and stores; no
element consumers or polynomial variant are inferred.

The validators preserve age1..130 checks, email syntax-helper results, matching
before email queries, candidate-cache write order and pending-query behavior.
Username cache invalidation clears only its text, retaining its availability
boolean. Pending email availability still selects valid-email message text;
this does not imply server acceptance. Reflection readiness checks only the
first queued request and treats failed lookup tasks as ready. Wrong guards,
nulls, partial cache effects and original exception contexts remain.

Shared helper names expose encrypted login writes and their guard-after-header
ordering, account-ineligibility marking, optional-login-text updates, proxy
connector construction, primitive/reflection class resolution, navigation action
requests and achievement-state gating. Original request flags, buffer writes,
RNG calls, cookie effects, callback order, renderer/input aliases, unused stores,
integer overflow, client-control flag values and diagnostic string literals stay
unchanged. Naming a navigation request or configured connector does not execute
browser navigation or open a socket.

The export has 15,915 rules and 107,323 identifier edits, plus eleven class-name
literal and 277 label edits: 107,611 total. All 15,711 previous complete rules,
19,498 dictionary identities, 136,607 bindings, 388 overrides and 811 label
records remain. Twenty-five generated Java files change only in names. Both
303-file corpora compile, reproduce and reverse byte exactly. Raw source and
all tool, workflow, stub, class-literal, label-policy and native pins stay fixed.
All 27 publication tests pass. No native probes, cases or performance results
are added or claimed by this naming pass.

Eight large labeled bodies, 152 opaque labels, 243 opaque fields and 250
single-letter methods remain. Live validation/query/cache interaction, cookie,
reflection/login/network/navigation behavior, server/assets/game/browser/phone
and heap/presented-FPS acceptance remain unverified.

## Previous login and suggestions naming (pass 160)

Pass 160 adds 237 guarded names: three fields, eleven methods, 39 parameters,
183 locals and one lexical block label. All 224 declarations owned by LoginPanel
and all eighty owned by UsernameSuggestionsPanel now have readable names;
constructors follow class rules. Credential updates, login gating, account/lookup
transport, reflection replies, focus/button callbacks and suggestion construction
retain their existing execution order and effects.

advanceAccountCreationOrLookupRequest distinguishes opcode18 account creation
from opcode16 lookup, including affiliate/age/news fields, conditional string
inclusion, encryption, length backpatches, incremental reads, suggestion and
boolean replies, settings cookies, timeout and alternating ports. Reused locals
retain flags, offsets, reply codes, read lengths and port roles. Reflection names
expose lookup readiness, field operations, deserialized arguments, invocation
results, twelve exception reply codes and the CRC span. The plain
intRecordReplyDispatch label preserves its original break destination.

Suggestion updates still clear children before checking the guard, retain the
old button array for null/empty suggestions, share one renderer and scan every
button without an early callback-loop exit. Constructor renderer aliases,
unused snapshots, duplicate clears, wrong guards, client-control flag values,
partial effects, integer overflow and diagnostic string literals remain.
Shared names distinguish namedRootResourceArchive, the account/lookup reply
opcode stage and alternateLongAndTextPayloadKind without inventing server state.

The export has 15,711 rules and 106,634 identifier edits, plus eleven class-name
literal and 277 label edits: 106,922 total. All 15,474 previous complete rules,
19,498 dictionary identities, 136,607 bindings, 388 overrides and 811 label
records remain. Thirteen generated Java files change only in names. Both
303-file corpora compile, reproduce and reverse byte exactly. Expected label
edits increase by two for the one declaration and its
existing break; raw source and all tool, workflow, stub, class-literal and native
pins stay fixed. All 27 publication tests pass. No native probes, cases or
performance results are added or claimed by this naming pass.

Eight large labeled bodies, 152 opaque labels, 255 opaque fields and 265
single-letter methods remain. Live credential entry, suggestion interaction,
reflection/lookup/account-creation network behavior, server/assets/game/browser/
phone and heap/presented-FPS acceptance remain unverified.

## Previous account creation form naming (pass 159)

Pass 159 adds 153 guarded names: two fields, twelve methods, 41 parameters
and 98 locals. All 187 declarations owned by AccountCreationForm now have
readable names; its constructor follows the class rule. Row builders expose
input, validation-message, validation-icon and hint layouts. Submission gates,
terms markup, dialog-layer rebuilding, keyboard focus, button/hotspot callbacks,
suggestions and shared cleanup retain their original guards and effects.

The constructor keeps shared email/confirmation and password/confirmation
renderer aliases. Row builders still add children before later guard failures.
The validation gate accepts a missing provider and every state other than the
three explicitly rejected states, including a null state; it does not imply
server acceptance. Login lookup still reads the active identifier twice and
filters only the discarded first result. The shared awaitingLoginLookupPayloadStage
follows actual packet consumers. unusedRankedEntryBooleans describes a ranked-entry
capacity buffer with no element consumers in the source; no element meaning is
invented. Client-control flag values, callback order, overflow, partial effects,
exception scopes and diagnostic string literals remain.

The export has 15,474 rules and 105,784 identifier edits, plus eleven class-name
literal and 275 label edits: 106,070 total. All 15,321 previous complete rules,
19,498 dictionary identities, 136,607 bindings, 388 overrides and 811 label
records remain. Six generated Java files change only in names. Raw source and
all tool, workflow, stub, label-policy and native-probe pins stay fixed. Both
303-file corpora compile, reproduce and reverse byte exactly. All 27 publication
tests pass. The existing raster/theme fixture retains its ten native/raw/readable
trace hashes for rasterization, shared-theme initialization and bootstrap
failures. It does not exercise account-form construction or interaction. No
native cases or performance results are added.

Eight large labeled bodies, 153 opaque labels, 258 opaque fields and 276
single-letter methods remain. Live account-form input, focus, submission and
login/network behavior, server/assets/game/browser/phone and heap/presented-FPS
acceptance remain unverified.

## Previous dialog frame and helper naming (pass 158)

Pass 158 adds 111 guarded names: four fields, twelve methods, 25 parameters
and seventy locals. All 57 FadingDialog, 130 ResizableDialog and sixty
ProgressDialog declarations now have readable names; constructors follow class
rules. The complete three-declaration drawDialogFrame override family exposes
rounded bands, corner/edge calculations, frame sprites and progress text.
Shared fields identify wrappedTooltipLines, interfaceTextArchive, tooltipAgeTicks
and usernameLoginMethod.

Helper names show password checks against username text and configured length
bounds, account-name error messages, achievement-grid clicking, millisecond PCM
delays, username-flow identity checks and resource cleanup. Progress locals show
highlight toggles, Q16 percentages, packet writes and failures. Reused frame
registers retain both roles, including leftCornerDistanceSquaredOrRightEdgeLimit
and leftCornerRgbOrRightCornerX. Original guard effects, integer overflow,
partial drawing/writes, aliases, callback order, exception scopes and diagnostic
string literals remain; no client-control flag value is assumed.

The export has 15,321 rules and 105,286 identifier edits, plus eleven class-name
literal and 275 label edits: 105,572 total. All 15,210 previous complete rules,
19,498 dictionary identities, 136,607 bindings, 388 overrides and 811 label
records remain. Nineteen generated Java files change only in their names. Raw
Java, decompiler/naming/workflow/stub pins, label policy and all existing native
probe files/hashes stay fixed. Both 303-file corpora compile, reproduce and
reverse byte exactly. Existing raster/theme and text decoder/archive-context
native/raw/readable traces retain their hashes; all 27 publication tests pass.
This pass adds no new runtime probe or performance result.

Eight large labeled bodies, 153 opaque labels, 260 opaque fields and 288
single-letter methods remain. Live dialog fade/resize/frame/font rendering,
login/achievement interactions, server/assets/game/browser/phone and
heap/presented-FPS acceptance remain unverified.

## Previous applet frame and lifecycle naming (pass 157)

Pass 157 adds 140 guarded names: nineteen fields, eight methods, seventeen
parameters, 87 locals and nine block labels. All eight remaining opaque
GameApplet methods now expose updateAppletTick, renderAppletFrame,
rebuildGameCanvas, startAppletServices, shutdownAppletServices, showGameError,
compactExceptionTrace and releaseMeshDepthBuckets. Every run-loop local and
block boundary is named. Shared fields identify the active/loader applets,
frame timer, update count, focus snapshot, two history rings and their indexes,
canvas offsets/refresh counter, initial clip dimensions and error-report CRC.

The source retains its original order: history writes precede focus copying and
callbacks; canvas refresh uses the old counter before increment/subtraction;
timing reset clears render history before update history and changes the tick
count last. Wrong guards, overflow, nonzero client flags, partial failures and
contextual exception fields remain. Real clock values are checked against bounds
and normalized in the trace; this is not a frame-pacing measurement.

The existing result-helper fixture adds 741 native/raw/readable cases: 180
updates, 324 renders, 225 timing resets, six cleanup guards and six focus
callbacks. They include 611 expected failures from injected callbacks, invalid
indexes/arrays/guards and the original nonzero-flag null-fullscreen path.
Independent state/event oracles check history/aliases, focus/monitor release,
refresh geometry and signed counter overflow, estimated rate arithmetic,
throwable identity and exact partial clears. All thirteen earlier trace hashes
remain unchanged. The 27 publication tests pass.

The export has 15,210 rules and 104,736 identifier edits, plus eleven class-name
literal and 275 label edits: 105,022 total. All 15,070 previous complete rules,
19,498 dictionary identities, 136,607 bindings, 388 overrides and 811 label
records remain. Twenty-four generated Java files change only in their names.
Both 303-file corpora compile, reproduce and reverse byte exactly. The expected
label-edit count increases by 25; raw Java, decompiler, naming/workflow/stub pins,
class-literal policy and label destinations stay fixed.

Eight large labeled bodies, 153 opaque labels, 264 opaque fields and 300
single-letter methods remain. Live AWT/fullscreen startup/shutdown/error pages,
whole run-loop timing, assets/server/game/browser/phone and heap/presented-FPS
acceptance remain unverified.

## Previous frame timer and ranking transport naming (pass 156)

Pass 156 adds 82 guarded names: eight fields, eleven methods, fifteen parameters
and 48 locals. All eighteen declarations owned by FrameTimer and all 72 owned by
NanoFrameTimer now have readable names; the constructor follows its class rule.
The applet caller exposes awaitAndCountTicks, measureSleepMillis, advanceTicks and
resetForResume. Clock fields separate the accumulated time, scheduled deadline,
previous sample and ten-slot interval ring. The original sample count starts at
one and grows only when below one; no new smoothing policy is introduced.

Unrelated helpers in the timer class now show flushSessionWrites and ranking
reply locals. The pendingHighscoreQueries deque and ranked ratio component array
have their actual transport roles. Ranking views distinguish limited first rows,
normalized current-session rows and unique name-table indexes. Alternate-name and
record-long arrays remain local stores. Packet cursor rewinds, flattened write
indexes, cleanup guards, ten-tick cap and signed overflow are preserved.

The existing result-helper fixture adds 6,802 native/raw/readable cases: 4,608
BigInteger-based tick/overflow cases, 1,536 resets, 219 sampler/constructor cases,
162 callback wrappers, 129 ranking/prefix cases, 144 fake-socket queued writes and
four cleanups. There are 174 expected failures. Independent oracles check tick
state, sample rings/count/average arithmetic, stored real-clock bounds, callback
order and throwable identity, ranking views and 75 truncated prefixes, plus
buffer/stage/guard/queue effects. Actual nano samples are normalized in the trace;
fake sockets use existing dummy tasks and suppress idle keepalive. Negative,
zero and positive client flags remain. All twelve previous result-helper trace
pins retain their hashes.

The export has 15,070 rules and 104,152 identifier edits, plus eleven class-name
literal and 250 label edits: 104,413 total. All 14,988 previous complete rules
remain. Seventeen generated Java files change; raw code, generator/workflow/stub
pins, all 19,498 dictionary identities, 136,607 bindings, 388 overrides and 811
label records remain. Both 303-file corpora compile, reproduce and reverse byte
exactly. The 27 publication tests and affected native fixtures pass. No generated
Java body is hand edited and no decompiler change is required.

Eight large labeled bodies and 162 opaque labels remain, together with 283
opaque fields and 308 single-letter methods. Real-time pacing, idle cipher
keepalive, write-IOException closure, unmatched/unknown ranking replies, live
server/network/assets/game/browser/phone and heap/presented-FPS acceptance remain
unverified.

## Previous widget theme naming (pass 155)

Pass 155 adds 77 guarded names: eleven fields, one method, five parameters and
sixty locals. All 119 declarations owned by WidgetTheme now have readable names;
its constructor follows the existing class rule. Renderer slots show text,
button, checkbox and text-input roles. The protected button constructor's fallback
slot is explicitly named but remains uninitialized by theme setup. Tooltip
padding, line spacing, wrapped border color and beveled panel construction are
visible both here and in MessageDialog's overrides.

Initialization keeps its original unused dial/slider/stripe/arrow renderer
constructions and aliased overlay sprites. Reused locals name every role:
wrapWidthOrBoxX and widthChunkCountOrLineIndexOrBoxY. Single-line and wrapped
boxes keep their different edge placement and padding rules. Wrong guards retain
recursive panel failures, partial drawing and the bottom-padding write. The
checkbox renderer is cleared by a false tooltip guard only after successful
drawing; glyph callback failures preserve it and the already drawn box.

The existing nine-slice fixture adds 2,634 native/raw/readable cases: ten
constructor/initialization cases and 2,624 tooltip/line-guard cases. Independent
oracles check renderer/default/panel/color/padding aliases, raster pixels, glyph
call geometry, explicit line breaks, quarter-raster balancing, clipping and
exception/Error identity. Twenty-six expected failures retain original partial
effects. Negative/positive control flags also exercise bootstrap-dependent account
widget failures with the shared theme deliberately null; successful setup is
checked separately. No client-control flag value is assumed. All nine previous
raster/widget trace pins remain.

The export has 14,988 rules and 103,778 identifier edits, plus eleven class-name
literal and 250 label edits: 104,039 total. All 14,911 previous complete rules
remain. Six generated Java files change; raw code, generator/workflow/stub pins,
all 19,498 dictionary identities, 136,607 bindings, 388 overrides and 811 label
records remain. Both 303-file corpora compile, reproduce and reverse byte exactly.
The 27 publication tests and affected native fixtures pass. No generated Java body
is hand edited and no decompiler change is required.

Eight large labeled bodies and 162 opaque labels remain, together with 291
opaque fields and 319 single-letter methods. Real fonts/assets, arbitrary markup
and callbacks, live account UI/network/game/server/browser/phone and heap/FPS
acceptance remain unverified.

## Previous widget skin naming (pass 154)

Pass 154 adds 207 guarded names: five fields, 22 methods, 54 parameters and
126 locals. All 113 declarations owned by WidgetSkinState and all 119 owned by
StatefulWidgetRenderer have readable names; their three constructors follow
class rules. Callers now show replacing a state skin, setting offsets/colors,
copying properties, merging overlays and drawing the result. The renderer applies
base0, active1, pressed3 or hover2, focus5 and disabled4 in that exact order.

The names expose existing quirks without changing behavior: invalid setters can
write before returning null, reset keeps the overlay flag, invalid copying clears
the source panel array after the first target write, and copying skin properties
still shares sprites/arrays. Flushing draws and resets the old target before the
merge guard. Rendering restores the clip only on success. Shared fields are
traced through their actual consumers: username suggestions, intro face RGB,
text-template definitions, the decoded ranked ratio numerator and email local-part
characters. No client-control flag value is assumed.

The existing nine-slice fixture adds 9,061 native/raw/readable cases with
independent state, alias, guard-timing and pixel oracles: 769 constructor/reset,
472 setter/cleanup, 36 copy/null-target, 1,548 merge/flush/failure, 71 renderer
replace/copy/panel/range/cleanup and 6,165 state-order/alignment/failure cases.
They include 302 expected failures and negative/zero/positive control flags.
All eight previous raster trace hashes remain unchanged.

The export has 14,911 rules and 103,436 identifier edits, plus eleven class-name
literal and 250 label edits: 103,697 total. All 14,704 previous complete rules
remain. Seventeen generated Java files change; raw code, generator/workflow/stub
pins, all 19,498 dictionary identities, 136,607 bindings, 388 overrides and 811
label records remain. Both 303-file corpora compile, reproduce and reverse byte
exactly. The 27 publication tests and affected native fixtures pass. No generated
Java body is hand edited and no decompiler change is required.

Eight large labeled bodies and 162 opaque labels remain, together with 302
opaque fields and 320 single-letter methods. Real fonts/assets, arbitrary widget
callbacks, live dialogs/network, full-game/server/browser/phone and heap/FPS
acceptance remain unverified.

## Previous nonlocal loop exit guards (pass 153)

Pass 153 makes two stopping conditions explicit in board reconciliation:
connected-component detachment and clearing the visited table. Each infinite
loop's leading single labeled break becomes a negated loop header, followed by
the exact same break to its original enclosing frame. Board reconciliation
falls from 335 to 331 lines; eight large labeled bodies still remain.

Every own break, including a finally override, refuses this reconstruction.
Own continues still evaluate the guard at the next iteration, and every other
nonlocal transfer retains its target. Remaining body declarations, complete
try/catch/finally and monitor regions, and scalar-parent braces stay intact.
The guard is negated as written; no control-flag value or numeric type is assumed.

Four focused groups include six native variants checked against 5,184 independent
guard/body/finally event cases. They cover effectful/nullable guards, negative/
zero/positive flags, exception identity and partial effects, return snapshots,
finally backedges overriding pending exceptions, local scope and monitor release.
The emitter suite passes 125 tests with one existing skip. A clean tracked
decompiler-source tar reproduces all 303 files and unchanged diagnostics without
hard failures or fallbacks. The source proof reconstructs every expected token
stream and tags retained original tokens to verify the exact moved-break lexical
permutation, all 811 label records/destinations, 136,607 ordered ordinary bindings,
local ordinals and 388 overrides. No label is removed or retargeted.

All 14,704 complete naming rules and 102,972 edits remain unchanged. Both corpora
compile, reproduce and reverse byte exactly; 27 publication tests and the eight
native/raw/readable fixtures pass within their documented scopes. Only the
generated BoardReconciliationSupport body changes; no Java body is hand edited.
There are still 307 opaque fields, 342 single-letter methods and 162 opaque labels.
Full assets/gameplay, servers, browser/phone and heap/FPS acceptance remain unverified.

## Previous synthesized sound names (pass 152)

Pass 152 adds 86 guarded names: 22 fields, thirteen methods, eighteen
parameters and 33 locals. Every declaration in SoundFilter (45), SoundEnvelope
(22) and SynthesizedSoundEffect (25) has a readable name; constructors follow
the existing class rules. Their callers now show envelope reset/advance,
endpoint decode, pole-pair coefficient expansion, forward gain and signed PCM
mixing with millisecond loop boundaries. Reused slots keep names that cover
both roles, rather than implying a register has only one meaning.

The same result-helper fixture adds 134 native/raw/readable cases: 48 constant
envelope/reset trajectories, three explicit fixed-point ramps, 23 truncated/null
envelopes with partial-state/cursor traces, forty filter cases including NaN,
and twenty constructed square-wave mix/delay/saturation/PCM-loop cases. Flat
and ramp values, coefficient counts/unity/zero-radius cases, and mixing/loop
values have independent explicit oracles. Other filter coefficients and partial
decode state compare transformed native/raw/readable traces directly. All eleven
previous result-helper traces retain their reviewed hashes.

There are 14,704 rules and 102,711 identifier edits, plus eleven class-name
literal and 250 label edits: 102,972 total. All 14,618 previous complete rules
remain. Six generated Java files change; all raw code, source/tool/workflow/stub
pins, local ordinals, 136,607 bindings, 388 overrides and 811 lexical label
records remain. Both 303-file corpora compile, reproduce and reverse byte
exactly; the 27 publication tests and extended result-helper fixture pass.
No Java body is hand edited and no decompiler change is required.

Eight large labeled bodies and 162 opaque labels remain, together with 307
opaque fields and 342 short opaque methods. Full packed instruments, arbitrary
modulation/filtering, real archive assets, device playback, full-game/server/
browser/phone and heap/FPS acceptance remain unverified.

## Previous terminal loop headers (pass 151)

Pass 151 gives three loops their original guard headers: the frame loop in
GameApplet.run becomes do-while; MidiPcmStream.advanceMidiEvents and
LoginPanel.handleIntRecordReply use while guards. Partial true arms retain an
explicit fallthrough break, so a nonzero control flag or matching record does
not accidentally cause another iteration. Earlier continues and finally overrides
keep their original guard-evaluation point. No control-flag value is assumed.

The terminal trailing form permits only direct own guard continues plus a final
bare own break. Ordered short-circuit guards preserve callbacks, mutations and
nullable failures. Earlier/protected trailing backedges, prefix-owned direct
locals, potentially constant guards and unsupported/ambiguous syntax refuse.
The entry form preserves the complete arm scope/protected groups and retains
its break whenever the arm can fall through. Every existing destination remains.

The applet loop label L17 loses its only continue when the do-while condition
represents that repeat. Only this proven unused label is removed; one later
opaque label ordinal migrates. No guarded name changes. The corpus loses eight
lines, one bare break and one direct continue. Label definitions fall from 246
to 245 and lexical records from 813 to 811; all surviving targets remain.

Five new focused groups include twelve native variants checked against 48,924
independent event-model cases: 36,828 entry-header and 12,096 trailing-header
cases. Partial arms, negative/zero/positive flags, nullable/effectful guards,
finally backedges that override pending exceptions, return snapshots, local
scopes and monitor release are covered. The emitter suite passes 121 tests with
one existing skip. A clean tracked source tar reproduces all 303 files and
unchanged diagnostics, with no failures/fallbacks. The shared proof checks every
expected token stream, 136,607 ordered bindings, 388 overrides and every surviving
label identity, including the sole opaque ordinal migration.

All 14,618 complete naming rules and 102,435 edits remain. Both corpora compile,
reproduce and reverse byte exactly. The 27 publication checks and eight existing
native fixtures pass within their documented scopes. Eight large labeled bodies
remain unchanged; 162 opaque labels, 329 opaque fields and 355 short opaque methods
remain. Actual applet timing, full MIDI/live reply/network/assets/gameplay,
servers, browser/phone and heap/FPS acceptance remain unverified.

## Previous loop exit continuations (pass 150)

Pass 150 separates 54 noncompleting continuations from repeating loop prefixes
in 39 methods across 29 owners. The final section now follows an explicit loop
exit. Board reconciliation exposes moving/connectivity work, attached-entity
routing, transient recycling and final raster/achievement updates as sequential
sections. Session drawing/update, menu update/render helpers, Bzip2 selector
reading and output-state publication receive the same generic reconstruction.

All existing repeats must stay inside a complete prefix, and no existing own
break may skip the old continuation. Own exits, prefix-owned direct locals,
ambiguous/unsupported syntax, a prefix without normal completion and a suffix
that can fall through refuse reconstruction. Whole conditional, try/catch/finally,
switch, label and monitor constructs remain intact. Suffix local scope and scalar
parent braces remain. Earlier/finally continues still repeat; nonlocal transfers
still skip both sections. No control-flag value is assumed. Explicit breaks add
54 source lines while reducing continuation nesting; no labels are removed.

Four new focused groups include eight native variants checked against 18,432
independent event-model cases. Effectful else arms, nullable/effectful guards,
exception identity, partial effects, earlier repeats, finally backedges that
override pending exceptions, return snapshots and monitor release are covered.
The emitter suite passes 116 tests with one existing skip. A clean tracked source
tar reproduces all 303 Java files and unchanged diagnostics, without failures or
fallbacks. The shared source proof checks every expected token stream, all 136,607
ordered declaration/reference bindings, 388 overrides and 813 lexical label records,
plus the 54 added bare exits. No local or label ordinal migrates.

All 14,618 complete naming rules and 102,435 recorded edits remain unchanged.
Both corpora compile, reproduce and reverse byte exactly. The 27 publication
checks and eight existing native fixtures pass within their documented scopes.
Five large bodies change but eight remain: board reconciliation is 335 lines,
session render/update 346/630, menu update 327 and Bzip2 decodeBlocks 376.
There are still 163 opaque labels, 329 opaque fields and 355 short opaque methods.
Full assets/gameplay, servers, browser/phone and heap/FPS acceptance remain unverified.

## Previous trailing loop reconstruction (pass 149)

Pass 149 reconstructs thirteen guarded infinite loops as explicit `do…while`
loops in twelve methods across nine owners. Bzip2 run decoding now repeats while
`symbol == 0 || symbol == 1`; its decodeBlocks body falls from 381 to 375 lines.
PCM sample/mixer loops, hash table iterators, timer catch-up, collision scanning,
packet string readers and bounded random rejection sampling use the same generic
proof. The complete raw corpus loses 42 lines and fourteen bare continues.

A candidate must have a complete prefix, direct conditional own backedges and
a noncompleting continuation. Ordered short-circuit OR preserves each guard's
callbacks, mutations, nullable unboxing and skipped later tests. Own breaks,
earlier/protected continues, body-owned prefix locals, potentially constant
guards, unsupported/ambiguous syntax and fallthrough continuations refuse.
Protected prefix groups, finally overrides, monitors, scalar-parent braces and
continuation local scopes stay intact. The client control flag may be nonzero.

The emitter suite passes 112 tests with one existing skip. Four new focused
groups include six native variants checked against 12,096 independent event-model
cases. A clean tracked decompiler source tar reproduces all 303 Java files and
unchanged diagnostics, with no hard failures or fallbacks. The shared source proof
checks all complete expected token streams, 136,607 ordered bindings, 388 override
pairs and 813 lexical label records; no local or label ordinal migrates.

All 14,618 complete naming rules remain unchanged, with 102,435 recorded edits.
Both corpora compile, reproduce and reverse byte exactly. The 27 publication
checks and eight existing native fixtures pass within their recorded scopes,
including forty Bzip2 payload/partial-output/malformed-input/recovery cases.
Eight large labeled bodies remain, together with 163 opaque labels, 329 opaque
fields and 355 short opaque methods. Full assets/gameplay, servers, browser/phone
and heap/FPS acceptance remain unverified.

## Previous text layout and renderer naming (pass 148)

Pass 148 adds 560 guarded rules: 31 fields, fifty methods, 194 parameters,
284 locals and one label. Every declaration in TextWidgetLayout (43),
TextWidgetRenderer (283), TextLayout (74), TextLayoutLine (20) and
CachedTextLayout (117) has a readable name; constructors follow class rules.
The complete layout interface and display-text/password override families now
expose hitTestCaretIndex, drawSelection, drawCaret, getTextLayout, origins,
available viewport dimensions and padded metrics. Maximum line end X retains
its alignment offsets; it is not presented as plain string width.

Padding, colors, selection ARGB, font/alignment/spacing, line bounds and caret
positions follow producers and consumers. populateCaretPositions exposes the
existing markup-anchor and fixed256 space-justification arithmetic. Cache keys
and aliases remain exact: single-line caches omit anchor/baseline, centered
layout never saves cachedText, null text clears lines without clearing keys,
and paragraph alignment/spacing mutations keep their original behavior.
Selection still passes bottomY as rectangle height. Clip restoration remains
on successful paths, not an invented finally. Overflow, guards, partial
failures, password masking, caller ordering and all client-control paths stay.

Shared progress image, unread ticket message, reconnect-error-page suppression,
fullscreen pointer origin and intro frame/red tint have grounded names.
textDrawingCompletion names one existing frame and three breaks; label edits
grow from 246 to 250 without removing control flow. There are 14,618 rules and
102,174 identifier edits, plus eleven class-literal and 250 label edits:
102,435 total. All 14,058 previous complete rules and raw/tool/workflow/stub/
native/text pins remain. Both 303-file corpora compile, preserve 136,607
bindings, 388 overrides and 813 lexical label records, and reverse byte exactly.
The 27 publication tests and eight existing native fixtures pass within their
recorded scopes. Full fonts/markup/cache/caret/selection, arbitrary callbacks,
async input/assets and device behavior are not newly executed. Eight large
labeled bodies, 163 opaque labels, 329 opaque fields and 355 short opaque
methods remain; whole-game/server/device and heap/FPS acceptance remain unverified.

## Previous validation and account name naming (pass 147)

Pass 147 adds 148 guarded names: fifteen fields, 24 methods, 49 parameters
and 60 locals. Every declaration in ValidatedTextInputWidget (49),
DebouncedValidationProvider (40), TextInputValidator (86), CheckboxRenderer
(59) and ValidationProvider (nine) now has a readable name; constructors follow
class rules. Complete API families expose isInputEmpty,
getDebouncedValidationMessage, getDebouncedValidationState and resetValidationDelay.
Empty, debouncing, invalid, query-pending and valid singleton states follow
actual validators and icon/message consumers. The exact 350ms boundary, signed
clock arithmetic, empty-input short circuit and original guards remain.

The account-name chain names length/normalization/separator structure and
per-character checks, preserving wrong-guard early success and arbitrary
CharSequence callbacks. Checkbox drawing/constructor roles, pointer-local X,
tooltip anchors, validation provider assignment and pointer-listener monitor
are explicit. Shared logo delay and optional login-response extension bytes
follow their consumers without inventing producers or payload semantics.
handleLoginUiResponse exposes existing visible-dialog processing, response
8-to-2 remapping, response-10 name-panel routing, guarded reset and partial
failure order. Dial reference angle and fullscreen-unavailable token follow
their actual consumers.

There are 14,058 rules and 100,022 identifier edits, plus eleven class-literal
and 246 label edits: 100,279 total. All 13,910 previous complete rules and
raw/tool/workflow/stub/native/text pins remain. Both 303-file corpora compile,
preserve 136,607 bindings, 388 overrides and 813 lexical label records, and
reverse byte exactly. The 27 publication tests and eight existing native
fixtures pass within their recorded scopes. Live asynchronous editing, remote
availability/login services, arbitrary CharSequence implementations and device
behavior remain unverified. Eight large labeled bodies, 164 opaque labels,
360 opaque fields and 405 short opaque methods remain; whole-game/server/
device and heap/FPS acceptance are still unverified.

## Previous button and text input naming (pass 146)

Pass 146 adds 180 guarded names: eleven fields, 25 methods, 46 parameters
and 98 locals. All 95 ButtonWidget, 156 TextInputWidget and seven
TextInputListener declarations now have readable names; constructors follow
class rules. Both text-listener implementations and the validated-input
notification override retain complete, consistently named callback families.

Caret and selection indexes, ASCII-space word boundaries, double-click drag,
clipboard copy/cut/paste, input limits, scrolling, blink timing and submission
now expose their roles. Numeric keys/guards, UTF-16 indexes, the strict 250ms
press comparison, signed blink remainder, callback order and sprite aliases
remain unchanged. Verified transformed bytecode confirms the bounded insertion
branch returns when remaining capacity is nonnegative, and otherwise attempts
a negative substring bound. Naming preserves that behavior and clipboard
partial edits; it does not repair input behavior.

Compiler-resolved uses establish canvasOffsetY, accountContentDialog and
overlongTextFailure. requestJustPlay names the actual button/simple-UI route
through progress display and pending action 4; no new login/server semantics
are inferred. There are 13,910 rules and 99,493 identifier edits, plus eleven
class-literal and 246 label edits: 99,750 total. All 13,730 previous complete
rules and raw/tool/workflow/stub/native/text pins remain unchanged. Both
303-file corpora compile, preserve 136,607 bindings, 388 overrides and 813
lexical label records, and reverse byte exactly. The 27 publication tests and
eight existing native fixtures pass within their recorded scopes. Full live
editing, clipboard, selection/blink and device behavior remain unverified.
Eight large labeled bodies, 164 opaque labels, 375 opaque fields and 429
short opaque methods remain. Whole-game/server/device and heap/FPS acceptance
are still unverified.

## Previous base widget and container naming (pass 145)

Pass 145 adds 122 guarded rules: three fields, five methods, fifteen
parameters, 97 locals and two labels. All 243 UiWidget and 219 WidgetContainer
declarations now have readable names; constructors follow class rules and
toString keeps its JDK spelling. requestPreviousChildFocus/requestNextChildFocus
expose the actual nonwrapping scans after focused children. First-focus
acquisition, reverse draw order, forward input/layout/hover traversal,
linked-node early exits, cursor positions and callback order stay intact.

Compiler-resolved field references establish textOffsetX/textOffsetY/textLayout
across the text-input and renderer holders. Caret-driven X adjustment, the
wrong-guard bounds store of 112, only-zero owned Y stores and lazy layout/cache
aliases remain. appendRsaXteaEncryptedBuffer names the existing source/destination
wrapper; exponent/modulus argument order, signed BigInteger transformation,
random/scratch state and guarded query cleanup are unchanged.

pointerPressWithoutWheel and pointerPressWithWheel name two existing frames
and their breaks. Numeric keys 80/81, wheel coordinates, release-guard effects
and all nonzero client-control paths remain. Label edit accounting grows from
242 to 246; no frame or transfer is removed. There are 13,730 rules and 98,806
identifier edits, plus eleven class-literal and 246 label edits: 99,063 total.
All 13,608 previous complete rules and raw/tool/workflow/stub/native/text pins
remain. Both 303-file corpora compile, preserve 136,607 bindings, 388 overrides
and 813 lexical label records, and reverse byte exactly. The 27 publication
tests and eight existing native fixtures pass within their recorded scopes.
Live AWT input, arbitrary callback-driven list mutations, complete text
scrolling/layout and encrypted-payload interoperability remain unverified.
Eight large labeled bodies and 164 opaque labels remain; full-game/server/
device and heap/FPS acceptance are still unverified.

## Previous widget diagnostics and single child naming (pass 144)

Pass 144 adds 251 guarded rules: 17 methods, 58 parameters, 174 locals and
two labels. Every SingleChildWidget field, method, parameter and local is now
named. appendWidgetDiagnostics identifies all five owned overrides;
appendWidgetDiagnosticProperties, beginWidgetDiagnosticVisit and the child
helpers expose formatting and traversal. The visited Hashtable retains entries,
so the existing circular marker includes shared revisits. Renderer/listener
widget checks still recurse on this same widget receiver, with the original
output aliases, callback order and nonzero client-control fallthrough.

getLastRenderPass names the inclusive pass index: base zero, child delegation
or container maximum. renderWidgetPassesAndTooltip retains the supplied start,
integer increment/overflow, client-control exit and tooltip order. Base key
input and child delegation now expose their actual roles. The two private
requestUnfocusedChildFocus overloads keep identical child predicates/bodies and
different guards; no forward/backward navigation is invented. Numeric key codes 80/81,
child-origin additions, unchanged wheel coordinates and nullable hover fallback
remain exact.

rendererDiagnosticFormatting and listenerDiagnosticFormatting name existing
plain frames and their two breaks. No frame or transfer is removed; label edit
accounting grows from 238 to 242. There are 13,608 rules and 98,370 identifier
edits, plus eleven class-literal and 242 label edits: 98,623 total. All 13,357
previous complete rules and raw/tool/workflow/stub/native/text pins remain.
Both 303-file corpora compile, preserve 136,607 bindings, 388 overrides and 813
lexical label records, and reverse byte exactly. The 27 publication tests and
eight existing native fixtures pass within their recorded scopes. Arbitrary
diagnostic callback recursion, live AWT input and complete render-pass/device
behavior remain unverified. Eight large labeled bodies and 166 opaque labels
remain; full-game/server/device and heap/FPS acceptance are still unverified.

## Previous packet framing and ranked range naming (pass 143)

Pass 143 adds 56 guarded rules: seven fields, four methods, twelve parameters
and 33 locals. The complete incoming-packet reader now exposes
readNextIncomingPacket, readSessionPacketPayload and readSessionBytesIfAvailable.
Fixed and one-byte/two-byte variable lengths, partial-read progress, activity
timeout, opcode history, delayed replay/enqueue and Gaussian delay cast/clamp
retain their original behavior. The strict delivery-time comparison and all
wrong-guard/exception/copy effects remain. Delay defaults are zero; no owned
nonzero delay producer or delayed-queue initializer is invented.

sortRankedEntryRange names partition/bubble roles, prefix cutoff and selected
keys; rankedEntryIndices names the shared index array. Integral midpoint,
comparator, recursion and preincrement ordering stay intact. fpsTextTemplate
names the actual gameplay text. No generated Java body is hand edited.

There are 13,357 rules and 97,588 identifier edits, plus eleven class-literal
and 238 label edits: 97,837 total. All 13,301 previous complete rules and raw/
tool/workflow/stub/native/text pins remain unchanged. Both 303-file corpora
compile and preserve 136,607 bindings, 388 overrides and 813 lexical label
records; all 303 files reverse byte exactly. The 27 publication tests and eight
existing native fixtures pass within their recorded scopes. Live socket/framing
timing and exhaustive ranked sorting are outside those fixtures. Eight large
labeled bodies and 168 opaque labels remain; full-game/server/device and
heap/FPS acceptance remain unverified.

## Previous MIDI owner and note naming (pass 142)

Pass 142 adds 227 guarded rules: 36 fields, 29 methods, 68 parameters,
91 locals and three labels. Every MidiPcmStream and MidiNote field, method,
parameter, local and label is now named. All prior complete naming rules remain.

MIDI playback exposes heldNotesByKey versus notesByKeyGroup, default/current
instrument ids and bank offsets, channel volume/expression/pan/pitch bend,
modulation/portamento/gain/selected-parameter/retrigger state, and earliest-track
clock values. dispatchMidiEvent, startNote/releaseNote, computeNoteVolume/Pan/
SampleStep, resetSynthesisState and advanceMidiEvents identify the existing
paths. Velocity-squared gain, note age/vibrato/decay/envelope indexes, held and
release states, note reuse/group replacement and exact controller masks/numbers
remain. Pressure handlers are still guarded stubs. Pending-score fields retain
their branches; no owned queue producer or new playback feature is invented.

Shared input/sprite/keyboard/session helpers are named in their actual roles.
MidiNote.stagedIncomingPacketOpcode comes from SingleChildWidget's real cipher
header reader and dispatch/delay path; it is not an audio-only status field.
clearAudioReferences still writes 41 into that packet state on its wrong guard.
All wrong-guard effects, diagnostics, numeric states, overflow/floating/division,
callback/partial-effect order, synchronization and client-control reads remain.

The existing eventTrackSelection loop, portamentoReleaseSelection block and
releaseEnvelopeAdvance block keep their frames and five labeled transfers.
Only names and label accounting change: 230 to 238 edits. There are 13,301 rules
and 97,288 identifier edits, plus eleven class-literal and 238 label edits:
97,537 total. All 13,074 prior complete rules and raw/tool/workflow/stub/native/
text pins remain unchanged. Both 303-file corpora compile and preserve 136,607
bindings, 388 overrides and 813 lexical label records; all 303 files reverse
byte exactly. The 27 publication tests and eight existing native fixtures pass
within their recorded scopes. Full MIDI controller/envelope/event timing,
live input/network/audio devices and full-game/assets/server/heap/FPS behavior
remain unverified. Eight large labeled bodies and 168 opaque labels remain.

Previous naming pass:

Pass 141 adds 418 guarded rules: 13 fields, 28 methods, 227 parameters,
132 locals and 18 labels. Every PcmSampleStream field, method, parameter,
local and label is now named. The original arithmetic and source bodies remain.

The 16 mixing kernels expose forward/reverse, mono/stereo, aligned/interpolated
and fixed/ramped volume variants. mixForwardToBoundary/mixReverseToBoundary
select them using the original step/alignment, stereo and ramp state. Parameter
names retain reused units and roles: fixed position becomes integer source
index in aligned kernels, stereo frame indexes become interleaved array indexes,
and scratch source indexes can become a boundary sample or copied step. Saved
source/destination indexes describe each original unrolled or tail write;
increment/decrement order and += accumulation do not change.

Playback fields expose loopsRemaining, pingPongLoop, loopStart/loopEnd,
target/current volumes, targetPan, rampFramesRemaining and gain steps. Methods
expose refreshCurrentVolumes, finishOrContinueVolumeRamp, cancelVolumeRamp,
setVolumeAndPan, setReversePlayback and equal-power left/right gain helpers.
Negative loop counts, MIN_VALUE fade sentinel, step overflow, shifts,
interpolation boundaries, wrap/reflection, signed division/remainder and
synchronized state updates remain, including partial failure effects.

All 18 existing plain labels are named: interiorFrameLimit/boundaryFrameLimit
in interpolation kernels and finiteLoopMixing/finiteLoopSkipping around the
finite-loop paths. Their 22 breaks retain their targets; no frame or transfer
is removed. Explicit accounting grows from 190 to 230 label edits. There are
13,074 rules and 96,034 identifier edits, plus eleven class-literal and 230
label edits: 96,275 total. All 12,656 prior complete rules and raw/tool/workflow/
stub/native/text pins remain unchanged. Both 303-file corpora compile and
preserve 136,607 bindings, 388 overrides and 813 lexical label records; all
303 files reverse byte exactly. The 27 publication tests and eight existing
native fixtures pass within their recorded scopes. These fixtures cover
factory/position/music-data behavior, not exhaustive PCM mix/ramp/loop kernels
or live audio devices. Eight large labeled bodies and 171 opaque labels remain;
full-game/assets/server/device and heap/FPS acceptance are still unverified.

Previous naming pass:

Pass 140 adds 208 guarded rules: 25 fields, 27 methods, 49 parameters,
106 locals and one label. All fields, methods, parameters and locals in
PcmStreamMixer, PcmMixerListener, DelayedPcmStream and MidiNoteMixer now have
names. Other note/controller fields and optimized sample kernels remain opaque.

The mixer exposes childStreams, scheduledListeners, nextListenerFrameOffset,
normalizeListenerFrameOffsets and insertListenerByFrameOffset. Mixing and
skipping consume the exact deadline chunk, invoke the listener under its
monitor, then remove or reinsert it using the callback's signed result. Equal
deadline insertion, zero-frame handling and nested locking remain. No owned
concrete listener implementation exists; its private constructor still throws
Error, and callback internals are not invented.

Delayed streams expose wrappedStream and remainingDelayFrames, retaining their
list replacement before processing the positive remainder and the original
pointer-write order. MIDI notes expose sampleStream, channelIndex, keyNumber,
framesUntilUpdate and retriggerPhaseFixed. mixNoteFrames/skipNoteFrames and the
selected owner helpers retain 20-bit phase arithmetic, guard effects, sample
position reflection, stream recreation, loop flags and old-stream fades. Sample
controls now read fadeOutAndUnlink, rampVolumeAndPan, setLoopCount and
getTargetVolume. Signed sentinels, overflow, locks and partial effects remain.

noteSkipCompletion names the existing plain note-completion frame and its one
break; no frame or transfer is removed. Explicit label accounting grows from
188 to 190 edits. There are 12,656 rules and 92,977 identifier edits, plus eleven
class-literal and 190 label edits: 93,178 total. All 12,448 prior complete rules
and raw/tool/workflow/stub/native/text pins remain unchanged. Both 303-file
corpora compile and preserve 136,607 bindings, 388 overrides and 813 lexical
label records; all 303 files reverse byte exactly. The 27 publication tests
and eight existing native fixtures pass within their recorded scopes. Those
fixtures do not establish listener callback scheduling, real devices or live
MIDI retriggering/service timing. Eight large labeled bodies and 189 opaque
labels remain; full-game/assets/server/device and heap/FPS acceptance are
still unverified.

Previous naming pass:

Pass 139 adds 199 guarded rules: 31 fields, 57 methods, 45 parameters,
65 locals and one label. Every AudioOutput and JavaSoundAudioOutput field,
method, parameter and local is named. The PcmStream contract and all owned
overrides now expose firstChildStream/nextChildStream, mixInto/skipFrames,
getSchedulingPriority and getSchedulingCost; their bodies stay intact.

AudioOutput exposes requested/adaptive buffering, drain checks, reopen time,
stream-time catch-up, root stream and eight priority queues. mixBlock selects
streams against schedulingWorkLimit, clears priority links and then mixes the
root. streamSelection names its existing plain budget-exit block; the frame,
exit and cleanup remain. Label accounting grows from 186 to 188 edits explicitly.

Java Sound hooks expose initializeDevice, openDevice, getQueuedFrames,
writeMixBlock, flushDevice and closeDevice. Signed 24-bit clipping and signed 16-bit
little-endian packing remain. Any listed mixer name containing soundmax retains
reopen-after-flush behavior; this is not a new mixer-selection policy. Capacity
rounding and power-of-two retry, base no-op hooks, Throwable silent-output
fallback and any partial service/device installation remain. Volatile flags,
synchronized calls, callback order, 256-frame blocks, 16384-frame cap and
two-second drain/reopen timing are unchanged. No runtime scheduling optimization
or new physical-device validation is claimed.

There are 12,448 rules and 91,653 identifier edits, plus eleven class-literal
and 188 label edits: 91,852 total. All 12,249 prior complete rules and raw/tool/
workflow/stub/native/text pins remain. Both 303-file corpora compile, preserving
136,607 bindings, 388 overrides and 813 lexical label records, and all 303 files
reverse byte exactly. The 27 publication checks and eight existing native
fixtures pass within their recorded scopes. Native music fixtures control PCM
and sample state; real devices, service timing and complete live scheduling
remain unverified. Eight large labeled bodies and 190 opaque labels remain;
full-game/assets/server/device and heap/FPS acceptance remain unverified.

Previous naming pass:

Pass 138 adds 105 guarded rules: 23 fields, nine methods, 18 parameters,
54 locals and one label. Social packet updates and both name-hash lookups now
have named parameters/locals and storage. `primarySocialEntriesByNameHash`,
`primarySocialEntriesInOrder`, `secondarySocialEntriesInOrder` and the two
next-insertion indexes expose the structures used by the existing response path.
The generic intrusive operation is now `insertNodeBefore`.

Primary lookup rejects invalid normalized names; secondary lookup retains its
original-text fallback. Renaming/rekeying, hash-collision traversal, interned
location reference equality, integer subtraction/overflow and partial queue
updates remain. `insertionTargetSelection` names the existing plain block that
chooses the entry/target carrier under the original client-control flag. Its
declaration and one break account for two additional label edits; neither the
frame nor its exit is removed. The manifest records that accounting change
explicitly. Packed social settings retain neutral low/middle/high slot names,
original two-bit extraction, clamp order and invalid-guard effects.

`soundEffectVolume`, `trackedSoundEffectStreams` and `updateSoundEffectVolume`
expose the shared effects gain and live-holder update path. The original divide
by 80, floating 1.399999976158142 multiplier, overflow and guard-after-store remain.
The loading route exposes `setLoadingProgress`, `drawLoadingProgressDialog`,
`loadingStatusText`, `loadingScaledProgress` and `getBootstrapLoadingStatusText`.
Fixed translations and archive-readiness order remain; this is not a new UI.

Every field, method, parameter and local in `AudioService` is now named; its
public Runnable `run` name remains. Two volatile output slots, running/stop flags,
dispatcher pumping, ten-millisecond polling, error reporting and finally cleanup
keep their original ordering. Unknown friend/ignore/permission semantics and
unused private style-slot meanings are not invented.

There are 12,249 rules and 90,785 identifier edits, plus eleven class-literal
and 186 label edits: 90,982 total. All 12,144 prior complete rules and the raw,
decompiler, naming, workflow, stub, native and text pins remain unchanged.
Both 303-file corpora compile and preserve 136,607 bindings, 388 overrides
and 813 lexical label records; all 303 files reverse byte exactly. The 27
publication checks and eight existing native fixtures pass within their scopes.
The fixtures do not establish a live social server, real audio device worker
or complete loading-dialog execution. Eight large labeled bodies and 191
opaque labels remain. Full-game/assets/server/device and heap/FPS acceptance
remain unverified.

Previous naming pass:

Pass 137 adds 232 guarded rules: 25 fields, 26 methods, 60 parameters and
121 locals. Every field, method, parameter and local in `SessionGameApplet`
is now named. Applet bootstrap fields expose server ports/host/number, game CRC,
instance id, member mode, language and affiliate id from their original
parameter keys. Archive ids now distinguish game/interface text, common UI
sprites, UI fonts and the combined button/logo archive.

The central paths are `initializeGameApplet`, `initializeFromAppletParameters`,
`initializeSessionAppletServices`, `updateSessionBootstrapAndInput`,
`updateBootstrapUi`, `pollReconnectAndResendRequests` and
`processAccountUiActions`. The packet enable and length tables now expose
`enabledSessionPacketOpcodes` and `sessionPacketLengthByOpcode`; variable lengths
keep their original -1/-2 byte/short framing. Reply-family methods preserve
original opcode values, enable order, resend order and guard effects.

`requestIdleDisconnect` names the flag set by the gameplay `brk` command and
consumed through the existing idle-disconnect branch. `canvasReplacementRequested`
names the paint-driven canvas rebuild flag. `pollAccountDialogAction` still
processes dialog pointer/animation/keyboard input, consumes pending actions and
returns original request-state actions; it is not a zero-return stub.
The adapter retains its unused language, wheel and fullscreen inputs.

URL helpers expose `applySessionOverridesToUrl`, `rewriteSessionUrlPath`,
`handleOpenUrlPacket` and `openUrlInNewWindow`. The unusual settings/session
alias, repeated assignments, ignored navigation flag and original URL fallback
remain. Path rewriting adds no new encoding or policy. The patched
`isAppletStartupAllowed` still returns true; it implies no domain validation.
Bootstrap keeps language edge cases, partial initialization and nested catches.

There are 12,144 rules and 90,308 identifier edits, plus eleven class-literal
and 184 label edits: 90,503 total. All 11,912 prior complete rules and the raw,
decompiler, naming, workflow, stub, native and text pins remain unchanged.
Both 303-file corpora compile, preserve 136,607 bindings, 388 override
relationships and 813 lexical label records, and reverse byte exactly.
The 27 publication checks and eight existing native fixtures pass within their
recorded scopes; they do not establish live applet/session/country-list/browser
services. No source bodies or bytecode change. Eight large labeled bodies,
192 opaque labels and other unmapped members remain. Full-game/assets/server/
device and heap/FPS acceptance remain unverified.

Previous naming pass:

Pass 136 adds 100 guarded rules: 25 fields, nine methods, 19 parameters and
47 locals. Ten previous names are explicitly corrected. `ReceivedTextRecord`
replaces `ClientSessionSnapshot`: the opcode 11/12 reader creates one text
record, rather than a complete client-state snapshot. `SessionTextHistorySupport`
exposes `retainTextRecord`; its storage, count, category counters and limit now
have inspected names. The reader staging fields identify the header, metadata,
long source id, split 16/24-bit record id, primary/display names and text.

`dispatchSessionPacket`, `readSessionTextRecord`,
`retainReceivedTextRecordIfNew` and `getRetentionCategory` expose the complete
received-record route. Duplicate rejection compares any incoming nonzero id
against existing kind-two records; it does not require incoming kind two.
Retention still counts and compacts in place, with its original guard position,
array aliasing, counter writes and partial failure effects. Unknown wire kinds
and metadata meanings are not assigned chat-channel or permission names.

`isAsciiLetterOrDigit`, `isAllowedNameCharacter`, `normalizeNameCharacter`
and their two character arrays now expose the exact name-normalization helpers.
Separator folding, listed Latin accents, the unusual sharp-s to `b` mapping,
lowercasing and wrong-guard cleanup remain unchanged. `hasPrimarySocialEntry`
names the actual lookup predicate; no friend/ignore semantics are assumed.
`formatArchiveGroupProgress` retains its waiting-text return before the guard.

The export has 11,912 rules and 89,441 identifier edits, plus eleven
class-literal and 184 label edits: 89,636 total. All 11,802 unaffected complete
rules, raw input and decompiler/naming/workflow/stub/native/text pins remain.
Both 303-file corpora compile and preserve 136,607 ordered bindings, 388
override relationships and 813 lexical label records. All 303 files reverse
byte exactly; the 27 publication checks and eight existing native probes pass
within their documented scopes. The probes do not execute complete received-text
or social initialization against a live server. No raw bodies or bytecode change.
Eight large labeled bodies, 192 opaque labels and other unmapped members remain;
full-game/assets/server/browser/phone and heap/FPS acceptance remain unverified.

Previous structural pass:

Pass 135 changes the ending-entity radius column test in
`GameplaySession.updateResultSequence` from `while` to `if`.
Its body cannot fall through or continue to that test: after scanning rows and
advancing the column it continues the enclosing column loop. Nonzero client
control flags keep their existing exit. The generic decompiler now proves this
single-evaluation shape using lexical transfer destinations and completion sets.
Only the keyword changes; the exact condition, complete body, outer backedge,
declarations, labels, guards and protected/monitor boundaries stay intact.

Labeled breaks remain legal with the same label. Bare own breaks, own continues,
normal body completion, potentially constant guards, ambiguous destinations and
unsupported syntax refuse recovery. Inner loop/switch/label exits are consumed
only by their own destination; catches stay conservative and finally overrides
retain their effects. Five focused groups pass, including eight native variants
with 512 comparisons against 512 independent event-model cases. They cover
nullable/effectful guards, exception identity and catch order, finally return
snapshots and overrides, labeled/enclosing exits, scopes and monitor release.
The relevant decompiler suite passes 118 tests with one existing skip.

Fresh CLI decompilation from the tracked source archive produces all 303 files
with no hard failures or fallbacks. Only the predicted keyword changes;
diagnostics are byte identical. The shared source proof independently replays
all 303 complete token streams and preserves 136,607 ordered Java bindings,
388 overrides and 813 lexical label records without ordinal migrations.
All 11,812 complete naming rules and 89,130 edits remain; both corpora compile
and all 303 files reverse byte exactly. The 27 publication checks and eight
fixed native probes pass within their documented scopes. The result-sequence
probe retains 27 controlled sequences and 26,043 ticks with minimal sprites;
it does not establish full asset/device behavior. Eight large labeled bodies,
192 opaque labels and other unmapped members remain. Full-game/assets/server/
browser/phone and heap/FPS acceptance remain unverified.

Pass 134 adds 177 guarded names: eleven fields, 22 methods, 48 parameters
and 96 locals. Cache code now exposes `entryWeight`, `weightCapacity`,
`remainingWeightCapacity`, `entriesByKey`, `recencyQueue`, `getByKey`,
`putWeighted`, `removeByKey`, `removeEntry` and `getReferent`.
All parameters, locals and methods in the five audited cache/reference and
secondary collection classes are named. The template-definition cache caller,
account resource setup/username response, progress dialog, login payload factory
and shared name slots also use inspected roles.

Two previous rules are explicitly corrected: `readSessionTextAndHash` becomes
`readSessionNameAndNormalize`, and `textForHash` becomes `nameToNormalize`.
The called `normalizeSessionName` trims separators, validates length and maps
characters; it does not produce a hash. Received text and normalized name remain
separate fields. The country-list helper still only has its original guard side
effect; downloaded text is unused. The cache's private constructor still throws
Error, and this corpus contains only the strong reference subclass. The promotion
predicate is named for its lookup decision, without inventing soft-reference
implementations. Achievement id 13 in `WeightedObjectCache.field_g` stays opaque
because its title is not established.

The export has 11,812 rules and 88,935 identifier edits, plus eleven class-literal
and 184 label edits: 89,130 edits in total. All 11,633 unaffected complete rules
and the raw/decompiler/naming/workflow/stub/native/text pins remain unchanged.
Thirty generated Java files change through declarations and their callers.
Both 303-file corpora compile, preserving 136,607 ordered bindings, 388 overrides
and 813 lexical label records; all 303 files reverse byte exactly to raw Git.
The existing 27 publication checks, eight fixed native probes and deque fixture
pass within their documented scopes. The label-refusal test now creates its own
source migration, so it also works during naming-only passes. No raw bodies,
numeric states, guards, evaluation order, partial effects, diagnostics or
exception/monitor boundaries change. Eight large labeled bodies, 192 opaque
labels and other unmapped members remain. Full-game/assets/server/browser/phone
and heap/FPS acceptance remain unverified.

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

Historical inventory of bodies with at least 300 lines and labels:

| Body | Lines | Labels |
| --- | ---: | ---: |
| `GameScreen.renderScreen` | 304 | 4 |
| `GameScreen.updateScreen` | 326 | 5 |
| `GameplaySession.renderSession` | 343 | 8 |
| `GameplaySession.updateSession` | 629 | 12 |
| `BoardReconciliationSupport.reconcileBoardEntities` | 333 | 8 (two loops) |
| `SpriteState.drawSortedHalfBlendRgbTriangle` | 364 | 7 |
| `Bzip2Decoder.decodeBlocks` | 385 | 5 |
| `MusicScore` constructor | 519 | 2 |

The six tracked gameplay/menu/triangle bodies have 44 named labels. The two
additional bodies have seven labels awaiting semantic names; they are included
in the 202 opaque labels recorded for this inventory. No generated dispatch
state machines remained. The current counts are in the pass 178 section above.

## Previous guarded suffix recovery (pass 130)

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

## Previous guarded abrupt exit recovery (pass 129)

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

## Previous switch-aware guard recovery (pass 128)

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

## Previous large-body label naming (pass 127)

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

Pass116 adds 33 fields, 26 methods, 69 parameters and 198 local names in the
theme audio path. `selectThemeAudio` prepares music and samples, checks the
preparation-release gate and selects a looping track. `SoundSampleCache` names
all ten instance lookup paths and the distinct synthesized/Vorbis archives and
caches. `PcmSample.resampleInPlace` names the mutating sample/rate/loop conversion;
`PcmResampler` names its coefficients, rate ratios, phase accumulation and rounded,
clamped output. All 9,536 previous complete rules and raw/tool/native-probe pins
remain. Music preparation flags still ignore the instrument-preparation return;
34 resource names still feed 33 sample slots. No live audio/device coverage is
added by these names.

Pass115 adds 11 class roles, 53 fields, 23 methods and 69 parameters. Follow
`GameplaySession.submitScore` through `ContentTransitionDialog.createAndSubmitScore`,
`ScoreSubmission`, `ArchiveIndex.writeScoreSubmission` and the ranking
acknowledgement. Query records have named writers, resend paths and response
handlers; undocumented integer values retain neutral names. `SocialListEntry`
serves both social collections with normalized display names, interned location
labels and insertion indices. `CanvasResizeController` exposes requested and
restored sizes, constraints, timer and callback. Its heap gate uses a maximum-heap
capacity estimate, preserving the original rounding and fallback.
`VisualPropertyOverrides` names its nondefault property merge, optional text and
font; unknown unused slots remain opaque. All 9,380 prior complete rules, raw
bodies and tool/probe pins remain. This source naming pass adds no live social,
query, resize, network or device coverage.

Pass114 adds 23 record/helper class roles, 77 fields, 31 methods and 97 parameters.
Read `RasterTargetSnapshot` and the named `pushRasterTarget`/`restoreRasterTarget`
callers for raster scope. `HighscoreQuery` holds three result views;
`NanoFrameTimer.handleRankingResponse` fills those views or acknowledges a queued
submission. `ReflectionCheckRequest` keeps the operation/lookup arrays used by
`readReflectionCheckRequest` and `writeReflectionCheckReply`. `DelayedIncomingPacket`
is the receive-delay queue record; `CrcAcknowledgedPacket` retains an outgoing
payload and its CRC acknowledgement. The template classes expose literal
segments, referenced IDs and typed value arrays. All 9,152 prior naming objects,
raw bodies and tool/probe pins remain; no new live platform/network coverage is
claimed.

Pass113 adds 20 account/widget class roles, 81 fields, 27 methods and 126
parameters. Read `LoginPanel` for login/retry controls, `AccountCreationForm`
for the validated registration fields and `DisplayNamePanel` for display-name
selection. `UsernameSuggestionsPanel` dispatches `onSuggestionSelected` or
`onMoreSuggestionsRequested`; the latter asks for more alternatives, not dismissal.
`HotspotTextWidget.rebuildHotspotBounds` parses clickable markup into per-line
rectangles; `findHotspot` selects a hit and `onHotspotActivated` opens its page.
`ProgressBarWidget.fillFractionQ16` selects bright/dim portions of the striped bar.
These are guarded renames; all 8,898 previous naming objects and raw bodies remain.
No additional live account/UI coverage is claimed.

Pass112 revisits proven exits exposed by final guard cleanup, replacing 13
generated labels across nine bodies with ordinary guards and alternatives.
There remain 207 generated plain block labels and six large labeled spans.
`BoardReconciliationSupport.reconcileBoardEntities` is now 339 lines with nine labels;
`SpriteState.drawSortedHalfBlendRgbTriangle` is 364 lines with seven. All 8,898
complete naming rules and ordered bindings stay unchanged; source-byte and
native evidence covers the documented transforms and probe scopes.

Pass111 added 26 class roles and 265 field/method/parameter names without changing
raw bodies or earlier naming rules. Audio codebook/residue/mapping state and the
instrument synthesizer now have named fields and direct methods. Rendering
strategies share `drawWidget`, and widgets exposing validation share
`getValidationProvider`. The slider supports multiple handles through
`GrowableIntList`; skin flushing draws the preceding composed state before an
overlay. Login payload classes describe their exact byte layouts rather than
guessing the purpose of encoded text.
Use the one current `readable/geoblox/src` preview; numbered previews are obsolete.
These are useful entry points for the newly named families:

| Role | Classes |
|---|---|
| Applet and frame scheduling | [GameApplet](geoblox/src/GameApplet.java), [SessionGameApplet](geoblox/src/SessionGameApplet.java), [FrameTimer](geoblox/src/FrameTimer.java), [NanoFrameTimer](geoblox/src/NanoFrameTimer.java) |
| Collections and cache | [IntrusiveNodeHashTable](geoblox/src/IntrusiveNodeHashTable.java), [IterableNodeHashTable](geoblox/src/IterableNodeHashTable.java), [NodeHashTableIterator](geoblox/src/NodeHashTableIterator.java), [SecondaryNodeDeque](geoblox/src/SecondaryNodeDeque.java), [WeightedObjectCache](geoblox/src/WeightedObjectCache.java) |
| Editable text and geometry | [TextInputWidget](geoblox/src/TextInputWidget.java), [ValidatedTextInputWidget](geoblox/src/ValidatedTextInputWidget.java), [TextWidgetRenderer](geoblox/src/TextWidgetRenderer.java), [TextLayout](geoblox/src/TextLayout.java), [TextLayoutLine](geoblox/src/TextLayoutLine.java), [CachedTextLayout](geoblox/src/CachedTextLayout.java) |
| Validation | [ValidationProvider](geoblox/src/ValidationProvider.java), [DebouncedValidationProvider](geoblox/src/DebouncedValidationProvider.java), [ValidationState](geoblox/src/ValidationState.java), [EmailValidator](geoblox/src/EmailValidator.java), [AgeValidator](geoblox/src/AgeValidator.java), [PasswordValidator](geoblox/src/PasswordValidator.java) |
| PCM and MIDI | [PcmStream](geoblox/src/PcmStream.java), [PcmStreamMixer](geoblox/src/PcmStreamMixer.java), [DelayedPcmStream](geoblox/src/DelayedPcmStream.java), [MidiPcmStream](geoblox/src/MidiPcmStream.java), [MidiNote](geoblox/src/MidiNote.java), [MidiNoteMixer](geoblox/src/MidiNoteMixer.java) |
| Sound loading and synthesis | [SoundSampleCache](geoblox/src/SoundSampleCache.java), [SynthesizedSoundEffect](geoblox/src/SynthesizedSoundEffect.java), [SoundEnvelope](geoblox/src/SoundEnvelope.java), [SoundFilter](geoblox/src/SoundFilter.java), [PcmResampler](geoblox/src/PcmResampler.java), [JavaSoundAudioOutput](geoblox/src/JavaSoundAudioOutput.java) |
| Decoding and synthesis internals | [VorbisCodebook](geoblox/src/VorbisCodebook.java), [VorbisResidue](geoblox/src/VorbisResidue.java), [VorbisMapping](geoblox/src/VorbisMapping.java), [SynthesizedSoundInstrument](geoblox/src/SynthesizedSoundInstrument.java) |
| Checkbox, dial and slider | [CheckboxWidget](geoblox/src/CheckboxWidget.java), [DialWidget](geoblox/src/DialWidget.java), [MultiHandleSliderWidget](geoblox/src/MultiHandleSliderWidget.java), [GrowableIntList](geoblox/src/GrowableIntList.java) |
| Skins and validation queries | [StatefulWidgetRenderer](geoblox/src/StatefulWidgetRenderer.java), [WidgetSkinState](geoblox/src/WidgetSkinState.java), [ValidationProviderSource](geoblox/src/ValidationProviderSource.java), [EmailAvailabilityQuery](geoblox/src/EmailAvailabilityQuery.java), [UsernameAvailabilityQuery](geoblox/src/UsernameAvailabilityQuery.java) |
| Account panels | [LoginPanel](geoblox/src/LoginPanel.java), [DisplayNamePanel](geoblox/src/DisplayNamePanel.java), [AccountCreationForm](geoblox/src/AccountCreationForm.java), [AccountCreationDialog](geoblox/src/AccountCreationDialog.java), [AccountContentDialog](geoblox/src/AccountContentDialog.java), [Under13TermsPanel](geoblox/src/Under13TermsPanel.java) |
| Suggestions and text hotspots | [UsernameSuggestionsPanel](geoblox/src/UsernameSuggestionsPanel.java), [UsernameSuggestionListener](geoblox/src/UsernameSuggestionListener.java), [HotspotTextWidget](geoblox/src/HotspotTextWidget.java), [TextHotspotBounds](geoblox/src/TextHotspotBounds.java), [HotspotActivationListener](geoblox/src/HotspotActivationListener.java) |
| Status and auxiliary controls | [ValidationMessageWidget](geoblox/src/ValidationMessageWidget.java), [ValidationIconWidget](geoblox/src/ValidationIconWidget.java), [ProgressBarWidget](geoblox/src/ProgressBarWidget.java), [ProgressDialog](geoblox/src/ProgressDialog.java), [LabeledChildWidget](geoblox/src/LabeledChildWidget.java), [MessageDialogContent](geoblox/src/MessageDialogContent.java), [FullscreenErrorDialog](geoblox/src/FullscreenErrorDialog.java), [UnderlinedButtonRenderer](geoblox/src/UnderlinedButtonRenderer.java), [SpriteCheckboxRenderer](geoblox/src/SpriteCheckboxRenderer.java) |
| Login payloads | [LoginPayload](geoblox/src/LoginPayload.java), [LongAndTextLoginPayload](geoblox/src/LongAndTextLoginPayload.java), [TextPairLoginPayload](geoblox/src/TextPairLoginPayload.java), [AlternateLongAndTextLoginPayload](geoblox/src/AlternateLongAndTextLoginPayload.java), [LoginMethod](geoblox/src/LoginMethod.java) |
| Archive, collections and raster records | [ArchiveLoadStep](geoblox/src/ArchiveLoadStep.java), [ArchiveLoadSequence](geoblox/src/ArchiveLoadSequence.java), [SecondaryNodeHashTable](geoblox/src/SecondaryNodeHashTable.java), [RasterTargetSnapshot](geoblox/src/RasterTargetSnapshot.java), [DisplayModeInfo](geoblox/src/DisplayModeInfo.java), [TrackedPcmStream](geoblox/src/TrackedPcmStream.java) |
| Ranking and protocol records | [HighscoreQuery](geoblox/src/HighscoreQuery.java), [HighscoreNameEntry](geoblox/src/HighscoreNameEntry.java), [ReflectionCheckRequest](geoblox/src/ReflectionCheckRequest.java), [DelayedIncomingPacket](geoblox/src/DelayedIncomingPacket.java), [CrcAcknowledgedPacket](geoblox/src/CrcAcknowledgedPacket.java), [LoginTextValue](geoblox/src/LoginTextValue.java), [ClientProtocolStage](geoblox/src/ClientProtocolStage.java) |
| Score and typed query records | [ScoreSubmission](geoblox/src/ScoreSubmission.java), [IntArrayQuery](geoblox/src/IntArrayQuery.java), [KeyedIntRecordSubmission](geoblox/src/KeyedIntRecordSubmission.java), [ByteShortQuery](geoblox/src/ByteShortQuery.java), [RankedListQuery](geoblox/src/RankedListQuery.java), [FifoResponseToken](geoblox/src/FifoResponseToken.java) |
| Social entries, resize and property overrides | [SocialListEntry](geoblox/src/SocialListEntry.java), [CanvasResizeController](geoblox/src/CanvasResizeController.java), [CanvasResizeListener](geoblox/src/CanvasResizeListener.java), [VisualPropertyOverrides](geoblox/src/VisualPropertyOverrides.java), [VisualPropertyNode](geoblox/src/VisualPropertyNode.java) |
| Templates and theme | [TextTemplateDefinition](geoblox/src/TextTemplateDefinition.java), [TextTemplateDefinitionLoader](geoblox/src/TextTemplateDefinitionLoader.java), [TextTemplateArgumentType](geoblox/src/TextTemplateArgumentType.java), [WidgetTheme](geoblox/src/WidgetTheme.java) |
| Platform controls and markers | [DirectDrawFullscreenController](geoblox/src/DirectDrawFullscreenController.java), [WindowsCursorController](geoblox/src/WindowsCursorController.java), [FullscreenFailureReason](geoblox/src/FullscreenFailureReason.java), [DirectSoundCompatibility](geoblox/src/DirectSoundCompatibility.java), [TextValidationFailure](geoblox/src/TextValidationFailure.java), [ChildWidgetOwner](geoblox/src/ChildWidgetOwner.java) |
| Network and storage | [SocketConnector](geoblox/src/SocketConnector.java), [ProxySocketConnector](geoblox/src/ProxySocketConnector.java), [AsyncResourceDownloader](geoblox/src/AsyncResourceDownloader.java), [ByteStorage](geoblox/src/ByteStorage.java), [DirectByteStorage](geoblox/src/DirectByteStorage.java) |

Class names describe supported instance roles. Unrelated static helpers remain
on the same owners because obfuscation mixed them together. Pass123 names the
five previously held reflected implementations and maps their direct class
literals with explicit guards. Public reflection member contracts remain. Historical
sections retain their original pass counts and spellings; use the current symbol
dictionary to resolve those spellings.

## Following a theme change

Start at [GameplaySession.prepareNextTheme](geoblox/src/GameplaySession.java).
`completedThemeCount` selects an entry of `themeCycleOrder` through
`PasswordWidgetRenderer.getThemeForProgress`; render assets keep their existing
selector. [IntrusiveNode.selectThemeAudio](geoblox/src/IntrusiveNode.java) then
follows these operations in order:

| Operation | Definition and retained behavior |
|---|---|
| `prepareThemeMusic` | [IntrusiveDeque](geoblox/src/IntrusiveDeque.java): load the selected score, prepare instrument samples and mark its flag; the Boolean preparation result remains ignored |
| `prepareThemeSoundSamples` | [PacketBuffer](geoblox/src/PacketBuffer.java): prepare matching unmarked sample slots, using Vorbis for indices 10–26 and synthesis otherwise, then resample in place; release the resampler only after all 33 flags are set |
| `releaseMarkedThemeMusicPreparation` | [LoginMethod](geoblox/src/LoginMethod.java): once all seven music flags are marked, clear score/patch archives, encoded patch sample IDs and the temporary sample cache |
| `selectLoopingBackgroundMusic` | [IntrusiveNodeHashTable](geoblox/src/IntrusiveNodeHashTable.java): for a new nonnull score reference, stop previous playback, flush the output, set `currentMusicTrack` and start with looping enabled |

[SocketConnector.prepareInitialGameAudio](geoblox/src/SocketConnector.java)
prepares the title, game-over, sun and result scores first, then shared/sun sound
slots. These methods preserve their original ignored return values, guard effects
and failure ordering. The resource-name list has 34 entries, while the preparation
loops and sample/flag/theme arrays have 33; the final `round_clear` entry stays
unused by those loops. A marked music flag is not proof that instrument preparation
succeeded. This pass does not reconstruct missing assets or prove live playback.

[SoundSampleCache](geoblox/src/SoundSampleCache.java) has separate synthesized and
Vorbis acquisition paths. Named lookup resolves whether the resource is a file in
an unnamed group or a group with an unnamed file. ID lookup retains the original
single-group/single-file contract. Synthesized PCM is cached before the byte-budget
deduction; Vorbis retains a resumable decoder until completion, then unlinks it
and caches PCM under its original key. Guard checks, hash masks and partial effects
remain in place.

[PcmSample.resampleInPlace](geoblox/src/PcmSample.java) keeps the same sample object
while replacing its bytes, rate and loop positions through
[PcmResampler](geoblox/src/PcmResampler.java). Equal rates keep the original byte
array. Other rates use the original 14-tap fixed-point filter, signed accumulator
arithmetic, rounding and clipping. Position scaling keeps the six-sample delay;
distinct endpoints that become equal still decrement `loopStart`. These names
change no numeric operations or sample output.

## Earlier reconstruction

The previous reconstruction converted 78 terminal labeled exits to ordinary loop
breaks and removes 38 unused labels/blocks across 28 files, saving 76 lines.
It proves an empty continuation from the nearest loop to the same plain block
end; intervening work, other loops/switches and protected boundaries refuse the
rewrite. Inner cleanup and declaration scopes remain. `Sprite.rotateNearest`
now has no generated block labels. Gameplay
render/update and board reconciliation each lose one label. All 8,439 complete
naming objects, 66,223 edits and ordered binding identities are preserved.
After pass102/103, 267 generated plain block labels remained across the source tree.

Pass103 turns fourteen leading conditional loop exits into
ordinary while conditions across eleven files, saving 42 lines. Original
predicates stay under logical negation; nonconstant proof protects Java
reachability. Scope, effect/exception order, cleanup and continue targets remain.
`Sprite.rotateNearest` is now 526 lines, `GameplaySession.updateSession` 638 and
the sorted half-blend triangle 385. This pass preserves every naming object and
ordered binding identity. Its 96,768 generic native comparisons and six
independent entry/NaN/cleanup oracles pass along with all six game probes.
Other mixed-effect and multi-destination continuations still need reconstruction.

Pass104 replaces 25 effectful conditional plain-block exits
with ordinary `if/else`, removes 15 unused labels/braces and saves 30 lines across
17 files. Original predicates/effects and nested scopes remain; the skipped
remainder becomes the else arm. Empty normal continuations are proven without
crossing protected or loop/switch boundaries; direct remainder declarations and
ambiguous targets refuse reconstruction. Avatar animation is now 432 lines and
music decoding 321, each with zero generated block labels. No control flag or
apparently stable field is assumed constant. The 24,192 new generic native
comparisons and six independent effect/cleanup/monitor/failure checks pass.
Ending/crying lifecycle and whole-game equivalence remain unverified.

Pass105 removes 525 identity reference casts across 170 files/423
bodies. A unique ordinary-block local cast back to its exact declared type now
appears directly, with its static type, scope and evaluation preserved. Necessary
casts, primitive conversions, postfix operations, field/formal assumptions and
Object round trips remain. All 8,439 complete naming objects survive. Only 515
cast-type class references disappear, including 32 formerly renamed occurrences;
all remaining bindings preserve their ordered identities. The 2,880 generic
native comparisons, seven independent checks and 24 identical compiled
instruction/exception-table pairs verify the supported cleanup family.

A catch-only loop-boundary prototype found no candidates, so exception-region
exit rules were not relaxed. Pass106 instead reconstructs two scalar dispatch
ladders as ordinary switches: menu actions and loading-theme selection. The
numeric IDs, original action order, conditional exits and intentional fallthrough
remain for both control-flag partitions. Pure comparisons use captured int
locals; no flag is assumed zero. Nineteen labels and 65 lines disappear, with
31 classifier reads replaced by 15 reads of the same four local identities.
All other ordered bindings and complete override pairs remain. Its 61,152 native
comparisons test both the rewrite and frame cleanup, with ten independent checks.

Pass107 specializes 97 repeated guards whose captured int value is established
by preceding branches. Later/cyclic writes invalidate facts. Selected scopes and
transfer targets remain; Java completion proves unreachable suffixes with loop/
label ownership and finally overrides. No field or global flag is assumed stable.
Thirteen labels and 384 lines disappear. All 8,439 names/local ordinals remain;
277 removed references are attributed to dead predicates/arms/suffixes, and all
surviving bindings keep ordered identities. The 16,560 native comparisons and
twelve independent checks validate the supported recovery family.

There remain 220 generated plain block labels. Twenty method/constructor spans
have at least 300 lines, six with generated block labels. The 3,042-line
interface text-loader span includes three nested helpers, so these are overlapping
spans, not a count of unique state machines. The six large labeled bodies are
listed below, alongside the shortened menu dispatcher for comparison.

| Method | Lines | Block labels |
| --- | ---: | ---: |
| `GameScreen.renderScreen` | 304 | 4 |
| `GameScreen.updateScreen` | 328 | 6 |
| `GameScreen.activateMenuItem` | 277 | 4 |
| `GameplaySession.renderSession` | 357 | 11 |
| `GameplaySession.updateSession` | 631 | 13 |
| `BoardReconciliationSupport.reconcileBoardEntities` | 345 | 11 |
| `SpriteState.drawSortedHalfBlendRgbTriangle` | 372 | 11 |

Every field, method, parameter and local in GameScreen, MenuScreen and
GameplaySession now has a guarded name, with constructor names supplied by their
class rules. Geoblox declarations also have semantic names; its class/constructor/
init lifecycle spellings remain original. Other shared helpers and mixed-effect
exits remain. Larger reconstructions need
proofs for intermediate loops/protected regions and multiple continuations;
control flags are not assumed constant. The retained 16,128-case guard-tree
comparison, 11,520-case terminal-loop comparison, new 96,768-case leading-loop
comparison with six independent oracles, the new 24,192-case effectful-exit
comparison with six independent oracles, the new 61,152-case scalar dispatch
comparison with ten independent checks, the 16,560-case path-guard comparison
with twelve independent checks, and seven recorded native probes
establish controlled behavior only.
Complete assets/gameplay and browser/phone memory/startup/FPS targets remain
unverified. Sections
labeled with earlier passes below describe their historical counts and scope.

## Gameplay achievements and submission (passes 108–109)

Read `ra.recordAchievement(checkByte, guard, achievementId)` first. Tutorials
and already-earned bits return immediately. A new achievement sets the newly
earned mask, increments the session count, updates tracking bits/accumulator if
not already tracked, sets the earned mask and queues a `PendingActionMarker`.
A first notification calls `EntityCollisionSupport.preparePendingActionPanel`; subsequent notifications
wait in order. `lh.updatePendingActionPanel` moves the panel through phase 0
(entering), 1 (holding) and 2 (exiting), then consumes the marker and prepares
the next one. Title text comes from `GameplaySetupSupport.achievementTitles[actionId]`.

When the session permits submission, `AchievementSubmission` captures the ID,
caller-supplied check byte and four tracking integers. Normal gameplay supplies
`255 ^ achievementId` as the check value. Keep the full int in source: truncation
occurs at packet writing, and guards/nonstandard callers retain their effects.
`je.updateAchievementSubmissions` also imports a received achievement mask into
the earned mask and removes its bits from the newly earned mask, then drains
pending records when login permits. `sj.submitAchievementRecord` first moves the
same record into `ResourceArchive.unacknowledgedAchievementSubmissions` and then
calls `ol.writeAchievementSubmissionPacket`.

| Packet part | Bytes | Meaning supported by client source |
| --- | ---: | --- |
| Ciphered opcode | 1 | Caller-supplied opcode plus cipher value |
| Backpatched length | 1 | 23-byte payload length |
| Version | 1 | Literal 1 |
| Achievement ID | 1 | Low byte of record ID |
| Check value | 1 | Low byte of caller-supplied check value |
| Tracking bits | 4 | Big-endian snapshot of `AttachedEntityRenderer.achievementTrackingBits` |
| Tracking accumulator | 4 | Big-endian snapshot of `UiWidget.achievementTrackingAccumulator` |
| Primary tracking counter | 4 | Big-endian snapshot from `AwtRasterBuffer` |
| Secondary tracking counter | 4 | Big-endian snapshot from `lb` |
| CRC32 | 4 | CRC over the preceding 19 payload bytes |

`AchievementQuery` is the pending request/result holder. Read
`cf.requestAchievementState`, `re.writeAchievementStateRequest` and
`LoginPayloadKind.ensureAchievementStateRequested` for request creation and the
singleton used by mask import. A request queues its holder before guard division
and writes ciphered opcode, version 1 and subtype 2. `AchievementProtocolSupport.resendAchievementMessages`
resends retained submissions followed by one request per pending query; neither
queue is consumed. This order and ownership matter during retries.

`AchievementProtocolSupport.handleAchievementResponse` reads one subtype byte:

| Subtype | Input and queue effects |
| --- | --- |
| 0 | Reads byte count and big-endian ints into an eight-value array before checking the queue; stores values/completion/first mask and unlinks the oldest query. |
| 1 | Unlinks the oldest unacknowledged submission. |
| 2 | Stores eight zero values/zero mask, completes and unlinks the oldest query. |

Empty queues close the session socket; unknown types log and close. Those paths
use `Bzip2DecoderState.closeSessionSocket`, which keeps its original guard effect
on avatar contact state. Real socket closure and unknown-type logging remain
unverified. Counts above eight consume the ninth int before an array-bounds
failure, leaving packet position 38 and the query unresolved; do not silently
clamp the count or move the queue check before reading values.

`je.updateAchievementSubmissions` imports a completed singleton mask once,
removes its bits from the new mask and merges them into the earned mask, then
conditionally drains pending submissions using the existing login gate.
`AchievementQuery.hasReceivedAchievementSixteen` requires a positive mask as well
as bit 16. Keep that signed comparison even though the predicate name identifies
the bit. Input handling mutates tracking counters/accumulator and combines
tracking bits with upper bits; their names describe client operations, not a
complete server validation algorithm.

Pass108 added 64 identities; pass109 adds 53 query/response/retry identities.
Both retain all prior complete objects. The original fixed native/raw/readable
trace covers 864 registration cases and 108 packet/CRC checks. An additional
284-case trace verifies response order/counts, two-round retries, enqueue-before-
guard failure and controlled received-mask import. The probe uses in-memory
packets/queues, controlled flags and a null socket; it preloads a title notification
so fonts/assets and empty-panel preparation remain outside its scope. The seven
recorded game probes establish controlled behavior. Full login/reconnect/timing,
live networking/server, assets/gameplay and browser/phone performance remain
unverified. Static helpers stay on their original owner, including mesh projection
on the submission class and cookies on the query class; class names describe
instance roles.

## Menu to gameplay

`Geoblox.initializeScreens` constructs the nine `GameScreen` controllers.
`Geoblox.updateGame` dispatches to the committed screen or
`GameplaySession.updateSession`; `Geoblox.renderFrame` dispatches the matching
render call. `currentScreenId` and `requestedScreenId` are distinct.
`screenTransitionTick` commits the requested screen at tick 160. A screen
ID of -1 selects the existing gameplay branch. Numeric IDs and sentinel values
remain intact.

`MenuScreen` handles selection and hit testing. Its overridden activation/input
methods have matching names in `GameScreen`, preserving the virtual contracts.

## Pointer frames and drag/drop routing

`UiWidget.processPointerFrame(pointerEventsAvailable, methodGuard, parentX,
parentY)` calls `updatePointerState` first. Its boolean indicates whether pointer
events remain available to later widgets and becomes false when a press is
consumed. Focus clearing, focused wheel dispatch, press hit testing, release
routing, `previousUiPointerButton` and hover text preserve their original order.
Distinct released-drag references remain in the duplicated branches; source flags
are not assumed constant and no continuation is shared by this naming pass.

The complete `updatePointerState`, `handlePointerPress`, `handlePointerWheel`,
`handlePointerRelease` and `getHoverText` families now have named parameters.
`PointerHoverListener.onPointerInsideChanged` follows the hover write;
`KeyboardFocusListener.onKeyboardFocusChanged` follows the focus write.
`ButtonPointerListener` adds pointer press/release callbacks to activation.
Their coordinates keep original parent/world order, rather than being converted
into a new event object. A base press can record its button and return false;
the hover guard skips only the base hover work, not every subclass action.

`ButtonWidget.activateButton` sends `onButtonActivated` after release hit testing
or focused key84/83. Its text-hit subclass delegates first, then emits a second
hit-record callback. Its checkbox subclass toggles `active` before delegation.
Button release emits `onButtonPointerReleased` before checking `releaseGuard`
and before its own catch; callback failure therefore preserves the original
button state and exception coverage. `enabled`, `focusable`, `focused`, `active`,
pressed and hover fields retain distinct roles.

`DraggableWidget` maps to the original `la`. Left press captures `grabOffsetX/Y`
and publishes `activeDragWidget`; child-handled press priority and nonleft press
behavior remain. Each drag update uses pointer minus parent coordinates and grab
offsets, writes Y/X and then calls `DragMovementListener.onDragMoved`. When enabled,
`easeToLayoutPosition` approaches `layoutTargetX/Y` using the original integer
steps. Layout snapshots and Integer.MAX_VALUE sentinels remain. True hover guard
still writes the original target-Y54 side effect after superclass work.

`DropTargetWidget` maps to `fk`. It releases its child before checking the active
drag and its own bounds. Its own `DropListener` takes priority over the dragged
widget listener. `onDrop` receives target, dragged widget and guard; global drag
clears after the callback returns. The root's remaining-drag fallback uses a null
target. No finally clear, local merge or callback reordering is introduced.

`wheelRotationSnapshot` is shared by UI/gameplay after `mouseWheelInput` drains
its signed accumulator each frame. `MouseWheelInput` exposes attach/detach/drain;
the synchronized concrete `AwtMouseWheelListener` consumes AWT events after
accumulating rotation and resets only on drain. `createMouseWheelInput` maps its
direct class literal under the guarded policy. The AWT callback spelling remains.

Selected base/button/drag/drop/wheel bodies have all parameters and locals named.
Other subclass internals, repeated control-flow tails and unrelated statics remain
opaque. Compilation, binding/override comparison, reproduction, reversal and the
existing six native probes pass without new live pointer/drag/drop/wheel or
browser/device execution coverage.

## Widget ownership and focus

`UiWidget` is the original `el` base. Its `widgetText`, `renderer`, `listener`,
`pointerInside`, `hoverText` and `pressedPointerButton` have source-traced roles.
`WidgetRenderer` is the drawing-strategy interface; `WidgetListener` is the empty
callback marker. `ButtonActivationListener` defines the already named
`onButtonActivated` contract. `ButtonWidget` retains separate `enabled` and
`focused` flags; other button state is not collapsed into either.

`WidgetContainer` owns a deque of `children`. `addChild` appends to its tail and
retains its wrong-guard side effect after insertion. `SingleChildWidget` owns one
nullable `child`. Drawing/input/focus delegation preserve those distinct ownership
models. `setWidgetBounds` names the complete five-method override family, retaining
height, width, guard, Y, X order. `refreshLayout`, `refreshChildrenLayout` and
`refreshChildLayout` invoke the original virtual layout paths without reordering
writes, graphics allocations or exceptions. `containsPointer` uses inclusive
left/top and exclusive right/bottom bounds; wrong guard still returns true.

`hasKeyboardFocus` checks own/descendant focus; `clearKeyboardFocus` clears it.
`requestKeyboardFocus` preserves enabled/focusable gating, clearing the supplied
context before setting button focus, and original listener callbacks. Containers
search their children and decorative widgets still reject requests. The two
`findFocusTarget` signature families preserve child lookup and the dialog's
self fallback. Wrong-guard recursive and arbitrary-event paths remain unchanged.

`DialogLayer.showDialog` rejects non-dialog widgets, adds the dialog at the front,
marks it visible and requests focus. `getTopVisibleDialog` scans forward for the
first visible node; drawing scans in reverse. `hideAllDialogs` always clears
visibility but only its normal guard clears the current single child.
`advanceDialogAnimations` advances/removes eligible dialogs and then stores the
top visible dialog as current child. `settleDialogAnimations` uses the separate
snap/removal path. Shared UI font loading, cleanup and unrelated statics remain
on this class.

`DequeCursor` supports independent forward/reverse iteration over the intrusive
deques. `beginForward`, `nextForward`, `beginReverse`, `nextReverse` and the two
`begin...At` helpers snapshot the next neighbor before returning the current node,
so callers may unlink that current node. Both directions share `pendingNode`.
Its wrong guards, foreign-node starts and possible repeated-exhaustion null
failures remain; it is not a standard iterator replacement. Container predicates
now read `IntrusiveNode.isLinked`, which checks previous-node membership rather
than button enabled state.

All selected dialog-layer/cursor instance parameters/locals are named. Other
pointer/drag subclass internals, some numeric widget fields and colocated utilities
remain opaque.
The existing compile/binding/override, deterministic reproduction, reversal and
six native probes pass without claiming new live UI or browser/device coverage.

## Dialog transition implementation

`MessageDialog` now extends `ContentTransitionDialog`, which extends
`ResizableDialog`, which extends `FadingDialog`. These classes keep their unrelated
static utilities. Widget geometry reads `widgetX`, `widgetY`, `widgetWidth` and
`widgetHeight`; the original parameter order for layout remains height, width,
guard, Y, X. All 16 connected rendering implementations use `renderWidget` with
`parentX`, `parentY`, `methodGuard`, `renderPass`; pass handling still differs by
implementation.

`FadingDialog` owns `dialogVisible`, `dialogOpacity` and `dialogLayer`. Only the
visible top dialog targets opacity256. Animation rises/falls using the original
asymmetric integer steps. `advanceDialogAnimation` returns true when a hidden
dialog has reached zero opacity; `settleDialogAnimation` snaps first and returns
removal eligibility. The root layer unlinks dialogs on these returns. Wrong guards
and subclass account polling remain, so neither return simply means success.

`ResizableDialog.startResizeTransition` captures starting/target dimensions and
sets duration/cursor. Positive-duration animation uses quadratic integer easing;
nonpositive duration resizes/centers immediately. On the last tick,
`onResizeTransitionComplete` runs before applying the final size. Division,
overflow, sentinel writes and partial effects preserve the raw source.

`ContentTransitionDialog.replaceContent` writes `pendingContent` first. Idle or
fade-in starts `contentFadeOutPhase`; existing fade-out keeps its tick; an active
`contentResizePhase` restarts sizing. Fade-out hides the wrapper and starts
resizing. Resize completion calls `installContent` and enters `contentFadeInPhase`.
Installation unlinks the prior wrapper before construction/addition and clears
pending only afterward. Null content installs an empty wrapper. Phase tokens are
mutable singleton references: cleanup nulls them, rather than immutable enum
values. `finishTransition` always completes active content changes; its boolean
controls only superclass resize completion. The false case retains that asymmetry.

`OpacityWidget` wraps the dialog body. It draws nothing at opacity0 and delegates
directly at256. Intermediate opacity allocates a temporary sprite, draws the child
into it, restores the raster and alpha draws the result. These names expose the
allocation; this pass does not optimize it or establish actual frame timing.

All selected transition bodies have named parameters/locals. Untraced colocated
statics (including the original qf request factory), shared widget internals,
larger state-machine reconstruction and live dialog/browser/device behavior remain
unfinished or unverified. Full source/binding/override checks and the existing six
native probes pass without expanding those probes' execution scopes.

## MessageDialog and shared widget entry points

`MessageDialog` is the original `f` class. It owns the font/status panel, error
content and dismissal options; its static avatar/fullscreen/login/text/style
utilities remain colocated. All its own declarations have guarded semantic names,
while inherited widget implementation and related classes remain partly opaque.

`MessageDialogSupport.showMessageDialog` writes the login-dismiss option before checking guard480,
then creates/stores/registers the dialog for the correct guard. The constructor's
base/text-content work happens before its own catch. `dismissDialog` returns if
already invisible; otherwise it hides first, then gives `showRetryLoginOnDismiss`
priority over `showLoginOnDismiss`. Their existing follow-up helpers may call
dismissal again. Wrong guard still sets `retryButtonAction` before follow-up.

`installErrorContent` checks the one-shot flag then guard19810. It sets
`errorContentInstallationStarted` before status colors/new text/buttons, preserving
partial failure and exact numeric error/action IDs. Kind256 sets the retry-button
route; other installed kinds keep the existing display-name URL route.
`showConnectionRestoredContent` installs return-to-game action15 and retains its
optional canvas-clearing guard. The static `showLoginForm` dismisses the current
dialog before checking its own guard and creates the original login form options.

All 11 members of the `onButtonActivated` override family share that name.
The button emitter sends relative X/Y, guard-20, pointer-button ID and the button
object. Keyboard activation sends X/Y=-1 and button1. All 13 members of the
`handleKeyInput` override family share that name. MessageDialog's second argument
is `methodGuardOrDismissKeyCode`: it normally carries a guard, but this class also
compares it with the actual key code before dismissal. Those overload/virtual
contracts and diagnostic argument values remain unchanged.

`gameCanvas` is the shared applet canvas; cleanup/wrong guards can still null it.
`awaitingLoginLongState` is the identity token entered after the initial response,
then waiting for eight bytes before reading the login long. `loginHeaderInt` is
copied from initialization and serialized before the long/flags; its exact meaning
is not inferred. `requestFullscreen`, `getSharedUiStyle`, `isSignedDecimalInt`
and `releaseStaticReferences` name independently traced static roles, preserving
negative guards, overflow checks, initialization side effects and partial cleanup.

Compilation, full binding/override comparison, reproduction, dictionary reversal
and existing native gameplay traces pass. No new dialog, input dispatch, actual
login/server, fullscreen/thread or browser/device runtime coverage is claimed.

## Why the latest structural prototypes were discarded

A leading-break loop-header prototype found zero candidates in the pinned raw
bodies: the remaining large loops put their exits behind nested destinations or
effects. An alternate predicate-only guard prototype found one exception-helper
candidate (`sa.a`) and no large-body candidates. Both were removed; the decompiler
pin and raw corpus are unchanged by pass98. Their scans used independent JDK
body positions rather than inferred method spans.

The menu action ladder can enter several different destinations and then fall
through when the control flag is nonzero. It cannot be represented by an ordinary
exclusive switch without preserving that dispatch/fallthrough graph. Avatar tails
repeat equivalent-looking work under different local bindings and after prefixes
that can throw. Sharing them needs explicit binding/exception proof. The next
structural work should reconstruct those destination/continuation relationships
and verify both control-flag paths, rather than hoisting tests across effects or
assuming zero. The ten large labeled bodies remain in the current inventory.

## Avatar ending state and branch snapshots

Both avatar updaters now name every parameter/local, including all 67 shock/tint
old-value snapshots. A `ShockTicksSnapshot` is copied before decrement; a
`TintTicksSnapshot` likewise retains the old fade timer. `TintWithoutShockSnapshot`
and `TintAfterShockSnapshot` belong to separate original shock alternatives.
Gameplay prefixes `held`, `steered` and `stepped` distinguish the old frame-step
countdown>=0 branch, the expired-timer direction!=1 branch and the shared remainder,
respectively. Menu prefixes distinguish blink reset, steering, neutral and the
original left-path fallback tests. Repeated or contradictory predicates remain;
the renamer does not fold them or assume shared fields stay constant.

`avatarCryPhase` starts at0; `avatarCryFrameCursor` starts at0. While the session
ends, each blink-clock multiple of18 updates the cry sequence. Phase0 cycles the
four begin frames until `endingEntityScanClear` permits a transition to1, resets
the cursor, queues the existing sound and increments the cursor. Phase1 consumes
middle frames until its length check fails, then increments the phase and sets
feedback hold200. Other phase values cycle the four end frames. Negative cursors,
integer overflow, null arrays and external phase values keep their original behavior.

`EndingAnimationSupport.advanceEndingEntityAnimations` sets `endingEntityScanClear=true`, scans attached
entities before transient entities and advances each with the original true argument.
Observing attached kind6 or transient kind5/7/8 clears the flag, including when that
entity reaches frame>=3 and joins the available queue in the same pass. The flag
describes this scan, not empty queues. Guard arithmetic occurs between the scans
and can fail after attached effects. `od.isAvatarCryHoldExpired` returns true only
for phase2 and hold<0; its wrong guard still clears its unrelated static string.
The session checks the prior scan flag, cry hold and sceneAnimationTick>1000
before advancing the next scan/avatar update.

`BoardReconciliationSupport.sessionStartAttemptCount` increments before difficulty reset and constructing
the next session; failure after that write does not roll it back. Its zero check
participates in the first-session tutorial decision. Board reconciliation's catch
aliases also have names, completing every parameter/local in that method.
`detachKeyboardListener` removes the key listener outside its catch, then only
guard0 removes the focus listener and writes the keyboard-reset sentinel. Guarded
static cleanup evaluates its residue before clearing its text reference.

The existing gameplay probe preserves active-session animation oracles and all
its pinned traces. It sets sessionEnding=false, so it does not prove the complete
cry/ending scan/exit sequence. No new runtime coverage is claimed. Compilation,
binding comparison, reproduction and reversal preserve both303-file corpora.
Repeated tails still have distinct local bindings; simplifying them requires a
separate structural proof, including partial effects if a sprite or sound fails.

## Client/session completion and public control flag

`Geoblox` now names every own field, parameter and local; its already semantic
class, constructor and `init` lifecycle spellings stay original. Archive polling
and frame rendering name their copied archive/text/boolean/canvas arguments.
`nextScreenTransitionTickSnapshot` retains the original increment result used
to commit at tick160. Reused `uiServiceResultOrOverlayMode` holds the service
result before the inherited overlay-mode result; discarded readiness calls and
unused control snapshots retain their side effects.

`canvasCreationTimeMillis` is the volatile adjusted-millisecond timestamp written
after canvas creation and compared against1000 in the applet paint path. The
initial0 and wrong-render-guard -11 sentinels remain. `activeMessageDialog` is
the `MessageDialog` UI dialog created with message/font/container data, dismissed by its
visibility method and replaced with connection-restored content when required.
Its own declarations are named; inherited/shared widget internals remain opaque.

`longAndNameLoginType` is the `LoginPayloadKind` singleton with `wireId`2,
returned by `lf`'s kind method. That payload writes a long then Base38 text;
the login writer reads the chosen kind ID and the response path compares kind
identities. The names expose this payload shape while retaining numeric IDs,
identity, guard/null handling and the throwing `toString`. They do not infer
the long's meaning or establish a complete login protocol/server implementation.

`Geoblox.clientControlFlowFlag` maps back to original `field_C`. Its 325 bound
occurrences across141 files control many zero/nonzero branch and loop paths.
The only explicit bound write in the corpus is after achievement/instruction
text loading: when `ch.field_h` is true, the loader increments its original
snapshot and stores it. The public field's default and externally supplied
values remain arbitrary; reconstruction/naming does not assume it is zero.
Earlier historical sections may refer to its original spelling.

All `GameplaySession` declarations are also named. Result-sequence carriers
`comparisonLeftColumnOrZero`, `comparisonRightWidthOrPixel` and
`rowStartOrMusicGuard` retain their comparison/row/music roles. Its static
`releaseStaticReferences` and private `runGuardedStaticCleanup` retain their
original offset/host/pointer-idle effects. `tryOpenUrlWithWindowsShell` is a
colocated static utility; Windows/URL/whitelist/guard/catch behavior is unchanged
and the shell operation is not invoked by this pass.

All six existing native/raw/readable probes retain their frozen traces after
these names, including nonzero global-flag fixture paths. Their controlled
coverage does not newly exercise the complete client lifecycle, message/login
flows, actual assets/servers, Windows shell or browser/phone performance.
Compilation, binding comparison, full reproduction and dictionary reversal also
pass; large labeled bodies and opaque shared classes remain.

## Base menu selection and pointer repeat

`MenuScreen` stores `hitLeftX`, exclusive `hitRightX`, `firstItemY`, `itemSpacing`
and `itemCount`. Its hit test computes the row only inside that strip and returns
-1 for a miss; the original wrong guard still returns 81 inside the strip.
Its constructor assigns the five layout arguments without adding validation.
`renderScreen` walks rows at the original spacing and calls the virtual
`renderMenuItem` with selection equality. The wrong render guard still calls
`updatePointer(false)` first.

`updatePointer(pointerUpdateGuard)` handles press coordinates before held-repeat
or hover coordinates. A successful fresh press selects the hit item and passes
`initialClick = !pointerUpdateGuard`; false guard also changes the left bound to
56. Held-repeat uses the selected item and current pointer snapshots. Hover
misses preserve keyboard selection while `keyboardSelectionActive` is true.
Original receiver/control snapshots remain even when unused. Nothing here
normalizes the guard into a conventional event flag or changes hit boundaries.

`handleMenuPointer` immediately activates button 1 or decreases the menu value
for other buttons, then initializes `s.menuPointerRepeatCountdown` from
`lj.menuPointerInitialRepeatDelay`. Held-repeat decrements the countdown and
repeats at zero or below, resetting from `fj.menuPointerRepeatInterval`.
`initialClick` clears keyboard selection after these actions.
`da.configureMenuPointerRepeat(rateScale, baseInitialDelay)` computes
`baseInitialDelay * rateScale / 50` and `rateScale * 4 / 50`, respectively;
Geoblox passes `(150, 20)`, giving 60 and 12. Integer overflow/truncation and
nonpositive arguments remain unchanged; these values are not FPS measurements.

The static indexed-frame wrapper resolves `groupName` then `resourceName` and
calls `NetworkArchiveRequest.loadIndexedSpriteFramesById` with file ID before
group ID. That helper decodes the archive sheet, then builds indexed frames.
Both keep their early null return for false guards and original failure context.
The three otherwise unrelated static base-menu fields now identify their roles:
`platformTaskDispatcher`, `appletStopDeadlineMillis` and `introTintGreenDelta`.
The deadline belongs to applet lifecycle; the tint delta belongs to the intro,
not an instance menu animation. These names have compile/binding/reversal proof,
with no new dynamic menu/repeat, actual assets, lifecycle/thread or device coverage.

## Menu rendering and tutorial curtain

`GameScreen.renderScreen(methodGuard)` checks the original `-28750` guard,
draws the scrolling background, then selects the panel/title/overlay/tutorial
branch by `screenId`. `panelTop`, `panelWidth` and `panelHeight` name its main
panel dimensions; the helper receives Y before X. Separate membership, unavailable, acceptance and fallback
alpha carriers preserve the four `activeTicks`/200 branch results. Fullscreen
prompt/countdown text and button left/center/width slots describe their draw calls.
The shared `panelLeftOrTextYOrOverlayAlphaOrCurtainX` stores panel X, text Y,
overlay alpha and curtain X at different points. Pass94 corrects the two
misleading axis names from pass93 by tracing the panel helper implementation;
these slots do not represent independent state.

`drawScrollingMenuBackground(setTutorialOffsetGuard)` tiles background and
foreground sprites with separate `backgroundScrollX/Y` and `foregroundScrollX/Y`
fields. `tileX` and `tileY` retain the original directional loops. Its true guard
still assigns curtain offset 124; callers and signed remainder behavior remain.

Tutorial page actions copy `tutorialPageIndex` to `previousTutorialPageIndex`,
then increment/decrement the destination and set `tutorialSlideForward` and
`tutorialSlideActive`. `advanceTutorialSlide(methodGuard)` advances
`tutorialSlideOffset` by eight when the existing gates permit it, ending beyond
640 plus curtain height. `renderScreen` clips the outgoing/current page around
that offset and draws the curtain. `renderingPreviousTutorialPage` is true only
around the outgoing page's inherited menu render, selecting its saved page index.

`renderTutorialPage(methodGuard, pageIndex)` draws the five tutorial text/sprite
variants, saving/restoring `savedTutorialClipBounds`. Orbit positions, rotation
angles, paragraph text and line spacing are named. Reused slots such as
`orbitXOrPageIndexOrLineHeight` deliberately expose their multiple roles.
The `-45` pointer-guard page assignment, other guard side effects, control flags,
clip order and diagnostic strings remain unchanged. These are source-audited
names with compile/binding/reversal checks; dynamic menu/tutorial execution,
actual assets and browser/phone performance are not newly verified.

## Screen input, press feedback and score rows

`fullscreenDialogActive` selects the dialog overlay/input route.
`fullscreenDialogButtonIndex` selects keyboard button 0/1; -1 uses pointer hit
testing. `previousPointerX/Y` remember the previous live snapshot. Any movement
clears the keyboard dialog selection. The acceptance overlay still expires
through the original `activeTicks > 1500` check and fullscreen-state gates.
`handleScreenKey`, `handleMenuKey` and `updateScreen` retain their original,
sometimes different, click/hover rectangles and all sentinel/control paths.

Menu activation starts `menuPressAnimationActive` unless
`suppressPressAnimationFlag` is set for an unavailable tutorial slide action.
`advanceMenuPressAnimation` decrements `menuPressOffset` to -4, clears the flag,
then returns the offset toward zero. Selected menu rows add that displacement
to text/panel X and subtract it from panel Y. `renderMenuItem` names the button
geometry, action text, outgoing/current page snapshot and slider level/position.
Its reused `itemColumnOrPressOffset` and `volumeLevelOrSliderOffset` remain
explicit. Tutorial curtain advancement waits for zero offset and a cleared flag.

`skipUnavailableTutorialItemsForward/Backward` repair selection after the
original increment/decrement paths. `hitTestMenuItem` names its returned hit/miss
carriers while preserving strict rectangles and the wrong-guard -109 result.
The paired-right footer condition still compares pointer Y with 518; naming
this suspicious expression does not change it. Music/effect volume actions
retain their original ten-step/end-point arithmetic and music-preview stream.

`renderHighscoreList` draws up to ten category rank/name/score rows, the first
eligible current-score highlight, optional unlisted current score, and original
loading/service/friend messages. Null arrays, signed score/absolute-value
boundaries and source guard effects remain. `inputDerivedStateBranch` describes
the two input-derived modulo branches at the end of `updateScreen`; their
purpose is not inferred and their shared-state writes remain.

Tutorial demonstration fields name category/variant selection, tick/drop/orbit,
effect frame and tint arithmetic. `tutorialStarFrameOrColorIndex` is shared by
page4's star frame and page3's color index; red/green masks and float rounding
are preserved. `decodeNonzeroTextByte` is a static utility colocated with the
screen class. `errorReportApplet` is shared error-report state used to obtain
`clienterror.ws`'s code base, separate from the instance `gameApplet`.
These are source-audited names verified through compilation, binding comparison
and dictionary reversal, with no new dynamic menu/tutorial/asset/device coverage.

## Gameplay graphics and theme selection

`Geoblox.prepareGameAssets` loads the game resources through named wrappers:
`ScorePopupSupport.loadSprite`, `wj.loadSpriteFrames`, `jg.loadIndexedSprite`,
`w.loadPaletteFont` and `gi.loadBitmapFont`. Their arguments distinguish
`groupName`, `resourceName`, glyph graphics and font metrics archives. The
resolved `archiveGroupId` and `archiveFileId` locals retain their original
lookup and failure order; sentinel guard arguments remain explicit.

`geometrySourceFrames` supplies the seven theme/category groups. The ordinary
kind-zero sprite table is `ke.entitySpritesByThemeCategoryAndVariant`;
kind one uses `s.geometrySpritesByThemeAndCategory`, and kind two uses
`MenuScreen.amorphousFramesByThemeAndVariant`. `jg.themeSpriteColors` tints the
variant dimension; `themeCycleColors` supplies the animation interpolation
sequence. Original kind IDs and array dimensions remain intact.

Avatar graphics now read as `avatarEyeFrames`, `avatarMouthFrames` and
`avatarCryBeginFrames`/`avatarCryMiddleFrames`/`avatarCryEndFrames`, with the
Halloween source overrides retained. `blackOrbFrames`, `silverStarFrames`,
`sparkleFrames`, `bangFrames` and the other effect arrays keep their original
frame selection and reset behavior.

`cd.selectThemeRenderAssets` chooses `MatchScoringSupport.selectedThemeForeground` and
`mf.selectedThemeBackground` for the committed `GameScreen.selectedThemeId`:

| Theme ID | Resource group |
| --- | --- |
| 0 | jewels |
| 1 | sun |
| 2 | sweets |
| 3 | germs |
| 4 | baking |
| 5 | sports |
| 6 | space |

The renderer rotates the chosen foreground into
`jf.rotatedThemeForegroundRaster` using `boardAngleRadians`, and draws the
chosen background at `(0,0)`. The original `jewls_foreground` and
`jewls_background` resource spellings stay unchanged.

`dd.uiPaletteFont.colorPalettes` makes HUD highlight updates readable;
`kh.screenTitleSprites` retains the nine original screen indexes.
`GameplaySession.showGameOverOverlay` is distinct from `sessionEnding`: it
moves the score box and displays the title loaded from `gameover_title` at
index six. Asset identity and use support these names; successful complete
archive loading and real-asset rendering remain outside the native fixtures.

## Sprite and raster drawing

`SoftwareRasterizer.setRasterTarget` installs the pixel buffer, framebuffer
stride and `framebufferHeight`, then resets the clip. `setClip` clamps its edges
to the target bounds; `intersectClip` tightens the current clip. `saveClip` and
`restoreClip` use left, top, right and bottom in that order. Restoration retains
the original raw bounds. `clearFramebuffer` clears the whole target, regardless
of its clip. `releaseRasterStorage` releases its retained arrays.

`SpriteState.fullWidth`/`fullHeight` describe the logical canvas; `width`/`height`
describe cropped pixels and `trimX`/`trimY` place them within that canvas.
`IndexedSpriteState` exposes the corresponding geometry for `IndexedSprite`.
The preparation locals `geometryCanvasHeight` and
`geometryCanvasWidthThenFrameIndex` replace the earlier ambiguous names.
The latter is still reused as a frame index later in the original method.
`Sprite.setAsRasterTarget` uses actual pixel dimensions. The distinct
`Geoblox.setRasterTarget` helper retains its original full-canvas arguments.

| Operation | RGB `Sprite` | `ArgbSprite` |
| --- | --- | --- |
| `draw` | Skips zero-colour pixels | Blends stored per-pixel alpha |
| `drawUnmasked` | Copies pixels including zero | Still blends stored alpha |
| `drawAlpha` / `drawScaledAlpha` | Uses `alpha256` | Combines global and stored alpha |
| `drawGrayTinted` / `drawGrayModulated` | Remaps gray pixels | Remaps gray pixels and blends stored alpha |

`drawScaled`, `drawHalfSize` and `drawQuarterSize` keep the original sampling,
trimming and clipping formulas. `drawAdditive` retains each implementation's
channel saturation and alpha arithmetic. The complete overridden method
families share names; no RGB assumptions are imposed on their ARGB variants.
`IndexedSprite.draw` and `drawAlpha` use palette indexes with zero transparency.
`drawRunEncoded` additionally interprets the original -1 skip-run marker.

Clipped wrappers now name `sourceIndex`, `destinationIndex`, `drawWidth`,
`drawHeight`, row skips and `clippedEdgePixels`. Raster APIs distinguish
`drawCircle` from `fillCircle` and name rectangles, lines, gradients and rounded shapes. Original clipping,
rounding, guard and invalid-input behavior remains; these names do not change
alpha ranges or fix edge cases. Controlled native fixtures exercise drawing,
but whole-game rendering with real assets remains unverified.

All 23 private static sprite kernels now have guarded names. `blitColorKey`
and `blitUnmasked` distinguish skipped zeros from copied zeros;
`blitColorKeyAlpha` and `blitArgbAlpha` distinguish global and combined alpha.
The scaled counterparts name `sourceX16`, `sourceY16`, `stepX16`, `stepY16` and
`sourceRowOffset`. Gray and additive kernels name their channel products,
blend weights and carry scratches. `sourceReadIndex` and
`destinationWriteIndex` retain snapshots taken before post-increments; numbered
copies follow declaration order, preserving the original unrolled loops.
`widthThenNegativeTail`, `quadOrTailCounter` and
`trimStepsThenDestinationIndex` make reused storage explicit rather than
inventing separate variables. `blitPaletteRuns` retains the marker and row-start
rules, including their original clipping behavior.

RGB/indexed alpha kernels sign-extend their packed 24-bit blend with `>> 8`;
ARGB kernels use `>>> 8`. The drawing probe preserves that difference and
independently verifies 43,750 normal pixel-buffer cases, including gray channel
boundaries, full canvas versus cropped pixels, alpha boundaries and unsigned
palette indexes. A nonzero palette index can copy zero; index zero remains
transparent even with a nonzero palette entry. Another 1,324 reduction,
run-marker and invalid-alpha cases preserve fixed native traces. Those cases
have no independent semantic oracle. Real-asset rendering and whole-game
behavior still need investigation.

Every parameter/local declaration in the three concrete sprite classes now has
an explicit guarded name. `ArgbSprite.rotateNearest` shares RGB geometry names:
Q4 pivots/destination centers, Q12 source coordinates, quantized inverse sine
and cosine steps, transformed corner bounds and negative scan counters. One
turn is 65,536 angle units; scale 4,096 is unity. The nine step-direction branches
and their write-index snapshots remain explicit. ARGB adds `storedAlpha`,
`inverseAlpha256` and `destinationPixel` to the sampled-pixel path.

`sampleBilinear` names four neighbors and weights. Each weight starts in Q24,
then truncates to Q8. Total surviving coverage below 128 skips the write;
coverage 128 through 255 normalizes channels by the surviving weight, and a
zero filtered RGB result becomes one. `ArgbSprite` inherits this RGB routine
for smooth rotation. Its half/quarter reductions instead normalize channels
by `alphaSum`, then blend with the average alpha. RGB reductions substitute
the destination color for zero samples. Reused sample/weight/channel storage
has explicit names rather than being split into invented variables.

`copy` and `copyMirroredHorizontally` allocate independent RGB sprites even when
inherited by ARGB. `rotateClockwise` exchanges crop/canvas dimensions and trim
geometry. `addOutline` tests the original four-neighbor mask, and
`trimTransparentBorders` updates the crop bounding box while keeping the logical
canvas. The additional native transform probe independently checks these
mutations, reductions, cardinal rotation and bilinear rules. General rotations
and extreme scales retain trace-only checks. The image constructor now names
its encoded bytes, image observer, tracker, pixel grabber and caught interruption;
its original partial-initialization behavior is retained but not exercised by
the native drawing fixtures. Step-direction branches, other classes, AWT loading,
real assets and whole-game behavior remain unfinished.

## Tutorial prompts and progression

`GameplaySession.tutorialMode` selects tutorial behavior and suppresses
the normal scoring methods. `tutorialStepId` selects the message through
`uk.tutorialMessageForStep`. Known message IDs are:

| ID | Named string | Prompt |
| --- | --- | --- |
| 0 | `tutorialRotationMessage` | Practice rotating the board |
| 1 | `tutorialColourMatchMessage` | Connect three by colour |
| 2 | `tutorialShapeMatchMessage` | Connect three by shape |
| 3 | `tutorialCompleteMessage` | Proceed to the real game |
| 5 | `tutorialFailedMessage` | Replay or proceed after failing |

Other IDs return null in that message accessor. These names do not introduce an
enum or assert that every possible tutorial transition has been decoded.

`renderTutorialPrompt` draws the step's text and continue/replay buttons when
`tutorialStepPhase` is zero. Input changes the phase to one.
`advanceTutorialStep` checks rotation or matching progress; phase two advances
the step and returns to phase zero. `tutorialProgressMetric` serves as
both a counter and a baseline for matching counters. `leaveTutorial` switches
tutorial mode off and retains the original state changes.
`tutorialPromptActive` gates motion and release while a prompt is displayed;
`tutorialAdvanceRequested` carries the internal key-16 advance request.

## Gameplay tick, contacts and matching

The motion, contact and match stages are named separately:

- `EntityMotionSupport.moveEntitiesAndCollectContacts` advances `ji.movingEntities` and gathers
  mask contacts relative to `boardAngleRadians`.
- `BoardReconciliationSupport.reconcileBoardEntities` resolves contacts and rebuilds dirty connectivity.
  `EntityLinkSupport.linkTouchingEntities` updates the reciprocal neighbor lists and counts;
  `EntityContactSupport.linkEntityAtMaskContacts` decodes the ownership-mask pixels.
- `MatchCandidateSupport.collectMatchCandidates` finds triples sharing `entityCategoryKey` or
  `spriteVariantIndex`. `nk.packedMatchCandidates` stores three 10-bit entity IDs
  and two equality flags; `h.matchCandidateCount` bounds the array.
- `MatchScoringSupport.processMatchCandidates` sorts and deduplicates the triples. All three
  `matchCooldownTicks` values must be nonpositive before it awards points.
  Points are 30 or 90 multiplied by the increasing `EntityCollisionSupport.matchChainLength`.
- `rh.updateAttachedEntities` decrements cooldowns, updates attached animations
  and computes the board's maximum squared entity distance.

The session's `matchBatchProcessedThisTick` reports consumption of a nonempty
candidate batch; cooldowns can prevent every candidate in that batch from scoring.
`dd.variantMatchCandidateCount` and `dk.categoryMatchCandidateCount` count collected
triples before cooldown checks and deduplication. They are also tutorial metrics.

The collector now names both neighbor indices and the gated variant/category
comparisons. `eligibleNeighborhoodVisited` controls feedback after visiting an
eligible neighborhood; it does not mean a triple was found. `dualMatchFound`
selects feedback mode 5 when a triple shares both properties. The IDs are sorted
into `largestPackedEntityId`, `middlePackedEntityId` and `smallestPackedEntityId`
before packing. Their variables initially hold different entity roles, so the
names describe the final packed order rather than permanently identifying a
central or neighboring entity.

The processor's `sortInsertionIndex` belongs to the insertion sort; the existing
`candidateIndex` walks the deduplicated batch. `firstBlockedEntity` and
`secondBlockedEntity` are aliases used only to clear queue markers when a
candidate fails a cooldown check. `wb.newAttachmentCount` is reset during motion
and increments for newly attached entities. In an empty batch it can reset the
chain, except while `w.avatarShockPending` is set. The shock flag originates in
kind-3 avatar contacts and is cleared by board reconciliation. The native scoring
probe controls these gates directly; it does not simulate their physics producers.

`touchesAvatar` means direct contact with the white `0xFFFFFF` avatar marker.
It is a root for the graph traversal, rather than a transitive connectivity flag.
`re.connectivityDirty` requests a rebuild, and `pk.connectivityVisitedByEntityId`
records traversal visits. Detached components set `detachedFromBoard`, return to
the moving queue and set `MessageDialogSupport.entitiesDetachedThisTick`.

`EntityMotionSupport.boardContactStateDirty` covers contact changes and cooldowns reaching zero.
The session snapshots it as `boundaryCheckRequested` before advancing motion.
`boardRasterDirty` requests a redraw of the attached scene raster; it is separate
from both contact dirtiness and `connectivityRebuiltThisTick`.

`linkTouchingEntities` rejects a duplicate before considering
`forceDetachSecond`. Its return reports detachment of the second entity.
Special-kind contacts can also set `detachFirst`. The second detach path
preserves `touchesAvatar`, while the first clears it. Both reset neighbor
counts and select `ji.movingEntities` as the queue marker; inactive array slots
can still contain references.

Two locals deliberately have combined names: `neighborIndexThenDetachSecond`
first searches for duplicates, then holds the second detach flag;
`variantPropagationThenNeighborIndex` first selects variant conversion, then
walks neighbors during detachment. The generated source reuses these slots.
`firstNeighborInsertionIndex` and `secondNeighborInsertionIndex` preserve
the append positions before incrementing the counts. The native gameplay probe
checks contact kinds 0/1/2, duplicate suppression, both force values, removal
positions and detachment with existing neighbors using controlled sprites.

`bh.propagateContactConversion` takes a `templateEntity`, a `startingEntity`
and separate `propagateVariant` and `propagateCategoryAndKind` flags. It
snapshots the template's category, variant and sprite kind before traversal.
`pendingEntities` schedules eligible neighbors at the front and
`pendingEntitiesForRemoval` aliases that same collection for removal.
`processedEntities` collects each completed entity. Its scan compares
`currentEntity` with `processedEntityToCompare`; it does not test a neighbor's
visited identity. These details remain explicit in the generated source.

Variant conversion selects kind zero before category/kind conversion runs.
Category-only conversion marks an old kind-two entity as detached and moving;
its configure call also starts the 60-tick cooldown. While scheduling neighbors,
category propagation copies the template angle and increments category counts;
variant propagation increments variant counts. A final entity with no eligible
neighbor can retain its previous angle. The native graph probe records these
angle outcomes and independently checks reachability and edge counters.

Passing both flags directly can fail while converting a kind-two entity:
variant conversion temporarily selects kind zero while its category is still
-1, causing a sprite-array bounds failure. The wrapper retains the partial
field writes and original exception context. The contact caller never requests
both flags together. The probe preserves that behavior rather than rewriting it.

## Playfield boundary scan

`PlayfieldRules.hasPixelsAtPlayfieldBoundary` tests the discrete radius-230 perimeter around
(320,240), using any nonzero framebuffer pixel as a hit. It does not test every
pixel outside the circle or decide a game-ending policy by itself.
`upperNearRowCenterIndex` and `lowerNearRowCenterIndex` address column 320 at
rows `240 - circleVerticalOffset` and `240 + circleVerticalOffset`.
`upperFarRowCenterIndex` and `lowerFarRowCenterIndex` use the horizontal offset
for their rows. Near-row probes use the horizontal offset for their columns;
far-row probes use the vertical offset. Together they cover eight symmetries.

The retained integer `circleError` equals
`circleHorizontalOffset * (circleHorizontalOffset - 1) + circleVerticalOffset²`
at the loop's probe stage. The independent oracle solves that inequality using
a square root, yielding 1,300 unique pixels. It checks every pixel in the full
bounding square, including near misses, at two strides. The scan leaves the
framebuffer unchanged. Client control-flow guard values zero and one are tested.

`methodGuard` normally receives -61. The otherwise unused `guardDivisionResult`
still performs integer division before the first pixel read; zero denominators
throw with the original `ld.B(...)` context even if the first pixel is occupied.
A left cardinal hit returns before later pixels are read, so it can succeed with
a raster too short for the right cardinal address. Null buffers, short buffers,
negative nonzero pixels and signed guard overflow retain their native behavior.

The exception-region reconstruction now returns on each original nonthrowing
path inside the try. Its 13-arm post-try ladder and `boundaryResultArmId` are
removed by the generic decompiler; shared joins and throwing continuations in
other methods retain external routing. The current Boolean carrier proof removes
all 13 integer result carriers and emits direct true/false returns. Fourteen
remaining locals and the method guard retain their semantic names. The original
exception aliases and nested probe conditions remain; no framebuffer reads are
reordered.

## Score popups and text writes

`ScorePopupSupport.spawnScorePopup` takes a popup from the pool. Pool exhaustion credits the
points immediately; pooled popups enter the active queue with zero progress.
`cf.advanceScorePopups` advances their float progress, including native NaN
behavior, then credits points to the score or pending panel according to the
chain multiplier. Tutorial mode suppresses the scoring methods.

`GameplaySession.addScore` retains the integer total and writes a display cap of
9999999 when needed; `addPopupPoints` similarly caps its displayed prefix at
99999. Neither cap clamps the stored integer. `td.writeTextAtOffset` writes
characters sequentially into the existing builder and grows its length only
when needed. It does not truncate a suffix after a shorter write. An empty write
returns the original builder unchanged. If the source is the same builder,
earlier writes affect later source reads: writing `abc` at offset 1 into itself
produces `aaaa`. The direct native probe verifies these details, partial writes
on failure, exception wrapping and throwable identity.

`sourceCharacterIndex`, `characterWriteOffset`, `originalLength`, `sourceLength`
and `writeEndOffset` expose this operation without simplifying the retained
guards or changing exception-context strings. A guard <=23 retains the PCM
helper side effect; it is outside the direct text-writer probe.

## Releases, result sequence and scene transition

`lc.updateSpawnQueue` advances `SecondaryDeque.spawnQueue` and releases ready members into
`ji.movingEntities` unless `spawnReleaseDisabled` is set. `hd.recordEntityRelease`
increments `MatchCandidateSupport.releasedInCurrentTheme` and `di.releasedInDifficultyStep` outside
tutorial mode. The theme threshold is `MessageDialogSupport.releasesPerTheme`; `qe.a` calculates
`sa.releasesPerDifficultyStep` as its ceiling divided by three.
`PlayfieldRules.advanceDifficulty` increments `ji.difficultyStep` and reads
`kd.difficultyStepFlags`. Its normal callers pass `recursiveAdvanceGuard=false`.
The true guard recursively advances the shared index and may throw when a
caller resumes and re-reads an exhausted table; partial updates remain visible. The
17 integer Boolean carriers are now eliminated, so the interval calls use
`sa.recomputeSpawnReleaseInterval(!recursiveAdvanceGuard)` directly. The proof
requires a single adjacent use and a nonthrowing primitive condition whose
inputs are unchanged. The local tail pass reduced the method from 220 lines
to 69; the nested-continuation pass then reduced it to 56. The integral
predicate proof reduces it to 38 lines: variant, recursive-advance and category
updates each have one path, followed by one probability/rotation/interval tail.
The category path still reads the shared flag table after recursive advancement;
the variant path runs before it. No table read or recursive effect is moved
ahead of its prefix. Cached JVM operands prove integral relational complements
without rendering blocks again. Unknown and floating predicates retain logical
negation; conflicting evidence refuses both complementary spellings. This game method requires
no generated block label; exact terminal clones in more complex nested prefixes
can use a deterministic plain-block break without duplicating effects. The 84,661-case difficulty matrix checks the
resulting partial state and exceptions.

| Flag bit | Observed effect |
| --- | --- |
| 1 | Raise `ag.availableSpriteVariantCount` when below seven |
| 2 | Raise `f.availableEntityCategoryCount` when below seven |
| 4 | Add to `og.entityMotionSpeed` and recompute the release interval |
| 8 | Multiply `DualLinkNode.rotationStepRadians` by the retained float factor |
| 16 | Add 0.05 to `sa.specialSpriteKindProbability` |
| 128 | Raise `ij.spawnIntervalScale` when below 0.8f, then recompute the interval |

`sa.recomputeSpawnReleaseInterval` stores
`int(201.0f / entityMotionSpeed * spawnIntervalScale + 0.5f)` in
`kb.spawnReleaseIntervalTicks`. Its `preserveReleaseQuota` parameter leaves
`releasesPerDifficultyStep` unchanged when true; false writes -10 after storing
the interval. The scale threshold is a gate, with no clamp after addition.
Past the flag table, the special-kind probability is reduced by 0.05 only when
above the original exact double threshold 0.15000000000000002.

`GameplaySetupSupport.resetGameplayDifficulty` initializes three sprite variants, four categories,
speed 0.4f, scale 0.75f, rotation and the release quota. Guard 9408 additionally
resets remaining counters and updates the interval. `qe.adjustThemeReleaseQuota`
adds the signed `additionalReleases` plus a step-dependent ten and computes the
ceiling quota divided by three; the original arithmetic remains.

`nf.chooseSpawnSpriteVariant` supplies `spriteVariantIndex` to entity motion
initialization; `ij.chooseSpawnEntityCategory` supplies `entityCategoryKey`.
Their Random source is shared. The variant guard can return 66 without drawing;
a category guard at or below 18 discards an extra draw before returning the next.
`vd.chooseSpawnSpriteKind` returns zero when its probability gate stays closed,
or selects kinds 3/4/1/2 using the original live-random thresholds. Invalid guards
return 104. These compatibility effects retain their exact sentinels.

`updateSpawnQueue` now names `queuedEntityThenPooledEntity`, preserving both
roles of the reused slot. `spawnAngleRadians` sets `spawnPositionX/Y` on the
radius-240 circle; `inwardDirectionX/Y` initially hold offsets toward the centre,
then are normalized using `inverseSpawnDistance` before velocity scaling.
`BoardReconciliationSupport.ticksSinceLastEntityRelease` resets to zero on release, then receives the
same update's unconditional increment. These geometry names have direct source
evidence.

The existing gameplay probe verifies 84,661 additional cases against independent
oracles and native bytecode: all 256 byte masks, saturation, recursive failures,
index overflow/null tables, real-table progression, float casts, quota/reset
guards, seeded category/variant draws and closed special-kind gates. It verifies
partial state even after a failure. Full queue execution, live Math.random
sampling and extreme quota-overflow loops remain outside those fixtures.

`GameplaySession.sessionPhase` retains these numeric states:

| ID | Observed role |
| --- | --- |
| 0 | Normal play |
| 1 | Result sequence requested at the theme release threshold |
| 2 | Expanding result effect |
| 3 | Shrinking result effect and accumulating bonus |
| 4 | Result countdown/fade |
| 5 | Result complete; scene transition requested |

`updateResultSequence` initializes `resultBonusPoints` with an additional 179,
uses `MeshDepthSupport.findOutermostAttachedEntity` to select an entity and computes
`endingEntityRadius` from nontransparent sprite pixels, then advances
the effect phases. Shrinking ticks add seven bonus points each. The completion
tick uses `resultCompletionTickOffset + 150`. `boardEmptyAtResultStart` snapshots
an empty attached queue and enables the extra 2000-point popup.
`renderResultSequence` draws the corresponding effects and text.

`sceneTransitionRequested` lets `updateSceneTransition` run once the session can
advance. `sceneTransitionInProgress` describes the active transition interval.
At transition tick zero, `preserveScoreOnTransition` selects `prepareNextTheme`
when true and `resetScoreState` when false. It also gates the progress HUD.
The transition completes at tick 160 and clears the request. `renderProgressHud`
shows remaining theme releases during normal play or phase-specific text.

`EntityContactSupport.areEntityQueuesSettled` requires the moving, spawn and transient animation
queues to be empty and `jl.field_t` to be clear; attached entities can remain.
`sk.checkBoundaryLossAndStartCascade` selects the ownership raster and calls
`PlayfieldRules.hasPixelsAtPlayfieldBoundary`, a radius-230 circle probe centered at (320,240).
On loss it starts the session-ending path and traverses the contact graph from
the farthest attached entity, assigning staggered lifetimes in increments of 50.
The end path sets `sessionEnding`; it is distinct from the normal result phases.
`findOutermostAttachedEntity` starts at `Float.MIN_VALUE`, so even a nonempty
queue of centred or NaN positions can return null. It walks backwards, retains
the first tied candidate, and stops after one candidate on nonzero client guards.

## Points panel and entity rendering

The points panel slides between x=463 and x=640 through `pointsPanelX`
and `pointsPanelSlideDirection`. `pointsPanelFrameIndex` and
`pointsPanelFrameDirection` describe its animation. `addPopupPoints`
accumulates pending points; `emitPointsPopup` places the popup relative to that
panel. `resetScoreState` resets the existing score bookkeeping and panel state.

`GameplayEntity.entitySpriteKindId` chooses a sprite bank and its
animation behavior. `resetEntityAnimation` resets its animation state and calls
`selectEntitySprite`. `drawBoardRotatedEntity` names centered coordinates and
the resulting rotated x/y positions. Existing velocity, position, lifetime,
palette and related-entity names remain available.

`entityId` is an entity identifier. `drawEntityIdOnBoardMask` stamps
`entityId+1` into the board ownership raster;
`drawEntityIdOnPointerMask` stamps into the pointer raster. The board mask is
placed at `(320+boardMaskOffsetX, 240+boardMaskOffsetY)`.
`eraseEntityPixels` removes pixels owned by that identifier. The static
`registerAudioStream` serves the shared mixer; its name does not imply that the
stream belongs to a gameplay entity.

## Board entity reconciliation

`BoardReconciliationSupport.reconcileBoardEntities` now uses structured loops instead of 60 dispatcher
cases. Start with the usual zero-value path of the shared `Geoblox.field_C`
guard; the generated source retains its other outcomes too.

The first walk handles `ji.movingEntities`: entities queued for attachment have
their trail/masks updated, their primary and secondary links removed, and are
inserted into `BoardEntityState.attachedEntities`. Their queue marker is cleared and the board
raster is marked dirty.

When connectivity is dirty, an attached-entity walk uses
`pk.connectivityVisitedByEntityId`, `pendingConnectivityEntities` and
`visitedNonAvatarEntities` to follow related entities. `currentConnectivityEntity`
is the popped entity; `currentConnectivityEntityAlias` refers to the same object
and implies no parent/child relationship. `componentCanDetach` starts at one
and becomes zero when the search reaches a direct avatar contact. That root
stops the search before insertion into `visitedNonAvatarEntities`, so an
anchored search can leave only a partial group in that collection.

An unanchored group moves to `ji.movingEntities`, loses its reciprocal contacts
and resets category/variant counters. Anchored components remain attached with
their neighbor order and counts. The graph probe verifies both outcomes against
independent connectivity and queue-partition oracles. A completed rebuild clears
visited entries 0 through 999; clean connectivity leaves the array alone.
`componentNeighborIndex` walks neighbors during discovery and reciprocal removal.
`visitedResetIndexThenKindFourCount` first clears the visited range, then counts
kind-four entities routed to the transient list and changed to kind seven; it
does not count connected components.

The next attached-entity walk uses `routedAttachedEntity` to route queue markers.
For moving entities,
`radialOffsetX`, `radialOffsetY` and `radialVelocityScale` normalize a vector
toward `(320,240)` using `og.entityMotionSpeed`, then update velocity and remove
related links. Other paths move entities through the existing transient list,
update lifetime/animation state, and keep the original numeric sprite/action
choices. The final transient-list walk can return entities to
`ra.availableEntities`, then updates the session's raster-dirty flag.

Several slots span these phases: `connectivityAliasThenDetachingEntity`
starts as a popped-entity alias and later holds the group member being detached;
`neighborThenCountResetEntity` starts as a candidate neighbor and later aliases
an entity for count cleanup. `componentSearchThenVariantResetEntity` scans the
worklists before its later reset role. The carrier pairs
`comparedThenUnlinkTarget`/`neighborThenUnlinkArgument` similarly serve identity
checks before reciprocal unlink calls. Their names preserve those distinct
uses rather than inventing a permanent entity relationship.

`rasterDirtyDecision` combines the old raster flag, contact dirtiness and avatar
shock state. The native reconciliation fixture checks connectivity and contact
flags, including centre-position NaN velocities. It exercises the normal method
guard -90 from `GameplaySession.updateSession` and compares both retained client
control values. Attachment drawing, shock/transient routing and pool-return
branches now also have native fixtures with minimal sprites and zero or one
reciprocal neighbor. Attachment writes `entityId+1` ownership pixels; transient
and pool transfers clear secondary membership. Shock popups use the original
integer-narrowed `popupOriginX`/`popupOriginY`, with `popupPoints` set to 100 for
original kinds three/four and 10 otherwise. `kindFourRemovalCount` increments
for original kind-four entities changed to kind seven. New unlock delivery is
outside these fixtures; existing action bits suppress it.

`avatarShockContactPending` is set by a kind-three ownership-mask contact and
blocks queue settling. Once the attached update requests `avatarShockPending`,
reconciliation consumes that request, clears the contact flag and calls
`AvatarFeedbackSupport.requestAvatarFeedback(3, false)`. These are distinct stages and flags.

`requestAvatarFeedback` manages `avatarFeedbackModeId`, `avatarFeedbackFrameBase`,
`avatarFeedbackFrameIndex` and `avatarFeedbackHoldTicks`. Ordinary requests
0 through 5 select six-frame segments; request 7 selects mode six/base 36.
A positive hold defers ordinary changes. Request 3 still starts
`avatarShockEffectTicks` at 50 and queues its sound during a hold. A new request
7 overrides a different frame base and starts a 110-tick hold.
`clearSpriteGuard` preserves the original optional clearing of `AvatarFeedbackSupport.grayJagexLogoSprite`;
normal gameplay passes false. The native matrix verifies both guard values and
retains Java's negative frame remainder rather than clamping it.

`SecondaryDeque.contactProbeOffsetX` and `contactProbeOffsetY` place the contact
raster within the 640 by 480 viewport. Their normal values are 90 and 10 for a
460 by 460 raster. Entity trail and contact drawing subtract these offsets.

`PrefixCodeDecoder.advanceMenuAvatarAnimation` and `MessageDialog.advanceGameplayAvatarAnimation` update
the shared avatar feedback state. `avatarFrameStepTicks` is tested before its
decrement: an old negative value resets it to 20 and steps the frame. An offset
of zero first jumps to three. Otherwise `avatarSteeringDirectionId` zero moves
toward offset three, one decrements offsets above one, and two increments
offsets below five. Other direction IDs preserve the frame. The entry guard
for the menu update must be at least 72; the actual caller passes 127.

Every enabled update decrements `avatarFeedbackHoldTicks` and increments
`avatarBlinkClockTicks`. Remainders below 30 force the base frame, using a fixed
600-tick menu cycle and `blinkPeriodTicks` in gameplay (normally 600).
`avatarShockFrameIndex` changes only if the old `avatarShockEffectTicks` was
positive; it uses the decremented value modulo 15 and then modulo two. These
counters continue below zero, and the native fixtures retain Java remainders.

`wc.requestAvatarTintForRadius` receives the maximum attached squared distance
from the board center. When `avatarTintFadeTicks` is nonpositive, it copies
`avatarTintColor` into `avatarTintStartColor`, selects `avatarTintPalette` and
sets `avatarTintRedDelta`, `avatarTintGreenDelta` and `avatarTintBlueDelta`.
The index rounds four times the squared radius divided by 52900; it is not
clamped. The division guard and bad index can throw after the starting-color
copy. A positive fade bypasses the whole request, including those failures.

Both animation paths compute `avatarTintFadeFactor` from the old fade timer
and the retained float constant, narrow each scaled channel to int, and add
the packed deltas to the starting color. Only a positive old fade timer writes
the color; the timer still decrements after expiration. The independent native
matrix checks those boundaries, signed/fractional channel values and multiple
blink cycles. Gameplay ending-message updates share this method but are not
covered by these added fixtures.

The generic decompiler now spells literal shift distances using their JVM
width. The tint channels above use `<< 16` and `<< 8`; sprite and board-center
calculations use readable right-shift distances. Int shifts mask with 31 and
long shifts with 63. The prior pass changed 972 constants across 90 files
while preserving every other Java token, declaration identity and naming rule. Dynamic distances
and computations that can throw retain their expressions and evaluation order.

Integral right-hand signs are now canonical. For example,
`avatarFeedbackFrameIndex + -frameBase` becomes
`avatarFeedbackFrameIndex - frameBase`, and negative literal subtraction
becomes addition. This removes 745 sign nodes across
132 files. Cast boundaries and floating expressions are preserved; the typed
source audit allows only these integral rewrites and parentheses. No branches
are factored or operands reordered by this pass.

This is a reading map of the recovered source, not a whole-game behavioral
proof. Several guards, scratch carriers and shared helper names remain opaque.

## Score popup lifecycle and debug controls

`ScorePopup` replaces the instance class `me`. It stores `points`, `pointsText`,
`originX`, `originY`, `progress` and `chainMultiplier`.
`ScorePopupSupport.spawnScorePopup` takes an object from `ue.availableScorePopups`, initializes
it and inserts it into `md.activeScorePopups`. An empty pool credits points
directly. `bd.drawScorePopups` interpolates toward the points panel and displays
the chain multiplier when it is not one. `cf.advanceScorePopups` updates progress
and, after completion, routes points to `addScore` for multiplier one or
`addPopupPoints` otherwise, returning the object to its pool.
`wa.collectUnfinishedPopupPoints` drains active objects and sums their stored
points, which already include any chain multiplication.

Debug input can enable `debugPointerSpawnEnabled`, choose
`debugSpawnCategoryId`/`debugSpawnVariantId`, select `debugSpawnSpecialKinds`,
toggle `spawnReleaseDisabled` or `rotationControlsSwapped`, and enable
`showSessionCounters`, `showDebugOverview` or `debugReducedRendering`.
`EntitySpawnSupport.spawnEntityAtPointer` transforms pointer coordinates relative to board
rotation before initializing the entity. `submissionBlocked` gates score/action
submission after the existing debug actions. `newActionCount` counts newly
recorded action bits; these names do not establish a multiplayer protocol.

## Lists used by gameplay

`IntrusiveNode` stores the primary next/previous links.
`DualLinkNode` adds an independent second link pair, and
`GameplayEntity` inherits both. `unlinkSecondaryNode` leaves the primary
links untouched.

`IntrusiveDeque` contains a circular sentinel and a traversal cursor. Its
instance API now reads as `addFirst`, `addLast`, `removeFirst`,
`removeLast`, `firstForIteration`, `nextForIteration`,
`lastForIteration`, `previousForIteration`, `countNodes`, `isEmpty`,
`clearNodes` and `moveAllTo`. Its private `moveSuffixTo` implements the
splice. `pendingActionMarkers` holds the existing `PendingActionMarker`
objects. Static theme helpers on these obfuscated classes remain separate and
largely unnamed; class names describe their instance roles.

`SecondaryDeque` is the original `wd` class. Its instance API uses
`DualLinkNode.nextSecondaryNode` and `previousSecondaryNode`, with its own
`sentinel` and `iterationCursor`. It provides `addFirst`, `addLast`,
`removeFirst`, `firstForIteration`, `nextForIteration` and `countNodes`.
Insertion removes the node from its previous secondary collection. The primary
links stay intact, allowing conversion and connectivity worklists to coexist
with gameplay queues. Native model checks cover transfers, reinsertion, removal,
iteration order and reciprocal links. Normal guards remain part of the API;
alternate guard side effects are retained in the source.

## Interface text and account entry

[AccountWelcomePanel.java](geoblox/src/AccountWelcomePanel.java) is the original
`wi` class. Its instance builds `createAccountButton`, `goBackButton` and
`justPlayButton`, using the corresponding decoded labels and dispatching clicks
by button identity. Its unrelated static helpers remain on this original class.

`AccountWelcomePanel.loadInterfaceText` binds `bf.activeTextArchive`, calls
`fk.readTextResourceBytes` for each unchanged resource key, then decodes non-null
bytes with `ag.decodeTextBytes`. The three `loadInterfaceTextPartN` methods are
size-budget partitions that preserve source order; their numbers do not denote
semantic loading phases. Shared fields keep decoded bytes, guard values and
failure context across helpers. The final helper clears the active archive.

There are 152 directly assigned text-resource fields. One, `reconnectMessages`,
was already named; the 151 new field names include `loadingGraphicsText`,
`loadingMusicText`, `startGameText`, `resumeGameText`, `orbPointsText`,
`monthNames`, account alerts and fullscreen prompts. The 526 discarded decode
results have no destination field to name; their calls remain present.

`ByteTextDecodingSupport.decodeTextSlice` iterates `textBytes[offset + byteIndex]`, omits zero bytes,
maps values 128 through 159 using `lf.extendedTextCharacters`, and constructs
its string from `decodedBuffer` and `decodedLength`. Zero mapping entries become
question marks. The guard's side effect remains explicit. This is a legacy
single-byte decoder; it is not named or treated as UTF-8.

[The text report](TEXT-READABILITY.md) records the exact resource-key evidence,
reproduction commands and native probe scope.

## Input validation and UI border sprites

[TextInputValidator](geoblox/src/TextInputValidator.java) supplies
`currentValidationState` and `currentValidationMessage` from `validatedInput`.
The candidate queries are `validationStateForText` and
`validationMessageForText`. All seven declarations in each candidate-query
family use those names, preserving their virtual overrides and pending states.
[MatchingTextValidator](geoblox/src/MatchingTextValidator.java) compares the
candidate with `referenceInput` and checks `referenceValidation` before accepting
the match. `qh` uses it for a confirmation input, and `mk` composes it with
another validation stage. Sentinel guard values remain in the source.

The same class contains an unrelated static helper, `buildNineSliceSprites`.
It creates corners, edge strips and a centre sprite; `cornerSize` is the sum of
`innerAccentWidth`, `borderGap` and `outerBorderWidth`. Named colour arguments
distinguish fill, top/left border, bottom/right border and inner accent.
`IntrusiveDeque.buildUnitBorderNineSliceSprites` supplies fixed unit widths for
UI skins. [The border/validation report](BORDER-VALIDATION-READABILITY.md) maps
the array indices, evidence, override families and remaining shared carriers.

## Remaining limitations

There are 6,081 explicit guarded rules: 59 classes, 767 fields, 547 method
declarations, 1,615 parameters and 3,093 locals. This is not full deobfuscation.
Unknown flags, guard arguments and opaque shared helpers still need
investigation. Current names and source identities live in the single manifest;
previous naming and structural passes remain in Git. The earlier early-exit migration
moved 35 named local ordinals by unique method/original-spelling identity.
The subsequent naming pass retained all prior rules and added 38 difficulty
and spawning identities without changing the raw source. The previous migration
folded 77 typed literal assignment branches. The subsequent proof removed 221
generated locals, keeps 70 Boolean local snapshots and retypes one generated
helper field. Fourteen obsolete names are explicitly removed, 61 surviving local
ordinals migrate, and the helper field has an explicit type migration. All other
semantic names remain. The previous local shared-tail pass removed 451 lines across
16 files, retaining every declaration identity and all 1,194 naming rules without
ordinal changes. It factors exact whole tails within a block scope after Boolean
cleanup and preserves bare return guards. That pass left the difficulty method at 69 lines.
The previous nested pass removed another 21 lines across seven files and reduced
it to 56 lines, coalescing its repeated probability/rotation/interval tail.
Four unnamed snapshot ordinals reorder in v.a(B)V; method/original-spelling
normalization preserves every declaration. The preceding integral-guard pass
removed 18 lines across four files,
reducing the method to 38 lines and coalescing its recursive/category clones.
Every declaration key and spelling is unchanged, with no ordinal migrations.
All 1,194 rules survived that structural pass. Later naming passes added
asset/loading/overlay and sprite identities while retaining prior rules and the
same raw source. That historical structural refresh preserved all 2,404 rules.
Other carriers, shared joins and opaque names remain. The earlier terminal-return
pass removed the vanished boundary selector;
the current emitter also retains its proven early-exit reconstruction.
Complete parsing and preserved declaration scopes keep this reproducible.

The decompiler now checks explicit exception-region exit contracts, preserves
ordinary empty branches as no-ops, requires explicit loop exit targets and
retains the exception table in large-method fallbacks. It refuses internal catch continuations that
would restart setup. Gameplay update, rendering, scene transition and screen
update use labeled loops; board reconciliation now does too, with its runtime
catch intact. Generated dispatcher methods and dispatcher cases remain at zero.
Result-sequence update and nine-slice sprite construction use labeled loops too;
shared joins remain. The initializer
preserves its runtime catch and original resource order through shared helper fields. Unknown builder
prefixes across joins no longer disappear from diagnostic contexts. See [the investigation](STATE-MACHINE-READABILITY.md)
for refusal reasons, verification and the next structural steps.

## Signed complement conditions

Pass 14 replaces proven int/long XOR-minus-one comparisons with direct
conditions. Tutorial checks now show `tutorialStepId == 5` instead of
`-6 == (tutorialStepId ^ -1)`. Text decoding checks character values against
0, 128 and 160 directly. Numeric thresholds remain unchanged in meaning;
no gameplay enum or new state name is inferred by this renderer change.
See [the comparison report](COMPARISON-READABILITY.md) for exact pins and limits.

## Result-sequence loops

Pass 15 reconstructs `GameplaySession.updateResultSequence` as 167 lines of
structured control flow instead of a 27-case dispatcher. Its entity pixel scan
retains `maxRadiusSquared`, `spriteColumn`, `spriteRow`, pixel offsets and
`pixelRadiusSquared`. The source still preserves nonzero client-guard paths;
they are not silently treated as normal-play zero flags. The nine-slice helper
`MatchingTextValidator.buildNineSliceSprites` (original `n.a`) also loses its
34-case dispatcher. See the
[parallel-loop report](PARALLEL-LOOP-READABILITY.md) for the copy hazards found,
exact reproduction and the native test scope.


## Correct sprite pivots during result preparation

Pass 17 fixes six numeric-negation expressions in `Sprite` and `il`.
`-(-sourcePivotX)` preserves the pivot; the previous `--sourcePivotX` changed it
because Java parses that spelling as pre-decrement. This changed sprite pixels
and result-sequence radius/timing even though the source compiled. The
[numeric-negation report](NUMERIC-NEGATION-READABILITY.md) records the failure,
generic fix and 27 native result-sequence scenarios through completion. All
926 naming rules and 248 local identities remain unchanged. Whole-game behavior
and unknown names still need investigation.


## Result audio and shared points helper

Pass 18 names `resultExpansionAudioStream`, its progress-dependent
`PcmSampleStream.createForPlaybackRate` factory and the position query
`isSamplePositionOutOfRange`. `samplePositionFixed` and `sampleStepFixed` use
256 units per sample. `PcmSample` stores source `sampleRateHz`, `samples`, loop
endpoints and the ping-pong flag; `AudioOutput.sampleRateHz` is the distinct
output frequency. `playPcmSample` registers a stream at rate 100 and volume 96.

`qf.resultMusicTrack` is loaded from `bonus_bubble_jingle`.
`ra.selectBackgroundMusic` retains null/current-track early returns and the
original MIDI stop/reset/start path. `PlayfieldRules.spawnPointsPopup` names the shared
wrapper used by difficulty, result and points-panel bonuses; its argument order
is y, x, method guard, points.

The [result-helper report](RESULT-HELPER-READABILITY.md) explains the 46 additions
and native comparisons. The raw source and all 926 previous names remain
unchanged. New probes cover selector edge cases, PCM factory metadata and
position bounds, and music early returns. Actual MIDI activation, PCM advancement
and whole-game behavior still need verification.

## Native matching and score verification

[Pass 20's comparison report](FLOAT-COMPARISON-READABILITY.md) records the native
matching/scoring probe and its independent oracle. The score-popup animation
branch includes unordered progress: `!(progress >= 1.0f)` retains a NaN popup
without crediting it. The old relational spelling changed that behavior.
The raw and renamed code now match native traces for 708 controlled scenarios,
including successful matches, pool overflow, cooldowns, duplicates and tutorial
scoring. Full contact physics and asset-dependent transitions remain unverified.

## Cache-write continuation

`ic.a(byte)` seeks `CacheFileState.randomSeedFile` to zero and writes 24 bytes from the packet
buffer in `LogoCompositor.sessionPacketBuffer`, when the cache handle exists. It catches `Exception`
from those two calls and their argument reads, then advances the packet offset
by 24 regardless of whether the cache was absent or the write failed. The
packet access in that following increment remains outside the inner catch;
a null packet therefore still fails. A guard other than 65 also clears
`ic.field_a` before any cache access.

The previous generated selector merely tested whether an empty arm should run.
It and its two stores are now gone, leaving the cache try/catch followed directly
by the offset update. No throwing expression crosses a protected boundary.
The existing result-helper probe independently checks file bytes, offset wrap
and guard effects in 140 native/raw/readable cases. Closed and limited files,
invalid payload offsets, null buffers, absent caches and null packets retain
their completion behavior. The nine remaining selectors route work or transfers
and still need review. Concurrent cache use, real device behavior and whole-game
behavior remain outside this probe.

## Buffered socket and platform tasks

`BufferedSocket` is the original `ba`; it owns synchronous input and a ring
buffer drained by `Runnable.run` to its output stream. `PlatformTask` is `cb`,
and `PlatformTaskDispatcher` is `d`. The dispatcher queues task records under
its monitor, executes their numeric `taskType`, writes `result`, and publishes
volatile `status`: 0 pending, 1 success, 2 failure. `next` links its FIFO;
`input`, `firstIntArgument` and `secondIntArgument` retain their type-specific
meanings. `startThread(runnable, guard, priority)` queues type 2; the socket
requests this with guard 0 and priority 3. Dispatcher service requests and
worker/constructor variables now have source-audited semantic names.

| Socket member | Behavior |
| --- | --- |
| `available(guard)` | Open input bytes available; zero once closing. Guard <=71 first nulls input. |
| `readByte(guard)` | Input read for -17422; zero once closing, otherwise -104 for invalid guard. |
| `readFully(destination, guard, destinationOffset, remainingLength)` | Repeated partial reads; EOFException on zero/negative read. Guard -97 required; closing returns without copying. |
| `enqueueWrite(guard, sourceOffset, length, source)` | Copies into lazy ring, consumes pending IOException, starts writer task once and notifies. Guard !=100 nulls output after successful copying. |
| `checkWriteFailure(guard)` | Valid guard <-79 consumes a pending writer IOException unless closing. |
| `close(guard)` | Requests shutdown, notifies, waits for task status and joins successful writer task. Guards >=-117 first call run. |

`writeInsertIndex` advances per copied byte; `writeReadIndex` advances per writer
segment modulo `bufferCapacity` (default 5000). Enqueue throws when it reaches
its 100-byte reserve boundary, after copying the boundary byte. Writer catches
write/flush IOException and sets `writeFailurePending`; it still advances the
read index after a failed write. A closing writer drains queued bytes before
closing input, output and socket in that order. An input-close IOException
skips both later closes but still releases `writeBuffer`. These are preserved
original behaviors, not repaired transport guarantees.

`closeRequested` is set under the socket holder monitor before `notifyAll`.
Close waits for nonzero volatile task status, joining the thread result only
for success. A join InterruptedException is swallowed. Null/wrong-type results
escape that catch and retain the task; an already-closing holder returns before
notification/task cleanup. Normal or interrupted completion clears `writerTask`
once. No join/cast/monitor expression moves across a handler boundary. The
original wait label and writer's live routing selector remain.

Every socket parameter and nonselector local now has a guarded name, including
contiguous write offset/length, monitor snapshots, ignored interruptions and
diagnostic-message carriers. The original `ba.*` message strings are unchanged.
Unrelated statics keep their owner: key-event queue write index, third auxiliary
vertex transformed-Y scratch, frame-clock factory and session-clear/reload.
These roles are supported by keyboard/rendering/timer/browser source evidence.

The existing result-helper probe checks 84 controlled shutdown cases using
independent state/interrupt/task/monitor oracles, plus 308 controlled socket I/O
cases using independent byte/configuration/effect oracles. The latter cover two
fake-socket constructor overloads, available/read-byte guards, partial/zero/
failing reads, pending errors, lazy allocation, ring wrap/reserve failure and
preclosed writer drain/write/flush/close failure order. Worker/publisher threads
in shutdown fixtures are bounded and checked for termination. The writer-drain
fixtures run synchronously without platform services. Native bytecode, raw and
readable traces match. Normal open-writer blocking/concurrency, real sockets,
dispatcher services, browser navigation, guard-triggered run and whole-game
behavior remain unverified. Nine routing selectors remain across the game.

## Dispatcher shutdown and preferences iteration

`PlatformTaskDispatcher.shutdown(guard)` requests worker shutdown under its
monitor and notifies, joins `workerThread`, then closes `cacheDataFile`,
`masterCacheIndexFile`, each non-null `cacheIndexFiles` entry, and `randomSeedFile`.
Each IOException is swallowed. The named `cacheIndex` advances exactly once
on null, successful-close and caught-failure paths; no update crosses a handler.
The loop remains an explicit while. Every shutdown parameter and local is named,
including the ignored failures, monitor snapshot and invalid-guard task carrier.

The previous exported for loop had both a header update and updates inside
success/catch arms, incorrectly skipping cache entries. The new native probe
checks 96 combinations: all 32 five-entry null masks and three failure masks.
Instrumented file closes prove complete order and successful-handle release;
failed close retains its holder reference. Native bytecode, refreshed raw Java
and readable Java match. The worker is unstarted; invalid guards, live worker
joins and concurrent real cache access remain outside this probe.

`openPreferencesFile(guard, cacheVariant, gameName, preferenceSuffix)` builds the
jagex preferences filename, using _rc for variant 33 and _wip for 34. Its named
`searchDirectories`, `directoryIndex` and `searchDirectory` describe the fixed
path search. Absent directories and caught open failures each advance once;
first successful open returns a limited pa holder, and exhausting search
returns null. This loop also retains while paths. Original guard division,
paths, catch carriers and filename spellings remain. Filesystem search behavior
is supported by source/native counter-shape inspection, not a new live-path test.

For-header recovery now parses and checks all paths, instead of choosing an
update from the first continue. One selected update must reach every normal or
own-continue backedge, and none may reach other exits. Additional counter writes,
shadowing, unsupported lexical/syntax cases, and updates/own continues inside
nested loops, labels, try/finally or monitor bodies refuse recovery. Unknown
completion stays explicit. All 303 files compile and all guarded bindings are
checked, but those checks alone cannot establish execution equivalence.

## Sequential early-exit guards

The earlier early-exit pass removed an else wrapper when the preceding arm
leaves on every path. When both arms leave, the shorter arm becomes the guard.
`hasPixelsAtPlayfieldBoundary` now reads as sequential cardinal checks followed
by sequential perimeter checks inside its loop. The original read order,
integer division guard and exception context remain; the 13 result carriers now
use direct true/false returns.
Nested branches with normally completing paths or consumed inner breaks keep
their control flow; blocks that declare locals keep their scopes.

Across GeoBlox this removes 2,128 else wrappers and 2,213 source lines in 208
files. Native boundary probes still verify the independent lattice oracle,
425,042 pixel checks, 18 guard cases and five invalid-raster cases per variant.
These controlled probes do not establish whole-game equivalence or phone FPS.

## Dispatcher request and worker names

All 24 dispatcher fields now have guarded names. `javaVendor` selects
`useMicrosoftVmBackend`; `javaVersion`, `osName` and `osNameLowerCase` preserve
the original property reads. `privilegedServicesEnabled` gates cache/desktop
services and bootstrap reflection restrictions. Microsoft fullscreen/cursor
adapters and reflected fullscreen/cursor adapters each retain their own field.
`networkBlockedUntilMillis` is compared against the backward-clock-corrected
millisecond clock before network task execution.

| Request API | Original task and arguments |
| --- | --- |
| `requestSocket(port, host, guard)` | Type 1; true guard first executes the original invalid display-mode request. |
| `requestSocketInternal(guard, port, useProxy, host)` | Type 1 or proxy type 22; nonzero guard first nulls cache data. |
| `requestUrlStream(guard, url)` | Type 4; guard -14 required. |
| `requestDisplayModes(guard)` | Type 5; guard 34 avoids the original preferences-search side effect. |
| `requestEnterFullscreen(height, guard, refreshRate, bitDepth, width)` | Type 6; guard -1743550128 required; original width/height and bitDepth/refresh packing remains. |
| `requestExitFullscreen(frame, guard)` | Type 7; guard 0 required. |
| `requestDeclaredMethod(methodName, guard, parameterTypes, targetClass)` | Type 8; guard >=-118 clears reflected fullscreen backend before queuing. |
| `requestDeclaredField(targetClass, guard, fieldName)` | Type 9; nonzero guard clears Microsoft fullscreen backend before queuing. |

`hasFullscreenSupport(guard)` checks enabled services and the chosen non-null
backend for guard -26098. The worker removes `task` under
`dispatcherOrTaskMonitor`, then executes `taskType` outside that monitor. Its
reused `cursorXOrVisibleFlag` names both actual roles. Reflection argument tuples,
clipboard objects, fullscreen frame, preference file, URL whitelist/index and
proxy failure now describe their source uses. Success publishes status 1; caught
Throwable publishes status 2. ThreadDeath rethrows before completion notification.
The new names preserve handlers and monitor scope; they add no worker-service
native coverage. All non-generated dispatcher parameters/locals are named;
other classes and shared joins remain partly opaque.

## Gameplay tick and motion variables

`updateSession(methodGuard)` now names its preincrement panel tick and negative/
positive rotation key codes. Debug toggles name the Boolean value to be stored. The reproducible decompiler
cleanup removes 19 unread owner/target snapshots and their pure this/null stores
from this method; the live Boolean values and handler boundaries remain. One
Boolean still carries detached-entity state before the positive-rotation key
state. The final integer comparison carriers still switch from debug key values
to pointer-event complement/sentinel values. `inputDerivedModuloIndex` describes
the shared modulo8/5 input-derived index without assigning an unsupported game
mechanic to its bookkeeping branches. Full session-tick execution is unverified.

`moveEntitiesAndCollectContacts` names the current/other moving entity, inward
center offsets, normalized averaged velocity, outward-distance comparisons and
midpoint direction scale. `sharedVelocityXOrCrossProduct` and
`sharedVelocityYOrDirectionScale` preserve their reused meanings. Its integer
`neighborIndexOrKindFlagOrContactIdOrDivisionGuard` is reused across attachment,
moving contact and final arithmetic guard paths. The new names help follow these
paths; splitting the reused declarations would require a later proven generic
decompiler transformation. Actual contact production remains source-audited.

`updateAttachedEntities` uses `maximumEntityRadiusSquared`, not a radius. Every
member loses one cooldown tick; a zero crossing marks contact state dirty.
Only queue-null members advance animation and contribute to the squared maximum.
Kind3 avatar contacts with nonpositive cooldown set the shock flag, and squared
thresholds10000/25600 select feedback0/1/2. This producer is source-audited.

The entity constructor keeps supplied raw velocity. `initializeEntityMotion`
normalizes it to `entityMotionSpeed`, including the original NaN behavior for
zero velocity. Its arithmetic sentinel runs after position, lifetime, category,
kind and velocity writes, before clearing counters/animation/queue/flags. A bad
guard therefore retains those partial writes. Two float arguments in both APIs
have no reads and are named `unusedFloatArgument1/2`. Ordinary kind selects its
category/variant sprite; kind2 selects the amorphous frame and sets category -1.
Successful reset clears active neighbor count while retaining old array slots.

`rotateEntityAroundBoard` rotates about (320,240), then points velocity inward and
normalizes only above the original squared-speed threshold. Kind2 retains its
sprite angle; other kinds subtract the rotation delta. `integrateEntityVelocity`
adds both velocity components before the invalid-guard variant-count side effect.
`resetAvatarFeedbackState(initialFrameIndex)` names the helper used by the session
constructor; the remaining reset writes and caller values are unchanged.

The existing gameplay probe adds independent constructor/integration/rotation/
initialization oracles for 4,500 cases and compares the separately pinned trace
against native bytecode, raw Java and readable Java. This includes partial guard
failures and non-finite arithmetic; it adds no real-asset or whole-game claim.

## Keyboard and pointer input

`KeyboardInputListener` (`wl`) translates AWT key codes through
`oe.awtKeyCodeToInternalCode`. Press/release callbacks reset `nk.keyboardIdleTicks`
and enqueue positive press or complemented release values in
`EntityCollisionSupport.queuedKeyStateChanges`. `ii.keyStateWriteIndexOrResetSentinel` becomes -1 on
overflow or focus loss. `re.updateKeyboardStateForFrame` replays changes into
`kj.heldInternalKeys`, or clears all 112 held flags on reset. It advances the
frame event fence from `pc.keyboardEventFrameEndIndex` to
`BufferedSocket.keyEventWriteIndex`, first setting the read cursor to the
previous fence. Unpolled events in the preceding frame are therefore discarded.

A separate 128-slot queue pairs `kj.queuedKeyboardEventCodes` with
`ai.queuedKeyboardEventCharacters`. Presses store an internal code and character
zero; typed characters store code -1. A full queue drops new events.
`UiFontResources.pollKeyboardEvent` reads only up to the captured frame fence, publishes
`SessionTextHistorySupport.currentKeyboardEventCode` and `te.currentKeyboardEventCharacter`, then wraps
`vd.keyboardEventReadIndex`. Empty/invalid-guard polls retain the previous payload.
The poll holds `je.keyboardListener` as its monitor; keyTyped retains the original
unsynchronized method. Gameplay reads held keys for rotation/fast-forward and
polls queued events for tutorial, exit and debug actions. Numeric codes retain
their original mapping; `jg.swapRotationControlsKeyCode` defaults to 35 and is
loaded from preference byte zero.

`PointerInputListener` (`le`) writes live pointer position in
`lj.livePointerX`/`eg.livePointerY` and press position in
`ah.livePointerPressX`/`hi.livePointerPressY`. Press button 2 means right button;
other presses use 1. Releases/focus loss clear `s.liveHeldPointerButton`; focus
loss retains pending press/activity state. Motion/enter/exit/press/release reset
`GameplaySession.pointerIdleTicks` and mark `EndingAnimationSupport.pointerActivityPending`.
Exit uses position (-1,-1). Popup press/release/click events are consumed.

`mc.snapshotPointerInput` copies these fields under `GameplaySetupSupport.pointerListener` into
position, press position/button, held-button and activity snapshots, then clears
pending press/activity. A second snapshot retains held-button/position state but
has no new press or activity. The session debug-spawn/tutorial handlers use
press snapshots; hovering and menu hit testing use position snapshots. The
native input matrix checks 2,184 controlled callback/queue cases. Real concurrent
AWT delivery, browser key mapping and full session execution remain unverified.
The listener classes retain unrelated static helper methods.

## Collision masks and pointer spawning

`PixelOverlapProbe.findFirstNonzeroPixelOverlap` (`aa.a`) adds each sprite's
crop trims to its origin, intersects cropped width/height bounds and scans
shared rows left to right. Both pixel values must be nonzero, including negative
values; no alpha/color interpretation is inferred. On the first hit it stores
world coordinates in `firstOverlapX`/`firstOverlapY` and returns true. A miss
returns false and retains the previous output coordinates. It never writes to
the input buffers. `overlapRightThenWidth` and `overlapBottomThenHeight` retain
their original reused roles instead of introducing new declarations.

`EntityCollisionSupport.renderEntityCollisionSprite` (`gf.a(Lja;IF)V`) rotates the entity position
around (320,240) into `ng.rotatedEntityScreenX`/`td.rotatedEntityScreenY`, renders
the entity sprite into `vf.spriteScratchRaster` with nearest rotation, then
restores the display raster. This renderer remains supported by source inspection.
`uj.scratchSpriteOverlapsBoard` centers the scratch raster at those coordinates
and compares it with `LogoPreparationSupport.boardOwnershipRaster`; a nonzero method guard returns
false. Its entity/angle parameters are used only in diagnostic wrapping.
`ma.contactProbeOverlapsScratchSprite` subtracts contact-probe offsets before
comparing the probe against the scratch raster. The moving-contact producer
uses the resulting probe coordinates to read the entity ID minus one.

`EntitySpawnSupport.spawnEntityAtPointer` accepts guard -28195, then removes the available pool's
last entity. Empty pools and other guards return immediately. It inverse-rotates
the integer pointer about (320,240), truncates both coordinates and initializes
velocity toward the center. Ordinary mode uses kind0 with the supplied category
and variant. Special mode maps `(categoryId + variantId) % 4` to kinds2/4/3/1;
kind2 retains its variant, kind1 retains its category, and the existing sprite
selector clears the other keys to -1. Equivalent argument joins now share the
original captured values, removing 15 intermediate locals. The remaining
variant/category joins preserve selection and evaluation order. The spawned entity's queue flag
is cleared before appending it to `ji.movingEntities`. Center spawning retains
the original NaN velocity behavior.

`ScorePopup.setAvatarNegativeRotationSteering` stores direction1;
`SecondaryDeque.setAvatarPositiveRotationSteering` stores direction2;
`jj.clearAvatarSteering` stores direction0. Original invalid-guard side effects
remain. The new native matrix independently checks 11,227 raster, wrapper,
controlled pool/spawn and steering cases, alongside unchanged earlier traces.
It does not establish full moving-contact production, live assets, malformed
buffer/overflow behavior or whole-game equivalence.


## Equivalent joins and the remaining control flow

The current generic reconstruction resolves aliases before checking later joins.
A value copied through two earlier carriers can therefore remain one captured
value when those paths meet. `EntitySpawnSupport.spawnEntityAtPointer` retains its argument
snapshots before variant/category selection, but no longer repeats them through
15 additional declarations. The selected variant/category still differ by path
and remain explicit. Other methods benefit from the same proof, including
caught-failure diagnostic builders. Original diagnostic strings stay unchanged.

This removes 1,075 generated declarations and 5,071 lines across 176 raw files;
53 obsolete naming rules retire and 132 guarded local ordinals migrate. The
reverse dictionary records every surviving original identity. Unknown names,
shared joins with different values and large structured methods remain. The
native matrices cover their controlled scopes, not complete gameplay/assets.

## Primitive selections and safe alias substitution (pass 52)

`EntitySpawnSupport.spawnEntityAtPointer` now expresses kind-dependent variant selection as
`selectedVariantId = (spriteKindId != 2) ? -1 : variantId;`. The selected kind,
board coordinates and velocities are still captured at their original points.
The genuinely different category join stays explicit. `PixelOverlapProbe`
selects positive clipping offsets in two conditional assignments. All original
numeric guards and first-overlap ordering remain.

The generic parser recognizes explicit qualified type arguments, allowing
`PlatformTaskDispatcher.run` to use a `for` loop for its allowed URL characters.
It preserves the generic failure call, catch boundary and counter observations.
The improved parser also preserves the socket method's existing carrier cleanup.
Alias substitution now edits identifier tokens only after complete scope checks;
literal diagnostic strings and member/method/type names are preserved.

This pass simplifies 12 primitive selections, removes 50 source lines across
eight raw files, and retains all declarations. Fourteen naming-map ordinals
migrate without changing semantic names. Native fixtures and reproducible source
checks cover their stated scopes; full URL-launch services, successful archive
loading, live contact production, full gameplay and device performance remain
unverified.

## Raster targets and nine-slice panels (pass 53)

`AwtRasterBuffer` owns `width`, `height`, `pixels` and the AWT `image` presented
to the canvas. `setAsRasterTarget` reinstalls that pixel array and dimensions in
`SoftwareRasterizer`. Game rendering temporarily targets scratch sprites,
board masks and scene rasters, then calls
`sh.mainRasterBuffer.setAsRasterTarget(...)` to resume canvas rendering.

`fk.createCanvasRasterBuffer` reflectively constructs the BufferedImage-backed
implementation `BufferedImageRasterBuffer`, calling
`initialize(height, component, width, guard)`.
It shares its integer pixels through `pixelDataBuffer`, `rgbColorModel` and
`imageRaster`, and keeps the component as `imageObserverComponent`. The factory
catches failure to construct it and creates `ImageProducerRasterBuffer` instead.
The latter sends pixels to its consumer under synchronization before `drawImage`.
Pass123 maps the direct reflected class name together with its declaration.
API callback names and all original guard, exception, preparation and publication
ordering remain; the headless probe verifies the preferred factory is selected.

`ma.drawNineSlicePanel(panelTop, panelLeft, panelHeight, guard, panelWidth,
nineSliceSprites)` draws row-major slots:

| Slot | Region |
| --- | --- |
| 0 / 1 / 2 | Top-left corner / top edge / top-right corner |
| 3 / 4 / 5 | Left edge / center / right edge |
| 6 / 7 / 8 | Bottom-left corner / bottom edge / bottom-right corner |

`centerTileLeft/Right/Top/Bottom` retain the original edge offsets used to place
tiles. `centerClipLeft/Right/Top/Bottom` can meet at a proportional split when
opposing borders exceed the panel size. These are distinct: clipping is adjusted
while tile placement retains its raw bounds. `edgeTileCoordinateOrCenterY` is
reused for horizontal edges, vertical edges and center rows; `centerTileX`
steps through center columns. `hd.nineSliceSavedClip` saves the shared clip
before each nonempty region and restores it after that region draws normally.
There is no invented finally cleanup on failure.

The existing nine-slice native fixture checks construction of the nine sprites;
it does not execute this panel renderer or AWT presentation. The new names are
supported by source and complete resolved-binding checks. Live assets, actual
presentation, full gameplay and phone performance remain unverified.

## Session rendering stages (pass 54)

`GameplaySession.renderSession` preserves its existing control flow. On ordinary
zero-client-guard paths, its rendering stages are:

| Stage | Named work |
| --- | --- |
| Unloaded theme | Select `themeResourceGroup`, format archive progress and draw the loading panel, then return |
| Board cache | Redraw attached entities when `boardRasterDirty`; settled/requested/in-progress state supplies `sceneTransitionFlag` |
| Main target | Restore `mainRasterBuffer`, draw the selected background and tutorial/score panels |
| Gameplay layers | Draw progress HUD, moving entities, cached board, avatar face/cry frame and transient entities under their original gates |
| Theme foreground | Rotate the foreground into its scratch raster and draw it around the board center |
| Spawn queue | Draw the queued-entity highlight and each fading queued entity |
| Optional debug overview | Draw half-size queue/layout silhouettes into `debugOverviewRaster`, blur them, then scale/composite onto the main raster |
| Overlays | Draw points, counters, score popups, game-over/transition/result overlays and pending-action panel; tutorial mode instead draws its prompt |

This describes the readable normal path; original nonzero client-control guards
and their nested labeled routing remain present. The result transition can
reveal the board behind the curtain using `sceneTransitionFlag`, and the score
box follows its original quadratic path during the game-over animation.

Some locals have several roles. `selectedThemeIdOrScoreBoxX` first selects a
loading-resource group, then carries the score-box X position.
`loadingPanelWidthOrScoreBoxY` similarly carries a loading-panel width and a
score-box Y position. `tutorialTopOrDebugColorOrTransitionClipTop` describes
three actual uses of one integer slot. `debugEntityXOrTutorialTextHeight`
retains the debug-circle X coordinate and later tutorial text-height use.
No split variables or inferred lifetime changes are introduced.

`spawnEntityGrayLevel` is repeated in RGB channels for a solid debug circle;
it is not an alpha parameter. Its normal path clamps to11..255 after the
lifetime calculation. The shared join slots then change roles from gray-level
comparison operands to composite height/enabled operands; those explicit stores
remain, including the nonzero client-guard paths.

`h.drawMovingEntities` traverses `movingEntities` and calls the entity's board
rotation renderer. `ni.drawTransientEntities` traverses `bh.transientEntities`
and draws on the current raster. Matching routes temporary kinds into that
queue; their existing animation/recycling logic remains.
`ij.drawAvatarFaceOrCryFrame` draws the shock star, tinted eyes/mouth or selected
`currentAvatarCryFrame`. `uh.drawSpawnQueueAndHighlight` rotates the first queued
entity's position, draws a circular/spiral highlight, then draws the whole queue.

`EntityCollisionSupport.preparePendingActionPanel` sizes the panel from `achievementTitles`, resets
its top position and retains the original minimum height. `vc.drawPendingActionPanel`
uses the same geometry and action ID for the title and quarter-size icon.
`EntityCollisionSupport.formatArchiveGroupProgress` returns the original fallback when the archive
query is false, otherwise formats the label, group percentage and percent sign.
It makes no new assumption about actual archive completion.

The debug overview is a distinct composite, not an ordinary sprite copy.
`SoftwareRasterizer.blurRasterRegion` applies row then column box averaging.
`DebugOverviewCompositor.compositeScaledDebugOverview` retains Q16 scale/trim/clip calculations.
`lc.blendScaledDebugOverviewPixels` skips zero source or destination pixels,
then mixes a0x112233 tint with per-channel products using source mean gray as
weights. Its destination gray starts as `((2*red + blue)/3 + green) >> 1`.
Packed masks, shifts, overflow and shared row-reset slots remain literal.
Pass 55 names every blur-kernel parameter/local and the three channel caches.
The kernels remain large, but their window phases and captured values now have
explicit roles; the control flow is unchanged.

These roles are supported by source and complete resolved-binding checks.
Existing native fixtures retain their documented scopes; full renderSession,
debug blending/blur, live panels/assets, AWT presentation, sustained gameplay
and phone performance remain unverified.

## In-place blur windows (pass 55)

`SoftwareRasterizer.blurRasterRegion` runs `blurRowsInPlace` and then
`blurColumnsInPlace` over the same pixels. Each kernel initializes a clipped
window, writes its first output, grows the window at the leading edge, slides
its full middle window, then shrinks the trailing edge. Edge outputs divide by
`windowSampleCount`; middle outputs multiply by `reciprocalWindowScaleQ14`
and shift by 14. Their truncation and clamp details remain literal.

| Role | Row kernel | Column kernel |
| --- | --- | --- |
| Window cursor reused for output | `windowXOrNegativeOutputCounter` | `initialWindowRowOrNegativeOutputCounter` |
| Phase limits | `growingWindowEndCounter`, `fullWindowEndCounter` | `columnIndexOrWindowEndCounter`, also reused as an initial column index |
| Entering/leaving reads | `enteringPixelIndex`, `leavingPixelIndex` | Same names, with row skipping |
| Accumulated channels | `runningRedSum`, `runningGreenSum`, `runningBlueSum` | `blurColumnRedSums`, `blurColumnGreenSums`, `blurColumnBlueSums` caches |
| Reused channel slot | Separate sums and outputs | `channelSumAfterRemovalOrOutputRed` holds red, green and blue subtraction results before serving as output red |

The column caches are allocated together when the red cache is absent or too
short, then cleared over `regionWidth`. `redSumsSnapshot`, `redSumsForwarded`
and `redSumsForUpdates` all refer to that same red array; the other channels have
matching aliases. The `*ForClampedStore` arrays and columns capture store targets
before the nonnegative channel result is selected. The aliases and captured
indices remain separate because this pass changes names only.

Entering and leaving reads use the pixel array that the kernels also overwrite.
This is the original in-place algorithm; replacing it with a convolution over a
separate source snapshot would require a behavior change. Initial overshoot,
clipRight/clipBottom gates, asymmetric clamp locations, integer overflow,
division and increment snapshots retain their original order. The source and
complete binding checks support these roles. Existing native fixtures do not
execute the blur kernels; live debug rendering and device behavior remain
unverified.

## Raster primitive geometry (pass 56)

Every field, method, parameter and local in `SoftwareRasterizer` now has a
guarded semantic name. The raster class still has large labeled methods;
this pass changes their identifiers without changing their control flow.

`fillCircle` and `fillCircleAlpha` initialize `clippedTop` and
`clippedBottomExclusive`, then walk `rowY` with an evolving `xExtent` and
`yOffset`. At their geometry comparisons, `xAdjustedSquaredDistance` tracks
`xExtent*(xExtent-1)+yOffset*yOffset` and `yAdjustedSquaredDistance` tracks
`xExtent*xExtent+yOffset*(yOffset-1)`, with the original integer arithmetic.
Upper spans exclude `spanRightExclusiveOrInclusive`; lower spans include it.
The original `centerY` parameter is also capped by the bottom limit. Alpha0
returns immediately and alpha256 delegates to `fillCircle`. Other alpha
values retain source/destination channel weights and eight-bit shifts.

`fillRoundedRectangle` uses the same two distance estimates around each corner,
with `horizontalCenterGap` extending the spans across the rectangle. It fills
the upper corners, middle band and lower corners in order.
`topCornerCenterYOrUpperHalfEnd` retains the original clipped reuse of the
corner center. `spanXOrMiddleRowSkip` first walks upper-span X coordinates,
then holds the middle band's destination row skip, then walks lower-span X.
`middleSpanX` remains its separate middle-band loop variable.

`drawCircle` and `drawRoundedRectangle` keep distinct paths for entirely
contained geometry and individually clipped pixels. `arcMajorOffset` shrinks
while `arcMinorOffset` grows. The circle keeps four evolving row centers and
the rounded rectangle keeps eight; the row-center names distinguish outer
major-offset rows from inner minor-offset rows. Their one adjusted estimate
tracks `major*(major-1)+minor*minor`. The circle still overwrites its original
`radius` parameter with the squared radius.

`drawLine` chooses the dominant axis and steps the other axis using
`minorAxisStepQ16`, rounded with `Math.floor(ratio+0.5)`. Its original start/end
parameters become deltas, Q16 accumulators and inclusive bounds as before.
`fillVerticalGradient` uses `gradientPositionQ16`/`gradientStepQ16` and adjusts
the position when clipping top rows. Alpha lines and rectangles expose their
source/destination weights; `grayscaleRectangle` retains the original
`((2*red+blue)/3+green)>>1` weighting. `clearFramebuffer` clears eight pixels
per iteration, then changes `unrolledThresholdOrPixelCount` into the full
pixel count for its tail loop.

`scanlineMaskStarts` and `scanlineMaskWidths` are optional per-row glyph masks.
The `bg` masked drawing kernel indexes them by Y relative to `clipTop` and
compares starts to X relative to `clipLeft`. Clip changes and raster release
clear both arrays. No non-null assignment appears in the exported game;
external mask population and actual masked glyph rendering remain unverified.
Source inspection and complete binding/reversal checks support these names.
Existing native probes retain their original scopes; no full raster, real-asset,
whole-game or device-performance claim is added.

## Font layout and glyph rendering (pass 57)

`BitmapFont` is the shared font layout/style base. `MonochromeBitmapFont`
implements binary mask glyph drawing: a nonzero byte draws the supplied color,
while zero advances without writing. The other two renderers retain their
original palette/coverage internals, but their `drawGlyph`/`drawGlyphAlpha`
method and parameter contracts now match the base. `shadowPass` stays in the
contract, including implementations that do not read it.

| API or data | Role |
| --- | --- |
| `glyphAdvances`, X/Y offsets, widths/heights | Advance the pen and position each glyph mask |
| `lineAdvance`, `maxAscent`, `maxDescent`, `capitalXAscent` | Baseline spacing, glyph vertical bounds and baseline-to-capital-X-top distance |
| `decodeFontMetrics` | Read compact advances or extended signed cumulative edge profiles |
| `computePairKerning`, `pairKerning` | Find the minimum overlapping trailing/leading profile gap and store its negation for each glyph pair |
| `measureTextWidth`, `measureCharacterAdvance` | Measure encoded glyph advances and relevant inline-image/kerning contributions |
| `wrapText`, `countWrappedLines`, `measureMaximumWrappedWidth`, `measureWrappedHeight` | Split at explicit breaks or supported space/hyphen opportunities and derive wrapped dimensions |
| `drawText`, `drawCenteredText`, `drawRightAlignedText` | Reset opaque text style and place one styled line |
| `drawParagraph`, `drawParagraphAlpha` | Wrap and align lines within the supplied rectangle |
| `setInlineImages` | Supply images and optional baseline offsets for img tags |

The compact metric form has257 bytes:256 glyph advances and one line advance.
Extended metrics read profile lengths/offsets, then leading and trailing edge
profiles accumulated through signed bytes. Allocated, forwarded and update
aliases remain separate declarations. Kerning omits space32 and nonbreaking
space160 pairs; the space profile supplies line advance. Constructors derive
vertical extents from glyph offsets/heights. Overflow and empty/malformed input
behavior remain as in the original source.

Text style is static shared state across font instances. Named fields distinguish
default/current color, shadow and alpha; underline/strikethrough colors use-1
for disabled decoration. `applyStyleTag` handles the original col/trans/str/u/shad
and closing tags; br resets style. `prepareJustification` counts spaces outside
tags and uses Q8 expansion/remainder. Paragraph vertical alignment retains its
extra-gap/line-index shared slot. The text drawing baseline parameter becomes
the line-top coordinate before glyph offsets are applied.

Inline images contribute full width and draw relative to their chosen baseline
offset. Caught image/tag errors retain their carriers and original handling.
`wrapText` preserves lowercased tag spelling, br placement, space/hyphen trim
rules and the original euro previous-character assignment8364. These names do
not normalize parser quirks or fix potentially malformed-input behavior.

`MonochromeBitmapFont` clips glyph rectangles with independent source and
destination offsets/row skips. `blitGlyphMask` writes in groups of four and a
tail; its width parameter becomes a negative tail count. `blitGlyphMaskAlpha`
weights the source packed RGB, then reuses alpha as the destination weight.
`blitGlyphThroughScanlineMask` clips against the clip-relative starts/widths;
its `unusedDestinationPixels` argument remains unused and writes target
`SoftwareRasterizer.framebuffer`. Captured read/write indices and all branches
remain. Every declaration in the font base and monochrome renderer is named,
but large labeled tag bodies and other renderer internals remain. Complete
binding/reversal checks support the naming pass; existing native probes do not
newly exercise fonts. Actual font/image assets, whole-game rendering and phone
performance remain unverified.

## Palette and coverage font details (pass 58)

The remaining renderers now read `PaletteBitmapFont` and `CoverageBitmapFont`.
Every field, method, parameter and local in these classes, `BitmapFont` and
`MonochromeBitmapFont` has a guarded semantic name. The palette/coverage
internals described as opaque in pass57 are now named; large labeled text
methods and other support code still remain.

`PaletteBitmapFont` stores `glyphPaletteIndices` and four `colorPalettes` slots,
initially installing the supplied palette only at slot0. In a normal glyph,
`color` selects the palette slot. In a shadow pass it is an RGB color passed to
the monochrome mask kernel. `blitPaletteGlyph` draws groups of four and a tail;
`blitPaletteGlyphAlpha` weights the selected palette color against the existing
pixel. Both preserve the signed byte snapshots and mask indices with255 at
lookup, with byte0 transparent.

`findNearestBasePaletteIndex` searches palette0 through `findNearestPaletteIndex`.
The search begins at index1, keeps the earliest strictly better candidate and
returns0 when none replaces the initial result. Its red difference uses
`(candidateColor >> 16) - (targetColor >> 16)` without masking; green and blue
are masked to eight bits. Squared distances retain their original overflow.
These names do not assume alpha-packed colors are normalized.

`CoverageBitmapFont` calls `convertPaletteGlyphsToCoverageInPlace` after the
base metrics constructor. It replaces each supplied palette entry with
`((2*red+blue)/3+green)>>1`, then rewrites nonzero glyph bytes through that palette.
The constructor conversion directly indexes by a signed byte; it does not add
an unsigned mask. It mutates and returns the original glyph arrays and also
mutates the supplied palette. `paletteColorOrGlyphIndex` exposes the original
shared slot between those loops. Existing signed-index failures and aliasing
are preserved.

`blitCoverageGlyph` reads each byte unsigned, uses it as the source weight and
then reuses the local for256-coverage. `blitCoverageGlyphAlpha` first computes
`(coverage*alpha256)>>8`; zero effective alpha skips the write. Its local then
becomes the destination weight. Coverage255 remains a255/256 blend in the
ordinary kernel. Source and destination packed channels keep separate masked
shifts and additions; no full-coverage shortcut, clamping or rounding change
is introduced. Shadow paths still delegate to monochrome mask blitting.

Source inspection, complete binding checks and byte-exact dictionary reversal
support this naming pass. Existing native probes retain their original scopes
and do not newly execute the fonts. Actual palette/font assets, image tags,
whole-game rendering and device performance remain unverified.

## Decoded sprite ownership and font factories (pass 59)

The graphics loading path uses shared working fields whose original holders
are spread across unrelated classes. Their names now expose the data rather
than implying that they belong to gameplay or UI state.

| Shared field | Meaning |
| --- | --- |
| `decodedSpriteCount` | Number of entries in the decoded sheet |
| `decodedSpriteCanvasWidth` / `decodedSpriteCanvasHeight` | Logical canvas dimensions shared by the sheet |
| `decodedSpriteXOffsets` / `decodedSpriteYOffsets` | Per-entry crop offsets |
| `decodedSpriteWidths` / `decodedSpriteHeights` | Per-entry stored pixel dimensions |
| `decodedSpritePalette` | RGB palette, with index0 left zero and nonzero entries decoding to black changed to1 |
| `decodedSpriteIndices` | Per-entry palette-index planes |
| `decodedSpriteAlpha` | Per-entry allocated alpha planes |
| `decodedSpriteHasNonOpaqueAlpha` | True when an explicit alpha plane has at least one byte other than255 |

`IntrusiveNode.decodeSpriteSheet` reads the sprite count at the end, then canvas
and crop metadata preceding it and the palette before that. It resets the
buffer cursor to0 for pixel data. `spriteDataBufferAlias` is the same object as
`spriteDataBuffer`, so metadata and pixel reads share its mutable cursor.
Storage flag bit0 selects column-major rather than linear row-major order;
bit1 adds alpha reads. The column-major path writes into row-major pixel
indices. Captured alpha bytes and flag-merging carriers remain explicit.
An alpha plane is allocated even without alpha data, but absent alpha leaves
the nonopaque flag false.

`mf.decodeSpritesFromArchive` reads the graphics file before its guard check,
returns false for a guard below102 or missing bytes, and otherwise decodes with
readGuard=true. `loadPaletteFontById`, `loadCoverageFontById` and
`loadMonochromeFontById` decode glyph graphics before obtaining metric bytes
using the same group/file IDs in the other archive. Named loaders resolve IDs
through the graphics archive first. Existing `loadPaletteFont`/`loadBitmapFont`
APIs stay unchanged; `TextInputValidator.loadCoverageFont` names the equivalent
coverage lookup. Guards, sentinel arithmetic and failure descriptions retain
their original order.

The three `build*FontFromDecodedSprites` factories return null for missing
metric bytes without clearing decoded working arrays. Successful constructors
keep the arrays they need, then call `kj.clearDecodedSpriteWorkingArrays(true)`.
Coverage construction still mutates the supplied palette/index data in place.
Constructor failures retain the original partially populated/retained state;
this pass adds no finally cleanup. The coverage factory's optional null-metrics
recursive guard call remains explicit.

`clearDecodedSpriteWorkingArrays` always clears Y offsets. With a true argument
it also clears heights, index planes, widths, X offsets and palette. It does
**not** clear decoded alpha planes, nonopaque flags, count or canvas dimensions.
The names describe the existing ownership and partial cleanup; no memory-release
change or complete decoded-state release is claimed.

| Builder | Output behavior |
| --- | --- |
| `buildSpritesWithDecodedAlpha` | RGB Sprite when the nonopaque flag is false; ARGB Sprite otherwise, combining decoded alpha shifted24 with palette RGB |
| `buildRgbSpritesFromDecodedSheet` | Convert all palette-index planes to RGB, ignoring alpha |
| `buildIndexedSpritesFromDecodedSheet` | Retain index/palette references; begin at the supplied firstSpriteIndex and leave earlier output entries null |
| `buildFirstRgbSpriteFromDecodedSheet` | Convert only entry0 to RGB |
| `buildFirstIndexedSpriteFromDecodedSheet` | Retain entry0's index/palette references |

Each builder preserves its original guard effects and cleanup point. The ARGB
path retains unused/forwarded alpha aliases and pixel-array snapshots; entry
guard reads remain even when their captured value is unused. Source inspection,
complete binding checks and byte-exact reversal support the names. Existing
native probes retain their original scopes and do not newly execute this sheet,
archive, font-factory or sprite-builder path. Actual assets, whole rendering/
gameplay and device performance remain unverified.

## Byte-array storage and readers (pass 60)

`ByteArrayBuffer` replaces the opaque `qc` name. Its `bytes` field is shared
backing storage and `position` is the mutable read/write cursor, not a checked
length. The capacity constructor uses the original byte-array pool; the array
constructor retains the supplied reference, including null. `pk` still inherits
this storage base. Crypto/hash state and unrelated static helpers remain here
with their original opaque names.

| Reader | Successful read with its expected guard |
| --- | --- |
| `readSignedByte` / `readUnsignedByte` | One byte, signed or masked with255 |
| `readUnsignedShortBE` | Two unsigned bytes, big-endian |
| `readUnsignedMediumBE` | Three unsigned bytes, big-endian |
| `readIntBE` | Four bytes forming a signed int |
| `readLongBE` | Two masked32-bit words, high word shifted32 |
| `readVariableIntBE` | Seven-bit groups, most-significant group first; negative signed bytes continue the scan |
| `readUnsignedShortOrInt` | Leading bit0 selects BE16; leading bit1 selects BE32 masked with0x7fffffff, without consuming a separate prefix |
| `readSignedSmart` | Leading unsigned byte<128: one byte minus64; otherwise BE16 minus49152 |
| `readUnsignedSmart` | Leading unsigned byte<128: one byte; otherwise BE16 minus32768 |
| `readNullTerminatedText` | Consume through zero and decode the preceding slice with the existing client character mapping |
| `readNullableNullTerminatedText` | A leading zero consumes one byte and returns null; otherwise use the ordinary text reader |
| `readZeroPrefixedNullTerminatedText` | Consume and require a zero prefix, then read null-terminated text |

These APIs preserve obfuscation guards. `readUnsignedShortBE(false)` advances
by2 then returns58 without an array read. `readIntBE` advances by4 before
returning62 for guards>=-25. `readUnsignedShortOrInt` returns95 for guard!=-27
without advancing; `readUnsignedSmart` similarly returns3 for guard!=1.
The signed smart reader evaluates its sentinel remainder before peeking and
can fail there. The long reader retains its table-clearing guard between words.

Other invalid guards can backpatch bytes, invoke the RSA helper or load a sprite
before reading; they are not merely unused arguments. Individual byte reads
advance before array access, so failure can leave an advanced cursor. Empty
ordinary text and a nullable zero marker return before their guard side effects.
Nonempty ordinary text retains the field_i=68 guard write. Variable-length
reads retain their original int overflow and unbounded scan. Diagnostic strings
keep the original class/method spelling for reversal and trace comparison.

Every selected reader parameter and local has a guarded semantic name. All
prior complete rules and source/generator pins remain unchanged. Compilation,
full binding checks, byte-exact reproduction and dictionary reversal support
this pass. Existing native result-helper fixtures cover their original packet
cursor/storage uses; they do not newly execute these thirteen readers. Other
buffer writers/helpers, actual archives, complete gameplay and device
performance remain unfinished or unverified.

## Buffer writes, copies and checksums (pass 61)

The ordinary buffer writes now expose their width and byte order. `writeByte`,
`writeShortBE`, `writeMediumBE` and `writeIntBE` write the low8/16/24/32 bits.
`writeLong40BE`, private `writeLong56BE` and `writeLongBE` write five, seven and
eight bytes. Each per-byte store captures the old position and advances before
access; a failing store can therefore leave an advanced cursor. Guard checks
and sentinel division/remainder occur at their original points, including
between stores and after partial or complete output.

`writeVariableIntBE` emits up to five seven-bit groups, most-significant first,
using the original unsigned shifts and masks. The expression
`(value | 2097436) >>> 14` stays intact. Its final guard can append an extra
medium. `writeSignedSmart` uses one byte for [-64,63], adding64, and two bytes
for the rest of [-16384,16383], adding49152. Out-of-range input retains its
optional guard read and original `IllegalArgumentException`.

`writeBytes` copies from `sourceOffset` into the buffer; `readBytes` copies into
`destinationOffset`. They remain sequential loops, preserving overlap behavior,
endpoint overflow, per-iteration cursor changes, guard calls and diagnostic
wrapping. `padZerosToPosition` writes until an absolute end position; its guard
can read a medium afterward, even if no padding was required.

`writeNullTerminatedText(text, characterStart)` rejects any zero in the supplied
text and encodes the slice from characterStart to text.length(), then appends0.
The second argument is the start character offset passed to the shared encoder.
`writeZeroPrefixedNullTerminatedText` searches for a zero before its guard and
outside its catch. Wrong guard returns after that search; valid guard rejects
zero, writes a zero prefix, encodes all text and appends a terminator. The
client mapping, partial-write behavior and null/failure scopes remain.

`writeBase38Text` packs up to20 positions into two ten-character chunks. It
visits positions19 down to0, assigning letters2..27 case-insensitively,
digits28..37, other present characters1 and missing positions0. It writes
positions0..9 first, then10..19, using two BE56 stores. The original true guard
sets position=-109 before encoding; this unusual path remains explicit.

| Backpatch | Expected guard behavior |
| --- | --- |
| `backpatchLengthByte` | Write one byte at position-length-1 |
| `backpatchLengthShortBE` | Write BE16 at position-length-2 |
| `backpatchLengthIntBE` | Write BE32 at position-length-4 |

These expected paths leave position unchanged. False preserveHashTables clears
field_g in the short backpatcher. A nonzero guard in the int backpatcher calls
`appendCrc32(13,61)` after the high-byte store, so subsequent store indices use
the changed position. All original index expressions and truncation remain.

`oe.computeCrc32` initializes its accumulator to-1, processes
bytes[startPosition,endPosition) with low-byte lookup and unsigned shift8, then
complements it. `ClientTimingSupport.crc32Table` is built using eight reflected0xedb88320 steps
per entry. Guard>-27 retains the original null-text helper call before computing.
`appendCrc32` returns -122 with no writes for guard<=4; otherwise it appends and
returns the checksum. `verifyTrailingCrc32` first subtracts4 from position,
computes over bytes[0,position), then reads the stored BE32. Its expected guard
restores the initial position; other guards and failures retain their original
cursor changes and helper calls.

All selected writer/copy/checksum parameters and locals, the shared CRC helper
and its lookup initializer have guarded names. Every prior complete naming rule
and source/generator pin is unchanged. Compilation, binding checks, byte-exact
reproduction and reversal support this pass; existing native fixtures retain
their original scope without new writer/CRC execution coverage. Buffer crypto,
unrelated static helpers, actual asset loading, full gameplay and device
performance remain unfinished or unverified.

## Packet bit access and byte cipher (pass 62)

`PacketBuffer` extends `ByteArrayBuffer` with private `bitPosition` and `cipher`.
Its constructors delegate the supplied storage/capacity without changing
ownership. These fields start at Java's default0/null. Unrelated static music,
connectivity and UI helpers remain on the original class; the names describe
the instance packet role.

| Packet API | Existing behavior |
| --- | --- |
| `beginBitAccess(bitsPerByte)` | Set bitPosition=bitsPerByte*position, normally using8; preserve arbitrary scale and overflow |
| `readBits(methodGuard, remainingBitCount)` | Advance bitPosition by the requested count, then collect groups MSB-first through lowBitMasks; mutate remainingBitCount as groups are exhausted |
| `endBitAccess(methodGuard)` | Set position=(bitPosition+7)/8, then clear cipher for guard!=-16989 |
| `initializeCipher(seed, finishBitAccess)` | Construct/assign the generator; true calls endBitAccess(-68), changing position and clearing the new cipher |
| `writeCipherByte(value, methodGuard)` | Store low8 bits of value+nextInt(0), then retain the guard-triggered static helper |
| `readCipherByte(methodGuard)` | Read the signed stored byte, subtract nextInt(0), mask with255; guard!=122 first sets bitPosition=-51*position |
| `readCipherBytes(methodGuard, destinationOffset, destination, length)` | Sequential subtraction/truncation, with original sentinel remainder before copying and contextual catch |

`readBits` captures the client guard and derives its byte index before testing
the method guard. Guard!=-17 returns -69 without advancing bitPosition. Valid
guard advances the bit cursor before any array read. `lowBitMasks` contains0,
low-n-bit masks for1..31, and -1 for32. Signed byte shifts, zero/invalid counts,
mask-index errors, endpoint arithmetic and partial failures remain. Ending bit
access retains signed int division rather than adding validation or replacing
negative/overflow behavior with a new rounding policy.

Cipher byte APIs advance byte position before array access and generator
consumption. This ordering matters when backing storage, destination or cipher
is invalid; aliases and partial writes remain. Wrong guards can adjust the bit
cursor, clear the cipher or call unrelated static helpers at their original
points. Literal diagnostics retain the old `pk` spelling.

`PacketByteCipher` owns separate256-word `stateWords` and `results` arrays.
The constructor copies every supplied seed word into results, then initializes;
null or seeds longer than256 keep their original partial allocation/copy failure
and wrapped diagnostics. Initialization starts eight mixing words at
-1640531527, runs four preliminary rounds, adds seed words while filling state
in eight-word blocks, then performs a second state-based mixing pass. It
produces a batch and sets `remainingResults` to256.

`generateResults` increments `generationCounter` and adds the new count to
`lastResult` before its guard call. For each state word, it xor-shifts
`accumulator` according to the low index bits, adds the128-offset state word,
then updates state and output through the original shifted/masked indirect
lookups. Updated state is visible to subsequent iterations. The method retains
all wraparound, signed/unsigned shifts, lookup masks and guard calls.

`nextInt(regenerateAtRemaining)` regenerates when remainingResults equals the
supplied threshold, normally0. It snapshots oldRemaining-1 and decrements
before reading that result slot. Results therefore come out in descending
indices; nonzero thresholds and invalid remaining counts retain their original
behavior. Constructor and other literal diagnostics keep the `ne` spelling.

Every instance declaration and constructor contract in both classes now has a
guarded semantic name. Source/binding checks, byte-exact reproduction and
reversal support this pass. Existing native cache/result fixtures use the
packet type and inherited storage/cursor; they do not newly execute these bit
or cipher routines. Static helpers, actual packet/server traffic, complete
gameplay and phone/FPS/heap behavior remain unfinished or unverified.

## Buffer crypto and Whirlpool state (pass 63)

The remaining buffer instance APIs now have explicit roles. Their names identify
source behavior; the pass changes neither algorithms nor error handling.

| Buffer API | Existing behavior |
| --- | --- |
| `encryptXteaBlocks(key, methodGuard)` | Reset position0 and encrypt positionBeforeReset/8 complete blocks; finish at the processed length |
| `decryptXteaRange(methodGuard, key, startPosition, endPosition)` | Decrypt complete blocks in the supplied range; restore the saved position only on successful loop exit |
| `replaceWithModPowResult(resultPositionGuard, modulus, exponent)` | Read the current prefix as a signed BigInteger, apply modPow, then write BE16 result length and signed result bytes at the supplied output position |

The XTEA identification follows the source's two-word shifts/additions, delta,
32 cycles and key indices, compared with the primary
[Bouncy Castle XTEA engine](https://github.com/bcgit/bc-java/blob/main/core/src/main/java/org/bouncycastle/crypto/engines/XTEAEngine.java).
The original masks7480/7701 are retained: after unsigned shift11, only mask
bits11/12 survive, selecting the same two key-index bits. Decryption starts at
0xc6ef3720, which is32*delta modulo2^32. Both paths read BE32 pairs, execute
cycles in locals, rewind8 and write the updated pair. Failed key access or a
later block leaves prior writes and the current cursor; no finally restoration
is added. Encryption leaves incomplete trailing bytes untouched and drops them
from the final cursor length. Invalid guard calls and endpoint overflow remain.

The modular-power method uses `new BigInteger(payload)` and `toByteArray()`
with their original signed encodings. The output-position argument also selects
the copy guard through xor29915; the ordinary caller supplies0. Empty/null
payloads, invalid modulus/exponent, output length truncation, partial writes and
wrapped failures retain the original behavior. No extra padding is inferred.

`WhirlpoolHash` replaces `ge` for its instance digest role. Its field layout and
table/compression structure match the
[Whirlpool authors' specification](https://www.karljapetre.com/whirlpool/whirlpool.pdf).
Static network, text and shared CRC helpers stay on the same owner with prior
names. The instance state is now explicit:

| State | Role |
| --- | --- |
| `hashWords` | Eight64-bit chaining words and final digest words |
| `blockBuffer` |64-byte block buffer, including partial-bit input and padding |
| `messageBitLength` |32-byte big-endian accumulated input bit length |
| `bufferedBitCount` / `bufferBytePosition` | Current block bit count and byte index |
| `messageWords` | Eight BE64 words loaded from the block |
| `roundKey` / `cipherState` | Per-block key schedule and cipher state |
| `roundScratch` | Reused temporary output for key and state transformations |

The shared `ByteArrayBuffer.whirlpoolTables` initializer decodes alternating
bytes from the original packed literal. It forms GF(256) multiples2/4/5/8/9
with reduction xor285, assembles each diffusion word, then rotates right8 to
create seven more tables. `whirlpoolRoundConstants` has a zero entry followed
by ten entries built from consecutive substitution bytes. Initializer locals
show the reused substitution-index/round and packed-pair/round-offset roles.
`clearWhirlpoolTables` clears constants first, then tables, preserving its
wrong-guard helper call. Other existing guards still clear either shared array.

`processBlock` captures chaining/message words, initializes roundKey from the
hash and cipherState from message xor key, then performs ten separate key/state
rounds through the shared tables. Scratch copies, round-constant insertion,
byte shifts and indirect masks remain. Chaining words become
hash xor(cipherState xor messageWords). A guard below103 returns before this
processing after the original client-guard capture.

`updateBits` retains source alignment, partial destination-byte bits and the
remainingBitCount parameter's mutation. Its methodGuard also seeds the message-
length carry and selects a compression guard; the ordinary caller supplies0.
Lookahead reads,512-bit block crossings, partial-byte storage, negative/zero
counts and contextual failures remain.

`finishDigest` appends a one bit, zero-pads, optionally processes an extra block,
copies the32-byte length and writes64 digest bytes as BE64 words. False
skipResetGuard calls `reset(-38)` before final padding, retaining its byte-index
101 side effect. Normal reset52 zeroes the length and hash words, byte0 of the
block and the cursors; it leaves the other block bytes and scratch arrays for
later overwrite. Digest completion adds no automatic reset or new reuse policy.
Aliases, partial output, original padding order and guard failures remain.

Pure helpers now read `xorLong`, `orLong`, `andLong`, `andInt` and `orInt`.
They still call the original owner and evaluate both arguments in the original
order; no operator inlining is performed. Every buffer/hash instance declaration,
table-initializer local and selected helper parameter has a guarded semantic
name. Compilation, binding checks, byte-exact reproduction and reversal support
these names. Existing native sprite/pixel/transform fixtures retain their prior
operator-consumer scope without new crypto/hash execution coverage. Real
archives/server traffic, full gameplay and device performance remain unfinished
or unverified.

## Text-byte encoding and archive-name hashing (pass 64)

The client uses one byte per UTF-16 code unit. Characters 1..127 and 160..255
map directly; 27 extended characters map to defined slots in bytes 128..159.
Unsupported code units, including zero and surrogate halves, become byte 63
(`?`). `lf.extendedTextCharacters` is the matching decoding table, with five
undefined slots. There is no surrogate joining or UTF-8 conversion.

| API | Existing behavior |
| --- | --- |
| `ByteArrayBuffer.encodeTextCharacter(character, returnEncodedByte)` | Return the mapped signed byte when true; false returns 50 after mapping |
| `hi.encodeTextSlice(text, destination, characterStart, characterEnd, destinationOffset, methodGuard)` | Compute end-start, then encode sequential charAt calls into the destination; guard other than 98 returns 52 before argument reads |
| `jf.encodeTextBytes(text, methodGuard)` | Allocate one byte per code unit and map each character; guard below 117 retains a helper call before text.length |
| `EntityMotionSupport.hashEncodedText(methodGuard, text)` | Accumulate wrapping 31*hash plus the signed encoded byte; guard at most 42 retains the recursive null-text call |
| `ByteTextDecodingSupport.decodeTextSlice(decodeGuard, textBytes, offset, length)` | Skip zero bytes; decode extended slots through the shared table, using `?` for undefined entries |
| `ag.decodeTextBytes(decodeGuard, textBytes)` | Decode the whole array; guard other than 1 clears field_j before inspecting length |

Font lookup masks encoded bytes with 255 to obtain unsigned glyph indices.
Archive group/file-name lookups use `hashEncodedText` after their existing
normalization and retain signed byte contributions. Slice encoding does not
add bounds validation: negative/overflow lengths, per-character reads, aliases,
partial writes and wrapped failures keep their original order. Whole encoding
keeps its global guard snapshot outside the catch. Decoding retains allocation
before guard effects, shared array aliases and the literal bc.B/ag.B contexts.

Every parameter/local in these six APIs now has a guarded name, with every
previous complete rule unchanged. Compilation, binding checks, reproduction
and dictionary reversal support this pass. The native text fixture verifies
all-byte decoding, slice boundaries, guard effects and nested failure contexts;
it does not newly execute encoding or name hashing. Compressed text, actual
font/archive assets, complete gameplay and device performance remain unfinished
or unverified.

## Prefix-code compressed text (pass 65)

`PrefixCodeDecoder` names `qa` for its instance decoding role. The existing
static font, menu-avatar, queue and applet helpers remain on that owner; their
identities and behavior are unchanged. `decodeTree` is its only instance field.
`vj.compressedTextDecoder` is the shared reference used by the text reader.

| Contract | Existing behavior |
| --- | --- |
| `readCompressedText(buffer, guardAndDestinationOffset, maximumDecodedLength)` | Read unsigned smart length with guard+1, clamp, allocate, decode, advance the buffer by the returned consumed-byte count, then decode text bytes |
| `decodePrefixBytes(destination, sourceOffset, source, destinationPosition, methodGuard, outputLengthThenEnd)` | Walk packed tree bits, emit requested bytes, return touched source-byte count |

The reader's second argument has three roles: smart-read guard selection,
output start offset and text-decoding guard xor -103. Its observed `bk` caller
passes 0 and a maximum decoded length of 80. The inner catch converts any
Exception to literal `"Cabbage"`; Errors are not included. Smart reads can already
have advanced the cursor when allocation or decoding fails. Compressed-byte
cursor addition occurs only after successful decoder return. No rollback or
additional bounds validation is introduced.

Decoding captures the client guard before its catch. Zero output length returns
0 before evaluating `121 / ((-63 - methodGuard) / 59)` or reading either array.
Otherwise outputLengthThenEnd becomes the destination endpoint. Each source
byte is traversed from bit 7 down to bit 0. A zero edge increments treeIndex;
a one edge follows decodeTree[treeIndex]. A negative node emits byte(~nodeValue)
and restarts at root 0. Each write snapshots then increments destinationPosition
before the store. Reaching the output endpoint returns sourceIndex+1-sourceOffset,
counting a partially consumed final byte. Aliases, signed source bytes,
integer wraparound, partial output, malformed trees and literal qa.E context
remain unchanged.

The fixed source contains no decodeTree assignment or non-null assignment to
the shared decoder, and its private constructor throws Error. This pass preserves
that source; it does not reconstruct absent initialization or claim live
compressed-text support. All selected parameters/locals now have guarded names,
with every prior complete rule unchanged. Compilation, binding checks,
reproduction and reversal support these identities. Native gameplay fixtures
cover the renamed owner's existing avatar/queue consumers, without new prefix
codec execution. Real table setup, actual packets/archives, opaque helpers,
complete gameplay and device performance remain unfinished or unverified.

## Resource archive storage and lookup (pass 66)

`ResourceArchive` names the instance archive wrapper of `rh`; the static
attached-entity update and shared text helpers remain on that class. It owns a
lazy `index` from `archiveSource`, staged `packedGroups`, per-group `decodedFiles`,
a `discardPackedGroups` flag and `fileRetentionPolicy`. Successful index acquisition
allocates both top-level arrays. If allocation fails after the index assignment,
that partial state remains; subsequent index checks still observe the stored index.

| API | Existing behavior |
| --- | --- |
| `ensureIndexLoaded(methodGuard)` | Fetch metadata and allocate group/file storage lazily |
| `getGroupSlotCount(returnGuardConstant)` / `getFileSlotCount(methodGuard, groupId)` | Return sparse slot capacities, with original guard constants and unavailable values |
| `hasGroupName`, `findGroupId`, `findFileId` | Lowercase with existing locale behavior, hash signed encoded text bytes and consult name tables |
| `loadPackedGroup`, `loadGroupIfNeeded`, `loadGroupByName`, `loadAllGroups` | Stage source payloads; availability does not imply decoded files |
| `isValidGroupId` / `isValidFileId` | Check slot ranges; file validation does not independently reject sparse holes |
| `isFileAvailable` / `isNamedFileAvailable` | Report decoded entry or staged packed bytes, requesting a group if needed |
| `getFile`, `getNamedFile`, `getSingleFile` | Retrieve bytes through cache/unpack/load/retry paths and apply retention cleanup |
| `getGroupProgress`, `getGroupProgressByName`, `getLoadProgress` | Report staged groups as 100 or use source progress; aggregate only groups with actual files |

`loadAllGroups(initialSuccess)` seeds its result from the argument: false stays
false even when all groups are loaded. `getSingleFile` selects group 0 when there
is one group slot; otherwise it requires a valid group containing one file slot.
The methods retain their original unusual guards and early-return ordering.
Name lookup preserves group/file argument order, nullable failures, default-locale
lowercasing and original diagnostic strings. `findGroupId` can clear the discard
flag through its wrong guard only after finding a valid group.

`unpackGroup(requestedFileId, methodGuard, decryptionKey, groupId)` validates the
group, requires staged bytes, allocates file slots and scans actual sparse file
IDs. Already cached files return success. A supplied key with a nonzero first
four words copies packed storage before decrypting byte range [5,length); null
or all-zero keys retain the original storage path. Guard 4 is checked after
extraction/decryption. Decompression failure preserves group, key-presence,
length, checksums and index context. The discard flag clears packed storage only
after successful decompression, before file splitting.

Multi-file payloads end with a chunk-count byte and a BE32 length-delta table.
Accumulating each row reconstructs successive file chunk lengths. Ordinary
policies make a sizing pass, allocate each file, reset write positions and copy
all chunks. Policy 2 sums and copies only the requested file. Its zero-length
case returns true without storing an entry. Original aliases, table offsets,
signed overflow, malformed inputs, allocations and partial writes remain.
Several integer slots are reused for chunk/file indices, lengths and offsets;
combined local names make those role changes explicit.

| fileRetentionPolicy | Storage and successful retrieval cleanup |
| --- | --- |
| 0 | Keep decoded files through the existing storage helper; arrays up to 136 bytes can remain raw |
| 1 | Store raw files, clear the retrieved file, and clear its group slots when that group has one file slot |
| 2 | Store raw requested output, selectively split multi-file groups, then clear the decoded group on retrieval |

`discardPackedGroups` is independent of these three policies. True uses direct
source bytes during staging and discards packed data after decompression; false
uses the storage helper and retains the packed group. Small storage-helper
inputs can still be raw aliases. Successful retrieval extracts bytes before
cleanup; failures add no rollback or finally cleanup. Existing synchronized
method boundaries remain.

Every instance field/API and constructor parameter/local has a guarded name,
with all previous complete rules unchanged. Compilation, binding checks,
reproduction and reversal support this pass. The native text fixture preserves
its decoder and nested null-archive diagnostic scope; it does not execute group
unpacking, source concurrency, storage wrappers or real assets. Archive-index,
provider and compression helpers, static shared names, full gameplay and device
performance remain unfinished or unverified.

## Archive metadata and integer lookup (pass 67)

`ArchiveIndex` names `bm` for its instance metadata role. Shared static UI,
transform and packet helpers remain on that owner. Its constructor receives
packedIndexBytes, expectedCrc32 and optional expectedWhirlpoolDigest. It computes
and stores CRC before comparing; a supplied digest must have 64 bytes and is
then computed/stored/compared in ascending byte order. Only then does it parse
the compressed metadata with guard 119. Invalid inputs retain their original
partial field assignments and literal constructor diagnostics.

| Metadata | Meaning |
| --- | --- |
| groupCount / groupIds | Actual listed groups and delta-reconstructed IDs |
| groupSlotCount | Maximum group ID plus 1, including sparse holes |
| fileCounts / fileIds | Actual listed files and optional sparse ID lists |
| fileSlotCounts | Per-group maximum file ID plus 1, including holes |
| indexRevision / groupRevisions | Index and per-group revision words |
| indexCrc32 / groupCrc32 | Packed index and per-group payload checksums |
| indexWhirlpoolDigest / groupWhirlpoolDigests | Computed index digest and optional per-group 64-byte digests |
| groupNameHashes / fileNameHashes | Optional name hashes indexed by sparse IDs, with -1 holes |
| groupNameLookup / fileNameLookups | Integer-key tables mapping hashes back to slot IDs |

`decodeIndex(methodGuard, packedIndexBytes)` decompresses, accepts format 5..7,
reads revision 0 for format 5 or BE32 for 6/7, then reads flags. Bit 0 enables
name hashes; bit 1 enables group digests. Other bits remain unchecked. Formats
5/6 use unsigned BE16 counts and ID deltas; format 7 uses short-or-int. Metadata
arrays allocate in the original order. File-ID lists become null when the
actual count equals maximum ID+1, leaving ordinal IDs implicit. Wrong guard
below 109 retains the recursive null-input call after digests and before group
revisions. Integer overflow, partial arrays and repeated-parse behavior remain.

`IntKeyLookup` names `am` for its instance integer-key mapping. `keyIndexPairs`
stores keys in even positions and original input indices in odd positions.
The constructor grows a power-of-two bucket count strictly beyond
keys.length+(keys.length>>1), fills every position with -1, then inserts keys
in input order using linear probing. Lookup tests the index position for an
empty bucket, so key -1 is valid. Duplicate keys return the first matching
inserted entry. The table retains key/index values rather than the input array;
source-read order and sizing overflow are unchanged.

`findIndex(preserveUnachievedSprite, key)` starts at key&bucketMask, returns -1
at an empty index, matches the key or advances (bucket+1)&bucketMask. False
first clears the existing unachievedSprite global. Other static archive
creation/raster/UI helpers remain on the same owner with their previous names.
The complete sparse name-hash arrays, including -1 holes, still feed this table.

`ArchiveSource` names `nh` for its abstract provider role. All three contracts
match `bj` overrides and keep their existing guards:

| Source API | Existing provider behavior |
| --- | --- |
| getIndex(methodGuard) | Return cached metadata or poll an index request; validate, retry and optionally persist bytes |
| getPackedGroup(methodGuard, groupId) | Obtain a group request, read its bytes and unlink it before wrong-guard background work |
| getGroupProgress(methodGuard, groupId) | Query the request cache before guard checking; return request progress or 0, with guard <125 returning -119 |

Disk index requests compare indexRevision to the expected revision after
constructor CRC/digest validation. Network index requests retain CRC/digest
validation and their original retry/reset and queued disk-write paths; this
method adds no expected-revision comparison to that branch. Incomplete requests
return null. Clearing the completed request and allocating group-state storage
retain their original order. Private provider fields/requests/helpers remained opaque at pass 67;
pass 68 names their instance declarations and request records.

`NameCharacterSupport.computePrefixCrc32(bytes, methodGuard, length)` delegates to the existing
CRC helper at start position 0; guard below 56 retains recursive null-input
behavior. `SpriteState.computeWhirlpoolDigest(length, sourceOffset, source, bitsPerByte)`
uses the existing hash instance with reset 52 and a 64-byte result. Positive
offsets first copy length bytes; offset <=0 uses the original source. A nonzero
client guard preserves the original early-copy/alias branches. The bit count
is (long)(bitsPerByte*length), with signed int multiplication before widening.
The ordinary caller supplies 8. No overflow fix, bounds validation or new
alias policy is introduced; partial effects and literal gg.C/wh.MA contexts
remain.

Every index/lookup instance declaration and constructor contract, selected hash
helper parameter/local, and source/override API parameter/local has a guarded
name. All previous complete rules and source/generator pins remain. Compilation,
binding checks, reproduction and reversal support this pass. Existing native
text fixtures retain their decoder/guard/nested-failure scope without new
metadata/lookup/hash/provider execution. Private provider/storage/compression
helpers, static shared names, real assets/server traffic, complete gameplay and
device performance remain unfinished or unverified.

## Cached archive requests and background work (pass 68)

`CachedArchiveSource` names `bj` for its concrete provider role. It owns the
archiveId, expected index CRC/digest/revision, loaded index, networkClient,
diskWorker, optional indexDiskCache/groupDiskCache and a groupRequests table.
All instance declarations and constructor contracts have guarded names; shared
static text/graphics helpers stay on the owner. Constructor table/queue allocation
still occurs before its catch, and supplied digest/storage references are retained.

| Provider state | Role |
| --- | --- |
| groupDiskStatus | 0 unknown, -1 invalid/unavailable, 1 validated or queued for disk storage |
| verifyDiskCachePending | Initial verification phase when groupDiskCache exists |
| downloadAllPending | Requested full download phase, enabled only with groupDiskCache |
| backgroundGroupIndex / backgroundGroups | Scan cursor and unresolved group IDs for the active phase |
| requestedGroups | Private queue scanned by processRequestedGroups; no producer exists in the fixed source |
| sweepCompletedRequests / nextRequestSweepMillis | Optional completed-request cleanup and its deadline |

`getGroupRequest(methodGuard, requestMode, groupId)` first checks groupRequests.
Foreground mode 0 discards a cached pending nonpriority request, then uses disk
unless its status is -1; otherwise it requests priority network data. Mode 1
requires disk cache and queues verification. Mode 2 requires disk cache and
status -1, then requests background network data. Full queues return null
before insertion. Pending requests return null. The method obtains bytes before
testing guard -71, preserving malformed guards and partial request effects.

Disk responses require more than two bytes, validate CRC excluding the final
two bytes, optionally compare a 64-byte Whirlpool digest, then check the low
16 revision bits in that suffix. Caught Exception marks disk status -1, unlinks
and may retry priority network. Network responses validate CRC/digest, reset
existing client counters on success, and catch RuntimeException to reset,
unlink and possibly retry. Successful network data gets its revision written
into the final two reserved bytes in place. The provider queues a disk write,
updates disk status and unlinks nonpriority records at their original points.
No additional copy, ownership rule, retry or exception handling is introduced.

`requestAllGroups(methodGuard)` returns without groupDiskCache; otherwise it
sets downloadAllPending and allocates backgroundGroups if necessary. Its wrong
guard still changes the cleanup deadline. `processRequestedGroups` requires a
background queue and loaded index, removes invalid/empty IDs, requests mode 1
for status 0 and mode 2 for status -1, then removes status 1 entries. The fixed
source only allocates/iterates requestedGroups; it does not enqueue into it.

`advanceBackgroundLoading(methodGuard)` gives disk verification priority over
downloads. Verification retries unresolved queued groups and scans nonempty
index slots while disk-worker depth is below 250, finishing when statuses are
nonzero. Downloads request groups whose status is not 1 while the network
background queue has room; the client retains its 20-outstanding-request limit.
Unresolved IDs join backgroundGroups. Complete phases clear their flag and reset
the shared cursor; the queue clears when no phase remains. Missing index data
returns before cleanup. Original large labeled bodies and duplicate arms remain.

When enabled and its deadline is reached, cleanup skips pending records and
sets seenByCleanup on completed records. A later sweep unlinks previously marked
priority records and throws for a marked nonpriority record. The deadline moves
by 1000ms only after an actual sweep. Wrong guards preserve their group-get call,
clock order and other side effects.

| Request type | Instance contract |
| --- | --- |
| ArchiveRequest | Dual-link record, volatile pending initialized true, priority flag, seenByCleanup marker and getBytes/getProgress virtual APIs |
| DiskArchiveRequest | diskCache, operationType and original bytes; operation 1 synchronous read, 2 queued write, 3 queued read |
| NetworkArchiveRequest | responseBuffer, signed reservedTailBytes and blockPosition within 512-byte transport blocks |

Disk getBytes returns null for the wrong guard before checking pending; normal
pending throws, completed returns the original array. Its progress is 0/100,
with wrong guard first clearing diskCache. Network getBytes rejects pending or
incomplete non-tail data; its wrong guard invokes getProgress(-105) before
returning the original buffer bytes. Network progress uses
100*position/(length-reservedTailBytes), preserving overflow/division, and wrong
guard returns 76. Transport sets blockPosition to 10 after its response header,
resets it at 512 and uses 1 after a continuation marker.

The disk worker's synchronous read normally sets priority true, but reusing a
matching queued write returns its byte alias early with priority still false.
That behavior stays visible; this naming pass does not alter the flags or queue
protocol. All selected instance declarations/constructor contracts and every
previous complete rule remain. Compilation, binding checks, reproduction and
reversal support these names. Existing native text fixtures retain their prior
scope without new provider/request/worker/transport or actual asset execution.
Worker/network/storage/compression helpers, static shared names, remaining large
bodies, full gameplay and device performance remain unfinished or unverified.

## Disk-cache worker and secondary request queue (pass 69)

`DiskCacheWorker` names `uf` for its instance role. All four instance fields,
six instance methods, constructor parameter and instance locals have guarded
names. Static UI/login helpers still share this owner. The constructor builds
the queue before its catch, asks `PlatformTaskDispatcher.startThread` to run it
at priority 5, polls the volatile task status with the existing sleep helper,
throws on status 2, then retains the returned thread.

| Worker member | Role |
| --- | --- |
| requestQueue | SecondaryDeque FIFO; the same object is the enqueue/dequeue/lookup monitor |
| queuedRequestCount | Nonvolatile queued-only count, decremented before disk I/O; provider reads it without synchronization |
| workerThread | Dispatcher-created thread, normally joined and cleared during shutdown |
| stopRequested | Nonvolatile loop flag; shutdown sets it before acquiring the queue monitor to notify |
| queueWrite / queueRead | Construct operation 2/3 requests, retain cache/key/bytes as appropriate and enqueue |
| readSynchronously | Operation 1 request, served from a matching queued write or direct disk read |
| enqueueRequest | Private tail insertion, count increment and notification under the queue monitor |

`readSynchronously` iterates the queue while holding its monitor. The first
operation 2 request with the same group key and identical cache supplies its
original byte array. The new request completes and returns early with priority
still false. Neither synchronous path assigns cache/key fields on that returned
request. When no queued write matches, the queue monitor is released before
reading disk; that path sets priority true and completes. No copy or extra
request initialization is added.

`run` retains its Java callback name. Under the queue monitor it removes the
first request, or waits and ignores an interruption. A selected request
decrements the queued count before the monitor is released. Disk writes and
reads then occur outside that monitor. Writes and unmatched operation codes
complete inside the protected operation region. Reads and reported Exceptions
complete after it. `requestSelected` and `completeRequestAfterOperation` retain
the two original int 0/1 continuation selectors and their monitor/catch routing.
An Error retains the outer unchecked rethrow path.

`shutdown` sets stopRequested and notifies the queue. Only guard 51 permits
joining the thread and clearing its reference; an ignored join interruption
still clears the reference. Shutdown does not drain the queue. These names
expose the original synchronization and visibility behavior without changing it.

Every SecondaryDeque instance declaration now has a semantic name. Its five
new locals identify unused arithmetic-guard remainders, the client-guard
snapshot and insertion failures. `addLast` unlinks an already linked node before
its guard arithmetic can fail. `addFirst` with a true guard returns after node
link assignments but before neighbor writes. `nextForIteration` retains a null
dereference if called again after iteration exhaustion. Wrong worker guards
retain their early returns, static mutations and partially enqueued requests.

All 5,336 previous complete rules, raw sources and generator pins remain.
Compilation, binding checks, reproduction and reversal support the names.
Existing deque fixtures cover the primary deque and independent dual links;
they do not newly execute SecondaryDeque or live disk-worker storage/concurrency.
Unknown static helpers, network/storage/compression, large labeled bodies,
real assets, full gameplay and phone/FPS/heap behavior remain unfinished or
unverified.

## Archive network queues and socket responses (pass 70)

`ArchiveNetworkClient` names `ji`; `SocketArchiveNetworkClient` names `kk`.
Every instance declaration, constructor contract and local is named. Static
gameplay, account text, sprite and theme helpers remain on these owners. The
base constructor builds four SecondaryDeque queues, a six-byte outbound buffer
and a ten-byte response header buffer. Failure counters start at zero and the
response XOR key starts at zero; untouched fields retain Java defaults.

| Network member | Role |
| --- | --- |
| pendingPriorityRequests / sentPriorityRequests | Unsent/sent priority class, limited to 20 combined |
| pendingBackgroundRequests / sentBackgroundRequests | Unsent/sent background class, separately limited to 20 combined |
| outboundPacketBuffer | Six-byte scratch storage; sends use the entire backing length |
| responseHeaderBuffer | Partial ten-byte header or one-byte continuation marker |
| currentResponseRequest | Sent request receiving data; remains linked until completion |
| responseIdleMillis / lastPollMillis | Signed elapsed accumulation capped at 200ms per poll; idle over 30000ms closes/clears socket |
| responseXorKey | Optional incoming byte-XOR key, zero initially |
| failureCount / failureCode | Volatile failure/escalation state; codes include -1 validation, -2 I/O and positive handshake classes |

`queueRequest(reservedTailBytes, archiveId, methodGuard, groupId, priority)`
sets the long secondaryKey to `(long archiveId << 32) + (long groupId)`, with
signed addition and no new range check. It creates the request before testing
the selected queue class's capacity, then inserts at the pending tail. The
wrong guard clears pendingPriorityRequests after insertion. The generic
DualLinkNode.secondaryKey is also used by disk requests and secondary hash
buckets, independently of the primary node key.

`pollResponses` checks socket write failure, queues opcode 1 for priority and
opcode 0 for background, followed by the low 40 bits of secondaryKey. A
successful enqueue moves each request from pending to sent via its secondary
links. With no socket, the method returns true only if both queue classes are
empty. With a socket, zero available input returns true even when work remains;
the Boolean is not a completion percentage. It performs at most 100 receive
iterations per call, resetting the idle count when input is available.

The ten-byte response header is an unsigned archive byte, signed group int,
compression/queue byte and signed packed-length int. Bit 128 selects the sent
background queue; the low seven bits select compression. The client looks up
the combined key in that sent queue and throws IOException if no request
matches. It allocates `packedLength + (compressionType == 0 ? 5 : 9) +
reservedTailBytes`, preserving signed arithmetic and allocation failures. It
writes the five-byte archive prefix, clears the header cursor and sets the
request blockPosition to 10.

Body reads stop at available input, the non-tail end or the current 512-byte
block boundary. Newly read header/body bytes are XORed through `h.xorInt` when
the key is nonzero. Completing the non-tail portion unlinks secondary links,
writes volatile pending false and clears currentResponseRequest. Reaching
block position 512 instead resets it to zero so the next read expects a marker.
A marker byte -1 clears the header cursor and sets block position 1. A different
marker clears only currentResponseRequest: the one-byte prefix/cursor and sent
request links remain. This unusual partial state is preserved explicitly.

Several generated int slots serve different roles at different points.
`elapsedMillisOrHeaderTargetBytes`, `responseLimitOrHeaderReadLength` and
`bodyReadLengthOrHeaderXorIndexOrArchiveId` describe these reused slots.
Large labeled parsing bodies and slot reuse still need structural work; the
names do not imply that the decompiler has split their lifetimes.

`attachSocket(socketObject, methodGuard, useControlOpcode2)` closes the old
socket before casting/storing the new object. It sends the setup packet
`[6, 0, 0, 3, 0, 0]`, then opcode 2 or 3 plus five zero bytes. The flag name
records the opcode effect without asserting login semantics. True methodGuard
retains its additional opcode-3 recursion and shared diagnostic field mutation.
The header cursor/current response reset, and sent priority requests then sent
background requests move to their pending tails. Requeueing retains partial
response buffers and pending flags. A nonzero XOR key sends opcode 4, the key
byte and a zero int, after which idle/time reset at their original points.

I/O failure attempts close, increments failureCount, records code -2 and clears
the socket; queues requeue later during attachment. Validation reset with guard
20 records code -1 and chooses a nonzero 1..255 key narrowed to byte. Wrong
validation guards retain only their attempted close. `closeSocket` closes but
retains the socket reference and queues. No new retry, null handling, unsigned
normalization or ownership/visibility changes are introduced.

`ByteTextDecodingSupport.sleepMillis(splitRemainder, durationMillis)` returns for nonpositive duration.
When duration modulo 10 equals splitRemainder, it sleeps duration minus one,
then one; otherwise it sleeps once. The first argument is a real comparison
operand, normally zero. `sleepIgnoringInterrupt` retains the ignored
InterruptedException and clears its shared string array for the wrong guard
only after a successful sleep. Negative durations and outer exception wrappers
remain unchanged.

All 5,422 previous complete rules and source/generator pins remain.
Compilation, binding checks, reproduction and reversal support these names.
Existing native helper/cache/shutdown/socket/dispatcher/input traces retain
their previous scopes; they do not newly validate archive response parsing,
reconnect traffic or actual server/assets. Handshake/storage/compression,
unknown static names, large labeled bodies, full gameplay and device/FPS/heap
behavior remain unfinished or unverified.

## Archive catalog, handshake and creation (pass 71)

`ArchiveCatalog` names `em`. Every instance declaration, constructor contract
and local is named; unrelated static UI/text helpers stay on this owner.
The two-argument constructor delegates with null verification operands. The private
constructor stores its client, worker and optional exponent/modulus, then queues
priority archive/group 255/255 with zero reserved tail bytes unless capacity is
full. The fixed source has no caller supplying nonnull verification operands.

| Catalog member | Role |
| --- | --- |
| networkClient / diskWorker | Network and disk request services |
| catalogRequest | Retained network request for the catalog |
| verificationExponent / verificationModulus | Optional BigInteger transformation operands |
| catalogBuffer | Verified response bytes and shared mutable cursor |
| archiveSources | Memoized providers indexed by archive ID |

`ensureCatalogLoaded` returns immediately for an installed catalog. Otherwise
it queues the request when possible, then checks its guard and volatile pending
flag. It wraps the completed bytes, sets the cursor to 5, reads an unsigned
archive count and skips count times 72 bytes. Each record holds a big-endian
index CRC, big-endian index revision and 64-byte Whirlpool digest.

The remaining suffix is copied into one byte array with explicit aliases.
When both verification operands exist, the signed BigInteger suffix is raised
modulo the stored modulus and converted with `toByteArray`; otherwise the raw
suffix is reused. The resulting array must contain 65 bytes. Bytes 1 through
64 must match Whirlpool over the count and records starting at offset 5.
Byte 0 is not checked. The method adds no decompression or header validation.
It publishes catalogBuffer before allocating archiveSources and retains the
catalog request and end-position cursor. Allocation failures keep the original
partial state.

`getArchiveSource` requires the catalog and a valid archive ID. A memoized
provider returns before guard effects or new cache/options matter. Otherwise
it seeks to `6 + 72 * archiveId`, reads the record and creates CachedArchiveSource
with group cache before index cache, then memoizes it. A wrong guard clears
catalogRequest after CRC/revision reads and before digest copying.
`advanceArchiveLoading` first calls processRequestedGroups on all existing
providers, applies its original guard effect, then calls advanceBackgroundLoading
on all providers. The two loops remain separate.

Shared state now exposes archiveNetworkClient, archiveDiskWorker, archiveCatalog,
archiveTaskDispatcher, archiveConnectTask, archiveHandshakeSocket,
archiveHandshakeStage, archiveHandshakeDeadlineMillis, archivePort,
alternateArchivePort, archiveHost, archiveGameCrc, archiveClientId,
archiveLanguageId, archiveServerNumber, archiveUseControlOpcode2 and
archiveLoadStatus. The fixed GeoBlox bootstrap supplies clientId 1. Its
applet/cache initialization separately uses 11; the wire identifier's name does
not equate those values or invent a protocol version. The control flag records
only its proven opcode 2/3 effect.

`TextInputValidator.initializeArchiveServices` assigns CRC, server number, host,
client/language IDs, active port and dispatcher, retains the guard side effect,
assigns the alternate port and constructs network client, disk worker and
catalog in that order. It adds no rollback or state reset.
`ma.tickArchiveLoading` advances providers before checking its guard, polls
responses and advances the handshake only when polling returns false.

`WhirlpoolHash.advanceArchiveHandshake` retains these stages; several can
advance during one call:

| Stage | Action |
| --- | --- |
| 0 | Request a socket task for the active host/port; advance to 1 |
| 1 | Wait for task completion; failure invokes retry handling, success advances to 2 |
| 2 | Wrap the socket, send 13 bytes, set a 30-second reply deadline; advance to 3 |
| 3 | Read a reply when available; zero advances to 4, nonzero invokes retry handling |
| 4 | Attach the socket to the network client, clear temporary task/socket and reset stage |

`ke.writeConnectionHeader` writes byte 12, big-endian short 17, client ID,
server number and language byte. Its caller adds opcode 15 and the big-endian
game CRC. The deadline is checked with strict greater-than only when no reply
byte is available; there is no added connect-task timeout. IOException invokes
failure handling with -3. Before stage processing, four accumulated failures
map validation code -1 to status 3, I/O code -2 to status 4 and other codes to 1.

`eb.handleArchiveHandshakeFailure` clears task/stage/socket references without
adding a socket close, swaps the two ports, then records and increments failure
state. Reply 51 records code 2 and returns status 2 after two failures; reply 50
records code 5 and returns status 5 after two. Other failures record code 1,
returning status 1 after four failures and -1 before the threshold. Original
duplicated branches and wrong-guard side effects remain. The load-status values
describe existing caller flow: -1 pending, 0 ready, 1 connection failure,
2 server-full result, 3 validation failure, 4 I/O failure and 5 out-of-date result.

`IntKeyLookup.createResourceArchive` transfers dispatcher cache-file references
into buffered wrappers at their original points, builds optional disk caches,
obtains the memoized provider, optionally requests all groups and constructs
ResourceArchive with its retention flags. The master index-cache local is
created only while the shared data file is first wrapped; subsequent calls keep
the original null local behavior. Partial ownership transfers and checked/
unchecked exception wrappers remain. `SocketArchiveNetworkClient.createResourceArchive`
uses its fixed foreground/retention/discard/sweep arguments and original guard.

All 5,556 previous complete rules and raw source/generator pins remain.
Compilation, binding checks, byte-exact reproduction and reversal support these
names. Existing native helper/cache/shutdown/socket/dispatcher/input fixtures do
not newly execute the catalog, handshake or archive factories. Storage and
compression code, unknown static helpers, large labeled bodies, real server/
asset traffic, full gameplay and phone/FPS/heap behavior remain unfinished or
unverified.

## Limited and buffered random-access files (pass 72)

`LimitedRandomAccessFile` names `pa`; `BufferedRandomAccessFile` names `sk`.
Every instance declaration, constructor parameter and local has a guarded name.
The limited file's `finalize` keeps its Java override identity. Unrelated static
text/UI helpers and `checkBoundaryLossAndStartCascade` stay on these owners.

| File member | Role |
| --- | --- |
| LimitedRandomAccessFile.file | Owned Java RandomAccessFile handle |
| maximumLength | Maximum checked write extent, with the original overflow marker behavior |
| LimitedRandomAccessFile.position | Tracked cursor after successful seek/write or positive read |
| BufferedRandomAccessFile.file | Owned limited-file wrapper |
| BufferedRandomAccessFile.position | Caller-visible virtual cursor |
| underlyingPosition | Tracked file cursor, separate from the virtual cursor; -1 when marked unknown |
| physicalLength / logicalLength | Initial/extended underlying length versus requested write extent |
| readBuffer / readBufferStart / readBufferLength | Cached read bytes, file origin and valid extent |
| writeBuffer / writeBufferStart / writeBufferLength | Pending write bytes, file origin and valid extent |

The limited-file constructor maps only maximumLength -1 to Long.MAX_VALUE.
If existing length exceeds the limit it attempts deletion and ignores the
Boolean result. It opens the handle, records limit/cursor, reads the first byte,
rewrites that byte at zero for a nonempty file opened with mode other than `r`,
then seeks to zero. Failures preserve the existing partial construction.

`write` checks signed `position + length` before its guard or source access.
On overflow it seeks to maximumLength, writes marker byte 1 and throws
EOFException; the tracked position is not updated by this marker path.
Normal writes advance the tracked cursor after Java's write succeeds. `read`
delegates partial reads and advances only for a positive result. `seek` seeks
first, then assigns the cursor. Reads and seeks add no maximum-length check.
The read guard can assign avatarFeedbackHoldTicks; the seek guard can clear
waitingForSoundEffectsText. Wrong write guards retain static cleanup.
`length` returns -83 before handle access for guard other than 1. `close`
requires -5 and clears the handle only after successful close. The finalizer
prints a blank line and invokes close when a handle remains; it adds no super call.

The buffered constructor records the limited file's length in physicalLength
and logicalLength, allocates write/read arrays in that order and starts the
virtual position at zero. The write origin and read origin start at -1;
underlyingPosition retains Java's default zero. `seek` rejects negative
positions, evaluates its arithmetic guard, then changes only the virtual cursor.
`length` returns logicalLength; a wrong guard clears readBuffer first.

`readFully(destination, remainingLength, destinationOffset, methodGuard)` retains
its original int-sum bounds check. If the whole request is available in pending
writes, it copies and returns before the guard effect. Otherwise it records the
initial position, destination offset and requested length, copies a cached
prefix and obtains remaining bytes through direct partial reads or a refill.
It then zero-fills an unread gap before pending writes and overlays pending
bytes onto the original destination range. `readCountOrZeroFillEnd` names the
reused int's two roles; the overlay's original snapshots remain separate.
IOException within the read region marks underlyingPosition unknown. The final
remaining-length EOFException retains partial output and cursor effects.

`write` extends logicalLength before later guard checks or actual I/O. It
flushes pending data when the cursor is outside that extent, and may fill and
flush a full buffer before a true methodGuard returns early. With a false
guard it buffers a short write or seeks/writes directly for a larger one.
Direct writes update physicalLength and patch overlapping cached reads.
The original partial copy, cursor, count and error order remains; a failed
requested write need not roll back logicalLength.

The private `flush` writes the complete pending extent at writeBufferStart,
updates underlyingPosition/physicalLength, patches any read-cache overlap,
then resets writeBufferLength and origin. Wrong guard <=60 overwrites
physicalLength with 28 even without pending data. `refillReadBuffer` resets the
valid read extent and reads in chunks capped at 200000000, stopping on -1 or
capacity without advancing the virtual cursor. Its false argument retains the
early return; no handling for repeated zero reads is added.

`readAll` reads the whole destination before its arithmetic guard can fail.
`close` flushes and closes the limited file before its wrong-guard length call
can clear readBuffer. These names preserve malformed arguments, signed overflow,
aliases, partial effects, exception coverage and original diagnostic strings.

All 5,698 previous complete rules and raw source/generator pins remain.
Compilation, binding checks, byte-exact reproduction and reversal support the
names. Existing native cache-write fixtures retain controlled direct-write and
failure coverage; other helper/shutdown/socket/dispatcher/input traces retain
their scopes. Comprehensive buffered read/write/flush combinations, disk archive
sector chains, real storage/server/assets, full gameplay and phone/FPS/heap
behavior remain unverified. Compression, unknown static helpers and large
labeled bodies remain unfinished.

## Disk archive sector chains (pass 73)

`DiskArchiveCache` names `jh`. Every instance declaration, constructor contract
and local has a guarded name. `toString` retains its Java override and returns
the full archive ID. The unrelated static audio initialization helper remains
on this owner. `dj.diskSectorBuffer` is the existing shared 520-byte scratch
array; its static initialization and guard/cleanup clearing remain unchanged.

| Member | Role |
| --- | --- |
| dataFile | Shared buffered sector file and monitor for cache operations |
| indexFile | Buffered file containing six-byte index records |
| archiveId | Identifier stored as a byte in sector headers, compared as an unsigned byte on read |
| maximumEntryLength | Stored/read length limit; constructor overrides the default 65000 |
| diskSectorBuffer | Shared scratch for index records, sector headers and read payloads |

Index record `entryId * 6` contains a big-endian 24-bit entry length followed
by a big-endian 24-bit initial sector. Data sectors occupy 520 bytes, starting
at `sectorNumber * 520`. These multiplications occur as int before conversion
to long; the names do not normalize overflow or add ID/range checks.

| Sector header component | Entry ID <=65535 | Entry ID >65535 |
| --- | --- | --- |
| Entry ID | 2 bytes | 4 bytes |
| Chunk number | 2 bytes | 2 bytes |
| Next sector | 3 bytes | 3 bytes |
| Archive ID | 1 byte | 1 byte |
| Header/payload capacity | 8 / 512 bytes | 10 / 510 bytes |

`read(entryId, methodGuard)` captures and locks dataFile before reading the
index. It requires the complete index row, an allowed entry length and a
positive initial sector no greater than `dataFile.length() / 520`. It then
reads each header and payload, validates the entry ID, chunk sequence, archive
ID and next-sector bound, and copies payload bytes into the result. A zero
next sector is allowed in a header but fails if further payload remains.
IOException returns null; unchecked outer exceptions retain their rethrow path.
The wrong guard can clear dataFile after the initial index-size check, while
the captured original monitor stays held.

`write(bytes, methodGuard, entryId, length)` acquires the data-file monitor
before checking the length. It attempts `writeEntryChain` with reuse enabled,
then retries with reuse disabled only after a false return. The private
routine takes the same monitor again. Reuse requires a valid initial sector
from the index; allocation uses the ceiling of data length divided by 520 and
avoids sector zero. It publishes the six-byte index record before reading
reused headers or writing any payload. Failed later work can retain that index
record and partially changed sectors.

During reuse, header entry/chunk/archive fields and next-sector bounds must
match. A missing next link disables further reuse and allocates at the data
file end, avoiding the current sector. `headerEntryIdOrPayloadLength` names the
original reused int slot: it holds the header entry ID during validation and
the payload count during writes. Original byte narrowing, numeric guards,
scratch assignment order, aliasing and exception scopes remain.

`smallHeaderEofState` and `largeHeaderEofState` are still int continuations
with original values 0 and 1. EOF sets state 1 and exits the inner labeled
region to a true return. The index record is already published and no remaining
sector payload is written. Public write therefore reports success and skips
its allocation retry. The native fixture verifies this partial-success path
for both header formats, including unchanged sector bytes and the new index length.

The original termination test sets nextSectorNumber to zero when remaining
payload is <=512 for both header formats. For large IDs, actual sector payload
capacity is 510. Controlled lengths 511/512 and 1021/1022 therefore retain
successful writes followed by null reads: the chain terminates before the final
one/two payload bytes can be reached. This is verified in native bytecode as
well as both Java exports; the naming pass preserves the behavior.

Fresh zero-length writes also report success, but reading still requires a
valid positive initial sector. A fresh empty data file fails that check;
overwriting an existing valid chain with an empty entry can return an empty
array. Wrong guards, malformed write arguments and unchecked failures retain
their original behavior without broader verification claims.

The existing result-helper probe adds 138 controlled sector cases: 120
fresh/reused entry/length combinations, sixteen valid/malformed seeded reads
and two reused-header EOF exits. Independent payload checks and explicit
partial-effect assertions support the names; data/index file digests and
results match native/raw/readable traces. The pinned trace is
`77dc4b47188f20793aaecb76f198e59850d0fc3d8af0ca07b2d0a111719a869b`.
Fixtures close the limited-file wrappers, clearing their handles before the
finalizer can print nondeterministic blank lines. Previous six native traces
remain unchanged.

All 5,820 previous complete rules and raw source/generator pins remain.
Compilation, 138,558 binding checks, 388 override relationships, byte-exact
reproduction and reversal support the export. The new controlled sector cases
do not establish complete buffering/concurrency, malformed-write/guard or live
cache/server/asset behavior. Compression, unknown static helpers and large
labeled bodies remain unfinished; full gameplay and phone/FPS/heap behavior
remain unverified.

## Archive compression and inflater entry state (pass 74)

`GzipInflater` names `fe`, `Bzip2Decoder` names `tb` and `Bzip2DecoderState`
names `jl`. Every gzip instance field/API, constructor contract and local is
named. The Bzip2 entry/bit-reader APIs and selected state have names; deeper
block/table/run locals and other state fields still need tracing. Mixed static
UI/validation/gameplay helpers remain on these owners.

`v.decompressArchive` is the shared archive-index/group unpacker. It reads an
unsigned compression type and a signed packed length, rejecting a negative
length or one above nonzero `uj.maximumArchiveLength`. Zero disables the bound;
the fixed initializer sets zero. The second argument participates in the format
branch: equality with `~compressionType` selects allocation and copying of
packedLength bytes from cursor 5. Normal callers supply -1, so type 0 is raw.
The name `uncompressedTypeComplement` records that comparison without treating
the argument as unused.

| Normal type routing | Data layout/action |
| --- | --- |
| 0 | Type byte, packed length, then raw payload at offset 5 |
| 1 | Type byte, packed length, unpacked length, then stripped Bzip2 payload at offset 9 |
| Other values | Same nine-byte prefix; invoke shared gzip inflater at cursor 9 |

The compressed branch reads a signed unpacked length, applies the same bound,
allocates the output and retains its original aliases. Type 1 calls the Bzip2
entry; all other values lock `AwtRasterBuffer.archiveGzipInflater` and invoke
`inflateInto`. It retains the capture/global-dereference order and contextual
RuntimeException wrapper. The input array is not rewritten. Neither gzip nor
the Bzip2 entry enforces the declared packed length as an input boundary.

`GzipInflater.inflateInto` requires magic bytes 31 and -117 at the buffer cursor.
It lazily creates `Inflater(true)`, skips exactly ten header bytes, excludes
eight tail bytes from the backing array and invokes inflate once. The return
count and finished state are ignored; the ByteArrayBuffer cursor is unchanged.
Trailer CRC/size and optional header fields are not validated. Short destinations
can hold a prefix, while excess destination bytes retain their previous values.
Bad magic fails before the protected inflate operation; caught Exceptions during
input/inflate reset the inflater and become an empty RuntimeException inside
the original contextual wrapper. Success resets it too; no new Error cleanup,
end call, unsigned normalization or complete-output check is added.

The no-arg gzip constructor still delegates -1,1000000,1000000. Its private
constructor body is empty. `unusedFirstArgument`, `unusedSecondArgument` and
`unusedThirdArgument` record that fact without assigning unsupported size/guard
semantics. Wrong inflate guards retain the original static-helper side effect.

`Bzip2Decoder.decompressInto` captures and locks `decoderState`, then assigns
input/output arrays, input offset, zero output cursor, output allowance, bit
buffer/count and byte counters. `ignoredPackedLength` is not read. The method
decodes blocks, computes requested minus remaining output, clears input/output
references only on success and returns the produced count. The archive
container ignores that count, preserving partially initialized output. Failures
do not acquire new finally cleanup. `releaseSharedState` clears the shared
reference without installing a replacement for later calls.

| Named Bzip2 state | Role |
| --- | --- |
| inputBytes / inputPosition | Input backing array and byte cursor |
| outputBytes / outputPosition | Output backing array and destination cursor |
| remainingOutputBytes | Unconsumed output allowance |
| bitBuffer / bufferedBitCount | Shifted input bits and unread bit count |
| inputBytesRead / outputBytesWritten | Original integer counters |

`readBits` loads unsigned bytes into the shifted int until enough bits exist,
then extracts with the original signed shift/mask and consumes the count.
`readByte` and `readBit` delegate counts 8 and 1 and narrow to byte. Input bounds,
shift/overflow behavior and the empty overflow-check branches remain.

The existing result-helper probe adds 74 controlled compression cases. Its
36 type/length/limit cases check raw and gzip results; eight additional cases
check declared packed lengths, the complement branch and two Bzip2 vectors.
Thirty direct gzip cases check offsets, short/oversized destinations, malformed
magic/deflate, unchecked CRC trailer, unchanged input/cursor and inflater reset.
The valid Bzip2 vector is a fixed stripped Bzh1 block. A one-byte early-end
vector retains zero-filled allocated output and ignored completion count.
These payload/state assertions and native/raw/readable traces match at
`191d74dde65e8e0a6b5dc72a0193765baa165a94ab82ef5df15f10d86fd6f8fe`.

All 5,907 previous complete rules and raw source/generator pins remain.
Compilation, 138,558 binding checks, 388 override relationships, byte-exact
reproduction and reversal support the export. Seven prior native traces remain
unchanged. These controlled cases do not establish arbitrary malformed-input,
optional gzip-header, deep Bzip2 state/control-flow or real-asset equivalence.
Unknown static helpers and large labeled bodies remain unfinished; full
gameplay and phone/FPS/heap behavior remain unverified.

## Bzip2 block tables, move-to-front state and output runs (pass 75)

Every `Bzip2Decoder` field, method, parameter and local now has a guarded name.
Every `Bzip2DecoderState` instance field is named; its unrelated static
validation/socket helpers remain unchanged. `kb.bzip2TransformTable` names
the shared workspace. This pass adds 99 identities without restructuring the
large labeled bodies or changing their evaluation/publication order.

| Decoder routine | Role |
| --- | --- |
| `decodeBlocks(state)` | Parse block metadata, construct decoding tables, decode symbols, build inverse-transform links and emit each block |
| `buildByteAlphabet(state)` | Map ascending used byte values to a dense alphabet |
| `buildHuffmanTables(limits, bases, symbols, codeLengths, minimumLength, maximumLength, alphabetSize)` | Build canonical symbol order, length limits and code offsets |
| `emitBlockRuns(state)` | Traverse inverse-transform links, expand runs and save state when the destination is full |

`decodeBlocks` forces `blockSize100k` to 1 and allocates 100,000 ints only if
the shared transform workspace is absent. It does not resize an existing
workspace. A first byte of 23 returns immediately. Other marker/CRC bytes and
the randomized bit are consumed without validation or randomized-block
handling. The next three bytes form the 24-bit `originalPointer`.

`usedByteGroups` and `usedBytes` describe the 16 group flags and 256 byte flags.
`buildByteAlphabet` resets `alphabetSize` and fills `alphabetBytes` in byte-value
order. `selectorMoveToFrontValues` holds unary selector ranks;
`huffmanSelectors` holds the table IDs after move-to-front decoding. The six
table rows use `huffmanCodeLengths`, `huffmanLimits`, `huffmanBases`,
`huffmanSymbols` and `minimumCodeLengths`. Each selector supplies 50 symbols.

Canonical table construction orders symbols by length, then symbol index. It
counts lengths, forms prefix counts, builds each length's maximum code and
adjusts bases for symbol lookup. Original signed byte lengths, 23-slot setup
loops, integer shifts and unchecked malformed-input behavior remain.

The byte move-to-front list uses `moveToFrontBytes`, a 4,096-byte workspace,
and sixteen `moveToFrontBlockStarts`. Ordinary symbols move the selected byte
to the front; small ranks use the original unrolled shifts, and larger ranks
move across sixteen chunks. Exhausting the first chunk rebuilds their layout.
RUNA/RUNB symbols accumulate weighted repeats of the front byte. Decoded bytes
populate the low byte of `bzip2TransformTable`; `byteFrequencies` counts them.
`blockLength` is this last-column length, before the output run expansion.

`byteBucketPositions` first holds frequency prefix sums, then scatter cursors.
The decoder adds source-row links in the upper bits of the transform table.
`transformPositionOrEntry` deliberately names a reused slot: it can hold a
packed table entry before shifting right by eight to obtain the next position.
Other reused locals retain both selector and byte-list roles rather than
pretending the original variable had a single lifetime.

`emitBlockRuns` snapshots the shared table and follows its links. Literal bytes
retain signed byte conversion; after four equal bytes the run-count byte is
treated as unsigned and adds four. `pendingRunByte`, `pendingRunLength`,
`currentByte` and `blockBytesConsumed` describe the retained output state.
The block-end target is `blockLength + 1`. Partial exits publish the original
table alias, output cursor/allowance and pending run state at their existing
points; duplicated publication tails and empty overflow checks remain.
Another block is decoded only when all block bytes are consumed and no run
remains. The integer `continueDecodingBlocks` keeps its original 0/1 form.

The new 40-case fixture uses six fixed stripped Bzh1 streams: empty data, mixed
runs followed by all byte values, repeated byte alphabets, deterministic
pseudorandom bytes, a long single-byte run and a 120,064-byte two-block stream.
Thirty-four destination cases check zero, short, exact and oversized buffers,
with independent prefix/count/tail assertions. Inputs stay unchanged and
successful calls clear the assigned input/output references.

Three malformed cases use an empty input, a negative offset and null input.
Their unchecked exceptions release the state monitor while retaining the
assigned arrays and unchanged destination. Each is followed by a successful
recovery call that produces the expected bytes and clears those references.
All forty native/raw/readable traces match
`f237b1b6fd8e69c006fa43ec005f742ae5909d107d0ba5ec4574f2c804ad3ba9`.
Fixed compressed vectors live in the existing probe, with no runtime Python
dependency or additional report JSON.

All 5,982 prior complete rules and raw source/generator pins remain unchanged.
The export compiles, preserves 138,558 bindings and 388 overrides, reproduces
byte-for-byte and reverses to the raw source bytes. Eight previous native
traces remain unchanged. These fixtures do not establish arbitrary corrupt or
randomized-stream handling, shared-state concurrency, live asset compatibility
or whole-game/device behavior. Remaining large labeled bodies and opaque
static helpers still need work; the memory, startup and FPS targets remain
unverified.

## Shared Bzip2 output cleanup through an existing exit (pass 76)

`emitBlockRuns` previously published the same output state and returned in two
places. When the destination filled with a pending run, an inner loop repeated
the publication tail. The same tail already followed its enclosing `L1` block.
The early path now uses `break L1`, skipping the remaining decoding work and
reaching that existing tail. The pending run, byte consumption, current byte,
transform-table alias/cursor, output position/allowance and byte counter are
published in the same order, once on either path. Empty overflow checks remain.

The generic java-tools renderer makes this change after reconstructing local
scopes. Exact terminal token sequences must match, the existing destination
must be a plain labeled block, and inner declarations cannot shadow names in
the tail. Nested loops/labels are transparent to the exit; try/catch/finally,
monitor and switch boundaries are opaque. No new label frame, helper method
or dispatcher is introduced. The large loop/label structure still needs work.

This removes thirteen raw/readable source lines and 39 binding references,
38 of which received semantic names. All 19,558 declarations and all 6,081
complete rules survive without ordinal migration. The current 49,580 naming
edits preserve 138,519 bindings and 388 overrides. The other 302 Java files
and diagnostics are unchanged; the single manifest records the new source and
decompiler pins explicitly.

The generic emitter has 2,048 additional native comparisons covering loop
effects, protected/monitor ownership, failure order, throwable identity and
scope refusals. The actual GeoBlox native/raw/readable Bzip2 matrix retains its
40-case trace, as do the eight other existing helper traces. Clean decompiler
source-archive regeneration, readable reproduction and dictionary reversal are
byte-exact. These checks do not establish full asset/gameplay, concurrency or
phone memory/startup/FPS acceptance.


## Redundant loop labels and plain blocks (pass 77)

The generic renderer now resolves labeled breaks and continues against Java's
actual lexical destinations. When the nearest ordinary loop/switch is exactly
the same target, a jump can become `break;` or `continue;`. Its now-unreferenced
label disappears. Transfers past an inner loop or switch retain their necessary
outer labels. Plain blocks with no direct declarations can lose braces when
nested as statements in another block; variable, loop, conditional, protected
and monitor scopes remain. All operations, operators, literals and transfer
routes stay in order. No guard value is assumed.

`GameplaySession.updateSession` and `BoardReconciliationSupport.reconcileBoardEntities` lose redundant
loop labels and some frame nesting, along with rendering, storage, compression
and other helpers. The large session/reconciliation bodies are still nested and
need further reconstruction to expose their higher-level gameplay phases.
The raw corpus changes 153 files and
removes 588 lines (80,457 to 79,869). Across all 303 raw sources, generated labels
fall from 1,188 to 680 and labeled continues from 518 to 68. All 1,190 labeled
breaks remain. These token counts describe frame/transfer spelling.
Every declaration/reference identity,
spelling and occurrence order remains, so all 6,081 complete rules survive with
no ordinal migration and the same 49,580 edits, 138,519 bindings and 388 overrides.

An independent JDK AST checker compares the before/after file inventories and
ordered syntax events for all 303 sources, including 1,129 loop/switch destinations
and 1,762 jumps. The full emitter suite passes 41 groups with this check enabled;
2,048 new native cases verify effects, lexical shadows, switch/loop destinations,
protected and monitor exits, failure order, throwable identity and lock release.
Exception-exit tests pass eight groups. Three wider try-with-resources fixture
failures also occur on the pinned pre-cleanup baseline. Clean source-archive
regeneration and diagnostics, readable reproduction and dictionary reversal are
byte-exact. Existing GeoBlox native probes retain their documented trace pins.

Opaque helpers, large labeled bodies, real assets/server traffic, complete
gameplay and browser/phone memory/startup/FPS behavior remain unfinished or
unverified. The current manifest and existing provenance contain the source
migration and evidence; no extra JSON snapshots are created.


## Boolean decision chains (pass 78)

`GameplaySession.updateSession` now expresses board-clear eligibility through
three short-circuit checks: no entity detached this tick, the attached queue is
empty, and the current theme has released at least one entity. The queue query
retains guard 13519. `BoardReconciliationSupport.reconcileBoardEntities` expresses raster dirtiness as
the existing session dirtiness, contact-state dirtiness or pending avatar shock.
Its earlier session-reference snapshot stays before the field checks, preserving
aliases and null/failure order. The original local result stores remain.

The renderer recognizes primitive-local literal selection through one existing
plain exit block. Nested successful guards combine with AND; sequential successful
alternatives combine with OR. Opposite literal selection applies De Morgan's law
without complementing relational comparisons, preserving NaNs and short-circuit
execution. Nullable conditions, effectful/repeated calls and self-modifying
predicates keep their order and partial writes. No client guard value is assumed.
Prefixes and protected/monitor ownership stay in place. Target declarations must
be unique and visible; boxed/field/shadowed targets, extra branch effects, other
exits, declarations and protected/monitor crossings refuse folding.

Seventeen decisions across twelve files simplify, including queue-settled,
pending-transition, name/host and null-guarded caller checks. This removes 156
raw/readable lines (79,869 to 79,713). Every declaration identity/spelling and
local ordinal remains; only 17 duplicate local-store references disappear.
Three previously received semantic names. The 6,081 complete rules remain,
applying 49,577 edits and preserving 138,502 bindings and 388 overrides; all other
ordered binding events match the previous export.

Two new generic groups add 13,824 native comparisons of truth tables, initial
values, boxed/null conditions, NaNs/signed zero, repeated/self-modifying predicates,
failure order, partial stores, throwable identity and surrounding catch/finally/
monitor ownership. The emitter run passes 42 tests; the optional pass77 frame-only
AST corpus checker is skipped because this rewrite changes boolean syntax.
Exception-exit tests pass eight groups. Clean source-archive regeneration and
diagnostics, readable reproduction and dictionary reversal are exact. Existing
native GeoBlox traces retain their documented pins; actual host setup, model
callbacks, real assets/server traffic, comprehensive gameplay and browser/phone
performance remain outside the proofs. Opaque helpers and large bodies remain.

## Direct early exits (pass 79)

`GameScreen.renderScreen` exits directly after a selected menu rendering branch,
and menu/input helpers return after completing their selected operation.
`GameplaySession.updateSession` uses direct returns in its tutorial exit paths.
`Sprite.rotateNearest` and the corresponding ARGB routine return after their
selected geometric case, removing an outer exit frame while retaining their
branch predicates, traversal and pixel-write order. Some large bodies remain;
this change removes control indirection rather than splitting methods.

Only a break to a plain labeled block immediately followed by a bare void return
is eligible. No value expression or work moves across a cleanup boundary.
Explicit finally may override the transfer by return, throw, outer break or
outer continue. A separate completion proof keeps a reachable trailing return,
removes an unreachable one, and refuses uncertain candidates. Unknown syntax,
resource headers, nested executable bodies and ambiguous lexical identities
remain unchanged. Declaration-bearing braces retain their scope.

The pass consumes 95 jumps in 38 blocks across 25 files, removing five unreachable
trailing returns and 81 lines (79,713 to 79,632). Every ordered declaration/
reference identity and spelling plus 388 override rows matches the preceding
corpus. Applying the documented return and control-frame rules reproduces all
303 regenerated token streams. All 6,081 complete guarded rules remain unchanged,
applying 49,577 edits and preserving 138,502 bindings. Text-resource source hashes
and line positions refresh without changing fields, keys or indexes.

The generic tests add 46,080 native comparisons of loops, explicit resource
cleanup, failures, partial state, throwable identity and lock ownership/release.
The emitter suite passes 44 tests and skips its historical pass77 frame-only
corpus check; exception-exit tests pass eight groups. Clean decompiler archive
regeneration, readable reproduction and dictionary reversal are exact. Existing
native/raw/readable game probes retain their documented traces. Whole-game
execution, actual assets/platform/server traffic, remaining opaque helpers and
browser/phone performance remain outside these proofs.

## Triangle shading (pass 80)

The triangle path begins in the model renderer `hi`: it extracts each vertex's
red, green and blue channels and calls `EntitySpawnSupport.drawHalfBlendRgbTriangle`. Its parameters
name the three X/Y pairs `vertexAX`/`vertexAY`, `vertexBX`/`vertexBY` and
`vertexCX`/`vertexCY`; the entry wrapper sorts their Y coordinates before
dispatching matching X/R/G/B values. Numeric
sentinels and tie behavior remain unchanged.

`SpriteState.drawSortedHalfBlendRgbTriangle` traverses the upper and lower
segments using left/right `XQ16`, `RedQ16`, `GreenQ16` and `BlueQ16` values and
their per-row steps. `middleVertexOnRight` records which edge the middle vertex
occupies. The short edge changes at the middle Y while the long edge continues.
The helper uses `TriangleRasterState.clipWidth`/`clipHeight` and `rowBaseOffsets`
to clip spans and locate their framebuffer rows. Original reused scratch slots
have combined names, such as `edgeSegmentRowsThenRowBase`; they remain one local.
The large labeled body and all control-flag paths remain.

`jf.drawHalfBlendRgbGradientSpan` advances the interpolated channels for each
pixel and combines them with `(previousPixel >> 1) & 0x7f7f7f`. Its red/green
masks retain the original decimal constants, including 33423689; this naming
pass does not repair or normalize the arithmetic. The decrement-before-test
pixel count, bad-guard mutation and partial-buffer failure behavior remain.

`TriangleRasterState.prepareTriangleClipFromRasterizer` imports the current
software-rasterizer clip and fills framebuffer row offsets. Centers are half
the clip width/height. Its private tables are `sineQ16`, `cosineQ16`,
`reciprocalQ15` and `reciprocalQ16`; `releaseTriangleTables` releases all five
arrays while preserving the clip dimensions/centers.

All parameters/locals in the three selected triangle methods and all declarations
in `TriangleRasterState` now have guarded names: 116 additions in total.
Raw source and decompiler pins remain those of pass79. The 6,197 rules apply
50,682 edits, preserving all 138,502 bindings and 388 overrides. Reproduction
and dictionary reversal are byte-exact; the dictionary retains every original
identity and spelling.

The drawing probe adds 5,266 native/raw/readable comparisons. Independent oracles
cover 1,800 scanline cases, four clip configurations and six table/growth/release
checks. Another 3,456 triangle cases preserve native pixel and failure traces,
including all vertex permutations, flat/clipped triangles, RGB inputs, guards
and control flags. Complete triangle geometry has no independent oracle here;
whole-model/real-asset rendering, remaining opaque helpers and large bodies,
full gameplay and browser/phone performance remain unverified.

## Mesh lighting and coordinate operations (pass 81)

`TriangleMesh` supplies short XYZ vertex positions and normal components plus
face vertex/normal/material indices. The selected fields now expose those roles,
along with priorities and the cached bounding box. Other mesh arrays/static
helpers are still opaque. `MeshMaterial.baseRgb` names the per-material color;
unrelated static helpers retain their mixed obfuscated owner.

`p` transforms the normal components into `ok.transformedMeshNormalX`,
`oa.transformedMeshNormalY` and `gi.transformedMeshNormalZ`, and projects vertices
into `sh.projectedMeshVertexX` and `dj.projectedMeshVertexY`. Face collection fills
`ch.meshFaceCountsByDepthBucket` and `pj.meshFaceOrder`. Before drawing,
`hi.renderLitQueuedMeshFaces` either compacts depth buckets or groups faces by
priority using `uh.meshFacePriorityWriteOffsets`. `facePriorityCount` is one
plus the largest unsigned priority, including gaps; it is not a distinct count.
This preparation still happens before checking the method guard.

`ck` supplies light and half-vector components normalized to 256. Diffuse
response shifts the normal/light dot product right by eight before taking its
absolute value, clamps the ambient-plus-
diffuse value, and attenuates it by the specular response. Specular response
indexes `jf.meshSpecularResponseByAbsDot` with the absolute value of the already
shifted normal/half-vector dot product; `jk` builds the original power-15 table. Original overflow and
out-of-range behavior remains. Missing materials select gray 8355711; negative
indices other than the -1 sentinel retain their failures.

Faces with identical normal indices use the existing flat triangle helper.
Other faces compute three lit RGB values and use `EntitySpawnSupport.drawHalfBlendRgbTriangle`.
The original masks and shifts remain, including their differing values across
the flat and smooth branches. Combined names describe slots reused between those
branches; the three diffuse-array aliases remain explicit.

`TriangleMesh.scaleVertices` and `translateVertices` retain short narrowing and
partial XYZ writes before invalidating bounds. `refreshBounds` returns when
`boundsValid` is already true; otherwise it sets that flag before scanning and
publishes min/max XYZ. A failed scan can therefore leave the flag true with
old bounds. Bad guards preserve the original array-nulling/static-call effects.
All parameters/locals in these operations and the lighting caller have names.

The pass adds 130 guarded identities. All 6,197 previous complete rules and the
raw/decompiler pins remain. The 6,327 rules apply 51,424 identifier edits,
preserving 138,502 bindings and 388 override relationships. Reproduction and
dictionary reversal match all 303 files byte-for-byte.

The drawing probe adds 10,592 native/raw/readable trace comparisons: 10,368
lighting/order/failure cases and 224 transform/bounds cases. It records pixel
buffers, queue/priority mutations, failure contexts, coordinate arrays and cache
state, including invalid inputs and partial stores. Existing triangle/sprite/
nine-slice traces retain their pins. This is not an independent complete lighting
or model oracle. Model loading/preparation, opaque fields/static helpers, flat
raster structure, full assets/gameplay and browser/phone performance remain
unfinished or unverified.

## Flat triangle spans and face ordering (pass 82)

The equal-normal lighting branch calls `gi.drawHalfBlendSolidTriangle` with an
already halved RGB value. That wrapper sorts three vertex Y values and forwards
matching X coordinates to `NetworkArchiveRequest.drawSortedHalfBlendSolidTriangle`.
The rendering helper remains on its original mixed static owner; no network
behavior or repository ownership moves.

`leftXQ16`/`rightXQ16` and their steps traverse the upper and lower triangle
segments. `middleVertexOnRight` selects the edge changed at middle Y. Named
`TriangleRasterState` clip dimensions and row offsets bound the pixel spans;
the original right-edge and zero-width arithmetic stays visible. Reused slots
such as `edgeSwapOrRowBaseOrLowerRowsOrGuardRemainder` retain their original
multi-phase role. The large nested source structure is unchanged in this pass.

`ib.drawHalfBlendSolidSpan` adds the supplied `halfRgb` to
`(previousPixel >> 1) & 0x7f7f7f` for each pixel. The color is not halved again.
`pixelCount` decrements before testing, including integer overflow at its extreme
negative value. The span guard remainder runs after writes, so a bad guard may
fail with a modified destination. The sorted triangle's guard calculation runs
after upper rows and before lower-row rendering. Original partial arrays,
wrapped failure contexts and literals remain.

The lighting caller now names its preparation branches directly:
`vc.compactDepthBucketFaceOrder` compacts depth-bucket entries into the face
prefix; `MeshPrioritySupport.groupQueuedMeshFacesByPriority` consumes signed priority bytes,
increments the chosen write offset and writes into the same face-order array.
Names expose the original alias and mutation order; this pass does not assume
stable grouping or change overlapping storage behavior.

All parameters/locals in these five methods have guarded names, adding 80
identities. The 6,407 rules apply 51,926 edits, preserving all 138,502 bindings
and 388 overrides. The prior 6,327 complete rules and raw/decompiler pins remain.
All 303 files compile, reproduce and reverse byte-for-byte.

The drawing probe adds 8,775 native/raw/readable cases: 1,575 independent span
oracle cases, 4,608 wrapper traces and 2,592 direct sorted-helper traces. Cases
include vertex order, flat/clipped triangles, colors, control flags, extreme
counts/indices, null/short arrays and late guard failures with partial writes.
Prior sprite, triangle and mesh-lighting traces retain their pins. Full flat
triangle geometry has no independent oracle here. Mesh/model loading/preparation,
opaque helpers, large bodies, complete assets/gameplay and browser/phone behavior
remain unfinished or unverified.

## Mesh projection and face collection (pass 83)

The rendering caller passes `IntKeyLookup.meshCameraTransform` and
`lk.meshModelTransform` into `p.projectMeshAndQueueFaces`. Their first three
entries are translations; the next nine are Q16 basis coefficients. The method
shifts the camera basis to Q14 before composition, subtracts camera translation
from model translation and forms scaled camera X/Y and unscaled depth. All
arithmetic keeps Java integer overflow and masked shift counts.

Vertices at depth 50 or greater receive perspective X/Y and a retained depth.
Closer vertices only receive the `Integer.MIN_VALUE` depth marker; their old
projected X/Y remain. `storeCameraCoordinates` optionally writes camera XYZ.
`transformNormals` uses the model basis, checking capacity only on transformed
normal X. An insufficient Y/Z buffer can therefore fail after earlier writes.
A false `preserveSharedResources` calls the original cleanup helper before
vertex processing; it clears shared references and sets the existing integer
field to 120. Control flags retain their early collector and return paths.

The optional per-face coordinate triples are named `firstVertexSourceX/Y/Z`,
`secondVertexSourceX/Y/Z` and `thirdVertexSourceX/Y/Z`. Their outputs retain the
matching transformed-coordinate names, including the prior
`BufferedSocket.thirdVertexTransformedY` identity. These are separate int arrays,
not aliases for the mesh's short vertex XYZ. Their construction and asset purpose
remain unknown; this pass does not label them as texture coordinates.

`MeshDepthSupport.queueMeshFacesByDepth` optionally rejects backfaces using the projected signed
cross product and skips a face if any vertex has clipped depth. It normalizes the
sum of its relative depths into a bucket using `SpriteConstructionSupport.unsignedBitLength`, then queues
the face in a 16-entry bucket. Full buckets spill toward lower indices. Face
priorities use signed byte indices, count into offsets and then turn into prefix
sums. `oe.clearMeshDepthBucketCounts` and `ma.clearMeshPriorityCounts` preserve
eight sequential stores per loop, including partial writes for short arrays.
The original guard-triggered avatar cleanup and failure contexts remain.

All parameters/locals in these five methods are named. Combined scratch names
such as `cameraXXOrNormalXYQ16` expose reused phases, which remain unsplit.
The 142 additions bring the current export to 6,549 rules and 52,854 edits; every
prior complete rule, 138,502 bindings and 388 overrides remain. All 303 raw and
readable files compile, reproduce and reverse byte-for-byte.

The existing drawing probe adds 5,992 native/raw/readable comparisons: 384 bit-
length checks, 64 clearing checks, 216 identity-coordinate checks, 2,592 general
geometry traces, 2,016 fault traces and 720 direct collector traces. Five direct
cases independently check uniform-depth spill order and bucket counts. Recorded
state includes projected/camera/normal/optional-coordinate buffers, face order,
buckets, priorities, queue count, selected cleanup effects and failure contexts.
Earlier drawing trace pins remain. Complete general projection geometry, actual
assets/gameplay and browser/phone behavior remain unverified.

## Nested guard reconstruction (pass 84)

The generic decompiler now combines braced guards with no else or intervening
work. Mesh projection's nine optional-coordinate checks read as one multiline
short-circuit guard, with the same left-to-right null checks before array access.
Session/menu/loading/rendering checks likewise lose extra nested braces.
The innermost body block and its declarations remain, including original
try/finally, monitors, labels and transfers. Removed wrappers contain only the
next if; no effect or predicate is moved across a protected boundary.

The pass folds 710 chains and merges 913 conditions across 131 files, removing
913 lines. Every raw ordered declaration/reference/override row remains
19,558/118,944/388; all 6,549 complete naming rules and 52,854 edits survive
without ordinal migrations. Clean source-archive export, compilation, full
reproduction and dictionary reversal remain byte-exact. Diagnostics, text-loader
resources and frozen tools/stubs/probes retain their pins.

Generic fixtures add 17,280 native comparisons for short circuits, unboxing,
NaNs, partial effects, failure identity, body scopes, early returns, finally effects
after invocation and monitor ownership. An independent JDK method/initializer
inventory verifies that only the documented guard/frame rules produce all 303
new token streams. All seven native game probes retain their expected traces.
The generic emitter suite passes 46 tests with its optional historical pass77
frame-only proof skipped; the exception suite passes eight groups.

The pass 84 survey still had 21 method/constructor spans of at least 300 lines,
15 with generated block labels. Three text-loader helpers occur inside the large
outer span, so these counts do not represent unique dispatchers. Opaque helpers,
reused scratch phases and large control bodies remain; actual assets/gameplay
and browser/phone acceptance are unverified.


## Animated logo scene (pass 85)

`ni.loadLogoMeshesAndMaterials` loads `logo.fo3d`, reads a mesh count, decodes
materials/meshes and centers the scaled geometry. `AvatarFeedbackSupport.readMeshMaterials` checks
version/read enable, reads base RGB values for new materials and aliases earlier
entries for references. Other encoded values remain unnamed in meaning because
the decoder discards them. Successful real archive decoding is source-audited;
only null-archive failures and controlled material streams are executed here.

`logoAnimationTick` advances through `td.advanceLogoAnimationTick` and completes
when `wj.isLogoAnimationComplete` observes a tick greater than 250. The guard
remainder precedes the increment, so division failure leaves the tick untouched.
`logoStartDelayTicks` comes from the original millisecond-to-tick conversion.

`Geoblox.prepareLogoMeshRotation` uses the original three easing branches and
mesh-specific X/Y signs. `ArchiveIndex.buildLogoRotationTransform` composes inverse X/Y
rotations using `bh.sineQ16`, `fi.cosineQ16` and `quarterSineQ16`. Translation is
zero and the remaining nine coefficients are column-major Q16 values. Product
shifts precede selected negations; the code retains those rounding choices.

`ck.renderLogoMeshes` installs a camera at Z=-8144, computes rotated mesh bounds
midpoint depths and repeatedly selects the strictly greatest remaining key.
It rotates the selected mesh but reads `logoMeshCenters` by draw-order index.
That original distinction stays explicit. Equal keys retain the first candidate;
all-MIN_VALUE keys can select an already used mesh, so this is not documented as
an unconditional permutation. Lighting rotates with the clock, or uses pointer
snapshots when both coordinates are available. Normalization retains integer
overflow and NaN-to-int behavior. Guard division runs after rendering.

Projection uses `MeshDepthSupport.queueMeshFacesByDepthWithIntegerGuard` to preserve full JVM
integer arguments. The original byte-guard collector remains available. A
source byte cast changed -8170 to 22 and skipped cleanup in 120 native scene
cases; the new generic entry point fixes that mismatch without changing bytecode.
Its original and integer bodies currently coexist, adding code rather than
simplifying the collector. Generic discovery covers owned static targets through
int stack carriers; other invocation shapes remain outside this proof.

The fixed native trace compares 56,862 cases across bytecode/raw/readable
variants, including 804 successful scenes and 216 pixel-changing scenes.
Independent checks cover the trigonometric table and matrix composition within
one integer unit, clock state, 48 valid material inputs and 72 zero-rotation
center/depth cases. Whole-frame pixels and general easing use native traces;
real logo assets, full gameplay and browser/phone performance remain unverified.


## Ordinary guards from labeled skip blocks (pass 86)

Some generated labels mean only “skip the remaining block when this condition
holds.” Those decisions now read as ordinary conditional guards. For example,
logo rotation's old `L6` block broke out when the mesh index was neither seven
nor eight. It now uses a negated ordinary guard around the same sign assignments.
A chain of leading guards uses short-circuit negation in its original order;
explicit `!` retains floating/NaN and nullable-boolean behavior.

This requires a unique plain block whose only label references are those leading
bare breaks. It preserves the remaining declaration scope. Other exits,
alternates, work inside/before the guard, protected wrappers between the guard
and its target, duplicate/unbound labels and unsupported syntax stay intact.
Whole enclosing try/finally or synchronized regions and protected work in the
remaining body keep their original boundaries.

The pass consumes 57 labels and 66 breaks across 25 files. The main
`GameplaySession.updateSession` loses five labels and shrinks from 660 to 643
lines. Every ordered source binding/local ordinal remains unchanged, and the
6,683 complete naming rules stay identical. Native 4,032-case generic comparisons
cover predicate effects/failures, unboxing, NaNs, scopes, ancestor transfers,
finally state after invocation and lock ownership/release. The recorded game
probes retain their previous trace hashes and verification scope.

There are still 21 method/constructor spans of at least 300 lines, 15 containing
generated block labels. The text-loader outer span includes nested helpers, so
these are not 21 unique state machines. Larger control reconstruction, opaque
names, complete asset/gameplay execution and browser/phone targets remain
unfinished or unverified.

## Compact music decoding and instrument notes (pass 87)

`MusicScore.loadNamedScore(archive, groupName, fileName)` loads a named archive
entry and returns null for an absent file. `tf` requests theme music; `jg`
requests `title_music_loop`, `game_over`, `sun` and `bonus_bubble_jingle`.
Only the local constructor/reader pipeline is executed in the new fixture;
successful loading from a real archive is source-audited.

The private `MusicScore(packedInput)` constructor uses the last three bytes for
track count and tick division, scans packed event types to size the MIDI output,
then scans variable-length delta ticks and delta-coded controller numbers.
It counts the controller-specific streams, assigns their cursors, and emits
MThd/MTrk headers, delta ticks and event payloads. Track lengths are backpatched.
`noteNumber`, velocities, pitch, pressure and controller values accumulate
signed input deltas; the channel uses XOR deltas. These accumulators span tracks.
`programAndBankCursor` is shared by program changes and controllers 0/32.
Controller 64/65/120/121/123 share `switchControllerCursor`; other controller
stream names use numbers, retaining the dispatch rather than guessing meanings.
The existing loop and labeled controller-value join remain.

`collectInstrumentNotes` reads the emitted MIDI. Each channel keeps a bank and
program; channel 9 initializes both to 128. Controllers 0/32 replace their bank
bit ranges; a program-change event snapshots bank plus program. Positive-velocity
note-on events create or update `InstrumentNoteMask.notesUsed`, keyed by that
instrument ID. Zero-velocity events do not add notes. The method selects the
lowest-tick live track, resolving ties by its first index, then consumes that
track's events at the selected tick. The note cache is lazy and idempotent;
`clearInstrumentNotes` clears the cache while retaining the MIDI bytes.

`MidiTrackReader` keeps track starts, saved positions, accumulated ticks and
running statuses separately. Ended positions are negative. `readTrackDelta`
adds a variable-length value; `seekTrack` and `saveTrackPosition` move the shared
input cursor. `readTrackEvent` returns packed channel messages, 1 for end-of-track,
2 for tempo and 3 for other meta events. Skipped system-exclusive events return
0; accepted escaped system statuses are decoded with the status-length table.
A tempo change adjusts `tickTimeOffset` to preserve time at the change tick.
`getTickTime(tick)` returns offset plus tick times tempo, without dividing by
`tickDivision`. `restartTracks` clears running statuses/ticks, seeks each start
and reads its first delta; it retains the current tempo. `unload` releases input
bytes and all per-track arrays. Static table cleanup is a separate method.

The existing result-helper probe contains 1,536 exact-MIDI and instrument-note
oracle fixtures, 128 reader event/time oracles and seven edge-input traces.
All three native/raw/readable variants match the frozen trace. This establishes
the controlled decoding/cache behavior, not real archived songs, arbitrary
malformed files, synthesized audio or game/device performance. All score/reader
parameters and locals now have guarded names. Large-method counts remain 21
spans of at least 300 lines, 15 containing labels.

## Instrument-patch decoding and selective sample loading (pass 88)

`InstrumentPatch.loadInstrumentPatch(patchId, methodGuard, archive)` fetches a
single-file archive entry and returns null if absent. `kj` loads patches by the
instrument IDs found in `MusicScore.instrumentNoteMasks`, then calls
`loadSelectedSamples(sampleBudget, noteSelectionMask, methodGuard, sampleCache)`.
Successful real archive fetching/uncached decoding is source-audited here.

The private patch constructor decodes 128 keys. It scans zero-terminated runs
for key groups, panning and envelope assignments, preserving separate cursors
for their reserved value streams. An envelope-index map reuses or creates
`InstrumentEnvelope` objects. A fourth run table drives sample IDs and base
volumes; pitch bytes are cumulative unsigned low/high deltas. Sample IDs also
add the original high-bit loop flag to each signed short, keeping wraparound.
`kj` subtracts the low 15 bits from the key's pitch and uses the sign for looping.
Key-group/pan/envelope runs count active sample keys, whereas sample/volume runs
cover physical keys. Empty sample runs leave defaults or carry the prior volume.

Per-key fields now read `encodedSampleIds`, `keySamples`,
`pitchOffsetsAndLoopFlag`, `keyGroups`, `keyPans`, `keyVolumes` and `keyEnvelopes`;
`globalVolume` multiplies the per-key amplitude. Volume/release envelopes store
alternating time/value bytes. Release pairs start at value 64 and end at the
zero-initialized final value. Envelope times accumulate unsigned deltas plus one.
Optional key gain and pan curves apply across all 128 keys, including inactive
ones. Interpolation uses `divideFloorWithPositiveDivisor`; gain keeps signed-byte
volume arithmetic, and pan treats the existing byte as unsigned then clamps
between 0 and 128. The fixture oracle checks negative rounding and wraps.

Envelope fields identify volume/release pair arrays and their key scaling,
exponential `decayRate`/`decayKeyScaling`, plus `vibratoPhaseStep`, `vibratoDepth`
and `vibratoRampTicks`. These roles follow the playback controller's actual
volume, pitch and per-tick updates. The envelope holder also contains shared
static UI data and `withFailureContext`; those utilities are separate from the
instance envelope meaning. The latter preserves an existing failure wrapper
and its original cause while appending context, or creates a wrapper for a new
cause. Diagnostic string literals retain their original JVM method spellings.

Selected-sample loading skips zero-mask keys, resolves nonzero IDs through the
existing sample cache, and reuses the preceding ID's result. Subtracting one
from the encoded ID yields a cache-family bit and the sample index shifted by
two. Successfully resolved keys receive the exact cached sample object and
clear their encoded ID. Missing samples return false while retaining IDs;
a short mask or null provider can fail after partial installation. The method's
guard can write a shared UI flag after the loop completes without throwing; that flag is not
renamed as music state. `clearEncodedSampleIds` releases IDs; guard >-94 also
clears pitch data. Installed samples remain.

The fixed patch probe has 960 decoding cases, 64 sample-loading cases, 256
cleanup cases, 98 floor-division checks, 12 wrapper checks and 369 null/truncated
inputs. Native/raw/readable results match. Cache hits and zero-budget misses
are controlled; uncached sample decoding, real patches, synthesized sound and
game/device performance are unverified. All patch music parameters/locals and
instance fields now have guarded names, while the constructor's nine generated
block labels and the overall 21 large spans/15 labeled spans remain.


## Terminal exits without jumps (pass 89)

An ordinary braced block can complete at the same destination as its final
labeled break. The decompiler now removes that redundant break when the entire
path consists of final block statements, conditional branches and plain labels.
Existing scope-safe cleanup removes labels/braces that no longer serve a role.
A bare `if` branch keeps an empty statement and still evaluates its predicate.
Loops, switches and protected regions between jump and destination remain
unchanged because their continuations require a different proof. Protected
regions surrounding the whole destination remain intact.

This removes 102 breaks and 73 labels across 50 files. The instrument-patch
constructor loses eight labels; its remaining early exit skips real fallback
work and stays. All ordered naming bindings and full previous naming rules are
identical. Independent JDK body positions plus only these documented rules
produce all 303 regenerated token streams. Native 5,376-case generic comparisons
cover scopes, failures, ancestor jumps, enclosing cleanup and monitors. All six
recorded game probes retain their traces. Large bodies and whole-game/browser/
phone acceptance remain unfinished or unverified.


## Conditional alternatives instead of plain exits (pass 90)

`InstrumentPatch` now selects the envelope-map construction or its existing
single-envelope fallback with `if/else`. Its prefix cursor changes and allocation
stay before the condition. The previous skip break disappears; this does not
assume the input is valid or move the surrounding exception context. The native
patch fixtures retain their 1,759-case trace across all three variants.

Gameplay rendering similarly exposes single-exit alternatives without guessing
that the client control flag is zero. Board reconciliation's final single-exit
choice and two music-packet choices become ordinary conditionals. More complex
multi-exit decisions remain intact. The generic rewrite requires a direct braced
conditional ending in the destination's only break and a nonempty fallback;
other label references, intermediate protected/loop/switch paths and unsupported
syntax refuse reconstruction.

This pass removes 64 labels/breaks, unwraps 64 scope-safe frames and saves 145
lines across 45 files. All ordered naming bindings and 7,015 complete rules
remain unchanged. Native 6,720-case comparisons and selected/fallback oracles
cover effects/failures, scopes, ancestor jumps, finally state and monitors. All
six recorded game probes retain their trace pins. The constructor has 466 lines
and no labels; there are still 21 large method spans, 12 with block labels.
Complete gameplay/assets and browser/phone acceptance remain unverified.


## Ordered alternatives from shared exits (pass 91)

`MusicScore` now reads controller values through an ordered alternative chain.
Bank controllers 0/32 retain their separate value stream. Controllers 1/33,
7/39, 10/42, 99/98 and 101/100 each retain their exact stream/cursor update;
64/65/120/121/123 use the switch-controller stream, and the remaining controllers
use the general stream. The selected delta still updates the previous value,
then writes the same seven-bit MIDI byte. Later predicates/streams remain skipped
after selection. All 96 constructor locals keep their guarded names.

The generic reconstruction consumes every reference to one plain destination.
Each selected direct braced arm must end in a direct target break; fallbacks
are built recursively. Work between decisions stays in the reached fallback.
An `else if` chain is used only without prefix work/declarations requiring a
block. A predicate whose effect cannot be discarded still executes even when
its branch becomes empty. Scopes, protected regions and ancestor transfers
stay intact, with no duplicated work/predicate or new local.

The pass consumes 75 breaks and 27 labels across 24 files, saving 126 lines.
The music-score constructor has 519 lines with no block labels; Bzip2 block
decoding has 385 lines and no block labels. All 7,015 complete rules and ordered
bindings remain identical. Native 16,128-case generic comparisons and explicit
first/second/fallback oracles cover effect order, unboxing, NaNs, failures, scopes,
ancestor jumps/returns, finally state and monitor ownership/release. All six
recorded game probes retain their traces, including music/patch/archive cases.
The music fixture independently builds expected MIDI and repeats 19 controller
numbers, covering every retained controller-stream route.
Larger gameplay paths, real assets and browser/phone acceptance remain unverified.


## Nested hit-test guards without labels (pass 92)

Some menu highlight decisions first test a selected button, then reject pointer
coordinates at successive boundaries. These predicate-only trees now read as
an OR alternative for the selected button and an AND chain of the original
negated rejection tests. All strict boundaries remain, and pointer tests still
stop at the first rejection. Logical negation keeps the original comparisons;
this proof does not replace them with guessed floating-point complements.

Prefix drawing, geometry updates and palette initialization stay before the
condition; the existing highlight update is its remainder. A nested remainder
can qualify only when ordinary completion reaches the same plain destination
through final plain blocks, conditional branches and plain labels. Intermediate
work, loops/switches/protected wrappers, effects inside guards and unsupported
syntax refuse the proof. Every target reference must be consumed, and remainder
declaration scopes/protected work remain intact. No predicate/effect is
repeated and no local is added.

The pass removes 41 labels and 82 breaks, recovering 42 guards over 97 predicates
across 19 files. Menu rendering shrinks to 304 lines and four block labels;
other gameplay/menu/connectivity paths also simplify. All ordered naming
bindings and 7,015 complete rules remain unchanged. Native 16,128-case generic
comparisons and bypass/skip/NaN oracles cover short circuits, unboxing, failure
effects, scopes, ancestor jumps, finally state and monitors. The six recorded
game probes retain their traces and previous scope. Actual complete menu/gameplay
rendering, live assets and browser/phone acceptance remain unverified.

## Shared array, byte-storage and applet helpers (pass118)

[`ArrayOperations`](geoblox/src/ArrayOperations.java) clears int ranges and copies
byte, int and reference arrays. The eight-element unrolling remains visible.
Equal indices on the same array return before null/range checks; overlapping
copies with a later destination run backward. Names such as
`lengthOrSourceBoundary` expose the original parameter reuse rather than
silently introducing a new algorithm or validation policy.

For archive payloads follow `IntrusiveNode.wrapByteStorage` into
`DirectByteStorage.initializeStorage`, or `UsernameAvailabilityValidator.extractByteStorageBytes`
into `ByteStorage.copyToByteArray` / `TextPairLoginPayload.copyBytesWithDestinationOffset`.
Wrapping more than136 bytes always makes direct storage; the flag controls
aliasing/copying only for smaller arrays. Extraction aliases or copies an array
according to its flag, while direct storage always copies out. The copy wrapper
allocates only source.length, so a nonzero destination offset is not a request
for a larger allocation and may fail after partial writes. Direct storage reads
its full capacity before the guard quotient, so a failing guard can leave its
buffer position advanced. These source-supported contracts retain their
original effects; this pass adds no direct-buffer/live archive coverage.

[`CacheFileLocator`](geoblox/src/CacheFileLocator.java) is the transformed cache
resolver used by `PlatformTaskDispatcher` for random.dat and cache data/index
files. `resolveRedirectedCacheFile` delegates gameName/fileName to the launcher
hook; its other integer parameters are unused in this transformed source.
No original unpatched cache search is inferred. Invalid wrapper guards still
first recurse with a null filename.

[`AppletJavaScriptBridge`](geoblox/src/AppletJavaScriptBridge.java) separates
calls with arguments, calls without arguments, and script evaluation. Calls
reject invalid guards before obtaining the browser window. Script evaluation
happens before the guard arithmetic; its possible division failure remains.
The cookie, zap/unzap, logout and link-update callers now use these names.
Actual browser JavaScript and cache startup are outside the native probes.

## Gameplay support owner map (pass120)

| Readable owner | Original owner | Main gameplay operation |
| --- | --- | --- |
| `EntityMotionSupport` | `ab` | `moveEntitiesAndCollectContacts` |
| `EntityCollisionSupport` | `gf` | `renderEntityCollisionSprite` |
| `EntitySpawnSupport` | `nb` | `spawnEntityAtPointer` |
| `BoardReconciliationSupport` | `kc` | `reconcileBoardEntities` |
| `EntityContactSupport` | `ih` | `linkEntityAtMaskContacts`, `areEntityQueuesSettled` |
| `EntityLinkSupport` | `ik` | `linkTouchingEntities` |
| `AvatarFeedbackSupport` | `jc` | `requestAvatarFeedback` |

These are mixed-purpose static owners. Their names describe the exposed gameplay
helpers; archive loading, input cleanup, UI borders, ranking packets, login/email
query state, mesh materials and navigation can still share an owner. Nothing was
moved between Java classes. Use the dictionary for exact original declarations.

In `EntityContactSupport.linkEntityAtMaskContacts`, `scratchPixelIndex` scans
nonzero pixels of the rotated incoming sprite, while `ownershipPixelIndex` scans
the cropped board ownership raster. `overlapWidth`, `overlapHeight` and both row
skips preserve the clipping arithmetic. Ownership pixel zero means no owner;
16777215 marks the avatar, and other nonzero values select `entitiesById[pixel-1]`.
A kind-two mismatch may consume `pooledConversionEntity` and append it to the
transient queue before reciprocal linking. A link-detach result can end the scan
early. The supplied `negativeHorizontalClipGuard` participates in the first-column
comparison; it is not treated as a constant during naming or source generation.

`BoardReconciliationSupport.sortRankedListIndices` first orders existing indices,
then on its accepted guard initializes a secondary range, sorts the combined
indices and limits the retained count. `EntityCollisionSupport.openQuitPage` still
uses the original nested failure/print/context boundaries and the `quit.ws` path.
`EntityLinkSupport.drawGradientWidgetBorder` retains its fixed top/bottom colors
and clipped grayscale side edges. Names clarify those operations without
simplifying guards, packet payloads, failure scopes or memory writes.

## Progression and session map (pass121)

| Readable owner | Original owner | Main operations/state |
| --- | --- | --- |
| `MatchCandidateSupport` | `ul` | `collectMatchCandidates`, packed triple flags and GMT calendar |
| `MatchScoringSupport` | `ec` | `processMatchCandidates`, ranking resends, instruction paragraphs |
| `PlayfieldRules` | `ld` | Boundary scan, difficulty advancement and ordinary points popup |
| `ScorePopupSupport` | `ug` | Pooled popup creation, sprite lookup, builder padding, social name-hash index |
| `AttachedEntityRenderer` | `dc` | `drawAttachedEntities` |
| `EndingAnimationSupport` | `fc` | Ending entity advancement, prepared frame presentation, login payload buffer |
| `DebugOverviewCompositor` | `ek` | Scaled/cropped/clipped overview compositing |
| `MeshDepthSupport` | `i` | Face depth buckets, outermost entity search, main-raster canvas drawing |
| `MeshPrioritySupport` | `va` | Face priority grouping, session cookie, solid center slice |
| `GameplaySetupSupport` | `pg` | Difficulty reset, setup globals and reflection-request decoding |
| `BoardEntityState` | `a` | Attached queue, instruction titles and selected achievement index |
| `GameSoundResources` | `fl` | 33 sample slots, space foreground and optional login text |
| `LoginProtocolSupport` | `ri` | Staged handshake/retry, avatar face layers and achievement descriptions |
| `AchievementProtocolSupport` | `ud` | Submission/state resends, response handling and secondary-social lookup |

The shared static owners retain all their functions, fields and initialization.
`frameLoopRateEstimate` follows the 32-timestamp GameApplet ring formula and is
a loop timing estimate. It does not count actual browser-presented frames.
`selectedAchievementIndex` follows click toggling in the achievement grid,
including its -1 deselection value. These roles come from both writers and readers.

`LoginProtocolSupport.advanceLoginHandshake` is easier to follow through these
shared object-identity stages:

| Stage field | Source operation |
| --- | --- |
| `IterableNodeHashTable.requestReadyStage` | Prepare opcode 14 plus payload-kind byte; also used by account-query preparation |
| `ResizableDialog.awaitingInitialLoginReplyStage` | Wait for one byte; zero advances to the server-long stage, other values select failure text |
| `MessageDialog.awaitingLoginLongState` | Wait for/read eight bytes and build the login request |
| `da.awaitingLoginResultStage` | Wait for one byte; original 0/1/8 and rejection paths remain distinct |
| `da.awaitingLoginDetailsStage` | Gate the existing detail parser, optional extension, cookie, name and cipher setup |
| `TextInputRenderer.awaitingLoginFailureTextStage` | Read failure text, close and retain response7 retry handling |
| `LogoCompositor.connectedSessionStage` | Select connected-session identity before directional cipher initialization |

`useLongLoginPayload` selects the existing long-plus-text form or two-text form.
`affiliateId` comes from applet `affid`; `enableLoginFlagBitEight` describes only
the proven request bit. The optional reply string is passed to the settings
cookie writer. Cipher seed adjustment adds 50 in place for the incoming direction.
The server long, other reply fields and unknown flag purposes retain their
source identities without invented wire meanings. This is a source reading map,
not a newly executed login/server interoperability result.

In `GameplaySetupSupport.readReflectionCheckRequest`, the decoder reads a byte
operation count and int request ID, then allocates operation/error/task arrays.
Operations 0/1/2 read class and field names; only 1 reads an integer write value.
Operations 3/4 read class/method names, a byte argument count and argument type
names; only 3 reads int-length-prefixed serialized argument bytes. Lookup tasks
are requested after class resolution. The reused `argumentCountOrIntegerWriteValue`
and `serializedArgumentLengthThenClassIndexSnapshot` expose both original roles.
Per-operation ClassNotFoundException, SecurityException, NullPointerException,
Exception and Throwable record -1, -2, -3, -4, -5 respectively. Unknown operations
increment their index before `operationIncrementAlreadyApplied` skips the ordinary
increment. Its values and generated control flow remain intact. The accepted
guard -4 enqueues the request; the invalid recursive path is preserved.

## Logo preparation, compositing and adjacent UI helpers

These names describe functions retained on mixed-purpose static owners. No
method, global, initialization or diagnostic literal moved to another class.

| Readable owner | Original owner | Audited helper family |
| --- | --- | --- |
| `LogoPreparationSupport` | `bk` | Logo setup and received-text record decoder |
| `LogoCompositor` | `eh` | Scene/final-frame/glow fades and shared packet/UI state |
| `FullscreenSupport` | `jk` | Input detachment, fullscreen tasks, frame disposal; also specular response and domain-label checks |
| `SessionTextHistorySupport` | `ki` | Category counting, quota compaction and append; also logo raster and account UI preparation |
| `CacheFileState` | `af` | Random-seed/cache-data handles, debug overview and avatar timer |
| `ByteTextDecodingSupport` | `bc` | Byte text decoder and ten-millisecond sleep splitting |
| `UsernameQuerySupport` | `cl` | Query staging/reuse, payload-key RNG and lower final-frame slice |
| `UiFontResources` | `hh` | AWT loading/common UI fonts, keyboard polling and accepted username query |
| `SpriteConstructionSupport` | `hj` | Decoded RGB/ARGB construction, keyboard attach and client-screen stage |
| `MessageDialogSupport` | `fa` | Active message dialog, encrypted payload scratch and gameplay constants |
| `NameCharacterSupport` | `gg` | Name separators, CRC prefix, text joining and password messages |
| `RatingPresentationResources` | `ej` | Rating labels, crack frames, music and neutral login kind three |
| `ClientTimingSupport` | `sb` | Configured timer frequency, session readiness and CRC/sprite globals |

`prepareLogoAnimation` converts its delay milliseconds using the configured
tick rate, decodes the two named Vorbis resources, loads meshes/materials,
prepares the final-frame JPEG slices, specular response and blurred glow, then
sets the negative start tick. `unusedPcmMixer` is only printed in failure context;
source decoding does not enqueue sound for playback. The specular table retains
its exponent 15, projection shift 11, 256 computed entries and four saturated
tail entries. `prepareLogoGlowRaster` renders tick zero into a temporary
540×140 target, repeats silhouette/blur 15 times and downsamples to the 270×70
glow target. These methods preserve their original raster restoration behavior
on success and exceptions.

`drawLogoAnimation(centerY, centerX, methodGuard)` retains its asymmetric source
argument order. It derives left/top offsets of -135/-35, fades the scene over
ticks 0–75 and 200–250, switches to the top final-frame slice at tick 150,
fades the additive glow over ticks 125–175 and fades the bottom slice after
tick 140. The bottom slice retains the top slice's height in `trimY`. Repeated
branches and invalid-guard side effects remain visible rather than being folded
with assumed guard or client-control-flow values.

`readSessionTextRecord` reads a header whose low seven bits select source kind;
`headerFlagMask` controls the separate retained flag. Kind two adds unsigned
short/medium fields. The existing alternate-name byte controls whether a second
name is read. Plain mode reads compressed text; template mode resolves a ushort
ID, summarizes literals and conditionally retains referenced template IDs.
Template failures clear both text and IDs, report the same failure and still
construct the record. Unknown header fields keep neutral roles.
`retainTextRecord` counts the three classification categories only for the
same record kind, includes the new record, compacts over-quota old entries in
place and appends it. Guard failure still occurs after the initial counting.

`exitFullscreenAndDisposeFrame` polls submitted tasks every 10 milliseconds,
retries failed submissions after 100 milliseconds and hides/disposes the frame
only after success. It does not add a timeout, finally disposal or exception
suppression. `validateDomainLabel` is called for dot-separated domain labels;
it keeps length 1–63, allowed-character and edge-hyphen rules and source failure
objects. `getConfiguredUpdateRate` and `setConfiguredUpdateRate` expose the
reciprocal nanosecond timer setting; integer truncation, division by zero,
negative values and guarded fallback remain. They do not count presented frames.

## Reflected platform implementations

| Readable class | Raw JVM identity | Contract retained |
| --- | --- | --- |
| `AwtMouseWheelListener` | `gl` | AWT wheel event callback and synchronized accumulator/drain |
| `BufferedImageRasterBuffer` | `ve` | Shared int pixel buffer, image raster and graphics drawing |
| `AwtFullscreenBridge` | `pd` | Public `enter`, `exit`, `listmodes` entry names |
| `AwtCursorBridge` | `tk` | Public `movemouse`, `showcursor`, `setcustomcursor` entry names |
| `LegacyDirectSoundBridge` | `of` | Legacy compatibility interface and constructor allocations |

Only 11 source literals at resolved direct `java.lang.Class.forName` calls are
rewritten: nine in the task dispatcher, one in the preferred raster factory and
one in the wheel factory. Their original strings and UTF-16 positions stay in
the reversible dictionary as separate class-name literal edits. Other strings,
comments, diagnostics, dynamic class names and public reflection method names
stay unchanged. The Java symbol binding count remains 136,612; the 11 literal
target/position records are verified separately. The policy does not infer runtime
server-provided names or promise compatibility with arbitrary foreign class loaders.

Fullscreen bridge fields now read as `graphicsDevice` and `savedDisplayMode`.
The constructor selects the default fullscreen-capable device or the first
supported nonnull candidate; `enter` snapshots the mode before window updates
and chooses a zero-requested refresh rate nearest the saved rate among exact
width/height/depth matches. `exit` restores and verifies the saved mode before
clearing it and leaving fullscreen. Cursor fields name `mouseRobot` and
`cursorHiddenComponent`; `showcursor` restores the previous component before
installing a new blank cursor, and true selects the default cursor. Custom cursor
creation retains type-2 ARGB image copying and hotspot behavior. The DirectSound
bridge keeps its two descriptors/cursor holders and unused constructor allocations.
The new headless probe checks class/member loading for these three bridges; it
does not exercise successful hardware fullscreen, Robot or COM operations.

The native/raw/readable reflection probe has 122 independently asserted scenarios:
five class loads, 80 wheel cases, 36 buffered-raster cases and one null-return
factory guard. It checks the actual factories, so a renamed lookup cannot pass
by silently returning null or selecting the image-producer fallback. Wheel checks
cover overflow, event consumption, null-event failure without draining, reset and
listener-removal guard timing. Raster checks cover shared storage, image pixel
values, draw offsets and observer guards. All prior seven probe hashes remain.

## Text, clock, cookie and buffer helpers

| Readable owner | Raw identity | Named entry points |
| --- | --- | --- |
| `TextWidgetSupport` | `ah` | `buildRepeatedCharacterRange`, `getDefaultTextWidgetRenderer` |
| `TextValidationSupport` | `ak` | `containsTextOrReverse`, `containsNonAsciiAlphanumeric`, `listLoginMethods` |
| `GameGraphicsResources` | `ll` | `loadRgbSpritesById`, `elapsedSinceSessionActivity` |
| `GmtTimestampSupport` | `md` | `formatGmtTimestamp` |
| `TextConcatenationSupport` | `mj` | `joinCharSequenceRange`, `validateAsciiDigits` |
| `ClientClockSupport` | `oa` | `correctedCurrentTimeMillis`, `parseIntWithRadix` |
| `ByteArrayPoolSupport` | `oi` | `acquireByteArray`, `loadSpritesByName`, `resendIntRecordRequests` |
| `CharacterReplacementSupport` | `qj` | `replaceCharacter`, `getAccountAgeYears` |
| `SharedBufferPools` | `sg` | `rasterSnapshotPool`, `additionalByteArrayPools` |
| `SettingsCookieSupport` | `tc` | `storeSettingsCookie`, `isRepresentableTextCharacter` |

`acquireByteArray(earlyReturnGuard, length)` first checks the 100-byte and 5,000-byte
pool counts and pops their exact-length stack slots. Only after those checks does
the true guard return null. A false guard continues to the 30,000-byte pool and
optional configured-size pools, then allocates a new array. Each pop decrements
the count before reading, and clears the selected slot after the read. Storage,
counts and optional lengths remain on their original owners; the field names now
connect this chain. In the fixed source the optional pools lack non-null setup,
and standard counts initialize to zero with no refill/release path. The names do
not imply that pool reuse occurs during ordinary gameplay.

`correctedCurrentTimeMillis` remains synchronized on its class. It samples
`System.currentTimeMillis`, adds `previousWallClockMillis - wallClockMillis` to
`backwardClockCorrectionMillis` if the clock moves backward, saves the sample and
returns sample plus correction. Its guard still clears subscription text and
all signed overflow behavior remains. `elapsedSinceSessionActivity` subtracts
`sessionActivityStartMillis`, which is also assigned by socket/UI protocol paths.
It is a corrected wall-clock helper, with no nanoTime or overflow guarantee.

`formatGmtTimestamp` mutates the existing shared GMT calendar and uses the named
`gmtWeekdayAbbreviations` and `gmtMonthAbbreviations` tables. It is not pure or
synchronized. For a wrong guard, the original recursive call changes the shared
calendar to -99 milliseconds while the previously read weekday remains. The
settings writer stores `settingsCookieValue` before attempting the JavaScript
cookie, uses the applet's `cookieprefix` and `cookiehost`, retains its fixed
three-year expiry or epoch-deletion string, catches the inner `Throwable`, then
refreshes settings. These names describe source behavior; live browser cookie
operation and current server compatibility are not verified.

`reverseTextCodeUnits` on `CachedArchiveSource` reverses UTF-16 code units;
`containsTextOrReverse` uses that result plus the original substring and retained
edge checks. Surrogate pairs are not treated as single characters.
`ArchiveCatalog.isAsciiLetter` and `DualLinkNode.isAsciiDigit` make the
alphanumeric scan explicit. `SettingsCookieSupport.isRepresentableTextCharacter`
accepts the original direct byte ranges and nonzero extended CP1252 entries.
`ReflectionCheckRequest.parseSignedInt` names the radix2..36 scan, optional
leading plus, negative accumulator flag, digit-seen flag and division overflow
check. Its explicit integer flags and labeled first-character skip remain.

`joinCharSequenceRange(startIndex, count, parts, methodGuard)` keeps its separate
zero-count and single-part paths, literal `null` substitution, capacity scan and
append order. `validateAsciiDigits` accepts the empty string via its original
marker. `replaceCharacter` scans occurrences to estimate capacity, then appends
prefixes, replacements and a tail. `buildRepeatedCharacterRange` fills only the
selected start-to-length range; earlier characters remain zero. Guard effects,
negative lengths/counts, alias snapshots, diagnostic literals and exception
context all stay visible. No raw body or generic tool is rewritten in this pass.

## Client flow, bootstrap and fullscreen helpers

| Readable owner | Raw identity | Audited role |
| --- | --- | --- |
| `ClientFlowToken` | `al` | Identity markers, session acknowledgements, active login identifier, eligibility marker and theme sound helper |
| `SessionBootstrapSupport` | `ic` | Session buffers/configuration, 24-byte seed persistence and signed Euclidean GCD |
| `RankedComparisonSupport` | `ig` | Ranked-index ordering and username response query construction |
| `UsernameResponseSupport` | `kb` | Username responses, dimmed account UI and animation/reset helpers |
| `ClientFlowState` | `kd` | Account token/dialog layer and guarded session exit request |
| `UsernameQueryState` | `dl` | Pending account username result, intro-running flag and volatile redraw request |
| `AccountEligibilitySupport` | `kf` | Account block check and login return permission |
| `AccountCreationSupport` | `mc` | Account form submission setup and pointer snapshot helper |
| `FullscreenEntrySupport` | `qe` | Display-mode selection, task wait and retained archive guard placeholder |
| `LoginUiSupport` | `tj` | Login dialog, archive progress, loading fonts and int-record packet writer |
| `ClientScreenExitSupport` | `oh` | Session UI service result2 and fullscreen dialog/audio resources |
| `ConnectionHeaderSupport` | `ke` | Fixed connection header and colocated entity sprite cache |
| `FontLoadingSupport` | `rb` | Monochrome font loader and colocated login/resize/fullscreen state |

`ClientFlowState.accountCreationFlowState` and
`WidgetSkinState.usernameQueryFlowState` compare three shared `ClientFlowToken`
instances. `idleClientFlowToken` is installed by UI setup/reset;
`pendingClientFlowToken` is selected before account submission or a username
lookup; response handling selects `completedClientFlowToken`. These remain
nullable mutable references, not enum values. The token's `toString` still throws.
The named getter `getActiveLoginIdentifier` preserves its priority: pending
account display name, pending username candidate, username candidate while email
availability remains incomplete, then `currentLoginIdentifier`.

`AccountCreationSupport.startAccountCreation` takes the actual display-name,
email, parsed age, news opt-in and password values from `AccountCreationForm`.
It requires the idle account token, allocates and shows the result dialog before
checking its method guard, then either displays an ineligible result or stores
the form values and pending token. It does not send the server request itself.
The source field names now connect `accountCreationDisplayName`,
`accountCreationEmail`, `accountCreationPassword`, `accountCreationAgeYears` and
`accountCreationNewsOptIn` to their consumers. The block check observes the
existing override or `tuhstatbut` cookie/applet marker; external interpretation
of that marker is not established.

`handleUsernameResponse` keeps exact response-code handling: 255 constructs an
accepted query using the under13 age check; 100..105 store suggestions; other
codes construct a response query with candidate text and code. Account and
standalone query result references remain separate. No wire values, suggestion
ordering, accepted marker, error mapping or under13 behavior are replaced.
`isRightRankedEntryBeforeLeft` states its direction: it compares ascending
`rankedEntryKeyOne` and `rankedEntryKeyTwo` in the selected order, then the signed
sum of three tie fields, then the smaller original index. The modulo guard is
reached only after equal key pairs, so earlier-return exception timing remains.

`SessionBootstrapSupport.initializeSessionServices` allocates the incoming
buffer before `outgoingSessionBuffer`, stores the shared task dispatcher, host,
active/alternate ports and language/client/server identifiers, then wraps the
existing random seed file. Its game CRC, `clientInstanceId` and `memberAccountMode`
trace to applet parameters `gamecrc`, `instanceid` and `member` (`yes` selects
member mode). Member mode contributes login flagbit1; `loginResponseExtensionEnabled`
contributes bit4 and gates extra response reads. These describe source configuration
and wire behavior, not verified live subscription/server status.
`ConnectionHeaderSupport.writeConnectionHeader` retains its opcode12, fixed17,
client/server shorts and language byte. `persistSessionSeedBytes` attempts a
24-byte write at seed-file offset0, catches `Exception`, and advances the incoming
cursor by24 even if the file is absent or the write failed. No seed-file content,
error object or cursor behavior is corrected by naming.

`ClientFlowToken.handleSessionAcknowledgement` retains guard26146 and two kinds.
Kind0 takes the first pending FIFO token, reads and discards a byte-length payload,
skips four bytes, verifies the trailing CRC32 and unlinks the token. Kind1 reads
a CRC, searches `pendingCrcAcknowledgements`, and unlinks the first match.
Missing records, corrupt FIFO CRC or unknown kinds keep their socket-close paths
and numeric close guards. These are source-audited branches, not a live server
interoperability or new acknowledgement execution test.

`FullscreenEntrySupport.enterFullscreenAndWait` checks platform support. When
the method guard equals the complement of the requested bit depth, it enumerates
matching dimensions/refresh rates and selects the largest available bit depth.
It requests fullscreen, sleeps10 milliseconds while task status remains zero,
then checks the frame result. A null result returns null; status2 with a frame
exits fullscreen/disposes it before returning null. The original task polling,
casts and failure scopes remain. The archive helper explicitly names a
`guardArchiveInitializationPlaceholder`: in the fixed source its safe-guard body
does nothing, and its other path calls fullscreen with a null dispatcher.
Hardware fullscreen success is not newly tested.

`ClientFlowState.requestSessionExit` keeps its guarded stage10 reconnect-dialog
path and stage11 selection, then sets `sessionExitRequested`. The alternate
predicate branch remains in the source even though its current fixed callee
`TextTemplateArgumentType.b(0)` always returns true. The related UI wrapper's
text/layout parameters are named `unused...` because its fixed body only calls
this service and evaluates its guard. `renderDimmedAccountUi` preserves the
192-alpha black overlay and dialog-layer draw; its first boolean is unused by
the fixed callees. `LoginUiSupport.pollLoginUiArchiveProgress` performs the
original index/group-loading calls before returning fixed progress steps; it is
not a pure percentage getter. None of these bodies are structurally rewritten.

## Shared state and socket opening (pass 126)

The final opaque top-level owners now have source-supported names. These are
shared static buckets: the name describes a helper/state family, and does not
move unrelated members into a new subsystem.

| Class | Source-supported role |
| --- | --- |
| `TextTemplateLookupSupport` | Type-ID lookup, login-panel wrapper and bootstrap archive-load sequence |
| `BootstrapUiSupport` | Loading-screen predicate, achievements text and bit population count |
| `ClientOptionSupport` | Option bit test, highscore view, saved clip and localized bootstrap text |
| `LoginPasswordSupport` | Login password and action-four request, alongside rank/mesh/avatar arrays |
| `RasterTargetRestoreSupport` | Snapshot pop/restore/pooling, dialog top frames and highscore names |
| `SessionInstanceState` | Instance ID, exit request, foreground sprite and achievement counter |
| `ArchiveHandshakeState` | Archive socket, heap estimate and tutorial completion message |
| `PointerMenuState` | Volatile pointer X, repeat delay and screen-option resources |
| `SpawnQuotaSupport` | Generated-entity quota accounting and sprite archive decoding |
| `ClientRenderingState` | Canvas/mesh state, session client ID and ranked bound seed |
| `GameAudioState` | Sample cache and germs score, with keyboard character state |
| `SessionTextState` | Received template references and compressed-text decoder |
| `SessionSocketSupport` | Socket task poll/header setup, font and raster helpers, base37 alphabet |
| `AttachmentPointerState` | New attachments, pointer activity and sound label |

`SessionSocketSupport.pollSessionSocketOpening` requests a socket only when
`sessionSocketOpenTask` is null. Status zero returns false. Terminal completion
records corrected time; success wraps the result, resets packet cursors and the
three-entry opcode history, selects `requestReadyStage`, writes the connection
header and calls the existing flush service. Task failure or the inner IOException
selects `socketOpenFailedStage`. The terminal path clears the task and returns
true even on that failure. Other unchecked/checked exceptions retain their
original rethrow/wrapping behavior; this is not an unconditional success result.

`clientBootstrapStage` retains its original numeric stages. The loading predicate
uses stage thresholds, `clientScreenStage` and `sessionAccessLevelByte`. The last
value is an unsigned response byte; its external privilege semantics remain
unknown. `selectBootstrapLanguageText` indexes translated update-server,
waiting-for-text and loading-text messages. It does not select hosts or ports.
`clientOptionMask` is tested by bit index, with -1 meaning true, but has no nonzero
producer in this fixed source. Java shift masking and sentinel failures remain.

`recordGeneratedEntity` counts creation/enqueue outside tutorial mode; this is
separate from released-entity counters. Theme completion and difficulty reset
clear it. `drawSpriteIntoEmptyDestination` clips and copies only into zero
pixels, without checking source transparency. `markZeroOutlinePixels` considers
signed source values greater than one and marks zero neighbors with one, including
distance-two cardinal neighbors; marked pixels do not expand further. The signed
comparison, writes and aliased input buffers remain exact.

These names improve navigation without reconstructing the six large labeled
bodies. The explicit workflow migration raises only historical manifest capture
to 32 MiB, with a Git-history regression above 8 MiB; it does not alter Java bodies,
bytecode, compiler limits or native fixture scope.

## Named exits in the six large bodies (pass 127)

Labels now describe the original scope that a transfer exits or repeats. They are
navigation aids, not new states or extracted methods. For example, board
reconciliation now reads `componentQueueTraversal`, `componentNeighborTraversal`
and `enqueueUnseenNeighbor`; its continues advance the exact existing loops,
while a duplicate neighbor exits only the enqueue scope. `componentSearchAndDetach`
and `routingDestinationSelection` distinguish graph search from queue routing.

| Body | Examples of named scopes |
| --- | --- |
| `GameScreen.renderScreen` | `panelHeightSelection`, `fullscreenCountdownText`, `tutorialSlideRendering` |
| `GameScreen.updateScreen` | `keyboardDrainAndTutorialSelection`, `pointerPressDebounce`, `fullscreenPointerHandling` |
| `GameplaySession.renderSession` | `boardRasterPreparation`, `debugOverviewPreparation`, `gameOverTitleRendering`, `settledResultRendering` |
| `GameplaySession.updateSession` | `sessionProgressionAndEnding`, `rotationKeySelection`, `boardClearBonusHandling`, `tutorialAutoAdvance` |
| `BoardReconciliationSupport.reconcileBoardEntities` | `componentQueueTraversal`, `enqueueUnseenNeighbor`, `attachedEntityRouting` |
| `SpriteState.drawSortedHalfBlendRgbTriangle` | `flatTopEdgeSelection`, `upperSegmentScan`, `upperSegmentTopClip`, `lowerEdgeOriginSelection` |

All 52 labels in those bodies are named: 50 blocks and two loops. They generate
173 declaration/reference edits. The audit proves all 854 label records in the
whole corpus, including untouched labels: declaration ordinal, exact lexical
target, break/continue kind and shifted token position. It stops target lookup at
method, class and lambda boundaries. Unlabeled transfers, comments, strings,
statements and exception/monitor boundaries stay intact. `Geoblox.clientControlFlowFlag`
remains a real mutable value; guarded fallthrough and unusual nonzero paths stay.

These source bodies still have their original length and structure. There are
157 opaque plain-block labels and 56 opaque loop labels elsewhere, plus unmapped
members. The six large labeled bodies have not been structurally eliminated.
Under the same JDK/release8 compiler options and frozen stub jar, all 304 compiled
class files are byte-identical to the pass126 export at
`9bf9d95e0b4cca8669931e034222ede771be0f19`. The compiled-class tree SHA-256 is
`f7c9d1fef021ebb890a2740801e9fb6bafe1de27ffb0d04534a928d7e41fe205`;
the existing provenance records the hash algorithm and exact compiler options.
This comparison concerns the two readable Java exports, not assets, live servers,
platform devices or the browser/phone performance gates.

`B:owner.method(descriptor)#ordinal` rules and the opt-in `lexical-targets` policy
live in Deko's single current manifest. Original spellings remain in the reverse
dictionary, and exact restoration recovers all 303 pinned raw sources. The default
five-path audit is byte-identical to the previous frozen naming helper; independent
`--labels` and `--class-name-literals` flags add their own records.
