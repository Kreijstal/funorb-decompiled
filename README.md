# funorb-decompiled

Decompiled Java source for **FunOrb / AlterOrb** games.

This repository contains the reconstructed Java for 44 FunOrb/AlterOrb game
gamepacks, produced by a custom, **owned JavaScript decompiler** — not CFR,
Vineflower, or any other off-the-shelf tool. The decompiler is part of the
[java-tools](https://github.com/Kreijstal/java-tools) toolkit and was driven
over the obfuscated gamepacks by the pipeline in
[dekobloko-work](https://github.com/Kreijstal/dekobloko-work).

## What changed in this regeneration

The 2026-07-18 regeneration updates all 44 games with the latest owned
decompiler output. The main readability changes are interclass constant-argument
specialization, integer/long constant folding, removal of constant branches and
unreachable blocks, optional compaction of proven-dead trailing parameters, and
removal of checked catches whose try body cannot declare the caught exception.
Signature changes are recorded per game in `signature-map.json`. The detailed
proof rules, safety boundaries, and Java/bytecode examples are documented below.

The generator also fixes source emission that could select the wrong Java
overload after decompilation (notably character values appended to strings).
That correction is required for decompiled-and-recompiled games to preserve
their displayed text.

## What "obfuscated" means here

The original gamepacks were shipped obfuscated. Class, field, and method names
are single/short meaningless identifiers (`a`, `b`, `bl`, `client`, …). The
decompiler recovers **structure** (control flow, expressions, method bodies),
**not names**. So the code is readable as logic, but the identifiers carry no
semantic meaning. This is expected and is not something the decompiler tries to
"fix".

## Constant-expression cleanup

This snapshot was generated with dekobloko-work's gated
`--experimental-interclass-dce` mode. Before Java is emitted, the pipeline
uses CFG stack analysis to specialize any read-only integer-like parameter when
every reachable direct call supplies the same constant. It repeats
specialization, constant folding, branch DCE, and unreachable-code removal to a
bounded fixed point, allowing a dead dummy call to expose constant arguments in
its callees. Parameters written with either a store or `iinc` are excluded.
As a separately gated closed-world cleanup, a contiguous trailing run of those
specialized parameters is also removed from private or internal static method
descriptors and from every proven direct call. Each game's
`signature-map.json` is the dictionary from old signatures to new signatures;
it records removed parameter indexes, types, constant values, and the analysis
iteration that proved them. It also lists inherited call-site owner aliases,
which are resolved against the complete gamepack hierarchy. This deliberately improves internal source APIs
rather than preserving the original gamepack ABI.
Virtual and interface method families are not compacted in this snapshot. An
internal interface would need a family-wide proof that the parameter is dead in
the interface declaration and every implementation, followed by a coordinated
rewrite of every implementation and every `invokeinterface`/`invokevirtual`
call. If one implementation uses it, or the family is reachable through a
public, platform, or callback API, its signatures must remain unchanged.
The local evaluator also folds side-effect-free `int` and `long` literal
arithmetic, conversions, comparisons, and JVM-masked shift counts. It removes neutral operations
such as `x + 0`, `x ^ 0`, and `x * 1`, combines adjacent additive constants,
and deletes branches whose conditions become literal constants. In the emitted
source, the bytecode idiom `x ^ -1` is written as the equivalent `~x`; when it
is compared with a constant, the bound is complemented and a signed inequality
is reversed as required.

The evaluator deliberately does not reassociate floating-point or string
expressions, suppress integer division/remainder by zero, or fold across an
alternate control-flow entry. Integer overflow and shift distances follow JVM
semantics. Interclass argument specialization is limited to gamepack-internal
methods for which every direct caller supplies the same literal; public applet,
platform callback, networking, OS, reflection/native, and otherwise external
entry points remain open. The feature is gated in the generating pipeline so a
runtime A/B build can disable it if later experimentation finds a bad
closed-world assumption.

This snapshot also enables the independently gated checked-catch cleanup
(`PIPELINE_EXPERIMENTAL_UNTHROWABLE_CATCH_DCE=1`). After control-flow
reconstruction, a catch of a specific checked type is retained only when the
emitted try contains a call whose Java declaration throws that type. Otherwise
both the catch and the decompiler's synthetic `if (false)` reachability throw
are removed. Broad `Throwable`, `Exception`,
`RuntimeException`, and `Error` catches remain conservative because ordinary
JVM instructions can produce them. This is a source-readability policy: it does
not preserve a specific checked exception propagated by bytecode when no
source-visible `throws` declaration supports it, and is gated so runtime A/B
testing can disable it if that closed-world choice proves wrong.

## Deobfuscation guide

The pipeline works primarily on classfile instructions before Java is printed.
The examples below use Krakatau-style `.j` notation; constant-pool spelling can
vary, but the stack operations and descriptors are the same. “Implemented”
means the transform was available to the pipeline that generated this
repository. Stronger experimental transforms remain gated as noted.

| Area | Snapshot status | Main safety condition |
| --- | --- | --- |
| Literal constant evaluation | Implemented | JVM integer/long semantics; do not remove observable exceptions |
| Constant-branch and unreachable-code DCE | Implemented | CFG reachability and incoming-edge checks |
| Interclass constant-argument specialization | Implemented, gated | Complete gamepack; every resolved direct caller agrees |
| Private/internal-static signature compaction | Implemented, separately gated | Trailing dead parameters; all inherited owner aliases rewritten |
| Virtual/interface family compaction | Not implemented | Would require one proof and rewrite across the whole family |
| Checked-catch cleanup | Implemented, separately gated | Specific checked type is not declared throwable by the emitted try |
| Control-flow and stack-shape normalization | Implemented | Stack effects, labels, exception ranges, and verifier guards agree |

### Literal evaluation and branch DCE

The local evaluator folds side-effect-free literal expressions using JVM
overflow, signed division, and masked shift-distance rules. For example:

```java
if (((6 * 7) ^ 0) != 42) {
    throw new IllegalStateException();
}
render();
```

has this representative `.j` shape:

```text
bipush 6
bipush 7
imul
iconst_0
ixor
bipush 42
if_icmpeq Lok
new java/lang/IllegalStateException
dup
invokespecial Method java/lang/IllegalStateException <init> ()V
athrow
Lok:
invokestatic Method Game render ()V
return
```

After constant evaluation, the comparison is known true. The branch and its
literal producers are simplified, then CFG reachability removes the trap:

```java
render();
```

```text
invokestatic Method Game render ()V
return
```

This is not textual replacement. A fold is rejected when another branch can
enter the middle of the producer sequence, when the instruction is an
exception-handler entry, or when evaluation can throw. Thus `1 / 0` remains an
`idiv`, and floating-point reassociation is not attempted.

Neutral integer operations are removed (`x + 0`, `x ^ 0`, `x * 1`), adjacent
additive constants are combined with 32/64-bit wraparound, and JVM shift counts
are normalized (`x << 35` is `x << 3` for an `int`). The idiom `x ^ -1` is
printed as `~x`; comparisons are complemented and direction-flipped when
necessary to preserve signed ordering.

### Constant arguments across classes

Dummy guard parameters are common in these gamepacks:

```java
private void c(ce value, int guard) {
    if (guard != 18580) {
        throw new IllegalStateException();
    }
    consume(value);
}

// Every reachable direct caller:
this.c(value, 18580);
```

```text
; callee a.c(Lce;I)V
iload_2
sipush 18580
if_icmpeq Lok
aconst_null
athrow
Lok:
aload_0
aload_1
invokespecial Method a consume (Lce;)V
return

; caller
aload_0
aload_1
sipush 18580
invokespecial Method a c (Lce;I)V
```

CFG stack analysis associates argument stack values with descriptor
parameters, including calls containing category-two `long`/`double` values. A
parameter is specialized only when every reachable direct call to the resolved
declaration supplies the same integer-like constant. A constant-pool reference
whose owner is a subclass is resolved through the full hierarchy and counted
against the inherited declaration; `Child.m(...)` is not ignored when `m` is
declared on `Parent`.

The body first becomes:

```java
private void c(ce value, int guard) {
    consume(value);
}
```

Specialization, branch folding, and unreachable removal repeat to a bounded
fixed point. Deleting a dead caller in iteration one can reveal that all
remaining calls to another method use the same value in iteration two.
Parameters written by `istore` or `iinc` are never read-only facts.

### Signature compaction and its dictionary

The separately gated signature pass can remove a contiguous trailing run of
specialized, unused integer-like parameters from a private or internal static
method:

```java
// Before
private void c(ce value, int guard) { consume(value); }

// After
private void c(ce value) { consume(value); }
```

Conceptually, bytecode rewriting first preserves argument evaluation:

```text
aload_0
aload_1
sipush 18580
pop
invokespecial Method a c (Lce;)V
```

The peephole pass can then remove a side-effect-free literal producer followed
by `pop`. If an argument expression had side effects, its evaluation would
remain and only its result would be discarded. A branch label on the old
invocation moves to the first inserted `pop`, so an incoming edge still sees
the same operand-stack consumption.

Each `games/<game>/signature-map.json` preserves identity for mapping tools:

```json
{
  "formatVersion": 1,
  "signatures": {
    "a.c(Lce;I)V": {
      "newSignature": "a.c(Lce;)V",
      "oldDescriptor": "(Lce;I)V",
      "newDescriptor": "(Lce;)V",
      "callSiteSignatures": ["a.c(Lce;I)V"],
      "removedParameters": [
        { "index": 1, "descriptor": "I", "value": 18580, "discoveredIteration": 2 }
      ]
    }
  }
}
```

Java overload identity ignores return type, unlike a JVM descriptor. The pass
rejects a proposal that collides with another source method in the same class
or an ancestor/descendant. It also records and rewrites inherited call-site
owner aliases. Constructors, open APIs, virtual dispatch, and interface
families are currently excluded.

### Branch matching versus textual matching

Cleanup rules match semantic bytecode/CFG shapes, not source text or fixed
instruction offsets. A candidate normally has to satisfy all applicable
conditions:

- opcode and operand descriptors match the rule;
- stack consumption/production is known at rewritten instructions;
- no alternate edge enters a producer sequence;
- labels and `tableswitch`/`lookupswitch` targets remain valid;
- exception-handler entry stacks and protected ranges are preserved;
- local writes, including parsed `iinc varnum`, invalidate read-only facts;
- method references resolve to the same declaration through inheritance;
- the emitted class passes orphan-local and ASM verifier guards.

For example, these instructions look locally constant but cannot be folded
because `Lrhs` has another incoming edge:

```text
iconst_1
Lrhs:
iconst_1
if_icmpne Lbad
goto Lrhs
```

A raw three-instruction matcher would delete a stack producer needed by the
backedge. The implemented branch folder collects incoming CFG labels first and
rejects the candidate.

### Guarded pattern patching

Some obfuscator shapes need a narrow structural patch before a general
decompiler can print them cleanly. Implemented passes cover families including
shared goto tails, duplicated loop suffixes, stack-carrying joins,
boolean/null comparisons, and verifier-sensitive local splitting. A typical
duplicated loop-tail shape is:

```text
ifeq Lother
iinc 4 1
goto Lhead
Lother:
; ...
iinc 4 1
goto Lhead
```

When the suffix instructions, local, increment direction, and destination
match exactly, the duplicate can target one canonical tail. The Java then has
a normal `continue` rather than a raw state-machine edge:

```java
if (condition) {
    ++index;
    continue;
}
// ...
++index;
```

These patches include method/descriptor, CFG, dominance, exception-range,
local-slot, and stack-shape guards as appropriate. Mutating passes save and
reload the class. A pass that creates a new uninitialized local read or fails
ASM verification is reverted for that class. A final failed class is never
synced into this repository.

### Control-flow reconstruction and fallbacks

The owned decompiler reconstructs `if`/`else`, loops, `switch`, short-circuit
booleans, `break`, and `continue` from CFG regions. Stack values crossing joins
are materialized as typed Java locals when they cannot safely remain inline.
The goal is compilable structured Java, not line-for-line bytecode.

When a region cannot yet be structured, a state-machine fallback may be
emitted. Fallback counts are recorded separately from verification and Java
compilation. They are readability debt: complete source parity and successful
`javac` are still required before sync, although a compile-clean game can
contain a small number of fallback methods.

### Checked catches and synthetic `if (false)` throws

Java rejects a catch of a checked exception when the source-visible try body
cannot throw it. A decompiler can use an unreachable anchor solely to make such
source compile:

```java
try {
    work();
    if (false) throw (MyCheckedException) null;
} catch (MyCheckedException ex) {
    recover(ex);
}
```

Under the checked-catch cleanup gate, declaration analysis removes both the
specific catch and its anchor when no call in the emitted try declares that
checked type. Broad `Throwable`, `Exception`, `RuntimeException`, and `Error`
catches remain conservative because ordinary instructions can produce
unchecked failures. Removing a genuinely unreachable throw has no runtime
effect; removing its catch changes the source exception contract, so this
policy remains independently gated.

### Possible next deobfuscations

The following extensions are useful but are not claimed by this snapshot:

- **Internal interface-family compaction:** prove a parameter dead in the
  declaration and every implementation, then rewrite the family and all
  virtual/interface calls atomically.
- **Semantic names and types:** infer names such as `render`, `packet`, or
  `sprite` from behavior. Current short obfuscated identifiers are retained.
- **Broader interprocedural propagation:** propagate finite enums, strings, or
  immutable objects. Current cross-class facts are integer-like constants.
- **More fallback elimination:** structure remaining irreducible/state-machine
  CFGs after equivalence and verifier proofs are available.

Every stronger transform needs the same escape hatch used here: a separate
gate, deterministic diagnostics and mapping output, full-game bytecode
verification, full source recompilation, and representative runtime A/B tests.

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

- **ABI dictionary emission** — see above
  ([#11](https://github.com/Kreijstal/dekobloko-work/issues/11)).

These are being localized via the ABI-restore + bisection workflow above and
fixed in the decompiler; the sources here are regenerated as fixes land.

## Caveats

- This is **decompiler output**. The current 44-game snapshot was verified to
  recompile cleanly with `javac`, but it is not intended to be a drop-in
  runnable distribution.
- The goal is faithful reconstruction of program structure for research and
  preservation, not pristine source.
- Some methods still carry runtime-behaviour bugs (see *Work in progress*
  above); recompiled output may not yet behave identically to the original.
- Names are obfuscated (see above).

## Games included

All **44** games are included — this is the full canonical roster, and every
one produced decompiled Java. Total: **18,481** `.java` files across 44 games.

| Game | `.java` files |
| --- | --- |
| 36cardtrick | 295 |
| aceofskies | 545 |
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
| steelsentinels | 347 |
| stellarshard | 301 |
| sumoblitz | 586 |
| terraphoenix | 311 |
| tetralink | 355 |
| tombracer | 1090 |
| torchallenge | 300 |
| torquing | 396 |
| trackcontroller | 298 |
| transmogrify | 299 |
| vertigo2 | 437 |
| virogrid | 347 |
| voidhunters | 1570 |
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
