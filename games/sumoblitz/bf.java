/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bf {
    static java.awt.Color field_a;
    private int[] field_b;
    static String field_d;
    static String[] field_c;

    public static void b(int param0) {
        field_a = null;
        field_d = null;
        if (param0 != 18260) {
            field_d = null;
            field_c = null;
            return;
        }
        field_c = null;
    }

    final static void a(int param0) {
        if (!ms.field_a) {
            throw new IllegalStateException();
        }
        pu.field_m = true;
        jv.a(true, false);
        jv.field_a = param0;
    }

    bf(int[] param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        var2 = 1;
        L0: while (true) {
          if ((param0.length >> -875845535) + param0.length < var2) {
            ((bf) this).field_b = new int[var2 + var2];
            var3 = 0;
            L1: while (true) {
              if (var2 + var2 <= var3) {
                var3 = 0;
                L2: while (true) {
                  if (param0.length > var3) {
                    var4 = param0[var3] & var2 - 1;
                    L3: while (true) {
                      if (-1 == ((bf) this).field_b[1 + (var4 + var4)]) {
                        ((bf) this).field_b[var4 - -var4] = param0[var3];
                        ((bf) this).field_b[var4 + (var4 - -1)] = var3;
                        var3++;
                        continue L2;
                      } else {
                        var4 = -1 + var2 & var4 - -1;
                        continue L3;
                      }
                    }
                  } else {
                  }
                }
              } else {
                ((bf) this).field_b[var3] = -1;
                var3++;
                continue L1;
              }
            }
          } else {
            var2 = var2 << 1;
            continue L0;
          }
        }
    }

    final int a(int param0, byte param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        var4 = -116 % ((param1 - 32) / 48);
        var3 = -1 + (((bf) this).field_b.length >> -1234307775);
        var5 = var3 & param0;
        L0: while (true) {
          var6 = ((bf) this).field_b[var5 + (var5 - -1)];
          if (var6 == -1) {
            return -1;
          } else {
            if (param0 == ((bf) this).field_b[var5 + var5]) {
              return var6;
            } else {
              var5 = var3 & 1 + var5;
              continue L0;
            }
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = new java.awt.Color(10040319);
    }
}
