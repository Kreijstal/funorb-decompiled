/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jh extends ge {
    static String field_J;
    static String field_K;

    jh(la param0, int param1) {
        super(param0, param1);
    }

    final boolean A(int param0) {
        if (param0 != -1) {
            boolean discarded$0 = ((jh) this).C(-60);
            return true;
        }
        return true;
    }

    final boolean v(int param0) {
        if (param0 != 555277520) {
            field_J = null;
            return false;
        }
        return false;
    }

    jh(la param0, int param1, kh param2, csa param3) {
        super(param0, param1, param2, param3);
    }

    final static void a(int param0, String param1, il param2, kha param3, int param4) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        var9 = TombRacer.field_G ? 1 : 0;
        var5 = 0;
        var6 = -1;
        var7 = 1;
        if (param0 == 2097152) {
          L0: while (true) {
            if (var7 >= param1.length()) {
              return;
            } else {
              L1: {
                var8 = param1.charAt(var7);
                if (var8 == 60) {
                  var6 = param3.field_c[0] + (var5 >> 635819176) + param2.b(param1.substring(0, var7));
                  break L1;
                } else {
                  break L1;
                }
              }
              L2: {
                if (-1 != var6) {
                  param3.field_c[var7] = var6;
                  break L2;
                } else {
                  L3: {
                    if (var8 != 32) {
                      break L3;
                    } else {
                      var5 = var5 + param4;
                      break L3;
                    }
                  }
                  param3.field_c[var7] = (var5 >> 2026704424) + param3.field_c[0] - (-param2.b(param1.substring(0, 1 + var7)) + param2.a((char) var8));
                  break L2;
                }
              }
              if (var8 == 62) {
                var6 = -1;
                var7++;
                continue L0;
              } else {
                var7++;
                continue L0;
              }
            }
          }
        } else {
          return;
        }
    }

    final boolean z(int param0) {
        if (param0 != 0) {
            field_K = null;
            return false;
        }
        return false;
    }

    final int t(int param0) {
        if (param0 != 8) {
            ((jh) this).q((byte) 50);
        }
        return 7;
    }

    final boolean C(int param0) {
        if (param0 != 128) {
            return true;
        }
        return true;
    }

    final boolean B(int param0) {
        if (param0 != -23309) {
            ((jh) this).q((byte) -44);
        }
        return true;
    }

    final fsa a(boolean param0, int param1, la param2) {
        fsa var9 = new fsa(param2, param0);
        var9.b((byte) -11, ((jh) this).field_k, ((jh) this).field_l);
        var9.h(param1, 0);
        var9.a((byte) 83, (nv) (Object) new eq(param2, param0));
        ska var5 = new ska(param2, param0);
        roa var6 = ci.a(2, param1 ^ -4);
        var6.a(-43, true);
        var5.a(var6, (byte) 73);
        ((jh) this).a((byte) 43, (mra) (Object) var5, param2);
        var9.a((byte) 83, (nv) (Object) var5);
        mfa var7 = rm.field_a;
        boa var8 = (boa) (Object) var7.a(7, 100);
        var8.b(param1 + 111, 11);
        var9.a((gr) (Object) var5, (byte) 124, (dg) (Object) var8);
        ((jh) this).a(var9, 0, (nv) (Object) var5, 16777130);
        return var9;
    }

    public static void D(int param0) {
        field_J = null;
        if (param0 > -89) {
            jh.D(10);
        }
        field_K = null;
    }

    final boolean n(byte param0) {
        if (param0 != -122) {
            boolean discarded$0 = ((jh) this).n((byte) 40);
            return true;
        }
        return true;
    }

    final void a(boolean param0, kh param1) {
        super.a(param0, param1);
    }

    final void q(byte param0) {
        super.q(param0);
        ((jh) this).b(-76, 2097152, 2097152);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_K = "The '<%0>' setting needs to be changed.";
        field_J = "GO!";
    }
}
