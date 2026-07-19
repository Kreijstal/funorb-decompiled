/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class mn extends tc {
    int field_p;
    boolean field_u;
    int field_o;
    static String[][] field_m;
    static long field_s;
    static int field_n;
    static int[] field_t;
    static kk[][] field_k;
    static String field_r;
    static String[] field_l;
    static String field_q;

    final static void a(boolean param0, int param1, int param2, byte param3, int param4, int param5) {
        if (param3 <= 64) {
            return;
        }
        if (param0) {
            return;
        }
        if (0 > param1) {
            return;
        }
        if (param4 < 0) {
            return;
        }
        if (param1 >= ks.field_y) {
            return;
        }
        if (!(param4 < ef.field_c)) {
            return;
        }
        int var6 = param4 * ks.field_y + param1;
        rv.a(false, param5, param2, var6);
    }

    final String a(int param0, String[] param1, String param2) {
        String var4 = null;
        RuntimeException var4_ref = null;
        int var5 = 0;
        String stackIn_3_0 = null;
        String stackIn_4_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_2_0 = null;
        String stackOut_1_0 = null;
        String stackOut_3_0 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        try {
          L0: {
            L1: {
              var5 = 115 % ((param0 - 77) / 34);
              if (1 == param1.length) {
                stackOut_2_0 = param1[0];
                stackIn_3_0 = stackOut_2_0;
                break L1;
              } else {
                stackOut_1_0 = pj.a(593277313, (CharSequence[]) ((Object) param1));
                stackIn_3_0 = stackOut_1_0;
                break L1;
              }
            }
            var4 = stackIn_3_0;
            var4 = "Illegal move (" + param2 + "); player " + this.field_p + ": " + var4 + ".";
            stackOut_3_0 = (String) (var4);
            stackIn_4_0 = stackOut_3_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4_ref = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) (var4_ref);
            stackOut_5_1 = new StringBuilder().append("mn.B(").append(param0).append(',');
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param1 == null) {
              stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackOut_7_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L2;
            } else {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L2;
            }
          }
          L3: {
            stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
            stackOut_8_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_8_2).append(',');
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param2 == null) {
              stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackOut_10_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L3;
            } else {
              stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L3;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ')');
        }
        return stackIn_4_0;
    }

    abstract bd a(int param0, ha param1);

    public static void a(int param0) {
        field_q = null;
        field_k = (kk[][]) null;
        field_l = null;
        if (param0 < 9) {
          field_s = -121L;
          field_r = null;
          field_t = null;
          field_m = (String[][]) null;
          return;
        } else {
          field_r = null;
          field_t = null;
          field_m = (String[][]) null;
          return;
        }
    }

    protected mn() {
        this.field_o = -1;
    }

    static {
        field_m = new String[][]{new String[]{"humans/barbarian/barbarian", "humans/barbarian/barbarian2", "humans/barbarian/barbarian3"}, new String[]{"godwars_stuff/aviansie/avianse", "godwars_stuff/aviansie/avianse2", "godwars_stuff/aviansie/avianse3"}, new String[]{"attack_monkey/gorilla", "attack_monkey/gorilla2", "attack_monkey/gorilla3"}, new String[]{"barbarian_female/barbarian_female"}, new String[]{"dragons/red_dragon/red_dragon"}, new String[]{"tzhaar-ket_warrior/tzhaarket_warrior", "tzhaar-ket_warrior/tzhaarket_warrior2", "tzhaar-ket_warrior/tzhaarket_warrior3"}, new String[]{"dagannoth/lore_dagganoth", "dagannoth/lore_dagganoth2", "dagannoth/lore_dagganoth3"}, new String[]{"humans/portal_mage/portal_mage", "humans/portal_mage/portal_mage2", "humans/portal_mage/portal_mage3"}, new String[]{"humans/paladin/paladin", "humans/paladin/paladin2", "humans/paladin/paladin3"}, new String[]{"birds/lore_sarodomin", "birds/lore_sarodomin2", "birds/lore_sarodomin3"}, new String[]{"humans/monk/monk", "humans/monk/monk2", "humans/monk/monk3"}, new String[]{"humans/saradomin_mage/saradomin_mage", "humans/saradomin_mage/saradomin_mage2", "humans/saradomin_mage/saradomin_mage3"}, new String[]{"humans/white_knight/white_knight", "humans/white_knight/white_knight2", "humans/white_knight/white_knight3"}, new String[]{"unicorn/unicorn_rework", "unicorn/unicorn_rework2", "unicorn/unicorn_rework3"}, new String[]{"centaur/centaur", "centaur/centaur2", "centaur/centaur3"}, new String[]{"lion/godwars_lion", "lion/godwars_lion2", "lion/godwars_lion3"}, new String[]{"humans/saradomin_ranger/saradomin_ranger", "humans/saradomin_ranger/saradomin_ranger2", "humans/saradomin_ranger/saradomin_ranger3"}, new String[]{"humans/priest/priest", "humans/priest/priest2", "humans/priest/priest3"}, new String[]{"godwars_stuff/commander_zilyana/icyene", "godwars_stuff/commander_zilyana/icyene2", "godwars_stuff/commander_zilyana/icyene3"}, new String[]{"werewolf/werewolf", "werewolf/werewolf2", "werewolf/werewolf3"}, new String[]{"skeleton_warrior/skeleton_warrior", "skeleton_warrior/skeleton_warrior2", "skeleton_warrior/skeleton_warrior3"}, new String[]{"humans/necromancer/necromancer", "humans/necromancer/necromancer2", "humans/necromancer/necromancer3"}, new String[]{"humans/zamorak_mage/zamorak_mage", "humans/zamorak_mage/zamorak_mage2", "humans/zamorak_mage/zamorak_mage3"}, new String[]{"humans/black_knight/black_knight", "humans/black_knight/black_knight2", "humans/black_knight/black_knight3"}, new String[]{"black_demon/black_demon", "black_demon/black_demon2", "black_demon/black_demon3"}, new String[]{"humans/zamorak_ranger/zamorak_ranger", "humans/zamorak_ranger/zamorak_ranger2", "humans/zamorak_ranger/zamorak_ranger3"}, new String[]{"dogs/hellhound/dog_update_hellhound_godwars", "dogs/hellhound/dog_update_hellhound_godwars2", "dogs/hellhound/dog_update_hellhound_godwars3"}, new String[]{"sea_slug/slug2_slug_prince", "sea_slug/slug2_slug_prince2", "sea_slug/slug2_slug_prince3"}, new String[]{"gargoyle/npc_update_gargoyle", "gargoyle/npc_update_gargoyle2", "gargoyle/npc_update_gargoyle3"}, new String[]{"pyrelord/update_lore_pyrefiend"}, new String[]{"gnome_rider/terror_bird_update_mounted_spear", "gnome_rider/terror_bird_update_mounted_spear2", "gnome_rider/terror_bird_update_mounted_spear3"}, new String[]{"dogs/wolf/dog_update_wolf_alpha", "dogs/wolf/dog_update_wolf_alpha2", "dogs/wolf/dog_update_wolf_alpha3"}, new String[]{"humans/druid/druid", "humans/druid/druid2", "humans/druid/druid3"}, new String[]{"dwarfs/dwarf_black_guard/dwarf_black_guard", "dwarfs/dwarf_black_guard/dwarf_black_guard2", "dwarfs/dwarf_black_guard/dwarf_black_guard3"}, new String[]{"dwarfs/dwarf_engineer/dwarf_engineer", "dwarfs/dwarf_engineer/dwarf_engineer2", "dwarfs/dwarf_engineer/dwarf_engineer3"}, new String[]{"giants/moss_giant/moss_giant", "giants/moss_giant/moss_giant2", "giants/moss_giant/moss_giant3"}, new String[]{"humans/void_knight/void_knight", "humans/void_knight/void_knight2", "humans/void_knight/void_knight3"}, new String[]{"dwarf_mounted_battle_tortoise/battle_tortoise"}, new String[]{"gnome_copter/copter", "gnome_copter/copter2", "gnome_copter/copter3"}, new String[]{"jade_vine/roots_giant_vine", "jade_vine/roots_giant_vine2", "jade_vine/roots_giant_vine3"}, new String[]{"ent/lore_ent", "ent/lore_ent2", "ent/lore_ent3"}, new String[]{"birds/npc_pets_birds_gyr_falcon", "birds/npc_pets_birds_gyr_falcon2", "birds/npc_pets_birds_gyr_falcon3"}, new String[]{"black_bear/bear_new_black", "black_bear/bear_new_black2", "black_bear/bear_new_black3"}, new String[]{"humans/elf_songstress/elf_songstress_map", "humans/elf_songstress/elf_songstress_map2", "humans/elf_songstress/elf_songstress_map3"}, new String[]{"humans/elf_shieldmaiden/elf_shieldmaiden", "humans/elf_shieldmaiden/elf_shieldmaiden2", "humans/elf_shieldmaiden/elf_shieldmaiden3"}, new String[]{"grenwall/gren_grenwall_npc", "grenwall/gren_grenwall_npc2", "grenwall/gren_grenwall_npc3"}, new String[]{"dogs/dire_wolf/dog_update_wolf_alpha", "dogs/dire_wolf/dog_update_wolf_alpha2", "dogs/dire_wolf/dog_update_wolf_alpha3"}, new String[]{"humans/elf_pikeman/elf_pikeman", "humans/elf_pikeman/elf_pikeman2", "humans/elf_pikeman/elf_pikeman3"}, new String[]{"humans/elf_archer/elf_archer", "humans/elf_archer/elf_archer2", "humans/elf_archer/elf_archer3"}, new String[]{"humans/elf_lord/elf_lord", "humans/elf_lord/elf_lord2", "humans/elf_lord/elf_lord3"}, new String[]{"humans/elf_lady/elf_lady", "humans/elf_lady/elf_lady2", "humans/elf_lady/elf_lady3"}, new String[]{"shapeshifter/crystal_shape_shifter"}, new String[]{"goblins/goblin/goblin", "goblins/goblin/goblin2", "goblins/goblin/goblin3"}, new String[]{"goblins/goblin_high_priest/goblin_highpriest", "goblins/goblin_high_priest/goblin_highpriest2", "goblins/goblin_high_priest/goblin_highpriest3"}, new String[]{"ogres/ogre/ogre", "ogres/ogre/ogre2", "ogres/ogre/ogre3"}, new String[]{"ogres/jogre/jogre", "ogres/jogre/jogre2", "ogres/jogre/jogre3"}, new String[]{"ogres/mogre/npc_update_ogre_male_mogre", "ogres/mogre/npc_update_ogre_male_mogre2", "ogres/mogre/npc_update_ogre_male_mogre3"}, new String[]{"ancient_hobgoblin/hobgoblin"}, new String[]{"ogres/ogre_shaman/ogre_shaman", "ogres/ogre_shaman/ogre_shaman2", "ogres/ogre_shaman/ogre_shaman3"}, new String[]{"giants/cyclops/cyclops", "giants/cyclops/cyclops2", "giants/cyclops/cyclops3"}, new String[]{"orks/ork/ork", "orks/ork/ork2", "orks/ork/ork3"}, new String[]{"ogres/ogress/afr_ogress_warrior1", "ogres/ogress/afr_ogress_warrior2", "ogres/ogress/afr_ogress_warrior3"}, new String[]{"orks/ourg/ourg"}, new String[]{"kalphite_queen/kalphite_queen"}, new String[]{"dogs/jackal/dog_update_jackal", "dogs/jackal/dog_update_jackal2", "dogs/jackal/dog_update_jackal3"}, new String[]{"mummy/smki_mummy_boss", "mummy/smki_mummy_boss2", "mummy/smki_mummy_boss3"}, new String[]{"locust/scab_npc_locust", "locust/scab_npc_locust2", "locust/scab_npc_locust3"}, new String[]{"humans/bedabin_nomad/bedabin_nomad", "humans/bedabin_nomad/bedabin_nomad2", "humans/bedabin_nomad/bedabin_nomad3"}, new String[]{"humans/menaphite_thug/menaphite_thug", "humans/menaphite_thug/menaphite_thug2", "humans/menaphite_thug/menaphite_thug3"}, new String[]{"humans/warrior_of_icthlarin/icthlarin_warrior", "humans/warrior_of_icthlarin/icthlarin_warrior2", "humans/warrior_of_icthlarin/icthlarin_warrior3"}, new String[]{"crocodile/scab_npc_crocodile", "crocodile/scab_npc_crocodile2", "crocodile/scab_npc_crocodile3"}, new String[]{"scabarite_mage/scabarite_mage", "scabarite_mage/scabarite_mage2", "scabarite_mage/scabarite_mage3"}, new String[]{"sphinx/quest_icthalarins_npc_sphinx_update"}, new String[]{"humans/spirit_of_elid/spirit_of_elid"}, new String[]{"dragons/king_black_dragon/king_black_dragon"}, new String[]{"dwarf_multicannon/di2_quest_multicannon_dwarf_full"}, new String[]{"portal/blank_portal_1", "portal/blank_portal_2", "portal/blank_portal_3", "portal/blank_portal_4", "portal/blank_portal_5", "portal/blank_portal_6", "portal/blank_portal_7", "portal/blank_portal_8"}, new String[]{"humans/elf_songstress/elf_songstress_cs", "humans/elf_songstress/elf_songstress_cs2", "humans/elf_songstress/elf_songstress_cs3"}, new String[]{"humans/saradomin_ranger/saradomin_ranger_melee", "humans/saradomin_ranger/saradomin_ranger_melee2", "humans/saradomin_ranger/saradomin_ranger_melee3"}, new String[]{"humans/zamorak_ranger/zamorak_ranger_melee", "humans/zamorak_ranger/zamorak_ranger_melee2", "humans/zamorak_ranger/zamorak_ranger_melee3"}, new String[]{"humans/elf_archer/elf_archer_melee", "humans/elf_archer/elf_archer_melee2", "humans/elf_archer/elf_archer_melee3"}, new String[]{"dragons/blue_dragon/blue_dragon"}, new String[]{"humans/barrows_brothers/barrows_ahrim"}, new String[]{"humans/barrows_brothers/barrows_dharok"}, new String[]{"humans/barrows_brothers/barrows_guthan"}, new String[]{"humans/barrows_brothers/barrows_karil"}, new String[]{"humans/barrows_brothers/barrows_torag"}, new String[]{"humans/barrows_brothers/barrows_verac"}, new String[]{"zemouregal/zemo_zemouregal"}, new String[]{"humans/barrows_brothers/barrows_karil_melee"}};
        field_s = 0L;
        field_r = "Battle Viewer";
        field_t = new int[12];
        field_k = new kk[field_m.length][];
        field_l = new String[]{"This spell inflicts 2 points of magic damage to one unit.", "This spell inflicts 5 points of magic damage to one unit.", "This spell inflicts 7 points of magic damage to one unit.", "This spell inflicts 10 points of magic damage to one unit.", "This spell inflicts 15 points of magic damage to one unit.", "This spell inflicts 20 points of magic damage to one unit.", "This spell inflicts 30 points of magic damage to one unit.", "This spell grants 50 extra Mana.", "This spell grants 100 extra Mana.", "This spell grants 150 extra Mana.", "This spell grants 200 extra Mana.", "This spell grants 250 extra Mana.", "This accessory allows a unit to move faster over swamp and through rivers, as if it were amphibious.", "This potion permanently increases one unit's strength by 1.", "This potion permanently increases one unit's strength by 2.", "This potion permanently increases one unit's strength by 3.", "This potion permanently increases one unit's strength by 4.", "This potion permanently increases one unit's strength by 5.", "This potion permanently decreases one unit's strength by 1.", "This potion permanently decreases one unit's strength by 2.", "This potion permanently decreases one unit's strength by 3.", "This potion permanently decreases one unit's strength by 4.", "This potion permanently decreases one unit's strength by 5.", "This spell raises one pile of bones into a skeleton warrior.", "This spell raises all bones within a 3x3 area into an army of skeleton warriors.", "This spell raises a spiritual shield on a single tile, which absorbs 40% of the damage dealt to a unit within it.", "This spell raises a spiritual barrier on a 3x3 area, which absorbs 40% of the damage dealt to units within it.", "This spell causes civil unrest in one structure - peasants overthrow the current occupier, returning the structure to a neutral state.", "This accessory grants one ground unit the ability to combat flying units.", "This potion allows any level 1 unit to make a copy of itself when it next moves.", "This potion allows any unit up to level 2 to make a copy of itself when it next moves.", "This potion allows any unit up to level 3 to make a copy of itself when it next moves.", "This potion allows any unit up to level 4 to make a copy of itself when it next moves.", "This potion allows any unit up to level 5 to make a copy of itself when it next moves.", "This spell teleports one unit to any unoccupied flat dry land within 8 tiles, except for portals.", "This spell teleports one unit to any unoccupied flat dry land on the map, except for portals.", "This spell allows you to issue a single move and/or attack command to an enemy unit.", "This spell raises your favour with Saradomin by 1.", "This spell raises your favour with Zamorak by 1.", "This spell raises your favour with Guthix by 1.", "This spell raises your favour with Seren by 1.", "This spell raises your favour with Bandos by 1.", "This spell raises your favour with the Menaphite pantheon by 1.", "This spell converts one village you occupy into a tower.", "This spell forms a bridge spanning out from any flat piece of riverbank or coastline.", "This spell allows for another King Black Dragon to be teleported into the fight.", "This spell allows one unit that has already moved/attacked to do so again in the same turn.", "This spell covers a 3x3 area in fire, inflicting 2 points of fire damage on all units within it.", "This spell covers a 5x5 area in fire, inflicting 2 points of fire damage on all units within it.", "This spell covers a 3x3 area in fire, inflicting 5 points of fire damage on all units within it.", "This spell covers a 5x5 area in fire, inflicting 5 points of fire damage on all units within it.", "This spell covers a 3x3 area in fire, inflicting 7 points of fire damage on all units within it.", "This spell covers a 5x5 area in fire, inflicting 7 points of fire damage on all units within it.", "This spell covers a 3x3 area in fire, inflicting 10 points of fire damage on all units within it.", "This spell heals one unit by 2 points.", "This spell heals one unit by 5 points.", "This spell heals one unit by 7 points.", "This spell heals one unit by 10 points.", "This spell heals one unit by 15 points.", "This spell heals one unit by 20 points.", "This spell heals one unit by 30 points.", "This spell heals all units in a 3x3 area by 2 points.", "This spell heals all units in a 5x5 area by 2 points.", "This spell heals all units in a 3x3 area by 5 points.", "This spell heals all units in a 5x5 area by 5 points.", "This spell heals all units in a 3x3 area by 7 points.", "This spell heals all units in a 5x5 area by 7 points.", "This spell heals all units in a 3x3 area by 10 points.", "This spell poisons one unit.", "This accessory gives one unit a second chance at life.", "This armour gives one unit +10% defence against melee damage.", "This armour gives one unit +20% defence against melee damage.", "This armour gives one unit +30% defence against melee damage.", "This armour gives one unit +40% defence against melee damage.", "This armour gives one unit +10% defence against ranged damage.", "This armour gives one unit +20% defence against ranged damage.", "This armour gives one unit +30% defence against ranged damage.", "This armour gives one unit +40% defence against ranged damage.", "This armour gives one unit +10% defence against magic damage.", "This armour gives one unit +20% defence against magic damage.", "This armour gives one unit +30% defence against magic damage.", "This armour gives one unit +40% defence against magic damage.", "This armour gives one unit +10% defence against fire damage.", "This armour gives one unit +20% defence against fire damage.", "This armour gives one unit +30% defence against fire damage.", "This armour gives one unit +40% defence against fire damage.", "This armour gives one unit +10% defence against all damage types.", "This armour gives one unit +20% defence against all damage types.", "This armour gives one unit +30% defence against all damage types.", "This armour gives one unit +40% defence against all damage types.", "This armour gives one unit +10% defence against flying units.", "This armour gives one unit +20% defence against flying units.", "This armour gives one unit +30% defence against flying units.", "This armour gives one unit +40% defence against flying units.", "This weapon gives a unit +2 melee damage.", "This weapon gives a unit +5 melee damage.", "This weapon gives a unit +10 melee damage.", "This weapon gives a unit +2 ranged damage.", "This weapon gives a unit +5 ranged damage.", "This weapon gives a unit +10 ranged damage.", "This weapon gives a unit +2 magic damage.", "This weapon gives a unit +5 magic damage.", "This weapon gives a unit +10 magic damage.", "This armour completely protects one unit from one attack (of any type), after which the armour is destroyed. This armour is heavy, halving the unit's speed for as long as it is worn.", "This armour completely protects one unit from two attacks (of any type), after which the armour is destroyed. This armour is very heavy, completely immobilising the unit for as long as it is worn.", "This weapon adds poison to one melee unit's melee attack.", "This weapon adds poison to one ranged unit's ranged attack.", "This weapon adds poison to one magic unit's magic attack.", "This accessory allows any one unit to capture one structure.", "This spell allows one unit to move twice as far as normal on one turn.", "This accessory allows one unit to travel very quickly over water, as if it were an elemental of Elidinis.", "This spell creates a forest on a 3x3 area, but only on open ground or swamped land.", "This spell creates a swamp on a 3x3 area, but only on open ground or forested land.", "This spell creates a 3x3 area of river water, but only on open ground, swamp and forests.", "This spell flattens a 3x3 area of mountains into open ground.", "This potion increases the Kalphite Queen's movement inhibition effect to 3 tiles.", "This potion increases an ogre shaman's ranged attack prevention effect to 3 tiles.", "This potion increases a goblin priest's confusion effect to 3 tiles.", "This potion increases a cyclops's paralysing effect to 3 tiles.", "This potion increases an elf songstress's morale boost effect to 3 tiles.", "This potion gives one unit the ability to drain health from its victims with melee attacks, at the cost of losing a little bit of health every turn.", "This spell immobilises one unit for 1 turn.", "This spell immobilises one unit for 2 turns.", "This spell immobilises one unit for 3 turns.", "This weapon increases a ranged unit's maximum range by 2 tiles.", "This weapon increases a magic unit's maximum range by 3 tiles.", "This weapon increases a dragon's fire attack maximum range by 2 tiles, and can also boost the range of the dwarf cannon", "This weapon gives one unit +2 fire damage. It's good for both dragons and the dwarf cannon.", "This weapon gives one unit +5 fire damage. It's good for both dragons and the dwarf cannon.", "This weapon gives one unit +10 fire damage. It's good for both dragons and the dwarf cannon.", "This weapon adds poison to one unit's fire attacks. It's good for both dragons and the dwarf cannon.", "This weapon gives one flying unit +2 melee damage.", "This weapon gives one flying unit +5 melee damage.", "This weapon gives one flying unit +10 melee damage.", "This weapon adds poison to one flying unit's melee attacks."};
        field_q = "Chemicals that burn faster and hotter to improve fire attacks.";
    }
}
