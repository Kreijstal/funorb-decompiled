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
        o discarded$10 = null;
        if (param0 == 256) {
          if (!this.field_m) {
            if (this.field_B.field_h < this.field_B.field_g.length + -this.field_z) {
              throw new RuntimeException();
            } else {
              return this.field_B.field_g;
            }
          } else {
            throw new RuntimeException();
          }
        } else {
          discarded$10 = pj.a(-53, (byte) -56, 97, -54, -113);
          if (!this.field_m) {
            if (this.field_B.field_h < this.field_B.field_g.length + -this.field_z) {
              throw new RuntimeException();
            } else {
              return this.field_B.field_g;
            }
          } else {
            throw new RuntimeException();
          }
        }
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
        if (!(this.field_B != null)) {
            return 0;
        }
        return this.field_B.field_h * 100 / (-this.field_z + this.field_B.field_g.length);
    }

    final static o a(int param0, byte param1, int param2, int param3, int param4) {
        o var5 = null;
        int var6 = 0;
        int var7 = 0;
        int stackIn_4_0 = 0;
        int stackIn_4_1 = 0;
        int stackIn_5_0 = 0;
        int stackIn_5_1 = 0;
        int stackOut_3_0 = 0;
        int stackOut_3_1 = 0;
        var7 = Transmogrify.field_A ? 1 : 0;
        var5 = (o) ((Object) mh.field_a.a((byte) -95));
        L0: while (true) {
          if (var5 != null) {
            stackOut_3_0 = param0 ^ -1;
            stackOut_3_1 = var5.field_j ^ -1;
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (var7 == 0) {
              if (stackIn_5_0 == stackIn_5_1) {
                return var5;
              } else {
                var5 = (o) ((Object) mh.field_a.a(true));
                continue L0;
              }
            } else {
              var6 = stackIn_4_0 / stackIn_4_1;
              var5.field_n = param4;
              var5.field_j = param0;
              var5.field_h = param3;
              mh.field_a.a(var5, -84);
              nk.a(param2, var5, -31995);
              return var5;
            }
          } else {
            var5 = new o();
            var6 = -119 / ((32 - param1) / 36);
            var5.field_n = param4;
            var5.field_j = param0;
            var5.field_h = param3;
            mh.field_a.a(var5, -84);
            nk.a(param2, var5, -31995);
            return var5;
          }
        }
    }

    pj() {
    }

    static {
        int var0 = 0;
        field_w = new hi();
        field_A = new qj();
        field_x = new int[256];
        for (var0 = 0; -257 < (var0 ^ -1); var0++) {
            field_x[var0] = vg.c(var0 * 143, -2063532288) << -838567096;
            field_x[var0] = cl.b(field_x[var0], vg.c(65280, 191 * var0));
            field_x[var0] = cl.b(field_x[var0], var0);
        }
    }
}
