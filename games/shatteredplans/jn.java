/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jn extends Exception {
    static boolean field_a;
    static int field_b;
    private static String field_z;

    jn(String param0) {
        super(param0);
    }

    final static void a() {
        int var1 = 0;
        if (wm.field_b < 224) {
          var1 = wm.field_b % 32;
          ak.c(124, wm.field_b + (32 + -var1));
          return;
        } else {
          ak.c(-78, 256);
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_z = "jn.A(";
    }
}
