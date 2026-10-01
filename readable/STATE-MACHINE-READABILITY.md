# Why GeoBlox fell back, and how pass 11 preserves its exits

Pass 9 kept explicit exception-region exit identities and refused unsafe
continuations. Pass 10 recovers nested cycles inside the board-entity protected
region with bounded, deterministic copies. `kc.reconcileBoardEntities` now uses
structured loops with its runtime catch intact. Three original methods retain
dispatchers; the oversized initializer is the only one with at least 50 cases.
Pass 11 removes large-method shortcuts that dropped exception handlers and
requires explicit loop exit targets. Dispatcher counts are unchanged.
Original transformed bytecode is unchanged.

## Result

| Method | Pass 6 cases | Pass 7 cases | Pass 8 cases | Pass 9 cases | Pass 10 cases |
| --- | ---: | ---: | ---: | ---: | ---: |
| `GameplaySession.updateSession`, `gh.a(I)V` | 252 | 107 | 0 | 0 | **0** |
| `GameplaySession.renderSession`, `gh.a(B)V` | 115 | 65 | 0 | 0 | **0** |
| `GameplaySession.updateSceneTransition`, `gh.b(B)V` | 42 | 27 | 0 | 0 | **0** |
| `GameplaySession.updateResultSequence`, `gh.f(I)V` | 43 | 27 | 27 | 27 | 27 |
| `GameScreen.updateScreen`, `c.h(B)V` | 117 | 58 | 58 | 0 | **0** |
| `kc.reconcileBoardEntities`, `kc.b(I)V` | 120 | 60 | 60 | 60 | **0** |
| Partitioned `wi.a(BLrh;)V` | 1,877 | 756 | 756 | 756 | 756 |
| All GeoBlox fallbacks | **3,051** | **1,330** | **1,131** | **877** | **817** |

These are numeric cases in generated `switch (statePc)` dispatchers, including
partition helpers, excluding application switches. Method-level diagnostics
agree with an independent javac Trees inventory. Generated methods containing
dispatchers fall from 41 to 36 to 33 to 21 to 20. The largest original method still
uses 18 helpers, down from 23 in pass 6. Generated methods with at least 50 cases
fall from 31 to four to two to one to zero; counting the partitioned initializer
as one original method gives one large remaining original method.

Pass 9 changes seven raw Java files: `c`, `ch`, `i`, `kc`, `lc`, `p` and `wh`.
Twelve original methods recover structured bodies. The screen update shrinks
from 951 to 380 lines. All 303 original and all 303 renamed sources compile.
Pass 10 changes only `kc.java`; its board-reconciliation method shrinks from
1,335 to 608 lines.
[The diagnostics](../decompilation/geoblox-decompiler-diagnostics.json) and
[provenance](../decompilation/geoblox-provenance.json) retain exact method
identities and the recovered-method list.

## Why the safeguard fired, and how exits are checked

An obfuscator splits one loop latch into consecutive tests of an invariant
local. Multiple latches inside a protected region give independently structured
components source-identical exit sinks. Losing their identities can join one
loop's continuation to another loop's body. The decompiler therefore used a
whole-method dispatcher for this shape. Pass 8 allowed handler-free methods to
use the base CFG structurer; pass 9 permits protected methods only after their
composed exception-region exit contracts verify.

Each sink now keeps its original working-CFG target ID and owning region ID.
The exit is an explicit labeled `break` even if the sink has no statements.
These IDs survive remapping, substitution and label uniquification. Verification
requires every enumerated target to remain present and each transfer to resolve
to its owning region block, rather than an unrelated loop. This checks exit
identity and lexical ownership, not complete program equivalence.

The printer previously interpreted an empty `if` arm inside a loop as an exit.
An ordinary empty arm can be a no-op, so that inference is removed. Cleanup now
returns fresh composite nodes; repeated printing cannot mutate an earlier
fall-through break into an apparent empty-arm exit.

Collapsing a region also mapped any internal continuation to its entry. A catch
that resumes after setup would run setup twice, and a normal transfer into a
handler could enter the wrong component. Those shapes now decline structured
recovery and retain the exact CFG fallback. Retry at the actual try entry
remains supported. Production exception regions use explicit labeled transfers.
Pass 11 requires the legacy `regionExit` shorthand to specify both its enclosing
loop label and `break`/`continue` mode; it cannot infer the nearest loop or become
a no-op. Exit contracts now reject missing identities and changed transfer kinds,
even if a valid sibling still retains the same target.

