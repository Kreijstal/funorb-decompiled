/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rn {
    static String field_c;
    static int field_b;
    static int field_a;

    public static void a(int param0) {
        field_c = null;
        if (param0 != -2) {
            field_a = 49;
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5) {
        RuntimeException var6 = null;
        int var6_int = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var14 = Chess.field_G;
        try {
          L0: {
            L1: {
              var6_int = param0 + 493 + param3 - -2 - -8;
              ji.field_N.a(3, -6 + var6_int, -2147483648, -6 + uh.field_m.field_pb, 3);
              var7 = -5 + ji.field_N.field_pb;
              qj.field_e.a(5, 487 + (param3 - -param0), -2147483648, param5, -param5 + var7);
              eg.field_f.a(param3, -uc.field_c.field_M + (-param3 + qj.field_e.field_M), -2147483648, param5, 0);
              uc.field_c.a(param3 - -eg.field_f.field_M, uc.field_c.field_M, -2147483648, param5, 0);
              var7 = var7 - (param5 - -2);
              ac.field_j.a(2, -5 + var7, 5, -3, param0, 5, 2 + (param3 - -485) - -param0);
              if (ol.field_O == null) {
                break L1;
              } else {
                ol.field_O.a(ac.field_j.field_V, 34, ac.field_j.field_pb, ac.field_j.field_M, ac.field_j.field_mb);
                break L1;
              }
            }
            var8 = -param3 + uh.field_m.field_M - var6_int;
            var9 = var8 / 2;
            var10 = param2 + (var9 + param3);
            var11 = 0;
            if (param1 <= -127) {
              var12 = 0;
              L2: while (true) {
                if (-7 >= (var12 ^ -1)) {
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  L3: {
                    L4: {
                      if (var12 >= 5) {
                        break L4;
                      } else {
                        if (null == g.field_d[var12]) {
                          break L3;
                        } else {
                          break L4;
                        }
                      }
                    }
                    var13 = 3 - -((-6 + uh.field_m.field_pb - -2) * var11 / (qm.field_d - -1));
                    var11++;
                    var7 = -var13 + -2 + 3 + (-6 + (uh.field_m.field_pb - -2)) * var11 / (1 + qm.field_d);
                    if (-6 < (var12 ^ -1)) {
                      g.field_d[var12].a(var6_int, var8, -2147483648, var7, var13);
                      t.field_K[var12].a(param3, var9 - param3, -2147483648, var7, 0);
                      ig.field_i[var12].a(var9, param2, -2147483648, -param4 + var7 + -param4, param4);
                      mf.field_l[var12].a(var10, -var10 + var8 - param3, -2147483648, -param4 + var7 + -param4, param4);
                      break L3;
                    } else {
                      bj.field_jb.a(var6_int, var8, -2147483648, var7, var13);
                      break L3;
                    }
                  }
                  var12++;
                  continue L2;
                }
              }
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          throw fk.a((Throwable) ((Object) var6), "rn.B(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    static {
        field_c = "Change display name";
        field_b = 2;
        field_a = -1;
    }
}
