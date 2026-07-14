/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class oma extends kna {
    private int field_F;
    static int field_H;
    static cn field_G;
    static int[] field_I;

    final boolean v(int param0) {
        if (param0 != 555277520) {
            boolean discarded$0 = ((oma) this).v(40);
            return true;
        }
        return true;
    }

    oma(la param0, int param1, kh param2, csa param3) {
        super(param0, param1, param2, param3);
        if (param0.field_E >= 21) {
            ((oma) this).field_F = param2.b((byte) 44, 2);
        }
    }

    final void q(byte param0) {
        super.q(param0);
    }

    final void a(boolean param0, kh param1) {
        super.a(param0, param1);
        param1.a((byte) 24, ((oma) this).field_F, 2);
    }

    final int t(int param0) {
        if (param0 != 8) {
            oma.r((byte) 9);
            return 4;
        }
        return 4;
    }

    final boolean z(int param0) {
        if (param0 != 0) {
            field_H = 119;
            return false;
        }
        return false;
    }

    public static void r(byte param0) {
        if (param0 <= 24) {
            field_G = null;
            field_I = null;
            field_G = null;
            return;
        }
        field_I = null;
        field_G = null;
    }

    oma(la param0, int param1) {
        super(param0, param1);
    }

    final boolean s(int param0) {
        if (param0 != -15254) {
            return false;
        }
        return false;
    }

    final void a(int param0, boolean param1) {
        super.a(param0, param1);
        int var3 = ((oma) this).field_j;
        int var4 = ((oma) this).field_p;
        int var5 = var3 + -(((oma) this).field_l / 2);
        int var6 = -(((oma) this).field_k / 2) + var4;
        int var7 = ((oma) this).field_l / 2 + var3;
        if (!(var5 > param0)) {
            var5 = 0;
        }
        if (!(param0 < var6)) {
            var6 = 0;
        }
        int var8 = var4 + ((oma) this).field_k / 2;
        int var9 = ((oma) this).field_o.m((byte) -86);
        if (!(var9 + -param0 > var7)) {
            var7 = var9;
        }
        int var10 = ((oma) this).field_o.s(-104);
        var3 = (-var5 + var7) / 2 + var5;
        if (var10 + -param0 <= var8) {
            var8 = var10;
        }
        var4 = (var8 + -var6) / 2 + var6;
        ((oma) this).field_l = -var5 + var7;
        ((oma) this).field_k = -var6 + var8;
        ((oma) this).field_j = var3;
        ((oma) this).field_p = var4;
    }

    final boolean n(byte param0) {
        if (param0 != -122) {
            field_H = -47;
            return false;
        }
        return false;
    }

    final fsa a(boolean param0, int param1, la param2) {
        mo var5 = null;
        int var8 = 0;
        fsa var9 = null;
        mfa var10 = null;
        kva var11 = null;
        mfa var12 = null;
        kva var13 = null;
        var9 = new fsa(param2, param0);
        var9.b((byte) -11, ((oma) this).field_k, ((oma) this).field_l);
        var5 = new mo(param2, param0);
        if (param1 == 3) {
          var9.a((byte) 83, (nv) (Object) var5);
          var12 = rm.field_a;
          var13 = (kva) (Object) var12.a(10, 111);
          var8 = ((oma) this).field_F;
          if (0 != var8) {
            if (-2 != (var8 ^ -1)) {
              var13.b(2097152, 0);
              var5.a(16, false);
              var9.a((gr) (Object) var5, (byte) 124, (dg) (Object) var13);
              return var9;
            } else {
              var13.b(param1 + 2097149, 1);
              var5.a(16, true);
              var9.a((gr) (Object) var5, (byte) 124, (dg) (Object) var13);
              return var9;
            }
          } else {
            var13.b(2097152, 0);
            var5.a(16, false);
            var9.a((gr) (Object) var5, (byte) 124, (dg) (Object) var13);
            return var9;
          }
        } else {
          boolean discarded$1 = ((oma) this).s(48);
          var9.a((byte) 83, (nv) (Object) var5);
          var10 = rm.field_a;
          var11 = (kva) (Object) var10.a(10, 111);
          var8 = ((oma) this).field_F;
          if (0 != var8) {
            if (-2 != (var8 ^ -1)) {
              var11.b(2097152, 0);
              var5.a(16, false);
              var9.a((gr) (Object) var5, (byte) 124, (dg) (Object) var11);
              return var9;
            } else {
              var11.b(param1 + 2097149, 1);
              var5.a(16, true);
              var9.a((gr) (Object) var5, (byte) 124, (dg) (Object) var11);
              return var9;
            }
          } else {
            var11.b(2097152, 0);
            var5.a(16, false);
            var9.a((gr) (Object) var5, (byte) 124, (dg) (Object) var11);
            return var9;
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_H = 0;
        field_I = new int[2];
    }
}
