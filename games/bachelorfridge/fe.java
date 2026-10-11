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
        int var4Lifetime1;
        int var5Lifetime1;
        int var6Lifetime1;
        int var7Lifetime1;
        if (param0 <= -70) {
          var4 = this.field_g * param2 >> 12;
          var5 = param2 * this.field_l >> 12;
          var6 = this.field_i * param1 >> 12;
          var7 = param1 * this.field_m >> 12;
          rv.a(this.field_e, this.field_f, var7, -120, var5, var6, this.field_a, var4);
          return;
        }
        this.a((byte) -76, -16, 37);
        var4Lifetime1 = this.field_g * param2 >> 12;
        var5Lifetime1 = param2 * this.field_l >> 12;
        var6Lifetime1 = this.field_i * param1 >> 12;
        var7Lifetime1 = param1 * this.field_m >> 12;
        rv.a(this.field_e, this.field_f, var7Lifetime1, -120, var5Lifetime1, var6Lifetime1, this.field_a, var4Lifetime1);
    }

    final void b(int param0, int param1, int param2) {
        int var4 = param0 * this.field_g >> 12;
        int var5 = param0 * this.field_l >> 12;
        int var6 = this.field_i * param2 >> 12;
        int var7 = -30 % ((param1 - 14) / 62);
        int var8 = this.field_m * param2 >> 12;
        fc.a(var8, var5, (byte) 92, var6, var4, this.field_a);
    }

    public static void a(int param0) {
        field_j = null;
        int var1 = -49 / ((param0 + 57) / 54);
    }

    fe(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        super(param4, param5, param6);
        this.field_l = param2;
        this.field_g = param0;
        this.field_i = param1;
        this.field_m = param3;
    }

    final void a(int param0, int param1, int param2) {
        if (param1 != -25222) {
          this.a((byte) -119, 44, -29);
        }
    }

    static {
        field_h = 20000000L;
    }
}
