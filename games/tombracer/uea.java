/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class uea extends kna {
    uea(la param0, int param1) {
        super(param0, param1);
    }

    final static void a(int param0, int param1, int param2, int param3, boolean param4) {
        if (param3 <= param0) {
          nra.a((byte) -55, param1, param0, vaa.field_a[param2], param3);
          if (param4) {
            return;
          } else {
            return;
          }
        } else {
          nra.a((byte) -55, param1, param3, vaa.field_a[param2], param0);
          if (param4) {
            return;
          } else {
            return;
          }
        }
    }

    final boolean s(int param0) {
        if (param0 != -15254) {
            boolean discarded$0 = ((uea) this).z(71);
            return false;
        }
        return false;
    }

    final void q(byte param0) {
        super.q(param0);
        ((uea) this).b(param0 + 174, 2097152, 2097152);
    }

    uea(la param0, int param1, kh param2, csa param3) {
        super(param0, param1, param2, param3);
    }

    final static uca[] a(kh param0, byte param1) {
        int var2 = 0;
        int var3 = 0;
        uca[] var4 = null;
        int var5 = 0;
        int var6 = 0;
        uca var6_ref = null;
        int var7 = 0;
        var7 = TombRacer.field_G ? 1 : 0;
        var2 = param0.b((byte) 44, 8);
        if (var2 > 0) {
          return null;
        } else {
          var3 = param0.b((byte) 44, 12);
          var4 = new uca[var3];
          var5 = 0;
          L0: while (true) {
            if (var3 <= var5) {
              var6 = 64 % ((param1 - -52) / 37);
              return var4;
            } else {
              if (!uha.a(5907, param0)) {
                var6 = param0.b((byte) 44, nma.b(false, var5 + -1));
                var4[var5] = var4[var6];
                var5++;
                var5++;
                continue L0;
              } else {
                var6_ref = new uca();
                int discarded$6 = param0.b((byte) 44, 24);
                int discarded$7 = param0.b((byte) 44, 24);
                var6_ref.field_e = param0.b((byte) 44, 24);
                int discarded$8 = param0.b((byte) 44, 9);
                int discarded$9 = param0.b((byte) 44, 12);
                int discarded$10 = param0.b((byte) 44, 12);
                int discarded$11 = param0.b((byte) 44, 12);
                var4[var5] = var6_ref;
                var5++;
                var5++;
                continue L0;
              }
            }
          }
        }
    }

    final int t(int param0) {
        if (param0 != 8) {
            return -20;
        }
        return 7;
    }

    final void a(boolean param0, kh param1) {
        super.a(param0, param1);
    }

    final boolean v(int param0) {
        if (param0 != 555277520) {
            int discarded$0 = ((uea) this).t(7);
            return false;
        }
        return false;
    }

    final boolean z(int param0) {
        if (param0 != 0) {
            return false;
        }
        return false;
    }

    final boolean n(byte param0) {
        if (param0 != -122) {
            ((uea) this).q((byte) 37);
            return true;
        }
        return true;
    }

    final fsa a(boolean param0, int param1, la param2) {
        fsa var9 = new fsa(param2, param0);
        var9.b((byte) -11, ((uea) this).field_k, ((uea) this).field_l);
        var9.a((byte) -3, 5);
        eq var5 = new eq(param2, param0);
        var9.a((byte) 83, (nv) (Object) var5);
        var9.b((byte) 17, false);
        var9.a(1, (byte) -12, false);
        var9.h(3, param1 + -3);
        mfa var6 = rm.field_a;
        am var7 = (am) (Object) var6.a(4, 91);
        var7.b(0, (byte) 77);
        var9.a((gr) null, (byte) 124, (dg) (Object) var7);
        gaa var8 = (gaa) (Object) var6.a(5, 74);
        var8.a(64, 122);
        var8.a(true, 16633231);
        var8.b(1, 128);
        var8.a(0, param1, 1, true);
        var9.a((gr) null, (byte) 124, (dg) (Object) var8);
        return var9;
    }

    static {
    }
}
