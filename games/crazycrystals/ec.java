/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ec extends ln {
    static String field_n;
    static wb field_l;
    static int[] field_i;
    static boolean field_g;
    static am field_k;
    static oi field_h;
    static vc field_m;
    static dl[] field_j;

    final static void a(boolean param0, String param1, java.applet.Applet param2, byte param3) {
        try {
            java.net.MalformedURLException var4 = null;
            Object var5 = null;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        if (!un.field_u.startsWith("win")) {
                            statePc = 3;
                        } else {
                            statePc = 1;
                        }
                        continue stateLoop;
                    }
                    case 1: {
                        if (!re.a(false, param1)) {
                            statePc = 3;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    }
                    case 2: {
                        return;
                    }
                    case 3: {
                        try {
                            param2.getAppletContext().showDocument(new java.net.URL(param1), "_blank");
                            if (param3 == -17) {
                                statePc = 7;
                            } else {
                                statePc = 4;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_3) {
                            caughtException = stateCaught_3;
                            statePc = 6;
                            continue stateLoop;
                        }
                    }
                    case 4: {
                        try {
                            var5 = null;
                            ec.a(true, (String) null, (java.applet.Applet) null, (byte) 126);
                            return;
                        } catch (Throwable stateCaught_4) {
                            caughtException = stateCaught_4;
                            statePc = 6;
                            continue stateLoop;
                        }
                    }
                    case 6: {
                        var4 = (java.net.MalformedURLException) (Object) caughtException;
                        wp.a((Throwable) null, "MGR1: " + param1, 21862);
                        statePc = 7;
                        continue stateLoop;
                    }
                    case 7: {
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

    public static void a(int param0) {
        if (param0 != 4) {
          return;
        } else {
          field_k = null;
          field_l = null;
          field_m = null;
          field_j = null;
          field_i = null;
          field_h = null;
          field_n = null;
          return;
        }
    }

    ec(String param0, int param1, int param2, int param3) {
        super(param0, param1, param2, param3);
    }

    final int a(int param0, byte param1) {
        int var3 = 0;
        int stackIn_3_0 = 0;
        int stackOut_1_0 = 0;
        var3 = 111 / ((55 - param1) / 50);
        if (((ec) this).field_c > 1) {
          if (q.field_a[param0].field_h) {
            return 0;
          } else {
            return 1;
          }
        } else {
          stackOut_1_0 = 0;
          stackIn_3_0 = stackOut_1_0;
          return stackIn_3_0;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_i = new int[4];
        field_n = "Spider";
        field_l = new wb();
        field_h = new oi();
    }
}
