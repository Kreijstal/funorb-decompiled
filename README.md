# funorb-decompiled

Decompiled Java source for **FunOrb / AlterOrb** games.

This repository contains the reconstructed Java for 44 FunOrb/AlterOrb game
gamepacks, produced by a custom, **owned JavaScript decompiler** — not CFR,
Vineflower, or any other off-the-shelf tool. The decompiler is part of the
[java-tools](https://github.com/Kreijstal/java-tools) toolkit and was driven
over the obfuscated gamepacks by the pipeline in
[dekobloko-work](https://github.com/Kreijstal/dekobloko-work).

## What "obfuscated" means here

The original gamepacks were shipped obfuscated. Class, field, and method names
are single/short meaningless identifiers (`a`, `b`, `bl`, `client`, …). The
decompiler recovers **structure** (control flow, expressions, method bodies),
**not names**. So the code is readable as logic, but the identifiers carry no
semantic meaning. This is expected and is not something the decompiler tries to
"fix".

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

- **Dropped bitwise complement** in comparisons — the `~x` idiom
  (`iconst_m1; ixor`) is sometimes omitted, inverting a guard (e.g. `~n == -4`
  emitted as `n == -4`, never true). One instance stalls the recompiled
  `dekobloko` build at "Connecting to update server".
  ([#6](https://github.com/Kreijstal/dekobloko-work/issues/6),
  [#12](https://github.com/Kreijstal/dekobloko-work/issues/12))
- **ABI dictionary emission** — see above
  ([#11](https://github.com/Kreijstal/dekobloko-work/issues/11)).

These are being localized via the ABI-restore + bisection workflow above and
fixed in the decompiler; the sources here are regenerated as fixes land.

## Caveats

- This is **decompiler output**. It is not guaranteed to recompile cleanly with
  `javac`, and it is not intended to be a drop-in buildable project.
- The goal is faithful reconstruction of program structure for research and
  preservation, not pristine source.
- Some methods still carry runtime-behaviour bugs (see *Work in progress*
  above); recompiled output may not yet behave identically to the original.
- Names are obfuscated (see above).

## Games included

All **44** games are included — this is the full canonical roster, and every
one produced decompiled Java. Total: **18,321** `.java` files across 44 games.

| Game | `.java` files |
| --- | --- |
| 36cardtrick | 295 |
| aceofskies | 505 |
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
| stellarshard | 301 |
| sumoblitz | 546 |
| terraphoenix | 311 |
| tetralink | 355 |
| tombracer | 1050 |
| torchallenge | 300 |
| torquing | 396 |
| trackcontroller | 298 |
| transmogrify | 299 |
| vertigo2 | 437 |
| virogrid | 347 |
| voidhunters | 1530 |
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
