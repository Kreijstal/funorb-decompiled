/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kb {
    static aa field_e;
    static uf field_d;
    static jj field_a;
    static boolean[] field_f;
    static int field_b;
    static String field_c;

    final static void a(boolean param0, int param1, int param2) {
        if (!param0) {
          if (uh.field_b[param2] != null) {
            if (!uh.field_b[param2].b(10000536)) {
              return;
            } else {
              fe.a(uh.field_b[param2], 2);
              li discarded$4 = da.a(va.field_d[param1], nd.field_G[param1], (byte) -116);
              return;
            }
          } else {
            return;
          }
        } else {
          kb.a(true, -128, -84);
          if (uh.field_b[param2] != null) {
            if (!uh.field_b[param2].b(10000536)) {
              return;
            } else {
              fe.a(uh.field_b[param2], 2);
              li discarded$5 = da.a(va.field_d[param1], nd.field_G[param1], (byte) -116);
              return;
            }
          } else {
            return;
          }
        }
    }

    public static void a(int param0) {
        field_f = null;
        field_e = null;
        field_a = null;
        field_d = null;
        field_c = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = new aa(14, 0, 4, 1);
        field_f = new boolean[64];
        field_c = "Not yet achieved";
    }
}
