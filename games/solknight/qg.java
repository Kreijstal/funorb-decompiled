/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qg {
    static String field_b;
    static int[] field_c;
    private int[] field_d;
    static int field_a;

    public static void a(boolean param0) {
        if (param0) {
            field_c = null;
        }
        field_c = null;
        field_b = null;
    }

    final int a(int param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        var3 = -1 + (((qg) this).field_d.length >> -1402369503);
        var4 = var3 & param1;
        if (param0 == 0) {
          L0: while (true) {
            var5 = ((qg) this).field_d[var4 + var4 - -1];
            if ((var5 ^ -1) == 0) {
              return -1;
            } else {
              if (param1 != ((qg) this).field_d[var4 - -var4]) {
                var4 = 1 + var4 & var3;
                continue L0;
              } else {
                return var5;
              }
            }
          }
        } else {
          return -32;
        }
    }

    final static void a(hf param0, byte param1) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        var5 = SolKnight.field_L ? 1 : 0;
        var2 = 0;
        L0: while (true) {
          if (var2 >= 3) {
            var2 = 0;
            L1: while (true) {
              if (var2 >= al.field_p) {
                SolKnight.field_K[param0.a(1910696752)] = SolKnight.field_K[param0.a(1910696752)] + 1;
                var2 = 0;
                var3 = 0;
                L2: while (true) {
                  if (var3 >= al.field_p) {
                    var4 = -52 / ((param1 - -2) / 59);
                    al.field_p = var2;
                    al.field_p = al.field_p + 1;
                    kc.field_K[al.field_p] = param0;
                    return;
                  } else {
                    L3: {
                      if (kc.field_K[var3].field_i == param0.field_i) {
                        var4 = kc.field_K[var3].a(1910696752);
                        if (i.field_K >= SolKnight.field_K[var4]) {
                          break L3;
                        } else {
                          SolKnight.field_K[var4] = SolKnight.field_K[var4] - 1;
                          var3++;
                          continue L2;
                        }
                      } else {
                        break L3;
                      }
                    }
                    var2++;
                    kc.field_K[var2] = kc.field_K[var3];
                    var3++;
                    continue L2;
                  }
                }
              } else {
                if (kc.field_K[var2].field_i == param0.field_i) {
                  SolKnight.field_K[kc.field_K[var2].a(1910696752)] = SolKnight.field_K[kc.field_K[var2].a(1910696752)] + 1;
                  var2++;
                  continue L1;
                } else {
                  var2++;
                  continue L1;
                }
              }
            }
          } else {
            SolKnight.field_K[var2] = 0;
            var2++;
            continue L0;
          }
        }
    }

    qg(int[] param0) {
        int var3 = 0;
        int var4 = 0;
        int var2 = 1;
        while ((param0.length >> -996309951) + param0.length >= var2) {
            var2 = var2 << 1;
        }
        ((qg) this).field_d = new int[var2 + var2];
        for (var3 = 0; var2 + var2 > var3; var3++) {
            ((qg) this).field_d[var3] = -1;
        }
        for (var3 = 0; var3 < param0.length; var3++) {
            var4 = param0[var3] & var2 + -1;
            while (-1 != ((qg) this).field_d[var4 + var4 + 1]) {
                var4 = var2 - 1 & 1 + var4;
            }
            ((qg) this).field_d[var4 + var4] = param0[var3];
            ((qg) this).field_d[1 + var4 + var4] = var3;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "Create";
        field_a = -1;
    }
}
