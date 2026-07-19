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
        try {
            gj.a(param7, param1, 10);
            if (param6) {
                field_a = (String) null;
            }
            kj.field_P = gj.a(param0, param4, 0, param2);
            ql.field_r = gj.a(param0, param4, 1, param3);
            ti.field_f = new e();
            ak.field_a = 1000 * param3 / param7;
            ql.field_r.a(ti.field_f);
            ua.field_I = param5;
            ua.field_I.d(1349013231, la.field_k);
            kj.field_P.a(ua.field_I);
        } catch (RuntimeException runtimeException) {
            throw fc.a((Throwable) ((Object) runtimeException), "ub.A(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + (param5 != null ? "{...}" : "null") + ',' + param6 + ',' + param7 + ')');
        }
    }

    final static String a(int param0, long param1) {
        StringBuilder discarded$5 = null;
        StringBuilder discarded$6 = null;
        StringBuilder discarded$7 = null;
        StringBuilder discarded$8 = null;
        StringBuilder discarded$9 = null;
        int var3 = 0;
        long var4 = 0L;
        StringBuilder var6 = null;
        long var7 = 0L;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        mf var12 = null;
        int var13 = 0;
        int var14 = 0;
        var11 = SolKnight.field_L ? 1 : 0;
        if (0L < param1) {
          if (param1 < 6582952005840035281L) {
            if (0L != param1 % 37L) {
              var3 = 0;
              var4 = param1;
              L0: while (true) {
                L1: {
                  if (-1L == (var4 ^ -1L)) {
                    break L1;
                  } else {
                    var4 = var4 / 37L;
                    var3++;
                    if (var11 == 0) {
                      continue L0;
                    } else {
                      break L1;
                    }
                  }
                }
                var6 = new StringBuilder(var3);
                L2: while (true) {
                  L3: {
                    if (-1L == (param1 ^ -1L)) {
                      break L3;
                    } else {
                      var7 = param1;
                      param1 = param1 / 37L;
                      var9 = lf.field_f[(int)(-(param1 * 37L) + var7)];
                      var14 = -96;
                      var13 = var9 ^ -1;
                      if (var11 != 0) {
                        if (var13 >= var14) {
                          var12 = (mf) null;
                          ub.a((dl) null, true, 99, 116, (java.awt.Component) null, (mf) null, false, 43);
                          discarded$5 = var6.reverse();
                          var6.setCharAt(0, Character.toUpperCase(var6.charAt(0)));
                          return var6.toString();
                        } else {
                          discarded$6 = var6.reverse();
                          var6.setCharAt(0, Character.toUpperCase(var6.charAt(0)));
                          return var6.toString();
                        }
                      } else {
                        L4: {
                          if (var13 != var14) {
                            break L4;
                          } else {
                            var10 = var6.length() + -1;
                            var9 = 160;
                            var6.setCharAt(var10, Character.toUpperCase(var6.charAt(var10)));
                            break L4;
                          }
                        }
                        discarded$7 = var6.append((char) var9);
                        if (var11 == 0) {
                          continue L2;
                        } else {
                          break L3;
                        }
                      }
                    }
                  }
                  if (param0 >= -35) {
                    var12 = (mf) null;
                    ub.a((dl) null, true, 99, 116, (java.awt.Component) null, (mf) null, false, 43);
                    discarded$8 = var6.reverse();
                    var6.setCharAt(0, Character.toUpperCase(var6.charAt(0)));
                    return var6.toString();
                  } else {
                    discarded$9 = var6.reverse();
                    var6.setCharAt(0, Character.toUpperCase(var6.charAt(0)));
                    return var6.toString();
                  }
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
        field_a = "Passwords must be between 5 and 20 characters long";
    }
}
