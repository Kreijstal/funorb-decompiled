/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fl extends k {
    private String field_k;
    static long field_l;
    static String field_m;
    private boolean field_n;

    final static void f(byte param0) {
        int var1 = 50 / ((31 - param0) / 52);
        vq.field_J = null;
        go.field_e = 0;
        th.field_h = false;
        b.field_a = -1;
        ad.field_j = -1;
    }

    final static void e(int param0) {
        int var4 = 0;
        int var5 = BrickABrac.field_J ? 1 : 0;
        jp var1 = new jp(540, 140);
        int var2 = 5 / ((16 - param0) / 50);
        fc.a(-89, var1);
        mg.c();
        lb.d();
        ld.field_t = 0;
        jl.b(-115);
        jp var3 = var1.e();
        for (var4 = 0; 15 > var4; var4++) {
            var3.d(-2, -2, 16777215);
            lb.e(4, 4, 0, 0, 540, 140);
        }
        aa.field_b.g();
        var1.a(0, 0);
        sc.b(-123);
    }

    final String a(int param0, String param1) {
        String var3 = null;
        oh var4_ref = null;
        int var4 = 0;
        CharSequence var5 = null;
        var5 = (CharSequence) (Object) param1;
        var3 = th.a(var5, -106);
        if (var3 != null) {
          return var3;
        } else {
          L0: {
            if (param1.equals((Object) (Object) ((fl) this).field_k)) {
              break L0;
            } else {
              var4_ref = qc.a(param1, 0);
              if (var4_ref != null) {
                if (null == var4_ref.field_g) {
                  ((fl) this).field_n = var4_ref.field_c;
                  ((fl) this).field_k = param1;
                  break L0;
                } else {
                  return null;
                }
              } else {
                return null;
              }
            }
          }
          if (!((fl) this).field_n) {
            return ng.field_f;
          } else {
            var4 = 21 / ((-16 - param0) / 50);
            return gk.field_d;
          }
        }
    }

    final static void b(boolean param0) {
        if (!param0) {
            fl.f((byte) -72);
            fp.field_A.setLength(0);
            ng.field_b = 0;
            return;
        }
        fp.field_A.setLength(0);
        ng.field_b = 0;
    }

    fl(vb param0) {
        super(param0);
        ((fl) this).field_n = false;
    }

    public static void f(int param0) {
        if (param0 >= -35) {
            field_l = 72L;
            field_m = null;
            return;
        }
        field_m = null;
    }

    final qh a(String param0, byte param1) {
        CharSequence var8 = null;
        oh var6 = null;
        oh var7 = null;
        if (param1 != 106) {
            fl.f((byte) -106);
            var8 = (CharSequence) (Object) param0;
            if (!se.a(17165, var8)) {
                return lp.field_xb;
            }
            if (!(param0.equals((Object) (Object) ((fl) this).field_k))) {
                var6 = qc.a(param0, 0);
                if (var6 == null) {
                    return hq.field_z;
                }
                if (var6.field_g == null) {
                    ((fl) this).field_k = param0;
                    ((fl) this).field_n = var6.field_c;
                    return ((fl) this).field_n ? ae.field_c : lp.field_xb;
                }
                return hq.field_z;
            }
            return ((fl) this).field_n ? ae.field_c : lp.field_xb;
        }
        CharSequence var9 = (CharSequence) (Object) param0;
        if (!se.a(17165, var9)) {
            return lp.field_xb;
        }
        if (param0.equals((Object) (Object) ((fl) this).field_k)) {
        } else {
            var7 = qc.a(param0, 0);
            if (var7 != null) {
                // ifnonnull L214
            } else {
                return hq.field_z;
            }
            ((fl) this).field_k = param0;
            ((fl) this).field_n = var7.field_c;
        }
        return ((fl) this).field_n ? ae.field_c : lp.field_xb;
    }

    final static int a(CharSequence param0, int param1) {
        if (param1 != -28734) {
            field_m = null;
            return sq.a((byte) -32, 10, true, param0);
        }
        return sq.a((byte) -32, 10, true, param0);
    }

    final void e(byte param0) {
        ((fl) this).field_k = null;
        if (param0 != -22) {
            ((fl) this).e((byte) -82);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_m = "Orb coins: ";
    }
}
