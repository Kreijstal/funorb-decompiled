/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kc {
    static int field_a;
    static String field_b;
    static int field_c;

    public static void a(int param0) {
        int var1 = 7 % ((79 - param0) / 43);
        field_b = null;
    }

    final static void a(java.awt.Component param0, int param1) {
        param0.removeKeyListener(je.field_j);
        if (param1 != 0) {
            return;
        }
        try {
            param0.removeFocusListener(je.field_j);
            ii.field_c = -1;
        } catch (RuntimeException runtimeException) {
            throw t.a((Throwable) ((Object) runtimeException), "kc.D(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final static void a(int param0, byte param1) {
        int var2_int = 0;
        int var3 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        var3 = Geoblox.field_C;
        try {
          L0: {
            sh.a(0, param0, ok.field_b, bd.field_a, (byte) 121, md.field_c, true);
            if (param1 == -98) {
              var2_int = 0;
              L1: while (true) {
                L2: {
                  if (md.field_c > var2_int) {
                    qi.field_i[param0 + var2_int] = var2_int;
                    var2_int++;
                    if (var3 != 0) {
                      break L2;
                    } else {
                      if (var3 == 0) {
                        continue L1;
                      }
                    }
                  }
                  sh.a(param0, param0 + param0, qg.field_a, va.field_b, (byte) 112, md.field_c - -param0, false);
                }
                if (param0 < md.field_c) {
                  md.field_c = param0;
                }
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              decompiledRegionSelector0 = 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw t.a((Throwable) ((Object) var2), "kc.A(" + param0 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final static void b(int param0) {
        tf stackIn_4_0 = null;
        tf stackIn_12_0 = null;
        boolean stackIn_15_0 = false;
        ja stackIn_20_0 = null;
        boolean stackIn_22_0 = false;
        ja stackIn_28_0 = null;
        ja stackIn_31_0 = null;
        ja stackIn_31_1 = null;
        ja stackIn_38_0 = null;
        ja stackIn_38_1 = null;
        int stackIn_44_0 = 0;
        int stackIn_48_0 = 0;
        ja stackIn_51_0 = null;
        ja stackIn_51_1 = null;
        int stackIn_56_0 = 0;
        int stackIn_86_0 = 0;
        int stackIn_86_1 = 0;
        int stackIn_86_2 = 0;
        int stackIn_87_0 = 0;
        int stackIn_87_1 = 0;
        int stackIn_87_2 = 0;
        int stackIn_88_0 = 0;
        int stackIn_88_1 = 0;
        int stackIn_88_2 = 0;
        int stackIn_89_0 = 0;
        int stackIn_89_1 = 0;
        int stackIn_89_2 = 0;
        int stackIn_90_0 = 0;
        int stackIn_90_1 = 0;
        int stackIn_90_2 = 0;
        int stackIn_90_3 = 0;
        gh stackIn_107_0 = null;
        gh stackIn_108_0 = null;
        gh stackIn_109_0 = null;
        gh stackIn_110_0 = null;
        gh stackIn_111_0 = null;
        gh stackIn_112_0 = null;
        int stackIn_112_1 = 0;
        boolean stackOut_14_0;
        boolean stackOut_21_0;
        int statePc = 0;
        Throwable caughtException = null;
        ja var1 = null;
        int var1_int = 0;
        RuntimeException var1_ref = null;
        ja var2_ref_ja = null;
        int var2 = 0;
        float var3_float = 0.0f;
        int var3_int = 0;
        ja var3 = null;
        int var4_int = 0;
        float var4_float = 0.0f;
        ja var4 = null;
        ja var5_ref_ja = null;
        double var5 = 0.0;
        int var6_int = 0;
        ja var6 = null;
        ja var7 = null;
        int var7_int = 0;
        ja var8 = null;
        int var9 = 0;
        ja var10 = null;
        wd var11 = null;
        ja var12 = null;
        wd var13 = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var9 = Geoblox.field_C;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        fa.field_a = false;
                        var1 = (ja) ((Object) ji.field_r.g(0));
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 119;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        if (var1 == null) {
                            statePc = 10;
                            continue stateLoop;
                        } else {
                            /* Inlined CFG state: 3. */
                            {
                                stackIn_12_0 = var1.field_K;
                                stackIn_4_0 = stackIn_12_0;
                                if (var9 != 0) {
                                    statePc = 12;
                                    continue stateLoop;
                                } else {
                                    /* Inlined CFG state: 4. */
                                    {
                                        if (stackIn_4_0 == a.field_d) {
                                            statePc = 8;
                                            continue stateLoop;
                                        } else {
                                            /* Inlined CFG state: 5. */
                                            {
                                                if (var1.field_B) {
                                                    /* Inlined CFG state: 7. */
                                                    {
                                                        fa.field_a = true;
                                                        if (var9 == 0) {
                                                            statePc = 9;
                                                        } else {
                                                            statePc = 8;
                                                        }
                                                        continue stateLoop;
                                                    }
                                                } else {
                                                    /* Inlined CFG state: 6. */
                                                    {
                                                        statePc = 9;
                                                        continue stateLoop;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 119;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        var1.j(30383);
                        var1.k(2);
                        var1.a(false);
                        var1.a((byte) 54);
                        a.field_d.a(-80, var1);
                        el.field_o.field_F = true;
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 119;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        var1.field_K = null;
                        var1 = (ja) ((Object) ji.field_r.d(1));
                        if (var9 == 0) {
                            statePc = 2;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 119;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        if (!re.field_j) {
                            statePc = 61;
                            continue stateLoop;
                        } else {
                            /* Inlined CFG state: 11. */
                            {
                                stackIn_12_0 = a.field_d;
                                statePc = 12;
                                continue stateLoop;
                            }
                        }
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 119;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        var1 = (ja) ((Object) ((tf) (Object) stackIn_12_0).g(0));
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 119;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        if (var1 == null) {
                            statePc = 55;
                            continue stateLoop;
                        } else {
                            /* Inlined CFG state: 14. */
                            {
                                stackOut_14_0 = pk.field_o[var1.field_H];
                                stackIn_56_0 = stackOut_14_0 ? 1 : 0;
                                stackIn_15_0 = stackOut_14_0;
                                if (var9 != 0) {
                                    statePc = 56;
                                    continue stateLoop;
                                } else {
                                    /* Inlined CFG state: 15. */
                                    {
                                        if (!stackIn_15_0) {
                                            statePc = 18;
                                            continue stateLoop;
                                        } else {
                                            /* Inlined CFG state: 16. */
                                            {
                                                if (var9 == 0) {
                                                    statePc = 54;
                                                    continue stateLoop;
                                                } else {
                                                    /* Inlined CFG state: 17. */
                                                    {
                                                        statePc = 18;
                                                        continue stateLoop;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 119;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        var11 = new wd();
                        var13 = new wd();
                        var11.a(var1, false);
                        var4_int = 1;
                        statePc = 19;
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 119;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        stackIn_20_0 = (ja) ((Object) var11.a(true));
                        statePc = 20;
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 119;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        var10 = stackIn_20_0;
                        var12 = var10;
                        var5_ref_ja = var12;
                        if (var12 == null) {
                            statePc = 43;
                        } else {
                            statePc = 21;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 119;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        pk.field_o[var10.field_H] = true;
                        stackOut_21_0 = var12.field_t;
                        stackIn_44_0 = stackOut_21_0 ? 1 : 0;
                        stackIn_22_0 = stackOut_21_0;
                        if (var9 != 0) {
                            statePc = 44;
                            continue stateLoop;
                        } else {
                            /* Inlined CFG state: 22. */
                            {
                                if (stackIn_22_0) {
                                    /* Inlined CFG state: 24. */
                                    {
                                        var4_int = 0;
                                        if (var9 == 0) {
                                            statePc = 43;
                                        } else {
                                            statePc = 25;
                                        }
                                        continue stateLoop;
                                    }
                                } else {
                                    /* Inlined CFG state: 23. */
                                    {
                                        statePc = 25;
                                        continue stateLoop;
                                    }
                                }
                            }
                        }
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 119;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        var13.a(var12, false);
                        var6_int = 0;
                        statePc = 26;
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 119;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        if (var6_int >= var12.field_L) {
                            statePc = 42;
                            continue stateLoop;
                        } else {
                            /* Inlined CFG state: 27. */
                            {
                                var7 = var10.field_n[var6_int];
                                stackIn_20_0 = (ja) ((Object) var13.c((byte) 121));
                                stackIn_28_0 = stackIn_20_0;
                                if (var9 != 0) {
                                    statePc = 20;
                                } else {
                                    statePc = 28;
                                }
                                continue stateLoop;
                            }
                        }
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 119;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        var8 = stackIn_28_0;
                        statePc = 29;
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 119;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        if (var8 == null) {
                            statePc = 35;
                            continue stateLoop;
                        } else {
                            /* Inlined CFG state: 30. */
                            {
                                stackIn_51_0 = (ja) (var8);
                                stackIn_31_0 = stackIn_51_0;
                                stackIn_51_1 = (ja) (var7);
                                stackIn_31_1 = stackIn_51_1;
                                if (var9 != 0) {
                                    statePc = 51;
                                    continue stateLoop;
                                } else {
                                    /* Inlined CFG state: 31. */
                                    {
                                        if (stackIn_31_0 != stackIn_31_1) {
                                            statePc = 34;
                                            continue stateLoop;
                                        } else {
                                            /* Inlined CFG state: 32. */
                                            {
                                                if (var9 == 0) {
                                                    statePc = 41;
                                                    continue stateLoop;
                                                } else {
                                                    /* Inlined CFG state: 33. */
                                                    {
                                                        statePc = 34;
                                                        continue stateLoop;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 119;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        var8 = (ja) ((Object) var13.a(-45));
                        if (var9 == 0) {
                            statePc = 29;
                        } else {
                            statePc = 35;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 119;
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        var8 = (ja) ((Object) var11.c((byte) 121));
                        statePc = 36;
                        continue stateLoop;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 119;
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        if (var8 == null) {
                            statePc = 40;
                            continue stateLoop;
                        } else {
                            /* Inlined CFG state: 37. */
                            {
                                stackIn_51_0 = (ja) (var8);
                                stackIn_38_0 = stackIn_51_0;
                                stackIn_51_1 = (ja) (var7);
                                stackIn_38_1 = stackIn_51_1;
                                if (var9 != 0) {
                                    statePc = 51;
                                    continue stateLoop;
                                } else {
                                    /* Inlined CFG state: 38. */
                                    {
                                        if (stackIn_38_0 == stackIn_38_1) {
                                            statePc = 41;
                                            continue stateLoop;
                                        } else {
                                            /* Inlined CFG state: 39. */
                                            {
                                                var8 = (ja) ((Object) var11.a(54));
                                                if (var9 == 0) {
                                                    statePc = 36;
                                                } else {
                                                    statePc = 40;
                                                }
                                                continue stateLoop;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = 119;
                        continue stateLoop;
                    }
                }
                case 40: {
                    try {
                        var11.a(var7, false);
                        statePc = 41;
                        continue stateLoop;
                    } catch (Throwable stateCaught_40) {
                        caughtException = stateCaught_40;
                        statePc = 119;
                        continue stateLoop;
                    }
                }
                case 41: {
                    try {
                        var6_int++;
                        if (var9 == 0) {
                            statePc = 26;
                        } else {
                            statePc = 42;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_41) {
                        caughtException = stateCaught_41;
                        statePc = 119;
                        continue stateLoop;
                    }
                }
                case 42: {
                    try {
                        if (var9 == 0) {
                            statePc = 19;
                        } else {
                            statePc = 43;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_42) {
                        caughtException = stateCaught_42;
                        statePc = 119;
                        continue stateLoop;
                    }
                }
                case 43: {
                    try {
                        stackIn_44_0 = var4_int;
                        statePc = 44;
                        continue stateLoop;
                    } catch (Throwable stateCaught_43) {
                        caughtException = stateCaught_43;
                        statePc = 119;
                        continue stateLoop;
                    }
                }
                case 44: {
                    try {
                        if (stackIn_44_0 == 0) {
                            statePc = 54;
                            continue stateLoop;
                        } else {
                            /* Inlined CFG state: 45. */
                            {
                                var5_ref_ja = (ja) ((Object) var13.a(true));
                                statePc = 46;
                                continue stateLoop;
                            }
                        }
                    } catch (Throwable stateCaught_44) {
                        caughtException = stateCaught_44;
                        statePc = 119;
                        continue stateLoop;
                    }
                }
                case 46: {
                    try {
                        if (var5_ref_ja == null) {
                            statePc = 54;
                            continue stateLoop;
                        } else {
                            /* Inlined CFG state: 47. */
                            {
                                var5_ref_ja.field_K = ji.field_r;
                                var5_ref_ja.field_t = false;
                                var5_ref_ja.field_B = true;
                                fa.field_a = true;
                                stackIn_56_0 = 0;
                                stackIn_48_0 = stackIn_56_0;
                                if (var9 != 0) {
                                    statePc = 56;
                                    continue stateLoop;
                                } else {
                                    /* Inlined CFG state: 48. */
                                    {
                                        var6_int = stackIn_48_0;
                                        statePc = 49;
                                        continue stateLoop;
                                    }
                                }
                            }
                        }
                    } catch (Throwable stateCaught_46) {
                        caughtException = stateCaught_46;
                        statePc = 119;
                        continue stateLoop;
                    }
                }
                case 49: {
                    try {
                        if (var6_int >= var5_ref_ja.field_L) {
                            statePc = 53;
                            continue stateLoop;
                        } else {
                            /* Inlined CFG state: 50. */
                            {
                                stackIn_51_0 = var5_ref_ja.field_n[var6_int];
                                stackIn_51_1 = (ja) (var5_ref_ja);
                                statePc = 51;
                                continue stateLoop;
                            }
                        }
                    } catch (Throwable stateCaught_49) {
                        caughtException = stateCaught_49;
                        statePc = 119;
                        continue stateLoop;
                    }
                }
                case 51: {
                    try {
                        ((ja) (Object) stackIn_51_0).a(stackIn_51_1, 0);
                        var6_int++;
                        if (var9 != 0) {
                            statePc = 46;
                            continue stateLoop;
                        } else {
                            /* Inlined CFG state: 52. */
                            {
                                if (var9 == 0) {
                                    statePc = 49;
                                } else {
                                    statePc = 53;
                                }
                                continue stateLoop;
                            }
                        }
                    } catch (Throwable stateCaught_51) {
                        caughtException = stateCaught_51;
                        statePc = 119;
                        continue stateLoop;
                    }
                }
                case 53: {
                    try {
                        var6 = var5_ref_ja;
                        var7 = var5_ref_ja;
                        var5_ref_ja.field_L = 0;
                        var6.field_N = 0;
                        var7.field_m = 0;
                        var5_ref_ja = (ja) ((Object) var13.a(true));
                        if (var9 == 0) {
                            statePc = 46;
                        } else {
                            statePc = 54;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_53) {
                        caughtException = stateCaught_53;
                        statePc = 119;
                        continue stateLoop;
                    }
                }
                case 54: {
                    try {
                        var1 = (ja) ((Object) a.field_d.d(1));
                        if (var9 == 0) {
                            statePc = 13;
                        } else {
                            statePc = 55;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_54) {
                        caughtException = stateCaught_54;
                        statePc = 119;
                        continue stateLoop;
                    }
                }
                case 55: {
                    try {
                        re.field_j = false;
                        el.field_o.field_B = true;
                        stackIn_56_0 = 0;
                        statePc = 56;
                        continue stateLoop;
                    } catch (Throwable stateCaught_55) {
                        caughtException = stateCaught_55;
                        statePc = 119;
                        continue stateLoop;
                    }
                }
                case 56: {
                    try {
                        var1_int = stackIn_56_0;
                        statePc = 57;
                        continue stateLoop;
                    } catch (Throwable stateCaught_56) {
                        caughtException = stateCaught_56;
                        statePc = 119;
                        continue stateLoop;
                    }
                }
                case 57: {
                    try {
                        if (1000 <= var1_int) {
                            statePc = 61;
                            continue stateLoop;
                        } else {
                            /* Inlined CFG state: 58. */
                            {
                                pk.field_o[var1_int] = false;
                                var1_int++;
                                if (var9 != 0) {
                                    statePc = 62;
                                    continue stateLoop;
                                } else {
                                    /* Inlined CFG state: 59. */
                                    {
                                        if (var9 == 0) {
                                            statePc = 57;
                                            continue stateLoop;
                                        } else {
                                            /* Inlined CFG state: 60. */
                                            {
                                                statePc = 61;
                                                continue stateLoop;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    } catch (Throwable stateCaught_57) {
                        caughtException = stateCaught_57;
                        statePc = 119;
                        continue stateLoop;
                    }
                }
                case 61: {
                    try {
                        var1_int = 0;
                        statePc = 62;
                        continue stateLoop;
                    } catch (Throwable stateCaught_61) {
                        caughtException = stateCaught_61;
                        statePc = 119;
                        continue stateLoop;
                    }
                }
                case 62: {
                    try {
                        var2_ref_ja = (ja) ((Object) a.field_d.g(0));
                        statePc = 63;
                        continue stateLoop;
                    } catch (Throwable stateCaught_62) {
                        caughtException = stateCaught_62;
                        statePc = 119;
                        continue stateLoop;
                    }
                }
                case 63: {
                    try {
                        if (var2_ref_ja == null) {
                            statePc = 98;
                            continue stateLoop;
                        } else {
                            /* Inlined CFG state: 64. */
                            {
                                if (null != var2_ref_ja.field_K) {
                                    statePc = 68;
                                    continue stateLoop;
                                } else {
                                    /* Inlined CFG state: 65. */
                                    {
                                        if (!w.field_f) {
                                            statePc = 97;
                                            continue stateLoop;
                                        } else {
                                            /* Inlined CFG state: 66. */
                                            {
                                                if (var2_ref_ja.field_t) {
                                                    statePc = 68;
                                                    continue stateLoop;
                                                } else {
                                                    /* Inlined CFG state: 67. */
                                                    {
                                                        statePc = 97;
                                                        continue stateLoop;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    } catch (Throwable stateCaught_63) {
                        caughtException = stateCaught_63;
                        statePc = 119;
                        continue stateLoop;
                    }
                }
                case 68: {
                    try {
                        re.field_j = true;
                        var2_ref_ja.a(false);
                        var2_ref_ja.a((byte) 100);
                        el.field_o.field_F = true;
                        var2_ref_ja.f(92);
                        if (ji.field_r != var2_ref_ja.field_K) {
                            statePc = 75;
                            continue stateLoop;
                        } else {
                            /* Inlined CFG state: 69. */
                            {
                                var2_ref_ja.a(-el.field_o.field_J, -117);
                                var3_float = -var2_ref_ja.field_o + 320.0f;
                                var4_float = -var2_ref_ja.field_v + 240.0f;
                                var5 = (double)og.field_r / Math.sqrt((double)(var4_float * var4_float + var3_float * var3_float));
                                var3_float = (float)((double)var3_float * var5);
                                var4_float = (float)((double)var4_float * var5);
                                var2_ref_ja.field_F = var4_float;
                                var2_ref_ja.field_w = var3_float;
                                var7_int = 0;
                                statePc = 70;
                                continue stateLoop;
                            }
                        }
                    } catch (Throwable stateCaught_68) {
                        caughtException = stateCaught_68;
                        statePc = 119;
                        continue stateLoop;
                    }
                }
                case 70: {
                    try {
                        if (var2_ref_ja.field_L <= var7_int) {
                            statePc = 74;
                            continue stateLoop;
                        } else {
                            /* Inlined CFG state: 71. */
                            {
                                var2_ref_ja.field_n[var7_int].a(var2_ref_ja, 0);
                                var7_int++;
                                if (var9 != 0) {
                                    statePc = 96;
                                    continue stateLoop;
                                } else {
                                    /* Inlined CFG state: 72. */
                                    {
                                        if (var9 == 0) {
                                            statePc = 70;
                                            continue stateLoop;
                                        } else {
                                            /* Inlined CFG state: 73. */
                                            {
                                                statePc = 74;
                                                continue stateLoop;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    } catch (Throwable stateCaught_70) {
                        caughtException = stateCaught_70;
                        statePc = 119;
                        continue stateLoop;
                    }
                }
                case 74: {
                    try {
                        var7 = var2_ref_ja;
                        var8 = var2_ref_ja;
                        var2_ref_ja.field_L = 0;
                        var7.field_N = 0;
                        var8.field_m = 0;
                        ji.field_r.a(-36, var2_ref_ja);
                        if (var9 == 0) {
                            statePc = 95;
                        } else {
                            statePc = 75;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_74) {
                        caughtException = stateCaught_74;
                        statePc = 119;
                        continue stateLoop;
                    }
                }
                case 75: {
                    try {
                        if (var2_ref_ja.field_K == bh.field_c) {
                            statePc = 78;
                            continue stateLoop;
                        } else {
                            /* Inlined CFG state: 76. */
                            {
                                if (w.field_f) {
                                    statePc = 78;
                                    continue stateLoop;
                                } else {
                                    /* Inlined CFG state: 77. */
                                    {
                                        statePc = 95;
                                        continue stateLoop;
                                    }
                                }
                            }
                        }
                    } catch (Throwable stateCaught_75) {
                        caughtException = stateCaught_75;
                        statePc = 119;
                        continue stateLoop;
                    }
                }
                case 78: {
                    try {
                        var3_int = 0;
                        statePc = 79;
                        continue stateLoop;
                    } catch (Throwable stateCaught_78) {
                        caughtException = stateCaught_78;
                        statePc = 119;
                        continue stateLoop;
                    }
                }
                case 79: {
                    try {
                        if (var3_int >= var2_ref_ja.field_L) {
                            statePc = 83;
                            continue stateLoop;
                        } else {
                            /* Inlined CFG state: 80. */
                            {
                                var2_ref_ja.field_n[var3_int].a(var2_ref_ja, 0);
                                var2_ref_ja.field_n[var3_int].k(2);
                                var3_int++;
                                if (var9 != 0) {
                                    statePc = 96;
                                    continue stateLoop;
                                } else {
                                    /* Inlined CFG state: 81. */
                                    {
                                        if (var9 == 0) {
                                            statePc = 79;
                                            continue stateLoop;
                                        } else {
                                            /* Inlined CFG state: 82. */
                                            {
                                                statePc = 83;
                                                continue stateLoop;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    } catch (Throwable stateCaught_79) {
                        caughtException = stateCaught_79;
                        statePc = 119;
                        continue stateLoop;
                    }
                }
                case 83: {
                    try {
                        var3 = var2_ref_ja;
                        var2_ref_ja.field_L = 0;
                        var4 = var2_ref_ja;
                        var3.field_N = 0;
                        var4.field_m = 0;
                        var2_ref_ja.field_r = 50;
                        bh.field_c.a(-100, var2_ref_ja);
                        var2_ref_ja.field_G = 0;
                        if (!var2_ref_ja.field_t) {
                            statePc = 91;
                        } else {
                            statePc = 84;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_83) {
                        caughtException = stateCaught_83;
                        statePc = 119;
                        continue stateLoop;
                    }
                }
                case 84: {
                    try {
                        if (!w.field_f) {
                            statePc = 91;
                            continue stateLoop;
                        } else {
                            /* Inlined CFG state: 85. */
                            {
                                stackIn_88_0 = (int)var2_ref_ja.field_v;
                                stackIn_86_0 = stackIn_88_0;
                                stackIn_88_1 = (int)var2_ref_ja.field_o;
                                stackIn_86_1 = stackIn_88_1;
                                stackIn_88_2 = 117;
                                stackIn_86_2 = stackIn_88_2;
                                if ((var2_ref_ja.field_z ^ -1) == -5) {
                                    statePc = 88;
                                    continue stateLoop;
                                } else {
                                    /* Inlined CFG state: 86. */
                                    {
                                        stackIn_89_0 = stackIn_86_0;
                                        stackIn_87_0 = stackIn_89_0;
                                        stackIn_89_1 = stackIn_86_1;
                                        stackIn_87_1 = stackIn_89_1;
                                        stackIn_89_2 = stackIn_86_2;
                                        stackIn_87_2 = stackIn_89_2;
                                        if ((var2_ref_ja.field_z ^ -1) != -4) {
                                            /* Inlined CFG state: 89. */
                                            {
                                                stackIn_90_0 = stackIn_89_0;
                                                stackIn_90_1 = stackIn_89_1;
                                                stackIn_90_2 = stackIn_89_2;
                                                stackIn_90_3 = 10;
                                                statePc = 90;
                                                continue stateLoop;
                                            }
                                        } else {
                                            /* Inlined CFG state: 87. */
                                            {
                                                stackIn_88_0 = stackIn_87_0;
                                                stackIn_88_1 = stackIn_87_1;
                                                stackIn_88_2 = stackIn_87_2;
                                                statePc = 88;
                                                continue stateLoop;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    } catch (Throwable stateCaught_84) {
                        caughtException = stateCaught_84;
                        statePc = 119;
                        continue stateLoop;
                    }
                }
                case 88: {
                    try {
                        stackIn_90_0 = stackIn_88_0;
                        stackIn_90_1 = stackIn_88_1;
                        stackIn_90_2 = stackIn_88_2;
                        stackIn_90_3 = 100;
                        statePc = 90;
                        continue stateLoop;
                    } catch (Throwable stateCaught_88) {
                        caughtException = stateCaught_88;
                        statePc = 119;
                        continue stateLoop;
                    }
                }
                case 90: {
                    try {
                        ld.a(stackIn_90_0, stackIn_90_1, stackIn_90_2, stackIn_90_3);
                        statePc = 91;
                        continue stateLoop;
                    } catch (Throwable stateCaught_90) {
                        caughtException = stateCaught_90;
                        statePc = 119;
                        continue stateLoop;
                    }
                }
                case 91: {
                    try {
                        if (4 == var2_ref_ja.field_z) {
                            statePc = 94;
                            continue stateLoop;
                        } else {
                            /* Inlined CFG state: 92. */
                            {
                                var2_ref_ja.a(320, var2_ref_ja.field_C, var2_ref_ja.field_M, 5);
                                if (var9 == 0) {
                                    statePc = 95;
                                    continue stateLoop;
                                } else {
                                    /* Inlined CFG state: 93. */
                                    {
                                        statePc = 94;
                                        continue stateLoop;
                                    }
                                }
                            }
                        }
                    } catch (Throwable stateCaught_91) {
                        caughtException = stateCaught_91;
                        statePc = 119;
                        continue stateLoop;
                    }
                }
                case 94: {
                    try {
                        var2_ref_ja.a(320, var2_ref_ja.field_C, var2_ref_ja.field_M, 7);
                        var1_int++;
                        rb.field_b = rb.field_b + 1;
                        statePc = 95;
                        continue stateLoop;
                    } catch (Throwable stateCaught_94) {
                        caughtException = stateCaught_94;
                        statePc = 119;
                        continue stateLoop;
                    }
                }
                case 95: {
                    try {
                        var2_ref_ja.field_K = null;
                        statePc = 96;
                        continue stateLoop;
                    } catch (Throwable stateCaught_95) {
                        caughtException = stateCaught_95;
                        statePc = 119;
                        continue stateLoop;
                    }
                }
                case 96: {
                    try {
                        el.field_o.field_F = true;
                        statePc = 97;
                        continue stateLoop;
                    } catch (Throwable stateCaught_96) {
                        caughtException = stateCaught_96;
                        statePc = 119;
                        continue stateLoop;
                    }
                }
                case 97: {
                    try {
                        var2_ref_ja = (ja) ((Object) a.field_d.d(1));
                        if (var9 == 0) {
                            statePc = 63;
                        } else {
                            statePc = 98;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_97) {
                        caughtException = stateCaught_97;
                        statePc = 119;
                        continue stateLoop;
                    }
                }
                case 98: {
                    try {
                        var2 = -23 / ((param0 - 69) / 46);
                        var3 = (ja) ((Object) bh.field_c.g(0));
                        statePc = 99;
                        continue stateLoop;
                    } catch (Throwable stateCaught_98) {
                        caughtException = stateCaught_98;
                        statePc = 119;
                        continue stateLoop;
                    }
                }
                case 99: {
                    try {
                        if (var3 == null) {
                            statePc = 104;
                            continue stateLoop;
                        } else {
                            /* Inlined CFG state: 100. */
                            {
                                if (var9 != 0) {
                                    statePc = 106;
                                    continue stateLoop;
                                } else {
                                    /* Inlined CFG state: 101. */
                                    {
                                        if (ra.field_a != var3.field_K) {
                                            statePc = 103;
                                            continue stateLoop;
                                        } else {
                                            /* Inlined CFG state: 102. */
                                            {
                                                var3.a(false);
                                                var3.a((byte) 51);
                                                ra.field_a.a(-44, var3);
                                                var3.field_K = null;
                                                statePc = 103;
                                                continue stateLoop;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    } catch (Throwable stateCaught_99) {
                        caughtException = stateCaught_99;
                        statePc = 119;
                        continue stateLoop;
                    }
                }
                case 103: {
                    try {
                        var3 = (ja) ((Object) bh.field_c.d(1));
                        if (var9 == 0) {
                            statePc = 99;
                        } else {
                            statePc = 104;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_103) {
                        caughtException = stateCaught_103;
                        statePc = 119;
                        continue stateLoop;
                    }
                }
                case 104: {
                    try {
                        if (!w.field_f) {
                            statePc = 106;
                            continue stateLoop;
                        } else {
                            /* Inlined CFG state: 105. */
                            {
                                jc.a(3, false);
                                jl.field_t = false;
                                statePc = 106;
                                continue stateLoop;
                            }
                        }
                    } catch (Throwable stateCaught_104) {
                        caughtException = stateCaught_104;
                        statePc = 119;
                        continue stateLoop;
                    }
                }
                case 106: {
                    try {
                        stackIn_110_0 = el.field_o;
                        stackIn_107_0 = stackIn_110_0;
                        if (el.field_o.field_F) {
                            statePc = 110;
                            continue stateLoop;
                        } else {
                            /* Inlined CFG state: 107. */
                            {
                                stackIn_110_0 = (gh) ((Object) stackIn_107_0);
                                stackIn_108_0 = stackIn_110_0;
                                if (ab.field_f) {
                                    statePc = 110;
                                    continue stateLoop;
                                } else {
                                    /* Inlined CFG state: 108. */
                                    {
                                        stackIn_111_0 = (gh) ((Object) stackIn_108_0);
                                        stackIn_109_0 = stackIn_111_0;
                                        if (!w.field_f) {
                                            /* Inlined CFG state: 111. */
                                            {
                                                stackIn_112_0 = (gh) ((Object) stackIn_111_0);
                                                stackIn_112_1 = 0;
                                                statePc = 112;
                                                continue stateLoop;
                                            }
                                        } else {
                                            /* Inlined CFG state: 109. */
                                            {
                                                stackIn_110_0 = (gh) ((Object) stackIn_109_0);
                                                statePc = 110;
                                                continue stateLoop;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    } catch (Throwable stateCaught_106) {
                        caughtException = stateCaught_106;
                        statePc = 119;
                        continue stateLoop;
                    }
                }
                case 110: {
                    try {
                        stackIn_112_0 = (gh) ((Object) stackIn_110_0);
                        stackIn_112_1 = 1;
                        statePc = 112;
                        continue stateLoop;
                    } catch (Throwable stateCaught_110) {
                        caughtException = stateCaught_110;
                        statePc = 119;
                        continue stateLoop;
                    }
                }
                case 112: {
                    try {
                        stackIn_112_0.field_F = stackIn_112_1 != 0;
                        w.field_f = false;
                        if (-4 >= (var1_int ^ -1)) {
                            /* Inlined CFG state: 114. */
                            {
                                ra.a(255 ^ fe.field_f, -88, fe.field_f);
                                statePc = 115;
                                continue stateLoop;
                            }
                        } else {
                            /* Inlined CFG state: 113. */
                            {
                                statePc = 115;
                                continue stateLoop;
                            }
                        }
                    } catch (Throwable stateCaught_112) {
                        caughtException = stateCaught_112;
                        statePc = 119;
                        continue stateLoop;
                    }
                }
                case 115: {
                    try {
                        if (rb.field_b >= 5) {
                            /* Inlined CFG state: 117. */
                            {
                                ra.a(255 ^ vd.field_p, -83, vd.field_p);
                                statePc = 120;
                                continue stateLoop;
                            }
                        } else {
                            /* Inlined CFG state: 116. */
                            {
                                statePc = 120;
                                continue stateLoop;
                            }
                        }
                    } catch (Throwable stateCaught_115) {
                        caughtException = stateCaught_115;
                        statePc = 119;
                        continue stateLoop;
                    }
                }
                case 119: {
                    var1_ref = (RuntimeException) ((Object) caughtException);
                    throw t.a((Throwable) ((Object) var1_ref), "kc.C(" + param0 + ')');
                }
                case 120: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    static {
        field_c = 0;
        field_b = "Names can only contain letters, numbers, spaces and underscores";
        field_a = 0;
    }
}
