/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lc {
    String field_d;
    String field_a;
    boolean field_c;
    static int field_b;

    final static void a(int param0) {
        int statePc = 0;
        Throwable caughtException = null;
        ja var1 = null;
        RuntimeException var1_ref = null;
        double var2 = 0.0;
        float var4 = 0.0f;
        float var5 = 0.0f;
        float var6 = 0.0f;
        float var7 = 0.0f;
        double var8 = 0.0;
        int var10 = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var10 = Geoblox.field_C;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var1 = (ja) ((Object) wd.field_e.g(0));
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 45;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        if (var1 == null) {
                            statePc = 7;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 45;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        var1.b(true);
                        var1 = (ja) ((Object) wd.field_e.d(1));
                        if (var10 != 0) {
                            statePc = 10;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 45;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        if (var10 == 0) {
                            statePc = 2;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 45;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 45;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        if (param0 == 255) {
                            statePc = 10;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 45;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        field_b = -11;
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 45;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        if (!kj.field_o[99]) {
                            statePc = 14;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 45;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        if (ji.field_r.c(13519)) {
                            statePc = 25;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 45;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        statePc = 14;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 45;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        if ((kb.field_c ^ -1) > (kc.field_a ^ -1)) {
                            statePc = 25;
                        } else {
                            statePc = 15;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 45;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        statePc = 17;
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 45;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        if (-1 != (ul.field_b ^ -1)) {
                            statePc = 31;
                        } else {
                            statePc = 18;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 45;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        statePc = 20;
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 45;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        if (!el.field_o.field_Y) {
                            statePc = 25;
                        } else {
                            statePc = 21;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 45;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        statePc = 23;
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 45;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        statePc = 31;
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 45;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        if (0 < wd.field_e.a(param0 ^ -170)) {
                            statePc = 28;
                        } else {
                            statePc = 26;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 45;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        statePc = 31;
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 45;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        if (el.field_o.field_N) {
                            statePc = 31;
                        } else {
                            statePc = 29;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 45;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        ji.field_r.a(-48, wd.field_e.b((byte) -124));
                        hd.f(2);
                        kc.field_a = 0;
                        statePc = 31;
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 45;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        kc.field_a = kc.field_a + 1;
                        if (wd.field_e.a(param0 ^ 143) >= 3) {
                            statePc = 46;
                        } else {
                            statePc = 32;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 45;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        if (!ma.c((byte) -53)) {
                            statePc = 46;
                        } else {
                            statePc = 33;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 45;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        statePc = 35;
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 45;
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        if (!el.field_o.b(true)) {
                            statePc = 40;
                        } else {
                            statePc = 36;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 45;
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        statePc = 38;
                        continue stateLoop;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = 45;
                        continue stateLoop;
                    }
                }
                case 38: {
                    try {
                        statePc = 46;
                        continue stateLoop;
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = 45;
                        continue stateLoop;
                    }
                }
                case 40: {
                    try {
                        var1 = (ja) ((Object) ra.field_a.b((byte) -101));
                        if (null != var1) {
                            statePc = 43;
                        } else {
                            statePc = 41;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_40) {
                        caughtException = stateCaught_40;
                        statePc = 45;
                        continue stateLoop;
                    }
                }
                case 41: {
                    try {
                        statePc = 46;
                        continue stateLoop;
                    } catch (Throwable stateCaught_41) {
                        caughtException = stateCaught_41;
                        statePc = 45;
                        continue stateLoop;
                    }
                }
                case 43: {
                    try {
                        var2 = 2.0 * Math.random() * 3.141592653589793;
                        var4 = 240.0f * (float)Math.cos(var2) + 320.0f;
                        var5 = 240.0f + (float)Math.sin(var2) * 240.0f;
                        var6 = 320.0f - var4;
                        var7 = -var5 + 240.0f;
                        var8 = 1.0 / Math.sqrt((double)(var7 * var7 + var6 * var6));
                        var7 = (float)((double)var7 * var8);
                        var6 = (float)((double)var6 * var8);
                        var1.a(101, var4, vd.a(param0 ^ 741924143), og.field_r * var6, nf.c((byte) -67), kc.field_a + kb.field_c * (1 + wd.field_e.a(111)), 0.0f, var5, var7 * og.field_r, ij.m(param0 ^ 131), 0.0f);
                        wd.field_e.a(-47, var1);
                        mf.b(false);
                        statePc = 46;
                        continue stateLoop;
                    } catch (Throwable stateCaught_43) {
                        caughtException = stateCaught_43;
                        statePc = 45;
                        continue stateLoop;
                    }
                }
                case 45: {
                    var1_ref = (RuntimeException) ((Object) caughtException);
                    throw t.a((Throwable) ((Object) var1_ref), "lc.E(" + param0 + ')');
                }
                case 46: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static void a(String param0, int param1, float param2) {
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          L0: {
            L1: {
              if (param1 == -2) {
                break L1;
              } else {
                lc.a((byte) -59);
                break L1;
              }
            }
            oi.field_e = param0;
            pb.field_s = param2;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_8_0 = (RuntimeException) (var3);

            stackIn_8_1 = new StringBuilder().append("lc.A(");

            if (param0 == null) {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "null";
              break L2;
            } else {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "{...}";
              break L2;
            }
          }
          throw t.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final static void a(int param0, int param1, int[] param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, byte param10, int[] param11, int param12) {
        int incrementValue$0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_23_0 = 0;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_29_2 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_33_2 = null;
        int statePc = 0;
        Throwable caughtException = null;
        int var13_int = 0;
        RuntimeException var13 = null;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
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
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var37 = Geoblox.field_C;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (param10 <= -74) {
                            statePc = 4;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        field_b = 78;
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        var13_int = param0;
                        var14 = 1122867;
                        var15 = (var14 & 16711680) >>> -1079885168;
                        var16 = var14 & 65280;
                        var17 = var14 & 255;
                        var18 = -param1;
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        if ((var18 ^ -1) <= -1) {
                            statePc = 34;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        var19 = param5 * (param6 >> -1886768304);
                        if (var37 != 0) {
                            statePc = 34;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        var20 = -param9;
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        if ((var20 ^ -1) <= -1) {
                            statePc = 22;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        param12 = param11[var19 + (param0 >> -81490640)];
                        param0 = param0 + param3;
                        stackIn_23_0 = param12;
                        stackIn_10_0 = stackIn_23_0;
                        if (var37 != 0) {
                            statePc = 23;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        if (stackIn_10_0 != 0) {
                            statePc = 16;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        param8++;
                        if (var37 == 0) {
                            statePc = 21;
                        } else {
                            statePc = 14;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        statePc = 16;
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        var21 = param2[param8];
                        if ((var21 ^ -1) != -1) {
                            statePc = 20;
                        } else {
                            statePc = 17;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        param8++;
                        if (var37 == 0) {
                            statePc = 21;
                        } else {
                            statePc = 18;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        statePc = 20;
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        var22 = 510 & var21 >> 1228331247;
                        var23 = (var21 & 65429) >> -300055672;
                        var24 = 255 & var21;
                        var25 = (var24 + var22) / 3 - -var23 >> -1090345247;
                        var26 = -(((255 & param12) + (param12 >> 1020607240 & 255) + (param12 >> -1338833040 & 255)) / 3) + 256;
                        var27 = var15 * (var25 << -1187127344 >>> 543802160) >>> 1389020232;
                        var28 = (var25 << 1167088136) * var16 >>> 2081269144;
                        var29 = var17 * var25 >>> 2020048840;
                        var25 = (var28 << -1742741880) + (var27 << -1929572144) - -var29;
                        var30 = var26 * ((16711680 & var25) >> -2028626672);
                        var31 = (255 & var25 >> 123665768) * var26;
                        var32 = (var25 & 255) * var26;
                        var33 = ((16711680 & var21) >>> -1099466064) * ((param12 & 16711680) >>> 878755504) >>> 766300104;
                        var34 = (var21 & 65280) * (param12 & 65280) >>> -1130661960;
                        var35 = (255 & var21) * (255 & param12) >>> 1483648232;
                        var36 = 256 + -var26;
                        var33 = var33 * var36;
                        var34 = var34 * var36;
                        var35 = var35 * var36;
                        incrementValue$0 = param8;
                        param8++;
                        param2[incrementValue$0] = (var32 + var35 >> 464198152) + ((var34 + var31 >> 115744520 << 1806472904) + (var30 + var33 >> 1812821320 << 249524688));
                        statePc = 21;
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        var20++;
                        if (var37 == 0) {
                            statePc = 8;
                        } else {
                            statePc = 22;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        param6 = param6 + param4;
                        param8 = param8 + param7;
                        stackIn_23_0 = var13_int;
                        statePc = 23;
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        param0 = stackIn_23_0;
                        var18++;
                        if (var37 == 0) {
                            statePc = 5;
                        } else {
                            statePc = 34;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 25: {
                    var13 = (RuntimeException) ((Object) caughtException);
                    stackIn_28_0 = (RuntimeException) (var13);
                    stackIn_26_0 = stackIn_28_0;
                    stackIn_28_1 = new StringBuilder().append("lc.C(").append(param0).append(',').append(param1).append(',');
                    stackIn_26_1 = stackIn_28_1;
                    if (param2 == null) {
                        statePc = 28;
                    } else {
                        statePc = 26;
                    }
                    continue stateLoop;
                }
                case 26: {
                    stackIn_29_0 = (RuntimeException) ((Object) stackIn_26_0);
                    stackIn_29_1 = (StringBuilder) ((Object) stackIn_26_1);
                    stackIn_29_2 = "{...}";
                    statePc = 29;
                    continue stateLoop;
                }
                case 28: {
                    stackIn_29_0 = (RuntimeException) ((Object) stackIn_28_0);
                    stackIn_29_1 = (StringBuilder) ((Object) stackIn_28_1);
                    stackIn_29_2 = "null";
                    statePc = 29;
                    continue stateLoop;
                }
                case 29: {
                    stackIn_32_0 = (RuntimeException) ((Object) stackIn_29_0);
                    stackIn_30_0 = stackIn_32_0;
                    stackIn_32_1 = ((StringBuilder) (Object) stackIn_29_1).append(stackIn_29_2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(',').append(param8).append(',').append(param9).append(',').append(param10).append(',');
                    stackIn_30_1 = stackIn_32_1;
                    if (param11 == null) {
                        statePc = 32;
                    } else {
                        statePc = 30;
                    }
                    continue stateLoop;
                }
                case 30: {
                    stackIn_33_0 = (RuntimeException) ((Object) stackIn_30_0);
                    stackIn_33_1 = (StringBuilder) ((Object) stackIn_30_1);
                    stackIn_33_2 = "{...}";
                    statePc = 33;
                    continue stateLoop;
                }
                case 32: {
                    stackIn_33_0 = (RuntimeException) ((Object) stackIn_32_0);
                    stackIn_33_1 = (StringBuilder) ((Object) stackIn_32_1);
                    stackIn_33_2 = "null";
                    statePc = 33;
                    continue stateLoop;
                }
                case 33: {
                    throw t.a((Throwable) ((Object) stackIn_33_0), stackIn_33_2 + ',' + param12 + ')');
                }
                case 34: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static bg a(int param0, byte[] param1) {
        bg var2 = null;
        RuntimeException var2_ref = null;
        Object stackIn_4_0 = null;
        bg stackIn_9_0 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (null == param1) {
              stackIn_4_0 = null;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L1: {
                if (param0 == 4520) {
                  break L1;
                } else {
                  lc.a(-56, -44, (int[]) null, 118, 4, -55, 25, -98, -82, -78, (byte) -35, (int[]) null, -116);
                  break L1;
                }
              }
              var2 = new bg(param1, gh.field_m, md.field_e, rc.field_j, hl.field_K, mj.field_a);
              kj.c(true);
              stackIn_9_0 = (bg) (var2);
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2_ref = decompiledCaughtException;
            stackIn_13_0 = (RuntimeException) (var2_ref);

            stackIn_13_1 = new StringBuilder().append("lc.B(").append(param0).append(',');

            if (param1 == null) {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L2;
            } else {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L2;
            }
          }
          throw t.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (bg) ((Object) stackIn_4_0);
        } else {
          return stackIn_9_0;
        }
    }

    final static void a(byte param0) {
        int fieldTemp$0 = 0;
        int fieldTemp$1 = 0;
        int stackIn_15_0 = 0;
        j stackIn_61_0 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        pk var1 = null;
        RuntimeException var1_ref = null;
        int var2 = 0;
        int var3_int = 0;
        Object var3 = null;
        String var4_ref_String = null;
        int var4 = 0;
        j var5 = null;
        String var5_ref = null;
        String var6 = null;
        j var6_ref = null;
        String var7 = null;
        j var7_ref = null;
        int var8 = 0;
        var8 = Geoblox.field_C;
        try {
          L0: {
            L1: {
              if (param0 == 104) {
                break L1;
              } else {
                field_b = 67;
                break L1;
              }
            }
            var1 = eh.field_d;
            var2 = var1.c((byte) 34);
            if (-1 == (var2 ^ -1)) {
              L2: {
                if (ug.field_a == null) {
                  ug.field_a = new vg(128);
                  ca.field_i = 0;
                  break L2;
                } else {
                  break L2;
                }
              }
              L3: {
                if (-2 != (var1.c((byte) 34) ^ -1)) {
                  stackIn_15_0 = 0;
                  break L3;
                } else {
                  stackIn_15_0 = 1;
                  break L3;
                }
              }
              L4: {
                var3_int = stackIn_15_0;
                var4_ref_String = var1.e((byte) 105);
                if (var3_int != 0) {
                  var1.e((byte) 108);
                  break L4;
                } else {
                  break L4;
                }
              }
              L5: {
                var5 = ud.a(0, var4_ref_String);
                var6 = var1.e((byte) 103);
                var7 = oe.a((CharSequence) ((Object) var4_ref_String), 12);
                if (null == var7) {
                  var7 = var4_ref_String;
                  break L5;
                } else {
                  break L5;
                }
              }
              L6: {
                if (var5 != null) {
                  break L6;
                } else {
                  var5 = ud.a(param0 ^ 104, var6);
                  if (var5 != null) {
                    ug.field_a.a((long)var7.hashCode(), 113, var5);
                    break L6;
                  } else {
                    break L6;
                  }
                }
              }
              L7: {
                if (null != var5) {
                  break L7;
                } else {
                  var5 = new j();
                  ug.field_a.a((long)var7.hashCode(), 94, var5);
                  fieldTemp$0 = ca.field_i;
                  ca.field_i = ca.field_i + 1;
                  var5.field_kb = fieldTemp$0;
                  di.field_e.a(param0 ^ -86, var5);
                  break L7;
                }
              }
              var5.field_hb = var4_ref_String;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              if (var2 != 1) {
                if (var2 != 2) {
                  if (-4 == (var2 ^ -1)) {
                    L8: {
                      if (-3 == (vk.field_a ^ -1)) {
                        vk.field_a = 1;
                        break L8;
                      } else {
                        break L8;
                      }
                    }
                    decompiledRegionSelector0 = 3;
                    break L0;
                  } else {
                    if (-5 == (var2 ^ -1)) {
                      vk.field_a = 1;
                      var3 = var1.e((byte) 122);
                      eg.field_l = ((String) (var3)).intern();
                      var4 = var1.c((byte) 34);
                      pi.c(var4, param0 ^ -12742);
                      decompiledRegionSelector0 = 4;
                      break L0;
                    } else {
                      gi.a((Throwable) null, "F1: " + og.e(55), (byte) 125);
                      jl.a((byte) -119);
                      decompiledRegionSelector0 = 5;
                      break L0;
                    }
                  }
                } else {
                  L9: {
                    if (vk.field_a != 1) {
                      break L9;
                    } else {
                      vk.field_a = 2;
                      break L9;
                    }
                  }
                  decompiledRegionSelector0 = 2;
                  break L0;
                }
              } else {
                L10: {
                  if (nh.field_a != null) {
                    break L10;
                  } else {
                    nh.field_a = new vg(128);
                    mg.field_g = 0;
                    break L10;
                  }
                }
                L11: {
                  var3 = var1.e((byte) 108);
                  if (!((String) (var3)).equals("")) {
                    break L11;
                  } else {
                    var3 = null;
                    break L11;
                  }
                }
                L12: {
                  var4_ref_String = var1.e((byte) 102);
                  var5_ref = var1.e((byte) 110);
                  var6_ref = jg.a((byte) -62, var4_ref_String);
                  if (null != var6_ref) {
                    break L12;
                  } else {
                    var6_ref = jg.a((byte) -62, var5_ref);
                    if (null != var6_ref) {
                      nh.field_a.a((long)oe.a((CharSequence) ((Object) var4_ref_String), 12).hashCode(), -63, var6_ref);
                      break L12;
                    } else {
                      break L12;
                    }
                  }
                }
                L13: {
                  if (null == var6_ref) {
                    var6_ref = new j();
                    nh.field_a.a((long)oe.a((CharSequence) ((Object) var4_ref_String), param0 ^ 100).hashCode(), 110, var6_ref);
                    fieldTemp$1 = mg.field_g;
                    mg.field_g = mg.field_g + 1;
                    var6_ref.field_kb = fieldTemp$1;
                    hl.field_B.a(-59, var6_ref);
                    break L13;
                  } else {
                    break L13;
                  }
                }
                L14: {
                  if (var3 != null) {
                    var3 = ((String) (var3)).intern();
                    break L14;
                  } else {
                    break L14;
                  }
                }
                var6_ref.field_hb = var4_ref_String;
                var6_ref.field_mb = (String) (var3);
                var6_ref.a(false);
                var7_ref = (j) ((Object) hl.field_B.g(0));
                L15: while (true) {
                  L16: {
                    L17: {
                      if (null == var7_ref) {
                        break L17;
                      } else {
                        stackIn_61_0 = (j) (var6_ref);

                        if (var8 != 0) {
                          break L16;
                        } else {
                          if (!ul.a(stackIn_61_0, var7_ref, (byte) 127)) {
                            break L17;
                          } else {
                            var7_ref = (j) ((Object) hl.field_B.d(1));
                            if (var8 == 0) {
                              continue L15;
                            } else {
                              break L17;
                            }
                          }
                        }
                      }
                    }
                    stackIn_61_0 = (j) (var7_ref);
                    break L16;
                  }
                  L18: {
                    L19: {
                      if (stackIn_61_0 != null) {
                        break L19;
                      } else {
                        hl.field_B.a(-39, var6_ref);
                        if (var8 == 0) {
                          break L18;
                        } else {
                          break L19;
                        }
                      }
                    }
                    le.a(var7_ref, 121, var6_ref);
                    break L18;
                  }
                  decompiledRegionSelector0 = 1;
                  break L0;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw t.a((Throwable) ((Object) var1_ref), "lc.D(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return;
                } else {
                  return;
                }
              }
            }
          }
        }
    }

    static {
    }
}
