/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class b extends RuntimeException {
    static String field_b;
    static char[] field_a;
    String field_c;
    Throwable field_d;

    final static void a(int param0, int param1, byte param2, boolean param3, qh param4) {
        byte dupTemp$0 = 0;
        boolean stackIn_10_0 = false;
        int stackIn_30_0 = 0;
        int stackIn_33_0 = 0;
        int stackIn_33_1 = 0;
        int stackIn_41_0 = 0;
        int stackIn_41_1 = 0;
        int stackIn_51_0 = 0;
        RuntimeException stackIn_66_0 = null;
        StringBuilder stackIn_66_1 = null;
        RuntimeException stackIn_68_0 = null;
        StringBuilder stackIn_68_1 = null;
        RuntimeException stackIn_69_0 = null;
        StringBuilder stackIn_69_1 = null;
        String stackIn_69_2 = null;
        boolean stackOut_9_0;
        int statePc = 0;
        Throwable caughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
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
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var19 = DungeonAssault.field_K;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var5_int = ue.a((-param0 + param1) * 3, -715);
                        var6 = 3 * param0;
                        var7 = var5_int + -10;
                        ea.c(0);
                        if (-1 <= (param4.field_w ^ -1)) {
                            statePc = 7;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 65;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        if (param4.field_y == null) {
                            statePc = 7;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 65;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 65;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        uf.c(28);
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 65;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        ab.field_c = 0;
                        var8 = 0;
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 65;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        if ((param4.field_h ^ -1) >= (var8 ^ -1)) {
                            statePc = 50;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 65;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        var9 = param4.field_A[var8];
                        var10 = param4.field_x[var8];
                        var11 = param4.field_N[var8];
                        stackOut_9_0 = param3;
                        stackIn_51_0 = stackOut_9_0 ? 1 : 0;
                        stackIn_10_0 = stackOut_9_0;
                        if (var19 != 0) {
                            statePc = 51;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 65;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        if (!stackIn_10_0) {
                            statePc = 14;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 65;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 65;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        var12 = nj.field_g[var9];
                        var13 = ra.field_b[var9];
                        var14 = -var12 + nj.field_g[var10];
                        var15 = nj.field_g[var11] - var12;
                        var16 = -var13 + ra.field_b[var10];
                        var17 = -var13 + ra.field_b[var11];
                        if (-1 >= (-(var15 * var16) + var17 * var14 ^ -1)) {
                            statePc = 49;
                        } else {
                            statePc = 14;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 65;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        var12 = ko.field_v[var9];
                        if (var12 != -2147483648) {
                            statePc = 18;
                        } else {
                            statePc = 15;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 65;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        if (var19 == 0) {
                            statePc = 49;
                        } else {
                            statePc = 16;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 65;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        statePc = 18;
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 65;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        var13 = ko.field_v[var10];
                        if (-2147483648 != var13) {
                            statePc = 22;
                        } else {
                            statePc = 19;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 65;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        if (var19 == 0) {
                            statePc = 49;
                        } else {
                            statePc = 20;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 65;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        statePc = 22;
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 65;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        var14 = ko.field_v[var11];
                        if (2147483647 != (var14 ^ -1)) {
                            statePc = 26;
                        } else {
                            statePc = 23;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 65;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        if (var19 == 0) {
                            statePc = 49;
                        } else {
                            statePc = 24;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 65;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        statePc = 26;
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 65;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        var15 = -var6 + (var14 + var13) + var12;
                        if (var7 >= 0) {
                            statePc = 29;
                        } else {
                            statePc = 27;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 65;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        stackIn_30_0 = var15 << -var7;
                        statePc = 30;
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 65;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        stackIn_30_0 = var15 >> var7;
                        statePc = 30;
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 65;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        var16 = -stackIn_30_0 + (gg.field_a.length + -1);
                        var17 = gg.field_a[var16];
                        statePc = 31;
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 65;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        if (0 == var17 >> 374589444) {
                            statePc = 40;
                        } else {
                            statePc = 32;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 65;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        var16--;
                        stackIn_41_0 = var16 ^ -1;
                        stackIn_33_0 = stackIn_41_0;
                        stackIn_41_1 = -1;
                        stackIn_33_1 = stackIn_41_1;
                        if (var19 != 0) {
                            statePc = 41;
                        } else {
                            statePc = 33;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 65;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        if (stackIn_33_0 <= stackIn_33_1) {
                            statePc = 39;
                        } else {
                            statePc = 34;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 65;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        statePc = 36;
                        continue stateLoop;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 65;
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        System.err.println("Out of range!");
                        if (var19 == 0) {
                            statePc = 49;
                        } else {
                            statePc = 37;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = 65;
                        continue stateLoop;
                    }
                }
                case 37: {
                    try {
                        statePc = 39;
                        continue stateLoop;
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = 65;
                        continue stateLoop;
                    }
                }
                case 39: {
                    try {
                        var17 = gg.field_a[var16];
                        if (var19 == 0) {
                            statePc = 31;
                        } else {
                            statePc = 40;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_39) {
                        caughtException = stateCaught_39;
                        statePc = 65;
                        continue stateLoop;
                    }
                }
                case 40: {
                    try {
                        stackIn_41_0 = var17;
                        stackIn_41_1 = var16 << 866958244;
                        statePc = 41;
                        continue stateLoop;
                    } catch (Throwable stateCaught_40) {
                        caughtException = stateCaught_40;
                        statePc = 65;
                        continue stateLoop;
                    }
                }
                case 41: {
                    try {
                        var18 = stackIn_41_0 + stackIn_41_1;
                        hf.field_yb[var18] = var8;
                        gg.field_a[var16] = 1 + var17;
                        if (param4.field_w <= 0) {
                            statePc = 48;
                        } else {
                            statePc = 42;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_41) {
                        caughtException = stateCaught_41;
                        statePc = 65;
                        continue stateLoop;
                    }
                }
                case 42: {
                    try {
                        if (null != param4.field_y) {
                            statePc = 47;
                        } else {
                            statePc = 43;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_42) {
                        caughtException = stateCaught_42;
                        statePc = 65;
                        continue stateLoop;
                    }
                }
                case 43: {
                    try {
                        statePc = 45;
                        continue stateLoop;
                    } catch (Throwable stateCaught_43) {
                        caughtException = stateCaught_43;
                        statePc = 65;
                        continue stateLoop;
                    }
                }
                case 45: {
                    try {
                        statePc = 48;
                        continue stateLoop;
                    } catch (Throwable stateCaught_45) {
                        caughtException = stateCaught_45;
                        statePc = 65;
                        continue stateLoop;
                    }
                }
                case 47: {
                    try {
                        dupTemp$0 = param4.field_y[var8];
                        hk.field_b[dupTemp$0] = hk.field_b[dupTemp$0] + 1;
                        statePc = 48;
                        continue stateLoop;
                    } catch (Throwable stateCaught_47) {
                        caughtException = stateCaught_47;
                        statePc = 65;
                        continue stateLoop;
                    }
                }
                case 48: {
                    try {
                        ab.field_c = ab.field_c + 1;
                        statePc = 49;
                        continue stateLoop;
                    } catch (Throwable stateCaught_48) {
                        caughtException = stateCaught_48;
                        statePc = 65;
                        continue stateLoop;
                    }
                }
                case 49: {
                    try {
                        var8++;
                        if (var19 == 0) {
                            statePc = 8;
                        } else {
                            statePc = 50;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_49) {
                        caughtException = stateCaught_49;
                        statePc = 65;
                        continue stateLoop;
                    }
                }
                case 50: {
                    try {
                        stackIn_51_0 = param4.field_w;
                        statePc = 51;
                        continue stateLoop;
                    } catch (Throwable stateCaught_50) {
                        caughtException = stateCaught_50;
                        statePc = 65;
                        continue stateLoop;
                    }
                }
                case 51: {
                    try {
                        if (stackIn_51_0 <= 0) {
                            statePc = 61;
                        } else {
                            statePc = 52;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_51) {
                        caughtException = stateCaught_51;
                        statePc = 65;
                        continue stateLoop;
                    }
                }
                case 52: {
                    try {
                        if (param4.field_y == null) {
                            statePc = 61;
                        } else {
                            statePc = 53;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_52) {
                        caughtException = stateCaught_52;
                        statePc = 65;
                        continue stateLoop;
                    }
                }
                case 53: {
                    try {
                        statePc = 55;
                        continue stateLoop;
                    } catch (Throwable stateCaught_53) {
                        caughtException = stateCaught_53;
                        statePc = 65;
                        continue stateLoop;
                    }
                }
                case 55: {
                    try {
                        var8 = 0;
                        var9 = 0;
                        statePc = 56;
                        continue stateLoop;
                    } catch (Throwable stateCaught_55) {
                        caughtException = stateCaught_55;
                        statePc = 65;
                        continue stateLoop;
                    }
                }
                case 56: {
                    try {
                        if ((hk.field_b.length ^ -1) >= (var9 ^ -1)) {
                            statePc = 61;
                        } else {
                            statePc = 57;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_56) {
                        caughtException = stateCaught_56;
                        statePc = 65;
                        continue stateLoop;
                    }
                }
                case 57: {
                    try {
                        var10 = hk.field_b[var9];
                        hk.field_b[var9] = var8;
                        var8 = var8 + var10;
                        var9++;
                        if (var19 != 0) {
                            statePc = 70;
                        } else {
                            statePc = 58;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_57) {
                        caughtException = stateCaught_57;
                        statePc = 65;
                        continue stateLoop;
                    }
                }
                case 58: {
                    try {
                        if (var19 == 0) {
                            statePc = 56;
                        } else {
                            statePc = 59;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_58) {
                        caughtException = stateCaught_58;
                        statePc = 65;
                        continue stateLoop;
                    }
                }
                case 59: {
                    try {
                        statePc = 61;
                        continue stateLoop;
                    } catch (Throwable stateCaught_59) {
                        caughtException = stateCaught_59;
                        statePc = 65;
                        continue stateLoop;
                    }
                }
                case 61: {
                    try {
                        if (param2 <= -27) {
                            statePc = 70;
                        } else {
                            statePc = 62;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_61) {
                        caughtException = stateCaught_61;
                        statePc = 65;
                        continue stateLoop;
                    }
                }
                case 62: {
                    try {
                        b.b(-114);
                        statePc = 70;
                        continue stateLoop;
                    } catch (Throwable stateCaught_62) {
                        caughtException = stateCaught_62;
                        statePc = 65;
                        continue stateLoop;
                    }
                }
                case 65: {
                    var5 = (RuntimeException) ((Object) caughtException);
                    stackIn_68_0 = (RuntimeException) (var5);
                    stackIn_66_0 = stackIn_68_0;
                    stackIn_68_1 = new StringBuilder().append("b.E(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
                    stackIn_66_1 = stackIn_68_1;
                    if (param4 == null) {
                        statePc = 68;
                    } else {
                        statePc = 66;
                    }
                    continue stateLoop;
                }
                case 66: {
                    stackIn_69_0 = (RuntimeException) ((Object) stackIn_66_0);
                    stackIn_69_1 = (StringBuilder) ((Object) stackIn_66_1);
                    stackIn_69_2 = "{...}";
                    statePc = 69;
                    continue stateLoop;
                }
                case 68: {
                    stackIn_69_0 = (RuntimeException) ((Object) stackIn_68_0);
                    stackIn_69_1 = (StringBuilder) ((Object) stackIn_68_1);
                    stackIn_69_2 = "null";
                    statePc = 69;
                    continue stateLoop;
                }
                case 69: {
                    throw vk.a((Throwable) ((Object) stackIn_69_0), stackIn_69_2 + ')');
                }
                case 70: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static long a(int param0) {
        RuntimeException var1 = null;
        long stackIn_2_0 = 0L;
        long stackIn_4_0 = 0L;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param0 > 118) {
              stackIn_4_0 = -qm.field_o + kd.c(-2456);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = 109L;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw vk.a((Throwable) ((Object) var1), "b.D(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_4_0;
        }
    }

    public static void b(int param0) {
        try {
            field_a = null;
            field_b = null;
            if (param0 != -30719) {
                b.a(-59);
            }
        } catch (RuntimeException runtimeException) {
            throw runtimeException;
        }
    }

    final static void a(hl param0, boolean param1, byte param2, int param3, boolean param4) {
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        RuntimeException stackIn_36_0 = null;
        StringBuilder stackIn_36_1 = null;
        String stackIn_36_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        String var7 = null;
        try {
          L0: {
            L1: {
              L2: {
                n.field_f[0] = bl.field_i.nextInt();
                n.field_f[1] = bl.field_i.nextInt();
                ta.field_c.field_o = 0;
                n.field_f[2] = (int)(o.field_j >> -1106920672);
                n.field_f[3] = (int)o.field_j;
                ta.field_c.a((byte) 63, n.field_f[0]);
                ta.field_c.a((byte) 63, n.field_f[1]);
                ta.field_c.a((byte) 63, n.field_f[2]);
                ta.field_c.a((byte) 63, n.field_f[3]);
                mf.a(-30463, ta.field_c);
                ta.field_c.i(param3, -112);
                param0.a(ta.field_c, (byte) -79);
                ac.field_B.field_o = 0;
                if (!param4) {
                  break L2;
                } else {
                  ac.field_B.a(6, 18);
                  if (DungeonAssault.field_K == 0) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              ac.field_B.a(6, 16);
              break L1;
            }
            if (param2 <= -22) {
              L3: {
                ac.field_B.field_o = ac.field_B.field_o + 2;
                var5_int = ac.field_B.field_o;
                ac.field_B.a((byte) 63, la.field_c);
                ac.field_B.a(58, dn.field_Q);
                var6 = 0;
                if (ld.field_g) {
                  var6 = var6 | 1;
                  break L3;
                } else {
                  break L3;
                }
              }
              L4: {
                if (!fa.field_j) {
                  break L4;
                } else {
                  var6 = var6 | 4;
                  break L4;
                }
              }
              L5: {
                if (param1) {
                  var6 = var6 | 8;
                  break L5;
                } else {
                  break L5;
                }
              }
              L6: {
                if (pd.field_E != null) {
                  var6 = var6 | 16;
                  break L6;
                } else {
                  break L6;
                }
              }
              L7: {
                ac.field_B.a(6, var6);
                var7 = oj.a(m.c(true), (byte) 98);
                if (null == var7) {
                  var7 = "";
                  break L7;
                } else {
                  break L7;
                }
              }
              L8: {
                ac.field_B.b(var7, (byte) -20);
                if (null != pd.field_E) {
                  ac.field_B.a(2, pd.field_E);
                  break L8;
                } else {
                  break L8;
                }
              }
              of.a(ac.field_B, kd.field_d, om.field_c, (byte) -114, ta.field_c);
              ac.field_B.b(-var5_int + ac.field_B.field_o, 1);
              op.a(0, -1);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var5 = decompiledCaughtException;
            stackIn_35_0 = (RuntimeException) (var5);

            stackIn_35_1 = new StringBuilder().append("b.A(");

            if (param0 == null) {
              stackIn_36_0 = (RuntimeException) ((Object) stackIn_35_0);
              stackIn_36_1 = (StringBuilder) ((Object) stackIn_35_1);
              stackIn_36_2 = "null";
              break L9;
            } else {
              stackIn_36_0 = (RuntimeException) ((Object) stackIn_35_0);
              stackIn_36_1 = (StringBuilder) ((Object) stackIn_35_1);
              stackIn_36_2 = "{...}";
              break L9;
            }
          }
          throw vk.a((Throwable) ((Object) stackIn_36_0), stackIn_36_2 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final static String a(String param0, int param1) {
        RuntimeException var2 = null;
        String stackIn_4_0 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param1 == -1) {
                break L1;
              } else {
                field_b = (String) null;
                break L1;
              }
            }
            stackIn_4_0 = "<col=FF0000>" + param0 + "</col>";
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackIn_8_0 = (RuntimeException) (var2);

            stackIn_8_1 = new StringBuilder().append("b.B(");

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
          throw vk.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ',' + param1 + ')');
        }
        return stackIn_4_0;
    }

    b(Throwable param0, String param1) {
        try {
            this.field_d = param0;
            this.field_c = param1;
        } catch (RuntimeException runtimeException) {
            throw runtimeException;
        }
    }

    static {
        field_a = new char[128];
        field_b = "Unable to connect to the data server. Please check any firewall you are using.";
    }
}
