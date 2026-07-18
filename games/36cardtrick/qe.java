/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qe extends g implements cl, qh {
    private bg field_K;
    private hl field_F;
    private dg field_D;
    static de field_J;
    static int field_E;
    static de field_H;
    static int field_I;

    public static void e() {
        field_J = null;
        field_H = null;
    }

    final boolean a(char param0, byte param1, int param2, lk param3) {
        RuntimeException var5 = null;
        int stackIn_3_0 = 0;
        boolean stackIn_6_0 = false;
        int stackIn_9_0 = 0;
        boolean stackIn_13_0 = false;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        boolean stackOut_12_0 = false;
        int stackOut_8_0 = 0;
        boolean stackOut_5_0 = false;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        try {
          L0: {
            if (super.a(param0, (byte) -121, param2, param3)) {
              stackOut_2_0 = 1;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0 != 0;
            } else {
              if (param2 != 98) {
                if (param1 <= -99) {
                  if (99 == param2) {
                    stackOut_12_0 = ((qe) this).a(param3, (byte) -28);
                    stackIn_13_0 = stackOut_12_0;
                    break L0;
                  } else {
                    return false;
                  }
                } else {
                  stackOut_8_0 = 1;
                  stackIn_9_0 = stackOut_8_0;
                  return stackIn_9_0 != 0;
                }
              } else {
                stackOut_5_0 = ((qe) this).b(-116, param3);
                stackIn_6_0 = stackOut_5_0;
                return stackIn_6_0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var5 = decompiledCaughtException;
            stackOut_14_0 = (RuntimeException) var5;
            stackOut_14_1 = new StringBuilder().append("qe.S(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param3 == null) {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L1;
            } else {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "{...}";
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              break L1;
            }
          }
          throw ma.a((Throwable) (Object) stackIn_17_0, stackIn_17_2 + ')');
        }
        return stackIn_13_0;
    }

    qe(bg param0) {
        super(0, 0, 288, 0, (ci) null);
        RuntimeException var2 = null;
        int var3 = 0;
        ek var4 = null;
        int var5 = 0;
        int var6 = 0;
        String var7 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        try {
          L0: {
            ((qe) this).field_K = param0;
            ((qe) this).field_F = new hl(bj.field_b, (pl) null);
            ((qe) this).field_F.field_v = (ci) (Object) new ki();
            int discarded$3 = 1;
            int discarded$4 = -110;
            int discarded$5 = -50;
            var7 = re.a(dd.field_h, new String[2]);
            var3 = 20;
            var4 = new ek(j.field_C, 0, 0, 0, 0, 16777215, -1, 3, 0, j.field_C.field_s, -1, 2147483647, true);
            ((qe) this).field_D = new dg(var7, (ci) (Object) var4);
            ((qe) this).field_D.field_n = "";
            ((qe) this).field_D.a(ni.field_b, (byte) 126, 0);
            ((qe) this).field_D.a(ni.field_b, (byte) 98, 1);
            ((qe) this).field_D.field_k = (pl) this;
            ((qe) this).field_D.field_h = -40 + ((qe) this).field_h;
            ((qe) this).field_D.b(96, -40 + ((qe) this).field_h, 26, var3);
            var3 = var3 + (15 + ((qe) this).field_D.field_q);
            ((qe) this).b((lk) (Object) ((qe) this).field_D, (byte) 118);
            var5 = 4;
            var6 = 200;
            ((qe) this).field_F.a(40, var3, var6, 300 - var6 >> 1, true);
            ((qe) this).field_F.field_k = (pl) this;
            ((qe) this).b((lk) (Object) ((qe) this).field_F, (byte) 118);
            ((qe) this).a(var5 + (55 + var3), 0, 300, 0, true);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2 = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) var2;
            stackOut_3_1 = new StringBuilder().append("qe.<init>(");
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param0 == null) {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L1;
            } else {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L1;
            }
          }
          throw ma.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + ')');
        }
    }

    final static boolean a(java.applet.Applet param0) {
        try {
            String var2 = null;
            Throwable var2_ref = null;
            RuntimeException var2_ref2 = null;
            String var3 = null;
            int var4 = 0;
            String[] var5 = null;
            int var6 = 0;
            int var7 = 0;
            int var8 = 0;
            int stackIn_3_0 = 0;
            int stackIn_10_0 = 0;
            int stackIn_17_0 = 0;
            RuntimeException stackIn_19_0 = null;
            StringBuilder stackIn_19_1 = null;
            RuntimeException stackIn_20_0 = null;
            StringBuilder stackIn_20_1 = null;
            RuntimeException stackIn_21_0 = null;
            StringBuilder stackIn_21_1 = null;
            String stackIn_21_2 = null;
            int stackOut_2_0 = 0;
            int stackOut_9_0 = 0;
            int stackOut_15_0 = 0;
            int stackOut_16_0 = 0;
            RuntimeException stackOut_18_0 = null;
            StringBuilder stackOut_18_1 = null;
            RuntimeException stackOut_19_0 = null;
            StringBuilder stackOut_19_1 = null;
            String stackOut_19_2 = null;
            RuntimeException stackOut_20_0 = null;
            StringBuilder stackOut_20_1 = null;
            String stackOut_20_2 = null;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        var8 = Main.field_T;
                        statePc = 1;
                        continue stateLoop;
                    }
                    case 1: {
                        try {
                            if (!rc.field_m) {
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
                            stackOut_2_0 = 1;
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
                            var2 = "tuhstatbut";
                            var4 = 75;
                            var3 = (String) vh.a("getcookies", -12151, param0);
                            var5 = rh.a(';', var3, -44);
                            var6 = 0;
                            statePc = 5;
                            continue stateLoop;
                        } catch (Throwable stateCaught_4) {
                            caughtException = stateCaught_4;
                            statePc = 13;
                            continue stateLoop;
                        }
                    }
                    case 5: {
                        try {
                            if (var5.length <= var6) {
                                statePc = 14;
                            } else {
                                statePc = 6;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_5) {
                            caughtException = stateCaught_5;
                            statePc = 13;
                            continue stateLoop;
                        }
                    }
                    case 6: {
                        try {
                            var7 = var5[var6].indexOf('=');
                            if (var7 < 0) {
                                statePc = 11;
                            } else {
                                statePc = 7;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_6) {
                            caughtException = stateCaught_6;
                            statePc = 13;
                            continue stateLoop;
                        }
                    }
                    case 7: {
                        try {
                            if (var5[var6].substring(0, var7).trim().equals((Object) (Object) var2)) {
                                statePc = 9;
                            } else {
                                statePc = 8;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_7) {
                            caughtException = stateCaught_7;
                            statePc = 13;
                            continue stateLoop;
                        }
                    }
                    case 8: {
                        try {
                            statePc = 11;
                            continue stateLoop;
                        } catch (Throwable stateCaught_8) {
                            caughtException = stateCaught_8;
                            statePc = 13;
                            continue stateLoop;
                        }
                    }
                    case 9: {
                        try {
                            stackOut_9_0 = 1;
                            stackIn_10_0 = stackOut_9_0;
                            statePc = 10;
                            continue stateLoop;
                        } catch (Throwable stateCaught_9) {
                            caughtException = stateCaught_9;
                            statePc = 13;
                            continue stateLoop;
                        }
                    }
                    case 10: {
                        return stackIn_10_0 != 0;
                    }
                    case 11: {
                        try {
                            var6++;
                            statePc = 5;
                            continue stateLoop;
                        } catch (Throwable stateCaught_11) {
                            caughtException = stateCaught_11;
                            statePc = 13;
                            continue stateLoop;
                        }
                    }
                    case 13: {
                        try {
                            var2_ref = caughtException;
                            statePc = 14;
                            continue stateLoop;
                        } catch (Throwable stateCaught_13) {
                            caughtException = stateCaught_13;
                            statePc = 18;
                            continue stateLoop;
                        }
                    }
                    case 14: {
                        try {
                            if (null == param0.getParameter("tuhstatbut")) {
                                statePc = 16;
                            } else {
                                statePc = 15;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_14) {
                            caughtException = stateCaught_14;
                            statePc = 18;
                            continue stateLoop;
                        }
                    }
                    case 15: {
                        try {
                            stackOut_15_0 = 1;
                            stackIn_17_0 = stackOut_15_0;
                            statePc = 17;
                            continue stateLoop;
                        } catch (Throwable stateCaught_15) {
                            caughtException = stateCaught_15;
                            statePc = 18;
                            continue stateLoop;
                        }
                    }
                    case 16: {
                        try {
                            stackOut_16_0 = 0;
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
                        var2_ref2 = (RuntimeException) (Object) caughtException;
                        stackOut_18_0 = (RuntimeException) var2_ref2;
                        stackOut_18_1 = new StringBuilder().append("qe.J(");
                        stackIn_20_0 = stackOut_18_0;
                        stackIn_20_1 = stackOut_18_1;
                        stackIn_19_0 = stackOut_18_0;
                        stackIn_19_1 = stackOut_18_1;
                        if (param0 == null) {
                            statePc = 20;
                        } else {
                            statePc = 19;
                        }
                        continue stateLoop;
                    }
                    case 19: {
                        stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
                        stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
                        stackOut_19_2 = "{...}";
                        stackIn_21_0 = stackOut_19_0;
                        stackIn_21_1 = stackOut_19_1;
                        stackIn_21_2 = stackOut_19_2;
                        statePc = 21;
                        continue stateLoop;
                    }
                    case 20: {
                        stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
                        stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
                        stackOut_20_2 = "null";
                        stackIn_21_0 = stackOut_20_0;
                        stackIn_21_1 = stackOut_20_1;
                        stackIn_21_2 = stackOut_20_2;
                        statePc = 21;
                        continue stateLoop;
                    }
                    case 21: {
                        throw ma.a((Throwable) (Object) stackIn_21_0, stackIn_21_2 + ',' + -98 + ')');
                    }
                    default: throw new IllegalStateException("invalid CFG state " + statePc);
                }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    private final String l() {
        return "<u=2164A2><col=2164A2>";
    }

    public final void a(int param0, int param1, int param2, hl param3, int param4) {
        int var6_int = 0;
        RuntimeException var6 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        try {
          L0: {
            var6_int = 125 / ((param1 - -62) / 32);
            if (param3 != ((qe) this).field_F) {
              break L0;
            } else {
              rg.a((byte) 126);
              ((qe) this).field_K.s(50);
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var6 = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) var6;
            stackOut_3_1 = new StringBuilder().append("qe.I(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param3 == null) {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L1;
            } else {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L1;
            }
          }
          throw ma.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + ',' + param4 + ')');
        }
    }

    private final String d() {
        return "</col></u>";
    }

    public final void a(int param0, int param1, byte param2, dg param3) {
        RuntimeException var5 = null;
        int var6 = 0;
        Object var7 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        var6 = Main.field_T;
        try {
          L0: {
            L1: {
              if (param2 == 26) {
                break L1;
              } else {
                var7 = null;
                ((qe) this).a(-56, -104, (byte) -34, (dg) null);
                break L1;
              }
            }
            if (param1 == 0) {
              he.a(param2 + -26, "terms.ws");
              return;
            } else {
              if (param1 == 1) {
                he.a(param2 ^ 26, "privacy.ws");
                return;
              } else {
                if (param1 != 2) {
                  break L0;
                } else {
                  he.a(0, "conduct.ws");
                  return;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) var5;
            stackOut_10_1 = new StringBuilder().append("qe.C(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param3 == null) {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L2;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L2;
            }
          }
          throw ma.a((Throwable) (Object) stackIn_13_0, stackIn_13_2 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_J = new de(7, 0, 1, 1);
        field_H = new de(6, 0, 4, 2);
    }
}
