/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class g extends tj {
    private rl field_l;
    static int field_n;
    static wg field_m;
    static int field_o;

    final sc a(int param0, String param1) {
        ma var3 = null;
        if (param0 != 0) {
            return null;
        }
        if (((g) this).field_l instanceof nd) {
            var3 = ((nd) (Object) ((g) this).field_l).a((byte) -106);
            if (var3 != null) {
                if (!(var3.b((byte) 124) == rh.field_p)) {
                    return ni.field_b;
                }
            }
        }
        return param1.equals((Object) (Object) ((g) this).field_l.field_u) ? rh.field_p : ni.field_b;
    }

    public static void e(int param0) {
        field_m = null;
        if (param0 != -17779) {
            boolean discarded$0 = g.f(98);
        }
    }

    final static boolean f(int param0) {
        if (param0 != 256) {
            field_m = null;
        }
        return gf.a(0, kk.c(param0 ^ -14303));
    }

    final String a(byte param0, String param1) {
        ma var3 = null;
        if (((g) this).field_l instanceof nd) {
            var3 = ((nd) (Object) ((g) this).field_l).a((byte) 125);
            if (var3 != null) {
                if (var3.b((byte) 122) == rh.field_p) {
                    if (!(param1.equals((Object) (Object) ((g) this).field_l.field_u))) {
                        return re.field_cb;
                    }
                }
                return var3.a((byte) 82);
            }
        }
        if (param0 != -126) {
            Object var4 = null;
            sc discarded$0 = ((g) this).a(-64, (String) null);
        }
        if (!(param1.equals((Object) (Object) ((g) this).field_l.field_u))) {
            return re.field_cb;
        }
        return null;
    }

    final static void a(int param0, int param1) {
        cc[] var2 = null;
        cc var2_ref = null;
        cc var2_ref2 = null;
        int var3 = 0;
        cc var4 = null;
        int var5 = 0;
        cc[] var6 = null;
        var5 = Lexicominos.field_L ? 1 : 0;
        oc.field_e = param0;
        var6 = th.field_o;
        var2 = var6;
        var3 = 0;
        L0: while (true) {
          if (var3 >= var6.length) {
            L1: {
              if (param1 > 49) {
                break L1;
              } else {
                field_m = null;
                break L1;
              }
            }
            L2: {
              var2_ref2 = th.field_o[9];
              if (!var2_ref2.a(false)) {
                var2_ref2.c(0);
                wj.field_j.a((lk) (Object) var2_ref2);
                break L2;
              } else {
                break L2;
              }
            }
            return;
          } else {
            var4 = var6[var3];
            var2_ref = var4;
            var2_ref = var4;
            if (var4 != null) {
              var4.f(param0 * 128 / 256);
              var3++;
              continue L0;
            } else {
              var3++;
              continue L0;
            }
          }
        }
    }

    final static void a(int param0, byte param1) {
        int var3 = Lexicominos.field_L ? 1 : 0;
        nc var4 = (nc) (Object) ok.field_b.a(true);
        if (param1 >= -38) {
            field_m = null;
        }
        while (var4 != null) {
            ga.a(var4, param0, 74);
            var4 = (nc) (Object) ok.field_b.f(2);
        }
        sj var5 = (sj) (Object) il.field_b.a(true);
        while (var5 != null) {
            uh.a(var5, (byte) -123, param0);
            var5 = (sj) (Object) il.field_b.f(2);
        }
    }

    g(rl param0, rl param1) {
        super(param0);
        ((g) this).field_l = param1;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_o = 5;
    }
}
