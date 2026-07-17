/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class am extends jc {
    private int field_K;
    static int field_J;
    static String field_N;
    private int field_M;
    private boolean field_P;
    private we field_O;
    private String field_L;
    private int field_Q;

    final void a(byte param0, int param1, int param2, int param3) {
        int var5 = ((am) this).field_u + param1;
        int var6 = param2 + ((am) this).field_t;
        super.a(param0, param1, param2, param3);
        if (!(0 == param3)) {
            return;
        }
        int var7 = !((am) this).field_P ? 0 : -(((am) this).field_K * 2) + (-((am) this).field_Q + ((am) this).field_v);
        int discarded$0 = ((am) this).field_O.a(((am) this).field_L, ((am) this).field_K + (var7 + var5), ((am) this).field_K + var6, ((am) this).field_Q - ((am) this).field_K, -(((am) this).field_K * 2) + ((am) this).field_q, ((am) this).field_M, -1, !((am) this).field_P ? 2 : 0, 1, ((am) this).field_O.field_I);
    }

    public static void n() {
        field_N = null;
    }

    final String h(int param0) {
        int var2 = ((am) this).field_I.field_x ? 1 : 0;
        ((am) this).field_I.field_x = ((am) this).field_x;
        String var3 = ((am) this).field_I.h(param0);
        ((am) this).field_I.field_x = var2 != 0 ? true : false;
        return var3;
    }

    final static int c(byte param0) {
        int var1_int = 0;
        RuntimeException var1 = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int stackIn_22_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_21_0 = 0;
        var6 = MinerDisturbance.field_ab;
        try {
          L0: {
            var1_int = 0;
            var2 = 0;
            L1: while (true) {
              if (var2 >= 35) {
                var2 = -55 % ((25 - param0) / 53);
                stackOut_21_0 = var1_int;
                stackIn_22_0 = stackOut_21_0;
                break L0;
              } else {
                var3 = 0;
                var4 = 0;
                L2: while (true) {
                  L3: {
                    if (var4 >= 2) {
                      break L3;
                    } else {
                      L4: {
                        if (th.field_b[var2][var4]) {
                          if (d.a(var2, var4, (byte) 68)) {
                            var3 = 1;
                            break L3;
                          } else {
                            if (!vd.field_s[var2]) {
                              break L4;
                            } else {
                              var5 = 0;
                              L5: while (true) {
                                if (var5 >= 2) {
                                  break L4;
                                } else {
                                  L6: {
                                    if (var5 != var4) {
                                      if (!d.a(var2, var5, (byte) 68)) {
                                        break L6;
                                      } else {
                                        var3 = 1;
                                        break L4;
                                      }
                                    } else {
                                      break L6;
                                    }
                                  }
                                  var5++;
                                  continue L5;
                                }
                              }
                            }
                          }
                        } else {
                          break L4;
                        }
                      }
                      var4++;
                      continue L2;
                    }
                  }
                  L7: {
                    if (var3 == 0) {
                      break L7;
                    } else {
                      break L7;
                    }
                  }
                  var2++;
                  continue L1;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw lj.a((Throwable) (Object) var1, "am.C(" + param0 + 41);
        }
        return stackIn_22_0;
    }

    am(int param0, int param1, int param2, int param3, fe param4, boolean param5, int param6, int param7, we param8, int param9, String param10) {
        super(param0, param1, param2, param3, (ad) null, (rm) null);
        RuntimeException var12 = null;
        int var12_int = 0;
        int var13 = 0;
        int var14 = 0;
        Object stackIn_2_0 = null;
        Object stackIn_3_0 = null;
        Object stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        int stackIn_10_0 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_1_0 = null;
        Object stackOut_3_0 = null;
        int stackOut_3_1 = 0;
        Object stackOut_2_0 = null;
        int stackOut_2_1 = 0;
        int stackOut_9_0 = 0;
        int stackOut_8_0 = 0;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        try {
          L0: {
            L1: {
              ((am) this).field_I = param4;
              ((am) this).field_L = param10;
              ((am) this).field_M = param9;
              ((am) this).field_K = param7;
              stackOut_1_0 = this;
              stackIn_3_0 = stackOut_1_0;
              stackIn_2_0 = stackOut_1_0;
              if (!param5) {
                stackOut_3_0 = this;
                stackOut_3_1 = 0;
                stackIn_4_0 = stackOut_3_0;
                stackIn_4_1 = stackOut_3_1;
                break L1;
              } else {
                stackOut_2_0 = this;
                stackOut_2_1 = 1;
                stackIn_4_0 = stackOut_2_0;
                stackIn_4_1 = stackOut_2_1;
                break L1;
              }
            }
            L2: {
              ((am) this).field_P = stackIn_4_1 != 0;
              ((am) this).field_Q = param6;
              ((am) this).field_O = param8;
              var12_int = -((am) this).field_K + ((am) this).field_Q;
              var13 = ((am) this).field_O.b(param10, var12_int, ((am) this).field_O.field_I) + 2 * ((am) this).field_K;
              if (param3 >= var13) {
                var13 = param3;
                break L2;
              } else {
                ((am) this).a(var13, -128, param0, param2, param1);
                break L2;
              }
            }
            L3: {
              if (!((am) this).field_P) {
                stackOut_9_0 = ((am) this).field_Q + 2 * ((am) this).field_K;
                stackIn_10_0 = stackOut_9_0;
                break L3;
              } else {
                stackOut_8_0 = 0;
                stackIn_10_0 = stackOut_8_0;
                break L3;
              }
            }
            var14 = stackIn_10_0;
            ((am) this).field_I.a(-(((am) this).field_K * 2) + param3, -113, var14, -(((am) this).field_K * 3) + (-((am) this).field_Q + param2), ((am) this).field_K - -(var13 + -param3 >> 1));
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var12 = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) var12;
            stackOut_12_1 = new StringBuilder().append("am.<init>(").append(param0).append(44).append(param1).append(44).append(param2).append(44).append(param3).append(44);
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param4 == null) {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L4;
            } else {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L4;
            }
          }
          L5: {
            stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
            stackOut_15_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_15_2).append(44).append(param5).append(44).append(param6).append(44).append(param7).append(44);
            stackIn_17_0 = stackOut_15_0;
            stackIn_17_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param8 == null) {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L5;
            } else {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "{...}";
              stackIn_18_0 = stackOut_16_0;
              stackIn_18_1 = stackOut_16_1;
              stackIn_18_2 = stackOut_16_2;
              break L5;
            }
          }
          L6: {
            stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
            stackOut_18_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_18_2).append(44).append(param9).append(44);
            stackIn_20_0 = stackOut_18_0;
            stackIn_20_1 = stackOut_18_1;
            stackIn_19_0 = stackOut_18_0;
            stackIn_19_1 = stackOut_18_1;
            if (param10 == null) {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "null";
              stackIn_21_0 = stackOut_20_0;
              stackIn_21_1 = stackOut_20_1;
              stackIn_21_2 = stackOut_20_2;
              break L6;
            } else {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "{...}";
              stackIn_21_0 = stackOut_19_0;
              stackIn_21_1 = stackOut_19_1;
              stackIn_21_2 = stackOut_19_2;
              break L6;
            }
          }
          throw lj.a((Throwable) (Object) stackIn_21_0, stackIn_21_2 + 41);
        }
    }

    final static void a(bj param0) {
        RuntimeException var2 = null;
        wm var4 = null;
        wm var5 = null;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
        try {
          L0: {
            var4 = new wm(22050, fj.field_r);
            var5 = var4;
            re.field_a = new ji[62];
            re.field_a[0] = jd.a(param0, "", "md_slugger").a().a(var5);
            re.field_a[1] = jd.a(param0, "", "md_menu").a().a(var5);
            re.field_a[2] = jd.a(param0, "", "md_cha-ching").a().a(var5);
            re.field_a[3] = jd.a(param0, "", "md_sploch").a().a(var5);
            re.field_a[4] = jd.a(param0, "", "md_scream").a().a(var5);
            re.field_a[5] = jd.a(param0, "", "md_lava_noise_500ms").a().a(var5);
            re.field_a[6] = jd.a(param0, "", "md_drowning").a().a(var5);
            re.field_a[7] = jd.a(param0, "", "md_choking").a().a(var5);
            re.field_a[8] = jd.a(param0, "", "md_boom").a().a(var5);
            re.field_a[9] = jd.a(param0, "", "md_clunk").a().a(var5);
            re.field_a[10] = jd.a(param0, "", "md_jump").a().a(var5);
            re.field_a[11] = jd.a(param0, "", "md_ching").a().a(var5);
            re.field_a[12] = jd.a(param0, "", "md_pickup_iron").a().a(var5);
            re.field_a[13] = jd.a(param0, "", "md_pickup_silver").a().a(var5);
            re.field_a[14] = jd.a(param0, "", "md_pickup_gold").a().a(var5);
            re.field_a[15] = jd.a(param0, "", "md_pickup_xenon").a().a(var5);
            re.field_a[16] = jd.a(param0, "", "md_pickup_diamond").a().a(var5);
            re.field_a[17] = jd.a(param0, "", "md_beep").a().a(var5);
            re.field_a[18] = jd.a(param0, "", "md_hiss").a().a(var5);
            re.field_a[19] = jd.a(param0, "", "md_splurdoosh").a().a(var5);
            re.field_a[20] = jd.a(param0, "", "md_whoopf").a().a(var5);
            re.field_a[21] = jd.a(param0, "", "md_crumble").a().a(var5);
            re.field_a[22] = jd.a(param0, "", "md_thudathuda").a().a(var5);
            re.field_a[23] = jd.a(param0, "", "md_chink").a().a(var5);
            re.field_a[24] = jd.a(param0, "", "md_dull_chink").a().a(var5);
            re.field_a[25] = jd.a(param0, "", "md_splash").a().a(var5);
            re.field_a[26] = jd.a(param0, "", "md_splash_2").a().a(var5);
            re.field_a[27] = jd.a(param0, "", "md_splash_3").a().a(var5);
            re.field_a[28] = jd.a(param0, "", "md_splash_4").a().a(var5);
            re.field_a[29] = jd.a(param0, "", "md_splash_5").a().a(var5);
            re.field_a[30] = jd.a(param0, "", "md_splosh").a().a(var5);
            re.field_a[31] = jd.a(param0, "", "md_step_150ms").a().a(var5);
            re.field_a[32] = jd.a(param0, "", "md_twump").a().a(var5);
            re.field_a[33] = jd.a(param0, "", "md_ice_boom").a().a(var5);
            re.field_a[34] = jd.a(param0, "", "md_ice_dull_chink").a().a(var5);
            re.field_a[35] = jd.a(param0, "", "md_ice_jetpack_200ms_loop").a().a(var5);
            re.field_a[36] = jd.a(param0, "", "md_ice_jetpack_broken_200ms_loop").a().a(var5);
            re.field_a[37] = jd.a(param0, "", "md_ice_penguin_squawk").a().a(var5);
            re.field_a[38] = jd.a(param0, "", "md_ice_penguin_squawk_2").a().a(var5);
            re.field_a[39] = jd.a(param0, "", "md_ice_penguin_squawk_3").a().a(var5);
            re.field_a[40] = jd.a(param0, "", "md_ice_penguin_squawk_4").a().a(var5);
            re.field_a[41] = jd.a(param0, "", "md_ice_player_land_on_snow").a().a(var5);
            re.field_a[42] = jd.a(param0, "", "md_ice_sliding_200ms_loop").a().a(var5);
            re.field_a[43] = jd.a(param0, "", "md_ice_teeth_chatter_400ms_loop").a().a(var5);
            re.field_a[44] = jd.a(param0, "", "md_ice_walrus_growl").a().a(var5);
            re.field_a[45] = jd.a(param0, "", "md_ice_walrus_grunt").a().a(var5);
            re.field_a[46] = jd.a(param0, "", "md_ice_oil_burning").a().a(var5);
            re.field_a[47] = jd.a(param0, "", "md_lava_rising_bgsound").a().a(var5);
            re.field_a[48] = jd.a(param0, "", "md_ice_mining_ice").a().a(var5);
            re.field_a[49] = jd.a(param0, "", "md_ice_mining_ice_2").a().a(var5);
            re.field_a[50] = jd.a(param0, "", "md_ice_mining_ice_3").a().a(var5);
            re.field_a[51] = jd.a(param0, "", "md_ice_mining_snow").a().a(var5);
            re.field_a[52] = jd.a(param0, "", "md_ice_mining_snow_2").a().a(var5);
            re.field_a[53] = jd.a(param0, "", "md_ice_mining_snow_3").a().a(var5);
            re.field_a[54] = jd.a(param0, "", "md_ice_mining_rock").a().a(var5);
            re.field_a[55] = jd.a(param0, "", "md_ice_mining_rock_2").a().a(var5);
            re.field_a[56] = jd.a(param0, "", "md_ice_mining_rock_3").a().a(var5);
            re.field_a[57] = jd.a(param0, "", "md_ice_player_glooping_in_oil").a().a(var5);
            re.field_a[58] = jd.a(param0, "", "md_ice_player_glooping_in_oil_2").a().a(var5);
            re.field_a[59] = jd.a(param0, "", "md_ice_player_glooping_in_oil_3").a().a(var5);
            re.field_a[60] = jd.a(param0, "", "md_ice_player_glooping_in_oil_4").a().a(var5);
            re.field_a[61] = jd.a(param0, "", "md_ice_pickup_freezium").a().a(var5);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2 = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var2;
            stackOut_2_1 = new StringBuilder().append("am.A(");
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
          throw lj.a((Throwable) (Object) stackIn_5_0, stackIn_5_2 + 44 + 27 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_N = "Friends can be added in multiplayer<nbsp>games";
    }
}
