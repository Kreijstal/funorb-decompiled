/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pj extends rh {
    int field_C;
    static hi field_w;
    oa field_B;
    static int field_y;
    byte field_z;
    static qj field_A;
    static int[] field_x;

    final byte[] e(int param0) {
        if (param0 != 256) {
          pj.a(-53, (byte) -56, 97, -54, -113);
          if (this.field_m) {
            throw new RuntimeException();
          }
          if (this.field_B.field_h >= this.field_B.field_g.length - this.field_z) {
            return this.field_B.field_g;
          }
          throw new RuntimeException();
        }
        if (this.field_m) {
          throw new RuntimeException();
        }
        if (this.field_B.field_h >= this.field_B.field_g.length - this.field_z) {
          return this.field_B.field_g;
        }
        throw new RuntimeException();
    }

    public static void g(int param0) {
        field_x = null;
        if (param0 <= 121) {
          pj.g(-12);
          field_w = null;
          field_A = null;
          return;
        }
        field_w = null;
        field_A = null;
    }

    final int f(int param0) {
        if (param0 != 0) {
          return 39;
        }
        if (this.field_B == null) {
          return 0;
        }
        return this.field_B.field_h * 100 / (-this.field_z + this.field_B.field_g.length);
    }

    final static o a(int param0, byte param1, int param2, int param3, int param4) {
        o var5;
        int var6;
        int var7;
        o var5Lifetime1;
        var7 = Transmogrify.field_A ? 1 : 0;
        var5 = (o) (mh.field_a.a((byte) -95));
        while (var5 != null) {
          if (~param0 == ~var5.field_j) {
            return var5;
          }
          var5 = (o) (mh.field_a.a(true));
        }
        var5Lifetime1 = new o();
        var6 = -119 / ((32 - param1) / 36);
        var5Lifetime1.field_n = param4;
        var5Lifetime1.field_j = param0;
        var5Lifetime1.field_h = param3;
        mh.field_a.a(var5Lifetime1, -84);
        nk.a(param2, var5Lifetime1, -31995);
        return var5Lifetime1;
    }

    pj() {
    }

    static {
        int var0 = 0;
        field_w = new hi();
        field_A = new qj();
        field_x = new int[256];
        for (var0 = 0; var0 < 256; var0++) {
          field_x[var0] = vg.c(var0 * 143, -2063532288) << 8;
          field_x[var0] = cl.b(field_x[var0], vg.c(65280, 191 * var0));
          field_x[var0] = cl.b(field_x[var0], var0);
        }
    }
}
