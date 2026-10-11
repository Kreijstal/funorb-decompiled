# funorb-decompiled

Current Java source for the complete 44-game FunOrb / AlterOrb catalog lives
only in `games/<game>/`. GeoBlox, Deko Bloko, Armies of Gielinor and Steel Sentinels
have named sources directly in those directories, with a reading guide beside the Java. There is no separate
readable mirror and no committed compilation binaries.

The generic decompiler belongs to [java-tools](https://github.com/Kreijstal/java-tools).
The pipeline, game naming rules and reproduction scripts belong to
[dekobloko-work](https://github.com/Kreijstal/dekobloko-work). Generated Java and
current reverse dictionaries belong here.

## Read the games

- [GeoBlox](games/geoblox/README.md): gameplay, tutorial, screens and rendering.
- [Steel Sentinels](games/steelsentinels/README.md): gameplay naming for command scheduling, sentinel physics, armour/charge, world state, projectiles, engineering and articulated parts.
- [Armies of Gielinor](games/armiesofgielinor/README.md): gameplay naming for presentation/AI strategies, battlefield state, units, tiles, teams, events, movement, AI and tutorial anchors.
- [Deko Bloko](games/dekobloko/README.md): buckets, falling pieces, controls,
  feedback shapes, multiplayer snapshots, assets and UI.

Generic control-flow, lifetime, predicate, cast and formatting recovery runs
by default for every game. Semantic game-specific names use explicit naming
rules. Deko's numbered structural-category and type-based names identify
unresolved purposes honestly; they are not complete semantic deobfuscation.

Armies has 63 reviewed class names, not a complete semantic map. Its raw/named
core probe checks map lookups, alliances, status packing, damage, equipment/ranges,
spell payload bytes and queued combat consequences under a controlled headless
boundary. SpellCastEvent corrects the earlier trinket label from actual spell-table
dispatch. Candidate selection/recycling and presentation acknowledgement are
also tested. Three dispatcher files remain.

Steel has 27 reviewed class names. Its controlled raw/named core checks cover
module aliases, armour/charge mutations, terrain bounds, recursive part armour
and synchronization checksums, plus command timing, scheduling, queue routing
and equal-tick replacement. Three dispatcher files remain.

## Reproduce

Run from `dekobloko-work`, with sibling checkouts or an explicit
`FUNORB_DECOMPILED_DIR`:

```sh
env -u JAVA_TOOL_OPTIONS node readable/reproduce-geoblox.mjs --update
env -u JAVA_TOOL_OPTIONS node readable/reproduce-geoblox.mjs --check
env -u JAVA_TOOL_OPTIONS node readable/build-dekobloko-rules.mjs --check
env -u JAVA_TOOL_OPTIONS node readable/reproduce-dekobloko.mjs --update
env -u JAVA_TOOL_OPTIONS node readable/reproduce-dekobloko.mjs --check
env -u JAVA_TOOL_OPTIONS node readable/build-armiesofgielinor-rules.mjs --check
env -u JAVA_TOOL_OPTIONS node readable/reproduce-armiesofgielinor.mjs --update
env -u JAVA_TOOL_OPTIONS node readable/reproduce-armiesofgielinor.mjs --check
env -u JAVA_TOOL_OPTIONS node readable/build-steelsentinels-rules.mjs --check
env -u JAVA_TOOL_OPTIONS node readable/reproduce-steelsentinels.mjs --update
env -u JAVA_TOOL_OPTIONS node readable/reproduce-steelsentinels.mjs --check
node scripts/check-source-catalog.mjs /absolute/path/to/funorb-decompiled
node readable/restore-game.mjs dekobloko /tmp/original-dekobloko
```

A named export reads its exact raw input from its pinned Git commit. It builds
signature-only compilation stubs from `stubs/src` in temporary storage,
compiles both complete source corpora, checks every resolved symbol and override,
and stages the Java, guide and dictionary before replacement. Checks and
restoration leave no generated Java or classes in Deko or the cloner.

Follow Deko's [catalog procedure](https://github.com/Kreijstal/dekobloko-work/blob/master/docs/decompilation.md)
for a new decompiler pass. Full-catalog publication independently compiles all
raw output and preserves verified named exports directly in `games/`.

## Identities and validation

[`decompilation-provenance.json`](decompilation-provenance.json) is the single
current catalog manifest. Its `publication.games` records the raw compiler
outputs; `namedExports` and per-game `publishedSources` identify the current
named Java. Each [current naming dictionary](decompilation) also records its
exact input/output SHA-256, complete reverse edits and symbol verification.
The compiler SHA-256 identifies a **Git-generated tar archive of tracked
decompiler source**, not a game JAR. Each compiler receipt includes its exact
`git archive ... | sha256sum` reproduction command.

The latest raw catalog passed ASM verification and whole-game javac checks for
all 44 games and 18,481 sources. Dispatcher-containing files fell from 470 to
46. Deko Bloko has no dispatcher fallbacks. The named GeoBlox source retains
its reviewed Java bytes; Deko's current named export is checked separately.
Historical `decompilation/geoblox-*` compiler proofs remain tied to GeoBlox's
pinned input, not to a second published source tree.

Stubs are signatures for missing native/platform dependencies, not working game
services. Static compilation and naming verification do not establish whole-game
runtime equivalence, functioning multiplayer servers or browser/phone FPS.

## Legal

These are reconstructed third-party game sources for research and preservation.
No ownership of the games or license over their assets is claimed.
