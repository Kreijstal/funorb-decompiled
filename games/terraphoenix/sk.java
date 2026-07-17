/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sk implements cj {
    private int field_e;
    private int field_i;
    private int field_j;
    private int field_f;
    private int field_h;
    static String[] field_b;
    static String field_a;
    private int field_c;
    static String field_d;
    private pk field_g;

    public final void a(int param0, gl param1, int param2, int param3, boolean param4) {
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        wi var12 = null;
        gl stackIn_4_0 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        gl stackOut_3_0 = null;
        Object stackOut_2_0 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        var11 = Terraphoenix.field_V;
        try {
          L0: {
            L1: {
              if (param1 instanceof wi) {
                stackOut_3_0 = (gl) param1;
                stackIn_4_0 = stackOut_3_0;
                break L1;
              } else {
                stackOut_2_0 = null;
                stackIn_4_0 = (gl) (Object) stackOut_2_0;
                break L1;
              }
            }
            L2: {
              var12 = (wi) (Object) stackIn_4_0;
              if (var12 == null) {
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              l.f(param2 - -param1.field_w, param1.field_u + param0, param1.field_p, param1.field_n, ((sk) this).field_c);
              var7 = -(2 * var12.field_M) + param1.field_p;
              var8 = var12.field_M + param2 - -param1.field_w;
              var9 = var12.field_K + (param0 + param1.field_u);
              l.c(var8, var9, var8 - -var7, var9, ((sk) this).field_j);
              if (param3 == -24381) {
                break L3;
              } else {
                sk.a(false);
                break L3;
              }
            }
            var10 = -1 + var12.g(1);
            L4: while (true) {
              if (var10 < 0) {
                if (null != ((sk) this).field_g) {
                  ((sk) this).field_g.c(var12.field_o, var8 + var7 / 2, var12.field_K + (var9 - -((sk) this).field_g.field_w), ((sk) this).field_i, ((sk) this).field_f);
                  break L0;
                } else {
                  return;
                }
              } else {
                l.e(var8 - -(var12.b(var10, 0) * var7 / var12.a(0)), var9, ((sk) this).field_e, ((sk) this).field_h);
                var10--;
                continue L4;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var6 = decompiledCaughtException;
            stackOut_14_0 = (RuntimeException) var6;
            stackOut_14_1 = new StringBuilder().append("sk.E(").append(param0).append(44);
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param1 == null) {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L5;
            } else {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "{...}";
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              break L5;
            }
          }
          throw qk.a((Throwable) (Object) stackIn_17_0, stackIn_17_2 + 44 + param2 + 44 + param3 + 44 + param4 + 41);
        }
    }

    public static void a(boolean param0) {
        field_b = null;
        field_a = null;
        field_d = null;
        if (!param0) {
            field_a = null;
        }
    }

    sk(pk param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        try {
            ((sk) this).field_c = param4;
            ((sk) this).field_f = param2;
            ((sk) this).field_j = param3;
            ((sk) this).field_h = param6;
            ((sk) this).field_i = param1;
            ((sk) this).field_e = param5;
            ((sk) this).field_g = param0;
        } catch (RuntimeException runtimeException) {
            throw qk.a((Throwable) (Object) runtimeException, "sk.<init>(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 44 + param2 + 44 + param3 + 44 + param4 + 44 + param5 + 44 + param6 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = new String[]{"human_falling_over", "male_injury", "affirmative", "cbnoise", "code_red", "hold_positions", "hostile_down", "i_repeat", "man_down", "mayday", "movin_in", "moving_out", "out_of_range", "phoenix", "female_injury", "female1_affirmative", "female1_hold_positions", "female1_hostile_down", "female1_man_down", "female1_mayday", "female1_movin_in", "female1_roger_that", "blip", "grid_sound", "next_button", "prev_button", "research_equip_screen_open", "research_equip_screen_close", "rollover_category", "rollover_item", "select_category", "select_mission_circle", "select_mission_circle2", "select", "de_select", "battle_armour_defend", "combat_armour_defend", "combat_jacket_defend", "shield_module_defend", "shielded_armour_defend", "impact_soft_surface", "ricochet_hard_surface", "ricochet_hard_surface2", "fusion_cannon_load", "fusion_cannon_fire", "fusion_gun_load", "fusion_gun_fire", "fusion_launcher_load", "fusion_launcher_fire", "fusion_launcher_explode", "fusion_pistol_load", "fusion_pistol_fire", "fusion_rifle_load", "fusion_rifle_fire", "lazer_cannon_load", "lazer_cannon_fire", "lazer_carbine_load", "lazer_carbine_fire", "pulse_carbine_load", "pulse_carbine_fire", "pulse_gun_load", "pulse_gun_fire", "pulse_pistol_load", "pulse_pistol_fire", "pulse_grenade_throw", "pulse_grenade_explode", "auto_machine_load", "auto_machine_fire", "sub_machine_load", "sub_machine_fire", "auto_rifle_load", "auto_rifle_fire", "pistol_load", "pistol_fire", "shotgun_load", "shotgun_fire", "grenade_load", "grenade_throw", "grenade_explode", "rocket_launcher_load", "rocket_launcher_fire", "rocket_launcher_explode", "alien_injured", "alien_gibbed", "alien_sliding", "alien_steps", "alien_door_open", "door_open", "footstep", "ufo_power_up", "ufo_take_off", "pulse_grenade_bubble_n_hiss"};
        field_a = "FAILURE";
        field_d = "Sound: ";
    }
}