Multi-value operand-stack safeguards, synchronized-region rules, Java
source-flow checks and bounded method partitioning remain active. A failed
structured rendering still falls back. The shared integer guard cannot simply
be assumed zero: `Geoblox.field_C` is written by `wh` when `ch.field_h` is set.
Both outcomes remain represented.

## Recovering the nested board cycles

In pass 9, `kc` retained non-dominating retreating edges at bytecode PCs
524→486, 529→449 and a cloned 449→454 edge. More retries of the old splitter made
no change: it considered only maximal SCCs, whose outer cycle had a single
entry. Its one-block fallback copy still left three bad edges.

Pass 10 checks that a sole entry dominates its component, removes that header
from the induced search graph, then examines the nested SCCs. It copies a
multi-entry child for one secondary entry, rewiring internal edges to matching
copies and preserving all external exits. Every copy retains its original block
identity. Reachable predecessors and stable numeric ordering prevent dead edges
or traversal order from changing the entry choice. Explicit work stacks avoid
JavaScript recursion even for deep cycles.

Three region-copy operations add 18 blocks to the 119-block recorded board
subgraph, making it reducible. Every copy renders the same original instructions
and stays inside the same protected region. The new body preserves its runtime
catch, guard outcomes and entity traversals.

The default budget is 64 region-copy operations and at most
`min(8192, max(originalTerms * 4, originalTerms + 64))` terms. Explicit caller
budgets remain supported. Exhaustion returns no partial result; the decompiler
keeps the CFG fallback. The old unbudgeted single-block retry is removed. The
shared JVM SSA consumer retains its smaller caller-supplied cap.

## Why the oversized initializer stays

`wi.a(BLrh;)V` has 9,499 normalized code items and triggers the oversized
static-void partitioner. The next structural work is bounded structured helpers
that retain the 64 KiB compiled-method gate.

The `wi` partition is a size decision even though its initial structurer succeeds.
Removing that threshold does not establish that emitted Java fits the method
limit. Its 756 cases remain in 18 helpers; no helper has 50 cases. The other two
fallbacks, `gh.f(I)V` (27 cases) and `n.a(IIIIBIIII)[Ldm;` (34), keep multi-value
operand-stack safeguards.

## What was tried and validated

Pass 7's straight-line coalescing alone removed 59 cases, from 3,051 to 2,992.
Proven single-entry branch nesting supplied most of the reduction to 1,330.
Entry/handler boundaries, shared joins, lexical binding and source-weight limits
remain conditions. Block comments retain original CFG IDs. Full-line
annotations initially failed the strict fallback-marker checker; block comments
preserved that checker.

Pass 8 first narrowed the invariant guard in an isolated experiment, then added
four JVM fixture variants before changing production. The fixtures combined
reversed latch conditions and absent/present exception protection: 384
comparisons against original verified bytecode and both reconstructed versions.
At that stage protected variants retained dispatchers.

Pass 9 first bypassed the guard experimentally on protected-loop fixtures.
After that worked, the printer inference and internal-continuation redirection
were investigated, given explicit refusals/contracts, and tested before allowing
verified protected fanouts in production. The ten focused tests include eight
fanout variants: unprotected, one combined catch, separate catches with distinct
continuations, and two protected ranges around an unprotected return, each with
both latch polarities. Each compares 48 inputs against original JVM bytecode and
both structured and forced-dispatcher output: 768 comparisons. Original fixtures
use classfile version 49 with JVM verification enabled. Protected structured
outputs must retain their try/catch.

Two additional executable regressions check that an empty no-op branch keeps
all loop iterations, and that a catch resuming inside a try falls back without
repeating setup. Sixteen exception-structurer checks include wrong loop labels,
missing/unknown exit targets and unsafe internal reentry. Ten printer checks
include repeated, nonmutating rendering.

Pass 10 adds four graph checks and three verified JVM fixtures. The graph checks
cover deterministic nested recovery, input immutability, budget refusal, switch
and duplicate targets, unreachable predecessors and a 5,000-node cycle. Two
sets of 256 routed traces preserve their original block sequence. JVM fixtures
cover ordinary/reversed branches and a switch with repeated targets, comparing
140 flag/loop-limit/throw-point inputs against original bytecode and both
reconstructed versions: 840 comparisons. Side effects encode their order;
catch results must match, and structured output must contain no dispatcher.

The relevant commands pass in java-tools:

```sh
node test/cfrInvariantFanout.test.js # 10 tests, including 768 fanout comparisons
node test/exceptionRegionSplitting.test.js # 4 graph checks, 512 routed traces
node test/cfrNestedLoopSplitting.test.js # 3 JVM fixtures, 840 comparisons
node --test test/structurer.test.js test/exceptionStructurer.test.js test/cfrStateMachineReadability.test.js test/cfrFixtures.test.js test/cfrStructuredFeatures.test.js test/cfrAdditionalFeatures.test.js test/cfrStackOrdering.test.js test/cfrCatchSemanticsRegressions.test.js test/cfrInvariantFanout.test.js # all 9 files pass
```

