/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gg {
    static int field_d;
    static sc field_b;
    static boolean field_a;
    static String field_c;

    public static void a(boolean param0) {
        field_b = null;
        field_c = null;
        if (param0) {
            field_c = null;
        }
    }

    final static rj a(String param0, da param1, qk param2, int param3, String param4) {
        int var5 = 0;
        int var6 = 0;
        if (param3 != -16351) {
          return null;
        } else {
          var5 = param2.a(param3 ^ -30526, param4);
          var6 = param2.a(var5, param0, (byte) 7);
          return ni.a((byte) 65, var5, param2, var6, param1);
        }
    }

    final static void a(int param0) {
        eh var1 = null;
        var1 = (eh) (Object) ai.field_k.b(-114);
        if (var1 != null) {
          vj.a(var1.field_h, var1.field_i, var1.field_g);
          vj.g(var1.field_k, var1.field_n, var1.field_m, var1.field_j);
          var1.field_h = null;
          lk.field_g.a((qb) (Object) var1, 27362);
          if (param0 != 14756) {
            field_a = false;
            return;
          } else {
            return;
          }
        } else {
          throw new IllegalStateException();
        }
    }

    final static void a(java.applet.Applet param0, int param1) {
        try {
            java.net.URL var2 = null;
            try {
                var2 = new java.net.URL(param0.getCodeBase(), "toserverlist.ws");
                if (param1 != 7380) {
                    field_b = null;
                }
                param0.getAppletContext().showDocument(fh.a(param0, var2, param1 + -7381), "_top");
            } catch (Exception exception) {
                exception.printStackTrace();
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = "Discard";
        field_b = new sc();
    }
}
