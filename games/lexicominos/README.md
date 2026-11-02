# Reading Lexicominos

This directory is the single published Java tree. The scripts and reviewed rules live in dekobloko-work/readable; the current reverse dictionary is ../../decompilation/lexicominos-naming.json.

This pass names 24 reviewed classes in 297 source files. Unresolved roles keep their original names.

Shared engine roles (applet shell, software rasterizer, PCM and Vorbis audio, fonts, Bzip2) reuse the names found in other FunOrb games after reviewing matching member signatures.

Reproduce with `node readable/build-lexicominos-rules.mjs --check`, `node readable/reproduce-lexicominos.mjs --update` and `node readable/reproduce-lexicominos.mjs --check` from dekobloko-work.
