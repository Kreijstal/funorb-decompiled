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

    public static void b(byte param0) {
        field_c = null;
        field_f = null;
        if (param0 != 54) {
            field_c = null;
            field_a = null;
            return;
        }
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
        if (!(param0.field_e == null)) {
            param0.a(7847);
        }
        param0.field_g = ((dl) this).field_d;
        param0.field_e = ((dl) this).field_d.field_e;
        param0.field_e.field_g = param0;
        int var3 = 73 % ((param1 - 44) / 45);
        param0.field_g.field_e = param0;
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
            String[] var4 = null;
            int var5 = 0;
            int var6 = 0;
            int var7 = 0;
            String stackIn_8_0 = null;
            String stackOut_7_0 = null;
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
                            if (-1 < (var6 ^ -1)) {
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
                        var3_ref = caughtException;
                        statePc = 12;
                        continue stateLoop;
                    }
                    case 12: {
                        return null;
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
        if (null == param1.field_e) {
          param1.field_g = ((dl) this).field_d.field_g;
          if (param0 > -104) {
            field_a = null;
            param1.field_e = ((dl) this).field_d;
            param1.field_e.field_g = param1;
            param1.field_g.field_e = param1;
            return;
          } else {
            param1.field_e = ((dl) this).field_d;
            param1.field_e.field_g = param1;
            param1.field_g.field_e = param1;
            return;
          }
        } else {
          param1.a(7847);
          param1.field_g = ((dl) this).field_d.field_g;
          if (param0 <= -104) {
            param1.field_e = ((dl) this).field_d;
            param1.field_e.field_g = param1;
            param1.field_g.field_e = param1;
            return;
          } else {
            field_a = null;
            param1.field_e = ((dl) this).field_d;
            param1.field_e.field_g = param1;
            param1.field_g.field_e = param1;
            return;
          }
        }
    }

    final static void a(int param0, ad param1) {
        int var3 = 0;
        int var4 = 0;
        le var5 = null;
        le var6 = null;
        if (param0 != 11405) {
          field_b = false;
          var5 = new le(param1.a("", "final_frame.jpg", 25), (java.awt.Component) (Object) ie.field_e);
          var3 = var5.field_k;
          var4 = var5.field_j;
          vf.a((byte) 127);
          ki.field_H = new le(var3, var4 * 3 / 4);
          ki.field_H.e();
          var5.a(0, 0);
          dj.field_b = new le(var3, -ki.field_H.field_j + var4);
          dj.field_b.e();
          var5.a(0, -ki.field_H.field_j);
          dj.field_b.field_q = ki.field_H.field_j;
          tj.b(653);
          return;
        } else {
          var6 = new le(param1.a("", "final_frame.jpg", 25), (java.awt.Component) (Object) ie.field_e);
          var3 = var6.field_k;
          var4 = var6.field_j;
          vf.a((byte) 127);
          ki.field_H = new le(var3, var4 * 3 / 4);
          ki.field_H.e();
          var6.a(0, 0);
          dj.field_b = new le(var3, -ki.field_H.field_j + var4);
          dj.field_b.e();
          var6.a(0, -ki.field_H.field_j);
          dj.field_b.field_q = ki.field_H.field_j;
          tj.b(653);
          return;
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
