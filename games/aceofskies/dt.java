/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dt {
    static ap field_c;
    static String field_b;
    static int[] field_a;

    final static void a(int param0) {
        if (!(null == um.field_m)) {
            um.field_m.d();
        }
        if (param0 != 0) {
            field_b = (String) null;
        }
        if (!(null == da.field_a)) {
            da.field_a.d();
        }
    }

    final static al[][] a(gk param0, int param1, boolean[] param2, gk param3, String[][] param4) {
        al[][] var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        al[][] var9 = null;
        L0: {
          var8 = AceOfSkies.field_G ? 1 : 0;
          var9 = new al[param4.length][];
          var5 = var9;
          var6 = 0;
          if (param1 == 19501) {
            break L0;
          } else {
            field_c = (ap) null;
            break L0;
          }
        }
        L1: while (true) {
          if (var6 >= var9.length) {
            return var5;
          } else {
            var5[var6] = new al[param4[var6].length];
            var7 = 0;
            L2: while (true) {
              if (var9[var6].length <= var7) {
                var6++;
                continue L1;
              } else {
                L3: {
                  if (param2 == null) {
                    break L3;
                  } else {
                    if (param2[var6]) {
                      var9[var6][var7] = t.a(param0, "", param4[var6][var7]).a();
                      var7++;
                      continue L2;
                    } else {
                      break L3;
                    }
                  }
                }
                var9[var6][var7] = bj.a(param3, "", param4[var6][var7]).a();
                var7++;
                continue L2;
              }
            }
          }
        }
    }

    public static void c(int param0) {
        field_c = null;
        if (param0 != 13748) {
            return;
        }
        field_a = null;
        field_b = null;
    }

    final static void b(int param0) {
        int var4 = AceOfSkies.field_G ? 1 : 0;
        int[] var5 = hs.field_a;
        int[] var1 = var5;
        int var2 = 0;
        if (param0 != 8) {
            field_b = (String) null;
        }
        int var3 = var5.length;
        while (var3 > var2) {
            var2++;
            var5[var2] = 0;
            var2++;
            var5[var2] = 0;
            var2++;
            var5[var2] = 0;
            var2++;
            var5[var2] = 0;
            var2++;
            var5[var2] = 0;
            var2++;
            var5[var2] = 0;
            var2++;
            var5[var2] = 0;
            var2++;
            var5[var2] = 0;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = new int[8];
    }
}
