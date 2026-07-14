/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class df {
    static int field_d;
    static be field_e;
    static String field_c;
    static boolean field_f;
    private String field_h;
    static String field_a;
    static int field_b;
    static int field_g;
    static int field_i;

    df(String param0) {
        ((df) this).field_h = param0;
    }

    final boolean a(int param0, String param1) {
        if (param0 > -49) {
            ((df) this).field_h = null;
            return ((df) this).field_h.equals((Object) (Object) param1);
        }
        return ((df) this).field_h.equals((Object) (Object) param1);
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    public static void a(int param0) {
        if (param0 <= 34) {
          field_c = null;
          field_a = null;
          field_e = null;
          field_c = null;
          return;
        } else {
          field_a = null;
          field_e = null;
          field_c = null;
          return;
        }
    }

    final void a(int param0, java.applet.Applet param1) {
        Object var4 = null;
        if (param0 != 12423) {
          var4 = null;
          ((df) this).a(70, (java.applet.Applet) null);
          ke.a(849743536, "jagex-last-login-method", param1, ((df) this).field_h, 31536000L);
          return;
        } else {
          ke.a(849743536, "jagex-last-login-method", param1, ((df) this).field_h, 31536000L);
          return;
        }
    }

    final static boolean a(String param0, byte param1, String param2) {
        String var3 = null;
        int stackIn_13_0 = 0;
        int stackOut_11_0 = 0;
        var3 = qc.a(param2, 1);
        if (param1 > 116) {
          if (-1 == param0.indexOf(param2)) {
            if ((param0.indexOf(var3) ^ -1) == 0) {
              if (!param0.startsWith(param2)) {
                if (!param0.startsWith(var3)) {
                  if (!param0.endsWith(param2)) {
                    if (param0.endsWith(var3)) {
                      return true;
                    } else {
                      return false;
                    }
                  } else {
                    stackOut_11_0 = 1;
                    stackIn_13_0 = stackOut_11_0;
                    return stackIn_13_0 != 0;
                  }
                } else {
                  return true;
                }
              } else {
                return true;
              }
            } else {
              return true;
            }
          } else {
            return true;
          }
        } else {
          return true;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = "Type your age in years";
        field_g = 0;
        field_a = "ALL HISCORES";
        field_f = true;
        field_i = 250;
    }
}
