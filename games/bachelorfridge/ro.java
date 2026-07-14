/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ro extends pp {
    static int field_j;
    private int field_i;
    private int field_l;
    static String field_k;

    final void a(aga param0, op param1, int param2) {
        wia var4 = null;
        var4 = param1.field_a[((ro) this).field_i][((ro) this).field_l];
        var4.field_d = false;
        if (param2 != 12) {
          ((ro) this).field_l = -114;
          return;
        } else {
          return;
        }
    }

    public static void a(int param0) {
        field_k = null;
        int var1 = -57 / ((-39 - param0) / 35);
    }

    final void a(lu param0, byte param1) {
        this.a(param0, (byte) 101);
        int var3 = 57 / ((34 - param1) / 58);
        param0.d(((ro) this).field_i, 0);
        param0.d(((ro) this).field_l, 0);
    }

    ro(int param0, int param1) {
        ((ro) this).field_i = param0;
        ((ro) this).field_l = param1;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_k = "ESC - cancel this line";
    }
}
