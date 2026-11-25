# Reading Tomb Racer

All 1092 classes and 8779 methods have readable names in 1090 source files. Constructors follow their class names.

Start at `TombRacer`; the shared engine (nodes, sockets, applet shell, input) uses the same role names as other FunOrb games.

For native libraries, use the consuming workflow repository command `node readable/tombracer-native-namespace.mjs --output NEW_DIRECTORY`. It produces a separate JAR with original JVM identities and verifies its instructions, native API and class loading. See `readable/native-namespace/README.md` there for dependencies and reports. Readable Java retains its descriptive names.
