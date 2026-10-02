# GeoBlox pass 20: native comparison and scoring behavior

Pass 20 retains all 972 reviewed names and corrects ten source files through
the pinned generic decompiler. The gameplay probe found that native `fcmpl`
keeps a popup with NaN progress active, while the previous readable branch
credited its points. The corrected branch preserves that behavior:

```java
if (!(popup.progress >= 1.0f)) {
    // Advance its animation, including an unordered progress value.
} else {
    // Credit points and return the popup to its available queue.
}
```

The renderer retains the exact JVM comparison opcode. Low-NaN variants return
-1 on unordered operands; high-NaN variants return +1. Their direct branches and
logical complements now match those integer results. Stored comparison results
use a primitive helper to evaluate the left and right operands once in order,
including when either operand throws. `ch.java` gains one long-comparison
helper instead of repeating its volatile/time expressions in a ternary.

All 75,000 generic native comparisons pass for default and forced-dispatcher
output compiled with Java 8 settings. They cover all five compare opcodes and
six unary branches, inverted returns, nested/materialized booleans, stored
results, arithmetic, arguments, duplication, operand failure/identity, helper
name collisions and Java 8 interfaces. Float/double inputs include distinct
NaNs, signed zeros, infinities, subnormal values and finite extremes; the long
control includes signed extrema. The prior generator fails those regressions.

The latest generator also retains the preceding safer loop-exit catch routing:
shadowed sibling catches refuse reconstruction rather than gain coverage over
the earlier handler. All 6,816 native exception-loop comparisons remain covered
by the committed generic fixtures; GeoBlox still has zero dispatchers.

## Source and naming audit

The unchanged 303 verified transformed classes are re-exported from decompiler
commit `e6dd72c89fa7f51cc34cd78d08cf5c6227799126`. A clean Git source archive reproduces all 303 raw
files and diagnostics byte-for-byte. Ten Java files change: `ab`, `cf`, `ch`,
`hl`, `jg`, `oc`, `qb`, `rh`, `ue` and `vd`.

All 21,182 previous source declarations retain their identity and spelling.
Only `M:ch.$cfr$lcmp(JJ)I` and its two parameters are added. All 972 naming
guards, 255 named local identities and 388 override edges remain unchanged.
The before/after javac audits record 21,185 declarations and 132,932 references;
readable generation compares all 154,117 bindings. Identifier-only generation
performs 16,604 edits, compiles both complete corpora and preserves all overrides.
Dictionary-only reversal recovers every corrected raw source byte.

`rules/geoblox-v19.json` freezes the previous complete naming manifest. The
builder reconstructs every retained pass through 19 before producing 20.
The pass-20 migration records both source inputs, source hashes for all ten
changed files, audit digests, the exact three added declarations, source/tool
pins and unchanged naming counts. It borrows the unchanged pass-15 text evidence
by its digest. Result evidence remains frozen at pass 18; a guarded update links
`jg.java`'s old reviewed hash to its corrected current source hash. Every other
result evidence source remains byte-identical.

The wrapper checks old and current source bytes from their actual Git commits,
then checks the historical result evidence or its linked update. A self-consistent
migration digest cannot bypass those source checks. The builder's 36 checks and
the wrapper's five groups / 11 refusal scenarios pass; refusals produce no
partial readable export. All eight text evidence checks pass.

## Gameplay proof

The new `readable/tests/test-geoblox-match-scoring.mjs` probe verifies its
native 303-class input hash, compiles the raw and renamed Java, and compares
native/raw/readable traces. An independent Java oracle checks matching, score/counter totals and capped
text writes in addition to those differential traces. The native text writer
overwrites a prefix without shortening an existing builder; shorter capped
writes retain old trailing characters. The oracle preserves that behavior.

Its 708 controlled scenarios include connected triples, category/variant
matches, complete/star/path neighborhoods, duplicate suppression, cooldown
blocking, popup pool exhaustion, chain scoring, tutorial behavior, stored
integer overflow and display caps, pending-point flush gates and popup crediting
at progress boundaries including NaN and infinity. It advances 55,728 ticks per
variant and records queue identity/order, score data, match counters, popup
metadata and audio registrations. The native/raw/readable SHA-256 is
`222f18c6366fdab862f1d5d70980cb0a6f32b3adb6eba308c08846a473bac16a`.

```sh
node readable/build-geoblox-rules.mjs --check
node readable/reproduce-geoblox.mjs --check
JAVA_TOOL_OPTIONS=-XX:-UsePerfData node readable/tests/test-geoblox-match-scoring.mjs VERIFIED_TRANSFORMED_CLASSES
JAVA_TOOL_OPTIONS=-XX:-UsePerfData node readable/tests/test-geoblox-result-sequence.mjs VERIFIED_TRANSFORMED_CLASSES
JAVA_TOOL_OPTIONS=-XX:-UsePerfData node readable/tests/test-geoblox-result-helpers.mjs VERIFIED_TRANSFORMED_CLASSES
```

The earlier result sequence still matches native execution for 27 scenarios
and 26,043 ticks per variant; the helper probe retains its native selector,
PCM metadata, position-bound and music early-return checks. Detailed commands,
counts and limits are recorded in `validation.json`.

Asset-dependent entity/session constructors are bypassed. The new probe drives
matching/scoring with controlled neighborhoods; it does not run full contact
physics, boundary-loss detection, new unlock delivery or audible PCM playback.
It fixes and verifies these source paths rather than establish whole-game
runtime equivalence. Unknown names and shared joins remain; a subsequent gameplay
naming pass can now use this native scoring evidence. FPS/heap/phone acceptance
and the other 43 games are outside this refresh.

## Decompiler source SHA-256

The tracked java-tools repository source archive has SHA-256
`6337fa96b5d83ef24ee2bf20c7e48ea5e0844482f6262e774d73fba6101d4912`.

```sh
git archive --format=tar e6dd72c89fa7f51cc34cd78d08cf5c6227799126 | sha256sum
```

This identifies the **decompiler source**, including Git archive metadata, not a
game JAR. It is separate from the raw-source tree `07610c2d655bf96e59584f07be867c62e47cf3b3c484063504d9958443e89da2` and readable tree
`601aa49ecba2b3878d94c51cd8a1f6a6ba2e229837017eaadcb69ede1050b61a`. The complete local history is retained in
`java-tools-floating-comparisons.bundle`; publication is not claimed pushed
while GitHub DNS resolution fails.
