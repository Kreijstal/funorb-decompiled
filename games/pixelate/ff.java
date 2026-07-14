/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ff {
    static String field_f;
    static int field_i;
    static long field_d;
    static ak field_j;
    static ak field_g;
    static ak field_h;
    static String field_e;
    static String field_c;
    static String field_b;
    static ak field_a;

    final static tf[] a(fm param0, int param1, int param2, int param3) {
        if (param3 != -3) {
            return null;
        }
        if (!rk.a(param2, false, param0, param1)) {
            return null;
        }
        return ff.b(0);
    }

    public static void a(int param0) {
        field_f = null;
        field_a = null;
        field_h = null;
        field_e = null;
        field_j = null;
        field_c = null;
        int var1 = -117 / ((param0 - 51) / 43);
        field_b = null;
        field_g = null;
    }

    final static String a(int param0, String param1, byte param2) {
        int var5 = 0;
        int var6 = 0;
        im var7 = null;
        im var8 = null;
        pc var9 = null;
        CharSequence var10 = null;
        var6 = Pixelate.field_H ? 1 : 0;
        var10 = (CharSequence) (Object) param1;
        if (!ai.a((byte) -126, var10)) {
          return qn.field_n;
        } else {
          if (-3 != (gk.field_db ^ -1)) {
            return qg.field_c;
          } else {
            var8 = re.a(param1, -1);
            if (var8 != null) {
              fa discarded$2 = vp.field_Hb.a((fa) (Object) var8, param2 + 1504642379);
              L0: while (true) {
                var7 = (im) (Object) vp.field_Hb.f(param2 ^ -1504642185);
                if (var7 != null) {
                  var7.field_Kb = var7.field_Kb - 1;
                  continue L0;
                } else {
                  L1: {
                    var8.c(2779);
                    var8.e(17);
                    if (param2 == -106) {
                      break L1;
                    } else {
                      field_d = -123L;
                      break L1;
                    }
                  }
                  f.field_q = f.field_q - 1;
                  var9 = aa.field_f;
                  var9.g(param0, 15514);
                  var9.field_m = var9.field_m + 1;
                  var5 = var9.field_m;
                  var9.e(160, 1);
                  var9.b((byte) -41, param1);
                  var9.f(-var5 + var9.field_m, -1);
                  return null;
                }
              }
            } else {
              return sd.a(vl.field_R, 41, new String[1]);
            }
          }
        }
    }

    private final static tf[] b(int param0) {
        int var2 = 0;
        int var3 = 0;
        byte[] var4 = null;
        int[] var5 = null;
        int var6 = 0;
        int var7 = Pixelate.field_H ? 1 : 0;
        tf[] var1 = new tf[im.field_Qb];
        for (var2 = param0; var2 < im.field_Qb; var2++) {
            var3 = ge.field_c[var2] * gf.field_g[var2];
            var4 = wo.field_f[var2];
            var5 = new int[var3];
            for (var6 = 0; var6 < var3; var6++) {
                var5[var6] = fl.field_g[cm.a((int) var4[var6], 255)];
            }
            var1[var2] = new tf(tj.field_y, jb.field_a, fa.field_b[var2], e.field_b[var2], gf.field_g[var2], ge.field_c[var2], var5);
        }
        re.b(140);
        return var1;
    }

    final static hh[] a(fm param0, int param1, int param2, byte param3) {
        if (!rk.a(param1, false, param0, param2)) {
            return null;
        }
        int var4 = 101 % ((-49 - param3) / 52);
        return gb.a((byte) -96);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_f = "Unpacking music";
        field_e = "Add <%0> to ignore list";
        field_b = "Invite more players, or alternatively try changing the '<%0>' setting.";
        field_c = "<%0> might change the options - wait and see.";
    }
}
