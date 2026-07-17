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
        param0.removeKeyListener((java.awt.event.KeyListener) (Object) je.field_j);
        if (param1 != 0) {
            return;
        }
        try {
            param0.removeFocusListener((java.awt.event.FocusListener) (Object) je.field_j);
            ii.field_c = -1;
        } catch (RuntimeException runtimeException) {
            throw t.a((Throwable) (Object) runtimeException, "kc.D(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 41);
        }
    }

    final static void a(int param0, byte param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        RuntimeException decompiledCaughtException = null;
        var3 = Geoblox.field_C;
        try {
          L0: {
            sh.a(0, param0, ok.field_b, bd.field_a, (byte) 121, md.field_c, true);
            if (param1 == -98) {
              var2_int = 0;
              L1: while (true) {
                L2: {
                  L3: {
                    if (md.field_c <= var2_int) {
                      break L3;
                    } else {
                      qi.field_i[param0 + var2_int] = var2_int;
                      var2_int++;
                      if (var3 != 0) {
                        break L2;
                      } else {
                        if (var3 == 0) {
                          continue L1;
                        } else {
                          break L3;
                        }
                      }
                    }
                  }
                  sh.a(param0, param0 + param0, qg.field_a, va.field_b, (byte) 112, md.field_c - -param0, false);
                  break L2;
                }
                L4: {
                  if (param0 < md.field_c) {
                    md.field_c = param0;
                    break L4;
                  } else {
                    break L4;
                  }
                }
                break L0;
              }
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw t.a((Throwable) (Object) var2, "kc.A(" + param0 + 44 + param1 + 41);
        }
    }

    final static void b(int param0) {
        RuntimeException var1 = null;
        ja var1_ref = null;
        int var1_int = 0;
        ja var2_ref_ja = null;
        int var2 = 0;
        wd var2_ref_wd = null;
        ja var3 = null;
        wd var3_ref = null;
        float var3_float = 0.0f;
        int var3_int = 0;
        int var4_int = 0;
        float var4_float = 0.0f;
        ja var4 = null;
        double var5 = 0.0;
        ja var5_ref_ja = null;
        int var6_int = 0;
        ja var6 = null;
        int var7_int = 0;
        ja var7 = null;
        ja var8 = null;
        int var9 = 0;
        ja var10 = null;
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
        ja stackIn_50_0 = null;
        ja stackIn_50_1 = null;
        int stackIn_55_0 = 0;
        int stackIn_85_0 = 0;
        int stackIn_85_1 = 0;
        int stackIn_85_2 = 0;
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
        int stackIn_89_3 = 0;
        gh stackIn_106_0 = null;
        gh stackIn_107_0 = null;
        gh stackIn_108_0 = null;
        gh stackIn_109_0 = null;
        gh stackIn_110_0 = null;
        gh stackIn_111_0 = null;
        int stackIn_111_1 = 0;
        tf stackOut_3_0 = null;
        tf stackOut_11_0 = null;
        boolean stackOut_14_0 = false;
        ja stackOut_19_0 = null;
        boolean stackOut_21_0 = false;
        ja stackOut_27_0 = null;
        ja stackOut_30_0 = null;
        ja stackOut_30_1 = null;
        ja stackOut_37_0 = null;
        ja stackOut_37_1 = null;
        int stackOut_43_0 = 0;
        int stackOut_47_0 = 0;
        ja stackOut_49_0 = null;
        ja stackOut_49_1 = null;
        int stackOut_54_0 = 0;
        int stackOut_84_0 = 0;
        int stackOut_84_1 = 0;
        int stackOut_84_2 = 0;
        int stackOut_85_0 = 0;
        int stackOut_85_1 = 0;
        int stackOut_85_2 = 0;
        int stackOut_86_0 = 0;
        int stackOut_86_1 = 0;
        int stackOut_86_2 = 0;
        int stackOut_87_0 = 0;
        int stackOut_87_1 = 0;
        int stackOut_87_2 = 0;
        int stackOut_87_3 = 0;
        int stackOut_88_0 = 0;
        int stackOut_88_1 = 0;
        int stackOut_88_2 = 0;
        int stackOut_88_3 = 0;
        gh stackOut_105_0 = null;
        gh stackOut_106_0 = null;
        gh stackOut_107_0 = null;
        gh stackOut_108_0 = null;
        gh stackOut_109_0 = null;
        int stackOut_109_1 = 0;
        gh stackOut_110_0 = null;
        int stackOut_110_1 = 0;
        int statePc = 0;
        Throwable caughtException = null;
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
                        var1_ref = (ja) (Object) ji.field_r.g(0);
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 118;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        if (var1_ref == null) {
                            statePc = 10;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 118;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        stackOut_3_0 = var1_ref.field_K;
                        stackIn_12_0 = stackOut_3_0;
                        stackIn_4_0 = stackOut_3_0;
                        if (var9 != 0) {
                            statePc = 12;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 118;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        if (stackIn_4_0 == a.field_d) {
                            statePc = 8;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 118;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        if (var1_ref.field_B) {
                            statePc = 7;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 118;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 118;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        fa.field_a = true;
                        if (var9 == 0) {
                            statePc = 9;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 118;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        var1_ref.j(30383);
                        var1_ref.k(2);
                        var1_ref.a(false);
                        var1_ref.a((byte) 54);
                        a.field_d.a(-80, (hf) (Object) var1_ref);
                        el.field_o.field_F = true;
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 118;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        var1_ref.field_K = null;
                        var1_ref = (ja) (Object) ji.field_r.d(1);
                        if (var9 == 0) {
                            statePc = 2;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 118;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        if (!re.field_j) {
                            statePc = 60;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 118;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        stackOut_11_0 = a.field_d;
                        stackIn_12_0 = stackOut_11_0;
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 118;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        var1_ref = (ja) (Object) ((tf) (Object) stackIn_12_0).g(0);
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 118;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        if (var1_ref == null) {
                            statePc = 54;
                        } else {
                            statePc = 14;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 118;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        stackOut_14_0 = pk.field_o[var1_ref.field_H];
                        stackIn_55_0 = stackOut_14_0 ? 1 : 0;
                        stackIn_15_0 = stackOut_14_0;
                        if (var9 != 0) {
                            statePc = 55;
                        } else {
                            statePc = 15;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 118;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        if (!stackIn_15_0) {
                            statePc = 18;
                        } else {
                            statePc = 16;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 118;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        if (var9 == 0) {
                            statePc = 53;
                        } else {
                            statePc = 17;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 118;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        statePc = 18;
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 118;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        var2_ref_wd = new wd();
                        var3_ref = new wd();
                        var2_ref_wd.a((rc) (Object) var1_ref, false);
                        var4_int = 1;
                        statePc = 19;
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 118;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        stackOut_19_0 = (ja) (Object) var2_ref_wd.a(true);
                        stackIn_20_0 = stackOut_19_0;
                        statePc = 20;
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 118;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        var10 = stackIn_20_0;
                        var5_ref_ja = var10;
                        if (var5_ref_ja == null) {
                            statePc = 43;
                        } else {
                            statePc = 21;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 118;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        pk.field_o[var10.field_H] = true;
                        stackOut_21_0 = var5_ref_ja.field_t;
                        stackIn_44_0 = stackOut_21_0 ? 1 : 0;
                        stackIn_22_0 = stackOut_21_0;
                        if (var9 != 0) {
                            statePc = 44;
                        } else {
                            statePc = 22;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 118;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        if (stackIn_22_0) {
                            statePc = 24;
                        } else {
                            statePc = 23;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 118;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        statePc = 25;
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 118;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        var4_int = 0;
                        if (var9 == 0) {
                            statePc = 43;
                        } else {
                            statePc = 25;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 118;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        var3_ref.a((rc) (Object) var5_ref_ja, false);
                        var6_int = 0;
                        statePc = 26;
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 118;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        if (var6_int >= var5_ref_ja.field_L) {
                            statePc = 42;
                        } else {
                            statePc = 27;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 118;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        var7 = var10.field_n[var6_int];
                        stackOut_27_0 = (ja) (Object) var3_ref.c((byte) 121);
                        stackIn_20_0 = stackOut_27_0;
                        stackIn_28_0 = stackOut_27_0;
                        if (var9 != 0) {
                            statePc = 20;
                        } else {
                            statePc = 28;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 118;
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
                        statePc = 118;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        if (var8 == null) {
                            statePc = 35;
                        } else {
                            statePc = 30;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 118;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        stackOut_30_0 = (ja) var8;
                        stackOut_30_1 = (ja) var7;
                        stackIn_50_0 = stackOut_30_0;
                        stackIn_50_1 = stackOut_30_1;
                        stackIn_31_0 = stackOut_30_0;
                        stackIn_31_1 = stackOut_30_1;
                        if (var9 != 0) {
                            statePc = 50;
                        } else {
                            statePc = 31;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 118;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        if (stackIn_31_0 != stackIn_31_1) {
                            statePc = 34;
                        } else {
                            statePc = 32;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 118;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        if (var9 == 0) {
                            statePc = 41;
                        } else {
                            statePc = 33;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 118;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        statePc = 34;
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 118;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        var8 = (ja) (Object) var3_ref.a(-45);
                        if (var9 == 0) {
                            statePc = 29;
                        } else {
                            statePc = 35;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 118;
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        var8 = (ja) (Object) var2_ref_wd.c((byte) 121);
                        statePc = 36;
                        continue stateLoop;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 118;
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        if (var8 == null) {
                            statePc = 40;
                        } else {
                            statePc = 37;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = 118;
                        continue stateLoop;
                    }
                }
                case 37: {
                    try {
                        stackOut_37_0 = (ja) var8;
                        stackOut_37_1 = (ja) var7;
                        stackIn_50_0 = stackOut_37_0;
                        stackIn_50_1 = stackOut_37_1;
                        stackIn_38_0 = stackOut_37_0;
                        stackIn_38_1 = stackOut_37_1;
                        if (var9 != 0) {
                            statePc = 50;
                        } else {
                            statePc = 38;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = 118;
                        continue stateLoop;
                    }
                }
                case 38: {
                    try {
                        if (stackIn_38_0 == stackIn_38_1) {
                            statePc = 41;
                        } else {
                            statePc = 39;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = 118;
                        continue stateLoop;
                    }
                }
                case 39: {
                    try {
                        var8 = (ja) (Object) var2_ref_wd.a(54);
                        if (var9 == 0) {
                            statePc = 36;
                        } else {
                            statePc = 40;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_39) {
                        caughtException = stateCaught_39;
                        statePc = 118;
                        continue stateLoop;
                    }
                }
                case 40: {
                    try {
                        var2_ref_wd.a((rc) (Object) var7, false);
                        statePc = 41;
                        continue stateLoop;
                    } catch (Throwable stateCaught_40) {
                        caughtException = stateCaught_40;
                        statePc = 118;
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
                        statePc = 118;
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
                        statePc = 118;
                        continue stateLoop;
                    }
                }
                case 43: {
                    try {
                        stackOut_43_0 = var4_int;
                        stackIn_44_0 = stackOut_43_0;
                        statePc = 44;
                        continue stateLoop;
                    } catch (Throwable stateCaught_43) {
                        caughtException = stateCaught_43;
                        statePc = 118;
                        continue stateLoop;
                    }
                }
                case 44: {
                    try {
                        if (stackIn_44_0 == 0) {
                            statePc = 53;
                        } else {
                            statePc = 45;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_44) {
                        caughtException = stateCaught_44;
                        statePc = 118;
                        continue stateLoop;
                    }
                }
                case 45: {
                    try {
                        var5_ref_ja = (ja) (Object) var3_ref.a(true);
                        statePc = 46;
                        continue stateLoop;
                    } catch (Throwable stateCaught_45) {
                        caughtException = stateCaught_45;
                        statePc = 118;
                        continue stateLoop;
                    }
                }
                case 46: {
                    try {
                        if (var5_ref_ja == null) {
                            statePc = 53;
                        } else {
                            statePc = 47;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_46) {
                        caughtException = stateCaught_46;
                        statePc = 118;
                        continue stateLoop;
                    }
                }
                case 47: {
                    try {
                        var5_ref_ja.field_K = ji.field_r;
                        var5_ref_ja.field_t = false;
                        var5_ref_ja.field_B = true;
                        fa.field_a = true;
                        stackOut_47_0 = 0;
                        stackIn_55_0 = stackOut_47_0;
                        stackIn_48_0 = stackOut_47_0;
                        if (var9 != 0) {
                            statePc = 55;
                        } else {
                            statePc = 48;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_47) {
                        caughtException = stateCaught_47;
                        statePc = 118;
                        continue stateLoop;
                    }
                }
                case 48: {
                    try {
                        var6_int = stackIn_48_0;
                        if (var6_int >= var5_ref_ja.field_L) {
                            statePc = 52;
                        } else {
                            statePc = 49;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_48) {
                        caughtException = stateCaught_48;
                        statePc = 118;
                        continue stateLoop;
                    }
                }
                case 49: {
                    try {
                        stackOut_49_0 = var5_ref_ja.field_n[var6_int];
                        stackOut_49_1 = (ja) var5_ref_ja;
                        stackIn_50_0 = stackOut_49_0;
                        stackIn_50_1 = stackOut_49_1;
                        statePc = 50;
                        continue stateLoop;
                    } catch (Throwable stateCaught_49) {
                        caughtException = stateCaught_49;
                        statePc = 118;
                        continue stateLoop;
                    }
                }
                case 50: {
                    try {
                        ((ja) (Object) stackIn_50_0).a(stackIn_50_1, 0);
                        var6_int++;
                        statePc = 46;
                        continue stateLoop;
                    } catch (Throwable stateCaught_50) {
                        caughtException = stateCaught_50;
                        statePc = 118;
                        continue stateLoop;
                    }
                }
                case 52: {
                    try {
                        var6 = var5_ref_ja;
                        var7 = var5_ref_ja;
                        var5_ref_ja.field_L = 0;
                        var6.field_N = 0;
                        var7.field_m = 0;
                        var5_ref_ja = (ja) (Object) var3_ref.a(true);
                        if (var9 == 0) {
                            statePc = 46;
                        } else {
                            statePc = 53;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_52) {
                        caughtException = stateCaught_52;
                        statePc = 118;
                        continue stateLoop;
                    }
                }
                case 53: {
                    try {
                        var1_ref = (ja) (Object) a.field_d.d(1);
                        if (var9 == 0) {
                            statePc = 13;
                        } else {
                            statePc = 54;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_53) {
                        caughtException = stateCaught_53;
                        statePc = 118;
                        continue stateLoop;
                    }
                }
                case 54: {
                    try {
                        re.field_j = false;
                        el.field_o.field_B = true;
                        stackOut_54_0 = 0;
                        stackIn_55_0 = stackOut_54_0;
                        statePc = 55;
                        continue stateLoop;
                    } catch (Throwable stateCaught_54) {
                        caughtException = stateCaught_54;
                        statePc = 118;
                        continue stateLoop;
                    }
                }
                case 55: {
                    try {
                        var1_int = stackIn_55_0;
                        statePc = 56;
                        continue stateLoop;
                    } catch (Throwable stateCaught_55) {
                        caughtException = stateCaught_55;
                        statePc = 118;
                        continue stateLoop;
                    }
                }
                case 56: {
                    try {
                        if (1000 <= var1_int) {
                            statePc = 60;
                        } else {
                            statePc = 57;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_56) {
                        caughtException = stateCaught_56;
                        statePc = 118;
                        continue stateLoop;
                    }
                }
                case 57: {
                    try {
                        pk.field_o[var1_int] = false;
                        var1_int++;
                        if (var9 != 0) {
                            statePc = 61;
                        } else {
                            statePc = 58;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_57) {
                        caughtException = stateCaught_57;
                        statePc = 118;
                        continue stateLoop;
                    }
                }
                case 58: {
                    try {
                        if (var9 == 0) {
                            statePc = 56;
                        } else {
                            statePc = 59;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_58) {
                        caughtException = stateCaught_58;
                        statePc = 118;
                        continue stateLoop;
                    }
                }
                case 59: {
                    try {
                        statePc = 60;
                        continue stateLoop;
                    } catch (Throwable stateCaught_59) {
                        caughtException = stateCaught_59;
                        statePc = 118;
                        continue stateLoop;
                    }
                }
                case 60: {
                    try {
                        var1_int = 0;
                        statePc = 61;
                        continue stateLoop;
                    } catch (Throwable stateCaught_60) {
                        caughtException = stateCaught_60;
                        statePc = 118;
                        continue stateLoop;
                    }
                }
                case 61: {
                    try {
                        var2_ref_ja = (ja) (Object) a.field_d.g(0);
                        statePc = 62;
                        continue stateLoop;
                    } catch (Throwable stateCaught_61) {
                        caughtException = stateCaught_61;
                        statePc = 118;
                        continue stateLoop;
                    }
                }
                case 62: {
                    try {
                        if (var2_ref_ja == null) {
                            statePc = 97;
                        } else {
                            statePc = 63;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_62) {
                        caughtException = stateCaught_62;
                        statePc = 118;
                        continue stateLoop;
                    }
                }
                case 63: {
                    try {
                        if (null != var2_ref_ja.field_K) {
                            statePc = 67;
                        } else {
                            statePc = 64;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_63) {
                        caughtException = stateCaught_63;
                        statePc = 118;
                        continue stateLoop;
                    }
                }
                case 64: {
                    try {
                        if (!w.field_f) {
                            statePc = 96;
                        } else {
                            statePc = 65;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_64) {
                        caughtException = stateCaught_64;
                        statePc = 118;
                        continue stateLoop;
                    }
                }
                case 65: {
                    try {
                        if (var2_ref_ja.field_t) {
                            statePc = 67;
                        } else {
                            statePc = 66;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_65) {
                        caughtException = stateCaught_65;
                        statePc = 118;
                        continue stateLoop;
                    }
                }
                case 66: {
                    try {
                        statePc = 96;
                        continue stateLoop;
                    } catch (Throwable stateCaught_66) {
                        caughtException = stateCaught_66;
                        statePc = 118;
                        continue stateLoop;
                    }
                }
                case 67: {
                    try {
                        re.field_j = true;
                        var2_ref_ja.a(false);
                        var2_ref_ja.a((byte) 100);
                        el.field_o.field_F = true;
                        var2_ref_ja.f(92);
                        if (ji.field_r != var2_ref_ja.field_K) {
                            statePc = 74;
                        } else {
                            statePc = 68;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_67) {
                        caughtException = stateCaught_67;
                        statePc = 118;
                        continue stateLoop;
                    }
                }
                case 68: {
                    try {
                        var2_ref_ja.a(-el.field_o.field_J, -117);
                        var3_float = -var2_ref_ja.field_o + 320.0f;
                        var4_float = -var2_ref_ja.field_v + 240.0f;
                        var5 = (double)og.field_r / Math.sqrt((double)(var4_float * var4_float + var3_float * var3_float));
                        var3_float = (float)((double)var3_float * var5);
                        var4_float = (float)((double)var4_float * var5);
                        var2_ref_ja.field_F = var4_float;
                        var2_ref_ja.field_w = var3_float;
                        var7_int = 0;
                        statePc = 69;
                        continue stateLoop;
                    } catch (Throwable stateCaught_68) {
                        caughtException = stateCaught_68;
                        statePc = 118;
                        continue stateLoop;
                    }
                }
                case 69: {
                    try {
                        if (var2_ref_ja.field_L <= var7_int) {
                            statePc = 73;
                        } else {
                            statePc = 70;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_69) {
                        caughtException = stateCaught_69;
                        statePc = 118;
                        continue stateLoop;
                    }
                }
                case 70: {
                    try {
                        var2_ref_ja.field_n[var7_int].a(var2_ref_ja, 0);
                        var7_int++;
                        if (var9 != 0) {
                            statePc = 95;
                        } else {
                            statePc = 71;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_70) {
                        caughtException = stateCaught_70;
                        statePc = 118;
                        continue stateLoop;
                    }
                }
                case 71: {
                    try {
                        if (var9 == 0) {
                            statePc = 69;
                        } else {
                            statePc = 72;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_71) {
                        caughtException = stateCaught_71;
                        statePc = 118;
                        continue stateLoop;
                    }
                }
                case 72: {
                    try {
                        statePc = 73;
                        continue stateLoop;
                    } catch (Throwable stateCaught_72) {
                        caughtException = stateCaught_72;
                        statePc = 118;
                        continue stateLoop;
                    }
                }
                case 73: {
                    try {
                        var7 = var2_ref_ja;
                        var8 = var2_ref_ja;
                        var2_ref_ja.field_L = 0;
                        var7.field_N = 0;
                        var8.field_m = 0;
                        ji.field_r.a(-36, (hf) (Object) var2_ref_ja);
                        if (var9 == 0) {
                            statePc = 94;
                        } else {
                            statePc = 74;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_73) {
                        caughtException = stateCaught_73;
                        statePc = 118;
                        continue stateLoop;
                    }
                }
                case 74: {
                    try {
                        if (var2_ref_ja.field_K == bh.field_c) {
                            statePc = 77;
                        } else {
                            statePc = 75;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_74) {
                        caughtException = stateCaught_74;
                        statePc = 118;
                        continue stateLoop;
                    }
                }
                case 75: {
                    try {
                        if (w.field_f) {
                            statePc = 77;
                        } else {
                            statePc = 76;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_75) {
                        caughtException = stateCaught_75;
                        statePc = 118;
                        continue stateLoop;
                    }
                }
                case 76: {
                    try {
                        statePc = 94;
                        continue stateLoop;
                    } catch (Throwable stateCaught_76) {
                        caughtException = stateCaught_76;
                        statePc = 118;
                        continue stateLoop;
                    }
                }
                case 77: {
                    try {
                        var3_int = 0;
                        statePc = 78;
                        continue stateLoop;
                    } catch (Throwable stateCaught_77) {
                        caughtException = stateCaught_77;
                        statePc = 118;
                        continue stateLoop;
                    }
                }
                case 78: {
                    try {
                        if (var3_int >= var2_ref_ja.field_L) {
                            statePc = 82;
                        } else {
                            statePc = 79;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_78) {
                        caughtException = stateCaught_78;
                        statePc = 118;
                        continue stateLoop;
                    }
                }
                case 79: {
                    try {
                        var2_ref_ja.field_n[var3_int].a(var2_ref_ja, 0);
                        var2_ref_ja.field_n[var3_int].k(2);
                        var3_int++;
                        if (var9 != 0) {
                            statePc = 95;
                        } else {
                            statePc = 80;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_79) {
                        caughtException = stateCaught_79;
                        statePc = 118;
                        continue stateLoop;
                    }
                }
                case 80: {
                    try {
                        if (var9 == 0) {
                            statePc = 78;
                        } else {
                            statePc = 81;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_80) {
                        caughtException = stateCaught_80;
                        statePc = 118;
                        continue stateLoop;
                    }
                }
                case 81: {
                    try {
                        statePc = 82;
                        continue stateLoop;
                    } catch (Throwable stateCaught_81) {
                        caughtException = stateCaught_81;
                        statePc = 118;
                        continue stateLoop;
                    }
                }
                case 82: {
                    try {
                        var3 = var2_ref_ja;
                        var2_ref_ja.field_L = 0;
                        var4 = var2_ref_ja;
                        var3.field_N = 0;
                        var4.field_m = 0;
                        var2_ref_ja.field_r = 50;
                        bh.field_c.a(-100, (hf) (Object) var2_ref_ja);
                        var2_ref_ja.field_G = 0;
                        if (!var2_ref_ja.field_t) {
                            statePc = 90;
                        } else {
                            statePc = 83;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_82) {
                        caughtException = stateCaught_82;
                        statePc = 118;
                        continue stateLoop;
                    }
                }
                case 83: {
                    try {
                        if (!w.field_f) {
                            statePc = 90;
                        } else {
                            statePc = 84;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_83) {
                        caughtException = stateCaught_83;
                        statePc = 118;
                        continue stateLoop;
                    }
                }
                case 84: {
                    try {
                        stackOut_84_0 = (int)var2_ref_ja.field_v;
                        stackOut_84_1 = (int)var2_ref_ja.field_o;
                        stackOut_84_2 = 117;
                        stackIn_87_0 = stackOut_84_0;
                        stackIn_87_1 = stackOut_84_1;
                        stackIn_87_2 = stackOut_84_2;
                        stackIn_85_0 = stackOut_84_0;
                        stackIn_85_1 = stackOut_84_1;
                        stackIn_85_2 = stackOut_84_2;
                        if (var2_ref_ja.field_z == 4) {
                            statePc = 87;
                        } else {
                            statePc = 85;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_84) {
                        caughtException = stateCaught_84;
                        statePc = 118;
                        continue stateLoop;
                    }
                }
                case 85: {
                    try {
                        stackOut_85_0 = stackIn_85_0;
                        stackOut_85_1 = stackIn_85_1;
                        stackOut_85_2 = stackIn_85_2;
                        stackIn_88_0 = stackOut_85_0;
                        stackIn_88_1 = stackOut_85_1;
                        stackIn_88_2 = stackOut_85_2;
                        stackIn_86_0 = stackOut_85_0;
                        stackIn_86_1 = stackOut_85_1;
                        stackIn_86_2 = stackOut_85_2;
                        if (var2_ref_ja.field_z != 3) {
                            statePc = 88;
                        } else {
                            statePc = 86;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_85) {
                        caughtException = stateCaught_85;
                        statePc = 118;
                        continue stateLoop;
                    }
                }
                case 86: {
                    try {
                        stackOut_86_0 = stackIn_86_0;
                        stackOut_86_1 = stackIn_86_1;
                        stackOut_86_2 = stackIn_86_2;
                        stackIn_87_0 = stackOut_86_0;
                        stackIn_87_1 = stackOut_86_1;
                        stackIn_87_2 = stackOut_86_2;
                        statePc = 87;
                        continue stateLoop;
                    } catch (Throwable stateCaught_86) {
                        caughtException = stateCaught_86;
                        statePc = 118;
                        continue stateLoop;
                    }
                }
                case 87: {
                    try {
                        stackOut_87_0 = stackIn_87_0;
                        stackOut_87_1 = stackIn_87_1;
                        stackOut_87_2 = stackIn_87_2;
                        stackOut_87_3 = 100;
                        stackIn_89_0 = stackOut_87_0;
                        stackIn_89_1 = stackOut_87_1;
                        stackIn_89_2 = stackOut_87_2;
                        stackIn_89_3 = stackOut_87_3;
                        statePc = 89;
                        continue stateLoop;
                    } catch (Throwable stateCaught_87) {
                        caughtException = stateCaught_87;
                        statePc = 118;
                        continue stateLoop;
                    }
                }
                case 88: {
                    try {
                        stackOut_88_0 = stackIn_88_0;
                        stackOut_88_1 = stackIn_88_1;
                        stackOut_88_2 = stackIn_88_2;
                        stackOut_88_3 = 10;
                        stackIn_89_0 = stackOut_88_0;
                        stackIn_89_1 = stackOut_88_1;
                        stackIn_89_2 = stackOut_88_2;
                        stackIn_89_3 = stackOut_88_3;
                        statePc = 89;
                        continue stateLoop;
                    } catch (Throwable stateCaught_88) {
                        caughtException = stateCaught_88;
                        statePc = 118;
                        continue stateLoop;
                    }
                }
                case 89: {
                    try {
                        ld.a(stackIn_89_0, stackIn_89_1, stackIn_89_2, stackIn_89_3);
                        statePc = 90;
                        continue stateLoop;
                    } catch (Throwable stateCaught_89) {
                        caughtException = stateCaught_89;
                        statePc = 118;
                        continue stateLoop;
                    }
                }
                case 90: {
                    try {
                        if (4 == var2_ref_ja.field_z) {
                            statePc = 93;
                        } else {
                            statePc = 91;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_90) {
                        caughtException = stateCaught_90;
                        statePc = 118;
                        continue stateLoop;
                    }
                }
                case 91: {
                    try {
                        var2_ref_ja.a(320, var2_ref_ja.field_C, var2_ref_ja.field_M, 5);
                        if (var9 == 0) {
                            statePc = 94;
                        } else {
                            statePc = 92;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_91) {
                        caughtException = stateCaught_91;
                        statePc = 118;
                        continue stateLoop;
                    }
                }
                case 92: {
                    try {
                        statePc = 93;
                        continue stateLoop;
                    } catch (Throwable stateCaught_92) {
                        caughtException = stateCaught_92;
                        statePc = 118;
                        continue stateLoop;
                    }
                }
                case 93: {
                    try {
                        var2_ref_ja.a(320, var2_ref_ja.field_C, var2_ref_ja.field_M, 7);
                        var1_int++;
                        rb.field_b = rb.field_b + 1;
                        statePc = 94;
                        continue stateLoop;
                    } catch (Throwable stateCaught_93) {
                        caughtException = stateCaught_93;
                        statePc = 118;
                        continue stateLoop;
                    }
                }
                case 94: {
                    try {
                        var2_ref_ja.field_K = null;
                        statePc = 95;
                        continue stateLoop;
                    } catch (Throwable stateCaught_94) {
                        caughtException = stateCaught_94;
                        statePc = 118;
                        continue stateLoop;
                    }
                }
                case 95: {
                    try {
                        el.field_o.field_F = true;
                        statePc = 96;
                        continue stateLoop;
                    } catch (Throwable stateCaught_95) {
                        caughtException = stateCaught_95;
                        statePc = 118;
                        continue stateLoop;
                    }
                }
                case 96: {
                    try {
                        var2_ref_ja = (ja) (Object) a.field_d.d(1);
                        if (var9 == 0) {
                            statePc = 62;
                        } else {
                            statePc = 97;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_96) {
                        caughtException = stateCaught_96;
                        statePc = 118;
                        continue stateLoop;
                    }
                }
                case 97: {
                    try {
                        var2 = -23 / ((param0 - 69) / 46);
                        var3 = (ja) (Object) bh.field_c.g(0);
                        statePc = 98;
                        continue stateLoop;
                    } catch (Throwable stateCaught_97) {
                        caughtException = stateCaught_97;
                        statePc = 118;
                        continue stateLoop;
                    }
                }
                case 98: {
                    try {
                        if (var3 == null) {
                            statePc = 103;
                        } else {
                            statePc = 99;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_98) {
                        caughtException = stateCaught_98;
                        statePc = 118;
                        continue stateLoop;
                    }
                }
                case 99: {
                    try {
                        if (var9 != 0) {
                            statePc = 105;
                        } else {
                            statePc = 100;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_99) {
                        caughtException = stateCaught_99;
                        statePc = 118;
                        continue stateLoop;
                    }
                }
                case 100: {
                    try {
                        if (ra.field_a != var3.field_K) {
                            statePc = 102;
                        } else {
                            statePc = 101;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_100) {
                        caughtException = stateCaught_100;
                        statePc = 118;
                        continue stateLoop;
                    }
                }
                case 101: {
                    try {
                        var3.a(false);
                        var3.a((byte) 51);
                        ra.field_a.a(-44, (hf) (Object) var3);
                        var3.field_K = null;
                        statePc = 102;
                        continue stateLoop;
                    } catch (Throwable stateCaught_101) {
                        caughtException = stateCaught_101;
                        statePc = 118;
                        continue stateLoop;
                    }
                }
                case 102: {
                    try {
                        var3 = (ja) (Object) bh.field_c.d(1);
                        if (var9 == 0) {
                            statePc = 98;
                        } else {
                            statePc = 103;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_102) {
                        caughtException = stateCaught_102;
                        statePc = 118;
                        continue stateLoop;
                    }
                }
                case 103: {
                    try {
                        if (!w.field_f) {
                            statePc = 105;
                        } else {
                            statePc = 104;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_103) {
                        caughtException = stateCaught_103;
                        statePc = 118;
                        continue stateLoop;
                    }
                }
                case 104: {
                    try {
                        jc.a(3, false);
                        jl.field_t = false;
                        statePc = 105;
                        continue stateLoop;
                    } catch (Throwable stateCaught_104) {
                        caughtException = stateCaught_104;
                        statePc = 118;
                        continue stateLoop;
                    }
                }
                case 105: {
                    try {
                        stackOut_105_0 = el.field_o;
                        stackIn_109_0 = stackOut_105_0;
                        stackIn_106_0 = stackOut_105_0;
                        if (el.field_o.field_F) {
                            statePc = 109;
                        } else {
                            statePc = 106;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_105) {
                        caughtException = stateCaught_105;
                        statePc = 118;
                        continue stateLoop;
                    }
                }
                case 106: {
                    try {
                        stackOut_106_0 = (gh) (Object) stackIn_106_0;
                        stackIn_109_0 = stackOut_106_0;
                        stackIn_107_0 = stackOut_106_0;
                        if (ab.field_f) {
                            statePc = 109;
                        } else {
                            statePc = 107;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_106) {
                        caughtException = stateCaught_106;
                        statePc = 118;
                        continue stateLoop;
                    }
                }
                case 107: {
                    try {
                        stackOut_107_0 = (gh) (Object) stackIn_107_0;
                        stackIn_110_0 = stackOut_107_0;
                        stackIn_108_0 = stackOut_107_0;
                        if (!w.field_f) {
                            statePc = 110;
                        } else {
                            statePc = 108;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_107) {
                        caughtException = stateCaught_107;
                        statePc = 118;
                        continue stateLoop;
                    }
                }
                case 108: {
                    try {
                        stackOut_108_0 = (gh) (Object) stackIn_108_0;
                        stackIn_109_0 = stackOut_108_0;
                        statePc = 109;
                        continue stateLoop;
                    } catch (Throwable stateCaught_108) {
                        caughtException = stateCaught_108;
                        statePc = 118;
                        continue stateLoop;
                    }
                }
                case 109: {
                    try {
                        stackOut_109_0 = (gh) (Object) stackIn_109_0;
                        stackOut_109_1 = 1;
                        stackIn_111_0 = stackOut_109_0;
                        stackIn_111_1 = stackOut_109_1;
                        statePc = 111;
                        continue stateLoop;
                    } catch (Throwable stateCaught_109) {
                        caughtException = stateCaught_109;
                        statePc = 118;
                        continue stateLoop;
                    }
                }
                case 110: {
                    try {
                        stackOut_110_0 = (gh) (Object) stackIn_110_0;
                        stackOut_110_1 = 0;
                        stackIn_111_0 = stackOut_110_0;
                        stackIn_111_1 = stackOut_110_1;
                        statePc = 111;
                        continue stateLoop;
                    } catch (Throwable stateCaught_110) {
                        caughtException = stateCaught_110;
                        statePc = 118;
                        continue stateLoop;
                    }
                }
                case 111: {
                    try {
                        stackIn_111_0.field_F = stackIn_111_1 != 0;
                        w.field_f = false;
                        if (var1_int >= 3) {
                            statePc = 113;
                        } else {
                            statePc = 112;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_111) {
                        caughtException = stateCaught_111;
                        statePc = 118;
                        continue stateLoop;
                    }
                }
                case 112: {
                    try {
                        statePc = 114;
                        continue stateLoop;
                    } catch (Throwable stateCaught_112) {
                        caughtException = stateCaught_112;
                        statePc = 118;
                        continue stateLoop;
                    }
                }
                case 113: {
                    try {
                        ra.a(255 ^ fe.field_f, -88, fe.field_f);
                        statePc = 114;
                        continue stateLoop;
                    } catch (Throwable stateCaught_113) {
                        caughtException = stateCaught_113;
                        statePc = 118;
                        continue stateLoop;
                    }
                }
                case 114: {
                    try {
                        if (rb.field_b >= 5) {
                            statePc = 116;
                        } else {
                            statePc = 115;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_114) {
                        caughtException = stateCaught_114;
                        statePc = 118;
                        continue stateLoop;
                    }
                }
                case 115: {
                    try {
                        statePc = 119;
                        continue stateLoop;
                    } catch (Throwable stateCaught_115) {
                        caughtException = stateCaught_115;
                        statePc = 118;
                        continue stateLoop;
                    }
                }
                case 116: {
                    try {
                        ra.a(255 ^ vd.field_p, -83, vd.field_p);
                        statePc = 119;
                        continue stateLoop;
                    } catch (Throwable stateCaught_116) {
                        caughtException = stateCaught_116;
                        statePc = 118;
                        continue stateLoop;
                    }
                }
                case 118: {
                    var1 = (RuntimeException) (Object) caughtException;
                    throw t.a((Throwable) (Object) var1, "kc.C(" + param0 + 41);
                }
                case 119: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = 0;
        field_b = "Names can only contain letters, numbers, spaces and underscores";
        field_a = 0;
    }
}
