# GeoBlox pass 17: preserve negation without mutating sprite pivots

The full result-sequence probe exposed a behavioral error in the readable input.
The native bytecode completed 27 controlled scenarios over 26,043 ticks; the raw
Java completed them over 26,041 ticks. The first pixel-buffer difference was
scenario 15. Scenario 16 calculated radius 27 instead of native radius 26,
giving completion offset 807 instead of 809. Compilation, zero dispatchers and
the earlier focused helper probes had not caught this error.

The sprite transform printed a double numeric negation as Java pre-decrement:

```java
// Previous output: mutates sourcePivotX.
corner0Y = --sourcePivotX * scaledSin + -sourcePivotY * scaledCos;

// Corrected output: two negations, with no argument mutation.
corner0Y = -(-sourcePivotX) * scaledSin + -sourcePivotY * scaledCos;
```

The generic java-tools renderer now parenthesizes a negated operand beginning
with a minus sign. This also handles negative literals, whose atomic precedence
otherwise permits invalid expressions such as `--7`. It preserves evaluation
instead of folding negations or introducing special game patches.

## Exact inputs and preserved names

The fix is in java-tools commit `c739b6ca232040f7a7970b704214adbed573d10c`.
The raw export is pinned at `b140d3584574ef276694b8ad453cd05303b82c5d`.
It changes only six expressions in two files: `dm.java` and `il.java`. The
original and transformed bytecode inputs, Deko commit, naming tool and stubs
are unchanged. A clean decompiler source archive reproduces every source and
the diagnostics exactly. All 303 sources compile with zero hard failures and
zero dispatchers.

All 21,181 declaration identities and original spellings are unchanged,
including all 926 reviewed naming rules and 248 named locals. All 388 override
relationships remain identical. The pass-16 rules remain frozen in
[geoblox-v16.json](https://github.com/Kreijstal/funorb-decompiled/blob/29baf97271daba9862060eece24bc6e4cb0b11c0/readable/rules/geoblox-v16.json). The reviewed
[pass-17 migration](https://github.com/Kreijstal/funorb-decompiled/blob/29baf97271daba9862060eece24bc6e4cb0b11c0/readable/rules/geoblox-v17-migration.json) guards the old rules and
input, new source and generator identities, unchanged declarations, the exact
two changed files and the existing text-resource evidence. No names are added
or reinterpreted in this pass; no generated Java body is edited by hand.

| Identity | SHA-256 |
| --- | --- |
| Decompiler repository source archive | `34f9012d4ba040344178d1a249469d9f5f8e25b015153f12335529b1feddfec5` |
| Raw Java tree | `21fdcc2b2150a6a7ce1bc46a14baaa3ecc2c15580495f5f0f1ec620be5de4d2e` |
| Readable Java tree | `f48cde3a85458a31789af979c727e10945a87f4ebde3502b69f97237ff58ecd0` |

The first digest identifies the tracked **decompiler source**, not the gamepack
or either Java export. Recreate it with:

```sh
git archive --format=tar c739b6ca232040f7a7970b704214adbed573d10c | sha256sum
```

## Native result-sequence comparison

The new [result-sequence probe](tests/test-geoblox-result-sequence.mjs) calls the
actual `gh.f(I)V` / `GameplaySession.updateResultSequence` through completion.
Its 27 scenarios combine zero, one or three attached entities; centred entities,
transparent sprites or nontransparent pixel patterns; and three sprite angles.
It compares every tick's phase, radius, countdown, bonus points, transition
flags, panel position and related session fields, plus audio-registration queue
counts, popup pool/active counts and all three fixtures' popup state. It checks
the initial sprite-buffer digest and restoration of the display raster, every
phase 2 through 5, final popup creation and the animation-tick reset.

Native, raw and readable variants each complete 26,043 ticks and match byte for
byte. The common output SHA-256 is
`7b5891a65a952e19dbf395fb064530df9386712028f2a90eaf2afa5fa22dbb18`.
The native class-tree pin is verified before execution. The recorded native
digest remains mandatory when the optional native path is omitted.

```sh
JAVA_TOOL_OPTIONS=-XX:-UsePerfData node readable/tests/test-geoblox-result-sequence.mjs VERIFIED_TRANSFORMED_CLASSES
node readable/build-geoblox-rules.mjs --check
node readable/tests/test-geoblox-rule-builder.mjs
node readable/tests/test-geoblox-text-rules.mjs
node readable/reproduce-geoblox.mjs --check
node readable/tools/restore-original.mjs readable/geoblox /tmp/geoblox-v17-restored
```

This is controlled method execution, not a whole game launch. Session, entity
and display instances bypass asset-dependent constructors; real sprites,
deques, popup objects, PCM samples and a mixer use their constructors. The
client guard is zero and the method guard is 10. The transition flag initially
bypasses boundary-loss detection, then is cleared after the first tick. Music
selection receives a null track, actions are already unlocked, and a long
ambient countdown keeps unrelated animation out of the fixtures. PCM streams
are registered but no audio device advances or plays them. Successful asset
loading, the boundary-loss/cascade path, new-action delivery, nonzero client
flags and full-game behavior remain outside this probe.

## Generic regression and publication checks

`node test/cfrNumericNegation.test.js` provides 274 native comparisons, across
ordinary and forced-dispatcher output. It covers all four numeric JVM types,
two to four negations, integer limits, signed zero, subnormals, infinities, NaN
payloads, reuse of the original input, negative literals, actual decrement and
normal/throwing call effects. The 7,040 complement comparisons, 6,650 parallel
operand comparisons, 504 exception-loop comparisons and 38 stack-ordering
assertions also pass.

The publication rule builder has 27 tests and text-resource evidence has eight.
Both full source corpora compile, all 154,109 bindings and 388 overrides are
preserved, and dictionary-only reversal restores all 303 corrected raw files
exactly. See [validation.json](https://github.com/Kreijstal/funorb-decompiled/blob/29baf97271daba9862060eece24bc6e4cb0b11c0/readable/validation.json) for commands and scope.
Unknown names and shared joins remain; this pass does not establish complete
readability or whole-game runtime equivalence.
