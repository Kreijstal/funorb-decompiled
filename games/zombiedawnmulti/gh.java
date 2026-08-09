/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gh {
    static String[] field_f;
    boolean field_e;
    boolean field_d;
    static int field_a;
    int field_c;
    static boolean field_g;
    String[] field_b;
    String field_h;

    final static boolean a(int param0) {
        int stackIn_7_0 = 0;
        if (param0 >= 48) {
          L0: {
            L1: {
              if (10 > a.field_b) {
                break L1;
              } else {
                if (og.field_N) {
                  break L1;
                } else {
                  if (vo.e(1)) {
                    break L1;
                  } else {
                    stackIn_7_0 = 1;
                    break L0;
                  }
                }
              }
            }
            stackIn_7_0 = 0;
            break L0;
          }
          return stackIn_7_0 != 0;
        } else {
          return true;
        }
    }

    final static void a(md param0, int param1, byte param2, int param3, int param4, int param5, int param6, int param7) {
        int stackIn_12_0 = 0;
        int stackIn_12_1 = 0;
        int stackIn_20_0 = 0;
        int[] stackIn_21_0 = null;
        int[] stackIn_22_0 = null;
        int[] stackIn_23_0 = null;
        int stackIn_23_1 = 0;
        int stackIn_26_0 = 0;
        int stackIn_26_1 = 0;
        int stackIn_31_0 = 0;
        int stackIn_34_0 = 0;
        int stackIn_37_0 = 0;
        af stackIn_44_0 = null;
        int stackIn_50_0 = 0;
        int stackIn_54_0 = 0;
        RuntimeException stackIn_58_0 = null;
        StringBuilder stackIn_58_1 = null;
        RuntimeException stackIn_59_0 = null;
        StringBuilder stackIn_59_1 = null;
        RuntimeException stackIn_60_0 = null;
        StringBuilder stackIn_60_1 = null;
        String stackIn_60_2 = null;
        int statePc = 0;
        Throwable caughtException = null;
        int[] var8 = null;
        RuntimeException var8_ref = null;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        af var21 = null;
        int var22 = 0;
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        int var26 = 0;
        int var27 = 0;
        int var28 = 0;
        int var29 = 0;
        int var30 = 0;
        int var31 = 0;
        int var32 = 0;
        int var33 = 0;
        int var34 = 0;
        int var35 = 0;
        int var36 = 0;
        int var37 = 0;
        int var38 = 0;
        int var39 = 0;
        int var40 = 0;
        int[] var41 = null;
        md var44 = null;
        int[] var49 = null;
        int[] var54 = null;
        byte[] var60 = null;
        int[] var61 = null;
        int[] var62 = null;
        int[] var63 = null;
        int[] var64 = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var40 = ZombieDawnMulti.field_E ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var44 = param0;
                        if (var44.field_z == null) {
                            statePc = 4;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        if ((var44.field_m ^ -1) < -2) {
                            statePc = 6;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        pn.b(8);
                        if (var40 == 0) {
                            statePc = 7;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        var60 = var44.field_z;
                        si.a(0, 255, var60, nn.field_c, 0);
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        if (param2 >= 44) {
                            statePc = 9;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        gh.a(-93);
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        var54 = new int[param0.field_o];
                        var49 = var54;
                        var41 = var49;
                        var8 = var41;
                        var64 = new int[param0.field_o];
                        var62 = eb.field_J;
                        var61 = bq.field_g;
                        var63 = wp.field_i;
                        var13 = 0;
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        if (param0.field_o <= var13) {
                            statePc = 24;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        var14 = var61[var13] * param7 + (var62[var13] * param1 + var63[var13] * param5) >> -1096849464;
                        stackIn_26_0 = 0;
                        stackIn_12_0 = stackIn_26_0;
                        stackIn_26_1 = var14;
                        stackIn_12_1 = stackIn_26_1;
                        if (var40 != 0) {
                            statePc = 26;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        if (stackIn_12_0 > stackIn_12_1) {
                            statePc = 14;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        statePc = 15;
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        var14 = -var14;
                        statePc = 15;
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        if ((var14 ^ -1) <= -1) {
                            statePc = 17;
                        } else {
                            statePc = 16;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        stackIn_20_0 = 128;
                        statePc = 20;
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        if (var14 >= 128) {
                            statePc = 19;
                        } else {
                            statePc = 18;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        stackIn_20_0 = 128 - -var14;
                        statePc = 20;
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        stackIn_20_0 = 256;
                        statePc = 20;
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        var14 = stackIn_20_0;
                        var15 = var61[var13] * param6 + (var62[var13] * param3 + param4 * var63[var13]) >> -1215445816;
                        stackIn_22_0 = na.field_K;
                        stackIn_21_0 = stackIn_22_0;
                        if (-1 >= (var15 ^ -1)) {
                            statePc = 22;
                        } else {
                            statePc = 21;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        stackIn_23_0 = (int[]) ((Object) stackIn_21_0);
                        stackIn_23_1 = -var15;
                        statePc = 23;
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        stackIn_23_0 = (int[]) ((Object) stackIn_22_0);
                        stackIn_23_1 = var15;
                        statePc = 23;
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        var15 = stackIn_23_0[stackIn_23_1];
                        var14 = var14 * (256 - var15) >>> 373347976;
                        var54[var13] = var14;
                        var64[var13] = var15;
                        var13++;
                        if (var40 == 0) {
                            statePc = 10;
                        } else {
                            statePc = 24;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        var13 = 0;
                        statePc = 25;
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        stackIn_26_0 = tf.field_Eb ^ -1;
                        stackIn_26_1 = var13 ^ -1;
                        statePc = 26;
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        if (stackIn_26_0 >= stackIn_26_1) {
                            statePc = 61;
                        } else {
                            statePc = 27;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        var14 = ah.field_f[var13];
                        var15 = param0.field_y[var14];
                        var16 = param0.field_L[var14];
                        var17 = param0.field_H[var14];
                        if (var40 != 0) {
                            statePc = 61;
                        } else {
                            statePc = 28;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        if (param0.field_F[var14] < eb.field_J.length) {
                            statePc = 30;
                        } else {
                            statePc = 29;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        stackIn_31_0 = -1;
                        statePc = 31;
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        stackIn_31_0 = param0.field_F[var14];
                        statePc = 31;
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        var18 = stackIn_31_0;
                        if (param0.field_K[var14] >= eb.field_J.length) {
                            statePc = 33;
                        } else {
                            statePc = 32;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        stackIn_34_0 = param0.field_K[var14];
                        statePc = 34;
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        stackIn_34_0 = -1;
                        statePc = 34;
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        var19 = stackIn_34_0;
                        if ((eb.field_J.length ^ -1) < (param0.field_x[var14] ^ -1)) {
                            statePc = 36;
                        } else {
                            statePc = 35;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        stackIn_37_0 = -1;
                        statePc = 37;
                        continue stateLoop;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        stackIn_37_0 = param0.field_x[var14];
                        statePc = 37;
                        continue stateLoop;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 37: {
                    try {
                        var20 = stackIn_37_0;
                        if (qh.field_f == null) {
                            statePc = 43;
                        } else {
                            statePc = 38;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 38: {
                    try {
                        if (null == param0.field_c) {
                            statePc = 43;
                        } else {
                            statePc = 39;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 39: {
                    try {
                        if (param0.field_c.length <= var14) {
                            statePc = 43;
                        } else {
                            statePc = 40;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_39) {
                        caughtException = stateCaught_39;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 40: {
                    try {
                        if ((param0.field_c[var14] ^ -1) == 0) {
                            statePc = 43;
                        } else {
                            statePc = 41;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_40) {
                        caughtException = stateCaught_40;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 41: {
                    try {
                        if (param0.field_c[var14] >= qh.field_f.length) {
                            statePc = 43;
                        } else {
                            statePc = 42;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_41) {
                        caughtException = stateCaught_41;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 42: {
                    try {
                        stackIn_44_0 = qh.field_f[param0.field_c[var14]];
                        statePc = 44;
                        continue stateLoop;
                    } catch (Throwable stateCaught_42) {
                        caughtException = stateCaught_42;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 43: {
                    try {
                        stackIn_44_0 = null;
                        statePc = 44;
                        continue stateLoop;
                    } catch (Throwable stateCaught_43) {
                        caughtException = stateCaught_43;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 44: {
                    try {
                        var21 = stackIn_44_0;
                        var22 = lo.field_j[var15];
                        var23 = jk.field_k[var15];
                        var24 = lo.field_j[var16];
                        var25 = jk.field_k[var16];
                        var26 = lo.field_j[var17];
                        var27 = jk.field_k[var17];
                        if (var18 != var19) {
                            statePc = 47;
                        } else {
                            statePc = 45;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_44) {
                        caughtException = stateCaught_44;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 45: {
                    try {
                        if (var19 == var20) {
                            statePc = 51;
                        } else {
                            statePc = 46;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_45) {
                        caughtException = stateCaught_45;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 46: {
                    try {
                        statePc = 47;
                        continue stateLoop;
                    } catch (Throwable stateCaught_46) {
                        caughtException = stateCaught_46;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 47: {
                    try {
                        var28 = var54[var18];
                        var29 = var54[var19];
                        var30 = var54[var20];
                        var31 = var64[var18];
                        var32 = var64[var19];
                        var33 = var64[var20];
                        if (var21 == null) {
                            statePc = 49;
                        } else {
                            statePc = 48;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_47) {
                        caughtException = stateCaught_47;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 48: {
                    try {
                        stackIn_50_0 = var21.field_f;
                        statePc = 50;
                        continue stateLoop;
                    } catch (Throwable stateCaught_48) {
                        caughtException = stateCaught_48;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 49: {
                    try {
                        stackIn_50_0 = 8355711;
                        statePc = 50;
                        continue stateLoop;
                    } catch (Throwable stateCaught_49) {
                        caughtException = stateCaught_49;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 50: {
                    try {
                        var34 = stackIn_50_0;
                        var35 = 16711935 & var34;
                        var36 = var34 & 65280;
                        var37 = (16711726 & var36 * var28) >>> 176816968 | -1962999553 & var35 * var28 >>> -1471903512;
                        var38 = 1258225919 & var35 * var29 >>> -718166392 | (16711826 & var36 * var29) >>> -578303544;
                        var37 = var37 + var31 * 65793;
                        var39 = (16711695 & var36 * var30) >>> -1948119384 | -1140915969 & var30 * var35 >>> -1606232920;
                        var38 = var38 + var32 * 65793;
                        var39 = var39 + var33 * 65793;
                        qe.a(var39 >> -1405369648, 255 & var37, var37 >> -1084372752, var37 >> 1010900008 & 255, 255 & var39, var27, 255 & var38, var26, var23, (var39 & 65366) >> -288412440, (65470 & var38) >> -85342808, var38 >> -292496848, var25, var24, var22, 121);
                        if (var40 == 0) {
                            statePc = 55;
                        } else {
                            statePc = 51;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_50) {
                        caughtException = stateCaught_50;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 51: {
                    try {
                        var28 = var54[var18];
                        var29 = var64[var18];
                        if (var21 == null) {
                            statePc = 53;
                        } else {
                            statePc = 52;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_51) {
                        caughtException = stateCaught_51;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 52: {
                    try {
                        stackIn_54_0 = var21.field_f;
                        statePc = 54;
                        continue stateLoop;
                    } catch (Throwable stateCaught_52) {
                        caughtException = stateCaught_52;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 53: {
                    try {
                        stackIn_54_0 = 8355711;
                        statePc = 54;
                        continue stateLoop;
                    } catch (Throwable stateCaught_53) {
                        caughtException = stateCaught_53;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 54: {
                    try {
                        var30 = stackIn_54_0;
                        var31 = var30 & 16711935;
                        var32 = var30 & 65280;
                        var33 = (var28 * var31 & -16711894) >>> 1840684584 | (16711900 & var32 * var28) >>> 256767688;
                        var33 = var33 + var29 * 65793;
                        mo.a(var22, 8355711 & var33 >> 1033251745, var23, var24, var25, var26, var27, (byte) 58);
                        statePc = 55;
                        continue stateLoop;
                    } catch (Throwable stateCaught_54) {
                        caughtException = stateCaught_54;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 55: {
                    try {
                        var13++;
                        if (var40 == 0) {
                            statePc = 25;
                        } else {
                            statePc = 61;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_55) {
                        caughtException = stateCaught_55;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 57: {
                    var8_ref = (RuntimeException) ((Object) caughtException);
                    stackIn_59_0 = (RuntimeException) (var8_ref);
                    stackIn_58_0 = stackIn_59_0;
                    stackIn_59_1 = new StringBuilder().append("gh.C(");
                    stackIn_58_1 = stackIn_59_1;
                    if (param0 == null) {
                        statePc = 59;
                    } else {
                        statePc = 58;
                    }
                    continue stateLoop;
                }
                case 58: {
                    stackIn_60_0 = (RuntimeException) ((Object) stackIn_58_0);
                    stackIn_60_1 = (StringBuilder) ((Object) stackIn_58_1);
                    stackIn_60_2 = "{...}";
                    statePc = 60;
                    continue stateLoop;
                }
                case 59: {
                    stackIn_60_0 = (RuntimeException) ((Object) stackIn_59_0);
                    stackIn_60_1 = (StringBuilder) ((Object) stackIn_59_1);
                    stackIn_60_2 = "null";
                    statePc = 60;
                    continue stateLoop;
                }
                case 60: {
                    throw fa.a((Throwable) ((Object) stackIn_60_0), stackIn_60_2 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ')');
                }
                case 61: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static double a(double param0, byte param1) {
        if (param1 <= 4) {
            field_a = -9;
        }
        return ah.field_a[(int)(32768.0 * param0 / 3.141592653589793) & 65535];
    }

    final static boolean a(int param0, int param1) {
        if (param1 != 11653) {
            gh.a(-108, 3);
        }
        return 0 != (w.field_m & 1 << -param0) ? true : false;
    }

    public static void a(byte param0) {
        field_f = null;
        int var1 = 2 / ((param0 - -7) / 59);
    }

    gh(boolean param0) {
        this.field_d = param0 ? true : false;
    }

    static {
    }
}
