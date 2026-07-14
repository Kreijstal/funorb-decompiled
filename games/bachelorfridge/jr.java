/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jr {
    static String field_a;

    public static void a(int param0) {
        field_a = null;
        int var1 = 33 % ((-32 - param0) / 54);
    }

    final static pia a(String param0, byte param1, vr param2, String param3, vr param4) {
        int var5 = 0;
        int var6 = 0;
        var5 = param2.a(param0, false);
        if (param1 < 101) {
          return null;
        } else {
          var6 = param2.a((byte) 6, var5, param3);
          return fd.a((byte) -105, var6, var5, param4, param2);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "Names cannot contain consecutive spaces";
    }
}
