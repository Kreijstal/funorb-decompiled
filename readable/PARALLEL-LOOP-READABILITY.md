# GeoBlox pass 15: operand-stack loops without dispatchers

The last two GeoBlox dispatchers came from a blanket safeguard for loop
backedges carrying multiple operand-stack values. The CFG renderer already had
typed stack carriers and could preserve their edges, but removing the safeguard
exposed two independent correctness problems. This pass fixes them before
reconstructing the loops.

| Original JVM method | Readable role | Lines before → after | Cases before → after |
| --- | --- | --- | --- |
| `gh.f(I)V` | `GameplaySession.updateResultSequence` | 364 → 167 | 27 → 0 |
| `n.a(IIIIBIIII)[Ldm;` | Build nine border/background sprites | 441 → 235 | 34 → 0 |

The whole export now has zero dispatcher methods and zero dispatcher cases.
Ten of the 303 raw files change. Ordinary labeled loops and shared joins remain;
eliminating a dispatcher does not supply semantic names for unknown identifiers.

## What failed and what changed

The legacy range recognizer discarded permutations carried around a loop. A
small integer `swap` fixture returned the same operand order regardless of the
iteration count. Loops containing stack permutations now select the owned CFG
renderer, including a switch that supplies the only backedge.

That renderer initially emitted sequential assignments for a parallel copy:

```java
left = right;
right = left; // the old left value is already lost
```

The renderer now captures overlapping outgoing operands before writing their
destination carriers. It also captures consumed branch conditions and switch
selectors when they read a carrier being overwritten. Copies retain operand
order, category-2 values and reference identity.

A first snapshot fix still forwarded pre-copy expressions into a
single-predecessor successor. The conditional-swap fixture returned the wrong
operand order. The cached outgoing values now describe the post-copy carriers.
An additional switch-only fixture then produced references to carriers that
cleanup had deleted: a successor was forwarding its own carrier away. That
self-forwarding is refused, and cyclic aliases retain their declarations and
stores. These failures are retained as native differential regressions.

The earlier exception-region safety checks remain active. They preserve exact
sink/destination/owner identities, compare source normal-flow edges before
splitting and after composition, and check every controlled copy and the outer
selector routing. Java switch fallthrough is modeled explicitly. Unsupported
shapes keep the existing CFG fallback; size, synchronized and source-flow gates
remain in place.

## Reproduction and reviewed names

The original gamepack and verified transformed bytecode are unchanged. The
decompiler revision is `e3268884ffc81e43bc60694439a297603b68a2e4`; its tracked
repository source archive SHA-256 is
`98369c043d012743adb1924409bb754781722f4c2d6c7c7ab082cce5a82aeb20`.
This is the decompiler source identity, separate from the game-source hashes.

The raw GeoBlox source is pinned at
`3c6a8e65d4796deb631ed67773b67ef92501cbd9`. A clean decompiler source archive
reproduces all 303 Java files and the diagnostics byte for byte. Both raw and
readable source sets compile with the frozen FunOrb stubs. The same
`reproduce-geoblox.mjs` command generates the publication and checks it; no
generated Java body is edited manually.

All 841 spelling guards match both javac declaration audits. Ten named locals
in `gh.f(I)V` move by four declaration ordinals after dispatcher scaffolding
disappears. Their source types, original spellings, full JVM method identities,
readable names and evidence remain unchanged. The other 228 named locals keep
their identities. The complete pass-14 rules and its migration remain frozen;
the pass-15 migration records the moves. All 152 text-resource bindings and the
loader source remain unchanged. Dictionary-only reversal restores every raw
source file exactly.

## Validation and limits

These focused commands pass in the pinned java-tools checkout (with
`NODE_PATH` pointing to its installed dependencies):

```sh
node test/cfrParallelBackedges.test.js       # 12 tests, 6,650 native comparisons
node test/cfrStackOrdering.test.js           # 38 assertions
node test/cfrComplementComparisons.test.js   # 7,040 native comparisons
node test/cfrExceptionLoopExits.test.js      # 504 native comparisons
```

Permutation fixtures cover int, long, references, consumed conditions and
selectors, and a switch-only backedge. Comparison fixtures cover ordinary,
reversed and switch predicates with and without exception protection, nonzero
flags, array failures, call order and catch effects. Original and rebuilt
classes run with the JVM verifier enabled.

From this publication checkout:

```sh
node readable/build-geoblox-rules.mjs --check
node readable/tests/test-geoblox-rule-builder.mjs
node readable/tests/test-geoblox-text-rules.mjs
node readable/reproduce-geoblox.mjs --check
node readable/tools/restore-original.mjs readable/geoblox UNUSED_OUTPUT
node readable/tests/test-geoblox-nine-slice.mjs VERIFIED_TRANSFORMED_CLASSES
node readable/tests/test-geoblox-deque.mjs
node readable/tests/test-geoblox-gameplay.mjs
node readable/tests/test-geoblox-text.mjs VERIFIED_TRANSFORMED_CLASSES
```

The nine-slice test checks the actual `n.a` method against the unchanged,
SHA-256-verified transformed bytecode over 2,592 cases. It records every sprite's
dimensions and SHA-256 of every pixel buffer, exception class, and resource/queue
cleanup effects. The recorded native output SHA-256 is
`16c92de1c3230786836344a4848c7046488b9cfa4a48078ca34024fdcbdc7be9`.
Both raw and renamed output must match it, even when the native input is omitted.

The existing scoped gameplay, deque and text probes are rerun. These checks do
not establish complete successful archive loading, full `gh.f` result-sequence
execution, whole-game equivalence, or browser/phone performance. Unknown names,
opaque guard arguments and shared control-flow joins still need further review.
