# funorb-decompiled

Generated Java sources for the complete 44-game FunOrb / AlterOrb catalog.
The owned JavaScript decompiler lives in
[java-tools](https://github.com/Kreijstal/java-tools); the bytecode pipeline,
game-specific naming rules and publication scripts live in
[dekobloko-work](https://github.com/Kreijstal/dekobloko-work).
This repository owns generated Java, symbol dictionaries and export provenance.

## Complete catalog

`games/<game>/` contains the decompiler output. Generic control-flow recovery,
local lifetime recovery, proved guard/cast simplification and formatting run by
default. These improvements apply to every game; semantic game-specific names
require separate naming evidence. A supported, valid dispatcher fallback is
retained when structured reconstruction cannot be proved safe.

[`decompilation-provenance.json`](decompilation-provenance.json) is the single
current catalog manifest. It records the generator commits, original and
transformed class identities, emitted source identities, fallback counts and
static validation for each game. The compiler checksum identifies a
**Git-generated tar archive of tracked decompiler source**, not a game JAR.
Reproduce that checksum with the manifest's `sourceArchive.reproduce` command.

## Reproduce and publish

Follow Deko's [authoritative procedure](https://github.com/Kreijstal/dekobloko-work/blob/master/docs/decompilation.md).
Use clean generator checkouts outside a parent Node package with `type: module`,
and one temporary batch containing the fixed original class inputs. Keep those
checkouts at `BATCH/tooling/dekobloko-work` and `BATCH/tooling/java-tools`.

```sh
JAVA_TOOLS_DIR=BATCH/tooling/java-tools \
  BATCH/tooling/dekobloko-work/scripts/decompile-all-games.sh BATCH --jobs 6

# From the checkout containing the publisher:
node scripts/publish-decompiled-games.mjs BATCH FUNORB_REPO BATCH/tooling/java-tools --update
node scripts/publish-decompiled-games.mjs BATCH FUNORB_REPO BATCH/tooling/java-tools --check
```

The batch verifies transformed bytecode and compiles each complete game. The
publisher rejects missing games, failed reports and stale pipeline fingerprints,
then independently compiles all emitted peers against stubs alone. Compiler-only
failures can be regenerated with Deko's `repair-decompiled-games.mjs` using the
exact per-game `sourceGenerator` commit recorded in the manifest. Reproduction
starts with the seed generator pins, then repeats those recorded repairs. It
stages all games before replacing the current catalog. Remove the temporary batch once
publication checks pass. Generated Java belongs here; scripts belong in Deko or
java-tools.

## Named GeoBlox export

[`readable/geoblox/src`](readable/geoblox/src) is the single maintained named
GeoBlox export; its [reading guide](readable/GEOBLOX-READING-GUIDE.md) locates
gameplay, menu, tutorial, transition and rendering code. Its dictionary preserves
original identities without adding opaque suffixes to readable names.

This separately reviewed export remains pinned to its original input commit in
Deko's `readable/geoblox-rules.json`. Updating `games/` does not silently migrate
that dictionary onto different compiler output. Reproduce it with:

```sh
# From dekobloko-work; FUNORB_DECOMPILED_DIR selects this repository if needed.
node readable/reproduce-geoblox.mjs --check
```

[`readable/geoblox/provenance.json`](readable/geoblox/provenance.json) identifies
the named output. The records under `decompilation/geoblox-*` describe the
historical raw source and proofs used for that named export, rather than the
latest complete-catalog rebuild. The named export has 303 files, 20,133 guarded
rules and 20,440 dictionary identities. Some finer member purposes remain
uncertain. Its HotSpot instructions/gameplay smoke test passed; browser, phone,
heap and presented-FPS acceptance remain unverified.

Earlier pass narratives and compiler opt-in settings are retained in Git
history. They describe historical compiler versions; the current shared
compiler needs no readability opt-in flags.

## Compilation and runtime limits

Legacy Microsoft J++, native graphics and launcher dependencies are represented
by signature-only stubs under `stubs/src`. Build them with `stubs/build-stubs.sh`.
They permit compilation and do not implement the game services.

Raw game fields use the deterministic `field_` prefix to avoid collisions
between obfuscated class and member names in Java source. Deko's
`scripts/restore-abi.sh` restores original bytecode field names for differential
checks. Compilation and verifier success establish static validity; they do
not establish whole-game runtime equivalence, working multiplayer services or
mobile performance. No complete-catalog gameplay claim is made.

The current refresh has 44 passing game reports and 18,481 emitted sources.
Every transformed class corpus passed ASM verification; the publisher compiled
all games independently with `javac --release 8` against stubs alone. Files
containing a dispatcher fell from 470 to 46; total Java source bytes fell from
357,280,127 to 182,226,961. Deko Bloko has zero dispatcher fallbacks, down from
10 files; Kickabout has zero, also down from 10 files. The 46 remaining valid
fallbacks are recorded in the catalog manifest.

The late protected-return fix passed the focused generic compiler tests:

```sh
# In java-tools, with its dependencies installed:
node --test --experimental-test-isolation=none test/cfrSyntheticReturnFooter.test.js test/unreachableTransferCleanup.test.js test/cfrDefaultReadability.test.js test/cfrNarrowIntegerArguments.test.js
node test/cfrCatchSemanticsRegressions.test.js
# In dekobloko-work:
node --test scripts/test-publish-decompiled-games.mjs
```

Results: 16 tests, 18 exception-regression assertions, and three publisher tests
passed. GeoBlox's native match-scoring comparison also matched across 708
scenarios and 55,728 ticks for the fresh raw, original transformed and pinned
named sources. Its named export remains separately pinned as described above.

## Games included

18,481 Java source files across 44 games.

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

These are decompiled third-party game assets, reconstructed for research and
preservation. No ownership of the games is claimed and no license over their
assets is granted. All rights to the original games remain with their owners.
