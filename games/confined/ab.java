/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ab {
    static fi field_b;
    static int field_a;

    final static int a(int param0, int param1, int param2) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        var8 = Confined.field_J ? 1 : 0;
        var3 = param0;
        var4 = uh.field_c;
        L0: while (true) {
          if (var3 >= dl.field_c.length) {
            return -1;
          } else {
            var5 = la.field_T[var3];
            if (var5 < 0) {
              var4 = var4 + wm.field_bb;
              var3++;
              continue L0;
            } else {
              var6 = cl.a(param0 ^ -3, dl.field_c[var3], true);
              var4 = var4 + kb.field_b;
              var7 = ef.field_vb - (var6 >> -1278915999);
              if (qd.a(param1, var4, (jd.field_g << -673564831) + var6, param2, true, -jd.field_g + var7, (n.field_d << -60228671) + af.field_Z)) {
                return var5;
              } else {
                var4 = var4 + (kb.field_b + (n.field_d << 208100289) + af.field_Z);
                var3++;
                continue L0;
              }
            }
          }
        }
    }

    final static void b(byte param0) {
        int var4 = Confined.field_J ? 1 : 0;
        int[] var5 = vb.field_e;
        int[] var1 = var5;
        if (param0 < 98) {
            ab.a((byte) -5);
        }
        int var2 = 0;
        int var3 = var5.length;
        while (var3 > var2) {
            var2++;
            var5[var2] = 0;
            var2++;
            var5[var2] = 0;
            var2++;
            var5[var2] = 0;
            var2++;
            var5[var2] = 0;
            var2++;
            var5[var2] = 0;
            var2++;
            var5[var2] = 0;
            var2++;
            var5[var2] = 0;
            var2++;
            var5[var2] = 0;
        }
    }

    final static void a(int param0) {
        cb.field_a.a(gj.field_d, 100, fa.field_S * 48 >> 2080736903);
        if (param0 != 2026) {
            field_b = null;
        }
    }

    public static void a(byte param0) {
        field_b = null;
        if (param0 > -26) {
            field_a = -36;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = 0;
        field_b = new fi();
    }
}
