/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class uma extends ev {
    private int field_h;
    private int field_i;
    private int field_f;
    private int field_g;

    final void a(byte param0, int param1, int param2) {
        int var4 = 85 / ((param0 + 48) / 40);
    }

    uma(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        super(param4, param5, param6);
        this.field_h = param1;
        this.field_f = param0;
        this.field_i = param3;
        this.field_g = param2;
    }

    final void b(byte param0, int param1, int param2) {
        int var6 = 0;
        int var7 = 0;
        int var4 = this.field_f * param1 >> 12;
        int var5 = this.field_g * param1 >> 12;
        int var6Lifetime1;
        int var7Lifetime1;
        if (param0 == -112) {
          var6 = this.field_h * param2 >> 12;
          var7 = param2 * this.field_i >> 12;
          mf.a(var4, var7, param0 + 17112, var5, this.field_e, var6);
          return;
        }
        this.field_h = -14;
        var6Lifetime1 = this.field_h * param2 >> 12;
        var7Lifetime1 = param2 * this.field_i >> 12;
        mf.a(var4, var7Lifetime1, param0 + 17112, var5, this.field_e, var6Lifetime1);
    }

    final void a(int param0, byte param1, int param2) {
        int var6 = 0;
        int var7 = 0;
        int var4 = param2 * this.field_f >> 12;
        int var5 = param2 * this.field_g >> 12;
        int var6Lifetime1;
        int var7Lifetime1;
        if (param1 == 110) {
          var6 = this.field_h * param0 >> 12;
          var7 = param0 * this.field_i >> 12;
          nt.a((byte) 11, var7, this.field_e, this.field_a, this.field_d, var5, var4, var6);
          return;
        }
        this.field_h = -115;
        var6Lifetime1 = this.field_h * param0 >> 12;
        var7Lifetime1 = param0 * this.field_i >> 12;
        nt.a((byte) 11, var7Lifetime1, this.field_e, this.field_a, this.field_d, var5, var4, var6Lifetime1);
    }

    static {
    }
}
