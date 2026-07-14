/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gm {
    static String field_a;
    static String field_e;
    static int field_c;
    static String field_b;
    static lb field_d;

    final static byte[] a(String param0, boolean param1) {
        Object var3 = null;
        if (param1) {
          var3 = null;
          byte[] discarded$2 = gm.a((String) null, true);
          return d.field_d.a("", param0, (byte) -128);
        } else {
          return d.field_d.a("", param0, (byte) -128);
        }
    }

    public static void a(int param0) {
        field_a = null;
        field_e = null;
        field_b = null;
        int var1 = 121 % ((-11 - param0) / 32);
        field_d = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "This trap is lethal.";
        field_e = "<col=FF0000>Defence -1</col>";
    }
}
