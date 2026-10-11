# Reading Armies of Gielinor

Java here is the single published version. Rebuild from pinned raw Git input using Deko’s `readable/reproduce-armiesofgielinor.mjs`. The current reverse dictionary is `../../decompilation/armiesofgielinor-naming.json`.

This gameplay naming pass reviews 80 class identities across all 542 compiled classes. Other class/member names remain unresolved. Unresolved packed flags use bit-position names without guessing gameplay effects. Renamed identifiers have no opaque suffixes; the dictionary records their original identities.

| Start here | Follow |
| --- | --- |
| [Battlefield](Battlefield.java) | Map geometry, player/team state, mana, turns, god favour and unit/event collections. |
| [Unit](Unit.java) / [MapTile](MapTile.java) / [TileMetadata](TileMetadata.java) | Unit coordinates and strength; tile occupants, terrain, owners and tagged metadata. |
| [TeamRoster](TeamRoster.java) | Team membership and player lists. |
| [GameplayController](GameplayController.java) → [MovementPlanner](MovementPlanner.java) / [AiPlanner](AiPlanner.java) | Gameplay coordination, movement planning and AI evaluation. |
| [GameEvent](GameEvent.java) → [TurnEffectEvent](TurnEffectEvent.java) / [OwnerChangeEvent](OwnerChangeEvent.java) / [ManaEvent](ManaEvent.java) | Event application, turn effects, ownership changes and mana. |
| [MoveEvent](MoveEvent.java) / [AttackEvent](AttackEvent.java) / [CombatEvent](CombatEvent.java) / [DamageEvent](DamageEvent.java) / [DeathEvent](DeathEvent.java) | Movement, attacks, combat records, damage/poison and death. |
| [SummonEvent](SummonEvent.java) / [TeleportEvent](TeleportEvent.java) / [TelefragEvent](TelefragEvent.java) / [TelepopEvent](TelepopEvent.java) / [StateChangeEvent](StateChangeEvent.java) | Summoning, teleport variants and state changes. Event names follow their own diagnostic text. |
| [RevivalEvent](RevivalEvent.java) / [SpellCastEvent](SpellCastEvent.java) / [TurnChangeEvent](TurnChangeEvent.java) | Revival, spell casts and turn changes. All 21 concrete GameEvent subclasses have reviewed names. |
| [Spell](Spell.java) → [UnitSpell](UnitSpell.java) / [ActionSpell](ActionSpell.java) / [GlobalSpell](GlobalSpell.java) | Unit, action and global spells: definition IDs, payload serialization and effect lifecycle. |
| [ActionRequest](ActionRequest.java) / [PreparedAction](PreparedAction.java) | Action requests and prepared battlefield actions. |
| [MoveAttackRequest](MoveAttackRequest.java) / [SummonRequest](SummonRequest.java) / [DeployRequest](DeployRequest.java) / [SpellCastRequest](SpellCastRequest.java) / [SphinxActionRequest](SphinxActionRequest.java) | Movement/attack, summoning, deployment, spell and Sphinx-assisted requests. |
| [MoveAttackAction](MoveAttackAction.java) / [SummonAction](SummonAction.java) / [DeployAction](DeployAction.java) / [SpellCastAction](SpellCastAction.java) / [VineGrowthAction](VineGrowthAction.java) / [TeleportAction](TeleportAction.java) | Prepared actions queue their corresponding gameplay events. |
| [DisplacedUnitMarker](DisplacedUnitMarker.java) / [StateChangeMarker](StateChangeMarker.java) / [CorpseConditionMarker](CorpseConditionMarker.java) / [SkeletonLimitMarker](SkeletonLimitMarker.java) | Turn-condition markers; their canonical application is a no-op. |
| [EventPresenter](EventPresenter.java) → [EventPresentation](EventPresentation.java) | Event dispatch, presentation frames and acknowledgement. |
| [CombatPresentation](CombatPresentation.java) / [MovementPresentation](MovementPresentation.java) / [EffectPresentation](EffectPresentation.java) / [PopupPresentation](PopupPresentation.java) | Combat, movement, effects and popups. |
| [AiPlanner](AiPlanner.java) → [AiUnitPlanner](AiUnitPlanner.java) / [AiActionCandidate](AiActionCandidate.java) | Per-unit AI evaluation and selected actions. |
| [AiPlanningStrategy](AiPlanningStrategy.java) → [BestScoreStrategy](BestScoreStrategy.java) / [WeightedScoreStrategy](WeightedScoreStrategy.java) | Highest-score and weighted candidate selection, recycling and reset. |
| [CombatSandbox](CombatSandbox.java) / [UnitInfoPopup](UnitInfoPopup.java) | Standalone combat sandbox and animated unit information popups. |
| [TutorialController](TutorialController.java) | Tutorial stages, prompts and flashing controls. |
| [PacketBuffer](PacketBuffer.java) / [CipherPacketBuffer](CipherPacketBuffer.java) / [TaggedFieldReader](TaggedFieldReader.java) | Packet data, ciphered opcodes and tagged-field decoding. |

Start with `Battlefield.getUnitAt`, `queueCombatConsequences`, `Unit.applyStrengthDamage`, `Spell.applyEffect` and `MovementPlanner.reconstructPath`. Grid indexing is `tileX + tileY * mapWidth`; `getUnitAt` keeps the original argument order (y, guard, x). Dummy guards and their side effects remain intact. `GameEvent.applyToBattlefield` names the complete resolved override family.

Combat payloads now name attacker/defender positions, offsets, damage, death flags and animation counts. The central consequence routine names its attacker/defender and healing/poison locals. Unit movement-spent and attacks-remaining state are separate; spell status and equipment descriptors are also separate. `SpellCastEvent` replaces the earlier trinket label: its legacy diagnostic says Trinketused, but the concrete implementations read the spell definition table.

ActionRequest and PreparedAction replace the overly narrow SpellArea names: all five request subclasses and ten prepared-action subclasses have been reviewed. ActionSpell wraps an action rather than defining a geometric area. AI summoningPlayer and summonUnitType replace the misleading spellId/selectionVariant pair. Teleport target deltas are relative offsets, not absolute destination coordinates. PreparedAction.playerFlags is indexed by player, not by tile. Unused constructor arguments and no-op marker application remain unchanged.

Battlefield.predictCombat returns [defenderDamage, attackerDamage, deathFlags], where flags 1/2 mean attacker/defender death. computeAttackPower, scaleIncomingDamage and getDamageTakenPercent expose matchup strength, cover and protection; integer truncation, damage caps and unusual protected-target behavior are preserved. Unit capability names distinguish flying eligibility, anti-flying bonus, structure capture and Sea Slug parasitism. Tile effects are indexed by team, while summoning permissions and local god favour are separate checks.

The naming pass changes identifiers and lexical labels, not control flow. Three files still retain compiler dispatcher fallbacks, and large methods remain. More semantic work is needed in combat, spells, AI, tutorial stages and multiplayer packet handling.

The exporter compiles both complete corpora and verifies bindings/overrides. A headless raw-versus-named probe checks rectangular map lookup, team membership, unit flags/damage, equipment/ranges, combat payloads, spell serialization, tile metadata, AI candidate selection/recycling, packed move request decoding, prepared action event payloads, combat/cover calculations, team tile effects, summoning permissions, popup animation and event presentation acknowledgement against independent expectations. It bypasses battlefield construction and the Applet graph; it does not establish whole-game playability, AI quality or server compatibility. Exact dictionary reversal recovers every original source byte.
