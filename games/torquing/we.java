/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class we extends kj {
    private int field_g;
    private int field_j;
    private int field_k;
    static int field_h;
    private int field_i;

    final static void a(int param0, int param1, int param2, int param3, int param4) {
        if (kn.field_e <= param0 &&
          param0 <= qg.field_z) {
          param4 = ln.a(qk.field_p, j.field_q, param4, param3 ^ -2574);
          param1 = ln.a(qk.field_p, j.field_q, param1, param3 ^ -2613);
          wa.a(param2, param0, true, param1, param4);
        }
        if (param3 == -2686) {
          return;
        }
        we.a(-97, -73, -88, -22, -89);
    }

    we(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        super(param4, param5, param6);
        this.field_i = param1;
        this.field_j = param3;
        this.field_g = param0;
        this.field_k = param2;
    }

    final void a(byte param0, int param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var4Lifetime1;
        int var5Lifetime1;
        int var6Lifetime1;
        int var7Lifetime1;
        if (param0 > 7) {
          var4 = param2 * this.field_g >> 12;
          var5 = this.field_k * param2 >> 12;
          var6 = this.field_i * param1 >> 12;
          var7 = this.field_j * param1 >> 12;
          wo.a(120, var4, var7, var6, var5, this.field_a);
          return;
        }
        this.field_j = 39;
        var4Lifetime1 = param2 * this.field_g >> 12;
        var5Lifetime1 = this.field_k * param2 >> 12;
        var6Lifetime1 = this.field_i * param1 >> 12;
        var7Lifetime1 = this.field_j * param1 >> 12;
        wo.a(120, var4Lifetime1, var7Lifetime1, var6Lifetime1, var5Lifetime1, this.field_a);
    }

    final void a(int param0, int param1, byte param2) {
        if (param2 != 106) {
          this.a((byte) -128, 112, -7);
        }
    }

    final void a(int param0, int param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var4Lifetime1;
        int var5Lifetime1;
        int var6Lifetime1;
        int var7Lifetime1;
        if (param2 < -101) {
          var4 = param0 * this.field_g >> 12;
          var5 = this.field_k * param0 >> 12;
          var6 = param1 * this.field_i >> 12;
          var7 = param1 * this.field_j >> 12;
          wd.a(this.field_c, this.field_e, var4, var7, true, var5, this.field_a, var6);
          return;
        }
        we.a(98, 26, 121, -55, -62);
        var4Lifetime1 = param0 * this.field_g >> 12;
        var5Lifetime1 = this.field_k * param0 >> 12;
        var6Lifetime1 = param1 * this.field_i >> 12;
        var7Lifetime1 = param1 * this.field_j >> 12;
        wd.a(this.field_c, this.field_e, var4Lifetime1, var7Lifetime1, true, var5Lifetime1, this.field_a, var6Lifetime1);
    }

    static {
    }
}
