/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ve extends RuntimeException {
    static bb field_a;
    String field_d;
    static int field_b;
    Throwable field_c;

    final static od a(da param0, int param1, String param2, String param3) {
        int var4 = 0;
        int var5 = 0;
        var4 = param0.c(103, param3);
        if (param1 >= -62) {
          ve.a((byte) -74);
          var5 = param0.a(param2, -1, var4);
          return wg.a((byte) 47, param0, var4, var5);
        } else {
          var5 = param0.a(param2, -1, var4);
          return wg.a((byte) 47, param0, var4, var5);
        }
    }

    final static String a(String param0, String param1, da param2, byte param3) {
        if (param3 != -94) {
            field_b = 25;
            if (!(param2.c((byte) -121))) {
                return param1;
            }
            return param0 + " - " + param2.b((byte) -66) + "%";
        }
        if (!(param2.c((byte) -121))) {
            return param1;
        }
        return param0 + " - " + param2.b((byte) -66) + "%";
    }

    public static void a(byte param0) {
        if (param0 != 125) {
            field_b = 2;
            field_a = null;
            return;
        }
        field_a = null;
    }

    ve(Throwable param0, String param1) {
        ((ve) this).field_c = param0;
        ((ve) this).field_d = param1;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = 500;
    }
}
