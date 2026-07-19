/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class uma extends ev {
    private int field_h;
    private int field_i;
    private int field_f;
    private int field_g;

    final void a(byte param0, int param1, int param2) {
        int var4 = 85 / ((param0 - -48) / 40);
    }

    uma(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        super(param4, param5, param6);
        this.field_h = param1;
        this.field_f = param0;
        this.field_i = param3;
        this.field_g = param2;
    }

    final void b(byte param0, int param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        var4 = this.field_f * param1 >> -1343071252;
        var5 = this.field_g * param1 >> -176812788;
        if (param0 != -112) {
          this.field_h = -14;
          var6 = this.field_h * param2 >> -1881735892;
          var7 = param2 * this.field_i >> -1500447284;
          mf.a(var4, var7, param0 + 17112, var5, this.field_e, var6);
          return;
        } else {
          var6 = this.field_h * param2 >> -1881735892;
          var7 = param2 * this.field_i >> -1500447284;
          mf.a(var4, var7, param0 + 17112, var5, this.field_e, var6);
          return;
        }
    }

    final void a(int param0, byte param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        var4 = param2 * this.field_f >> 1480865772;
        var5 = param2 * this.field_g >> 1042149356;
        if (param1 != 110) {
          this.field_h = -115;
          var6 = this.field_h * param0 >> -294457268;
          var7 = param0 * this.field_i >> 2129933452;
          nt.a((byte) 11, var7, this.field_e, this.field_a, this.field_d, var5, var4, var6);
          return;
        } else {
          var6 = this.field_h * param0 >> -294457268;
          var7 = param0 * this.field_i >> 2129933452;
          nt.a((byte) 11, var7, this.field_e, this.field_a, this.field_d, var5, var4, var6);
          return;
        }
    }

    static {
    }
}
