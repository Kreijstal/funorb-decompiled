/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ua {
    static String field_b;
    static int[] field_a;

    public static void a(int param0) {
        field_a = null;
        if (param0 != -20441) {
            ua.a(-73);
            field_b = null;
            return;
        }
        field_b = null;
    }

    final static tj a(byte param0, byte[] param1) {
        tj var2 = null;
        if (param1 != null) {
          var2 = new tj(param1, sl.field_d, bo.field_o, bn.field_c, uf.field_n, j.field_a, vj.field_m);
          no.f((byte) -54);
          if (param0 >= -126) {
            ua.a(18);
            return var2;
          } else {
            return var2;
          }
        } else {
          return null;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "Menu";
        field_a = new int[]{19, 7};
    }
}
