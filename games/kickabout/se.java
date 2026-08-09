/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class se extends ct {
    static ef field_C;
    private tf field_A;
    static String field_B;

    public se() {
        super(0, 0, il.field_b, im.field_Ab, (gj) null, (jv) null);
        this.field_A = new tf();
    }

    final fd a(int param0) {
        nw var2 = null;
        RuntimeException var2_ref = null;
        ub var3 = null;
        int var4 = 0;
        fd stackIn_10_0 = null;
        Object stackIn_13_0 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var4 = Kickabout.field_G;
        try {
          L0: {
            L1: {
              var2 = new nw(this.field_A);
              if (param0 == 0) {
                break L1;
              } else {
                this.field_A = (tf) null;
                break L1;
              }
            }
            var3 = (ub) ((Object) var2.a((byte) 98));
            L2: while (true) {
              L3: {
                if (var3 == null) {
                  break L3;
                } else {
                  if (var3.field_C) {
                    stackIn_10_0 = var3.a(false);
                    decompiledRegionSelector0 = 0;
                    break L0;
                  } else {
                    var3 = (ub) ((Object) var2.a(param0 ^ 0));
                    if (var4 == 0) {
                      continue L2;
                    } else {
                      break L3;
                    }
                  }
                }
              }
              stackIn_13_0 = null;
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw nb.a((Throwable) ((Object) var2_ref), "se.H(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_10_0;
        } else {
          return (fd) ((Object) stackIn_13_0);
        }
    }

    final static ut[] a(sj param0, int param1, String param2, String param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        ut[] stackIn_1_0 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        StringBuilder stackIn_9_1 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_13_1 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var4_int = param0.b(param2, -1);
            var5 = -67 % ((-81 - param1) / 38);
            var6 = param0.a((byte) -102, param3, var4_int);
            stackIn_1_0 = fa.a(var4_int, (byte) -89, var6, param0);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4 = decompiledCaughtException;
            stackIn_5_0 = (RuntimeException) (var4);

            stackIn_5_1 = new StringBuilder().append("se.J(");

            if (param0 == null) {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "null";
              break L1;
            } else {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "{...}";
              break L1;
            }
          }
          L2: {


            stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_6_2).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L2;
            } else {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_13_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(',');

            if (param3 == null) {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L3;
            } else {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L3;
            }
          }
          throw nb.a((Throwable) ((Object) stackIn_6_0), stackIn_14_2 + ')');
        }
        return stackIn_1_0;
    }

    final static gg a(boolean param0, int param1, int param2) {
        np stackIn_2_0 = null;
        int stackIn_2_1 = 0;
        np stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        np stackIn_5_0 = null;
        int stackIn_5_1 = 0;
        int stackIn_5_2 = 0;
        gg stackIn_9_0 = null;
        hd stackIn_34_0 = null;
        hd stackIn_36_0 = null;
        hd stackIn_37_0 = null;
        String stackIn_37_1 = null;
        hd stackIn_38_0 = null;
        hd stackIn_40_0 = null;
        hd stackIn_41_0 = null;
        String stackIn_41_1 = null;
        int stackIn_45_0 = 0;
        Object stackIn_86_0 = null;
        Object stackIn_103_0 = null;
        gg stackOut_8_0;
        int statePc = 0;
        Throwable caughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        tf var4 = null;
        Object var5 = null;
        Object var6 = null;
        gg var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        String var16 = null;
        uv var17 = null;
        String var18 = null;
        int var19 = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var19 = Kickabout.field_G;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        stackIn_4_0 = ei.field_d.field_Cb;
                        stackIn_2_0 = stackIn_4_0;
                        stackIn_4_1 = (sh.field_c * 3 - -6) * param2;
                        stackIn_2_1 = stackIn_4_1;
                        if (ei.field_d.field_Cb != ig.field_f) {
                            statePc = 4;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 104;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        stackIn_5_0 = (np) ((Object) stackIn_2_0);
                        stackIn_5_1 = stackIn_2_1;
                        stackIn_5_2 = 1;
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 104;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        stackIn_5_0 = (np) ((Object) stackIn_4_0);
                        stackIn_5_1 = stackIn_4_1;
                        stackIn_5_2 = 0;
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 104;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        var3_int = ((np) (Object) stackIn_5_0).a(stackIn_5_1, stackIn_5_2 != 0, param0, 2, false, param1 + sh.field_c) ? 1 : 0;
                        var4 = ei.field_d.field_yb.field_jb;
                        var5 = null;
                        if (ts.field_d != 2) {
                            statePc = 95;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 104;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        kk.field_R.field_lb = true;
                        du.field_f.field_E = vo.a((byte) -18, uf.field_d, new String[]{bh.field_h});
                        ei.field_d.field_Cb.field_zb.field_E = null;
                        var6 = null;
                        var7 = (gg) ((Object) var4.g(24009));
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 104;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        if (var7 == null) {
                            statePc = 85;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 104;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        var8 = 0;
                        stackOut_8_0 = (gg) (var7);
                        stackIn_86_0 = stackOut_8_0;
                        stackIn_9_0 = stackOut_8_0;
                        if (var19 != 0) {
                            statePc = 86;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 104;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        if (stackIn_9_0.field_jb == null) {
                            statePc = 14;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 104;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 104;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        statePc = 15;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 104;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        var7.field_Bb = new hd(0L, mp.field_f);
                        var7.a((byte) -112, var7.field_Bb);
                        var7.field_Ab = new hd(0L, pw.field_J);
                        var7.a((byte) -122, var7.field_Ab);
                        var7.field_Fb = new hd(0L, mp.field_f);
                        var7.a((byte) -117, var7.field_Fb);
                        var7.field_Ab.field_A = 2;
                        var7.b(false);
                        var8 = 1;
                        statePc = 15;
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 104;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        var7.field_q = ei.field_d.field_yb.field_q;
                        var9 = 0;
                        if (null == var7.field_zb) {
                            statePc = 21;
                        } else {
                            statePc = 16;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 104;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        if (var7.field_zb == bh.field_h) {
                            statePc = 20;
                        } else {
                            statePc = 17;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 104;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        statePc = 19;
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 104;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        var10 = 13421568;
                        var11 = 16777062;
                        if (var19 == 0) {
                            statePc = 22;
                        } else {
                            statePc = 20;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 104;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        var11 = 6750054;
                        var10 = 52224;
                        if (var19 == 0) {
                            statePc = 22;
                        } else {
                            statePc = 21;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 104;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        var10 = 13369344;
                        var11 = 16737894;
                        statePc = 22;
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 104;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        var12 = 0;
                        if (var7.field_Eb == null) {
                            statePc = 29;
                        } else {
                            statePc = 23;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 104;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        if (!var7.field_Eb.equals("")) {
                            statePc = 28;
                        } else {
                            statePc = 24;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 104;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        statePc = 26;
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 104;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        statePc = 29;
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 104;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        var7.field_Fb.field_ub = var11;
                        var7.field_Fb.field_N = ll.field_n;
                        var12 = 1;
                        var7.field_Fb.a(true, 3 + ll.field_n.field_o, 0, var9, sh.field_c);
                        statePc = 29;
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 104;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        var7.field_Ab.field_H = var11;
                        var7.field_Bb.field_H = var11;
                        var7.field_Ab.field_ub = var11;
                        var7.field_Bb.field_ub = var11;
                        var7.field_Ab.field_y = var10;
                        var7.field_Bb.field_y = var10;
                        var7.field_Ab.field_ab = var11;
                        var7.field_Bb.field_ab = var11;
                        var13 = 0;
                        var14 = var7.field_q + -82;
                        if (var12 != 0) {
                            statePc = 32;
                        } else {
                            statePc = 30;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 104;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        statePc = 33;
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 104;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        var13 = 3 + ll.field_n.field_o;
                        var14 = var14 - var13;
                        statePc = 33;
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 104;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        stackIn_36_0 = var7.field_Bb;
                        stackIn_34_0 = stackIn_36_0;
                        if ((var14 ^ -1) < -1) {
                            statePc = 36;
                        } else {
                            statePc = 34;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 104;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        stackIn_37_0 = (hd) ((Object) stackIn_34_0);
                        stackIn_37_1 = var7.field_Gb;
                        statePc = 37;
                        continue stateLoop;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 104;
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        stackIn_37_0 = (hd) ((Object) stackIn_36_0);
                        stackIn_37_1 = hu.a(var7.field_Bb.field_X, var7.field_Gb, var14);
                        statePc = 37;
                        continue stateLoop;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = 104;
                        continue stateLoop;
                    }
                }
                case 37: {
                    try {
                        stackIn_37_0.field_E = stackIn_37_1;
                        var7.field_Bb.a(true, var14, var13, var9, sh.field_c);
                        stackIn_40_0 = var7.field_Ab;
                        stackIn_38_0 = stackIn_40_0;
                        if (var7.field_zb == null) {
                            statePc = 40;
                        } else {
                            statePc = 38;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = 104;
                        continue stateLoop;
                    }
                }
                case 38: {
                    try {
                        stackIn_41_0 = (hd) ((Object) stackIn_38_0);
                        stackIn_41_1 = var7.field_zb;
                        statePc = 41;
                        continue stateLoop;
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = 104;
                        continue stateLoop;
                    }
                }
                case 40: {
                    try {
                        stackIn_41_0 = (hd) ((Object) stackIn_40_0);
                        stackIn_41_1 = ga.field_K;
                        statePc = 41;
                        continue stateLoop;
                    } catch (Throwable stateCaught_40) {
                        caughtException = stateCaught_40;
                        statePc = 104;
                        continue stateLoop;
                    }
                }
                case 41: {
                    try {
                        stackIn_41_0.field_E = stackIn_41_1;
                        var7.field_Ab.a(true, 80, var7.field_q - 80, var9, sh.field_c);
                        if (var7.field_Bb.field_E.equals(var7.field_Gb)) {
                            statePc = 44;
                        } else {
                            statePc = 42;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_41) {
                        caughtException = stateCaught_41;
                        statePc = 104;
                        continue stateLoop;
                    }
                }
                case 42: {
                    try {
                        stackIn_45_0 = 1;
                        statePc = 45;
                        continue stateLoop;
                    } catch (Throwable stateCaught_42) {
                        caughtException = stateCaught_42;
                        statePc = 104;
                        continue stateLoop;
                    }
                }
                case 44: {
                    try {
                        stackIn_45_0 = 0;
                        statePc = 45;
                        continue stateLoop;
                    } catch (Throwable stateCaught_44) {
                        caughtException = stateCaught_44;
                        statePc = 104;
                        continue stateLoop;
                    }
                }
                case 45: {
                    try {
                        var15 = stackIn_45_0;
                        var9 = var9 + sh.field_c;
                        if (var3_int == 0) {
                            statePc = 48;
                        } else {
                            statePc = 46;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_45) {
                        caughtException = stateCaught_45;
                        statePc = 104;
                        continue stateLoop;
                    }
                }
                case 46: {
                    try {
                        statePc = 49;
                        continue stateLoop;
                    } catch (Throwable stateCaught_46) {
                        caughtException = stateCaught_46;
                        statePc = 104;
                        continue stateLoop;
                    }
                }
                case 48: {
                    try {
                        var7.field_L = -var7.field_mb + var9;
                        statePc = 49;
                        continue stateLoop;
                    } catch (Throwable stateCaught_48) {
                        caughtException = stateCaught_48;
                        statePc = 104;
                        continue stateLoop;
                    }
                }
                case 49: {
                    try {
                        if (var8 != 0) {
                            statePc = 52;
                        } else {
                            statePc = 50;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_49) {
                        caughtException = stateCaught_49;
                        statePc = 104;
                        continue stateLoop;
                    }
                }
                case 50: {
                    try {
                        statePc = 53;
                        continue stateLoop;
                    } catch (Throwable stateCaught_50) {
                        caughtException = stateCaught_50;
                        statePc = 104;
                        continue stateLoop;
                    }
                }
                case 52: {
                    try {
                        ei.field_d.field_yb.a(true, 2, var7, (hd) (var6));
                        statePc = 53;
                        continue stateLoop;
                    } catch (Throwable stateCaught_52) {
                        caughtException = stateCaught_52;
                        statePc = 104;
                        continue stateLoop;
                    }
                }
                case 53: {
                    try {
                        var6 = var7;
                        if (var7.field_Fb == null) {
                            statePc = 60;
                        } else {
                            statePc = 54;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_53) {
                        caughtException = stateCaught_53;
                        statePc = 104;
                        continue stateLoop;
                    }
                }
                case 54: {
                    try {
                        if (!var7.field_Fb.field_gb) {
                            statePc = 60;
                        } else {
                            statePc = 55;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_54) {
                        caughtException = stateCaught_54;
                        statePc = 104;
                        continue stateLoop;
                    }
                }
                case 55: {
                    try {
                        statePc = 57;
                        continue stateLoop;
                    } catch (Throwable stateCaught_55) {
                        caughtException = stateCaught_55;
                        statePc = 104;
                        continue stateLoop;
                    }
                }
                case 57: {
                    try {
                        sn.field_e = var7.field_Eb;
                        if (var19 == 0) {
                            statePc = 84;
                        } else {
                            statePc = 58;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_57) {
                        caughtException = stateCaught_57;
                        statePc = 104;
                        continue stateLoop;
                    }
                }
                case 58: {
                    try {
                        statePc = 60;
                        continue stateLoop;
                    } catch (Throwable stateCaught_58) {
                        caughtException = stateCaught_58;
                        statePc = 104;
                        continue stateLoop;
                    }
                }
                case 60: {
                    try {
                        if ((var7.field_sb ^ -1) == -1) {
                            statePc = 76;
                        } else {
                            statePc = 61;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_60) {
                        caughtException = stateCaught_60;
                        statePc = 104;
                        continue stateLoop;
                    }
                }
                case 61: {
                    try {
                        statePc = 63;
                        continue stateLoop;
                    } catch (Throwable stateCaught_61) {
                        caughtException = stateCaught_61;
                        statePc = 104;
                        continue stateLoop;
                    }
                }
                case 63: {
                    try {
                        var16 = var7.field_Gb;
                        el.a(var7, false, ei.field_d.field_Cb, -1, var16, (int[]) null, 0L, (String) null, -1);
                        var5 = var7;
                        if (null == var7.field_zb) {
                            statePc = 75;
                        } else {
                            statePc = 64;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_63) {
                        caughtException = stateCaught_63;
                        statePc = 104;
                        continue stateLoop;
                    }
                }
                case 64: {
                    try {
                        if (ew.a(118, wi.field_v.field_k)) {
                            statePc = 75;
                        } else {
                            statePc = 65;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_64) {
                        caughtException = stateCaught_64;
                        statePc = 104;
                        continue stateLoop;
                    }
                }
                case 65: {
                    try {
                        statePc = 67;
                        continue stateLoop;
                    } catch (Throwable stateCaught_65) {
                        caughtException = stateCaught_65;
                        statePc = 104;
                        continue stateLoop;
                    }
                }
                case 67: {
                    try {
                        if (!iw.field_l) {
                            statePc = 72;
                        } else {
                            statePc = 68;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_67) {
                        caughtException = stateCaught_67;
                        statePc = 104;
                        continue stateLoop;
                    }
                }
                case 68: {
                    try {
                        statePc = 70;
                        continue stateLoop;
                    } catch (Throwable stateCaught_68) {
                        caughtException = stateCaught_68;
                        statePc = 104;
                        continue stateLoop;
                    }
                }
                case 70: {
                    try {
                        statePc = 75;
                        continue stateLoop;
                    } catch (Throwable stateCaught_70) {
                        caughtException = stateCaught_70;
                        statePc = 104;
                        continue stateLoop;
                    }
                }
                case 72: {
                    try {
                        if (kb.field_C) {
                            statePc = 74;
                        } else {
                            statePc = 73;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_72) {
                        caughtException = stateCaught_72;
                        statePc = 104;
                        continue stateLoop;
                    }
                }
                case 73: {
                    try {
                        var17 = wi.field_v;
                        var18 = vo.a((byte) -18, wp.field_a, new String[]{var16});
                        var17.field_j.a(param1 ^ 2, 8, var18);
                        statePc = 74;
                        continue stateLoop;
                    } catch (Throwable stateCaught_73) {
                        caughtException = stateCaught_73;
                        statePc = 104;
                        continue stateLoop;
                    }
                }
                case 74: {
                    try {
                        var17 = wi.field_v;
                        var18 = vo.a((byte) -18, ee.field_c, new String[]{var16});
                        var17.field_j.a(0, 18, var18);
                        statePc = 75;
                        continue stateLoop;
                    } catch (Throwable stateCaught_74) {
                        caughtException = stateCaught_74;
                        statePc = 104;
                        continue stateLoop;
                    }
                }
                case 75: {
                    try {
                        if (var19 == 0) {
                            statePc = 84;
                        } else {
                            statePc = 76;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_75) {
                        caughtException = stateCaught_75;
                        statePc = 104;
                        continue stateLoop;
                    }
                }
                case 76: {
                    try {
                        if (!var7.field_Bb.field_gb) {
                            statePc = 84;
                        } else {
                            statePc = 77;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_76) {
                        caughtException = stateCaught_76;
                        statePc = 104;
                        continue stateLoop;
                    }
                }
                case 77: {
                    try {
                        statePc = 79;
                        continue stateLoop;
                    } catch (Throwable stateCaught_77) {
                        caughtException = stateCaught_77;
                        statePc = 104;
                        continue stateLoop;
                    }
                }
                case 79: {
                    try {
                        if (var15 == 0) {
                            statePc = 84;
                        } else {
                            statePc = 80;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_79) {
                        caughtException = stateCaught_79;
                        statePc = 104;
                        continue stateLoop;
                    }
                }
                case 80: {
                    try {
                        statePc = 82;
                        continue stateLoop;
                    } catch (Throwable stateCaught_80) {
                        caughtException = stateCaught_80;
                        statePc = 104;
                        continue stateLoop;
                    }
                }
                case 82: {
                    try {
                        sn.field_e = var7.field_Gb;
                        statePc = 84;
                        continue stateLoop;
                    } catch (Throwable stateCaught_82) {
                        caughtException = stateCaught_82;
                        statePc = 104;
                        continue stateLoop;
                    }
                }
                case 84: {
                    try {
                        var7 = (gg) ((Object) var4.c(33));
                        if (var19 == 0) {
                            statePc = 7;
                        } else {
                            statePc = 85;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_84) {
                        caughtException = stateCaught_84;
                        statePc = 104;
                        continue stateLoop;
                    }
                }
                case 85: {
                    try {
                        stackIn_86_0 = ei.field_d.field_Eb;
                        statePc = 86;
                        continue stateLoop;
                    } catch (Throwable stateCaught_85) {
                        caughtException = stateCaught_85;
                        statePc = 104;
                        continue stateLoop;
                    }
                }
                case 86: {
                    try {
                        if ((((hd) ((Object) stackIn_86_0)).field_sb ^ -1) != -1) {
                            statePc = 89;
                        } else {
                            statePc = 87;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_86) {
                        caughtException = stateCaught_86;
                        statePc = 104;
                        continue stateLoop;
                    }
                }
                case 87: {
                    try {
                        statePc = 90;
                        continue stateLoop;
                    } catch (Throwable stateCaught_87) {
                        caughtException = stateCaught_87;
                        statePc = 104;
                        continue stateLoop;
                    }
                }
                case 89: {
                    try {
                        k.field_m = new sl(ei.field_d.field_Eb.field_F, ei.field_d.field_Eb.field_T, ei.field_d.field_Eb.field_q, ei.field_d.field_Eb.field_mb, sf.field_G, pn.field_u, dw.field_e, dw.field_e);
                        fs.field_b = 0;
                        statePc = 90;
                        continue stateLoop;
                    } catch (Throwable stateCaught_89) {
                        caughtException = stateCaught_89;
                        statePc = 104;
                        continue stateLoop;
                    }
                }
                case 90: {
                    try {
                        if ((ei.field_d.field_zb.field_sb ^ -1) != -1) {
                            statePc = 93;
                        } else {
                            statePc = 91;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_90) {
                        caughtException = stateCaught_90;
                        statePc = 104;
                        continue stateLoop;
                    }
                }
                case 91: {
                    try {
                        statePc = 94;
                        continue stateLoop;
                    } catch (Throwable stateCaught_91) {
                        caughtException = stateCaught_91;
                        statePc = 104;
                        continue stateLoop;
                    }
                }
                case 93: {
                    try {
                        k.field_m = new sl(ei.field_d.field_zb.field_F, ei.field_d.field_zb.field_T, ei.field_d.field_zb.field_q, ei.field_d.field_zb.field_mb, kf.field_yb, pn.field_u, dw.field_e, dw.field_e);
                        fs.field_b = 1;
                        statePc = 94;
                        continue stateLoop;
                    } catch (Throwable stateCaught_93) {
                        caughtException = stateCaught_93;
                        statePc = 104;
                        continue stateLoop;
                    }
                }
                case 94: {
                    try {
                        statePc = 102;
                        continue stateLoop;
                    } catch (Throwable stateCaught_94) {
                        caughtException = stateCaught_94;
                        statePc = 104;
                        continue stateLoop;
                    }
                }
                case 95: {
                    try {
                        du.field_f.field_E = uf.field_a;
                        kk.field_R.field_lb = false;
                        if (-2 != (ts.field_d ^ -1)) {
                            statePc = 99;
                        } else {
                            statePc = 96;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_95) {
                        caughtException = stateCaught_95;
                        statePc = 104;
                        continue stateLoop;
                    }
                }
                case 96: {
                    try {
                        ei.field_d.field_Cb.field_zb.field_E = aw.field_I;
                        if (var19 == 0) {
                            statePc = 101;
                        } else {
                            statePc = 97;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_96) {
                        caughtException = stateCaught_96;
                        statePc = 104;
                        continue stateLoop;
                    }
                }
                case 97: {
                    try {
                        statePc = 99;
                        continue stateLoop;
                    } catch (Throwable stateCaught_97) {
                        caughtException = stateCaught_97;
                        statePc = 104;
                        continue stateLoop;
                    }
                }
                case 99: {
                    try {
                        ei.field_d.field_Cb.field_zb.field_E = jw.field_yb;
                        statePc = 101;
                        continue stateLoop;
                    } catch (Throwable stateCaught_99) {
                        caughtException = stateCaught_99;
                        statePc = 104;
                        continue stateLoop;
                    }
                }
                case 101: {
                    try {
                        hl.a(true, ei.field_d.field_yb);
                        statePc = 102;
                        continue stateLoop;
                    } catch (Throwable stateCaught_101) {
                        caughtException = stateCaught_101;
                        statePc = 104;
                        continue stateLoop;
                    }
                }
                case 102: {
                    try {
                        stackIn_103_0 = var5;
                        statePc = 103;
                        continue stateLoop;
                    } catch (Throwable stateCaught_102) {
                        caughtException = stateCaught_102;
                        statePc = 104;
                        continue stateLoop;
                    }
                }
                case 103: {
                    return (gg) ((Object) stackIn_103_0);
                }
                case 104: {
                    var3 = (RuntimeException) ((Object) caughtException);
                    throw nb.a((Throwable) ((Object) var3), "se.O(" + param0 + ',' + param1 + ',' + param2 + ')');
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final void a(int param0, int param1, int param2, int param3) {
        nw var5 = null;
        fd var6 = null;
        int var7 = 0;
        int decompiledRegionSelector0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        RuntimeException var5_ref = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var7 = Kickabout.field_G;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (param1 == 65) {
                            statePc = 3;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 2: {
                    return;
                }
                case 3: {
                    try {
                        if (null != this.field_r) {
                            statePc = 6;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        this.field_r.a(113, true, param3, (fd) (this), param2);
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        var5 = new nw(this.field_A);
                        var6 = (fd) ((Object) var5.b(0));
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        if (null == var6) {
                            statePc = 15;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        var6.a(param0, 65, param2 + this.field_t, this.field_g + param3);
                        var6 = (fd) ((Object) var5.b((byte) 46));
                        if (var7 != 0) {
                            statePc = 15;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        if (var7 == 0) {
                            statePc = 8;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        statePc = 15;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 14: {
                    var5_ref = (RuntimeException) ((Object) caughtException);
                    throw nb.a((Throwable) ((Object) var5_ref), "se.B(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
                }
                case 15: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final ub h(byte param0) {
        nw var2 = null;
        RuntimeException var2_ref = null;
        ub var3 = null;
        int var4 = 0;
        ub stackIn_3_0 = null;
        ub stackIn_8_0 = null;
        Object stackIn_11_0 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var4 = Kickabout.field_G;
        try {
          L0: {
            if (param0 == 18) {
              var2 = new nw(this.field_A);
              var3 = (ub) ((Object) var2.a((byte) 70));
              L1: while (true) {
                L2: {
                  if (null == var3) {
                    break L2;
                  } else {
                    if (!var3.field_C) {
                      var3 = (ub) ((Object) var2.a(0));
                      if (var4 == 0) {
                        continue L1;
                      } else {
                        break L2;
                      }
                    } else {
                      stackIn_8_0 = (ub) (var3);
                      decompiledRegionSelector0 = 1;
                      break L0;
                    }
                  }
                }
                stackIn_11_0 = null;
                decompiledRegionSelector0 = 2;
                break L0;
              }
            } else {
              stackIn_3_0 = (ub) null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw nb.a((Throwable) ((Object) var2_ref), "se.Q(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_8_0;
          } else {
            return (ub) ((Object) stackIn_11_0);
          }
        }
    }

    final void l(int param0) {
        RuntimeException runtimeException = null;
        nw var2 = null;
        ub var3 = null;
        int var4 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var4 = Kickabout.field_G;
        try {
          L0: {
            var2 = new nw(this.field_A);
            if (param0 == 4508) {
              var3 = (ub) ((Object) var2.a((byte) -107));
              L1: while (true) {
                L2: {
                  L3: {
                    if (null == var3) {
                      break L3;
                    } else {
                      if (var4 != 0) {
                        break L2;
                      } else {
                        L4: {
                          if (var3.a(param0 + -4521)) {
                            var3.c((byte) -109);
                            break L4;
                          } else {
                            break L4;
                          }
                        }
                        var3 = (ub) ((Object) var2.a(0));
                        if (var4 == 0) {
                          continue L1;
                        } else {
                          break L3;
                        }
                      }
                    }
                  }
                  break L2;
                }
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw nb.a((Throwable) ((Object) runtimeException), "se.L(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final void a(fd param0, boolean param1) {
        ub var3 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        try {
          L0: {
            if (!(param0 instanceof ub)) {
              throw new IllegalArgumentException();
            } else {
              L1: {
                var3 = (ub) ((Object) param0);
                this.field_A.a(0, var3);
                if (!param1) {
                  break L1;
                } else {
                  this.field_A = (tf) null;
                  break L1;
                }
              }
              var3.field_C = true;
              var3.a((fd) (this), 0);
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3_ref = decompiledCaughtException;
            stackIn_12_0 = (RuntimeException) (var3_ref);

            stackIn_12_1 = new StringBuilder().append("se.K(");

            if (param0 == null) {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L2;
            } else {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L2;
            }
          }
          throw nb.a((Throwable) ((Object) stackIn_13_0), stackIn_13_2 + ',' + param1 + ')');
        }
    }

    final static void a(int param0, java.awt.Component param1) {
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
              param1.addMouseListener(lw.field_e);
              if (param0 == 15282) {
                break L1;
              } else {
                se.m(110);
                break L1;
              }
            }
            param1.addMouseMotionListener(lw.field_e);
            param1.addFocusListener(lw.field_e);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackIn_8_0 = (RuntimeException) (var2);

            stackIn_8_1 = new StringBuilder().append("se.I(").append(param0).append(',');

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
          throw nb.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ')');
        }
    }

    final void k(int param0) {
        RuntimeException runtimeException = null;
        nw var2 = null;
        ub var3 = null;
        int var4 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var4 = Kickabout.field_G;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var2 = new nw(this.field_A);
                        if (param0 > 82) {
                            statePc = 4;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        this.h((byte) 110);
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        var3 = (ub) ((Object) var2.a((byte) 110));
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        if (null == var3) {
                            statePc = 10;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        var3.field_C = false;
                        var3 = (ub) ((Object) var2.a(0));
                        if (var4 != 0) {
                            statePc = 13;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        if (var4 == 0) {
                            statePc = 5;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        this.field_z = null;
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 12: {
                    runtimeException = (RuntimeException) ((Object) caughtException);
                    throw nb.a((Throwable) ((Object) runtimeException), "se.N(" + param0 + ')');
                }
                case 13: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    public static void m(int param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        try {
          L0: {
            L1: {
              if (param0 == -1) {
                break L1;
              } else {
                field_C = (ef) null;
                break L1;
              }
            }
            field_C = null;
            field_B = null;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw nb.a((Throwable) ((Object) var1), "se.SA(" + param0 + ')');
        }
    }

    final static boolean a(byte param0, char param1) {
        RuntimeException var2 = null;
        int stackIn_16_0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 < -108) {
                break L1;
              } else {
                se.a(true, 64, 120);
                break L1;
              }
            }
            L2: {
              L3: {
                L4: {
                  if (65 > param1) {
                    break L4;
                  } else {
                    if (param1 <= 90) {
                      break L3;
                    } else {
                      break L4;
                    }
                  }
                }
                L5: {
                  if (param1 < 97) {
                    break L5;
                  } else {
                    if (param1 > 122) {
                      break L5;
                    } else {
                      break L3;
                    }
                  }
                }
                stackIn_16_0 = 0;
                break L2;
              }
              stackIn_16_0 = 1;
              break L2;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw nb.a((Throwable) ((Object) var2), "se.M(" + param0 + ',' + param1 + ')');
        }
        return stackIn_16_0 != 0;
    }

    final void n(int param0) {
        nw var2 = null;
        ub var3 = null;
        int var4 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2_ref = null;
        var4 = Kickabout.field_G;
        try {
          L0: {
            L1: {
              if (param0 == 2) {
                break L1;
              } else {
                se.a((byte) 111, '');
                break L1;
              }
            }
            var2 = new nw(this.field_A);
            var3 = (ub) ((Object) var2.a((byte) 107));
            L2: while (true) {
              L3: {
                L4: {
                  if (null == var3) {
                    break L4;
                  } else {
                    if (var4 != 0) {
                      break L3;
                    } else {
                      L5: {
                        if (!var3.k(-1)) {
                          break L5;
                        } else {
                          var3.c((byte) -109);
                          break L5;
                        }
                      }
                      var3 = (ub) ((Object) var2.a(0));
                      if (var4 == 0) {
                        continue L2;
                      } else {
                        break L4;
                      }
                    }
                  }
                }
                this.field_z = (fd) ((Object) this.h((byte) 18));
                break L3;
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw nb.a((Throwable) ((Object) var2_ref), "se.RA(" + param0 + ')');
        }
    }

    static {
        field_B = "That name is not available";
    }
}
