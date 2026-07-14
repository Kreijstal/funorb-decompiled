/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ao {
    static long field_b;
    static tl field_c;
    static int field_a;

    final static void a(fj param0, int param1) {
        int var2 = 0;
        fj var3 = null;
        int var4 = 0;
        var4 = TetraLink.field_J;
        if (null == param0.field_h) {
          return;
        } else {
          L0: {
            L1: {
              if (param0.field_g != 0) {
                break L1;
              } else {
                if (-1 == (param0.field_s ^ -1)) {
                  break L0;
                } else {
                  break L1;
                }
              }
            }
            var2 = 0;
            L2: while (true) {
              if (var2 >= pl.field_d) {
                break L0;
              } else {
                var3 = n.field_L[var2];
                if ((var3.field_i ^ -1) == -3) {
                  if (var3.field_g == param0.field_g) {
                    if (param0.field_s == var3.field_s) {
                      return;
                    } else {
                      var2++;
                      continue L2;
                    }
                  } else {
                    var2++;
                    continue L2;
                  }
                } else {
                  var2++;
                  continue L2;
                }
              }
            }
          }
          L3: {
            var2 = -43 % ((param1 - 48) / 38);
            if (null == param0.field_a) {
              break L3;
            } else {
              ml.field_jb = param0.field_r;
              vf.field_b = param0.field_i;
              ba.field_N = param0.field_a;
              vd.field_h = param0.field_n;
              break L3;
            }
          }
          ei.a(-2792, param0);
          return;
        }
    }

    public static void a(boolean param0) {
        field_c = null;
        if (!param0) {
            field_c = null;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = 0L;
    }
}
