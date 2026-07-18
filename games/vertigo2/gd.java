/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gd extends jq {
    private int field_h;
    private int field_n;
    private int field_m;
    private int field_t;
    private int field_i;
    private int field_p;
    private int field_q;
    static tj field_l;
    private int field_o;
    static int[] field_s;
    static int field_k;
    static uh field_j;
    static boolean field_r;

    final static void a(int param0, boolean param1) {
        if (null != rc.field_d) {
            rc.field_d.b(param1, 0);
            return;
        }
    }

    public static void a(boolean param0) {
        field_j = null;
        field_l = null;
        field_s = null;
    }

    final void b(int param0, byte param1, int param2) {
        if (param1 <= 26) {
            ((gd) this).field_i = -11;
        }
    }

    final void a(int param0, int param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        var4 = param1 * ((gd) this).field_q >> 12;
        var5 = ((gd) this).field_t * param0 >> 12;
        if (param2 != 45) {
          return;
        } else {
          var6 = param1 * ((gd) this).field_p >> 12;
          var7 = param0 * ((gd) this).field_o >> 12;
          var8 = ((gd) this).field_i * param1 >> 12;
          var9 = ((gd) this).field_h * param0 >> 12;
          var10 = ((gd) this).field_m * param1 >> 12;
          var11 = ((gd) this).field_n * param0 >> 12;
          hi.a(var9, -35, var8, var10, var11, var7, var5, var4, var6, ((gd) this).field_a);
          return;
        }
    }

    final void a(int param0, byte param1, int param2) {
        if (param1 >= -31) {
            ((gd) this).a(21, (byte) 23, -88);
        }
    }

    gd(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9) {
        super(-1, param8, param9);
        ((gd) this).field_p = param2;
        ((gd) this).field_o = param3;
        ((gd) this).field_i = param4;
        ((gd) this).field_n = param7;
        ((gd) this).field_h = param5;
        ((gd) this).field_t = param1;
        ((gd) this).field_m = param6;
        ((gd) this).field_q = param0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_l = new tj();
    }
}
