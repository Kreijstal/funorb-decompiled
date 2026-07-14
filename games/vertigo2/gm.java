/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gm {
    static String field_b;
    static String[] field_c;
    static String field_a;

    final static String a(byte param0, CharSequence param1) {
        Object var3 = null;
        if (param0 <= 79) {
          var3 = null;
          boolean discarded$2 = gm.a(112, (String) null, (String) null);
          return ce.a((byte) -119, false, param1);
        } else {
          return ce.a((byte) -119, false, param1);
        }
    }

    final static boolean a(int param0, String param1, String param2) {
        int var3 = 0;
        String var4 = null;
        int stackIn_3_0 = 0;
        int stackOut_1_0 = 0;
        var3 = 114 / ((param0 - 55) / 42);
        param1 = cn.a((byte) -103, "", '_', param1);
        var4 = mq.a(param1, false);
        if ((param2.indexOf(param1) ^ -1) == 0) {
          if (param2.indexOf(var4) != -1) {
            return true;
          } else {
            return false;
          }
        } else {
          stackOut_1_0 = 1;
          stackIn_3_0 = stackOut_1_0;
          return stackIn_3_0 != 0;
        }
    }

    final static void a(int param0, byte param1) {
        ae[] var2 = null;
        ae[] var3 = null;
        if (param1 == -55) {
          var3 = on.field_b[param0];
          var2 = var3;
          if (1 != var3.length) {
            gg discarded$8 = e.a(var3[be.a(var3.length, (byte) 83)], false);
            return;
          } else {
            gg discarded$9 = e.a(on.field_b[param0][0], false);
            return;
          }
        } else {
          gm.a(58, (byte) -65);
          var3 = on.field_b[param0];
          var2 = var3;
          if (1 != var3.length) {
            gg discarded$10 = e.a(var3[be.a(var3.length, (byte) 83)], false);
            return;
          } else {
            gg discarded$11 = e.a(on.field_b[param0][0], false);
            return;
          }
        }
    }

    final static ej[] a(int param0) {
        if (param0 != 7554) {
          field_a = null;
          return new ej[]{li.field_j, la.field_i, ne.field_N};
        } else {
          return new ej[]{li.field_j, la.field_i, ne.field_N};
        }
    }

    final static void a(java.applet.Applet param0, byte param1) {
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
                            var2 = new java.net.URL(param0.getCodeBase(), "tosupport.ws");
                            param0.getAppletContext().showDocument(ar.a(param0, var2, 0), "_top");
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
                        if (param1 > -114) {
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
                        gm.a((java.applet.Applet) null, (byte) 34);
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

    public static void b(int param0) {
        field_a = null;
        field_b = null;
        field_c = null;
        if (param0 != 0) {
            field_b = null;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "Start Game";
        field_b = "Only show private chat from my friends and opponents";
    }
}
