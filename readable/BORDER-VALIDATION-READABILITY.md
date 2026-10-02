# GeoBlox pass 16: border sprites and text validation

This naming pass retains all 841 pass-15 rules and adds 85 guarded declarations:
two classes, two fields, 21 methods, 50 parameters and ten locals. There are now
926 rules. The raw Java input, local identities, decompiler, naming tool and
compilation dependency are unchanged. No generated source body was edited by
hand. The additions live in [geoblox-v16-border.json](rules/geoblox-v16-border.json);
the exact previous rules remain in [geoblox-v15.json](rules/geoblox-v15.json).

## Nine-slice sprite construction

The static helper originally called `n.a(IIIIBIIII)[Ldm;` is now
`MatchingTextValidator.buildNineSliceSprites`. Its class name describes its
instance validation role; obfuscation placed unrelated static helpers in the
same class. It allocates nine sprites in row-major order:

| Position | Sprite index | Dimensions |
| --- | --- | --- |
| Top left, top right, bottom left, bottom right | 0, 2, 6, 8 | `cornerSize × cornerSize` |
| Top, bottom | 1, 7 | `edgeLength × cornerSize` |
| Left, right | 3, 5 | `cornerSize × edgeLength` |
| Centre | 4 | `64 × 64` |

`cornerSize` is `innerAccentWidth + borderGap + outerBorderWidth`. The initial
traversal fills every sprite pixel with `fillColor`. The outward top and left
borders use `topLeftBorderColor`; bottom and right use `bottomRightBorderColor`.
`innerAccentColor` is applied to inward-facing bands over the first half of the
edge length. `referenceRetentionGuard` is the byte argument controlling unrelated
static-reference cleanup: value 1 keeps the references. It is not a rendering
mode, and its original side effects remain intact.

The wrapper `IntrusiveDeque.buildUnitBorderNineSliceSprites`, originally
`tf.a(IIIII)[Ldm;`, passes accent width, gap and outer border width 1, edge length
3 and retention guard 1. `wa.a` installs the result in UI border/background
skins. Its own guard and four colour arguments retain their original behavior.
The deque's class name also describes its instance role, independently of this
static factory.

The local names `slices`, `slicesToFill`, `sliceToFill` and `fillPixelIndex`
describe the initialization traversal. `borderIndex` and `scanIndex` are broad
because the decompiled method reuses them for several loops; they do not denote
one fixed x/y coordinate. `controlFlowGuard` preserves the snapshot of
`Geoblox.field_C`, including nonzero paths. Seven generated operand-stack
carriers still have opaque names because their values serve different roles at
different joins.

`clearStaticReferences`, originally `n.g(I)V`, clears the queue and resource
fields used by other static helpers. This pass does not label those fields as
sprite caches or infer their ownership from the border method.

## Matching text and validator contracts

`TextInputValidator`, originally `q`, stores the `validatedInput` and delegates
current-text queries to candidate-text queries. `MatchingTextValidator`,
originally `n`, stores a separate `referenceInput`. Its validation methods compare
candidate text with that input's current text and propagate its existing
validation state/message when applicable. `qh` installs it for a confirmation
field, and `mk` composes it with another validation stage.

All declarations in four override families receive the same name:

| Name | Original declaration family |
| --- | --- |
| `currentValidationState(int guard)` | `ib.e(I)Llh;`, `q.e(I)Llh;` |
| `currentValidationMessage(byte guard)` | `ib.b(B)String`, `q.b(B)String` |
| `validationStateForText(int guard, String candidateText)` | `a(I,String)Llh;` in `ag`, `cf`, `g`, `mk`, `n`, `q`, `uk` |
| `validationMessageForText(int guard, String candidateText)` | `b(I,String)String` in the same seven owners |

The manifest stores full JVM descriptors, rather than the shortened notation
in this table. The generic names cover different validators, including pending
asynchronous validation. They do not claim that every return is a final valid
or invalid result. Numeric guard values, exception context strings, input
mutation and status identities are preserved. The two matching-method locals
are named `referenceValidation`; unrelated callbacks and static helpers remain
unchanged.

## Reproduction and validation

Run the publication workflow:

```sh
node readable/build-geoblox-rules.mjs --check
node readable/tests/test-geoblox-rule-builder.mjs
node readable/tests/test-geoblox-text-rules.mjs
node readable/reproduce-geoblox.mjs --check
node readable/tools/restore-original.mjs readable/geoblox /tmp/geoblox-v16-restored
```

The rule builder has 24 tests. Its additions-only manifest guards the complete
previous rule bytes, source and tool pins, every original spelling, all four
complete override families and the pass-15 text-evidence reference. Regeneration
applies 16,050 identifier edits, compiles both complete 303-file corpora, preserves
all 154,109 bindings and 388 override relationships, and reproduces every output
byte. Dictionary-only reversal recovers all 303 original Java files without
reading the original input tree.

The actual nine-slice helper probe compares 2,592 cases per native, raw and
renamed variant: all sprite dimensions, every pixel-buffer digest, exception
classes and queue/resource cleanup effects. It covers nonzero client flags,
both cleanup values, zero and positive geometry widths, several edge lengths
and colour seeds. The native bytecode pin is checked before execution. The
common output SHA-256 remains
`16c92de1c3230786836344a4848c7046488b9cfa4a48078ca34024fdcbdc7be9`.
The existing deque, gameplay and text probes also pass. Exact commands and
scope are recorded in [validation.json](validation.json).

| Identity | SHA-256 |
| --- | --- |
| Raw Java tree | `6b638e579bfeb73adbb6583b0581f4d6df93c9ca5930816ea81bf1a48aa3f015` |
| Readable Java tree | `5051a73952b8ce3f709ed33dcaf16765a1db513d107dd533e6ee3b4c03a94200` |
| Pinned decompiler source archive | `98369c043d012743adb1924409bb754781722f4c2d6c7c7ab082cce5a82aeb20` |

The last digest identifies the decompiler repository source archive at
`e3268884ffc81e43bc60694439a297603b68a2e4`, not a gamepack or a Java output tree.
Pass 16 keeps that generator pin. The later loop-emission safety fix is a
separate decompiler commit; output compatibility does not silently replace a
publication's provenance.

The native probe covers the static sprite helper, not every validator method or
the whole game. Unknown classes, flags and shared joins remain. Full
result-sequence execution, successful asset loading and whole-game equivalence
still require further work. Zero dispatchers is a structural result, not a
claim of complete readability.
