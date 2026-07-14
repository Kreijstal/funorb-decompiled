/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ud implements io {
    static java.awt.Color field_c;
    static String field_a;
    private nh field_b;

    final static qg a(String param0, byte param1, int param2) {
        if (param1 != 68) {
            field_c = null;
        }
        se var3 = new se();
        ((qg) (Object) var3).field_e = param0;
        ((qg) (Object) var3).field_b = param2;
        return (qg) (Object) var3;
    }

    public final void a(int param0, boolean param1, int param2, ga param3, int param4) {
        int var6 = 0;
        int var7 = 0;
        Object var8 = null;
        String var9 = null;
        int var10 = 0;
        L0: {
          var6 = param4 - -param3.field_k;
          var7 = param2 - -param3.field_j;
          pb.a(var6, param3.field_n, var7, 48, param3.field_i);
          if (param0 == 16777215) {
            break L0;
          } else {
            field_c = null;
            break L0;
          }
        }
        L1: {
          if (!param3.e(-17741)) {
            break L1;
          } else {
            on.b(param3.field_i + -4, -4 + param3.field_n, var6 - -2, param0 ^ 16777172, var7 - -2);
            break L1;
          }
        }
        L2: {
          bi.f(var6, var7, -2 + param3.field_i + var6, var7 + param3.field_n);
          var8 = ((ud) this).field_b.field_T.g(0);
          if (var8 != null) {
            var9 = var8.toString();
            ((ud) this).field_b.field_L.c(var9, 2 + var6, (((ud) this).field_b.field_L.field_I + param3.field_n >> 933771393) + (var7 + -1), 10000536, -1);
            if (!((ud) this).field_b.e(param0 ^ -16759476)) {
              break L2;
            } else {
              if (var9.startsWith(((ud) this).field_b.field_U)) {
                var10 = ((ud) this).field_b.field_L.b(((ud) this).field_b.field_U);
                bi.a(2 + var6, 2 + var7, var10, -4 + param3.field_n, 2188450, 100);
                break L2;
              } else {
                break L2;
              }
            }
          } else {
            break L2;
          }
        }
        bi.c();
    }

    final static v a(v param0, int[] param1, int param2) {
        v var3 = new v(0, 0, 0);
        if (param2 != -27837) {
            ud.a((byte) -120);
        }
        var3.field_a = param0.field_a;
        var3.field_h = param0.field_h;
        var3.field_j = param0.field_j;
        var3.field_e = param0.field_e;
        var3.field_k = param0.field_k;
        var3.field_d = param0.field_d;
        var3.field_g = param0.field_g;
        var3.field_l = param1;
        return var3;
    }

    public static void a(byte param0) {
        field_a = null;
        if (param0 != -105) {
            field_c = null;
        }
        field_c = null;
    }

    final static re[] a(int param0, ec param1) {
        int var5 = 0;
        re var6 = null;
        int var7 = ZombieDawn.field_J;
        if (!(param1.c(10))) {
            return new re[]{};
        }
        op var8 = param1.a(param0 + -1);
        while (-1 == (var8.field_f ^ -1)) {
            ld.a(10L, (byte) 84);
        }
        if (!(var8.field_f != 2)) {
            return new re[]{};
        }
        int[] var12 = (int[]) var8.field_d;
        int[] var11 = var12;
        int[] var10 = var11;
        int[] var9 = var10;
        int[] var3 = var9;
        re[] var4 = new re[var12.length >> -1909262942];
        for (var5 = param0; var5 < var4.length; var5++) {
            var6 = new re();
            var4[var5] = var6;
            var6.field_a = var3[var5 << 511559810];
            var6.field_d = var3[1 + (var5 << 466828994)];
            var6.field_b = var3[(var5 << -2018265502) - -2];
            var6.field_f = var3[(var5 << -1454643070) - -3];
        }
        return var4;
    }

    ud(nh param0) {
        ((ud) this).field_b = param0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = new java.awt.Color(10040319);
        field_a = "Your undead army is victorious!";
    }
}
