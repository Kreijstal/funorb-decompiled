/*
 * Decompiled by CFR-JS 0.4.0.
 */
class haa extends rj {
    static nh field_z;
    static jpa field_A;
    private ae field_B;
    static int[][] field_C;

    final boolean a(ae param0, boolean param1) {
        if (param1) {
            ((haa) this).field_B = null;
            return ((haa) this).field_B.a(param0, false);
        }
        return ((haa) this).field_B.a(param0, false);
    }

    haa(ae param0) {
        ((haa) this).field_B = param0;
    }

    public static void b(int param0) {
        if (param0 <= 37) {
          field_A = null;
          field_C = null;
          field_A = null;
          field_z = null;
          return;
        } else {
          field_C = null;
          field_A = null;
          field_z = null;
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_C = new int[][]{new int[4], new int[2]};
    }
}
