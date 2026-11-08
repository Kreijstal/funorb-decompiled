# Reading Kickabout

This directory is the single published Java tree. The scripts and reviewed rules live in dekobloko-work/readable; the current reverse dictionary is ../../decompilation/kickabout-naming.json.

Resolved declarations: 405/545 classes and 1953/3957 methods have readable names; 440 constructors follow their class names.
Remaining: 140 opaque class names and 2004 opaque method names. The complete naming goal is still in progress.
Audit with `node readable/naming-coverage.mjs kickabout` in dekobloko-work; it exits unsuccessfully while opaque names remain.

Start with `CommonGame` for match phases and agents; `ParticipantAgent`, `TeamSelectionAgent`, `FormationAgent` and `LineupAgent` handle participant/team choices. `FootballerAgent`, `BallAgent` and `GoalStateAgent` hold play state.

`LobbyMatchPreview`, `FootballerPreview` and `WorldDrawEntry` cover lobby previews and scene ordering. `MarkerSliderWidget`, `RotaryDialWidget` and their painters expose the custom controls. `QuickChatCategoryCache` / `QuickChatCategory` and `AnimationFrameset` describe shared definition loading.

`ClubState`, `PlayerStats`, `ManagerAction` and auction classes describe manager mode. `ArchiveRequest` / `NetworkArchiveRequest`, `PacketBuffer`, `CipherPacketBuffer` and the applet hierarchy cover transport and loading. UI focus, hover, drag and drop have explicit listener contracts.

Sprite copy/reflection/rotation, availability-request completion, Gregorian calendar boundaries and Quick Chat category decoding are checked against independent native Java expectations in both raw and named corpora. These focused checks do not establish full gameplay or multiplayer equivalence.

Decompiler source commit: 00c1c12fb58cdbd6be065e604ee5e9acbcebeff7.
