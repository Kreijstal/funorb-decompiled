/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class uc {
    static hm field_e;
    static boolean field_a;
    static long field_g;
    static af field_c;
    static int field_d;
    static String field_f;
    static String field_b;

    public static void a(boolean param0) {
        field_e = null;
        if (!param0) {
            return;
        }
        field_b = null;
        field_c = null;
        field_f = null;
    }

    final static void a(boolean param0, boolean param1, int param2) {
        L0: {
          L1: {
            if (param0) {
              break L1;
            } else {
              hk.b();
              if (!client.field_A) {
                break L0;
              } else {
                break L1;
              }
            }
          }
          hk.a(0, 0, hk.field_j, hk.field_i, 0, 192);
          break L0;
        }
        if (param2 <= 39) {
          return;
        } else {
          cg.a(param0, 91);
          return;
        }
    }

    final static void a(int param0, boolean param1, boolean param2, int param3) {
        if (!param1) {
            field_b = (String) null;
        }
        si.a(kf.field_O, param2, nk.field_b, hn.field_a, param0, (byte) -41, param3);
    }

    final static void a(int param0, boolean param1, int param2, int param3, int param4, int param5, ve param6, boolean param7) {
        qd[][] stackIn_3_0 = null;
        qd[][] stackIn_4_0 = null;
        qd[][] stackIn_5_0 = null;
        int stackIn_5_1 = 0;
        int stackIn_10_0 = 0;
        int stackIn_18_0 = 0;
        int stackIn_18_1 = 0;
        int stackIn_23_0 = 0;
        int stackIn_23_1 = 0;
        int stackIn_25_0 = 0;
        int stackIn_27_0 = 0;
        int stackIn_28_0 = 0;
        int stackIn_28_1 = 0;
        int stackIn_29_0 = 0;
        int stackIn_30_0 = 0;
        int stackIn_30_1 = 0;
        int stackIn_31_0 = 0;
        int stackIn_31_1 = 0;
        int stackIn_46_0 = 0;
        int stackIn_55_0 = 0;
        int stackIn_66_0 = 0;
        int stackIn_76_0 = 0;
        int stackIn_78_0 = 0;
        int stackIn_81_0 = 0;
        int stackIn_92_0 = 0;
        int stackIn_98_0 = 0;
        int stackIn_106_0 = 0;
        int stackIn_109_0 = 0;
        RuntimeException stackIn_113_0 = null;
        StringBuilder stackIn_113_1 = null;
        RuntimeException stackIn_114_0 = null;
        StringBuilder stackIn_114_1 = null;
        RuntimeException stackIn_115_0 = null;
        StringBuilder stackIn_115_1 = null;
        String stackIn_115_2 = null;
        int decompiledRegionSelector0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        qd[] var8 = null;
        int var8_int = 0;
        RuntimeException var8_ref = null;
        int var9 = 0;
        int var10_int = 0;
        int[] var10 = null;
        int var11 = 0;
        int var12 = 0;
        qd var13_ref_qd = null;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        qd[] var16 = null;
        int[] var17 = null;
        int[] var18 = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var15 = client.field_A ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (param5 <= param2) {
                            statePc = 74;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 112;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        stackIn_4_0 = qa.field_v;
                        stackIn_3_0 = stackIn_4_0;
                        if (0 != (param2 ^ -1)) {
                            statePc = 4;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 112;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        stackIn_5_0 = (qd[][]) ((Object) stackIn_3_0);
                        stackIn_5_1 = 1;
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 112;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        stackIn_5_0 = (qd[][]) ((Object) stackIn_4_0);
                        stackIn_5_1 = param2 + 4;
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 112;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        var16 = stackIn_5_0[stackIn_5_1];
                        var8 = var16;
                        var9 = 1;
                        if (!param1) {
                            statePc = 24;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 112;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        if (param2 != -1) {
                            statePc = 15;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 112;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        var10_int = 0;
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 112;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        if (b.field_P.length <= var10_int) {
                            statePc = 14;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 112;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        stackIn_25_0 = kk.field_l[var10_int / 8] & 1 << (7 & var10_int);
                        stackIn_10_0 = stackIn_25_0;
                        if (var15 != 0) {
                            statePc = 25;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 112;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        if (stackIn_10_0 == 0) {
                            statePc = 12;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 112;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        var9 = 0;
                        if (var15 == 0) {
                            statePc = 14;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 112;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        var10_int++;
                        if (var15 == 0) {
                            statePc = 8;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 112;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        statePc = 14;
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 112;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        if (var15 == 0) {
                            statePc = 24;
                        } else {
                            statePc = 15;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 112;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        var10_int = 0;
                        statePc = 16;
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 112;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        if (var16.length + -1 <= var10_int) {
                            statePc = 22;
                        } else {
                            statePc = 17;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 112;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        stackIn_23_0 = 0;
                        stackIn_18_0 = stackIn_23_0;
                        stackIn_23_1 = v.field_a[(param3 + var10_int) / 8] & 1 << (7 & param3 + var10_int);
                        stackIn_18_1 = stackIn_23_1;
                        if (var15 != 0) {
                            statePc = 23;
                        } else {
                            statePc = 18;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 112;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        if (stackIn_18_0 == stackIn_18_1) {
                            statePc = 20;
                        } else {
                            statePc = 19;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 112;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        var9 = 0;
                        if (var15 == 0) {
                            statePc = 22;
                        } else {
                            statePc = 20;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 112;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        var10_int++;
                        if (var15 == 0) {
                            statePc = 16;
                        } else {
                            statePc = 21;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 112;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        statePc = 22;
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 112;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        stackIn_23_0 = param3;
                        stackIn_23_1 = 255 & rb.field_k[param2];
                        statePc = 23;
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 112;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        param3 = stackIn_23_0 + stackIn_23_1;
                        statePc = 24;
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 112;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        var10_int = 0;
                        stackIn_25_0 = 0;
                        statePc = 25;
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 112;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        var11 = stackIn_25_0;
                        statePc = 26;
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 112;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        stackIn_29_0 = var11;
                        stackIn_27_0 = stackIn_29_0;
                        if ((param2 ^ -1) != 0) {
                            statePc = 29;
                        } else {
                            statePc = 27;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 112;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        stackIn_30_0 = stackIn_27_0;
                        stackIn_28_0 = stackIn_30_0;
                        stackIn_30_1 = b.field_P.length;
                        stackIn_28_1 = stackIn_30_1;
                        if (var15 != 0) {
                            statePc = 30;
                        } else {
                            statePc = 28;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 112;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        stackIn_31_0 = stackIn_28_0;
                        stackIn_31_1 = stackIn_28_1;
                        statePc = 31;
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 112;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        stackIn_30_0 = stackIn_29_0;
                        stackIn_30_1 = -1;
                        statePc = 30;
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 112;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        stackIn_31_0 = stackIn_30_0;
                        stackIn_31_1 = stackIn_30_1 + var16.length;
                        statePc = 31;
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 112;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        if (stackIn_31_0 >= stackIn_31_1) {
                            statePc = 62;
                        } else {
                            statePc = 32;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 112;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        if (0 != (param2 ^ -1)) {
                            statePc = 34;
                        } else {
                            statePc = 33;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 112;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        param0 = var11;
                        if (var15 == 0) {
                            statePc = 35;
                        } else {
                            statePc = 34;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 112;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        km.field_D[param2] = (byte)var11;
                        statePc = 35;
                        continue stateLoop;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 112;
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        if (0 != (param2 ^ -1)) {
                            statePc = 38;
                        } else {
                            statePc = 36;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 112;
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        if (b.field_P.length != 1) {
                            statePc = 38;
                        } else {
                            statePc = 37;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = 112;
                        continue stateLoop;
                    }
                }
                case 37: {
                    try {
                        var12 = 1;
                        if (var15 == 0) {
                            statePc = 56;
                        } else {
                            statePc = 38;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = 112;
                        continue stateLoop;
                    }
                }
                case 38: {
                    try {
                        var13_ref_qd = var16[1 + var11];
                        if (param1) {
                            statePc = 47;
                        } else {
                            statePc = 39;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = 112;
                        continue stateLoop;
                    }
                }
                case 39: {
                    try {
                        if ((param2 ^ -1) != 0) {
                            statePc = 43;
                        } else {
                            statePc = 40;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_39) {
                        caughtException = stateCaught_39;
                        statePc = 112;
                        continue stateLoop;
                    }
                }
                case 40: {
                    try {
                        if (cd.field_m.field_mc != b.field_P[var11]) {
                            statePc = 42;
                        } else {
                            statePc = 41;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_40) {
                        caughtException = stateCaught_40;
                        statePc = 112;
                        continue stateLoop;
                    }
                }
                case 41: {
                    try {
                        stackIn_46_0 = 1;
                        statePc = 46;
                        continue stateLoop;
                    } catch (Throwable stateCaught_41) {
                        caughtException = stateCaught_41;
                        statePc = 112;
                        continue stateLoop;
                    }
                }
                case 42: {
                    try {
                        stackIn_46_0 = 0;
                        statePc = 46;
                        continue stateLoop;
                    } catch (Throwable stateCaught_42) {
                        caughtException = stateCaught_42;
                        statePc = 112;
                        continue stateLoop;
                    }
                }
                case 43: {
                    try {
                        if (var11 != (255 & cd.field_m.field_kc[param2])) {
                            statePc = 45;
                        } else {
                            statePc = 44;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_43) {
                        caughtException = stateCaught_43;
                        statePc = 112;
                        continue stateLoop;
                    }
                }
                case 44: {
                    try {
                        stackIn_46_0 = 1;
                        statePc = 46;
                        continue stateLoop;
                    } catch (Throwable stateCaught_44) {
                        caughtException = stateCaught_44;
                        statePc = 112;
                        continue stateLoop;
                    }
                }
                case 45: {
                    try {
                        stackIn_46_0 = 0;
                        statePc = 46;
                        continue stateLoop;
                    } catch (Throwable stateCaught_45) {
                        caughtException = stateCaught_45;
                        statePc = 112;
                        continue stateLoop;
                    }
                }
                case 46: {
                    try {
                        var12 = stackIn_46_0;
                        if (var15 == 0) {
                            statePc = 56;
                        } else {
                            statePc = 47;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_46) {
                        caughtException = stateCaught_46;
                        statePc = 112;
                        continue stateLoop;
                    }
                }
                case 47: {
                    try {
                        if (!var13_ref_qd.field_ab) {
                            statePc = 49;
                        } else {
                            statePc = 48;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_47) {
                        caughtException = stateCaught_47;
                        statePc = 112;
                        continue stateLoop;
                    }
                }
                case 48: {
                    try {
                        stackIn_55_0 = 1;
                        statePc = 55;
                        continue stateLoop;
                    } catch (Throwable stateCaught_48) {
                        caughtException = stateCaught_48;
                        statePc = 112;
                        continue stateLoop;
                    }
                }
                case 49: {
                    try {
                        if (var9 != 0) {
                            statePc = 51;
                        } else {
                            statePc = 50;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_49) {
                        caughtException = stateCaught_49;
                        statePc = 112;
                        continue stateLoop;
                    }
                }
                case 50: {
                    try {
                        stackIn_55_0 = 0;
                        statePc = 55;
                        continue stateLoop;
                    } catch (Throwable stateCaught_50) {
                        caughtException = stateCaught_50;
                        statePc = 112;
                        continue stateLoop;
                    }
                }
                case 51: {
                    try {
                        if (var13_ref_qd.field_Hb) {
                            statePc = 53;
                        } else {
                            statePc = 52;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_51) {
                        caughtException = stateCaught_51;
                        statePc = 112;
                        continue stateLoop;
                    }
                }
                case 52: {
                    try {
                        stackIn_55_0 = 0;
                        statePc = 55;
                        continue stateLoop;
                    } catch (Throwable stateCaught_52) {
                        caughtException = stateCaught_52;
                        statePc = 112;
                        continue stateLoop;
                    }
                }
                case 53: {
                    try {
                        stackIn_55_0 = 1;
                        statePc = 55;
                        continue stateLoop;
                    } catch (Throwable stateCaught_53) {
                        caughtException = stateCaught_53;
                        statePc = 112;
                        continue stateLoop;
                    }
                }
                case 55: {
                    try {
                        var12 = stackIn_55_0;
                        statePc = 56;
                        continue stateLoop;
                    } catch (Throwable stateCaught_55) {
                        caughtException = stateCaught_55;
                        statePc = 112;
                        continue stateLoop;
                    }
                }
                case 56: {
                    try {
                        if (var12 != 0) {
                            statePc = 58;
                        } else {
                            statePc = 57;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_56) {
                        caughtException = stateCaught_56;
                        statePc = 112;
                        continue stateLoop;
                    }
                }
                case 57: {
                    try {
                        statePc = 59;
                        continue stateLoop;
                    } catch (Throwable stateCaught_57) {
                        caughtException = stateCaught_57;
                        statePc = 112;
                        continue stateLoop;
                    }
                }
                case 58: {
                    try {
                        uc.a(param0, param1, param2 - -1, param3, param4, param5, param6, false);
                        var10_int = 1;
                        statePc = 59;
                        continue stateLoop;
                    } catch (Throwable stateCaught_58) {
                        caughtException = stateCaught_58;
                        statePc = 112;
                        continue stateLoop;
                    }
                }
                case 59: {
                    try {
                        if (!ve.field_ac) {
                            statePc = 61;
                        } else {
                            statePc = 60;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_59) {
                        caughtException = stateCaught_59;
                        statePc = 112;
                        continue stateLoop;
                    }
                }
                case 60: {
                    return;
                }
                case 61: {
                    try {
                        var11++;
                        if (var15 == 0) {
                            statePc = 26;
                        } else {
                            statePc = 62;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_61) {
                        caughtException = stateCaught_61;
                        statePc = 112;
                        continue stateLoop;
                    }
                }
                case 62: {
                    try {
                        if (var10_int != 0) {
                            statePc = 73;
                        } else {
                            statePc = 63;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_62) {
                        caughtException = stateCaught_62;
                        statePc = 112;
                        continue stateLoop;
                    }
                }
                case 63: {
                    try {
                        var11 = 0;
                        statePc = 64;
                        continue stateLoop;
                    } catch (Throwable stateCaught_63) {
                        caughtException = stateCaught_63;
                        statePc = 112;
                        continue stateLoop;
                    }
                }
                case 64: {
                    try {
                        if (var11 >= -1 + var16.length) {
                            statePc = 73;
                        } else {
                            statePc = 65;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_64) {
                        caughtException = stateCaught_64;
                        statePc = 112;
                        continue stateLoop;
                    }
                }
                case 65: {
                    try {
                        stackIn_109_0 = -1;
                        stackIn_66_0 = stackIn_109_0;
                        if (var15 != 0) {
                            statePc = 109;
                        } else {
                            statePc = 66;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_65) {
                        caughtException = stateCaught_65;
                        statePc = 112;
                        continue stateLoop;
                    }
                }
                case 66: {
                    try {
                        if (stackIn_66_0 == param2) {
                            statePc = 69;
                        } else {
                            statePc = 67;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_66) {
                        caughtException = stateCaught_66;
                        statePc = 112;
                        continue stateLoop;
                    }
                }
                case 67: {
                    try {
                        km.field_D[param2] = (byte)var11;
                        if (var15 == 0) {
                            statePc = 70;
                        } else {
                            statePc = 68;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_67) {
                        caughtException = stateCaught_67;
                        statePc = 112;
                        continue stateLoop;
                    }
                }
                case 68: {
                    try {
                        statePc = 69;
                        continue stateLoop;
                    } catch (Throwable stateCaught_68) {
                        caughtException = stateCaught_68;
                        statePc = 112;
                        continue stateLoop;
                    }
                }
                case 69: {
                    try {
                        param0 = var11;
                        statePc = 70;
                        continue stateLoop;
                    } catch (Throwable stateCaught_69) {
                        caughtException = stateCaught_69;
                        statePc = 112;
                        continue stateLoop;
                    }
                }
                case 70: {
                    try {
                        uc.a(param0, param1, 1 + param2, param3, param4, param5, param6, false);
                        if (!ve.field_ac) {
                            statePc = 72;
                        } else {
                            statePc = 71;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_70) {
                        caughtException = stateCaught_70;
                        statePc = 112;
                        continue stateLoop;
                    }
                }
                case 71: {
                    return;
                }
                case 72: {
                    try {
                        var11++;
                        if (var15 == 0) {
                            statePc = 64;
                        } else {
                            statePc = 73;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_72) {
                        caughtException = stateCaught_72;
                        statePc = 112;
                        continue stateLoop;
                    }
                }
                case 73: {
                    try {
                        if (var15 == 0) {
                            statePc = 108;
                        } else {
                            statePc = 74;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_73) {
                        caughtException = stateCaught_73;
                        statePc = 112;
                        continue stateLoop;
                    }
                }
                case 74: {
                    try {
                        var8_int = 1;
                        var9 = 0;
                        statePc = 75;
                        continue stateLoop;
                    } catch (Throwable stateCaught_74) {
                        caughtException = stateCaught_74;
                        statePc = 112;
                        continue stateLoop;
                    }
                }
                case 75: {
                    try {
                        stackIn_76_0 = bc.field_D.length;
                        statePc = 76;
                        continue stateLoop;
                    } catch (Throwable stateCaught_75) {
                        caughtException = stateCaught_75;
                        statePc = 112;
                        continue stateLoop;
                    }
                }
                case 76: {
                    try {
                        if (stackIn_76_0 <= var9) {
                            statePc = 105;
                        } else {
                            statePc = 77;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_76) {
                        caughtException = stateCaught_76;
                        statePc = 112;
                        continue stateLoop;
                    }
                }
                case 77: {
                    try {
                        var18 = bc.field_D[var9];
                        var17 = var18;
                        var10 = var17;
                        var11 = 0;
                        stackIn_106_0 = 0;
                        stackIn_78_0 = stackIn_106_0;
                        if (var15 != 0) {
                            statePc = 106;
                        } else {
                            statePc = 78;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_77) {
                        caughtException = stateCaught_77;
                        statePc = 112;
                        continue stateLoop;
                    }
                }
                case 78: {
                    try {
                        var12 = stackIn_78_0;
                        statePc = 79;
                        continue stateLoop;
                    } catch (Throwable stateCaught_78) {
                        caughtException = stateCaught_78;
                        statePc = 112;
                        continue stateLoop;
                    }
                }
                case 79: {
                    try {
                        if (var12 >= var18.length) {
                            statePc = 91;
                        } else {
                            statePc = 80;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_79) {
                        caughtException = stateCaught_79;
                        statePc = 112;
                        continue stateLoop;
                    }
                }
                case 80: {
                    try {
                        var13 = var18[var12];
                        var14 = var10[1 + var12];
                        stackIn_92_0 = var13 ^ -1;
                        stackIn_81_0 = stackIn_92_0;
                        if (var15 != 0) {
                            statePc = 92;
                        } else {
                            statePc = 81;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_80) {
                        caughtException = stateCaught_80;
                        statePc = 112;
                        continue stateLoop;
                    }
                }
                case 81: {
                    try {
                        if (stackIn_81_0 == 0) {
                            statePc = 88;
                        } else {
                            statePc = 82;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_81) {
                        caughtException = stateCaught_81;
                        statePc = 112;
                        continue stateLoop;
                    }
                }
                case 82: {
                    try {
                        if (param2 != var13) {
                            statePc = 85;
                        } else {
                            statePc = 83;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_82) {
                        caughtException = stateCaught_82;
                        statePc = 112;
                        continue stateLoop;
                    }
                }
                case 83: {
                    try {
                        if (param4 != var14) {
                            statePc = 85;
                        } else {
                            statePc = 84;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_83) {
                        caughtException = stateCaught_83;
                        statePc = 112;
                        continue stateLoop;
                    }
                }
                case 84: {
                    try {
                        var11 = 1;
                        if (var15 == 0) {
                            statePc = 89;
                        } else {
                            statePc = 85;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_84) {
                        caughtException = stateCaught_84;
                        statePc = 112;
                        continue stateLoop;
                    }
                }
                case 85: {
                    try {
                        if (param2 <= var13) {
                            statePc = 104;
                        } else {
                            statePc = 86;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_85) {
                        caughtException = stateCaught_85;
                        statePc = 112;
                        continue stateLoop;
                    }
                }
                case 86: {
                    try {
                        if ((km.field_D[var13] & 255) != var14) {
                            statePc = 104;
                        } else {
                            statePc = 87;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_86) {
                        caughtException = stateCaught_86;
                        statePc = 112;
                        continue stateLoop;
                    }
                }
                case 87: {
                    try {
                        statePc = 89;
                        continue stateLoop;
                    } catch (Throwable stateCaught_87) {
                        caughtException = stateCaught_87;
                        statePc = 112;
                        continue stateLoop;
                    }
                }
                case 88: {
                    try {
                        if (b.field_P[param0] != var14) {
                            statePc = 104;
                        } else {
                            statePc = 89;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_88) {
                        caughtException = stateCaught_88;
                        statePc = 112;
                        continue stateLoop;
                    }
                }
                case 89: {
                    try {
                        var12 += 2;
                        if (var15 == 0) {
                            statePc = 79;
                        } else {
                            statePc = 90;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_89) {
                        caughtException = stateCaught_89;
                        statePc = 112;
                        continue stateLoop;
                    }
                }
                case 90: {
                    try {
                        statePc = 91;
                        continue stateLoop;
                    } catch (Throwable stateCaught_90) {
                        caughtException = stateCaught_90;
                        statePc = 112;
                        continue stateLoop;
                    }
                }
                case 91: {
                    try {
                        stackIn_92_0 = var11;
                        statePc = 92;
                        continue stateLoop;
                    } catch (Throwable stateCaught_91) {
                        caughtException = stateCaught_91;
                        statePc = 112;
                        continue stateLoop;
                    }
                }
                case 92: {
                    try {
                        if (stackIn_92_0 != 0) {
                            statePc = 95;
                        } else {
                            statePc = 93;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_92) {
                        caughtException = stateCaught_92;
                        statePc = 112;
                        continue stateLoop;
                    }
                }
                case 93: {
                    try {
                        if (param2 != j.field_b) {
                            statePc = 104;
                        } else {
                            statePc = 94;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_93) {
                        caughtException = stateCaught_93;
                        statePc = 112;
                        continue stateLoop;
                    }
                }
                case 94: {
                    try {
                        statePc = 95;
                        continue stateLoop;
                    } catch (Throwable stateCaught_94) {
                        caughtException = stateCaught_94;
                        statePc = 112;
                        continue stateLoop;
                    }
                }
                case 95: {
                    try {
                        var8_int = 0;
                        var12 = 0;
                        statePc = 96;
                        continue stateLoop;
                    } catch (Throwable stateCaught_95) {
                        caughtException = stateCaught_95;
                        statePc = 112;
                        continue stateLoop;
                    }
                }
                case 96: {
                    try {
                        if (var12 >= var18.length) {
                            statePc = 104;
                        } else {
                            statePc = 97;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_96) {
                        caughtException = stateCaught_96;
                        statePc = 112;
                        continue stateLoop;
                    }
                }
                case 97: {
                    try {
                        var13 = var18[var12];
                        stackIn_76_0 = var13 ^ -1;
                        stackIn_98_0 = stackIn_76_0;
                        if (var15 != 0) {
                            statePc = 76;
                        } else {
                            statePc = 98;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_97) {
                        caughtException = stateCaught_97;
                        statePc = 112;
                        continue stateLoop;
                    }
                }
                case 98: {
                    try {
                        if (stackIn_98_0 == 0) {
                            statePc = 102;
                        } else {
                            statePc = 99;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_98) {
                        caughtException = stateCaught_98;
                        statePc = 112;
                        continue stateLoop;
                    }
                }
                case 99: {
                    try {
                        if (var13 >= param2) {
                            statePc = 103;
                        } else {
                            statePc = 100;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_99) {
                        caughtException = stateCaught_99;
                        statePc = 112;
                        continue stateLoop;
                    }
                }
                case 100: {
                    try {
                        rd.field_c[var13] = true;
                        if (var15 == 0) {
                            statePc = 103;
                        } else {
                            statePc = 101;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_100) {
                        caughtException = stateCaught_100;
                        statePc = 112;
                        continue stateLoop;
                    }
                }
                case 101: {
                    try {
                        statePc = 102;
                        continue stateLoop;
                    } catch (Throwable stateCaught_101) {
                        caughtException = stateCaught_101;
                        statePc = 112;
                        continue stateLoop;
                    }
                }
                case 102: {
                    try {
                        gd.field_b = true;
                        statePc = 103;
                        continue stateLoop;
                    } catch (Throwable stateCaught_102) {
                        caughtException = stateCaught_102;
                        statePc = 112;
                        continue stateLoop;
                    }
                }
                case 103: {
                    try {
                        var12 += 2;
                        if (var15 == 0) {
                            statePc = 96;
                        } else {
                            statePc = 104;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_103) {
                        caughtException = stateCaught_103;
                        statePc = 112;
                        continue stateLoop;
                    }
                }
                case 104: {
                    try {
                        var9++;
                        if (var15 == 0) {
                            statePc = 75;
                        } else {
                            statePc = 105;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_104) {
                        caughtException = stateCaught_104;
                        statePc = 112;
                        continue stateLoop;
                    }
                }
                case 105: {
                    try {
                        stackIn_106_0 = var8_int;
                        statePc = 106;
                        continue stateLoop;
                    } catch (Throwable stateCaught_105) {
                        caughtException = stateCaught_105;
                        statePc = 112;
                        continue stateLoop;
                    }
                }
                case 106: {
                    try {
                        if (stackIn_106_0 == 0) {
                            statePc = 108;
                        } else {
                            statePc = 107;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_106) {
                        caughtException = stateCaught_106;
                        statePc = 112;
                        continue stateLoop;
                    }
                }
                case 107: {
                    try {
                        ve.field_ac = true;
                        statePc = 108;
                        continue stateLoop;
                    } catch (Throwable stateCaught_107) {
                        caughtException = stateCaught_107;
                        statePc = 112;
                        continue stateLoop;
                    }
                }
                case 108: {
                    try {
                        stackIn_109_0 = param7 ? 1 : 0;
                        statePc = 109;
                        continue stateLoop;
                    } catch (Throwable stateCaught_108) {
                        caughtException = stateCaught_108;
                        statePc = 112;
                        continue stateLoop;
                    }
                }
                case 109: {
                    try {
                        if (stackIn_109_0 == 0) {
                            statePc = 116;
                        } else {
                            statePc = 110;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_109) {
                        caughtException = stateCaught_109;
                        statePc = 112;
                        continue stateLoop;
                    }
                }
                case 110: {
                    try {
                        field_b = (String) null;
                        statePc = 116;
                        continue stateLoop;
                    } catch (Throwable stateCaught_110) {
                        caughtException = stateCaught_110;
                        statePc = 112;
                        continue stateLoop;
                    }
                }
                case 112: {
                    var8_ref = (RuntimeException) ((Object) caughtException);
                    stackIn_114_0 = (RuntimeException) (var8_ref);
                    stackIn_113_0 = stackIn_114_0;
                    stackIn_114_1 = new StringBuilder().append("uc.A(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',');
                    stackIn_113_1 = stackIn_114_1;
                    if (param6 == null) {
                        statePc = 114;
                    } else {
                        statePc = 113;
                    }
                    continue stateLoop;
                }
                case 113: {
                    stackIn_115_0 = (RuntimeException) ((Object) stackIn_113_0);
                    stackIn_115_1 = (StringBuilder) ((Object) stackIn_113_1);
                    stackIn_115_2 = "{...}";
                    statePc = 115;
                    continue stateLoop;
                }
                case 114: {
                    stackIn_115_0 = (RuntimeException) ((Object) stackIn_114_0);
                    stackIn_115_1 = (StringBuilder) ((Object) stackIn_114_1);
                    stackIn_115_2 = "null";
                    statePc = 115;
                    continue stateLoop;
                }
                case 115: {
                    throw dh.a((Throwable) ((Object) stackIn_115_0), stackIn_115_2 + ',' + param7 + ')');
                }
                case 116: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    static {
        field_a = true;
        field_c = new af();
        field_f = "Accept";
        field_b = "Lobby";
    }
}
