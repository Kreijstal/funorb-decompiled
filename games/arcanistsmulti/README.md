# Reading Arcanists Multi

Resolved declarations: 365/365 classes and 2830/2830 methods have readable names. 281 constructors follow their class names.
Remaining: 0 opaque classes and 0 opaque methods.

`LoginMessageTable.CommonTextInitialization` names four phases over the shared 744-key interface table. `TextTableInitializer.GameTextInitialization` names five phases over 888 expansion, spell, achievement, control, spell-book, tutorial and familiar keys. Original array slots, null guards, byte-key decoding, discarded results, early completion and archive cleanup remain intact.

Names and evidence use original declarations in `arcanistsmulti-names.json`. Reproduction checks compilation, bindings and exact source restoration. Fields and locals are outside the class/method naming claim; full gameplay has not been runtime-tested.

Reproduce with `node readable/build-arcanistsmulti-rules.mjs --check` and `node readable/reproduce-arcanistsmulti.mjs --check` from dekobloko-work.
