/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hc extends rra {
    private int field_j;
    static int field_h;
    private int field_i;
    private int field_g;
    private int field_f;

    final void a(int param0, int param1, int param2) {
        int var4 = 86 / ((param1 - 55) / 37);
    }

    final void a(byte param0, int param1, int param2) {
        if (param0 >= -117) {
            field_h = -1;
        }
    }

    hc(int param0, int param1, int param2, int param3, int param4, int param5) {
        super(-1, param4, param5);
        ((hc) this).field_j = param3;
        ((hc) this).field_i = param0;
        ((hc) this).field_f = param2;
        ((hc) this).field_g = param1;
    }

    final void a(int param0, int param1, boolean param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        var4 = ((hc) this).field_i * param0 >> -432891284;
        var5 = ((hc) this).field_f * param0 >> 2107257548;
        var6 = param1 * ((hc) this).field_g >> -1386539956;
        var7 = param1 * ((hc) this).field_j >> 1315183084;
        ik.a(var5, var4, -49, ((hc) this).field_b, var7, var6);
        if (!param2) {
          field_h = 68;
          return;
        } else {
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_h = 100;
    }
}