The restricted environment uses the installed dependency path:
`NODE_PATH=/home/kreijstal/git/java-tools/node_modules`. The grouped command also
uses `NODE_OPTIONS=--require=/tmp/cfr-file-stdio.cjs`, an environment-only
regular-file subprocess adapter; production and existing test sources are
unchanged. Fixture inputs were built with the repository-native compiler.
Host javac previously caused seven existing shape-test failures, also present
with optimization disabled. The external Krakatau suite was unavailable and is
not counted as validated. The existing shared JVM SSA splitting test also passes
all 14 assertions when selected unchanged by a temporary tape filter. Its
generated JRE index was rebuilt first.

Fresh `runCfr.js` emits all 303 sources with zero hard failures. The frozen naming
generator compiles both corpora and checks every binding and override edge,
deterministic reproduction and exact dictionary-only reversal. Deque and
gameplay helper probes run against both original and renamed sources.
[validation.json](validation.json) records the commands and results.

All 642 names remain. Pass 8's eight local-ordinal moves and pass 9's unchanged
identities remain in their frozen manifests. Pass 10's
[reviewed migration](rules/geoblox-v10-migration.json) moves thirteen
board-reconciliation local ordinals down by 21 after dispatcher-only carriers
disappear. Each retains its type, original spelling, full JVM method and
unchanged semantic evidence. All 227 named locals remain unique within their
original methods. No generated Java was hand-edited. The exact decompiler commit
and source SHA-256 are in [README.md](README.md), separate from game hashes.

These checks establish focused fixture behavior and export integrity. They do
not establish whole-game equivalence, reproduce multiplayer servers, or satisfy
browser memory, frame-rate or phone acceptance.

## Pass 11: safe exits across fallback paths

Three large-method shortcuts could discard exception semantics after structured
reconstruction failed: retry with a normal-only CFG, omit dispatcher handlers,
or render normal-only control flow after Java source-flow validation failed.
Those shortcuts are removed. Method size cannot prove catch behavior redundant.
The fallback preserves the exception table; bounded helpers remain available for
supported oversized shapes. Unsupported shapes must fail rather than silently
lose protected transfers.

A verified JVM regression exposed the bug using a catch that retries after
setup. The original returned `1,1`; adding 1,100 no-ops caused the old rebuilt
method to return `NullPointerException,1`, in both automatic and forced-dispatch
modes. All four small/large and automatic/forced combinations now match the
original. Protected fanout and nested-cycle differential fixtures still pass.
The printer also rejects unspecified loop targets and preserves explicit exits
to an outer loop across inner loops. The contract verifier rejects missing owner
or destination metadata and changed transfer kinds.

All 303 GeoBlox sources were freshly exported and compiled. The only raw-source
changes remove six unused `caughtException` declarations across `c`, `wh` and
`vl`; no method newly switches to a dispatcher. All 642 spelling guards and all
227 named-local identities remain unchanged in the
[reviewed pass-11 migration](rules/geoblox-v11-migration.json). The binding audit
now covers 156,445 bindings and 388 override relationships. A clean checkout of
the pinned decompiler reproduces all source and diagnostic bytes.

```sh
NODE_PATH=/home/kreijstal/git/java-tools/node_modules node --test test/structurer.test.js test/exceptionStructurer.test.js test/cfrInvariantFanout.test.js test/cfrNestedLoopSplitting.test.js # 4 files pass
NODE_PATH=/home/kreijstal/git/java-tools/node_modules NODE_OPTIONS=--require=/tmp/cfr-file-stdio.cjs node --test test/cfrStateMachineReadability.test.js test/cfrFixtures.test.js test/cfrStructuredFeatures.test.js test/cfrAdditionalFeatures.test.js test/cfrStackOrdering.test.js test/cfrCatchSemanticsRegressions.test.js # 6 files pass
node readable/tests/test-geoblox-rule-builder.mjs # 10 checks pass
node readable/reproduce-geoblox.mjs --check # exact regeneration, both corpora compile
```

The frozen naming tool is unchanged. Deque and gameplay helper probes pass for
both source variants, and dictionary-only reversal restores all 303 originals
byte for byte. Earlier region-splitting and JIT checks above are retained results
from pass 10, not fresh runs in this pass. These checks do not establish whole-game
behavior or browser memory/FPS/phone acceptance.
