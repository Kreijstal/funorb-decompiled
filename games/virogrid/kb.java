/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kb {
    static int[] field_d;
    static hm field_b;
    static boolean field_c;
    static String field_a;

    final static void a(String param0, int param1) {
        try {
            System.out.println("Error: " + kn.a(param0, (byte) -33, "\n", "%0a"));
            if (param1 != 0) {
                field_b = (hm) null;
            }
        } catch (RuntimeException runtimeException) {
            throw runtimeException;
        }
    }

    final static void a(e param0, boolean param1, eh param2) {
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_27_2 = null;
        int decompiledRegionSelector0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        u var4 = null;
        int var5 = 0;
        int var6 = 0;
        int[] var7 = null;
        int var8 = 0;
        int var9 = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var9 = Virogrid.field_F ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var3_int = ih.field_c;
                        cm.field_h = new km(0L, (km) null);
                        if (null == param2) {
                            statePc = 4;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        en.a("QC1", (Throwable) null, 1);
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 5: {
                    return;
                }
                case 6: {
                    try {
                        param2.field_b = param1;
                        param2.field_k = 0;
                        dm.field_v = new wc(var3_int, param2, param2);
                        cj.field_s = new ad(var3_int, param2, param2, new qa());
                        var4 = kn.f(256);
                        if (null == var4) {
                            statePc = 9;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        en.a("QC2", (Throwable) null, 1);
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 10: {
                    return;
                }
                case 11: {
                    try {
                        g.a((byte) 124, var4);
                        dh.field_k = rb.a(4020342, -4841, 2245737, 1513239, 8947848, 0, 1513239, 1127256, (e) null, 65793, 65793, 65793, 5138823);
                        gk.field_e = rb.a(0, -4841, 0, 0, 0, 16764006, 0, 0, param0, 0, 0, 0, 0);
                        sd.field_a = rb.a(0, -4841, 0, 0, 0, 16777215, 0, 0, param0, 0, 0, 0, 0);
                        var5 = df.field_e;
                        var6 = df.field_f;
                        var7 = df.field_d;
                        da.field_h = new mg(10, 14);
                        da.field_h.b();
                        var8 = 2;
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        if (-8 >= (var8 ^ -1)) {
                            statePc = 17;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        df.d(var8, var8 - -1, -(var8 << -363006367) + 14, 16777215);
                        var8++;
                        if (var9 != 0) {
                            statePc = 28;
                        } else {
                            statePc = 14;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        if (var9 == 0) {
                            statePc = 12;
                        } else {
                            statePc = 15;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        statePc = 17;
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        df.a(var7, var5, var6);
                        dc.field_V = wf.a(dh.field_k, sd.field_a, var4, 49, gk.field_e);
                        cm.field_h.field_W = new p();
                        statePc = 28;
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 19: {
                    var3 = (RuntimeException) ((Object) caughtException);
                    stackIn_22_0 = (RuntimeException) (var3);
                    stackIn_20_0 = stackIn_22_0;
                    stackIn_22_1 = new StringBuilder().append("kb.D(");
                    stackIn_20_1 = stackIn_22_1;
                    if (param0 == null) {
                        statePc = 22;
                    } else {
                        statePc = 20;
                    }
                    continue stateLoop;
                }
                case 20: {
                    stackIn_23_0 = (RuntimeException) ((Object) stackIn_20_0);
                    stackIn_23_1 = (StringBuilder) ((Object) stackIn_20_1);
                    stackIn_23_2 = "{...}";
                    statePc = 23;
                    continue stateLoop;
                }
                case 22: {
                    stackIn_23_0 = (RuntimeException) ((Object) stackIn_22_0);
                    stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
                    stackIn_23_2 = "null";
                    statePc = 23;
                    continue stateLoop;
                }
                case 23: {
                    stackIn_26_0 = (RuntimeException) ((Object) stackIn_23_0);
                    stackIn_24_0 = stackIn_26_0;
                    stackIn_26_1 = ((StringBuilder) (Object) stackIn_23_1).append(stackIn_23_2).append(',').append(param1).append(',');
                    stackIn_24_1 = stackIn_26_1;
                    if (param2 == null) {
                        statePc = 26;
                    } else {
                        statePc = 24;
                    }
                    continue stateLoop;
                }
                case 24: {
                    stackIn_27_0 = (RuntimeException) ((Object) stackIn_24_0);
                    stackIn_27_1 = (StringBuilder) ((Object) stackIn_24_1);
                    stackIn_27_2 = "{...}";
                    statePc = 27;
                    continue stateLoop;
                }
                case 26: {
                    stackIn_27_0 = (RuntimeException) ((Object) stackIn_26_0);
                    stackIn_27_1 = (StringBuilder) ((Object) stackIn_26_1);
                    stackIn_27_2 = "null";
                    statePc = 27;
                    continue stateLoop;
                }
                case 27: {
                    throw kg.a((Throwable) ((Object) stackIn_27_0), stackIn_27_2 + ')');
                }
                case 28: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static int a(boolean param0, int param1, int param2) {
        RuntimeException var3 = null;
        int stackIn_7_0 = 0;
        int stackIn_12_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (-2 != (param2 ^ -1)) {
                break L1;
              } else {
                if (gf.a(-122, param1)) {
                  stackIn_7_0 = 29;
                  decompiledRegionSelector0 = 0;
                  break L0;
                } else {
                  break L1;
                }
              }
            }
            L2: {
              if (!param0) {
                break L2;
              } else {
                kb.a((mg) null, -95);
                break L2;
              }
            }
            stackIn_12_0 = tn.field_l[param2];
            decompiledRegionSelector0 = 1;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw kg.a((Throwable) ((Object) var3), "kb.C(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_7_0;
        } else {
          return stackIn_12_0;
        }
    }

    final static void a(mg param0, int param1) {
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          L0: {
            L1: {
              if (param1 == 16865) {
                break L1;
              } else {
                field_b = (hm) null;
                break L1;
              }
            }
            lm.a(param1 + -16865);
            df.a(param0.field_B, param0.field_u, param0.field_z);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackIn_8_0 = (RuntimeException) (var2);

            stackIn_8_1 = new StringBuilder().append("kb.A(");

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
          throw kg.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ',' + param1 + ')');
        }
    }

    final static void a(km param0, km param1, qm param2, km param3, km param4, km param5, km param6, km param7, boolean param8, int param9, e param10, km param11) {
        int stackIn_4_0 = 0;
        String stackIn_27_0 = null;
        int stackIn_31_0 = 0;
        RuntimeException stackIn_43_0 = null;
        StringBuilder stackIn_43_1 = null;
        RuntimeException stackIn_45_0 = null;
        StringBuilder stackIn_45_1 = null;
        RuntimeException stackIn_46_0 = null;
        StringBuilder stackIn_46_1 = null;
        String stackIn_46_2 = null;
        RuntimeException stackIn_47_0 = null;
        StringBuilder stackIn_47_1 = null;
        RuntimeException stackIn_49_0 = null;
        StringBuilder stackIn_49_1 = null;
        RuntimeException stackIn_50_0 = null;
        StringBuilder stackIn_50_1 = null;
        String stackIn_50_2 = null;
        RuntimeException stackIn_51_0 = null;
        StringBuilder stackIn_51_1 = null;
        RuntimeException stackIn_53_0 = null;
        StringBuilder stackIn_53_1 = null;
        RuntimeException stackIn_54_0 = null;
        StringBuilder stackIn_54_1 = null;
        String stackIn_54_2 = null;
        RuntimeException stackIn_55_0 = null;
        StringBuilder stackIn_55_1 = null;
        RuntimeException stackIn_57_0 = null;
        StringBuilder stackIn_57_1 = null;
        RuntimeException stackIn_58_0 = null;
        StringBuilder stackIn_58_1 = null;
        String stackIn_58_2 = null;
        RuntimeException stackIn_59_0 = null;
        StringBuilder stackIn_59_1 = null;
        RuntimeException stackIn_61_0 = null;
        StringBuilder stackIn_61_1 = null;
        RuntimeException stackIn_62_0 = null;
        StringBuilder stackIn_62_1 = null;
        String stackIn_62_2 = null;
        RuntimeException stackIn_63_0 = null;
        StringBuilder stackIn_63_1 = null;
        RuntimeException stackIn_65_0 = null;
        StringBuilder stackIn_65_1 = null;
        RuntimeException stackIn_66_0 = null;
        StringBuilder stackIn_66_1 = null;
        String stackIn_66_2 = null;
        RuntimeException stackIn_67_0 = null;
        StringBuilder stackIn_67_1 = null;
        RuntimeException stackIn_69_0 = null;
        StringBuilder stackIn_69_1 = null;
        RuntimeException stackIn_70_0 = null;
        StringBuilder stackIn_70_1 = null;
        String stackIn_70_2 = null;
        RuntimeException stackIn_71_0 = null;
        StringBuilder stackIn_71_1 = null;
        RuntimeException stackIn_73_0 = null;
        StringBuilder stackIn_73_1 = null;
        RuntimeException stackIn_74_0 = null;
        StringBuilder stackIn_74_1 = null;
        String stackIn_74_2 = null;
        RuntimeException stackIn_75_0 = null;
        StringBuilder stackIn_75_1 = null;
        RuntimeException stackIn_77_0 = null;
        StringBuilder stackIn_77_1 = null;
        RuntimeException stackIn_78_0 = null;
        StringBuilder stackIn_78_1 = null;
        String stackIn_78_2 = null;
        RuntimeException stackIn_79_0 = null;
        StringBuilder stackIn_79_1 = null;
        RuntimeException stackIn_81_0 = null;
        StringBuilder stackIn_81_1 = null;
        RuntimeException stackIn_82_0 = null;
        StringBuilder stackIn_82_1 = null;
        String stackIn_82_2 = null;
        int statePc = 0;
        Throwable caughtException = null;
        mg var12 = null;
        RuntimeException var12_ref = null;
        int[] var13 = null;
        int[] var14 = null;
        int[] var15 = null;
        mg[] var16 = null;
        km var17 = null;
        int var18 = 0;
        String var19 = null;
        int var20 = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var20 = Virogrid.field_F ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        mk.field_eb[0] = 16764000;
                        mk.field_eb[1] = 6356832;
                        mk.field_eb[3] = 16736511;
                        mk.field_eb[4] = 16711935;
                        wh.field_d = param1;
                        mk.field_eb[2] = 9474303;
                        ch.field_e = param8;
                        hk.field_Ob = param10;
                        dm.field_w[3] = 16736511;
                        dm.field_w[0] = 16764000;
                        dm.field_w[2] = 16736352;
                        tm.field_n = 8421504;
                        dm.field_w[1] = 6356832;
                        mk.field_eb[4] = 16711935;
                        var12 = new mg(4, 4);
                        var13 = var12.field_B;
                        var14 = var12.field_B;
                        var12.field_B[15] = 7368816;
                        var15 = var12.field_B;
                        var14[5] = 7368816;
                        var15[8] = 7368816;
                        var13[2] = 7368816;
                        var16 = new mg[9];
                        var16[4] = var12;
                        we.field_c = new km(0L, param7);
                        wc.field_k = new km(0L, param6);
                        we.field_c.a(0, wc.field_k);
                        var17 = new km(0L, (km) null);
                        var17.field_W = new p();
                        ne.field_c = new um(0L, var17, param4, param2);
                        wc.field_k.a(0, ne.field_c);
                        qa.field_d = new km(0L, param5);
                        wc.field_k.a(0, qa.field_d);
                        di.field_n = new km(0L, param3);
                        di.field_n.field_C = hk.field_Ob;
                        qa.field_d.a(0, di.field_n);
                        qa.field_d.b((byte) 42);
                        wa.field_I = new km(0L, (km) null);
                        wa.field_I.field_vb = var16;
                        qa.field_d.a(0, wa.field_I);
                        ak.field_d = new km[5];
                        th.field_o = new km[5];
                        ln.field_i = new km[5];
                        og.field_g = new km[5];
                        var18 = 0;
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 42;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        if (-6 >= (var18 ^ -1)) {
                            statePc = 30;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 42;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        stackIn_31_0 = var18;
                        stackIn_4_0 = stackIn_31_0;
                        if (var20 != 0) {
                            statePc = 31;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 42;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        if (stackIn_4_0 == 0) {
                            statePc = 21;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 42;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 42;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        if (1 != var18) {
                            statePc = 13;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 42;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 42;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        if (ch.field_e) {
                            statePc = 20;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 42;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 42;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        if (2 == var18) {
                            statePc = 19;
                        } else {
                            statePc = 14;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 42;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        statePc = 16;
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 42;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        if (var20 == 0) {
                            statePc = 29;
                        } else {
                            statePc = 17;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 42;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        statePc = 19;
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 42;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        var19 = al.field_i;
                        if (var20 == 0) {
                            statePc = 28;
                        } else {
                            statePc = 20;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 42;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        var19 = mj.field_A;
                        if (var20 == 0) {
                            statePc = 28;
                        } else {
                            statePc = 21;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 42;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        if (!ch.field_e) {
                            statePc = 26;
                        } else {
                            statePc = 22;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 42;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        statePc = 24;
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 42;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        stackIn_27_0 = fj.field_a;
                        statePc = 27;
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 42;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        stackIn_27_0 = cm.field_i;
                        statePc = 27;
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 42;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        var19 = stackIn_27_0;
                        statePc = 28;
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 42;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        ln.field_i[var18] = new km(0L, param11);
                        ak.field_d[var18] = new km(0L, wh.field_d, var19);
                        og.field_g[var18] = new km(0L, (km) null);
                        og.field_g[var18].field_D = 1;
                        th.field_o[var18] = new km(0L, wh.field_d);
                        th.field_o[var18].field_D = 1;
                        ln.field_i[var18].a(0, ak.field_d[var18]);
                        ln.field_i[var18].a(0, og.field_g[var18]);
                        ln.field_i[var18].a(0, th.field_o[var18]);
                        ln.field_i[var18].b((byte) 42);
                        we.field_c.a(0, ln.field_i[var18]);
                        tn.field_h = tn.field_h + 1;
                        statePc = 29;
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 42;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        var18++;
                        if (var20 == 0) {
                            statePc = 2;
                        } else {
                            statePc = 30;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 42;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        af.field_d = new km(0L, param0);
                        af.field_d.field_V = ac.field_a;
                        we.field_c.a(0, af.field_d);
                        stackIn_31_0 = wl.b((byte) -101) ? 1 : 0;
                        statePc = 31;
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 42;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        if (stackIn_31_0 == 0) {
                            statePc = 37;
                        } else {
                            statePc = 32;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 42;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        if (wg.field_f) {
                            statePc = 37;
                        } else {
                            statePc = 33;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 42;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        statePc = 35;
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 42;
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        statePc = 38;
                        continue stateLoop;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 42;
                        continue stateLoop;
                    }
                }
                case 37: {
                    try {
                        fh.field_c = new ab(0, 0, 0, 0);
                        statePc = 38;
                        continue stateLoop;
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = 42;
                        continue stateLoop;
                    }
                }
                case 38: {
                    try {
                        if (param9 <= -5) {
                            statePc = 83;
                        } else {
                            statePc = 39;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = 42;
                        continue stateLoop;
                    }
                }
                case 39: {
                    try {
                        kb.a(true, 76, -61);
                        statePc = 83;
                        continue stateLoop;
                    } catch (Throwable stateCaught_39) {
                        caughtException = stateCaught_39;
                        statePc = 42;
                        continue stateLoop;
                    }
                }
                case 42: {
                    var12_ref = (RuntimeException) ((Object) caughtException);
                    stackIn_45_0 = (RuntimeException) (var12_ref);
                    stackIn_43_0 = stackIn_45_0;
                    stackIn_45_1 = new StringBuilder().append("kb.B(");
                    stackIn_43_1 = stackIn_45_1;
                    if (param0 == null) {
                        statePc = 45;
                    } else {
                        statePc = 43;
                    }
                    continue stateLoop;
                }
                case 43: {
                    stackIn_46_0 = (RuntimeException) ((Object) stackIn_43_0);
                    stackIn_46_1 = (StringBuilder) ((Object) stackIn_43_1);
                    stackIn_46_2 = "{...}";
                    statePc = 46;
                    continue stateLoop;
                }
                case 45: {
                    stackIn_46_0 = (RuntimeException) ((Object) stackIn_45_0);
                    stackIn_46_1 = (StringBuilder) ((Object) stackIn_45_1);
                    stackIn_46_2 = "null";
                    statePc = 46;
                    continue stateLoop;
                }
                case 46: {
                    stackIn_49_0 = (RuntimeException) ((Object) stackIn_46_0);
                    stackIn_47_0 = stackIn_49_0;
                    stackIn_49_1 = ((StringBuilder) (Object) stackIn_46_1).append(stackIn_46_2).append(',');
                    stackIn_47_1 = stackIn_49_1;
                    if (param1 == null) {
                        statePc = 49;
                    } else {
                        statePc = 47;
                    }
                    continue stateLoop;
                }
                case 47: {
                    stackIn_50_0 = (RuntimeException) ((Object) stackIn_47_0);
                    stackIn_50_1 = (StringBuilder) ((Object) stackIn_47_1);
                    stackIn_50_2 = "{...}";
                    statePc = 50;
                    continue stateLoop;
                }
                case 49: {
                    stackIn_50_0 = (RuntimeException) ((Object) stackIn_49_0);
                    stackIn_50_1 = (StringBuilder) ((Object) stackIn_49_1);
                    stackIn_50_2 = "null";
                    statePc = 50;
                    continue stateLoop;
                }
                case 50: {
                    stackIn_53_0 = (RuntimeException) ((Object) stackIn_50_0);
                    stackIn_51_0 = stackIn_53_0;
                    stackIn_53_1 = ((StringBuilder) (Object) stackIn_50_1).append(stackIn_50_2).append(',');
                    stackIn_51_1 = stackIn_53_1;
                    if (param2 == null) {
                        statePc = 53;
                    } else {
                        statePc = 51;
                    }
                    continue stateLoop;
                }
                case 51: {
                    stackIn_54_0 = (RuntimeException) ((Object) stackIn_51_0);
                    stackIn_54_1 = (StringBuilder) ((Object) stackIn_51_1);
                    stackIn_54_2 = "{...}";
                    statePc = 54;
                    continue stateLoop;
                }
                case 53: {
                    stackIn_54_0 = (RuntimeException) ((Object) stackIn_53_0);
                    stackIn_54_1 = (StringBuilder) ((Object) stackIn_53_1);
                    stackIn_54_2 = "null";
                    statePc = 54;
                    continue stateLoop;
                }
                case 54: {
                    stackIn_57_0 = (RuntimeException) ((Object) stackIn_54_0);
                    stackIn_55_0 = stackIn_57_0;
                    stackIn_57_1 = ((StringBuilder) (Object) stackIn_54_1).append(stackIn_54_2).append(',');
                    stackIn_55_1 = stackIn_57_1;
                    if (param3 == null) {
                        statePc = 57;
                    } else {
                        statePc = 55;
                    }
                    continue stateLoop;
                }
                case 55: {
                    stackIn_58_0 = (RuntimeException) ((Object) stackIn_55_0);
                    stackIn_58_1 = (StringBuilder) ((Object) stackIn_55_1);
                    stackIn_58_2 = "{...}";
                    statePc = 58;
                    continue stateLoop;
                }
                case 57: {
                    stackIn_58_0 = (RuntimeException) ((Object) stackIn_57_0);
                    stackIn_58_1 = (StringBuilder) ((Object) stackIn_57_1);
                    stackIn_58_2 = "null";
                    statePc = 58;
                    continue stateLoop;
                }
                case 58: {
                    stackIn_61_0 = (RuntimeException) ((Object) stackIn_58_0);
                    stackIn_59_0 = stackIn_61_0;
                    stackIn_61_1 = ((StringBuilder) (Object) stackIn_58_1).append(stackIn_58_2).append(',');
                    stackIn_59_1 = stackIn_61_1;
                    if (param4 == null) {
                        statePc = 61;
                    } else {
                        statePc = 59;
                    }
                    continue stateLoop;
                }
                case 59: {
                    stackIn_62_0 = (RuntimeException) ((Object) stackIn_59_0);
                    stackIn_62_1 = (StringBuilder) ((Object) stackIn_59_1);
                    stackIn_62_2 = "{...}";
                    statePc = 62;
                    continue stateLoop;
                }
                case 61: {
                    stackIn_62_0 = (RuntimeException) ((Object) stackIn_61_0);
                    stackIn_62_1 = (StringBuilder) ((Object) stackIn_61_1);
                    stackIn_62_2 = "null";
                    statePc = 62;
                    continue stateLoop;
                }
                case 62: {
                    stackIn_65_0 = (RuntimeException) ((Object) stackIn_62_0);
                    stackIn_63_0 = stackIn_65_0;
                    stackIn_65_1 = ((StringBuilder) (Object) stackIn_62_1).append(stackIn_62_2).append(',');
                    stackIn_63_1 = stackIn_65_1;
                    if (param5 == null) {
                        statePc = 65;
                    } else {
                        statePc = 63;
                    }
                    continue stateLoop;
                }
                case 63: {
                    stackIn_66_0 = (RuntimeException) ((Object) stackIn_63_0);
                    stackIn_66_1 = (StringBuilder) ((Object) stackIn_63_1);
                    stackIn_66_2 = "{...}";
                    statePc = 66;
                    continue stateLoop;
                }
                case 65: {
                    stackIn_66_0 = (RuntimeException) ((Object) stackIn_65_0);
                    stackIn_66_1 = (StringBuilder) ((Object) stackIn_65_1);
                    stackIn_66_2 = "null";
                    statePc = 66;
                    continue stateLoop;
                }
                case 66: {
                    stackIn_69_0 = (RuntimeException) ((Object) stackIn_66_0);
                    stackIn_67_0 = stackIn_69_0;
                    stackIn_69_1 = ((StringBuilder) (Object) stackIn_66_1).append(stackIn_66_2).append(',');
                    stackIn_67_1 = stackIn_69_1;
                    if (param6 == null) {
                        statePc = 69;
                    } else {
                        statePc = 67;
                    }
                    continue stateLoop;
                }
                case 67: {
                    stackIn_70_0 = (RuntimeException) ((Object) stackIn_67_0);
                    stackIn_70_1 = (StringBuilder) ((Object) stackIn_67_1);
                    stackIn_70_2 = "{...}";
                    statePc = 70;
                    continue stateLoop;
                }
                case 69: {
                    stackIn_70_0 = (RuntimeException) ((Object) stackIn_69_0);
                    stackIn_70_1 = (StringBuilder) ((Object) stackIn_69_1);
                    stackIn_70_2 = "null";
                    statePc = 70;
                    continue stateLoop;
                }
                case 70: {
                    stackIn_73_0 = (RuntimeException) ((Object) stackIn_70_0);
                    stackIn_71_0 = stackIn_73_0;
                    stackIn_73_1 = ((StringBuilder) (Object) stackIn_70_1).append(stackIn_70_2).append(',');
                    stackIn_71_1 = stackIn_73_1;
                    if (param7 == null) {
                        statePc = 73;
                    } else {
                        statePc = 71;
                    }
                    continue stateLoop;
                }
                case 71: {
                    stackIn_74_0 = (RuntimeException) ((Object) stackIn_71_0);
                    stackIn_74_1 = (StringBuilder) ((Object) stackIn_71_1);
                    stackIn_74_2 = "{...}";
                    statePc = 74;
                    continue stateLoop;
                }
                case 73: {
                    stackIn_74_0 = (RuntimeException) ((Object) stackIn_73_0);
                    stackIn_74_1 = (StringBuilder) ((Object) stackIn_73_1);
                    stackIn_74_2 = "null";
                    statePc = 74;
                    continue stateLoop;
                }
                case 74: {
                    stackIn_77_0 = (RuntimeException) ((Object) stackIn_74_0);
                    stackIn_75_0 = stackIn_77_0;
                    stackIn_77_1 = ((StringBuilder) (Object) stackIn_74_1).append(stackIn_74_2).append(',').append(param8).append(',').append(param9).append(',');
                    stackIn_75_1 = stackIn_77_1;
                    if (param10 == null) {
                        statePc = 77;
                    } else {
                        statePc = 75;
                    }
                    continue stateLoop;
                }
                case 75: {
                    stackIn_78_0 = (RuntimeException) ((Object) stackIn_75_0);
                    stackIn_78_1 = (StringBuilder) ((Object) stackIn_75_1);
                    stackIn_78_2 = "{...}";
                    statePc = 78;
                    continue stateLoop;
                }
                case 77: {
                    stackIn_78_0 = (RuntimeException) ((Object) stackIn_77_0);
                    stackIn_78_1 = (StringBuilder) ((Object) stackIn_77_1);
                    stackIn_78_2 = "null";
                    statePc = 78;
                    continue stateLoop;
                }
                case 78: {
                    stackIn_81_0 = (RuntimeException) ((Object) stackIn_78_0);
                    stackIn_79_0 = stackIn_81_0;
                    stackIn_81_1 = ((StringBuilder) (Object) stackIn_78_1).append(stackIn_78_2).append(',');
                    stackIn_79_1 = stackIn_81_1;
                    if (param11 == null) {
                        statePc = 81;
                    } else {
                        statePc = 79;
                    }
                    continue stateLoop;
                }
                case 79: {
                    stackIn_82_0 = (RuntimeException) ((Object) stackIn_79_0);
                    stackIn_82_1 = (StringBuilder) ((Object) stackIn_79_1);
                    stackIn_82_2 = "{...}";
                    statePc = 82;
                    continue stateLoop;
                }
                case 81: {
                    stackIn_82_0 = (RuntimeException) ((Object) stackIn_81_0);
                    stackIn_82_1 = (StringBuilder) ((Object) stackIn_81_1);
                    stackIn_82_2 = "null";
                    statePc = 82;
                    continue stateLoop;
                }
                case 82: {
                    throw kg.a((Throwable) ((Object) stackIn_82_0), stackIn_82_2 + ')');
                }
                case 83: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    public static void a(int param0) {
        try {
            field_a = null;
            int var1_int = 77 / ((param0 - 0) / 35);
            field_d = null;
            field_b = null;
        } catch (RuntimeException runtimeException) {
            throw kg.a((Throwable) ((Object) runtimeException), "kb.E(" + param0 + ')');
        }
    }

    static {
        field_d = new int[]{2, 18, 14, 15, 6, 5, 16, 17, 9};
        field_a = "OK";
    }
}
