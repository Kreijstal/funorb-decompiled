/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ri {
    static ed[] field_c;
    static String field_d;
    static pj field_b;
    static ad field_a;

    final static ai a(ai param0, boolean param1, int[] param2) {
        ai var3 = null;
        RuntimeException var3_ref = null;
        ai stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param1) {
                break L1;
              } else {
                field_a = (ad) null;
                break L1;
              }
            }
            var3 = new ai(0, 0, 0);
            var3.field_d = param0.field_d;
            var3.field_l = param0.field_l;
            var3.field_c = param0.field_c;
            var3.field_i = param0.field_i;
            var3.field_m = param2;
            var3.field_k = param0.field_k;
            var3.field_a = param0.field_a;
            var3.field_n = param0.field_n;
            stackIn_3_0 = (ai) (var3);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3_ref = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var3_ref);

            stackIn_6_1 = new StringBuilder().append("ri.B(");

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
          L3: {


            stackIn_9_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L3;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L3;
            }
          }
          throw la.a((Throwable) ((Object) stackIn_7_0), stackIn_10_2 + ')');
        }
        return stackIn_3_0;
    }

    final static void a(byte param0, int param1, boolean param2) {
        int stackIn_4_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_9_1 = 0;
        int stackIn_14_0 = 0;
        int stackIn_14_1 = 0;
        int stackIn_17_0 = 0;
        int stackIn_17_1 = 0;
        le stackIn_39_0 = null;
        int stackIn_48_0 = 0;
        int stackIn_54_0 = 0;
        int stackIn_54_1 = 0;
        int stackIn_60_0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        float var14_float = 0.0f;
        int var14 = 0;
        le var15_ref_le = null;
        int var15 = 0;
        int var16_int = 0;
        String[] var16 = null;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        vk var20 = null;
        vk var21 = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var19 = MonkeyPuzzle2.field_F ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var20 = pl.field_e;
                        var21 = var20;
                        if (!param2) {
                            statePc = 3;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 95;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        stackIn_4_0 = fg.field_b;
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 95;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        stackIn_4_0 = kg.field_c;
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 95;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        var4 = stackIn_4_0;
                        var5 = -1;
                        var6 = 410;
                        var7 = var21.field_D + var21.field_C + 52;
                        ke.field_f[0].e();
                        ge.d(3, 3, var6 + -6, -6 + var7, 16249775);
                        lb.a(0, var6, (byte) -9, wc.field_e, 0, var7);
                        var8 = 0;
                        if (param2) {
                            statePc = 6;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 95;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 95;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        var9 = 9;
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 95;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        if ((var9 ^ -1) > -1) {
                            statePc = 13;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 95;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        stackIn_14_0 = var4 & 1 << var9 ^ -1;
                        stackIn_9_0 = stackIn_14_0;
                        stackIn_14_1 = -1;
                        stackIn_9_1 = stackIn_14_1;
                        if (var19 != 0) {
                            statePc = 14;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 95;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        if (stackIn_9_0 == stackIn_9_1) {
                            statePc = 11;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 95;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 95;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        var8 += 20;
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 95;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        var9--;
                        if (var19 == 0) {
                            statePc = 7;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 95;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        var9 = -116 + ei.field_a;
                        stackIn_14_0 = p.field_a;
                        stackIn_14_1 = 90;
                        statePc = 14;
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 95;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        var10 = stackIn_14_0 - stackIn_14_1;
                        var11 = 10 + var8;
                        var21.a(pi.field_m, var6 >> 709752257, 56, 1, -1);
                        var12 = 10;
                        var13 = 0;
                        statePc = 15;
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 95;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        if (rb.field_hb.length <= var13) {
                            statePc = 53;
                        } else {
                            statePc = 16;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 95;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        stackIn_54_0 = 0;
                        stackIn_17_0 = stackIn_54_0;
                        stackIn_54_1 = 1 << var13 & var4;
                        stackIn_17_1 = stackIn_54_1;
                        if (var19 != 0) {
                            statePc = 54;
                        } else {
                            statePc = 17;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 95;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        if (stackIn_17_0 == stackIn_17_1) {
                            statePc = 21;
                        } else {
                            statePc = 18;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 95;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        if ((ee.field_F ^ -1) == (var13 ^ -1)) {
                            statePc = 21;
                        } else {
                            statePc = 19;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 95;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        ie.field_b[var13].b(var11, var12);
                        if (var19 == 0) {
                            statePc = 30;
                        } else {
                            statePc = 20;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 95;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        statePc = 21;
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 95;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        if (!param2) {
                            statePc = 24;
                        } else {
                            statePc = 22;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 95;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        if (0 == (var4 & 1 << var13)) {
                            statePc = 27;
                        } else {
                            statePc = 23;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 95;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        statePc = 24;
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 95;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        if ((var13 ^ -1) == (ee.field_F ^ -1)) {
                            statePc = 30;
                        } else {
                            statePc = 25;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 95;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        ka.field_b.b(var11, var12);
                        if (var19 == 0) {
                            statePc = 30;
                        } else {
                            statePc = 26;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 95;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        statePc = 27;
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 95;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        if (ee.field_F == var13) {
                            statePc = 29;
                        } else {
                            statePc = 28;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 95;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        statePc = 52;
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 95;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        ee.field_F = -1;
                        if (var19 == 0) {
                            statePc = 52;
                        } else {
                            statePc = 30;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 95;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        if ((var13 ^ -1) == (ee.field_F ^ -1)) {
                            statePc = 36;
                        } else {
                            statePc = 31;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 95;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        if ((var9 ^ -1) > (var11 ^ -1)) {
                            statePc = 51;
                        } else {
                            statePc = 32;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 95;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        if (var9 > var11 + 32) {
                            statePc = 51;
                        } else {
                            statePc = 33;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 95;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        if (var12 > var10) {
                            statePc = 51;
                        } else {
                            statePc = 34;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 95;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        if (var12 - -32 < var10) {
                            statePc = 51;
                        } else {
                            statePc = 35;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 95;
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        statePc = 36;
                        continue stateLoop;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 95;
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        ge.h(0, 6, var6, var7 + -6);
                        var14_float = ia.a(true, (float)jk.field_B * 0.10000000149011612f);
                        if ((var4 & 1 << var13 ^ -1) == -1) {
                            statePc = 38;
                        } else {
                            statePc = 37;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = 95;
                        continue stateLoop;
                    }
                }
                case 37: {
                    try {
                        stackIn_39_0 = ie.field_b[var13];
                        statePc = 39;
                        continue stateLoop;
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = 95;
                        continue stateLoop;
                    }
                }
                case 38: {
                    try {
                        stackIn_39_0 = ka.field_b;
                        statePc = 39;
                        continue stateLoop;
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = 95;
                        continue stateLoop;
                    }
                }
                case 39: {
                    try {
                        var15_ref_le = stackIn_39_0;
                        var16_int = (int)((float)(var15_ref_le.field_k >> -2088918270) + 6.0f * var14_float + 6.0f);
                        if ((var11 ^ -1) < (var9 ^ -1)) {
                            statePc = 45;
                        } else {
                            statePc = 40;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_39) {
                        caughtException = stateCaught_39;
                        statePc = 95;
                        continue stateLoop;
                    }
                }
                case 40: {
                    try {
                        if ((var11 + 32 ^ -1) > (var9 ^ -1)) {
                            statePc = 45;
                        } else {
                            statePc = 41;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_40) {
                        caughtException = stateCaught_40;
                        statePc = 95;
                        continue stateLoop;
                    }
                }
                case 41: {
                    try {
                        if ((var12 ^ -1) < (var10 ^ -1)) {
                            statePc = 45;
                        } else {
                            statePc = 42;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_41) {
                        caughtException = stateCaught_41;
                        statePc = 95;
                        continue stateLoop;
                    }
                }
                case 42: {
                    try {
                        if ((var12 - -32 ^ -1) <= (var10 ^ -1)) {
                            statePc = 44;
                        } else {
                            statePc = 43;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_42) {
                        caughtException = stateCaught_42;
                        statePc = 95;
                        continue stateLoop;
                    }
                }
                case 43: {
                    try {
                        statePc = 45;
                        continue stateLoop;
                    } catch (Throwable stateCaught_43) {
                        caughtException = stateCaught_43;
                        statePc = 95;
                        continue stateLoop;
                    }
                }
                case 44: {
                    try {
                        var16_int = 38;
                        statePc = 45;
                        continue stateLoop;
                    } catch (Throwable stateCaught_44) {
                        caughtException = stateCaught_44;
                        statePc = 95;
                        continue stateLoop;
                    }
                }
                case 45: {
                    try {
                        if (-1 == (1 & var16_int ^ -1)) {
                            statePc = 47;
                        } else {
                            statePc = 46;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_45) {
                        caughtException = stateCaught_45;
                        statePc = 95;
                        continue stateLoop;
                    }
                }
                case 46: {
                    try {
                        stackIn_48_0 = 0;
                        statePc = 48;
                        continue stateLoop;
                    } catch (Throwable stateCaught_46) {
                        caughtException = stateCaught_46;
                        statePc = 95;
                        continue stateLoop;
                    }
                }
                case 47: {
                    try {
                        stackIn_48_0 = 1;
                        statePc = 48;
                        continue stateLoop;
                    } catch (Throwable stateCaught_47) {
                        caughtException = stateCaught_47;
                        statePc = 95;
                        continue stateLoop;
                    }
                }
                case 48: {
                    try {
                        var17 = stackIn_48_0 + (1 + (var15_ref_le.field_k >> -1150097373) + -(var16_int / 2));
                        var15_ref_le.d(var11 + var17, var17 + var12, var16_int, var16_int);
                        var15_ref_le.b(var17 + var11, var17 + var12, var16_int, var16_int, (int)(40.0f * var14_float) - -40);
                        if ((ee.field_F ^ -1) != (var13 ^ -1)) {
                            statePc = 50;
                        } else {
                            statePc = 49;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_48) {
                        caughtException = stateCaught_48;
                        statePc = 95;
                        continue stateLoop;
                    }
                }
                case 49: {
                    try {
                        statePc = 51;
                        continue stateLoop;
                    } catch (Throwable stateCaught_49) {
                        caughtException = stateCaught_49;
                        statePc = 95;
                        continue stateLoop;
                    }
                }
                case 50: {
                    try {
                        var5 = var13;
                        statePc = 51;
                        continue stateLoop;
                    } catch (Throwable stateCaught_50) {
                        caughtException = stateCaught_50;
                        statePc = 95;
                        continue stateLoop;
                    }
                }
                case 51: {
                    try {
                        var11 += 40;
                        statePc = 52;
                        continue stateLoop;
                    } catch (Throwable stateCaught_51) {
                        caughtException = stateCaught_51;
                        statePc = 95;
                        continue stateLoop;
                    }
                }
                case 52: {
                    try {
                        var13++;
                        if (var19 == 0) {
                            statePc = 15;
                        } else {
                            statePc = 53;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_52) {
                        caughtException = stateCaught_52;
                        statePc = 95;
                        continue stateLoop;
                    }
                }
                case 53: {
                    try {
                        ke.field_f[2].e();
                        ge.d(3, 3, 172, 184, 16249775);
                        lb.a(0, 178, (byte) 112, wc.field_e, 0, 190);
                        ke.field_f[1].e();
                        ge.d(3, 3, 215, 184, 16249775);
                        lb.a(0, 221, (byte) -119, wc.field_e, 0, 190);
                        stackIn_54_0 = -1;
                        stackIn_54_1 = ee.field_F ^ -1;
                        statePc = 54;
                        continue stateLoop;
                    } catch (Throwable stateCaught_53) {
                        caughtException = stateCaught_53;
                        statePc = 95;
                        continue stateLoop;
                    }
                }
                case 54: {
                    try {
                        if (stackIn_54_0 < stackIn_54_1) {
                            statePc = 56;
                        } else {
                            statePc = 55;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_54) {
                        caughtException = stateCaught_54;
                        statePc = 95;
                        continue stateLoop;
                    }
                }
                case 55: {
                    try {
                        var5 = ee.field_F;
                        statePc = 56;
                        continue stateLoop;
                    } catch (Throwable stateCaught_55) {
                        caughtException = stateCaught_55;
                        statePc = 95;
                        continue stateLoop;
                    }
                }
                case 56: {
                    try {
                        if ((var5 ^ -1) > -1) {
                            statePc = 81;
                        } else {
                            statePc = 57;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_56) {
                        caughtException = stateCaught_56;
                        statePc = 95;
                        continue stateLoop;
                    }
                }
                case 57: {
                    try {
                        var13 = var21.field_D + var21.field_C;
                        var14 = 10 + var13;
                        var20.a(rb.field_hb[var5], 110, var14, 1, 6776679);
                        var14 = var14 + var13;
                        if (-1 == (1 << var5 & var4 ^ -1)) {
                            statePc = 59;
                        } else {
                            statePc = 58;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_57) {
                        caughtException = stateCaught_57;
                        statePc = 95;
                        continue stateLoop;
                    }
                }
                case 58: {
                    try {
                        stackIn_60_0 = 1;
                        statePc = 60;
                        continue stateLoop;
                    } catch (Throwable stateCaught_58) {
                        caughtException = stateCaught_58;
                        statePc = 95;
                        continue stateLoop;
                    }
                }
                case 59: {
                    try {
                        stackIn_60_0 = 0;
                        statePc = 60;
                        continue stateLoop;
                    } catch (Throwable stateCaught_59) {
                        caughtException = stateCaught_59;
                        statePc = 95;
                        continue stateLoop;
                    }
                }
                case 60: {
                    try {
                        var15 = stackIn_60_0;
                        if (var15 != 0) {
                            statePc = 63;
                        } else {
                            statePc = 61;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_60) {
                        caughtException = stateCaught_60;
                        statePc = 95;
                        continue stateLoop;
                    }
                }
                case 61: {
                    try {
                        var21.a(uf.field_e, 110, var14, 16711681, 16343907);
                        if (var19 == 0) {
                            statePc = 64;
                        } else {
                            statePc = 62;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_61) {
                        caughtException = stateCaught_61;
                        statePc = 95;
                        continue stateLoop;
                    }
                }
                case 62: {
                    try {
                        statePc = 63;
                        continue stateLoop;
                    } catch (Throwable stateCaught_62) {
                        caughtException = stateCaught_62;
                        statePc = 95;
                        continue stateLoop;
                    }
                }
                case 63: {
                    try {
                        var21.a(vj.field_e, 110, var14, 1, 16343907);
                        statePc = 64;
                        continue stateLoop;
                    } catch (Throwable stateCaught_63) {
                        caughtException = stateCaught_63;
                        statePc = 95;
                        continue stateLoop;
                    }
                }
                case 64: {
                    try {
                        var14 = var14 + var13;
                        var16 = new String[16];
                        var17 = var20.a(ki.field_r[var5], new int[]{191}, var16);
                        var18 = 0;
                        statePc = 65;
                        continue stateLoop;
                    } catch (Throwable stateCaught_64) {
                        caughtException = stateCaught_64;
                        statePc = 95;
                        continue stateLoop;
                    }
                }
                case 65: {
                    try {
                        if ((var18 ^ -1) <= (var17 ^ -1)) {
                            statePc = 69;
                        } else {
                            statePc = 66;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_65) {
                        caughtException = stateCaught_65;
                        statePc = 95;
                        continue stateLoop;
                    }
                }
                case 66: {
                    try {
                        var20.b(var16[var18], 15, var14, 1, -1);
                        var14 = var14 + var13;
                        var18++;
                        if (var19 != 0) {
                            statePc = 70;
                        } else {
                            statePc = 67;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_66) {
                        caughtException = stateCaught_66;
                        statePc = 95;
                        continue stateLoop;
                    }
                }
                case 67: {
                    try {
                        if (var19 == 0) {
                            statePc = 65;
                        } else {
                            statePc = 68;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_67) {
                        caughtException = stateCaught_67;
                        statePc = 95;
                        continue stateLoop;
                    }
                }
                case 68: {
                    try {
                        statePc = 69;
                        continue stateLoop;
                    } catch (Throwable stateCaught_68) {
                        caughtException = stateCaught_68;
                        statePc = 95;
                        continue stateLoop;
                    }
                }
                case 69: {
                    try {
                        var12 = 135;
                        var21.b(a.field_c, 15, var12, 1, -1);
                        var12 = var12 - var13;
                        var21.b(wk.field_c + ve.field_y[var5], 15, var12, 1, -1);
                        statePc = 70;
                        continue stateLoop;
                    } catch (Throwable stateCaught_69) {
                        caughtException = stateCaught_69;
                        statePc = 95;
                        continue stateLoop;
                    }
                }
                case 70: {
                    try {
                        var18 = 0;
                        statePc = 71;
                        continue stateLoop;
                    } catch (Throwable stateCaught_70) {
                        caughtException = stateCaught_70;
                        statePc = 95;
                        continue stateLoop;
                    }
                }
                case 71: {
                    try {
                        if ((f.field_j[var5] ^ -1) >= (var18 ^ -1)) {
                            statePc = 75;
                        } else {
                            statePc = 72;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_71) {
                        caughtException = stateCaught_71;
                        statePc = 95;
                        continue stateLoop;
                    }
                }
                case 72: {
                    try {
                        aj.field_e.b(15 * var18 + 15, 143);
                        var18++;
                        if (var19 != 0) {
                            statePc = 76;
                        } else {
                            statePc = 73;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_72) {
                        caughtException = stateCaught_72;
                        statePc = 95;
                        continue stateLoop;
                    }
                }
                case 73: {
                    try {
                        if (var19 == 0) {
                            statePc = 71;
                        } else {
                            statePc = 74;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_73) {
                        caughtException = stateCaught_73;
                        statePc = 95;
                        continue stateLoop;
                    }
                }
                case 74: {
                    try {
                        statePc = 75;
                        continue stateLoop;
                    } catch (Throwable stateCaught_74) {
                        caughtException = stateCaught_74;
                        statePc = 95;
                        continue stateLoop;
                    }
                }
                case 75: {
                    try {
                        ke.field_f[2].e();
                        statePc = 76;
                        continue stateLoop;
                    } catch (Throwable stateCaught_75) {
                        caughtException = stateCaught_75;
                        statePc = 95;
                        continue stateLoop;
                    }
                }
                case 76: {
                    try {
                        if (var15 == 0) {
                            statePc = 79;
                        } else {
                            statePc = 77;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_76) {
                        caughtException = stateCaught_76;
                        statePc = 95;
                        continue stateLoop;
                    }
                }
                case 77: {
                    try {
                        ie.field_b[var5].c(25, 25);
                        if (var19 == 0) {
                            statePc = 80;
                        } else {
                            statePc = 78;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_77) {
                        caughtException = stateCaught_77;
                        statePc = 95;
                        continue stateLoop;
                    }
                }
                case 78: {
                    try {
                        statePc = 79;
                        continue stateLoop;
                    } catch (Throwable stateCaught_78) {
                        caughtException = stateCaught_78;
                        statePc = 95;
                        continue stateLoop;
                    }
                }
                case 79: {
                    try {
                        ka.field_b.c(25, 25);
                        statePc = 80;
                        continue stateLoop;
                    } catch (Throwable stateCaught_79) {
                        caughtException = stateCaught_79;
                        statePc = 95;
                        continue stateLoop;
                    }
                }
                case 80: {
                    try {
                        if (var19 == 0) {
                            statePc = 83;
                        } else {
                            statePc = 81;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_80) {
                        caughtException = stateCaught_80;
                        statePc = 95;
                        continue stateLoop;
                    }
                }
                case 81: {
                    try {
                        if (!ok.a(false)) {
                            statePc = 83;
                        } else {
                            statePc = 82;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_81) {
                        caughtException = stateCaught_81;
                        statePc = 95;
                        continue stateLoop;
                    }
                }
                case 82: {
                    try {
                        sb.field_r.a(el.field_c, 20, 15, -40 + ke.field_f[1].field_k, ke.field_f[1].field_j - 40, 9330743, -1, 1, 1, 0);
                        statePc = 83;
                        continue stateLoop;
                    } catch (Throwable stateCaught_82) {
                        caughtException = stateCaught_82;
                        statePc = 95;
                        continue stateLoop;
                    }
                }
                case 83: {
                    try {
                        ac.field_a.a((byte) 109);
                        var13 = param1 * var7 / 20;
                        if ((var13 ^ -1) < (var7 ^ -1)) {
                            statePc = 85;
                        } else {
                            statePc = 84;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_83) {
                        caughtException = stateCaught_83;
                        statePc = 95;
                        continue stateLoop;
                    }
                }
                case 84: {
                    try {
                        statePc = 86;
                        continue stateLoop;
                    } catch (Throwable stateCaught_84) {
                        caughtException = stateCaught_84;
                        statePc = 95;
                        continue stateLoop;
                    }
                }
                case 85: {
                    try {
                        var13 = var7;
                        statePc = 86;
                        continue stateLoop;
                    } catch (Throwable stateCaught_85) {
                        caughtException = stateCaught_85;
                        statePc = 95;
                        continue stateLoop;
                    }
                }
                case 86: {
                    try {
                        if (param0 <= -90) {
                            statePc = 88;
                        } else {
                            statePc = 87;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_86) {
                        caughtException = stateCaught_86;
                        statePc = 95;
                        continue stateLoop;
                    }
                }
                case 87: {
                    try {
                        field_d = (String) null;
                        statePc = 88;
                        continue stateLoop;
                    } catch (Throwable stateCaught_87) {
                        caughtException = stateCaught_87;
                        statePc = 95;
                        continue stateLoop;
                    }
                }
                case 88: {
                    try {
                        var14 = var7 + -var13 >> -417426271;
                        ke.field_f[0].b(116, 90 - -var14, var6, var13);
                        var13 = param1 * 190 / 20;
                        if (var13 > 190) {
                            statePc = 90;
                        } else {
                            statePc = 89;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_88) {
                        caughtException = stateCaught_88;
                        statePc = 95;
                        continue stateLoop;
                    }
                }
                case 89: {
                    try {
                        statePc = 91;
                        continue stateLoop;
                    } catch (Throwable stateCaught_89) {
                        caughtException = stateCaught_89;
                        statePc = 95;
                        continue stateLoop;
                    }
                }
                case 90: {
                    try {
                        var13 = 190;
                        statePc = 91;
                        continue stateLoop;
                    } catch (Throwable stateCaught_90) {
                        caughtException = stateCaught_90;
                        statePc = 95;
                        continue stateLoop;
                    }
                }
                case 91: {
                    try {
                        var14 = 190 - var13 >> -301491551;
                        ke.field_f[1].b(116, 170 + var14, 221, var13);
                        var13 = 190 * param1 / 20;
                        if ((var13 ^ -1) >= -191) {
                            statePc = 93;
                        } else {
                            statePc = 92;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_91) {
                        caughtException = stateCaught_91;
                        statePc = 95;
                        continue stateLoop;
                    }
                }
                case 92: {
                    try {
                        var13 = 190;
                        statePc = 93;
                        continue stateLoop;
                    } catch (Throwable stateCaught_92) {
                        caughtException = stateCaught_92;
                        statePc = 95;
                        continue stateLoop;
                    }
                }
                case 93: {
                    try {
                        var14 = 190 + -var13 >> -163751359;
                        ke.field_f[2].b(348, 170 + var14, 178, var13);
                        statePc = 96;
                        continue stateLoop;
                    } catch (Throwable stateCaught_93) {
                        caughtException = stateCaught_93;
                        statePc = 95;
                        continue stateLoop;
                    }
                }
                case 95: {
                    var3 = (RuntimeException) ((Object) caughtException);
                    throw la.a((Throwable) ((Object) var3), "ri.C(" + param0 + ',' + param1 + ',' + param2 + ')');
                }
                case 96: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static void a(ad param0, int param1, ad param2, ad param3) {
        RuntimeException runtimeException = null;
        String[] var4 = null;
        int var5 = 0;
        td var6 = null;
        int var7 = 0;
        String[] var8 = null;
        Object stackIn_8_0 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        StringBuilder stackIn_18_1 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        var7 = MonkeyPuzzle2.field_F ? 1 : 0;
        try {
          L0: {
            ii.field_D = new o(22050, va.field_i);
            wd.field_i = new ud(param2, param3);
            je.field_i = dc.a(2570, "music/Monkey Puzzle Panic", "", wd.field_i, param0);
            uh.field_e = dc.a(2570, "music/Monkey Puzzle TitleScreen", "", wd.field_i, param0);
            ah.field_g[0] = dc.a(2570, "music/Monkey Puzzle countryside", "", wd.field_i, param0);
            ah.field_g[1] = dc.a(2570, "music/Monkey Puzzle jungle", "", wd.field_i, param0);
            ah.field_g[2] = dc.a(2570, "music/Monkey Puzzle water", "", wd.field_i, param0);
            ah.field_g[3] = dc.a(2570, "music/Monkey Puzzle aztec", "", wd.field_i, param0);
            kb.field_d = dc.a(2570, "music/monkey_puzzle_level_complete_jingle", "", wd.field_i, param0);
            bl.field_g = dc.a(2570, "music/Monkey_Puzzle_game_over_Jingle", "", wd.field_i, param0);
            b.field_l = dc.a(param1 ^ 2570, "music/Monkey_Puzzle_world_Complete_Jingle", "", wd.field_i, param0);
            wf.field_h = dc.a(2570, "music/Monkey_Puzzle_Game_Complete_Jingle", "", wd.field_i, param0);
            var8 = new String[]{"menu_select", "MP_throw_coconut", "MP_deflect3", "MP_deflect_ceiling", "MP_monkeyhit", "MP_coconut_hit", "MP_coconut_fall", "MP_monkeyfall", "MP_splash_2", "MP_splash_3", "MP_splash_4", "MP_splash_5", "MP_intro_screen_appear", "MP_intro_screen_close", "MP_intro_screen_monkey_fall", "MP_intro_screen_rain", "MP_intro_screen_ambience_1", "MP_intro_screen_ambience_2", "MP_lvl_end_vine", "MP_lvl_end_climb", "MP_monkey_amb1", "MP_monkey_amb2", "MP_monkey_amb3", "MP_monkey_amb4", "MP_monkey_amb5", "MP_monkey_laugh1", "MP_monkey_laugh2", "MP_monkey_laugh3", "MP_lvl_end_climb_step1", "MP_lvl_end_climb_step2", "MP_lvl_end_climb_step3", "mp_level_complete"};
            var4 = var8;
            var5 = param1;
            L1: while (true) {
              L2: {
                L3: {
                  if (var5 >= 32) {
                    break L3;
                  } else {
                    var6 = wd.field_i.a(var8[var5], (byte) -77);
                    stackIn_8_0 = null;

                    if (var7 != 0) {
                      break L2;
                    } else {
                      L4: {
                        if (stackIn_8_0 != var6) {
                          break L4;
                        } else {
                          System.out.println(var8[var5]);
                          break L4;
                        }
                      }
                      ke.field_h[var5] = var6.a(ii.field_D);
                      var5++;
                      if (var7 == 0) {
                        continue L1;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
                wd.field_i = null;
                stackIn_8_0 = null;
                break L2;
              }
              ii.field_D = (o) ((Object) stackIn_8_0);
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            runtimeException = decompiledCaughtException;
            stackIn_12_0 = (RuntimeException) (runtimeException);

            stackIn_12_1 = new StringBuilder().append("ri.D(");

            if (param0 == null) {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L5;
            } else {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L5;
            }
          }
          L6: {


            stackIn_15_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L6;
            } else {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
              break L6;
            }
          }
          L7: {


            stackIn_18_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_16_2).append(',');

            if (param3 == null) {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "null";
              break L7;
            } else {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "{...}";
              break L7;
            }
          }
          throw la.a((Throwable) ((Object) stackIn_13_0), stackIn_19_2 + ')');
        }
    }

    public static void a(byte param0) {
        field_b = null;
        field_d = null;
        field_c = null;
        if (param0 != -66) {
            ri.a((ad) null, 38, (ad) null, (ad) null);
        }
        field_a = null;
    }

    static {
        field_d = "Type your age in years";
        field_b = new pj();
    }
}
