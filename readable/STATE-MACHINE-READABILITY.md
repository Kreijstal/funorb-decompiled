# Why GeoBlox fell back, and what pass 9 recovers

Exception-region exits now keep explicit target and owner identities through
composition. The decompiler no longer infers a loop break from an empty ordinary
branch, and it refuses a catch continuation that would restart the wrong part
of a region. `GameScreen.updateScreen` now uses structured Java with its runtime
catch intact. Four original methods retain dispatchers; two have at least 50
cases. Original transformed bytecode is unchanged.

## Result

| Method | Pass 6 cases | Pass 7 cases | Pass 8 cases | Pass 9 cases |
| --- | ---: | ---: | ---: | ---: |
| `GameplaySession.updateSession`, `gh.a(I)V` | 252 | 107 | 0 | **0** |
| `GameplaySession.renderSession`, `gh.a(B)V` | 115 | 65 | 0 | **0** |
| `GameplaySession.updateSceneTransition`, `gh.b(B)V` | 42 | 27 | 0 | **0** |
| `GameplaySession.updateResultSequence`, `gh.f(I)V` | 43 | 27 | 27 | 27 |
| `GameScreen.updateScreen`, `c.h(B)V` | 117 | 58 | 58 | **0** |
| `kc.reconcileBoardEntities`, `kc.b(I)V` | 120 | 60 | 60 | 60 |
| Partitioned `wi.a(BLrh;)V` | 1,877 | 756 | 756 | 756 |
| All GeoBlox fallbacks | **3,051** | **1,330** | **1,131** | **877** |

These are numeric cases in generated `switch (statePc)` dispatchers, including
partition helpers, excluding application switches. Method-level diagnostics
agree with an independent javac Trees inventory. Generated methods containing
dispatchers fall from 41 to 36 to 33 to 21. The largest original method still
uses 18 helpers, down from 23 in pass 6. Generated methods with at least 50 cases
fall from 31 to four to two to one; counting the partitioned initializer as one
original method gives two large remaining original methods.

Pass 9 changes seven raw Java files: `c`, `ch`, `i`, `kc`, `lc`, `p` and `wh`.
Twelve original methods recover structured bodies. The screen update shrinks
from 951 to 380 lines. All 303 original and all 303 renamed sources compile.
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
remains supported. Production exception regions use explicit labeled transfers;
the legacy `regionExit` shorthand is not their representation.

Multi-value operand-stack safeguards, synchronized-region rules, Java
source-flow checks and bounded method partitioning remain active. A failed
structured rendering still falls back. The shared integer guard cannot simply
be assumed zero: `Geoblox.field_C` is written by `wh` when `ch.field_h` is set.
Both outcomes remain represented.

## Why the remaining two large methods stay

| Method | Constraint | Next structural work |
| --- | --- | --- |
| `kc.reconcileBoardEntities` | Induced exception subgraph remains irreducible after controlled splitting | Dominance-aware splitting of nested cycles, preserving handler entries and bytecode origins. |
| `wi.a(BLrh;)V` | 9,499 normalized code items trigger the oversized static-void partitioner | Bounded structured helpers, retaining the 64 KiB compiled-method gate. |

For `kc`, non-dominating retreating edges correspond to bytecode PCs 524→486,
529→449 and a cloned 449→454 edge. Repeating the existing splitter makes no
change: it handles secondary entries of maximal strongly connected components,
while this case exposes nested cycles. More identical retries will not resolve
it. A new splitter needs focused JVM comparisons and size bounds.

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

The relevant commands pass in java-tools:

```sh
node test/cfrInvariantFanout.test.js # 10 tests, including 768 fanout comparisons
node --test test/structurer.test.js test/exceptionStructurer.test.js test/cfrStateMachineReadability.test.js test/cfrFixtures.test.js test/cfrStructuredFeatures.test.js test/cfrAdditionalFeatures.test.js test/cfrStackOrdering.test.js test/cfrCatchSemanticsRegressions.test.js # all 8 files pass
```

The restricted environment uses the installed dependency path:
`NODE_PATH=/home/kreijstal/git/java-tools/node_modules`. The grouped command also
uses `NODE_OPTIONS=--require=/tmp/cfr-file-stdio.cjs`, an environment-only
regular-file subprocess adapter; production and existing test sources are
unchanged. Fixture inputs were built with the repository-native compiler.
Host javac previously caused seven existing shape-test failures, also present
with optimization disabled. The external Krakatau suite was unavailable and is
not counted as validated.

Fresh `runCfr.js` emits all 303 sources with zero hard failures. The frozen naming
generator compiles both corpora and checks every binding and override edge,
deterministic reproduction and exact dictionary-only reversal. Deque and
gameplay helper probes run against both original and renamed sources.
[validation.json](validation.json) records the commands and results.

All 642 names remain. Pass 8's eight local-ordinal moves stay in its retained
migration; pass 9's [reviewed migration](rules/geoblox-v9-migration.json) confirms
all 227 named local declaration identities are unchanged. Every name matches its
original spelling guard. No generated Java was hand-edited. The exact decompiler
commit and source SHA-256 are in [README.md](README.md), separate from game hashes.

These checks establish focused fixture behavior and export integrity. They do
not establish whole-game equivalence, reproduce multiplayer servers, or satisfy
browser memory, frame-rate or phone acceptance.
