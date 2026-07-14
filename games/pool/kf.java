/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kf extends ma {
    nb field_o;
    static String field_l;
    int field_n;
    ma field_m;

    public static void a(int param0) {
        if (param0 != -1) {
            field_l = null;
            field_l = null;
            return;
        }
        field_l = null;
    }

    final void a(int param0, int param1, int param2) {
        ((kf) this).field_n = param0;
        ((kf) this).field_o.c(param1, param2 + ec.field_b * param0 >> -1568572856);
    }

    final static void a(int param0, byte param1, int[] param2, int[] param3, int param4) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        var8 = Pool.field_O;
        if (param1 == -104) {
          param4++;
          L0: while (true) {
            param0--;
            var7 = 1;
            var5 = param4;
            L1: while (true) {
              if (param0 < var5) {
                if (var7 == 0) {
                  L2: {
                    var5 = param0;
                    if (param4 > var5) {
                      break L2;
                    } else {
                      L3: {
                        if (param2[var5 - 1] > param2[var5]) {
                          var6 = param2[var5 + -1];
                          param2[var5 - 1] = param2[var5];
                          param2[var5] = var6;
                          var6 = param3[-1 + var5];
                          param3[var5 + -1] = param3[var5];
                          param3[var5] = var6;
                          var7 = 0;
                          break L3;
                        } else {
                          var5--;
                          break L3;
                        }
                      }
                      var5--;
                      var5--;
                      break L2;
                    }
                  }
                  if (var7 == 0) {
                    param4++;
                    continue L0;
                  } else {
                    return;
                  }
                } else {
                  return;
                }
              } else {
                if (param2[var5 - 1] > param2[var5]) {
                  var6 = param2[-1 + var5];
                  param2[var5 + -1] = param2[var5];
                  param2[var5] = var6;
                  var6 = param3[-1 + var5];
                  param3[var5 + -1] = param3[var5];
                  var7 = 0;
                  param3[var5] = var6;
                  var5++;
                  var5++;
                  continue L1;
                } else {
                  var5++;
                  var5++;
                  continue L1;
                }
              }
            }
          }
        } else {
          return;
        }
    }

    kf(nb param0, ma param1) {
        ((kf) this).field_o = param0;
        ((kf) this).field_n = param0.j();
        ((kf) this).field_m = param1;
        ((kf) this).field_o.d(ec.field_b * ((kf) this).field_n + 128 >> 308605768);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_l = "Exploiting a bug";
    }
}
