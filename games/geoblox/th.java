/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class th extends lf {
    static int[] field_h;
    static String field_g;
    static na field_f;

    th(long param0, String param1) {
        super(param0, param1);
    }

    final static od a(java.applet.Applet param0, int param1) {
        String var2 = null;
        od[] var3 = null;
        int var4 = 0;
        od var5 = null;
        int var6 = 0;
        var6 = Geoblox.field_C;
        if (param1 == 200) {
          var2 = qi.a("jagex-last-login-method", param0, -114);
          if (var2 != null) {
            var3 = ak.a(false);
            var4 = 0;
            L0: while (true) {
              if (var3.length > var4) {
                var5 = var3[var4];
                if (var5.a(115, var2)) {
                  return var5;
                } else {
                  var4++;
                  continue L0;
                }
              } else {
                return td.field_I;
              }
            }
          } else {
            return td.field_I;
          }
        } else {
          th.d((byte) 21);
          var2 = qi.a("jagex-last-login-method", param0, -114);
          if (var2 != null) {
            var3 = ak.a(false);
            var4 = 0;
            L1: while (true) {
              if (var3.length > var4) {
                var5 = var3[var4];
                if (var5.a(115, var2)) {
                  return var5;
                } else {
                  var4++;
                  continue L1;
                }
              } else {
                return td.field_I;
              }
            }
          } else {
            return td.field_I;
          }
        }
    }

    public static void d(byte param0) {
        field_h = null;
        field_f = null;
        field_g = null;
        if (param0 != -109) {
            field_f = null;
        }
    }

    final qg a(byte param0) {
        if (param0 != -32) {
            qg discarded$0 = ((th) this).a((byte) 104);
            return vh.field_D;
        }
        return vh.field_D;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_h = new int[]{100, 200, 500, 300, 300, 500, 500, 500, 100, 100, 100, 200, 200, 200, 300, 1000, 300};
        field_g = "Player";
    }
}
