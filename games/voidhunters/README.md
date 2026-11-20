# Reading Void Hunters

Resolved declarations: 923/1572 classes and 3425/8215 methods have readable names; 1359 constructors follow their class names.
Remaining: 649 opaque classes and 4790 opaque methods. The complete naming goal is still in progress.

Start at `VoidHunters`; `World`, `Ship`, `ShipBody`, `ShipComponent`, `MissionControl` and `GameSnapshot` expose the simulation and mission state. The console command classes retain the names of their registered commands.

`GameApplet` drives `initializeGame`, `updateGameTick`, `renderGameFrame`, `shutdownGame` and `clearClientResources`. `NetworkGameClient` parses launch parameters and coordinates shared login/reconnection work; `VoidHunters.handleServerPacket` dispatches the game-specific replies.

`SerializableGameState` names `readState`, `writeState`, `copyTo` and `differsFrom` across the simulation. `CompactGameState` exposes its additional packed representation. `PacketBuffer`, `IsaacPacketBuffer` and `IsaacCipher` separate byte codecs, bit codecs and encoded protocol bytes.

`MissionEvent.evaluateAndExecute` evaluates each condition, applies its negation flag, collects target body ids and executes actions. Conditions and actions expose descriptions, editable parameters and world marker positions. `GameStateFactory` names default-instance and typed-array creation; each named concrete factory identifies its product type.

`GraphicsToolkit` has software, native software, OpenGL and Direct3D implementations. `GpuToolkit` shares the hardware path between `OpenGlGpuToolkit` and `Direct3DToolkit`. `ProceduralTexture` connects `TextureOperation` inputs; `ColorRowCache` and `MonochromeRowCache` retain their computed rows. The native-memory and Direct3D Java wrappers have names matching the operations they dispatch.

`AudioPump` services `AudioOutput`; `JavaSoundAudioOutput` submits mixed PCM through Java Sound. `PcmStreamMixer` combines child streams and scheduled listeners. `MidiPcmStream` reads `MusicTrack` events with `MidiFileReader`, manages patch notes and controllers, and mixes them through `MusicPatchPcmStream`. `PcmSampleStream` names its forward/reverse, mono/stereo, interpolated/aligned and gain-ramped mixing kernels. `SoundCache` loads music samples and synthesized `SoundEffect` samples. `SoundInstrument`, `SoundEnvelope` and `SoundFilter` expose synthesis; `VorbisSample` decodes compressed music through its codebooks, floors, residues and mappings.

Names and review evidence are keyed by original declarations in `voidhunters-names.json` and `voidhunters-diff-names.mjs`. Reproduction verifies compilation, symbol bindings, inheritance relationships and exact source restoration. Fields and locals are outside the complete class/method naming claim. Full gameplay has not been runtime-tested.

Reproduce in dekobloko-work:

```sh
env -u JAVA_TOOL_OPTIONS node readable/build-voidhunters-rules.mjs --check
env -u JAVA_TOOL_OPTIONS node readable/reproduce-voidhunters.mjs --check
node readable/voidhunters-coverage.mjs
```
