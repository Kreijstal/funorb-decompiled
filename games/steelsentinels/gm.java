/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gm {
    static String field_d;
    static String field_a;
    static gh field_c;
    static wk field_b;

    final static void a(byte param0) {
        if (param0 > -87) {
            field_d = null;
            rg.field_d = new ul();
            return;
        }
        rg.field_d = new ul();
    }

    final static ef a(boolean param0, String param1) {
        int var2 = 0;
        String var4 = null;
        ef var5 = null;
        String var6 = null;
        String var7 = null;
        String var8 = null;
        String var9 = null;
        if (param0) {
          if (param1 != null) {
            if (param1.length() != 0) {
              var2 = param1.indexOf('@');
              if (-1 != var2) {
                var8 = param1.substring(0, var2);
                var9 = param1.substring(var2 - -1);
                var5 = bk.a(110, var8);
                if (var5 != null) {
                  return var5;
                } else {
                  return d.a(var9, false);
                }
              } else {
                return ud.field_A;
              }
            } else {
              return qm.field_f;
            }
          } else {
            return qm.field_f;
          }
        } else {
          gm.a(108);
          if (param1 != null) {
            if (param1.length() != 0) {
              var2 = param1.indexOf('@');
              if (-1 != var2) {
                var6 = param1.substring(0, var2);
                var7 = param1.substring(var2 - -1);
                var4 = var7;
                var5 = bk.a(110, var6);
                if (var5 != null) {
                  return var5;
                } else {
                  return d.a(var7, false);
                }
              } else {
                return ud.field_A;
              }
            } else {
              return qm.field_f;
            }
          } else {
            return qm.field_f;
          }
        }
    }

    public static void a(int param0) {
        field_a = null;
        field_d = null;
        field_c = null;
        if (param0 != -1) {
            return;
        }
        field_b = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = "<%1> couldn't avoid the mighty enormo-laser";
        field_a = "C";
    }
}
