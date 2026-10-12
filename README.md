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

Armies has 148 reviewed class names, not a complete semantic map. Campaign
loadouts now name unit/spell rewards, equipped slots and cumulative mana bonuses;
reward previews retain unit-before-spell-before-mana precedence. Campaign menu
entries, buttons and intrusive hash lookup/traversal now have reviewed names;
neighbor requirements and the score-1 replacement rule are independently tested.
Palette-region IDs, marker anchors, sprite bounds and clipped indexed rendering
also have reviewed names and pixel fixtures; signed-index failures and original
mask-extraction bounds remain unchanged. CampaignQuicksave adds versioned
header/chunk names and explicit upload/delete/restore paths; codec probes verify
wire bytes and guarded deletion without claiming full gameplay restoration.
Campaign completion also names score submission, turn records and XOR metric
checkpoints, with fixtures for score gates and all eight shared-word mutations.
The four packet-word names describe serialization positions; server semantics
remain unresolved. Disk-cache requests, worker queues, independent node links
and buffered/bounded files now have reviewed names and real disk probes. The
large-ID write-link defect is confirmed in the original gamepack bytecode.
Network resource requests, capped lanes, padded responses and buffered transport
now have reviewed names and controlled stream fixtures.
Archive/provider roots, index metadata and resource name lookups also have
reviewed names, with versioned raw/gzip and file-retention fixtures.
Group unpacking, XTEA, named/flat access and direct byte storage now have
reviewed names, with independent ciphertext/chunk/copy/reload fixtures using a
controlled archive provider. The mode-two empty-file null result is preserved.
Portal summon menus, unit cycling, the turn timer, spell confirmations, battle
tutorial hints and visible unit-model refresh now have reviewed names. Focused
menu/cycle/timer/pointer/hint fixtures retain the existing edge behavior.

EquipmentBattleTutorial separately identifies specialist-equipment lessons
after Eastbridge. Its equipped-slot cursor, god/unit unlock gates and selected
unit eligibility now have names and controlled fixtures. The full scripted
sequence remains unverified.
Its raw/named core probe checks map lookups, alliances, status packing, damage, equipment/ranges,
spell payload bytes and queued combat consequences under a controlled headless
boundary. SpellCastEvent corrects the earlier trinket label from actual spell-table
dispatch. Candidate selection/recycling and presentation acknowledgement are
also tested, alongside packed movement requests and prepared-action event
payloads. ActionRequest/PreparedAction replace the overly narrow SpellArea names;
movement, summoning, deployment and spells share this contract. Combat prediction,
cover/status scaling, team effects, summoning permissions and parasite eligibility
also have reviewed names and focused fixtures. Match-condition aggregation,
survivor masks, elimination order/ownership cleanup and structure income are
checked too. Campaign metadata and map layouts have reviewed names. Bit codecs,
tagged fields and nested version-2 map decoding now have focused wire fixtures;
combat packets preserve packed flags and signed deltas. Event dispatch, stored
unit records, snapshot chunks and spell factories have focused fixtures.
Tutorial layout and shared UI selection now have reviewed names and boundary
fixtures. The spell-menu hierarchy, match setup and instructions panels now have
reviewed names and focused hierarchy/option/geometry probes. Instruction tables,
navigation, model-preview state, animation sequences/players and timing helpers
now have names and focused probes. Player profiles, campaign results/scoring,
participants, coats of arms and contextual errors have names and versioned
packet fixtures. Mission gt/gd fields now correctly identify score targets.
Three
dispatcher files remain.

Steel has 33 reviewed class names. Its controlled raw/named core checks cover
module aliases, armour/charge mutations, terrain bounds, recursive part armour
and synchronization checksums, plus command timing, scheduling, queue routing
and equal-tick replacement. Packet names and wire fixtures cover bit fields,
byte order, slices and cipher block boundaries; bounded randomness and intrusive
hash lookups have independent expectations. Archive/provider roots and versioned
index decoding now have names and raw/gzip, sparse-ID and retention fixtures. Three dispatcher files remain.

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
