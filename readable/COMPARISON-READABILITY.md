# GeoBlox pass 14 comparison readability

This report records an earlier pass. The current export is pass 15; see
[parallel-loop readability](PARALLEL-LOOP-READABILITY.md) for the remaining
dispatchers recovered and the current pins.

The renderer now removes the XOR-minus-one spelling of typed int/long
complements and their comparisons against same-width literal constants.
GeoBlox's fresh raw export changes 156 files. The previous source had 1,429
textual `^ -1` or `^ -1L` occurrences; the new source has none. This is a
source-occurrence count, not a count of independent methods or a proof of every
possible obfuscation being removed.

For example, the readable decoder changes:

```java
if (-1 != (characterCode ^ -1)) {
    if ((characterCode ^ -1) <= -129) {
        if ((characterCode ^ -1) > -161) {
```

to equivalent signed comparisons:

```java
if (characterCode != 0) {
    if (characterCode >= 128) {
        if (characterCode < 160) {
```

Tutorial conditions likewise show `tutorialStepId == 5` directly. The rewrite
preserves the original signed width, evaluation of calls and their exceptions.
It accepts only literal constants, not inferred values that could conceal
effects. Byte/short/char narrowing discards complement identity; narrowing a
complement before comparing is not the same operation as comparing its full
int value. Other XOR masks, booleans, floating-point operands and mismatched
widths are excluded. This enables only the complement rewrite; experimental
identity folding and interclass DCE remain opt-in.

Exception-region validation also binds every transfer to its own synthetic sink
and exact destination. A block shadowing a loop label cannot redirect an
explicit loop exit. These safeguards are inherited from the preceding
java-tools commit; they recover no additional dispatcher in this export.

## Reproduction identities

| Artifact | Identity |
| --- | --- |
| java-tools commit | `cee965649f1f2afaf1c7a3efd1fdb826231f3d30` |
| Decompiler repository source archive SHA-256 | `6b29811f82c01f461281f30e92945601f5056632fa8338afdd2106ad6f840bc7` |
| Raw source commit | `63115c1bcb703200f2caf4048d2e0b7671b6aeb8` |
| Raw Java tree SHA-256 | `8d838235da30d2e3ab0bfd2e79bf11900ff49f7fa0008b3c81d4554fac3bd168` |
| Readable Java tree SHA-256 | `d3e8f6e80c22928ce77269b774c9414e63d16516fcf1d67a8d6f399189bcbc4a` |

The first SHA-256 hashes `git archive --format=tar` of the tracked **decompiler
repository**, including its commit archive metadata. It is not a gamepack JAR
hash. Deko's transformer, the verified 303-class bytecode tree, the naming tool
and the compilation dependency remain at their previous pins.

Pass 13's complete 841-rule manifest and its original resource evidence remain
frozen. Pass 14 adds an input migration without changing any reviewed name.
All 841 original spelling guards and all 238 named-local declaration identities
match both full javac Trees audits. The historical and current loader source
are checked separately against their recorded resource evidence.

## Verification

In the java-tools checkout, with its dependencies available:

```sh
NODE_PATH=/home/kreijstal/git/java-tools/node_modules node test/cfrComplementComparisons.test.js
```

All three tests pass. The native fixture has 220 methods covering six comparison
operators, both operand orders, nine constants at each signed width, boundary
inputs and throwing calls. Narrowed complements, another mask and two effectful
operands are included. Original verified JVM execution matches both structured
and forced-dispatcher reconstruction in all 7,040 result/effect comparisons.
The additional-feature, stack-ordering and structured-feature regressions pass
77, 38 and 26 assertions respectively. A clean decompiler source archive
reproduces all 303 raw Java files and diagnostics byte for byte.

In this publication checkout:

```sh
node readable/build-geoblox-rules.mjs --check
node readable/tests/test-geoblox-rule-builder.mjs
node readable/tests/test-geoblox-text-rules.mjs
node readable/reproduce-geoblox.mjs --check
node readable/tools/restore-original.mjs readable/geoblox /tmp/geoblox-v14-restored
node readable/tests/test-geoblox-text.mjs /home/kreijstal/git/dekobloko-decompiled-pass/.work/games/geoblox/decompile-owned/out
JAVA_TOOL_OPTIONS=-XX:-UsePerfData node readable/tests/test-geoblox-gameplay.mjs
JAVA_TOOL_OPTIONS=-XX:-UsePerfData node readable/tests/test-geoblox-deque.mjs
```

The 16 lineage tests and eight resource-evidence tests pass. Both full 303-file
corpora compile; 154,256 bindings and 388 override relationships are preserved.
Generation retains 15,595 identifier edits. Regeneration is byte-identical and
dictionary-only reversal restores all 303 raw sources exactly. The scoped
text-decoder, slice, guard and early failure probes match the original unchanged
transformed bytecode as well as raw and renamed sources. Existing gameplay and
deque probes pass for raw and renamed sources.

Two original dispatcher methods still remain: `gh.f(I)V` has 27 cases and
`n.a(IIIIBIIII)[Ldm;` has 34. Many unknown identifiers remain, and successful
archive loading, full contact physics and asset-dependent gameplay transitions
are still outside the native probes. This pass proves the documented local
rewrites and reproducibility; it does not establish whole-game runtime
equivalence, full deobfuscation, or the separate JVM memory/FPS/phone targets.
