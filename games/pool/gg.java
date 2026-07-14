/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class gg implements ip {
    static dd[] field_b;
    static boolean[] field_d;
    static int field_f;
    static String field_c;
    private long field_e;
    static String field_a;
    static int field_g;

    abstract String f(int param0);

    final static byte[] a(byte param0, String param1) {
        int var2 = 43 / ((param0 - 33) / 60);
        return me.field_r.a(false, param1, "");
    }

    final static boolean a(boolean param0) {
        if (param0) {
          if (10 <= fk.field_ab) {
            if (-14 > sf.field_y) {
              return false;
            } else {
              return true;
            }
          } else {
            return false;
          }
        } else {
          gg.e(39);
          if (10 <= fk.field_ab) {
            if (-14 < sf.field_y) {
              return false;
            } else {
              return true;
            }
          } else {
            return false;
          }
        }
    }

    public final void b(int param0) {
        if (param0 != 11755) {
            ((gg) this).field_e = 87L;
            ((gg) this).field_e = rl.a((byte) -109);
            return;
        }
        ((gg) this).field_e = rl.a((byte) -109);
    }

    public static void e(int param0) {
        if (param0 != -1) {
            return;
        }
        field_b = null;
        field_a = null;
        field_d = null;
        field_c = null;
    }

    final static wc a(int param0, boolean param1, String param2) {
        wc var3 = null;
        Object var4 = null;
        var3 = new wc(false);
        if (!param1) {
          var4 = null;
          gg.a((java.applet.Applet) null, (byte) 49);
          var3.field_g = param0;
          var3.field_b = param2;
          return var3;
        } else {
          var3.field_g = param0;
          var3.field_b = param2;
          return var3;
        }
    }

    public final na c(int param0) {
        if (((gg) this).d(-3)) {
          return wm.field_Pb;
        } else {
          if (param0 == -31873) {
            if ((350L + ((gg) this).field_e ^ -1L) < (rl.a((byte) -101) ^ -1L)) {
              return ji.field_h;
            } else {
              return ((gg) this).g(param0 ^ 17779);
            }
          } else {
            field_g = -106;
            if ((350L + ((gg) this).field_e ^ -1L) < (rl.a((byte) -101) ^ -1L)) {
              return ji.field_h;
            } else {
              return ((gg) this).g(param0 ^ 17779);
            }
          }
        }
    }

    final static void a(java.applet.Applet param0, byte param1) {
        try {
            Exception exception = null;
            String var2 = null;
            int var3 = 0;
            String var4 = null;
            java.net.URL var5 = null;
            Throwable decompiledCaughtException = null;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        try {
                            var2 = param0.getDocumentBase().getFile();
                            var4 = var2;
                            var4 = var2;
                            var3 = var2.indexOf('?');
                            var4 = "reload.ws";
                            if (-1 < (var3 ^ -1)) {
                                statePc = 2;
                            } else {
                                statePc = 1;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_0) {
                            caughtException = stateCaught_0;
                            statePc = 4;
                            continue stateLoop;
                        }
                    }
                    case 1: {
                        try {
                            var4 = var4 + var2.substring(var3);
                            statePc = 2;
                            continue stateLoop;
                        } catch (Throwable stateCaught_1) {
                            caughtException = stateCaught_1;
                            statePc = 4;
                            continue stateLoop;
                        }
                    }
                    case 2: {
                        try {
                            var5 = new java.net.URL(param0.getCodeBase(), var4);
                            param0.getAppletContext().showDocument(p.a((byte) -103, var5, param0), "_self");
                            statePc = 5;
                            continue stateLoop;
                        } catch (Throwable stateCaught_2) {
                            caughtException = stateCaught_2;
                            statePc = 4;
                            continue stateLoop;
                        }
                    }
                    case 4: {
                        exception = (Exception) (Object) caughtException;
                        exception.printStackTrace();
                        statePc = 5;
                        continue stateLoop;
                    }
                    case 5: {
                        if (param1 >= -45) {
                            statePc = 7;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    }
                    case 6: {
                        return;
                    }
                    case 7: {
                        boolean discarded$2 = gg.a(false);
                        return;
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

    abstract na g(int param0);

    public final String a(int param0) {
        if (!((gg) this).d(-3)) {
          if (rl.a((byte) -123) >= ((gg) this).field_e - -350L) {
            if (param0 <= 61) {
              field_c = null;
              return ((gg) this).f(-120);
            } else {
              return ((gg) this).f(-120);
            }
          } else {
            return null;
          }
        } else {
          return null;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_f = 0;
        field_c = "You can join this game";
        field_a = "Logging in...";
        field_g = -1;
    }
}
