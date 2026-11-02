# Reading Track Controller

This pass names 59 reviewed classes in 298 source files. Unresolved roles keep their original names.

Start at `TrackController` (a `GameShell` and `GameApplet`). The gameplay path is `GameScreen`, `ActiveLevel` (a `LevelGrid` that updates the avatar and `MovingBlock` list each tick), `LevelData` (parsed level string) and `LevelView`.

The shared engine (nodes, hash tables, packet buffer, sockets, input, archives, audio) uses the same role names as other FunOrb games.
