# GeoBlox pass 18: result selection, popups and PCM samples

This naming pass adds 46 reviewed names: one class, ten fields, six methods,
22 parameters and seven locals. All 926 earlier names remain unchanged, giving
972 rules. The raw Java, bytecode, decompiler, naming tool and stub dependency
are unchanged. Generated source bodies are not edited by hand. The frozen
[pass-17 manifest](rules/geoblox-v17.json) and
[pass-18 additions](rules/geoblox-v18-results.json) retain full JVM identities,
original spellings, semantic evidence and hashes of ten reviewed source files.
The publication wrapper verifies these source hashes against the Git-extracted
pinned input before invoking the bundled naming tool.

## Read the result sequence through named helpers

`GameplaySession.updateResultSequence` now reads:

```java
endingEntity = i.findOutermostAttachedEntity((byte) -128);
ra.selectBackgroundMusic(stackIn_23_0, qf.resultMusicTrack);

if (this.resultExpansionAudioStream != null) {
    if (!this.resultExpansionAudioStream.isSamplePositionOutOfRange()) {
        break L18;
    }
}
this.resultExpansionAudioStream = PcmSampleStream.createForPlaybackRate(
    fl.field_c[28], 2 * resultProgressPercent - -200, 45);
GameplayEntity.registerAudioStream(false, this.resultExpansionAudioStream);

ld.spawnPointsPopup(310, 320, 90, this.resultBonusPoints);
```

This excerpt shows the generated names; it does not simplify the preserved
numeric expressions, scratch carriers, guard arguments or labeled joins.

`findOutermostAttachedEntity` walks the attached deque backwards and selects
the strictly greatest squared distance from `(320,240)`. Its initial threshold
is `Float.MIN_VALUE`, not zero. A nonempty deque containing only centred or NaN
positions therefore returns null. Equal distances retain the first encountered
entity, which is the last inserted among tied candidates. A nonzero client guard
stops after the first candidate. Method guards at least -127 also clear the
avatar mask. Names inside the method describe these roles without altering them.

`spawnPointsPopup` is also used by difficulty bonuses and the ordinary points
panel. Its coordinates are `originY` then `originX`, followed by `methodGuard`
and `points`. Its retained guard at most 39 invokes the boundary probe after
spawning. The name is deliberately shared across these call sites.

`resultMusicTrack` comes from the `bonus_bubble_jingle` resource in `jg`.
`selectBackgroundMusic` returns early for null or already-current tracks;
otherwise its original code stops and resets MIDI playback, records the new
track and starts it. The native helper probe below tests only the early returns.

## PCM data and playback rate

`PcmSample` replaces `gd`. Its fields are `sampleRateHz`, `samples`, `loopStart`,
`loopEnd` and `pingPongLoop`; both constructors use matching parameter names.
The loop end is exclusive. Ping-pong paths in the existing stream code reflect
the position at the endpoints and reverse its step; ordinary loop paths wrap.
The helper probe verifies that these values reach the stream without mutation,
but does not advance a loop or play audio.

`AudioOutput.sampleRateHz` is the output frequency, distinct from the sample's
source frequency. `createForPlaybackRate(sample, ratePercent, volume)` computes
the signed fixed-point sample step from their ratio and shifts volume by six.
`samplePositionFixed` and `sampleStepFixed` use 256 units per source sample.
`isSamplePositionOutOfRange` tests the position against zero and the byte-array
length shifted by eight. It does not assert that playback is finished or that
the stream is unregistered. Null/empty bytes return a null stream; a null sample
throws. A zero output frequency divides by zero only for nonempty samples.
Integer overflow, negative rates and guards remain unchanged.

`playPcmSample` creates a stream at rate 100 and volume 96, then registers it.
Its ordinary guard is -348. Registration schedules playback; it does not itself
advance a PCM buffer or prove audible output.

## Actual native comparison and reproducibility

The [helper probe](tests/test-geoblox-result-helpers.mjs) compares the actual
verified transformed classes with the raw and readable source variants:

- 120 selector cases: empty, centred, NaN, infinite, tied and mixed positions;
  zero/nonzero client guards, four method guards, exact selected identity, mask
  cleanup, queue count and unchanged coordinate bits.
- 4,801 factory cases: null samples and null/empty/nonempty bytes, five source
  frequencies, four output frequencies, six rates, five volumes and both loop
  flags. Checks include constructor metadata, sample identity and untouched bytes,
  zero-frequency exceptions, overflow and negative rates.
- 9,000 position queries: negative, initial, fractional, last valid and first
  invalid fixed-point positions; the query must retain the position.
- Six music early returns: null/current track identities and both guard values;
  current-track identity and guard state remain unchanged.

All three variants match byte for byte. Their output SHA-256 is
`ec3c627a2eec22d24549607b97ae8c3b6d735e24217b26c61e8a5e510872ace6`.
The class-tree pin is checked before native execution. The recorded native digest
remains mandatory when no native path is supplied. The separate complete result
sequence still matches its native digest across 27 controlled scenarios and
26,043 ticks per variant.

```sh
node readable/build-geoblox-rules.mjs --check
node readable/tests/test-geoblox-rule-builder.mjs
node readable/tests/test-geoblox-text-rules.mjs
node readable/reproduce-geoblox.mjs --check
JAVA_TOOL_OPTIONS=-XX:-UsePerfData node readable/tests/test-geoblox-result-helpers.mjs VERIFIED_TRANSFORMED_CLASSES
JAVA_TOOL_OPTIONS=-XX:-UsePerfData node readable/tests/test-geoblox-result-sequence.mjs VERIFIED_TRANSFORMED_CLASSES
node readable/tools/restore-original.mjs readable/geoblox /tmp/geoblox-v18-restored
```

Both complete corpora compile. All 154,109 bindings and 388 override edges are
preserved. Generation applies 16,605 identifier edits; dictionary-only reversal
restores all 303 raw sources exactly. Rule-builder tests pass 30/30 and retained
text-resource evidence tests pass 8/8. See [validation.json](validation.json) for
fresh checks and historical evidence.

| Identity | SHA-256 |
| --- | --- |
| Pinned decompiler repository source archive | `34f9012d4ba040344178d1a249469d9f5f8e25b015153f12335529b1feddfec5` |
| Raw Java tree | `21fdcc2b2150a6a7ce1bc46a14baaa3ecc2c15580495f5f0f1ec620be5de4d2e` |
| Readable Java tree | `5fbe5208c2513b8a3923c9949d8e6d660c0736373d577203885a8f8c07f39524` |

The first digest identifies the tracked **decompiler source**, not the gamepack.
Recreate it with `git archive --format=tar c739b6ca232040f7a7970b704214adbed573d10c | sha256sum`.

The selector bypasses the asset-dependent entity constructor. PCM samples,
streams, sprites and deques use real constructors. Actual MIDI track activation,
PCM advancement/device output, successful asset loading, full contact physics,
boundary-loss transitions and whole-game equivalence remain outside these probes.
Unknown identifiers, synthetic carriers and labeled shared joins remain.
