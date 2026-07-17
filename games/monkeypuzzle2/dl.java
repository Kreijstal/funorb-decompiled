/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dl {
    private bf field_d;
    static boolean[] field_c;
    static boolean field_b;
    private bf field_e;
    static String field_f;
    static long[] field_a;

    public static void b() {
        field_c = null;
        field_f = null;
        field_a = null;
    }

    final void c(int param0) {
        bf var2 = null;
        int var3 = 0;
        Object var4 = null;
        var3 = MonkeyPuzzle2.field_F ? 1 : 0;
        L0: while (true) {
          var2 = ((dl) this).field_d.field_g;
          if (((dl) this).field_d != var2) {
            var2.a(7847);
            continue L0;
          } else {
            ((dl) this).field_e = null;
            if (param0 == 32) {
              return;
            } else {
              var4 = null;
              String discarded$1 = dl.a((java.applet.Applet) null, 95, (String) null);
              return;
            }
          }
        }
    }

    final bf a(boolean param0) {
        bf var2 = null;
        var2 = ((dl) this).field_d.field_g;
        if (((dl) this).field_d != var2) {
          if (!param0) {
            return null;
          } else {
            ((dl) this).field_e = var2.field_g;
            return var2;
          }
        } else {
          ((dl) this).field_e = null;
          return null;
        }
    }

    final bf c(byte param0) {
        bf var2 = null;
        if (param0 != -75) {
            ((dl) this).c(82);
            var2 = ((dl) this).field_e;
            if (!(((dl) this).field_d != var2)) {
                ((dl) this).field_e = null;
                return null;
            }
            ((dl) this).field_e = var2.field_g;
            return var2;
        }
        var2 = ((dl) this).field_e;
        if (!(((dl) this).field_d != var2)) {
            ((dl) this).field_e = null;
            return null;
        }
        ((dl) this).field_e = var2.field_g;
        return var2;
    }

    final void a(bf param0, byte param1) {
        try {
            if (!(param0.field_e == null)) {
                param0.a(7847);
            }
            param0.field_g = ((dl) this).field_d;
            param0.field_e = ((dl) this).field_d.field_e;
            param0.field_e.field_g = param0;
            int var3_int = 73 % ((param1 - 44) / 45);
            param0.field_g.field_e = param0;
        } catch (RuntimeException runtimeException) {
            throw la.a((Throwable) (Object) runtimeException, "dl.D(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 41);
        }
    }

    final int a(int param0) {
        int var2 = 0;
        bf var3 = null;
        int var4 = 0;
        Object var5 = null;
        var4 = MonkeyPuzzle2.field_F ? 1 : 0;
        var2 = 0;
        if (param0 >= -68) {
          var5 = null;
          String discarded$2 = dl.a((java.applet.Applet) null, -12, (String) null);
          var3 = ((dl) this).field_d.field_g;
          L0: while (true) {
            if (var3 == ((dl) this).field_d) {
              return var2;
            } else {
              var3 = var3.field_g;
              var2++;
              continue L0;
            }
          }
        } else {
          var3 = ((dl) this).field_d.field_g;
          L1: while (true) {
            if (var3 == ((dl) this).field_d) {
              return var2;
            } else {
              var3 = var3.field_g;
              var2++;
              continue L1;
            }
          }
        }
    }

    final static String a(java.applet.Applet param0, int param1, String param2) {
        try {
            String var3 = null;
            Throwable var3_ref = null;
            RuntimeException var3_ref2 = null;
            String[] var4 = null;
            int var5 = 0;
            int var6 = 0;
            int var7 = 0;
            String stackIn_8_0 = null;
            Object stackIn_13_0 = null;
            RuntimeException stackIn_15_0 = null;
            StringBuilder stackIn_15_1 = null;
            RuntimeException stackIn_16_0 = null;
            StringBuilder stackIn_16_1 = null;
            RuntimeException stackIn_17_0 = null;
            StringBuilder stackIn_17_1 = null;
            String stackIn_17_2 = null;
            RuntimeException stackIn_18_0 = null;
            StringBuilder stackIn_18_1 = null;
            RuntimeException stackIn_19_0 = null;
            StringBuilder stackIn_19_1 = null;
            RuntimeException stackIn_20_0 = null;
            StringBuilder stackIn_20_1 = null;
            String stackIn_20_2 = null;
            String stackOut_7_0 = null;
            Object stackOut_12_0 = null;
            RuntimeException stackOut_14_0 = null;
            StringBuilder stackOut_14_1 = null;
            RuntimeException stackOut_15_0 = null;
            StringBuilder stackOut_15_1 = null;
            String stackOut_15_2 = null;
            RuntimeException stackOut_16_0 = null;
            StringBuilder stackOut_16_1 = null;
            String stackOut_16_2 = null;
            RuntimeException stackOut_17_0 = null;
            StringBuilder stackOut_17_1 = null;
            RuntimeException stackOut_18_0 = null;
            StringBuilder stackOut_18_1 = null;
            String stackOut_18_2 = null;
            RuntimeException stackOut_19_0 = null;
            StringBuilder stackOut_19_1 = null;
            String stackOut_19_2 = null;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        var7 = MonkeyPuzzle2.field_F ? 1 : 0;
                        statePc = 1;
                        continue stateLoop;
                    }
                    case 1: {
                        try {
                            var3 = (String) mf.a(param1 ^ -20969, "getcookies", param0);
                            var4 = ma.a(127, ';', var3);
                            var5 = 0;
                            if (param1 == 14278) {
                                statePc = 3;
                            } else {
                                statePc = 2;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_1) {
                            caughtException = stateCaught_1;
                            statePc = 11;
                            continue stateLoop;
                        }
                    }
                    case 2: {
                        try {
                            field_c = null;
                            statePc = 3;
                            continue stateLoop;
                        } catch (Throwable stateCaught_2) {
                            caughtException = stateCaught_2;
                            statePc = 11;
                            continue stateLoop;
                        }
                    }
                    case 3: {
                        try {
                            if (var4.length <= var5) {
                                statePc = 12;
                            } else {
                                statePc = 4;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_3) {
                            caughtException = stateCaught_3;
                            statePc = 11;
                            continue stateLoop;
                        }
                    }
                    case 4: {
                        try {
                            var6 = var4[var5].indexOf('=');
                            if (var6 < 0) {
                                statePc = 9;
                            } else {
                                statePc = 5;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_4) {
                            caughtException = stateCaught_4;
                            statePc = 11;
                            continue stateLoop;
                        }
                    }
                    case 5: {
                        try {
                            if (var4[var5].substring(0, var6).trim().equals((Object) (Object) param2)) {
                                statePc = 7;
                            } else {
                                statePc = 6;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_5) {
                            caughtException = stateCaught_5;
                            statePc = 11;
                            continue stateLoop;
                        }
                    }
                    case 6: {
                        try {
                            statePc = 9;
                            continue stateLoop;
                        } catch (Throwable stateCaught_6) {
                            caughtException = stateCaught_6;
                            statePc = 11;
                            continue stateLoop;
                        }
                    }
                    case 7: {
                        try {
                            stackOut_7_0 = var4[var5].substring(var6 - -1).trim();
                            stackIn_8_0 = stackOut_7_0;
                            statePc = 8;
                            continue stateLoop;
                        } catch (Throwable stateCaught_7) {
                            caughtException = stateCaught_7;
                            statePc = 11;
                            continue stateLoop;
                        }
                    }
                    case 8: {
                        return stackIn_8_0;
                    }
                    case 9: {
                        try {
                            var5++;
                            statePc = 3;
                            continue stateLoop;
                        } catch (Throwable stateCaught_9) {
                            caughtException = stateCaught_9;
                            statePc = 11;
                            continue stateLoop;
                        }
                    }
                    case 11: {
                        try {
                            var3_ref = caughtException;
                            statePc = 12;
                            continue stateLoop;
                        } catch (Throwable stateCaught_11) {
                            caughtException = stateCaught_11;
                            statePc = 14;
                            continue stateLoop;
                        }
                    }
                    case 12: {
                        try {
                            stackOut_12_0 = null;
                            stackIn_13_0 = stackOut_12_0;
                            statePc = 13;
                            continue stateLoop;
                        } catch (Throwable stateCaught_12) {
                            caughtException = stateCaught_12;
                            statePc = 14;
                            continue stateLoop;
                        }
                    }
                    case 13: {
                        return (String) (Object) stackIn_13_0;
                    }
                    case 14: {
                        var3_ref2 = (RuntimeException) (Object) caughtException;
                        stackOut_14_0 = (RuntimeException) var3_ref2;
                        stackOut_14_1 = new StringBuilder().append("dl.G(");
                        stackIn_16_0 = stackOut_14_0;
                        stackIn_16_1 = stackOut_14_1;
                        stackIn_15_0 = stackOut_14_0;
                        stackIn_15_1 = stackOut_14_1;
                        if (param0 == null) {
                            statePc = 16;
                        } else {
                            statePc = 15;
                        }
                        continue stateLoop;
                    }
                    case 15: {
                        stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
                        stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
                        stackOut_15_2 = "{...}";
                        stackIn_17_0 = stackOut_15_0;
                        stackIn_17_1 = stackOut_15_1;
                        stackIn_17_2 = stackOut_15_2;
                        statePc = 17;
                        continue stateLoop;
                    }
                    case 16: {
                        stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
                        stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
                        stackOut_16_2 = "null";
                        stackIn_17_0 = stackOut_16_0;
                        stackIn_17_1 = stackOut_16_1;
                        stackIn_17_2 = stackOut_16_2;
                        statePc = 17;
                        continue stateLoop;
                    }
                    case 17: {
                        stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
                        stackOut_17_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_17_2).append(44).append(param1).append(44);
                        stackIn_19_0 = stackOut_17_0;
                        stackIn_19_1 = stackOut_17_1;
                        stackIn_18_0 = stackOut_17_0;
                        stackIn_18_1 = stackOut_17_1;
                        if (param2 == null) {
                            statePc = 19;
                        } else {
                            statePc = 18;
                        }
                        continue stateLoop;
                    }
                    case 18: {
                        stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
                        stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
                        stackOut_18_2 = "{...}";
                        stackIn_20_0 = stackOut_18_0;
                        stackIn_20_1 = stackOut_18_1;
                        stackIn_20_2 = stackOut_18_2;
                        statePc = 20;
                        continue stateLoop;
                    }
                    case 19: {
                        stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
                        stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
                        stackOut_19_2 = "null";
                        stackIn_20_0 = stackOut_19_0;
                        stackIn_20_1 = stackOut_19_1;
                        stackIn_20_2 = stackOut_19_2;
                        statePc = 20;
                        continue stateLoop;
                    }
                    case 20: {
                        throw la.a((Throwable) (Object) stackIn_20_0, stackIn_20_2 + 41);
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

    final static cj b(int param0) {
        if (param0 != 0) {
            return null;
        }
        if (!(di.field_a != ch.field_d)) {
            throw new IllegalStateException();
        }
        if (!(f.field_i != ch.field_d)) {
            ch.field_d = di.field_a;
            return cg.field_a;
        }
        return null;
    }

    public dl() {
        ((dl) this).field_d = new bf();
        ((dl) this).field_d.field_e = ((dl) this).field_d;
        ((dl) this).field_d.field_g = ((dl) this).field_d;
    }

    final bf a(byte param0) {
        bf var2 = null;
        var2 = ((dl) this).field_d.field_g;
        if (param0 == -120) {
          if (((dl) this).field_d == var2) {
            return null;
          } else {
            var2.a(7847);
            return var2;
          }
        } else {
          return null;
        }
    }

    final void a(int param0, bf param1) {
        try {
            if (null != param1.field_e) {
                param1.a(7847);
            }
            param1.field_g = ((dl) this).field_d.field_g;
            if (param0 > -104) {
                field_a = null;
            }
            param1.field_e = ((dl) this).field_d;
            param1.field_e.field_g = param1;
            param1.field_g.field_e = param1;
        } catch (RuntimeException runtimeException) {
            throw la.a((Throwable) (Object) runtimeException, "dl.A(" + param0 + 44 + (param1 != null ? "{...}" : "null") + 41);
        }
    }

    final static void a(int param0, ad param1) {
        le var2 = null;
        int var3 = 0;
        int var4 = 0;
        try {
            if (param0 != 11405) {
                field_b = false;
            }
            var2 = new le(param1.a("", "final_frame.jpg", 25), (java.awt.Component) (Object) ie.field_e);
            var3 = var2.field_k;
            var4 = var2.field_j;
            vf.a((byte) 127);
            ki.field_H = new le(var3, var4 * 3 / 4);
            ki.field_H.e();
            var2.a(0, 0);
            dj.field_b = new le(var3, -ki.field_H.field_j + var4);
            dj.field_b.e();
            var2.a(0, -ki.field_H.field_j);
            dj.field_b.field_q = ki.field_H.field_j;
            tj.b(653);
        } catch (RuntimeException runtimeException) {
            throw la.a((Throwable) (Object) runtimeException, "dl.I(" + param0 + 44 + (param1 != null ? "{...}" : "null") + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = new boolean[112];
        field_b = false;
        field_a = new long[32];
        field_f = "Music: ";
    }
}
