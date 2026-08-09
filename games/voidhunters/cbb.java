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
        int dupTemp$0 = 0;
        int[] arrayValue$1 = null;
        int[] array$2 = null;
        int[] var2;
        int var3;
        int var4_int;
        int var5;
        int var7;
        int[] var8;
        int[] var9;
        int[] var11;
        int[][] var4;
        int var6;
        int[][] var10;
        int[][] var12;
        L0: {
          var7 = VoidHunters.field_G;
          var11 = new int[256];
          var9 = var11;
          var8 = var9;
          var2 = var8;
          if (param0 < -90) {
            break L0;
          } else {
            this.field_t = (short[]) null;
            break L0;
          }
        }
        var3 = 0;
        var4_int = 0;
        L1: while (true) {
          if (var4_int >= this.field_g.length) {
            var12 = new int[var3 - -1][];
            var10 = var12;
            var4 = var10;
            var5 = 0;
            L2: while (true) {
              if (var5 > var3) {
                var5 = 0;
                L3: while (true) {
                  if (var5 >= this.field_g.length) {
                    return var4;
                  } else {
                    var6 = this.field_g[var5].field_a;
                    if (var6 >= 0) {
                      var12 = var10;
                      dupTemp$0 = var2[var6];
                      arrayValue$1 = var12[var6];
                      var2[var6] = dupTemp$0 + 1;
                      arrayValue$1[dupTemp$0] = var5;
                      var5++;
                      continue L3;
                    } else {
                      var5++;
                      continue L3;
                    }
                  }
                }
              } else {
                array$2 = new int[var11[var5]];
                var4[var5] = array$2;
                var11[var5] = 0;
                var5++;
                continue L2;
              }
            }
          } else {
            var5 = this.field_g[var4_int].field_a;
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
        int dupTemp$0 = 0;
        int[] arrayValue$1 = null;
        int[] array$2 = null;
        int[] var3;
        int var4;
        int var5;
        int var6_int;
        int var7;
        int var9;
        int[] var10;
        int[] var11;
        int[] var13;
        int stackIn_3_0 = 0;
        int[][] var6;
        int var8;
        int[][] var12;
        int[][] var14;
        L0: {
          var9 = VoidHunters.field_G;
          var13 = new int[256];
          var11 = var13;
          var10 = var11;
          var3 = var10;
          var4 = 0;
          if (!param1) {
            stackIn_3_0 = this.field_D;
            break L0;
          } else {
            stackIn_3_0 = this.field_s;
            break L0;
          }
        }
        L1: {
          var5 = stackIn_3_0;
          if (param0 == -37) {
            break L1;
          } else {
            this.a(-13);
            break L1;
          }
        }
        var6_int = 0;
        L2: while (true) {
          if (var5 <= var6_int) {
            var14 = new int[1 + var4][];
            var12 = var14;
            var6 = var12;
            var7 = 0;
            L3: while (true) {
              if (var4 < var7) {
                var7 = 0;
                L4: while (true) {
                  var14 = var12;
                  if (var7 >= var5) {
                    return var6;
                  } else {
                    var8 = this.field_p[var7];
                    if (-1 >= (var8 ^ -1)) {
                      dupTemp$0 = var3[var8];
                      arrayValue$1 = var14[var8];
                      var3[var8] = dupTemp$0 + 1;
                      arrayValue$1[dupTemp$0] = var7;
                      var7++;
                      continue L4;
                    } else {
                      var7++;
                      continue L4;
                    }
                  }
                }
              } else {
                array$2 = new int[var13[var7]];
                var6[var7] = array$2;
                var13[var7] = 0;
                var7++;
                continue L3;
              }
            }
          } else {
            var7 = this.field_p[var6_int];
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
        int dupTemp$0 = 0;
        int[] arrayValue$1 = null;
        int[] array$2 = null;
        int[] var2;
        int var3;
        int var4_int;
        int var5;
        int var7;
        int[] var8;
        int[] var9;
        int[] var11;
        int[][] var4;
        int var6;
        int[][] var10;
        int[][] var12;
        var7 = VoidHunters.field_G;
        var11 = new int[256];
        var9 = var11;
        var8 = var9;
        var2 = var8;
        var3 = 0;
        var4_int = 0;
        L0: while (true) {
          if (var4_int >= this.field_j) {
            var12 = new int[var3 + 1][];
            var10 = var12;
            var4 = var10;
            var5 = param0;
            L1: while (true) {
              if (var3 < var5) {
                var5 = 0;
                L2: while (true) {
                  if (this.field_j <= var5) {
                    return var4;
                  } else {
                    var6 = this.field_y[var5];
                    if ((var6 ^ -1) <= -1) {
                      var12 = var10;
                      dupTemp$0 = var2[var6];
                      arrayValue$1 = var12[var6];
                      var2[var6] = dupTemp$0 + 1;
                      arrayValue$1[dupTemp$0] = var5;
                      var5++;
                      continue L2;
                    } else {
                      var5++;
                      continue L2;
                    }
                  }
                }
              } else {
                array$2 = new int[var11[var5]];
                var4[var5] = array$2;
                var11[var5] = 0;
                var5++;
                continue L1;
              }
            }
          } else {
            var5 = this.field_y[var4_int];
            if ((var5 ^ -1) <= -1) {
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
        jva var8 = null;
        ima[] var9 = null;
        ima[] var10 = null;
        ima[] var11 = null;
        ima[] var12 = null;
        ima[] var6 = null;
        ima[] var7 = null;
        try {
            var8 = new jva(param0.a("box_bottom.png", true, ""), (java.awt.Component) ((Object) df.e((byte) 75)));
            var8.e();
            oaa.field_j = (phb) ((Object) var8);
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
            var9 = ima.a(param2, "basic", "box_pack");
            ww.a(hwa.field_r, 31, var9, -25801);
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
            int var5 = 15 % ((51 - param1) / 62);
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
            var10 = ima.a(param2, "basic", "icons_hud");
            ww.a(hwa.field_r, 102, var10, -25801);
            var11 = ima.a(param2, "basic", "self_destruct");
            ww.a(hwa.field_r, 112, var11, -25801);
            hwa.field_r[115] = ima.b(param2, "basic", "chat");
            var12 = ima.a(param2, "basic", "frame_outer");
            ww.a(hwa.field_r, 116, var12, -25801);
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
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) ((Object) runtimeException), "cbb.D(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    private cbb() throws Throwable {
        throw new Error();
    }

    static {
        field_h = 66;
    }
}
