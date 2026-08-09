/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class pd {
    private ja[] field_d;
    static String field_f;
    static cj field_b;
    static String field_a;
    static String field_e;
    static int field_c;

    public static void a(byte param0) {
        field_b = null;
        field_f = null;
        field_a = null;
        int var1 = 100 / ((param0 - -82) / 37);
        field_e = null;
    }

    final void a(int param0, int param1, int param2, int param3, int param4) {
        if (param4 != 12018) {
            return;
        }
        s.a(param0, 0, this.field_d, param1, param3, param2);
    }

    final static int a(int param0) {
        if (param0 != -27486) {
            return -94;
        }
        return hp.a((byte) 99, g.field_a, 256) << 644485840 | hp.a((byte) -91, g.field_a, 256) << -1968869272 | hp.a((byte) -97, g.field_a, 256);
    }

    final static boolean a(long param0, String param1, int param2) {
        ml var4 = null;
        RuntimeException var4_ref = null;
        byte[] var5 = null;
        int stackIn_5_0 = 0;
        int stackIn_10_0 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param2 == 2) {
                break L1;
              } else {
                var5 = (byte[]) null;
                pd.a((byte) 9, (byte[]) null);
                break L1;
              }
            }
            L2: {
              var4 = dn.a(param1, false);
              if (var4 == null) {
                break L2;
              } else {
                if (var4.field_Nb == null) {
                  break L2;
                } else {
                  stackIn_5_0 = 1;
                  decompiledRegionSelector0 = 0;
                  break L0;
                }
              }
            }
            L3: {
              L4: {
                if (mh.field_c == null) {
                  break L4;
                } else {
                  if (vm.a(param0, (byte) -81) == null) {
                    break L4;
                  } else {
                    stackIn_10_0 = 1;
                    break L3;
                  }
                }
              }
              stackIn_10_0 = 0;
              break L3;
            }
            decompiledRegionSelector0 = 1;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var4_ref = decompiledCaughtException;
            stackIn_13_0 = (RuntimeException) (var4_ref);

            stackIn_13_1 = new StringBuilder().append("pd.C(").append(param0).append(',');

            if (param1 == null) {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L5;
            } else {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L5;
            }
          }
          throw fa.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_5_0 != 0;
        } else {
          return stackIn_10_0 != 0;
        }
    }

    pd(ja[] param0) {
        try {
            this.field_d = param0;
        } catch (RuntimeException runtimeException) {
            throw fa.a((Throwable) ((Object) runtimeException), "pd.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final static void a(byte param0, byte[] param1) {
        byte dupTemp$0 = 0;
        byte dupTemp$1 = 0;
        int stackIn_30_0 = 0;
        int stackIn_30_1 = 0;
        int stackIn_35_0 = 0;
        int stackIn_36_0 = 0;
        int stackIn_36_1 = 0;
        int stackIn_39_0 = 0;
        int stackIn_39_1 = 0;
        int stackIn_39_2 = 0;
        int stackIn_40_0 = 0;
        int stackIn_40_1 = 0;
        int stackIn_50_0 = 0;
        int stackIn_50_1 = 0;
        int stackIn_50_2 = 0;
        int stackIn_51_0 = 0;
        int stackIn_52_0 = 0;
        int stackIn_53_0 = 0;
        int stackIn_53_1 = 0;
        int stackIn_58_0 = 0;
        int stackIn_66_0 = 0;
        int stackIn_69_0 = 0;
        int stackIn_69_1 = 0;
        int stackIn_69_2 = 0;
        int stackIn_71_0 = 0;
        int stackIn_74_0 = 0;
        int stackIn_74_1 = 0;
        int stackIn_74_2 = 0;
        int stackIn_75_0 = 0;
        int stackIn_76_0 = 0;
        int stackIn_77_0 = 0;
        int stackIn_77_1 = 0;
        RuntimeException stackIn_83_0 = null;
        StringBuilder stackIn_83_1 = null;
        RuntimeException stackIn_84_0 = null;
        StringBuilder stackIn_84_1 = null;
        RuntimeException stackIn_85_0 = null;
        StringBuilder stackIn_85_1 = null;
        String stackIn_85_2 = null;
        int decompiledRegionSelector0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        byte[] var8 = null;
        byte[] var9 = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        k var16 = null;
        k var17 = null;
        byte[] var18 = null;
        byte[] var19 = null;
        byte[] var20 = null;
        byte[] var21 = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var15 = ZombieDawnMulti.field_E ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var16 = new k(param1);
                        var17 = var16;
                        var17.field_j = -2 + param1.length;
                        qc.field_v = var17.d((byte) 69);
                        ll.field_h = new boolean[qc.field_v];
                        qj.field_o = new int[qc.field_v];
                        k.field_i = new int[qc.field_v];
                        if (param0 > 82) {
                            statePc = 3;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 82;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        field_e = (String) null;
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 82;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        vf.field_b = new byte[qc.field_v][];
                        oq.field_w = new int[qc.field_v];
                        qp.field_t = new byte[qc.field_v][];
                        vj.field_p = new int[qc.field_v];
                        var17.field_j = param1.length + -7 - 8 * qc.field_v;
                        ie.field_nb = var17.d((byte) 69);
                        hj.field_a = var17.d((byte) 69);
                        var3 = 1 + (var17.g(31365) & 255);
                        var4 = 0;
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 82;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        if (var4 >= qc.field_v) {
                            statePc = 8;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 82;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        k.field_i[var4] = var16.d((byte) 69);
                        var4++;
                        if (var15 != 0) {
                            statePc = 9;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 82;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        if (var15 == 0) {
                            statePc = 4;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 82;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 82;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        var4 = 0;
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 82;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 82;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        if ((qc.field_v ^ -1) >= (var4 ^ -1)) {
                            statePc = 14;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 82;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        qj.field_o[var4] = var16.d((byte) 69);
                        var4++;
                        if (var15 != 0) {
                            statePc = 15;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 82;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        if (var15 == 0) {
                            statePc = 10;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 82;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        statePc = 14;
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 82;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        var4 = 0;
                        statePc = 15;
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 82;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        statePc = 16;
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 82;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        if ((var4 ^ -1) <= (qc.field_v ^ -1)) {
                            statePc = 20;
                        } else {
                            statePc = 17;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 82;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        oq.field_w[var4] = var16.d((byte) 69);
                        var4++;
                        if (var15 != 0) {
                            statePc = 21;
                        } else {
                            statePc = 18;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 82;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        if (var15 == 0) {
                            statePc = 16;
                        } else {
                            statePc = 19;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 82;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        statePc = 20;
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 82;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        var4 = 0;
                        statePc = 21;
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 82;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        statePc = 22;
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 82;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        if (var4 >= qc.field_v) {
                            statePc = 26;
                        } else {
                            statePc = 23;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 82;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        vj.field_p[var4] = var16.d((byte) 69);
                        var4++;
                        if (var15 != 0) {
                            statePc = 27;
                        } else {
                            statePc = 24;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 82;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        if (var15 == 0) {
                            statePc = 22;
                        } else {
                            statePc = 25;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 82;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        statePc = 26;
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 82;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        var17.field_j = -(var3 * 3) + -4 + (param1.length + -(8 * qc.field_v));
                        tp.field_t = new int[var3];
                        statePc = 27;
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 82;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        var4 = 1;
                        statePc = 28;
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 82;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        if ((var4 ^ -1) <= (var3 ^ -1)) {
                            statePc = 33;
                        } else {
                            statePc = 29;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 82;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        tp.field_t[var4] = var16.e(128);
                        stackIn_36_0 = -1;
                        stackIn_30_0 = stackIn_36_0;
                        stackIn_36_1 = tp.field_t[var4] ^ -1;
                        stackIn_30_1 = stackIn_36_1;
                        if (var15 != 0) {
                            statePc = 36;
                        } else {
                            statePc = 30;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 82;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        if (stackIn_30_0 != stackIn_30_1) {
                            statePc = 32;
                        } else {
                            statePc = 31;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 82;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        tp.field_t[var4] = 1;
                        statePc = 32;
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 82;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        var4++;
                        if (var15 == 0) {
                            statePc = 28;
                        } else {
                            statePc = 33;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 82;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        var17.field_j = 0;
                        var4 = 0;
                        statePc = 34;
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 82;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        stackIn_35_0 = var4;
                        statePc = 35;
                        continue stateLoop;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 82;
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        stackIn_36_0 = stackIn_35_0;
                        stackIn_36_1 = qc.field_v;
                        statePc = 36;
                        continue stateLoop;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 82;
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        if (stackIn_36_0 >= stackIn_36_1) {
                            statePc = 86;
                        } else {
                            statePc = 37;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = 82;
                        continue stateLoop;
                    }
                }
                case 37: {
                    try {
                        var5 = oq.field_w[var4];
                        var6 = vj.field_p[var4];
                        var7 = var6 * var5;
                        var20 = new byte[var7];
                        var18 = var20;
                        var8 = var18;
                        qp.field_t[var4] = var20;
                        var21 = new byte[var7];
                        var19 = var21;
                        var9 = var19;
                        vf.field_b[var4] = var21;
                        var10 = 0;
                        var11 = var17.g(31365);
                        if (var15 != 0) {
                            statePc = 87;
                        } else {
                            statePc = 38;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = 82;
                        continue stateLoop;
                    }
                }
                case 38: {
                    try {
                        stackIn_40_0 = -1;
                        stackIn_40_1 = 1 & var11 ^ -1;
                        statePc = 40;
                        continue stateLoop;
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = 82;
                        continue stateLoop;
                    }
                }
                case 39: {
                    try {
                        stackIn_40_0 = stackIn_39_0;
                        stackIn_40_1 = stackIn_39_1 ^ stackIn_39_2;
                        statePc = 40;
                        continue stateLoop;
                    } catch (Throwable stateCaught_39) {
                        caughtException = stateCaught_39;
                        statePc = 82;
                        continue stateLoop;
                    }
                }
                case 40: {
                    try {
                        if (stackIn_40_0 != stackIn_40_1) {
                            statePc = 55;
                        } else {
                            statePc = 41;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_40) {
                        caughtException = stateCaught_40;
                        statePc = 82;
                        continue stateLoop;
                    }
                }
                case 41: {
                    try {
                        var12 = 0;
                        statePc = 42;
                        continue stateLoop;
                    } catch (Throwable stateCaught_41) {
                        caughtException = stateCaught_41;
                        statePc = 82;
                        continue stateLoop;
                    }
                }
                case 42: {
                    try {
                        if ((var7 ^ -1) >= (var12 ^ -1)) {
                            statePc = 46;
                        } else {
                            statePc = 43;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_42) {
                        caughtException = stateCaught_42;
                        statePc = 82;
                        continue stateLoop;
                    }
                }
                case 43: {
                    try {
                        var8[var12] = var16.d(-249699580);
                        var12++;
                        if (var15 != 0) {
                            statePc = 80;
                        } else {
                            statePc = 44;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_43) {
                        caughtException = stateCaught_43;
                        statePc = 82;
                        continue stateLoop;
                    }
                }
                case 44: {
                    try {
                        if (var15 == 0) {
                            statePc = 42;
                        } else {
                            statePc = 45;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_44) {
                        caughtException = stateCaught_44;
                        statePc = 82;
                        continue stateLoop;
                    }
                }
                case 45: {
                    try {
                        statePc = 46;
                        continue stateLoop;
                    } catch (Throwable stateCaught_45) {
                        caughtException = stateCaught_45;
                        statePc = 82;
                        continue stateLoop;
                    }
                }
                case 46: {
                    try {
                        if ((var11 & 2 ^ -1) == -1) {
                            statePc = 79;
                        } else {
                            statePc = 47;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_46) {
                        caughtException = stateCaught_46;
                        statePc = 82;
                        continue stateLoop;
                    }
                }
                case 47: {
                    try {
                        var12 = 0;
                        statePc = 48;
                        continue stateLoop;
                    } catch (Throwable stateCaught_47) {
                        caughtException = stateCaught_47;
                        statePc = 82;
                        continue stateLoop;
                    }
                }
                case 48: {
                    try {
                        if ((var7 ^ -1) >= (var12 ^ -1)) {
                            statePc = 54;
                        } else {
                            statePc = 49;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_48) {
                        caughtException = stateCaught_48;
                        statePc = 82;
                        continue stateLoop;
                    }
                }
                case 49: {
                    try {
                        dupTemp$0 = var16.d(-249699580);
                        var9[var12] = dupTemp$0;
                        var13 = dupTemp$0;
                        stackIn_39_0 = var10;
                        stackIn_50_0 = stackIn_39_0;
                        stackIn_39_1 = 0;
                        stackIn_50_1 = stackIn_39_1;
                        stackIn_39_2 = var13 ^ -1;
                        stackIn_50_2 = stackIn_39_2;
                        if (var15 != 0) {
                            statePc = 39;
                        } else {
                            statePc = 50;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_49) {
                        caughtException = stateCaught_49;
                        statePc = 82;
                        continue stateLoop;
                    }
                }
                case 50: {
                    try {
                        stackIn_52_0 = stackIn_50_0;
                        stackIn_51_0 = stackIn_52_0;
                        if (stackIn_50_1 == stackIn_50_2) {
                            statePc = 52;
                        } else {
                            statePc = 51;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_50) {
                        caughtException = stateCaught_50;
                        statePc = 82;
                        continue stateLoop;
                    }
                }
                case 51: {
                    try {
                        stackIn_53_0 = stackIn_51_0;
                        stackIn_53_1 = 1;
                        statePc = 53;
                        continue stateLoop;
                    } catch (Throwable stateCaught_51) {
                        caughtException = stateCaught_51;
                        statePc = 82;
                        continue stateLoop;
                    }
                }
                case 52: {
                    try {
                        stackIn_53_0 = stackIn_52_0;
                        stackIn_53_1 = 0;
                        statePc = 53;
                        continue stateLoop;
                    } catch (Throwable stateCaught_52) {
                        caughtException = stateCaught_52;
                        statePc = 82;
                        continue stateLoop;
                    }
                }
                case 53: {
                    try {
                        var10 = stackIn_53_0 | stackIn_53_1;
                        var12++;
                        if (var15 == 0) {
                            statePc = 48;
                        } else {
                            statePc = 54;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_53) {
                        caughtException = stateCaught_53;
                        statePc = 82;
                        continue stateLoop;
                    }
                }
                case 54: {
                    try {
                        if (var15 == 0) {
                            statePc = 79;
                        } else {
                            statePc = 55;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_54) {
                        caughtException = stateCaught_54;
                        statePc = 82;
                        continue stateLoop;
                    }
                }
                case 55: {
                    try {
                        var12 = 0;
                        statePc = 56;
                        continue stateLoop;
                    } catch (Throwable stateCaught_55) {
                        caughtException = stateCaught_55;
                        statePc = 82;
                        continue stateLoop;
                    }
                }
                case 56: {
                    try {
                        if ((var5 ^ -1) >= (var12 ^ -1)) {
                            statePc = 65;
                        } else {
                            statePc = 57;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_56) {
                        caughtException = stateCaught_56;
                        statePc = 82;
                        continue stateLoop;
                    }
                }
                case 57: {
                    try {
                        stackIn_66_0 = 0;
                        stackIn_58_0 = stackIn_66_0;
                        if (var15 != 0) {
                            statePc = 66;
                        } else {
                            statePc = 58;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_57) {
                        caughtException = stateCaught_57;
                        statePc = 82;
                        continue stateLoop;
                    }
                }
                case 58: {
                    try {
                        var13 = stackIn_58_0;
                        statePc = 59;
                        continue stateLoop;
                    } catch (Throwable stateCaught_58) {
                        caughtException = stateCaught_58;
                        statePc = 82;
                        continue stateLoop;
                    }
                }
                case 59: {
                    try {
                        if (var13 >= var6) {
                            statePc = 63;
                        } else {
                            statePc = 60;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_59) {
                        caughtException = stateCaught_59;
                        statePc = 82;
                        continue stateLoop;
                    }
                }
                case 60: {
                    try {
                        var8[var13 * var5 + var12] = var16.d(-249699580);
                        var13++;
                        if (var15 != 0) {
                            statePc = 64;
                        } else {
                            statePc = 61;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_60) {
                        caughtException = stateCaught_60;
                        statePc = 82;
                        continue stateLoop;
                    }
                }
                case 61: {
                    try {
                        if (var15 == 0) {
                            statePc = 59;
                        } else {
                            statePc = 62;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_61) {
                        caughtException = stateCaught_61;
                        statePc = 82;
                        continue stateLoop;
                    }
                }
                case 62: {
                    try {
                        statePc = 63;
                        continue stateLoop;
                    } catch (Throwable stateCaught_62) {
                        caughtException = stateCaught_62;
                        statePc = 82;
                        continue stateLoop;
                    }
                }
                case 63: {
                    try {
                        var12++;
                        statePc = 64;
                        continue stateLoop;
                    } catch (Throwable stateCaught_63) {
                        caughtException = stateCaught_63;
                        statePc = 82;
                        continue stateLoop;
                    }
                }
                case 64: {
                    try {
                        if (var15 == 0) {
                            statePc = 56;
                        } else {
                            statePc = 65;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_64) {
                        caughtException = stateCaught_64;
                        statePc = 82;
                        continue stateLoop;
                    }
                }
                case 65: {
                    try {
                        stackIn_66_0 = var11 & 2 ^ -1;
                        statePc = 66;
                        continue stateLoop;
                    } catch (Throwable stateCaught_65) {
                        caughtException = stateCaught_65;
                        statePc = 82;
                        continue stateLoop;
                    }
                }
                case 66: {
                    try {
                        if (stackIn_66_0 == -1) {
                            statePc = 79;
                        } else {
                            statePc = 67;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_66) {
                        caughtException = stateCaught_66;
                        statePc = 82;
                        continue stateLoop;
                    }
                }
                case 67: {
                    try {
                        var12 = 0;
                        statePc = 68;
                        continue stateLoop;
                    } catch (Throwable stateCaught_67) {
                        caughtException = stateCaught_67;
                        statePc = 82;
                        continue stateLoop;
                    }
                }
                case 68: {
                    try {
                        stackIn_69_0 = var12 ^ -1;
                        stackIn_69_1 = var5;
                        stackIn_69_2 = -1;
                        statePc = 69;
                        continue stateLoop;
                    } catch (Throwable stateCaught_68) {
                        caughtException = stateCaught_68;
                        statePc = 82;
                        continue stateLoop;
                    }
                }
                case 69: {
                    try {
                        if (stackIn_69_0 <= (stackIn_69_1 ^ stackIn_69_2)) {
                            statePc = 79;
                        } else {
                            statePc = 70;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_69) {
                        caughtException = stateCaught_69;
                        statePc = 82;
                        continue stateLoop;
                    }
                }
                case 70: {
                    try {
                        stackIn_35_0 = 0;
                        stackIn_71_0 = stackIn_35_0;
                        if (var15 != 0) {
                            statePc = 35;
                        } else {
                            statePc = 71;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_70) {
                        caughtException = stateCaught_70;
                        statePc = 82;
                        continue stateLoop;
                    }
                }
                case 71: {
                    try {
                        var13 = stackIn_71_0;
                        statePc = 72;
                        continue stateLoop;
                    } catch (Throwable stateCaught_71) {
                        caughtException = stateCaught_71;
                        statePc = 82;
                        continue stateLoop;
                    }
                }
                case 72: {
                    try {
                        if ((var6 ^ -1) >= (var13 ^ -1)) {
                            statePc = 78;
                        } else {
                            statePc = 73;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_72) {
                        caughtException = stateCaught_72;
                        statePc = 82;
                        continue stateLoop;
                    }
                }
                case 73: {
                    try {
                        dupTemp$1 = var16.d(-249699580);
                        var9[var12 + var5 * var13] = dupTemp$1;
                        var14 = dupTemp$1;
                        stackIn_69_0 = var10;
                        stackIn_74_0 = stackIn_69_0;
                        stackIn_69_1 = 0;
                        stackIn_74_1 = stackIn_69_1;
                        stackIn_69_2 = var14 ^ -1;
                        stackIn_74_2 = stackIn_69_2;
                        if (var15 != 0) {
                            statePc = 69;
                        } else {
                            statePc = 74;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_73) {
                        caughtException = stateCaught_73;
                        statePc = 82;
                        continue stateLoop;
                    }
                }
                case 74: {
                    try {
                        stackIn_76_0 = stackIn_74_0;
                        stackIn_75_0 = stackIn_76_0;
                        if (stackIn_74_1 == stackIn_74_2) {
                            statePc = 76;
                        } else {
                            statePc = 75;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_74) {
                        caughtException = stateCaught_74;
                        statePc = 82;
                        continue stateLoop;
                    }
                }
                case 75: {
                    try {
                        stackIn_77_0 = stackIn_75_0;
                        stackIn_77_1 = 1;
                        statePc = 77;
                        continue stateLoop;
                    } catch (Throwable stateCaught_75) {
                        caughtException = stateCaught_75;
                        statePc = 82;
                        continue stateLoop;
                    }
                }
                case 76: {
                    try {
                        stackIn_77_0 = stackIn_76_0;
                        stackIn_77_1 = 0;
                        statePc = 77;
                        continue stateLoop;
                    } catch (Throwable stateCaught_76) {
                        caughtException = stateCaught_76;
                        statePc = 82;
                        continue stateLoop;
                    }
                }
                case 77: {
                    try {
                        var10 = stackIn_77_0 | stackIn_77_1;
                        var13++;
                        if (var15 == 0) {
                            statePc = 72;
                        } else {
                            statePc = 78;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_77) {
                        caughtException = stateCaught_77;
                        statePc = 82;
                        continue stateLoop;
                    }
                }
                case 78: {
                    try {
                        var12++;
                        if (var15 == 0) {
                            statePc = 68;
                        } else {
                            statePc = 79;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_78) {
                        caughtException = stateCaught_78;
                        statePc = 82;
                        continue stateLoop;
                    }
                }
                case 79: {
                    try {
                        ll.field_h[var4] = var10 != 0;
                        var4++;
                        statePc = 80;
                        continue stateLoop;
                    } catch (Throwable stateCaught_79) {
                        caughtException = stateCaught_79;
                        statePc = 82;
                        continue stateLoop;
                    }
                }
                case 80: {
                    try {
                        if (var15 == 0) {
                            statePc = 34;
                        } else {
                            statePc = 86;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_80) {
                        caughtException = stateCaught_80;
                        statePc = 82;
                        continue stateLoop;
                    }
                }
                case 82: {
                    var2 = (RuntimeException) ((Object) caughtException);
                    stackIn_84_0 = (RuntimeException) (var2);
                    stackIn_83_0 = stackIn_84_0;
                    stackIn_84_1 = new StringBuilder().append("pd.B(").append(param0).append(',');
                    stackIn_83_1 = stackIn_84_1;
                    if (param1 == null) {
                        statePc = 84;
                    } else {
                        statePc = 83;
                    }
                    continue stateLoop;
                }
                case 83: {
                    stackIn_85_0 = (RuntimeException) ((Object) stackIn_83_0);
                    stackIn_85_1 = (StringBuilder) ((Object) stackIn_83_1);
                    stackIn_85_2 = "{...}";
                    statePc = 85;
                    continue stateLoop;
                }
                case 84: {
                    stackIn_85_0 = (RuntimeException) ((Object) stackIn_84_0);
                    stackIn_85_1 = (StringBuilder) ((Object) stackIn_84_1);
                    stackIn_85_2 = "null";
                    statePc = 85;
                    continue stateLoop;
                }
                case 85: {
                    throw fa.a((Throwable) ((Object) stackIn_85_0), stackIn_85_2 + ')');
                }
                case 86: {
                    return;
                }
                case 87: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    static {
        field_f = "This is your RuneScape clan if you have one.";
        field_a = "Waiting for extra data";
        field_e = "Press TAB to chat or F10 to open Quick Chat.";
        field_c = 67;
    }
}
