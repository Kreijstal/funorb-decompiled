/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jg extends mf {
    static boolean field_n;
    static bh field_q;
    private boolean field_s;
    static int field_o;
    static int field_m;
    static String field_r;
    private String field_l;
    static int field_k;
    static String field_p;

    final static java.applet.Applet f(int param0) {
        RuntimeException var1 = null;
        java.applet.Applet stackIn_2_0 = null;
        da stackIn_7_0 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (null == fl.field_F) {
              L1: {
                if (param0 == 1) {
                  break L1;
                } else {
                  field_m = 77;
                  break L1;
                }
              }
              stackIn_7_0 = ca.field_c;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = fl.field_F;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw bd.a((Throwable) ((Object) var1), "jg.J(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return (java.applet.Applet) ((Object) stackIn_7_0);
        }
    }

    final static void a(byte[] param0, boolean param1) {
        byte dupTemp$0 = 0;
        byte dupTemp$1 = 0;
        int stackIn_32_0 = 0;
        int stackIn_32_1 = 0;
        int stackIn_40_0 = 0;
        int stackIn_40_1 = 0;
        int stackIn_43_0 = 0;
        int stackIn_43_1 = 0;
        int stackIn_43_2 = 0;
        int stackIn_53_0 = 0;
        int stackIn_53_1 = 0;
        int stackIn_53_2 = 0;
        int stackIn_54_0 = 0;
        int stackIn_56_0 = 0;
        int stackIn_57_0 = 0;
        int stackIn_57_1 = 0;
        int stackIn_73_0 = 0;
        int stackIn_73_1 = 0;
        int stackIn_73_2 = 0;
        int stackIn_74_0 = 0;
        int stackIn_76_0 = 0;
        int stackIn_77_0 = 0;
        int stackIn_77_1 = 0;
        RuntimeException stackIn_82_0 = null;
        StringBuilder stackIn_82_1 = null;
        RuntimeException stackIn_84_0 = null;
        StringBuilder stackIn_84_1 = null;
        RuntimeException stackIn_85_0 = null;
        StringBuilder stackIn_85_1 = null;
        String stackIn_85_2 = null;
        int decompiledRegionSelector0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        va var2 = null;
        RuntimeException var2_ref = null;
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
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var15 = wizardrun.field_H;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var2 = new va(param0);
                        var2.field_m = -2 + param0.length;
                        wb.field_f = var2.j(-14477);
                        if (param1) {
                            statePc = 3;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 81;
                        continue stateLoop;
                    }
                }
                case 2: {
                    return;
                }
                case 3: {
                    try {
                        ue.field_e = new byte[wb.field_f][];
                        mf.field_j = new byte[wb.field_f][];
                        tf.field_b = new int[wb.field_f];
                        ne.field_h = new int[wb.field_f];
                        cg.field_k = new int[wb.field_f];
                        v.field_e = new boolean[wb.field_f];
                        ph.field_q = new int[wb.field_f];
                        var2.field_m = param0.length - (7 + 8 * wb.field_f);
                        hk.field_bb = var2.j(-14477);
                        eg.field_v = var2.j(-14477);
                        var3 = 1 + (255 & var2.f(255));
                        var4 = 0;
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 81;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        if ((wb.field_f ^ -1) >= (var4 ^ -1)) {
                            statePc = 8;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 81;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        ph.field_q[var4] = var2.j(-14477);
                        var4++;
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 81;
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
                        statePc = 81;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        if ((var4 ^ -1) <= (wb.field_f ^ -1)) {
                            statePc = 15;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 81;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        ne.field_h[var4] = var2.j(-14477);
                        var4++;
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 81;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 81;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        var4 = 0;
                        statePc = 16;
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 81;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        if ((var4 ^ -1) <= (wb.field_f ^ -1)) {
                            statePc = 22;
                        } else {
                            statePc = 17;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 81;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        cg.field_k[var4] = var2.j(-14477);
                        var4++;
                        statePc = 19;
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 81;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        statePc = 16;
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 81;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        var4 = 0;
                        statePc = 23;
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 81;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        if (wb.field_f <= var4) {
                            statePc = 29;
                        } else {
                            statePc = 24;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 81;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        tf.field_b[var4] = var2.j(-14477);
                        var4++;
                        statePc = 26;
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 81;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        statePc = 23;
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 81;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        var2.field_m = -(wb.field_f * 8) + (-7 + param0.length + (-(var3 * 3) + 3));
                        ic.field_b = new int[var3];
                        var4 = 1;
                        statePc = 30;
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 81;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        if ((var3 ^ -1) >= (var4 ^ -1)) {
                            statePc = 38;
                        } else {
                            statePc = 31;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 81;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        ic.field_b[var4] = var2.d((byte) 125);
                        stackIn_40_0 = ic.field_b[var4] ^ -1;
                        stackIn_32_0 = stackIn_40_0;
                        stackIn_40_1 = -1;
                        stackIn_32_1 = stackIn_40_1;
                        if (false) {
                            statePc = 40;
                        } else {
                            statePc = 32;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 81;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        if (stackIn_32_0 == stackIn_32_1) {
                            statePc = 36;
                        } else {
                            statePc = 33;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 81;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        statePc = 35;
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 81;
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        statePc = 37;
                        continue stateLoop;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 81;
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        ic.field_b[var4] = 1;
                        statePc = 37;
                        continue stateLoop;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = 81;
                        continue stateLoop;
                    }
                }
                case 37: {
                    try {
                        var4++;
                        statePc = 30;
                        continue stateLoop;
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = 81;
                        continue stateLoop;
                    }
                }
                case 38: {
                    try {
                        var2.field_m = 0;
                        var4 = 0;
                        statePc = 39;
                        continue stateLoop;
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = 81;
                        continue stateLoop;
                    }
                }
                case 39: {
                    try {
                        stackIn_40_0 = var4;
                        stackIn_40_1 = wb.field_f;
                        statePc = 40;
                        continue stateLoop;
                    } catch (Throwable stateCaught_39) {
                        caughtException = stateCaught_39;
                        statePc = 81;
                        continue stateLoop;
                    }
                }
                case 40: {
                    try {
                        if (stackIn_40_0 >= stackIn_40_1) {
                            statePc = 86;
                        } else {
                            statePc = 41;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_40) {
                        caughtException = stateCaught_40;
                        statePc = 81;
                        continue stateLoop;
                    }
                }
                case 41: {
                    try {
                        var5 = cg.field_k[var4];
                        var6 = tf.field_b[var4];
                        var7 = var6 * var5;
                        var8 = new byte[var7];
                        mf.field_j[var4] = var8;
                        var9 = new byte[var7];
                        ue.field_e[var4] = var9;
                        var10 = 0;
                        var11 = var2.f(255);
                        stackIn_43_0 = -1;
                        stackIn_43_1 = var11 & 1;
                        stackIn_43_2 = -1;
                        statePc = 43;
                        continue stateLoop;
                    } catch (Throwable stateCaught_41) {
                        caughtException = stateCaught_41;
                        statePc = 81;
                        continue stateLoop;
                    }
                }
                case 43: {
                    try {
                        if (stackIn_43_0 != (stackIn_43_1 ^ stackIn_43_2)) {
                            statePc = 59;
                        } else {
                            statePc = 44;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_43) {
                        caughtException = stateCaught_43;
                        statePc = 81;
                        continue stateLoop;
                    }
                }
                case 44: {
                    try {
                        var12 = 0;
                        statePc = 45;
                        continue stateLoop;
                    } catch (Throwable stateCaught_44) {
                        caughtException = stateCaught_44;
                        statePc = 81;
                        continue stateLoop;
                    }
                }
                case 45: {
                    try {
                        if (var7 <= var12) {
                            statePc = 49;
                        } else {
                            statePc = 46;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_45) {
                        caughtException = stateCaught_45;
                        statePc = 81;
                        continue stateLoop;
                    }
                }
                case 46: {
                    try {
                        var8[var12] = var2.k(0);
                        var12++;
                        statePc = 45;
                        continue stateLoop;
                    } catch (Throwable stateCaught_46) {
                        caughtException = stateCaught_46;
                        statePc = 81;
                        continue stateLoop;
                    }
                }
                case 49: {
                    try {
                        if ((2 & var11) == 0) {
                            statePc = 79;
                        } else {
                            statePc = 50;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_49) {
                        caughtException = stateCaught_49;
                        statePc = 81;
                        continue stateLoop;
                    }
                }
                case 50: {
                    try {
                        var12 = 0;
                        statePc = 51;
                        continue stateLoop;
                    } catch (Throwable stateCaught_50) {
                        caughtException = stateCaught_50;
                        statePc = 81;
                        continue stateLoop;
                    }
                }
                case 51: {
                    try {
                        if ((var12 ^ -1) <= (var7 ^ -1)) {
                            statePc = 58;
                        } else {
                            statePc = 52;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_51) {
                        caughtException = stateCaught_51;
                        statePc = 81;
                        continue stateLoop;
                    }
                }
                case 52: {
                    try {
                        dupTemp$0 = var2.k(0);
                        var9[var12] = dupTemp$0;
                        var13 = dupTemp$0;
                        stackIn_43_0 = var10;
                        stackIn_53_0 = stackIn_43_0;
                        stackIn_43_1 = var13;
                        stackIn_53_1 = stackIn_43_1;
                        stackIn_43_2 = -1;
                        stackIn_53_2 = stackIn_43_2;
                        if (false) {
                            statePc = 43;
                        } else {
                            statePc = 53;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_52) {
                        caughtException = stateCaught_52;
                        statePc = 81;
                        continue stateLoop;
                    }
                }
                case 53: {
                    try {
                        stackIn_56_0 = stackIn_53_0;
                        stackIn_54_0 = stackIn_56_0;
                        if (stackIn_53_1 == stackIn_53_2) {
                            statePc = 56;
                        } else {
                            statePc = 54;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_53) {
                        caughtException = stateCaught_53;
                        statePc = 81;
                        continue stateLoop;
                    }
                }
                case 54: {
                    try {
                        stackIn_57_0 = stackIn_54_0;
                        stackIn_57_1 = 1;
                        statePc = 57;
                        continue stateLoop;
                    } catch (Throwable stateCaught_54) {
                        caughtException = stateCaught_54;
                        statePc = 81;
                        continue stateLoop;
                    }
                }
                case 56: {
                    try {
                        stackIn_57_0 = stackIn_56_0;
                        stackIn_57_1 = 0;
                        statePc = 57;
                        continue stateLoop;
                    } catch (Throwable stateCaught_56) {
                        caughtException = stateCaught_56;
                        statePc = 81;
                        continue stateLoop;
                    }
                }
                case 57: {
                    try {
                        var10 = stackIn_57_0 | stackIn_57_1;
                        var12++;
                        statePc = 51;
                        continue stateLoop;
                    } catch (Throwable stateCaught_57) {
                        caughtException = stateCaught_57;
                        statePc = 81;
                        continue stateLoop;
                    }
                }
                case 58: {
                    try {
                        statePc = 79;
                        continue stateLoop;
                    } catch (Throwable stateCaught_58) {
                        caughtException = stateCaught_58;
                        statePc = 81;
                        continue stateLoop;
                    }
                }
                case 59: {
                    try {
                        var12 = 0;
                        statePc = 60;
                        continue stateLoop;
                    } catch (Throwable stateCaught_59) {
                        caughtException = stateCaught_59;
                        statePc = 81;
                        continue stateLoop;
                    }
                }
                case 60: {
                    try {
                        if ((var5 ^ -1) >= (var12 ^ -1)) {
                            statePc = 67;
                        } else {
                            statePc = 61;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_60) {
                        caughtException = stateCaught_60;
                        statePc = 81;
                        continue stateLoop;
                    }
                }
                case 61: {
                    try {
                        var13 = 0;
                        statePc = 62;
                        continue stateLoop;
                    } catch (Throwable stateCaught_61) {
                        caughtException = stateCaught_61;
                        statePc = 81;
                        continue stateLoop;
                    }
                }
                case 62: {
                    try {
                        if ((var6 ^ -1) >= (var13 ^ -1)) {
                            statePc = 66;
                        } else {
                            statePc = 63;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_62) {
                        caughtException = stateCaught_62;
                        statePc = 81;
                        continue stateLoop;
                    }
                }
                case 63: {
                    try {
                        var8[var12 + var13 * var5] = var2.k(0);
                        var13++;
                        statePc = 62;
                        continue stateLoop;
                    } catch (Throwable stateCaught_63) {
                        caughtException = stateCaught_63;
                        statePc = 81;
                        continue stateLoop;
                    }
                }
                case 66: {
                    try {
                        var12++;
                        statePc = 60;
                        continue stateLoop;
                    } catch (Throwable stateCaught_66) {
                        caughtException = stateCaught_66;
                        statePc = 81;
                        continue stateLoop;
                    }
                }
                case 67: {
                    try {
                        if (-1 == (var11 & 2 ^ -1)) {
                            statePc = 79;
                        } else {
                            statePc = 68;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_67) {
                        caughtException = stateCaught_67;
                        statePc = 81;
                        continue stateLoop;
                    }
                }
                case 68: {
                    try {
                        var12 = 0;
                        statePc = 69;
                        continue stateLoop;
                    } catch (Throwable stateCaught_68) {
                        caughtException = stateCaught_68;
                        statePc = 81;
                        continue stateLoop;
                    }
                }
                case 69: {
                    try {
                        if (var12 >= var5) {
                            statePc = 79;
                        } else {
                            statePc = 70;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_69) {
                        caughtException = stateCaught_69;
                        statePc = 81;
                        continue stateLoop;
                    }
                }
                case 70: {
                    try {
                        var13 = 0;
                        statePc = 71;
                        continue stateLoop;
                    } catch (Throwable stateCaught_70) {
                        caughtException = stateCaught_70;
                        statePc = 81;
                        continue stateLoop;
                    }
                }
                case 71: {
                    try {
                        if ((var13 ^ -1) <= (var6 ^ -1)) {
                            statePc = 78;
                        } else {
                            statePc = 72;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_71) {
                        caughtException = stateCaught_71;
                        statePc = 81;
                        continue stateLoop;
                    }
                }
                case 72: {
                    try {
                        dupTemp$1 = var2.k(0);
                        var9[var5 * var13 + var12] = dupTemp$1;
                        var14 = dupTemp$1;
                        stackIn_43_0 = var10;
                        stackIn_73_0 = stackIn_43_0;
                        stackIn_43_1 = 0;
                        stackIn_73_1 = stackIn_43_1;
                        stackIn_43_2 = var14 ^ -1;
                        stackIn_73_2 = stackIn_43_2;
                        if (false) {
                            statePc = 43;
                        } else {
                            statePc = 73;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_72) {
                        caughtException = stateCaught_72;
                        statePc = 81;
                        continue stateLoop;
                    }
                }
                case 73: {
                    try {
                        stackIn_76_0 = stackIn_73_0;
                        stackIn_74_0 = stackIn_76_0;
                        if (stackIn_73_1 == stackIn_73_2) {
                            statePc = 76;
                        } else {
                            statePc = 74;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_73) {
                        caughtException = stateCaught_73;
                        statePc = 81;
                        continue stateLoop;
                    }
                }
                case 74: {
                    try {
                        stackIn_77_0 = stackIn_74_0;
                        stackIn_77_1 = 1;
                        statePc = 77;
                        continue stateLoop;
                    } catch (Throwable stateCaught_74) {
                        caughtException = stateCaught_74;
                        statePc = 81;
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
                        statePc = 81;
                        continue stateLoop;
                    }
                }
                case 77: {
                    try {
                        var10 = stackIn_77_0 | stackIn_77_1;
                        var13++;
                        statePc = 71;
                        continue stateLoop;
                    } catch (Throwable stateCaught_77) {
                        caughtException = stateCaught_77;
                        statePc = 81;
                        continue stateLoop;
                    }
                }
                case 78: {
                    try {
                        var12++;
                        statePc = 69;
                        continue stateLoop;
                    } catch (Throwable stateCaught_78) {
                        caughtException = stateCaught_78;
                        statePc = 81;
                        continue stateLoop;
                    }
                }
                case 79: {
                    try {
                        v.field_e[var4] = var10 != 0;
                        var4++;
                        statePc = 39;
                        continue stateLoop;
                    } catch (Throwable stateCaught_79) {
                        caughtException = stateCaught_79;
                        statePc = 81;
                        continue stateLoop;
                    }
                }
                case 81: {
                    var2_ref = (RuntimeException) ((Object) caughtException);
                    stackIn_84_0 = (RuntimeException) (var2_ref);
                    stackIn_82_0 = stackIn_84_0;
                    stackIn_84_1 = new StringBuilder().append("jg.H(");
                    stackIn_82_1 = stackIn_84_1;
                    if (param0 == null) {
                        statePc = 84;
                    } else {
                        statePc = 82;
                    }
                    continue stateLoop;
                }
                case 82: {
                    stackIn_85_0 = (RuntimeException) ((Object) stackIn_82_0);
                    stackIn_85_1 = (StringBuilder) ((Object) stackIn_82_1);
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
                    throw bd.a((Throwable) ((Object) stackIn_85_0), stackIn_85_2 + ',' + param1 + ')');
                }
                case 86: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final void g(int param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          L0: {
            L1: {
              if (param0 > 68) {
                break L1;
              } else {
                this.field_l = (String) null;
                break L1;
              }
            }
            this.field_l = null;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw bd.a((Throwable) ((Object) var2), "jg.B(" + param0 + ')');
        }
    }

    final String a(String param0, int param1) {
        String var3 = null;
        RuntimeException var3_ref = null;
        String stackIn_2_0 = null;
        String stackIn_5_0 = null;
        Object stackIn_14_0 = null;
        String stackIn_20_0 = null;
        String stackIn_22_0 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_27_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        wd var4 = null;
        try {
          L0: {
            var3 = bl.a(4, (CharSequence) ((Object) param0));
            if (var3 == null) {
              if (param1 == -1) {
                L1: {
                  if (!param0.equals(this.field_l)) {
                    L2: {
                      var4 = pl.a(param1 ^ 0, param0);
                      if (var4 == null) {
                        break L2;
                      } else {
                        if (null == var4.field_h) {
                          this.field_l = param0;
                          this.field_s = var4.field_i;
                          break L1;
                        } else {
                          break L2;
                        }
                      }
                    }
                    stackIn_14_0 = null;
                    decompiledRegionSelector0 = 2;
                    break L0;
                  } else {
                    break L1;
                  }
                }
                if (!this.field_s) {
                  stackIn_20_0 = uc.field_e;
                  decompiledRegionSelector0 = 3;
                  break L0;
                } else {
                  stackIn_22_0 = oj.field_d;
                  decompiledRegionSelector0 = 4;
                  break L0;
                }
              } else {
                stackIn_5_0 = (String) null;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackIn_2_0 = (String) (var3);
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3_ref = decompiledCaughtException;
            stackIn_26_0 = (RuntimeException) (var3_ref);

            stackIn_26_1 = new StringBuilder().append("jg.A(");

            if (param0 == null) {
              stackIn_27_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackIn_27_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackIn_27_2 = "null";
              break L3;
            } else {
              stackIn_27_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackIn_27_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackIn_27_2 = "{...}";
              break L3;
            }
          }
          throw bd.a((Throwable) ((Object) stackIn_27_0), stackIn_27_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_5_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return (String) ((Object) stackIn_14_0);
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_20_0;
              } else {
                return stackIn_22_0;
              }
            }
          }
        }
    }

    jg(og param0) {
        super(param0);
        this.field_s = false;
    }

    public static void c(byte param0) {
        try {
            field_p = null;
            field_r = null;
            field_q = null;
            if (param0 <= 97) {
                field_m = 69;
            }
        } catch (RuntimeException runtimeException) {
            throw bd.a((Throwable) ((Object) runtimeException), "jg.I(" + param0 + ')');
        }
    }

    final ok a(int param0, String param1) {
        wd var3 = null;
        RuntimeException var3_ref = null;
        ok stackIn_5_0 = null;
        ok stackIn_12_0 = null;
        ok stackIn_18_0 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 == -1) {
                break L1;
              } else {
                field_k = -25;
                break L1;
              }
            }
            if (ad.a((CharSequence) ((Object) param1), (byte) 120)) {
              L2: {
                if (param1.equals(this.field_l)) {
                  break L2;
                } else {
                  L3: {
                    var3 = pl.a(param0 ^ 0, param1);
                    if (null == var3) {
                      break L3;
                    } else {
                      if (null == var3.field_h) {
                        this.field_l = param1;
                        this.field_s = var3.field_i;
                        break L2;
                      } else {
                        break L3;
                      }
                    }
                  }
                  stackIn_12_0 = l.field_S;
                  decompiledRegionSelector0 = 1;
                  break L0;
                }
              }
              L4: {
                if (this.field_s) {
                  stackIn_18_0 = gf.field_V;
                  break L4;
                } else {
                  stackIn_18_0 = hg.field_c;
                  break L4;
                }
              }
              decompiledRegionSelector0 = 2;
              break L0;
            } else {
              stackIn_5_0 = hg.field_c;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var3_ref = decompiledCaughtException;
            stackIn_22_0 = (RuntimeException) (var3_ref);

            stackIn_22_1 = new StringBuilder().append("jg.C(").append(param0).append(',');

            if (param1 == null) {
              stackIn_23_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "null";
              break L5;
            } else {
              stackIn_23_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "{...}";
              break L5;
            }
          }
          throw bd.a((Throwable) ((Object) stackIn_23_0), stackIn_23_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_5_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_12_0;
          } else {
            return stackIn_18_0;
          }
        }
    }

    static {
        field_q = new bh(8, 0, 4, 1);
        field_r = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        field_p = "EXCLUSIVE";
    }
}
