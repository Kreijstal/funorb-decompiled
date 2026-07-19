/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class ib extends ij {
    static String field_m;
    int field_n;
    static int[] field_l;

    public static void g(int param0) {
        field_l = null;
        if (param0 != 31438) {
            field_l = (int[]) null;
            field_m = null;
            return;
        }
        field_m = null;
    }

    final static void e(int param0) {
        sc var1 = null;
        int var2 = 0;
        md var3 = null;
        var1 = (sc) ((Object) hd.field_c.g(32073));
        var2 = -21 / ((param0 - 61) / 40);
        if (var1 == null) {
          jj.a(4);
          return;
        } else {
          var3 = kd.field_n;
          var1.field_j = new int[]{var3.b((byte) -98), var3.b((byte) 126), var3.b((byte) 126), var3.b((byte) 14)};
          var1.a(false);
          return;
        }
    }

    abstract Object f(int param0);

    abstract boolean h(int param0);

    ib(int param0) {
        this.field_n = param0;
    }

    static {
        field_m = "Unfortunately your configuration doesn't support fullscreen mode.";
    }
}
