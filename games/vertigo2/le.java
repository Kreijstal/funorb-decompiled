/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class le {
    static th field_d;
    static String field_a;
    static r field_f;
    static String field_b;
    static String field_c;
    static String field_e;

    public static void a(byte param0) {
        field_d = null;
        if (param0 >= -42) {
          field_d = null;
          field_c = null;
          field_b = null;
          field_a = null;
          field_e = null;
          field_f = null;
          return;
        } else {
          field_c = null;
          field_b = null;
          field_a = null;
          field_e = null;
          field_f = null;
          return;
        }
    }

    final static void a(int param0) {
        vi.b((byte) -45);
        if (param0 != 468713154) {
            le.a(-53);
        }
    }

    final static void b(int param0) {
        int var2 = 0;
        int var3 = 0;
        be var4 = null;
        int var4_int = 0;
        ub var5_ref_ub = null;
        int var5 = 0;
        int[] var6 = null;
        int var7 = 0;
        int var8 = 0;
        mi var9 = null;
        int[] var10 = null;
        int[] var11 = null;
        int[] var12 = null;
        int[] var13 = null;
        var8 = Vertigo2.field_L ? 1 : 0;
        if (param0 < -80) {
          var9 = id.field_f;
          var2 = var9.h(-11);
          var3 = var9.h(-11);
          if (-1 == (var2 ^ -1)) {
            var4 = (be) (Object) mb.field_v.a((byte) 100);
            if (var4 == null) {
              rm.b((byte) -79);
              return;
            } else {
              L0: {
                var5 = -var9.field_u + ca.field_b;
                var13 = var4.field_o;
                var12 = var13;
                var11 = var12;
                var10 = var11;
                var6 = var10;
                if (var13.length << -1390211198 >= var5) {
                  break L0;
                } else {
                  var5 = var13.length << 1422332130;
                  break L0;
                }
              }
              var7 = 0;
              L1: while (true) {
                if (var5 <= var7) {
                  var4.field_p = true;
                  var4.c(2);
                  return;
                } else {
                  var6[var7 >> 468713154] = var6[var7 >> 468713154] + (var9.h(-11) << b.a(768, var7 << -1580328664));
                  var7++;
                  continue L1;
                }
              }
            }
          } else {
            if ((var2 ^ -1) == -2) {
              var4_int = var9.j(-3084);
              var5_ref_ub = (ub) (Object) ob.field_Q.a((byte) 100);
              L2: while (true) {
                if (var5_ref_ub != null) {
                  L3: {
                    if (var5_ref_ub.field_u != var3) {
                      break L3;
                    } else {
                      if (var4_int != var5_ref_ub.field_q) {
                        break L3;
                      } else {
                        if (var5_ref_ub == null) {
                          rm.b((byte) 83);
                          return;
                        } else {
                          var5_ref_ub.c(2);
                          return;
                        }
                      }
                    }
                  }
                  var5_ref_ub = (ub) (Object) ob.field_Q.b(82);
                  continue L2;
                } else {
                  if (var5_ref_ub == null) {
                    rm.b((byte) 83);
                    return;
                  } else {
                    var5_ref_ub.c(2);
                    return;
                  }
                }
              }
            } else {
              ke.a((Throwable) null, "LR1: " + or.a(119), 0);
              rm.b((byte) -30);
              return;
            }
          }
        } else {
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "Target level:";
        field_c = "Email (Login):";
        field_b = "This game option is not available in rated games.";
        field_e = "Walk over the jetpack to pick it up. Press jump twice in quick succession to use it to fly high into the air! At the top of this level are some gluey blocks. While standing on these, you can't jump unless you use the second jetpack.";
    }
}
