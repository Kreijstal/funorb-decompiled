/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fj extends gg {
    static int field_i;
    int[] field_h;
    static String field_j;
    int field_k;

    public static void a(int param0) {
        field_j = null;
        if (param0 != -13) {
            field_j = null;
        }
    }

    final static void a(int param0, int[] param1, int param2, byte param3, int param4, int param5, int param6) {
        int var7 = 0;
        int var8 = 0;
        hd var9 = null;
        int[] var10_ref_int__ = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        String var13 = null;
        int var14 = 0;
        int var15 = 0;
        var15 = SolKnight.field_L ? 1 : 0;
        ab.field_s[param5] = param1;
        var8 = 116 / ((-78 - param3) / 48);
        var7 = 0;
        var9 = ad.field_b;
        var10_ref_int__ = param1;
        var11 = 0;
        L0: while (true) {
          if (var10_ref_int__.length <= var11) {
            var10 = var7 + 20 >> 1654837889;
            jb.field_a[param5] = 320 - var10;
            bb.field_P[param5] = 320 + var10;
            ah.field_i[param5] = param4;
            si.field_F[param5] = param0;
            if (param5 == 2) {
              if (il.b(507)) {
                ah.field_i[param5] = 399;
                return;
              } else {
                jb.field_a[param5] = 30;
                bb.field_P[param5] = bb.field_P[param5] + 580;
                ah.field_i[param5] = 399;
                return;
              }
            } else {
              return;
            }
          } else {
            L1: {
              var12 = var10_ref_int__[var11];
              var13 = te.field_I[var12];
              if (var13 != null) {
                break L1;
              } else {
                var13 = "ERROR: missing text";
                break L1;
              }
            }
            L2: {
              if (-13 == (var12 ^ -1)) {
                break L2;
              } else {
                if (var12 != 13) {
                  var14 = var9.b(var13);
                  if (var14 > var7) {
                    var7 = var14;
                    var11++;
                    continue L0;
                  } else {
                    var11++;
                    continue L0;
                  }
                } else {
                  break L2;
                }
              }
            }
            var14 = 9 + (wb.field_a + 64);
            if (var7 < var14) {
              var7 = var14;
              var11++;
              var11++;
              continue L0;
            } else {
              var11++;
              var11++;
              continue L0;
            }
          }
        }
    }

    final static void a(byte param0) {
        String var1 = null;
        if (k.field_b) {
          L0: {
            if (null != ah.field_e) {
              ah.field_e.f(true);
              break L0;
            } else {
              break L0;
            }
          }
          var1 = s.o(-74);
          if (param0 < 26) {
            return;
          } else {
            ve.field_a = new bb(var1, (String) null, true, false, false);
            u.field_b.b((rc) (Object) gf.field_cb, 125);
            gf.field_cb.c(-3399, (rc) (Object) ve.field_a);
            gf.field_cb.e(true);
            return;
          }
        } else {
          throw new IllegalStateException();
        }
    }

    private fj() throws Throwable {
        throw new Error();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_j = "Asteroids Approaching <%0><br>Level <%1><br>Get Ready!";
    }
}
