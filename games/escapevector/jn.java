/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jn {
    static int field_c;
    private int[] field_f;
    static int field_e;
    static int field_a;
    static int field_d;
    static int field_b;

    final int a(int param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        var3 = (((jn) this).field_f.length >> 725054529) - param1;
        var4 = var3 & param0;
        L0: while (true) {
          var5 = ((jn) this).field_f[1 + (var4 + var4)];
          if (var5 == -1) {
            return -1;
          } else {
            if (((jn) this).field_f[var4 - -var4] != param0) {
              var4 = 1 + var4 & var3;
              continue L0;
            } else {
              return var5;
            }
          }
        }
    }

    final static byte[] a(int param0, String param1) {
        Object var3 = null;
        if (param0 < 13) {
          var3 = null;
          byte[] discarded$2 = jn.a(-106, (String) null);
          return fk.field_a.a(-4, param1, "");
        } else {
          return fk.field_a.a(-4, param1, "");
        }
    }

    jn(int[] param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        var2 = 1;
        L0: while (true) {
          if ((param0.length >> 295360545) + param0.length < var2) {
            ((jn) this).field_f = new int[var2 - -var2];
            var3 = 0;
            L1: while (true) {
              if (var2 + var2 <= var3) {
                var3 = 0;
                L2: while (true) {
                  if (param0.length > var3) {
                    var4 = param0[var3] & var2 - 1;
                    L3: while (true) {
                      if (((jn) this).field_f[var4 + (var4 - -1)] == -1) {
                        ((jn) this).field_f[var4 - -var4] = param0[var3];
                        ((jn) this).field_f[var4 - (-var4 + -1)] = var3;
                        var3++;
                        continue L2;
                      } else {
                        var4 = var2 + -1 & var4 + 1;
                        continue L3;
                      }
                    }
                  } else {
                  }
                }
              } else {
                ((jn) this).field_f[var3] = -1;
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

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        id.a(400, 50);
    }
}
