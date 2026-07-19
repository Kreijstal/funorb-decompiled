/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hj {
    static int field_a;
    static boolean field_c;
    static int field_b;

    final static int a(byte param0, int param1) {
        int var2 = 0;
        L0: {
          L1: {
            var2 = 0;
            if (0 > param1) {
              break L1;
            } else {
              if (-65537 < (param1 ^ -1)) {
                break L0;
              } else {
                break L1;
              }
            }
          }
          param1 = param1 >>> 16;
          var2 += 16;
          break L0;
        }
        L2: {
          if (-257 >= (param1 ^ -1)) {
            var2 += 8;
            param1 = param1 >>> 8;
            break L2;
          } else {
            break L2;
          }
        }
        L3: {
          if (16 <= param1) {
            var2 += 4;
            param1 = param1 >>> 4;
            break L3;
          } else {
            break L3;
          }
        }
        L4: {
          if (-5 < (param1 ^ -1)) {
            break L4;
          } else {
            var2 += 2;
            param1 = param1 >>> 2;
            break L4;
          }
        }
        L5: {
          if (1 > param1) {
            break L5;
          } else {
            param1 = param1 >>> 1;
            var2++;
            break L5;
          }
        }
        if (param0 == 58) {
          return param1 + var2;
        } else {
          return -21;
        }
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
        dm[] var1 = null;
        int var2 = 0;
        int var3 = 0;
        byte[] var5 = null;
        int var6 = 0;
        int[] var6_ref_int__ = null;
        int var7 = 0;
        int var8 = 0;
        byte[] var9 = null;
        int[] var10 = null;
        byte[] var11 = null;
        int[] var13 = null;
        byte[] var15 = null;
        int[] var17 = null;
        byte[] var21 = null;
        int[] var22 = null;
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
