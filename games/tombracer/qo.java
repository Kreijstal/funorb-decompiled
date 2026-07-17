/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qo extends rra {
    static String field_i;
    private int field_h;
    private int field_g;
    private int field_f;
    static int[] field_k;
    private int field_j;

    final void a(int param0, int param1, boolean param2) {
        if (!param2) {
            ((qo) this).a((byte) -38, 20, 78);
        }
    }

    final void a(byte param0, int param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        var4 = ((qo) this).field_h * param1 >> 12;
        var5 = param1 * ((qo) this).field_g >> 12;
        var6 = param2 * ((qo) this).field_j >> 12;
        if (param0 > -117) {
          return;
        } else {
          var7 = param2 * ((qo) this).field_f >> 12;
          rra.a(var4, ((qo) this).field_c, var6, var7, 0, var5, ((qo) this).field_b, ((qo) this).field_d);
          return;
        }
    }

    final void a(int param0, int param1, int param2) {
        int var4 = ((qo) this).field_h * param2 >> 12;
        int var7 = 30 % ((55 - param1) / 37);
        int var5 = param2 * ((qo) this).field_g >> 12;
        int var6 = ((qo) this).field_j * param0 >> 12;
        int var8 = ((qo) this).field_f * param0 >> 12;
        be.a(var4, ((qo) this).field_c, (byte) 71, var8, var5, var6);
    }

    qo(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        super(param4, param5, param6);
        ((qo) this).field_h = param0;
        ((qo) this).field_f = param3;
        ((qo) this).field_g = param2;
        ((qo) this).field_j = param1;
    }

    public static void b(boolean param0) {
        field_i = null;
        field_k = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_k = new int[1000];
        field_i = "Average rating";
    }
}
