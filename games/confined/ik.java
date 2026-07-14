/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ik extends ah {
    static int[] field_cb;
    private oi field_bb;

    final void a(mn param0, byte param1) {
        double[] var13 = new double[12];
        double[] var12 = var13;
        double[] var11 = var12;
        double[] var3 = var11;
        int var4 = 21 % ((param1 - -2) / 62);
        ((ik) this).field_ab.a((byte) 33, var13);
        double var5 = var13[9];
        double var7 = var13[10];
        ((ik) this).field_bb.field_o = -(var7 * ((ik) this).field_C) + ((ik) this).field_t;
        ((ik) this).field_bb.field_t = ((ik) this).field_E - var5 * ((ik) this).field_C;
        double var9 = var13[11];
        ((ik) this).field_bb.field_w = true;
        ((ik) this).field_bb.field_x = -var7;
        ((ik) this).field_bb.field_u = 30.0;
        ((ik) this).field_bb.field_p = -(((ik) this).field_C * var9) + ((ik) this).field_D;
        ((ik) this).field_bb.field_v = -var9;
        ((ik) this).field_bb.field_m = -var5;
        param0.a((rk) (Object) ((ik) this).field_bb, (byte) 99);
    }

    public static void c(boolean param0) {
        field_cb = null;
        if (!param0) {
            field_cb = null;
        }
    }

    final static va a(byte param0, String param1) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        L0: {
          var5 = Confined.field_J ? 1 : 0;
          if (param0 == -126) {
            break L0;
          } else {
            field_cb = null;
            break L0;
          }
        }
        var2 = param1.length();
        if (-1 != var2) {
          if (-64 >= var2) {
            var3 = 0;
            L1: while (true) {
              if (var2 > var3) {
                var4 = param1.charAt(var3);
                if (var4 != 45) {
                  if (-1 == kh.field_W.indexOf(var4)) {
                    return ql.field_k;
                  } else {
                    var3++;
                    continue L1;
                  }
                } else {
                  L2: {
                    if (0 == var3) {
                      break L2;
                    } else {
                      if (var2 + -1 == var3) {
                        break L2;
                      } else {
                        var3++;
                        continue L1;
                      }
                    }
                  }
                  return ql.field_k;
                }
              } else {
                return null;
              }
            }
          } else {
            return m.field_g;
          }
        } else {
          return vf.field_q;
        }
    }

    ik(hn param0, dj param1) {
        super(param0, param1, 0.4, 0.02, 64.0, un.field_h);
        ((ik) this).field_bb = new oi((pm) this);
        kj.a(pe.field_o, 96, (pm) (Object) param1);
    }

    final static boolean a(String param0, int param1) {
        String var2 = null;
        Exception var2_ref = null;
        int var3 = 0;
        int var4 = 0;
        Object var5 = null;
        int stackIn_3_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_14_0 = 0;
        int stackIn_17_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_16_0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var4 = Confined.field_J ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (df.field_f.startsWith("win")) {
                            statePc = 4;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 18;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        stackOut_2_0 = 0;
                        stackIn_3_0 = stackOut_2_0;
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 18;
                        continue stateLoop;
                    }
                }
                case 3: {
                    return stackIn_3_0 != 0;
                }
                case 4: {
                    try {
                        if (param1 == -1) {
                            statePc = 6;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 18;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        var5 = null;
                        boolean discarded$4 = ik.a((String) null, 56);
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 18;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        if (param0.startsWith("http://")) {
                            statePc = 10;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 18;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        if (param0.startsWith("https://")) {
                            statePc = 10;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 18;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        stackOut_8_0 = 0;
                        stackIn_9_0 = stackOut_8_0;
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 18;
                        continue stateLoop;
                    }
                }
                case 9: {
                    return stackIn_9_0 != 0;
                }
                case 10: {
                    try {
                        var2 = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";
                        var3 = 0;
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 18;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        if (var3 >= param0.length()) {
                            statePc = 16;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 18;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        if (var2.indexOf((int) param0.charAt(var3)) != -1) {
                            statePc = 15;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 18;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        stackOut_13_0 = 0;
                        stackIn_14_0 = stackOut_13_0;
                        statePc = 14;
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 18;
                        continue stateLoop;
                    }
                }
                case 14: {
                    return stackIn_14_0 != 0;
                }
                case 15: {
                    try {
                        var3++;
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 18;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        Process discarded$5 = Runtime.getRuntime().exec("cmd /c start \"j\" \"" + param0 + "\"");
                        stackOut_16_0 = 1;
                        stackIn_17_0 = stackOut_16_0;
                        statePc = 17;
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 18;
                        continue stateLoop;
                    }
                }
                case 17: {
                    return stackIn_17_0 != 0;
                }
                case 18: {
                    var2_ref = (Exception) (Object) caughtException;
                    return false;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    ik(hn param0, ee param1, double[] param2, double param3, double param4, double param5) {
        super(param0, param1, 0.4, 0.02, 16.0, param2, param3, param4, param5, un.field_h);
        ((ik) this).field_bb = new oi((pm) this);
        kj.a(pe.field_o, 96, (pm) (Object) param1);
    }

    final void a(mn param0, double param1, int param2, vg param3, oi param4) {
        if (((ik) this).field_N) {
            return;
        }
        double[] var19 = new double[12];
        double[] var18 = var19;
        double[] var17 = var18;
        double[] var16 = var17;
        double[] var15 = var16;
        double[] var7 = var15;
        ((ik) this).field_ab.a((byte) 89, var19);
        double var8 = var19[9];
        if (param2 > -5) {
            return;
        }
        double var10 = var19[10];
        double var12 = var19[11];
        int var14 = param3.field_N * var12 + (param3.field_H * var10 + param3.field_P * var8) > 0.0 ? 1 : 0;
        if (var14 != 0) {
            ((ik) this).a(hn.field_f, ((ik) this).field_ab, param4, (byte) 64, param1, param0, param3, 512);
        }
        pa.a(-(((ik) this).field_C * var8) + ((ik) this).field_E, 0.4 * ((ik) this).field_C, (byte) -11, 256, -(((ik) this).field_C * var12) + ((ik) this).field_D, ((ik) this).field_t - ((ik) this).field_C * var10, wb.field_a, param1, param3);
        if (!(var14 != 0)) {
            ((ik) this).a(hn.field_f, ((ik) this).field_ab, param4, (byte) 64, param1, param0, param3, 512);
        }
    }

    final void g(int param0) {
        int var2 = 0;
        int var3 = Confined.field_J ? 1 : 0;
        fl.a(((ik) this).a((byte) 108, ib.field_J, 1.5), 4);
        ((ik) this).a(mg.field_b, false);
        for (var2 = 0; (var2 ^ -1) > -6; var2++) {
            ri.a((rk) this, param0 + -26402, (rk) (Object) new mm(((ik) this).field_A, (ee) this, ((ik) this).field_ab, mg.field_b[var2]));
        }
        if (param0 != 26402) {
            Object var4 = null;
            ((ik) this).a((mn) null, (byte) 88);
        }
    }

    static {
    }
}
