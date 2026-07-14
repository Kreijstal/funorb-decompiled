/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ij {
    static he[] field_e;
    static String field_c;
    static String field_a;
    static he[] field_d;
    static String field_b;

    public static void a(int param0) {
        field_d = null;
        field_a = null;
        field_c = null;
        field_e = null;
        field_b = null;
        if (param0 != 15596) {
            Object var2 = null;
            he[] discarded$0 = ij.a((String) null, (byte) -61, (vj) null, (String) null);
        }
    }

    final static he[] a(String param0, byte param1, vj param2, String param3) {
        int var4 = 0;
        int var5 = 0;
        var4 = param2.a(param3, (byte) -126);
        if (param1 < 52) {
          ij.a(-72);
          var5 = param2.a((byte) -86, param0, var4);
          return rd.a(var5, true, var4, param2);
        } else {
          var5 = param2.a((byte) -86, param0, var4);
          return rd.a(var5, true, var4, param2);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "Loading fonts";
        field_c = "Toggle fullscreen mode";
        field_b = "Login: ";
    }
}
