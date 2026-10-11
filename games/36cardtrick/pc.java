/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pc {
    static int[] field_b;
    static kc[] field_d;
    static af field_a;
    static int field_c;
    private static String field_z;

    public static void a(int param0) {
        field_a = null;
        field_d = null;
        field_b = null;
        int var1 = -35 % ((77 - param0) / 35);
    }

    static {
        int var1 = 0;
        int var2 = 0;
        int var0;
        field_z = "pc.A(";
        field_b = new int[256];
        for (var1 = 0; var1 < 256; var1++) {
          var0 = var1;
          for (var2 = 0; var2 < 8; var2++) {
            if (1 != (1 & var0)) {
              var0 = var0 >>> 1;
            } else {
              var0 = -306674912 ^ var0 >>> 1;
            }
          }
          field_b[var1] = var0;
        }
    }
}
