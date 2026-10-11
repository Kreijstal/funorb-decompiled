/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cl {
    int field_e;
    int field_b;
    static String field_g;
    static int[] field_c;
    int field_f;
    int field_a;
    static boolean field_d;
    static String field_h;

    final static boolean a(boolean param0, int param1, int param2, int param3) {
        if (!param0) {
          return false;
        }
        if (param3 < 0) {
          return false;
        }
        if (param3 > 11) {
          return false;
        }
        if (1 <= param2 &&
          rp.a(param3, param1, -126) >= param2) {
          return true;
        }
        return false;
    }

    public static void a(int param0) {
        field_g = null;
        if (param0 != -1) {
          cl.a(89);
        }
        field_c = null;
        field_h = null;
    }

    static {
        int var1 = 0;
        int var2 = 0;
        int var0;
        field_g = "last week's Diamond Division winner: ";
        field_c = new int[256];
        field_d = true;
        for (var1 = 0; var1 < 256; var1++) {
          var0 = var1;
          for (var2 = 0; 8 > var2; var2++) {
            if ((var0 & 1) != 1) {
              var0 = var0 >>> 1;
            } else {
              var0 = var0 >>> 1 ^ -306674912;
            }
          }
          field_c[var1] = var0;
        }
        field_h = "Hide players in <%0>'s game";
    }
}
