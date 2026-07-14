/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ub {
    static String field_a;

    public static void a(int param0) {
        if (param0 != 37) {
            ub.a(-37);
            field_a = null;
            return;
        }
        field_a = null;
    }

    final static void a(dl param0, boolean param1, int param2, int param3, java.awt.Component param4, mf param5, boolean param6, int param7) {
        gj.a(param7, param1, 10);
        if (param6) {
          field_a = null;
          kj.field_P = gj.a(param0, param4, 0, param2);
          ql.field_r = gj.a(param0, param4, 1, param3);
          ti.field_f = new e();
          ak.field_a = 1000 * param3 / param7;
          ql.field_r.a((ej) (Object) ti.field_f);
          ua.field_I = param5;
          ua.field_I.d(1349013231, la.field_k);
          kj.field_P.a((ej) (Object) ua.field_I);
          return;
        } else {
          kj.field_P = gj.a(param0, param4, 0, param2);
          ql.field_r = gj.a(param0, param4, 1, param3);
          ti.field_f = new e();
          ak.field_a = 1000 * param3 / param7;
          ql.field_r.a((ej) (Object) ti.field_f);
          ua.field_I = param5;
          ua.field_I.d(1349013231, la.field_k);
          kj.field_P.a((ej) (Object) ua.field_I);
          return;
        }
    }

    final static String a(int param0, long param1) {
        int var3 = 0;
        long var4 = 0L;
        StringBuilder var6 = null;
        long var7 = 0L;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        Object var12 = null;
        var11 = SolKnight.field_L ? 1 : 0;
        if (0L < param1) {
          if (param1 < 6582952005840035281L) {
            if (0L != param1 % 37L) {
              var3 = 0;
              var4 = param1;
              L0: while (true) {
                if (-1L == (var4 ^ -1L)) {
                  var6 = new StringBuilder(var3);
                  L1: while (true) {
                    if (-1L == (param1 ^ -1L)) {
                      if (param0 >= -35) {
                        var12 = null;
                        ub.a((dl) null, true, 99, 116, (java.awt.Component) null, (mf) null, false, 43);
                        StringBuilder discarded$3 = var6.reverse();
                        var6.setCharAt(0, Character.toUpperCase(var6.charAt(0)));
                        return var6.toString();
                      } else {
                        StringBuilder discarded$4 = var6.reverse();
                        var6.setCharAt(0, Character.toUpperCase(var6.charAt(0)));
                        return var6.toString();
                      }
                    } else {
                      L2: {
                        var7 = param1;
                        param1 = param1 / 37L;
                        var9 = lf.field_f[(int)(-(param1 * 37L) + var7)];
                        if (var9 != 95) {
                          break L2;
                        } else {
                          var10 = var6.length() + -1;
                          var9 = 160;
                          var6.setCharAt(var10, Character.toUpperCase(var6.charAt(var10)));
                          break L2;
                        }
                      }
                      StringBuilder discarded$5 = var6.append(var9);
                      continue L1;
                    }
                  }
                } else {
                  var4 = var4 / 37L;
                  var3++;
                  continue L0;
                }
              }
            } else {
              return null;
            }
          } else {
            return null;
          }
        } else {
          return null;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "Passwords must be between 5 and 20 characters long";
    }
}
