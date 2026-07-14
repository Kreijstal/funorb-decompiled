/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fe extends vo {
    private int field_g;
    static long field_h;
    private int field_m;
    private int field_l;
    private int field_i;
    static kv field_j;
    static int field_k;

    final void a(byte param0, int param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        if (param0 > -70) {
          ((fe) this).a((byte) -76, -16, 37);
          var4 = ((fe) this).field_g * param2 >> 1682790508;
          var5 = param2 * ((fe) this).field_l >> 1522059308;
          var6 = ((fe) this).field_i * param1 >> -147048468;
          var7 = param1 * ((fe) this).field_m >> 635656940;
          rv.a(((fe) this).field_e, ((fe) this).field_f, var7, -120, var5, var6, ((fe) this).field_a, var4);
          return;
        } else {
          var4 = ((fe) this).field_g * param2 >> 1682790508;
          var5 = param2 * ((fe) this).field_l >> 1522059308;
          var6 = ((fe) this).field_i * param1 >> -147048468;
          var7 = param1 * ((fe) this).field_m >> 635656940;
          rv.a(((fe) this).field_e, ((fe) this).field_f, var7, -120, var5, var6, ((fe) this).field_a, var4);
          return;
        }
    }

    final void b(int param0, int param1, int param2) {
        int var4 = param0 * ((fe) this).field_g >> -759166932;
        int var5 = param0 * ((fe) this).field_l >> -533837780;
        int var6 = ((fe) this).field_i * param2 >> -35961972;
        int var7 = -30 % ((param1 - 14) / 62);
        int var8 = ((fe) this).field_m * param2 >> 816144492;
        fc.a(var8, var5, (byte) 92, var6, var4, ((fe) this).field_a);
    }

    public static void a(int param0) {
        field_j = null;
        int var1 = -49 / ((param0 - -57) / 54);
    }

    fe(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        super(param4, param5, param6);
        ((fe) this).field_l = param2;
        ((fe) this).field_g = param0;
        ((fe) this).field_i = param1;
        ((fe) this).field_m = param3;
    }

    final void a(int param0, int param1, int param2) {
        if (param1 != -25222) {
            ((fe) this).a((byte) -119, 44, -29);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_h = 20000000L;
    }
}
