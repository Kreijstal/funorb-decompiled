# Reading Pixelate

Resolved declarations: 398/398 classes and 2741/2741 methods have readable names. 312 constructors follow their class names.
Remaining: 0 opaque classes and 0 opaque methods.

`GameModeSelectScreen` retains its local `TextTableInitialization` carrier with named login/lobby/reporting, account/social/loading, menu/multiplayer/display and membership/subscription phases. All 744 resource lookups retain their ordering, null guards, array slots, discarded decodes and archive cleanup.

Rules and evidence use original declarations in `pixelate-names.json`. Reproduction checks compilation, bindings and exact source restoration. Fields and locals are outside the class/method naming claim; full gameplay has not been runtime-tested.

Start at `Pixelate`; the shared engine (nodes, hash tables, canvases, applet shell) uses the same role names as other FunOrb games.
