/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class ai {
    static String field_b;
    static int[] field_a;

    public static void a(int param0) {
        field_b = null;
        if (param0 != -28739) {
            return;
        }
        field_a = null;
    }

    final static w a(String param0, byte param1) {
        int var2 = 0;
        String var3 = null;
        String var4 = null;
        w var5 = null;
        var4 = param0;
        if (param0 != null) {
          if (param0.length() != 0) {
            var2 = param0.indexOf('@');
            if ((var2 ^ -1) == 0) {
              return nh.field_f;
            } else {
              var3 = param0.substring(0, var2);
              var4 = param0.substring(var2 - -1);
              var5 = ds.a(false, var3);
              if (var5 != null) {
                return var5;
              } else {
                if (param1 != 12) {
                  return (w) null;
                } else {
                  return in.a(126, var4);
                }
              }
            }
          } else {
            return mo.field_a;
          }
        } else {
          return mo.field_a;
        }
    }

    abstract void a(int param0, float param1, int param2, float param3, int param4, int param5, float param6, float param7, int param8, float[] param9, int param10);

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "Updates will sent to the email address you've given";
    }
}
