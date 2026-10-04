# funorb-decompiled

Decompiled Java source for **FunOrb / AlterOrb** games.

This repository contains the reconstructed Java for 44 FunOrb/AlterOrb game
gamepacks, produced by a custom, **owned JavaScript decompiler** — not CFR,
Vineflower, or any other off-the-shelf tool. The decompiler is part of the
[java-tools](https://github.com/Kreijstal/java-tools) toolkit and was driven
over the obfuscated gamepacks by the pipeline in
[dekobloko-work](https://github.com/Kreijstal/dekobloko-work).

## Readable GeoBlox export

This repository owns the generated Java exports. The cloner repository owns
loading and diagnostics scripts and does not track `.java` files. The
readability generator, rules and proof fixtures belong in `dekobloko-work`; this
repository publishes their matching Java export, dictionary and provenance.

[`readable/geoblox/src`](readable/geoblox/src) contains the reproducible readable
mirror. The current [manifest](https://github.com/Kreijstal/dekobloko-work/blob/bccf54d50f98a2add3163a66b4db16d818dd7db4/readable/geoblox-rules.json) records its exact
input, guarded names and evidence; the [reproduction procedure](readable/README.md)
and [gameplay reading guide](readable/GEOBLOX-READING-GUIDE.md) describe the
current export. Names omit opaque suffixes and the dictionary preserves original
identities. Both 303-file Java corpora compile and compare 136,607 bindings,
preserving 388 override relationships.

Pass 162 adds 277 guarded names: 33 fields, fourteen methods, 29 parameters
and 201 locals. All 123 MusicDecodeStage and 195 MusicDecoder declarations now
have readable names; constructors follow the existing class rules. Floor setup,
neighbor prediction, residual reconstruction, paired point sorting and spectrum
multiplication are explicit. Decoder names expose codebooks, mode mappings,
short/long MDCT tables, window bounds, overlap buffers, loop metadata and PCM writes.

The floor/helper roles are inferred from matching source layouts and formulas
with [Xiph's Vorbis I specification](https://xiph.org/vorbis/doc/Vorbis_I_spec.html),
sections 7 and 9. This does not establish full codec compliance. The custom
packet container, validation omissions, shared floor scratch, first floor-line
write before end clamping, absent-floor path and all floating arithmetic remain.
Decoder cleanup still leaves setupLoaded unchanged. Budgeted decoding can still
exceed its remaining sample budget by the samples produced by one packet.
Reused locals retain every supported phase, including unused snapshots; buffer
swaps, aliases, partial effects, exception scopes and diagnostic literals stay intact.

The export has 16,192 rules and 109,015 identifier edits, plus eleven class-name
literal and 277 label edits: 109,303 total. All 15,915 previous complete rules,
19,498 dictionary identities, 136,607 bindings, 388 overrides and 811 label
records remain. Seven generated Java files change only in names. Both 303-file
corpora compile, reproduce and reverse byte exactly. Raw source and all tool,
workflow, stub, class-literal, label-policy and native pins stay fixed. All 27
publication tests pass. This pass adds/runs no native probes or runtime cases
and makes no new performance claim.

Eight large labeled bodies, 152 opaque labels, 210 opaque fields and 236
single-letter methods remain. Live setup/archive loading, music playback,
malformed-packet handling, full codec/game/browser/phone behavior and
heap/presented-FPS acceptance remain unverified.

Previous pass 161 adds 204 guarded names: twelve fields, fifteen methods, 33 parameters
and 144 locals. All 57 AgeValidator, 79 EmailValidator, 53 EmailAvailabilityValidator
and 103 UsernameAvailabilityValidator declarations now have readable names;
constructors follow class rules. Shared fields expose gameArchiveRequestPending,
reconnectingLoginMode, restartTutorialText, countryListDownloader, release-text
colors, email/username availability caches and optional error-report identity.
The private unusedCrc64Table retains its exact initialization and stores; no
element consumers or polynomial variant are inferred.

The validators preserve age1..130 checks, email syntax-helper results, matching
before email queries, candidate-cache write order and pending-query behavior.
Username cache invalidation clears only its text, retaining its availability
boolean. Pending email availability still selects valid-email message text;
this does not imply server acceptance. Reflection readiness checks only the
first queued request and treats failed lookup tasks as ready. Wrong guards,
nulls, partial cache effects and original exception contexts remain.

Shared helper names expose encrypted login writes and their guard-after-header
ordering, account-ineligibility marking, optional-login-text updates, proxy
connector construction, primitive/reflection class resolution, navigation action
requests and achievement-state gating. Original request flags, buffer writes,
RNG calls, cookie effects, callback order, renderer/input aliases, unused stores,
integer overflow, client-control flag values and diagnostic string literals stay
unchanged. Naming a navigation request or configured connector does not execute
browser navigation or open a socket.

The export has 15,915 rules and 107,323 identifier edits, plus eleven class-name
literal and 277 label edits: 107,611 total. All 15,711 previous complete rules,
19,498 dictionary identities, 136,607 bindings, 388 overrides and 811 label
records remain. Twenty-five generated Java files change only in names. Both
303-file corpora compile, reproduce and reverse byte exactly. Raw source and
all tool, workflow, stub, class-literal, label-policy and native pins stay fixed.
All 27 publication tests pass. No native probes, cases or performance results
are added or claimed by this naming pass.

Eight large labeled bodies, 152 opaque labels, 243 opaque fields and 250
single-letter methods remain. Live validation/query/cache interaction, cookie,
reflection/login/network/navigation behavior, server/assets/game/browser/phone
and heap/presented-FPS acceptance remain unverified.

Previous pass 160 adds 237 guarded names: three fields, eleven methods, 39 parameters,
183 locals and one lexical block label. All 224 declarations owned by LoginPanel
and all eighty owned by UsernameSuggestionsPanel now have readable names;
constructors follow class rules. Credential updates, login gating, account/lookup
transport, reflection replies, focus/button callbacks and suggestion construction
retain their existing execution order and effects.

advanceAccountCreationOrLookupRequest distinguishes opcode18 account creation
from opcode16 lookup, including affiliate/age/news fields, conditional string
inclusion, encryption, length backpatches, incremental reads, suggestion and
boolean replies, settings cookies, timeout and alternating ports. Reused locals
retain flags, offsets, reply codes, read lengths and port roles. Reflection names
expose lookup readiness, field operations, deserialized arguments, invocation
results, twelve exception reply codes and the CRC span. The plain
intRecordReplyDispatch label preserves its original break destination.

Suggestion updates still clear children before checking the guard, retain the
old button array for null/empty suggestions, share one renderer and scan every
button without an early callback-loop exit. Constructor renderer aliases,
unused snapshots, duplicate clears, wrong guards, client-control flag values,
partial effects, integer overflow and diagnostic string literals remain.
Shared names distinguish namedRootResourceArchive, the account/lookup reply
opcode stage and alternateLongAndTextPayloadKind without inventing server state.

The export has 15,711 rules and 106,634 identifier edits, plus eleven class-name
literal and 277 label edits: 106,922 total. All 15,474 previous complete rules,
19,498 dictionary identities, 136,607 bindings, 388 overrides and 811 label
records remain. Thirteen generated Java files change only in names. Both
303-file corpora compile, reproduce and reverse byte exactly. Expected label
edits increase by two for the one declaration and its
existing break; raw source and all tool, workflow, stub, class-literal and native
pins stay fixed. All 27 publication tests pass. No native probes, cases or
performance results are added or claimed by this naming pass.

Eight large labeled bodies, 152 opaque labels, 255 opaque fields and 265
single-letter methods remain. Live credential entry, suggestion interaction,
reflection/lookup/account-creation network behavior, server/assets/game/browser/
phone and heap/presented-FPS acceptance remain unverified.

Previous pass 159 adds 153 guarded names: two fields, twelve methods, 41 parameters
and 98 locals. All 187 declarations owned by AccountCreationForm now have
readable names; its constructor follows the class rule. Row builders expose
input, validation-message, validation-icon and hint layouts. Submission gates,
terms markup, dialog-layer rebuilding, keyboard focus, button/hotspot callbacks,
suggestions and shared cleanup retain their original guards and effects.

The constructor keeps shared email/confirmation and password/confirmation
renderer aliases. Row builders still add children before later guard failures.
The validation gate accepts a missing provider and every state other than the
three explicitly rejected states, including a null state; it does not imply
server acceptance. Login lookup still reads the active identifier twice and
filters only the discarded first result. The shared awaitingLoginLookupPayloadStage
follows actual packet consumers. unusedRankedEntryBooleans describes a ranked-entry
capacity buffer with no element consumers in the source; no element meaning is
invented. Client-control flag values, callback order, overflow, partial effects,
exception scopes and diagnostic string literals remain.

The export has 15,474 rules and 105,784 identifier edits, plus eleven class-name
literal and 275 label edits: 106,070 total. All 15,321 previous complete rules,
19,498 dictionary identities, 136,607 bindings, 388 overrides and 811 label
records remain. Six generated Java files change only in names. Raw source and
all tool, workflow, stub, label-policy and native-probe pins stay fixed. Both
303-file corpora compile, reproduce and reverse byte exactly. All 27 publication
tests pass. The existing raster/theme fixture retains its ten native/raw/readable
trace hashes for rasterization, shared-theme initialization and bootstrap
failures. It does not exercise account-form construction or interaction. No
native cases or performance results are added.

Eight large labeled bodies, 153 opaque labels, 258 opaque fields and 276
single-letter methods remain. Live account-form input, focus, submission and
login/network behavior, server/assets/game/browser/phone and heap/presented-FPS
acceptance remain unverified.

Previous pass 158 adds 111 guarded names: four fields, twelve methods, 25 parameters
and seventy locals. All 57 FadingDialog, 130 ResizableDialog and sixty
ProgressDialog declarations now have readable names; constructors follow class
rules. The complete three-declaration drawDialogFrame override family exposes
rounded bands, corner/edge calculations, frame sprites and progress text.
Shared fields identify wrappedTooltipLines, interfaceTextArchive, tooltipAgeTicks
and usernameLoginMethod.

Helper names show password checks against username text and configured length
bounds, account-name error messages, achievement-grid clicking, millisecond PCM
delays, username-flow identity checks and resource cleanup. Progress locals show
highlight toggles, Q16 percentages, packet writes and failures. Reused frame
registers retain both roles, including leftCornerDistanceSquaredOrRightEdgeLimit
and leftCornerRgbOrRightCornerX. Original guard effects, integer overflow,
partial drawing/writes, aliases, callback order, exception scopes and diagnostic
string literals remain; no client-control flag value is assumed.

The export has 15,321 rules and 105,286 identifier edits, plus eleven class-name
literal and 275 label edits: 105,572 total. All 15,210 previous complete rules,
19,498 dictionary identities, 136,607 bindings, 388 overrides and 811 label
records remain. Nineteen generated Java files change only in their names. Raw
Java, decompiler/naming/workflow/stub pins, label policy and all existing native
probe files/hashes stay fixed. Both 303-file corpora compile, reproduce and
reverse byte exactly. Existing raster/theme and text decoder/archive-context
native/raw/readable traces retain their hashes; all 27 publication tests pass.
This pass adds no new runtime probe or performance result.

Eight large labeled bodies, 153 opaque labels, 260 opaque fields and 288
single-letter methods remain. Live dialog fade/resize/frame/font rendering,
login/achievement interactions, server/assets/game/browser/phone and
heap/presented-FPS acceptance remain unverified.

Previous pass 157 adds 140 guarded names: nineteen fields, eight methods, seventeen
parameters, 87 locals and nine block labels. All eight remaining opaque
GameApplet methods now expose updateAppletTick, renderAppletFrame,
rebuildGameCanvas, startAppletServices, shutdownAppletServices, showGameError,
compactExceptionTrace and releaseMeshDepthBuckets. Every run-loop local and
block boundary is named. Shared fields identify the active/loader applets,
frame timer, update count, focus snapshot, two history rings and their indexes,
canvas offsets/refresh counter, initial clip dimensions and error-report CRC.

The source retains its original order: history writes precede focus copying and
callbacks; canvas refresh uses the old counter before increment/subtraction;
timing reset clears render history before update history and changes the tick
count last. Wrong guards, overflow, nonzero client flags, partial failures and
contextual exception fields remain. Real clock values are checked against bounds
and normalized in the trace; this is not a frame-pacing measurement.

The existing result-helper fixture adds 741 native/raw/readable cases: 180
updates, 324 renders, 225 timing resets, six cleanup guards and six focus
callbacks. They include 611 expected failures from injected callbacks, invalid
indexes/arrays/guards and the original nonzero-flag null-fullscreen path.
Independent state/event oracles check history/aliases, focus/monitor release,
refresh geometry and signed counter overflow, estimated rate arithmetic,
throwable identity and exact partial clears. All thirteen earlier trace hashes
remain unchanged. The 27 publication tests pass.

The export has 15,210 rules and 104,736 identifier edits, plus eleven class-name
literal and 275 label edits: 105,022 total. All 15,070 previous complete rules,
19,498 dictionary identities, 136,607 bindings, 388 overrides and 811 label
records remain. Twenty-four generated Java files change only in their names.
Both 303-file corpora compile, reproduce and reverse byte exactly. The expected
label-edit count increases by 25; raw Java, decompiler, naming/workflow/stub pins,
class-literal policy and label destinations stay fixed.

Eight large labeled bodies, 153 opaque labels, 264 opaque fields and 300
single-letter methods remain. Live AWT/fullscreen startup/shutdown/error pages,
whole run-loop timing, assets/server/game/browser/phone and heap/presented-FPS
acceptance remain unverified.

Previous pass 156 adds 82 guarded names: eight fields, eleven methods, fifteen parameters
and 48 locals. All eighteen declarations owned by FrameTimer and all 72 owned by
NanoFrameTimer now have readable names; the constructor follows its class rule.
The applet caller exposes awaitAndCountTicks, measureSleepMillis, advanceTicks and
resetForResume. Clock fields separate the accumulated time, scheduled deadline,
previous sample and ten-slot interval ring. The original sample count starts at
one and grows only when below one; no new smoothing policy is introduced.

Unrelated helpers in the timer class now show flushSessionWrites and ranking
reply locals. The pendingHighscoreQueries deque and ranked ratio component array
have their actual transport roles. Ranking views distinguish limited first rows,
normalized current-session rows and unique name-table indexes. Alternate-name and
record-long arrays remain local stores. Packet cursor rewinds, flattened write
indexes, cleanup guards, ten-tick cap and signed overflow are preserved.

The existing result-helper fixture adds 6,802 native/raw/readable cases: 4,608
BigInteger-based tick/overflow cases, 1,536 resets, 219 sampler/constructor cases,
162 callback wrappers, 129 ranking/prefix cases, 144 fake-socket queued writes and
four cleanups. There are 174 expected failures. Independent oracles check tick
state, sample rings/count/average arithmetic, stored real-clock bounds, callback
order and throwable identity, ranking views and 75 truncated prefixes, plus
buffer/stage/guard/queue effects. Actual nano samples are normalized in the trace;
fake sockets use existing dummy tasks and suppress idle keepalive. Negative,
zero and positive client flags remain. All twelve previous result-helper trace
pins retain their hashes.

The export has 15,070 rules and 104,152 identifier edits, plus eleven class-name
literal and 250 label edits: 104,413 total. All 14,988 previous complete rules
remain. Seventeen generated Java files change; raw code, generator/workflow/stub
pins, all 19,498 dictionary identities, 136,607 bindings, 388 overrides and 811
label records remain. Both 303-file corpora compile, reproduce and reverse byte
exactly. The 27 publication tests and affected native fixtures pass. No generated
Java body is hand edited and no decompiler change is required.

Eight large labeled bodies and 162 opaque labels remain, together with 283
opaque fields and 308 single-letter methods. Real-time pacing, idle cipher
keepalive, write-IOException closure, unmatched/unknown ranking replies, live
server/network/assets/game/browser/phone and heap/presented-FPS acceptance remain
unverified.

Pass 155 adds 77 guarded names: eleven fields, one method, five parameters and
sixty locals. All 119 declarations owned by WidgetTheme now have readable names;
its constructor follows the existing class rule. Renderer slots show text,
button, checkbox and text-input roles. The protected button constructor's fallback
slot is explicitly named but remains uninitialized by theme setup. Tooltip
padding, line spacing, wrapped border color and beveled panel construction are
visible both here and in MessageDialog's overrides.

Initialization keeps its original unused dial/slider/stripe/arrow renderer
constructions and aliased overlay sprites. Reused locals name every role:
wrapWidthOrBoxX and widthChunkCountOrLineIndexOrBoxY. Single-line and wrapped
boxes keep their different edge placement and padding rules. Wrong guards retain
recursive panel failures, partial drawing and the bottom-padding write. The
checkbox renderer is cleared by a false tooltip guard only after successful
drawing; glyph callback failures preserve it and the already drawn box.

The existing nine-slice fixture adds 2,634 native/raw/readable cases: ten
constructor/initialization cases and 2,624 tooltip/line-guard cases. Independent
oracles check renderer/default/panel/color/padding aliases, raster pixels, glyph
call geometry, explicit line breaks, quarter-raster balancing, clipping and
exception/Error identity. Twenty-six expected failures retain original partial
effects. Negative/positive control flags also exercise bootstrap-dependent account
widget failures with the shared theme deliberately null; successful setup is
checked separately. No client-control flag value is assumed. All nine previous
raster/widget trace pins remain.

The export has 14,988 rules and 103,778 identifier edits, plus eleven class-name
literal and 250 label edits: 104,039 total. All 14,911 previous complete rules
remain. Six generated Java files change; raw code, generator/workflow/stub pins,
all 19,498 dictionary identities, 136,607 bindings, 388 overrides and 811 label
records remain. Both 303-file corpora compile, reproduce and reverse byte exactly.
The 27 publication tests and affected native fixtures pass. No generated Java body
is hand edited and no decompiler change is required.

Eight large labeled bodies and 162 opaque labels remain, together with 291
opaque fields and 319 single-letter methods. Real fonts/assets, arbitrary markup
and callbacks, live account UI/network/game/server/browser/phone and heap/FPS
acceptance remain unverified.

Pass 154 adds 207 guarded names: five fields, 22 methods, 54 parameters and
126 locals. All 113 declarations owned by WidgetSkinState and all 119 owned by
StatefulWidgetRenderer have readable names; their three constructors follow
class rules. Callers now show replacing a state skin, setting offsets/colors,
copying properties, merging overlays and drawing the result. The renderer applies
base0, active1, pressed3 or hover2, focus5 and disabled4 in that exact order.

The names expose existing quirks without changing behavior: invalid setters can
write before returning null, reset keeps the overlay flag, invalid copying clears
the source panel array after the first target write, and copying skin properties
still shares sprites/arrays. Flushing draws and resets the old target before the
merge guard. Rendering restores the clip only on success. Shared fields are
traced through their actual consumers: username suggestions, intro face RGB,
text-template definitions, the decoded ranked ratio numerator and email local-part
characters. No client-control flag value is assumed.

The existing nine-slice fixture adds 9,061 native/raw/readable cases with
independent state, alias, guard-timing and pixel oracles: 769 constructor/reset,
472 setter/cleanup, 36 copy/null-target, 1,548 merge/flush/failure, 71 renderer
replace/copy/panel/range/cleanup and 6,165 state-order/alignment/failure cases.
They include 302 expected failures and negative/zero/positive control flags.
All eight previous raster trace hashes remain unchanged.

The export has 14,911 rules and 103,436 identifier edits, plus eleven class-name
literal and 250 label edits: 103,697 total. All 14,704 previous complete rules
remain. Seventeen generated Java files change; raw code, generator/workflow/stub
pins, all 19,498 dictionary identities, 136,607 bindings, 388 overrides and 811
label records remain. Both 303-file corpora compile, reproduce and reverse byte
exactly. The 27 publication tests and affected native fixtures pass. No generated
Java body is hand edited and no decompiler change is required.

Eight large labeled bodies and 162 opaque labels remain, together with 302
opaque fields and 320 single-letter methods. Real fonts/assets, arbitrary widget
callbacks, live dialogs/network, full-game/server/browser/phone and heap/FPS
acceptance remain unverified.

Pass 153 makes two stopping conditions explicit in board reconciliation:
connected-component detachment and clearing the visited table. Each infinite
loop's leading single labeled break becomes a negated loop header, followed by
the exact same break to its original enclosing frame. Board reconciliation
falls from 335 to 331 lines; eight large labeled bodies still remain.

Every own break, including a finally override, refuses this reconstruction.
Own continues still evaluate the guard at the next iteration, and every other
nonlocal transfer retains its target. Remaining body declarations, complete
try/catch/finally and monitor regions, and scalar-parent braces stay intact.
The guard is negated as written; no control-flag value or numeric type is assumed.

Four focused groups include six native variants checked against 5,184 independent
guard/body/finally event cases. They cover effectful/nullable guards, negative/
zero/positive flags, exception identity and partial effects, return snapshots,
finally backedges overriding pending exceptions, local scope and monitor release.
The emitter suite passes 125 tests with one existing skip. A clean tracked
decompiler-source tar reproduces all 303 files and unchanged diagnostics without
hard failures or fallbacks. The source proof reconstructs every expected token
stream and tags retained original tokens to verify the exact moved-break lexical
permutation, all 811 label records/destinations, 136,607 ordered ordinary bindings,
local ordinals and 388 overrides. No label is removed or retargeted.

All 14,704 complete naming rules and 102,972 edits remain unchanged. Both corpora
compile, reproduce and reverse byte exactly; 27 publication tests and the eight
native/raw/readable fixtures pass within their documented scopes. Only the
generated BoardReconciliationSupport body changes; no Java body is hand edited.
There are still 307 opaque fields, 342 single-letter methods and 162 opaque labels.
Full assets/gameplay, servers, browser/phone and heap/FPS acceptance remain unverified.

## Previous synthesized sound names (pass 152)

Pass 152 adds 86 guarded names: 22 fields, thirteen methods, eighteen
parameters and 33 locals. Every declaration in SoundFilter (45), SoundEnvelope
(22) and SynthesizedSoundEffect (25) has a readable name; constructors follow
the existing class rules. Their callers now show envelope reset/advance,
endpoint decode, pole-pair coefficient expansion, forward gain and signed PCM
mixing with millisecond loop boundaries. Reused slots keep names that cover
both roles, rather than implying a register has only one meaning.

The same result-helper fixture adds 134 native/raw/readable cases: 48 constant
envelope/reset trajectories, three explicit fixed-point ramps, 23 truncated/null
envelopes with partial-state/cursor traces, forty filter cases including NaN,
and twenty constructed square-wave mix/delay/saturation/PCM-loop cases. Flat
and ramp values, coefficient counts/unity/zero-radius cases, and mixing/loop
values have independent explicit oracles. Other filter coefficients and partial
decode state compare transformed native/raw/readable traces directly. All eleven
previous result-helper traces retain their reviewed hashes.

There are 14,704 rules and 102,711 identifier edits, plus eleven class-name
literal and 250 label edits: 102,972 total. All 14,618 previous complete rules
remain. Six generated Java files change; all raw code, source/tool/workflow/stub
pins, local ordinals, 136,607 bindings, 388 overrides and 811 lexical label
records remain. Both 303-file corpora compile, reproduce and reverse byte
exactly; the 27 publication tests and extended result-helper fixture pass.
No Java body is hand edited and no decompiler change is required.

Eight large labeled bodies and 162 opaque labels remain, together with 307
opaque fields and 342 short opaque methods. Full packed instruments, arbitrary
modulation/filtering, real archive assets, device playback, full-game/server/
browser/phone and heap/FPS acceptance remain unverified.

## Previous terminal loop headers (pass 151)

Pass 151 gives three loops their original guard headers: the frame loop in
GameApplet.run becomes do-while; MidiPcmStream.advanceMidiEvents and
LoginPanel.handleIntRecordReply use while guards. Partial true arms retain an
explicit fallthrough break, so a nonzero control flag or matching record does
not accidentally cause another iteration. Earlier continues and finally overrides
keep their original guard-evaluation point. No control-flag value is assumed.

The terminal trailing form permits only direct own guard continues plus a final
bare own break. Ordered short-circuit guards preserve callbacks, mutations and
nullable failures. Earlier/protected trailing backedges, prefix-owned direct
locals, potentially constant guards and unsupported/ambiguous syntax refuse.
The entry form preserves the complete arm scope/protected groups and retains
its break whenever the arm can fall through. Every existing destination remains.

The applet loop label L17 loses its only continue when the do-while condition
represents that repeat. Only this proven unused label is removed; one later
opaque label ordinal migrates. No guarded name changes. The corpus loses eight
lines, one bare break and one direct continue. Label definitions fall from 246
to 245 and lexical records from 813 to 811; all surviving targets remain.

Five new focused groups include twelve native variants checked against 48,924
independent event-model cases: 36,828 entry-header and 12,096 trailing-header
cases. Partial arms, negative/zero/positive flags, nullable/effectful guards,
finally backedges that override pending exceptions, return snapshots, local
scopes and monitor release are covered. The emitter suite passes 121 tests with
one existing skip. A clean tracked source tar reproduces all 303 files and
unchanged diagnostics, with no failures/fallbacks. The shared proof checks every
expected token stream, 136,607 ordered bindings, 388 overrides and every surviving
label identity, including the sole opaque ordinal migration.

All 14,618 complete naming rules and 102,435 edits remain. Both corpora compile,
reproduce and reverse byte exactly. The 27 publication checks and eight existing
native fixtures pass within their documented scopes. Eight large labeled bodies
remain unchanged; 162 opaque labels, 329 opaque fields and 355 short opaque methods
remain. Actual applet timing, full MIDI/live reply/network/assets/gameplay,
servers, browser/phone and heap/FPS acceptance remain unverified.

Pass 150 separates 54 noncompleting continuations from repeating loop prefixes
in 39 methods across 29 owners. The final section now follows an explicit loop
exit. Board reconciliation exposes moving/connectivity work, attached-entity
routing, transient recycling and final raster/achievement updates as sequential
sections. Session drawing/update, menu update/render helpers, Bzip2 selector
reading and output-state publication receive the same generic reconstruction.

All existing repeats must stay inside a complete prefix, and no existing own
break may skip the old continuation. Own exits, prefix-owned direct locals,
ambiguous/unsupported syntax, a prefix without normal completion and a suffix
that can fall through refuse reconstruction. Whole conditional, try/catch/finally,
switch, label and monitor constructs remain intact. Suffix local scope and scalar
parent braces remain. Earlier/finally continues still repeat; nonlocal transfers
still skip both sections. No control-flag value is assumed. Explicit breaks add
54 source lines while reducing continuation nesting; no labels are removed.

Four new focused groups include eight native variants checked against 18,432
independent event-model cases. Effectful else arms, nullable/effectful guards,
exception identity, partial effects, earlier repeats, finally backedges that
override pending exceptions, return snapshots and monitor release are covered.
The emitter suite passes 116 tests with one existing skip. A clean tracked source
tar reproduces all 303 Java files and unchanged diagnostics, without failures or
fallbacks. The shared source proof checks every expected token stream, all 136,607
ordered declaration/reference bindings, 388 overrides and 813 lexical label records,
plus the 54 added bare exits. No local or label ordinal migrates.

All 14,618 complete naming rules and 102,435 recorded edits remain unchanged.
Both corpora compile, reproduce and reverse byte exactly. The 27 publication
checks and eight existing native fixtures pass within their documented scopes.
Five large bodies change but eight remain: board reconciliation is 335 lines,
session render/update 346/630, menu update 327 and Bzip2 decodeBlocks 376.
There are still 163 opaque labels, 329 opaque fields and 355 short opaque methods.
Full assets/gameplay, servers, browser/phone and heap/FPS acceptance remain unverified.

Pass 149 reconstructs thirteen guarded infinite loops as explicit `do…while`
loops in twelve methods across nine owners. Bzip2 run decoding now repeats while
`symbol == 0 || symbol == 1`; its decodeBlocks body falls from 381 to 375 lines.
PCM sample/mixer loops, hash table iterators, timer catch-up, collision scanning,
packet string readers and bounded random rejection sampling use the same generic
proof. The complete raw corpus loses 42 lines and fourteen bare continues.

A candidate must have a complete prefix, direct conditional own backedges and
a noncompleting continuation. Ordered short-circuit OR preserves each guard's
callbacks, mutations, nullable unboxing and skipped later tests. Own breaks,
earlier/protected continues, body-owned prefix locals, potentially constant
guards, unsupported/ambiguous syntax and fallthrough continuations refuse.
Protected prefix groups, finally overrides, monitors, scalar-parent braces and
continuation local scopes stay intact. The client control flag may be nonzero.

The emitter suite passes 112 tests with one existing skip. Four new focused
groups include six native variants checked against 12,096 independent event-model
cases. A clean tracked decompiler source tar reproduces all 303 Java files and
unchanged diagnostics, with no hard failures or fallbacks. The shared source proof
checks all complete expected token streams, 136,607 ordered bindings, 388 override
pairs and 813 lexical label records; no local or label ordinal migrates.

All 14,618 complete naming rules remain unchanged, with 102,435 recorded edits.
Both corpora compile, reproduce and reverse byte exactly. The 27 publication
checks and eight existing native fixtures pass within their recorded scopes,
including forty Bzip2 payload/partial-output/malformed-input/recovery cases.
Eight large labeled bodies remain, together with 163 opaque labels, 329 opaque
fields and 355 short opaque methods. Full assets/gameplay, servers, browser/phone
and heap/FPS acceptance remain unverified.

Pass 148 adds 560 guarded rules: 31 fields, fifty methods, 194 parameters,
284 locals and one label. Every declaration in TextWidgetLayout (43),
TextWidgetRenderer (283), TextLayout (74), TextLayoutLine (20) and
CachedTextLayout (117) has a readable name; constructors follow class rules.
The complete layout interface and display-text/password override families now
expose hitTestCaretIndex, drawSelection, drawCaret, getTextLayout, origins,
available viewport dimensions and padded metrics. Maximum line end X retains
its alignment offsets; it is not presented as plain string width.

Padding, colors, selection ARGB, font/alignment/spacing, line bounds and caret
positions follow producers and consumers. populateCaretPositions exposes the
existing markup-anchor and fixed256 space-justification arithmetic. Cache keys
and aliases remain exact: single-line caches omit anchor/baseline, centered
layout never saves cachedText, null text clears lines without clearing keys,
and paragraph alignment/spacing mutations keep their original behavior.
Selection still passes bottomY as rectangle height. Clip restoration remains
on successful paths, not an invented finally. Overflow, guards, partial
failures, password masking, caller ordering and all client-control paths stay.

Shared progress image, unread ticket message, reconnect-error-page suppression,
fullscreen pointer origin and intro frame/red tint have grounded names.
textDrawingCompletion names one existing frame and three breaks; label edits
grow from 246 to 250 without removing control flow. There are 14,618 rules and
102,174 identifier edits, plus eleven class-literal and 250 label edits:
102,435 total. All 14,058 previous complete rules and raw/tool/workflow/stub/
native/text pins remain. Both 303-file corpora compile, preserve 136,607
bindings, 388 overrides and 813 lexical label records, and reverse byte exactly.
The 27 publication tests and eight existing native fixtures pass within their
recorded scopes. Full fonts/markup/cache/caret/selection, arbitrary callbacks,
async input/assets and device behavior are not newly executed. Eight large
labeled bodies, 163 opaque labels, 329 opaque fields and 355 short opaque
methods remain; whole-game/server/device and heap/FPS acceptance remain unverified.

Pass 147 adds 148 guarded names: fifteen fields, 24 methods, 49 parameters
and 60 locals. Every declaration in ValidatedTextInputWidget (49),
DebouncedValidationProvider (40), TextInputValidator (86), CheckboxRenderer
(59) and ValidationProvider (nine) now has a readable name; constructors follow
class rules. Complete API families expose isInputEmpty,
getDebouncedValidationMessage, getDebouncedValidationState and resetValidationDelay.
Empty, debouncing, invalid, query-pending and valid singleton states follow
actual validators and icon/message consumers. The exact 350ms boundary, signed
clock arithmetic, empty-input short circuit and original guards remain.

The account-name chain names length/normalization/separator structure and
per-character checks, preserving wrong-guard early success and arbitrary
CharSequence callbacks. Checkbox drawing/constructor roles, pointer-local X,
tooltip anchors, validation provider assignment and pointer-listener monitor
are explicit. Shared logo delay and optional login-response extension bytes
follow their consumers without inventing producers or payload semantics.
handleLoginUiResponse exposes existing visible-dialog processing, response
8-to-2 remapping, response-10 name-panel routing, guarded reset and partial
failure order. Dial reference angle and fullscreen-unavailable token follow
their actual consumers.

There are 14,058 rules and 100,022 identifier edits, plus eleven class-literal
and 246 label edits: 100,279 total. All 13,910 previous complete rules and
raw/tool/workflow/stub/native/text pins remain. Both 303-file corpora compile,
preserve 136,607 bindings, 388 overrides and 813 lexical label records, and
reverse byte exactly. The 27 publication tests and eight existing native
fixtures pass within their recorded scopes. Live asynchronous editing, remote
availability/login services, arbitrary CharSequence implementations and device
behavior remain unverified. Eight large labeled bodies, 164 opaque labels,
360 opaque fields and 405 short opaque methods remain; whole-game/server/
device and heap/FPS acceptance are still unverified.

Pass 146 adds 180 guarded names: eleven fields, 25 methods, 46 parameters
and 98 locals. All 95 ButtonWidget, 156 TextInputWidget and seven
TextInputListener declarations now have readable names; constructors follow
class rules. Both text-listener implementations and the validated-input
notification override retain complete, consistently named callback families.

Caret and selection indexes, ASCII-space word boundaries, double-click drag,
clipboard copy/cut/paste, input limits, scrolling, blink timing and submission
now expose their roles. Numeric keys/guards, UTF-16 indexes, the strict 250ms
press comparison, signed blink remainder, callback order and sprite aliases
remain unchanged. Verified transformed bytecode confirms the bounded insertion
branch returns when remaining capacity is nonnegative, and otherwise attempts
a negative substring bound. Naming preserves that behavior and clipboard
partial edits; it does not repair input behavior.

Compiler-resolved uses establish canvasOffsetY, accountContentDialog and
overlongTextFailure. requestJustPlay names the actual button/simple-UI route
through progress display and pending action 4; no new login/server semantics
are inferred. There are 13,910 rules and 99,493 identifier edits, plus eleven
class-literal and 246 label edits: 99,750 total. All 13,730 previous complete
rules and raw/tool/workflow/stub/native/text pins remain unchanged. Both
303-file corpora compile, preserve 136,607 bindings, 388 overrides and 813
lexical label records, and reverse byte exactly. The 27 publication tests and
eight existing native fixtures pass within their recorded scopes. Full live
editing, clipboard, selection/blink and device behavior remain unverified.
Eight large labeled bodies, 164 opaque labels, 375 opaque fields and 429
short opaque methods remain. Whole-game/server/device and heap/FPS acceptance
are still unverified.

Pass 145 adds 122 guarded rules: three fields, five methods, fifteen
parameters, 97 locals and two labels. All 243 UiWidget and 219 WidgetContainer
declarations now have readable names; constructors follow class rules and
toString keeps its JDK spelling. requestPreviousChildFocus/requestNextChildFocus
expose the actual nonwrapping scans after focused children. First-focus
acquisition, reverse draw order, forward input/layout/hover traversal,
linked-node early exits, cursor positions and callback order stay intact.

Compiler-resolved field references establish textOffsetX/textOffsetY/textLayout
across the text-input and renderer holders. Caret-driven X adjustment, the
wrong-guard bounds store of 112, only-zero owned Y stores and lazy layout/cache
aliases remain. appendRsaXteaEncryptedBuffer names the existing source/destination
wrapper; exponent/modulus argument order, signed BigInteger transformation,
random/scratch state and guarded query cleanup are unchanged.

pointerPressWithoutWheel and pointerPressWithWheel name two existing frames
and their breaks. Numeric keys 80/81, wheel coordinates, release-guard effects
and all nonzero client-control paths remain. Label edit accounting grows from
242 to 246; no frame or transfer is removed. There are 13,730 rules and 98,806
identifier edits, plus eleven class-literal and 246 label edits: 99,063 total.
All 13,608 previous complete rules and raw/tool/workflow/stub/native/text pins
remain. Both 303-file corpora compile, preserve 136,607 bindings, 388 overrides
and 813 lexical label records, and reverse byte exactly. The 27 publication
tests and eight existing native fixtures pass within their recorded scopes.
Live AWT input, arbitrary callback-driven list mutations, complete text
scrolling/layout and encrypted-payload interoperability remain unverified.
Eight large labeled bodies and 164 opaque labels remain; full-game/server/
device and heap/FPS acceptance are still unverified.

Previous naming pass:

Pass 144 adds 251 guarded rules: 17 methods, 58 parameters, 174 locals and
two labels. Every SingleChildWidget field, method, parameter and local is now
named. appendWidgetDiagnostics identifies all five owned overrides;
appendWidgetDiagnosticProperties, beginWidgetDiagnosticVisit and the child
helpers expose formatting and traversal. The visited Hashtable retains entries,
so the existing circular marker includes shared revisits. Renderer/listener
widget checks still recurse on this same widget receiver, with the original
output aliases, callback order and nonzero client-control fallthrough.

getLastRenderPass names the inclusive pass index: base zero, child delegation
or container maximum. renderWidgetPassesAndTooltip retains the supplied start,
integer increment/overflow, client-control exit and tooltip order. Base key
input and child delegation now expose their actual roles. The two private
requestUnfocusedChildFocus overloads keep identical child predicates/bodies and
different guards; no forward/backward navigation is invented. Numeric key codes 80/81,
child-origin additions, unchanged wheel coordinates and nullable hover fallback
remain exact.

rendererDiagnosticFormatting and listenerDiagnosticFormatting name existing
plain frames and their two breaks. No frame or transfer is removed; label edit
accounting grows from 238 to 242. There are 13,608 rules and 98,370 identifier
edits, plus eleven class-literal and 242 label edits: 98,623 total. All 13,357
previous complete rules and raw/tool/workflow/stub/native/text pins remain.
Both 303-file corpora compile, preserve 136,607 bindings, 388 overrides and 813
lexical label records, and reverse byte exactly. The 27 publication tests and
eight existing native fixtures pass within their recorded scopes. Arbitrary
diagnostic callback recursion, live AWT input and complete render-pass/device
behavior remain unverified. Eight large labeled bodies and 166 opaque labels
remain; full-game/server/device and heap/FPS acceptance are still unverified.

Previous naming pass:

Pass 143 adds 56 guarded rules: seven fields, four methods, twelve parameters
and 33 locals. The complete incoming-packet reader now exposes
readNextIncomingPacket, readSessionPacketPayload and readSessionBytesIfAvailable.
Fixed and one-byte/two-byte variable lengths, partial-read progress, activity
timeout, opcode history, delayed replay/enqueue and Gaussian delay cast/clamp
retain their original behavior. The strict delivery-time comparison and all
wrong-guard/exception/copy effects remain. Delay defaults are zero; no owned
nonzero delay producer or delayed-queue initializer is invented.

sortRankedEntryRange names partition/bubble roles, prefix cutoff and selected
keys; rankedEntryIndices names the shared index array. Integral midpoint,
comparator, recursion and preincrement ordering stay intact. fpsTextTemplate
names the actual gameplay text. No generated Java body is hand edited.

There are 13,357 rules and 97,588 identifier edits, plus eleven class-literal
and 238 label edits: 97,837 total. All 13,301 previous complete rules and raw/
tool/workflow/stub/native/text pins remain unchanged. Both 303-file corpora
compile and preserve 136,607 bindings, 388 overrides and 813 lexical label
records; all 303 files reverse byte exactly. The 27 publication tests and eight
existing native fixtures pass within their recorded scopes. Live socket/framing
timing and exhaustive ranked sorting are outside those fixtures. Eight large
labeled bodies and 168 opaque labels remain; full-game/server/device and
heap/FPS acceptance remain unverified.

Previous naming pass:

Pass 142 adds 227 guarded rules: 36 fields, 29 methods, 68 parameters,
91 locals and three labels. Every MidiPcmStream and MidiNote field, method,
parameter, local and label is now named. All prior complete naming rules remain.

MIDI playback exposes heldNotesByKey versus notesByKeyGroup, default/current
instrument ids and bank offsets, channel volume/expression/pan/pitch bend,
modulation/portamento/gain/selected-parameter/retrigger state, and earliest-track
clock values. dispatchMidiEvent, startNote/releaseNote, computeNoteVolume/Pan/
SampleStep, resetSynthesisState and advanceMidiEvents identify the existing
paths. Velocity-squared gain, note age/vibrato/decay/envelope indexes, held and
release states, note reuse/group replacement and exact controller masks/numbers
remain. Pressure handlers are still guarded stubs. Pending-score fields retain
their branches; no owned queue producer or new playback feature is invented.

Shared input/sprite/keyboard/session helpers are named in their actual roles.
MidiNote.stagedIncomingPacketOpcode comes from SingleChildWidget's real cipher
header reader and dispatch/delay path; it is not an audio-only status field.
clearAudioReferences still writes 41 into that packet state on its wrong guard.
All wrong-guard effects, diagnostics, numeric states, overflow/floating/division,
callback/partial-effect order, synchronization and client-control reads remain.

The existing eventTrackSelection loop, portamentoReleaseSelection block and
releaseEnvelopeAdvance block keep their frames and five labeled transfers.
Only names and label accounting change: 230 to 238 edits. There are 13,301 rules
and 97,288 identifier edits, plus eleven class-literal and 238 label edits:
97,537 total. All 13,074 prior complete rules and raw/tool/workflow/stub/native/
text pins remain unchanged. Both 303-file corpora compile and preserve 136,607
bindings, 388 overrides and 813 lexical label records; all 303 files reverse
byte exactly. The 27 publication tests and eight existing native fixtures pass
within their recorded scopes. Full MIDI controller/envelope/event timing,
live input/network/audio devices and full-game/assets/server/heap/FPS behavior
remain unverified. Eight large labeled bodies and 168 opaque labels remain.

Previous naming pass:

Pass 141 adds 418 guarded rules: 13 fields, 28 methods, 227 parameters,
132 locals and 18 labels. Every PcmSampleStream field, method, parameter,
local and label is now named. The original arithmetic and source bodies remain.

The 16 mixing kernels expose forward/reverse, mono/stereo, aligned/interpolated
and fixed/ramped volume variants. mixForwardToBoundary/mixReverseToBoundary
select them using the original step/alignment, stereo and ramp state. Parameter
names retain reused units and roles: fixed position becomes integer source
index in aligned kernels, stereo frame indexes become interleaved array indexes,
and scratch source indexes can become a boundary sample or copied step. Saved
source/destination indexes describe each original unrolled or tail write;
increment/decrement order and += accumulation do not change.

Playback fields expose loopsRemaining, pingPongLoop, loopStart/loopEnd,
target/current volumes, targetPan, rampFramesRemaining and gain steps. Methods
expose refreshCurrentVolumes, finishOrContinueVolumeRamp, cancelVolumeRamp,
setVolumeAndPan, setReversePlayback and equal-power left/right gain helpers.
Negative loop counts, MIN_VALUE fade sentinel, step overflow, shifts,
interpolation boundaries, wrap/reflection, signed division/remainder and
synchronized state updates remain, including partial failure effects.

All 18 existing plain labels are named: interiorFrameLimit/boundaryFrameLimit
in interpolation kernels and finiteLoopMixing/finiteLoopSkipping around the
finite-loop paths. Their 22 breaks retain their targets; no frame or transfer
is removed. Explicit accounting grows from 190 to 230 label edits. There are
13,074 rules and 96,034 identifier edits, plus eleven class-literal and 230
label edits: 96,275 total. All 12,656 prior complete rules and raw/tool/workflow/
stub/native/text pins remain unchanged. Both 303-file corpora compile and
preserve 136,607 bindings, 388 overrides and 813 lexical label records; all
303 files reverse byte exactly. The 27 publication tests and eight existing
native fixtures pass within their recorded scopes. These fixtures cover
factory/position/music-data behavior, not exhaustive PCM mix/ramp/loop kernels
or live audio devices. Eight large labeled bodies and 171 opaque labels remain;
full-game/assets/server/device and heap/FPS acceptance are still unverified.

Previous naming pass:

Pass 140 adds 208 guarded rules: 25 fields, 27 methods, 49 parameters,
106 locals and one label. All fields, methods, parameters and locals in
PcmStreamMixer, PcmMixerListener, DelayedPcmStream and MidiNoteMixer now have
names. Other note/controller fields and optimized sample kernels remain opaque.

The mixer exposes childStreams, scheduledListeners, nextListenerFrameOffset,
normalizeListenerFrameOffsets and insertListenerByFrameOffset. Mixing and
skipping consume the exact deadline chunk, invoke the listener under its
monitor, then remove or reinsert it using the callback's signed result. Equal
deadline insertion, zero-frame handling and nested locking remain. No owned
concrete listener implementation exists; its private constructor still throws
Error, and callback internals are not invented.

Delayed streams expose wrappedStream and remainingDelayFrames, retaining their
list replacement before processing the positive remainder and the original
pointer-write order. MIDI notes expose sampleStream, channelIndex, keyNumber,
framesUntilUpdate and retriggerPhaseFixed. mixNoteFrames/skipNoteFrames and the
selected owner helpers retain 20-bit phase arithmetic, guard effects, sample
position reflection, stream recreation, loop flags and old-stream fades. Sample
controls now read fadeOutAndUnlink, rampVolumeAndPan, setLoopCount and
getTargetVolume. Signed sentinels, overflow, locks and partial effects remain.

noteSkipCompletion names the existing plain note-completion frame and its one
break; no frame or transfer is removed. Explicit label accounting grows from
188 to 190 edits. There are 12,656 rules and 92,977 identifier edits, plus eleven
class-literal and 190 label edits: 93,178 total. All 12,448 prior complete rules
and raw/tool/workflow/stub/native/text pins remain unchanged. Both 303-file
corpora compile and preserve 136,607 bindings, 388 overrides and 813 lexical
label records; all 303 files reverse byte exactly. The 27 publication tests
and eight existing native fixtures pass within their recorded scopes. Those
fixtures do not establish listener callback scheduling, real devices or live
MIDI retriggering/service timing. Eight large labeled bodies and 189 opaque
labels remain; full-game/assets/server/device and heap/FPS acceptance are
still unverified.

Previous naming pass:

Pass 139 adds 199 guarded rules: 31 fields, 57 methods, 45 parameters,
65 locals and one label. Every AudioOutput and JavaSoundAudioOutput field,
method, parameter and local is named. The PcmStream contract and all owned
overrides now expose firstChildStream/nextChildStream, mixInto/skipFrames,
getSchedulingPriority and getSchedulingCost; their bodies stay intact.

AudioOutput exposes requested/adaptive buffering, drain checks, reopen time,
stream-time catch-up, root stream and eight priority queues. mixBlock selects
streams against schedulingWorkLimit, clears priority links and then mixes the
root. streamSelection names its existing plain budget-exit block; the frame,
exit and cleanup remain. Label accounting grows from 186 to 188 edits explicitly.

Java Sound hooks expose initializeDevice, openDevice, getQueuedFrames,
writeMixBlock, flushDevice and closeDevice. Signed 24-bit clipping and signed 16-bit
little-endian packing remain. Any listed mixer name containing soundmax retains
reopen-after-flush behavior; this is not a new mixer-selection policy. Capacity
rounding and power-of-two retry, base no-op hooks, Throwable silent-output
fallback and any partial service/device installation remain. Volatile flags,
synchronized calls, callback order, 256-frame blocks, 16384-frame cap and
two-second drain/reopen timing are unchanged. No runtime scheduling optimization
or new physical-device validation is claimed.

There are 12,448 rules and 91,653 identifier edits, plus eleven class-literal
and 188 label edits: 91,852 total. All 12,249 prior complete rules and raw/tool/
workflow/stub/native/text pins remain. Both 303-file corpora compile, preserving
136,607 bindings, 388 overrides and 813 lexical label records, and all 303 files
reverse byte exactly. The 27 publication checks and eight existing native
fixtures pass within their recorded scopes. Native music fixtures control PCM
and sample state; real devices, service timing and complete live scheduling
remain unverified. Eight large labeled bodies and 190 opaque labels remain;
full-game/assets/server/device and heap/FPS acceptance remain unverified.

Previous naming pass:

Pass 138 adds 105 guarded rules: 23 fields, nine methods, 18 parameters,
54 locals and one label. Social packet updates and both name-hash lookups now
have named parameters/locals and storage. `primarySocialEntriesByNameHash`,
`primarySocialEntriesInOrder`, `secondarySocialEntriesInOrder` and the two
next-insertion indexes expose the structures used by the existing response path.
The generic intrusive operation is now `insertNodeBefore`.

Primary lookup rejects invalid normalized names; secondary lookup retains its
original-text fallback. Renaming/rekeying, hash-collision traversal, interned
location reference equality, integer subtraction/overflow and partial queue
updates remain. `insertionTargetSelection` names the existing plain block that
chooses the entry/target carrier under the original client-control flag. Its
declaration and one break account for two additional label edits; neither the
frame nor its exit is removed. The manifest records that accounting change
explicitly. Packed social settings retain neutral low/middle/high slot names,
original two-bit extraction, clamp order and invalid-guard effects.

`soundEffectVolume`, `trackedSoundEffectStreams` and `updateSoundEffectVolume`
expose the shared effects gain and live-holder update path. The original divide
by 80, floating 1.399999976158142 multiplier, overflow and guard-after-store remain.
The loading route exposes `setLoadingProgress`, `drawLoadingProgressDialog`,
`loadingStatusText`, `loadingScaledProgress` and `getBootstrapLoadingStatusText`.
Fixed translations and archive-readiness order remain; this is not a new UI.

Every field, method, parameter and local in `AudioService` is now named; its
public Runnable `run` name remains. Two volatile output slots, running/stop flags,
dispatcher pumping, ten-millisecond polling, error reporting and finally cleanup
keep their original ordering. Unknown friend/ignore/permission semantics and
unused private style-slot meanings are not invented.

There are 12,249 rules and 90,785 identifier edits, plus eleven class-literal
and 186 label edits: 90,982 total. All 12,144 prior complete rules and the raw,
decompiler, naming, workflow, stub, native and text pins remain unchanged.
Both 303-file corpora compile and preserve 136,607 bindings, 388 overrides
and 813 lexical label records; all 303 files reverse byte exactly. The 27
publication checks and eight existing native fixtures pass within their scopes.
The fixtures do not establish a live social server, real audio device worker
or complete loading-dialog execution. Eight large labeled bodies and 191
opaque labels remain. Full-game/assets/server/device and heap/FPS acceptance
remain unverified.

Previous naming pass:

Pass 137 adds 232 guarded rules: 25 fields, 26 methods, 60 parameters and
121 locals. Every field, method, parameter and local in `SessionGameApplet`
is now named. Applet bootstrap fields expose server ports/host/number, game CRC,
instance id, member mode, language and affiliate id from their original
parameter keys. Archive ids now distinguish game/interface text, common UI
sprites, UI fonts and the combined button/logo archive.

The central paths are `initializeGameApplet`, `initializeFromAppletParameters`,
`initializeSessionAppletServices`, `updateSessionBootstrapAndInput`,
`updateBootstrapUi`, `pollReconnectAndResendRequests` and
`processAccountUiActions`. The packet enable and length tables now expose
`enabledSessionPacketOpcodes` and `sessionPacketLengthByOpcode`; variable lengths
keep their original -1/-2 byte/short framing. Reply-family methods preserve
original opcode values, enable order, resend order and guard effects.

`requestIdleDisconnect` names the flag set by the gameplay `brk` command and
consumed through the existing idle-disconnect branch. `canvasReplacementRequested`
names the paint-driven canvas rebuild flag. `pollAccountDialogAction` still
processes dialog pointer/animation/keyboard input, consumes pending actions and
returns original request-state actions; it is not a zero-return stub.
The adapter retains its unused language, wheel and fullscreen inputs.

URL helpers expose `applySessionOverridesToUrl`, `rewriteSessionUrlPath`,
`handleOpenUrlPacket` and `openUrlInNewWindow`. The unusual settings/session
alias, repeated assignments, ignored navigation flag and original URL fallback
remain. Path rewriting adds no new encoding or policy. The patched
`isAppletStartupAllowed` still returns true; it implies no domain validation.
Bootstrap keeps language edge cases, partial initialization and nested catches.

There are 12,144 rules and 90,308 identifier edits, plus eleven class-literal
and 184 label edits: 90,503 total. All 11,912 prior complete rules and the raw,
decompiler, naming, workflow, stub, native and text pins remain unchanged.
Both 303-file corpora compile, preserve 136,607 bindings, 388 override
relationships and 813 lexical label records, and reverse byte exactly.
The 27 publication checks and eight existing native fixtures pass within their
recorded scopes; they do not establish live applet/session/country-list/browser
services. No source bodies or bytecode change. Eight large labeled bodies,
192 opaque labels and other unmapped members remain. Full-game/assets/server/
device and heap/FPS acceptance remain unverified.

Previous naming pass:

Pass 136 adds 100 guarded rules: 25 fields, nine methods, 19 parameters and
47 locals. Ten previous names are explicitly corrected. `ReceivedTextRecord`
replaces `ClientSessionSnapshot`: the opcode 11/12 reader creates one text
record, rather than a complete client-state snapshot. `SessionTextHistorySupport`
exposes `retainTextRecord`; its storage, count, category counters and limit now
have inspected names. The reader staging fields identify the header, metadata,
long source id, split 16/24-bit record id, primary/display names and text.

`dispatchSessionPacket`, `readSessionTextRecord`,
`retainReceivedTextRecordIfNew` and `getRetentionCategory` expose the complete
received-record route. Duplicate rejection compares any incoming nonzero id
against existing kind-two records; it does not require incoming kind two.
Retention still counts and compacts in place, with its original guard position,
array aliasing, counter writes and partial failure effects. Unknown wire kinds
and metadata meanings are not assigned chat-channel or permission names.

`isAsciiLetterOrDigit`, `isAllowedNameCharacter`, `normalizeNameCharacter`
and their two character arrays now expose the exact name-normalization helpers.
Separator folding, listed Latin accents, the unusual sharp-s to `b` mapping,
lowercasing and wrong-guard cleanup remain unchanged. `hasPrimarySocialEntry`
names the actual lookup predicate; no friend/ignore semantics are assumed.
`formatArchiveGroupProgress` retains its waiting-text return before the guard.

The export has 11,912 rules and 89,441 identifier edits, plus eleven
class-literal and 184 label edits: 89,636 total. All 11,802 unaffected complete
rules, raw input and decompiler/naming/workflow/stub/native/text pins remain.
Both 303-file corpora compile and preserve 136,607 ordered bindings, 388
override relationships and 813 lexical label records. All 303 files reverse
byte exactly; the 27 publication checks and eight existing native probes pass
within their documented scopes. The probes do not execute complete received-text
or social initialization against a live server. No raw bodies or bytecode change.
Eight large labeled bodies, 192 opaque labels and other unmapped members remain;
full-game/assets/server/browser/phone and heap/FPS acceptance remain unverified.

Previous structural pass:

Pass 135 changes the ending-entity radius column test in
`GameplaySession.updateResultSequence` from `while` to `if`.
Its body cannot fall through or continue to that test: after scanning rows and
advancing the column it continues the enclosing column loop. Nonzero client
control flags keep their existing exit. The generic decompiler now proves this
single-evaluation shape using lexical transfer destinations and completion sets.
Only the keyword changes; the exact condition, complete body, outer backedge,
declarations, labels, guards and protected/monitor boundaries stay intact.

Labeled breaks remain legal with the same label. Bare own breaks, own continues,
normal body completion, potentially constant guards, ambiguous destinations and
unsupported syntax refuse recovery. Inner loop/switch/label exits are consumed
only by their own destination; catches stay conservative and finally overrides
retain their effects. Five focused groups pass, including eight native variants
with 512 comparisons against 512 independent event-model cases. They cover
nullable/effectful guards, exception identity and catch order, finally return
snapshots and overrides, labeled/enclosing exits, scopes and monitor release.
The relevant decompiler suite passes 118 tests with one existing skip.

Fresh CLI decompilation from the tracked source archive produces all 303 files
with no hard failures or fallbacks. Only the predicted keyword changes;
diagnostics are byte identical. The shared source proof independently replays
all 303 complete token streams and preserves 136,607 ordered Java bindings,
388 overrides and 813 lexical label records without ordinal migrations.
All 11,812 complete naming rules and 89,130 edits remain; both corpora compile
and all 303 files reverse byte exactly. The 27 publication checks and eight
fixed native probes pass within their documented scopes. The result-sequence
probe retains 27 controlled sequences and 26,043 ticks with minimal sprites;
it does not establish full asset/device behavior. Eight large labeled bodies,
192 opaque labels and other unmapped members remain. Full-game/assets/server/
browser/phone and heap/FPS acceptance remain unverified.

Pass 134 adds 177 guarded names: eleven fields, 22 methods, 48 parameters
and 96 locals. Cache code now exposes `entryWeight`, `weightCapacity`,
`remainingWeightCapacity`, `entriesByKey`, `recencyQueue`, `getByKey`,
`putWeighted`, `removeByKey`, `removeEntry` and `getReferent`.
All parameters, locals and methods in the five audited cache/reference and
secondary collection classes are named. The template-definition cache caller,
account resource setup/username response, progress dialog, login payload factory
and shared name slots also use inspected roles.

Two previous rules are explicitly corrected: `readSessionTextAndHash` becomes
`readSessionNameAndNormalize`, and `textForHash` becomes `nameToNormalize`.
The called `normalizeSessionName` trims separators, validates length and maps
characters; it does not produce a hash. Received text and normalized name remain
separate fields. The country-list helper still only has its original guard side
effect; downloaded text is unused. The cache's private constructor still throws
Error, and this corpus contains only the strong reference subclass. The promotion
predicate is named for its lookup decision, without inventing soft-reference
implementations. Achievement id 13 in `WeightedObjectCache.field_g` stays opaque
because its title is not established.

The export has 11,812 rules and 88,935 identifier edits, plus eleven class-literal
and 184 label edits: 89,130 edits in total. All 11,633 unaffected complete rules
and the raw/decompiler/naming/workflow/stub/native/text pins remain unchanged.
Thirty generated Java files change through declarations and their callers.
Both 303-file corpora compile, preserving 136,607 ordered bindings, 388 overrides
and 813 lexical label records; all 303 files reverse byte exactly to raw Git.
The existing 27 publication checks, eight fixed native probes and deque fixture
pass within their documented scopes. The label-refusal test now creates its own
source migration, so it also works during naming-only passes. No raw bodies,
numeric states, guards, evaluation order, partial effects, diagnostics or
exception/monitor boundaries change. Eight large labeled bodies, 192 opaque
labels and other unmapped members remain. Full-game/assets/server/browser/phone
and heap/FPS acceptance remain unverified.

Pass 133 recovers 21 ordinary guarded loops across 14 methods and 12 files.
Previously, `while (true)` put its guard in a first `if` and buried the complete
continuation inside the loop. The generic decompiler now proves that neither
arm nor continuation can fall through, that the arm cannot exit this loop,
and that the continuation cannot transfer back to it. Transfers consumed by
inner loops, switches and labels are distinguished from exits of the arm;
catches are conservative and finally overrides keep their original meaning.
The exact guard becomes the loop condition and the complete continuation follows.

Bzip2 selector-rank and Huffman-table decoding now use
`while (index < selectorCount)` and
`while (huffmanTableIndex < huffmanTableCount)`, with their following work outside
the loops. Music packed-event counting similarly uses its track-count guard.
Board reconciliation, menu/input helpers and pixel/triangle routines also gain
ordinary loop conditions. Every old break/continue target and label remains.
Condition evaluation order, partial effects, numeric states, overflow,
exception/finally/monitor ownership, scopes and diagnostics are unchanged.
No client-control flag value is assumed. Potentially constant headers, consumed
inner-loop exits, repeating continuations, ambiguous labels and unknown syntax
refuse reconstruction. Direct continuation declarations keep separate braces.

The raw tree loses 42 scaffolding lines: 76,230 lines remain, with the same
188 block labels and 58 loop labels. Bzip2 block decoding falls from 385 to 381
lines, the music constructor from 519 to 517, board reconciliation from 333 to
331, and sorted RGB triangle rendering from 364 to 362. Eight bodies of at least
300 lines still retain labels; all their 51 labels are named. Across the tree,
192 labels and other unmapped members remain opaque. All 11,635 complete naming
rules survive, with the same 88,331 identifier, eleven class-literal and 184
label edits. This improves loop structure without adding or altering naming rules.

Four focused groups pass, including six native variants with 13,392 comparisons
against 13,392 independent loop-model oracle cases. Coverage includes nullable
and effectful guards, catch priority and exception identity, enclosing transfers,
finally overrides and return-value snapshot timing, declaration scopes and
monitor release. The relevant suite passes 113 tests with one existing skip.
Fresh decompilation from a clean tracked source archive reproduces all 303 Java
files and diagnostics byte for byte. The shared source proof independently
replays all 303 complete token streams and preserves 136,607 ordered Java
bindings, 388 overrides and 813 lexical label records without ordinal migrations.
Reproduction, byte-exact reversal, 27 publication checks and all eight fixed
native game probes pass within their stated scopes. Full-game/assets/server/
browser/phone and heap/FPS acceptance remain unverified.

Pass 132 adds 244 guarded names across eight intrusive collection/node classes
and the Bzip2/music labels: 23 fields, 30 methods, 69 parameters, 112 locals
and ten labels. Hash tables now expose `findByKey`, `put`, `bucketSentinels`,
`bucketCount`, `lookupCursor` and iteration cursors; iterators expose their
own table/deque, next node and last returned node. Primary and secondary links
remain independent. Callers in caches, MIDI and gameplay use the same names.
All parameters and locals in these eight classes are named. The packed ranking
count array in `NodeHashTableIterator` stays opaque because its semantic meaning
is not established; Java Iterator/Iterable method names stay unchanged.

The unrelated helpers now identify login initiation, the one-byte pending login
Boolean reply, archive-loading completion, tooltip anchor X, integer power,
partially filled sprites and session-text read/hash. Names describe the inspected
implementations and callers without guessing protocol meanings. Guard failures,
partial cleanup/link effects, sentinel/null exhaustion, arithmetic/overflow,
exception scopes and original diagnostic strings remain. No raw bodies change.

All ten labels in `Bzip2Decoder` and `MusicScore` now identify block/selector/
Huffman/run decoding, state commit, packed-event counting, MIDI track output
and earliest-tick collection. All labels in the eight bodies of at least 300
lines now have guarded descriptive names. Those bodies retain their lengths and
structure; naming does not reconstruct their loops. Across all 303 sources,
192 labels remain opaque: 145 block labels and 47 loop labels.

All 11,391 previous complete rules survive. The export has 11,635 guarded rules,
88,331 Java identifier edits, eleven class-literal edits and 184 label edits:
88,526 edits in total. Both 303-file trees compile and preserve 136,607 ordered
bindings, 388 overrides and 813 lexical label records. The raw source, tracked
decompiler-source tar, naming/workflow sources, stubs and source/native/text
proof pins stay unchanged. Reproduction, byte-exact reversal of all 303 files,
27 publication checks, all eight fixed native probes and the existing deque
fixture pass within their stated scopes. Unknown members and large shared joins
remain; full-game/assets/server/browser/phone and FPS/heap targets are unverified.

Pass 131 recovers three guarded jumps while retaining their shared exit labels:
`GameplaySession.renderSession`,
`BoardReconciliationSupport.reconcileBoardEntities` and
`AchievementSubmission.projectMeshAndQueueFaces` now use inverse conditionals
for their entry-arm suffixes. All other references must lie in the complete
fallback, which becomes `else` inside the original labeled block. Its nested
loops, scopes, finally/monitor boundaries and exit destinations stay intact.
Prefix/arm references to the shared label still refuse this reconstruction.

In debug rendering, position/gray calculations still precede the control-flag
test. The draw/advance/continue sequence runs under the inverse condition;
the fallback's queue traversal and final shared exit remain. Nonzero values keep
their original partial-effect path. This does not assume the client flag is zero.

All 11,391 previous complete naming rules and label ordinals remain. Two named
break references disappear, reducing label edits to 155; all 44 labels in the
six tracked gameplay/menu/triangle bodies retain their names. The raw tree still
has 76,272 lines, 188 block labels and 58 loop labels. All 136,607 ordered Java
bindings and 388 overrides match. Label records fall from 816 to 813: the source
proof identifies exactly the first guarded break to each of the three retained
labels and verifies every remaining destination. The complete inventory still
has eight bodies of at least 300 lines with labels; 202 labels elsewhere and
unmapped members remain opaque.

Six focused groups pass 725,760 native comparisons and 48 independent oracles,
covering skipped/executed suffixes and fallbacks, nested loop/switch transfers,
finally overrides, throwing effects, local scopes, nullable guards and monitors.
The relevant decompiler suite passes 109 tests with one existing skip. A clean
tracked decompiler archive reproduces all 303 sources and diagnostics byte for
byte. Full reproduction, reversible dictionaries, 27 publication checks and
the eight fixed native game probes pass within their documented scopes.
Full debug rendering/session update, full mesh execution, assets/servers,
browser/phone and heap/FPS acceptance remain unverified.

Earlier guarded suffix recovery (pass 130):

Pass 130 extends guarded-exit recovery to complete multi-statement suffixes.
Ten labeled exits become ordinary conditional alternatives across eight methods:
highscore rendering, Windows-shell URL validation, the gameplay keyboard loop,
both mesh face-queue entry points, domain-label validation, three board
reconciliation loops and nine-slice construction. The suffix stays together
under the inverse guard, including nested scopes and cleanup; the complete
fallback becomes `else`. Prefix evaluation, nonzero control-flag paths, numeric
states, effect order, original diagnostics and exception/monitor boundaries remain.
The debug renderer retains its frame because another fallback path also exits it.

The raw tree loses twenty lines and ten block labels: 76,272 lines,
188 block labels and 58 loop labels remain. All ordered 136,607 Java bindings
and 388 override relationships match. Fifteen surviving label ordinals migrate,
including eight named rules; four consumed label names retire. Every unaffected
complete rule remains. There are 11,391 naming rules and 157 label edits;
all 44 surviving labels in the six tracked gameplay/menu/triangle bodies are named.
Across all 303 sources, eight bodies of at least 300 lines retain labels, including
`Bzip2Decoder.decodeBlocks` and the `MusicScore` constructor. There are 202 opaque
labels elsewhere and unmapped members; readability remains unfinished.

Five focused groups pass 514,080 native comparisons and 31 independent oracles,
including executed/skipped suffixes, scoped locals, throwing cleanup, monitors,
switch fallthrough, nullable unboxing and loop transfers. The relevant decompiler
suite passes 108 tests with one existing skip. The source proof checks all 303
expected token streams, complete ordered bindings and surviving label targets;
a clean tracked decompiler archive reproduces all source and diagnostics bytes.
Publication checks and the eight fixed game probes retain their stated scopes.
Full session/menu rendering/update, real mesh queueing and shell launch, assets,
servers, browser/phone and heap/FPS acceptance remain unverified.

Earlier guarded abrupt recovery (pass 129):

Pass 129 replaces eight labeled exits with ordinary conditional alternatives
across six bodies. Three disappear from `GameplaySession.renderSession` and one
from `GameScreen.updateScreen`; the applet update loop, disk-cache write path,
ranked-list helper and entity cleanup lose one each. A branch retains its work,
then performs its existing return/throw/loop transfer under the inverse guard.
Its complete fallback becomes an `else`. Guards still evaluate once after the
prefix; nonzero client-control paths, exception coverage, finally effects and
monitor ownership remain. Equality inversion preserves NaNs and unboxing;
other predicates keep exact logical negation. Prefix locals and single-statement
if/loop positions retain their required braces.

The raw tree loses sixteen lines and eight block labels: 76,292 lines,
198 block labels and 58 loop labels remain. All ordered 136,607 Java bindings
and 388 override relationships remain. Eleven surviving label ordinals migrate,
including nine named rules; four consumed label names retire. All other complete
rules are preserved. There are 11,395 naming rules and 165 label edits; all
48 surviving labels in the six large bodies remain named. Six large bodies,
208 opaque labels elsewhere and unmapped members still need work.

Four focused groups pass 347,760 native comparisons and fifteen independent
oracles, including effects, transferred values, field/local shadowing, dangling
else, NaNs, nullable unboxing, throwing cleanup and monitors. The emitter and
exception/integer-argument suite passes 107 tests with one skip. The source proof
checks all 303 expected token streams, complete ordered Java bindings and
surviving label destinations; a clean tracked decompiler archive reproduces
all source and diagnostics bytes. Publication checks and the eight fixed game
probes retain their stated scopes. Full applet/renderer/menu execution, real disk
cache I/O and ranked sorting, assets/server/browser/phone and heap/FPS acceptance
remain unverified.

Pass 128 removes a whole-method refusal in the generic decompiler: an ordinary
colon switch no longer prevents recovery of proven captured-local guards.
`GameplaySession.renderSession` loses four redundant comparisons before loop
continues, and `GameScreen.activateMenuItem` replaces one labeled conditional exit
with an `if/else`. The switch selector, nonzero control-flag paths, evaluation
order and exception/finally/monitor boundaries remain. The raw tree loses twelve
lines and one opaque block label: 76,308 lines, 206 block labels and 58 loop
labels remain. Six large labeled bodies and unmapped members still need work;
all 52 labels in those six bodies retain their descriptive names.

All 11,399 previous complete naming rules and guarded ordinals are preserved.
The export has 87,406 Java identifier edits, eleven class-literal edits and
173 label edits, comparing 136,607 Java bindings and 852 label records across
303 compiling sources. Four new generic test groups pass, including 15,120 native
comparisons and ten independent oracles for case entry, fallthrough, selectors,
transfers, cleanup and monitors. The emitter suite passes 93 tests with one skip;
ten exception-loop/integer-argument checks and 27 publication tests pass. The
new source proof checks all 303 expected token streams, unchanged declarations
and overrides, and ordered surviving references/label targets. A clean tracked
decompiler archive reproduces all source and diagnostics bytes. The eight fixed
game probes retain their documented scopes; full renderer/menu action, assets,
servers, browser/phone and heap/FPS acceptance remain unverified.

Pass 127 adds 52 guarded label rules, covering every label in the six large
bodies: menu render/update, gameplay render/update, board reconciliation and
sorted RGB triangle rendering. Fifty describe plain-block exit scopes; two name
component-traversal loops. The export has 11,399 rules, the same 87,411 Java
identifier edits and eleven reflected class-name edits, plus 173 separate label
edits. All 11,347 previous complete rules survive. Class coverage stays 302
renamed plus `Geoblox`; the six large bodies retain their structure and length.
There are still 213 opaque labels elsewhere and unmapped members.

The frozen naming dependency now supports `B:owner.method(descriptor)#ordinal`
identities and the explicit `labels` policy `lexical-targets`. It audits 265
label declarations and 854 declaration/break/continue records separately from
136,612 Java bindings. Each transfer retains its original kind and exact lexical
AST target, even when a spelling is reused in disjoint scopes. Names describe
existing regions; they do not infer that the client control flag is zero, replace
numeric state or relax exception-region reconstruction. Dictionary reversal
recovers all 303 raw sources exactly.

Fifteen generic naming tests plus four subprocess tests pass, including runtime
loop/finally/monitor traces, guard/count refusals and exact reversal. The default
five-path audit remains byte-identical to the previous frozen helper on all303
sources; extra label and class-literal records are opt-in. The 27 publication
tests and all eight fixed native probes pass within their scopes. Compiling the
previous pass126 and current exports with the same JDK and release8 options gives
304 byte-identical class files. Clean committed checkouts reproduce the export.
Raw source, decompiler/bytecode and all native source/trace pins remain; explicit
source migration pins the new naming dependency, workflow and label policy.
Full-game/assets/server/browser/phone and heap/FPS acceptance remain unverified.

Pass 126 added 153 guarded names: fourteen classes, 32 fields, 28 methods,
52 parameters and 27 locals. All 11,194 previous complete rules survive.
The export has 11,347 rules and 87,411 identifier edits plus the same eleven
separately recorded reflected class-name edits. All 303 top-level classes have
meaningful names: 302 renamed and the original `Geoblox`. All parameters and
locals in the fourteen audited owners have guarded names. Unmapped members,
six large labeled bodies and 207 plain-block labels remain.

The named paths cover session socket task polling, packet buffers/header and
opcode history, bootstrap stages/localized loading text, generated-entity quota,
validation scratch and raster restoration/copy/outline helpers. Shared statics
stay on their original owners. The option mask has no fixed-source nonzero
producer; a received session-access byte is not assigned undocumented server
privileges. The power-of-two helper retains overflow and wrong-guard return,
and outline expansion retains its signed pixel>1 and zero-neighbor conditions.

The prior manifest exceeds the generic subprocess capture limit of 8 MiB.
Only the workflow's historical-manifest read now allows a bounded 32 MiB;
compiler and frozen generic naming limits stay unchanged. An explicit
`sourceChange` records the builder hash, and a regression fixture commits a
padded historical manifest above 8 MiB and verifies its exact Git-byte hash.
Raw source, decompiler, bytecode, frozen naming tool and eight native fixture
pins stay unchanged. The 26 publication tests and all eight native probes pass
within their existing scopes. All 303 sources reproduce and reverse exactly;
clean committed checkouts reproduce the export. This pass does not add live
socket/header/login/bootstrap service, assets/server/browser/phone or performance
coverage.

Pass 125 added 292 guarded names: thirteen classes, 40 fields, 34 methods,
78 parameters and 127 locals. All 10,902 previous complete rules and source,
naming-tool, decompiler, bytecode and native fixture pins remain. The current
export has 11,194 rules and 86,300 identifier edits, with the same 11 separately
recorded class-name literal edits. All parameters and locals in the thirteen
audited owners have semantic names. Both 303-file corpora compile and compare
136,612 bindings, 388 override relationships and 11 reflected class-literal
records. Dictionary reversal recovers all 303 pinned raw files byte-for-byte.
Class coverage is 288 renamed, one meaningful original name and 14 opaque
top-level names; six large labeled bodies and 207 plain-block labels remain.

The named paths connect session bootstrap/packet buffers, FIFO and CRC
acknowledgements, account/username flow tokens and form values, username result
handling, login UI/archive progress and fullscreen task completion. The three
flow markers remain distinct identity objects with throwing `toString`; no enum,
state numbers or wire values replace them. Mixed-purpose statics stay on their
owners. Guards, aliasing, partial writes, recursive failure paths, byte counts,
signed arithmetic and exception/monitor boundaries remain. The 25 publication
checks and all eight fixed native probes pass within their existing scopes; the
committed export reproduces from clean checkouts. No new live acknowledgement,
account/network/server, seed-file write, hardware fullscreen, browser/phone or
full-game/performance coverage is added by this naming pass.

Pass 124 added 306 guarded names: ten classes, 23 fields, 32 methods,
63 parameters and 178 locals. All 10,596 previous complete rules and source,
naming-tool, decompiler, bytecode and native fixture pins remain. The export now
has 10,902 rules and 84,798 identifier edits, with the same 11 separately recorded
class-name literal edits. All parameters and locals in the ten audited owners,
plus the selected cross-owner text primitives, have guarded semantic names.
Both 303-file corpora compile and compare 136,612 bindings, 388 override
relationships and 11 reflected class-literal records. Dictionary reversal recovers
all 303 pinned raw files byte-for-byte. Class coverage is 275 renamed, one meaningful
original name and 27 opaque top-level names; six large labeled bodies and 207
plain-block labels remain.

The named chains cover exact-size byte-array pool acquisition/storage, corrected
wall-clock sampling and session elapsed time, shared GMT cookie timestamps,
settings-cookie writing, UTF-16 reversal, ASCII letter/digit predicates, signed
radix parsing, selected-range concatenation, character replacement and sprite
loading. Shared statics remain on their original owners. The calendar remains
mutable/shared; wrong guards, recursion, partial writes, numeric flags, arithmetic
overflow, strings and exception/monitor boundaries remain unchanged. No new live
clock/cookie/archive/platform/game/browser/phone performance coverage is added.
The 25 publication checks and all eight fixed native probes pass within their
existing scopes; all sources reproduce from clean committed checkouts.

Pass 123 named the five previously held reflective implementations:
`AwtMouseWheelListener`, `BufferedImageRasterBuffer`, `AwtFullscreenBridge`,
`AwtCursorBridge` and `LegacyDirectSoundBridge`. It adds 58 guarded naming rules:
five classes, six fields, two methods, 18 parameters and 27 locals. All 10,538
previous complete rules and raw/decompiler/bytecode inputs remain. The export
has 10,596 rules and 83,103 identifier edits, plus 11 separately recorded class-name
literal edits. All 303 sources compile, compare 136,612 Java bindings and
388 override relationships; 11 literal target/position records are checked
separately. Class coverage is 265 renamed, one meaningful original name and
37 opaque names. Six large labeled bodies and 207 block labels remain.

The generic naming dependency now supports an explicit, count-guarded policy
for direct `java.lang.Class.forName` literals targeting owned classes. It proves
the called Java method through javac, leaves ordinary strings/comments and
public reflective member spellings unchanged, refuses escaped renamed targets,
and reverses the new literal edits through the same dictionary. Dynamic strings,
concatenation, `ClassLoader.loadClass` and reflective member-name rewriting are
outside this policy. Twelve generic tests and 25 publication tests pass. All
eight native probes retain fixed hashes, including 122 new headless checks for
five class loads/member contracts, wheel factory/event/guard/drain behavior and
preferred buffered-raster factory/shared pixel/draw behavior. Hardware fullscreen,
Robot, COM audio, full assets/game/server/browser/phone and heap/FPS remain
unverified. The raw decompiler source/archive and prior seven probe pins do not
change; the naming dependency and its new literal policy have an explicit
source-change record.

Pass 122 added 214 guarded names: 13 classes, 17 fields, 32 methods,
49 parameters and 103 locals. The logo loading path now reads through
`LogoPreparationSupport.prepareLogoAnimation`, `EntityMotionSupport.decodeLogoAudio`,
`FullscreenSupport.prepareMeshSpecularResponse`, `MidiNoteMixer.prepareLogoGlowRaster`
and `LogoCompositor.drawLogoAnimation`. The shared owners also expose snapshot
retention, fullscreen exit, username-query reuse, common UI fonts, cache handles,
name separators and configured timer rate. All parameters and locals in the
13 audited owners have names. The top/bottom final-frame slices, scene/glow
rasters, packet buffer and encrypted scratch have source-supported roles.
All 10,324 previous complete rules, raw bodies, local ordinals, bytecode and
source/tool/native trace pins remain. The export has 10,538 rules and 82,881
identifier edits. All 303 raw/readable sources compile, compare 136,612 bindings
and preserve 388 override relationships. Class coverage is 260 renamed, one
meaningful original name and 42 opaque names. Six large labeled bodies and
207 block labels remain. Configured update rate is a timer setting, not measured
presented FPS. Mixed-purpose statics stay on their owners. This naming pass adds
no whole-game, successful asset/audio/AWT fullscreen, live server, browser/phone
or heap/FPS equivalence claim.

Pass 121 added 286 guarded names: 14 classes, 19 fields, 24 methods,
44 parameters and 185 locals. The game now reads through `MatchCandidateSupport`,
`MatchScoringSupport`, `PlayfieldRules`, `ScorePopupSupport`,
`AttachedEntityRenderer`, `EndingAnimationSupport`, `DebugOverviewCompositor`,
`MeshDepthSupport`, `MeshPrioritySupport`, `GameplaySetupSupport`,
`BoardEntityState` and `GameSoundResources`. Session calls expose
`LoginProtocolSupport.advanceLoginHandshake` and `AchievementProtocolSupport`.
All parameters and locals in the 14 audited owners now have guarded names.
Shared login phases expose request readiness, initial reply, result, details,
failure text and connected-session identity. The reflection decoder names its
operation/class/member/argument data, reused argument-count/integer-write slot,
serialized buffers and per-operation failures. Its generated increment state
keeps the original zero/one values and control flow. Class names describe helper
families; unrelated static functions and globals stay on each owner.
All 10,038 previous complete rules, raw bodies, local ordinals, bytecode and
source/tool/native trace pins remain. The export has 10,324 rules and 81,351
identifier edits. All 303 raw/readable sources compile, compare 136,612 bindings
and preserve 388 override relationships. Class coverage is 247 renamed, one
meaningful original name and 55 opaque names. Six large labeled bodies and
207 block labels remain. New naming does not establish full login/reflection/
server, asset/audio/AWT/browser/phone or heap/FPS equivalence.

Pass 120 added 149 guarded names: seven classes, four fields, 15 methods,
28 parameters and 95 locals. The main gameplay helper owners now read as
`EntityMotionSupport`, `EntityCollisionSupport`, `EntitySpawnSupport`,
`BoardReconciliationSupport`, `EntityContactSupport`, `EntityLinkSupport` and
`AvatarFeedbackSupport`. These describe their gameplay helper families; unrelated
static functions and globals remain on their original owners. The contact-mask
scan now names its crop bounds, pixel indices, row skips, kind-two mismatch,
pooled conversion entity, avatar sentinel handling and exception context.
The remaining link-operation diagnostics, canvas listener cleanup, ranked-list
index sorting, applet quit navigation and widget gradient-border parameters
also have source-supported names. Raw sources, local ordinals, bytecode,
decompiler/naming-tool pins and native probe source/trace pins are unchanged;
all 9,889 previous complete rules survive. The export has 10,038 rules and
79,782 identifier edits. All 303 raw/readable files compile, compare 136,612
bindings and preserve 388 override relationships. Class coverage is 233 renamed,
one meaningful original name and 69 opaque names. The six large labeled bodies
and 207 block labels remain. Whole-game/assets, applet navigation, live network,
browser/phone and heap/FPS acceptance remain unverified.

Pass 119 replaced 67 capture temporaries with proven postfix array reads in
26 methods across seven files, including font glyph-mask conditions. The raw
source shrinks by 201 lines to 76,320. The dictionary retires 47 deleted capture
names and migrates 220 guarded local identities among 260 surviving local ordinal
changes; every surviving semantic name, original spelling and evidence remains.
There are 9,889 rules and 78,860 identifier edits. All 303 raw/readable files
compile, compare 136,612 bindings and preserve 388 override relationships.
A source proof checks complete expected token streams, predicted bindings and
local migrations. The six focused generic groups pass, including 12,096 new
native read comparisons and eight independent oracles; the existing 244,944
store comparisons also pass. Clean tracked decompiler source reproduces every
Java and diagnostics byte. Null/bounds/unboxing failures, counter overflow,
short-circuit and later condition effects, and cleanup/monitor order remain.
Repeated conditions, earlier effects, field/getter arrays, compound assignments
and escaping captures retain their statements. Bytecode is unchanged. There
are still 76 opaque class names, six large labeled bodies and 207 block labels;
whole-game, assets, browser/phone and memory/FPS acceptance remain unverified.

Pass 118 added 120 rules for shared array/cache/JavaScript helpers and the
archive byte-storage chain. `ArrayOperations`, `CacheFileLocator` and
`AppletJavaScriptBridge` replace three opaque class names. The complete
`ByteStorage`/`DirectByteStorage` override families and archive storage wrappers
now name their copy, alias, buffer and failure roles. There are 9,936 rules and
79,048 identifier edits, retaining all 9,816 prior complete rules. Class coverage
is 226 renames, one meaningful original name and 76 opaque names. Raw bodies,
bytecode and decompiler/naming-tool pins stay unchanged. The source/probe paths
move into Deko; existing native trace hashes remain fixed. Whole-game and
browser/device performance are still unverified.

Pass 117 recovers ordinary postfix array indexing in 15 bodies across five files.
It removes 271 capture temporaries and 813 lines; the array-copy helper `sf.java`
falls from 943 to 268 lines. The map explicitly retires 46 deleted capture names
and migrates 55 surviving local identities, retaining every other complete rule.
There are 9,816 rules and 78,050 identifier edits; class coverage remains 223
renames, one meaningful original name and 79 opaque filenames. All 303 raw and
readable sources compile, compare 136,880 bindings and preserve 388 overrides.
A historical source proof checks every expected token stream, declaration
migration and predicted binding; 244,944 native comparisons and five independent
oracles cover array exceptions, partial writes, aliasing, overlap, overflow and
cleanup. A clean tracked decompiler-source archive reproduces all Java and
diagnostics bytes. Fields, calls, escaping captures and ambiguous bindings retain
their original statements. The six large labeled bodies remain; this does not
establish whole-game or device/performance equivalence.

The current decompiler-source SHA-256 is
`87bba94fb508a8faa874b11e21b2040d298e5761be6eac074e3cb0b3a657767d`.

Pass 116 names 33 fields, 26 methods, 69 parameters and 198 local declarations
along theme audio preparation, sample caching and PCM resampling. Session calls
now expose `selectThemeAudio`, `getThemeForProgress` and `recycleAllScorePopups`.
There are 9,862 guarded rules and 78,234 identifier edits, preserving every
complete prior rule and all raw/tool/native-probe pins. Class coverage remains
223 renames, one meaningful `Geoblox` name and 79 opaque names. Preparation flags,
ignored instrument-preparation results, budgets and sample-slot limits retain
their original behavior. This adds no live audio/assets/device coverage.

Pass 115 names 11 classes and 145 fields, methods and parameters. The score path
now reads through `createAndSubmitScore`, `ScoreSubmission` and
`writeScoreSubmission`. Typed query records, shared social entries, canvas resize
controls and visual-property overrides describe their source-supported roles.
There are 223 class renames, one meaningful `Geoblox` name and 79 opaque names,
with 9,536 guarded rules and 76,813 identifier edits. All 9,380 prior naming
objects, raw bodies and tool/probe pins remain unchanged. Unknown wire values
keep neutral names; this pass adds no live network, UI or device coverage.

Pass 114 names 23 record/helper classes and 205 fields, methods and parameters.
The additions cover staged archive loading, raster snapshots, display modes,
tracked audio streams, highscore views, queued reflection checks, delayed incoming
packets, typed text templates and legacy platform controls. Class coverage is
212 renames, one already meaningful `Geoblox` name and 90 opaque names; there are
9,380 guarded rules and 75,701 identifier edits. All 9,152 prior naming objects,
raw sources and decompiler/tool/native-probe pins stay unchanged. Public native
callback names and literal reflection spellings remain. This source-audited
naming pass adds no live platform/archive/highscore/reflection/network coverage.

Pass 113 names 20 account/widget classes and 234 fields, methods and parameters.
`LoginPanel`, `AccountCreationForm`, `DisplayNamePanel` and
`AccountCreationDialog` expose the account flow; `HotspotTextWidget` parses
clickable text and `ProgressBarWidget` renders Q16 progress. Suggestion selection,
more-suggestions requests and hotspot activation have complete named callback
families. There are 9,152 guarded rules, 73,820 identifier edits, 189 renamed
classes, one already meaningful `Geoblox` name and 113 opaque names. All 8,898
previous rule objects, raw source and tool/probe pins stay unchanged. The existing
seven native probes retain their original scopes; this naming pass adds no live
account/UI or whole-game coverage.

Pass 112 revisits proven exits after final guard/frame cleanup. Nine bodies in
eight files lose 13 generated block labels and 20 lines, leaving 207 labels.
Board reconciliation falls from 345 to 339 lines and 11 to 9 labels; the sorted
half-blend triangle falls from 372 to 364 lines and 11 to 7 labels. All 8,898
complete naming rules, local ordinals, 137,964 bindings and 388 override pairs
remain unchanged. Every regenerated token stream matches the expected recovery;
a clean tracked decompiler-source archive reproduces all Java and diagnostics
bytes. Six large labeled spans remain, and full game/device equivalence is still
unverified. The decompiler-source SHA-256 is
`f931fad10ba711145115262619cc04e5c81e13450de01a56d1c7c350f6c465b5`.

Pass 111 adds 26 class roles and 265 field/method/parameter names, including
`VorbisCodebook`, `VorbisResidue`, `SynthesizedSoundInstrument`, `LoginPayload`,
`CheckboxWidget`, `DialWidget` and `MultiHandleSliderWidget`. The backing
`GrowableIntList` supports several slider handles; login subclasses describe
their byte layout without guessing the meaning of base38 text. The complete
drawing-strategy and validation-provider-source override families are named.
Class coverage is 169 renamed classes, one already meaningful `Geoblox` name
and 133 opaque names. There are 8,898 guarded rules and 71,946 identifier edits.
All 8,607 prior rule objects, raw source and tool/probe pins remain unchanged.
The single preview is `readable/geoblox/src`; update it with
`node readable/reproduce-geoblox.mjs --update`. Earlier exports live in Git.

Pass 110 names 51 additional class roles, including `GameApplet`,
`TextInputWidget`, `PcmStream`, `MidiPcmStream`, `IntrusiveNodeHashTable`,
`FrameTimer` and `ProxySocketConnector`. Class coverage at that pass is 143 renamed
classes, one already meaningful `Geoblox` name and 159 opaque names. The total
is 8,607 guarded rules and 69,721 identifier edits; raw source, decompiler/tool
pins and previous rule objects remain unchanged. Class names describe instance
roles, with unrelated static helpers still on their original owners. Literal
reflection spellings remain unchanged. Update the single preview in place using
`node readable/reproduce-geoblox.mjs --update`; earlier versions live in Git.

Pass 109 names `AchievementQuery`, `cf.requestAchievementState`,
`re.writeAchievementStateRequest`, `AchievementProtocolSupport.handleAchievementResponse`,
`AchievementProtocolSupport.resendAchievementMessages` and the singleton query/queue/result fields.
It adds 53 guarded names, bringing the total to 8,556 and 66,611 edits, while
retaining every previous rule and the raw/decompiler pins. The existing
achievement probe adds a separate 284-case native/raw/readable trace covering
response types/counts, ordered acknowledgements, two-round retries, request
failure after enqueue, and received-mask import. In-memory packets verify partial
effects and overflow consumption; real sockets, unknown-type logging and complete
login/reconnect/server/game/device behavior remain unverified.

Pass 108 names the achievement path from gameplay to notification and submission:
`ra.recordAchievement`, `AchievementSubmission`,
`je.updateAchievementSubmissions`, `sj.submitAchievementRecord`,
`ol.writeAchievementSubmissionPacket` and `lh.updatePendingActionPanel`.
The 64 additional guarded identities bring the total to 8,503 names and 66,358
identifier edits, preserving all 8,439 previous rules and the raw/tool pins.
A new 864-case native/raw/readable probe checks tutorial, duplicate and blocked
submissions, earned/new/tracking masks, queue identity/order, guard side effects,
shift/byte wrapping and signed overflow. Its 108 independent packet checks verify
the version, ID/check bytes, four big-endian tracking integers, CRC and length.
The tracking integers keep neutral client-side names; server validation semantics
are unknown. Empty-panel font preparation, login/retry/ack execution, live
networking and whole-game/device acceptance remain unverified.

Pass 107 removes 97 path-implied guards in 24 bodies across ten files. Only
comparisons of captured int locals are specialized; later/cyclic writes invalidate
facts, and no global flag or field is assumed constant. Selected scopes and
transfer targets remain, with loop/label completion and finally overrides proven
before unreachable suffixes are removed. Thirteen labels and 384 lines disappear.
Board reconciliation falls from 494 to 345 lines. All 8,439 complete names remain.
Four new groups pass 16,560 native comparisons and twelve independent checks;
clean-source reproduction, all six game probes, publication tests and dictionary
reversal pass. There remain 220 block labels and six large labeled spans. Shared
names, further reconstruction and whole-game/browser/phone acceptance remain open.

Pass 106 replaces the menu-action and loading-theme label ladders with
ordinary switches, preserving original actions, guards and fallthrough for every
control-flag partition. Nineteen plain block labels and 65 lines disappear.
Menu action dispatch falls from 322 to 277 lines and 17 to four labels; gameplay
rendering falls from 377 to 357 lines and 17 to eleven labels. All 8,439 complete
names remain. Four new test groups include 61,152 native before/after comparisons
and ten independent behavior checks. Clean decompiler-source reproduction, all
six game probes, publication checks and dictionary reversal pass. There remain
233 plain block labels and 20 overlapping spans of at least 300 lines, six with
block labels. Unknown shared names, further reconstruction and whole-game/
browser/phone acceptance remain unfinished or unverified.

Pass 105 removes 525 proven local-reference identity casts from 423 bodies
across 170 files. For example, assigning a RuntimeException local no longer
casts it back to RuntimeException. Exact static types and local scopes are
preserved; necessary casts and primitive conversions remain. All 8,439 naming
objects remain. The 515 removed cast-type class references reduce binding
comparisons to 138,257 and naming edits by 32 to 66,191. All surviving bindings
retain their ordered identities. Five new test groups include 2,880 native
comparisons, seven independent checks, and 24 identical compiled instruction/
exception-table pairs. Clean decompiler-source reproduction, all six game
probes, publication checks and dictionary reversal pass. The seven large
labeled bodies remain; this pass reduces cast noise without changing their
control flow or claiming whole-game/browser/phone equivalence.

Pass 104 reconstructs 25 effectful plain-block exits as ordinary `if/else`
arms across 17 files. The original predicate and effects remain in order, and
the skipped remainder becomes the else arm. Fifteen unused labels disappear,
saving 30 lines. Avatar animation and music decoding lose their final labels;
252 generated plain block labels remain, with seven of 21 overlapping large
spans labeled. All 8,439 naming objects and 66,223 edits remain unchanged. The
emitter passes 66 tests with one historical optional skip, including 24,192 new
native comparisons and six independent behavior checks. Clean decompiler-source
reproduction, ordered bindings, all six game probes, dictionary reversal and
publication checks pass. Unknown shared names, larger continuations and full
game/browser/phone acceptance remain open.

Pass 103 turns fourteen newly exposed leading loop exits into ordinary while
conditions across eleven files, saving 42 lines. Original predicates remain
under logical negation; nonconstant proof protects Java reachability, while
scopes, exception coverage, cleanup and continue targets stay intact. All 8,439
complete naming objects and 66,223 edits remain. Both 303-file corpora compile;
ordered bindings and all expected rewrite token streams match. A clean decompiler
archive reproduces sources/diagnostics byte-for-byte. The emitter passes 63 tests
with one historical optional skip, including 96,768 new native comparisons and
six loop-entry/NaN/cleanup oracles. All six existing game probes, reproduction
and dictionary reversal pass. Sprite nearest rotation is 526 lines; session
update is 638 and the sorted half-blend triangle is 385. At that pass, 267 generated
plain block labels and 21 overlapping large spans, nine labeled, remained. Further joins,
unknown names and full game/browser/phone acceptance remain open.

Pass 102 reconstructs 78 terminal labeled exits as ordinary loop breaks and
removes 38 unused plain labels/blocks across 28 files, saving 76 lines. The loop
must reach the same block end without intervening work or protected regions;
inner cleanup, scopes, loop-update/condition bypass and exceptions remain.
All 8,439 complete naming rules and 66,223 edits are preserved. All 303 expected
rewrite token streams and ordered bindings match; a clean decompiler archive
reproduces the output byte-for-byte. The emitter passes 59 tests with one existing
optional skip, including 11,520 new native comparisons and five loop oracles.
All six existing game probes, full reproduction and dictionary reversal pass.
Sprite nearest rotation loses its final label; gameplay render/update and board
reconciliation each lose one. There remain 267 generated plain block labels and
21 overlapping large method spans, nine labeled. Further continuation/state
reconstruction and full game/browser/phone acceptance remain open.

Pass 101 adds 409 guarded names for pointer frames, dragging/dropping, wheel input,
button activation and complete shared event contracts. `DraggableWidget`,
`DropTargetWidget` and readable callback interfaces expose source-traced event
availability, coordinate order and partial callback effects. All 8,030 prior
complete rules and raw/decompiler/native pins remain; the 8,439 rules apply 66,223
edits. Both corpora compile and compare bindings/overrides; all six existing native
probes, reproduction and dictionary reversal pass. The reflectively loaded wheel
class remains `gl`. Duplicated continuations, shared opaque code, larger control-
flow reconstruction and whole-game/browser/phone acceptance remain open.

Pass 100 adds 228 guarded names for widget ownership, layout, focus and independent
deque traversal. The preview includes readable widget/container/dialog-layer,
button, renderer/listener and cursor classes. Complete connected bounds and focus
contracts retain their original order and guard behavior. All 7,802 prior complete
rules and raw/decompiler/native pins remain; the 8,030 rules apply 64,011 edits.
Compilation/binding/override checks, all six existing native probes, full
reproduction and dictionary reversal pass. Pointer/drag dispatch, shared opaque
utilities, larger reconstruction and whole-game/browser/phone acceptance remain
open; runtime control flow and allocations are unchanged.

Pass 99 adds 205 guarded names for dialog fade/resize/content transitions,
widget geometry and complete shared rendering/transition contracts. The preview
includes `FadingDialog`, `ResizableDialog`, `ContentTransitionDialog` and
`OpacityWidget`. All 7,597 previous complete rules and raw/decompiler/native pins
remain; the 7,802 rules apply 61,845 edits. Compilation/binding/override checks,
all six existing native probes, full reproduction and dictionary reversal pass.
Opacity rendering retains its intermediate sprite allocations; this pass does
not change runtime memory or performance. Shared opaque code, larger control-flow
reconstruction and whole-game/browser/phone acceptance remain open.

Pass 98 adds 115 guarded names, completing MessageDialog's own declarations and
two shared UI override families (11 button callbacks and 13 key-input methods).
Dialog error/dismissal/restored content and colocated static utilities follow
source-proven guards and partial effects. All 7,482 previous complete rules and
raw/decompiler/native pins remain. The 7,597 rules apply 60,415 edits.
Compilation/binding checks, native gameplay traces, full reproduction and dictionary
reversal pass. Two structural prototypes were discarded after finding zero loop-
entry candidates and one alternate-guard exception helper, with no large-body
candidates. Larger dispatch/continuation reconstruction, shared opaque code and
whole-game/browser/phone acceptance remain unfinished or unverified.

Pass 97 adds 91 guarded avatar/ending/shared-input identities, completing the
parameters/locals of both avatar updaters and board reconciliation. Cry phases,
frame cursor, ending scan result and session-start attempt counter follow exact
source reads/writes and partial effects. All 7,391 previous complete rules and
raw/decompiler/native pins remain. The 7,482 rules apply 59,943 edits. The existing
native/raw/readable gameplay probe retains its traces, including active-session
animation oracles; it does not establish the complete crying/ending lifecycle.
Compilation/binding checks, full reproduction and dictionary reversal pass.
Repeated animation tails, shared opaque classes, large control bodies and
whole-game/browser/phone acceptance remain unfinished or unverified.

Pass 96 adds 77 guarded identities, completing GameplaySession declarations and
Geoblox's fields/parameters/locals/nonlifecycle methods. Already semantic client
lifecycle names remain original. Canvas timing, message dialog and login payload
kind are traced; the shared control-flow flag is named across 325 bound occurrences
in 141 files without assuming zero or application meaning. All 7,314 previous
complete rules and raw/decompiler/native evidence pins remain. The 7,391 rules
apply 59,581 edits. All six existing native/raw/readable probes retain their traces;
compilation/binding checks, full reproduction and dictionary reversal pass.
Related shared classes, large labeled bodies and whole-game/browser/phone
acceptance remain; existing fixtures do not establish new full client/platform/
asset/login/server execution.

Pass 95 adds 65 guarded base-menu and direct-helper names, completing every
MenuScreen field, nonconstructor method, parameter and local. Shared dispatcher,
applet stop deadline and intro tint state have independently traced roles.
Pointer-repeat fields/configuration and the indexed-frame loader chain are named
without changing guards, integer formulas, file/group order or null/failure paths.
All 7,249 previous complete rules and raw/decompiler/native evidence pins remain.
The 7,314 rules apply 58,939 edits. Compilation/binding checks, full reproduction
and dictionary reversal pass. Other shared code, large control bodies and whole-
game/browser/phone acceptance remain; this pass adds no dynamic menu/repeat,
asset, applet lifecycle or thread coverage.

Pass 94 adds 173 guarded identities, completing names for every GameScreen field,
nonconstructor method, parameter and local. It covers screen input, fullscreen
state, menu press animation, tutorial demonstrations, hit tests, volume controls,
highscores and related static utilities. It also corrects two misleading pass93
panel-axis names after tracing the panel helper's Y-before-X signature. All
7,074 unaffected previous complete rules and raw/decompiler/native evidence pins
remain. The 7,249 rules apply 58,741 edits. Compilation/binding checks, full
reproduction and dictionary reversal pass. Shared helpers, necessary block labels,
larger gameplay reconstruction and whole-game/browser/phone acceptance remain;
this source-audited pass adds no dynamic screen/asset/device coverage.

Pass 93 adds 61 guarded menu/background/tutorial names: 11 fields, three methods,
five parameters and 42 locals. Every parameter/local in the menu renderer,
scrolling background renderer, tutorial page renderer and curtain updater has a
name, including explicit combined roles for reused slots. Tutorial page/curtain
state and layer offsets are named without changing guards or sentinel values.
The 7,076 rules apply 57,788 edits; all 7,015 previous complete rules and raw/
decompiler/native evidence pins remain. Full reproduction and dictionary
reversal pass. This source-audited naming pass adds no dynamic menu/tutorial
coverage; other opaque locals, large control bodies and browser/phone acceptance
remain unfinished or unverified.

Pass 92 reconstructs 41 nested skip frames, consuming 82 breaks and guarding
42 remainders over 97 predicates. It saves 219 lines across 19 files. Menu
rendering shrinks from 372 to 304 lines and ten to four block labels; gameplay
rendering and board reconciliation also lose labels. Predicate/effect order,
scopes, every ordered binding and all 7,015 complete naming rules remain.
The clean committed decompiler archive reproduces all 303 raw files and unchanged
diagnostics; all six native/raw/readable probes retain their traces. Full
reproduction/dictionary reversal passes. There remain 21 large method spans,
ten with block labels; opaque locals, mixed-effect exits and whole-game/browser/
phone acceptance remain unfinished or unverified.

Pass 91 reconstructs 27 multi-exit frames, consuming 75 breaks and saving 126
lines across 24 files. Music controller decoding becomes an ordered alternative
chain; the music-score constructor and Bzip2 block decoder now have no block
labels. Gameplay rendering and menu action handling also lose labels. Every
ordered binding and all 7,015 complete naming objects remain. The clean
committed decompiler Git-source tar reproduces raw sources and unchanged
diagnostics; all six native/raw/readable probes retain their traces. Full
reproduction and dictionary reversal pass. There remain 21 large method spans,
10 with block labels; larger reconstructions and whole-game/browser/phone
acceptance remain unfinished or unverified.

Pass 90 reconstructs 64 labeled exits as 47 conditional alternatives and 17
ordinary guards, saving 145 lines across 45 files. Gameplay rendering loses two
labels; board reconciliation loses one. The instrument-patch constructor now
has no labels. All 7,015 complete naming objects and ordered bindings remain.
The clean decompiler Git-source tar reproduces all 303 raw files and unchanged
diagnostics; all six recorded native probes retain their traces. Full readable
reproduction/dictionary reversal passes. That pass left 21 large method spans,
12 with block labels; multi-exit decision trees and whole-game/browser/phone
acceptance remain unfinished or unverified.

Pass 89 removes 102 redundant breaks and 73 labels/block frames across 50 files,
saving 248 lines. The instrument-patch constructor shrinks from 492 to 468 lines
and nine block labels to one. All 7,015 complete naming rules, 57,278 edits and
ordered source bindings remain. Independent JDK body positions account for all
303 regenerated token streams; a clean decompiler Git-source tar reproduces raw
files and unchanged diagnostics byte-for-byte. The six recorded native probes
retain their traces, and full readable reproduction/dictionary reversal pass.
That pass left 21 large method spans, 13 with block labels. Whole-game/browser/phone
acceptance remains unverified.

Pass 88 names `InstrumentPatch` and `InstrumentEnvelope`, including all 77
locals in the 492-line patch constructor. Its 144 guarded additions bring the
export to 7,015 rules and 57,278 edits, preserving all previous rules and source
pins. A separately pinned 1,759-case native/raw/readable trace checks decoded
patch arrays/envelope identity, rounded/clamped curves, selective cached sample
installation, ID/pitch cleanup, floor division, exception context and truncated
inputs. Actual archived patches, uncached samples and synthesized audio remain
unverified; large control-flow bodies and browser/phone acceptance remain.

Pass 87 names `MusicScore`, `MidiTrackReader` and `InstrumentNoteMask`, including
all 96 locals in the 541-line compact-to-MIDI constructor. It adds 188 guarded
identities, bringing the export to 6,871 rules and 54,798 edits; every previous
rule and source/decompiler pin remains. A separately pinned 1,671-case native
trace includes independent exact-MIDI/instrument-note oracles and reader
meta/system/running-status/tempo checks. Native, raw and readable variants
match. Full regeneration and dictionary reversal remain reproducible. Actual
archive music loading, audio synthesis and browser/phone acceptance are unverified.

Pass 86 removes 57 labeled skip blocks and 66 guard breaks across 25 files,
reconstructing ordinary conditional guards without moving declarations, effects
or protected boundaries. It removes 197 lines; `updateSession` shrinks from
660 to 643 lines and loses five labels. All ordered declarations/references,
local ordinals, 388 overrides and 6,683 complete naming objects remain.
Independent JDK body positions prove all 303 token streams contain only the
documented skip/nested-guard transforms. Generic fixtures add 4,032 native
comparisons; the clean decompiler archive reproduces all raw files and unchanged
diagnostics. The six recorded native probes retain their hashes. Reproduction
and dictionary reversal are byte-exact. Large bodies and whole-game/browser/phone
acceptance remain unfinished or unverified.

Pass 85 names the animated logo scene, adding 134 guarded identities for its
clock, rotations, materials, loader, rendering and integer-guard face collector.
The 6,683 rules apply 53,607 edits and preserve every previous naming object.
A new 56,862-case native logo trace exposed 120 cleanup mismatches caused by
narrowing a full JVM integer to a Java byte. The generic decompiler now preserves
that integer through an additional owned static entry point. The original
collector signature/body remain; only two raw files change. Native/raw/readable
logo traces now match the fixed native hash. Trig/matrix/clock/material and limited
draw-order/depth oracles retain their documented scope; real archive decoding,
whole-game rendering and browser/phone performance remain unverified.

The previous structural pass replaces 710 nested braced guard chains with ordered
short-circuit checks, merging 913 conditions across 131 files and removing 913
lines. Predicate bytes/order and the innermost declaration scope stay intact;
intervening statements and protected boundaries are not crossed. The generic
fixtures add 17,280 native comparisons. An independent JDK body inventory proves
that only the documented guard/frame transforms account for all 303 regenerated
token streams. Every ordered binding and all 6,549 guarded naming rules remain.
Clean committed decompiler source reproduces raw Java and unchanged diagnostics;
raw/readable corpora compile and reproduce/reverse byte-for-byte. All seven native
probes retain their traces. This changes source readability; it does not establish
whole-game behavior or browser/phone performance targets.

Pass 83 added 142 guarded identities for mesh projection and
face collection: camera/model bases, perspective coordinates, normal transforms,
optional coordinate triples, backface rejection, depth buckets and priority counts.
Every parameter/local in the five selected methods has a name. Original shifts,
overflow, guard/control paths, aliases, partial writes and diagnostics remain.
That naming pass kept its raw/decompiler pins unchanged.

The existing drawing probe adds 5,992 native/raw/readable cases, including limited
identity-projection, bit-length and buffer-clearing oracles, general geometry and
fault traces, and direct face collection with bucket spill. All earlier drawing
traces retain their pins. Rule-builder/source-migration/text-resource tests pass
9/8/6 groups. All 303 sources compile, reproduce and reverse byte-for-byte.
The 6,549 rules apply 52,854 edits, preserving 138,502 bindings and 388 overrides;
all 6,407 prior complete rules remain. The single current manifest records names
and probe pins; Git stores history. General camera/model geometry has no complete
independent oracle here. Remaining model loading, opaque helpers, reused scratch
phases, large control bodies, real assets/platform/server/gameplay and browser/phone
memory/startup/FPS targets remain unfinished or unverified.

Pass 82 named flat triangle sorting, Q16 edges, solid spans, depth-bucket
compaction and priority grouping, adding 80 identities and 8,775 native cases.

Pass 81 named mesh lighting, materials, render buffers, transforms and bounds,
adding 130 guarded identities and 10,592 native trace comparisons.

Pass 80 named the triangle clip state, vertex sorting, RGB interpolation and
scanline blending, adding 116 guarded identities and 5,266 native comparisons.

The preceding structural pass converts 95 jumps in 38 exit blocks to direct void
returns, removing 81 lines across 25 files. Its generic tests add 46,080 native
comparisons of cleanup and failure behavior. These structural proofs retain their
documented scope alongside the current naming/probe evidence.

Pass 77 removed 508 redundant labels, simplified 450 labeled continues and
removed 588 lines across 153 files. Its independent Java AST corpus comparison
preserved all 303 files' syntax events, 1,129 loop/switch destinations and 1,762
jumps. Pass 78 reconstructed 17 short-circuit boolean decisions, removing 156
lines across 12 files. Those historical proofs and the current return-rewrite
checks have their separate scopes recorded in the reproduction procedure.

Pass 76 shared a duplicate Bzip2 output-state publication/return tail through an
existing plain exit block, removing thirteen lines while retaining its native
40-case block matrix and eight other helper traces.

Pass 75 named Bzip2 block/table/run decoding and all decoder state fields. Its
40-case native fixture checks varied blocks, two-block input, partial output,
malformed input and recovery. Every decoder field/API/parameter/local has a name;
unrelated static helpers on the state owner remain opaque.

Pass 74 named archive decompression, `GzipInflater`, Bzip2 entry/bit-reader
contracts and selected state. Its 74-case native fixture confirms controlled
payloads, length limits, type routing and gzip partial/error/reset behavior.

Pass 73 named `DiskArchiveCache` and the shared sector scratch buffer, including
the two retained header-EOF states. Its 138-case native fixture confirms controlled
sector chains, malformed reads, EOF success exits and large-ID boundary behavior.

Pass 72 named `LimitedRandomAccessFile` and `BufferedRandomAccessFile` instance
state/APIs/constructors/locals. Virtual/underlying positions, physical/logical
lengths, pending writes, cached reads and overlap updates retain original behavior.

Pass 71 named `ArchiveCatalog`, service initialization, connection headers,
handshake stages/retries and archive creation. The archive client identifier is
supplied as 1; applet/cache initialization separately uses 11. Catalog records,
verification, provider memoization and file/socket ownership remain explicit.

Pass 70 named `ArchiveNetworkClient`, `SocketArchiveNetworkClient`, the shared
secondary key and direct XOR/sleep helpers. Every network-client instance
field/API, constructor contract and local has a name. Pending/sent queues,
response parsing, attachment, requeueing and failure state expose their roles.

Pass 69 named `DiskCacheWorker` and the remaining `SecondaryDeque` instance
locals. Queue operations, synchronous queued-write reuse, thread startup,
shutdown and both retained worker continuation selectors expose their roles.

Pass 68 named `CachedArchiveSource` and the three-class archive-request
hierarchy. Every instance field/API, constructor contract and local has a name.
Request modes, disk validation, background scans, cleanup markers, volatile
pending state and network response storage retain the original behavior.

Pass 67 named `ArchiveIndex`, `IntKeyLookup`, `ArchiveSource`, matching provider
contracts and checksum/digest helpers. Counts, sparse slots, revisions, CRCs,
optional Whirlpool digests and name hashes retain the original format/ordering.

Pass 66 named `ResourceArchive` instance fields/APIs, constructor contracts and
locals, exposing index/group loading, file/name lookup, unpacking, progress and
retention. Original monitors, byte order, chunk tables and partial effects remain.

Pass 65 named `PrefixCodeDecoder`, its decode tree/shared decoder and compressed
text reader. Its fixed source has no tree/shared-decoder initialization; names
describe the retained routine without establishing live compressed-text support.

Pass 64 named text-byte encoders, signed encoded-byte archive-name hashing and
decoder return/failure locals. Fonts retain unsigned glyph indices while name
hashing keeps signed byte contributions; mapping, guards and diagnostics remain.

Pass 63 named the remaining buffer crypto APIs, `WhirlpoolHash`, its shared
tables and five bitwise helpers. Every buffer and hash instance declaration now
has a name; original cycles, signed payloads, guards and partial effects remain.

Pass 62 named `PacketBuffer` and `PacketByteCipher` instance fields/APIs,
bit masks, seeded mixing, batch generation and reverse result consumption.
Original cursor/cipher consumption order, guards and partial effects remain.

Pass 61 named ordinary buffer writes, bulk copies, length backpatches, padding,
packed base38 text and CRC32. Original byte order, partial writes, aliases,
character start offsets, guard effects and exception scopes remain explicit.

Pass 60 named `ByteArrayBuffer`, its shared `bytes`/`position`, both constructors
and thirteen integer, smart and text readers. Consumers now expose the storage,
mutable cursor and reads while retaining their original guard effects.

Pass 59 named decoded sprite count, canvas, offsets, dimensions, palette,
indices and alpha state, plus the sheet decoder, archive acquisition, partial
cleanup, font factories/loaders and five sprite builders. Original RGB/ARGB/
indexed choices, retained alpha arrays and failure cleanup remain unchanged.

Pass 58 completed guarded names for the four-class font hierarchy, including
palette selection, nearest-color search, grayscale conversion, glyph indices,
packed blending and captured increments. Shared glyph contracts stay unchanged.

Pass 57 named `BitmapFont` and `MonochromeBitmapFont`, including metrics,
kerning, markup wrapping, paragraph layout, shared text style, inline images and
mask/alpha blitting. The shared glyph contracts match all three renderers.

Pass 56 named 168 raster drawing locals and two scanline-mask arrays. Every
field, method, parameter and local in `SoftwareRasterizer` has a guarded name.
Circle geometry, clipped spans, alpha weights, gradients, line stepping and
unrolled clearing have explicit roles; large labeled bodies remain.

Pass 55 named 61 blur-kernel locals and three reusable channel-sum
caches. Growing, full and shrinking windows, Q14 reciprocal scaling, edge sample
counts, captured indices and shared cache aliases are explicit. Reads and writes
still share the original pixels. Existing native probes do not execute blur.

Pass 54 added 193 guarded identities for the main session renderer
and its draw pipeline. Every `renderSession` local now has a role. Moving and
transient entities, avatar faces, the spawn highlight, pending-action panels,
archive-progress formatting and debug compositing have named contracts. Two
older names were corrected for a reused tutorial-height local and an RGB gray
level previously described as alpha.

Pass 53 added 118 guarded identities for raster presentation and
nine-slice panels. `AwtRasterBuffer` and `ImageProducerRasterBuffer` describe the
pixel/image ownership; the three-class `initialize`/`drawImage` virtual family
keeps matching contracts. Gameplay now restores
`sh.mainRasterBuffer.setAsRasterTarget(...)`. Tutorial prompts and overlays call
`ma.drawNineSlicePanel` with named clipping, border and tile coordinates.

All 2,994 previous complete rules and raw source/generator pins are unchanged.
That pass used 3,112 rules and 30,922 edits. All 303 sources compile, preserving
138,558 bindings and 388 override relationships. The factory's reflective
`Class.forName("ve")` and `ve` class spelling stay unchanged; its methods and
parameters are named. Existing native probes cover their documented scopes;
real AWT presentation, panel drawing and full-game/device behavior remain
unverified. One manifest holds current rules and evidence, with Git for history.

The previous structural pass simplifies 12 primitive value selections and an
existing URL-validation loop, removing 50 lines across eight files. Pointer
spawning now selects its variant in one conditional assignment. All 19,558
declarations and 388 overrides remain; 14 guarded local ordinals migrate in the
dispatcher. That pass used 2,994 naming rules and 30,216 edits without changing any
surviving semantic name, spelling or evidence.

The decompiler also fixes demonstrated diagnostic-string corruption during
carrier substitution. Complete lexical/scope checks restrict edits to identifier
tokens, and qualified generic calls retain explicit type arguments. The generic
emitter passes 36 groups and 54,549 native comparisons. All six existing GeoBlox
native probes preserve their recorded scopes and traces. A clean decompiler
source archive reproduces all 303 raw files and diagnostics byte-exact.

The previous equivalent-join pass removed 1,075 generated carriers and 5,071
lines across 176 files. Its partition-budget fix and scope proofs remain.
Current source pins, decompiler-source archive SHA-256, naming migrations and
verification limits live in the single manifest. Full gameplay, assets and
browser/phone targets remain unverified. Git preserves previous passes.

The previous naming pass added 114 rules for `BufferedSocket`, `PlatformTask`
and `PlatformTaskDispatcher`, including every socket parameter/nonselector
local. Its 308 constructor/read/ring/drain/failure cases remain unchanged,
alongside the earlier shutdown/cache/helper traces.

Difficulty and spawning now name the step flags, sprite-variant/category
bounds, special-kind probability, release interval and queue geometry.
The previous naming pass added 38 rules. The Boolean-carrier pass removed
14 obsolete names and migrated 61 local ordinals plus one generated field type.
The preceding integral-guard pass preserved all 1,194 guarded rules unchanged.
The previous naming pass covered all 23 private static sprite kernels. The
preceding naming pass added 171 rules and completed every parameter/local name in
`Sprite`, `ArgbSprite` and `IndexedSprite`, including ARGB rotation, bilinear
weights, reductions and sprite mutations. All 2,233 prior rules and the raw
input remained unchanged in that naming pass. The preceding structural refresh
preserved every one of the 2,404 rules, applying 27,172 identifier edits. An
expanded existing native drawing probe adds 33,168 transform cases, including
23,340 independent pixel/geometry oracles, while preserving its previous
traces. Original shifts, transparency, inherited smooth rotation and RGB copy
return types remain intact. AWT image loading is supported by source evidence.
Independent native fixtures verify 84,661 additional difficulty/reset/selection cases,
including floating-point casts, recursive failures, partial writes and seeded
random draw consumption. The current input and decompiler revisions are pinned
in the manifest.

The boundary scan now has guarded semantic names for every local and parameter.
An independent geometric oracle verifies 425,042 pixel cases at two framebuffer
strides, plus guard arithmetic and invalid-raster read ordering, against native
bytecode and both source mirrors. Its direct true/false returns are explained
in the reading guide; other opaque names and shared control-flow joins remain.

`node readable/reproduce-geoblox.mjs --check` verifies deterministic regeneration
from the pinned input and bundled naming tool. All original dispatcher methods
use structured control flow, but opaque names, generated carriers and shared
joins remain. Earlier structural and native-behavior investigations are recorded
in the readable reports; they describe their individual historical passes. The
single current manifest holds current naming pins and verification limits, with
prior snapshots in Git. `node readable/reproduce-geoblox.mjs --update` refreshes
the same current export after staging and verification; keep the one current
manifest rather than creating dated JSON files.

## GeoBlox source refresh

The preceding structural refresh shares terminal work inside existing plain blocks, removing
189 lines across seven files. Shutdown in `ba.b(int)` now clears its task once
after the status/join paths. The close/notification monitor, volatile task wait
and interruption catch retain their scope; the redundant selector disappears.
Ten retained selectors become nine. All 2,404 guarded rules and 388 override
relationships are preserved. One declaration and 409 references disappear, with
no named ordinal migration or added reference occurrences.

The generic emitter passes 31 groups, including 432 new native scoped-tail
comparisons. Existing loop, label, try and monitor bodies remain opaque. Exact
terminal clones can skip intact prefixes without assuming loop completion;
retained new labels have a 512-token prefix cap. No new label remains in GeoBlox.
The existing result-helper probe adds 84 controlled native shutdown cases for
interrupt consumption, task release/retention, notification and monitor release,
while retaining its previous helper and cache traces. Real network/device I/O
and guard-triggered `run()` remain unverified. No source bodies are edited by
hand and no new JSON snapshots are created.

The earlier integral-guard pass reused cached JVM integral-predicate evidence to
simplify relational inversions during nested-tail reconstruction. It removes
18 lines across four files and reduces `PlayfieldRules.advanceDifficulty` from 56 lines to
38. Variant, recursive-advance and category updates now each have one path;
category flags are still read after the recursive call, preserving partial
updates and array failures. The earlier local and nested passes reduced this
method from 220 lines to 69 and then 56.

Only integral predicates with unambiguous evidence can use relational
complements. Floating, unknown and conflicting predicates keep logical
negation. Cached operands are never rendered again. Operand order, declaration
scopes and handler/monitor boundaries stay intact; scope or completion
uncertainty still refuses reconstruction. GeoBlox needs no generated block
labels. The preceding Boolean pass eliminates 221 integer locals, including
all 17 difficulty and 13 boundary result carriers.

In that structural pass, all 303 sources compiled with 20,710 unchanged
declaration identities and 388 override edges. Exactly 26 references disappeared with the two category-update
clones and two recursive-advance clones; none were added. All 1,194 guarded names
and evidence remained unchanged, with no ordinal migrations. That mirror
checked 150,801 bindings and made 18,611 identifier edits. That emitter revision passed
23 groups and 40,129 native comparisons, including 35,280 new integral-guard
checks. All six game probes retain their native traces. Clean committed
decompiler source reproduces all raw Java and diagnostics; dictionary reversal
restores all 303 raw files byte-for-byte. Whole-game behavior, other shared joins
and unknown names remain unverified.

The previous terminal-return reconstruction removed 254 selectors and the
boundary scan's 13-arm post-try ladder. Shared joins and throwing continuations
retain their routing; the forced dispatcher still refuses explicit monitors.
Earlier numeric cleanup remains. Transformed class inputs are unchanged.

A clean decompiler Git source archive reproduces all 303 Java files and current
diagnostics byte-for-byte. Every source compiles and the export has no hard
failures or dispatchers. The [GeoBlox provenance](decompilation/geoblox-provenance.json)
records the exact generator source commit and SHA-256, unchanged class inputs
and verification scope. The readable mirror's explicit input pin is maintained
through its guarded update procedure. The other 43 games retain the prior
full-catalog export. Whole-game behavior, FPS, heap and phone targets are not
established by these source checks.

## Previous full-catalog regeneration

The 2026-08-17 regeneration updates all 44 games from tracked-clean generator
commits. Every game has a complete source set and passed the transformed-bytecode
verifier and a whole-game `javac` compilation: 18,481 Java sources for 18,481
input classes, with zero pipeline, verifier, decompiler, or `javac` failures.
The exact generator commits, arguments, gates, destination base, and
synchronized game list are recorded in
[`decompilation-provenance.json`](decompilation-provenance.json).

Unlike the previous rerun, this one changes source content. The file set is
unchanged — no source was added or removed — but **389 of the 18,481 files have
different contents**, concentrated in each gamepack's largest and most
control-flow-heavy classes. Two causes account for the churn:

- Three decompiler defects that silently corrupted output were fixed. A
  short-circuit `||` reconstruction merged branch predecessors without checking
  that the last branch actually fell through, which dropped a call that sat
  between them; `dup` duplicated the *expression* rather than the value, so
  a chained assignment re-evaluated its operand after the first store had
  already overwritten it; and an array literal held on the operand stack kept
  its already-collected elements as lazily rendered local reads, so an element
  whose local a later store overwrote reported the value at render time instead
  of the value at its own position in the sequence. All three change emitted
  behaviour, not just formatting.

  The first two were localized by bisecting a recompiled gamepack against the
  original. The third surfaced only by booting the recompiled tree on a native
  JRE, and is a good illustration of why compiling is not evidence of
  correctness: it left one game's generated config geometry a single entry
  short, so a later index ran one past the end of an array sized from that
  length. The `ArrayIndexOutOfBoundsException` was swallowed by the game's own
  top-level handler, which killed the loading thread without printing a trace —
  the applet did not crash, it simply sat at a blank loading screen forever.
- Methods with a high conditional fan-in (six or more conditional edges sharing
  one target — the shape obfuscated boolean guards produce) now prefer the owned
  CFG structurer over the legacy range recognizer, which restructures those
  methods in a single pass. This reshapes the affected method bodies.

This publication uses the verifier-safe bytecode profile plus the closed-world
fixed-point proof for mutually guarded default-false static fields. It does not
enable the broader experimental interclass constant-argument, signature
compaction, or checked-catch cleanup gates. Consequently, this snapshot retains
the original method descriptors and contains no `signature-map.json` files.

The owned decompiler normalizes duplicate JVM-slot declarations in static
initializers using parsed Java declaration nodes, which is what lets the
865-class Bachelor Fridge gamepack decompile without class or method-name
special cases.

Compilation is not correctness: these gates prove every game recompiles, not
that every game still behaves identically. To check behaviour rather than
compilability, every game in this tree was booted on a native JRE (HotSpot) as
both the original gamepack and the recompiled class tree, and timed from the
moment the Jagex logo finishes to the moment its main menu is on screen. All 44
games reach their main menu in both variants, giving 44 paired measurements and
no timeouts; the paired median difference is +1.4% (median 5.73 s original
versus 6.28 s recompiled). Reaching the menu at all is the substantive result —
it is a whole-startup behavioural check, and it is what the array-literal defect
above used to fail.

The per-game percentages are not: the same sweep run twice moves an individual
game's figure by 33 percentage points at the median, and the original gamepack
alone — identical bytes both times — drifts 14% between runs. Startup is
dominated by disk and cache state, and one run per variant cannot resolve
anything smaller than that. Treat only the aggregate as meaningful.

## What "obfuscated" means here

The original gamepacks were shipped obfuscated. Class, field, and method names
are single/short meaningless identifiers (`a`, `b`, `bl`, `client`, …). The
decompiler recovers **structure** (control flow, expressions, method bodies),
**not names**. So the code is readable as logic, but the identifiers carry no
semantic meaning. This is expected and is not something the decompiler tries to
"fix".

## Constant-expression cleanup

This snapshot enables
`PIPELINE_ALLOW_MUTUALLY_GUARDED_FALSE_CYCLES=1`. The pipeline analyzes each
complete gamepack as a closed world and removes only static zero/false sentinel
cycles whose writes cannot make any member true. The proof reaches a fixed point
across the complete class corpus; partial-corpus use is deliberately not
enabled by default.

The broader `--experimental-interclass-dce` mode is available but was not used
for this publication. It uses CFG stack analysis to specialize a read-only
integer-like parameter when every reachable direct call supplies the same
constant, then repeats specialization, constant folding, branch DCE, and
unreachable-code removal to a bounded fixed point. Parameters written with
either a store or `iinc` are excluded. A separate signature gate can remove a
contiguous trailing run of specialized parameters from private or internal
static method descriptors and every proven direct call. When enabled and
accepted, each game's `signature-map.json` records old and new signatures,
removed parameter indexes and values, analysis iterations, and inherited
call-site owner aliases resolved against the complete hierarchy. Virtual and
interface method families are not compacted. An
internal interface would need a family-wide proof that the parameter is dead in
the interface declaration and every implementation, followed by a coordinated
rewrite of every implementation and every `invokeinterface`/`invokevirtual`
call. If one implementation uses it, or the family is reachable through a
public, platform, or callback API, its signatures must remain unchanged.
The local evaluator also folds side-effect-free `int` and `long` literal
arithmetic, conversions, comparisons, and JVM-masked shift counts. It removes neutral operations
such as `x + 0`, `x ^ 0`, and `x * 1`, combines adjacent additive constants,
and deletes branches whose conditions become literal constants. In the emitted
source, the bytecode idiom `x ^ -1` is written as the equivalent `~x`; when it
is compared with a constant, the bound is complemented and a signed inequality
is reversed as required.

The evaluator deliberately does not reassociate floating-point or string
expressions, suppress integer division/remainder by zero, or fold across an
alternate control-flow entry. Integer overflow and shift distances follow JVM
semantics. Interclass argument specialization is limited to gamepack-internal
methods for which every direct caller supplies the same literal; public applet,
platform callback, networking, OS, reflection/native, and otherwise external
entry points remain open. The feature is gated in the generating pipeline so a
runtime A/B build can disable it if later experimentation finds a bad
closed-world assumption.

The independently gated checked-catch cleanup
(`PIPELINE_EXPERIMENTAL_UNTHROWABLE_CATCH_DCE=1`) was also not enabled for this
snapshot. When enabled, after control-flow
reconstruction, a catch of a specific checked type is retained only when the
emitted try contains a call whose Java declaration throws that type. Otherwise
both the catch and the decompiler's synthetic `if (false)` reachability throw
are removed. Broad `Throwable`, `Exception`,
`RuntimeException`, and `Error` catches remain conservative because ordinary
JVM instructions can produce them. This is a source-readability policy: it does
not preserve a specific checked exception propagated by bytecode when no
source-visible `throws` declaration supports it, and is gated so runtime A/B
testing can disable it if that closed-world choice proves wrong.

## Deobfuscation guide

The pipeline works primarily on classfile instructions before Java is printed.
The examples below use Krakatau-style `.j` notation; constant-pool spelling can
vary, but the stack operations and descriptors are the same. “Implemented”
means the transform was available to the pipeline that generated this
repository. Stronger experimental transforms remain gated as noted.

| Area | Snapshot status | Main safety condition |
| --- | --- | --- |
| Literal constant evaluation | Implemented | JVM integer/long semantics; do not remove observable exceptions |
| Constant-branch and unreachable-code DCE | Implemented | CFG reachability and incoming-edge checks |
| Interclass constant-argument specialization | Implemented, gated; not enabled for this snapshot | Complete gamepack; every resolved direct caller agrees |
| Private/internal-static signature compaction | Implemented and gated; not enabled for this snapshot | Trailing dead parameters; all owner aliases rewritten; complete staged gamepack verifies |
| Virtual/interface family compaction | Not implemented | Would require one proof and rewrite across the whole family |
| Checked-catch cleanup | Implemented, separately gated; not enabled for this snapshot | Specific checked type is not declared throwable by the emitted try |
| Control-flow and stack-shape normalization | Implemented | Stack effects, labels, exception ranges, and verifier guards agree |

### Literal evaluation and branch DCE

The local evaluator folds side-effect-free literal expressions using JVM
overflow, signed division, and masked shift-distance rules. For example:

```java
if (((6 * 7) ^ 0) != 42) {
    throw new IllegalStateException();
}
render();
```

has this representative `.j` shape:

```text
bipush 6
bipush 7
imul
iconst_0
ixor
bipush 42
if_icmpeq Lok
new java/lang/IllegalStateException
dup
invokespecial Method java/lang/IllegalStateException <init> ()V
athrow
Lok:
invokestatic Method Game render ()V
return
```

After constant evaluation, the comparison is known true. The branch and its
literal producers are simplified, then CFG reachability removes the trap:

```java
render();
```

```text
invokestatic Method Game render ()V
return
```

This is not textual replacement. A fold is rejected when another branch can
enter the middle of the producer sequence, when the instruction is an
exception-handler entry, or when evaluation can throw. Thus `1 / 0` remains an
`idiv`, and floating-point reassociation is not attempted.

Neutral integer operations are removed (`x + 0`, `x ^ 0`, `x * 1`), adjacent
additive constants are combined with 32/64-bit wraparound, and JVM shift counts
are normalized (`x << 35` is `x << 3` for an `int`). The idiom `x ^ -1` is
printed as `~x`; comparisons are complemented and direction-flipped when
necessary to preserve signed ordering.

### Constant arguments across classes

Dummy guard parameters are common in these gamepacks:

```java
private void c(ce value, int guard) {
    if (guard != 18580) {
        throw new IllegalStateException();
    }
    consume(value);
}

// Every reachable direct caller:
this.c(value, 18580);
```

```text
; callee a.c(Lce;I)V
iload_2
sipush 18580
if_icmpeq Lok
aconst_null
athrow
Lok:
aload_0
aload_1
invokespecial Method a consume (Lce;)V
return

; caller
aload_0
aload_1
sipush 18580
invokespecial Method a c (Lce;I)V
```

CFG stack analysis associates argument stack values with descriptor
parameters, including calls containing category-two `long`/`double` values. A
parameter is specialized only when every reachable direct call to the resolved
declaration supplies the same integer-like constant. A constant-pool reference
whose owner is a subclass is resolved through the full hierarchy and counted
against the inherited declaration; `Child.m(...)` is not ignored when `m` is
declared on `Parent`.

The body first becomes:

```java
private void c(ce value, int guard) {
    consume(value);
}
```

Specialization, branch folding, and unreachable removal repeat to a bounded
fixed point. Deleting a dead caller in iteration one can reveal that all
remaining calls to another method use the same value in iteration two.
Parameters written by `istore` or `iinc` are never read-only facts.

### Signature compaction and its dictionary

The separately gated signature pass can remove a contiguous trailing run of
specialized, unused integer-like parameters from a private or internal static
method. The following describes the feature when its atomic verifier guard
accepts a gamepack; the current snapshot retained the original signatures and
does not contain these maps.

```java
// Before
private void c(ce value, int guard) { consume(value); }

// After
private void c(ce value) { consume(value); }
```

Conceptually, bytecode rewriting first preserves argument evaluation:

```text
aload_0
aload_1
sipush 18580
pop
invokespecial Method a c (Lce;)V
```

The peephole pass can then remove a side-effect-free literal producer followed
by `pop`. If an argument expression had side effects, its evaluation would
remain and only its result would be discarded. A branch label on the old
invocation moves to the first inserted `pop`, so an incoming edge still sees
the same operand-stack consumption.

Each `games/<game>/signature-map.json` preserves identity for mapping tools:

```json
{
  "formatVersion": 1,
  "signatures": {
    "a.c(Lce;I)V": {
      "newSignature": "a.c(Lce;)V",
      "oldDescriptor": "(Lce;I)V",
      "newDescriptor": "(Lce;)V",
      "callSiteSignatures": ["a.c(Lce;I)V"],
      "removedParameters": [
        { "index": 1, "descriptor": "I", "value": 18580, "discoveredIteration": 2 }
      ]
    }
  }
}
```

Java overload identity ignores return type, unlike a JVM descriptor. The pass
rejects a proposal that collides with another source method in the same class
or an ancestor/descendant. It also records and rewrites inherited call-site
owner aliases. Constructors, open APIs, virtual dispatch, and interface
families are currently excluded.

### Branch matching versus textual matching

Cleanup rules match semantic bytecode/CFG shapes, not source text or fixed
instruction offsets. A candidate normally has to satisfy all applicable
conditions:

- opcode and operand descriptors match the rule;
- stack consumption/production is known at rewritten instructions;
- no alternate edge enters a producer sequence;
- labels and `tableswitch`/`lookupswitch` targets remain valid;
- exception-handler entry stacks and protected ranges are preserved;
- local writes, including parsed `iinc varnum`, invalidate read-only facts;
- method references resolve to the same declaration through inheritance;
- the emitted class passes orphan-local and ASM verifier guards.

For example, these instructions look locally constant but cannot be folded
because `Lrhs` has another incoming edge:

```text
iconst_1
Lrhs:
iconst_1
if_icmpne Lbad
goto Lrhs
```

A raw three-instruction matcher would delete a stack producer needed by the
backedge. The implemented branch folder collects incoming CFG labels first and
rejects the candidate.

### Guarded pattern patching

Some obfuscator shapes need a narrow structural patch before a general
decompiler can print them cleanly. Implemented passes cover families including
shared goto tails, duplicated loop suffixes, stack-carrying joins,
boolean/null comparisons, and verifier-sensitive local splitting. A typical
duplicated loop-tail shape is:

```text
ifeq Lother
iinc 4 1
goto Lhead
Lother:
; ...
iinc 4 1
goto Lhead
```

When the suffix instructions, local, increment direction, and destination
match exactly, the duplicate can target one canonical tail. The Java then has
a normal `continue` rather than a raw state-machine edge:

```java
if (condition) {
    ++index;
    continue;
}
// ...
++index;
```

These patches include method/descriptor, CFG, dominance, exception-range,
local-slot, and stack-shape guards as appropriate. Mutating passes save and
reload the class. A pass that creates a new uninitialized local read or fails
ASM verification is reverted for that class. A final failed class is never
synced into this repository.

### Control-flow reconstruction and fallbacks

The owned decompiler reconstructs `if`/`else`, loops, `switch`, short-circuit
booleans, `break`, and `continue` from CFG regions. Stack values crossing joins
are materialized as typed Java locals when they cannot safely remain inline.
The goal is compilable structured Java, not line-for-line bytecode.

When a region cannot yet be structured, a state-machine fallback may be
emitted. Fallback counts are recorded separately from verification and Java
compilation. They are readability debt: complete source parity and successful
`javac` are still required before sync, although a compile-clean game can
contain a small number of fallback methods.

### Checked catches and synthetic `if (false)` throws

Java rejects a catch of a checked exception when the source-visible try body
cannot throw it. A decompiler can use an unreachable anchor solely to make such
source compile:

```java
try {
    work();
    if (false) throw (MyCheckedException) null;
} catch (MyCheckedException ex) {
    recover(ex);
}
```

Under the checked-catch cleanup gate, declaration analysis removes both the
specific catch and its anchor when no call in the emitted try declares that
checked type. Broad `Throwable`, `Exception`, `RuntimeException`, and `Error`
catches remain conservative because ordinary instructions can produce
unchecked failures. Removing a genuinely unreachable throw has no runtime
effect; removing its catch changes the source exception contract, so this
policy remains independently gated.

### Possible next deobfuscations

The following extensions are useful but are not claimed by this snapshot:

- **Internal interface-family compaction:** prove a parameter dead in the
  declaration and every implementation, then rewrite the family and all
  virtual/interface calls atomically.
- **Semantic names and types:** infer names such as `render`, `packet`, or
  `sprite` from behavior. Current short obfuscated identifiers are retained.
- **Broader interprocedural propagation:** propagate finite enums, strings, or
  immutable objects. Current cross-class facts are integer-like constants.
- **More fallback elimination:** structure remaining irreducible/state-machine
  CFGs after equivalence and verifier proofs are available.

Every stronger transform needs the same escape hatch used here: a separate
gate, deterministic diagnostics and mapping output, full-game bytecode
verification, full source recompilation, and representative runtime A/B tests.

## Source repositories

- **[Kreijstal/dekobloko-work](https://github.com/Kreijstal/dekobloko-work)** —
  the FunOrb/AlterOrb harness: gamepack retrieval scripts, the decompile
  pipeline, the launcher, and the `scripts/decompile-all-games.sh` workflow that
  produced everything in this repo.
- **[Kreijstal/java-tools](https://github.com/Kreijstal/java-tools)** — the
  JVM/decompiler toolkit: a JavaScript implementation of the JVM, a Jasmin
  assembler/disassembler, and the decompiler under `src/decompiler` that
  actually generated the Java source here.

## Compilation stubs

The games reference native/platform classes that are **not** part of the
standard JDK — Microsoft J++ runtime (`com.ms.*`), DirectX/Direct3D bindings
(`com.ms.directX`, `jagdx`), OpenGL (`jaggl`), Jagex native peers (`jaclib`,
`jagex3`), the AlterOrb launcher hook, and the browser `netscape.javascript.JSObject`.
Minimal source **stubs** for these live under [`stubs/src/`](stubs/src) (49 `.java`
files) so the decompiled sources have something to compile against.

Build them into a jar with:

```sh
cd stubs && ./build-stubs.sh   # produces stubs/funorb-stubs.jar
```

These stubs mirror `scripts/build-stubs.sh` in
[dekobloko-work](https://github.com/Kreijstal/dekobloko-work). They provide
signatures only (no real behavior) — enough to satisfy the compiler, not to run
the games.

## Field renaming and the ABI-restore dictionary

The obfuscator reuses single letters for **both class names and field names** —
a game can have a class literally named `a` *and* fields named `a`, `b`, `c`.
In Java **source** the expression `a.b` is then ambiguous (static field `b` of
class `a`, vs. member `b` of a local variable `a`). To keep the emitted source
unambiguous, the decompiler prefixes every game-class field with `field_`
(`a` → `field_a`, `h` → `field_h`). Methods, classes, and local variables are
**not** part of this rename.

### How the decompiler "knows" what it renamed

There is no per-name lookup table. The rename is a **deterministic global rule**,
computed purely from each reference `(owner, name)` in
`src/decompiler/cfr.js` (`sourceFieldName`):

- **field of a game class** — owner is an obfuscated single-segment internal
  name (no `/`, e.g. `hd`, `oj`) → prefix `field_`. Applied **uniformly**: the
  same field is prefixed at its declaration *and* at every
  `getfield/putfield/getstatic/putstatic` in every class.
- **field of a JRE/library class** — owner contains `/` (e.g.
  `java/lang/System`) → left untouched.

Because the decision is a pure function of the reference, the map is currently
just the invertible rule **"strip `field_` from game-class fields"** — the
decompiler and any consumer can recompute it without storing anything. An
explicit dictionary is only required once a name *collision* forces a
**non-uniform** rename (then the mapping is no longer a plain prefix and must be
recorded per member). Emitting that dictionary is tracked in
[dekobloko-work#11](https://github.com/Kreijstal/dekobloko-work/issues/11).

### Why it matters (ABI compatibility)

The `field_` prefix is a **source-only** concern — in bytecode a field
reference already carries `owner + name + descriptor`, so it is fully
reversible. But if you recompile the emitted source as-is, the resulting
classes declare `field_h` while the *original* peers still reference `h`, so a
recompiled class dropped into the otherwise-original jar fails at link time with
`NoSuchFieldError: h`. That blocks **differential bisection** (swapping one
recompiled class into the original jar to localize a codegen bug).

### Restoring the original ABI

The [dekobloko-work](https://github.com/Kreijstal/dekobloko-work) harness ships
an ASM-based restore pass that rewrites recompiled classes back to the original
field names (declarations *and* references), producing **ABI-identical** output
that links against the originals. Field-name-only edits leave stack-map frames
and operand sizes untouched, so no `StackMapTable` recomputation is involved:

```sh
# in dekobloko-work
scripts/restore-abi.sh <recompiledClassesDir> <outDir> \
  --verify-against <originalClassesDir>
```

`--verify-against` asserts, per class, that the restored field
`{name, descriptor}` set equals the original's — i.e. the recompiled class is a
drop-in ABI match. The companion `AbiTools link` mode statically resolves every
field reference across a class set and reports any latent `NoSuchFieldError`,
which is the server-free oracle used to confirm a mixed (original + one
recompiled) jar actually links.

## Work in progress — known bugs being ironed out

This is decompiler output under **active correction**. The reconstructed
*structure* is faithful, but some methods still have **runtime-behaviour** bugs
where the emitted Java, though it compiles, does not branch identically to the
original bytecode. Known open classes of bug (tracked in dekobloko-work):

- **ABI dictionary emission** — see above
  ([#11](https://github.com/Kreijstal/dekobloko-work/issues/11)).

These are being localized via the ABI-restore + bisection workflow above and
fixed in the decompiler; the sources here are regenerated as fixes land.

## Caveats

- This is **decompiler output**. The current 44-game snapshot was verified to
  recompile cleanly with `javac`, but it is not intended to be a drop-in
  runnable distribution.
- The goal is faithful reconstruction of program structure for research and
  preservation, not pristine source.
- Some methods still carry runtime-behaviour bugs (see *Work in progress*
  above); recompiled output may not yet behave identically to the original.
- Names are obfuscated (see above).

## Games included

All **44** games are included — this is the full canonical roster, and every
one produced decompiled Java. Total: **18,481** `.java` files across 44 games.

| Game | `.java` files |
| --- | --- |
| 36cardtrick | 295 |
| aceofskies | 545 |
| arcanistsmulti | 363 |
| armiesofgielinor | 542 |
| bachelorfridge | 865 |
| bouncedown | 289 |
| brickabrac | 420 |
| chess | 346 |
| confined | 341 |
| crazycrystals | 394 |
| dekobloko | 343 |
| drphlogistonsavestheearth | 306 |
| dungeonassault | 387 |
| escapevector | 348 |
| fleacircus | 306 |
| geoblox | 303 |
| holdtheline | 356 |
| hostilespawn_vengeance | 335 |
| kickabout | 543 |
| lexicominos | 297 |
| minerdisturbance | 341 |
| monkeypuzzle2 | 303 |
| orbdefence | 311 |
| pixelate | 397 |
| pool | 429 |
| shatteredplans | 457 |
| solknight | 294 |
| starcannon | 287 |
| steelsentinels | 347 |
| stellarshard | 301 |
| sumoblitz | 586 |
| terraphoenix | 311 |
| tetralink | 355 |
| tombracer | 1090 |
| torchallenge | 300 |
| torquing | 396 |
| trackcontroller | 298 |
| transmogrify | 299 |
| vertigo2 | 437 |
| virogrid | 347 |
| voidhunters | 1570 |
| wizardrun | 298 |
| zombiedawn | 386 |
| zombiedawnmulti | 417 |

## Legal

These are **decompiled third-party game assets**, reconstructed from publicly
retrievable FunOrb/AlterOrb gamepacks and published here for **research and
preservation** purposes. No ownership of the underlying games is claimed, and no
license is granted over the original games or their assets. All rights to the
original games remain with their respective rights holders. The decompilation
tooling itself lives in the linked repositories.
