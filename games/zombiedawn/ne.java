/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ne {
    static int field_b;
    static no field_c;
    static String field_a;

    public static void a(byte param0) {
        if (param0 != 83) {
            field_b = -18;
            field_a = null;
            field_c = null;
            return;
        }
        field_a = null;
        field_c = null;
    }

    final static sn a(java.applet.Applet param0, int param1) {
        String var2 = null;
        sn[] var3 = null;
        int var4 = 0;
        sn var5 = null;
        int var6 = 0;
        var6 = ZombieDawn.field_J;
        var2 = hf.a(true, param0, "jagex-last-login-method");
        if (var2 == null) {
          return u.field_e;
        } else {
          var3 = cn.b(31114);
          var4 = param1;
          L0: while (true) {
            if (var3.length > var4) {
              var5 = var3[var4];
              if (var5.a(var2, (byte) -22)) {
                return var5;
              } else {
                var4++;
                continue L0;
              }
            } else {
              return u.field_e;
            }
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "This entry doesn't match";
    }
}
