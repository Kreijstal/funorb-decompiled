/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class h extends qm {
    static String field_O;
    static ge field_N;
    static int[] field_Y;
    static String field_U;
    static String field_S;
    static int[][] field_Z;
    static tg field_X;
    static int field_T;
    static boolean field_R;
    static tf[] field_V;
    static boolean[] field_P;
    static int field_Q;
    static int field_W;

    h(String param0, fn param1, boolean param2) {
        this(param0, param1);
        ((h) this).field_M = param2 ? true : false;
    }

    private h(String param0, fn param1) {
        this(param0, field_X.field_r, param1);
        ((h) this).field_y = field_X.field_t;
    }

    private h(String param0, eb param1, fn param2) {
        super(param0, param1, param2);
        ((h) this).field_y = field_X.field_t;
    }

    final void a(boolean param0, int param1, int param2, int param3) {
        ((h) this).field_M = !((h) this).field_M ? true : false;
        super.a(param0, param1, param2, param3);
    }

    final static void a(int param0, tf param1) {
        ti.a(false);
        t.a(param1.field_G, param1.field_A, param1.field_B);
        if (param0 >= -58) {
            field_V = null;
        }
    }

    final static io[] a(byte param0) {
        Object var2 = null;
        if (param0 != -8) {
          var2 = null;
          h.a(-96, (tf) null);
          return new io[]{ig.field_e, vm.field_a, cd.field_c};
        } else {
          return new io[]{ig.field_e, vm.field_a, cd.field_c};
        }
    }

    public static void a(int param0) {
        field_U = null;
        field_P = null;
        field_S = null;
        if (param0 < 43) {
          return;
        } else {
          field_N = null;
          field_X = null;
          field_V = null;
          field_Z = null;
          field_Y = null;
          field_O = null;
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_Y = new int[8192];
        field_O = "Single-Player";
        field_S = "Join";
        field_N = new ge();
        field_P = new boolean[64];
        field_Q = -1;
    }
}
