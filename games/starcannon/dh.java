/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dh {
    static ge field_a;
    static String field_b;

    public static void a(byte param0) {
        field_a = null;
        if (param0 > -100) {
            return;
        }
        field_b = null;
    }

    final static void a(byte param0, ue param1) {
        nj var2 = null;
        nj.b(param1.a("headers.packvorbis", (byte) 45, ""));
        var2 = nj.a(param1, "jagex logo2.packvorbis", "");
        if (param0 != 115) {
          return;
        } else {
          ud discarded$2 = var2.c();
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = new ge();
        field_b = "Checking";
    }
}
