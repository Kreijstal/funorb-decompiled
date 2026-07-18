/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cbb {
    short[] field_w;
    byte[] field_r;
    qeb[] field_c;
    short[] field_t;
    int[] field_L;
    short[] field_u;
    static long field_q;
    int field_D;
    int[] field_f;
    bqa[] field_g;
    byte[] field_e;
    int[] field_p;
    byte[] field_m;
    short[] field_o;
    short[] field_i;
    short[] field_z;
    int[] field_G;
    byte[] field_M;
    byte[] field_J;
    short[] field_k;
    int field_B;
    int[] field_I;
    byte[] field_E;
    int[] field_x;
    int field_s;
    int[] field_a;
    short[] field_K;
    byte field_d;
    tn[] field_l;
    int[] field_y;
    int[] field_v;
    int[] field_F;
    short[] field_H;
    byte[] field_n;
    short[] field_b;
    int[] field_C;
    int field_j;
    static int field_h;

    final int[][] a(int param0) {
        int[] var2 = null;
        int var3 = 0;
        int var4_int = 0;
        int[][] var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int[] var8 = null;
        int[] var9 = null;
        int[][] var10 = null;
        int[] var11 = null;
        int[][] var12 = null;
        int[] var13 = null;
        int[][] var14 = null;
        int[] var15 = null;
        int[][] var16 = null;
        L0: {
          var7 = VoidHunters.field_G;
          var15 = new int[256];
          var13 = var15;
          var11 = var13;
          var9 = var11;
          var8 = var9;
          var2 = var8;
          if (param0 < -90) {
            break L0;
          } else {
            ((cbb) this).field_t = null;
            break L0;
          }
        }
        var3 = 0;
        var4_int = 0;
        L1: while (true) {
          if (var4_int >= ((cbb) this).field_g.length) {
            var16 = new int[var3 - -1][];
            var14 = var16;
            var12 = var14;
            var10 = var12;
            var4 = var10;
            var5 = 0;
            L2: while (true) {
              if (var5 > var3) {
                var5 = 0;
                L3: while (true) {
                  if (var5 >= ((cbb) this).field_g.length) {
                    return var4;
                  } else {
                    var6 = ((cbb) this).field_g[var5].field_a;
                    if (var6 >= 0) {
                      var16 = var14;
                      var2[var6] = var2[var6] + 1;
                      var16[var6][var2[var6]] = var5;
                      var5++;
                      continue L3;
                    } else {
                      var5++;
                      continue L3;
                    }
                  }
                }
              } else {
                var4[var5] = new int[var15[var5]];
                var15[var5] = 0;
                var5++;
                continue L2;
              }
            }
          } else {
            var5 = ((cbb) this).field_g[var4_int].field_a;
            if (var5 >= 0) {
              L4: {
                if (var3 >= var5) {
                  break L4;
                } else {
                  var3 = var5;
                  break L4;
                }
              }
              var8[var5] = var8[var5] + 1;
              var4_int++;
              continue L1;
            } else {
              var4_int++;
              continue L1;
            }
          }
        }
    }

    final int[][] a(byte param0, boolean param1) {
        int[] var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6_int = 0;
        int[][] var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int[] var10 = null;
        int[] var11 = null;
        int[][] var12 = null;
        int[] var13 = null;
        int[][] var14 = null;
        int[] var15 = null;
        int[][] var16 = null;
        int[] var17 = null;
        int[][] var18 = null;
        int stackIn_3_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_1_0 = 0;
        L0: {
          var9 = VoidHunters.field_G;
          var17 = new int[256];
          var15 = var17;
          var13 = var15;
          var11 = var13;
          var10 = var11;
          var3 = var10;
          var4 = 0;
          if (!param1) {
            stackOut_2_0 = ((cbb) this).field_D;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          } else {
            stackOut_1_0 = ((cbb) this).field_s;
            stackIn_3_0 = stackOut_1_0;
            break L0;
          }
        }
        L1: {
          var5 = stackIn_3_0;
          if (param0 == -37) {
            break L1;
          } else {
            int[][] discarded$1 = ((cbb) this).a(-13);
            break L1;
          }
        }
        var6_int = 0;
        L2: while (true) {
          if (var5 <= var6_int) {
            var18 = new int[1 + var4][];
            var16 = var18;
            var14 = var16;
            var12 = var14;
            var6 = var12;
            var7 = 0;
            L3: while (true) {
              if (var4 < var7) {
                var7 = 0;
                L4: while (true) {
                  var18 = var16;
                  if (var7 >= var5) {
                    return var6;
                  } else {
                    var8 = ((cbb) this).field_p[var7];
                    if (var8 >= 0) {
                      var3[var8] = var3[var8] + 1;
                      var18[var8][var3[var8]] = var7;
                      var7++;
                      continue L4;
                    } else {
                      var7++;
                      continue L4;
                    }
                  }
                }
              } else {
                var6[var7] = new int[var17[var7]];
                var17[var7] = 0;
                var7++;
                continue L3;
              }
            }
          } else {
            var7 = ((cbb) this).field_p[var6_int];
            if (var7 >= 0) {
              L5: {
                if (var4 < var7) {
                  var4 = var7;
                  break L5;
                } else {
                  break L5;
                }
              }
              var10[var7] = var10[var7] + 1;
              var6_int++;
              continue L2;
            } else {
              var6_int++;
              continue L2;
            }
          }
        }
    }

    final int[][] b(int param0) {
        int[] var2 = null;
        int var3 = 0;
        int var4_int = 0;
        int[][] var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int[] var8 = null;
        int[] var9 = null;
        int[][] var10 = null;
        int[] var11 = null;
        int[][] var12 = null;
        int[] var13 = null;
        int[][] var14 = null;
        int[] var15 = null;
        int[][] var16 = null;
        var7 = VoidHunters.field_G;
        var15 = new int[256];
        var13 = var15;
        var11 = var13;
        var9 = var11;
        var8 = var9;
        var2 = var8;
        var3 = 0;
        var4_int = 0;
        L0: while (true) {
          if (var4_int >= ((cbb) this).field_j) {
            var16 = new int[var3 + 1][];
            var14 = var16;
            var12 = var14;
            var10 = var12;
            var4 = var10;
            var5 = param0;
            L1: while (true) {
              if (var3 < var5) {
                var5 = 0;
                L2: while (true) {
                  if (((cbb) this).field_j <= var5) {
                    return var4;
                  } else {
                    var6 = ((cbb) this).field_y[var5];
                    if (var6 >= 0) {
                      var16 = var14;
                      var2[var6] = var2[var6] + 1;
                      var16[var6][var2[var6]] = var5;
                      var5++;
                      continue L2;
                    } else {
                      var5++;
                      continue L2;
                    }
                  }
                }
              } else {
                var4[var5] = new int[var15[var5]];
                var15[var5] = 0;
                var5++;
                continue L1;
              }
            }
          } else {
            var5 = ((cbb) this).field_y[var4_int];
            if (var5 >= 0) {
              var8[var5] = var8[var5] + 1;
              if (var5 > var3) {
                var3 = var5;
                var4_int++;
                continue L0;
              } else {
                var4_int++;
                continue L0;
              }
            } else {
              var4_int++;
              continue L0;
            }
          }
        }
    }

    final static void a(asb param0, int param1, asb param2) {
        RuntimeException var3 = null;
        ima[] var4 = null;
        int var5 = 0;
        ima[] var6 = null;
        ima[] var7 = null;
        jva var8 = null;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          L0: {
            var8 = new jva(param0.a("box_bottom.png", true, ""), (java.awt.Component) (Object) df.e((byte) 75));
            var8.e();
            oaa.field_j = (phb) (Object) var8;
            hwa.field_r = new ima[138];
            hwa.field_r[0] = ima.b(param2, "basic", "objective_icon_attack");
            hwa.field_r[1] = ima.b(param2, "basic", "objective_icon_defend");
            hwa.field_r[2] = ima.b(param2, "basic", "objective_icon_move");
            hwa.field_r[3] = ima.b(param2, "basic", "objective_icon_grab");
            hwa.field_r[4] = ima.b(param2, "basic", "tear_drop");
            hwa.field_r[5] = ima.b(param2, "basic", "rightmouse");
            hwa.field_r[6] = ima.b(param2, "basic", "stars");
            hwa.field_r[7] = ima.b(param2, "basic", "star_field");
            hwa.field_r[8] = ima.b(param2, "basic", "nebula1");
            hwa.field_r[9] = ima.b(param2, "basic", "nebula2");
            hwa.field_r[10] = ima.b(param2, "basic", "nebula3");
            hwa.field_r[11] = ima.b(param2, "basic", "chassis1");
            hwa.field_r[12] = ima.b(param2, "basic", "chassis1_glow");
            hwa.field_r[13] = ima.b(param2, "basic", "chassis2");
            hwa.field_r[14] = ima.b(param2, "basic", "chassis2_glow");
            hwa.field_r[15] = ima.b(param2, "basic", "chassis3");
            hwa.field_r[16] = ima.b(param2, "basic", "chassis3_glow");
            hwa.field_r[17] = ima.b(param2, "basic", "chassis4");
            hwa.field_r[18] = ima.b(param2, "basic", "chassis4_glow");
            hwa.field_r[19] = ima.b(param2, "basic", "chassis5");
            hwa.field_r[20] = ima.b(param2, "basic", "chassis5_glow");
            hwa.field_r[21] = ima.b(param2, "basic", "chassis6");
            hwa.field_r[22] = ima.b(param2, "basic", "chassis6_glow");
            hwa.field_r[23] = ima.b(param2, "basic", "chassis7");
            hwa.field_r[24] = ima.b(param2, "basic", "chassis7_glow");
            hwa.field_r[25] = ima.b(param2, "basic", "chassis8");
            hwa.field_r[26] = ima.b(param2, "basic", "chassis8_glow");
            hwa.field_r[27] = ima.b(param2, "basic", "chassis9");
            hwa.field_r[28] = ima.b(param2, "basic", "chassis9_glow");
            var4 = ima.a(param2, "basic", "box_pack");
            int discarded$4 = -25801;
            ww.a((Object[]) (Object) hwa.field_r, 31, (Object[]) (Object) var4);
            hwa.field_r[40] = ima.b(param2, "basic", "icon_frame_lrg");
            hwa.field_r[41] = ima.b(param2, "basic", "icon_frame_lrg_select");
            hwa.field_r[42] = ima.b(param2, "basic", "icon_frame_sml");
            hwa.field_r[43] = ima.b(param2, "basic", "icon_frame_sml_select");
            hwa.field_r[44] = ima.b(param2, "basic", "energy_bar");
            hwa.field_r[45] = ima.b(param2, "basic", "icon_assault");
            hwa.field_r[46] = ima.b(param2, "basic", "icon_assault2");
            hwa.field_r[47] = ima.b(param2, "basic", "icon_convoy");
            hwa.field_r[48] = ima.b(param2, "basic", "icon_convoy2");
            hwa.field_r[49] = ima.b(param2, "basic", "icon_assassin");
            hwa.field_r[50] = ima.b(param2, "basic", "icon_assassin2");
            hwa.field_r[51] = ima.b(param2, "basic", "icon_blitz");
            hwa.field_r[52] = ima.b(param2, "basic", "icon_blitz2");
            hwa.field_r[53] = ima.b(param2, "basic", "icon_assault_double");
            hwa.field_r[54] = ima.b(param2, "basic", "icon_assault2_double");
            hwa.field_r[55] = ima.b(param2, "basic", "icon_convoy_double");
            hwa.field_r[56] = ima.b(param2, "basic", "icon_convoy2_double");
            hwa.field_r[57] = ima.b(param2, "basic", "icon_assassin_double");
            hwa.field_r[58] = ima.b(param2, "basic", "icon_assassin2_double");
            hwa.field_r[59] = ima.b(param2, "basic", "icon_hoard");
            var5 = 15 % ((51 - param1) / 62);
            hwa.field_r[60] = ima.b(param2, "basic", "icon_hoard2");
            hwa.field_r[61] = ima.b(param2, "basic", "icon_scavenge");
            hwa.field_r[62] = ima.b(param2, "basic", "icon_scavenge2");
            hwa.field_r[63] = ima.b(param2, "basic", "icon_resnet");
            hwa.field_r[64] = ima.b(param2, "basic", "icon_resnet2");
            hwa.field_r[65] = ima.b(param2, "basic", "icon_hold");
            hwa.field_r[66] = ima.b(param2, "basic", "icon_hold2");
            hwa.field_r[67] = ima.b(param2, "basic", "icon_arena");
            hwa.field_r[68] = ima.b(param2, "basic", "icon_arena2");
            hwa.field_r[69] = ima.b(param2, "basic", "icon_showdown");
            hwa.field_r[70] = ima.b(param2, "basic", "icon_showdown2");
            hwa.field_r[71] = ima.b(param2, "basic", "map_width_increase");
            hwa.field_r[72] = ima.b(param2, "basic", "map_width_increase_small");
            hwa.field_r[73] = ima.b(param2, "basic", "map_width_decrease");
            hwa.field_r[74] = ima.b(param2, "basic", "map_width_decrease_small");
            hwa.field_r[75] = ima.b(param2, "basic", "map_height_increase");
            hwa.field_r[76] = ima.b(param2, "basic", "map_height_increase_small");
            hwa.field_r[77] = ima.b(param2, "basic", "map_height_decrease");
            hwa.field_r[78] = ima.b(param2, "basic", "map_height_decrease_small");
            hwa.field_r[79] = ima.b(param2, "basic", "more_asteroids");
            hwa.field_r[80] = ima.b(param2, "basic", "more_asteroids_small");
            hwa.field_r[81] = ima.b(param2, "basic", "more_nebula");
            hwa.field_r[82] = ima.b(param2, "basic", "more_nebula_small");
            hwa.field_r[83] = ima.b(param2, "basic", "more_powerplants");
            hwa.field_r[84] = ima.b(param2, "basic", "more_powerplants_small");
            hwa.field_r[85] = ima.b(param2, "basic", "more_shields");
            hwa.field_r[86] = ima.b(param2, "basic", "more_shields_small");
            hwa.field_r[87] = ima.b(param2, "basic", "more_missile_defence");
            hwa.field_r[88] = ima.b(param2, "basic", "more_missile_defence_small");
            hwa.field_r[89] = ima.b(param2, "basic", "more_armour");
            hwa.field_r[90] = ima.b(param2, "basic", "more_armour_small");
            hwa.field_r[91] = ima.b(param2, "basic", "more_hull_pieces");
            hwa.field_r[92] = ima.b(param2, "basic", "more_hull_pieces_small");
            hwa.field_r[93] = ima.b(param2, "basic", "more_sawblades");
            hwa.field_r[94] = ima.b(param2, "basic", "more_sawblades_small");
            hwa.field_r[95] = ima.b(param2, "basic", "more_special_weapons");
            hwa.field_r[96] = ima.b(param2, "basic", "more_special_weapons_small");
            hwa.field_r[97] = ima.b(param2, "basic", "more_thrusters");
            hwa.field_r[98] = ima.b(param2, "basic", "more_thrusters_small");
            hwa.field_r[99] = ima.b(param2, "basic", "more_weapons");
            hwa.field_r[100] = ima.b(param2, "basic", "more_weapons_small");
            hwa.field_r[101] = ima.b(param2, "basic", "icon_box");
            var4 = ima.a(param2, "basic", "icons_hud");
            int discarded$5 = -25801;
            ww.a((Object[]) (Object) hwa.field_r, 102, (Object[]) (Object) var4);
            var4 = ima.a(param2, "basic", "self_destruct");
            int discarded$6 = -25801;
            ww.a((Object[]) (Object) hwa.field_r, 112, (Object[]) (Object) var4);
            hwa.field_r[115] = ima.b(param2, "basic", "chat");
            var4 = ima.a(param2, "basic", "frame_outer");
            int discarded$7 = -25801;
            ww.a((Object[]) (Object) hwa.field_r, 116, (Object[]) (Object) var4);
            hwa.field_r[125] = ima.b(param2, "basic", "button_off");
            hwa.field_r[126] = ima.b(param2, "basic", "button_on");
            hwa.field_r[127] = ima.b(param2, "basic", "buttonbig_off");
            hwa.field_r[128] = ima.b(param2, "basic", "buttonbig_on");
            hwa.field_r[129] = ima.b(param2, "basic", "buttonsmall_off");
            hwa.field_r[130] = ima.b(param2, "basic", "buttonsmall_on");
            var6 = ima.a(param2, "basic", "slide_bars");
            hwa.field_r[132] = var6[1];
            hwa.field_r[131] = var6[0];
            var7 = ima.a(param2, "basic", "slide_buttons");
            hwa.field_r[135] = var7[1];
            hwa.field_r[134] = var7[2];
            hwa.field_r[136] = var7[0];
            hwa.field_r[133] = var7[3];
            hwa.field_r[137] = ima.b(param2, "basic", "logo");
            nkb.a(false, "Finished unpacking raw sprites");
            wgb.field_g = true;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var3;
            stackOut_2_1 = new StringBuilder().append("cbb.D(");
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param0 == null) {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "null";
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              stackIn_5_2 = stackOut_4_2;
              break L1;
            } else {
              stackOut_3_0 = (RuntimeException) (Object) stackIn_3_0;
              stackOut_3_1 = (StringBuilder) (Object) stackIn_3_1;
              stackOut_3_2 = "{...}";
              stackIn_5_0 = stackOut_3_0;
              stackIn_5_1 = stackOut_3_1;
              stackIn_5_2 = stackOut_3_2;
              break L1;
            }
          }
          L2: {
            stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
            stackOut_5_1 = ((StringBuilder) (Object) stackIn_5_1).append(stackIn_5_2).append(',').append(param1).append(',');
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param2 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L2;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L2;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + ')');
        }
    }

    private cbb() throws Throwable {
        throw new Error();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_h = 66;
    }
}
