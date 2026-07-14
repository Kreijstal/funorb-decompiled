/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wpa extends ge {
    static String field_K;
    static String field_J;

    final static void a(ha param0, int param1) {
        kn.field_p = param0.a(kv.field_a, rc.field_b, true);
        eda.field_f = param0.a(ds.field_n, ff.field_j, true);
        if (param1 > -66) {
          field_K = null;
          qr.field_v = param0.a(wb.field_a, ps.field_O, true);
          qf.field_j = param0.a(qp.field_r, gga.field_O, true);
          return;
        } else {
          qr.field_v = param0.a(wb.field_a, ps.field_O, true);
          qf.field_j = param0.a(qp.field_r, gga.field_O, true);
          return;
        }
    }

    final boolean z(int param0) {
        if (param0 != 0) {
            boolean discarded$0 = ((wpa) this).A(101);
            return false;
        }
        return false;
    }

    final static iu[] a(byte param0, iu param1) {
        if (param0 >= -57) {
            return null;
        }
        iu[] var3 = new iu[9];
        iu[] var2 = var3;
        var3[4] = param1;
        return var2;
    }

    final boolean C(int param0) {
        if (param0 != 128) {
            return false;
        }
        return true;
    }

    final int t(int param0) {
        if (param0 != 8) {
            field_J = null;
            return 7;
        }
        return 7;
    }

    final fsa a(boolean param0, int param1, la param2) {
        ska var5 = null;
        roa var6 = null;
        int var7 = 0;
        fsa var9 = null;
        mfa var10 = null;
        boa var11 = null;
        mfa var12 = null;
        boa var13 = null;
        mfa var14 = null;
        boa var15 = null;
        var9 = new fsa(param2, param0);
        var9.b((byte) -11, ((wpa) this).field_k, ((wpa) this).field_l);
        var9.h(param1, 0);
        var9.a((byte) 83, (nv) (Object) new eq(param2, param0));
        var5 = new ska(param2, param0);
        var6 = ci.a(0, -1);
        var6.a(91, true);
        if (((wpa) this).s((byte) 73)) {
          var7 = var6.a(true);
          if ((var7 ^ -1) >= -1) {
            var5.a(var6, (byte) 66);
            ((wpa) this).a((byte) 43, (mra) (Object) var5, param2);
            var9.a((byte) 83, (nv) (Object) var5);
            var12 = rm.field_a;
            var13 = (boa) (Object) var12.a(7, 86);
            var13.b(127, 12);
            var9.a((gr) (Object) var5, (byte) 124, (dg) (Object) var13);
            return var9;
          } else {
            var6.b(param2.q(122).a(var7, 0), false);
            var5.a(var6, (byte) 66);
            ((wpa) this).a((byte) 43, (mra) (Object) var5, param2);
            var9.a((byte) 83, (nv) (Object) var5);
            var14 = rm.field_a;
            var15 = (boa) (Object) var14.a(7, 86);
            var15.b(127, 12);
            var9.a((gr) (Object) var5, (byte) 124, (dg) (Object) var15);
            return var9;
          }
        } else {
          var5.a(var6, (byte) 66);
          ((wpa) this).a((byte) 43, (mra) (Object) var5, param2);
          var9.a((byte) 83, (nv) (Object) var5);
          var10 = rm.field_a;
          var11 = (boa) (Object) var10.a(7, 86);
          var11.b(127, 12);
          var9.a((gr) (Object) var5, (byte) 124, (dg) (Object) var11);
          return var9;
        }
    }

    public static void D(int param0) {
        if (param0 != -129) {
            return;
        }
        field_K = null;
        field_J = null;
    }

    final boolean n(byte param0) {
        if (param0 != -122) {
            return true;
        }
        return true;
    }

    final boolean A(int param0) {
        if (param0 != -1) {
            return true;
        }
        return true;
    }

    final static char a(byte param0, byte param1) {
        int var2 = 0;
        int var3 = 0;
        if (param0 == 11) {
          var2 = 255 & param1;
          if (var2 != 0) {
            if (-129 >= (var2 ^ -1)) {
              if (160 <= var2) {
                return (char)var2;
              } else {
                L0: {
                  var3 = gha.field_a[var2 - 128];
                  if (var3 == 0) {
                    var3 = 63;
                    break L0;
                  } else {
                    break L0;
                  }
                }
                var2 = var3;
                return (char)var2;
              }
            } else {
              return (char)var2;
            }
          } else {
            throw new IllegalArgumentException("" + Integer.toString(var2, 16));
          }
        } else {
          return '';
        }
    }

    final boolean B(int param0) {
        if (param0 != -23309) {
            field_K = null;
            return true;
        }
        return true;
    }

    final boolean v(int param0) {
        if (param0 != 555277520) {
            return true;
        }
        return false;
    }

    final void a(boolean param0, kh param1) {
        super.a(param0, param1);
    }

    wpa(la param0, int param1) {
        super(param0, param1);
    }

    wpa(la param0, int param1, kh param2, csa param3) {
        super(param0, param1, param2, param3);
    }

    final void q(byte param0) {
        super.q(param0);
        ((wpa) this).b(-79, 2097152, 2097152);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_K = "Failed!";
        field_J = "Room complete +<%0>, Speed bonus +<%1>";
    }
}
