/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class oo extends bca {
    int field_r;
    static kv[] field_q;

    final int b(op param0, int param1) {
        aga var3 = null;
        var3 = ((oo) this).field_l.a(param1 ^ -94, param0);
        if (param1 == -1) {
          if ((((oo) this).field_r ^ -1) == -3) {
            return var3.field_x;
          } else {
            if (((oo) this).field_r == 4) {
              return -1 + (param0.field_z - var3.field_x);
            } else {
              if (1 == ((oo) this).field_r) {
                return var3.field_J;
              } else {
                if (((oo) this).field_r == 3) {
                  return -1 + (param0.field_B + -var3.field_J);
                } else {
                  throw new IllegalStateException();
                }
              }
            }
          }
        } else {
          return 58;
        }
    }

    final static hs a(int param0, byte param1, byte[] param2, int param3) {
        int var7 = 0;
        cda var8 = null;
        int var9 = 0;
        int var10 = BachelorFridge.field_y;
        lu var11 = new lu(param2);
        int var5 = var11.e((byte) 83);
        cda[] var6 = new cda[var11.e((byte) 66)];
        for (var7 = 0; var6.length > var7; var7++) {
            var8 = new cda();
            var8.field_a = var11.e((byte) 66);
            for (var9 = 0; var9 < 11; var9++) {
                var8.field_b[var9].field_h = var11.c((byte) -85);
                var8.field_b[var9].field_l = var11.c((byte) -85);
                var8.field_b[var9].field_d = var11.c((byte) -85);
                var8.field_b[var9].field_e = var11.c((byte) -85);
                var8.field_b[var9].field_j = var11.f(52);
            }
            var6[var7] = var8;
        }
        if (param1 != -77) {
            field_q = null;
        }
        return new hs(param3, param0, var6, var5);
    }

    final at a(int param0, gj param1) {
        if (param0 != 5) {
            field_q = null;
        }
        return (at) (Object) new nm(param1, (oo) this);
    }

    oo(lu param0) {
        super(param0);
        ((oo) this).field_k = param0.e((byte) 79);
        ((oo) this).field_o = new eaa();
        int var2 = param0.b(16711935);
        while (true) {
            var2--;
            if (0 > var2) {
                break;
            }
            ((oo) this).field_o.a((bw) (Object) dca.a((byte) 102, param0), true);
        }
        ((oo) this).field_r = param0.b(16711935);
    }

    oo(int param0, nq param1, int param2) {
        super(param0, param1);
        ((oo) this).field_r = param2;
    }

    final void a(byte param0, lu param1) {
        this.a((byte) -118, param1);
        param1.d(((oo) this).field_r, 0);
        if (param0 >= -12) {
            field_q = null;
        }
    }

    public static void d(byte param0) {
        field_q = null;
        int var1 = 102 / ((param0 - -22) / 53);
    }

    final void a(op param0, int param1) {
        ((oo) this).a(param0, (byte) -2);
        ((oo) this).field_l.a(79, param0).a(false, ((oo) this).b(param0, -1), ((oo) this).field_r);
        int var3 = 118 / ((param1 - 12) / 35);
    }

    static {
    }
}
