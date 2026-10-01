# GeoBlox dispatcher readability, pass 7

The new java-tools renderer keeps typed operand carriers and dispatcher fallbacks
but renders proven single-entry branches as `if` and `switch` bodies. Original
bytecode and the 642 reviewed names are unchanged. Ten raw Java files change;
all 303 original and renamed files compile. The input, tool revision, complete
diagnostics and source hashes are pinned separately.

## Measured result

| Method | Dispatcher cases in pass 6 | Pass 7 |
| --- | ---: | ---: |
| `GameplaySession.updateSession`, `gh.a(I)V` | 252 | 107 |
| `GameplaySession.renderSession`, `gh.a(B)V` | 115 | 65 |
| `GameplaySession.updateSceneTransition`, `gh.b(B)V` | 42 | 27 |
| `GameplaySession.updateResultSequence`, `gh.f(I)V` | 43 | 27 |
| `GameScreen.updateScreen`, `c.h(B)V` | 117 | 58 |
| `kc.reconcileBoardEntities`, `kc.b(I)V` | 120 | 60 |
| Partitioned `wi.a(BLrh;)V` | 1,877 | 756 |
| All GeoBlox fallbacks | **3,051** | **1,330** |

The totals count numeric cases of generated `switch (statePc)` dispatchers,
including partition helpers; nested application switches are excluded. The
method-level sums in [diagnostics](../decompilation/geoblox-decompiler-diagnostics.json)
agree with an independent javac Trees inventory. Nineteen original methods
still require fallback dispatchers. Generated methods containing dispatchers
fall from 41 to 36 because `wi` uses 18 partition helpers instead of 23.
Generated methods with at least 50 dispatcher cases fall from 31 to four.
Source line counts do not always shrink: preserved scopes and trace comments
also occupy lines. Gameplay update still spans about 2,000 lines.

## Proof conditions and failed approaches

Straight-line coalescing alone removed 59 cases (3,051 to 2,992), too small an
improvement for the large gameplay methods. Branch-region nesting supplies most
of the reduction. These are generic renderer changes, without game or method
name special cases and without changing executable bytecode.

A successor needs a proven single normal entry and the same ordered exception
handlers. Method/handler entries, shared joins and backedges remain explicit.
Parallel incoming edges are counted separately: duplicate switch targets must
not produce duplicated child bodies. Sibling scopes preserve repeated locals.
Before nesting, the owned Java AST proves the parent has no local declaration
that might capture a child's field/local reference. Unknown syntax refuses the
rewrite. Nesting depth and source-weight limits preserve bounded partition units.

The first annotations used full-line comments, which the strict fallback-marker
checker rejected. They were changed to block comments; that checker was not
weakened. A parent-local/child-field fixture and repeated-switch-target fixture
exercise cases where apparently harmless inlining could change behavior.
Native fixture classes must be built with the repository's compiler: host javac
produced seven pre-existing source-shape test failures, including resource
lowering and variable naming. The same failures occurred with optimization off;
building the intended native fixtures made all 36 assertions pass.

## Validation

The java-tools revision is `cc3be385def11a6ee0fa99a8bdb6fce77d3ad368`.
Its [source SHA-256 and reproduction command](README.md) identify the decompiler
repository, separately from game-source digests. Tests and renderer documentation
are included in that revision.

- `node test/cfrStateMachineReadability.test.js`: 11 checks pass. Enabled and
  disabled renderers run against known expected JVM results; a native-compiled
  original also agrees with both forced fallback variants. Coverage includes
  scopes, shared joins, loop/effect order, switch targets, handler boundaries,
  exceptions/finally, source budgets and partitioned-method diagnostics.
- `node test/cfrFixtures.test.js`: 36 assertions pass after the native fixture
  build documented in java-tools `docs/decompiler.md`.
- `node test/cfrStructuredFeatures.test.js`: 26 assertions pass.
- `node test/cfrAdditionalFeatures.test.js`: 77 assertions pass.
- `node test/cfrStackOrdering.test.js`: 38 assertions pass. A temporary
  regular-file stdio adapter allowed child JVM processes in the restricted
  environment; production/test source was unchanged.
- The external Krakatau obfuscation suite was skipped because its binary is
  unavailable. This is not counted as validated.
- Fresh GeoBlox `scripts/runCfr.js --fail-on-hard-failure`: 303 files, zero hard
  failures; complete output compiles with `javac --release 8 -proc:none`.
- The same bundled readable generator verifies both complete corpora, every
  binding and override relationship, deterministic reproduction and exact
  dictionary-only reversal. Game helper checks cover the existing deque and
  gameplay probes; [validation.json](validation.json) records the commands.

`rules/geoblox-v7-migration.json` pins both input digests and the previous
manifest hash. All 642 guarded identities match both declaration audits. Each
of the 227 named locals is uniquely identified by its original spelling within
its original full JVM method identity, before and after the renderer change.
No naming identity needed migration, and no generated Java was hand-edited.

## Remaining work

Shared joins and stack-carrying loops still obstruct full structuring. The next
pass should recover loop-carried value assignments and shared branch tails in
the owned CFG/Java AST, with differential JVM fixtures for each accepted shape.
It must preserve exception entries and lexical binding, and continue to refuse
shapes lacking proof. The large `wi` initializer also needs bounded helper
partitioning even after dispatcher reduction.

This improves offline source readability. It does not establish whole-game
runtime equivalence, reconstruct multiplayer servers, or satisfy the browser
memory, frame-rate and phone gates.
