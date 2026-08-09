/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qh implements java.awt.event.MouseListener, java.awt.event.MouseMotionListener, java.awt.event.FocusListener {
    static String[] field_c;
    static le[] field_a;
    static int field_b;

    final static void a(int param0, boolean param1) {
        gb.field_f = param0;
        if (!param1) {
            qh.a(-59, (aj) null, -21, false, (aj) null, 19, (String) null);
        }
    }

    public final synchronized void mouseExited(java.awt.event.MouseEvent param0) {
        try {
            if (we.field_n != null) {
                mg.field_s = 0;
                b.field_k = -1;
                dh.field_b = -1;
                oh.field_b = true;
            }
        } catch (RuntimeException runtimeException) {
            throw la.a((Throwable) ((Object) runtimeException), "qh.mouseExited(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    public final synchronized void mouseMoved(java.awt.event.MouseEvent param0) {
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          L0: {
            L1: {
              if (null != we.field_n) {
                mg.field_s = 0;
                b.field_k = param0.getX();
                dh.field_b = param0.getY();
                oh.field_b = true;
                break L1;
              } else {
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var2);

            stackIn_6_1 = new StringBuilder().append("qh.mouseMoved(");

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
          throw la.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ')');
        }
    }

    public static void a(int param0) {
        if (param0 != 8) {
            return;
        }
        field_c = null;
        field_a = null;
    }

    public final synchronized void mouseEntered(java.awt.event.MouseEvent param0) {
        try {
            if (null != we.field_n) {
                mg.field_s = 0;
                b.field_k = param0.getX();
                dh.field_b = param0.getY();
                oh.field_b = true;
            }
        } catch (RuntimeException runtimeException) {
            throw la.a((Throwable) ((Object) runtimeException), "qh.mouseEntered(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    public final synchronized void mouseDragged(java.awt.event.MouseEvent param0) {
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          L0: {
            L1: {
              if (we.field_n != null) {
                mg.field_s = 0;
                b.field_k = param0.getX();
                dh.field_b = param0.getY();
                oh.field_b = true;
                break L1;
              } else {
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var2);

            stackIn_6_1 = new StringBuilder().append("qh.mouseDragged(");

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
          throw la.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ')');
        }
    }

    final static int a(int param0, aj param1, int param2, boolean param3, aj param4, int param5, String param6) {
        int stackIn_8_0 = 0;
        gk stackIn_18_0 = null;
        gk stackIn_19_0 = null;
        gk stackIn_20_0 = null;
        String stackIn_20_1 = null;
        gk stackIn_21_0 = null;
        gk stackIn_22_0 = null;
        gk stackIn_23_0 = null;
        String stackIn_23_1 = null;
        int stackIn_34_0 = 0;
        int stackIn_53_0 = 0;
        int stackIn_63_0 = 0;
        int stackIn_72_0 = 0;
        int stackIn_75_0 = 0;
        RuntimeException stackIn_77_0 = null;
        StringBuilder stackIn_77_1 = null;
        RuntimeException stackIn_78_0 = null;
        StringBuilder stackIn_78_1 = null;
        RuntimeException stackIn_79_0 = null;
        StringBuilder stackIn_79_1 = null;
        String stackIn_79_2 = null;
        RuntimeException stackIn_80_0 = null;
        StringBuilder stackIn_80_1 = null;
        RuntimeException stackIn_81_0 = null;
        StringBuilder stackIn_81_1 = null;
        RuntimeException stackIn_82_0 = null;
        StringBuilder stackIn_82_1 = null;
        String stackIn_82_2 = null;
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
        RuntimeException var7 = null;
        String var8 = null;
        int var9 = 0;
        String var9_ref_String = null;
        int var10 = 0;
        String var11_ref_String = null;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        String var14 = null;
        CharSequence var15 = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var13 = MonkeyPuzzle2.field_F ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (param2 == -1) {
                            statePc = 3;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 76;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        field_a = (le[]) null;
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 76;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        var14 = param4.a((byte) -93);
                        var11_ref_String = var14;
                        var11_ref_String = var14;
                        var8 = param1.a((byte) -77);
                        var11_ref_String = var8;
                        var11_ref_String = var8;
                        if (null == ol.field_g) {
                            statePc = 5;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 76;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 76;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        if (!cb.a(-123, false)) {
                            statePc = 7;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 76;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 76;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        stackIn_8_0 = -1;
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 76;
                        continue stateLoop;
                    }
                }
                case 8: {
                    return stackIn_8_0;
                }
                case 9: {
                    try {
                        if (ii.field_r == dk.field_h) {
                            statePc = 11;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 76;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        statePc = 25;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 76;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        kc.field_b = null;
                        gf.field_c.field_h = 0;
                        if (param6 == null) {
                            statePc = 17;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 76;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        var9 = 0;
                        uc.field_a.field_h = 0;
                        if (!param3) {
                            statePc = 14;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 76;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        var9 = var9 | 1;
                        statePc = 14;
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 76;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        uc.field_a.a(-803539344, pi.field_l.nextInt());
                        uc.field_a.a(param2 ^ 803539343, pi.field_l.nextInt());
                        uc.field_a.a(var14, param2 ^ 103);
                        uc.field_a.a(var8, -64);
                        var15 = (CharSequence) ((Object) param6);
                        uc.field_a.a(q.a(var15, 20), 122);
                        uc.field_a.c(param0, 127);
                        uc.field_a.b(param5, param2 + -49151);
                        uc.field_a.b(var9, -49152);
                        gf.field_c.b(18, param2 + -49151);
                        gf.field_c.field_h = gf.field_c.field_h + 2;
                        var10 = gf.field_c.field_h;
                        var11_ref_String = lc.a(ii.a(false), (byte) -89);
                        if (var11_ref_String != null) {
                            statePc = 16;
                        } else {
                            statePc = 15;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 76;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        var11_ref_String = "";
                        statePc = 16;
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 76;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        gf.field_c.a(param2 + 69, var11_ref_String);
                        e.a(sd.field_a, fj.field_F, (byte) -112, gf.field_c, uc.field_a);
                        gf.field_c.d(6903, gf.field_c.field_h - var10);
                        if (var13 == 0) {
                            statePc = 24;
                        } else {
                            statePc = 17;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 76;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        uc.field_a.field_h = 0;
                        uc.field_a.a(-803539344, pi.field_l.nextInt());
                        uc.field_a.a(-803539344, pi.field_l.nextInt());
                        stackIn_19_0 = uc.field_a;
                        stackIn_18_0 = stackIn_19_0;
                        if (!param4.b(0)) {
                            statePc = 19;
                        } else {
                            statePc = 18;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 76;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        stackIn_20_0 = (gk) ((Object) stackIn_18_0);
                        stackIn_20_1 = (String) (var14);
                        statePc = 20;
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 76;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        stackIn_20_0 = (gk) ((Object) stackIn_19_0);
                        stackIn_20_1 = "";
                        statePc = 20;
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 76;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        ((gk) (Object) stackIn_20_0).a(stackIn_20_1, -84);
                        stackIn_22_0 = uc.field_a;
                        stackIn_21_0 = stackIn_22_0;
                        if (!param1.b(0)) {
                            statePc = 22;
                        } else {
                            statePc = 21;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 76;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        stackIn_23_0 = (gk) ((Object) stackIn_21_0);
                        stackIn_23_1 = (String) (var8);
                        statePc = 23;
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 76;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        stackIn_23_0 = (gk) ((Object) stackIn_22_0);
                        stackIn_23_1 = "";
                        statePc = 23;
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 76;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        ((gk) (Object) stackIn_23_0).a(stackIn_23_1, 116);
                        gf.field_c.b(16, param2 + -49151);
                        gf.field_c.field_h = gf.field_c.field_h + 1;
                        var9 = gf.field_c.field_h;
                        e.a(sd.field_a, fj.field_F, (byte) 113, gf.field_c, uc.field_a);
                        gf.field_c.a(gf.field_c.field_h + -var9, (byte) -114);
                        statePc = 24;
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 76;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        al.a((byte) -71, -1);
                        dk.field_h = vd.field_e;
                        statePc = 25;
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 76;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        if (vd.field_e == dk.field_h) {
                            statePc = 27;
                        } else {
                            statePc = 26;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 76;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        statePc = 41;
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 76;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        if (hj.a(1, true)) {
                            statePc = 29;
                        } else {
                            statePc = 28;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 76;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        statePc = 41;
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 76;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        var9 = MonkeyPuzzle2.field_D.a((byte) 114);
                        MonkeyPuzzle2.field_D.field_h = 0;
                        if (var9 < 100) {
                            statePc = 32;
                        } else {
                            statePc = 30;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 76;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        if (105 >= var9) {
                            statePc = 40;
                        } else {
                            statePc = 31;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 76;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        statePc = 32;
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 76;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        if ((var9 ^ -1) != -249) {
                            statePc = 35;
                        } else {
                            statePc = 33;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 76;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        nh.a((byte) 99, ii.a(false));
                        sl.field_n = sb.field_q;
                        gk.a(-1);
                        ck.field_e = false;
                        stackIn_34_0 = var9;
                        statePc = 34;
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 76;
                        continue stateLoop;
                    }
                }
                case 34: {
                    return stackIn_34_0;
                }
                case 35: {
                    try {
                        if (-100 == (var9 ^ -1)) {
                            statePc = 38;
                        } else {
                            statePc = 36;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 76;
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        dk.field_h = ma.field_d;
                        rc.field_f = -1;
                        wk.field_a = var9;
                        if (var13 == 0) {
                            statePc = 41;
                        } else {
                            statePc = 37;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = 76;
                        continue stateLoop;
                    }
                }
                case 37: {
                    try {
                        statePc = 38;
                        continue stateLoop;
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = 76;
                        continue stateLoop;
                    }
                }
                case 38: {
                    try {
                        hj.a(gb.a((byte) 57), true);
                        kc.field_b = new Boolean(bi.a((byte) 122, MonkeyPuzzle2.field_D));
                        MonkeyPuzzle2.field_D.field_h = 0;
                        if (var13 == 0) {
                            statePc = 41;
                        } else {
                            statePc = 39;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = 76;
                        continue stateLoop;
                    }
                }
                case 39: {
                    try {
                        statePc = 40;
                        continue stateLoop;
                    } catch (Throwable stateCaught_39) {
                        caughtException = stateCaught_39;
                        statePc = 76;
                        continue stateLoop;
                    }
                }
                case 40: {
                    try {
                        cm.field_E = new String[-100 + var9];
                        dk.field_h = MonkeyPuzzle2.field_C;
                        statePc = 41;
                        continue stateLoop;
                    } catch (Throwable stateCaught_40) {
                        caughtException = stateCaught_40;
                        statePc = 76;
                        continue stateLoop;
                    }
                }
                case 41: {
                    try {
                        if (MonkeyPuzzle2.field_C != dk.field_h) {
                            statePc = 54;
                        } else {
                            statePc = 42;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_41) {
                        caughtException = stateCaught_41;
                        statePc = 76;
                        continue stateLoop;
                    }
                }
                case 42: {
                    try {
                        var9 = 2;
                        if (hj.a(var9, true)) {
                            statePc = 44;
                        } else {
                            statePc = 43;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_42) {
                        caughtException = stateCaught_42;
                        statePc = 76;
                        continue stateLoop;
                    }
                }
                case 43: {
                    try {
                        statePc = 54;
                        continue stateLoop;
                    } catch (Throwable stateCaught_43) {
                        caughtException = stateCaught_43;
                        statePc = 76;
                        continue stateLoop;
                    }
                }
                case 44: {
                    try {
                        var10 = MonkeyPuzzle2.field_D.j(17277);
                        MonkeyPuzzle2.field_D.field_h = 0;
                        if (hj.a(var10, true)) {
                            statePc = 46;
                        } else {
                            statePc = 45;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_44) {
                        caughtException = stateCaught_44;
                        statePc = 76;
                        continue stateLoop;
                    }
                }
                case 45: {
                    try {
                        statePc = 54;
                        continue stateLoop;
                    } catch (Throwable stateCaught_45) {
                        caughtException = stateCaught_45;
                        statePc = 76;
                        continue stateLoop;
                    }
                }
                case 46: {
                    try {
                        var11 = cm.field_E.length;
                        var12 = 0;
                        statePc = 47;
                        continue stateLoop;
                    } catch (Throwable stateCaught_46) {
                        caughtException = stateCaught_46;
                        statePc = 76;
                        continue stateLoop;
                    }
                }
                case 47: {
                    try {
                        if ((var11 ^ -1) >= (var12 ^ -1)) {
                            statePc = 51;
                        } else {
                            statePc = 48;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_47) {
                        caughtException = stateCaught_47;
                        statePc = 76;
                        continue stateLoop;
                    }
                }
                case 48: {
                    try {
                        cm.field_E[var12] = MonkeyPuzzle2.field_D.b((byte) 93);
                        var12++;
                        if (var13 != 0) {
                            statePc = 52;
                        } else {
                            statePc = 49;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_48) {
                        caughtException = stateCaught_48;
                        statePc = 76;
                        continue stateLoop;
                    }
                }
                case 49: {
                    try {
                        if (var13 == 0) {
                            statePc = 47;
                        } else {
                            statePc = 50;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_49) {
                        caughtException = stateCaught_49;
                        statePc = 76;
                        continue stateLoop;
                    }
                }
                case 50: {
                    try {
                        statePc = 51;
                        continue stateLoop;
                    } catch (Throwable stateCaught_50) {
                        caughtException = stateCaught_50;
                        statePc = 76;
                        continue stateLoop;
                    }
                }
                case 51: {
                    try {
                        gk.a(-1);
                        ck.field_e = false;
                        statePc = 52;
                        continue stateLoop;
                    } catch (Throwable stateCaught_51) {
                        caughtException = stateCaught_51;
                        statePc = 76;
                        continue stateLoop;
                    }
                }
                case 52: {
                    try {
                        stackIn_53_0 = 100 + var11;
                        statePc = 53;
                        continue stateLoop;
                    } catch (Throwable stateCaught_52) {
                        caughtException = stateCaught_52;
                        statePc = 76;
                        continue stateLoop;
                    }
                }
                case 53: {
                    return stackIn_53_0;
                }
                case 54: {
                    try {
                        if (dk.field_h == ma.field_d) {
                            statePc = 56;
                        } else {
                            statePc = 55;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_54) {
                        caughtException = stateCaught_54;
                        statePc = 76;
                        continue stateLoop;
                    }
                }
                case 55: {
                    try {
                        statePc = 64;
                        continue stateLoop;
                    } catch (Throwable stateCaught_55) {
                        caughtException = stateCaught_55;
                        statePc = 76;
                        continue stateLoop;
                    }
                }
                case 56: {
                    try {
                        if (!gb.a(true)) {
                            statePc = 64;
                        } else {
                            statePc = 57;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_56) {
                        caughtException = stateCaught_56;
                        statePc = 76;
                        continue stateLoop;
                    }
                }
                case 57: {
                    try {
                        if ((wk.field_a ^ -1) != -256) {
                            statePc = 61;
                        } else {
                            statePc = 58;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_57) {
                        caughtException = stateCaught_57;
                        statePc = 76;
                        continue stateLoop;
                    }
                }
                case 58: {
                    try {
                        var9_ref_String = MonkeyPuzzle2.field_D.g(-1185292952);
                        if (var9_ref_String == null) {
                            statePc = 60;
                        } else {
                            statePc = 59;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_58) {
                        caughtException = stateCaught_58;
                        statePc = 76;
                        continue stateLoop;
                    }
                }
                case 59: {
                    try {
                        pe.a(var9_ref_String, (byte) -108, ii.a(false));
                        statePc = 60;
                        continue stateLoop;
                    } catch (Throwable stateCaught_59) {
                        caughtException = stateCaught_59;
                        statePc = 76;
                        continue stateLoop;
                    }
                }
                case 60: {
                    try {
                        if (var13 == 0) {
                            statePc = 62;
                        } else {
                            statePc = 61;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_60) {
                        caughtException = stateCaught_60;
                        statePc = 76;
                        continue stateLoop;
                    }
                }
                case 61: {
                    try {
                        sl.field_n = MonkeyPuzzle2.field_D.f(-1);
                        statePc = 62;
                        continue stateLoop;
                    } catch (Throwable stateCaught_61) {
                        caughtException = stateCaught_61;
                        statePc = 76;
                        continue stateLoop;
                    }
                }
                case 62: {
                    try {
                        gk.a(param2 ^ 0);
                        ck.field_e = false;
                        stackIn_63_0 = wk.field_a;
                        statePc = 63;
                        continue stateLoop;
                    } catch (Throwable stateCaught_62) {
                        caughtException = stateCaught_62;
                        statePc = 76;
                        continue stateLoop;
                    }
                }
                case 63: {
                    return stackIn_63_0;
                }
                case 64: {
                    try {
                        if (ol.field_g == null) {
                            statePc = 66;
                        } else {
                            statePc = 65;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_64) {
                        caughtException = stateCaught_64;
                        statePc = 76;
                        continue stateLoop;
                    }
                }
                case 65: {
                    try {
                        statePc = 74;
                        continue stateLoop;
                    } catch (Throwable stateCaught_65) {
                        caughtException = stateCaught_65;
                        statePc = 76;
                        continue stateLoop;
                    }
                }
                case 66: {
                    try {
                        if (!ck.field_e) {
                            statePc = 73;
                        } else {
                            statePc = 67;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_66) {
                        caughtException = stateCaught_66;
                        statePc = 76;
                        continue stateLoop;
                    }
                }
                case 67: {
                    try {
                        if (wf.a(114) > 30000L) {
                            statePc = 70;
                        } else {
                            statePc = 68;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_67) {
                        caughtException = stateCaught_67;
                        statePc = 76;
                        continue stateLoop;
                    }
                }
                case 68: {
                    try {
                        sl.field_n = hh.field_p;
                        if (var13 == 0) {
                            statePc = 71;
                        } else {
                            statePc = 69;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_68) {
                        caughtException = stateCaught_68;
                        statePc = 76;
                        continue stateLoop;
                    }
                }
                case 69: {
                    try {
                        statePc = 70;
                        continue stateLoop;
                    } catch (Throwable stateCaught_69) {
                        caughtException = stateCaught_69;
                        statePc = 76;
                        continue stateLoop;
                    }
                }
                case 70: {
                    try {
                        sl.field_n = kj.field_E;
                        statePc = 71;
                        continue stateLoop;
                    } catch (Throwable stateCaught_70) {
                        caughtException = stateCaught_70;
                        statePc = 76;
                        continue stateLoop;
                    }
                }
                case 71: {
                    try {
                        ck.field_e = false;
                        stackIn_72_0 = 249;
                        statePc = 72;
                        continue stateLoop;
                    } catch (Throwable stateCaught_71) {
                        caughtException = stateCaught_71;
                        statePc = 76;
                        continue stateLoop;
                    }
                }
                case 72: {
                    return stackIn_72_0;
                }
                case 73: {
                    try {
                        var9 = cg.field_g;
                        cg.field_g = id.field_m;
                        ck.field_e = true;
                        id.field_m = var9;
                        statePc = 74;
                        continue stateLoop;
                    } catch (Throwable stateCaught_73) {
                        caughtException = stateCaught_73;
                        statePc = 76;
                        continue stateLoop;
                    }
                }
                case 74: {
                    try {
                        stackIn_75_0 = -1;
                        statePc = 75;
                        continue stateLoop;
                    } catch (Throwable stateCaught_74) {
                        caughtException = stateCaught_74;
                        statePc = 76;
                        continue stateLoop;
                    }
                }
                case 75: {
                    return stackIn_75_0;
                }
                case 76: {
                    var7 = (RuntimeException) ((Object) caughtException);
                    stackIn_78_0 = (RuntimeException) (var7);
                    stackIn_77_0 = stackIn_78_0;
                    stackIn_78_1 = new StringBuilder().append("qh.C(").append(param0).append(',');
                    stackIn_77_1 = stackIn_78_1;
                    if (param1 == null) {
                        statePc = 78;
                    } else {
                        statePc = 77;
                    }
                    continue stateLoop;
                }
                case 77: {
                    stackIn_79_0 = (RuntimeException) ((Object) stackIn_77_0);
                    stackIn_79_1 = (StringBuilder) ((Object) stackIn_77_1);
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
                    stackIn_81_0 = (RuntimeException) ((Object) stackIn_79_0);
                    stackIn_80_0 = stackIn_81_0;
                    stackIn_81_1 = ((StringBuilder) (Object) stackIn_79_1).append(stackIn_79_2).append(',').append(param2).append(',').append(param3).append(',');
                    stackIn_80_1 = stackIn_81_1;
                    if (param4 == null) {
                        statePc = 81;
                    } else {
                        statePc = 80;
                    }
                    continue stateLoop;
                }
                case 80: {
                    stackIn_82_0 = (RuntimeException) ((Object) stackIn_80_0);
                    stackIn_82_1 = (StringBuilder) ((Object) stackIn_80_1);
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
                    stackIn_84_0 = (RuntimeException) ((Object) stackIn_82_0);
                    stackIn_83_0 = stackIn_84_0;
                    stackIn_84_1 = ((StringBuilder) (Object) stackIn_82_1).append(stackIn_82_2).append(',').append(param5).append(',');
                    stackIn_83_1 = stackIn_84_1;
                    if (param6 == null) {
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
                    throw la.a((Throwable) ((Object) stackIn_85_0), stackIn_85_2 + ')');
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static void a(hl param0, int param1) {
        int dupTemp$0 = 0;
        int dupTemp$1 = 0;
        int incrementValue$2 = 0;
        int fieldTemp$3 = 0;
        int stackIn_10_0 = 0;
        int stackIn_14_0 = 0;
        int stackIn_17_0 = 0;
        int stackIn_17_1 = 0;
        int stackIn_25_0 = 0;
        int stackIn_25_1 = 0;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_32_2 = null;
        int statePc = 0;
        Throwable caughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var5 = MonkeyPuzzle2.field_F ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var2_int = 0;
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 29;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        if (var2_int >= 3) {
                            statePc = 6;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 29;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        ek.field_d[var2_int] = 0;
                        var2_int++;
                        if (var5 != 0) {
                            statePc = 7;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 29;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        if (var5 == 0) {
                            statePc = 2;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 29;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 29;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        var2_int = 0;
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 29;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 29;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        if ((ea.field_c ^ -1) >= (var2_int ^ -1)) {
                            statePc = 13;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 29;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        stackIn_14_0 = pg.field_e[var2_int].field_i ^ -1;
                        stackIn_10_0 = stackIn_14_0;
                        if (var5 != 0) {
                            statePc = 14;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 29;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        if (stackIn_10_0 != (param0.field_i ^ -1)) {
                            statePc = 12;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 29;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        dupTemp$0 = pg.field_e[var2_int].a(2147483647);
                        ek.field_d[dupTemp$0] = ek.field_d[dupTemp$0] + 1;
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 29;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        var2_int++;
                        if (var5 == 0) {
                            statePc = 8;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 29;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        dupTemp$1 = param0.a(2147483647);
                        ek.field_d[dupTemp$1] = ek.field_d[dupTemp$1] + 1;
                        var2_int = 0;
                        stackIn_14_0 = 0;
                        statePc = 14;
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 29;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        var3 = stackIn_14_0;
                        statePc = 15;
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 29;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        if ((ea.field_c ^ -1) >= (var3 ^ -1)) {
                            statePc = 24;
                        } else {
                            statePc = 16;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 29;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        stackIn_25_0 = param0.field_i ^ -1;
                        stackIn_17_0 = stackIn_25_0;
                        stackIn_25_1 = pg.field_e[var3].field_i ^ -1;
                        stackIn_17_1 = stackIn_25_1;
                        if (var5 != 0) {
                            statePc = 25;
                        } else {
                            statePc = 17;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 29;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        if (stackIn_17_0 == stackIn_17_1) {
                            statePc = 19;
                        } else {
                            statePc = 18;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 29;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        statePc = 22;
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 29;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        var4 = pg.field_e[var3].a(2147483647);
                        if ((uj.field_g ^ -1) <= (ek.field_d[var4] ^ -1)) {
                            statePc = 22;
                        } else {
                            statePc = 20;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 29;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        ek.field_d[var4] = ek.field_d[var4] - 1;
                        if (var5 == 0) {
                            statePc = 23;
                        } else {
                            statePc = 21;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 29;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        statePc = 22;
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 29;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        incrementValue$2 = var2_int;
                        var2_int++;
                        pg.field_e[incrementValue$2] = pg.field_e[var3];
                        statePc = 23;
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 29;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        var3++;
                        if (var5 == 0) {
                            statePc = 15;
                        } else {
                            statePc = 24;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 29;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        ea.field_c = var2_int;
                        stackIn_25_0 = param1;
                        stackIn_25_1 = 6191;
                        statePc = 25;
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 29;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        if (stackIn_25_0 == stackIn_25_1) {
                            statePc = 27;
                        } else {
                            statePc = 26;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 29;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        field_b = -73;
                        statePc = 27;
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 29;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        fieldTemp$3 = ea.field_c;
                        ea.field_c = ea.field_c + 1;
                        pg.field_e[fieldTemp$3] = param0;
                        statePc = 33;
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 29;
                        continue stateLoop;
                    }
                }
                case 29: {
                    var2 = (RuntimeException) ((Object) caughtException);
                    stackIn_31_0 = (RuntimeException) (var2);
                    stackIn_30_0 = stackIn_31_0;
                    stackIn_31_1 = new StringBuilder().append("qh.B(");
                    stackIn_30_1 = stackIn_31_1;
                    if (param0 == null) {
                        statePc = 31;
                    } else {
                        statePc = 30;
                    }
                    continue stateLoop;
                }
                case 30: {
                    stackIn_32_0 = (RuntimeException) ((Object) stackIn_30_0);
                    stackIn_32_1 = (StringBuilder) ((Object) stackIn_30_1);
                    stackIn_32_2 = "{...}";
                    statePc = 32;
                    continue stateLoop;
                }
                case 31: {
                    stackIn_32_0 = (RuntimeException) ((Object) stackIn_31_0);
                    stackIn_32_1 = (StringBuilder) ((Object) stackIn_31_1);
                    stackIn_32_2 = "null";
                    statePc = 32;
                    continue stateLoop;
                }
                case 32: {
                    throw la.a((Throwable) ((Object) stackIn_32_0), stackIn_32_2 + ',' + param1 + ')');
                }
                case 33: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    public final void mouseClicked(java.awt.event.MouseEvent param0) {
        try {
            if (param0.isPopupTrigger()) {
                param0.consume();
            }
        } catch (RuntimeException runtimeException) {
            throw la.a((Throwable) ((Object) runtimeException), "qh.mouseClicked(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    public final synchronized void mousePressed(java.awt.event.MouseEvent param0) {
        int var2_int = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          L0: {
            L1: {
              if (we.field_n != null) {
                L2: {
                  L3: {
                    mg.field_s = 0;
                    cj.field_d = param0.getX();
                    ek.field_a = param0.getY();
                    pf.a(0);
                    if (!javax.swing.SwingUtilities.isRightMouseButton(param0)) {
                      break L3;
                    } else {
                      ke.field_g = 2;
                      lf.field_a = 2;
                      if (!MonkeyPuzzle2.field_F) {
                        break L2;
                      } else {
                        break L3;
                      }
                    }
                  }
                  ke.field_g = 1;
                  lf.field_a = 1;
                  break L2;
                }
                L4: {
                  var2_int = param0.getModifiers();
                  if ((8 & var2_int ^ -1) != -1) {
                    break L4;
                  } else {
                    break L4;
                  }
                }
                L5: {
                  oh.field_b = true;
                  if ((var2_int & 16 ^ -1) == -1) {
                    break L5;
                  } else {
                    break L5;
                  }
                }
                if ((4 & var2_int ^ -1) != -1) {
                  break L1;
                } else {
                  break L1;
                }
              } else {
                break L1;
              }
            }
            L6: {
              if (!param0.isPopupTrigger()) {
                break L6;
              } else {
                param0.consume();
                break L6;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var2 = decompiledCaughtException;
            stackIn_14_0 = (RuntimeException) (var2);

            stackIn_14_1 = new StringBuilder().append("qh.mousePressed(");

            if (param0 == null) {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "null";
              break L7;
            } else {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "{...}";
              break L7;
            }
          }
          throw la.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ')');
        }
    }

    public final void focusGained(java.awt.event.FocusEvent param0) {
    }

    public final synchronized void focusLost(java.awt.event.FocusEvent param0) {
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          L0: {
            L1: {
              if (null != we.field_n) {
                lf.field_a = 0;
                break L1;
              } else {
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var2);

            stackIn_6_1 = new StringBuilder().append("qh.focusLost(");

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
          throw la.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ')');
        }
    }

    public final synchronized void mouseReleased(java.awt.event.MouseEvent param0) {
        int var2_int = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          L0: {
            L1: {
              if (we.field_n != null) {
                L2: {
                  mg.field_s = 0;
                  lf.field_a = 0;
                  oh.field_b = true;
                  var2_int = param0.getModifiers();
                  if ((8 & var2_int ^ -1) != -1) {
                    break L2;
                  } else {
                    break L2;
                  }
                }
                L3: {
                  if (0 != (16 & var2_int)) {
                    break L3;
                  } else {
                    break L3;
                  }
                }
                if (-1 != (var2_int & 4 ^ -1)) {
                  break L1;
                } else {
                  break L1;
                }
              } else {
                break L1;
              }
            }
            L4: {
              if (!param0.isPopupTrigger()) {
                break L4;
              } else {
                param0.consume();
                break L4;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var2 = decompiledCaughtException;
            stackIn_10_0 = (RuntimeException) (var2);

            stackIn_10_1 = new StringBuilder().append("qh.mouseReleased(");

            if (param0 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L5;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L5;
            }
          }
          throw la.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ')');
        }
    }

    static {
        field_c = new String[]{null, "to discard it and<nbsp>continue.", "to discard it and<nbsp>continue.", "to discard them and<nbsp>continue.", "to discard them and<nbsp>continue.", "to discard them and<nbsp>continue.", "to discard them and<nbsp>continue.", "to discard them and<nbsp>continue."};
    }
}
