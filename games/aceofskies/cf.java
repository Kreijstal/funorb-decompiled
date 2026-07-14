/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cf extends sk {
    static int field_g;
    static String field_h;
    static gk field_f;

    public static void f(int param0) {
        field_f = null;
        field_h = null;
        int var1 = -94 % ((-48 - param0) / 41);
    }

    final static void a(ll[] param0, int param1, byte param2, int param3, int param4) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        var10 = AceOfSkies.field_G ? 1 : 0;
        if (param0 != null) {
          if (0 < param4) {
            var5 = param0[0].field_v;
            var6 = param0[2].field_v;
            var7 = param0[1].field_v;
            param0[0].b(param1, param3);
            param0[2].b(param1 - -param4 + -var6, param3);
            vp.b(rl.field_a);
            vp.a(param1 + var5, param3, param4 + (param1 + -var6), param0[1].field_q + param3);
            var8 = param1 - -var5;
            var9 = -var6 + param1 + param4;
            param1 = var8;
            if (param2 <= -108) {
              L0: while (true) {
                if (var9 <= param1) {
                  vp.a(rl.field_a);
                  return;
                } else {
                  param0[1].b(param1, param3);
                  param1 = param1 + var7;
                  continue L0;
                }
              }
            } else {
              cf.f(78);
              L1: while (true) {
                if (var9 <= param1) {
                  vp.a(rl.field_a);
                  return;
                } else {
                  param0[1].b(param1, param3);
                  param1 = param1 + var7;
                  continue L1;
                }
              }
            }
          } else {
            return;
          }
        } else {
          return;
        }
    }

    final boolean e(int param0) {
        if (param0 != 3) {
            return true;
        }
        return true;
    }

    final void a(int param0, int param1, jj param2) {
        ll[] var5 = null;
        ((cf) this).field_b.a(param2, -9135);
        if (param1 <= 66) {
          var5 = (ll[]) null;
          cf.a((ll[]) null, -3, (byte) -124, 39, -48);
          ((cf) this).field_b.b(param0, false);
          return;
        } else {
          ((cf) this).field_b.b(param0, false);
          return;
        }
    }

    final void a(int param0, int param1, int param2) {
        if (param0 == 1786747298) {
            return;
        }
        field_h = (String) null;
    }

    final void a(boolean param0, byte param1) {
        ((cf) this).field_b.a(true, -26973);
        if (param1 >= 2) {
            return;
        }
        ((cf) this).a(-1, 10, -110);
    }

    cf(bf param0) {
        super(param0);
    }

    final void a(boolean param0, boolean param1) {
        if (!param0) {
            return;
        }
        ((cf) this).a(false, (byte) 24);
    }

    final void a(boolean param0) {
        ll[] var3 = null;
        ((cf) this).field_b.a(false, -26973);
        if (param0) {
          return;
        } else {
          var3 = (ll[]) null;
          cf.a((ll[]) null, 33, (byte) -18, -72, -45);
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_g = 0;
    }
}
