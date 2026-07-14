/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class o {
    static String field_b;
    private am field_a;
    static boolean field_d;
    static double field_e;
    private am field_c;

    final am a(int param0) {
        am var2 = ((o) this).field_a.field_f;
        if (!(var2 != ((o) this).field_a)) {
            ((o) this).field_c = null;
            return null;
        }
        if (param0 >= -111) {
            return null;
        }
        ((o) this).field_c = var2.field_f;
        return var2;
    }

    final int c(int param0) {
        int var4 = Kickabout.field_G;
        int var2 = 0;
        am var3 = ((o) this).field_a.field_f;
        if (param0 != -1976587888) {
            field_e = 0.5554742673995899;
        }
        while (((o) this).field_a != var3) {
            var2++;
            var3 = var3.field_f;
        }
        return var2;
    }

    final void a(int param0, am param1) {
        if (param1.field_e != null) {
            param1.f(79);
        }
        param1.field_e = ((o) this).field_a.field_e;
        param1.field_f = ((o) this).field_a;
        param1.field_e.field_f = param1;
        param1.field_f.field_e = param1;
        if (param0 != 127) {
            o.d(-50);
        }
    }

    final static eg a(int param0, vn param1) {
        int var4_int = 0;
        int var5 = 0;
        int var6 = Kickabout.field_G;
        vn var7 = new vn(param1, false, false, true, true);
        vn var9 = var7;
        int var3 = 91 / ((param0 - 2) / 60);
        for (var4_int = 0; var9.field_p.length > var4_int; var4_int++) {
            var7.field_p[var4_int] = (short)6;
        }
        int var8 = 0;
        var4_int = var8;
        while (var9.field_l.length > var8) {
            var9.field_l[var8] = (var9.field_l[var8] << 47207681) / 3;
            var8++;
        }
        eg var4 = (eg) (Object) var9.a(127, 131072, 10, 10, 10);
        for (var5 = 0; var5 < var4.field_n.length; var5++) {
            var4.field_n[var5] = -1;
        }
        return var4;
    }

    final am b(byte param0) {
        int var3 = 118 % ((54 - param0) / 51);
        am var2 = ((o) this).field_a.field_f;
        if (var2 == ((o) this).field_a) {
            return null;
        }
        var2.f(114);
        return var2;
    }

    public static void d(int param0) {
        field_b = null;
        if (param0 != 1603) {
            field_d = false;
        }
    }

    final am b(int param0) {
        am var2 = ((o) this).field_c;
        if (var2 == ((o) this).field_a) {
            ((o) this).field_c = null;
            return null;
        }
        if (param0 != 0) {
            int discarded$0 = ((o) this).c(14);
        }
        ((o) this).field_c = var2.field_f;
        return var2;
    }

    final static void a(byte param0) {
        int var1 = 0;
        nl var2 = null;
        int var3 = 0;
        var3 = Kickabout.field_G;
        df.d(true);
        var1 = 0;
        if (param0 == -127) {
          L0: while (true) {
            if (var1 >= 3) {
              return;
            } else {
              var2 = et.field_d.field_P[1][var1 - -1];
              if (tc.a(0, (byte) 86, var2.field_M, var2, nt.field_zb[var1] << -1335268624)) {
                L1: {
                  nt.field_zb[var1] = 700 + (-var2.a(true) - -700);
                  if (-701 <= (nt.field_zb[var1] ^ -1)) {
                    nt.field_zb[var1] = Math.max(520, nt.field_zb[var1] - 20);
                    break L1;
                  } else {
                    nt.field_zb[var1] = Math.min(880, nt.field_zb[var1] + 20);
                    break L1;
                  }
                }
                boolean discarded$1 = tc.a(0, (byte) 122, var2.field_M, var2, nt.field_zb[var1] << -1976587888);
                var1++;
                continue L0;
              } else {
                var1++;
                continue L0;
              }
            }
          }
        } else {
          return;
        }
    }

    public o() {
        ((o) this).field_a = new am();
        ((o) this).field_a.field_f = ((o) this).field_a;
        ((o) this).field_a.field_e = ((o) this).field_a;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "Achievements";
    }
}
