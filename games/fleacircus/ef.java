/*
 * Decompiled by CFR-JS 0.4.0.
 */
class ef extends kc {
    private String field_k;
    static ed field_h;
    private long field_i;
    static String field_m;
    static int field_l;
    static String field_j;

    uj a(boolean param0) {
        if (!param0) {
            uj discarded$0 = ((ef) this).a(false);
        }
        return mk.field_i;
    }

    final static void a(int param0, int param1) {
        ih var2 = ud.field_b;
        var2.e(param0 + 8, param1);
        var2.a(-11, 1);
        var2.a(-11, param0);
    }

    public static void b(byte param0) {
        field_j = null;
        field_m = null;
        if (param0 >= -91) {
            field_j = null;
        }
        field_h = null;
    }

    final static int a(byte param0) {
        int var1 = -20 / ((-69 - param0) / 49);
        return bm.field_K - ei.field_M;
    }

    final static void a(sg param0, byte param1) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        var5 = fleas.field_A ? 1 : 0;
        var2 = 0;
        L0: while (true) {
          if (3 <= var2) {
            var2 = 0;
            L1: while (true) {
              if (var2 >= qb.field_a) {
                L2: {
                  bd.field_ob[param0.b(0)] = bd.field_ob[param0.b(0)] + 1;
                  if (param1 < -27) {
                    break L2;
                  } else {
                    field_h = null;
                    break L2;
                  }
                }
                var2 = 0;
                var3 = 0;
                L3: while (true) {
                  if (qb.field_a <= var3) {
                    qb.field_a = var2;
                    qb.field_a = qb.field_a + 1;
                    vg.field_H[qb.field_a] = param0;
                    return;
                  } else {
                    L4: {
                      if (param0.field_j == vg.field_H[var3].field_j) {
                        var4 = vg.field_H[var3].b(0);
                        if (bf.field_h >= bd.field_ob[var4]) {
                          break L4;
                        } else {
                          bd.field_ob[var4] = bd.field_ob[var4] - 1;
                          var3++;
                          continue L3;
                        }
                      } else {
                        break L4;
                      }
                    }
                    var2++;
                    vg.field_H[var2] = vg.field_H[var3];
                    var3++;
                    continue L3;
                  }
                }
              } else {
                if (param0.field_j == vg.field_H[var2].field_j) {
                  bd.field_ob[vg.field_H[var2].b(0)] = bd.field_ob[vg.field_H[var2].b(0)] + 1;
                  var2++;
                  continue L1;
                } else {
                  var2++;
                  continue L1;
                }
              }
            }
          } else {
            bd.field_ob[var2] = 0;
            var2++;
            continue L0;
          }
        }
    }

    final void a(ni param0, byte param1) {
        int var3 = -115 % ((-62 - param1) / 38);
        param0.a(-110, ((ef) this).field_i);
        param0.b(((ef) this).field_k, (byte) 94);
    }

    final static boolean a(byte param0, String param1) {
        if (param0 < 17) {
            return true;
        }
        return null != rg.b((byte) 59, param1) ? true : false;
    }

    ef(long param0, String param1) {
        ((ef) this).field_i = param0;
        ((ef) this).field_k = param1;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_m = "Password is valid";
        field_h = new ed();
    }
}
