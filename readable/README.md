# Readable GeoBlox

The current export has 1,032 guarded naming rules: 21 classes, 360 fields,
164 methods, 188 parameters and 299 local declarations. Both 303-file corpora
compile, preserving 154,117 bindings and 388 override relationships. Unknown
names, generated carriers, guards and shared joins remain.

## One current manifest

[geoblox-rules.json](geoblox-rules.json) is the single maintained source for
names, source/decompiler pins, source and native-probe evidence, text-resource
assignments and verification limits. Previous snapshots live in Git rather than
versioned JSON files in the working tree. Its `publication.previousRules` records
a reviewed Git commit, path and SHA-256; explicit `ruleChanges` protect every
unaffected name. A changed input uses an explicit `sourceChange` in this same file.

The generated [source](geoblox/src), [dictionary](geoblox/mapping.json),
[symbol reference](geoblox/SYMBOLS.md) and [provenance](geoblox/provenance.json)
are current outputs. [tools/PIN.json](tools/PIN.json) pins the bundled naming
tool bytes; `funorb-stubs.jar` is the frozen compilation dependency. The
[reading guide](GEOBLOX-READING-GUIDE.md) explains the named gameplay flow.

The raw input is `games/geoblox` at
`7d0e06122fc537ee96a9f56e633ac5356ba325d8`. It comes from java-tools
`e6dd72c89fa7f51cc34cd78d08cf5c6227799126` and Deko
`a572c4dd0f0174bfcd7777be53d7ceba2f970f18`. The adapted naming tool is
`a0bc835957148b9b1e1f8221c59b79d899d22738`; its source archive SHA-256 is
`cb10756aa3ecb28159c9b81f2fb78bf559b4111d9ad203819458b30d0d84cf8c`.

The **decompiler repository source** SHA-256 is
`6337fa96b5d83ef24ee2bf20c7e48ea5e0844482f6262e774d73fba6101d4912`:

```sh
git archive --format=tar e6dd72c89fa7f51cc34cd78d08cf5c6227799126 | sha256sum
```

This identifies tracked decompiler source and its Git archive metadata. It is
separate from a game JAR or the Java source-tree hashes below.

## Reproduce and check

Use a full Git checkout, Node.js and a JDK with javac. The recorded environment
is Node 22.23.2 and OpenJDK 11.0.32.1+1; compilation targets Java 8.

```sh
node readable/build-geoblox-rules.mjs --check
node readable/tests/test-geoblox-rule-builder.mjs
node readable/tests/test-geoblox-migration-source.mjs
node readable/tests/test-geoblox-text-rules.mjs
node readable/reproduce-geoblox.mjs --check
node readable/tools/restore-original.mjs readable/geoblox /tmp/geoblox-restored
```

The wrapper extracts the pinned input from Git, verifies source/probe/dependency
bytes and the actual text-resource assignments, then compiles and rebinds both
corpora. The dictionary reverses all identifier edits without requiring the
original source. Generate a replacement in a fresh output directory with
`node readable/reproduce-geoblox.mjs OUTPUT`; review it before copying its
completed outputs into `readable/geoblox`. Generated Java is never edited by hand.

For native behavior checks, supply the verified 303-class directory recorded in
`decompilation/geoblox-provenance.json`:

```sh
JAVA_TOOL_OPTIONS=-XX:-UsePerfData node readable/tests/test-geoblox-match-scoring.mjs /path/to/verified-geoblox-classes
JAVA_TOOL_OPTIONS=-XX:-UsePerfData node readable/tests/test-geoblox-text-write.mjs /path/to/verified-geoblox-classes
JAVA_TOOL_OPTIONS=-XX:-UsePerfData node readable/tests/test-geoblox-gameplay.mjs /path/to/verified-geoblox-classes
JAVA_TOOL_OPTIONS=-XX:-UsePerfData node readable/tests/test-geoblox-result-sequence.mjs /path/to/verified-geoblox-classes
JAVA_TOOL_OPTIONS=-XX:-UsePerfData node readable/tests/test-geoblox-result-helpers.mjs /path/to/verified-geoblox-classes
```

Matching/scoring covers 708 controlled scenarios and 55,728 ticks per variant.
The text writer covers 152 cases, including retained suffixes, empty/growing
writes, UTF-16, live aliasing, offsets, partial writes and throwable identity.
`writeTextAtOffset` grows the builder when needed and preserves old trailing
characters after shorter writes. Result probes cover 27 scenarios/26,043 ticks,
120 selector cases, 4,801 PCM factory cases, 9,000 bounds checks and six music
returns. Native, raw and readable traces match within those controlled scopes.
The gameplay probe checks 144 contact cases across kinds 0/1/2, equality keys,
force flags and client guards; 32 neighbor removals; two forced neighborhood
detachments; and the existing boundary, popup, cooldown and settling checks.
Ordinary contacts use independent neighbor-order/count oracles. Duplicate
contacts preserve state even when forced detachment is requested. One-pixel
sprites and controlled palettes exercise actual constructors and conversions;
multi-hop special conversion remains unverified.
Contact-physics producers, actual asset loading, new unlock delivery, device
audio and whole-game equivalence remain unverified. Text-writer guards <=23
retain a PCM side effect outside the direct writer probe. These source checks
do not establish FPS, heap or phone acceptance.

## Update this export

1. Commit and verify the new raw source when changing the decompiler. For a
   naming-only change, retain the existing input and generator pins.
2. Point `publication.previousRules` to the last reviewed Git version of the
   single manifest. Record additions, replacements or removals as exact
   `{symbol, before, after}` entries in `ruleChanges`; use null for absent rules.
   If source identity changes, record its exact `before`/`after` identities in
   `sourceChange` and review affected local ordinals and spelling guards.
3. Update the current source/native evidence and resource assignments in the
   same manifest. Preserve metadata, strings and guards needed by the original
   program. Run the canonical builder and generate into a fresh directory.
4. Review the diff, run the relevant behavior probes and full binding check,
   reverse the dictionary, and replace the generated outputs. Keep verification
   results current in the manifest; use Git for history instead of new snapshots.

| Java source tree | SHA-256 |
| --- | --- |
| Raw | `07610c2d655bf96e59584f07be867c62e47cf3b3c484063504d9958443e89da2` |
| Readable | `0b2f7b4f7b945ffa0f0abfc0c9168e08f664798570001ff0c5622bb5065abd09` |

Tree digests use `sourceIdentity(sourceInventory(root))` from the bundled tool.
