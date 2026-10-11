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

    final static void a(int param0) {
        if (param0 != 11615) {
          return;
        }
        if (wm.field_b >= 224) {
          ak.c(-78, 256);
          return;
        }
        int var1 = wm.field_b % 32;
        ak.c(124, wm.field_b + (32 - var1));
    }

    static {
        field_z = "jn.A(";
    }
}
