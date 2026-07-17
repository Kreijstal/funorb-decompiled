/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nja {
    static int field_a;

    final static void a(boolean param0, byte param1) {
        int var3 = 0;
        L0: {
          var3 = BachelorFridge.field_y;
          if (param0) {
            w.field_e = false;
            break L0;
          } else {
            if (null != pw.field_w) {
              break L0;
            } else {
              w.field_e = false;
              break L0;
            }
          }
        }
    }

    final static kv a(boolean param0) {
        int[] var15 = null;
        int[] var8 = null;
        int var5_int = 0;
        Object var3 = null;
        byte[] var20 = null;
        int[] var21 = null;
        int[] var17 = null;
        int[] var13 = null;
        int[] var11 = null;
        int[] var5 = null;
        int var6 = 0;
        int[] var19 = null;
        int var7 = BachelorFridge.field_y;
        int var1 = eha.field_s[0] * lq.field_A[0];
        byte[] var18 = baa.field_P[0];
        if (!uf.field_b[0]) {
            var19 = new int[var1];
            var15 = var19;
            var8 = var15;
            for (var5_int = 0; var1 > var5_int; var5_int++) {
                var8[var5_int] = hk.field_f[dda.a((int) var18[var5_int], 255)];
            }
            var3 = (Object) (Object) new kv(ok.field_Bb, kh.field_r, fl.field_j[0], fd.field_D[0], lq.field_A[0], eha.field_s[0], var19);
        } else {
            var20 = cea.field_d[0];
            var21 = new int[var1];
            var17 = var21;
            var13 = var17;
            var11 = var13;
            var5 = var11;
            for (var6 = 0; var6 < var1; var6++) {
                var5[var6] = mp.a(dda.a(255, (int) var20[var6]) << 24, hk.field_f[dda.a(255, (int) var18[var6])]);
            }
            var3 = (Object) (Object) new pa(ok.field_Bb, kh.field_r, fl.field_j[0], fd.field_D[0], lq.field_A[0], eha.field_s[0], var21);
        }
        al.b(-18073);
        return (kv) var3;
    }

    final static void a(int param0) {
        if (param0 < 70) {
            return;
        }
        hl.field_I = false;
        sea.field_j = ig.field_m.b(16711935) == 0 ? true : false;
    }

    static {
    }
}
