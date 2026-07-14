/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wi {
    static eh field_c;
    static String field_a;
    static String field_b;

    final static wa a(int param0, int param1, wa param2, int param3, int param4, int param5, int param6) {
        wa var7 = null;
        var7 = qq.field_D;
        if (param6 == -3903) {
          if (var7 == null) {
            var7 = new wa();
            ms.field_a = ms.field_a + 1;
            var7.a(param1, param5, param0, param3, param2, param4, (byte) -34);
            return var7;
          } else {
            qq.field_D = qq.field_D.field_c;
            var7.a(param1, param5, param0, param3, param2, param4, (byte) -34);
            return var7;
          }
        } else {
          return null;
        }
    }

    final static void a(int param0, byte param1, v param2, int param3, v param4, int param5) {
        js.field_g = param5;
        js.field_e = param0;
        cr.field_e = param4;
        uo.field_g = param3;
        int var6 = -121 % ((-57 - param1) / 48);
        jp.field_Cb = param2;
    }

    final static int a(e param0, e param1, int param2) {
        Object var4 = null;
        Object var5 = null;
        if (param2 != 0) {
          var4 = null;
          wi.a(-18, (byte) 102, (v) null, 64, (v) null, 60);
          var5 = null;
          return si.a(0, 0, param0, param1, 120, (String) null, false);
        } else {
          var5 = null;
          return si.a(0, 0, param0, param1, 120, (String) null, false);
        }
    }

    public static void a(byte param0) {
        field_a = null;
        field_c = null;
        field_b = null;
        if (param0 < 84) {
            wi.a((byte) -48);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "Please log in as a subscribing member to access this feature.";
        field_a = "Show all lobby chat";
    }
}
