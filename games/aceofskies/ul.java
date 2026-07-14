/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ul extends sl {
    static un field_r;
    static String field_s;
    static String field_t;

    final static boolean a(String param0, byte param1) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        var4 = AceOfSkies.field_G ? 1 : 0;
        var2 = 0;
        L0: while (true) {
          if (var2 >= param0.length()) {
            if (param1 <= -103) {
              return false;
            } else {
              return true;
            }
          } else {
            var3 = param0.charAt(var2);
            if (!df.a((char) var3, 63)) {
              if (!oj.a((char) var3, (byte) -15)) {
                return true;
              } else {
                var2++;
                continue L0;
              }
            } else {
              var2++;
              continue L0;
            }
          }
        }
    }

    final String d(ea param0, int param1) {
        int var3 = -91 / ((3 - param1) / 35);
        return pt.a((byte) -126, ((ea) param0).field_f.length(), '*');
    }

    private ul(hc param0, int param1) {
        super(param0, param1);
    }

    final static void a(boolean param0, boolean param1, int param2) {
        if (!param1) {
            vp.a();
        } else {
            vp.b(0, 0, vp.field_i, vp.field_c, 0, 192);
        }
        if (param2 != -7395) {
            field_t = (String) null;
        }
        si.a(param1, -32106);
    }

    ul(int param0) {
        this(qo.field_b, param0);
    }

    public static void a(byte param0) {
        field_t = null;
        field_r = null;
        int var1 = 11 / ((param0 - -50) / 55);
        field_s = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_t = "Service unavailable";
    }
}
