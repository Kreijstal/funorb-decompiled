# Why GeoBlox fell back, and what pass 8 recovers

Three of the five large methods hit the invariant-loop safeguard. It was
unnecessarily applied to the two handler-free gameplay methods. The generic
decompiler fix now keeps gameplay update, rendering and scene
transition as labeled Java loops. Sixteen original methods still use dispatchers;
three have at least 50 cases. Original transformed bytecode is unchanged.

## Result

| Method | Pass 6 cases | Pass 7 cases | Pass 8 cases |
| --- | ---: | ---: | ---: |
| `GameplaySession.updateSession`, `gh.a(I)V` | 252 | 107 | **0** |
| `GameplaySession.renderSession`, `gh.a(B)V` | 115 | 65 | **0** |
| `GameplaySession.updateSceneTransition`, `gh.b(B)V` | 42 | 27 | **0** |
| `GameplaySession.updateResultSequence`, `gh.f(I)V` | 43 | 27 | 27 |
| `GameScreen.updateScreen`, `c.h(B)V` | 117 | 58 | 58 |
| `kc.reconcileBoardEntities`, `kc.b(I)V` | 120 | 60 | 60 |
| Partitioned `wi.a(BLrh;)V` | 1,877 | 756 | 756 |
| All GeoBlox fallbacks | **3,051** | **1,330** | **1,131** |

The counts are numeric cases of generated `switch (statePc)` dispatchers,
including partition helpers, excluding application switches. Method-level sums
in [diagnostics](../decompilation/geoblox-decompiler-diagnostics.json) agree with
an independent javac Trees inventory. Generated methods containing dispatchers
fall from 41 to 36 to 33. The largest original method uses 18 helpers, down from
23 in pass 6; helpers are not counted as separate original fallback methods.
Generated methods with at least 50 cases fall from 31 to four to two.

Gameplay update shrinks from about 2,000 lines in pass 7 to 770; rendering drops
from 941 to 426. Labeled blocks and stack carriers remain, so these are still
decompiler reconstructions. Pass 8 changes one raw Java file, `gh.java`; all
303 original and renamed files compile.

## Why the safeguard fired

The `invariant conditional fanout carried across a CFG backedge` safeguard
recognizes consecutive tests of an invariant local at a loop latch. Combining
separately structured exception regions can join the wrong continuation or
lose a loop body, so the decompiler deliberately uses a dispatcher for that
shape. The guard previously also caught handler-free methods, which bypass
exception-region collapse and use the base CFG structurer directly.

The fix requires a nonempty effective exception table before applying this
specific guard. The base structurer preserves handler-free latches with labeled
loops, `break` and `continue`. Multi-value operand-stack safeguards,
synchronized-region rules and Java source-flow validation remain active.
If structured output fails validation, it still falls back.

The deobfuscator cannot simply assume the shared integer guard is zero:
`Geoblox.field_C` is written by `wh.java` when `ch.field_h` is set. The new
representation preserves both flag outcomes. It does not remove guard branches
by assuming a particular launch state.

## Why the remaining three stay

| Method | Refusal or constraint | Next structural work |
| --- | --- | --- |
| `GameScreen.updateScreen` | Invariant fanout with two effective exception-table rows | Prove loop exit/continuation identity through exception-region collapse, then lift the region. |
| `kc.reconcileBoardEntities` | Induced exception subgraph remains irreducible after controlled splitting | Use dominance-aware splitting of nested cycles, preserving handler entries and exact bytecode origins. |
| `wi.a(BLrh;)V` | 9,499 normalized code items trigger the generic oversized static-void partitioner | Recover bounded structured helpers; retain the 64 KiB compiled-method gate. |

For `kc`, the remaining non-dominating retreating edges correspond to bytecode
PCs 524→486, 529→449 and a cloned 449→454 edge. Running the same splitter again
returns no change. It handles secondary entries of maximal strongly connected
components, while this case exposes nested cycles. More identical retries
will not resolve it. A new splitter needs focused JVM comparisons and size
bounds before replacing the existing fallback.

The `wi` partition is a size decision even though its initial structurer reports
success. Removing its threshold alone does not establish that emitted Java fits
the classfile's method-size limit. Its 756 dispatcher cases remain spread across
18 bounded helpers; none of those helpers has 50 cases.

## What was tried and validated

Pass 7's straight-line coalescing alone removed 59 cases, from 3,051 to 2,992.
Proven single-entry branch nesting supplied most of the further reduction to
1,330. Entry/handler boundaries, shared joins, lexical binding and source-weight
limits remain proof conditions. Block comments retain original CFG IDs.
Full-line annotations initially failed the strict fallback-marker checker;
changing them to block comments preserved that checker.

Pass 8 first tested narrowing the fanout guard in an isolated experiment, then
added regression fixtures before changing the production guard. The four new
variants combine reversed latch conditions with absent/present exception
protection. Each runs 48 combinations of flag value, loop size and null/full/
short copy array against original verified JVM bytecode and both reconstructed
versions: 384 differential output/exception comparisons. Protected variants
retain dispatchers. Fixtures use classfile version 49, which verifies without
requiring assembler-generated StackMapTable frames; verification is enabled.

The relevant commands pass in java-tools:

```sh
node test/cfrInvariantFanout.test.js          # 4 differential tests
node test/cfrStateMachineReadability.test.js # 11 regression checks
node test/cfrFixtures.test.js               # 36 assertions
node test/cfrStructuredFeatures.test.js     # 26 assertions
node test/cfrAdditionalFeatures.test.js     # 77 assertions
node test/cfrStackOrdering.test.js          # 38 assertions
```

In this restricted environment these commands used the installed dependency
path. Stack-ordering subprocesses also used a temporary regular-file stdio
adapter; its test and production compiler source were unchanged. Fixture inputs
were built with the repository-native compiler; host javac previously produced
seven existing shape-test failures, also present with optimization disabled.
The external Krakatau suite was unavailable, not counted as validated.

The latest java-tools commit is `e2b82224d6bb50c6e376af24692481581f78baa0`.
Its [source SHA-256 and reproduction command](README.md) identify the decompiler
repository separately from game-source digests. Fresh `runCfr.js` emits all
303 sources with zero hard failures. The bundled readable generator verifies
both full compilable corpora, every binding and override relationship,
deterministic reproduction and exact dictionary-only reversal. Deque and
existing gameplay probes run for both original and renamed sources.
[validation.json](validation.json) records the commands and results.

All 642 names are retained. Eight named local ordinals move after synthetic
stack carriers disappear: six rendering locals and two theme-transition locals.
[The guarded migration](rules/geoblox-v8-migration.json) records each old/new
identity, original spelling and unchanged semantic evidence. Both declaration
audits and the corresponding formulas/uses were reviewed. All 227 named locals
remain unique by original spelling within their full original JVM method.
No generated Java was hand-edited.

These checks establish the focused fixture behavior and source-export integrity.
They do not establish whole-game equivalence, reconstruct multiplayer servers,
or satisfy browser memory, frame-rate or phone acceptance.
