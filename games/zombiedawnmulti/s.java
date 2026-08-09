/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class s {
    static String field_g;
    static volatile int field_b;
    static ri field_c;
    static String field_a;
    static volatile int field_f;
    static ga field_e;
    static String field_d;
    static String field_h;

    public static void a(int param0) {
        field_e = null;
        field_a = null;
        field_d = null;
        field_c = null;
        if (param0 > -71) {
            return;
        }
        field_g = null;
        field_h = null;
    }

    final static md a(ga param0, byte param1) {
        int stackIn_19_0 = 0;
        int stackIn_19_1 = 0;
        md stackIn_24_0 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_28_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        md var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        var9 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          L0: {
            var3 = 76 / ((param1 - -22) / 54);
            var2_int = param0.h(8, 14862);
            if (-1 <= (var2_int ^ -1)) {
              L1: {
                var4 = fq.a(-128, param0) ? 1 : 0;
                var5 = fq.a(-86, param0) ? 1 : 0;
                var6 = new md();
                var6.field_n = (short)param0.h(16, 14862);
                var6.field_k = lo.a(16, var6.field_k, param0, (byte) -104);
                var6.field_E = lo.a(16, var6.field_E, param0, (byte) -120);
                var6.field_v = lo.a(16, var6.field_v, param0, (byte) -122);
                var6.field_B = (short)param0.h(16, 14862);
                var6.field_y = lo.a(16, var6.field_y, param0, (byte) -128);
                var6.field_L = lo.a(16, var6.field_L, param0, (byte) -106);
                var6.field_H = lo.a(16, var6.field_H, param0, (byte) -119);
                if (var4 == 0) {
                  break L1;
                } else {
                  var6.field_o = (short)param0.h(16, 14862);
                  var6.field_A = lo.a(16, var6.field_A, param0, (byte) -108);
                  var6.field_p = lo.a(16, var6.field_p, param0, (byte) -103);
                  var6.field_b = lo.a(16, var6.field_b, param0, (byte) -119);
                  var6.field_F = lo.a(16, var6.field_F, param0, (byte) -114);
                  var6.field_K = lo.a(16, var6.field_K, param0, (byte) -103);
                  var6.field_x = lo.a(16, var6.field_x, param0, (byte) -127);
                  break L1;
                }
              }
              L2: {
                if (var5 == 0) {
                  break L2;
                } else {
                  param0.h(16, 14862);
                  var6.field_M = lo.a(16, var6.field_M, param0, (byte) -117);
                  var6.field_s = lo.a(16, var6.field_s, param0, (byte) -126);
                  var6.field_g = lo.a(16, var6.field_g, param0, (byte) -128);
                  var6.field_a = lo.a(16, var6.field_a, param0, (byte) -120);
                  var6.field_J = lo.a(16, var6.field_J, param0, (byte) -116);
                  break L2;
                }
              }
              L3: {
                if (fq.a(-99, param0)) {
                  var6.field_c = lo.a(16, var6.field_c, param0, (byte) -100);
                  break L3;
                } else {
                  break L3;
                }
              }
              L4: {
                if (!fq.a(-92, param0)) {
                  break L4;
                } else {
                  var6.field_z = dn.a(param0, var6.field_z, (byte) -102, 16);
                  var7 = 0;
                  var8 = 0;
                  L5: while (true) {
                    L6: {
                      L7: {
                        if (var8 >= var6.field_z.length) {
                          break L7;
                        } else {
                          stackIn_19_0 = var6.field_z[var8] & 255;

                          stackIn_19_1 = var7;

                          if (var9 != 0) {
                            break L6;
                          } else {
                            L8: {
                              if (stackIn_19_0 > stackIn_19_1) {
                                var7 = 255 & var6.field_z[var8];
                                break L8;
                              } else {
                                break L8;
                              }
                            }
                            var8++;
                            if (var9 == 0) {
                              continue L5;
                            } else {
                              break L7;
                            }
                          }
                        }
                      }
                      stackIn_19_0 = var7 ^ -1;
                      stackIn_19_1 = -1;
                      break L6;
                    }
                    L9: {
                      if (stackIn_19_0 == stackIn_19_1) {
                        break L9;
                      } else {
                        var6.field_m = (byte)(var7 + 1);
                        if (var9 == 0) {
                          break L4;
                        } else {
                          break L9;
                        }
                      }
                    }
                    var6.field_z = null;
                    break L4;
                  }
                }
              }
              stackIn_24_0 = (md) (var6);
              break L0;
            } else {
              throw new IllegalStateException("" + var2_int);
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L10: {
            var2 = decompiledCaughtException;
            stackIn_27_0 = (RuntimeException) (var2);

            stackIn_27_1 = new StringBuilder().append("s.B(");

            if (param0 == null) {
              stackIn_28_0 = (RuntimeException) ((Object) stackIn_27_0);
              stackIn_28_1 = (StringBuilder) ((Object) stackIn_27_1);
              stackIn_28_2 = "null";
              break L10;
            } else {
              stackIn_28_0 = (RuntimeException) ((Object) stackIn_27_0);
              stackIn_28_1 = (StringBuilder) ((Object) stackIn_27_1);
              stackIn_28_2 = "{...}";
              break L10;
            }
          }
          throw fa.a((Throwable) ((Object) stackIn_28_0), stackIn_28_2 + ',' + param1 + ')');
        }
        return stackIn_24_0;
    }

    final static void a(int param0, int param1, ja[] param2, int param3, int param4, int param5) {
        int stackIn_9_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_18_0 = 0;
        RuntimeException stackIn_84_0 = null;
        StringBuilder stackIn_84_1 = null;
        RuntimeException stackIn_85_0 = null;
        StringBuilder stackIn_85_1 = null;
        RuntimeException stackIn_86_0 = null;
        StringBuilder stackIn_86_1 = null;
        String stackIn_86_2 = null;
        int decompiledRegionSelector0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var22 = ZombieDawnMulti.field_E ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (param2 != null) {
                            statePc = 3;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 83;
                        continue stateLoop;
                    }
                }
                case 2: {
                    return;
                }
                case 3: {
                    try {
                        if (param5 <= 0) {
                            statePc = 5;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 83;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        if ((param4 ^ -1) < -1) {
                            statePc = 6;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 83;
                        continue stateLoop;
                    }
                }
                case 5: {
                    return;
                }
                case 6: {
                    try {
                        if (null != param2[3]) {
                            statePc = 8;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 83;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        stackIn_9_0 = 0;
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 83;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        stackIn_9_0 = param2[3].field_z;
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 83;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        var6_int = stackIn_9_0;
                        if (null == param2[5]) {
                            statePc = 11;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 83;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        stackIn_12_0 = param2[5].field_z;
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 83;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        stackIn_12_0 = 0;
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 83;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        var7 = stackIn_12_0;
                        if (null != param2[1]) {
                            statePc = 14;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 83;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        stackIn_15_0 = 0;
                        statePc = 15;
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 83;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        stackIn_15_0 = param2[1].field_u;
                        statePc = 15;
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 83;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        var8 = stackIn_15_0;
                        if (param2[7] != null) {
                            statePc = 17;
                        } else {
                            statePc = 16;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 83;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        stackIn_18_0 = 0;
                        statePc = 18;
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 83;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        stackIn_18_0 = param2[7].field_u;
                        statePc = 18;
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 83;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        var9 = stackIn_18_0;
                        var10 = param3 + param5;
                        var11 = param4 + param0;
                        var12 = param3 - -var6_int;
                        var13 = var10 + -var7;
                        var14 = var8 + param0;
                        var15 = -var9 + var11;
                        var16 = var12;
                        var17 = var13;
                        if ((var16 ^ -1) >= (var17 ^ -1)) {
                            statePc = 20;
                        } else {
                            statePc = 19;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 83;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        var17 = param3 + param5 * var6_int / (var7 + var6_int);
                        var16 = param3 + param5 * var6_int / (var7 + var6_int);
                        statePc = 20;
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 83;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        var18 = var14;
                        var19 = var15;
                        oo.a(qa.field_f);
                        if ((var18 ^ -1) >= (var19 ^ -1)) {
                            statePc = 22;
                        } else {
                            statePc = 21;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 83;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        var19 = param0 + param4 * var8 / (var8 + var9);
                        var18 = param0 + param4 * var8 / (var8 + var9);
                        statePc = 22;
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 83;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        if (null != param2[param1]) {
                            statePc = 24;
                        } else {
                            statePc = 23;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 83;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        statePc = 25;
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 83;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        oo.e(param3, param0, var16, var18);
                        param2[0].g(param3, param0);
                        oo.b(qa.field_f);
                        statePc = 25;
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 83;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        if (param2[2] == null) {
                            statePc = 27;
                        } else {
                            statePc = 26;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 83;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        oo.e(var17, param0, var10, var18);
                        param2[2].g(var13, param0);
                        oo.b(qa.field_f);
                        statePc = 27;
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 83;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        if (param2[6] != null) {
                            statePc = 29;
                        } else {
                            statePc = 28;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 83;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        statePc = 30;
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 83;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        oo.e(param3, var19, var16, var11);
                        param2[6].g(param3, var15);
                        oo.b(qa.field_f);
                        statePc = 30;
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 83;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        if (param2[8] != null) {
                            statePc = 32;
                        } else {
                            statePc = 31;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 83;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        statePc = 33;
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 83;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        oo.e(var17, var19, var10, var11);
                        param2[8].g(var13, var15);
                        oo.b(qa.field_f);
                        statePc = 33;
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 83;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        if (param2[1] == null) {
                            statePc = 42;
                        } else {
                            statePc = 34;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 83;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        if ((param2[1].field_z ^ -1) != -1) {
                            statePc = 36;
                        } else {
                            statePc = 35;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 83;
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        statePc = 42;
                        continue stateLoop;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 83;
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        oo.e(var16, param0, var17, var18);
                        var20 = var12;
                        statePc = 37;
                        continue stateLoop;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = 83;
                        continue stateLoop;
                    }
                }
                case 37: {
                    try {
                        if (var20 >= var13) {
                            statePc = 41;
                        } else {
                            statePc = 38;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = 83;
                        continue stateLoop;
                    }
                }
                case 38: {
                    try {
                        param2[1].g(var20, param0);
                        var20 = var20 + param2[1].field_z;
                        if (var22 != 0) {
                            statePc = 42;
                        } else {
                            statePc = 39;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = 83;
                        continue stateLoop;
                    }
                }
                case 39: {
                    try {
                        if (var22 == 0) {
                            statePc = 37;
                        } else {
                            statePc = 40;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_39) {
                        caughtException = stateCaught_39;
                        statePc = 83;
                        continue stateLoop;
                    }
                }
                case 40: {
                    try {
                        statePc = 41;
                        continue stateLoop;
                    } catch (Throwable stateCaught_40) {
                        caughtException = stateCaught_40;
                        statePc = 83;
                        continue stateLoop;
                    }
                }
                case 41: {
                    try {
                        oo.b(qa.field_f);
                        statePc = 42;
                        continue stateLoop;
                    } catch (Throwable stateCaught_41) {
                        caughtException = stateCaught_41;
                        statePc = 83;
                        continue stateLoop;
                    }
                }
                case 42: {
                    try {
                        if (param2[7] == null) {
                            statePc = 51;
                        } else {
                            statePc = 43;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_42) {
                        caughtException = stateCaught_42;
                        statePc = 83;
                        continue stateLoop;
                    }
                }
                case 43: {
                    try {
                        if (0 != param2[7].field_z) {
                            statePc = 45;
                        } else {
                            statePc = 44;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_43) {
                        caughtException = stateCaught_43;
                        statePc = 83;
                        continue stateLoop;
                    }
                }
                case 44: {
                    try {
                        statePc = 51;
                        continue stateLoop;
                    } catch (Throwable stateCaught_44) {
                        caughtException = stateCaught_44;
                        statePc = 83;
                        continue stateLoop;
                    }
                }
                case 45: {
                    try {
                        oo.e(var16, var19, var17, var11);
                        var20 = var12;
                        statePc = 46;
                        continue stateLoop;
                    } catch (Throwable stateCaught_45) {
                        caughtException = stateCaught_45;
                        statePc = 83;
                        continue stateLoop;
                    }
                }
                case 46: {
                    try {
                        if (var20 >= var13) {
                            statePc = 50;
                        } else {
                            statePc = 47;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_46) {
                        caughtException = stateCaught_46;
                        statePc = 83;
                        continue stateLoop;
                    }
                }
                case 47: {
                    try {
                        param2[7].g(var20, var15);
                        var20 = var20 + param2[7].field_z;
                        if (var22 != 0) {
                            statePc = 51;
                        } else {
                            statePc = 48;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_47) {
                        caughtException = stateCaught_47;
                        statePc = 83;
                        continue stateLoop;
                    }
                }
                case 48: {
                    try {
                        if (var22 == 0) {
                            statePc = 46;
                        } else {
                            statePc = 49;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_48) {
                        caughtException = stateCaught_48;
                        statePc = 83;
                        continue stateLoop;
                    }
                }
                case 49: {
                    try {
                        statePc = 50;
                        continue stateLoop;
                    } catch (Throwable stateCaught_49) {
                        caughtException = stateCaught_49;
                        statePc = 83;
                        continue stateLoop;
                    }
                }
                case 50: {
                    try {
                        oo.b(qa.field_f);
                        statePc = 51;
                        continue stateLoop;
                    } catch (Throwable stateCaught_50) {
                        caughtException = stateCaught_50;
                        statePc = 83;
                        continue stateLoop;
                    }
                }
                case 51: {
                    try {
                        if (null == param2[3]) {
                            statePc = 59;
                        } else {
                            statePc = 52;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_51) {
                        caughtException = stateCaught_51;
                        statePc = 83;
                        continue stateLoop;
                    }
                }
                case 52: {
                    try {
                        if (-1 == (param2[3].field_u ^ -1)) {
                            statePc = 59;
                        } else {
                            statePc = 53;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_52) {
                        caughtException = stateCaught_52;
                        statePc = 83;
                        continue stateLoop;
                    }
                }
                case 53: {
                    try {
                        oo.e(param3, var18, var16, var19);
                        var20 = var14;
                        statePc = 54;
                        continue stateLoop;
                    } catch (Throwable stateCaught_53) {
                        caughtException = stateCaught_53;
                        statePc = 83;
                        continue stateLoop;
                    }
                }
                case 54: {
                    try {
                        if (var20 >= var15) {
                            statePc = 58;
                        } else {
                            statePc = 55;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_54) {
                        caughtException = stateCaught_54;
                        statePc = 83;
                        continue stateLoop;
                    }
                }
                case 55: {
                    try {
                        param2[3].g(param3, var20);
                        var20 = var20 + param2[3].field_u;
                        if (var22 != 0) {
                            statePc = 59;
                        } else {
                            statePc = 56;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_55) {
                        caughtException = stateCaught_55;
                        statePc = 83;
                        continue stateLoop;
                    }
                }
                case 56: {
                    try {
                        if (var22 == 0) {
                            statePc = 54;
                        } else {
                            statePc = 57;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_56) {
                        caughtException = stateCaught_56;
                        statePc = 83;
                        continue stateLoop;
                    }
                }
                case 57: {
                    try {
                        statePc = 58;
                        continue stateLoop;
                    } catch (Throwable stateCaught_57) {
                        caughtException = stateCaught_57;
                        statePc = 83;
                        continue stateLoop;
                    }
                }
                case 58: {
                    try {
                        oo.b(qa.field_f);
                        statePc = 59;
                        continue stateLoop;
                    } catch (Throwable stateCaught_58) {
                        caughtException = stateCaught_58;
                        statePc = 83;
                        continue stateLoop;
                    }
                }
                case 59: {
                    try {
                        if (param2[5] == null) {
                            statePc = 67;
                        } else {
                            statePc = 60;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_59) {
                        caughtException = stateCaught_59;
                        statePc = 83;
                        continue stateLoop;
                    }
                }
                case 60: {
                    try {
                        if ((param2[5].field_u ^ -1) == -1) {
                            statePc = 67;
                        } else {
                            statePc = 61;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_60) {
                        caughtException = stateCaught_60;
                        statePc = 83;
                        continue stateLoop;
                    }
                }
                case 61: {
                    try {
                        oo.e(var17, var18, var10, var19);
                        var20 = var14;
                        statePc = 62;
                        continue stateLoop;
                    } catch (Throwable stateCaught_61) {
                        caughtException = stateCaught_61;
                        statePc = 83;
                        continue stateLoop;
                    }
                }
                case 62: {
                    try {
                        if ((var20 ^ -1) <= (var15 ^ -1)) {
                            statePc = 66;
                        } else {
                            statePc = 63;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_62) {
                        caughtException = stateCaught_62;
                        statePc = 83;
                        continue stateLoop;
                    }
                }
                case 63: {
                    try {
                        param2[5].g(var13, var20);
                        var20 = var20 + param2[5].field_u;
                        if (var22 != 0) {
                            statePc = 67;
                        } else {
                            statePc = 64;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_63) {
                        caughtException = stateCaught_63;
                        statePc = 83;
                        continue stateLoop;
                    }
                }
                case 64: {
                    try {
                        if (var22 == 0) {
                            statePc = 62;
                        } else {
                            statePc = 65;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_64) {
                        caughtException = stateCaught_64;
                        statePc = 83;
                        continue stateLoop;
                    }
                }
                case 65: {
                    try {
                        statePc = 66;
                        continue stateLoop;
                    } catch (Throwable stateCaught_65) {
                        caughtException = stateCaught_65;
                        statePc = 83;
                        continue stateLoop;
                    }
                }
                case 66: {
                    try {
                        oo.b(qa.field_f);
                        statePc = 67;
                        continue stateLoop;
                    } catch (Throwable stateCaught_66) {
                        caughtException = stateCaught_66;
                        statePc = 83;
                        continue stateLoop;
                    }
                }
                case 67: {
                    try {
                        if (null == param2[4]) {
                            statePc = 87;
                        } else {
                            statePc = 68;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_67) {
                        caughtException = stateCaught_67;
                        statePc = 83;
                        continue stateLoop;
                    }
                }
                case 68: {
                    try {
                        if (param2[4].field_z == 0) {
                            statePc = 87;
                        } else {
                            statePc = 69;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_68) {
                        caughtException = stateCaught_68;
                        statePc = 83;
                        continue stateLoop;
                    }
                }
                case 69: {
                    try {
                        if (param2[4].field_u != 0) {
                            statePc = 71;
                        } else {
                            statePc = 70;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_69) {
                        caughtException = stateCaught_69;
                        statePc = 83;
                        continue stateLoop;
                    }
                }
                case 70: {
                    try {
                        statePc = 87;
                        continue stateLoop;
                    } catch (Throwable stateCaught_70) {
                        caughtException = stateCaught_70;
                        statePc = 83;
                        continue stateLoop;
                    }
                }
                case 71: {
                    try {
                        oo.e(var16, var18, var17, var19);
                        var20 = var14;
                        statePc = 72;
                        continue stateLoop;
                    } catch (Throwable stateCaught_71) {
                        caughtException = stateCaught_71;
                        statePc = 83;
                        continue stateLoop;
                    }
                }
                case 72: {
                    try {
                        if ((var20 ^ -1) <= (var15 ^ -1)) {
                            statePc = 81;
                        } else {
                            statePc = 73;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_72) {
                        caughtException = stateCaught_72;
                        statePc = 83;
                        continue stateLoop;
                    }
                }
                case 73: {
                    try {
                        if (var22 != 0) {
                            statePc = 87;
                        } else {
                            statePc = 74;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_73) {
                        caughtException = stateCaught_73;
                        statePc = 83;
                        continue stateLoop;
                    }
                }
                case 74: {
                    try {
                        var21 = var12;
                        statePc = 75;
                        continue stateLoop;
                    } catch (Throwable stateCaught_74) {
                        caughtException = stateCaught_74;
                        statePc = 83;
                        continue stateLoop;
                    }
                }
                case 75: {
                    try {
                        if (var13 <= var21) {
                            statePc = 79;
                        } else {
                            statePc = 76;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_75) {
                        caughtException = stateCaught_75;
                        statePc = 83;
                        continue stateLoop;
                    }
                }
                case 76: {
                    try {
                        param2[4].g(var21, var20);
                        var21 = var21 + param2[4].field_z;
                        if (var22 != 0) {
                            statePc = 80;
                        } else {
                            statePc = 77;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_76) {
                        caughtException = stateCaught_76;
                        statePc = 83;
                        continue stateLoop;
                    }
                }
                case 77: {
                    try {
                        if (var22 == 0) {
                            statePc = 75;
                        } else {
                            statePc = 78;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_77) {
                        caughtException = stateCaught_77;
                        statePc = 83;
                        continue stateLoop;
                    }
                }
                case 78: {
                    try {
                        statePc = 79;
                        continue stateLoop;
                    } catch (Throwable stateCaught_78) {
                        caughtException = stateCaught_78;
                        statePc = 83;
                        continue stateLoop;
                    }
                }
                case 79: {
                    try {
                        var20 = var20 + param2[4].field_u;
                        statePc = 80;
                        continue stateLoop;
                    } catch (Throwable stateCaught_79) {
                        caughtException = stateCaught_79;
                        statePc = 83;
                        continue stateLoop;
                    }
                }
                case 80: {
                    try {
                        if (var22 == 0) {
                            statePc = 72;
                        } else {
                            statePc = 81;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_80) {
                        caughtException = stateCaught_80;
                        statePc = 83;
                        continue stateLoop;
                    }
                }
                case 81: {
                    try {
                        oo.b(qa.field_f);
                        statePc = 87;
                        continue stateLoop;
                    } catch (Throwable stateCaught_81) {
                        caughtException = stateCaught_81;
                        statePc = 83;
                        continue stateLoop;
                    }
                }
                case 83: {
                    var6 = (RuntimeException) ((Object) caughtException);
                    stackIn_85_0 = (RuntimeException) (var6);
                    stackIn_84_0 = stackIn_85_0;
                    stackIn_85_1 = new StringBuilder().append("s.A(").append(param0).append(',').append(param1).append(',');
                    stackIn_84_1 = stackIn_85_1;
                    if (param2 == null) {
                        statePc = 85;
                    } else {
                        statePc = 84;
                    }
                    continue stateLoop;
                }
                case 84: {
                    stackIn_86_0 = (RuntimeException) ((Object) stackIn_84_0);
                    stackIn_86_1 = (StringBuilder) ((Object) stackIn_84_1);
                    stackIn_86_2 = "{...}";
                    statePc = 86;
                    continue stateLoop;
                }
                case 85: {
                    stackIn_86_0 = (RuntimeException) ((Object) stackIn_85_0);
                    stackIn_86_1 = (StringBuilder) ((Object) stackIn_85_1);
                    stackIn_86_2 = "null";
                    statePc = 86;
                    continue stateLoop;
                }
                case 86: {
                    throw fa.a((Throwable) ((Object) stackIn_86_0), stackIn_86_2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
                }
                case 87: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static String a(byte param0) {
        if (!(dj.field_k != id.field_B)) {
            return ch.field_j;
        }
        if (param0 != 32) {
            return (String) null;
        }
        if (!(dj.field_k != ta.field_hb)) {
            return ih.field_a;
        }
        if (!tg.field_g.d(-107)) {
            return ih.field_a;
        }
        return fa.field_Ib;
    }

    final static void a(int param0, byte param1, int param2) {
        int var3;
        L0: {
          L1: {
            if (ka.field_f == null) {
              break L1;
            } else {
              if (ka.field_f.length < param0) {
                break L1;
              } else {
                break L0;
              }
            }
          }
          ka.field_f = new int[param0 * 2];
          break L0;
        }
        L2: {
          L3: {
            if (null == lb.field_c) {
              break L3;
            } else {
              if ((lb.field_c.length ^ -1) > (param0 ^ -1)) {
                break L3;
              } else {
                break L2;
              }
            }
          }
          lb.field_c = new int[2 * param0];
          break L2;
        }
        L4: {
          L5: {
            if (null == vk.field_J) {
              break L5;
            } else {
              if ((param0 ^ -1) >= (vk.field_J.length ^ -1)) {
                break L4;
              } else {
                break L5;
              }
            }
          }
          vk.field_J = new int[2 * param0];
          break L4;
        }
        L6: {
          L7: {
            if (kj.field_p == null) {
              break L7;
            } else {
              if (param0 > kj.field_p.length) {
                break L7;
              } else {
                break L6;
              }
            }
          }
          kj.field_p = new int[param0 * 2];
          break L6;
        }
        L8: {
          L9: {
            if (ie.field_ob == null) {
              break L9;
            } else {
              if (ie.field_ob.length < param0) {
                break L9;
              } else {
                break L8;
              }
            }
          }
          ie.field_ob = new int[param0 * 2];
          break L8;
        }
        L10: {
          L11: {
            if (hn.field_f == null) {
              break L11;
            } else {
              if ((hn.field_f.length ^ -1) > (param0 ^ -1)) {
                break L11;
              } else {
                break L10;
              }
            }
          }
          hn.field_f = new int[param0 * 2];
          break L10;
        }
        L12: {
          L13: {
            if (la.field_c == null) {
              break L13;
            } else {
              if (param0 - -param2 <= la.field_c.length) {
                break L12;
              } else {
                break L13;
              }
            }
          }
          la.field_c = new int[2 * (param2 + param0)];
          break L12;
        }
        L14: {
          L15: {
            if (fc.field_c == null) {
              break L15;
            } else {
              if (fc.field_c.length >= param0) {
                break L14;
              } else {
                break L15;
              }
            }
          }
          fc.field_c = new boolean[param0 * 2];
          break L14;
        }
        lj.field_n = 0;
        ba.field_m = -2147483648;
        up.field_d = -2147483648;
        var3 = -105 / ((param1 - 6) / 47);
        ab.field_j = 2147483647;
        mj.field_Ub = 2147483647;
    }

    static {
        field_b = 0;
        field_g = "Retry (<%0> Left)";
        field_d = "They may be nowhere near your zombies, but you'll still be able to reach them...";
        field_f = 0;
        field_h = "Loading extra data";
    }
}
