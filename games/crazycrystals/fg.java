/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fg extends pd {
    static int[] field_j;
    static String field_l;
    static java.awt.Font field_i;
    private int field_h;
    private int field_k;

    final f a(boolean param0, int param1, int param2, int param3, ta param4) {
        ((fg) this).field_k = ((fg) this).field_k + 1;
        ((fg) this).field_h = ((fg) this).field_h + param3;
        if (param0) {
          ((fg) this).a((byte) 104);
          return (f) (Object) new gi(3 & q.field_a[ma.field_n[param1]].field_c[param2], bm.field_g);
        } else {
          return (f) (Object) new gi(3 & q.field_a[ma.field_n[param1]].field_c[param2], bm.field_g);
        }
    }

    final pb b(byte param0) {
        if (param0 >= -127) {
            return null;
        }
        return (pb) (Object) new rn();
    }

    final static void c(byte param0) {
        if (param0 != 95) {
            fg.c(-20);
        }
    }

    final void a(byte param0) {
        int var2 = -55 / ((29 - param0) / 42);
        tb.field_d.a(ti.field_m, 100, ((fg) this).field_k * (gi.field_m * 48), ((fg) this).field_h / ((fg) this).field_k);
        ((fg) this).field_h = 0;
        ((fg) this).field_k = 0;
    }

    public static void c(int param0) {
        field_i = null;
        field_l = null;
        field_j = null;
        int var1 = -114 % ((param0 - -30) / 53);
    }

    fg() {
        ((fg) this).field_h = 0;
        ((fg) this).field_k = 0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_j = new int[]{0, 0, 0, 0, -1, -1, -1, -1, 12, 0, 0, 12, 9, 8, 8, -1, 12, 12, 12, 12, -1, 11, 18};
        field_l = "Use this alternative as your account name";
    }
}
