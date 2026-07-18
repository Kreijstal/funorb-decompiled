/*
 * Decompiled by CFR-JS 0.4.0.
 */
class tc extends vf {
    static oi field_r;
    static int[] field_y;
    static vn[] field_z;
    static String field_u;
    static int[] field_w;
    static String[] field_x;
    static String[] field_v;
    static int field_t;
    static int[] field_s;

    final static int a(CharSequence param0, int param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int stackIn_7_0 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        var5 = ZombieDawn.field_J;
        try {
          L0: {
            var2_int = param0.length();
            var3 = 0;
            var4 = 0;
            L1: while (true) {
              if (var4 >= var2_int) {
                L2: {
                  if (param1 == 14) {
                    break L2;
                  } else {
                    tc.c(23);
                    break L2;
                  }
                }
                stackOut_6_0 = var3;
                stackIn_7_0 = stackOut_6_0;
                break L0;
              } else {
                var3 = (var3 << 5) - var3 - -tb.a(param0.charAt(var4), -8225);
                var4++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) var2;
            stackOut_8_1 = new StringBuilder().append("tc.EA(");
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param0 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L3;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L3;
            }
          }
          throw sh.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + ',' + param1 + ')');
        }
        return stackIn_7_0;
    }

    tc(rb param0, int param1) {
        super(param0, 4, 2, 2, 2, param1, -1, 0, 1, param0.field_I, -1, 2147483647, false);
    }

    public final void a(int param0, boolean param1, int param2, ga param3, int param4) {
        RuntimeException var6 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        try {
          L0: {
            L1: {
              if (param1) {
                pb.a(param3.field_k + param4, param3.field_n, param2 + param3.field_j, 48, param3.field_i);
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              super.a(param0, param1, param2, param3, param4);
              if (param0 == 16777215) {
                break L2;
              } else {
                tc.a((byte) 33);
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var6 = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) var6;
            stackOut_6_1 = new StringBuilder().append("tc.A(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param3 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L3;
            } else {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L3;
            }
          }
          throw sh.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + ',' + param4 + ')');
        }
    }

    tc(int param0) {
        this(ia.field_e, param0);
    }

    final static void a(byte param0) {
        int var2 = 0;
        int var3 = ZombieDawn.field_J;
        ed.field_c = null;
        ce.field_q = false;
        int var1 = 0 / ((30 - param0) / 51);
        if (nm.field_c) {
            kk.field_i.m(96);
        } else {
            var2 = sd.field_b;
            if (0 < var2) {
                if (1 != var2) {
                    ed.field_c = s.a(1938762664, kn.field_J, new String[1]);
                } else {
                    ed.field_c = pn.field_M;
                }
                ed.field_c = gf.a(0, new CharSequence[3]);
            }
            kk.field_i.h((byte) 75);
            int discarded$0 = 9;
            rl.c();
        }
    }

    public static void c(int param0) {
        field_y = null;
        field_w = null;
        field_x = null;
        field_r = null;
        field_z = null;
        field_s = null;
        field_u = null;
        field_v = null;
        if (param0 != -26642) {
            field_z = null;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_x = new String[155];
        field_w = new int[155];
        field_u = "Bonus level complete!";
        field_y = new int[155];
        field_v = new String[14];
        field_t = 0;
        field_s = new int[155];
        cj.a("zombie_dawn_menu_button", 68, -118, 0, 13);
        cj.a("zombie_dawn_menu_screen_mouseover", 69, -108, 0, 13);
        cj.a("zombie_detonate", 0, -121, 0, 13);
        cj.a("zombie_fast_car", 1, -98, 0, 13);
        cj.a("zombie_fast_lorry", 3, -98, 0, 13);
        cj.a("zombie_slow_car", 4, -93, 0, 13);
        cj.a("zombie_slow_lorry", 5, -100, 0, 13);
        cj.a("zombie_lorry_horn", 6, -89, 0, 13);
        cj.a("zombie_car_horn_1", 7, -94, 0, 13);
        cj.a("zombie_dawn_gunfire", 44, -93, 0, 13);
        cj.a("zombie_dawn_shotgun_fire", 45, -105, 0, 13);
        cj.a("zombie_dawn_machinegun_fire", 8, -109, 0, 13);
        cj.a("zombie_dawn_click_mouse", 20, -117, 0, 13);
        cj.a("zombie_dawn_thump_1", 30, -128, 0, 13);
        cj.a("zombie_dawn_thump_2", 31, -83, 0, 13);
        cj.a("zombie_dawn_swipe_1", 32, -89, 0, 13);
        cj.a("zombie_dawn_swipe_2", 33, -114, 0, 13);
        cj.a("zombie_dawn_slap_1", 34, -117, 0, 13);
        cj.a("zombie_dawn_second_tick", 47, -90, 0, 13);
        cj.a("zombie_dawn_reactor_ambience", 53, -121, 0, 13);
        cj.a("zombie_dawn_score_10", 54, -97, 0, 13);
        cj.a("zombie_dawn_score_20", 55, -85, 0, 13);
        cj.a("zombie_dawn_score_30", 56, -127, 0, 13);
        cj.a("zombie_dawn_countup_victims", 57, -122, 0, 13);
        cj.a("zombie_dawn_countup_score", 58, -117, 0, 13);
        cj.a("zombie_dawn_click_mouse_wrong", 59, -99, 0, 13);
        cj.a("zombie_dawn_gun_empty", 63, -116, 0, 13);
        cj.a("zombie_dawn_squelch_3", 12, -108, 0, 13);
        cj.a("zombie_dawn_squelch_2_AND_3", 66, -114, 0, 13);
        cj.a("zombie_dawn_smash_wood_and_glass_1", 64, -96, 0, 13);
        cj.a("zombie_dawn_smash_wood_and_glass_2", 65, -102, 0, 13);
        cj.a("zombie_dawn_use_powerup", 67, -113, 0, 13);
        cj.a("zombie_dawn_bounce", 36, -119, 0, 13);
        cj.a("zombie_dawn_clang", 35, -96, 0, 13);
        cj.a("zd_multi_quake", 74, -99, 0, 14);
        cj.a("zd_multi_barrier", 76, -105, 0, 14);
        cj.a("zd_multi_breach", 77, -89, 0, 14);
        cj.a("ZD_update_grenadier_rifle_fire", 92, -109, 0, 14);
        cj.a("ZD_update_key_card_door_open", 93, -107, 0, 14);
        cj.a("ZD_update_key_card_operate", 94, -84, 0, 14);
        cj.a("ZD_update_laser_barrier_electrify", 95, -97, 0, 14);
        cj.a("ZD_update_laser_barrier_loop", 96, -119, 0, 14);
        cj.a("ZD_update_lightning_strike", 97, -109, 0, 14);
        cj.a("ZD_update_luggage_carousel_loop", 98, -104, 0, 14);
        cj.a("ZD_update_miasma", 99, -126, 0, 14);
        cj.a("ZD_update_minigun", 100, -94, 0, 14);
        cj.a("ZD_update_minigun_cease_fire", 101, -127, 0, 14);
        cj.a("ZD_update_minigun_start_fire", 110, -104, 0, 14);
        cj.a("ZD_update_tannoy_chimes", 122, -109, 0, 14);
        cj.a("ZD_update_test_chamber_fall_and_drag", 124, -97, 0, 14);
        cj.a("ZD_update_test_chamber_tentacles", 126, -97, 0, 14);
        cj.a("ZD_update_thunder_roll_1", 128, -84, 0, 14);
        cj.a("ZD_update_thunder_roll_2", 129, -88, 0, 14);
        cj.a("blustery_wind_loop_1", 137, -124, 0, 14);
        cj.a("blustery_wind_loop_2", 138, -103, 0, 14);
        cj.a("river_loop_1", 145, -112, 0, 14);
        cj.a("wind_loop_1", 147, -111, 0, 14);
        cj.a("wind_loop_2", 148, -116, 0, 14);
        cj.a("ZD_update_helicopter_loop", 152, -110, 0, 14);
        cj.a("ZD_update_grenadier_rifle_bullet_casing_2", 153, -120, 0, 14);
        cj.a("ZD_update_grenadier_rifle_bullet_casing_3", 154, -85, 0, 14);
        cj.a("zombie_dawn_human_female_ow", 37, -127, 1, 13);
        cj.a("zombie_dawn_human_female_eek", 38, -84, 1, 13);
        cj.a("zombie_dawn_human_female_oof", 39, -122, 1, 13);
        cj.a("zombie_dawn_human_male_oof", 40, -99, 1, 13);
        cj.a("zombie_dawn_human_male_argh", 41, -107, 1, 13);
        cj.a("zombie_dawn_human_male_urgh", 42, -116, 1, 13);
        cj.a("zombie_dawn_human_male_uuh", 43, -88, 1, 13);
        cj.a("zombie_dawn_use_powerup", 46, -96, 1, 13);
        cj.a("zombie_dawn_cinema_ambience", 48, -93, 1, 13);
        cj.a("zombie_dawn_female_scream_1", 26, -86, 1, 13);
        cj.a("zombie_dawn_female_scream_2", 27, -87, 1, 13);
        cj.a("zombie_dawn_female_scream_4", 28, -107, 1, 13);
        cj.a("zombie_dawn_male_scream_1", 49, -94, 1, 13);
        cj.a("zombie_dawn_male_scream_2", 50, -115, 1, 13);
        cj.a("zombie_dawn_male_scream_3", 51, -85, 1, 13);
        cj.a("zombie_dawn_female_scream_3", 52, -105, 1, 13);
        cj.a("zombie_dawn_collect_powerup", 9, -104, 1, 13);
        cj.a("zombie_chase_human_male", 15, -125, 1, 13);
        cj.a("zombie_chase_human_female", 25, -100, 1, 13);
        cj.a("zombie_screech", 17, -86, 1, 13);
        cj.a("zombie_groan_short_1", 70, -90, 1, 13);
        cj.a("zombie_groan_short_2", 71, -107, 1, 13);
        cj.a("zombie_groan_female_3", 72, -110, 1, 13);
        cj.a("zombie_groan_female_4", 73, -120, 1, 13);
        cj.a("zd_multi_cloak_of_fear", 75, -116, 1, 14);
        cj.a("zd_multi_shackles", 78, -123, 1, 14);
        cj.a("ZD_update_farmer_1", 85, -124, 1, 14);
        cj.a("ZD_update_farmer_2", 86, -128, 1, 14);
        cj.a("ZD_update_farmer_3", 87, -110, 1, 14);
        cj.a("ZD_update_grenadier_2", 89, -103, 1, 8);
        cj.a("ZD_update_queen_murmur_1", 111, -111, 1, 8);
        cj.a("ZD_update_queen_murmur_3", 113, -124, 1, 8);
        cj.a("ZD_update_tannoy_death", 149, -99, 1, 5);
        cj.a("ZD_update_tannoy_1", 119, -99, 1, 5);
        cj.a("ZD_update_tannoy_2", 120, -116, 1, 5);
        cj.a("ZD_update_tannoy_3", 121, -86, 1, 5);
        cj.a("ZD_update_queen_panic_with_static_and_radio", 150, -120, 1, 8);
        cj.a("ZD_update_creature_chew", 151, -95, 1, 7);
        cj.a("ZD_update_test_chamber", 123, -104, 1, 7);
        cj.a("ZD_update_test_chamber_growl", 125, -90, 1, 7);
        field_v[11] = "zombie dawn update country";
        field_v[1] = "zombie dawn mall";
        field_v[4] = "zombie dawn white house";
        field_v[5] = "zombie dawn countup part 1";
        field_v[13] = "zombie dawn update buckingham";
        field_v[8] = "zombie dawn end level";
        field_v[2] = "zombie dawn powerplant";
        field_v[12] = "zombie dawn update area51";
        field_v[10] = "zombie dawn update airport";
        field_v[7] = "zombie dawn bonus level";
        field_v[3] = "zombie dawn precinct";
    }
}
