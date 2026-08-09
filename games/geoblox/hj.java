/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hj {
    static int field_a;
    static boolean field_c;
    static int field_b;

    final static int a(byte param0, int param1) {
        int var2 = 0;
        if (0 > param1 || -65537 >= (param1 ^ -1)) {
            param1 = param1 >>> 16;
            var2 += 16;
        }
        if (!(-257 < (param1 ^ -1))) {
            var2 += 8;
            param1 = param1 >>> 8;
        }
        if (!(16 > param1)) {
            var2 += 4;
            param1 = param1 >>> 4;
        }
        if (-5 >= (param1 ^ -1)) {
            var2 += 2;
            param1 = param1 >>> 2;
        }
        if (1 <= param1) {
            param1 = param1 >>> 1;
            var2++;
        }
        if (param0 != 58) {
            return -21;
        }
        return param1 + var2;
    }

    final static void a(byte param0, java.awt.Component param1) {
        try {
            if (param0 != -85) {
                field_c = false;
            }
            param1.setFocusTraversalKeysEnabled(false);
            param1.addKeyListener(je.field_j);
            param1.addFocusListener(je.field_j);
        } catch (RuntimeException runtimeException) {
            throw t.a((Throwable) ((Object) runtimeException), "hj.A(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static dm[] a(int param0) {
        dm[] var1;
        int var2;
        int var3;
        byte[] var5;
        int var6;
        int[] var6_ref_int__;
        int var7;
        int var8;
        byte[] var9;
        int[] var10;
        byte[] var11;
        int[] var13;
        byte[] var15;
        int[] var17;
        byte[] var21;
        int[] var22;
        L0: {
          var8 = Geoblox.field_C;
          var1 = new dm[sb.field_a];
          if (param0 > 60) {
            break L0;
          } else {
            field_a = 2;
            break L0;
          }
        }
        var2 = 0;
        L1: while (true) {
          if (sb.field_a <= var2) {
            kj.c(true);
            return var1;
          } else {
            var3 = hl.field_K[var2] * rc.field_j[var2];
            var21 = mj.field_a[var2];
            if (!ng.field_E[var2]) {
              var10 = new int[var3];
              var22 = var10;
              var6 = 0;
              L2: while (true) {
                if (var3 <= var6) {
                  var1[var2] = new dm(pg.field_b, dd.field_C, gh.field_m[var2], md.field_e[var2], rc.field_j[var2], hl.field_K[var2], var22);
                  var2++;
                  continue L1;
                } else {
                  var10[var6] = cm.field_j[cd.a((int) var21[var6], 255)];
                  var6++;
                  continue L2;
                }
              }
            } else {
              var15 = vf.field_E[var2];
              var11 = var15;
              var9 = var11;
              var5 = var9;
              var17 = new int[var3];
              var13 = var17;
              var6_ref_int__ = var13;
              var7 = 0;
              L3: while (true) {
                if (var7 >= var3) {
                  var1[var2] = (dm) ((Object) new il(pg.field_b, dd.field_C, gh.field_m[var2], md.field_e[var2], rc.field_j[var2], hl.field_K[var2], var17));
                  var2++;
                  continue L1;
                } else {
                  var6_ref_int__[var7] = lb.a(cd.a(var15[var7] << -1753349800, -16777216), cm.field_j[cd.a((int) var21[var7], 255)]);
                  var7++;
                  continue L3;
                }
              }
            }
          }
        }
    }

    static {
        field_c = false;
        field_b = 8;
    }
}
