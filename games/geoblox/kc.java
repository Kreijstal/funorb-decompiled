/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kc {
    static int field_a;
    static String field_b;
    static int field_c;

    public static void a(int param0) {
        try {
            int var1_int = 7 % ((79 - param0) / 43);
            field_b = null;
        } catch (RuntimeException runtimeException) {
            throw t.a((Throwable) (Object) runtimeException, "kc.B(" + param0 + ')');
        }
    }

    final static void a(java.awt.Component param0, int param1) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        try {
          L0: {
            param0.removeKeyListener((java.awt.event.KeyListener) (Object) je.field_j);
            if (param1 == 0) {
              param0.removeFocusListener((java.awt.event.FocusListener) (Object) je.field_j);
              ii.field_c = -1;
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            runtimeException = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) runtimeException;
            stackOut_4_1 = new StringBuilder().append("kc.D(");
            stackIn_7_0 = stackOut_4_0;
            stackIn_7_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param0 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L1;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_8_0 = stackOut_5_0;
              stackIn_8_1 = stackOut_5_1;
              stackIn_8_2 = stackOut_5_2;
              break L1;
            }
          }
          throw t.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + ',' + param1 + ')');
        }
    }

    final static void a(int param0, byte param1) {
        RuntimeException runtimeException = null;
        int var2_int = 0;
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
                    if (~md.field_c >= ~var2_int) {
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
          runtimeException = decompiledCaughtException;
          throw t.a((Throwable) (Object) runtimeException, "kc.A(" + param0 + ',' + param1 + ')');
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
        tf stackIn_4_0 = null;
        tf stackIn_19_0 = null;
        boolean stackIn_22_0 = false;
        ja stackIn_30_0 = null;
        boolean stackIn_32_0 = false;
        ja stackIn_40_0 = null;
        ja stackIn_43_0 = null;
        ja stackIn_43_1 = null;
        ja stackIn_53_0 = null;
        ja stackIn_53_1 = null;
        int stackIn_61_0 = 0;
        int stackIn_65_0 = 0;
        ja stackIn_68_0 = null;
        ja stackIn_68_1 = null;
        int stackIn_73_0 = 0;
        int stackIn_118_0 = 0;
        int stackIn_118_1 = 0;
        int stackIn_118_2 = 0;
        int stackIn_120_0 = 0;
        int stackIn_120_1 = 0;
        int stackIn_120_2 = 0;
        int stackIn_121_0 = 0;
        int stackIn_121_1 = 0;
        int stackIn_121_2 = 0;
        int stackIn_123_0 = 0;
        int stackIn_123_1 = 0;
        int stackIn_123_2 = 0;
        int stackIn_125_0 = 0;
        int stackIn_125_1 = 0;
        int stackIn_125_2 = 0;
        int stackIn_126_0 = 0;
        int stackIn_126_1 = 0;
        int stackIn_126_2 = 0;
        int stackIn_126_3 = 0;
        gh stackIn_149_0 = null;
        gh stackIn_150_0 = null;
        gh stackIn_152_0 = null;
        gh stackIn_153_0 = null;
        gh stackIn_155_0 = null;
        gh stackIn_157_0 = null;
        gh stackIn_158_0 = null;
        int stackIn_158_1 = 0;
        tf stackOut_3_0 = null;
        tf stackOut_17_0 = null;
        boolean stackOut_21_0 = false;
        ja stackOut_29_0 = null;
        boolean stackOut_31_0 = false;
        ja stackOut_39_0 = null;
        ja stackOut_42_0 = null;
        ja stackOut_42_1 = null;
        ja stackOut_52_0 = null;
        ja stackOut_52_1 = null;
        int stackOut_60_0 = 0;
        int stackOut_64_0 = 0;
        ja stackOut_67_0 = null;
        ja stackOut_67_1 = null;
        int stackOut_72_0 = 0;
        int stackOut_117_0 = 0;
        int stackOut_117_1 = 0;
        int stackOut_117_2 = 0;
        int stackOut_118_0 = 0;
        int stackOut_118_1 = 0;
        int stackOut_118_2 = 0;
        int stackOut_120_0 = 0;
        int stackOut_120_1 = 0;
        int stackOut_120_2 = 0;
        int stackOut_121_0 = 0;
        int stackOut_121_1 = 0;
        int stackOut_121_2 = 0;
        int stackOut_123_0 = 0;
        int stackOut_123_1 = 0;
        int stackOut_123_2 = 0;
        int stackOut_123_3 = 0;
        int stackOut_125_0 = 0;
        int stackOut_125_1 = 0;
        int stackOut_125_2 = 0;
        int stackOut_125_3 = 0;
        gh stackOut_148_0 = null;
        gh stackOut_149_0 = null;
        gh stackOut_150_0 = null;
        gh stackOut_152_0 = null;
        gh stackOut_153_0 = null;
        gh stackOut_155_0 = null;
        int stackOut_155_1 = 0;
        gh stackOut_157_0 = null;
        int stackOut_157_1 = 0;
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
                        statePc = 167;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        if (var1_ref == null) {
                            statePc = 16;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 167;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        stackOut_3_0 = var1_ref.field_K;
                        stackIn_19_0 = stackOut_3_0;
                        stackIn_4_0 = stackOut_3_0;
                        if (var9 != 0) {
                            statePc = 19;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 167;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        if (stackIn_4_0 == a.field_d) {
                            statePc = 13;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 167;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 167;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        if (var1_ref.field_B) {
                            statePc = 12;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 167;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 167;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        statePc = 15;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 167;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        fa.field_a = true;
                        if (var9 == 0) {
                            statePc = 15;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 167;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        var1_ref.j(30383);
                        var1_ref.k(2);
                        var1_ref.a(false);
                        var1_ref.a((byte) 54);
                        a.field_d.a(-80, (hf) (Object) var1_ref);
                        el.field_o.field_F = true;
                        statePc = 15;
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 167;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        var1_ref.field_K = null;
                        var1_ref = (ja) (Object) ji.field_r.d(1);
                        if (var9 == 0) {
                            statePc = 2;
                        } else {
                            statePc = 16;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 167;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        if (!re.field_j) {
                            statePc = 79;
                        } else {
                            statePc = 17;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 167;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        stackOut_17_0 = a.field_d;
                        stackIn_19_0 = stackOut_17_0;
                        statePc = 19;
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 167;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        var1_ref = (ja) (Object) ((tf) (Object) stackIn_19_0).g(0);
                        statePc = 20;
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 167;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        if (var1_ref == null) {
                            statePc = 72;
                        } else {
                            statePc = 21;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 167;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        stackOut_21_0 = pk.field_o[var1_ref.field_H];
                        stackIn_73_0 = stackOut_21_0 ? 1 : 0;
                        stackIn_22_0 = stackOut_21_0;
                        if (var9 != 0) {
                            statePc = 73;
                        } else {
                            statePc = 22;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 167;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        if (!stackIn_22_0) {
                            statePc = 28;
                        } else {
                            statePc = 23;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 167;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        statePc = 25;
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 167;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        if (var9 == 0) {
                            statePc = 71;
                        } else {
                            statePc = 26;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 167;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        statePc = 28;
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 167;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        var2_ref_wd = new wd();
                        var3_ref = new wd();
                        var2_ref_wd.a((rc) (Object) var1_ref, false);
                        var4_int = 1;
                        statePc = 29;
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 167;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        stackOut_29_0 = (ja) (Object) var2_ref_wd.a(true);
                        stackIn_30_0 = stackOut_29_0;
                        statePc = 30;
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 167;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        var5_ref_ja = stackIn_30_0;
                        if (null == var5_ref_ja) {
                            statePc = 60;
                        } else {
                            statePc = 31;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 167;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        pk.field_o[var5_ref_ja.field_H] = true;
                        stackOut_31_0 = var5_ref_ja.field_t;
                        stackIn_61_0 = stackOut_31_0 ? 1 : 0;
                        stackIn_32_0 = stackOut_31_0;
                        if (var9 != 0) {
                            statePc = 61;
                        } else {
                            statePc = 32;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 167;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        if (stackIn_32_0) {
                            statePc = 36;
                        } else {
                            statePc = 33;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 167;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        statePc = 35;
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 167;
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        statePc = 37;
                        continue stateLoop;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 167;
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        var4_int = 0;
                        if (var9 == 0) {
                            statePc = 60;
                        } else {
                            statePc = 37;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = 167;
                        continue stateLoop;
                    }
                }
                case 37: {
                    try {
                        var3_ref.a((rc) (Object) var5_ref_ja, false);
                        var6_int = 0;
                        statePc = 38;
                        continue stateLoop;
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = 167;
                        continue stateLoop;
                    }
                }
                case 38: {
                    try {
                        if (~var6_int <= ~var5_ref_ja.field_L) {
                            statePc = 59;
                        } else {
                            statePc = 39;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = 167;
                        continue stateLoop;
                    }
                }
                case 39: {
                    try {
                        var7 = var5_ref_ja.field_n[var6_int];
                        stackOut_39_0 = (ja) (Object) var3_ref.c((byte) 121);
                        stackIn_30_0 = stackOut_39_0;
                        stackIn_40_0 = stackOut_39_0;
                        if (var9 != 0) {
                            statePc = 30;
                        } else {
                            statePc = 40;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_39) {
                        caughtException = stateCaught_39;
                        statePc = 167;
                        continue stateLoop;
                    }
                }
                case 40: {
                    try {
                        var8 = stackIn_40_0;
                        statePc = 41;
                        continue stateLoop;
                    } catch (Throwable stateCaught_40) {
                        caughtException = stateCaught_40;
                        statePc = 167;
                        continue stateLoop;
                    }
                }
                case 41: {
                    try {
                        if (null == var8) {
                            statePc = 50;
                        } else {
                            statePc = 42;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_41) {
                        caughtException = stateCaught_41;
                        statePc = 167;
                        continue stateLoop;
                    }
                }
                case 42: {
                    try {
                        stackOut_42_0 = (ja) var8;
                        stackOut_42_1 = (ja) var7;
                        stackIn_68_0 = stackOut_42_0;
                        stackIn_68_1 = stackOut_42_1;
                        stackIn_43_0 = stackOut_42_0;
                        stackIn_43_1 = stackOut_42_1;
                        if (var9 != 0) {
                            statePc = 68;
                        } else {
                            statePc = 43;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_42) {
                        caughtException = stateCaught_42;
                        statePc = 167;
                        continue stateLoop;
                    }
                }
                case 43: {
                    try {
                        if (stackIn_43_0 != stackIn_43_1) {
                            statePc = 49;
                        } else {
                            statePc = 44;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_43) {
                        caughtException = stateCaught_43;
                        statePc = 167;
                        continue stateLoop;
                    }
                }
                case 44: {
                    try {
                        statePc = 46;
                        continue stateLoop;
                    } catch (Throwable stateCaught_44) {
                        caughtException = stateCaught_44;
                        statePc = 167;
                        continue stateLoop;
                    }
                }
                case 46: {
                    try {
                        if (var9 == 0) {
                            statePc = 58;
                        } else {
                            statePc = 47;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_46) {
                        caughtException = stateCaught_46;
                        statePc = 167;
                        continue stateLoop;
                    }
                }
                case 47: {
                    try {
                        statePc = 49;
                        continue stateLoop;
                    } catch (Throwable stateCaught_47) {
                        caughtException = stateCaught_47;
                        statePc = 167;
                        continue stateLoop;
                    }
                }
                case 49: {
                    try {
                        var8 = (ja) (Object) var3_ref.a(-45);
                        if (var9 == 0) {
                            statePc = 41;
                        } else {
                            statePc = 50;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_49) {
                        caughtException = stateCaught_49;
                        statePc = 167;
                        continue stateLoop;
                    }
                }
                case 50: {
                    try {
                        var8 = (ja) (Object) var2_ref_wd.c((byte) 121);
                        statePc = 51;
                        continue stateLoop;
                    } catch (Throwable stateCaught_50) {
                        caughtException = stateCaught_50;
                        statePc = 167;
                        continue stateLoop;
                    }
                }
                case 51: {
                    try {
                        if (null == var8) {
                            statePc = 57;
                        } else {
                            statePc = 52;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_51) {
                        caughtException = stateCaught_51;
                        statePc = 167;
                        continue stateLoop;
                    }
                }
                case 52: {
                    try {
                        stackOut_52_0 = (ja) var8;
                        stackOut_52_1 = (ja) var7;
                        stackIn_68_0 = stackOut_52_0;
                        stackIn_68_1 = stackOut_52_1;
                        stackIn_53_0 = stackOut_52_0;
                        stackIn_53_1 = stackOut_52_1;
                        if (var9 != 0) {
                            statePc = 68;
                        } else {
                            statePc = 53;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_52) {
                        caughtException = stateCaught_52;
                        statePc = 167;
                        continue stateLoop;
                    }
                }
                case 53: {
                    try {
                        if (stackIn_53_0 == stackIn_53_1) {
                            statePc = 58;
                        } else {
                            statePc = 54;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_53) {
                        caughtException = stateCaught_53;
                        statePc = 167;
                        continue stateLoop;
                    }
                }
                case 54: {
                    try {
                        statePc = 56;
                        continue stateLoop;
                    } catch (Throwable stateCaught_54) {
                        caughtException = stateCaught_54;
                        statePc = 167;
                        continue stateLoop;
                    }
                }
                case 56: {
                    try {
                        var8 = (ja) (Object) var2_ref_wd.a(54);
                        if (var9 == 0) {
                            statePc = 51;
                        } else {
                            statePc = 57;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_56) {
                        caughtException = stateCaught_56;
                        statePc = 167;
                        continue stateLoop;
                    }
                }
                case 57: {
                    try {
                        var2_ref_wd.a((rc) (Object) var7, false);
                        statePc = 58;
                        continue stateLoop;
                    } catch (Throwable stateCaught_57) {
                        caughtException = stateCaught_57;
                        statePc = 167;
                        continue stateLoop;
                    }
                }
                case 58: {
                    try {
                        var6_int++;
                        if (var9 == 0) {
                            statePc = 38;
                        } else {
                            statePc = 59;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_58) {
                        caughtException = stateCaught_58;
                        statePc = 167;
                        continue stateLoop;
                    }
                }
                case 59: {
                    try {
                        if (var9 == 0) {
                            statePc = 29;
                        } else {
                            statePc = 60;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_59) {
                        caughtException = stateCaught_59;
                        statePc = 167;
                        continue stateLoop;
                    }
                }
                case 60: {
                    try {
                        stackOut_60_0 = var4_int;
                        stackIn_61_0 = stackOut_60_0;
                        statePc = 61;
                        continue stateLoop;
                    } catch (Throwable stateCaught_60) {
                        caughtException = stateCaught_60;
                        statePc = 167;
                        continue stateLoop;
                    }
                }
                case 61: {
                    try {
                        if (stackIn_61_0 == 0) {
                            statePc = 71;
                        } else {
                            statePc = 62;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_61) {
                        caughtException = stateCaught_61;
                        statePc = 167;
                        continue stateLoop;
                    }
                }
                case 62: {
                    try {
                        var5_ref_ja = (ja) (Object) var3_ref.a(true);
                        statePc = 63;
                        continue stateLoop;
                    } catch (Throwable stateCaught_62) {
                        caughtException = stateCaught_62;
                        statePc = 167;
                        continue stateLoop;
                    }
                }
                case 63: {
                    try {
                        if (null == var5_ref_ja) {
                            statePc = 71;
                        } else {
                            statePc = 64;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_63) {
                        caughtException = stateCaught_63;
                        statePc = 167;
                        continue stateLoop;
                    }
                }
                case 64: {
                    try {
                        var5_ref_ja.field_K = ji.field_r;
                        var5_ref_ja.field_t = false;
                        var5_ref_ja.field_B = true;
                        fa.field_a = true;
                        stackOut_64_0 = 0;
                        stackIn_73_0 = stackOut_64_0;
                        stackIn_65_0 = stackOut_64_0;
                        if (var9 != 0) {
                            statePc = 73;
                        } else {
                            statePc = 65;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_64) {
                        caughtException = stateCaught_64;
                        statePc = 167;
                        continue stateLoop;
                    }
                }
                case 65: {
                    try {
                        var6_int = stackIn_65_0;
                        statePc = 66;
                        continue stateLoop;
                    } catch (Throwable stateCaught_65) {
                        caughtException = stateCaught_65;
                        statePc = 167;
                        continue stateLoop;
                    }
                }
                case 66: {
                    try {
                        if (~var6_int <= ~var5_ref_ja.field_L) {
                            statePc = 70;
                        } else {
                            statePc = 67;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_66) {
                        caughtException = stateCaught_66;
                        statePc = 167;
                        continue stateLoop;
                    }
                }
                case 67: {
                    try {
                        stackOut_67_0 = var5_ref_ja.field_n[var6_int];
                        stackOut_67_1 = (ja) var5_ref_ja;
                        stackIn_68_0 = stackOut_67_0;
                        stackIn_68_1 = stackOut_67_1;
                        statePc = 68;
                        continue stateLoop;
                    } catch (Throwable stateCaught_67) {
                        caughtException = stateCaught_67;
                        statePc = 167;
                        continue stateLoop;
                    }
                }
                case 68: {
                    try {
                        ((ja) (Object) stackIn_68_0).a(stackIn_68_1, 0);
                        var6_int++;
                        if (var9 != 0) {
                            statePc = 63;
                        } else {
                            statePc = 69;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_68) {
                        caughtException = stateCaught_68;
                        statePc = 167;
                        continue stateLoop;
                    }
                }
                case 69: {
                    try {
                        if (var9 == 0) {
                            statePc = 66;
                        } else {
                            statePc = 70;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_69) {
                        caughtException = stateCaught_69;
                        statePc = 167;
                        continue stateLoop;
                    }
                }
                case 70: {
                    try {
                        var6 = var5_ref_ja;
                        var7 = var5_ref_ja;
                        var5_ref_ja.field_L = 0;
                        var6.field_N = 0;
                        var7.field_m = 0;
                        var5_ref_ja = (ja) (Object) var3_ref.a(true);
                        if (var9 == 0) {
                            statePc = 63;
                        } else {
                            statePc = 71;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_70) {
                        caughtException = stateCaught_70;
                        statePc = 167;
                        continue stateLoop;
                    }
                }
                case 71: {
                    try {
                        var1_ref = (ja) (Object) a.field_d.d(1);
                        if (var9 == 0) {
                            statePc = 20;
                        } else {
                            statePc = 72;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_71) {
                        caughtException = stateCaught_71;
                        statePc = 167;
                        continue stateLoop;
                    }
                }
                case 72: {
                    try {
                        re.field_j = false;
                        el.field_o.field_B = true;
                        stackOut_72_0 = 0;
                        stackIn_73_0 = stackOut_72_0;
                        statePc = 73;
                        continue stateLoop;
                    } catch (Throwable stateCaught_72) {
                        caughtException = stateCaught_72;
                        statePc = 167;
                        continue stateLoop;
                    }
                }
                case 73: {
                    try {
                        var1_int = stackIn_73_0;
                        statePc = 74;
                        continue stateLoop;
                    } catch (Throwable stateCaught_73) {
                        caughtException = stateCaught_73;
                        statePc = 167;
                        continue stateLoop;
                    }
                }
                case 74: {
                    try {
                        if (1000 <= var1_int) {
                            statePc = 79;
                        } else {
                            statePc = 75;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_74) {
                        caughtException = stateCaught_74;
                        statePc = 167;
                        continue stateLoop;
                    }
                }
                case 75: {
                    try {
                        pk.field_o[var1_int] = false;
                        var1_int++;
                        if (var9 != 0) {
                            statePc = 80;
                        } else {
                            statePc = 76;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_75) {
                        caughtException = stateCaught_75;
                        statePc = 167;
                        continue stateLoop;
                    }
                }
                case 76: {
                    try {
                        if (var9 == 0) {
                            statePc = 74;
                        } else {
                            statePc = 77;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_76) {
                        caughtException = stateCaught_76;
                        statePc = 167;
                        continue stateLoop;
                    }
                }
                case 77: {
                    try {
                        statePc = 79;
                        continue stateLoop;
                    } catch (Throwable stateCaught_77) {
                        caughtException = stateCaught_77;
                        statePc = 167;
                        continue stateLoop;
                    }
                }
                case 79: {
                    try {
                        var1_int = 0;
                        statePc = 80;
                        continue stateLoop;
                    } catch (Throwable stateCaught_79) {
                        caughtException = stateCaught_79;
                        statePc = 167;
                        continue stateLoop;
                    }
                }
                case 80: {
                    try {
                        var2_ref_ja = (ja) (Object) a.field_d.g(0);
                        statePc = 81;
                        continue stateLoop;
                    } catch (Throwable stateCaught_80) {
                        caughtException = stateCaught_80;
                        statePc = 167;
                        continue stateLoop;
                    }
                }
                case 81: {
                    try {
                        if (null == var2_ref_ja) {
                            statePc = 136;
                        } else {
                            statePc = 82;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_81) {
                        caughtException = stateCaught_81;
                        statePc = 167;
                        continue stateLoop;
                    }
                }
                case 82: {
                    try {
                        if (null != var2_ref_ja.field_K) {
                            statePc = 91;
                        } else {
                            statePc = 83;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_82) {
                        caughtException = stateCaught_82;
                        statePc = 167;
                        continue stateLoop;
                    }
                }
                case 83: {
                    try {
                        if (!w.field_f) {
                            statePc = 135;
                        } else {
                            statePc = 84;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_83) {
                        caughtException = stateCaught_83;
                        statePc = 167;
                        continue stateLoop;
                    }
                }
                case 84: {
                    try {
                        statePc = 86;
                        continue stateLoop;
                    } catch (Throwable stateCaught_84) {
                        caughtException = stateCaught_84;
                        statePc = 167;
                        continue stateLoop;
                    }
                }
                case 86: {
                    try {
                        if (var2_ref_ja.field_t) {
                            statePc = 91;
                        } else {
                            statePc = 87;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_86) {
                        caughtException = stateCaught_86;
                        statePc = 167;
                        continue stateLoop;
                    }
                }
                case 87: {
                    try {
                        statePc = 89;
                        continue stateLoop;
                    } catch (Throwable stateCaught_87) {
                        caughtException = stateCaught_87;
                        statePc = 167;
                        continue stateLoop;
                    }
                }
                case 89: {
                    try {
                        statePc = 135;
                        continue stateLoop;
                    } catch (Throwable stateCaught_89) {
                        caughtException = stateCaught_89;
                        statePc = 167;
                        continue stateLoop;
                    }
                }
                case 91: {
                    try {
                        re.field_j = true;
                        var2_ref_ja.a(false);
                        var2_ref_ja.a((byte) 100);
                        el.field_o.field_F = true;
                        var2_ref_ja.f(92);
                        if (ji.field_r != var2_ref_ja.field_K) {
                            statePc = 99;
                        } else {
                            statePc = 92;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_91) {
                        caughtException = stateCaught_91;
                        statePc = 167;
                        continue stateLoop;
                    }
                }
                case 92: {
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
                        statePc = 93;
                        continue stateLoop;
                    } catch (Throwable stateCaught_92) {
                        caughtException = stateCaught_92;
                        statePc = 167;
                        continue stateLoop;
                    }
                }
                case 93: {
                    try {
                        if (var2_ref_ja.field_L <= var7_int) {
                            statePc = 98;
                        } else {
                            statePc = 94;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_93) {
                        caughtException = stateCaught_93;
                        statePc = 167;
                        continue stateLoop;
                    }
                }
                case 94: {
                    try {
                        var2_ref_ja.field_n[var7_int].a(var2_ref_ja, 0);
                        var7_int++;
                        if (var9 != 0) {
                            statePc = 134;
                        } else {
                            statePc = 95;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_94) {
                        caughtException = stateCaught_94;
                        statePc = 167;
                        continue stateLoop;
                    }
                }
                case 95: {
                    try {
                        if (var9 == 0) {
                            statePc = 93;
                        } else {
                            statePc = 96;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_95) {
                        caughtException = stateCaught_95;
                        statePc = 167;
                        continue stateLoop;
                    }
                }
                case 96: {
                    try {
                        statePc = 98;
                        continue stateLoop;
                    } catch (Throwable stateCaught_96) {
                        caughtException = stateCaught_96;
                        statePc = 167;
                        continue stateLoop;
                    }
                }
                case 98: {
                    try {
                        var7 = var2_ref_ja;
                        var8 = var2_ref_ja;
                        var2_ref_ja.field_L = 0;
                        var7.field_N = 0;
                        var8.field_m = 0;
                        ji.field_r.a(-36, (hf) (Object) var2_ref_ja);
                        if (var9 == 0) {
                            statePc = 133;
                        } else {
                            statePc = 99;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_98) {
                        caughtException = stateCaught_98;
                        statePc = 167;
                        continue stateLoop;
                    }
                }
                case 99: {
                    try {
                        if (var2_ref_ja.field_K == bh.field_c) {
                            statePc = 107;
                        } else {
                            statePc = 100;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_99) {
                        caughtException = stateCaught_99;
                        statePc = 167;
                        continue stateLoop;
                    }
                }
                case 100: {
                    try {
                        statePc = 102;
                        continue stateLoop;
                    } catch (Throwable stateCaught_100) {
                        caughtException = stateCaught_100;
                        statePc = 167;
                        continue stateLoop;
                    }
                }
                case 102: {
                    try {
                        if (w.field_f) {
                            statePc = 107;
                        } else {
                            statePc = 103;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_102) {
                        caughtException = stateCaught_102;
                        statePc = 167;
                        continue stateLoop;
                    }
                }
                case 103: {
                    try {
                        statePc = 105;
                        continue stateLoop;
                    } catch (Throwable stateCaught_103) {
                        caughtException = stateCaught_103;
                        statePc = 167;
                        continue stateLoop;
                    }
                }
                case 105: {
                    try {
                        statePc = 133;
                        continue stateLoop;
                    } catch (Throwable stateCaught_105) {
                        caughtException = stateCaught_105;
                        statePc = 167;
                        continue stateLoop;
                    }
                }
                case 107: {
                    try {
                        var3_int = 0;
                        statePc = 108;
                        continue stateLoop;
                    } catch (Throwable stateCaught_107) {
                        caughtException = stateCaught_107;
                        statePc = 167;
                        continue stateLoop;
                    }
                }
                case 108: {
                    try {
                        if (var3_int >= var2_ref_ja.field_L) {
                            statePc = 113;
                        } else {
                            statePc = 109;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_108) {
                        caughtException = stateCaught_108;
                        statePc = 167;
                        continue stateLoop;
                    }
                }
                case 109: {
                    try {
                        var2_ref_ja.field_n[var3_int].a(var2_ref_ja, 0);
                        var2_ref_ja.field_n[var3_int].k(2);
                        var3_int++;
                        if (var9 != 0) {
                            statePc = 134;
                        } else {
                            statePc = 110;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_109) {
                        caughtException = stateCaught_109;
                        statePc = 167;
                        continue stateLoop;
                    }
                }
                case 110: {
                    try {
                        if (var9 == 0) {
                            statePc = 108;
                        } else {
                            statePc = 111;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_110) {
                        caughtException = stateCaught_110;
                        statePc = 167;
                        continue stateLoop;
                    }
                }
                case 111: {
                    try {
                        statePc = 113;
                        continue stateLoop;
                    } catch (Throwable stateCaught_111) {
                        caughtException = stateCaught_111;
                        statePc = 167;
                        continue stateLoop;
                    }
                }
                case 113: {
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
                            statePc = 127;
                        } else {
                            statePc = 114;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_113) {
                        caughtException = stateCaught_113;
                        statePc = 167;
                        continue stateLoop;
                    }
                }
                case 114: {
                    try {
                        if (!w.field_f) {
                            statePc = 127;
                        } else {
                            statePc = 115;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_114) {
                        caughtException = stateCaught_114;
                        statePc = 167;
                        continue stateLoop;
                    }
                }
                case 115: {
                    try {
                        statePc = 117;
                        continue stateLoop;
                    } catch (Throwable stateCaught_115) {
                        caughtException = stateCaught_115;
                        statePc = 167;
                        continue stateLoop;
                    }
                }
                case 117: {
                    try {
                        stackOut_117_0 = (int)var2_ref_ja.field_v;
                        stackOut_117_1 = (int)var2_ref_ja.field_o;
                        stackOut_117_2 = 117;
                        stackIn_123_0 = stackOut_117_0;
                        stackIn_123_1 = stackOut_117_1;
                        stackIn_123_2 = stackOut_117_2;
                        stackIn_118_0 = stackOut_117_0;
                        stackIn_118_1 = stackOut_117_1;
                        stackIn_118_2 = stackOut_117_2;
                        if (var2_ref_ja.field_z == 4) {
                            statePc = 123;
                        } else {
                            statePc = 118;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_117) {
                        caughtException = stateCaught_117;
                        statePc = 167;
                        continue stateLoop;
                    }
                }
                case 118: {
                    try {
                        stackOut_118_0 = stackIn_118_0;
                        stackOut_118_1 = stackIn_118_1;
                        stackOut_118_2 = stackIn_118_2;
                        stackIn_120_0 = stackOut_118_0;
                        stackIn_120_1 = stackOut_118_1;
                        stackIn_120_2 = stackOut_118_2;
                        statePc = 120;
                        continue stateLoop;
                    } catch (Throwable stateCaught_118) {
                        caughtException = stateCaught_118;
                        statePc = 167;
                        continue stateLoop;
                    }
                }
                case 120: {
                    try {
                        stackOut_120_0 = stackIn_120_0;
                        stackOut_120_1 = stackIn_120_1;
                        stackOut_120_2 = stackIn_120_2;
                        stackIn_125_0 = stackOut_120_0;
                        stackIn_125_1 = stackOut_120_1;
                        stackIn_125_2 = stackOut_120_2;
                        stackIn_121_0 = stackOut_120_0;
                        stackIn_121_1 = stackOut_120_1;
                        stackIn_121_2 = stackOut_120_2;
                        if (var2_ref_ja.field_z != 3) {
                            statePc = 125;
                        } else {
                            statePc = 121;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_120) {
                        caughtException = stateCaught_120;
                        statePc = 167;
                        continue stateLoop;
                    }
                }
                case 121: {
                    try {
                        stackOut_121_0 = stackIn_121_0;
                        stackOut_121_1 = stackIn_121_1;
                        stackOut_121_2 = stackIn_121_2;
                        stackIn_123_0 = stackOut_121_0;
                        stackIn_123_1 = stackOut_121_1;
                        stackIn_123_2 = stackOut_121_2;
                        statePc = 123;
                        continue stateLoop;
                    } catch (Throwable stateCaught_121) {
                        caughtException = stateCaught_121;
                        statePc = 167;
                        continue stateLoop;
                    }
                }
                case 123: {
                    try {
                        stackOut_123_0 = stackIn_123_0;
                        stackOut_123_1 = stackIn_123_1;
                        stackOut_123_2 = stackIn_123_2;
                        stackOut_123_3 = 100;
                        stackIn_126_0 = stackOut_123_0;
                        stackIn_126_1 = stackOut_123_1;
                        stackIn_126_2 = stackOut_123_2;
                        stackIn_126_3 = stackOut_123_3;
                        statePc = 126;
                        continue stateLoop;
                    } catch (Throwable stateCaught_123) {
                        caughtException = stateCaught_123;
                        statePc = 167;
                        continue stateLoop;
                    }
                }
                case 125: {
                    try {
                        stackOut_125_0 = stackIn_125_0;
                        stackOut_125_1 = stackIn_125_1;
                        stackOut_125_2 = stackIn_125_2;
                        stackOut_125_3 = 10;
                        stackIn_126_0 = stackOut_125_0;
                        stackIn_126_1 = stackOut_125_1;
                        stackIn_126_2 = stackOut_125_2;
                        stackIn_126_3 = stackOut_125_3;
                        statePc = 126;
                        continue stateLoop;
                    } catch (Throwable stateCaught_125) {
                        caughtException = stateCaught_125;
                        statePc = 167;
                        continue stateLoop;
                    }
                }
                case 126: {
                    try {
                        ld.a(stackIn_126_0, stackIn_126_1, stackIn_126_2, stackIn_126_3);
                        statePc = 127;
                        continue stateLoop;
                    } catch (Throwable stateCaught_126) {
                        caughtException = stateCaught_126;
                        statePc = 167;
                        continue stateLoop;
                    }
                }
                case 127: {
                    try {
                        if (4 == var2_ref_ja.field_z) {
                            statePc = 131;
                        } else {
                            statePc = 128;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_127) {
                        caughtException = stateCaught_127;
                        statePc = 167;
                        continue stateLoop;
                    }
                }
                case 128: {
                    try {
                        var2_ref_ja.a(320, var2_ref_ja.field_C, var2_ref_ja.field_M, 5);
                        if (var9 == 0) {
                            statePc = 133;
                        } else {
                            statePc = 129;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_128) {
                        caughtException = stateCaught_128;
                        statePc = 167;
                        continue stateLoop;
                    }
                }
                case 129: {
                    try {
                        statePc = 131;
                        continue stateLoop;
                    } catch (Throwable stateCaught_129) {
                        caughtException = stateCaught_129;
                        statePc = 167;
                        continue stateLoop;
                    }
                }
                case 131: {
                    try {
                        var2_ref_ja.a(320, var2_ref_ja.field_C, var2_ref_ja.field_M, 7);
                        var1_int++;
                        rb.field_b = rb.field_b + 1;
                        statePc = 133;
                        continue stateLoop;
                    } catch (Throwable stateCaught_131) {
                        caughtException = stateCaught_131;
                        statePc = 167;
                        continue stateLoop;
                    }
                }
                case 133: {
                    try {
                        var2_ref_ja.field_K = null;
                        statePc = 134;
                        continue stateLoop;
                    } catch (Throwable stateCaught_133) {
                        caughtException = stateCaught_133;
                        statePc = 167;
                        continue stateLoop;
                    }
                }
                case 134: {
                    try {
                        el.field_o.field_F = true;
                        statePc = 135;
                        continue stateLoop;
                    } catch (Throwable stateCaught_134) {
                        caughtException = stateCaught_134;
                        statePc = 167;
                        continue stateLoop;
                    }
                }
                case 135: {
                    try {
                        var2_ref_ja = (ja) (Object) a.field_d.d(1);
                        if (var9 == 0) {
                            statePc = 81;
                        } else {
                            statePc = 136;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_135) {
                        caughtException = stateCaught_135;
                        statePc = 167;
                        continue stateLoop;
                    }
                }
                case 136: {
                    try {
                        var2 = -23 / ((param0 - 69) / 46);
                        var3 = (ja) (Object) bh.field_c.g(0);
                        statePc = 137;
                        continue stateLoop;
                    } catch (Throwable stateCaught_136) {
                        caughtException = stateCaught_136;
                        statePc = 167;
                        continue stateLoop;
                    }
                }
                case 137: {
                    try {
                        if (var3 == null) {
                            statePc = 145;
                        } else {
                            statePc = 138;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_137) {
                        caughtException = stateCaught_137;
                        statePc = 167;
                        continue stateLoop;
                    }
                }
                case 138: {
                    try {
                        if (var9 != 0) {
                            statePc = 148;
                        } else {
                            statePc = 139;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_138) {
                        caughtException = stateCaught_138;
                        statePc = 167;
                        continue stateLoop;
                    }
                }
                case 139: {
                    try {
                        if (ra.field_a != var3.field_K) {
                            statePc = 144;
                        } else {
                            statePc = 140;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_139) {
                        caughtException = stateCaught_139;
                        statePc = 167;
                        continue stateLoop;
                    }
                }
                case 140: {
                    try {
                        statePc = 142;
                        continue stateLoop;
                    } catch (Throwable stateCaught_140) {
                        caughtException = stateCaught_140;
                        statePc = 167;
                        continue stateLoop;
                    }
                }
                case 142: {
                    try {
                        var3.a(false);
                        var3.a((byte) 51);
                        ra.field_a.a(-44, (hf) (Object) var3);
                        var3.field_K = null;
                        statePc = 144;
                        continue stateLoop;
                    } catch (Throwable stateCaught_142) {
                        caughtException = stateCaught_142;
                        statePc = 167;
                        continue stateLoop;
                    }
                }
                case 144: {
                    try {
                        var3 = (ja) (Object) bh.field_c.d(1);
                        if (var9 == 0) {
                            statePc = 137;
                        } else {
                            statePc = 145;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_144) {
                        caughtException = stateCaught_144;
                        statePc = 167;
                        continue stateLoop;
                    }
                }
                case 145: {
                    try {
                        if (!w.field_f) {
                            statePc = 148;
                        } else {
                            statePc = 146;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_145) {
                        caughtException = stateCaught_145;
                        statePc = 167;
                        continue stateLoop;
                    }
                }
                case 146: {
                    try {
                        jc.a(3, false);
                        jl.field_t = false;
                        statePc = 148;
                        continue stateLoop;
                    } catch (Throwable stateCaught_146) {
                        caughtException = stateCaught_146;
                        statePc = 167;
                        continue stateLoop;
                    }
                }
                case 148: {
                    try {
                        stackOut_148_0 = el.field_o;
                        stackIn_155_0 = stackOut_148_0;
                        stackIn_149_0 = stackOut_148_0;
                        if (el.field_o.field_F) {
                            statePc = 155;
                        } else {
                            statePc = 149;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_148) {
                        caughtException = stateCaught_148;
                        statePc = 167;
                        continue stateLoop;
                    }
                }
                case 149: {
                    try {
                        stackOut_149_0 = (gh) (Object) stackIn_149_0;
                        stackIn_155_0 = stackOut_149_0;
                        stackIn_150_0 = stackOut_149_0;
                        if (ab.field_f) {
                            statePc = 155;
                        } else {
                            statePc = 150;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_149) {
                        caughtException = stateCaught_149;
                        statePc = 167;
                        continue stateLoop;
                    }
                }
                case 150: {
                    try {
                        stackOut_150_0 = (gh) (Object) stackIn_150_0;
                        stackIn_152_0 = stackOut_150_0;
                        statePc = 152;
                        continue stateLoop;
                    } catch (Throwable stateCaught_150) {
                        caughtException = stateCaught_150;
                        statePc = 167;
                        continue stateLoop;
                    }
                }
                case 152: {
                    try {
                        stackOut_152_0 = (gh) (Object) stackIn_152_0;
                        stackIn_157_0 = stackOut_152_0;
                        stackIn_153_0 = stackOut_152_0;
                        if (!w.field_f) {
                            statePc = 157;
                        } else {
                            statePc = 153;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_152) {
                        caughtException = stateCaught_152;
                        statePc = 167;
                        continue stateLoop;
                    }
                }
                case 153: {
                    try {
                        stackOut_153_0 = (gh) (Object) stackIn_153_0;
                        stackIn_155_0 = stackOut_153_0;
                        statePc = 155;
                        continue stateLoop;
                    } catch (Throwable stateCaught_153) {
                        caughtException = stateCaught_153;
                        statePc = 167;
                        continue stateLoop;
                    }
                }
                case 155: {
                    try {
                        stackOut_155_0 = (gh) (Object) stackIn_155_0;
                        stackOut_155_1 = 1;
                        stackIn_158_0 = stackOut_155_0;
                        stackIn_158_1 = stackOut_155_1;
                        statePc = 158;
                        continue stateLoop;
                    } catch (Throwable stateCaught_155) {
                        caughtException = stateCaught_155;
                        statePc = 167;
                        continue stateLoop;
                    }
                }
                case 157: {
                    try {
                        stackOut_157_0 = (gh) (Object) stackIn_157_0;
                        stackOut_157_1 = 0;
                        stackIn_158_0 = stackOut_157_0;
                        stackIn_158_1 = stackOut_157_1;
                        statePc = 158;
                        continue stateLoop;
                    } catch (Throwable stateCaught_157) {
                        caughtException = stateCaught_157;
                        statePc = 167;
                        continue stateLoop;
                    }
                }
                case 158: {
                    try {
                        stackIn_158_0.field_F = stackIn_158_1 != 0;
                        w.field_f = false;
                        if (var1_int >= 3) {
                            statePc = 161;
                        } else {
                            statePc = 159;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_158) {
                        caughtException = stateCaught_158;
                        statePc = 167;
                        continue stateLoop;
                    }
                }
                case 159: {
                    try {
                        statePc = 162;
                        continue stateLoop;
                    } catch (Throwable stateCaught_159) {
                        caughtException = stateCaught_159;
                        statePc = 167;
                        continue stateLoop;
                    }
                }
                case 161: {
                    try {
                        ra.a(255 ^ fe.field_f, -88, fe.field_f);
                        statePc = 162;
                        continue stateLoop;
                    } catch (Throwable stateCaught_161) {
                        caughtException = stateCaught_161;
                        statePc = 167;
                        continue stateLoop;
                    }
                }
                case 162: {
                    try {
                        if (rb.field_b >= 5) {
                            statePc = 165;
                        } else {
                            statePc = 163;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_162) {
                        caughtException = stateCaught_162;
                        statePc = 167;
                        continue stateLoop;
                    }
                }
                case 163: {
                    try {
                        statePc = 168;
                        continue stateLoop;
                    } catch (Throwable stateCaught_163) {
                        caughtException = stateCaught_163;
                        statePc = 167;
                        continue stateLoop;
                    }
                }
                case 165: {
                    try {
                        ra.a(255 ^ vd.field_p, -83, vd.field_p);
                        statePc = 168;
                        continue stateLoop;
                    } catch (Throwable stateCaught_165) {
                        caughtException = stateCaught_165;
                        statePc = 167;
                        continue stateLoop;
                    }
                }
                case 167: {
                    var1 = (RuntimeException) (Object) caughtException;
                    throw t.a((Throwable) (Object) var1, "kc.C(" + param0 + ')');
                }
                case 168: {
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
