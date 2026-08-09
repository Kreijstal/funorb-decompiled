/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wl extends rqa {
    static int field_q;
    static String field_o;
    static String field_p;

    final static faa a(int param0, byte[] param1) {
        lla var2 = null;
        RuntimeException var2_ref = null;
        byte[] var3 = null;
        faa stackIn_4_0 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              var2 = new lla();
              if (param0 == 9) {
                break L1;
              } else {
                field_o = (String) null;
                break L1;
              }
            }
            var3 = var2.a(param0 + -9, param1);
            stackIn_4_0 = new faa(var3);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2_ref = decompiledCaughtException;
            stackIn_8_0 = (RuntimeException) (var2_ref);

            stackIn_8_1 = new StringBuilder().append("wl.C(").append(param0).append(',');

            if (param1 == null) {
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
          throw rta.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ')');
        }
        return stackIn_4_0;
    }

    final nc a(nc[] param0, int param1) {
        RuntimeException var3 = null;
        nc stackIn_4_0 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              si.a(222, 62, param0[0].a(93));
              if (param1 <= -119) {
                break L1;
              } else {
                field_q = 50;
                break L1;
              }
            }
            stackIn_4_0 = new nc("void");
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_8_0 = (RuntimeException) (var3);

            stackIn_8_1 = new StringBuilder().append("wl.A(");

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
          throw rta.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ',' + param1 + ')');
        }
        return stackIn_4_0;
    }

    wl(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    final static void a(wma param0, int[] param1, boolean param2, boolean param3, boolean param4, int[] param5, boolean param6) {
        int stackIn_7_0 = 0;
        int stackIn_7_1 = 0;
        int stackIn_60_0 = 0;
        int stackIn_60_1 = 0;
        int stackIn_65_0 = 0;
        int stackIn_65_1 = 0;
        RuntimeException stackIn_68_0 = null;
        StringBuilder stackIn_68_1 = null;
        RuntimeException stackIn_70_0 = null;
        StringBuilder stackIn_70_1 = null;
        RuntimeException stackIn_71_0 = null;
        StringBuilder stackIn_71_1 = null;
        String stackIn_71_2 = null;
        RuntimeException stackIn_72_0 = null;
        StringBuilder stackIn_72_1 = null;
        RuntimeException stackIn_74_0 = null;
        StringBuilder stackIn_74_1 = null;
        RuntimeException stackIn_75_0 = null;
        StringBuilder stackIn_75_1 = null;
        String stackIn_75_2 = null;
        RuntimeException stackIn_76_0 = null;
        StringBuilder stackIn_76_1 = null;
        RuntimeException stackIn_78_0 = null;
        StringBuilder stackIn_78_1 = null;
        RuntimeException stackIn_79_0 = null;
        StringBuilder stackIn_79_1 = null;
        String stackIn_79_2 = null;
        int statePc = 0;
        Throwable caughtException = null;
        int var7_int = 0;
        RuntimeException var7 = null;
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
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        int var26 = 0;
        int var27 = 0;
        int var28 = 0;
        int var29 = 0;
        int var30 = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var30 = VoidHunters.field_G;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var7_int = 2147483647;
                        var8 = -2147483648;
                        if (!param2) {
                            statePc = 4;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        wl.a(40, (byte[]) null);
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        var21 = param5[3] >> -1674874910;
                        var22 = param5[4] >> -325232030;
                        var23 = param5[5] >> -229256990;
                        var24 = param5[6] >> 117135586;
                        var25 = param5[7] >> -870921726;
                        var26 = param5[8] >> -2086708638;
                        var27 = param5[9] >> -1279744190;
                        var28 = param5[10] >> 2090049730;
                        var29 = param5[11] >> -217365694;
                        var13 = param1[5] * var26 + var25 * param1[4] + param1[3] * var24 >> 1282567886;
                        var12 = param1[3] * var21 + (param1[4] * var22 - -(param1[5] * var23)) >> 589244782;
                        var14 = var28 * param1[4] + (var27 * param1[3] - -(var29 * param1[5])) >> -808199090;
                        var20 = param1[9] * var27 - (-(var28 * param1[10]) - param1[11] * var29) >> 1269233934;
                        var15 = param1[8] * var23 + (var21 * param1[6] + param1[7] * var22) >> 1102700206;
                        var17 = param1[8] * var29 + (param1[6] * var27 + param1[7] * var28) >> -816377522;
                        var19 = param1[9] * var24 - (-(param1[10] * var25) - var26 * param1[11]) >> -1694607666;
                        var16 = var26 * param1[8] + (var25 * param1[7] + var24 * param1[6]) >> -1380445202;
                        var18 = param1[10] * var22 + param1[9] * var21 + var23 * param1[11] >> -598976082;
                        var21 = -param5[0] + param1[0];
                        var22 = param1[1] + -param5[1];
                        var23 = -param5[2] + param1[2];
                        var9 = param5[5] * var23 + (param5[4] * var22 + var21 * param5[3]) >> -iob.field_f + 16;
                        var11 = var23 * param5[11] + (var21 * param5[9] + var22 * param5[10]) >> -588251632;
                        var10 = var22 * param5[7] + (var21 * param5[6] + param5[8] * var23) >> 16 + -iob.field_f;
                        var21 = bfb.field_f;
                        var22 = bfb.field_j;
                        var23 = 0;
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        if (var23 >= param0.field_J) {
                            statePc = 23;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        var24 = param0.field_r[var23];
                        var25 = param0.field_o[var23];
                        var26 = param0.field_p[var23];
                        var27 = var9 - -(var26 * var18 + (var15 * var25 + var24 * var12) >> 16 + -iob.field_f);
                        var28 = var10 + (var25 * var16 + var24 * var13 - -(var26 * var19) >> -iob.field_f + 16);
                        var29 = (var24 * var14 + var25 * var17 - -(var26 * var20) >> -1108078736) + var11;
                        stackIn_65_0 = var29;
                        stackIn_7_0 = stackIn_65_0;
                        stackIn_65_1 = 50;
                        stackIn_7_1 = stackIn_65_1;
                        if (var30 != 0) {
                            statePc = 65;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        if (stackIn_7_0 < stackIn_7_1) {
                            statePc = 16;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        cl.field_b[var23] = var21 + var27 / var29;
                        lr.field_o[var23] = var28 / var29 + var22;
                        if (var8 >= var29) {
                            statePc = 14;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        var8 = var29;
                        statePc = 14;
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        pja.field_n[var23] = var29;
                        if (var29 >= var7_int) {
                            statePc = 18;
                        } else {
                            statePc = 15;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        var7_int = var29;
                        if (var30 == 0) {
                            statePc = 18;
                        } else {
                            statePc = 16;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        pja.field_n[var23] = -2147483648;
                        statePc = 18;
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        if (param6) {
                            statePc = 21;
                        } else {
                            statePc = 19;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        statePc = 22;
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        teb.field_b[var23] = var27 >> iob.field_f;
                        gw.field_i[var23] = var28 >> iob.field_f;
                        lka.field_a[var23] = var29;
                        statePc = 22;
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        var23++;
                        if (var30 == 0) {
                            statePc = 5;
                        } else {
                            statePc = 23;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        if (param0.field_A == null) {
                            statePc = 56;
                        } else {
                            statePc = 24;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        if (param0.field_g == null) {
                            statePc = 56;
                        } else {
                            statePc = 25;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        statePc = 27;
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        if (param0.field_h == null) {
                            statePc = 56;
                        } else {
                            statePc = 28;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        statePc = 30;
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        if (param0.field_t == null) {
                            statePc = 56;
                        } else {
                            statePc = 31;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        statePc = 33;
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        if (param0.field_C == null) {
                            statePc = 56;
                        } else {
                            statePc = 34;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        statePc = 36;
                        continue stateLoop;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        if (null == param0.field_H) {
                            statePc = 56;
                        } else {
                            statePc = 37;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 37: {
                    try {
                        statePc = 39;
                        continue stateLoop;
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 39: {
                    try {
                        if (null == param0.field_e) {
                            statePc = 56;
                        } else {
                            statePc = 40;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_39) {
                        caughtException = stateCaught_39;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 40: {
                    try {
                        statePc = 42;
                        continue stateLoop;
                    } catch (Throwable stateCaught_40) {
                        caughtException = stateCaught_40;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 42: {
                    try {
                        if (param0.field_x == null) {
                            statePc = 56;
                        } else {
                            statePc = 43;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_42) {
                        caughtException = stateCaught_42;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 43: {
                    try {
                        statePc = 45;
                        continue stateLoop;
                    } catch (Throwable stateCaught_43) {
                        caughtException = stateCaught_43;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 45: {
                    try {
                        if (null != param0.field_l) {
                            statePc = 50;
                        } else {
                            statePc = 46;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_45) {
                        caughtException = stateCaught_45;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 46: {
                    try {
                        statePc = 48;
                        continue stateLoop;
                    } catch (Throwable stateCaught_46) {
                        caughtException = stateCaught_46;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 48: {
                    try {
                        statePc = 56;
                        continue stateLoop;
                    } catch (Throwable stateCaught_48) {
                        caughtException = stateCaught_48;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 50: {
                    try {
                        var23 = 0;
                        statePc = 51;
                        continue stateLoop;
                    } catch (Throwable stateCaught_50) {
                        caughtException = stateCaught_50;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 51: {
                    try {
                        if (param0.field_y <= var23) {
                            statePc = 56;
                        } else {
                            statePc = 52;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_51) {
                        caughtException = stateCaught_51;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 52: {
                    try {
                        var24 = param0.field_A[var23];
                        var25 = param0.field_g[var23];
                        var26 = param0.field_h[var23];
                        hj.field_o[var23] = (var26 * var18 + var15 * var25 + var12 * var24 >> 2145818576) + var9;
                        vgb.field_p[var23] = var10 + (var13 * var24 - (-(var25 * var16) - var26 * var19) >> -1283985680);
                        kgb.field_b[var23] = var11 + (var17 * var25 + (var24 * var14 - -(var20 * var26)) >> 1326272112);
                        var24 = param0.field_t[var23];
                        var25 = param0.field_C[var23];
                        var26 = param0.field_H[var23];
                        um.field_c[var23] = (var25 * var15 + (var24 * var12 + var18 * var26) >> -955483376) + var9;
                        ji.field_o[var23] = (var19 * var26 + (var24 * var13 - -(var25 * var16)) >> 1263573584) + var10;
                        vmb.field_a[var23] = (var20 * var26 + (var14 * var24 + var25 * var17) >> 19422192) + var11;
                        var24 = param0.field_e[var23];
                        var25 = param0.field_x[var23];
                        var26 = param0.field_l[var23];
                        uv.field_a[var23] = var9 + (var25 * var15 + var12 * var24 - -(var18 * var26) >> -943532720);
                        aoa.field_c[var23] = (var26 * var19 + (var16 * var25 + var13 * var24) >> -1524894832) + var10;
                        mgb.field_p[var23] = (var25 * var17 + var24 * var14 - -(var26 * var20) >> 1327736688) + var11;
                        var23++;
                        if (var30 != 0) {
                            statePc = 80;
                        } else {
                            statePc = 53;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_52) {
                        caughtException = stateCaught_52;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 53: {
                    try {
                        if (var30 == 0) {
                            statePc = 51;
                        } else {
                            statePc = 54;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_53) {
                        caughtException = stateCaught_53;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 54: {
                    try {
                        statePc = 56;
                        continue stateLoop;
                    } catch (Throwable stateCaught_54) {
                        caughtException = stateCaught_54;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 56: {
                    try {
                        if (!param3) {
                            statePc = 64;
                        } else {
                            statePc = 57;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_56) {
                        caughtException = stateCaught_56;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 57: {
                    try {
                        var9 = param1[3];
                        var10 = param1[4];
                        var11 = param1[5];
                        var12 = param1[6];
                        var13 = param1[7];
                        var14 = param1[8];
                        var15 = param1[9];
                        var16 = param1[10];
                        var17 = param1[11];
                        var18 = 0;
                        statePc = 58;
                        continue stateLoop;
                    } catch (Throwable stateCaught_57) {
                        caughtException = stateCaught_57;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 58: {
                    try {
                        if ((var18 ^ -1) <= (param0.field_L ^ -1)) {
                            statePc = 64;
                        } else {
                            statePc = 59;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_58) {
                        caughtException = stateCaught_58;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 59: {
                    try {
                        stackIn_65_0 = bva.field_b.length ^ -1;
                        stackIn_60_0 = stackIn_65_0;
                        stackIn_65_1 = var18 ^ -1;
                        stackIn_60_1 = stackIn_65_1;
                        if (var30 != 0) {
                            statePc = 65;
                        } else {
                            statePc = 60;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_59) {
                        caughtException = stateCaught_59;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 60: {
                    try {
                        if (stackIn_60_0 >= stackIn_60_1) {
                            statePc = 64;
                        } else {
                            statePc = 61;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_60) {
                        caughtException = stateCaught_60;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 61: {
                    try {
                        statePc = 63;
                        continue stateLoop;
                    } catch (Throwable stateCaught_61) {
                        caughtException = stateCaught_61;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 63: {
                    try {
                        var19 = param0.field_k[var18];
                        var20 = param0.field_v[var18];
                        var21 = param0.field_n[var18];
                        bva.field_b[var18] = var21 * var15 + var19 * var9 + var12 * var20 >> -452930256;
                        mpa.field_o[var18] = var16 * var21 + (var13 * var20 + var10 * var19) >> -2040089936;
                        lf.field_p[var18] = var17 * var21 + var14 * var20 + var11 * var19 >> 1511732368;
                        var18++;
                        if (var30 == 0) {
                            statePc = 58;
                        } else {
                            statePc = 64;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_63) {
                        caughtException = stateCaught_63;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 64: {
                    try {
                        stackIn_65_0 = param4 ? 1 : 0;
                        stackIn_65_1 = var7_int;
                        statePc = 65;
                        continue stateLoop;
                    } catch (Throwable stateCaught_64) {
                        caughtException = stateCaught_64;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 65: {
                    try {
                        uhb.a(stackIn_65_0 != 0, stackIn_65_1, (byte) 79, param0, var8);
                        statePc = 80;
                        continue stateLoop;
                    } catch (Throwable stateCaught_65) {
                        caughtException = stateCaught_65;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 67: {
                    var7 = (RuntimeException) ((Object) caughtException);
                    stackIn_70_0 = (RuntimeException) (var7);
                    stackIn_68_0 = stackIn_70_0;
                    stackIn_70_1 = new StringBuilder().append("wl.B(");
                    stackIn_68_1 = stackIn_70_1;
                    if (param0 == null) {
                        statePc = 70;
                    } else {
                        statePc = 68;
                    }
                    continue stateLoop;
                }
                case 68: {
                    stackIn_71_0 = (RuntimeException) ((Object) stackIn_68_0);
                    stackIn_71_1 = (StringBuilder) ((Object) stackIn_68_1);
                    stackIn_71_2 = "{...}";
                    statePc = 71;
                    continue stateLoop;
                }
                case 70: {
                    stackIn_71_0 = (RuntimeException) ((Object) stackIn_70_0);
                    stackIn_71_1 = (StringBuilder) ((Object) stackIn_70_1);
                    stackIn_71_2 = "null";
                    statePc = 71;
                    continue stateLoop;
                }
                case 71: {
                    stackIn_74_0 = (RuntimeException) ((Object) stackIn_71_0);
                    stackIn_72_0 = stackIn_74_0;
                    stackIn_74_1 = ((StringBuilder) (Object) stackIn_71_1).append(stackIn_71_2).append(',');
                    stackIn_72_1 = stackIn_74_1;
                    if (param1 == null) {
                        statePc = 74;
                    } else {
                        statePc = 72;
                    }
                    continue stateLoop;
                }
                case 72: {
                    stackIn_75_0 = (RuntimeException) ((Object) stackIn_72_0);
                    stackIn_75_1 = (StringBuilder) ((Object) stackIn_72_1);
                    stackIn_75_2 = "{...}";
                    statePc = 75;
                    continue stateLoop;
                }
                case 74: {
                    stackIn_75_0 = (RuntimeException) ((Object) stackIn_74_0);
                    stackIn_75_1 = (StringBuilder) ((Object) stackIn_74_1);
                    stackIn_75_2 = "null";
                    statePc = 75;
                    continue stateLoop;
                }
                case 75: {
                    stackIn_78_0 = (RuntimeException) ((Object) stackIn_75_0);
                    stackIn_76_0 = stackIn_78_0;
                    stackIn_78_1 = ((StringBuilder) (Object) stackIn_75_1).append(stackIn_75_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');
                    stackIn_76_1 = stackIn_78_1;
                    if (param5 == null) {
                        statePc = 78;
                    } else {
                        statePc = 76;
                    }
                    continue stateLoop;
                }
                case 76: {
                    stackIn_79_0 = (RuntimeException) ((Object) stackIn_76_0);
                    stackIn_79_1 = (StringBuilder) ((Object) stackIn_76_1);
                    stackIn_79_2 = "{...}";
                    statePc = 79;
                    continue stateLoop;
                }
                case 78: {
                    stackIn_79_0 = (RuntimeException) ((Object) stackIn_78_0);
                    stackIn_79_1 = (StringBuilder) ((Object) stackIn_78_1);
                    stackIn_79_2 = "null";
                    statePc = 79;
                    continue stateLoop;
                }
                case 79: {
                    throw rta.a((Throwable) ((Object) stackIn_79_0), stackIn_79_2 + ',' + param6 + ')');
                }
                case 80: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    public static void a(int param0) {
        try {
            field_p = null;
            field_o = null;
            if (param0 != -27266) {
                wl.a(48, (byte[]) null);
            }
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) ((Object) runtimeException), "wl.D(" + param0 + ')');
        }
    }

    static {
        field_o = "Offline";
        field_p = "You appear to be telling someone your password - please don't!";
    }
}
