/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class oi {
    int field_k;
    static String field_g;
    int field_b;
    int field_h;
    int field_d;
    int field_j;
    int field_f;
    static oh field_e;
    static int field_m;
    static ie field_l;
    static int field_c;
    static String field_i;
    static int[] field_n;
    static jb field_a;

    final static void a(byte param0, String param1, boolean param2, java.applet.Applet param3) {
        try {
            java.net.MalformedURLException var4 = null;
            Throwable decompiledCaughtException = null;
            L0: {
              if (ie.field_l.startsWith("win")) {
                if (in.a(18, param1)) {
                  return;
                } else {
                  break L0;
                }
              } else {
                break L0;
              }
            }
            try {
              L1: {
                param3.getAppletContext().showDocument(new java.net.URL(param1), "_blank");
                if (param0 < -36) {
                  break L1;
                } else {
                  oi.a(90);
                  return;
                }
              }
            } catch (java.net.MalformedURLException decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              L2: {
                var4 = (java.net.MalformedURLException) (Object) decompiledCaughtException;
                fk.a(-41, (Throwable) null, "MGR1: " + param1);
                break L2;
              }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    abstract void a(int param0, int param1);

    final static void a(byte param0, int param1) {
        bc var2 = null;
        var2 = nd.field_Lb;
        if (param0 != 126) {
          field_n = null;
          var2.f(param1, (byte) -92);
          var2.a(1, false);
          var2.a(3, false);
          return;
        } else {
          var2.f(param1, (byte) -92);
          var2.a(1, false);
          var2.a(3, false);
          return;
        }
    }

    public static void a(int param0) {
        field_a = null;
        field_i = null;
        field_l = null;
        field_e = null;
        field_g = null;
        field_n = null;
        if (param0 >= -22) {
            field_c = -30;
        }
    }

    final static cn a(Throwable param0, String param1) {
        cn var2 = null;
        if (!(param0 instanceof cn)) {
            var2 = new cn(param0, param1);
        } else {
            var2 = (cn) (Object) param0;
            var2.field_d = var2.field_d + 32 + param1;
        }
        return var2;
    }

    abstract void a(int param0, int param1, int param2);

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_g = "to keep fullscreen or";
        field_e = new oh(270, 70);
        field_i = "You are offering an unrated rematch.";
        field_n = new int[256];
    }
}
