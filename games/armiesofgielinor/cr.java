/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cr extends sf {
    static String field_eb;
    private boolean field_ab;
    static String field_bb;
    private String field_cb;
    private rj field_Y;
    static String[][] field_W;
    static int field_Z;
    private boolean field_db;
    private String field_X;

    final static fo a(String param0, int param1) {
        RuntimeException var2 = null;
        fo stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param1 == 4210752) {
                break L1;
              } else {
                field_bb = (String) null;
                break L1;
              }
            }
            stackIn_3_0 = new fo(param0);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var2);

            stackIn_6_1 = new StringBuilder().append("cr.G(");

            if (param0 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L2;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L2;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param1 + ')');
        }
        return stackIn_3_0;
    }

    final void b(int param0, int param1, int param2) {
        super.b(param0, param1, param2);
        bv.field_t.c(this.field_cb, (this.field_l >> 1902847169) + param0, param2 - -103, 16777215, -1);
        if (null != this.field_X) {
            qn.e(20 + param0, -7 + (120 + param2), 260, 8421504);
            bv.field_t.a(this.field_X, 20 + param0, param2 - -120 - -8, 260, 100, 16777215, -1, 1, 0, bv.field_t.field_H);
        }
    }

    public static void n(int param0) {
        field_eb = null;
        if (param0 != 260) {
          cr.n(-8);
          field_W = (String[][]) null;
          field_bb = null;
          return;
        } else {
          field_W = (String[][]) null;
          field_bb = null;
          return;
        }
    }

    final void a(float param0, int param1, boolean param2, String param3) {
        RuntimeException var5 = null;
        String var6 = null;
        int stackIn_5_0 = 0;
        int stackIn_8_1 = 0;
        Object stackIn_12_0 = null;
        Object stackIn_13_0 = null;
        int stackIn_13_1 = 0;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param1 == 30) {
                break L1;
              } else {
                var6 = (String) null;
                cr.a((String) null, -94);
                break L1;
              }
            }
            L2: {
              if (this.field_ab) {
                stackIn_5_0 = 0;
                break L2;
              } else {
                stackIn_5_0 = 1;
                break L2;
              }
            }
            L3: {


              if (param2) {

                stackIn_8_1 = 0;
                break L3;
              } else {

                stackIn_8_1 = 1;
                break L3;
              }
            }
            if (stackIn_5_0 != stackIn_8_1) {
              L4: {
                stackIn_12_0 = this;

                if (!param2) {
                  stackIn_13_0 = this;
                  stackIn_13_1 = 0;
                  break L4;
                } else {
                  stackIn_13_0 = this;
                  stackIn_13_1 = 1;
                  break L4;
                }
              }
              L5: {
                ((cr) (this)).field_ab = stackIn_13_1 != 0;
                if (this.field_ab) {
                  this.field_Y.c(4210752, 8405024, 27178);
                  this.field_Y.field_R = true;
                  break L5;
                } else {
                  this.field_Y.c(4210752, 2113632, 27178);
                  if (!this.field_db) {
                    break L5;
                  } else {
                    this.field_Y.field_R = false;
                    break L5;
                  }
                }
              }
              this.field_Y.field_D = (int)(param0 / 100.0f * 65536.0f);
              this.field_cb = param3;
              break L0;
            } else {
              this.field_Y.field_D = (int)(param0 / 100.0f * 65536.0f);
              this.field_cb = param3;
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var5 = decompiledCaughtException;
            stackIn_21_0 = (RuntimeException) (var5);

            stackIn_21_1 = new StringBuilder().append("cr.A(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_22_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "null";
              break L6;
            } else {
              stackIn_22_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "{...}";
              break L6;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_22_0), stackIn_22_2 + ')');
        }
    }

    cr(gk param0, String param1) {
        super(param0, 300, 120);
        int var3_int = 0;
        try {
            this.field_X = param1;
            if (this.field_X != null) {
                var3_int = bv.field_t.a(this.field_X, 260, bv.field_t.field_H);
                this.a(300, (byte) 100, 150 - -var3_int);
            }
            this.field_Y = new rj(13, 50, 274, 30, 15, 2113632, 4210752);
            this.field_db = false;
            this.field_ab = false;
            this.field_Y.field_R = true;
            this.a((byte) 10, (kb) (this.field_Y));
        } catch (RuntimeException runtimeException) {
            throw ig.a((Throwable) ((Object) runtimeException), "cr.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void i(byte param0) {
        this.field_db = true;
        this.field_Y.field_R = false;
        if (param0 < 1) {
            this.field_cb = (String) null;
        }
    }

    static {
        field_bb = "<%0> / <%1> (+<%2>) - Victory in 1 turn";
        field_eb = "Waiting for extra data";
        field_W = new String[][]{new String[]{"armed_skeleton"}, new String[]{"arrow_hit"}, new String[]{"arrow_launch"}, new String[]{"aviansie_attack"}, new String[]{"aviansie_death"}, new String[]{"aviansie_flap"}, new String[]{"aviansie_hit"}, new String[]{"aviansie_victory"}, new String[]{"bear_attack"}, new String[]{"bear_death"}, new String[]{"bear_hit"}, new String[]{"bear_victory"}, new String[]{"black_demon_attack"}, new String[]{"black_demon_death"}, new String[]{"black_demon_hit"}, new String[]{"black_demon_swipe_attack"}, new String[]{"black_demon_victory"}, new String[]{"bury_bones"}, new String[]{"club_hit"}, new String[]{"crocodile_attack_bite"}, new String[]{"crocodile_attack_snarl"}, new String[]{"crocodile_death"}, new String[]{"crocodile_hit"}, new String[]{"crocodile_victory"}, new String[]{"crystal_bow_launch"}, new String[]{"dagganoth_attack_swipe"}, new String[]{"dagganoth_attack"}, new String[]{"dagganoth_death"}, new String[]{"dagganoth_footstep"}, new String[]{"dagganoth_hit"}, new String[]{"dagganoth_victory"}, new String[]{"dart_launch"}, new String[]{"dragon_attack"}, new String[]{"dragon_breath"}, new String[]{"dragon_death"}, new String[]{"dragon_flap"}, new String[]{"dragon_hit"}, new String[]{"dragon_victory"}, new String[]{"dward_hit"}, new String[]{"dwarf_attack"}, new String[]{"dwarf_cannon_fire"}, new String[]{"dwarf_death"}, new String[]{"dwarf_hit"}, new String[]{"dwarf_victory"}, new String[]{"elf_songstress_stab"}, new String[]{"elf_songstress_victory"}, new String[]{"elven_pikeman_stab"}, new String[]{"ent_attack_thump"}, new String[]{"ent_attack"}, new String[]{"ent_death"}, new String[]{"ent_footstep_1", "ent_footstep_2"}, new String[]{"ent_hit"}, new String[]{"ent_victory"}, new String[]{"falcon_attack"}, new String[]{"falcon_death"}, new String[]{"falcon_flap"}, new String[]{"falcon_hit"}, new String[]{"falcon_talon"}, new String[]{"falcon_victory"}, new String[]{"giant_footstep_1", "giant_footstep_2"}, new String[]{"gnome_death"}, new String[]{"gnome_glider_attack"}, new String[]{"gnome_glider_drop_stone"}, new String[]{"gnome_glider_copter_loop"}, new String[]{"gnome_hit"}, new String[]{"gnome_tortoise_mounted_attack"}, new String[]{"gnome_tortoise_mounted_death"}, new String[]{"gnome_tortoise_mounted_hit"}, new String[]{"gnome_tortoise_mounted_victory"}, new String[]{"gnome_victory"}, new String[]{"goblin_axe_attack"}, new String[]{"goblin_attack"}, new String[]{"goblin_death"}, new String[]{"goblin_hit"}, new String[]{"goblin_victory"}, new String[]{"gorilla_attack"}, new String[]{"gorilla_death"}, new String[]{"gorilla_hit"}, new String[]{"gorilla_beatchest"}, new String[]{"grenwall_attack"}, new String[]{"grenwall_death"}, new String[]{"grenwall_hit"}, new String[]{"grenwall_spines"}, new String[]{"grenwall_victory"}, new String[]{"hellhound_attack"}, new String[]{"hellhound_death"}, new String[]{"hellhound_hit"}, new String[]{"hellhound_victory"}, new String[]{"hoof_step_1", "hoof_step_2", "hoof_step_3"}, new String[]{"horse_gallop"}, new String[]{"human_female_attack_1", "human_female_attack_2", "human_female_attack_3", "human_female_attack_4"}, new String[]{"human_female_death_1", "human_female_death_2", "human_female_death_3", "human_female_death_4"}, new String[]{"human_female_hit_1", "human_female_hit_2", "human_female_hit_3", "human_female_hit_4"}, new String[]{"human_female_victory_1", "human_female_victory_2", "human_female_victory_3", "human_female_victory_4"}, new String[]{"human_footstep_armour_1", "human_footstep_armour_2", "human_footstep_armour_3", "human_footstep_armour_4", "human_footstep_armour_5"}, new String[]{"human_footstep_1", "human_footstep_2", "human_footstep_3", "human_footstep_4", "human_footstep_5"}, new String[]{"human_male_attack_1", "human_male_attack_2", "human_male_attack_3", "human_male_attack_4"}, new String[]{"human_male_death_1", "human_male_death_2", "human_male_death_3", "human_male_death_4"}, new String[]{"human_male_hit_1", "human_male_hit_2", "human_male_hit_3", "human_male_hit_4", "human_male_hit_5"}, new String[]{"armour_clash_1", "armour_clash_2", "armour_clash_3", "armour_clash_4", "armour_clash_5", "armour_clash_6", "armour_clash_7", "armour_clash_8", "armour_clash_9", "armour_clash_10"}, new String[]{"human_male_victory_1", "human_male_victory_2", "human_male_victory_3", "human_male_victory_4", "human_male_victory_5", "human_male_victory_6"}, new String[]{"icyene_attack"}, new String[]{"icyene_death"}, new String[]{"icyene_flap"}, new String[]{"icyene_hit"}, new String[]{"icyene_victory"}, new String[]{"jackal_victory"}, new String[]{"jade_vine_attack"}, new String[]{"jade_vine_death"}, new String[]{"jade_vine_jeer"}, new String[]{"jade_vine_grow"}, new String[]{"jade_vine_hit"}, new String[]{"kalphite_worker_attack", "kalphite_soldier_attack", "kalphite_queen_attack"}, new String[]{"kalphite_claws"}, new String[]{"kalphite_worker_death", "kalphite_soldier_death", "kalphite_queen_death"}, new String[]{"kalphite_worker_hit", "kalphite_soldier_hit", "kalphite_queen_hit"}, new String[]{"kalphite_move"}, new String[]{"kalphite_victory"}, new String[]{"lion_attack"}, new String[]{"lion_death"}, new String[]{"lion_hit"}, new String[]{"lion_paw_swipe"}, new String[]{"lion_victory"}, new String[]{"locust_attack_claws"}, new String[]{"locust_attack"}, new String[]{"locust_death"}, new String[]{"locust_hit"}, new String[]{"locust_mage_attack"}, new String[]{"locust_mage_death"}, new String[]{"locust_mage_hit"}, new String[]{"locust_mage_victory"}, new String[]{"locust_move"}, new String[]{"locust_victory"}, new String[]{"mace_crush"}, new String[]{"monk_chant"}, new String[]{"moss_giant_attack_punch"}, new String[]{"mummy_attack"}, new String[]{"mummy_death"}, new String[]{"mummy_footstep"}, new String[]{"mummy_hit"}, new String[]{"mummy_punch"}, new String[]{"mummy_victory"}, new String[]{"necromancer_attack"}, new String[]{"necromancer_chant"}, new String[]{"necromancer_death"}, new String[]{"necromancer_hit"}, new String[]{"necromancer_victory"}, new String[]{"ogre_attack"}, new String[]{"ogre_death"}, new String[]{"ogre_hit"}, new String[]{"ogre_victory"}, new String[]{"ork_battleaxe"}, new String[]{"paw_step_1", "paw_step_2", "paw_step_3", "paw_step_4", "paw_step_5"}, new String[]{"barbarian_spear_woman_attack"}, new String[]{"barbarian_spear_woman_ranged"}, new String[]{""}, new String[]{""}, new String[]{"portal_mage_chant"}, new String[]{"priest_barrier"}, new String[]{"priest_chant"}, new String[]{"pyrelord_attack"}, new String[]{"pyrelord_death"}, new String[]{"pyrelord_flame_attack"}, new String[]{"pyrelord_hit"}, new String[]{"pyrelord_jeer"}, new String[]{"saradomin_owl_attack"}, new String[]{"saradomin_owl_death"}, new String[]{"saradomin_owl_flap"}, new String[]{"saradomin_owl_hit"}, new String[]{"saradomin_owl_victory"}, new String[]{"shadow_beast_attack"}, new String[]{"shadow_beast_death"}, new String[]{"shadow_beast_hit"}, new String[]{"shadow_beast_move"}, new String[]{"shadow_beast_victory"}, new String[]{"skeleton_attack"}, new String[]{"skeleton_death"}, new String[]{"skeleton_footstep"}, new String[]{"skeleton_hit"}, new String[]{"skeleton_victory"}, new String[]{"slug_prince_attack_jump"}, new String[]{"slug_prince_attack"}, new String[]{"slug_prince_death"}, new String[]{"slug_prince_hit"}, new String[]{"slug_prince_victory"}, new String[]{"spear_hit"}, new String[]{"spear_launch"}, new String[]{"sphinx_attack_claw"}, new String[]{"sphinx_attack"}, new String[]{"sphinx_chant"}, new String[]{"sphinx_death"}, new String[]{"sphinx_hit"}, new String[]{"sphinx_victory"}, new String[]{"staff_attack"}, new String[]{"swipe"}, new String[]{"sword_slash_1", "sword_slash_2", "sword_slash_3", "sword_slash_4"}, new String[]{"terrorbird_attack"}, new String[]{"terrorbird_death"}, new String[]{"terrorbird_hit"}, new String[]{"terrorbird_victory"}, new String[]{"tzhaar_ket_attack_club"}, new String[]{"tzhaar_ket_attack_sword"}, new String[]{"tzhaar_ket_death"}, new String[]{"tzhaar_ket_hit"}, new String[]{"tzhaar_ket_victory"}, new String[]{"unicorn_attack"}, new String[]{"unicorn_death"}, new String[]{"unicorn_hit"}, new String[]{"unicorn_victory"}, new String[]{"vyrewatch_flap"}, new String[]{"vyrewatch_vampire_attack"}, new String[]{"vyrewatch_vampire_death"}, new String[]{"vyrewatch_vampire_hit"}, new String[]{"vyrewatch_vampire_victory"}, new String[]{"water_creature_attack"}, new String[]{"water_creature_death"}, new String[]{"water_creature_hit"}, new String[]{"water_creature_move"}, new String[]{"water_creature_punch"}, new String[]{"water_creature_victory"}, new String[]{"werewolf_swipe_attack"}, new String[]{"wolf_death"}, new String[]{"wolf_growl_attack"}, new String[]{"wolf_hit"}, new String[]{"wolf_victory"}, new String[]{"zamorak_mage_attack"}, new String[]{"zamorak_mage_death"}, new String[]{"zamorak_mage_hit"}, new String[]{"tzhaar_ket_hit_shield"}, new String[]{"spell"}, new String[]{"dagganoth_attack_swipe"}, new String[]{"saradomin_ranger_attack"}, new String[]{"gnome_glider_fall_down"}, new String[]{"elf_songstress_attack"}, new String[]{"elf_shieldmaiden_defend"}, new String[]{"elven_pikemen_defend"}, new String[]{"elven_archer_attack"}, new String[]{"elf_defend_spear"}, new String[]{"ogre_mace"}, new String[]{"hobgoblin_attack"}, new String[]{"hobgoblin_attack"}, new String[]{"cyclops_slap"}, new String[]{"ourg_armour"}, new String[]{"mummy_sword"}, new String[]{"dart_launch"}, new String[]{"blackjack_attack"}, new String[]{"warrior_of_icthlarin_defend"}, new String[]{"elemental_loop"}, new String[]{"dwarf_cannon_turn"}, new String[]{"dwarf_cannon_setup"}, new String[]{"dwarf_cannon_hit"}, new String[]{"dwarf_cannon_death"}, new String[]{"portal_loop"}, new String[]{"portal_shutdown"}, new String[]{"aog_ahrim_quaterstaff_attack"}, new String[]{"aog_ahrim_range_attack"}, new String[]{"aog_dharok_axe_slash_attack"}, new String[]{"aog_guthan_spear_attack"}, new String[]{"aog_karil_melee_attack"}, new String[]{"aog_karil_range_attack"}, new String[]{"aog_torag_hammer_attack"}, new String[]{"aog_verac_mace_attack"}, new String[]{"aog_zemouregal_attack"}, new String[]{"aog_zemouregal_death"}, new String[]{"aog_zemouregal_hit"}, new String[]{"aog_zemouregal_victory"}, new String[]{"aog_blue_dragon_attack"}, new String[]{"aog_blue_dragon_breath"}, new String[]{"aog_blue_dragon_death"}, new String[]{"aog_blue_dragon_hit"}};
        field_Z = 0;
    }
}
