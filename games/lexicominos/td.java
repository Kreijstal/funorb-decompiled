/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class td {
    static String field_g;
    static String field_b;
    private int field_h;
    String field_f;
    private int field_d;
    private sa[] field_a;
    private int field_e;
    float field_c;

    final static db[] a(String param0, String param1, sh param2, int param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int[] var6 = null;
        db[] stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param3 == 22306) {
                break L1;
              } else {
                var6 = (int[]) null;
                td.a((int[]) null, false);
                break L1;
              }
            }
            var4_int = param2.c(param0, (byte) -89);
            var5 = param2.a(param1, -27964, var4_int);
            stackIn_3_0 = ij.a(var5, (byte) -117, param2, var4_int);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var4);

            stackIn_6_1 = new StringBuilder().append("td.C(");

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


            stackIn_9_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(',');

            if (param1 == null) {
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
          L4: {


            stackIn_12_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(',');

            if (param2 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L4;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L4;
            }
          }
          throw ld.a((Throwable) ((Object) stackIn_7_0), stackIn_13_2 + ',' + param3 + ')');
        }
        return stackIn_3_0;
    }

    final static boolean a(int[] param0, boolean param1) {
        int stackIn_4_0 = 0;
        int stackIn_7_0 = 0;
        ng stackIn_11_0 = null;
        ng stackIn_12_0 = null;
        ng stackIn_13_0 = null;
        int stackIn_13_1 = 0;
        int stackIn_22_0 = 0;
        int stackIn_29_0 = 0;
        int stackIn_34_0 = 0;
        int stackIn_37_0 = 0;
        RuntimeException stackIn_49_0 = null;
        StringBuilder stackIn_49_1 = null;
        RuntimeException stackIn_50_0 = null;
        StringBuilder stackIn_50_1 = null;
        RuntimeException stackIn_51_0 = null;
        StringBuilder stackIn_51_1 = null;
        String stackIn_51_2 = null;
        int decompiledRegionSelector0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        long var2_long = 0L;
        RuntimeException var2 = null;
        c var4_ref_c = null;
        int var4 = 0;
        int var5_int = 0;
        c var5 = null;
        int var6 = 0;
        int var7 = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var7 = Lexicominos.field_L ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (gg.field_b != uf.field_m) {
                            statePc = 3;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 48;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 48;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        stackIn_4_0 = 0;
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 48;
                        continue stateLoop;
                    }
                }
                case 4: {
                    return stackIn_4_0 != 0;
                }
                case 5: {
                    try {
                        if (!param1) {
                            statePc = 8;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 48;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        stackIn_7_0 = 1;
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 48;
                        continue stateLoop;
                    }
                }
                case 7: {
                    return stackIn_7_0 != 0;
                }
                case 8: {
                    try {
                        var2_long = rf.c(0);
                        if (0 == sc.field_f) {
                            statePc = 24;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 48;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        if (0 <= kk.field_r) {
                            statePc = 24;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 48;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        stackIn_12_0 = eb.field_f;
                        stackIn_11_0 = stackIn_12_0;
                        if (param1) {
                            statePc = 12;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 48;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        stackIn_13_0 = (ng) ((Object) stackIn_11_0);
                        stackIn_13_1 = 1;
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 48;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        stackIn_13_0 = (ng) ((Object) stackIn_12_0);
                        stackIn_13_1 = 0;
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 48;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        var4_ref_c = (c) ((Object) ((ng) (Object) stackIn_13_0).a(stackIn_13_1 != 0));
                        if (var4_ref_c == null) {
                            statePc = 24;
                        } else {
                            statePc = 14;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 48;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        if ((var2_long ^ -1L) >= (var4_ref_c.field_l ^ -1L)) {
                            statePc = 24;
                        } else {
                            statePc = 15;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 48;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        var4_ref_c.b((byte) -119);
                        a.field_c = var4_ref_c.field_h.length;
                        ig.field_a.field_h = 0;
                        var5_int = 0;
                        statePc = 16;
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 48;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        if (a.field_c <= var5_int) {
                            statePc = 20;
                        } else {
                            statePc = 17;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 48;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        ig.field_a.field_j[var5_int] = var4_ref_c.field_h[var5_int];
                        var5_int++;
                        if (var7 != 0) {
                            statePc = 21;
                        } else {
                            statePc = 18;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 48;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        if (var7 == 0) {
                            statePc = 16;
                        } else {
                            statePc = 19;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 48;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        statePc = 20;
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 48;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        vh.field_b = df.field_a;
                        df.field_a = wl.field_i;
                        wl.field_i = pg.field_d;
                        pg.field_d = var4_ref_c.field_k;
                        statePc = 21;
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 48;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        stackIn_22_0 = 1;
                        statePc = 22;
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 48;
                        continue stateLoop;
                    }
                }
                case 22: {
                    return stackIn_22_0 != 0;
                }
                case 24: {
                    try {
                        if (-1 < (kk.field_r ^ -1)) {
                            statePc = 26;
                        } else {
                            statePc = 25;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 48;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        statePc = 31;
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 48;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        ig.field_a.field_h = 0;
                        if (!a.b(1, 10343)) {
                            statePc = 28;
                        } else {
                            statePc = 27;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 48;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        statePc = 30;
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 48;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        stackIn_29_0 = 0;
                        statePc = 29;
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 48;
                        continue stateLoop;
                    }
                }
                case 29: {
                    return stackIn_29_0 != 0;
                }
                case 30: {
                    try {
                        kk.field_r = ig.field_a.i((byte) -76);
                        ig.field_a.field_h = 0;
                        a.field_c = param0[kk.field_r];
                        statePc = 31;
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 48;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        if (!dc.d(2)) {
                            statePc = 33;
                        } else {
                            statePc = 32;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 48;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        statePc = 35;
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 48;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        stackIn_34_0 = 0;
                        statePc = 34;
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 48;
                        continue stateLoop;
                    }
                }
                case 34: {
                    return stackIn_34_0 != 0;
                }
                case 35: {
                    try {
                        if (sc.field_f != 0) {
                            statePc = 38;
                        } else {
                            statePc = 36;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 48;
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        vh.field_b = df.field_a;
                        df.field_a = wl.field_i;
                        wl.field_i = pg.field_d;
                        pg.field_d = kk.field_r;
                        kk.field_r = -1;
                        stackIn_37_0 = 1;
                        statePc = 37;
                        continue stateLoop;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = 48;
                        continue stateLoop;
                    }
                }
                case 37: {
                    return stackIn_37_0 != 0;
                }
                case 38: {
                    try {
                        var4 = sc.field_f;
                        if (0.0 == ug.field_u) {
                            statePc = 41;
                        } else {
                            statePc = 39;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = 48;
                        continue stateLoop;
                    }
                }
                case 39: {
                    try {
                        var4 = (int)((double)var4 + q.field_a.nextGaussian() * ug.field_u);
                        if (-1 >= (var4 ^ -1)) {
                            statePc = 41;
                        } else {
                            statePc = 40;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_39) {
                        caughtException = stateCaught_39;
                        statePc = 48;
                        continue stateLoop;
                    }
                }
                case 40: {
                    try {
                        var4 = 0;
                        statePc = 41;
                        continue stateLoop;
                    } catch (Throwable stateCaught_40) {
                        caughtException = stateCaught_40;
                        statePc = 48;
                        continue stateLoop;
                    }
                }
                case 41: {
                    try {
                        var5 = new c((long)var4 + var2_long, kk.field_r, new byte[a.field_c]);
                        var6 = 0;
                        statePc = 42;
                        continue stateLoop;
                    } catch (Throwable stateCaught_41) {
                        caughtException = stateCaught_41;
                        statePc = 48;
                        continue stateLoop;
                    }
                }
                case 42: {
                    try {
                        if (a.field_c <= var6) {
                            statePc = 46;
                        } else {
                            statePc = 43;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_42) {
                        caughtException = stateCaught_42;
                        statePc = 48;
                        continue stateLoop;
                    }
                }
                case 43: {
                    try {
                        var5.field_h[var6] = ig.field_a.field_j[var6];
                        var6++;
                        if (var7 != 0) {
                            statePc = 24;
                        } else {
                            statePc = 44;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_43) {
                        caughtException = stateCaught_43;
                        statePc = 48;
                        continue stateLoop;
                    }
                }
                case 44: {
                    try {
                        if (var7 == 0) {
                            statePc = 42;
                        } else {
                            statePc = 45;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_44) {
                        caughtException = stateCaught_44;
                        statePc = 48;
                        continue stateLoop;
                    }
                }
                case 45: {
                    try {
                        statePc = 46;
                        continue stateLoop;
                    } catch (Throwable stateCaught_45) {
                        caughtException = stateCaught_45;
                        statePc = 48;
                        continue stateLoop;
                    }
                }
                case 46: {
                    try {
                        eb.field_f.b(125, var5);
                        kk.field_r = -1;
                        statePc = 24;
                        continue stateLoop;
                    } catch (Throwable stateCaught_46) {
                        caughtException = stateCaught_46;
                        statePc = 48;
                        continue stateLoop;
                    }
                }
                case 48: {
                    var2 = (RuntimeException) ((Object) caughtException);
                    stackIn_50_0 = (RuntimeException) (var2);
                    stackIn_49_0 = stackIn_50_0;
                    stackIn_50_1 = new StringBuilder().append("td.E(");
                    stackIn_49_1 = stackIn_50_1;
                    if (param0 == null) {
                        statePc = 50;
                    } else {
                        statePc = 49;
                    }
                    continue stateLoop;
                }
                case 49: {
                    stackIn_51_0 = (RuntimeException) ((Object) stackIn_49_0);
                    stackIn_51_1 = (StringBuilder) ((Object) stackIn_49_1);
                    stackIn_51_2 = "{...}";
                    statePc = 51;
                    continue stateLoop;
                }
                case 50: {
                    stackIn_51_0 = (RuntimeException) ((Object) stackIn_50_0);
                    stackIn_51_1 = (StringBuilder) ((Object) stackIn_50_1);
                    stackIn_51_2 = "null";
                    statePc = 51;
                    continue stateLoop;
                }
                case 51: {
                    throw ld.a((Throwable) ((Object) stackIn_51_0), stackIn_51_2 + ',' + param1 + ')');
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static void a(int param0, int[] param1, int param2, byte[] param3, int param4) {
        int incrementValue$4 = 0;
        int incrementValue$5 = 0;
        byte dupTemp$6 = 0;
        int dupTemp$7 = 0;
        RuntimeException runtimeException = null;
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var7 = Lexicominos.field_L ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var5_int = param0;
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        if (qg.field_b.length <= var5_int) {
                            statePc = 20;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        param2 = qg.field_b[var5_int];
                        if (var7 == 0) {
                            statePc = 5;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        return;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        var6 = var5_int << 637584772;
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        incrementValue$4 = param2;
                        param2--;
                        if (0 == incrementValue$4) {
                            statePc = 10;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        incrementValue$5 = var6;
                        var6++;
                        param4 = bf.field_a[incrementValue$5];
                        dupTemp$6 = param3[param4];
                        dupTemp$7 = param1[dupTemp$6];
                        param1[dupTemp$6] = dupTemp$7 + 1;
                        bf.field_a[dupTemp$7] = param4;
                        if (var7 != 0) {
                            statePc = 11;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        if (var7 == 0) {
                            statePc = 6;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        var5_int++;
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        if (var7 == 0) {
                            statePc = 2;
                        } else {
                            statePc = 20;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 13: {
                    runtimeException = (RuntimeException) ((Object) caughtException);
                    stackIn_15_0 = (RuntimeException) (runtimeException);
                    stackIn_14_0 = stackIn_15_0;
                    stackIn_15_1 = new StringBuilder().append("td.B(").append(param0).append(',');
                    stackIn_14_1 = stackIn_15_1;
                    if (param1 == null) {
                        statePc = 15;
                    } else {
                        statePc = 14;
                    }
                    continue stateLoop;
                }
                case 14: {
                    stackIn_16_0 = (RuntimeException) ((Object) stackIn_14_0);
                    stackIn_16_1 = (StringBuilder) ((Object) stackIn_14_1);
                    stackIn_16_2 = "{...}";
                    statePc = 16;
                    continue stateLoop;
                }
                case 15: {
                    stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
                    stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
                    stackIn_16_2 = "null";
                    statePc = 16;
                    continue stateLoop;
                }
                case 16: {
                    stackIn_18_0 = (RuntimeException) ((Object) stackIn_16_0);
                    stackIn_17_0 = stackIn_18_0;
                    stackIn_18_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_16_2).append(',').append(param2).append(',');
                    stackIn_17_1 = stackIn_18_1;
                    if (param3 == null) {
                        statePc = 18;
                    } else {
                        statePc = 17;
                    }
                    continue stateLoop;
                }
                case 17: {
                    stackIn_19_0 = (RuntimeException) ((Object) stackIn_17_0);
                    stackIn_19_1 = (StringBuilder) ((Object) stackIn_17_1);
                    stackIn_19_2 = "{...}";
                    statePc = 19;
                    continue stateLoop;
                }
                case 18: {
                    stackIn_19_0 = (RuntimeException) ((Object) stackIn_18_0);
                    stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
                    stackIn_19_2 = "null";
                    statePc = 19;
                    continue stateLoop;
                }
                case 19: {
                    throw ld.a((Throwable) ((Object) stackIn_19_0), stackIn_19_2 + ',' + param4 + ')');
                }
                case 20: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    private final void a(byte param0, sa param1, int param2) {
        float var4_float = 0.0f;
        RuntimeException var4 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param0 == 37) {
              var4_float = (float)param2 / 100.0f + (float)(1 + this.field_h);
              this.field_c = var4_float * (float)this.field_d / (float)(this.field_e - -1);
              if (0 == param2) {
                this.field_f = param1.field_b;
                return;
              } else {
                this.field_f = param1.field_e + " - " + param2 + "%";
                if (!Lexicominos.field_L) {
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  this.field_f = param1.field_b;
                  return;
                }
              }
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4 = decompiledCaughtException;
            stackIn_10_0 = (RuntimeException) (var4);

            stackIn_10_1 = new StringBuilder().append("td.D(").append(param0).append(',');

            if (param1 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L1;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L1;
            }
          }
          throw ld.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final boolean a(int param0) {
        boolean stackIn_6_0 = false;
        sa var2;
        int var3;
        sa var4;
        L0: {
          var3 = Lexicominos.field_L ? 1 : 0;
          if (param0 <= -38) {
            break L0;
          } else {
            this.field_e = -36;
            break L0;
          }
        }
        L1: while (true) {
          if (this.field_e > this.field_h) {
            var4 = this.field_a[this.field_h];
            var2 = var4;
            stackIn_6_0 = var4.field_d.c(88);

            if (var3 == 0) {
              if (stackIn_6_0) {
                L2: {
                  if (var4.field_i < 0) {
                    break L2;
                  } else {
                    if (var4.field_d.c(5, var4.field_i)) {
                      break L2;
                    } else {
                      this.a((byte) 37, var2, var4.field_d.b((byte) -91, var4.field_i));
                      return false;
                    }
                  }
                }
                L3: {
                  if (var4.field_f == null) {
                    break L3;
                  } else {
                    if (var4.field_d.a(var4.field_f, 10762)) {
                      break L3;
                    } else {
                      this.a((byte) 37, var2, var4.field_d.b(var4.field_f, (byte) 121));
                      return false;
                    }
                  }
                }
                L4: {
                  if ((var4.field_i ^ -1) <= -1) {
                    break L4;
                  } else {
                    if (var4.field_f != null) {
                      break L4;
                    } else {
                      if (var4.field_e == null) {
                        break L4;
                      } else {
                        if (!var4.field_d.a((byte) -126)) {
                          this.a((byte) 37, var2, var4.field_d.a(false));
                          return false;
                        } else {
                          break L4;
                        }
                      }
                    }
                  }
                }
                this.field_h = this.field_h + 1;
                if (var3 == 0) {
                  continue L1;
                } else {
                  return true;
                }
              } else {
                this.a((byte) 37, var4, 0);
                return false;
              }
            } else {
              return stackIn_6_0;
            }
          } else {
            return true;
          }
        }
    }

    private td() throws Throwable {
        throw new Error();
    }

    public static void b(int param0) {
        field_b = null;
        field_g = null;
        if (param0 == 0) {
            return;
        }
        field_b = (String) null;
    }

    static {
        field_b = "This password contains repeated characters, and would be easy to guess";
        field_g = "TUTORIAL";
    }
}
