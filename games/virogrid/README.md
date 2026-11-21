# Reading Virogrid

Resolved declarations: 348/348 classes and 2418/2418 methods have readable names. 265 constructors follow their class names.
Remaining: 0 opaque classes and 0 opaque methods.

`LobbyAndTextHelpers.loadTextTable` retains its local `TextTableInitialization` state carrier. Its four named phases load login/lobby, account/social, menu/multiplayer and membership/display text. The 744 resource lookups keep their original null guards, array slots, discarded decodes, early completion and archive cleanup.

Rules and review evidence use original declaration identities in `virogrid-names.json`. Reproduction checks compilation, symbol bindings and exact source restoration. Fields and locals are outside the class/method naming claim; full gameplay has not been runtime-tested.

Start at `Virogrid`; the shared engine (nodes, deques, applet shell) uses the same role names as other FunOrb games.
