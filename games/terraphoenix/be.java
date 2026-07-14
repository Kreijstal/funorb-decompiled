/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class be extends wc {
    static String field_y;
    static int field_v;
    static ci field_u;
    static pk field_x;
    static String field_w;
    private Object field_t;

    final static boolean a(CharSequence param0, int param1) {
        if (param1 < 19) {
            return true;
        }
        return sa.a(false, 0, param0);
    }

    final boolean d(int param0) {
        if (param0 < 12) {
            return false;
        }
        return false;
    }

    final Object d(byte param0) {
        if (param0 >= -118) {
            field_v = 77;
            return ((be) this).field_t;
        }
        return ((be) this).field_t;
    }

    final static void a(java.applet.Applet param0, int param1) {
        try {
            Exception exception = null;
            java.net.URL var2 = null;
            Object var3 = null;
            Throwable decompiledCaughtException = null;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        try {
                            var2 = new java.net.URL(param0.getCodeBase(), "toserverlist.ws");
                            param0.getAppletContext().showDocument(bb.a((byte) 116, var2, param0), "_top");
                            statePc = 3;
                            continue stateLoop;
                        } catch (Throwable stateCaught_0) {
                            caughtException = stateCaught_0;
                            statePc = 2;
                            continue stateLoop;
                        }
                    }
                    case 2: {
                        exception = (Exception) (Object) caughtException;
                        exception.printStackTrace();
                        statePc = 3;
                        continue stateLoop;
                    }
                    case 3: {
                        if (param1 > -13) {
                            statePc = 5;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    }
                    case 4: {
                        return;
                    }
                    case 5: {
                        var3 = null;
                        be.a((java.applet.Applet) null, 36);
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

    final static ci[] a(int param0, int param1, int param2, int param3, int param4) {
        ci[] var5 = null;
        ci[] var6 = null;
        var6 = new ci[9];
        var5 = var6;
        var6[6] = nb.a(param3, param1, 126);
        var5[3] = nb.a(param3, param1, 126);
        var5[2] = nb.a(param3, param1, 126);
        var5[1] = nb.a(param3, param1, 126);
        var5[0] = nb.a(param3, param1, 126);
        var6[8] = nb.a(param3, param4, 123);
        var5[7] = nb.a(param3, param4, 123);
        var5[5] = nb.a(param3, param4, 123);
        if (param2 == 0) {
          if (param0 < 61) {
            ci[] discarded$4 = be.a(-105, 79, -25, -58, -88);
            return var5;
          } else {
            return var5;
          }
        } else {
          var6[4] = nb.a(64, param2, 118);
          if (param0 >= 61) {
            return var5;
          } else {
            ci[] discarded$5 = be.a(-105, 79, -25, -58, -88);
            return var5;
          }
        }
    }

    public static void e(byte param0) {
        field_w = null;
        int var1 = -77 / ((55 - param0) / 36);
        field_u = null;
        field_x = null;
        field_y = null;
    }

    be(Object param0, int param1) {
        super(param1);
        ((be) this).field_t = param0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_y = "Type your password again to make sure it's correct";
        field_v = 480;
        field_w = "Waiting for graphics";
    }
}
