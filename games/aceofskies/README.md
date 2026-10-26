# Reading Ace of Skies

This directory is the single published Java tree. The scripts and reviewed rules live in dekobloko-work/readable; the current reverse dictionary is ../../decompilation/aceofskies-naming.json.

This pass names 35 reviewed classes in 545 source files. Unresolved roles keep their original names; renamed names have no opaque suffix.

Start at `AceOfSkies.advanceGame` → `FlightSession.advanceSession`. `startGame` creates the player and pools; `renderSession` draws through `GraphicsRenderer`. `Aircraft` retains its definition, target, pursuing aircraft, firing request and temporary weapon. `FlightBody` and `Vector2` expose the flight arithmetic. `Bullet`, `Pickup`, `SmokeParticle` and `ScreenParticle` are distinct pools. `MenuScreen` handles the indexed screens.

Angles in forward/polar motion use 256 units per full turn. `Vector2.angle255` preserves the separate original atan2 scaling by 255 / pi and its zero-vector value 255. `FlightBody.moveForward` subtracts sine/cosine motion and also decays headingOffset. `wrapWorld` retains its single-period boundary adjustments, including out-of-range results for positions multiple periods away. All guard parameters and unusual edge behavior remain.

The shared engine roles match other games by reviewed behavior, not by short obfuscated spelling:

| Ace | Existing counterpart | Evidence |
| --- | --- | --- |
| IntrusiveNode / IntrusiveDeque | GeoBlox IntrusiveNode / IntrusiveDeque | Independent node ownership, circular sentinel and forward/reverse links. |
| PacketBuffer / CipherPacketBuffer | Steel Sentinels PacketBuffer / CipherPacketBuffer | Byte payload/cursor, big-endian widths, ISAAC and bit cursor. |
| ResourceArchive / ArchiveIndex / ArchiveProvider | Steel Sentinels equivalents | Packed/unpacked groups, versioned indexes, names/digests and provider progress. |
| PcmSample / PcmSampleStream / MidiPcmStream | GeoBlox equivalents | Signed PCM storage, loop bounds, interpolation and MIDI channel/voice state. |

Shared role names do not assert byte-for-byte implementation equality. Different guards, signatures, static helper placement and graphics generations remain. Core fixtures exercise actual raw and named flight/vector, packet and collection implementations, compare their traces and check independent expected results. Complete source compilation and resolved declaration/reference/override comparison cover every file. Reversal recovers all original source bytes.

One dispatcher remains in FlightSession, in the animated HUD number rendering path. Other unresolved control flow also remains; this naming pass does not replace branches with guessed game logic. Whole-game playability, pixel output and server compatibility are not established by the focused fixtures.

Reproduce with `node readable/build-aceofskies-rules.mjs --check`, `node readable/reproduce-aceofskies.mjs --update`, and `node readable/reproduce-aceofskies.mjs --check` from dekobloko-work. Each command uses pinned raw Git input and temporary compilation only. No binary dependency or second readable tree is published.
