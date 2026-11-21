# Reading Tetra Link

Resolved declarations: 356/356 classes and 2418/2418 methods have readable names. 272 constructors follow their class names.
Remaining: 0 opaque classes and 0 opaque methods.

`InterfaceTextLoader` retains its local `TextTableInitialization` carrier with named login/lobby/reporting, account/social/loading, menu/multiplayer/display and membership/subscription phases. All 744 lookups retain their original null guards, array slots, discarded decodes, recursive guard and archive cleanup.

Rules and evidence use original declarations in `tetralink-names.json`. Reproduction checks compilation, bindings and exact source restoration. Fields and locals are outside the class/method naming claim; full gameplay has not been runtime-tested.

Start at the `TetraLink` applet class; the shared engine (nodes, deques, packet buffer, sockets, widgets, sprites) uses the same role names as other FunOrb games.
