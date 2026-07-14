/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pd extends kd {
    int field_p;
    ei[] field_k;
    int[] field_m;
    int[] field_n;
    byte[][][] field_o;
    ei[] field_i;
    int field_j;
    static int[] field_l;
    int[] field_h;

    final static void a(String param0, int param1, java.applet.Applet param2) {
        try {
            Exception exception = null;
            java.net.URL var3 = null;
            Object var4 = null;
            Throwable decompiledCaughtException = null;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        try {
                            var3 = new java.net.URL(param2.getCodeBase(), param0);
                            var3 = gf.a(3, var3, param2);
                            m.a(true, true, var3.toString(), param2);
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
                        if (param1 >= -65) {
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
                        var4 = null;
                        pd.a((String) null, -123, (java.applet.Applet) null);
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

    final static boolean a(String param0, String param1, int param2) {
        String var3 = null;
        int stackIn_3_0 = 0;
        int stackOut_1_0 = 0;
        param0 = ne.a((char)param2, "", param0, (byte) -126);
        var3 = ci.a(param1, (byte) -79);
        if (param0.indexOf(param1) == -1) {
          if (-1 != param0.indexOf(var3)) {
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

    final static void a(int param0) {
        ul var1 = null;
        var1 = (ul) (Object) vb.field_m.a(31334);
        if (var1 != null) {
          lf.a(var1.field_h, var1.field_j, var1.field_n);
          lf.g(var1.field_l, var1.field_i, var1.field_p, var1.field_m);
          var1.field_h = null;
          pb.field_k.b(125, (kd) (Object) var1);
          if (param0 != -22949) {
            field_l = null;
            return;
          } else {
            return;
          }
        } else {
          throw new IllegalStateException();
        }
    }

    pd() {
    }

    public static void b(int param0) {
        int var1 = 86 % ((param0 - -51) / 42);
        field_l = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_l = new int[8192];
    }
}
