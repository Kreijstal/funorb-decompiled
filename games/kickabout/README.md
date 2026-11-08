# Reading Kickabout

This directory is the single published Java tree. The scripts and reviewed rules live in dekobloko-work/readable; the current reverse dictionary is ../../decompilation/kickabout-naming.json.

Resolved declarations: 492/545 classes and 2224/3957 methods have readable names; 440 constructors follow their class names.
Remaining: 53 opaque class names and 1733 opaque method names. The complete naming goal is still in progress.
Audit with `node readable/naming-coverage.mjs kickabout` in dekobloko-work; it exits unsuccessfully while opaque names remain.

Start with `CommonGame` for match phases and agents; `ParticipantAgent`, `TeamSelectionAgent`, `FormationAgent` and `LineupAgent` handle participant/team choices. `FootballerAgent`, `BallAgent` and `GoalStateAgent` hold play state.

`LobbyMatchPreview`, `FootballerPreview` and `WorldDrawEntry` cover lobby previews and scene ordering. `MarkerSliderWidget`, `RotaryDialWidget` and their painters expose the custom controls. `QuickChatCategoryCache` / `QuickChatCategory` and `AnimationFrameset` describe shared definition loading.

`ClubState`, `PlayerStats`, `ManagerAction` and auction classes describe manager mode. `ArchiveRequest` / `NetworkArchiveRequest`, `PacketBuffer`, `CipherPacketBuffer` and the applet hierarchy cover transport and loading. UI focus, hover, drag and drop have explicit listener contracts.

`AchievementQuery` / `AchievementSubmission`, `LookupQuery` / `LookupRecordUpdate`, `HighScoreQuery` / `HighScoreSubmission` and `RankingsRequest` describe queued protocol operations. `PcmPlayerService`, `PcmMixerListener`, `PcmSampleStream` and `MidiPcmStream` expose scheduling, playback and MIDI control.

`LocalizedTextLoader` supplies the language pack. `ClientProtocolStage`, `RegistrationRequestState`, `AccountNameCheckState` and `AccountInputValidationResult` distinguish transport and account states. `ModelMaterialDecoder` / `ModelMaterial` decode the logo model palette.

The obfuscator moved independent static helpers between owners. Owner names describe their retained role; individual method names describe each helper without changing its placement or calls.

Sprite operations, request completion, calendar and character boundaries, Quick Chat decoding, PCM mixing, MIDI controller dispatch and summed color moments are checked against independent native Java expectations in both raw and named corpora. These focused checks do not establish full gameplay or multiplayer equivalence.

Decompiler source commit: 00c1c12fb58cdbd6be065e604ee5e9acbcebeff7.
