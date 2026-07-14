/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lp {
    static int[] field_c;
    static int[][] field_a;
    static ru[] field_b;

    final static int a(String param0, boolean param1, boolean param2) {
        if (!param2) {
          if (!param1) {
            return ej.field_G.a(param0);
          } else {
            return uk.field_s.a(param0);
          }
        } else {
          field_b = null;
          if (!param1) {
            return ej.field_G.a(param0);
          } else {
            return uk.field_s.a(param0);
          }
        }
    }

    public static void a(int param0) {
        if (param0 != 13094936) {
            return;
        }
        field_b = null;
        field_c = null;
        field_a = null;
    }

    final static je b(int param0) {
        if (param0 > -122) {
            field_a = null;
            return sc.field_g.field_Nb;
        }
        return sc.field_g.field_Nb;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = new int[]{2718708, 13182994, 7325724, 13094936, 16351443, 39065, 11545598, 14322432};
        field_a = new int[][]{new int[4], new int[0]};
    }
}
