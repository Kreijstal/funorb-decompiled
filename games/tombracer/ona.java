/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ona extends kna {
    static int field_H;
    private int field_G;
    static String field_F;
    static String field_I;

    public static void A(int param0) {
        field_I = null;
        if (param0 != 7) {
            ona.A(-16);
            field_F = null;
            return;
        }
        field_F = null;
    }

    final fsa a(boolean param0, int param1, la param2) {
        ri var5 = null;
        int var6 = 0;
        int var7 = 0;
        fsa var9 = null;
        mfa var10 = null;
        nq var11 = null;
        mfa var12 = null;
        nq var13 = null;
        mfa var14 = null;
        nq var15 = null;
        var9 = new fsa(param2, param0);
        var9.b((byte) -11, ((ona) this).field_k, ((ona) this).field_l);
        var9.h(param1, param1 + -3);
        var9.a(1, (byte) -12, true);
        var9.a((byte) -3, 6);
        var9.b((byte) 17, false);
        var9.g(param1 ^ 126, 2);
        var9.a((byte) 83, (nv) (Object) new eq(param2, param0));
        var5 = new ri(param2, param0);
        var5.a((byte) -35, 8 * ((ona) this).field_G);
        var6 = 2048;
        var7 = ((ona) this).r(12);
        if ((var7 ^ -1) != -32) {
          if (32 != var7) {
            var9.a((wda) (Object) var5, 0);
            var10 = rm.field_a;
            var11 = (nq) (Object) var10.a(16, param1 ^ 107);
            var11.b(param1 ^ 8021, 2);
            var9.a((gr) (Object) var5, (byte) 124, (dg) (Object) var11);
            return var9;
          } else {
            var5.a(true, var6 * 2);
            var9.a((wda) (Object) var5, 0);
            var14 = rm.field_a;
            var15 = (nq) (Object) var14.a(16, param1 ^ 107);
            var15.b(param1 ^ 8021, 2);
            var9.a((gr) (Object) var5, (byte) 124, (dg) (Object) var15);
            return var9;
          }
        } else {
          var5.a(true, var6);
          var9.a((wda) (Object) var5, 0);
          var12 = rm.field_a;
          var13 = (nq) (Object) var12.a(16, param1 ^ 107);
          var13.b(param1 ^ 8021, 2);
          var9.a((gr) (Object) var5, (byte) 124, (dg) (Object) var13);
          return var9;
        }
    }

    final boolean s(int param0) {
        if (param0 != -15254) {
            Object var3 = null;
            ((ona) this).a(true, (kh) null);
            return true;
        }
        return true;
    }

    final static int b(int param0, int param1) {
        int var2 = 0;
        int var3 = 0;
        var3 = TombRacer.field_G ? 1 : 0;
        if (param0 == 0) {
          var2 = param1;
          if (1 != var2) {
            if (var2 != -4) {
              if (-5 != var2) {
                if (var2 != 0) {
                  if ((var2 ^ -1) != -8) {
                    if (var2 != 5) {
                      return param1;
                    } else {
                      return 7;
                    }
                  } else {
                    return 5;
                  }
                } else {
                  return 4;
                }
              } else {
                return 0;
              }
            } else {
              return 1;
            }
          } else {
            return 3;
          }
        } else {
          return -34;
        }
    }

    final void a(la param0, int param1) {
        super.a(param0, param1);
        ((ona) this).field_G = -((ona) this).field_G;
    }

    final void a(boolean param0, kh param1) {
        super.a(param0, param1);
        param1.a((byte) -126, dqa.a(true, ((ona) this).field_G, 5), 5);
    }

    final boolean v(int param0) {
        if (param0 != 555277520) {
            return false;
        }
        return false;
    }

    ona(la param0, int param1, kh param2, csa param3) {
        super(param0, param1, param2, param3);
        ((ona) this).field_G = 4;
        ((ona) this).field_G = bla.a(true, 5, param2.b((byte) 44, 5));
    }

    final boolean n(byte param0) {
        if (param0 != -122) {
            Object var3 = null;
            ((ona) this).a(false, (kh) null);
            return true;
        }
        return true;
    }

    ona(la param0, int param1) {
        super(param0, param1);
        ((ona) this).field_G = 4;
    }

    final boolean z(int param0) {
        if (param0 != 0) {
            Object var3 = null;
            fsa discarded$0 = ((ona) this).a(true, -127, (la) null);
            return false;
        }
        return false;
    }

    final void q(byte param0) {
        super.q(param0);
        ((ona) this).b(-107, 2097152, 2097152);
        ((ona) this).a((byte) 95, new mka[1]);
    }

    final int t(int param0) {
        if (param0 != 8) {
            field_I = null;
            return 7;
        }
        return 7;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_F = "Bloom: ";
        field_I = "Asking to join <%0>'s game...";
    }
}
