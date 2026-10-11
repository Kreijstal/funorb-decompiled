# Reading Armies of Gielinor

Java here is the single published version. Rebuild from pinned raw Git input using Deko’s `readable/reproduce-armiesofgielinor.mjs`. The current reverse dictionary is `../../decompilation/armiesofgielinor-naming.json`.

This first gameplay pass reviews 39 class identities across all 542 compiled classes. Other class/member names remain unresolved. Unresolved packed flags use bit-position names without guessing gameplay effects. Renamed identifiers have no opaque suffixes; the dictionary records their original identities.

| Start here | Follow |
| --- | --- |
| [Battlefield](Battlefield.java) | Map geometry, player/team state, mana, turns, god favour and unit/event collections. |
| [Unit](Unit.java) / [MapTile](MapTile.java) / [TileMetadata](TileMetadata.java) | Unit coordinates and strength; tile occupants, terrain, owners and tagged metadata. |
| [TeamRoster](TeamRoster.java) | Team membership and player lists. |
| [GameplayController](GameplayController.java) → [MovementPlanner](MovementPlanner.java) / [AiPlanner](AiPlanner.java) | Gameplay coordination, movement planning and AI evaluation. |
| [GameEvent](GameEvent.java) → [TurnEffectEvent](TurnEffectEvent.java) / [OwnerChangeEvent](OwnerChangeEvent.java) / [ManaEvent](ManaEvent.java) | Event application, turn effects, ownership changes and mana. |
| [MoveEvent](MoveEvent.java) / [AttackEvent](AttackEvent.java) / [CombatEvent](CombatEvent.java) / [DamageEvent](DamageEvent.java) / [DeathEvent](DeathEvent.java) | Movement, attacks, combat records, damage/poison and death. |
| [SummonEvent](SummonEvent.java) / [TeleportEvent](TeleportEvent.java) / [TelefragEvent](TelefragEvent.java) / [TelepopEvent](TelepopEvent.java) / [StateChangeEvent](StateChangeEvent.java) | Summoning, teleport variants and state changes. Event names follow their own diagnostic text. |
| [RevivalEvent](RevivalEvent.java) / [TrinketUseEvent](TrinketUseEvent.java) / [TurnChangeEvent](TurnChangeEvent.java) | Revival, trinket use and turn changes. All 21 concrete GameEvent subclasses have reviewed names. |
| [TutorialController](TutorialController.java) | Tutorial stages, prompts and flashing controls. |
| [PacketBuffer](PacketBuffer.java) / [CipherPacketBuffer](CipherPacketBuffer.java) / [TaggedFieldReader](TaggedFieldReader.java) | Packet data, ciphered opcodes and tagged-field decoding. |

Start with `Battlefield.getUnitAt`, `arePlayersAllied`, `registerUnit` and `Unit.applyStrengthDamage`. Grid indexing is `tileX + tileY * mapWidth`; `getUnitAt` keeps the original argument order (y, guard, x). Dummy guards and their side effects remain intact. `GameEvent.applyToBattlefield` names the complete resolved override family.

The naming pass changes identifiers and lexical labels, not control flow. Three files still retain compiler dispatcher fallbacks, and large methods remain. More semantic work is needed in combat, spells, AI, tutorial stages and multiplayer packet handling.

The exporter compiles both complete corpora and verifies bindings/overrides. A headless raw-versus-named probe checks rectangular map lookup, team membership, unit flags/damage and tile metadata against independent expectations. It bypasses battlefield construction and the Applet graph; it does not establish whole-game playability, AI quality or server compatibility. Exact dictionary reversal recovers every original source byte.
